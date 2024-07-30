package p3;

import a3.o;
import a3.t;
import a3.x;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import e3.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import r3.a;
import t3.e;
import t3.l;
import u3.d;

/* compiled from: SingleRequest.java */
/* loaded from: classes.dex */
public final class i<R> implements d, q3.f, h {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public int A;
    public boolean B;
    public final RuntimeException C;

    /* renamed from: a, reason: collision with root package name */
    public final String f34250a;

    /* renamed from: b, reason: collision with root package name */
    public final d.a f34251b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34252c;

    /* renamed from: d, reason: collision with root package name */
    public final f<R> f34253d;

    /* renamed from: e, reason: collision with root package name */
    public final e f34254e;
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.h f34255g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f34256h;

    /* renamed from: i, reason: collision with root package name */
    public final Class<R> f34257i;

    /* renamed from: j, reason: collision with root package name */
    public final a<?> f34258j;

    /* renamed from: k, reason: collision with root package name */
    public final int f34259k;

    /* renamed from: l, reason: collision with root package name */
    public final int f34260l;

    /* renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.j f34261m;

    /* renamed from: n, reason: collision with root package name */
    public final q3.g<R> f34262n;
    public final List<f<R>> o;

    /* renamed from: p, reason: collision with root package name */
    public final r3.b<? super R> f34263p;

    /* renamed from: q, reason: collision with root package name */
    public final Executor f34264q;

    /* renamed from: r, reason: collision with root package name */
    public x<R> f34265r;

    /* renamed from: s, reason: collision with root package name */
    public o.d f34266s;

    /* renamed from: t, reason: collision with root package name */
    public long f34267t;

    /* renamed from: u, reason: collision with root package name */
    public volatile o f34268u;

    /* renamed from: v, reason: collision with root package name */
    public int f34269v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f34270w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f34271x;
    public Drawable y;

    /* renamed from: z, reason: collision with root package name */
    public int f34272z;

