package n0;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.c0;
import n0.d;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f33098b;

    /* renamed from: a, reason: collision with root package name */
    public final k f33099a;

    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f33100a;

        /* renamed from: b, reason: collision with root package name */
        public static final Field f33101b;

        /* renamed from: c, reason: collision with root package name */
        public static final Field f33102c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f33103d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f33100a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f33101b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f33102c = declaredField3;
                declaredField3.setAccessible(true);
                f33103d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        public d() {
        }

        public d(q0 q0Var) {
            super(q0Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public e() {
            this(new q0());
        }

        public q0 b() {
            throw null;
        }

        public void c(f0.b bVar) {
            throw null;
        }

        public void d(f0.b bVar) {
            throw null;
        }

        public e(q0 q0Var) {
        }

        public final void a() {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class f extends k {

        /* renamed from: h, reason: collision with root package name */
        public static boolean f33110h = false;

        /* renamed from: i, reason: collision with root package name */
        public static Method f33111i;

        /* renamed from: j, reason: collision with root package name */
        public static Class<?> f33112j;

        /* renamed from: k, reason: collision with root package name */
        public static Field f33113k;

        /* renamed from: l, reason: collision with root package name */
        public static Field f33114l;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f33115c;

        /* renamed from: d, reason: collision with root package name */
        public f0.b[] f33116d;

        /* renamed from: e, reason: collision with root package name */
        public f0.b f33117e;
        public q0 f;

        /* renamed from: g, reason: collision with root package name */
        public f0.b f33118g;

        public f(q0 q0Var, WindowInsets windowInsets) {
            super(q0Var);
            this.f33117e = null;
            this.f33115c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private f0.b r(int i10, boolean z10) {
            f0.b bVar = f0.b.f27898e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    f0.b s10 = s(i11, z10);
                    bVar = f0.b.a(Math.max(bVar.f27899a, s10.f27899a), Math.max(bVar.f27900b, s10.f27900b), Math.max(bVar.f27901c, s10.f27901c), Math.max(bVar.f27902d, s10.f27902d));
                }
            }
            return bVar;
        }

        private f0.b t() {
            q0 q0Var = this.f;
            if (q0Var != null) {
                return q0Var.f33099a.h();
            }
            return f0.b.f27898e;
        }

        private f0.b u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f33110h) {
                    v();
                }
                Method method = f33111i;
                if (method != null && f33112j != null && f33113k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f33113k.get(f33114l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return f0.b.a(rect.left, rect.top, rect.right, rect.bottom);
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void v() {
            try {
                f33111i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f33112j = cls;
                f33113k = cls.getDeclaredField("mVisibleInsets");
                f33114l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f33113k.setAccessible(true);
                f33114l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f33110h = true;
        }

        @Override // n0.q0.k
        public void d(View view) {
            f0.b u2 = u(view);
            if (u2 == null) {
                u2 = f0.b.f27898e;
            }
            w(u2);
        }

        @Override // n0.q0.k
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f33118g, ((f) obj).f33118g);
        }

        @Override // n0.q0.k
        public f0.b f(int i10) {
            return r(i10, false);
        }

        @Override // n0.q0.k
        public final f0.b j() {
            if (this.f33117e == null) {
                WindowInsets windowInsets = this.f33115c;
                this.f33117e = f0.b.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f33117e;
        }

        @Override // n0.q0.k
        public q0 l(int i10, int i11, int i12, int i13) {
            e bVar;
            q0 g6 = q0.g(this.f33115c, null);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 30) {
                bVar = new d(g6);
            } else if (i14 >= 29) {
                bVar = new c(g6);
            } else {
                bVar = new b(g6);
            }
            bVar.d(q0.e(j(), i10, i11, i12, i13));
            bVar.c(q0.e(h(), i10, i11, i12, i13));
            return bVar.b();
        }

        @Override // n0.q0.k
        public boolean n() {
            return this.f33115c.isRound();
        }

        @Override // n0.q0.k
        public void o(f0.b[] bVarArr) {
            this.f33116d = bVarArr;
        }

        @Override // n0.q0.k
        public void p(q0 q0Var) {
            this.f = q0Var;
        }

        public f0.b s(int i10, boolean z10) {
            int i11;
            n0.d e10;
            int i12;
            int i13;
            int i14;
            int i15 = 0;
            if (i10 != 1) {
                f0.b bVar = null;
                if (i10 != 2) {
                    f0.b bVar2 = f0.b.f27898e;
                    if (i10 != 8) {
                        if (i10 != 16) {
                            if (i10 != 32) {
                                if (i10 != 64) {
                                    if (i10 != 128) {
                                        return bVar2;
                                    }
                                    q0 q0Var = this.f;
                                    if (q0Var != null) {
                                        e10 = q0Var.f33099a.e();
                                    } else {
                                        e10 = e();
                                    }
                                    if (e10 != null) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        DisplayCutout displayCutout = e10.f33072a;
                                        if (i16 >= 28) {
                                            i12 = d.a.d(displayCutout);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i13 = d.a.f(displayCutout);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i14 = d.a.e(displayCutout);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i15 = d.a.c(displayCutout);
                                        }
                                        return f0.b.a(i12, i13, i14, i15);
                                    }
                                    return bVar2;
                                }
                                return k();
                            }
                            return g();
                        }
                        return i();
                    }
                    f0.b[] bVarArr = this.f33116d;
                    if (bVarArr != null) {
                        bVar = bVarArr[3];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    f0.b j10 = j();
                    f0.b t10 = t();
                    int i17 = j10.f27902d;
                    if (i17 > t10.f27902d) {
                        return f0.b.a(0, 0, 0, i17);
                    }
                    f0.b bVar3 = this.f33118g;
                    if (bVar3 != null && !bVar3.equals(bVar2) && (i11 = this.f33118g.f27902d) > t10.f27902d) {
                        return f0.b.a(0, 0, 0, i11);
                    }
                    return bVar2;
                }
                if (z10) {
                    f0.b t11 = t();
                    f0.b h10 = h();
                    return f0.b.a(Math.max(t11.f27899a, h10.f27899a), 0, Math.max(t11.f27901c, h10.f27901c), Math.max(t11.f27902d, h10.f27902d));
                }
                f0.b j11 = j();
                q0 q0Var2 = this.f;
                if (q0Var2 != null) {
                    bVar = q0Var2.f33099a.h();
                }
                int i18 = j11.f27902d;
                if (bVar != null) {
                    i18 = Math.min(i18, bVar.f27902d);
                }
                return f0.b.a(j11.f27899a, 0, j11.f27901c, i18);
            }
            if (z10) {
                return f0.b.a(0, Math.max(t().f27900b, j().f27900b), 0, 0);
            }
            return f0.b.a(0, j().f27900b, 0, 0);
        }

        public void w(f0.b bVar) {
            this.f33118g = bVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class g extends f {

        /* renamed from: m, reason: collision with root package name */
        public f0.b f33119m;

        public g(q0 q0Var, WindowInsets windowInsets) {
            super(q0Var, windowInsets);
            this.f33119m = null;
        }

        @Override // n0.q0.k
        public q0 b() {
            return q0.g(this.f33115c.consumeStableInsets(), null);
        }

        @Override // n0.q0.k
        public q0 c() {
            return q0.g(this.f33115c.consumeSystemWindowInsets(), null);
        }

        @Override // n0.q0.k
        public final f0.b h() {
            if (this.f33119m == null) {
                WindowInsets windowInsets = this.f33115c;
                this.f33119m = f0.b.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f33119m;
        }

        @Override // n0.q0.k
        public boolean m() {
            return this.f33115c.isConsumed();
        }

        @Override // n0.q0.k
        public void q(f0.b bVar) {
            this.f33119m = bVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class h extends g {
        public h(q0 q0Var, WindowInsets windowInsets) {
            super(q0Var, windowInsets);
        }

        @Override // n0.q0.k
        public q0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f33115c.consumeDisplayCutout();
            return q0.g(consumeDisplayCutout, null);
        }

        @Override // n0.q0.k
        public n0.d e() {
            DisplayCutout displayCutout;
            displayCutout = this.f33115c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new n0.d(displayCutout);
        }

        @Override // n0.q0.f, n0.q0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (Objects.equals(this.f33115c, hVar.f33115c) && Objects.equals(this.f33118g, hVar.f33118g)) {
                return true;
            }
            return false;
        }

        @Override // n0.q0.k
        public int hashCode() {
            return this.f33115c.hashCode();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class l {
        public static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f33098b = j.f33122q;
        } else {
            f33098b = k.f33123b;
        }
    }

    public q0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f33099a = new j(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f33099a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f33099a = new h(this, windowInsets);
        } else {
            this.f33099a = new g(this, windowInsets);
        }
    }

    public static f0.b e(f0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f27899a - i10);
        int max2 = Math.max(0, bVar.f27900b - i11);
        int max3 = Math.max(0, bVar.f27901c - i12);
        int max4 = Math.max(0, bVar.f27902d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return bVar;
        }
        return f0.b.a(max, max2, max3, max4);
    }

    public static q0 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        q0 q0Var = new q0(windowInsets);
        if (view != null) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if (c0.g.b(view)) {
                q0 a10 = c0.j.a(view);
                k kVar = q0Var.f33099a;
                kVar.p(a10);
                kVar.d(view.getRootView());
            }
        }
        return q0Var;
    }

    @Deprecated
    public final int a() {
        return this.f33099a.j().f27902d;
    }

    @Deprecated
    public final int b() {
        return this.f33099a.j().f27899a;
    }

    @Deprecated
    public final int c() {
        return this.f33099a.j().f27901c;
    }

    @Deprecated
    public final int d() {
        return this.f33099a.j().f27900b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        return m0.b.a(this.f33099a, ((q0) obj).f33099a);
    }

    public final WindowInsets f() {
        k kVar = this.f33099a;
        if (kVar instanceof f) {
            return ((f) kVar).f33115c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f33099a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: c, reason: collision with root package name */
        public static Field f33104c = null;

        /* renamed from: d, reason: collision with root package name */
        public static boolean f33105d = false;

        /* renamed from: e, reason: collision with root package name */
        public static Constructor<WindowInsets> f33106e = null;
        public static boolean f = false;

        /* renamed from: a, reason: collision with root package name */
        public WindowInsets f33107a;

        /* renamed from: b, reason: collision with root package name */
        public f0.b f33108b;

        public b() {
            this.f33107a = e();
        }

        private static WindowInsets e() {
            if (!f33105d) {
                try {
                    f33104c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f33105d = true;
            }
            Field field = f33104c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f) {
                try {
                    f33106e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f = true;
            }
            Constructor<WindowInsets> constructor = f33106e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // n0.q0.e
        public q0 b() {
            a();
            q0 g6 = q0.g(this.f33107a, null);
            k kVar = g6.f33099a;
            kVar.o(null);
            kVar.q(this.f33108b);
            return g6;
        }

        @Override // n0.q0.e
        public void c(f0.b bVar) {
            this.f33108b = bVar;
        }

        @Override // n0.q0.e
        public void d(f0.b bVar) {
            WindowInsets windowInsets = this.f33107a;
            if (windowInsets != null) {
                this.f33107a = windowInsets.replaceSystemWindowInsets(bVar.f27899a, bVar.f27900b, bVar.f27901c, bVar.f27902d);
            }
        }

        public b(q0 q0Var) {
            super(q0Var);
            this.f33107a = q0Var.f();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsets.Builder f33109a;

        public c() {
            this.f33109a = new WindowInsets.Builder();
        }

        @Override // n0.q0.e
        public q0 b() {
            WindowInsets build;
            a();
            build = this.f33109a.build();
            q0 g6 = q0.g(build, null);
            g6.f33099a.o(null);
            return g6;
        }

        @Override // n0.q0.e
        public void c(f0.b bVar) {
            this.f33109a.setStableInsets(bVar.c());
        }

        @Override // n0.q0.e
        public void d(f0.b bVar) {
            this.f33109a.setSystemWindowInsets(bVar.c());
        }

        public c(q0 q0Var) {
            super(q0Var);
            WindowInsets.Builder builder;
            WindowInsets f = q0Var.f();
            if (f != null) {
                builder = new WindowInsets.Builder(f);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f33109a = builder;
        }
    }

    public q0() {
        this.f33099a = new k(this);
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class i extends h {

        /* renamed from: n, reason: collision with root package name */
        public f0.b f33120n;
        public f0.b o;

        /* renamed from: p, reason: collision with root package name */
        public f0.b f33121p;

        public i(q0 q0Var, WindowInsets windowInsets) {
            super(q0Var, windowInsets);
            this.f33120n = null;
            this.o = null;
            this.f33121p = null;
        }

        @Override // n0.q0.k
        public f0.b g() {
            Insets mandatorySystemGestureInsets;
            if (this.o == null) {
                mandatorySystemGestureInsets = this.f33115c.getMandatorySystemGestureInsets();
                this.o = f0.b.b(mandatorySystemGestureInsets);
            }
            return this.o;
        }

        @Override // n0.q0.k
        public f0.b i() {
            Insets systemGestureInsets;
            if (this.f33120n == null) {
                systemGestureInsets = this.f33115c.getSystemGestureInsets();
                this.f33120n = f0.b.b(systemGestureInsets);
            }
            return this.f33120n;
        }

        @Override // n0.q0.k
        public f0.b k() {
            Insets tappableElementInsets;
            if (this.f33121p == null) {
                tappableElementInsets = this.f33115c.getTappableElementInsets();
                this.f33121p = f0.b.b(tappableElementInsets);
            }
            return this.f33121p;
        }

        @Override // n0.q0.f, n0.q0.k
        public q0 l(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.f33115c.inset(i10, i11, i12, i13);
            return q0.g(inset, null);
        }

        @Override // n0.q0.g, n0.q0.k
        public void q(f0.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: q, reason: collision with root package name */
        public static final q0 f33122q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f33122q = q0.g(windowInsets, null);
        }

        public j(q0 q0Var, WindowInsets windowInsets) {
            super(q0Var, windowInsets);
        }

        @Override // n0.q0.f, n0.q0.k
        public f0.b f(int i10) {
            Insets insets;
            insets = this.f33115c.getInsets(l.a(i10));
            return f0.b.b(insets);
        }

        @Override // n0.q0.f, n0.q0.k
        public final void d(View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: b, reason: collision with root package name */
        public static final q0 f33123b;

        /* renamed from: a, reason: collision with root package name */
        public final q0 f33124a;

        static {
            e bVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                bVar = new d();
            } else if (i10 >= 29) {
                bVar = new c();
            } else {
                bVar = new b();
            }
            f33123b = bVar.b().f33099a.a().f33099a.b().f33099a.c();
        }

        public k(q0 q0Var) {
            this.f33124a = q0Var;
        }

        public q0 a() {
            return this.f33124a;
        }

        public q0 b() {
            return this.f33124a;
        }

        public q0 c() {
            return this.f33124a;
        }

        public n0.d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (n() == kVar.n() && m() == kVar.m() && m0.b.a(j(), kVar.j()) && m0.b.a(h(), kVar.h()) && m0.b.a(e(), kVar.e())) {
                return true;
            }
            return false;
        }

        public f0.b f(int i10) {
            return f0.b.f27898e;
        }

        public f0.b g() {
            return j();
        }

        public f0.b h() {
            return f0.b.f27898e;
        }

        public int hashCode() {
            return m0.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public f0.b i() {
            return j();
        }

        public f0.b j() {
            return f0.b.f27898e;
        }

        public f0.b k() {
            return j();
        }

        public q0 l(int i10, int i11, int i12, int i13) {
            return f33123b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void d(View view) {
        }

        public void o(f0.b[] bVarArr) {
        }

        public void p(q0 q0Var) {
        }

        public void q(f0.b bVar) {
        }
    }
}
