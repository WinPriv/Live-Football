package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.g;
import d6.g0;
import m4.k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13354s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f13355t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f13356u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f13357v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f13358w;

    public /* synthetic */ c0(Object obj, int i10, long j10, long j11, int i11) {
        this.f13354s = i11;
        this.f13358w = obj;
        this.f13355t = i10;
        this.f13356u = j10;
        this.f13357v = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13354s;
        Object obj = this.f13358w;
        switch (i10) {
            case 0:
                ((g.a) obj).b(this.f13355t, this.f13356u, this.f13357v);
                return;
            default:
                int i11 = this.f13355t;
                long j10 = this.f13356u;
                long j11 = this.f13357v;
                m4.k kVar = ((k.a) obj).f32748b;
                int i12 = g0.f27302a;
                kVar.v(i11, j10, j11);
                return;
        }
    }
}
