package com.huawei.openalliance.ad.ppskit.beans.inner;

/* loaded from: classes2.dex */
public class DownloadBlockInfo {
    private volatile long endTime;
    private volatile boolean fullFile;
    private volatile long indexDownloadSize;
    private volatile long size;
    private long startTime;

    public final void a(long j10) {
        this.startTime = j10;
    }

    public final void b(boolean z10) {
        this.fullFile = z10;
    }

    public final void c(long j10) {
        this.endTime = j10;
    }

    public final long d() {
        return this.size;
    }

    public final void e(long j10) {
        this.size = j10;
    }

    public final long f() {
        return this.endTime - this.startTime;
    }

    public final boolean g() {
        return this.fullFile;
    }

    public final String toString() {
        return "DownloadBlockInfo{size=" + this.size + ", fullFile=" + this.fullFile + ", duration=" + (this.endTime - this.startTime) + '}';
    }
}
