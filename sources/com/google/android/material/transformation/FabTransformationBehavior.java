package com.google.android.material.transformation;

import a3.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.huawei.hms.ads.gl;
import h6.g;
import h6.h;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f21242c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f21243d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f21244e;
    public final int[] f;

    /* renamed from: g, reason: collision with root package name */
    public float f21245g;

    /* renamed from: h, reason: collision with root package name */
    public float f21246h;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f21247a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f21248b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f21249c;

        public a(boolean z10, View view, View view2) {
            this.f21247a = z10;
            this.f21248b = view;
            this.f21249c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f21247a) {
                this.f21248b.setVisibility(4);
                View view = this.f21249c;
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f21247a) {
                this.f21248b.setVisibility(0);
                View view = this.f21249c;
                view.setAlpha(gl.Code);
                view.setVisibility(4);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public g f21250a;

        /* renamed from: b, reason: collision with root package name */
        public a0.a f21251b;
    }

    public FabTransformationBehavior() {
        this.f21242c = new Rect();
        this.f21243d = new RectF();
        this.f21244e = new RectF();
        this.f = new int[2];
    }

    public static Pair u(float f, float f10, boolean z10, b bVar) {
        h c10;
        h c11;
        if (f != gl.Code && f10 != gl.Code) {
            if ((z10 && f10 < gl.Code) || (!z10 && f10 > gl.Code)) {
                c10 = bVar.f21250a.c("translationXCurveUpwards");
                c11 = bVar.f21250a.c("translationYCurveUpwards");
            } else {
                c10 = bVar.f21250a.c("translationXCurveDownwards");
                c11 = bVar.f21250a.c("translationYCurveDownwards");
            }
        } else {
            c10 = bVar.f21250a.c("translationXLinear");
            c11 = bVar.f21250a.c("translationYLinear");
        }
        return new Pair(c10, c11);
    }

    public static float x(b bVar, h hVar, float f) {
        long j10 = hVar.f28782a;
        h c10 = bVar.f21250a.c("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((c10.f28782a + c10.f28783b) + 17) - j10)) / ((float) hVar.f28783b));
        LinearInterpolator linearInterpolator = h6.a.f28768a;
        return k.d(gl.Code, f, interpolation, f);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean b(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            if ((view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId())) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f1536h == 0) {
            fVar.f1536h = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03f2 A[LOOP:0: B:61:0x03f0->B:62:0x03f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b3  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet t(android.view.View r26, android.view.View r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.t(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float v(View view, View view2, a0.a aVar) {
        RectF rectF = this.f21243d;
        RectF rectF2 = this.f21244e;
        y(view, rectF);
        rectF.offset(this.f21245g, this.f21246h);
        y(view2, rectF2);
        aVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + gl.Code;
    }

    public final float w(View view, View view2, a0.a aVar) {
        RectF rectF = this.f21243d;
        RectF rectF2 = this.f21244e;
        y(view, rectF);
        rectF.offset(this.f21245g, this.f21246h);
        y(view2, rectF2);
        aVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + gl.Code;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(gl.Code, gl.Code, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b z(Context context, boolean z10);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21242c = new Rect();
        this.f21243d = new RectF();
        this.f21244e = new RectF();
        this.f = new int[2];
    }
}
