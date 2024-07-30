package com.onesignal;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import n0.c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DraggableRelativeLayout extends RelativeLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final int f26581w = b3.b(28);

    /* renamed from: x, reason: collision with root package name */
    public static final int f26582x = b3.b(64);

    /* renamed from: s, reason: collision with root package name */
    public a f26583s;

    /* renamed from: t, reason: collision with root package name */
    public t0.c f26584t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26585u;

    /* renamed from: v, reason: collision with root package name */
    public b f26586v;

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f26587a;

        /* renamed from: b, reason: collision with root package name */
        public int f26588b;

        /* renamed from: c, reason: collision with root package name */
        public int f26589c;

        /* renamed from: d, reason: collision with root package name */
        public int f26590d;

        /* renamed from: e, reason: collision with root package name */
        public int f26591e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f26592g;

        /* renamed from: h, reason: collision with root package name */
        public int f26593h;

        /* renamed from: i, reason: collision with root package name */
        public int f26594i;

        /* renamed from: j, reason: collision with root package name */
        public int f26595j;
    }

    public DraggableRelativeLayout(Context context) {
        super(context);
        setClipChildren(false);
        t0.c cVar = new t0.c(getContext(), this, new k(this));
        cVar.f35346b = (int) (cVar.f35346b * 1.0f);
        this.f26584t = cVar;
    }

    public final void a(b bVar) {
        this.f26586v = bVar;
        bVar.f26594i = ((Resources.getSystem().getDisplayMetrics().heightPixels - bVar.f26591e) - bVar.f26587a) + bVar.f26591e + bVar.f26587a + f26582x;
        int b10 = b3.b(com.huawei.openalliance.ad.constant.w.Z);
        bVar.f26593h = b10;
        if (bVar.f == 0) {
            int i10 = (-bVar.f26591e) - f26581w;
            bVar.f26594i = i10;
            bVar.f26593h = -b10;
            bVar.f26595j = i10 / 3;
            return;
        }
        bVar.f26595j = (bVar.f26588b * 2) + (bVar.f26591e / 3);
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.f26584t.g()) {
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            c0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f26585u) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (aVar = this.f26583s) != null) {
            ((u) aVar).f27093a.f27168m = false;
        }
        this.f26584t.k(motionEvent);
        return false;
    }
}
