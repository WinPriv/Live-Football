package k4;

import android.content.Context;
import android.os.Looper;
import c6.p;
import j5.u;
import j7.v1;

/* compiled from: ExoPlayer.java */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30788a;

    /* renamed from: b, reason: collision with root package name */
    public final d6.a0 f30789b;

    /* renamed from: c, reason: collision with root package name */
    public final i7.m<l1> f30790c;

    /* renamed from: d, reason: collision with root package name */
    public final i7.m<u.a> f30791d;

    /* renamed from: e, reason: collision with root package name */
    public final i7.m<b6.m> f30792e;
    public final i7.m<m0> f;

    /* renamed from: g, reason: collision with root package name */
    public final i7.m<c6.e> f30793g;

    /* renamed from: h, reason: collision with root package name */
    public final i7.d<d6.c, l4.a> f30794h;

    /* renamed from: i, reason: collision with root package name */
    public final Looper f30795i;

    /* renamed from: j, reason: collision with root package name */
    public final m4.d f30796j;

    /* renamed from: k, reason: collision with root package name */
    public final int f30797k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f30798l;

    /* renamed from: m, reason: collision with root package name */
    public final m1 f30799m;

    /* renamed from: n, reason: collision with root package name */
    public long f30800n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public final h f30801p;

    /* renamed from: q, reason: collision with root package name */
    public final long f30802q;

    /* renamed from: r, reason: collision with root package name */
    public final long f30803r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f30804s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f30805t;

    public s(final Context context) {
        final int i10 = 0;
        i7.m<l1> mVar = new i7.m() { // from class: k4.o
            @Override // i7.m
            public final Object get() {
                c6.p pVar;
                switch (i10) {
                    case 0:
                        return new k(context);
                    default:
                        Context context2 = context;
                        v1 v1Var = c6.p.f3392n;
                        synchronized (c6.p.class) {
                            if (c6.p.f3397t == null) {
                                p.a aVar = new p.a(context2);
                                c6.p.f3397t = new c6.p(aVar.f3410a, aVar.f3411b, aVar.f3412c, aVar.f3413d, aVar.f3414e);
                            }
                            pVar = c6.p.f3397t;
                        }
                        return pVar;
                }
            }
        };
        i7.m<u.a> mVar2 = new i7.m() { // from class: k4.p
            @Override // i7.m
            public final Object get() {
                return new j5.k(context, new p4.f());
            }
        };
        q qVar = new q(context, 0);
        i7.m<m0> mVar3 = new i7.m() { // from class: k4.r
            @Override // i7.m
            public final Object get() {
                return new i();
            }
        };
        final int i11 = 1;
        i7.m<c6.e> mVar4 = new i7.m() { // from class: k4.o
            @Override // i7.m
            public final Object get() {
                c6.p pVar;
                switch (i11) {
                    case 0:
                        return new k(context);
                    default:
                        Context context2 = context;
                        v1 v1Var = c6.p.f3392n;
                        synchronized (c6.p.class) {
                            if (c6.p.f3397t == null) {
                                p.a aVar = new p.a(context2);
                                c6.p.f3397t = new c6.p(aVar.f3410a, aVar.f3411b, aVar.f3412c, aVar.f3413d, aVar.f3414e);
                            }
                            pVar = c6.p.f3397t;
                        }
                        return pVar;
                }
            }
        };
        e0.i iVar = new e0.i();
        context.getClass();
        this.f30788a = context;
        this.f30790c = mVar;
        this.f30791d = mVar2;
        this.f30792e = qVar;
        this.f = mVar3;
        this.f30793g = mVar4;
        this.f30794h = iVar;
        int i12 = d6.g0.f27302a;
        Looper myLooper = Looper.myLooper();
        this.f30795i = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f30796j = m4.d.y;
        this.f30797k = 1;
        this.f30798l = true;
        this.f30799m = m1.f30570c;
        this.f30800n = com.anythink.expressad.exoplayer.f.f7962a;
        this.o = 15000L;
        this.f30801p = new h(d6.g0.J(20L), d6.g0.J(500L), 0.999f);
        this.f30789b = d6.c.f27283a;
        this.f30802q = 500L;
        this.f30803r = 2000L;
        this.f30804s = true;
    }
}
