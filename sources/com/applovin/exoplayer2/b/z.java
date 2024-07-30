package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13569s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f13570t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f13571u;

    public /* synthetic */ z(int i10, Object obj, boolean z10) {
        this.f13569s = i10;
        this.f13571u = obj;
        this.f13570t = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13569s;
        boolean z10 = this.f13570t;
        Object obj = this.f13571u;
        switch (i10) {
            case 0:
                g.a.a((g.a) obj, z10);
                return;
            default:
                Object obj2 = d8.b.f27492m;
                ((d8.b) obj).b(z10);
                return;
        }
    }
}
