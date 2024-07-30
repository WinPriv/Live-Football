package k4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import d6.j;
import d6.o;
import j5.h0;
import j5.q;
import j5.u;
import j7.j0;
import j7.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import k4.b;
import k4.c;
import k4.e1;
import k4.f0;
import k4.f1;
import k4.o0;
import k4.o1;
import k4.q1;

/* compiled from: ExoPlayerImpl.java */
/* loaded from: classes2.dex */
public final class a0 extends k4.d {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f30317l0 = 0;
    public final k4.c A;
    public final o1 B;
    public final s1 C;
    public final t1 D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public final m1 L;
    public j5.h0 M;
    public e1.a N;
    public o0 O;
    public AudioTrack P;
    public Object Q;
    public Surface R;
    public SurfaceHolder S;
    public SphericalGLSurfaceView T;
    public boolean U;
    public TextureView V;
    public final int W;
    public d6.x X;
    public final int Y;
    public final m4.d Z;

    /* renamed from: a0, reason: collision with root package name */
    public final float f30318a0;

    /* renamed from: b, reason: collision with root package name */
    public final b6.n f30319b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f30320b0;

    /* renamed from: c, reason: collision with root package name */
    public final e1.a f30321c;

    /* renamed from: c0, reason: collision with root package name */
    public r5.c f30322c0;

    /* renamed from: d, reason: collision with root package name */
    public final d6.e f30323d = new d6.e();

    /* renamed from: d0, reason: collision with root package name */
    public final boolean f30324d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f30325e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f30326e0;
    public final e1 f;

    /* renamed from: f0, reason: collision with root package name */
    public l f30327f0;

    /* renamed from: g, reason: collision with root package name */
    public final i1[] f30328g;

    /* renamed from: g0, reason: collision with root package name */
    public e6.n f30329g0;

    /* renamed from: h, reason: collision with root package name */
    public final b6.m f30330h;

    /* renamed from: h0, reason: collision with root package name */
    public o0 f30331h0;

    /* renamed from: i, reason: collision with root package name */
    public final d6.m f30332i;

    /* renamed from: i0, reason: collision with root package name */
    public c1 f30333i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f30334j;

    /* renamed from: j0, reason: collision with root package name */
    public int f30335j0;

    /* renamed from: k, reason: collision with root package name */
    public final f0 f30336k;

    /* renamed from: k0, reason: collision with root package name */
    public long f30337k0;

    /* renamed from: l, reason: collision with root package name */
    public final d6.o<e1.c> f30338l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet<n> f30339m;

    /* renamed from: n, reason: collision with root package name */
    public final q1.b f30340n;
    public final ArrayList o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f30341p;

    /* renamed from: q, reason: collision with root package name */
    public final u.a f30342q;

    /* renamed from: r, reason: collision with root package name */
    public final l4.a f30343r;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f30344s;

    /* renamed from: t, reason: collision with root package name */
    public final c6.e f30345t;

    /* renamed from: u, reason: collision with root package name */
    public final long f30346u;

    /* renamed from: v, reason: collision with root package name */
    public final long f30347v;

    /* renamed from: w, reason: collision with root package name */
    public final d6.a0 f30348w;

    /* renamed from: x, reason: collision with root package name */
    public final b f30349x;
    public final c y;

