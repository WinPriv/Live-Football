package r0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.huawei.hms.ads.gl;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int I = ViewConfiguration.getTapTimeout();
    public final float[] A;
    public final float[] B;
    public final float[] C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* renamed from: s, reason: collision with root package name */
    public final C0467a f34777s;

    /* renamed from: t, reason: collision with root package name */
    public final AccelerateInterpolator f34778t;

    /* renamed from: u, reason: collision with root package name */
    public final View f34779u;

    /* renamed from: v, reason: collision with root package name */
    public b f34780v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f34781w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f34782x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f34783z;

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: r0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0467a {

        /* renamed from: a, reason: collision with root package name */
        public int f34784a;

        /* renamed from: b, reason: collision with root package name */
        public int f34785b;

        /* renamed from: c, reason: collision with root package name */
        public float f34786c;

        /* renamed from: d, reason: collision with root package name */
        public float f34787d;

        /* renamed from: h, reason: collision with root package name */
        public float f34790h;

        /* renamed from: i, reason: collision with root package name */
        public int f34791i;

        /* renamed from: e, reason: collision with root package name */
        public long f34788e = Long.MIN_VALUE;

        /* renamed from: g, reason: collision with root package name */
        public long f34789g = -1;
        public long f = 0;

        public final float a(long j10) {
            long j11 = this.f34788e;
            if (j10 < j11) {
                return gl.Code;
            }
            long j12 = this.f34789g;
            if (j12 >= 0 && j10 >= j12) {
                float f = this.f34790h;
                return (a.b(((float) (j10 - j12)) / this.f34791i, gl.Code, 1.0f) * f) + (1.0f - f);
            }
            return a.b(((float) (j10 - j11)) / this.f34784a, gl.Code, 1.0f) * 0.5f;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            a aVar = a.this;
            if (!aVar.G) {
                return;
            }
            boolean z11 = aVar.E;
            C0467a c0467a = aVar.f34777s;
            if (z11) {
                aVar.E = false;
                c0467a.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c0467a.f34788e = currentAnimationTimeMillis;
                c0467a.f34789g = -1L;
                c0467a.f = currentAnimationTimeMillis;
                c0467a.f34790h = 0.5f;
            }
            if (c0467a.f34789g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0467a.f34789g + c0467a.f34791i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && aVar.e()) {
                boolean z12 = aVar.F;
                View view = aVar.f34779u;
                if (z12) {
                    aVar.F = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, gl.Code, gl.Code, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0467a.f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = c0467a.a(currentAnimationTimeMillis2);
                    long j10 = currentAnimationTimeMillis2 - c0467a.f;
                    c0467a.f = currentAnimationTimeMillis2;
                    g.b(((f) aVar).J, (int) (((float) j10) * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * c0467a.f34787d));
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    c0.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            aVar.G = false;
        }
    }

    public a(View view) {
        C0467a c0467a = new C0467a();
        this.f34777s = c0467a;
        this.f34778t = new AccelerateInterpolator();
        float[] fArr = {gl.Code, gl.Code};
        this.f34781w = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f34782x = fArr2;
        float[] fArr3 = {gl.Code, gl.Code};
        this.A = fArr3;
        float[] fArr4 = {gl.Code, gl.Code};
        this.B = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.C = fArr5;
        this.f34779u = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.y = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f34783z = I;
        c0467a.f34784a = 500;
        c0467a.f34785b = 500;
    }

    public static float b(float f, float f10, float f11) {
        if (f > f11) {
            return f11;
        }
        if (f < f10) {
            return f10;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f34781w
            r0 = r0[r4]
            float[] r1 = r3.f34782x
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f34778t
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.A
            r0 = r0[r4]
            float[] r1 = r3.B
            r1 = r1[r4]
            float[] r2 = r3.C
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.a.a(int, float, float, float):float");
    }

    public final float c(float f, float f10) {
        if (f10 == gl.Code) {
            return gl.Code;
        }
        int i10 = this.y;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2 && f < gl.Code) {
                return f / (-f10);
            }
        } else if (f < f10) {
            if (f >= gl.Code) {
                return 1.0f - (f / f10);
            }
            if (this.G && i10 == 1) {
                return 1.0f;
            }
        }
        return gl.Code;
    }

    public final void d() {
        int i10 = 0;
        if (this.E) {
            this.G = false;
            return;
        }
        C0467a c0467a = this.f34777s;
        c0467a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - c0467a.f34788e);
        int i12 = c0467a.f34785b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c0467a.f34791i = i10;
        c0467a.f34790h = c0467a.a(currentAnimationTimeMillis);
        c0467a.f34789g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r9 = this;
            r0.a$a r0 = r9.f34777s
            float r1 = r0.f34787d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f34786c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 0
            if (r1 == 0) goto L55
            r3 = r9
            r0.f r3 = (r0.f) r3
            android.widget.ListView r3 = r3.J
            int r4 = r3.getCount()
            r5 = 1
            if (r4 != 0) goto L23
        L21:
            r1 = r2
            goto L51
        L23:
            int r6 = r3.getChildCount()
            int r7 = r3.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r4) goto L50
            int r6 = r6 - r5
            android.view.View r1 = r3.getChildAt(r6)
            int r1 = r1.getBottom()
            int r3 = r3.getHeight()
            if (r1 > r3) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r3.getChildAt(r2)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = r5
        L51:
            if (r1 != 0) goto L54
            goto L55
        L54:
            r2 = r5
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.a.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.H
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.F = r2
            r7.D = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f34779u
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            r0.a$a r9 = r7.f34777s
            r9.f34786c = r0
            r9.f34787d = r8
            boolean r8 = r7.G
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            r0.a$b r8 = r7.f34780v
            if (r8 != 0) goto L5f
            r0.a$b r8 = new r0.a$b
            r8.<init>()
            r7.f34780v = r8
        L5f:
            r7.G = r2
            r7.E = r2
            boolean r8 = r7.D
            if (r8 != 0) goto L74
            int r8 = r7.f34783z
            if (r8 <= 0) goto L74
            r0.a$b r9 = r7.f34780v
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, n0.l0> r8 = n0.c0.f33054a
            n0.c0.d.n(r4, r9, r5)
            goto L79
        L74:
            r0.a$b r8 = r7.f34780v
            r8.run()
        L79:
            r7.D = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
