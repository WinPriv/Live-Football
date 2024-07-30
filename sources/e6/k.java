package e6;

import d6.g0;
import e6.m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f27833s = 1;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m.a f27834t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27835u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f27836v;

    public /* synthetic */ k(m.a aVar, int i10, long j10) {
        this.f27834t = aVar;
        this.f27835u = i10;
        this.f27836v = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f27833s;
        long j10 = this.f27836v;
        int i11 = this.f27835u;
        m.a aVar = this.f27834t;
        switch (i10) {
            case 0:
                aVar.getClass();
                int i12 = g0.f27302a;
                aVar.f27841b.d(i11, j10);
                return;
            default:
                aVar.getClass();
                int i13 = g0.f27302a;
                aVar.f27841b.i(i11, j10);
                return;
        }
    }

    public /* synthetic */ k(m.a aVar, long j10, int i10) {
        this.f27834t = aVar;
        this.f27836v = j10;
        this.f27835u = i10;
    }
}
