package com.vungle.warren.downloader;

import java.util.List;

/* loaded from: classes2.dex */
public interface Downloader {

    /* loaded from: classes2.dex */
    public @interface NetworkType {
        public static final int ANY = 3;
        public static final int CELLULAR = 1;
        public static final int WIFI = 2;
    }

    /* loaded from: classes2.dex */
    public static class RequestException extends Exception {
        public RequestException(String str) {
            super(str);
        }
    }

    void cancel(DownloadRequest downloadRequest);

    void cancelAll();

    boolean cancelAndAwait(DownloadRequest downloadRequest, long j10);

    void clearCache();

    void download(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener);

    boolean dropCache(String str);

    List<DownloadRequest> getAllRequests();

    void init();

    boolean isCacheEnabled();

    void setCacheEnabled(boolean z10);

    void setProgressStep(int i10);

    void updatePriority(DownloadRequest downloadRequest);
}
