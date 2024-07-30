package com.applovin.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ao;
import com.applovin.exoplayer2.ay;
import com.applovin.exoplayer2.b;
import com.applovin.exoplayer2.c;
import com.applovin.exoplayer2.k;
import com.applovin.exoplayer2.m.a.i;
import com.applovin.exoplayer2.q;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class aw extends d implements q {
    private int A;
    private int B;
    private com.applovin.exoplayer2.c.e C;
    private com.applovin.exoplayer2.c.e D;
    private int E;
    private com.applovin.exoplayer2.b.d F;
    private float G;
    private boolean H;
    private List<com.applovin.exoplayer2.i.a> I;
    private boolean J;
    private boolean K;
    private com.applovin.exoplayer2.l.aa L;
    private boolean M;
    private boolean N;
    private o O;
    private com.applovin.exoplayer2.m.o P;

    /* renamed from: b, reason: collision with root package name */
    protected final ar[] f13257b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.g f13258c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f13259d;

    /* renamed from: e, reason: collision with root package name */
    private final r f13260e;
    private final b f;

    /* renamed from: g, reason: collision with root package name */
    private final c f13261g;

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet<an.d> f13262h;

    /* renamed from: i, reason: collision with root package name */
    private final com.applovin.exoplayer2.a.a f13263i;

    /* renamed from: j, reason: collision with root package name */
    private final com.applovin.exoplayer2.b f13264j;

    /* renamed from: k, reason: collision with root package name */
    private final com.applovin.exoplayer2.c f13265k;

    /* renamed from: l, reason: collision with root package name */
    private final ay f13266l;

    /* renamed from: m, reason: collision with root package name */
    private final bb f13267m;

    /* renamed from: n, reason: collision with root package name */
    private final bc f13268n;
    private final long o;

    /* renamed from: p, reason: collision with root package name */
    private v f13269p;

    /* renamed from: q, reason: collision with root package name */
    private v f13270q;

    /* renamed from: r, reason: collision with root package name */
    private AudioTrack f13271r;

    /* renamed from: s, reason: collision with root package name */
    private Object f13272s;

    /* renamed from: t, reason: collision with root package name */
    private Surface f13273t;

    /* renamed from: u, reason: collision with root package name */
    private SurfaceHolder f13274u;

    /* renamed from: v, reason: collision with root package name */
    private com.applovin.exoplayer2.m.a.i f13275v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13276w;

    /* renamed from: x, reason: collision with root package name */
    private TextureView f13277x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private int f13278z;

    @Deprecated
    /* loaded from: classes.dex */
    public static final class a {
        private boolean A;

        /* renamed from: a, reason: collision with root package name */
        private final Context f13279a;

        /* renamed from: b, reason: collision with root package name */
        private final au f13280b;

        /* renamed from: c, reason: collision with root package name */
        private com.applovin.exoplayer2.l.d f13281c;

        /* renamed from: d, reason: collision with root package name */
        private long f13282d;

        /* renamed from: e, reason: collision with root package name */
        private com.applovin.exoplayer2.j.j f13283e;
        private com.applovin.exoplayer2.h.r f;

        /* renamed from: g, reason: collision with root package name */
        private aa f13284g;

        /* renamed from: h, reason: collision with root package name */
        private com.applovin.exoplayer2.k.d f13285h;

        /* renamed from: i, reason: collision with root package name */
        private com.applovin.exoplayer2.a.a f13286i;

        /* renamed from: j, reason: collision with root package name */
        private Looper f13287j;

        /* renamed from: k, reason: collision with root package name */
        private com.applovin.exoplayer2.l.aa f13288k;

        /* renamed from: l, reason: collision with root package name */
        private com.applovin.exoplayer2.b.d f13289l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f13290m;

        /* renamed from: n, reason: collision with root package name */
        private int f13291n;
        private boolean o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f13292p;

        /* renamed from: q, reason: collision with root package name */
        private int f13293q;

        /* renamed from: r, reason: collision with root package name */
        private int f13294r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f13295s;

        /* renamed from: t, reason: collision with root package name */
        private av f13296t;

        /* renamed from: u, reason: collision with root package name */
        private long f13297u;

        /* renamed from: v, reason: collision with root package name */
        private long f13298v;

        /* renamed from: w, reason: collision with root package name */
        private z f13299w;

        /* renamed from: x, reason: collision with root package name */
        private long f13300x;
        private long y;

        /* renamed from: z, reason: collision with root package name */
        private boolean f13301z;

        @Deprecated
        public a(Context context) {
            this(context, new n(context), new com.applovin.exoplayer2.e.f());
        }

        @Deprecated
        public a(Context context, au auVar, com.applovin.exoplayer2.e.l lVar) {
            this(context, auVar, new com.applovin.exoplayer2.j.c(context), new com.applovin.exoplayer2.h.f(context, lVar), new l(), com.applovin.exoplayer2.k.n.a(context), new com.applovin.exoplayer2.a.a(com.applovin.exoplayer2.l.d.f16291a));
        }

        @Deprecated
        public aw a() {
            com.applovin.exoplayer2.l.a.b(!this.A);
            this.A = true;
            return new aw(this);
        }

        @Deprecated
        public a(Context context, au auVar, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.h.r rVar, aa aaVar, com.applovin.exoplayer2.k.d dVar, com.applovin.exoplayer2.a.a aVar) {
            this.f13279a = context;
            this.f13280b = auVar;
            this.f13283e = jVar;
            this.f = rVar;
            this.f13284g = aaVar;
            this.f13285h = dVar;
            this.f13286i = aVar;
            this.f13287j = com.applovin.exoplayer2.l.ai.c();
            this.f13289l = com.applovin.exoplayer2.b.d.f13359a;
            this.f13291n = 0;
            this.f13293q = 1;
            this.f13294r = 0;
            this.f13295s = true;
            this.f13296t = av.f13255e;
            this.f13297u = com.anythink.expressad.exoplayer.f.f7962a;
            this.f13298v = 15000L;
            this.f13299w = new k.a().a();
            this.f13281c = com.applovin.exoplayer2.l.d.f16291a;
            this.f13300x = 500L;
            this.y = 2000L;
        }
    }

    public aw(a aVar) {
        aw awVar;
        com.applovin.exoplayer2.b.d dVar;
        boolean z10;
        boolean z11;
        com.applovin.exoplayer2.l.g gVar = new com.applovin.exoplayer2.l.g();
        this.f13258c = gVar;
        try {
            Context applicationContext = aVar.f13279a.getApplicationContext();
            this.f13259d = applicationContext;
            com.applovin.exoplayer2.a.a aVar2 = aVar.f13286i;
            this.f13263i = aVar2;
            this.L = aVar.f13288k;
            this.F = aVar.f13289l;
            this.y = aVar.f13293q;
            this.f13278z = aVar.f13294r;
            this.H = aVar.f13292p;
            this.o = aVar.y;
            b bVar = new b();
            this.f = bVar;
            c cVar = new c();
            this.f13261g = cVar;
            this.f13262h = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(aVar.f13287j);
            ar[] a10 = aVar.f13280b.a(handler, bVar, bVar, bVar, bVar);
            this.f13257b = a10;
            this.G = 1.0f;
            if (com.applovin.exoplayer2.l.ai.f16274a < 21) {
                this.E = d(0);
            } else {
                this.E = h.a(applicationContext);
            }
            this.I = Collections.emptyList();
            this.J = true;
            try {
                r rVar = new r(a10, aVar.f13283e, aVar.f, aVar.f13284g, aVar.f13285h, aVar2, aVar.f13295s, aVar.f13296t, aVar.f13297u, aVar.f13298v, aVar.f13299w, aVar.f13300x, aVar.f13301z, aVar.f13281c, aVar.f13287j, this, new an.a.C0151a().a(20, 21, 22, 23, 24, 25, 26, 27).a());
                awVar = this;
                try {
                    awVar.f13260e = rVar;
                    rVar.a((an.b) bVar);
                    rVar.a((q.a) bVar);
                    if (aVar.f13282d > 0) {
                        rVar.b(aVar.f13282d);
                    }
                    com.applovin.exoplayer2.b bVar2 = new com.applovin.exoplayer2.b(aVar.f13279a, handler, bVar);
                    awVar.f13264j = bVar2;
                    bVar2.a(aVar.o);
                    com.applovin.exoplayer2.c cVar2 = new com.applovin.exoplayer2.c(aVar.f13279a, handler, bVar);
                    awVar.f13265k = cVar2;
                    if (aVar.f13290m) {
                        dVar = awVar.F;
                    } else {
                        dVar = null;
                    }
                    cVar2.a(dVar);
                    ay ayVar = new ay(aVar.f13279a, handler, bVar);
                    awVar.f13266l = ayVar;
                    ayVar.a(com.applovin.exoplayer2.l.ai.g(awVar.F.f13362d));
                    bb bbVar = new bb(aVar.f13279a);
                    awVar.f13267m = bbVar;
                    if (aVar.f13291n != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bbVar.a(z10);
                    bc bcVar = new bc(aVar.f13279a);
                    awVar.f13268n = bcVar;
                    if (aVar.f13291n == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bcVar.a(z11);
                    awVar.O = b(ayVar);
                    awVar.P = com.applovin.exoplayer2.m.o.f16538a;
                    awVar.a(1, 10, Integer.valueOf(awVar.E));
                    awVar.a(2, 10, Integer.valueOf(awVar.E));
                    awVar.a(1, 3, awVar.F);
                    awVar.a(2, 4, Integer.valueOf(awVar.y));
                    awVar.a(2, 5, Integer.valueOf(awVar.f13278z));
                    awVar.a(1, 9, Boolean.valueOf(awVar.H));
                    awVar.a(2, 7, cVar);
                    awVar.a(6, 8, cVar);
                    gVar.a();
                } catch (Throwable th) {
                    th = th;
                    awVar.f13258c.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                awVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            awVar = this;
        }
    }

    private void U() {
        if (this.f13275v != null) {
            this.f13260e.a(this.f13261g).a(10000).a((Object) null).i();
            this.f13275v.b(this.f);
            this.f13275v = null;
        }
        TextureView textureView = this.f13277x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f) {
                com.applovin.exoplayer2.l.q.c("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f13277x.setSurfaceTextureListener(null);
            }
            this.f13277x = null;
        }
        SurfaceHolder surfaceHolder = this.f13274u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f);
            this.f13274u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        a(1, 2, Float.valueOf(this.G * this.f13265k.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        this.f13263i.a_(this.H);
        Iterator<an.d> it = this.f13262h.iterator();
        while (it.hasNext()) {
            it.next().a_(this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        int t10 = t();
        boolean z10 = true;
        if (t10 != 1) {
            if (t10 != 2 && t10 != 3) {
                if (t10 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                boolean q10 = q();
                bb bbVar = this.f13267m;
                if (!x() || q10) {
                    z10 = false;
                }
                bbVar.b(z10);
                this.f13268n.b(x());
                return;
            }
        }
        this.f13267m.b(false);
        this.f13268n.b(false);
    }

    private void Z() {
        IllegalStateException illegalStateException;
        this.f13258c.d();
        if (Thread.currentThread() != r().getThread()) {
            String a10 = com.applovin.exoplayer2.l.ai.a("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), r().getThread().getName());
            if (!this.J) {
                if (this.K) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                com.applovin.exoplayer2.l.q.b("SimpleExoPlayer", a10, illegalStateException);
                this.K = true;
                return;
            }
            throw new IllegalStateException(a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    @Override // com.applovin.exoplayer2.an
    public long A() {
        Z();
        return this.f13260e.A();
    }

    @Override // com.applovin.exoplayer2.an
    public long B() {
        Z();
        return this.f13260e.B();
    }

    @Override // com.applovin.exoplayer2.an
    public long C() {
        Z();
        return this.f13260e.C();
    }

    @Override // com.applovin.exoplayer2.an
    public am D() {
        Z();
        return this.f13260e.D();
    }

    public void E() {
        AudioTrack audioTrack;
        Z();
        if (com.applovin.exoplayer2.l.ai.f16274a < 21 && (audioTrack = this.f13271r) != null) {
            audioTrack.release();
            this.f13271r = null;
        }
        this.f13264j.a(false);
        this.f13266l.c();
        this.f13267m.b(false);
        this.f13268n.b(false);
        this.f13265k.b();
        this.f13260e.E();
        this.f13263i.c();
        U();
        Surface surface = this.f13273t;
        if (surface != null) {
            surface.release();
            this.f13273t = null;
        }
        if (this.M) {
            ((com.applovin.exoplayer2.l.aa) com.applovin.exoplayer2.l.a.b(this.L)).b(0);
            this.M = false;
        }
        this.I = Collections.emptyList();
        this.N = true;
    }

    @Override // com.applovin.exoplayer2.an
    public int F() {
        Z();
        return this.f13260e.F();
    }

    @Override // com.applovin.exoplayer2.an
    public int G() {
        Z();
        return this.f13260e.G();
    }

    @Override // com.applovin.exoplayer2.an
    public long H() {
        Z();
        return this.f13260e.H();
    }

    @Override // com.applovin.exoplayer2.an
    public long I() {
        Z();
        return this.f13260e.I();
    }

    @Override // com.applovin.exoplayer2.an
    public long J() {
        Z();
        return this.f13260e.J();
    }

    @Override // com.applovin.exoplayer2.an
    public boolean K() {
        Z();
        return this.f13260e.K();
    }

    @Override // com.applovin.exoplayer2.an
    public int L() {
        Z();
        return this.f13260e.L();
    }

    @Override // com.applovin.exoplayer2.an
    public int M() {
        Z();
        return this.f13260e.M();
    }

    @Override // com.applovin.exoplayer2.an
    public long N() {
        Z();
        return this.f13260e.N();
    }

    @Override // com.applovin.exoplayer2.an
    public long O() {
        Z();
        return this.f13260e.O();
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.h.ad P() {
        Z();
        return this.f13260e.P();
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.j.h Q() {
        Z();
        return this.f13260e.Q();
    }

    @Override // com.applovin.exoplayer2.an
    public ac R() {
        return this.f13260e.R();
    }

    @Override // com.applovin.exoplayer2.an
    public ba S() {
        Z();
        return this.f13260e.S();
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.m.o T() {
        return this.P;
    }

    @Override // com.applovin.exoplayer2.an
    public List<com.applovin.exoplayer2.i.a> V() {
        Z();
        return this.I;
    }

    public boolean q() {
        Z();
        return this.f13260e.q();
    }

    @Override // com.applovin.exoplayer2.an
    public Looper r() {
        return this.f13260e.r();
    }

    @Override // com.applovin.exoplayer2.an
    public an.a s() {
        Z();
        return this.f13260e.s();
    }

    @Override // com.applovin.exoplayer2.an
    public int t() {
        Z();
        return this.f13260e.t();
    }

    @Override // com.applovin.exoplayer2.an
    public int u() {
        Z();
        return this.f13260e.u();
    }

    public void v() {
        Z();
        U();
        a((Object) null);
        a(0, 0);
    }

    @Override // com.applovin.exoplayer2.an
    public void w() {
        Z();
        boolean x10 = x();
        int a10 = this.f13265k.a(x10, 2);
        a(x10, a10, b(x10, a10));
        this.f13260e.w();
    }

    @Override // com.applovin.exoplayer2.an
    public boolean x() {
        Z();
        return this.f13260e.x();
    }

    @Override // com.applovin.exoplayer2.an
    public int y() {
        Z();
        return this.f13260e.y();
    }

    @Override // com.applovin.exoplayer2.an
    public boolean z() {
        Z();
        return this.f13260e.z();
    }

    /* loaded from: classes.dex */
    public final class b implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, an.b, ay.a, b.InterfaceC0153b, com.applovin.exoplayer2.b.g, c.b, com.applovin.exoplayer2.g.e, com.applovin.exoplayer2.i.l, i.a, com.applovin.exoplayer2.m.n, q.a {
        private b() {
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(com.applovin.exoplayer2.c.e eVar) {
            aw.this.C = eVar;
            aw.this.f13263i.a(eVar);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void a_(boolean z10) {
            if (aw.this.H == z10) {
                return;
            }
            aw.this.H = z10;
            aw.this.X();
        }

        @Override // com.applovin.exoplayer2.m.n
        public void b(com.applovin.exoplayer2.c.e eVar) {
            aw.this.f13263i.b(eVar);
            aw.this.f13269p = null;
            aw.this.C = null;
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b_(boolean z10) {
            if (aw.this.L != null) {
                if (z10 && !aw.this.M) {
                    aw.this.L.a(0);
                    aw.this.M = true;
                } else if (!z10 && aw.this.M) {
                    aw.this.L.b(0);
                    aw.this.M = false;
                }
            }
        }

        @Override // com.applovin.exoplayer2.b.g
        public void c(com.applovin.exoplayer2.c.e eVar) {
            aw.this.D = eVar;
            aw.this.f13263i.c(eVar);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void d(com.applovin.exoplayer2.c.e eVar) {
            aw.this.f13263i.d(eVar);
            aw.this.f13270q = null;
            aw.this.D = null;
        }

        @Override // com.applovin.exoplayer2.ay.a
        public void f(int i10) {
            o b10 = aw.b(aw.this.f13266l);
            if (!b10.equals(aw.this.O)) {
                aw.this.O = b10;
                Iterator it = aw.this.f13262h.iterator();
                while (it.hasNext()) {
                    ((an.d) it.next()).a(b10);
                }
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            aw.this.a(surfaceTexture);
            aw.this.a(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            aw.this.a((Object) null);
            aw.this.a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            aw.this.a(i10, i11);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            aw.this.a(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (aw.this.f13276w) {
                aw.this.a(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (aw.this.f13276w) {
                aw.this.a((Object) null);
            }
            aw.this.a(0, 0);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(String str, long j10, long j11) {
            aw.this.f13263i.a(str, j10, j11);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void c(Exception exc) {
            aw.this.f13263i.c(exc);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(v vVar, com.applovin.exoplayer2.c.h hVar) {
            aw.this.f13269p = vVar;
            aw.this.f13263i.a(vVar, hVar);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(String str, long j10, long j11) {
            aw.this.f13263i.b(str, j10, j11);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(v vVar, com.applovin.exoplayer2.c.h hVar) {
            aw.this.f13270q = vVar;
            aw.this.f13263i.b(vVar, hVar);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(int i10, long j10) {
            aw.this.f13263i.a(i10, j10);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(com.applovin.exoplayer2.m.o oVar) {
            aw.this.P = oVar;
            aw.this.f13263i.a(oVar);
            Iterator it = aw.this.f13262h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(oVar);
            }
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(String str) {
            aw.this.f13263i.b(str);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(Exception exc) {
            aw.this.f13263i.b(exc);
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(int i10) {
            aw.this.Y();
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(boolean z10, int i10) {
            aw.this.Y();
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(Object obj, long j10) {
            aw.this.f13263i.a(obj, j10);
            if (aw.this.f13272s == obj) {
                Iterator it = aw.this.f13262h.iterator();
                while (it.hasNext()) {
                    ((an.d) it.next()).a();
                }
            }
        }

        @Override // com.applovin.exoplayer2.q.a
        public void b(boolean z10) {
            aw.this.Y();
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(String str) {
            aw.this.f13263i.a(str);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(long j10, int i10) {
            aw.this.f13263i.a(j10, i10);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(Exception exc) {
            aw.this.f13263i.a(exc);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void a(long j10) {
            aw.this.f13263i.a(j10);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void a(int i10, long j10, long j11) {
            aw.this.f13263i.a(i10, j10, j11);
        }

        @Override // com.applovin.exoplayer2.i.l
        public void a(List<com.applovin.exoplayer2.i.a> list) {
            aw.this.I = list;
            Iterator it = aw.this.f13262h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(list);
            }
        }

        @Override // com.applovin.exoplayer2.g.e
        public void a(com.applovin.exoplayer2.g.a aVar) {
            aw.this.f13263i.a(aVar);
            aw.this.f13260e.a(aVar);
            Iterator it = aw.this.f13262h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(aVar);
            }
        }

        @Override // com.applovin.exoplayer2.m.a.i.a
        public void a(Surface surface) {
            aw.this.a((Object) null);
        }

        @Override // com.applovin.exoplayer2.c.b
        public void a(float f) {
            aw.this.W();
        }

        @Override // com.applovin.exoplayer2.c.b
        public void a(int i10) {
            boolean x10 = aw.this.x();
            aw.this.a(x10, i10, aw.b(x10, i10));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.applovin.exoplayer2.b.InterfaceC0153b
        public void a() {
            aw.this.a(false, -1, 3);
        }

        @Override // com.applovin.exoplayer2.ay.a
        public void a(int i10, boolean z10) {
            Iterator it = aw.this.f13262h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(i10, z10);
            }
        }
    }

    private int d(int i10) {
        AudioTrack audioTrack = this.f13271r;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.f13271r.release();
            this.f13271r = null;
        }
        if (this.f13271r == null) {
            this.f13271r = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f13271r.getAudioSessionId();
    }

    @Override // com.applovin.exoplayer2.an
    public void c(int i10) {
        Z();
        this.f13260e.c(i10);
    }

    private void c(SurfaceHolder surfaceHolder) {
        this.f13276w = false;
        this.f13274u = surfaceHolder;
        surfaceHolder.addCallback(this.f);
        Surface surface = this.f13274u.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.f13274u.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a(0, 0);
        }
    }

    public void b(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null || surfaceHolder != this.f13274u) {
            return;
        }
        v();
    }

    /* loaded from: classes.dex */
    public static final class c implements ao.b, com.applovin.exoplayer2.m.a.a, com.applovin.exoplayer2.m.l {

        /* renamed from: a, reason: collision with root package name */
        private com.applovin.exoplayer2.m.l f13303a;

        /* renamed from: b, reason: collision with root package name */
        private com.applovin.exoplayer2.m.a.a f13304b;

        /* renamed from: c, reason: collision with root package name */
        private com.applovin.exoplayer2.m.l f13305c;

        /* renamed from: d, reason: collision with root package name */
        private com.applovin.exoplayer2.m.a.a f13306d;

        private c() {
        }

        @Override // com.applovin.exoplayer2.ao.b
        public void a(int i10, Object obj) {
            if (i10 == 7) {
                this.f13303a = (com.applovin.exoplayer2.m.l) obj;
                return;
            }
            if (i10 == 8) {
                this.f13304b = (com.applovin.exoplayer2.m.a.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            com.applovin.exoplayer2.m.a.i iVar = (com.applovin.exoplayer2.m.a.i) obj;
            if (iVar == null) {
                this.f13305c = null;
                this.f13306d = null;
            } else {
                this.f13305c = iVar.getVideoFrameMetadataListener();
                this.f13306d = iVar.getCameraMotionListener();
            }
        }

        @Override // com.applovin.exoplayer2.m.l
        public void a(long j10, long j11, v vVar, MediaFormat mediaFormat) {
            com.applovin.exoplayer2.m.l lVar = this.f13305c;
            if (lVar != null) {
                lVar.a(j10, j11, vVar, mediaFormat);
            }
            com.applovin.exoplayer2.m.l lVar2 = this.f13303a;
            if (lVar2 != null) {
                lVar2.a(j10, j11, vVar, mediaFormat);
            }
        }

        @Override // com.applovin.exoplayer2.m.a.a
        public void a(long j10, float[] fArr) {
            com.applovin.exoplayer2.m.a.a aVar = this.f13306d;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            com.applovin.exoplayer2.m.a.a aVar2 = this.f13304b;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        @Override // com.applovin.exoplayer2.m.a.a
        public void a() {
            com.applovin.exoplayer2.m.a.a aVar = this.f13306d;
            if (aVar != null) {
                aVar.a();
            }
            com.applovin.exoplayer2.m.a.a aVar2 = this.f13304b;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
    }

    @Override // com.applovin.exoplayer2.an
    public void b(SurfaceView surfaceView) {
        Z();
        b(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.applovin.exoplayer2.an
    public void b(TextureView textureView) {
        Z();
        if (textureView == null || textureView != this.f13277x) {
            return;
        }
        v();
    }

    public void a(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null) {
            v();
            return;
        }
        U();
        this.f13276w = true;
        this.f13274u = surfaceHolder;
        surfaceHolder.addCallback(this.f);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            a(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a((Object) null);
            a(0, 0);
        }
    }

    @Override // com.applovin.exoplayer2.an
    public void b(an.d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.f13262h.remove(dVar);
        b((an.b) dVar);
    }

    @Deprecated
    public void b(an.b bVar) {
        this.f13260e.b(bVar);
    }

    @Override // com.applovin.exoplayer2.an, com.applovin.exoplayer2.q
    /* renamed from: b */
    public p e() {
        Z();
        return this.f13260e.e();
    }

    @Override // com.applovin.exoplayer2.an
    public void b(boolean z10) {
        Z();
        this.f13260e.b(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o b(ay ayVar) {
        return new o(0, ayVar.a(), ayVar.b());
    }

    @Override // com.applovin.exoplayer2.an
    public void a(SurfaceView surfaceView) {
        Z();
        if (surfaceView instanceof com.applovin.exoplayer2.m.k) {
            U();
            a((Object) surfaceView);
            c(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof com.applovin.exoplayer2.m.a.i) {
                U();
                this.f13275v = (com.applovin.exoplayer2.m.a.i) surfaceView;
                this.f13260e.a(this.f13261g).a(10000).a(this.f13275v).i();
                this.f13275v.a(this.f);
                a(this.f13275v.getVideoSurface());
                c(surfaceView.getHolder());
                return;
            }
            a(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // com.applovin.exoplayer2.an
    public void a(TextureView textureView) {
        Z();
        if (textureView == null) {
            v();
            return;
        }
        U();
        this.f13277x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            com.applovin.exoplayer2.l.q.c("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Object) null);
            a(0, 0);
        } else {
            a(surfaceTexture);
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public void a(float f) {
        Z();
        float a10 = com.applovin.exoplayer2.l.ai.a(f, gl.Code, 1.0f);
        if (this.G == a10) {
            return;
        }
        this.G = a10;
        W();
        this.f13263i.a(a10);
        Iterator<an.d> it = this.f13262h.iterator();
        while (it.hasNext()) {
            it.next().a(a10);
        }
    }

    @Override // com.applovin.exoplayer2.an
    public void a(an.d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.f13262h.add(dVar);
        a((an.b) dVar);
    }

    @Deprecated
    public void a(an.b bVar) {
        com.applovin.exoplayer2.l.a.b(bVar);
        this.f13260e.a(bVar);
    }

    public void a(com.applovin.exoplayer2.h.p pVar) {
        Z();
        this.f13260e.a(pVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void a(boolean z10) {
        Z();
        int a10 = this.f13265k.a(z10, t());
        a(z10, a10, b(z10, a10));
    }

    @Override // com.applovin.exoplayer2.an
    public void a(int i10, long j10) {
        Z();
        this.f13263i.d();
        this.f13260e.a(i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.f13273t = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ar[] arVarArr = this.f13257b;
        int length = arVarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            ar arVar = arVarArr[i10];
            if (arVar.a() == 2) {
                arrayList.add(this.f13260e.a(arVar).a(1).a(obj).i());
            }
            i10++;
        }
        Object obj2 = this.f13272s;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ao) it.next()).a(this.o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f13272s;
            Surface surface = this.f13273t;
            if (obj3 == surface) {
                surface.release();
                this.f13273t = null;
            }
        }
        this.f13272s = obj;
        if (z10) {
            this.f13260e.a(false, p.a(new u(3), 1003));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11) {
        if (i10 == this.A && i11 == this.B) {
            return;
        }
        this.A = i10;
        this.B = i11;
        this.f13263i.a(i10, i11);
        Iterator<an.d> it = this.f13262h.iterator();
        while (it.hasNext()) {
            it.next().a(i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        this.f13260e.a(z11, i12, i11);
    }

    private void a(int i10, int i11, Object obj) {
        for (ar arVar : this.f13257b) {
            if (arVar.a() == i10) {
                this.f13260e.a(arVar).a(i11).a(obj).i();
            }
        }
    }
}
