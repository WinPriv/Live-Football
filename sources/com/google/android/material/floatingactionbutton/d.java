package com.google.android.material.floatingactionbutton;

import a3.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import d7.j;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public j f20773a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20774b;

    /* renamed from: d, reason: collision with root package name */
    public float f20776d;

    /* renamed from: e, reason: collision with root package name */
    public float f20777e;
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public Animator f20778g;

    /* renamed from: h, reason: collision with root package name */
    public h6.g f20779h;

    /* renamed from: i, reason: collision with root package name */
    public h6.g f20780i;

    /* renamed from: j, reason: collision with root package name */
    public float f20781j;

    /* renamed from: l, reason: collision with root package name */
    public int f20783l;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f20785n;
    public ArrayList<Animator.AnimatorListener> o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<f> f20786p;

    /* renamed from: q, reason: collision with root package name */
    public final FloatingActionButton f20787q;

    /* renamed from: r, reason: collision with root package name */
    public final c7.b f20788r;

    /* renamed from: w, reason: collision with root package name */
    public v6.b f20793w;

    /* renamed from: x, reason: collision with root package name */
    public static final z0.a f20771x = h6.a.f28770c;
    public static final int y = R.attr.motionDurationLong2;

    /* renamed from: z, reason: collision with root package name */
    public static final int f20772z = R.attr.motionEasingEmphasizedInterpolator;
    public static final int A = R.attr.motionDurationMedium1;
    public static final int B = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] C = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] D = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] E = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_enabled};
    public static final int[] H = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public boolean f20775c = true;

    /* renamed from: k, reason: collision with root package name */
    public float f20782k = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public int f20784m = 0;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f20789s = new Rect();

    /* renamed from: t, reason: collision with root package name */
    public final RectF f20790t = new RectF();

    /* renamed from: u, reason: collision with root package name */
    public final RectF f20791u = new RectF();

    /* renamed from: v, reason: collision with root package name */
    public final Matrix f20792v = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class a extends h6.f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            d.this.f20782k = f;
            float[] fArr = this.f28777a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f28778b;
            matrix2.getValues(fArr2);
            for (int i10 = 0; i10 < 9; i10++) {
                float f10 = fArr2[i10];
                float f11 = fArr[i10];
                fArr2[i10] = k.d(f10, f11, f, f11);
            }
            Matrix matrix3 = this.f28779c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f20795a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f20796b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f20797c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f20798d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f20799e;
        public final /* synthetic */ float f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f20800g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Matrix f20801h;

        public b(float f, float f10, float f11, float f12, float f13, float f14, float f15, Matrix matrix) {
            this.f20795a = f;
            this.f20796b = f10;
            this.f20797c = f11;
            this.f20798d = f12;
            this.f20799e = f13;
            this.f = f14;
            this.f20800g = f15;
            this.f20801h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d dVar = d.this;
            dVar.f20787q.setAlpha(h6.a.a(this.f20795a, this.f20796b, gl.Code, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = dVar.f20787q;
            float f = this.f20798d;
            float f10 = this.f20797c;
            floatingActionButton.setScaleX(((f - f10) * floatValue) + f10);
            FloatingActionButton floatingActionButton2 = dVar.f20787q;
            float f11 = this.f20799e;
            floatingActionButton2.setScaleY(((f - f11) * floatValue) + f11);
            float f12 = this.f20800g;
            float f13 = this.f;
            dVar.f20782k = k.d(f12, f13, floatValue, f13);
            float d10 = k.d(f12, f13, floatValue, f13);
            Matrix matrix = this.f20801h;
            dVar.a(d10, matrix);
            dVar.f20787q.setImageMatrix(matrix);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class c extends i {
        public c(v6.c cVar) {
            super(cVar);
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return gl.Code;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0238d extends i {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f20803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0238d(v6.c cVar) {
            super(cVar);
            this.f20803c = cVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f20803c;
            return dVar.f20776d + dVar.f20777e;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class e extends i {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f20804c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v6.c cVar) {
            super(cVar);
            this.f20804c = cVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f20804c;
            return dVar.f20776d + dVar.f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public interface f {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public interface g {
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class h extends i {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f20805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(v6.c cVar) {
            super(cVar);
            this.f20805c = cVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return this.f20805c.f20776d;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f20806a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f20807b;

        public i(v6.c cVar) {
            this.f20807b = cVar;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f20807b.getClass();
            this.f20806a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z10 = this.f20806a;
            d dVar = this.f20807b;
            if (!z10) {
                dVar.getClass();
                a();
                this.f20806a = true;
            }
            valueAnimator.getAnimatedFraction();
            dVar.getClass();
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f20787q = floatingActionButton;
        this.f20788r = bVar;
        com.google.android.material.internal.f fVar = new com.google.android.material.internal.f();
        v6.c cVar = (v6.c) this;
        fVar.a(C, d(new e(cVar)));
        fVar.a(D, d(new C0238d(cVar)));
        fVar.a(E, d(new C0238d(cVar)));
        fVar.a(F, d(new C0238d(cVar)));
        fVar.a(G, d(new h(cVar)));
        fVar.a(H, d(new c(cVar)));
        this.f20781j = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f20771x);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(gl.Code, 1.0f);
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f20787q.getDrawable() != null && this.f20783l != 0) {
            RectF rectF = this.f20790t;
            RectF rectF2 = this.f20791u;
            rectF.set(gl.Code, gl.Code, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
            int i10 = this.f20783l;
            rectF2.set(gl.Code, gl.Code, i10, i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f20783l;
            matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
        }
    }

    public final AnimatorSet b(h6.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f20787q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        gVar.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        gVar.c("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new v6.a());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        gVar.c("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new v6.a());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f20792v;
        a(f12, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new h6.e(), new a(), new Matrix(matrix));
        gVar.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        a0.a.U0(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(gl.Code, 1.0f);
        FloatingActionButton floatingActionButton = this.f20787q;
        ofFloat.addUpdateListener(new b(floatingActionButton.getAlpha(), f10, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f20782k, f12, new Matrix(this.f20792v)));
        arrayList.add(ofFloat);
        a0.a.U0(animatorSet, arrayList);
        animatorSet.setDuration(w6.a.c(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(w6.a.d(floatingActionButton.getContext(), i11, h6.a.f28769b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        float f10;
        int i10 = 0;
        if (this.f20774b) {
            i10 = (0 - this.f20787q.getSizeDimension()) / 2;
        }
        if (this.f20775c) {
            f10 = e() + this.f;
        } else {
            f10 = gl.Code;
        }
        int max = Math.max(i10, (int) Math.ceil(f10));
        int max2 = Math.max(i10, (int) Math.ceil(f10 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void g() {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i(int[] iArr) {
        throw null;
    }

    public void j(float f10, float f11, float f12) {
        throw null;
    }

    public final void k() {
        ArrayList<f> arrayList = this.f20786p;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void l() {
        throw null;
    }

    public void m() {
        throw null;
    }

    public final void n() {
        f(this.f20789s);
        a0.a.y0(null, "Didn't initialize content background");
        throw null;
    }
}
