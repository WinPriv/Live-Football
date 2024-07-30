package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public class fw {
    private static final String Code = "VideoMonitor";
    private String C;
    private boolean V = false;
    private boolean I = false;
    private long Z = 0;
    private long B = 0;

    public fw(String str) {
        this.C = s.f.b("VideoMonitor_", str);
    }

    public long B() {
        return this.B;
    }

    public void Code() {
        if (ex.Code()) {
            ex.Code(this.C, "onPlayStart");
        }
        if (!this.I) {
            this.I = true;
            this.B = System.currentTimeMillis();
        }
    }

    public void I() {
        if (ex.Code()) {
            ex.Code(this.C, "onVideoEnd");
        }
        this.I = false;
        this.V = false;
        this.Z = 0L;
        this.B = 0L;
    }

    public void V() {
        if (ex.Code()) {
            ex.Code(this.C, "onBufferStart");
        }
        if (!this.V) {
            this.V = true;
            this.Z = System.currentTimeMillis();
        }
    }

    public long Z() {
        return this.Z;
    }
}
