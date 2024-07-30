package com.huawei.openalliance.ad.download;

import android.text.TextUtils;
import com.huawei.openalliance.ad.annotations.DataKeep;
import y9.b;

@DataKeep
/* loaded from: classes2.dex */
public class DownloadTask {
    private boolean allowedMobileNetowrk;
    private long downloadedSize;
    private long fileTotalSize;
    private int pauseReason;
    private int priority;
    private int progress;
    private String sha256;
    private String url;

    @b
    private final byte[] lock = new byte[0];

    @b
    private int status = 0;

    public final int a() {
        int i10;
        synchronized (this.lock) {
            i10 = this.status;
        }
        return i10;
    }

    public final int b() {
        return this.priority;
    }

    public final void c(int i10) {
        synchronized (this.lock) {
            this.status = i10;
        }
    }

    public final void d(long j10) {
        this.fileTotalSize = j10;
    }

    public final void e(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof DownloadTask) && TextUtils.equals(h(), ((DownloadTask) obj).h())) {
                return true;
            }
        }
        return false;
    }

    public final void f(boolean z10) {
        this.allowedMobileNetowrk = z10;
    }

    public final int g() {
        return this.pauseReason;
    }

    public String h() {
        return this.url;
    }

    public int hashCode() {
        if (h() != null) {
            return h().hashCode();
        }
        return super.hashCode();
    }

    public final long i() {
        return this.fileTotalSize;
    }

    public final void j(int i10) {
        this.progress = i10;
    }

    public final int k() {
        return this.progress;
    }

    public final void l() {
        this.priority = 0;
    }

    public final void m(long j10) {
        this.downloadedSize = j10;
    }

    public final void n(String str) {
        this.sha256 = str;
    }

    public final long o() {
        return this.downloadedSize;
    }

    public final void p(int i10) {
        this.pauseReason = i10;
    }
}
