package j5;

import android.content.Context;
import c6.j;
import c6.q;
import j5.u;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k4.n0;

/* compiled from: DefaultMediaSourceFactory.java */
/* loaded from: classes2.dex */
public final class k implements u.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f29781a;

    /* renamed from: b, reason: collision with root package name */
    public final j.a f29782b;

    /* renamed from: c, reason: collision with root package name */
    public c6.a0 f29783c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29784d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29785e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final float f29786g;

    /* renamed from: h, reason: collision with root package name */
    public final float f29787h;

    /* compiled from: DefaultMediaSourceFactory.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final p4.l f29788a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f29789b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f29790c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f29791d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public j.a f29792e;
        public o4.c f;

        /* renamed from: g, reason: collision with root package name */
        public c6.a0 f29793g;

        public a(p4.f fVar) {
            this.f29788a = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final i7.m<j5.u.a> a(int r6) {
            /*
                r5 = this;
                java.util.HashMap r0 = r5.f29789b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                boolean r1 = r0.containsKey(r1)
                if (r1 == 0) goto L17
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r6 = r0.get(r6)
                i7.m r6 = (i7.m) r6
                return r6
            L17:
                c6.j$a r1 = r5.f29792e
                r1.getClass()
                java.lang.Class<j5.u$a> r2 = j5.u.a.class
                if (r6 == 0) goto L5b
                r3 = 1
                if (r6 == r3) goto L4f
                r4 = 2
                if (r6 == r4) goto L43
                r4 = 3
                if (r6 == r4) goto L33
                r2 = 4
                if (r6 == r2) goto L2d
                goto L69
            L2d:
                j5.h r2 = new j5.h     // Catch: java.lang.ClassNotFoundException -> L69
                r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L69
                goto L6a
            L33:
                java.lang.String r1 = "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L69
                java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L69
                k4.q r2 = new k4.q     // Catch: java.lang.ClassNotFoundException -> L69
                r2.<init>(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L69
                goto L6a
            L43:
                java.lang.Class<com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory> r3 = com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory.class
                java.lang.Class r2 = r3.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L69
                j5.j r3 = new j5.j     // Catch: java.lang.ClassNotFoundException -> L69
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L69
                goto L67
            L4f:
                java.lang.Class<com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory> r3 = com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource.Factory.class
                java.lang.Class r2 = r3.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L69
                j5.i r3 = new j5.i     // Catch: java.lang.ClassNotFoundException -> L69
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L69
                goto L67
            L5b:
                java.lang.Class<com.google.android.exoplayer2.source.dash.DashMediaSource$Factory> r3 = com.google.android.exoplayer2.source.dash.DashMediaSource.Factory.class
                java.lang.Class r2 = r3.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L69
                j5.h r3 = new j5.h     // Catch: java.lang.ClassNotFoundException -> L69
                r4 = 0
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L69
            L67:
                r2 = r3
                goto L6a
            L69:
                r2 = 0
            L6a:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                r0.put(r1, r2)
                if (r2 == 0) goto L7c
                java.util.HashSet r0 = r5.f29790c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0.add(r6)
            L7c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: j5.k.a.a(int):i7.m");
        }
    }

    public k(Context context, p4.f fVar) {
        q.a aVar = new q.a(context);
        this.f29782b = aVar;
        a aVar2 = new a(fVar);
        this.f29781a = aVar2;
        if (aVar != aVar2.f29792e) {
            aVar2.f29792e = aVar;
            aVar2.f29789b.clear();
            aVar2.f29791d.clear();
        }
        this.f29784d = com.anythink.expressad.exoplayer.b.f7291b;
        this.f29785e = com.anythink.expressad.exoplayer.b.f7291b;
        this.f = com.anythink.expressad.exoplayer.b.f7291b;
        this.f29786g = -3.4028235E38f;
        this.f29787h = -3.4028235E38f;
    }

    public static u.a d(Class cls, j.a aVar) {
        try {
            return (u.a) cls.getConstructor(j.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // j5.u.a
    public final u.a a(c6.a0 a0Var) {
        if (a0Var != null) {
            this.f29783c = a0Var;
            a aVar = this.f29781a;
            aVar.f29793g = a0Var;
            Iterator it = aVar.f29791d.values().iterator();
            while (it.hasNext()) {
                ((u.a) it.next()).a(a0Var);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // j5.u.a
    public final u.a b(o4.c cVar) {
        if (cVar != null) {
            a aVar = this.f29781a;
            aVar.f = cVar;
            Iterator it = aVar.f29791d.values().iterator();
            while (it.hasNext()) {
                ((u.a) it.next()).b(cVar);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [c6.a0] */
    @Override // j5.u.a
    public final u c(k4.n0 n0Var) {
        long j10;
        float f;
        float f10;
        long j11;
        long j12;
        k4.n0 n0Var2 = n0Var;
        n0Var2.f30575t.getClass();
        n0.g gVar = n0Var2.f30575t;
        String scheme = gVar.f30629a.getScheme();
        u.a aVar = null;
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int D = d6.g0.D(gVar.f30629a, gVar.f30630b);
        a aVar2 = this.f29781a;
        HashMap hashMap = aVar2.f29791d;
        u.a aVar3 = (u.a) hashMap.get(Integer.valueOf(D));
        if (aVar3 != null) {
            aVar = aVar3;
        } else {
            i7.m<u.a> a10 = aVar2.a(D);
            if (a10 != null) {
                aVar = a10.get();
                o4.c cVar = aVar2.f;
                if (cVar != null) {
                    aVar.b(cVar);
                }
                c6.a0 a0Var = aVar2.f29793g;
                if (a0Var != null) {
                    aVar.a(a0Var);
                }
                hashMap.put(Integer.valueOf(D), aVar);
            }
        }
        d6.a.f(aVar, "No suitable media source factory found for content type: " + D);
        n0.e eVar = n0Var2.f30576u;
        eVar.getClass();
        if (eVar.f30619s == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = this.f29784d;
        } else {
            j10 = eVar.f30619s;
        }
        long j13 = j10;
        if (eVar.f30622v == -3.4028235E38f) {
            f = this.f29786g;
        } else {
            f = eVar.f30622v;
        }
        float f11 = f;
        if (eVar.f30623w == -3.4028235E38f) {
            f10 = this.f29787h;
        } else {
            f10 = eVar.f30623w;
        }
        float f12 = f10;
        if (eVar.f30620t == com.anythink.expressad.exoplayer.b.f7291b) {
            j11 = this.f29785e;
        } else {
            j11 = eVar.f30620t;
        }
        long j14 = j11;
        if (eVar.f30621u == com.anythink.expressad.exoplayer.b.f7291b) {
            j12 = this.f;
        } else {
            j12 = eVar.f30621u;
        }
        n0.e eVar2 = new n0.e(j13, j14, j12, f11, f12);
        if (!eVar2.equals(eVar)) {
            n0.a aVar4 = new n0.a(n0Var2);
            aVar4.f30589k = new n0.e.a(eVar2);
            n0Var2 = aVar4.a();
        }
        u c10 = aVar.c(n0Var2);
        j7.j0<n0.j> j0Var = n0Var2.f30575t.f;
        if (!j0Var.isEmpty()) {
            u[] uVarArr = new u[j0Var.size() + 1];
            int i10 = 0;
            uVarArr[0] = c10;
            while (i10 < j0Var.size()) {
                j.a aVar5 = this.f29782b;
                aVar5.getClass();
                c6.t tVar = new c6.t();
                ?? r72 = this.f29783c;
                if (r72 != 0) {
                    tVar = r72;
                }
                int i11 = i10 + 1;
                uVarArr[i11] = new k0(j0Var.get(i10), aVar5, tVar);
                i10 = i11;
            }
            c10 = new z(uVarArr);
        }
        u uVar = c10;
        n0.c cVar2 = n0Var2.f30578w;
        long j15 = cVar2.f30593s;
        long j16 = cVar2.f30594t;
        if (j15 != 0 || j16 != Long.MIN_VALUE || cVar2.f30596v) {
            uVar = new e(uVar, d6.g0.J(j15), d6.g0.J(j16), !cVar2.f30597w, cVar2.f30595u, cVar2.f30596v);
        }
        n0Var2.f30575t.getClass();
        return uVar;
    }
}
