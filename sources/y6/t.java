package y6;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.util.Arrays;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class t extends m {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f36819l = {533, 567, 850, 750};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f36820m = {1267, 1000, 333, 0};

    /* renamed from: n, reason: collision with root package name */
    public static final a f36821n = new a();

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f36822d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f36823e;
    public final Interpolator[] f;

    /* renamed from: g, reason: collision with root package name */
    public final u f36824g;

    /* renamed from: h, reason: collision with root package name */
    public int f36825h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f36826i;

    /* renamed from: j, reason: collision with root package name */
    public float f36827j;

    /* renamed from: k, reason: collision with root package name */
    public n1.c f36828k;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    public class a extends Property<t, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(t tVar) {
            return Float.valueOf(tVar.f36827j);
        }

        @Override // android.util.Property
        public final void set(t tVar, Float f) {
            t tVar2 = tVar;
            float floatValue = f.floatValue();
            tVar2.f36827j = floatValue;
            int i10 = (int) (floatValue * 1800.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                ((float[]) tVar2.f36805b)[i11] = Math.max(gl.Code, Math.min(1.0f, tVar2.f[i11].getInterpolation((i10 - t.f36820m[i11]) / t.f36819l[i11])));
            }
            if (tVar2.f36826i) {
                Arrays.fill((int[]) tVar2.f36806c, a0.a.C0(tVar2.f36824g.f36771c[tVar2.f36825h], ((n) tVar2.f36804a).B));
                tVar2.f36826i = false;
            }
            ((n) tVar2.f36804a).invalidateSelf();
        }
    }

    public t(Context context, u uVar) {
        super(2);
        this.f36825h = 0;
        this.f36828k = null;
        this.f36824g = uVar;
        this.f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // y6.m
    public final void c() {
        ObjectAnimator objectAnimator = this.f36822d;
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
        this.f36828k = cVar;
    }

    @Override // y6.m
    public final void g() {
        ObjectAnimator objectAnimator = this.f36823e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            c();
            if (((n) this.f36804a).isVisible()) {
                this.f36823e.setFloatValues(this.f36827j, 1.0f);
                this.f36823e.setDuration((1.0f - this.f36827j) * 1800.0f);
                this.f36823e.start();
            }
        }
    }

    @Override // y6.m
    public final void h() {
        ObjectAnimator objectAnimator = this.f36822d;
        a aVar = f36821n;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, aVar, gl.Code, 1.0f);
            this.f36822d = ofFloat;
            ofFloat.setDuration(com.anythink.expressad.d.a.b.aC);
            this.f36822d.setInterpolator(null);
            this.f36822d.setRepeatCount(-1);
            this.f36822d.addListener(new r(this));
        }
        if (this.f36823e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f);
            this.f36823e = ofFloat2;
            ofFloat2.setDuration(com.anythink.expressad.d.a.b.aC);
            this.f36823e.setInterpolator(null);
            this.f36823e.addListener(new s(this));
        }
        j();
        this.f36822d.start();
    }

    @Override // y6.m
    public final void i() {
        this.f36828k = null;
    }

    public final void j() {
        this.f36825h = 0;
        int C0 = a0.a.C0(this.f36824g.f36771c[0], ((n) this.f36804a).B);
        int[] iArr = (int[]) this.f36806c;
        iArr[0] = C0;
        iArr[1] = C0;
    }
}
