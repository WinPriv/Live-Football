package com.applovin.exoplayer2.d;

import android.util.Pair;
import com.applovin.exoplayer2.d.g;
import j5.u;
import k4.y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14009s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f14010t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f14011u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f14012v;

    public /* synthetic */ c0(int i10, Object obj, Object obj2, int i11) {
        this.f14009s = i11;
        this.f14011u = obj;
        this.f14012v = obj2;
        this.f14010t = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14009s;
        int i11 = this.f14010t;
        Object obj = this.f14012v;
        Object obj2 = this.f14011u;
        switch (i10) {
            case 0:
                ((g.a) obj2).a((g) obj, i11);
                return;
            default:
                Pair pair = (Pair) obj;
                ((y0.a) obj2).f30846t.f30840h.K(((Integer) pair.first).intValue(), (u.b) pair.second, i11);
                return;
        }
    }
}
