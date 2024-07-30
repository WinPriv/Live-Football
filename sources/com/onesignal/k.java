package com.onesignal;

import android.view.View;
import com.onesignal.DraggableRelativeLayout;
import com.onesignal.w;
import java.util.WeakHashMap;
import n0.c0;
import t0.c;

/* compiled from: DraggableRelativeLayout.java */
/* loaded from: classes2.dex */
public final class k extends c.AbstractC0485c {

    /* renamed from: a, reason: collision with root package name */
    public int f26882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DraggableRelativeLayout f26883b;

    public k(DraggableRelativeLayout draggableRelativeLayout) {
        this.f26883b = draggableRelativeLayout;
    }

    @Override // t0.c.AbstractC0485c
    public final int a(int i10, View view) {
        return this.f26883b.f26586v.f26590d;
    }

    @Override // t0.c.AbstractC0485c
    public final int b(int i10, View view) {
        DraggableRelativeLayout.a aVar;
        DraggableRelativeLayout.a aVar2;
        DraggableRelativeLayout draggableRelativeLayout = this.f26883b;
        DraggableRelativeLayout.b bVar = draggableRelativeLayout.f26586v;
        if (bVar.f26592g) {
            return bVar.f26588b;
        }
        this.f26882a = i10;
        if (bVar.f == 1) {
            if (i10 >= bVar.f26589c && (aVar2 = draggableRelativeLayout.f26583s) != null) {
                ((u) aVar2).f27093a.f27168m = true;
            }
            int i11 = bVar.f26588b;
            if (i10 < i11) {
                return i11;
            }
        } else {
            if (i10 <= bVar.f26589c && (aVar = draggableRelativeLayout.f26583s) != null) {
                ((u) aVar).f27093a.f27168m = true;
            }
            int i12 = bVar.f26588b;
            if (i10 > i12) {
                return i12;
            }
        }
        return i10;
    }

    @Override // t0.c.AbstractC0485c
    public final void h(View view, float f, float f10) {
        DraggableRelativeLayout draggableRelativeLayout = this.f26883b;
        DraggableRelativeLayout.b bVar = draggableRelativeLayout.f26586v;
        int i10 = bVar.f26588b;
        if (!draggableRelativeLayout.f26585u) {
            if (bVar.f == 1) {
                if (this.f26882a > bVar.f26595j || f10 > bVar.f26593h) {
                    i10 = bVar.f26594i;
                    draggableRelativeLayout.f26585u = true;
                    DraggableRelativeLayout.a aVar = draggableRelativeLayout.f26583s;
                    if (aVar != null) {
                        w wVar = ((u) aVar).f27093a;
                        w.b bVar2 = wVar.f27174t;
                        if (bVar2 != null) {
                            v0 n10 = e3.n();
                            b1 b1Var = ((j5) bVar2).f26881a.f26809e;
                            ((c3) n10.f27108a).r("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
                        }
                        wVar.f(null);
                    }
                }
            } else if (this.f26882a < bVar.f26595j || f10 < bVar.f26593h) {
                i10 = bVar.f26594i;
                draggableRelativeLayout.f26585u = true;
                DraggableRelativeLayout.a aVar2 = draggableRelativeLayout.f26583s;
                if (aVar2 != null) {
                    w wVar2 = ((u) aVar2).f27093a;
                    w.b bVar3 = wVar2.f27174t;
                    if (bVar3 != null) {
                        v0 n11 = e3.n();
                        b1 b1Var2 = ((j5) bVar3).f26881a.f26809e;
                        ((c3) n11.f27108a).r("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
                    }
                    wVar2.f(null);
                }
            }
        }
        if (draggableRelativeLayout.f26584t.q(draggableRelativeLayout.f26586v.f26590d, i10)) {
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            c0.d.k(draggableRelativeLayout);
        }
    }

    @Override // t0.c.AbstractC0485c
    public final boolean i(int i10, View view) {
        return true;
    }
}
