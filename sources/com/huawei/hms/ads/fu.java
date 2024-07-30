package com.huawei.hms.ads;

import android.view.View;

/* loaded from: classes2.dex */
public class fu extends fx {
    private static final String Code = "NativeViewMonitor";
    private boolean B;
    private long C;
    private long I;
    private int S;
    private ft V;
    private int Z;

    public fu(View view, ft ftVar) {
        super(view);
        this.I = 500L;
        this.Z = 50;
        this.B = false;
        this.V = ftVar;
        this.C = System.currentTimeMillis();
    }

    private void B() {
        if (this.B) {
            return;
        }
        ex.V(Code, "viewShowStartRecord");
        this.B = true;
        this.C = System.currentTimeMillis();
        ft ftVar = this.V;
        if (ftVar != null) {
            ftVar.a_();
        }
    }

    private void C() {
        if (!this.B) {
            return;
        }
        ex.V(Code, "viewShowEndRecord");
        this.B = false;
        long currentTimeMillis = System.currentTimeMillis() - this.C;
        if (ex.Code()) {
            ex.Code(Code, "max visible area percentage: %d duration: %d", Integer.valueOf(this.S), Long.valueOf(currentTimeMillis));
        }
        ft ftVar = this.V;
        if (ftVar != null) {
            ftVar.Code(currentTimeMillis, this.S);
        }
        this.S = 0;
    }

    @Override // com.huawei.hms.ads.fx
    public void Code() {
        ft ftVar = this.V;
        if (ftVar != null) {
            ftVar.I();
        }
    }

    public int I() {
        return this.S;
    }

    public void V() {
        this.Z = 50;
        this.I = 500L;
    }

    public long Z() {
        return this.C;
    }

    @Override // com.huawei.hms.ads.fx
    public void Code(int i10) {
        if (i10 > this.S) {
            this.S = i10;
        }
        if (i10 >= this.Z) {
            B();
        } else {
            C();
        }
    }

    public void V(long j10, int i10) {
        this.Z = i10;
        this.I = j10;
    }

    @Override // com.huawei.hms.ads.fx
    public void Code(long j10, int i10) {
        C();
        ft ftVar = this.V;
        if (ftVar != null) {
            ftVar.V(j10, i10);
        }
    }

    public boolean Code(long j10) {
        return j10 >= this.I && this.S >= this.Z;
    }
}
