package y6;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.huawei.hms.ads.gl;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class f extends m {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f36779l = {0, 1350, 2700, 4050};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f36780m = {667, 2017, 3367, 4717};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f36781n = {1000, 2350, 3700, 5050};
    public static final a o = new a();

    /* renamed from: p, reason: collision with root package name */
    public static final b f36782p = new b();

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f36783d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f36784e;
    public final z0.b f;

    /* renamed from: g, reason: collision with root package name */
    public final g f36785g;

    /* renamed from: h, reason: collision with root package name */
    public int f36786h;

    /* renamed from: i, reason: collision with root package name */
    public float f36787i;

    /* renamed from: j, reason: collision with root package name */
    public float f36788j;

    /* renamed from: k, reason: collision with root package name */
    public n1.c f36789k;

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    public class a extends Property<f, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(f fVar) {
            return Float.valueOf(fVar.f36787i);
        }

        @Override // android.util.Property
        public final void set(f fVar, Float f) {
            z0.b bVar;
            f fVar2 = fVar;
            float floatValue = f.floatValue();
            fVar2.f36787i = floatValue;
            int i10 = (int) (5400.0f * floatValue);
            float[] fArr = (float[]) fVar2.f36805b;
            float f10 = floatValue * 1520.0f;
            fArr[0] = (-20.0f) + f10;
            fArr[1] = f10;
            int i11 = 0;
            while (true) {
                bVar = fVar2.f;
                if (i11 >= 4) {
                    break;
                }
                float f11 = 667;
                fArr[1] = (bVar.getInterpolation((i10 - f.f36779l[i11]) / f11) * 250.0f) + fArr[1];
                fArr[0] = (bVar.getInterpolation((i10 - f.f36780m[i11]) / f11) * 250.0f) + fArr[0];
                i11++;
            }
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = ((f13 - f12) * fVar2.f36788j) + f12;
            fArr[0] = f14;
            fArr[0] = f14 / 360.0f;
            fArr[1] = f13 / 360.0f;
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    break;
                }
                float f15 = (i10 - f.f36781n[i12]) / 333;
                if (f15 >= gl.Code && f15 <= 1.0f) {
                    int i13 = i12 + fVar2.f36786h;
                    g gVar = fVar2.f36785g;
                    int[] iArr = gVar.f36771c;
                    int length = i13 % iArr.length;
                    int length2 = (length + 1) % iArr.length;
                    ((int[]) fVar2.f36806c)[0] = h6.b.a(bVar.getInterpolation(f15), Integer.valueOf(a0.a.C0(iArr[length], ((n) fVar2.f36804a).B)), Integer.valueOf(a0.a.C0(gVar.f36771c[length2], ((n) fVar2.f36804a).B))).intValue();
                    break;
                }
                i12++;
            }
            ((n) fVar2.f36804a).invalidateSelf();
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    public class b extends Property<f, Float> {
        public b() {
            super(Float.class, "completeEndFraction");
        }

        @Override // android.util.Property
        public final Float get(f fVar) {
            return Float.valueOf(fVar.f36788j);
        }

        @Override // android.util.Property
        public final void set(f fVar, Float f) {
            fVar.f36788j = f.floatValue();
        }
    }

    public f(g gVar) {
        super(1);
        this.f36786h = 0;
        this.f36789k = null;
        this.f36785g = gVar;
        this.f = new z0.b();
    }

    @Override // y6.m
    public final void c() {
        ObjectAnimator objectAnimator = this.f36783d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // y6.m
    public final void e() {
        j();
    }

    @Override // y6.m
    public final void f(BaseProgressIndicator.c cVar) {
        this.f36789k = cVar;
    }

    @Override // y6.m
    public final void g() {
        ObjectAnimator objectAnimator = this.f36784e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((n) this.f36804a).isVisible()) {
                this.f36784e.start();
            } else {
                c();
            }
        }
    }

    @Override // y6.m
    public final void h() {
        if (this.f36783d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, o, gl.Code, 1.0f);
            this.f36783d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f36783d.setInterpolator(null);
            this.f36783d.setRepeatCount(-1);
            this.f36783d.addListener(new d(this));
        }
        if (this.f36784e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f36782p, gl.Code, 1.0f);
            this.f36784e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f36784e.setInterpolator(this.f);
            this.f36784e.addListener(new e(this));
        }
        j();
        this.f36783d.start();
    }

    @Override // y6.m
    public final void i() {
        this.f36789k = null;
    }

    public final void j() {
        this.f36786h = 0;
        ((int[]) this.f36806c)[0] = a0.a.C0(this.f36785g.f36771c[0], ((n) this.f36804a).B);
        this.f36788j = gl.Code;
    }
}
