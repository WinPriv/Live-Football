package com.anythink.expressad.exoplayer.f;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.anythink.expressad.exoplayer.d.f;
import com.anythink.expressad.exoplayer.d.g;
import com.anythink.expressad.exoplayer.d.k;
import com.anythink.expressad.exoplayer.f.d;
import com.anythink.expressad.exoplayer.k.ad;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.m;
import com.anythink.expressad.exoplayer.n;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.vungle.warren.utility.platform.Platform;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* loaded from: classes.dex */
public abstract class b extends com.anythink.expressad.exoplayer.a {
    private static final int A = 1;
    private static final int B = 2;
    private static final byte[] C = af.g("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private static final int D = 32;

    /* renamed from: n, reason: collision with root package name */
    protected static final int f7979n = 0;
    protected static final int o = 1;

    /* renamed from: p, reason: collision with root package name */
    protected static final int f7980p = 3;

    /* renamed from: r, reason: collision with root package name */
    private static final String f7981r = "MediaCodecRenderer";

    /* renamed from: s, reason: collision with root package name */
    private static final long f7982s = 1000;

    /* renamed from: t, reason: collision with root package name */
    private static final int f7983t = 0;

    /* renamed from: u, reason: collision with root package name */
    private static final int f7984u = 1;

    /* renamed from: v, reason: collision with root package name */
    private static final int f7985v = 2;

    /* renamed from: w, reason: collision with root package name */
    private static final int f7986w = 0;

    /* renamed from: x, reason: collision with root package name */
    private static final int f7987x = 1;
    private static final int y = 2;

    /* renamed from: z, reason: collision with root package name */
    private static final int f7988z = 0;
    private final com.anythink.expressad.exoplayer.f.c E;
    private final g<k> F;
    private final boolean G;
    private final com.anythink.expressad.exoplayer.c.e H;
    private final com.anythink.expressad.exoplayer.c.e I;
    private final n J;
    private final List<Long> K;
    private final MediaCodec.BufferInfo L;
    private m M;
    private f<k> N;
    private f<k> O;
    private MediaCodec P;
    private com.anythink.expressad.exoplayer.f.a Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: aa, reason: collision with root package name */
    private ByteBuffer[] f7989aa;

    /* renamed from: ab, reason: collision with root package name */
    private ByteBuffer[] f7990ab;

    /* renamed from: ac, reason: collision with root package name */
    private long f7991ac;

    /* renamed from: ad, reason: collision with root package name */
    private int f7992ad;
    private int ae;
    private ByteBuffer af;
    private boolean ag;
    private boolean ah;
    private int ai;
    private int aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;

    /* renamed from: q, reason: collision with root package name */
    protected com.anythink.expressad.exoplayer.c.d f7993q;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    public b(int i10, com.anythink.expressad.exoplayer.f.c cVar, g<k> gVar, boolean z10) {
        super(i10);
        boolean z11;
        if (af.f8993a >= 16) {
            z11 = true;
        } else {
            z11 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z11);
        this.E = (com.anythink.expressad.exoplayer.f.c) com.anythink.expressad.exoplayer.k.a.a(cVar);
        this.F = gVar;
        this.G = false;
        this.H = new com.anythink.expressad.exoplayer.c.e(0);
        this.I = com.anythink.expressad.exoplayer.c.e.e();
        this.J = new n();
        this.K = new ArrayList();
        this.L = new MediaCodec.BufferInfo();
        this.ai = 0;
        this.aj = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean C() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.f.b.C():boolean");
    }

    private void D() {
        if (af.f8993a < 21) {
            this.f7989aa = this.P.getInputBuffers();
            this.f7990ab = this.P.getOutputBuffers();
        }
    }

    private void E() {
        if (af.f8993a < 21) {
            this.f7989aa = null;
            this.f7990ab = null;
        }
    }

    private boolean F() {
        if (this.ae >= 0) {
            return true;
        }
        return false;
    }

    private void G() {
        this.f7992ad = -1;
        this.H.f7594e = null;
    }

    private void H() {
        this.ae = -1;
        this.af = null;
    }

    private static long I() {
        return 0L;
    }

    private void J() {
        MediaFormat outputFormat = this.P.getOutputFormat();
        if (this.R != 0 && outputFormat.getInteger(ContentRecord.WIDTH) == 32 && outputFormat.getInteger(ContentRecord.HEIGHT) == 32) {
            this.Z = true;
            return;
        }
        if (this.X) {
            outputFormat.setInteger("channel-count", 1);
        }
        a(this.P, outputFormat);
    }

    private void K() {
        if (af.f8993a < 21) {
            this.f7990ab = this.P.getOutputBuffers();
        }
    }

    private void L() {
        if (this.aj == 2) {
            A();
            x();
        } else {
            this.an = true;
            w();
        }
    }

    private static boolean M() {
        if (Platform.MANUFACTURER_AMAZON.equals(af.f8995c)) {
            String str = af.f8996d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private ByteBuffer b(int i10) {
        if (af.f8993a >= 21) {
            return this.P.getInputBuffer(i10);
        }
        return this.f7989aa[i10];
    }

    private boolean d(long j10) {
        int size = this.K.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.K.get(i10).longValue() == j10) {
                this.K.remove(i10);
                return true;
            }
        }
        return false;
    }

    public void A() {
        this.f7991ac = com.anythink.expressad.exoplayer.b.f7291b;
        G();
        H();
        this.ao = false;
        this.ag = false;
        this.K.clear();
        if (af.f8993a < 21) {
            this.f7989aa = null;
            this.f7990ab = null;
        }
        this.Q = null;
        this.ah = false;
        this.ak = false;
        this.S = false;
        this.T = false;
        this.R = 0;
        this.U = false;
        this.V = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.al = false;
        this.ai = 0;
        this.aj = 0;
        MediaCodec mediaCodec = this.P;
        if (mediaCodec != null) {
            this.f7993q.f7583b++;
            try {
                mediaCodec.stop();
                try {
                    this.P.release();
                    this.P = null;
                    f<k> fVar = this.N;
                    if (fVar != null && this.O != fVar) {
                        try {
                            this.F.a(fVar);
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    this.P = null;
                    f<k> fVar2 = this.N;
                    if (fVar2 != null && this.O != fVar2) {
                        try {
                            this.F.a(fVar2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.P.release();
                    this.P = null;
                    f<k> fVar3 = this.N;
                    if (fVar3 != null && this.O != fVar3) {
                        try {
                            this.F.a(fVar3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.P = null;
                    f<k> fVar4 = this.N;
                    if (fVar4 != null && this.O != fVar4) {
                        try {
                            this.F.a(fVar4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void B() {
        this.f7991ac = com.anythink.expressad.exoplayer.b.f7291b;
        G();
        H();
        this.ap = true;
        this.ao = false;
        this.ag = false;
        this.K.clear();
        this.Y = false;
        this.Z = false;
        if (!this.T && (!this.V || !this.al)) {
            if (this.aj != 0) {
                A();
                x();
            } else {
                this.P.flush();
                this.ak = false;
            }
        } else {
            A();
            x();
        }
        if (this.ah && this.M != null) {
            this.ai = 1;
        }
    }

    public int a(com.anythink.expressad.exoplayer.f.a aVar, m mVar, m mVar2) {
        return 0;
    }

    public abstract int a(com.anythink.expressad.exoplayer.f.c cVar, g<k> gVar, m mVar);

    public abstract void a(com.anythink.expressad.exoplayer.f.a aVar, MediaCodec mediaCodec, m mVar, MediaCrypto mediaCrypto);

    public abstract boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10);

    public void c(long j10) {
    }

    @Override // com.anythink.expressad.exoplayer.a, com.anythink.expressad.exoplayer.z
    public final int m() {
        return 8;
    }

    @Override // com.anythink.expressad.exoplayer.a
    public void p() {
        this.M = null;
        try {
            A();
            try {
                f<k> fVar = this.N;
                if (fVar != null) {
                    this.F.a(fVar);
                }
                try {
                    f<k> fVar2 = this.O;
                    if (fVar2 != null && fVar2 != this.N) {
                        this.F.a(fVar2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    f<k> fVar3 = this.O;
                    if (fVar3 != null && fVar3 != this.N) {
                        this.F.a(fVar3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.N != null) {
                    this.F.a(this.N);
                }
                try {
                    f<k> fVar4 = this.O;
                    if (fVar4 != null && fVar4 != this.N) {
                        this.F.a(fVar4);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    f<k> fVar5 = this.O;
                    if (fVar5 != null && fVar5 != this.N) {
                        this.F.a(fVar5);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.y
    public boolean u() {
        if (this.M != null && !this.ao) {
            if (!t() && !F()) {
                if (this.f7991ac != com.anythink.expressad.exoplayer.b.f7291b && SystemClock.elapsedRealtime() < this.f7991ac) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public boolean v() {
        return this.an;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:34|(2:38|(21:46|47|(1:124)(1:53)|54|(1:123)(1:68)|69|(1:122)(1:75)|76|(1:115)(1:80)|81|(1:107)(1:85)|86|(1:92)|93|94|95|(1:97)|99|(1:101)(1:104)|102|103))|125|(2:131|(27:139|47|(1:49)|124|54|(1:57)|123|69|(2:71|73)|116|122|76|(1:78)|115|81|(1:83)|107|86|(3:88|90|92)|93|94|95|(0)|99|(0)(0)|102|103))|140|47|(0)|124|54|(0)|123|69|(0)|116|122|76|(0)|115|81|(0)|107|86|(0)|93|94|95|(0)|99|(0)(0)|102|103) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0277, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0278, code lost:
    
        a(new com.anythink.expressad.exoplayer.f.b.C0103b(r15.M, r2, r1, r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0266 A[Catch: Exception -> 0x0277, TRY_LEAVE, TryCatch #1 {Exception -> 0x0277, blocks: (B:95:0x0221, B:97:0x0266), top: B:94:0x0221 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.f.b.x():void");
    }

    public final MediaCodec y() {
        return this.P;
    }

    public final com.anythink.expressad.exoplayer.f.a z() {
        return this.Q;
    }

    /* renamed from: com.anythink.expressad.exoplayer.f.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0103b extends Exception {

        /* renamed from: e, reason: collision with root package name */
        private static final int f7994e = -50000;
        private static final int f = -49999;

        /* renamed from: g, reason: collision with root package name */
        private static final int f7995g = -49998;

        /* renamed from: a, reason: collision with root package name */
        public final String f7996a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7997b;

        /* renamed from: c, reason: collision with root package name */
        public final String f7998c;

        /* renamed from: d, reason: collision with root package name */
        public final String f7999d;

        public C0103b(m mVar, Throwable th, boolean z10, int i10) {
            super("Decoder init failed: [" + i10 + "], " + mVar, th);
            this.f7996a = mVar.f9257h;
            this.f7997b = z10;
            this.f7998c = null;
            this.f7999d = "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        @TargetApi(21)
        private static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private static String a(int i10) {
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        public C0103b(m mVar, Throwable th, boolean z10, String str) {
            super("Decoder init failed: " + str + ", " + mVar, th);
            this.f7996a = mVar.f9257h;
            this.f7997b = z10;
            this.f7998c = str;
            String str2 = null;
            if (af.f8993a >= 21 && (th instanceof MediaCodec.CodecException)) {
                str2 = ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            this.f7999d = str2;
        }
    }

    private ByteBuffer c(int i10) {
        if (af.f8993a >= 21) {
            return this.P.getOutputBuffer(i10);
        }
        return this.f7990ab[i10];
    }

    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    public void a(com.anythink.expressad.exoplayer.c.e eVar) {
    }

    private boolean b(boolean z10) {
        f<k> fVar = this.N;
        if (fVar == null || (!z10 && this.G)) {
            return false;
        }
        int e10 = fVar.e();
        if (e10 != 1) {
            return e10 != 4;
        }
        throw com.anythink.expressad.exoplayer.g.a(this.N.f(), s());
    }

    private static boolean d(String str) {
        return af.f8993a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public void a(String str, long j10, long j11) {
    }

    private static boolean c(String str) {
        int i10 = af.f8993a;
        if (i10 <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i10 > 19 || !"hb2000".equals(af.f8994b)) {
            return false;
        }
        return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
    }

    public boolean a(com.anythink.expressad.exoplayer.f.a aVar) {
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.z
    public final int a(m mVar) {
        try {
            return a(this.E, this.F, mVar);
        } catch (d.b e10) {
            throw com.anythink.expressad.exoplayer.g.a(e10, s());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r6.f9263n == r0.f9263n) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.anythink.expressad.exoplayer.m r6) {
        /*
            r5 = this;
            com.anythink.expressad.exoplayer.m r0 = r5.M
            r5.M = r6
            com.anythink.expressad.exoplayer.d.e r6 = r6.f9260k
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            com.anythink.expressad.exoplayer.d.e r2 = r0.f9260k
        Ld:
            boolean r6 = com.anythink.expressad.exoplayer.k.af.a(r6, r2)
            r2 = 1
            r6 = r6 ^ r2
            if (r6 == 0) goto L49
            com.anythink.expressad.exoplayer.m r6 = r5.M
            com.anythink.expressad.exoplayer.d.e r6 = r6.f9260k
            if (r6 == 0) goto L47
            com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> r6 = r5.F
            if (r6 == 0) goto L37
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.anythink.expressad.exoplayer.m r3 = r5.M
            com.anythink.expressad.exoplayer.d.e r3 = r3.f9260k
            com.anythink.expressad.exoplayer.d.f r6 = r6.a(r1, r3)
            r5.O = r6
            com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.k> r1 = r5.N
            if (r6 != r1) goto L49
            com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> r1 = r5.F
            r1.a(r6)
            goto L49
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.s()
            com.anythink.expressad.exoplayer.g r6 = com.anythink.expressad.exoplayer.g.a(r6, r0)
            throw r6
        L47:
            r5.O = r1
        L49:
            com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.k> r6 = r5.O
            com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.k> r1 = r5.N
            r3 = 0
            if (r6 != r1) goto L87
            android.media.MediaCodec r6 = r5.P
            if (r6 == 0) goto L87
            com.anythink.expressad.exoplayer.f.a r6 = r5.Q
            com.anythink.expressad.exoplayer.m r1 = r5.M
            int r6 = r5.a(r6, r0, r1)
            if (r6 == 0) goto L87
            if (r6 == r2) goto L86
            r1 = 3
            if (r6 != r1) goto L80
            r5.ah = r2
            r5.ai = r2
            int r6 = r5.R
            r1 = 2
            if (r6 == r1) goto L7c
            if (r6 != r2) goto L7d
            com.anythink.expressad.exoplayer.m r6 = r5.M
            int r1 = r6.f9262m
            int r4 = r0.f9262m
            if (r1 != r4) goto L7d
            int r6 = r6.f9263n
            int r0 = r0.f9263n
            if (r6 != r0) goto L7d
        L7c:
            r3 = r2
        L7d:
            r5.Y = r3
            goto L86
        L80:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L86:
            r3 = r2
        L87:
            if (r3 != 0) goto L96
            boolean r6 = r5.ak
            if (r6 == 0) goto L90
            r5.aj = r2
            return
        L90:
            r5.A()
            r5.x()
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.f.b.b(com.anythink.expressad.exoplayer.m):void");
    }

    public com.anythink.expressad.exoplayer.f.a a(com.anythink.expressad.exoplayer.f.c cVar, m mVar, boolean z10) {
        return cVar.a(mVar.f9257h, z10);
    }

    private void a(C0103b c0103b) {
        throw com.anythink.expressad.exoplayer.g.a(c0103b, s());
    }

    @Override // com.anythink.expressad.exoplayer.a
    public void a(boolean z10) {
        this.f7993q = new com.anythink.expressad.exoplayer.c.d();
    }

    @Override // com.anythink.expressad.exoplayer.a
    public void a(long j10, boolean z10) {
        this.am = false;
        this.an = false;
        if (this.P != null) {
            B();
        }
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final void a(long j10, long j11) {
        if (this.an) {
            w();
            return;
        }
        if (this.M == null) {
            this.I.a();
            int a10 = a(this.J, this.I, true);
            if (a10 != -5) {
                if (a10 == -4) {
                    com.anythink.expressad.exoplayer.k.a.b(this.I.c());
                    this.am = true;
                    L();
                    return;
                }
                return;
            }
            b(this.J.f9274a);
        }
        x();
        if (this.P != null) {
            ad.a("drainAndFeed");
            do {
            } while (b(j10, j11));
            do {
            } while (C());
            ad.a();
            return;
        }
        com.anythink.expressad.exoplayer.c.d dVar = this.f7993q;
        dVar.f7585d = b(j10) + dVar.f7585d;
        this.I.a();
        int a11 = a(this.J, this.I, false);
        if (a11 == -5) {
            b(this.J.f9274a);
        } else if (a11 == -4) {
            com.anythink.expressad.exoplayer.k.a.b(this.I.c());
            this.am = true;
            L();
        }
    }

    @Override // com.anythink.expressad.exoplayer.a
    public void n() {
    }

    @Override // com.anythink.expressad.exoplayer.a
    public void o() {
    }

    public void w() {
    }

    private boolean b(long j10, long j11) {
        boolean a10;
        int dequeueOutputBuffer;
        ByteBuffer byteBuffer;
        boolean z10;
        if (!F()) {
            if (this.W && this.al) {
                try {
                    dequeueOutputBuffer = this.P.dequeueOutputBuffer(this.L, 0L);
                } catch (IllegalStateException unused) {
                    L();
                    if (this.an) {
                        A();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.P.dequeueOutputBuffer(this.L, 0L);
            }
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.P.getOutputFormat();
                    if (this.R != 0 && outputFormat.getInteger(ContentRecord.WIDTH) == 32 && outputFormat.getInteger(ContentRecord.HEIGHT) == 32) {
                        this.Z = true;
                    } else {
                        if (this.X) {
                            outputFormat.setInteger("channel-count", 1);
                        }
                        a(this.P, outputFormat);
                    }
                    return true;
                }
                if (dequeueOutputBuffer == -3) {
                    if (af.f8993a < 21) {
                        this.f7990ab = this.P.getOutputBuffers();
                    }
                    return true;
                }
                if (this.U && (this.am || this.aj == 2)) {
                    L();
                }
                return false;
            }
            if (this.Z) {
                this.Z = false;
                this.P.releaseOutputBuffer(dequeueOutputBuffer, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.L;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                L();
                return false;
            }
            this.ae = dequeueOutputBuffer;
            if (af.f8993a >= 21) {
                byteBuffer = this.P.getOutputBuffer(dequeueOutputBuffer);
            } else {
                byteBuffer = this.f7990ab[dequeueOutputBuffer];
            }
            this.af = byteBuffer;
            if (byteBuffer != null) {
                byteBuffer.position(this.L.offset);
                ByteBuffer byteBuffer2 = this.af;
                MediaCodec.BufferInfo bufferInfo2 = this.L;
                byteBuffer2.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j12 = this.L.presentationTimeUs;
            int size = this.K.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                if (this.K.get(i10).longValue() == j12) {
                    this.K.remove(i10);
                    z10 = true;
                    break;
                }
                i10++;
            }
            this.ag = z10;
        }
        if (this.W && this.al) {
            try {
                MediaCodec mediaCodec = this.P;
                ByteBuffer byteBuffer3 = this.af;
                int i11 = this.ae;
                MediaCodec.BufferInfo bufferInfo3 = this.L;
                a10 = a(j10, j11, mediaCodec, byteBuffer3, i11, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.ag);
            } catch (IllegalStateException unused2) {
                L();
                if (this.an) {
                    A();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.P;
            ByteBuffer byteBuffer4 = this.af;
            int i12 = this.ae;
            MediaCodec.BufferInfo bufferInfo4 = this.L;
            a10 = a(j10, j11, mediaCodec2, byteBuffer4, i12, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.ag);
        }
        if (a10) {
            c(this.L.presentationTimeUs);
            boolean z11 = (this.L.flags & 4) != 0;
            H();
            if (!z11) {
                return true;
            }
            L();
        }
        return false;
    }

    private static MediaCodec.CryptoInfo a(com.anythink.expressad.exoplayer.c.e eVar, int i10) {
        MediaCodec.CryptoInfo a10 = eVar.f7593d.a();
        if (i10 == 0) {
            return a10;
        }
        if (a10.numBytesOfClearData == null) {
            a10.numBytesOfClearData = new int[1];
        }
        int[] iArr = a10.numBytesOfClearData;
        iArr[0] = iArr[0] + i10;
        return a10;
    }

    private static boolean a(String str) {
        int i10 = af.f8993a;
        if (i10 < 18) {
            return true;
        }
        if (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (i10 == 19 && af.f8996d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    private static boolean a(String str, m mVar) {
        return af.f8993a < 21 && mVar.f9259j.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static int b(String str) {
        int i10 = af.f8993a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = af.f8996d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = af.f8994b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean b(com.anythink.expressad.exoplayer.f.a aVar) {
        String str = aVar.f7973c;
        if (af.f8993a > 17 || !("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str))) {
            return Platform.MANUFACTURER_AMAZON.equals(af.f8995c) && "AFTS".equals(af.f8996d) && aVar.f7977h;
        }
        return true;
    }

    private static boolean b(String str, m mVar) {
        return af.f8993a <= 18 && mVar.f9269u == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }
}
