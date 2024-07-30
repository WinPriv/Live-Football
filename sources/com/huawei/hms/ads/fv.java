package com.huawei.hms.ads;

import android.view.View;

/* loaded from: classes2.dex */
public class fv extends fx {
    private a C;
    private boolean D;
    private int F;
    boolean I;
    private long L;
    private long S;
    boolean V;
    protected com.huawei.openalliance.ad.inter.data.i Z;

    /* renamed from: a, reason: collision with root package name */
    private int f21690a;

    /* renamed from: b, reason: collision with root package name */
    private int f21691b;

    /* renamed from: c, reason: collision with root package name */
    private int f21692c;

    /* loaded from: classes2.dex */
    public interface a {
        void B();

        void Code();

        void Code(long j10, int i10);

        void I();

        void V();

        void V(long j10, int i10);

        void Z();
    }

    public fv(View view, a aVar) {
        super(view);
        this.S = 500L;
        this.F = 50;
        this.D = false;
        this.f21691b = 100;
        this.f21692c = 10;
        this.V = false;
        this.I = false;
        this.C = aVar;
        this.L = System.currentTimeMillis();
    }

    private void f() {
        if (this.D) {
            return;
        }
        ex.V("PPSLinkedViewMonitor", "viewShowStartRecord");
        this.D = true;
        this.L = System.currentTimeMillis();
        a aVar = this.C;
        if (aVar != null) {
            aVar.Code();
        }
    }

    private void g() {
        if (!this.D) {
            return;
        }
        ex.V("PPSLinkedViewMonitor", "viewShowEndRecord");
        this.D = false;
        long currentTimeMillis = System.currentTimeMillis() - this.L;
        if (ex.Code()) {
            ex.Code("PPSLinkedViewMonitor", "max visible area percentage: %d duration: %d", Integer.valueOf(this.f21690a), Long.valueOf(currentTimeMillis));
        }
        a aVar = this.C;
        if (aVar != null) {
            aVar.Code(currentTimeMillis, this.f21690a);
        }
        this.f21690a = 0;
    }

    public int B() {
        return this.f21690a;
    }

    @Override // com.huawei.hms.ads.fx
    public void Code() {
        a aVar = this.C;
        if (aVar != null) {
            aVar.V();
        }
    }

    public boolean F() {
        if (e() >= V()) {
            return true;
        }
        return false;
    }

    public int I() {
        return this.f21692c;
    }

    public int V() {
        return this.f21691b;
    }

    @Override // com.huawei.hms.ads.fx
    public void Code(int i10) {
        ex.V("PPSLinkedViewMonitor", "onUpdateViewShowArea, percentage: %s", Integer.valueOf(i10));
        if (i10 > this.f21690a) {
            this.f21690a = i10;
        }
        if (i10 >= this.F) {
            f();
        } else {
            g();
        }
        V(i10);
    }

    public void V(int i10) {
        a aVar;
        if (i10 >= V()) {
            this.I = false;
            if (this.V) {
                return;
            }
            this.V = true;
            a aVar2 = this.C;
            if (aVar2 != null) {
                aVar2.I();
                return;
            }
            return;
        }
        this.V = false;
        if (i10 > 100 - I()) {
            if (this.I && (aVar = this.C) != null) {
                aVar.B();
            }
            this.I = false;
            return;
        }
        if (this.I) {
            return;
        }
        this.I = true;
        a aVar3 = this.C;
        if (aVar3 != null) {
            aVar3.Z();
        }
    }

    @Override // com.huawei.hms.ads.fx
    public void Code(long j10, int i10) {
        g();
        a aVar = this.C;
        if (aVar != null) {
            aVar.V(j10, i10);
        }
        V(0);
    }

    public void V(long j10, int i10) {
        this.F = i10;
        this.S = j10;
    }

    public void Code(com.huawei.openalliance.ad.inter.data.i iVar) {
        com.huawei.openalliance.ad.inter.data.p pVar;
        this.Z = iVar;
        if (iVar == null || (pVar = iVar.G) == null) {
            return;
        }
        this.f21691b = pVar.B;
        this.f21692c = Math.max(100 - pVar.C, 0);
    }

    public boolean Code(long j10) {
        return j10 >= this.S && this.f21690a >= this.F;
    }
}
