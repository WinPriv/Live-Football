package com.vungle.warren.downloader;

import android.util.Base64;
import android.util.Log;
import com.vungle.warren.SizeProvider;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.utility.FileUtility;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class CleverCache implements DownloaderCache {
    static final String ASSETS_DIR = "assets";
    static final String CACHE_META = "meta";
    public static final String CACHE_TOUCH_JOURNAL = "cache_touch_timestamp";
    public static final String CC_DIR = "clever_cache";
    public static final String FAILED_TO_DELETE = "cache_failed_to_delete";
    private static final String META_POSTFIX_EXT = ".vng_meta";
    private static final String TAG = "CleverCache";
    private final CacheManager cacheManager;
    private final long expirationAge;
    private final CachePolicy<File> policy;
    private final SizeProvider sizeProvider;
    private final HashMap<File, Long> cacheTouchTime = new HashMap<>();
    private final Map<File, Integer> trackedFiles = new ConcurrentHashMap();
    private final HashSet<File> failedToDelete = new HashSet<>();

    public CleverCache(CacheManager cacheManager, CachePolicy<File> cachePolicy, SizeProvider sizeProvider, long j10) {
        this.cacheManager = cacheManager;
        this.policy = cachePolicy;
        this.sizeProvider = sizeProvider;
        this.expirationAge = Math.max(0L, j10);
    }

    private synchronized void expirationCleanup() {
        long currentTimeMillis = System.currentTimeMillis() - this.expirationAge;
        File[] listFiles = getAssetsDir().listFiles();
        HashSet hashSet = new HashSet(this.cacheTouchTime.keySet());
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                long cacheUpdateTimestamp = getCacheUpdateTimestamp(file);
                hashSet.remove(file);
                if (!isProtected(file) && (cacheUpdateTimestamp == 0 || cacheUpdateTimestamp <= currentTimeMillis)) {
                    if (deleteContents(file)) {
                        this.cacheTouchTime.remove(file);
                        this.policy.remove(file);
                    }
                    Log.d(TAG, "Deleted expired file " + file);
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.cacheTouchTime.remove((File) it.next());
            }
            this.policy.save();
            saveTouchTimestamps();
        }
    }

    private void failedToDeleteCleanUp() {
        Iterator it = new HashSet(this.failedToDelete).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!isProtected(file)) {
                deleteAndRemove(file);
            }
        }
    }

    private File getCacheDir() {
        File file = new File(this.cacheManager.getCache(), CC_DIR);
        if (!file.isDirectory()) {
            FileUtility.deleteAndLogIfFailed(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private File getFailedToDeleteFile() {
        return new File(getCacheDir(), FAILED_TO_DELETE);
    }

    private File getTouchTimestampsFile() {
        return new File(getCacheDir(), CACHE_TOUCH_JOURNAL);
    }

    private void integrityCleanup(List<File> list) {
        File metaDir = getMetaDir();
        File[] listFiles = getAssetsDir().listFiles();
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(listFiles));
            arrayList.removeAll(list);
            arrayList.remove(metaDir);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                deleteContents(file);
                Log.d(TAG, "Deleted non tracked file " + file);
            }
        }
    }

    private boolean isProtected(File file) {
        Integer num = this.trackedFiles.get(file);
        if (num != null && num.intValue() > 0) {
            Log.d(TAG, "File is tracked and protected : " + file);
            return true;
        }
        return false;
    }

    private void loadFailedToDelete() {
        Serializable serializable = (Serializable) FileUtility.readSerializable(getFailedToDeleteFile());
        if (!(serializable instanceof HashSet)) {
            return;
        }
        try {
            this.failedToDelete.addAll((HashSet) serializable);
        } catch (ClassCastException e10) {
            VungleLogger.error("CleverCache#loadFailedToDelete;", String.format("Error %1$s occurred; old set is not set of File", e10));
            FileUtility.deleteAndLogIfFailed(getFailedToDeleteFile());
        }
    }

    private void loadTouchTimestamps() {
        Serializable serializable = (Serializable) FileUtility.readSerializable(getTouchTimestampsFile());
        if (!(serializable instanceof HashMap)) {
            return;
        }
        try {
            this.cacheTouchTime.putAll((HashMap) serializable);
        } catch (ClassCastException e10) {
            VungleLogger.error("CleverCache#loadTouchTimestamps; loadAd sequence", String.format("Error %1$s occurred; old map is not File -> Long", e10));
            FileUtility.deleteAndLogIfFailed(getTouchTimestampsFile());
        }
    }

    private void saveFailedToDelete() {
        File failedToDeleteFile = getFailedToDeleteFile();
        if (!this.failedToDelete.isEmpty()) {
            FileUtility.writeSerializable(failedToDeleteFile, new HashSet(this.failedToDelete));
        } else if (failedToDeleteFile.exists()) {
            FileUtility.deleteAndLogIfFailed(failedToDeleteFile);
        }
    }

    private void saveTouchTimestamps() {
        FileUtility.writeSerializable(getTouchTimestampsFile(), new HashMap(this.cacheTouchTime));
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void clear() {
        List<File> orderedCacheItems = this.policy.getOrderedCacheItems();
        integrityCleanup(orderedCacheItems);
        int i10 = 0;
        for (File file : orderedCacheItems) {
            if (file != null && !isProtected(file) && deleteContents(file)) {
                i10++;
                this.policy.remove(file);
                this.cacheTouchTime.remove(file);
            }
        }
        if (i10 > 0) {
            this.policy.save();
            saveTouchTimestamps();
        }
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized boolean deleteAndRemove(File file) {
        if (deleteContents(file)) {
            this.cacheTouchTime.remove(file);
            this.policy.remove(file);
            this.policy.save();
            saveTouchTimestamps();
            this.failedToDelete.remove(file);
            saveFailedToDelete();
            return true;
        }
        this.failedToDelete.add(file);
        saveFailedToDelete();
        return false;
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized boolean deleteContents(File file) {
        boolean z10;
        String str;
        try {
            FileUtility.delete(file);
        } catch (IOException e10) {
            e = e10;
            z10 = false;
        }
        try {
            FileUtility.delete(getMetaFile(file));
            return true;
        } catch (IOException e11) {
            e = e11;
            z10 = true;
            Object[] objArr = new Object[3];
            if (z10) {
                str = CACHE_META;
            } else {
                str = "file";
            }
            objArr[0] = str;
            objArr[1] = file.getPath();
            objArr[2] = e;
            VungleLogger.error("CleverCache#deleteContents; loadAd sequence", String.format("Cannot delete %1$s for file %2$s; Error %3$s occured", objArr));
            return false;
        }
    }

    public synchronized File getAssetsDir() {
        File file;
        file = new File(getCacheDir(), "assets");
        if (!file.isDirectory() && file.exists()) {
            FileUtility.deleteAndLogIfFailed(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized long getCacheUpdateTimestamp(File file) {
        long longValue;
        Long l10 = this.cacheTouchTime.get(file);
        if (l10 == null) {
            longValue = file.lastModified();
        } else {
            longValue = l10.longValue();
        }
        return longValue;
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized File getFile(String str) throws IOException {
        File file;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str.getBytes("UTF-8"));
                file = new File(getAssetsDir(), Base64.encodeToString(messageDigest.digest(), 10));
                this.policy.put(file, 0L);
            } catch (UnsupportedEncodingException e10) {
                VungleLogger.error("CleverCache#getFile; loadAd sequence", "cannot encode url with charset = UTF-8");
                throw new IOException(e10);
            }
        } catch (NoSuchAlgorithmException e11) {
            VungleLogger.error("CleverCache#getFile; loadAd sequence", "cannot get instance of MessageDigest with algorithm SHA-256");
            throw new IOException(e11);
        }
        return file;
    }

    public synchronized File getMetaDir() {
        File file;
        file = new File(getAssetsDir(), CACHE_META);
        if (!file.isDirectory()) {
            FileUtility.deleteAndLogIfFailed(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized File getMetaFile(File file) {
        return new File(getMetaDir(), file.getName() + META_POSTFIX_EXT);
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void init() {
        this.policy.load();
        loadTouchTimestamps();
        expirationCleanup();
        loadFailedToDelete();
        failedToDeleteCleanUp();
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void onCacheHit(File file, long j10) {
        this.policy.put(file, j10);
        this.policy.save();
        Log.d(TAG, "Cache hit " + file + " cache touch updated");
        purge();
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized List<File> purge() {
        failedToDeleteCleanUp();
        long targetSize = this.sizeProvider.getTargetSize();
        long size = FileUtility.size(getAssetsDir());
        String str = TAG;
        Log.d(str, "Purge check current cache total: " + size + " target: " + targetSize);
        if (size < targetSize) {
            return Collections.emptyList();
        }
        Log.d(str, "Purge start");
        ArrayList arrayList = new ArrayList();
        List<File> orderedCacheItems = this.policy.getOrderedCacheItems();
        integrityCleanup(orderedCacheItems);
        long size2 = FileUtility.size(getAssetsDir());
        if (size2 < targetSize) {
            Log.d(str, "Cleaned up not tracked files, size is ok");
            return Collections.emptyList();
        }
        Iterator<File> it = orderedCacheItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            File next = it.next();
            if (next != null && !isProtected(next)) {
                long length = next.length();
                if (deleteContents(next)) {
                    size2 -= length;
                    arrayList.add(next);
                    String str2 = TAG;
                    Log.d(str2, "Deleted file: " + next.getName() + " size: " + length + " total: " + size2 + " target: " + targetSize);
                    this.policy.remove(next);
                    this.cacheTouchTime.remove(next);
                    if (size2 < targetSize) {
                        targetSize = this.sizeProvider.getTargetSize();
                        if (size2 < targetSize) {
                            Log.d(str2, "Cleaned enough total: " + size2 + " target: " + targetSize);
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList.size() > 0) {
            this.policy.save();
            saveTouchTimestamps();
        }
        Log.d(TAG, "Purge complete");
        return arrayList;
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void setCacheLastUpdateTimestamp(File file, long j10) {
        this.cacheTouchTime.put(file, Long.valueOf(j10));
        saveTouchTimestamps();
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void startTracking(File file) {
        int i10;
        Integer num = this.trackedFiles.get(file);
        this.policy.put(file, 0L);
        this.policy.save();
        if (num != null && num.intValue() > 0) {
            i10 = Integer.valueOf(num.intValue() + 1);
            this.trackedFiles.put(file, i10);
            Log.d(TAG, "Start tracking file: " + file + " ref count " + i10);
        }
        i10 = 1;
        this.trackedFiles.put(file, i10);
        Log.d(TAG, "Start tracking file: " + file + " ref count " + i10);
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void stopTracking(File file) {
        if (this.trackedFiles.get(file) == null) {
            this.trackedFiles.remove(file);
            return;
        }
        Integer valueOf = Integer.valueOf(r1.intValue() - 1);
        if (valueOf.intValue() <= 0) {
            this.trackedFiles.remove(file);
        }
        Log.d(TAG, "Stop tracking file: " + file + " ref count " + valueOf);
    }
}
