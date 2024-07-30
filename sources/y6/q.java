package y6;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.huawei.hms.ads.gl;
import java.util.Arrays;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class q extends m {

    /* renamed from: j, reason: collision with root package name */
    public static final a f36811j = new a();

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f36812d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.b f36813e;
    public final u f;

    /* renamed from: g, reason: collision with root package name */
    public int f36814g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f36815h;

    /* renamed from: i, reason: collision with root package name */
    public float f36816i;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    public class a extends Property<q, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(q qVar) {
            return Float.valueOf(qVar.f36816i);
        }

        @Override // android.util.Property
        public final void set(q qVar, Float f) {
            q qVar2 = qVar;
            qVar2.f36816i = f.floatValue();
            float[] fArr = (float[]) qVar2.f36805b;
            fArr[0] = 0.0f;
            float f10 = (((int) (r8 * 333.0f)) - 0) / 667;
            z0.b bVar = qVar2.f36813e;
            float interpolation = bVar.getInterpolation(f10);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float interpolation2 = bVar.getInterpolation(f10 + 0.49925038f);
            fArr[4] = interpolation2;
            fArr[3] = interpolation2;
            fArr[5] = 1.0f;
            if (qVar2.f36815h && interpolation2 < 1.0f) {
                int[] iArr = (int[]) qVar2.f36806c;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = a0.a.C0(qVar2.f.f36771c[qVar2.f36814g], ((n) qVar2.f36804a).B);
                qVar2.f36815h = false;
            }
            ((n) qVar2.f36804a).invalidateSelf();
        }
    }

    public q(u uVar) {
        super(3);
        this.f36814g = 1;
        this.f = uVar;
        this.f36813e = new z0.b();
    }

    @Override // y6.m
    public final void c() {
        ObjectAnimator objectAnimator = this.f36812d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // y6.m
    public final void e() {
        j();
    }

    @Override // y6.m
    public final void h() {
        if (this.f36812d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f36811j, gl.Code, 1.0f);
            this.f36812d = ofFloat;
            ofFloat.setDuration(333L);
            this.f36812d.setInterpolator(null);
            this.f36812d.setRepeatCount(-1);
            this.f36812d.addListener(new p(this));
        }
        j();
        this.f36812d.start();
    }

    public final void j() {
        this.f36815h = true;
        this.f36814g = 1;
        Arrays.fill((int[]) this.f36806c, a0.a.C0(this.f.f36771c[0], ((n) this.f36804a).B));
    }

    @Override // y6.m
    public final void g() {
    }

    @Override // y6.m
    public final void i() {
    }

    @Override // y6.m
    public final void f(BaseProgressIndicator.c cVar) {
    }
}
