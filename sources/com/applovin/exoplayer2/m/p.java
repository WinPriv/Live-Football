package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.m.n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16543s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n.a f16544t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f16545u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f16546v;

    public /* synthetic */ p(n.a aVar, int i10, long j10) {
        this.f16544t = aVar;
        this.f16546v = i10;
        this.f16545u = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16543s;
        n.a aVar = this.f16544t;
        long j10 = this.f16545u;
        int i11 = this.f16546v;
        switch (i10) {
            case 0:
                n.a.g(aVar, i11, j10);
                return;
            default:
                n.a.i(aVar, i11, j10);
                return;
        }
    }

    public /* synthetic */ p(n.a aVar, long j10, int i10) {
        this.f16544t = aVar;
        this.f16545u = j10;
        this.f16546v = i10;
    }
}
