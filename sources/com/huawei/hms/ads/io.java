package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public abstract class io {
    private final String B = "min_show_time_task" + hashCode();
    private final String C = "max_show_time_task" + hashCode();
    protected ec Code;
    private ko Z;

    public io(ec ecVar, ko koVar) {
        this.Code = ecVar;
        this.Z = koVar;
    }

    public void B() {
        gb.w.d(this.B);
    }

    public void Code() {
    }

    public void I() {
        ko koVar = this.Z;
        if (koVar != null) {
            koVar.Code();
        }
    }

    public void V() {
    }

    public void Z() {
        ko koVar = this.Z;
        if (koVar != null) {
            koVar.V();
        }
    }

    public void Code(long j10) {
        ex.V(getClass().getSimpleName(), "start max show time task duration: %d", Long.valueOf(j10));
        gb.w.c(new Runnable() { // from class: com.huawei.hms.ads.io.1
            @Override // java.lang.Runnable
            public void run() {
                io.this.B();
                io.this.Z();
            }
        }, this.C, j10);
    }

    public void V(long j10) {
        ex.V(getClass().getSimpleName(), "start min show time task duration: %d", Long.valueOf(j10));
        gb.w.c(new Runnable() { // from class: com.huawei.hms.ads.io.2
            @Override // java.lang.Runnable
            public void run() {
                io.this.I();
            }
        }, this.B, j10);
    }
}
