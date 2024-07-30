package com.vungle.warren.downloader;

import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.utility.FileUtility;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class LRUCachePolicy implements CachePolicy<File> {
    static final String CACHE_POLICY_JOURNAL = "cache_policy_journal";
    private final CacheManager cacheManager;
    private final String dirName;
    private LinkedHashSet<File> files = new LinkedHashSet<>();

    public LRUCachePolicy(CacheManager cacheManager, String str) {
        this.cacheManager = cacheManager;
        this.dirName = str;
    }

    private File getPolicyFile() {
        File file = new File(this.cacheManager.getCache(), this.dirName);
        if (file.exists() && !file.isDirectory()) {
            FileUtility.deleteAndLogIfFailed(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, CACHE_POLICY_JOURNAL);
    }

    @Override // com.vungle.warren.downloader.CachePolicy
    public void clean() {
        this.files.clear();
    }

    @Override // com.vungle.warren.downloader.CachePolicy
    public List<File> getOrderedCacheItems() {
        return new ArrayList(this.files);
    }

    @Override // com.vungle.warren.downloader.CachePolicy
    public void load() {
        File policyFile = getPolicyFile();
        Serializable serializable = (Serializable) FileUtility.readSerializable(policyFile);
        if (serializable == null) {
            return;
        }
        if (serializable instanceof Collection) {
            this.files.addAll((Collection) serializable);
        } else {
            FileUtility.deleteAndLogIfFailed(policyFile);
        }
    }

    @Override // com.vungle.warren.downloader.CachePolicy
    public void save() {
        FileUtility.writeSerializable(getPolicyFile(), this.files);
    }

    @Override // com.vungle.warren.downloader.CachePolicy
    public void put(File file, long j10) {
        if (j10 > 0) {
            this.files.remove(file);
        }
        this.files.add(file);
    }

    @Override // com.vungle.warren.downloader.CachePolicy
    public void remove(File file) {
        this.files.remove(file);
    }
}
