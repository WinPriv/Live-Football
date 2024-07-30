package a3;

import a3.c;
import a3.j;
import a3.s;
import android.os.SystemClock;
import android.util.Log;
import c3.a;
import c3.h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.util.concurrent.Executor;
import t3.i;
import u3.a;

/* compiled from: Engine.java */
/* loaded from: classes.dex */
public final class o implements q, h.a, s.a {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f157h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final j1.a f158a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.activity.n f159b;

    /* renamed from: c, reason: collision with root package name */
    public final c3.h f160c;

    /* renamed from: d, reason: collision with root package name */
    public final b f161d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f162e;
    public final a f;

    /* renamed from: g, reason: collision with root package name */
    public final a3.c f163g;

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final j.d f164a;

        /* renamed from: b, reason: collision with root package name */
        public final a.c f165b = u3.a.a(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, new C0005a());

        /* renamed from: c, reason: collision with root package name */
        public int f166c;

        /* compiled from: Engine.java */
        /* renamed from: a3.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0005a implements a.b<j<?>> {
            public C0005a() {
            }

            @Override // u3.a.b
            public final j<?> create() {
                a aVar = a.this;
                return new j<>(aVar.f164a, aVar.f165b);
            }
        }

        public a(c cVar) {
            this.f164a = cVar;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final d3.a f168a;

        /* renamed from: b, reason: collision with root package name */
        public final d3.a f169b;

        /* renamed from: c, reason: collision with root package name */
        public final d3.a f170c;

        /* renamed from: d, reason: collision with root package name */
        public final d3.a f171d;

        /* renamed from: e, reason: collision with root package name */
        public final q f172e;
        public final s.a f;

        /* renamed from: g, reason: collision with root package name */
        public final a.c f173g = u3.a.a(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, new a());

        /* compiled from: Engine.java */
        /* loaded from: classes.dex */
        public class a implements a.b<p<?>> {
            public a() {
            }

            @Override // u3.a.b
            public final p<?> create() {
                b bVar = b.this;
                return new p<>(bVar.f168a, bVar.f169b, bVar.f170c, bVar.f171d, bVar.f172e, bVar.f, bVar.f173g);
            }
        }

