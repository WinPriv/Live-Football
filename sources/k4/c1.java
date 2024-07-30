package k4;

import com.google.android.exoplayer2.metadata.Metadata;
import j5.u;
import j7.v1;
import java.util.List;
import k4.q1;

/* compiled from: PlaybackInfo.java */
/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: s, reason: collision with root package name */
    public static final u.b f30381s = new u.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final q1 f30382a;

    /* renamed from: b, reason: collision with root package name */
    public final u.b f30383b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30384c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30385d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30386e;
    public final m f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30387g;

    /* renamed from: h, reason: collision with root package name */
    public final j5.n0 f30388h;

    /* renamed from: i, reason: collision with root package name */
    public final b6.n f30389i;

    /* renamed from: j, reason: collision with root package name */
    public final List<Metadata> f30390j;

    /* renamed from: k, reason: collision with root package name */
    public final u.b f30391k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f30392l;

    /* renamed from: m, reason: collision with root package name */
    public final int f30393m;

    /* renamed from: n, reason: collision with root package name */
    public final d1 f30394n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f30395p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f30396q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f30397r;

    public c1(q1 q1Var, u.b bVar, long j10, long j11, int i10, m mVar, boolean z10, j5.n0 n0Var, b6.n nVar, List<Metadata> list, u.b bVar2, boolean z11, int i11, d1 d1Var, long j12, long j13, long j14, boolean z12) {
        this.f30382a = q1Var;
        this.f30383b = bVar;
        this.f30384c = j10;
        this.f30385d = j11;
        this.f30386e = i10;
        this.f = mVar;
        this.f30387g = z10;
        this.f30388h = n0Var;
        this.f30389i = nVar;
        this.f30390j = list;
        this.f30391k = bVar2;
        this.f30392l = z11;
        this.f30393m = i11;
        this.f30394n = d1Var;
        this.f30395p = j12;
        this.f30396q = j13;
        this.f30397r = j14;
        this.o = z12;
    }

    public static c1 h(b6.n nVar) {
        q1.a aVar = q1.f30752s;
        u.b bVar = f30381s;
        return new c1(aVar, bVar, com.anythink.expressad.exoplayer.b.f7291b, 0L, 1, null, false, j5.n0.f29811v, nVar, v1.f30113w, bVar, false, 0, d1.f30400v, 0L, 0L, 0L, false);
    }

    public final c1 a(u.b bVar) {
        return new c1(this.f30382a, this.f30383b, this.f30384c, this.f30385d, this.f30386e, this.f, this.f30387g, this.f30388h, this.f30389i, this.f30390j, bVar, this.f30392l, this.f30393m, this.f30394n, this.f30395p, this.f30396q, this.f30397r, this.o);
    }

    public final c1 b(u.b bVar, long j10, long j11, long j12, long j13, j5.n0 n0Var, b6.n nVar, List<Metadata> list) {
        return new c1(this.f30382a, bVar, j11, j12, this.f30386e, this.f, this.f30387g, n0Var, nVar, list, this.f30391k, this.f30392l, this.f30393m, this.f30394n, this.f30395p, j13, j10, this.o);
    }

    public final c1 c(int i10, boolean z10) {
        return new c1(this.f30382a, this.f30383b, this.f30384c, this.f30385d, this.f30386e, this.f, this.f30387g, this.f30388h, this.f30389i, this.f30390j, this.f30391k, z10, i10, this.f30394n, this.f30395p, this.f30396q, this.f30397r, this.o);
    }

    public final c1 d(m mVar) {
        return new c1(this.f30382a, this.f30383b, this.f30384c, this.f30385d, this.f30386e, mVar, this.f30387g, this.f30388h, this.f30389i, this.f30390j, this.f30391k, this.f30392l, this.f30393m, this.f30394n, this.f30395p, this.f30396q, this.f30397r, this.o);
    }

    public final c1 e(d1 d1Var) {
        return new c1(this.f30382a, this.f30383b, this.f30384c, this.f30385d, this.f30386e, this.f, this.f30387g, this.f30388h, this.f30389i, this.f30390j, this.f30391k, this.f30392l, this.f30393m, d1Var, this.f30395p, this.f30396q, this.f30397r, this.o);
    }

    public final c1 f(int i10) {
        return new c1(this.f30382a, this.f30383b, this.f30384c, this.f30385d, i10, this.f, this.f30387g, this.f30388h, this.f30389i, this.f30390j, this.f30391k, this.f30392l, this.f30393m, this.f30394n, this.f30395p, this.f30396q, this.f30397r, this.o);
    }

    public final c1 g(q1 q1Var) {
        return new c1(q1Var, this.f30383b, this.f30384c, this.f30385d, this.f30386e, this.f, this.f30387g, this.f30388h, this.f30389i, this.f30390j, this.f30391k, this.f30392l, this.f30393m, this.f30394n, this.f30395p, this.f30396q, this.f30397r, this.o);
    }
}