    public i(Context context, com.bumptech.glide.h hVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, com.bumptech.glide.j jVar, q3.g gVar, ArrayList arrayList, e eVar, o oVar, a.C0469a c0469a) {
        String str;
        e.a aVar2 = t3.e.f35414a;
        if (D) {
            str = String.valueOf(hashCode());
        } else {
            str = null;
        }
        this.f34250a = str;
        this.f34251b = new d.a();
        this.f34252c = obj;
        this.f = context;
        this.f34255g = hVar;
        this.f34256h = obj2;
        this.f34257i = cls;
        this.f34258j = aVar;
        this.f34259k = i10;
        this.f34260l = i11;
        this.f34261m = jVar;
        this.f34262n = gVar;
        this.f34253d = null;
        this.o = arrayList;
        this.f34254e = eVar;
        this.f34268u = oVar;
        this.f34263p = c0469a;
        this.f34264q = aVar2;
        this.f34269v = 1;
        if (this.C == null && hVar.f19730h.f19733a.containsKey(com.bumptech.glide.e.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // p3.d
    public final boolean a() {
        boolean z10;
        synchronized (this.f34252c) {
            if (this.f34269v == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // q3.f
    public final void b(int i10, int i11) {
        Object obj;
        int round;
        int i12 = i10;
        this.f34251b.a();
        Object obj2 = this.f34252c;
        synchronized (obj2) {
            try {
                boolean z10 = D;
                if (z10) {
                    k("Got onSizeReady in " + t3.h.a(this.f34267t));
                }
                if (this.f34269v == 3) {
                    this.f34269v = 2;
                    float f = this.f34258j.f34239t;
                    if (i12 != Integer.MIN_VALUE) {
                        i12 = Math.round(i12 * f);
                    }
                    this.f34272z = i12;
                    if (i11 == Integer.MIN_VALUE) {
                        round = i11;
                    } else {
                        round = Math.round(f * i11);
                    }
                    this.A = round;
                    if (z10) {
                        k("finished setup for calling load in " + t3.h.a(this.f34267t));
                    }
                    o oVar = this.f34268u;
                    com.bumptech.glide.h hVar = this.f34255g;
                    Object obj3 = this.f34256h;
                    a<?> aVar = this.f34258j;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.f34266s = oVar.b(hVar, obj3, aVar.D, this.f34272z, this.A, aVar.K, this.f34257i, this.f34261m, aVar.f34240u, aVar.J, aVar.E, aVar.Q, aVar.I, aVar.A, aVar.O, aVar.R, aVar.P, this, this.f34264q);
                                if (this.f34269v != 2) {
                                    this.f34266s = null;
                                }
                                if (z10) {
                                    k("finished onSizeReady in " + t3.h.a(this.f34267t));
                                }
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    public final void c() {
        if (!this.B) {
            this.f34251b.a();
            this.f34262n.b(this);
            o.d dVar = this.f34266s;
            if (dVar != null) {
                synchronized (o.this) {
                    dVar.f177a.h(dVar.f178b);
                }
                this.f34266s = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:11:0x0013, B:13:0x001b, B:14:0x001f, B:16:0x0023, B:21:0x002f, B:22:0x0038, B:23:0x003a, B:30:0x0046, B:31:0x004d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // p3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f34252c
            monitor-enter(r0)
            boolean r1 = r5.B     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L46
            u3.d$a r1 = r5.f34251b     // Catch: java.lang.Throwable -> L4e
            r1.a()     // Catch: java.lang.Throwable -> L4e
            int r1 = r5.f34269v     // Catch: java.lang.Throwable -> L4e
            r2 = 6
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            return
        L13:
            r5.c()     // Catch: java.lang.Throwable -> L4e
            a3.x<R> r1 = r5.f34265r     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            if (r1 == 0) goto L1e
            r5.f34265r = r3     // Catch: java.lang.Throwable -> L4e
            goto L1f
        L1e:
            r1 = r3
        L1f:
            p3.e r3 = r5.f34254e     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2c
            boolean r3 = r3.b(r5)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r3 = 0
            goto L2d
        L2c:
            r3 = 1
        L2d:
            if (r3 == 0) goto L38
            q3.g<R> r3 = r5.f34262n     // Catch: java.lang.Throwable -> L4e
            android.graphics.drawable.Drawable r4 = r5.e()     // Catch: java.lang.Throwable -> L4e
            r3.g(r4)     // Catch: java.lang.Throwable -> L4e
        L38:
            r5.f34269v = r2     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L45
            a3.o r0 = r5.f34268u
            r0.getClass()
            a3.o.e(r1)
        L45:
            return
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.Throwable -> L4e
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.i.clear():void");
    }

    @Override // p3.d
    public final boolean d(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        com.bumptech.glide.j jVar;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        com.bumptech.glide.j jVar2;
        int i15;
        boolean equals;
        if (!(dVar instanceof i)) {
            return false;
        }
        synchronized (this.f34252c) {
            i10 = this.f34259k;
            i11 = this.f34260l;
            obj = this.f34256h;
            cls = this.f34257i;
            aVar = this.f34258j;
            jVar = this.f34261m;
            List<f<R>> list = this.o;
            if (list != null) {
                i12 = list.size();
            } else {
                i12 = 0;
            }
        }
        i iVar = (i) dVar;
        synchronized (iVar.f34252c) {
            i13 = iVar.f34259k;
            i14 = iVar.f34260l;
            obj2 = iVar.f34256h;
            cls2 = iVar.f34257i;
            aVar2 = iVar.f34258j;
            jVar2 = iVar.f34261m;
            List<f<R>> list2 = iVar.o;
            if (list2 != null) {
                i15 = list2.size();
            } else {
                i15 = 0;
            }
        }
        if (i10 == i13 && i11 == i14) {
            char[] cArr = l.f35429a;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else if (obj instanceof k) {
                equals = ((k) obj).a();
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2) && aVar.equals(aVar2) && jVar == jVar2 && i12 == i15) {
                return true;
            }
        }
        return false;
    }

    public final Drawable e() {
        int i10;
        if (this.f34271x == null) {
            a<?> aVar = this.f34258j;
            Drawable drawable = aVar.y;
            this.f34271x = drawable;
            if (drawable == null && (i10 = aVar.f34244z) > 0) {
                this.f34271x = j(i10);
            }
        }
        return this.f34271x;
    }

    @Override // p3.d
    public final boolean f() {
        boolean z10;
        synchronized (this.f34252c) {
            if (this.f34269v == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean g() {
        e eVar = this.f34254e;
        if (eVar != null && eVar.getRoot().a()) {
            return false;
        }
        return true;
    }

    @Override // p3.d
    public final void h() {
        int i10;
        synchronized (this.f34252c) {
            try {
                if (!this.B) {
                    this.f34251b.a();
                    int i11 = t3.h.f35419b;
                    this.f34267t = SystemClock.elapsedRealtimeNanos();
                    int i12 = 3;
                    if (this.f34256h == null) {
                        if (l.h(this.f34259k, this.f34260l)) {
                            this.f34272z = this.f34259k;
                            this.A = this.f34260l;
                        }
                        if (this.y == null) {
                            a<?> aVar = this.f34258j;
                            Drawable drawable = aVar.G;
                            this.y = drawable;
                            if (drawable == null && (i10 = aVar.H) > 0) {
                                this.y = j(i10);
                            }
                        }
                        if (this.y == null) {
                            i12 = 5;
                        }
                        l(new t("Received null model"), i12);
                        return;
                    }
                    int i13 = this.f34269v;
                    if (i13 != 2) {
                        boolean z10 = false;
                        if (i13 == 4) {
                            n(this.f34265r, y2.a.MEMORY_CACHE, false);
                            return;
                        }
                        List<f<R>> list = this.o;
                        if (list != null) {
                            for (f<R> fVar : list) {
                                if (fVar instanceof c) {
                                    ((c) fVar).getClass();
                                }
                            }
                        }
                        this.f34269v = 3;
                        if (l.h(this.f34259k, this.f34260l)) {
                            b(this.f34259k, this.f34260l);
                        } else {
                            this.f34262n.h(this);
                        }
                        int i14 = this.f34269v;
                        if (i14 == 2 || i14 == 3) {
                            e eVar = this.f34254e;
                            if (eVar == null || eVar.j(this)) {
                                z10 = true;
                            }
                            if (z10) {
                                this.f34262n.e(e());
                            }
                        }
                        if (D) {
                            k("finished run method in " + t3.h.a(this.f34267t));
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p3.d
    public final boolean i() {
        boolean z10;
        synchronized (this.f34252c) {
            if (this.f34269v == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p3.d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f34252c) {
            int i10 = this.f34269v;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public final Drawable j(int i10) {
        Resources.Theme theme = this.f34258j.M;
        if (theme == null) {
            theme = this.f.getTheme();
        }
        com.bumptech.glide.h hVar = this.f34255g;
        return j3.b.a(hVar, hVar, i10, theme);
    }

    public final void k(String str) {
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, " this: ");
        l10.append(this.f34250a);
        Log.v("GlideRequest", l10.toString());
    }

    public final void l(t tVar, int i10) {
        int i11;
        int i12;
        this.f34251b.a();
        synchronized (this.f34252c) {
            tVar.getClass();
            int i13 = this.f34255g.f19731i;
            if (i13 <= i10) {
                Log.w("Glide", "Load failed for [" + this.f34256h + "] with dimensions [" + this.f34272z + "x" + this.A + "]", tVar);
                if (i13 <= 4) {
                    tVar.k();
                }
            }
            Drawable drawable = null;
            this.f34266s = null;
            this.f34269v = 5;
            e eVar = this.f34254e;
            if (eVar != null) {
                eVar.e(this);
            }
            boolean z10 = true;
            this.B = true;
            try {
                List<f<R>> list = this.o;
                if (list != null) {
                    for (f<R> fVar : list) {
                        g();
                        fVar.b();
                    }
                }
                f<R> fVar2 = this.f34253d;
                if (fVar2 != null) {
                    g();
                    fVar2.b();
                }
                e eVar2 = this.f34254e;
                if (eVar2 != null && !eVar2.j(this)) {
                    z10 = false;
                }
                if (this.f34256h == null) {
                    if (this.y == null) {
                        a<?> aVar = this.f34258j;
                        Drawable drawable2 = aVar.G;
                        this.y = drawable2;
                        if (drawable2 == null && (i12 = aVar.H) > 0) {
                            this.y = j(i12);
                        }
                    }
                    drawable = this.y;
                }
                if (drawable == null) {
                    if (this.f34270w == null) {
                        a<?> aVar2 = this.f34258j;
                        Drawable drawable3 = aVar2.f34242w;
                        this.f34270w = drawable3;
                        if (drawable3 == null && (i11 = aVar2.f34243x) > 0) {
                            this.f34270w = j(i11);
                        }
                    }
                    drawable = this.f34270w;
                }
                if (drawable == null) {
                    drawable = e();
                }
                this.f34262n.c(drawable);
            } finally {
                this.B = false;
            }
        }
    }

    public final void m(x xVar, Object obj, y2.a aVar) {
        g();
        this.f34269v = 4;
        this.f34265r = xVar;
        if (this.f34255g.f19731i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f34256h + " with size [" + this.f34272z + "x" + this.A + "] in " + t3.h.a(this.f34267t) + " ms");
        }
        e eVar = this.f34254e;
        if (eVar != null) {
            eVar.c(this);
        }
        this.B = true;
        try {
            List<f<R>> list = this.o;
            if (list != null) {
                Iterator<f<R>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(obj);
                }
            }
            f<R> fVar = this.f34253d;
            if (fVar != null) {
                fVar.a(obj);
            }
            this.f34263p.getClass();
            this.f34262n.a(obj);
        } finally {
            this.B = false;
        }
    }

    public final void n(x<?> xVar, y2.a aVar, boolean z10) {
        i<R> iVar;
        Throwable th;
        Object obj;
        String str;
        boolean z11;
        this.f34251b.a();
        x<?> xVar2 = null;
        try {
            synchronized (this.f34252c) {
                try {
                    this.f34266s = null;
                    if (xVar == null) {
                        l(new t("Expected to receive a Resource<R> with an object of " + this.f34257i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = xVar.get();
                    try {
                        if (obj2 != null && this.f34257i.isAssignableFrom(obj2.getClass())) {
                            e eVar = this.f34254e;
                            if (eVar != null && !eVar.g(this)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (!z11) {
                                this.f34265r = null;
                                this.f34269v = 4;
                                this.f34268u.getClass();
                                o.e(xVar);
                            }
                            m(xVar, obj2, aVar);
                            return;
                        }
                        this.f34265r = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.f34257i);
                        sb2.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb2.append(obj);
                        sb2.append("{");
                        sb2.append(obj2);
                        sb2.append("} inside Resource{");
                        sb2.append(xVar);
                        sb2.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb2.append(str);
                        l(new t(sb2.toString()), 5);
                        this.f34268u.getClass();
                        o.e(xVar);
                    } catch (Throwable th2) {
                        th = th2;
                        xVar2 = xVar;
                        iVar = this;
                        while (true) {
                            try {
                                try {
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (xVar2 != null) {
                                        iVar.f34268u.getClass();
                                        o.e(xVar2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                iVar = iVar;
                            }
                            th = th4;
                            iVar = iVar;
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    iVar = this;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            iVar = this;
        }
    }

    @Override // p3.d
    public final void pause() {
        synchronized (this.f34252c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f34252c) {
            obj = this.f34256h;
            cls = this.f34257i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
