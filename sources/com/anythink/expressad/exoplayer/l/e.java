package com.anythink.expressad.exoplayer.l;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.anythink.expressad.exoplayer.d.k;
import com.anythink.expressad.exoplayer.k.ad;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.exoplayer.l.h;
import com.anythink.expressad.exoplayer.m;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.vungle.warren.utility.platform.Platform;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes.dex */
public class e extends com.anythink.expressad.exoplayer.f.b {
    private static boolean A = false;

    /* renamed from: s, reason: collision with root package name */
    private static final String f9189s = "MediaCodecVideoRenderer";

    /* renamed from: t, reason: collision with root package name */
    private static final String f9190t = "crop-left";

    /* renamed from: u, reason: collision with root package name */
    private static final String f9191u = "crop-right";

    /* renamed from: v, reason: collision with root package name */
    private static final String f9192v = "crop-bottom";

    /* renamed from: w, reason: collision with root package name */
    private static final String f9193w = "crop-top";

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f9194x = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static final int y = 10;

    /* renamed from: z, reason: collision with root package name */
    private static boolean f9195z;
    private final Context B;
    private final f C;
    private final h.a D;
    private final long E;
    private final int F;
    private final boolean G;
    private final long[] H;
    private final long[] I;
    private a J;
    private boolean K;
    private Surface L;
    private Surface M;
    private int N;
    private boolean O;
    private long P;
    private long Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private long V;
    private int W;
    private float X;
    private int Y;
    private int Z;

    /* renamed from: aa, reason: collision with root package name */
    private int f9196aa;

    /* renamed from: ab, reason: collision with root package name */
    private float f9197ab;

    /* renamed from: ac, reason: collision with root package name */
    private int f9198ac;

    /* renamed from: ad, reason: collision with root package name */
    private int f9199ad;
    private int ae;
    private float af;
    private boolean ag;
    private int ah;
    private long ai;
    private long aj;
    private int ak;

    /* renamed from: r, reason: collision with root package name */
    b f9200r;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f9201a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9202b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9203c;