        public b(d3.a aVar, d3.a aVar2, d3.a aVar3, d3.a aVar4, q qVar, s.a aVar5) {
            this.f168a = aVar;
            this.f169b = aVar2;
            this.f170c = aVar3;
            this.f171d = aVar4;
            this.f172e = qVar;
            this.f = aVar5;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class c implements j.d {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0037a f175a;

        /* renamed from: b, reason: collision with root package name */
        public volatile c3.a f176b;

        public c(a.InterfaceC0037a interfaceC0037a) {
            this.f175a = interfaceC0037a;
        }

        public final c3.a a() {
            if (this.f176b == null) {
                synchronized (this) {
                    if (this.f176b == null) {
                        c3.c cVar = (c3.c) this.f175a;
                        c3.e eVar = (c3.e) cVar.f3234b;
                        File cacheDir = eVar.f3240a.getCacheDir();
                        c3.d dVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = eVar.f3241b;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            dVar = new c3.d(cacheDir, cVar.f3233a);
                        }
                        this.f176b = dVar;
                    }
                    if (this.f176b == null) {
                        this.f176b = new androidx.activity.n();
                    }
                }
            }
            return this.f176b;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final p<?> f177a;

        /* renamed from: b, reason: collision with root package name */
        public final p3.h f178b;

        public d(p3.h hVar, p<?> pVar) {
            this.f178b = hVar;
            this.f177a = pVar;
        }
    }

    public o(c3.h hVar, a.InterfaceC0037a interfaceC0037a, d3.a aVar, d3.a aVar2, d3.a aVar3, d3.a aVar4) {
        this.f160c = hVar;
        c cVar = new c(interfaceC0037a);
        a3.c cVar2 = new a3.c();
        this.f163g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f96e = this;
            }
        }
        this.f159b = new androidx.activity.n(0);
        this.f158a = new j1.a(2);
        this.f161d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f = new a(cVar);
        this.f162e = new a0();
        ((c3.g) hVar).f3242d = this;
    }

    public static void d(String str, long j10, y2.e eVar) {
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, " in ");
        l10.append(t3.h.a(j10));
        l10.append("ms, key: ");
        l10.append(eVar);
        Log.v("Engine", l10.toString());
    }

    public static void e(x xVar) {
        if (xVar instanceof s) {
            ((s) xVar).d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @Override // a3.s.a
    public final void a(y2.e eVar, s<?> sVar) {
        a3.c cVar = this.f163g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f94c.remove(eVar);
            if (aVar != null) {
                aVar.f99c = null;
                aVar.clear();
            }
        }
        if (sVar.f202s) {
            ((c3.g) this.f160c).d(eVar, sVar);
        } else {
            this.f162e.a(sVar, false);
        }
    }

    public final d b(com.bumptech.glide.h hVar, Object obj, y2.e eVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.j jVar, n nVar, t3.b bVar, boolean z10, boolean z11, y2.g gVar, boolean z12, boolean z13, boolean z14, boolean z15, p3.h hVar2, Executor executor) {
        long j10;
        if (f157h) {
            int i12 = t3.h.f35419b;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        this.f159b.getClass();
        r rVar = new r(obj, eVar, i10, i11, bVar, cls, cls2, gVar);
        synchronized (this) {
            try {
                s<?> c10 = c(rVar, z12, j11);
                if (c10 == null) {
                    return f(hVar, obj, eVar, i10, i11, cls, cls2, jVar, nVar, bVar, z10, z11, gVar, z12, z13, z14, z15, hVar2, executor, rVar, j11);
                }
                ((p3.i) hVar2).n(c10, y2.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s<?> c(r rVar, boolean z10, long j10) {
        s<?> sVar;
        x xVar;
        s<?> sVar2;
        if (!z10) {
            return null;
        }
        a3.c cVar = this.f163g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f94c.get(rVar);
            if (aVar == null) {
                sVar = null;
            } else {
                sVar = aVar.get();
                if (sVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (sVar != null) {
            sVar.b();
        }
        if (sVar != null) {
            if (f157h) {
                d("Loaded resource from active resources", j10, rVar);
            }
            return sVar;
        }
        c3.g gVar = (c3.g) this.f160c;
        synchronized (gVar) {
            i.a aVar2 = (i.a) gVar.f35420a.remove(rVar);
            if (aVar2 == null) {
                xVar = null;
            } else {
                gVar.f35422c -= aVar2.f35424b;
                xVar = aVar2.f35423a;
            }
        }
        x xVar2 = xVar;
        if (xVar2 == null) {
            sVar2 = null;
        } else if (xVar2 instanceof s) {
            sVar2 = (s) xVar2;
        } else {
            sVar2 = new s<>(xVar2, true, true, rVar, this);
        }
        if (sVar2 != null) {
            sVar2.b();
            this.f163g.a(rVar, sVar2);
        }
        if (sVar2 == null) {
            return null;
        }
        if (f157h) {
            d("Loaded resource from cache", j10, rVar);
        }
        return sVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        r0 = r15.y;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a3.o.d f(com.bumptech.glide.h r17, java.lang.Object r18, y2.e r19, int r20, int r21, java.lang.Class r22, java.lang.Class r23, com.bumptech.glide.j r24, a3.n r25, t3.b r26, boolean r27, boolean r28, y2.g r29, boolean r30, boolean r31, boolean r32, boolean r33, p3.h r34, java.util.concurrent.Executor r35, a3.r r36, long r37) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.o.f(com.bumptech.glide.h, java.lang.Object, y2.e, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.j, a3.n, t3.b, boolean, boolean, y2.g, boolean, boolean, boolean, boolean, p3.h, java.util.concurrent.Executor, a3.r, long):a3.o$d");
    }
}
