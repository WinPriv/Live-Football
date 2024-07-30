package g2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import r2.c;

/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public final class a0 extends Drawable implements Drawable.Callback, Animatable {
    public String A;
    public k2.a B;
    public Map<String, Typeface> C;
    public String D;
    public boolean E;
    public boolean F;
    public boolean G;
    public o2.c H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public j0 M;
    public boolean N;
    public final Matrix O;
    public Bitmap P;
    public Canvas Q;
    public Rect R;
    public RectF S;
    public h2.a T;
    public Rect U;
    public Rect V;
    public RectF W;
    public RectF X;
    public Matrix Y;
    public Matrix Z;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f28356c0;

    /* renamed from: s, reason: collision with root package name */
    public h f28357s;

    /* renamed from: t, reason: collision with root package name */
    public final s2.d f28358t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f28359u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f28360v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f28361w;

    /* renamed from: x, reason: collision with root package name */
    public int f28362x;
    public final ArrayList<b> y;

    /* renamed from: z, reason: collision with root package name */
    public k2.b f28363z;

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            a0 a0Var = a0.this;
            o2.c cVar = a0Var.H;
            if (cVar != null) {
                s2.d dVar = a0Var.f28358t;
                h hVar = dVar.D;
                if (hVar == null) {
                    f = gl.Code;
                } else {
                    float f10 = dVar.f35108z;
                    float f11 = hVar.f28415k;
                    f = (f10 - f11) / (hVar.f28416l - f11);
                }
                cVar.t(f);
            }
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public interface b {
        void run();
    }

    public a0() {
        s2.d dVar = new s2.d();
        this.f28358t = dVar;
        this.f28359u = true;
        this.f28360v = false;
        this.f28361w = false;
        this.f28362x = 1;
        this.y = new ArrayList<>();
        a aVar = new a();
        this.F = false;
        this.G = true;
        this.I = com.anythink.expressad.exoplayer.k.p.f9095b;
        this.M = j0.AUTOMATIC;
        this.N = false;
        this.O = new Matrix();
        this.f28356c0 = false;
        dVar.addUpdateListener(aVar);
    }

    public static void f(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final <T> void a(final l2.e eVar, final T t10, final t2.c cVar) {
        float f;
        o2.c cVar2 = this.H;
        if (cVar2 == null) {
            this.y.add(new b() { // from class: g2.y
                @Override // g2.a0.b
                public final void run() {
                    a0.this.a(eVar, t10, cVar);
                }
            });
            return;
        }
        boolean z10 = true;
        if (eVar == l2.e.f32341c) {
            cVar2.g(cVar, t10);
        } else {
            l2.f fVar = eVar.f32343b;
            if (fVar != null) {
                fVar.g(cVar, t10);
            } else {
                ArrayList arrayList = new ArrayList();
                this.H.e(eVar, 0, arrayList, new l2.e(new String[0]));
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((l2.e) arrayList.get(i10)).f32343b.g(cVar, t10);
                }
                z10 = true ^ arrayList.isEmpty();
            }
        }
        if (z10) {
            invalidateSelf();
            if (t10 == e0.E) {
                s2.d dVar = this.f28358t;
                h hVar = dVar.D;
                if (hVar == null) {
                    f = gl.Code;
                } else {
                    float f10 = dVar.f35108z;
                    float f11 = hVar.f28415k;
                    f = (f10 - f11) / (hVar.f28416l - f11);
                }
                u(f);
            }
        }
    }

    public final boolean b() {
        if (!this.f28359u && !this.f28360v) {
            return false;
        }
        return true;
    }

    public final void c() {
        h hVar = this.f28357s;
        if (hVar == null) {
            return;
        }
        c.a aVar = q2.v.f34614a;
        Rect rect = hVar.f28414j;
        o2.c cVar = new o2.c(this, new o2.e(Collections.emptyList(), hVar, "__container", -1L, 1, -1L, null, Collections.emptyList(), new m2.h(), 0, 0, 0, gl.Code, gl.Code, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null), hVar.f28413i, hVar);
        this.H = cVar;
        if (this.K) {
            cVar.s(true);
        }
        this.H.H = this.G;
    }

    public final void d() {
        s2.d dVar = this.f28358t;
        if (dVar.E) {
            dVar.cancel();
            if (!isVisible()) {
                this.f28362x = 1;
            }
        }
        this.f28357s = null;
        this.H = null;
        this.f28363z = null;
        dVar.D = null;
        dVar.B = -2.1474836E9f;
        dVar.C = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f28361w) {
            try {
                if (this.N) {
                    k(canvas, this.H);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused) {
                s2.c.f35104a.getClass();
            }
        } else if (this.N) {
            k(canvas, this.H);
        } else {
            g(canvas);
        }
        this.f28356c0 = false;
        androidx.activity.n.s0();
    }

    public final void e() {
        h hVar = this.f28357s;
        if (hVar == null) {
            return;
        }
        j0 j0Var = this.M;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = hVar.f28418n;
        int i11 = hVar.o;
        int ordinal = j0Var.ordinal();
        boolean z11 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z10 && i10 < 28) || i11 > 4 || i10 <= 25))) {
            z11 = true;
        }
        this.N = z11;
    }

    public final void g(Canvas canvas) {
        o2.c cVar = this.H;
        h hVar = this.f28357s;
        if (cVar != null && hVar != null) {
            Matrix matrix = this.O;
            matrix.reset();
            if (!getBounds().isEmpty()) {
                matrix.preScale(r3.width() / hVar.f28414j.width(), r3.height() / hVar.f28414j.height());
                matrix.preTranslate(r3.left, r3.top);
            }
            cVar.h(canvas, matrix, this.I);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.I;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        h hVar = this.f28357s;
        if (hVar == null) {
            return -1;
        }
        return hVar.f28414j.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        h hVar = this.f28357s;
        if (hVar == null) {
            return -1;
        }
        return hVar.f28414j.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final k2.a h() {
        if (getCallback() == null) {
            return null;
        }
        if (this.B == null) {
            k2.a aVar = new k2.a(getCallback());
            this.B = aVar;
            String str = this.D;
            if (str != null) {
                aVar.f30307e = str;
            }
        }
        return this.B;
    }

    public final void i() {
        this.y.clear();
        s2.d dVar = this.f28358t;
        dVar.f(true);
        Iterator it = dVar.f35102u.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(dVar);
        }
        if (!isVisible()) {
            this.f28362x = 1;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f28356c0) {
            return;
        }
        this.f28356c0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        s2.d dVar = this.f28358t;
        if (dVar == null) {
            return false;
        }
        return dVar.E;
    }

    public final void j() {
        float d10;
        float c10;
        if (this.H == null) {
            this.y.add(new u(this, 1));
            return;
        }
        e();
        boolean b10 = b();
        s2.d dVar = this.f28358t;
        if (b10 || dVar.getRepeatCount() == 0) {
            if (isVisible()) {
                dVar.E = true;
                boolean e10 = dVar.e();
                Iterator it = dVar.f35101t.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(dVar, e10);
                    } else {
                        animatorListener.onAnimationStart(dVar);
                    }
                }
                if (dVar.e()) {
                    d10 = dVar.c();
                } else {
                    d10 = dVar.d();
                }
                dVar.g((int) d10);
                dVar.f35107x = 0L;
                dVar.A = 0;
                if (dVar.E) {
                    dVar.f(false);
                    Choreographer.getInstance().postFrameCallback(dVar);
                }
                this.f28362x = 1;
            } else {
                this.f28362x = 2;
            }
        }
        if (!b()) {
            if (dVar.f35105v < gl.Code) {
                c10 = dVar.d();
            } else {
                c10 = dVar.c();
            }
            m((int) c10);
            dVar.f(true);
            dVar.a(dVar.e());
            if (!isVisible()) {
                this.f28362x = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.graphics.Canvas r10, o2.c r11) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.a0.k(android.graphics.Canvas, o2.c):void");
    }

    public final void l() {
        float c10;
        if (this.H == null) {
            this.y.add(new u(this, 0));
            return;
        }
        e();
        boolean b10 = b();
        s2.d dVar = this.f28358t;
        if (b10 || dVar.getRepeatCount() == 0) {
            if (isVisible()) {
                dVar.E = true;
                dVar.f(false);
                Choreographer.getInstance().postFrameCallback(dVar);
                dVar.f35107x = 0L;
                if (dVar.e() && dVar.f35108z == dVar.d()) {
                    dVar.g(dVar.c());
                } else if (!dVar.e() && dVar.f35108z == dVar.c()) {
                    dVar.g(dVar.d());
                }
                Iterator it = dVar.f35102u.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(dVar);
                }
                this.f28362x = 1;
            } else {
                this.f28362x = 3;
            }
        }
        if (!b()) {
            if (dVar.f35105v < gl.Code) {
                c10 = dVar.d();
            } else {
                c10 = dVar.c();
            }
            m((int) c10);
            dVar.f(true);
            dVar.a(dVar.e());
            if (!isVisible()) {
                this.f28362x = 1;
            }
        }
    }

    public final void m(int i10) {
        if (this.f28357s == null) {
            this.y.add(new r(this, i10, 1));
        } else {
            this.f28358t.g(i10);
        }
    }

    public final void n(final int i10) {
        if (this.f28357s == null) {
            this.y.add(new b() { // from class: g2.t
                @Override // g2.a0.b
                public final void run() {
                    a0.this.n(i10);
                }
            });
            return;
        }
        s2.d dVar = this.f28358t;
        dVar.h(dVar.B, i10 + 0.99f);
    }

    public final void o(final String str) {
        h hVar = this.f28357s;
        if (hVar == null) {
            this.y.add(new b() { // from class: g2.v
                @Override // g2.a0.b
                public final void run() {
                    a0.this.o(str);
                }
            });
            return;
        }
        l2.h c10 = hVar.c(str);
        if (c10 != null) {
            n((int) (c10.f32347b + c10.f32348c));
            return;
        }
        throw new IllegalArgumentException(a3.k.l("Cannot find marker with name ", str, "."));
    }

    public final void p(final float f) {
        h hVar = this.f28357s;
        if (hVar == null) {
            this.y.add(new b() { // from class: g2.x
                @Override // g2.a0.b
                public final void run() {
                    a0.this.p(f);
                }
            });
            return;
        }
        float f10 = hVar.f28415k;
        float f11 = hVar.f28416l;
        PointF pointF = s2.f.f35110a;
        float d10 = a3.k.d(f11, f10, f, f10);
        s2.d dVar = this.f28358t;
        dVar.h(dVar.B, d10);
    }

    public final void q(String str) {
        h hVar = this.f28357s;
        ArrayList<b> arrayList = this.y;
        if (hVar == null) {
            arrayList.add(new w(this, str, 1));
            return;
        }
        l2.h c10 = hVar.c(str);
        if (c10 != null) {
            int i10 = (int) c10.f32347b;
            int i11 = ((int) c10.f32348c) + i10;
            if (this.f28357s == null) {
                arrayList.add(new z(this, i10, i11));
                return;
            } else {
                this.f28358t.h(i10, i11 + 0.99f);
                return;
            }
        }
        throw new IllegalArgumentException(a3.k.l("Cannot find marker with name ", str, "."));
    }

    public final void r(int i10) {
        if (this.f28357s == null) {
            this.y.add(new r(this, i10, 0));
        } else {
            this.f28358t.h(i10, (int) r0.C);
        }
    }

    public final void s(String str) {
        h hVar = this.f28357s;
        if (hVar == null) {
            this.y.add(new w(this, str, 0));
            return;
        }
        l2.h c10 = hVar.c(str);
        if (c10 != null) {
            r((int) c10.f32347b);
            return;
        }
        throw new IllegalArgumentException(a3.k.l("Cannot find marker with name ", str, "."));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.I = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        s2.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            int i10 = this.f28362x;
            if (i10 == 2) {
                j();
            } else if (i10 == 3) {
                l();
            }
        } else if (this.f28358t.E) {
            i();
            this.f28362x = 3;
        } else if (!z12) {
            this.f28362x = 1;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        j();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.y.clear();
        s2.d dVar = this.f28358t;
        dVar.f(true);
        dVar.a(dVar.e());
        if (!isVisible()) {
            this.f28362x = 1;
        }
    }

    public final void t(final float f) {
        h hVar = this.f28357s;
        if (hVar == null) {
            this.y.add(new b() { // from class: g2.s
                @Override // g2.a0.b
                public final void run() {
                    a0.this.t(f);
                }
            });
            return;
        }
        float f10 = hVar.f28415k;
        float f11 = hVar.f28416l;
        PointF pointF = s2.f.f35110a;
        r((int) a3.k.d(f11, f10, f, f10));
    }

    public final void u(final float f) {
        h hVar = this.f28357s;
        if (hVar == null) {
            this.y.add(new b() { // from class: g2.q
                @Override // g2.a0.b
                public final void run() {
                    a0.this.u(f);
                }
            });
            return;
        }
        float f10 = hVar.f28415k;
        float f11 = hVar.f28416l;
        PointF pointF = s2.f.f35110a;
        this.f28358t.g(a3.k.d(f11, f10, f, f10));
        androidx.activity.n.s0();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
