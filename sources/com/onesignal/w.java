package com.onesignal;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.constant.ag;
import com.onesignal.DraggableRelativeLayout;
import java.util.WeakHashMap;
import n0.c0;

/* compiled from: InAppMessageView.java */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: v, reason: collision with root package name */
    public static final int f27154v = Color.parseColor("#00000000");

    /* renamed from: w, reason: collision with root package name */
    public static final int f27155w = Color.parseColor("#BB000000");

    /* renamed from: x, reason: collision with root package name */
    public static final int f27156x = b3.b(4);

    /* renamed from: a, reason: collision with root package name */
    public PopupWindow f27157a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f27158b;

    /* renamed from: d, reason: collision with root package name */
    public final int f27160d;

    /* renamed from: e, reason: collision with root package name */
    public int f27161e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f27162g;

    /* renamed from: h, reason: collision with root package name */
    public int f27163h;

    /* renamed from: i, reason: collision with root package name */
    public int f27164i;

    /* renamed from: j, reason: collision with root package name */
    public final double f27165j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f27166k;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f27169n;
    public final r0 o;

    /* renamed from: p, reason: collision with root package name */
    public final int f27170p;

    /* renamed from: q, reason: collision with root package name */
    public WebView f27171q;

    /* renamed from: r, reason: collision with root package name */
    public RelativeLayout f27172r;

    /* renamed from: s, reason: collision with root package name */
    public DraggableRelativeLayout f27173s;

    /* renamed from: t, reason: collision with root package name */
    public b f27174t;

    /* renamed from: u, reason: collision with root package name */
    public Runnable f27175u;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f27159c = new Handler();

    /* renamed from: l, reason: collision with root package name */
    public boolean f27167l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27168m = false;

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Activity f27176s;

        public a(Activity activity) {
            this.f27176s = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            w.this.d(this.f27176s);
        }
    }

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public w(OSWebView oSWebView, r0 r0Var, boolean z10) {
        double doubleValue;
        boolean z11;
        int i10;
        int i11;
        int i12;
        this.f = b3.b(24);
        this.f27162g = b3.b(24);
        this.f27163h = b3.b(24);
        this.f27164i = b3.b(24);
        this.f27169n = false;
        this.f27171q = oSWebView;
        int i13 = r0Var.f27002e;
        this.f27170p = i13;
        this.f27161e = r0Var.f27003g;
        this.f27160d = -1;
        Double d10 = r0Var.f;
        if (d10 == null) {
            doubleValue = 0.0d;
        } else {
            doubleValue = d10.doubleValue();
        }
        this.f27165j = doubleValue;
        int c10 = s.f.c(i13);
        if (c10 != 0 && c10 != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f27166k = !z11;
        this.f27169n = z10;
        this.o = r0Var;
        boolean z12 = r0Var.f26999b;
        if (z12) {
            i10 = b3.b(24);
        } else {
            i10 = 0;
        }
        this.f27163h = i10;
        if (z12) {
            i11 = b3.b(24);
        } else {
            i11 = 0;
        }
        this.f27164i = i11;
        boolean z13 = r0Var.f27000c;
        if (z13) {
            i12 = b3.b(24);
        } else {
            i12 = 0;
        }
        this.f = i12;
        this.f27162g = z13 ? b3.b(24) : 0;
    }

    public static void a(w wVar) {
        wVar.g();
        b bVar = wVar.f27174t;
        if (bVar != null) {
            v0 n10 = e3.n();
            e5 e5Var = ((j5) bVar).f26881a;
            n10.E(e5Var.f26809e, false);
            if (c.f26699t != null) {
                StringBuilder j10 = com.ironsource.adapters.facebook.a.j("com.onesignal.e5");
                j10.append(e5Var.f26809e.f26667a);
                com.onesignal.a.f26632d.remove(j10.toString());
            }
        }
    }

    public static ValueAnimator b(RelativeLayout relativeLayout, int i10, int i11, z zVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(ag.f21998i);
        valueAnimator.setIntValues(i10, i11);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new k3(relativeLayout));
        if (zVar != null) {
            valueAnimator.addListener(zVar);
        }
        return valueAnimator;
    }

    public final DraggableRelativeLayout.b c(int i10, int i11, boolean z10) {
        DraggableRelativeLayout.b bVar = new DraggableRelativeLayout.b();
        bVar.f26590d = this.f27162g;
        bVar.f26588b = this.f27163h;
        bVar.f26592g = z10;
        bVar.f26591e = i10;
        b3.d(this.f27158b);
        if (i11 != 0) {
            int i12 = i11 - 1;
            int i13 = 1;
            int i14 = f27156x;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            i10 = b3.d(this.f27158b) - (this.f27164i + this.f27163h);
                            bVar.f26591e = i10;
                        }
                    }
                    int d10 = (b3.d(this.f27158b) / 2) - (i10 / 2);
                    bVar.f26589c = i14 + d10;
                    bVar.f26588b = d10;
                    bVar.f26587a = d10;
                } else {
                    bVar.f26587a = b3.d(this.f27158b) - i10;
                    bVar.f26589c = this.f27164i + i14;
                }
            } else {
                bVar.f26589c = this.f27163h - i14;
            }
            if (i11 == 1) {
                i13 = 0;
            }
            bVar.f = i13;
            return bVar;
        }
        throw null;
    }

    public final void d(Activity activity) {
        RelativeLayout.LayoutParams layoutParams;
        if (b3.e(activity) && this.f27172r == null) {
            this.f27158b = activity;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, this.f27161e);
            layoutParams2.addRule(13);
            int i10 = this.f27170p;
            if (this.f27166k) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f27160d, -1);
                int c10 = s.f.c(i10);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2 || c10 == 3) {
                            layoutParams3.addRule(13);
                        }
                    } else {
                        layoutParams3.addRule(12);
                        layoutParams3.addRule(14);
                    }
                } else {
                    layoutParams3.addRule(10);
                    layoutParams3.addRule(14);
                }
                layoutParams = layoutParams3;
            } else {
                layoutParams = null;
            }
            OSUtils.s(new t(this, layoutParams2, layoutParams, c(this.f27161e, i10, this.f27169n), i10));
            return;
        }
        new Handler().postDelayed(new a(activity), 200L);
    }

    public final void e(k5 k5Var) {
        DraggableRelativeLayout draggableRelativeLayout = this.f27173s;
        if (draggableRelativeLayout == null) {
            e3.b(3, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
            this.f27172r = null;
            this.f27173s = null;
            this.f27171q = null;
            if (k5Var != null) {
                k5Var.onComplete();
                return;
            }
            return;
        }
        draggableRelativeLayout.f26585u = true;
        draggableRelativeLayout.f26584t.s(draggableRelativeLayout.getLeft(), draggableRelativeLayout.f26586v.f26594i, draggableRelativeLayout);
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        c0.d.k(draggableRelativeLayout);
        f(k5Var);
    }

    public final void f(k5 k5Var) {
        new Handler(Looper.getMainLooper()).postDelayed(new x(this, k5Var), 600);
    }

    public final void g() {
        e3.b(6, "InAppMessageView removing views", null);
        Runnable runnable = this.f27175u;
        if (runnable != null) {
            this.f27159c.removeCallbacks(runnable);
            this.f27175u = null;
        }
        DraggableRelativeLayout draggableRelativeLayout = this.f27173s;
        if (draggableRelativeLayout != null) {
            draggableRelativeLayout.removeAllViews();
        }
        PopupWindow popupWindow = this.f27157a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f27172r = null;
        this.f27173s = null;
        this.f27171q = null;
    }

    public final String toString() {
        return "InAppMessageView{currentActivity=" + this.f27158b + ", pageWidth=" + this.f27160d + ", pageHeight=" + this.f27161e + ", displayDuration=" + this.f27165j + ", hasBackground=" + this.f27166k + ", shouldDismissWhenActive=" + this.f27167l + ", isDragging=" + this.f27168m + ", disableDragDismiss=" + this.f27169n + ", displayLocation=" + a3.k.E(this.f27170p) + ", webView=" + this.f27171q + '}';
    }
}
