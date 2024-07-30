package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.h.q;
import j5.u;
import j5.x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15324s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15325t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f15326u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f15327v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15328w;

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15324s = i10;
        this.f15325t = obj;
        this.f15326u = obj2;
        this.f15327v = obj3;
        this.f15328w = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15324s;
        Object obj = this.f15328w;
        Object obj2 = this.f15327v;
        Object obj3 = this.f15326u;
        Object obj4 = this.f15325t;
        switch (i10) {
            case 0:
                q.a.b((q.a) obj4, (q) obj3, (j) obj2, (m) obj);
                return;
            default:
                ((j5.x) obj3).h0(((x.a) obj4).f29851a, (u.b) obj2, (j5.r) obj);
                return;
        }
    }
}