    /* renamed from: z, reason: collision with root package name */
    public final k4.b f30350z;

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static l4.w a(Context context, a0 a0Var, boolean z10) {
            PlaybackSession createPlaybackSession;
            l4.u uVar;
            LogSessionId sessionId;
            LogSessionId logSessionId;
            MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
            if (mediaMetricsManager != null) {
                createPlaybackSession = mediaMetricsManager.createPlaybackSession();
                uVar = new l4.u(context, createPlaybackSession);
            } else {
                uVar = null;
            }
            if (uVar == null) {
                d6.p.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                return new l4.w(logSessionId);
            }
            if (z10) {
                a0Var.getClass();
                a0Var.f30343r.J(uVar);
            }
            sessionId = uVar.f32455c.getSessionId();
            return new l4.w(sessionId);
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes2.dex */
    public static final class c implements e6.i, f6.a, f1.b {

        /* renamed from: s, reason: collision with root package name */
        public e6.i f30352s;

        /* renamed from: t, reason: collision with root package name */
        public f6.a f30353t;

        /* renamed from: u, reason: collision with root package name */
        public e6.i f30354u;

        /* renamed from: v, reason: collision with root package name */
        public f6.a f30355v;

        @Override // f6.a
        public final void a(long j10, float[] fArr) {
            f6.a aVar = this.f30355v;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            f6.a aVar2 = this.f30353t;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        @Override // f6.a
        public final void c() {
            f6.a aVar = this.f30355v;
            if (aVar != null) {
                aVar.c();
            }
            f6.a aVar2 = this.f30353t;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // e6.i
        public final void d(long j10, long j11, i0 i0Var, MediaFormat mediaFormat) {
            e6.i iVar = this.f30354u;
            if (iVar != null) {
                iVar.d(j10, j11, i0Var, mediaFormat);
            }
            e6.i iVar2 = this.f30352s;
            if (iVar2 != null) {
                iVar2.d(j10, j11, i0Var, mediaFormat);
            }
        }

        @Override // k4.f1.b
        public final void p(int i10, Object obj) {
            if (i10 != 7) {
                if (i10 != 8) {
                    if (i10 == 10000) {
                        SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
                        if (sphericalGLSurfaceView == null) {
                            this.f30354u = null;
                            this.f30355v = null;
                            return;
                        } else {
                            this.f30354u = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                            this.f30355v = sphericalGLSurfaceView.getCameraMotionListener();
                            return;
                        }
                    }
                    return;
                }
                this.f30353t = (f6.a) obj;
                return;
            }
            this.f30352s = (e6.i) obj;
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes2.dex */
    public static final class d implements s0 {

        /* renamed from: a, reason: collision with root package name */
        public final Object f30356a;

        /* renamed from: b, reason: collision with root package name */
        public q1 f30357b;

        public d(q.a aVar, Object obj) {
            this.f30356a = obj;
            this.f30357b = aVar;
        }

        @Override // k4.s0
        public final Object a() {
            return this.f30356a;
        }

        @Override // k4.s0
        public final q1 b() {
            return this.f30357b;
        }
    }

    static {
        g0.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public a0(s sVar) {
        boolean z10;
        l4.w a10;
        try {
            d6.p.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.4] [" + d6.g0.f27306e + "]");
            Context context = sVar.f30788a;
            Looper looper = sVar.f30795i;
            this.f30325e = context.getApplicationContext();
            i7.d<d6.c, l4.a> dVar = sVar.f30794h;
            d6.a0 a0Var = sVar.f30789b;
            this.f30343r = dVar.apply(a0Var);
            this.Z = sVar.f30796j;
            this.W = sVar.f30797k;
            this.f30320b0 = false;
            this.E = sVar.f30803r;
            b bVar = new b();
            this.f30349x = bVar;
            this.y = new c();
            Handler handler = new Handler(looper);
            i1[] a11 = sVar.f30790c.get().a(handler, bVar, bVar, bVar, bVar);
            this.f30328g = a11;
            if (a11.length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.d(z10);
            this.f30330h = sVar.f30792e.get();
            this.f30342q = sVar.f30791d.get();
            this.f30345t = sVar.f30793g.get();
            this.f30341p = sVar.f30798l;
            this.L = sVar.f30799m;
            this.f30346u = sVar.f30800n;
            this.f30347v = sVar.o;
            this.f30344s = looper;
            this.f30348w = a0Var;
            this.f = this;
            this.f30338l = new d6.o<>(looper, a0Var, new q0.d(this, 3));
            this.f30339m = new CopyOnWriteArraySet<>();
            this.o = new ArrayList();
            this.M = new h0.a();
            this.f30319b = new b6.n(new k1[a11.length], new b6.f[a11.length], r1.f30779t, null);
            this.f30340n = new q1.b();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i10 = 0; i10 < 21; i10++) {
                int i11 = iArr[i10];
                d6.a.d(!false);
                sparseBooleanArray.append(i11, true);
            }
            b6.m mVar = this.f30330h;
            mVar.getClass();
            if (mVar instanceof b6.e) {
                d6.a.d(!false);
                sparseBooleanArray.append(29, true);
            }
            d6.a.d(true);
            d6.j jVar = new d6.j(sparseBooleanArray);
            this.f30321c = new e1.a(jVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < jVar.b(); i12++) {
                int a12 = jVar.a(i12);
                d6.a.d(!false);
                sparseBooleanArray2.append(a12, true);
            }
            d6.a.d(true);
            sparseBooleanArray2.append(4, true);
            d6.a.d(true);
            sparseBooleanArray2.append(10, true);
            d6.a.d(!false);
            this.N = new e1.a(new d6.j(sparseBooleanArray2));
            this.f30332i = this.f30348w.b(this.f30344s, null);
            u uVar = new u(this);
            this.f30334j = uVar;
            this.f30333i0 = c1.h(this.f30319b);
            this.f30343r.y(this.f, this.f30344s);
            int i13 = d6.g0.f27302a;
            if (i13 < 31) {
                a10 = new l4.w();
            } else {
                a10 = a.a(this.f30325e, this, sVar.f30804s);
            }
            this.f30336k = new f0(this.f30328g, this.f30330h, this.f30319b, sVar.f.get(), this.f30345t, this.F, this.G, this.f30343r, this.L, sVar.f30801p, sVar.f30802q, false, this.f30344s, this.f30348w, uVar, a10);
            this.f30318a0 = 1.0f;
            this.F = 0;
            o0 o0Var = o0.f30662c0;
            this.O = o0Var;
            this.f30331h0 = o0Var;
            int i14 = -1;
            this.f30335j0 = -1;
            if (i13 < 21) {
                AudioTrack audioTrack = this.P;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.P.release();
                    this.P = null;
                }
                if (this.P == null) {
                    this.P = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.Y = this.P.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f30325e.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
                if (audioManager != null) {
                    i14 = audioManager.generateAudioSessionId();
                }
                this.Y = i14;
            }
            this.f30322c0 = r5.c.f34916t;
            this.f30324d0 = true;
            q(this.f30343r);
            this.f30345t.c(new Handler(this.f30344s), this.f30343r);
            this.f30339m.add(this.f30349x);
            k4.b bVar2 = new k4.b(context, handler, this.f30349x);
            this.f30350z = bVar2;
            bVar2.a();
            k4.c cVar = new k4.c(context, handler, this.f30349x);
            this.A = cVar;
            cVar.c();
            o1 o1Var = new o1(context, handler, this.f30349x);
            this.B = o1Var;
            o1Var.b(d6.g0.y(this.Z.f32721u));
            this.C = new s1(context);
            this.D = new t1(context);
            this.f30327f0 = a0(o1Var);
            this.f30329g0 = e6.n.f27842w;
            this.X = d6.x.f27387c;
            this.f30330h.d(this.Z);
            k0(1, 10, Integer.valueOf(this.Y));
            k0(2, 10, Integer.valueOf(this.Y));
            k0(1, 3, this.Z);
            k0(2, 4, Integer.valueOf(this.W));
            k0(2, 5, 0);
            k0(1, 9, Boolean.valueOf(this.f30320b0));
            k0(2, 7, this.y);
            k0(6, 8, this.y);
        } finally {
            this.f30323d.a();
        }
    }

    public static l a0(o1 o1Var) {
        int i10;
        o1Var.getClass();
        if (d6.g0.f27302a >= 28) {
            i10 = o1Var.f30718d.getStreamMinVolume(o1Var.f);
        } else {
            i10 = 0;
        }
        return new l(0, i10, o1Var.f30718d.getStreamMaxVolume(o1Var.f));
    }

    public static long e0(c1 c1Var) {
        q1.c cVar = new q1.c();
        q1.b bVar = new q1.b();
        c1Var.f30382a.g(c1Var.f30383b.f29835a, bVar);
        long j10 = c1Var.f30384c;
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return c1Var.f30382a.m(bVar.f30756u, cVar).E;
        }
        return bVar.f30758w + j10;
    }

    public static boolean f0(c1 c1Var) {
        if (c1Var.f30386e == 3 && c1Var.f30392l && c1Var.f30393m == 0) {
            return true;
        }
        return false;
    }

    @Override // k4.e1
    public final int A() {
        t0();
        if (c()) {
            return this.f30333i0.f30383b.f29836b;
        }
        return -1;
    }

    @Override // k4.e1
    public final int B() {
        t0();
        int d02 = d0();
        if (d02 == -1) {
            return 0;
        }
        return d02;
    }

    @Override // k4.e1
    public final void D(int i10) {
        t0();
        if (this.F != i10) {
            this.F = i10;
            this.f30336k.f30436z.b(11, i10, 0).a();
            w wVar = new w(i10);
            d6.o<e1.c> oVar = this.f30338l;
            oVar.c(8, wVar);
            p0();
            oVar.b();
        }
    }

    @Override // k4.e1
    public final void E(SurfaceView surfaceView) {
        SurfaceHolder holder;
        t0();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        t0();
        if (holder != null && holder == this.S) {
            Z();
        }
    }

    @Override // k4.e1
    public final int G() {
        t0();
        return this.f30333i0.f30393m;
    }

    @Override // k4.e1
    public final int H() {
        t0();
        return this.F;
    }

    @Override // k4.e1
    public final q1 I() {
        t0();
        return this.f30333i0.f30382a;
    }

    @Override // k4.e1
    public final Looper J() {
        return this.f30344s;
    }

    @Override // k4.e1
    public final boolean K() {
        t0();
        return this.G;
    }

    @Override // k4.e1
    public final long L() {
        t0();
        if (this.f30333i0.f30382a.p()) {
            return this.f30337k0;
        }
        c1 c1Var = this.f30333i0;
        if (c1Var.f30391k.f29838d != c1Var.f30383b.f29838d) {
            return d6.g0.S(c1Var.f30382a.m(B(), this.f30398a).F);
        }
        long j10 = c1Var.f30395p;
        if (this.f30333i0.f30391k.a()) {
            c1 c1Var2 = this.f30333i0;
            q1.b g6 = c1Var2.f30382a.g(c1Var2.f30391k.f29835a, this.f30340n);
            long d10 = g6.d(this.f30333i0.f30391k.f29836b);
            if (d10 == Long.MIN_VALUE) {
                j10 = g6.f30757v;
            } else {
                j10 = d10;
            }
        }
        c1 c1Var3 = this.f30333i0;
        q1 q1Var = c1Var3.f30382a;
        Object obj = c1Var3.f30391k.f29835a;
        q1.b bVar = this.f30340n;
        q1Var.g(obj, bVar);
        return d6.g0.S(j10 + bVar.f30758w);
    }

    @Override // k4.e1
    public final void O(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        t0();
        if (textureView == null) {
            Z();
            return;
        }
        j0();
        this.V = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            d6.p.f("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f30349x);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            n0(null);
            i0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            n0(surface);
            this.R = surface;
            i0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // k4.e1
    public final o0 Q() {
        t0();
        return this.O;
    }

    @Override // k4.d
    public final void U(int i10, long j10, boolean z10) {
        boolean z11;
        t0();
        int i11 = 1;
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d6.a.a(z11);
        this.f30343r.H();
        q1 q1Var = this.f30333i0.f30382a;
        if (!q1Var.p() && i10 >= q1Var.o()) {
            return;
        }
        this.H++;
        if (c()) {
            d6.p.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            f0.d dVar = new f0.d(this.f30333i0);
            dVar.a(1);
            a0 a0Var = this.f30334j.f30809s;
            a0Var.getClass();
            a0Var.f30332i.c(new e0.g(4, a0Var, dVar));
            return;
        }
        if (v() != 1) {
            i11 = 2;
        }
        int B = B();
        c1 g02 = g0(this.f30333i0.f(i11), q1Var, h0(q1Var, i10, j10));
        long J = d6.g0.J(j10);
        f0 f0Var = this.f30336k;
        f0Var.getClass();
        f0Var.f30436z.j(3, new f0.g(q1Var, i10, J)).a();
        r0(g02, 0, 1, true, true, 1, c0(g02), B, z10);
    }

    public final o0 Y() {
        q1 I = I();
        if (I.p()) {
            return this.f30331h0;
        }
        n0 n0Var = I.m(B(), this.f30398a).f30762u;
        o0 o0Var = this.f30331h0;
        o0Var.getClass();
        o0.a aVar = new o0.a(o0Var);
        o0 o0Var2 = n0Var.f30577v;
        if (o0Var2 != null) {
            CharSequence charSequence = o0Var2.f30685s;
            if (charSequence != null) {
                aVar.f30692a = charSequence;
            }
            CharSequence charSequence2 = o0Var2.f30686t;
            if (charSequence2 != null) {
                aVar.f30693b = charSequence2;
            }
            CharSequence charSequence3 = o0Var2.f30687u;
            if (charSequence3 != null) {
                aVar.f30694c = charSequence3;
            }
            CharSequence charSequence4 = o0Var2.f30688v;
            if (charSequence4 != null) {
                aVar.f30695d = charSequence4;
            }
            CharSequence charSequence5 = o0Var2.f30689w;
            if (charSequence5 != null) {
                aVar.f30696e = charSequence5;
            }
            CharSequence charSequence6 = o0Var2.f30690x;
            if (charSequence6 != null) {
                aVar.f = charSequence6;
            }
            CharSequence charSequence7 = o0Var2.y;
            if (charSequence7 != null) {
                aVar.f30697g = charSequence7;
            }
            h1 h1Var = o0Var2.f30691z;
            if (h1Var != null) {
                aVar.f30698h = h1Var;
            }
            h1 h1Var2 = o0Var2.A;
            if (h1Var2 != null) {
                aVar.f30699i = h1Var2;
            }
            byte[] bArr = o0Var2.B;
            if (bArr != null) {
                aVar.f30700j = (byte[]) bArr.clone();
                aVar.f30701k = o0Var2.C;
            }
            Uri uri = o0Var2.D;
            if (uri != null) {
                aVar.f30702l = uri;
            }
            Integer num = o0Var2.E;
            if (num != null) {
                aVar.f30703m = num;
            }
            Integer num2 = o0Var2.F;
            if (num2 != null) {
                aVar.f30704n = num2;
            }
            Integer num3 = o0Var2.G;
            if (num3 != null) {
                aVar.o = num3;
            }
            Boolean bool = o0Var2.H;
            if (bool != null) {
                aVar.f30705p = bool;
            }
            Boolean bool2 = o0Var2.I;
            if (bool2 != null) {
                aVar.f30706q = bool2;
            }
            Integer num4 = o0Var2.J;
            if (num4 != null) {
                aVar.f30707r = num4;
            }
            Integer num5 = o0Var2.K;
            if (num5 != null) {
                aVar.f30707r = num5;
            }
            Integer num6 = o0Var2.L;
            if (num6 != null) {
                aVar.f30708s = num6;
            }
            Integer num7 = o0Var2.M;
            if (num7 != null) {
                aVar.f30709t = num7;
            }
            Integer num8 = o0Var2.N;
            if (num8 != null) {
                aVar.f30710u = num8;
            }
            Integer num9 = o0Var2.O;
            if (num9 != null) {
                aVar.f30711v = num9;
            }
            Integer num10 = o0Var2.P;
            if (num10 != null) {
                aVar.f30712w = num10;
            }
            CharSequence charSequence8 = o0Var2.Q;
            if (charSequence8 != null) {
                aVar.f30713x = charSequence8;
            }
            CharSequence charSequence9 = o0Var2.R;
            if (charSequence9 != null) {
                aVar.y = charSequence9;
            }
            CharSequence charSequence10 = o0Var2.S;
            if (charSequence10 != null) {
                aVar.f30714z = charSequence10;
            }
            Integer num11 = o0Var2.T;
            if (num11 != null) {
                aVar.A = num11;
            }
            Integer num12 = o0Var2.U;
            if (num12 != null) {
                aVar.B = num12;
            }
            CharSequence charSequence11 = o0Var2.V;
            if (charSequence11 != null) {
                aVar.C = charSequence11;
            }
            CharSequence charSequence12 = o0Var2.W;
            if (charSequence12 != null) {
                aVar.D = charSequence12;
            }
            CharSequence charSequence13 = o0Var2.X;
            if (charSequence13 != null) {
                aVar.E = charSequence13;
            }
            Integer num13 = o0Var2.Y;
            if (num13 != null) {
                aVar.F = num13;
            }
            Bundle bundle = o0Var2.Z;
            if (bundle != null) {
                aVar.G = bundle;
            }
        }
        return new o0(aVar);
    }

    public final void Z() {
        t0();
        j0();
        n0(null);
        i0(0, 0);
    }

    @Override // k4.e1
    public final void a(d1 d1Var) {
        t0();
        if (this.f30333i0.f30394n.equals(d1Var)) {
            return;
        }
        c1 e10 = this.f30333i0.e(d1Var);
        this.H++;
        this.f30336k.f30436z.j(4, d1Var).a();
        r0(e10, 0, 1, false, false, 5, com.anythink.expressad.exoplayer.b.f7291b, -1, false);
    }

    @Override // k4.e1
    public final void b() {
        int i10;
        t0();
        boolean g6 = g();
        int i11 = 2;
        int e10 = this.A.e(2, g6);
        if (g6 && e10 != 1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        q0(e10, i10, g6);
        c1 c1Var = this.f30333i0;
        if (c1Var.f30386e != 1) {
            return;
        }
        c1 d10 = c1Var.d(null);
        if (d10.f30382a.p()) {
            i11 = 4;
        }
        c1 f = d10.f(i11);
        this.H++;
        this.f30336k.f30436z.d(0).a();
        r0(f, 1, 1, false, false, 5, com.anythink.expressad.exoplayer.b.f7291b, -1, false);
    }

    public final f1 b0(f1.b bVar) {
        int d02 = d0();
        q1 q1Var = this.f30333i0.f30382a;
        if (d02 == -1) {
            d02 = 0;
        }
        d6.a0 a0Var = this.f30348w;
        f0 f0Var = this.f30336k;
        return new f1(f0Var, bVar, q1Var, d02, a0Var, f0Var.B);
    }

    @Override // k4.e1
    public final boolean c() {
        t0();
        return this.f30333i0.f30383b.a();
    }

    public final long c0(c1 c1Var) {
        if (c1Var.f30382a.p()) {
            return d6.g0.J(this.f30337k0);
        }
        if (c1Var.f30383b.a()) {
            return c1Var.f30397r;
        }
        q1 q1Var = c1Var.f30382a;
        u.b bVar = c1Var.f30383b;
        long j10 = c1Var.f30397r;
        Object obj = bVar.f29835a;
        q1.b bVar2 = this.f30340n;
        q1Var.g(obj, bVar2);
        return j10 + bVar2.f30758w;
    }

    @Override // k4.e1
    public final d1 d() {
        t0();
        return this.f30333i0.f30394n;
    }

    public final int d0() {
        if (this.f30333i0.f30382a.p()) {
            return this.f30335j0;
        }
        c1 c1Var = this.f30333i0;
        return c1Var.f30382a.g(c1Var.f30383b.f29835a, this.f30340n).f30756u;
    }

    @Override // k4.e1
    public final long e() {
        t0();
        return d6.g0.S(this.f30333i0.f30396q);
    }

    @Override // k4.e1
    public final boolean g() {
        t0();
        return this.f30333i0.f30392l;
    }

    public final c1 g0(c1 c1Var, q1 q1Var, Pair<Object, Long> pair) {
        boolean z10;
        u.b bVar;
        j5.n0 n0Var;
        u.b bVar2;
        b6.n nVar;
        List<Metadata> list;
        long j10;
        if (!q1Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        d6.a.a(z10);
        q1 q1Var2 = c1Var.f30382a;
        c1 g6 = c1Var.g(q1Var);
        if (q1Var.p()) {
            u.b bVar3 = c1.f30381s;
            long J = d6.g0.J(this.f30337k0);
            c1 a10 = g6.b(bVar3, J, J, J, 0L, j5.n0.f29811v, this.f30319b, v1.f30113w).a(bVar3);
            a10.f30395p = a10.f30397r;
            return a10;
        }
        Object obj = g6.f30383b.f29835a;
        boolean z11 = !obj.equals(pair.first);
        if (z11) {
            bVar = new u.b(pair.first);
        } else {
            bVar = g6.f30383b;
        }
        u.b bVar4 = bVar;
        long longValue = ((Long) pair.second).longValue();
        long J2 = d6.g0.J(t());
        if (!q1Var2.p()) {
            J2 -= q1Var2.g(obj, this.f30340n).f30758w;
        }
        if (!z11 && longValue >= J2) {
            if (longValue == J2) {
                int b10 = q1Var.b(g6.f30391k.f29835a);
                if (b10 == -1 || q1Var.f(b10, this.f30340n, false).f30756u != q1Var.g(bVar4.f29835a, this.f30340n).f30756u) {
                    q1Var.g(bVar4.f29835a, this.f30340n);
                    if (bVar4.a()) {
                        j10 = this.f30340n.a(bVar4.f29836b, bVar4.f29837c);
                    } else {
                        j10 = this.f30340n.f30757v;
                    }
                    g6 = g6.b(bVar4, g6.f30397r, g6.f30397r, g6.f30385d, j10 - g6.f30397r, g6.f30388h, g6.f30389i, g6.f30390j).a(bVar4);
                    g6.f30395p = j10;
                }
            } else {
                d6.a.d(!bVar4.a());
                long max = Math.max(0L, g6.f30396q - (longValue - J2));
                long j11 = g6.f30395p;
                if (g6.f30391k.equals(g6.f30383b)) {
                    j11 = longValue + max;
                }
                g6 = g6.b(bVar4, longValue, longValue, longValue, max, g6.f30388h, g6.f30389i, g6.f30390j);
                g6.f30395p = j11;
            }
            return g6;
        }
        d6.a.d(!bVar4.a());
        if (z11) {
            n0Var = j5.n0.f29811v;
        } else {
            n0Var = g6.f30388h;
        }
        j5.n0 n0Var2 = n0Var;
        if (z11) {
            bVar2 = bVar4;
            nVar = this.f30319b;
        } else {
            bVar2 = bVar4;
            nVar = g6.f30389i;
        }
        b6.n nVar2 = nVar;
        if (z11) {
            j0.b bVar5 = j7.j0.f30006t;
            list = v1.f30113w;
        } else {
            list = g6.f30390j;
        }
        c1 a11 = g6.b(bVar2, longValue, longValue, longValue, 0L, n0Var2, nVar2, list).a(bVar2);
        a11.f30395p = longValue;
        return a11;
    }

    @Override // k4.e1
    public final long getCurrentPosition() {
        t0();
        return d6.g0.S(c0(this.f30333i0));
    }

    @Override // k4.e1
    public final void h(final boolean z10) {
        t0();
        if (this.G != z10) {
            this.G = z10;
            this.f30336k.f30436z.b(12, z10 ? 1 : 0, 0).a();
            o.a<e1.c> aVar = new o.a() { // from class: k4.v
                @Override // d6.o.a
                public final void invoke(Object obj) {
                    ((e1.c) obj).onShuffleModeEnabledChanged(z10);
                }
            };
            d6.o<e1.c> oVar = this.f30338l;
            oVar.c(9, aVar);
            p0();
            oVar.b();
        }
    }

    public final Pair<Object, Long> h0(q1 q1Var, int i10, long j10) {
        if (q1Var.p()) {
            this.f30335j0 = i10;
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                j10 = 0;
            }
            this.f30337k0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= q1Var.o()) {
            i10 = q1Var.a(this.G);
            j10 = d6.g0.S(q1Var.m(i10, this.f30398a).E);
        }
        return q1Var.i(this.f30398a, this.f30340n, i10, d6.g0.J(j10));
    }

    public final void i0(final int i10, final int i11) {
        d6.x xVar = this.X;
        if (i10 != xVar.f27388a || i11 != xVar.f27389b) {
            this.X = new d6.x(i10, i11);
            this.f30338l.e(24, new o.a() { // from class: k4.t
                @Override // d6.o.a
                public final void invoke(Object obj) {
                    ((e1.c) obj).e0(i10, i11);
                }
            });
        }
    }

    @Override // k4.e1
    public final int j() {
        t0();
        if (this.f30333i0.f30382a.p()) {
            return 0;
        }
        c1 c1Var = this.f30333i0;
        return c1Var.f30382a.b(c1Var.f30383b.f29835a);
    }

    public final void j0() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.T;
        b bVar = this.f30349x;
        if (sphericalGLSurfaceView != null) {
            f1 b02 = b0(this.y);
            d6.a.d(!b02.f30460g);
            b02.f30458d = 10000;
            d6.a.d(!b02.f30460g);
            b02.f30459e = null;
            b02.c();
            this.T.f20396s.remove(bVar);
            this.T = null;
        }
        TextureView textureView = this.V;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != bVar) {
                d6.p.f("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.V.setSurfaceTextureListener(null);
            }
            this.V = null;
        }
        SurfaceHolder surfaceHolder = this.S;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(bVar);
            this.S = null;
        }
    }

    @Override // k4.e1
    public final void k(TextureView textureView) {
        t0();
        if (textureView != null && textureView == this.V) {
            Z();
        }
    }

    public final void k0(int i10, int i11, Object obj) {
        for (i1 i1Var : this.f30328g) {
            if (i1Var.x() == i10) {
                f1 b02 = b0(i1Var);
                d6.a.d(!b02.f30460g);
                b02.f30458d = i11;
                d6.a.d(!b02.f30460g);
                b02.f30459e = obj;
                b02.c();
            }
        }
    }

    @Override // k4.e1
    public final e6.n l() {
        t0();
        return this.f30329g0;
    }

    public final void l0(SurfaceHolder surfaceHolder) {
        this.U = false;
        this.S = surfaceHolder;
        surfaceHolder.addCallback(this.f30349x);
        Surface surface = this.S.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.S.getSurfaceFrame();
            i0(surfaceFrame.width(), surfaceFrame.height());
        } else {
            i0(0, 0);
        }
    }

    public final void m0(boolean z10) {
        t0();
        int e10 = this.A.e(v(), z10);
        int i10 = 1;
        if (z10 && e10 != 1) {
            i10 = 2;
        }
        q0(e10, i10, z10);
    }

    public final void n0(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (i1 i1Var : this.f30328g) {
            if (i1Var.x() == 2) {
                f1 b02 = b0(i1Var);
                d6.a.d(!b02.f30460g);
                b02.f30458d = 1;
                d6.a.d(true ^ b02.f30460g);
                b02.f30459e = obj;
                b02.c();
                arrayList.add(b02);
            }
        }
        Object obj2 = this.Q;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((f1) it.next()).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.Q;
            Surface surface = this.R;
            if (obj3 == surface) {
                surface.release();
                this.R = null;
            }
        }
        this.Q = obj;
        if (z10) {
            o0(new m(2, new h0(3), 1003));
        }
    }

    @Override // k4.e1
    public final int o() {
        t0();
        if (c()) {
            return this.f30333i0.f30383b.f29837c;
        }
        return -1;
    }

    public final void o0(m mVar) {
        c1 c1Var = this.f30333i0;
        c1 a10 = c1Var.a(c1Var.f30383b);
        a10.f30395p = a10.f30397r;
        a10.f30396q = 0L;
        boolean z10 = true;
        c1 f = a10.f(1);
        if (mVar != null) {
            f = f.d(mVar);
        }
        c1 c1Var2 = f;
        this.H++;
        this.f30336k.f30436z.d(6).a();
        if (!c1Var2.f30382a.p() || this.f30333i0.f30382a.p()) {
            z10 = false;
        }
        r0(c1Var2, 0, 1, false, z10, 4, c0(c1Var2), -1, false);
    }

    @Override // k4.e1
    public final void p(SurfaceView surfaceView) {
        SurfaceHolder holder;
        t0();
        if (surfaceView instanceof e6.h) {
            j0();
            n0(surfaceView);
            l0(surfaceView.getHolder());
            return;
        }
        boolean z10 = surfaceView instanceof SphericalGLSurfaceView;
        b bVar = this.f30349x;
        if (z10) {
            j0();
            this.T = (SphericalGLSurfaceView) surfaceView;
            f1 b02 = b0(this.y);
            d6.a.d(!b02.f30460g);
            b02.f30458d = 10000;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.T;
            d6.a.d(true ^ b02.f30460g);
            b02.f30459e = sphericalGLSurfaceView;
            b02.c();
            this.T.f20396s.add(bVar);
            n0(this.T.getVideoSurface());
            l0(surfaceView.getHolder());
            return;
        }
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        t0();
        if (holder == null) {
            Z();
            return;
        }
        j0();
        this.U = true;
        this.S = holder;
        holder.addCallback(bVar);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            n0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            i0(surfaceFrame.width(), surfaceFrame.height());
        } else {
            n0(null);
            i0(0, 0);
        }
    }

    public final void p0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        e1.a aVar = this.N;
        int i10 = d6.g0.f27302a;
        e1 e1Var = this.f;
        boolean c10 = e1Var.c();
        boolean u2 = e1Var.u();
        boolean n10 = e1Var.n();
        boolean x10 = e1Var.x();
        boolean R = e1Var.R();
        boolean F = e1Var.F();
        boolean p10 = e1Var.I().p();
        e1.a.C0417a c0417a = new e1.a.C0417a();
        d6.j jVar = this.f30321c.f30412s;
        j.a aVar2 = c0417a.f30413a;
        aVar2.getClass();
        boolean z16 = false;
        for (int i11 = 0; i11 < jVar.b(); i11++) {
            aVar2.a(jVar.a(i11));
        }
        boolean z17 = !c10;
        c0417a.a(4, z17);
        if (u2 && !c10) {
            z10 = true;
        } else {
            z10 = false;
        }
        c0417a.a(5, z10);
        if (n10 && !c10) {
            z11 = true;
        } else {
            z11 = false;
        }
        c0417a.a(6, z11);
        if (!p10 && ((n10 || !R || u2) && !c10)) {
            z12 = true;
        } else {
            z12 = false;
        }
        c0417a.a(7, z12);
        if (x10 && !c10) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0417a.a(8, z13);
        if (!p10 && ((x10 || (R && F)) && !c10)) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0417a.a(9, z14);
        c0417a.a(10, z17);
        if (u2 && !c10) {
            z15 = true;
        } else {
            z15 = false;
        }
        c0417a.a(11, z15);
        if (u2 && !c10) {
            z16 = true;
        }
        c0417a.a(12, z16);
        e1.a aVar3 = new e1.a(aVar2.b());
        this.N = aVar3;
        if (!aVar3.equals(aVar)) {
            this.f30338l.c(13, new u(this));
        }
    }

