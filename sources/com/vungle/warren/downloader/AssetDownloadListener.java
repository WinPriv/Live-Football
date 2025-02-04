package com.vungle.warren.downloader;

import java.io.File;

/* loaded from: classes2.dex */
public interface AssetDownloadListener {

    /* loaded from: classes2.dex */
    public static class DownloadError {
        public final Throwable cause;

        @ErrorReason
        public final int reason;
        public final int serverCode;

        /* loaded from: classes2.dex */
        public @interface ErrorReason {
            public static final int CONNECTION_ERROR = 0;
            public static final int DISK_ERROR = 2;
            public static final int FILE_NOT_FOUND_ERROR = 3;
            public static final int INTERNAL_ERROR = 4;
            public static final int REQUEST_ERROR = 1;
        }

        public DownloadError(int i10, Throwable th, int i11) {
            this.serverCode = i10;
            this.cause = th;
            this.reason = i11;
        }
    }

    /* loaded from: classes2.dex */
    public static class Progress {
        public int progressPercent;
        public long sizeBytes;
        public long startBytes;

        @ProgressStatus
        public int status;
        public long timestampDownloadStart;

        /* loaded from: classes2.dex */
        public @interface ProgressStatus {
            public static final int CANCELLED = 3;
            public static final int DONE = 4;
            public static final int IN_PROGRESS = 1;
            public static final int LOST_CONNECTION = 5;
            public static final int PAUSED = 2;
            public static final int STARTED = 0;
            public static final int STATE_CHANGED = 6;
        }

        public static Progress copy(Progress progress) {
            Progress progress2 = new Progress();
            progress2.status = progress.status;
            progress2.progressPercent = progress.progressPercent;
            progress2.timestampDownloadStart = progress.timestampDownloadStart;
            progress2.sizeBytes = progress.sizeBytes;
            progress2.startBytes = progress.startBytes;
            return progress2;
        }
    }

    void onError(DownloadError downloadError, DownloadRequest downloadRequest);

    void onProgress(Progress progress, DownloadRequest downloadRequest);

    void onSuccess(File file, DownloadRequest downloadRequest);
}
