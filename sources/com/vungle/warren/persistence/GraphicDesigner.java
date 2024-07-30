package com.vungle.warren.persistence;

import a3.l;
import android.util.Log;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.utility.FileUtility;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class GraphicDesigner implements Designer, CacheManager.Listener {
    private static final String FOLDER_NAME = "vungle";
    private static final String TAG = "GraphicDesigner";
    private CacheManager cacheManager;

    public GraphicDesigner(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
        cacheManager.addListener(this);
        FileUtility.printDirectoryTree(getCacheDirectory());
    }

    @Override // com.vungle.warren.persistence.Designer
    public void clearCache() {
        CacheManager cacheManager = this.cacheManager;
        if (cacheManager != null && cacheManager.getCache() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.cacheManager.getCache().getPath());
            File file = new File(l.p(sb2, File.separator, FOLDER_NAME));
            if (file.exists()) {
                try {
                    FileUtility.delete(file);
                } catch (IOException e10) {
                    Log.e(TAG, "Failed to delete cached files. Reason: " + e10.getLocalizedMessage());
                }
            }
            if (!file.exists()) {
                file.mkdir();
            }
        }
    }

    @Override // com.vungle.warren.persistence.Designer
    public void deleteAssets(String str) throws IOException, IllegalStateException {
        File[] listFiles = getCacheDirectory().listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (file.isDirectory() && file.getName().equals(str)) {
                FileUtility.delete(file);
            }
        }
    }

    @Override // com.vungle.warren.persistence.Designer
    public File getAssetDirectory(String str) throws IllegalStateException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getCacheDirectory().getPath());
        File file = new File(l.p(sb2, File.separator, str));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    @Override // com.vungle.warren.persistence.Designer
    public File getCacheDirectory() throws IllegalStateException {
        if (this.cacheManager != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.cacheManager.getCache());
            File file = new File(l.p(sb2, File.separator, FOLDER_NAME));
            if (!file.exists()) {
                file.mkdir();
            }
            return file;
        }
        throw new IllegalStateException("Context has expired, cannot continue.");
    }

    @Override // com.vungle.warren.persistence.CacheManager.Listener
    public void onCacheChanged() {
        CacheManager cacheManager = this.cacheManager;
        if (cacheManager == null) {
            return;
        }
        Iterator<File> it = cacheManager.getOldCaches().iterator();
        while (it.hasNext()) {
            try {
                FileUtility.delete(new File(it.next().getPath() + File.separator + FOLDER_NAME));
            } catch (IOException e10) {
                Log.e(TAG, "Failed to delete cached files. Reason: " + e10.getLocalizedMessage());
            }
        }
    }
}