    @Override // k4.e1
    public final void q(e1.c cVar) {
        cVar.getClass();
        this.f30338l.a(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void q0(int i10, int i11, boolean z10) {
        ?? r32;
        int i12 = 0;
        if (z10 && i10 != -1) {
            r32 = 1;
        } else {
            r32 = 0;
        }
        if (r32 != 0 && i10 != 1) {
            i12 = 1;
        }
        c1 c1Var = this.f30333i0;
        if (c1Var.f30392l == r32 && c1Var.f30393m == i12) {
            return;
        }
        this.H++;
        c1 c10 = c1Var.c(i12, r32);
        f0 f0Var = this.f30336k;
        f0Var.getClass();
        f0Var.f30436z.b(1, r32, i12).a();
        r0(c10, 0, i11, false, false, 5, com.anythink.expressad.exoplayer.b.f7291b, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0(final k4.c1 r39, int r40, int r41, boolean r42, boolean r43, int r44, long r45, int r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.a0.r0(k4.c1, int, int, boolean, boolean, int, long, int, boolean):void");
    }

    @Override // k4.e1
    public final void s(e1.c cVar) {
        t0();
        cVar.getClass();
        d6.o<e1.c> oVar = this.f30338l;
        oVar.f();
        CopyOnWriteArraySet<o.c<e1.c>> copyOnWriteArraySet = oVar.f27333d;
        Iterator<o.c<e1.c>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            o.c<e1.c> next = it.next();
            if (next.f27338a.equals(cVar)) {
                next.f27341d = true;
                if (next.f27340c) {
                    next.f27340c = false;
                    d6.j b10 = next.f27339b.b();
                    oVar.f27332c.d(next.f27338a, b10);
                }
                copyOnWriteArraySet.remove(next);
            }
        }
    }

    public final void s0() {
        int v3 = v();
        t1 t1Var = this.D;
        s1 s1Var = this.C;
        if (v3 != 1) {
            if (v3 != 2 && v3 != 3) {
                if (v3 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                t0();
                boolean z10 = this.f30333i0.o;
                g();
                s1Var.getClass();
                g();
                t1Var.getClass();
                return;
            }
        }
        s1Var.getClass();
        t1Var.getClass();
    }

    @Override // k4.e1
    public final long t() {
        t0();
        if (c()) {
            c1 c1Var = this.f30333i0;
            q1 q1Var = c1Var.f30382a;
            Object obj = c1Var.f30383b.f29835a;
            q1.b bVar = this.f30340n;
            q1Var.g(obj, bVar);
            c1 c1Var2 = this.f30333i0;
            if (c1Var2.f30384c == com.anythink.expressad.exoplayer.b.f7291b) {
                return d6.g0.S(c1Var2.f30382a.m(B(), this.f30398a).E);
            }
            return d6.g0.S(bVar.f30758w) + d6.g0.S(this.f30333i0.f30384c);
        }
        return getCurrentPosition();
    }

    public final void t0() {
        IllegalStateException illegalStateException;
        d6.e eVar = this.f30323d;
        synchronized (eVar) {
            boolean z10 = false;
            while (!eVar.f27296a) {
                try {
                    eVar.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f30344s.getThread()) {
            String l10 = d6.g0.l("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f30344s.getThread().getName());
            if (!this.f30324d0) {
                if (this.f30326e0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                d6.p.g("ExoPlayerImpl", l10, illegalStateException);
                this.f30326e0 = true;
                return;
            }
            throw new IllegalStateException(l10);
        }
    }

    @Override // k4.e1
    public final int v() {
        t0();
        return this.f30333i0.f30386e;
    }

    @Override // k4.e1
    public final r1 w() {
        t0();
        return this.f30333i0.f30389i.f3127d;
    }

    @Override // k4.e1
    public final r5.c y() {
        t0();
        return this.f30322c0;
    }

    @Override // k4.e1
    public final m z() {
        t0();
        return this.f30333i0.f;
    }

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes2.dex */
    public final class b implements e6.m, m4.k, r5.m, c5.d, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.b, c.b, b.InterfaceC0416b, o1.a, n {
        public b() {
        }

        @Override // e6.m
        public final void a(e6.n nVar) {
            a0 a0Var = a0.this;
            a0Var.f30329g0 = nVar;
            a0Var.f30338l.e(25, new b0.b(nVar, 7));
        }

        @Override // e6.m
        public final void b(n4.e eVar) {
            a0.this.f30343r.b(eVar);
        }

        @Override // e6.m
        public final void c(String str) {
            a0.this.f30343r.c(str);
        }

        @Override // e6.m
        public final void d(int i10, long j10) {
            a0.this.f30343r.d(i10, j10);
        }

        @Override // m4.k
        public final void e(i0 i0Var, n4.i iVar) {
            a0 a0Var = a0.this;
            a0Var.getClass();
            a0Var.f30343r.e(i0Var, iVar);
        }

        @Override // e6.m
        public final void f(n4.e eVar) {
            a0 a0Var = a0.this;
            a0Var.getClass();
            a0Var.f30343r.f(eVar);
        }

        @Override // m4.k
        public final void g(String str) {
            a0.this.f30343r.g(str);
        }

        @Override // c5.d
        public final void h(Metadata metadata) {
            a0 a0Var = a0.this;
            o0 o0Var = a0Var.f30331h0;
            o0Var.getClass();
            o0.a aVar = new o0.a(o0Var);
            int i10 = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.f19997s;
                if (i10 >= entryArr.length) {
                    break;
                }
                entryArr[i10].h(aVar);
                i10++;
            }
            a0Var.f30331h0 = new o0(aVar);
            o0 Y = a0Var.Y();
            boolean equals = Y.equals(a0Var.O);
            d6.o<e1.c> oVar = a0Var.f30338l;
            if (!equals) {
                a0Var.O = Y;
                oVar.c(14, new com.applovin.exoplayer2.a.x(this, 5));
            }
            oVar.c(28, new q0.d(metadata, 6));
            oVar.b();
        }

        @Override // e6.m
        public final void i(int i10, long j10) {
            a0.this.f30343r.i(i10, j10);
        }

        @Override // e6.m
        public final void j(long j10, String str, long j11) {
            a0.this.f30343r.j(j10, str, j11);
        }

        @Override // m4.k
        public final void k(long j10, String str, long j11) {
            a0.this.f30343r.k(j10, str, j11);
        }

        @Override // m4.k
        public final void l(final boolean z10) {
            a0 a0Var = a0.this;
            if (a0Var.f30320b0 == z10) {
                return;
            }
            a0Var.f30320b0 = z10;
            a0Var.f30338l.e(23, new o.a() { // from class: k4.c0
                @Override // d6.o.a
                public final void invoke(Object obj) {
                    ((e1.c) obj).l(z10);
                }
            });
        }

        @Override // m4.k
        public final void m(Exception exc) {
            a0.this.f30343r.m(exc);
        }

        @Override // m4.k
        public final void n(long j10) {
            a0.this.f30343r.n(j10);
        }

        @Override // m4.k
        public final void o(n4.e eVar) {
            a0 a0Var = a0.this;
            a0Var.getClass();
            a0Var.f30343r.o(eVar);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            a0 a0Var = a0.this;
            a0Var.getClass();
            Surface surface = new Surface(surfaceTexture);
            a0Var.n0(surface);
            a0Var.R = surface;
            a0Var.i0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            a0 a0Var = a0.this;
            a0Var.n0(null);
            a0Var.i0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            a0.this.i0(i10, i11);
        }

        @Override // m4.k
        public final void p(n4.e eVar) {
            a0.this.f30343r.p(eVar);
        }

        @Override // m4.k
        public final void q(Exception exc) {
            a0.this.f30343r.q(exc);
        }

        @Override // e6.m
        public final void r(Exception exc) {
            a0.this.f30343r.r(exc);
        }

        @Override // e6.m
        public final void s(long j10, Object obj) {
            a0 a0Var = a0.this;
            a0Var.f30343r.s(j10, obj);
            if (a0Var.Q == obj) {
                a0Var.f30338l.e(26, new com.applovin.exoplayer2.d.w(6));
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            a0.this.i0(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            a0 a0Var = a0.this;
            if (a0Var.U) {
                a0Var.n0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            a0 a0Var = a0.this;
            if (a0Var.U) {
                a0Var.n0(null);
            }
            a0Var.i0(0, 0);
        }

        @Override // e6.m
        public final void t(i0 i0Var, n4.i iVar) {
            a0 a0Var = a0.this;
            a0Var.getClass();
            a0Var.f30343r.t(i0Var, iVar);
        }

        @Override // r5.m
        public final void u(r5.c cVar) {
            a0 a0Var = a0.this;
            a0Var.f30322c0 = cVar;
            a0Var.f30338l.e(27, new q0.d(cVar, 7));
        }

        @Override // m4.k
        public final void v(int i10, long j10, long j11) {
            a0.this.f30343r.v(i10, j10, j11);
        }

        @Override // r5.m
        public final void w(j7.j0 j0Var) {
            a0.this.f30338l.e(27, new com.applovin.exoplayer2.h.k0(j0Var, 4));
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.b
        public final void x() {
            a0.this.n0(null);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.b
        public final void y(Surface surface) {
            a0.this.n0(surface);
        }

        @Override // k4.n
        public final void z() {
            a0.this.s0();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
