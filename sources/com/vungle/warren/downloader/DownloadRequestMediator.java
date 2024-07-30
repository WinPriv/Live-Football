package com.vungle.warren.downloader;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import m0.c;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: classes2.dex */
public class DownloadRequestMediator {
    public final String filePath;
    public final boolean isCacheable;
    public final String key;
    public final String metaPath;
    public final AssetPriority priority;
    public final String url;
    private AtomicInteger statusAtomic = new AtomicInteger(0);
    private Map<String, c<DownloadRequest, AssetDownloadListener>> children = new ConcurrentHashMap(1);
    private final ReentrantLock lock = new ReentrantLock();
    private AtomicBoolean connectedAtomic = new AtomicBoolean(true);
    private AtomicReference<Runnable> runnable = new AtomicReference<>();

    public DownloadRequestMediator(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener, String str, String str2, boolean z10, String str3) {
        this.url = downloadRequest.url;
        this.filePath = str;
        this.metaPath = str2;
        this.isCacheable = z10;
        this.key = str3;
        this.priority = downloadRequest.getPriority();
        this.children.put(downloadRequest.f27242id, new c<>(downloadRequest, assetDownloadListener));
    }

    public synchronized void add(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        this.children.put(downloadRequest.f27242id, new c<>(downloadRequest, assetDownloadListener));
    }

    public AssetPriority getPriority() {
        AssetPriority priority;
        AssetPriority assetPriority = new AssetPriority(Integer.MAX_VALUE, Integer.MAX_VALUE);
        Iterator<c<DownloadRequest, AssetDownloadListener>> it = values().iterator();
        while (it.hasNext()) {
            DownloadRequest downloadRequest = it.next().f32635a;
            if (downloadRequest != null && (priority = downloadRequest.getPriority()) != null && assetPriority.compareTo(priority) >= 0) {
                assetPriority = priority;
            }
        }
        return assetPriority;
    }

    public Runnable getRunnable() {
        return this.runnable.get();
    }

    @Status
    public int getStatus() {
        return this.statusAtomic.get();
    }

    public boolean is(@Status int i10) {
        if (this.statusAtomic.get() == i10) {
            return true;
        }
        return false;
    }

    public boolean isConnected() {
        return this.connectedAtomic.get();
    }

    public boolean isPausable() {
        Iterator<c<DownloadRequest, AssetDownloadListener>> it = values().iterator();
        while (it.hasNext()) {
            DownloadRequest downloadRequest = it.next().f32635a;
            if (downloadRequest != null && downloadRequest.pauseOnConnectionLost) {
                return true;
            }
        }
        return false;
    }

    public void lock() {
        this.lock.lock();
    }

    public synchronized c<DownloadRequest, AssetDownloadListener> remove(DownloadRequest downloadRequest) {
        return this.children.remove(downloadRequest.f27242id);
    }

    public synchronized List<DownloadRequest> requests() {
        ArrayList arrayList;
        List<c<DownloadRequest, AssetDownloadListener>> values = values();
        arrayList = new ArrayList();
        Iterator<c<DownloadRequest, AssetDownloadListener>> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f32635a);
        }
        return arrayList;
    }

    public void set(@Status int i10) {
        if (this.statusAtomic.get() == 3) {
            return;
        }
        this.statusAtomic.set(i10);
    }

    public void setConnected(boolean z10) {
        this.connectedAtomic.set(z10);
    }

    public void setRunnable(Runnable runnable) {
        this.runnable.set(runnable);
    }

    public void unlock() {
        this.lock.unlock();
    }

    public synchronized List<c<DownloadRequest, AssetDownloadListener>> values() {
        return new ArrayList(this.children.values());
    }
}
