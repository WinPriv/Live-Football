package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;
import d6.o;
import k4.e1;
import k4.n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements p.a, o.a, o0.k {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12950s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12951t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12952u;

    public /* synthetic */ f0(int i10, int i11, Object obj) {
        this.f12950s = i11;
        this.f12952u = obj;
        this.f12951t = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // o0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.View r5) {
        /*
            r4 = this;
            java.lang.Object r5 = r4.f12952u
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            r5.getClass()
            r0 = 1
            int r1 = r4.f12951t
            if (r1 == r0) goto L4d
            r2 = 2
            if (r1 != r2) goto L10
            goto L4d
        L10:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r5.f20972n
            if (r2 == 0) goto L49
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L1b
            goto L49
        L1b:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r5.f20972n
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            e0.h r3 = new e0.h
            r3.<init>(r1, r0, r5)
            android.view.ViewParent r5 = r2.getParent()
            if (r5 == 0) goto L3e
            boolean r5 = r5.isLayoutRequested()
            if (r5 == 0) goto L3e
            java.util.WeakHashMap<android.view.View, n0.l0> r5 = n0.c0.f33054a
            boolean r5 = n0.c0.g.b(r2)
            if (r5 == 0) goto L3e
            r5 = r0
            goto L3f
        L3e:
            r5 = 0
        L3f:
            if (r5 == 0) goto L45
            r2.post(r3)
            goto L4c
        L45:
            r3.run()
            goto L4c
        L49:
            r5.s(r1)
        L4c:
            return r0
        L4d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r1 != r0) goto L5b
            java.lang.String r0 = "DRAGGING"
            goto L5d
        L5b:
            java.lang.String r0 = "SETTLING"
        L5d:
            java.lang.String r1 = " should not be set externally."
            java.lang.String r0 = a3.l.p(r2, r0, r1)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.a.f0.a(android.view.View):boolean");
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12950s;
        int i11 = this.f12951t;
        Object obj2 = this.f12952u;
        switch (i10) {
            case 0:
                a.w((b.a) obj2, i11, (b) obj);
                return;
            default:
                int i12 = k4.a0.f30317l0;
                ((e1.c) obj).g0((n0) obj2, i11);
                return;
        }
    }
}
