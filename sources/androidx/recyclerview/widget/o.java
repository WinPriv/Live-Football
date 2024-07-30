package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* loaded from: classes.dex */
public class o extends RecyclerView.y {

    /* renamed from: k, reason: collision with root package name */
    public PointF f2371k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2372l;

    /* renamed from: n, reason: collision with root package name */
    public float f2374n;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f2369i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f2370j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    public boolean f2373m = false;
    public int o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f2375p = 0;

    public o(Context context) {
        this.f2372l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.view.View r11, androidx.recyclerview.widget.RecyclerView.y.a r12) {
        /*
            r10 = this;
            android.graphics.PointF r0 = r10.f2371k
            r1 = 1
            r2 = -1
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r4
        L16:
            androidx.recyclerview.widget.RecyclerView$o r5 = r10.f2190c
            if (r5 == 0) goto L4f
            boolean r6 = r5.d()
            if (r6 != 0) goto L21
            goto L4f
        L21:
            android.view.ViewGroup$LayoutParams r6 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$p r6 = (androidx.recyclerview.widget.RecyclerView.p) r6
            int r7 = r11.getLeft()
            int r8 = androidx.recyclerview.widget.RecyclerView.o.A(r11)
            int r7 = r7 - r8
            int r8 = r6.leftMargin
            int r7 = r7 - r8
            int r8 = r11.getRight()
            int r9 = androidx.recyclerview.widget.RecyclerView.o.H(r11)
            int r9 = r9 + r8
            int r6 = r6.rightMargin
            int r9 = r9 + r6
            int r6 = r5.C()
            int r8 = r5.f2163n
            int r5 = r5.D()
            int r8 = r8 - r5
            int r0 = e(r7, r9, r6, r8, r0)
            goto L50
        L4f:
            r0 = r4
        L50:
            android.graphics.PointF r5 = r10.f2371k
            if (r5 == 0) goto L5f
            float r5 = r5.y
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L5b
            goto L5f
        L5b:
            if (r3 <= 0) goto L60
            r2 = r1
            goto L60
        L5f:
            r2 = r4
        L60:
            androidx.recyclerview.widget.RecyclerView$o r3 = r10.f2190c
            if (r3 == 0) goto L98
            boolean r5 = r3.e()
            if (r5 != 0) goto L6b
            goto L98
        L6b:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$p r4 = (androidx.recyclerview.widget.RecyclerView.p) r4
            int r5 = r11.getTop()
            int r6 = androidx.recyclerview.widget.RecyclerView.o.J(r11)
            int r5 = r5 - r6
            int r6 = r4.topMargin
            int r5 = r5 - r6
            int r6 = r11.getBottom()
            int r11 = androidx.recyclerview.widget.RecyclerView.o.u(r11)
            int r11 = r11 + r6
            int r4 = r4.bottomMargin
            int r11 = r11 + r4
            int r4 = r3.E()
            int r6 = r3.o
            int r3 = r3.B()
            int r6 = r6 - r3
            int r4 = e(r5, r11, r4, r6, r2)
        L98:
            int r11 = r0 * r0
            int r2 = r4 * r4
            int r2 = r2 + r11
            double r2 = (double) r2
            double r2 = java.lang.Math.sqrt(r2)
            int r11 = (int) r2
            int r11 = r10.g(r11)
            double r2 = (double) r11
            r5 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r5
            double r2 = java.lang.Math.ceil(r2)
            int r11 = (int) r2
            if (r11 <= 0) goto Lc3
            int r0 = -r0
            int r2 = -r4
            android.view.animation.DecelerateInterpolator r3 = r10.f2370j
            r12.f2195a = r0
            r12.f2196b = r2
            r12.f2197c = r11
            r12.f2199e = r3
            r12.f = r1
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.c(android.view.View, androidx.recyclerview.widget.RecyclerView$y$a):void");
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int g(int i10) {
        float abs = Math.abs(i10);
        if (!this.f2373m) {
            this.f2374n = f(this.f2372l);
            this.f2373m = true;
        }
        return (int) Math.ceil(abs * this.f2374n);
    }
}
