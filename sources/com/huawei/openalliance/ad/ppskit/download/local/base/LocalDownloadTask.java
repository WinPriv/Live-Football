package com.huawei.openalliance.ad.ppskit.download.local.base;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import ma.f;

@DataKeep
/* loaded from: classes2.dex */
public class LocalDownloadTask {
    private boolean allowedMobileNetowrk;
    private long downloadedSize;
    private long fileTotalSize;
    private int pauseReason;
    private int priority;
    private int progress;
    private String sha256;
    private String url;

    @f
    private final byte[] lock = new byte[0];

    @f
    private int status = 0;

    public final void a(long j10) {
        this.fileTotalSize = j10;
    }

    public final void b(long j10) {
        this.downloadedSize = j10;
    }

    public final void c(int i10) {
        synchronized (this.lock) {
            this.status = i10;
        }
    }

    public final void d() {
        this.priority = 0;
    }

    public final void e(int i10) {
        this.progress = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof LocalDownloadTask) && TextUtils.equals(g(), ((LocalDownloadTask) obj).g())) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i10) {
        this.pauseReason = i10;
    }

    public String g() {
        return this.url;
    }

    @OuterVisible
    public long getDownloadedSize() {
        return this.downloadedSize;
    }

    @OuterVisible
    public int getProgress() {
        return this.progress;
    }

    @OuterVisible
    public int getStatus() {
        int i10;
        synchronized (this.lock) {
            i10 = this.status;
        }
        return i10;
    }

    public final void h(String str) {
        this.url = str;
    }

    public final int hashCode() {
        if (g() != null) {
            return g().hashCode();
        }
        return super.hashCode();
    }

    public final void i(String str) {
        this.sha256 = str;
    }

    public final long j() {
        return this.fileTotalSize;
    }

    public final int k() {
        return this.priority;
    }

    public final boolean l() {
        return this.allowedMobileNetowrk;
    }

    public final int m() {
        return this.pauseReason;
    }

    @OuterVisible
    public void setAllowedMobileNetowrk(boolean z10) {
        this.allowedMobileNetowrk = z10;
    }
}