        public a(int i10, int i11, int i12) {
            this.f9201a = i10;
            this.f9202b = i11;
            this.f9203c = i12;
        }
    }

    @TargetApi(23)
    /* loaded from: classes.dex */
    public final class b implements MediaCodec.OnFrameRenderedListener {
        public /* synthetic */ b(e eVar, MediaCodec mediaCodec, byte b10) {
            this(mediaCodec);
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
            e eVar = e.this;
            if (this != eVar.f9200r) {
                return;
            }
            eVar.C();
        }

        private b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }
    }

    private e(Context context, com.anythink.expressad.exoplayer.f.c cVar) {
        this(context, cVar, (byte) 0);
    }

    private void D() {
        long j10;
        if (this.E > 0) {
            j10 = SystemClock.elapsedRealtime() + this.E;
        } else {
            j10 = com.anythink.expressad.exoplayer.b.f7291b;
        }
        this.Q = j10;
    }

    private void E() {
        MediaCodec y10;
        byte b10 = 0;
        this.O = false;
        if (af.f8993a >= 23 && this.ag && (y10 = y()) != null) {
            this.f9200r = new b(this, y10, b10);
        }
    }

    private void F() {
        if (this.O) {
            this.D.a(this.L);
        }
    }

    private void G() {
        this.f9198ac = -1;
        this.f9199ad = -1;
        this.af = -1.0f;
        this.ae = -1;
    }

    private void H() {
        int i10 = this.Y;
        if (i10 != -1 || this.Z != -1) {
            if (this.f9198ac != i10 || this.f9199ad != this.Z || this.ae != this.f9196aa || this.af != this.f9197ab) {
                this.D.a(i10, this.Z, this.f9196aa, this.f9197ab);
                this.f9198ac = this.Y;
                this.f9199ad = this.Z;
                this.ae = this.f9196aa;
                this.af = this.f9197ab;
            }
        }
    }

    private void I() {
        int i10 = this.f9198ac;
        if (i10 != -1 || this.f9199ad != -1) {
            this.D.a(i10, this.f9199ad, this.ae, this.af);
        }
    }

    private void J() {
        if (this.S > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.D.a(this.S, elapsedRealtime - this.R);
            this.S = 0;
            this.R = elapsedRealtime;
        }
    }

    private static boolean K() {
        if (af.f8993a <= 22 && "foster".equals(af.f8994b) && "NVIDIA".equals(af.f8995c)) {
            return true;
        }
        return false;
    }

    private static boolean d(long j10) {
        return g(j10);
    }

    private static boolean e(long j10) {
        if (j10 < -500000) {
            return true;
        }
        return false;
    }

    private boolean f(long j10) {
        int b10 = b(j10);
        if (b10 == 0) {
            return false;
        }
        ((com.anythink.expressad.exoplayer.f.b) this).f7993q.f7589i++;
        b(this.U + b10);
        B();
        return true;
    }

    private static boolean g(long j10) {
        if (j10 < -30000) {
            return true;
        }
        return false;
    }

    private static boolean h(long j10) {
        if (j10 < -500000) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void A() {
        try {
            super.A();
            this.U = 0;
            Surface surface = this.M;
            if (surface != null) {
                if (this.L == surface) {
                    this.L = null;
                }
                surface.release();
                this.M = null;
            }
        } catch (Throwable th) {
            this.U = 0;
            if (this.M != null) {
                Surface surface2 = this.L;
                Surface surface3 = this.M;
                if (surface2 == surface3) {
                    this.L = null;
                }
                surface3.release();
                this.M = null;
            }
            throw th;
        }
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void B() {
        super.B();
        this.U = 0;
    }

    public final void C() {
        if (!this.O) {
            this.O = true;
            this.D.a(this.L);
        }
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final int a(com.anythink.expressad.exoplayer.f.c cVar, com.anythink.expressad.exoplayer.d.g<k> gVar, m mVar) {
        boolean z10;
        int i10;
        int i11;
        String str = mVar.f9257h;
        if (!o.b(str)) {
            return 0;
        }
        com.anythink.expressad.exoplayer.d.e eVar = mVar.f9260k;
        if (eVar != null) {
            z10 = false;
            for (int i12 = 0; i12 < eVar.f7689b; i12++) {
                z10 |= eVar.a(i12).f7695d;
            }
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.f.a a10 = cVar.a(str, z10);
        if (a10 == null) {
            return (!z10 || cVar.a(str, false) == null) ? 1 : 2;
        }
        if (!com.anythink.expressad.exoplayer.a.a(gVar, eVar)) {
            return 2;
        }
        boolean b10 = a10.b(mVar.f9255e);
        if (b10 && (i10 = mVar.f9262m) > 0 && (i11 = mVar.f9263n) > 0) {
            if (af.f8993a >= 21) {
                b10 = a10.a(i10, i11, mVar.o);
            } else {
                boolean z11 = i10 * i11 <= com.anythink.expressad.exoplayer.f.d.b();
                if (!z11) {
                    Log.d(f9189s, "FalseCheck [legacyFrameSize, " + mVar.f9262m + "x" + mVar.f9263n + "] [" + af.f8997e + "]");
                }
                b10 = z11;
            }
        }
        return (b10 ? 4 : 3) | (a10.f ? 16 : 8) | (a10.f7976g ? 32 : 0);
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void b(m mVar) {
        super.b(mVar);
        this.D.a(mVar);
        this.X = mVar.f9265q;
        this.W = mVar.f9264p;
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void c(long j10) {
        this.U--;
        while (true) {
            int i10 = this.ak;
            if (i10 == 0 || j10 < this.I[0]) {
                return;
            }
            long[] jArr = this.H;
            this.aj = jArr[0];
            int i11 = i10 - 1;
            this.ak = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.I;
            System.arraycopy(jArr2, 1, jArr2, 0, this.ak);
        }
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.a
    public final void n() {
        super.n();
        this.S = 0;
        this.R = SystemClock.elapsedRealtime();
        this.V = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.a
    public final void o() {
        this.Q = com.anythink.expressad.exoplayer.b.f7291b;
        J();
        super.o();
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.a
    public final void p() {
        this.Y = -1;
        this.Z = -1;
        this.f9197ab = -1.0f;
        this.X = -1.0f;
        this.aj = com.anythink.expressad.exoplayer.b.f7291b;
        this.ai = com.anythink.expressad.exoplayer.b.f7291b;
        this.ak = 0;
        G();
        E();
        this.C.b();
        this.f9200r = null;
        this.ag = false;
        try {
            super.p();
        } finally {
            this.D.b(((com.anythink.expressad.exoplayer.f.b) this).f7993q);
        }
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.y
    public final boolean u() {
        Surface surface;
        if (super.u() && (this.O || (((surface = this.M) != null && this.L == surface) || y() == null || this.ag))) {
            this.Q = com.anythink.expressad.exoplayer.b.f7291b;
            return true;
        }
        if (this.Q == com.anythink.expressad.exoplayer.b.f7291b) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Q) {
            return true;
        }
        this.Q = com.anythink.expressad.exoplayer.b.f7291b;
        return false;
    }

    private e(Context context, com.anythink.expressad.exoplayer.f.c cVar, byte b10) {
        this(context, cVar, null, null);
    }

    private e(Context context, com.anythink.expressad.exoplayer.f.c cVar, Handler handler, h hVar) {
        this(context, cVar, 0L, null, handler, hVar, -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, com.anythink.expressad.exoplayer.f.c cVar, long j10, com.anythink.expressad.exoplayer.d.g<k> gVar, Handler handler, h hVar, int i10) {
        super(2, cVar, gVar, false);
        boolean z10 = false;
        this.E = j10;
        this.F = i10;
        Context applicationContext = context.getApplicationContext();
        this.B = applicationContext;
        this.C = new f(applicationContext);
        this.D = new h.a(handler, hVar);
        if (af.f8993a <= 22 && "foster".equals(af.f8994b) && "NVIDIA".equals(af.f8995c)) {
            z10 = true;
        }
        this.G = z10;
        this.H = new long[10];
        this.I = new long[10];
        this.aj = com.anythink.expressad.exoplayer.b.f7291b;
        this.ai = com.anythink.expressad.exoplayer.b.f7291b;
        this.Q = com.anythink.expressad.exoplayer.b.f7291b;
        this.Y = -1;
        this.Z = -1;
        this.f9197ab = -1.0f;
        this.X = -1.0f;
        this.N = 1;
        G();
    }

    private static boolean b(long j10, long j11) {
        return g(j10) && j11 > 100000;
    }

    private void b(MediaCodec mediaCodec, int i10) {
        ad.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        ad.a();
        b(1);
    }

    private void c(MediaCodec mediaCodec, int i10) {
        H();
        ad.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        ad.a();
        this.V = SystemClock.elapsedRealtime() * 1000;
        ((com.anythink.expressad.exoplayer.f.b) this).f7993q.f7586e++;
        this.T = 0;
        C();
    }

    private void b(int i10) {
        com.anythink.expressad.exoplayer.c.d dVar = ((com.anythink.expressad.exoplayer.f.b) this).f7993q;
        dVar.f7587g += i10;
        this.S += i10;
        int i11 = this.T + i10;
        this.T = i11;
        dVar.f7588h = Math.max(i11, dVar.f7588h);
        if (this.S >= this.F) {
            J();
        }
    }

    private boolean b(com.anythink.expressad.exoplayer.f.a aVar) {
        if (af.f8993a < 23 || this.ag || a(aVar.f7973c)) {
            return false;
        }
        return !aVar.f7977h || c.a(this.B);
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.a
    public final void a(boolean z10) {
        super.a(z10);
        int i10 = r().f7260b;
        this.ah = i10;
        this.ag = i10 != 0;
        this.D.a(((com.anythink.expressad.exoplayer.f.b) this).f7993q);
        this.C.a();
    }

    private static int b(com.anythink.expressad.exoplayer.f.a aVar, m mVar) {
        if (mVar.f9258i != -1) {
            int size = mVar.f9259j.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += mVar.f9259j.get(i11).length;
            }
            return mVar.f9258i + i10;
        }
        return a(aVar, mVar.f9257h, mVar.f9262m, mVar.f9263n);
    }

    @Override // com.anythink.expressad.exoplayer.a
    public final void a(m[] mVarArr, long j10) {
        if (this.aj == com.anythink.expressad.exoplayer.b.f7291b) {
            this.aj = j10;
        } else {
            int i10 = this.ak;
            if (i10 == this.H.length) {
                Log.w(f9189s, "Too many stream changes, so dropping offset: " + this.H[this.ak - 1]);
            } else {
                this.ak = i10 + 1;
            }
            long[] jArr = this.H;
            int i11 = this.ak;
            jArr[i11 - 1] = j10;
            this.I[i11 - 1] = this.ai;
        }
        super.a(mVarArr, j10);
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.a
    public final void a(long j10, boolean z10) {
        super.a(j10, z10);
        E();
        this.P = com.anythink.expressad.exoplayer.b.f7291b;
        this.T = 0;
        this.ai = com.anythink.expressad.exoplayer.b.f7291b;
        int i10 = this.ak;
        if (i10 != 0) {
            this.aj = this.H[i10 - 1];
            this.ak = 0;
        }
        if (z10) {
            D();
        } else {
            this.Q = com.anythink.expressad.exoplayer.b.f7291b;
        }
    }

    @Override // com.anythink.expressad.exoplayer.a, com.anythink.expressad.exoplayer.x.b
    public final void a(int i10, Object obj) {
        if (i10 != 1) {
            if (i10 == 4) {
                this.N = ((Integer) obj).intValue();
                MediaCodec y10 = y();
                if (y10 != null) {
                    y10.setVideoScalingMode(this.N);
                    return;
                }
                return;
            }
            super.a(i10, obj);
            return;
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.M;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.anythink.expressad.exoplayer.f.a z10 = z();
                if (z10 != null && b(z10)) {
                    surface = c.a(this.B, z10.f7977h);
                    this.M = surface;
                }
            }
        }
        if (this.L != surface) {
            this.L = surface;
            int a_ = a_();
            if (a_ == 1 || a_ == 2) {
                MediaCodec y11 = y();
                if (af.f8993a >= 23 && y11 != null && surface != null && !this.K) {
                    y11.setOutputSurface(surface);
                } else {
                    A();
                    x();
                }
            }
            if (surface != null && surface != this.M) {
                I();
                E();
                if (a_ == 2) {
                    D();
                    return;
                }
                return;
            }
            G();
            E();
            return;
        }
        if (surface == null || surface == this.M) {
            return;
        }
        I();
        if (this.O) {
            this.D.a(this.L);
        }
    }

    private void a(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.M;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.anythink.expressad.exoplayer.f.a z10 = z();
                if (z10 != null && b(z10)) {
                    surface = c.a(this.B, z10.f7977h);
                    this.M = surface;
                }
            }
        }
        if (this.L != surface) {
            this.L = surface;
            int a_ = a_();
            if (a_ == 1 || a_ == 2) {
                MediaCodec y10 = y();
                if (af.f8993a >= 23 && y10 != null && surface != null && !this.K) {
                    y10.setOutputSurface(surface);
                } else {
                    A();
                    x();
                }
            }
            if (surface != null && surface != this.M) {
                I();
                E();
                if (a_ == 2) {
                    D();
                    return;
                }
                return;
            }
            G();
            E();
            return;
        }
        if (surface == null || surface == this.M) {
            return;
        }
        I();
        if (this.O) {
            this.D.a(this.L);
        }
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final boolean a(com.anythink.expressad.exoplayer.f.a aVar) {
        return this.L != null || b(aVar);
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void a(com.anythink.expressad.exoplayer.f.a aVar, MediaCodec mediaCodec, m mVar, MediaCrypto mediaCrypto) {
        a aVar2;
        m[] q10 = q();
        int i10 = mVar.f9262m;
        int i11 = mVar.f9263n;
        int b10 = b(aVar, mVar);
        byte b11 = 0;
        if (q10.length == 1) {
            aVar2 = new a(i10, i11, b10);
        } else {
            boolean z10 = false;
            for (m mVar2 : q10) {
                if (a(aVar.f, mVar, mVar2)) {
                    int i12 = mVar2.f9262m;
                    z10 |= i12 == -1 || mVar2.f9263n == -1;
                    i10 = Math.max(i10, i12);
                    i11 = Math.max(i11, mVar2.f9263n);
                    b10 = Math.max(b10, b(aVar, mVar2));
                }
            }
            if (z10) {
                Log.w(f9189s, "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
                Point a10 = a(aVar, mVar);
                if (a10 != null) {
                    i10 = Math.max(i10, a10.x);
                    i11 = Math.max(i11, a10.y);
                    b10 = Math.max(b10, a(aVar, mVar.f9257h, i10, i11));
                    Log.w(f9189s, "Codec max resolution adjusted to: " + i10 + "x" + i11);
                }
            }
            aVar2 = new a(i10, i11, b10);
        }
        this.J = aVar2;
        boolean z11 = this.G;
        int i13 = this.ah;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f9257h);
        mediaFormat.setInteger(ContentRecord.WIDTH, mVar.f9262m);
        mediaFormat.setInteger(ContentRecord.HEIGHT, mVar.f9263n);
        com.anythink.expressad.exoplayer.f.e.a(mediaFormat, mVar.f9259j);
        float f = mVar.o;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        com.anythink.expressad.exoplayer.f.e.a(mediaFormat, "rotation-degrees", mVar.f9264p);
        com.anythink.expressad.exoplayer.l.b bVar = mVar.f9268t;
        if (bVar != null) {
            com.anythink.expressad.exoplayer.f.e.a(mediaFormat, "color-transfer", bVar.f9171c);
            com.anythink.expressad.exoplayer.f.e.a(mediaFormat, "color-standard", bVar.f9169a);
            com.anythink.expressad.exoplayer.f.e.a(mediaFormat, "color-range", bVar.f9170b);
            byte[] bArr = bVar.f9172d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        mediaFormat.setInteger("max-width", aVar2.f9201a);
        mediaFormat.setInteger("max-height", aVar2.f9202b);
        com.anythink.expressad.exoplayer.f.e.a(mediaFormat, "max-input-size", aVar2.f9203c);
        int i14 = af.f8993a;
        if (i14 >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z11) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i13 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i13);
        }
        if (this.L == null) {
            com.anythink.expressad.exoplayer.k.a.b(b(aVar));
            if (this.M == null) {
                this.M = c.a(this.B, aVar.f7977h);
            }
            this.L = this.M;
        }
        mediaCodec.configure(mediaFormat, this.L, mediaCrypto, 0);
        if (i14 < 23 || !this.ag) {
            return;
        }
        this.f9200r = new b(this, mediaCodec, b11);
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final int a(com.anythink.expressad.exoplayer.f.a aVar, m mVar, m mVar2) {
        if (!a(aVar.f, mVar, mVar2)) {
            return 0;
        }
        int i10 = mVar2.f9262m;
        a aVar2 = this.J;
        if (i10 > aVar2.f9201a || mVar2.f9263n > aVar2.f9202b || b(aVar, mVar2) > this.J.f9203c) {
            return 0;
        }
        return mVar.b(mVar2) ? 1 : 3;
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void a(String str, long j10, long j11) {
        this.D.a(str, j10, j11);
        this.K = a(str);
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void a(com.anythink.expressad.exoplayer.c.e eVar) {
        this.U++;
        this.ai = Math.max(eVar.f, this.ai);
        if (af.f8993a >= 23 || !this.ag) {
            return;
        }
        C();
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z10 = mediaFormat.containsKey(f9191u) && mediaFormat.containsKey(f9190t) && mediaFormat.containsKey(f9192v) && mediaFormat.containsKey(f9193w);
        if (z10) {
            integer = (mediaFormat.getInteger(f9191u) - mediaFormat.getInteger(f9190t)) + 1;
        } else {
            integer = mediaFormat.getInteger(ContentRecord.WIDTH);
        }
        this.Y = integer;
        if (z10) {
            integer2 = (mediaFormat.getInteger(f9192v) - mediaFormat.getInteger(f9193w)) + 1;
        } else {
            integer2 = mediaFormat.getInteger(ContentRecord.HEIGHT);
        }
        this.Z = integer2;
        float f = this.X;
        this.f9197ab = f;
        if (af.f8993a >= 21) {
            int i10 = this.W;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.Y;
                this.Y = integer2;
                this.Z = i11;
                this.f9197ab = 1.0f / f;
            }
        } else {
            this.f9196aa = this.W;
        }
        mediaCodec.setVideoScalingMode(this.N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if ((g(r8) && r10 - r18.V > 100000) != false) goto L72;
     */
    @Override // com.anythink.expressad.exoplayer.f.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r19, long r21, android.media.MediaCodec r23, java.nio.ByteBuffer r24, int r25, int r26, long r27, boolean r29) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.l.e.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    private void a(MediaCodec mediaCodec, int i10) {
        ad.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        ad.a();
        ((com.anythink.expressad.exoplayer.f.b) this).f7993q.f++;
    }

    @TargetApi(21)
    private void a(MediaCodec mediaCodec, int i10, long j10) {
        H();
        ad.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j10);
        ad.a();
        this.V = SystemClock.elapsedRealtime() * 1000;
        ((com.anythink.expressad.exoplayer.f.b) this).f7993q.f7586e++;
        this.T = 0;
        C();
    }

    @TargetApi(23)
    private static void a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    private static void a(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    @SuppressLint({"InlinedApi"})
    private static MediaFormat a(m mVar, a aVar, boolean z10, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f9257h);
        mediaFormat.setInteger(ContentRecord.WIDTH, mVar.f9262m);
        mediaFormat.setInteger(ContentRecord.HEIGHT, mVar.f9263n);
        com.anythink.expressad.exoplayer.f.e.a(mediaFormat, mVar.f9259j);
        float f = mVar.o;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        com.anythink.expressad.exoplayer.f.e.a(mediaFormat, "rotation-degrees", mVar.f9264p);
        com.anythink.expressad.exoplayer.l.b bVar = mVar.f9268t;
        if (bVar != null) {
            com.anythink.expressad.exoplayer.f.e.a(mediaFormat, "color-transfer", bVar.f9171c);
            com.anythink.expressad.exoplayer.f.e.a(mediaFormat, "color-standard", bVar.f9169a);
            com.anythink.expressad.exoplayer.f.e.a(mediaFormat, "color-range", bVar.f9170b);
            byte[] bArr = bVar.f9172d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        mediaFormat.setInteger("max-width", aVar.f9201a);
        mediaFormat.setInteger("max-height", aVar.f9202b);
        com.anythink.expressad.exoplayer.f.e.a(mediaFormat, "max-input-size", aVar.f9203c);
        if (af.f8993a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z10) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        return mediaFormat;
    }

    private static a a(com.anythink.expressad.exoplayer.f.a aVar, m mVar, m[] mVarArr) {
        int i10 = mVar.f9262m;
        int i11 = mVar.f9263n;
        int b10 = b(aVar, mVar);
        if (mVarArr.length == 1) {
            return new a(i10, i11, b10);
        }
        boolean z10 = false;
        for (m mVar2 : mVarArr) {
            if (a(aVar.f, mVar, mVar2)) {
                int i12 = mVar2.f9262m;
                z10 |= i12 == -1 || mVar2.f9263n == -1;
                i10 = Math.max(i10, i12);
                i11 = Math.max(i11, mVar2.f9263n);
                b10 = Math.max(b10, b(aVar, mVar2));
            }
        }
        if (z10) {
            Log.w(f9189s, "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point a10 = a(aVar, mVar);
            if (a10 != null) {
                i10 = Math.max(i10, a10.x);
                i11 = Math.max(i11, a10.y);
                b10 = Math.max(b10, a(aVar, mVar.f9257h, i10, i11));
                Log.w(f9189s, "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new a(i10, i11, b10);
    }

    private static Point a(com.anythink.expressad.exoplayer.f.a aVar, m mVar) {
        int i10 = mVar.f9263n;
        int i11 = mVar.f9262m;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f = i10 / i12;
        for (int i13 : f9194x) {
            int i14 = (int) (i13 * f);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (af.f8993a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point a10 = aVar.a(i15, i13);
                if (aVar.a(a10.x, a10.y, mVar.o)) {
                    return a10;
                }
            } else {
                int a11 = af.a(i13, 16) * 16;
                int a12 = af.a(i14, 16) * 16;
                if (a11 * a12 <= com.anythink.expressad.exoplayer.f.d.b()) {
                    int i16 = z10 ? a12 : a11;
                    if (!z10) {
                        a11 = a12;
                    }
                    return new Point(i16, a11);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0057. Please report as an issue. */
    private static int a(com.anythink.expressad.exoplayer.f.a aVar, String str, int i10, int i11) {
        char c10;
        int i12;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.getClass();
        int i13 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(o.f9073g)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662541442:
                if (str.equals(o.f9075i)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1187890754:
                if (str.equals(o.f9078l)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1331836730:
                if (str.equals(o.f9074h)) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127256:
                if (str.equals(o.f9076j)) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals(o.f9077k)) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 2:
            case 4:
                i12 = i10 * i11;
                i13 = 2;
                return (i12 * 3) / (i13 * 2);
            case 1:
            case 5:
                i12 = i10 * i11;
                return (i12 * 3) / (i13 * 2);
            case 3:
                String str2 = af.f8996d;
                if ("BRAVIA 4K 2015".equals(str2) || (Platform.MANUFACTURER_AMAZON.equals(af.f8995c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && aVar.f7977h)))) {
                    return -1;
                }
                i12 = af.a(i11, 16) * af.a(i10, 16) * 16 * 16;
                i13 = 2;
                return (i12 * 3) / (i13 * 2);
            default:
                return -1;
        }
    }

    private static boolean a(boolean z10, m mVar, m mVar2) {
        if (mVar.f9257h.equals(mVar2.f9257h) && mVar.f9264p == mVar2.f9264p) {
            return (z10 || (mVar.f9262m == mVar2.f9262m && mVar.f9263n == mVar2.f9263n)) && af.a(mVar.f9268t, mVar2.f9268t);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x05c8 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 2210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.l.e.a(java.lang.String):boolean");
    }
}
