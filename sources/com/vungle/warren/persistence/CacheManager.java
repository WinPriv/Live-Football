package com.vungle.warren.persistence;

import android.content.Context;
import android.os.Environment;
import android.os.FileObserver;
import android.os.StatFs;
import android.util.Log;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.utility.CollectionsConcurrencyUtil;
import com.vungle.warren.utility.FileUtility;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class CacheManager {
    private static final String PATH_ID = "cache_path";
    private static final String PATH_IDS = "cache_paths";
    private static final String TAG = "CacheManager";
    static final long UNKNOWN_SIZE = -1;
    private static final String VUNGLE_DIR = "vungle_cache";
    private boolean changed;
    private final Context context;
    private File current;
    private final FilePreferences prefs;
    private final Set<Listener> listeners = new HashSet();
    private final List<File> old = new ArrayList();
    private final List<FileObserver> observers = new ArrayList();

    /* loaded from: classes2.dex */
    public interface Listener {
        void onCacheChanged();
    }

    public CacheManager(Context context, FilePreferences filePreferences) {
        this.context = context;
        this.prefs = filePreferences;
        filePreferences.addSharedPrefsKey(PATH_ID, PATH_IDS).apply();
    }

    private void check() {
        File file = this.current;
        if (file == null || !file.exists() || !this.current.isDirectory() || !this.current.canWrite()) {
            selectFileDest();
        }
    }

    private static void deleteIfFile(File file) {
        if (file.exists() && file.isFile()) {
            FileUtility.deleteAndLogIfFailed(file);
        }
    }

    private synchronized void observeDirectory(File file) {
        if (file == null) {
            return;
        }
        this.observers.clear();
        this.observers.add(new FileObserver(file.getPath(), 1024) { // from class: com.vungle.warren.persistence.CacheManager.1
            @Override // android.os.FileObserver
            public void onEvent(int i10, String str) {
                stopWatching();
                CacheManager.this.selectFileDest();
            }
        });
        while (file.getParent() != null) {
            final String name = file.getName();
            this.observers.add(new FileObserver(file.getParent(), 256) { // from class: com.vungle.warren.persistence.CacheManager.2
                @Override // android.os.FileObserver
                public void onEvent(int i10, String str) {
                    stopWatching();
                    if (name.equals(str)) {
                        CacheManager.this.selectFileDest();
                    }
                }
            });
            file = file.getParentFile();
        }
        Iterator<FileObserver> it = this.observers.iterator();
        while (it.hasNext()) {
            try {
                it.next().startWatching();
            } catch (Exception e10) {
                VungleLogger.warn(true, TAG, "ExceptionContext", Log.getStackTraceString(e10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void selectFileDest() {
        boolean z10;
        File file;
        boolean z11;
        File parentFile;
        File file2;
        File file3 = null;
        if (this.current == null) {
            String string = this.prefs.getString(PATH_ID, null);
            if (string != null) {
                file2 = new File(string);
            } else {
                file2 = null;
            }
            this.current = file2;
        }
        File externalFilesDir = this.context.getExternalFilesDir(null);
        File filesDir = this.context.getFilesDir();
        if (Environment.getExternalStorageState().equals("mounted") && externalFilesDir != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = new ArrayList();
        if (z10 && (parentFile = externalFilesDir.getParentFile()) != null) {
            arrayList.add(new File(parentFile, "no_backup"));
        }
        arrayList.add(this.context.getNoBackupFilesDir());
        if (z10) {
            arrayList.add(externalFilesDir);
        }
        arrayList.add(filesDir);
        Iterator it = arrayList.iterator();
        boolean z12 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            File file4 = new File((File) it.next(), VUNGLE_DIR);
            deleteIfFile(file4);
            if (file4.exists()) {
                if (file4.isDirectory() && file4.canWrite()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z12 = file4.mkdirs();
                z11 = z12;
            }
            if (z11) {
                file3 = file4;
                break;
            }
        }
        File cacheDir = this.context.getCacheDir();
        HashSet<String> stringSet = this.prefs.getStringSet(PATH_IDS, new HashSet<>());
        if (file3 != null) {
            CollectionsConcurrencyUtil.addToSet(stringSet, file3.getPath());
        }
        CollectionsConcurrencyUtil.addToSet(stringSet, cacheDir.getPath());
        this.prefs.put(PATH_IDS, stringSet).apply();
        this.old.clear();
        Iterator<String> it2 = stringSet.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (file3 == null || !file3.getPath().equals(next)) {
                this.old.add(new File(next));
            }
        }
        if (z12 || ((file3 != null && !file3.equals(this.current)) || ((file = this.current) != null && !file.equals(file3)))) {
            this.current = file3;
            if (file3 != null) {
                this.prefs.put(PATH_ID, file3.getPath()).apply();
            }
            Iterator<Listener> it3 = this.listeners.iterator();
            while (it3.hasNext()) {
                it3.next().onCacheChanged();
            }
            this.changed = true;
            for (File file5 : this.old) {
                if (!file5.equals(cacheDir)) {
                    try {
                        FileUtility.delete(file5);
                    } catch (IOException unused) {
                        VungleLogger.error(true, TAG, TAG, "Can't remove old cache:" + file5.getPath());
                    }
                }
            }
        }
        observeDirectory(externalFilesDir);
    }

    public synchronized void addListener(Listener listener) {
        check();
        this.listeners.add(listener);
        if (this.changed) {
            listener.onCacheChanged();
        }
    }

    public long getBytesAvailable() {
        return getBytesAvailable(1);
    }

    public synchronized File getCache() {
        check();
        return this.current;
    }

    public synchronized List<File> getOldCaches() {
        check();
        return this.old;
    }

    public synchronized void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    private long getBytesAvailable(int i10) {
        StatFs statFs;
        File cache = getCache();
        if (cache == null) {
            return -1L;
        }
        try {
            statFs = new StatFs(cache.getPath());
        } catch (IllegalArgumentException e10) {
            Log.w(TAG, "Failed to get available bytes", e10);
            if (i10 > 0) {
                return getBytesAvailable(i10 - 1);
            }
            statFs = null;
        }
        if (statFs != null) {
            return statFs.getAvailableBytes();
        }
        return -1L;
    }
}
