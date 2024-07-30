package com.applovin.exoplayer2.f;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.f.a;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.af;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import com.huawei.hms.ads.br;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.vungle.warren.utility.platform.Platform;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class j extends com.applovin.exoplayer2.e {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f15042b = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private com.applovin.exoplayer2.v A;
    private MediaFormat B;
    private boolean C;
    private float D;
    private ArrayDeque<i> E;
    private a F;
    private i G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private e S;
    private long T;
    private int U;
    private int V;
    private ByteBuffer W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a, reason: collision with root package name */
    protected com.applovin.exoplayer2.c.e f15043a;

    /* renamed from: aa, reason: collision with root package name */
    private boolean f15044aa;

    /* renamed from: ab, reason: collision with root package name */
    private boolean f15045ab;

    /* renamed from: ac, reason: collision with root package name */
    private boolean f15046ac;

    /* renamed from: ad, reason: collision with root package name */
    private int f15047ad;
    private int ae;
    private int af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private long aj;
    private long ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private com.applovin.exoplayer2.p as;
    private long at;
    private long au;
    private int av;

    /* renamed from: c, reason: collision with root package name */
    private final g.b f15048c;

    /* renamed from: d, reason: collision with root package name */
    private final k f15049d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15050e;
    private final float f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.c.g f15051g;

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.exoplayer2.c.g f15052h;

    /* renamed from: i, reason: collision with root package name */
    private final com.applovin.exoplayer2.c.g f15053i;

    /* renamed from: j, reason: collision with root package name */
    private final d f15054j;

    /* renamed from: k, reason: collision with root package name */
    private final af<com.applovin.exoplayer2.v> f15055k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<Long> f15056l;

    /* renamed from: m, reason: collision with root package name */
    private final MediaCodec.BufferInfo f15057m;

    /* renamed from: n, reason: collision with root package name */
    private final long[] f15058n;
    private final long[] o;

    /* renamed from: p, reason: collision with root package name */
    private final long[] f15059p;

    /* renamed from: q, reason: collision with root package name */
    private com.applovin.exoplayer2.v f15060q;

    /* renamed from: r, reason: collision with root package name */
    private com.applovin.exoplayer2.v f15061r;

    /* renamed from: s, reason: collision with root package name */
    private com.applovin.exoplayer2.d.f f15062s;

    /* renamed from: t, reason: collision with root package name */
    private com.applovin.exoplayer2.d.f f15063t;

    /* renamed from: u, reason: collision with root package name */
    private MediaCrypto f15064u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f15065v;

    /* renamed from: w, reason: collision with root package name */
    private long f15066w;

    /* renamed from: x, reason: collision with root package name */
    private float f15067x;
    private float y;

    /* renamed from: z, reason: collision with root package name */
    private g f15068z;

    /* loaded from: classes.dex */
    public static class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f15069a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15070b;

        /* renamed from: c, reason: collision with root package name */
        public final i f15071c;

        /* renamed from: d, reason: collision with root package name */
        public final String f15072d;

        /* renamed from: e, reason: collision with root package name */
        public final a f15073e;

        public a(com.applovin.exoplayer2.v vVar, Throwable th, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + vVar, th, vVar.f16838l, z10, null, a(i10), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(a aVar) {
            return new a(getMessage(), getCause(), this.f15069a, this.f15070b, this.f15071c, this.f15072d, aVar);
        }

        public a(com.applovin.exoplayer2.v vVar, Throwable th, boolean z10, i iVar) {
            this("Decoder init failed: " + iVar.f15032a + ", " + vVar, th, vVar.f16838l, z10, iVar, ai.f16274a >= 21 ? a(th) : null, null);
        }

        private static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private a(String str, Throwable th, String str2, boolean z10, i iVar, String str3, a aVar) {
            super(str, th);
            this.f15069a = str2;
            this.f15070b = z10;
            this.f15071c = iVar;
            this.f15072d = str3;
            this.f15073e = aVar;
        }

        private static String a(int i10) {
            return "com.applovin.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }
    }

    public j(int i10, g.b bVar, k kVar, boolean z10, float f) {
        super(i10);
        this.f15048c = bVar;
        this.f15049d = (k) com.applovin.exoplayer2.l.a.b(kVar);
        this.f15050e = z10;
        this.f = f;
        this.f15051g = com.applovin.exoplayer2.c.g.f();
        this.f15052h = new com.applovin.exoplayer2.c.g(0);
        this.f15053i = new com.applovin.exoplayer2.c.g(2);
        d dVar = new d();
        this.f15054j = dVar;
        this.f15055k = new af<>();
        this.f15056l = new ArrayList<>();
        this.f15057m = new MediaCodec.BufferInfo();
        this.f15067x = 1.0f;
        this.y = 1.0f;
        this.f15066w = com.anythink.expressad.exoplayer.b.f7291b;
        this.f15058n = new long[10];
        this.o = new long[10];
        this.f15059p = new long[10];
        this.at = com.anythink.expressad.exoplayer.b.f7291b;
        this.au = com.anythink.expressad.exoplayer.b.f7291b;
        dVar.f(0);
        dVar.f13645b.order(ByteOrder.nativeOrder());
        this.D = -1.0f;
        this.H = 0;
        this.f15047ad = 0;
        this.U = -1;
        this.V = -1;
        this.T = com.anythink.expressad.exoplayer.b.f7291b;
        this.aj = com.anythink.expressad.exoplayer.b.f7291b;
        this.ak = com.anythink.expressad.exoplayer.b.f7291b;
        this.ae = 0;
        this.af = 0;
    }

    private void B() {
        this.f15045ab = false;
        this.f15054j.a();
        this.f15053i.a();
        this.f15044aa = false;
        this.Z = false;
    }

    private void R() {
        try {
            this.f15068z.d();
        } finally {
            M();
        }
    }

    private boolean S() {
        if (this.V >= 0) {
            return true;
        }
        return false;
    }

    private void T() {
        this.U = -1;
        this.f15052h.f13645b = null;
    }

    private void U() {
        this.V = -1;
        this.W = null;
    }

    private boolean V() throws com.applovin.exoplayer2.p {
        g gVar = this.f15068z;
        if (gVar == null || this.ae == 2 || this.al) {
            return false;
        }
        if (this.U < 0) {
            int b10 = gVar.b();
            this.U = b10;
            if (b10 < 0) {
                return false;
            }
            this.f15052h.f13645b = this.f15068z.a(b10);
            this.f15052h.a();
        }
        if (this.ae == 1) {
            if (!this.R) {
                this.ah = true;
                this.f15068z.a(this.U, 0, 0, 0L, 4);
                T();
            }
            this.ae = 2;
            return false;
        }
        if (this.P) {
            this.P = false;
            ByteBuffer byteBuffer = this.f15052h.f13645b;
            byte[] bArr = f15042b;
            byteBuffer.put(bArr);
            this.f15068z.a(this.U, 0, bArr.length, 0L, 0);
            T();
            this.ag = true;
            return true;
        }
        if (this.f15047ad == 1) {
            for (int i10 = 0; i10 < this.A.f16840n.size(); i10++) {
                this.f15052h.f13645b.put(this.A.f16840n.get(i10));
            }
            this.f15047ad = 2;
        }
        int position = this.f15052h.f13645b.position();
        com.applovin.exoplayer2.w t10 = t();
        try {
            int a10 = a(t10, this.f15052h, 0);
            if (g()) {
                this.ak = this.aj;
            }
            if (a10 == -3) {
                return false;
            }
            if (a10 == -5) {
                if (this.f15047ad == 2) {
                    this.f15052h.a();
                    this.f15047ad = 1;
                }
                a(t10);
                return true;
            }
            if (this.f15052h.c()) {
                if (this.f15047ad == 2) {
                    this.f15052h.a();
                    this.f15047ad = 1;
                }
                this.al = true;
                if (!this.ag) {
                    aa();
                    return false;
                }
                try {
                    if (!this.R) {
                        this.ah = true;
                        this.f15068z.a(this.U, 0, 0, 0L, 4);
                        T();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw a(e10, this.f15060q, com.applovin.exoplayer2.h.b(e10.getErrorCode()));
                }
            }
            if (!this.ag && !this.f15052h.d()) {
                this.f15052h.a();
                if (this.f15047ad == 2) {
                    this.f15047ad = 1;
                }
                return true;
            }
            boolean g6 = this.f15052h.g();
            if (g6) {
                this.f15052h.f13644a.a(position);
            }
            if (this.I && !g6) {
                com.applovin.exoplayer2.l.v.a(this.f15052h.f13645b);
                if (this.f15052h.f13645b.position() == 0) {
                    return true;
                }
                this.I = false;
            }
            com.applovin.exoplayer2.c.g gVar2 = this.f15052h;
            long j10 = gVar2.f13647d;
            e eVar = this.S;
            if (eVar != null) {
                j10 = eVar.a(this.f15060q, gVar2);
                this.aj = Math.max(this.aj, this.S.a(this.f15060q));
            }
            long j11 = j10;
            if (this.f15052h.b()) {
                this.f15056l.add(Long.valueOf(j11));
            }
            if (this.an) {
                this.f15055k.a(j11, (long) this.f15060q);
                this.an = false;
            }
            this.aj = Math.max(this.aj, j11);
            this.f15052h.h();
            if (this.f15052h.e()) {
                b(this.f15052h);
            }
            a(this.f15052h);
            try {
                if (g6) {
                    this.f15068z.a(this.U, 0, this.f15052h.f13644a, j11, 0);
                } else {
                    this.f15068z.a(this.U, 0, this.f15052h.f13645b.limit(), j11, 0);
                }
                T();
                this.ag = true;
                this.f15047ad = 0;
                this.f15043a.f13636c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw a(e11, this.f15060q, com.applovin.exoplayer2.h.b(e11.getErrorCode()));
            }
        } catch (g.a e12) {
            a(e12);
            e(0);
            R();
            return true;
        }
    }

    private boolean W() {
        if (this.ag) {
            this.ae = 1;
            if (!this.J && !this.L) {
                this.af = 1;
            } else {
                this.af = 3;
                return false;
            }
        }
        return true;
    }

    @TargetApi(23)
    private boolean X() throws com.applovin.exoplayer2.p {
        if (this.ag) {
            this.ae = 1;
            if (!this.J && !this.L) {
                this.af = 2;
            } else {
                this.af = 3;
                return false;
            }
        } else {
            ac();
        }
        return true;
    }

    private void Y() throws com.applovin.exoplayer2.p {
        if (this.ag) {
            this.ae = 1;
            this.af = 3;
        } else {
            ab();
        }
    }

    private void Z() {
        this.ai = true;
        MediaFormat c10 = this.f15068z.c();
        if (this.H != 0 && c10.getInteger(ContentRecord.WIDTH) == 32 && c10.getInteger(ContentRecord.HEIGHT) == 32) {
            this.Q = true;
            return;
        }
        if (this.O) {
            c10.setInteger("channel-count", 1);
        }
        this.B = c10;
        this.C = true;
    }

    @TargetApi(23)
    private void aa() throws com.applovin.exoplayer2.p {
        int i10 = this.af;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.am = true;
                    D();
                    return;
                } else {
                    ab();
                    return;
                }
            }
            R();
            ac();
            return;
        }
        R();
    }

    private void ab() throws com.applovin.exoplayer2.p {
        J();
        E();
    }

    private void ac() throws com.applovin.exoplayer2.p {
        try {
            this.f15064u.setMediaDrmSession(c(this.f15063t).f14046c);
            b(this.f15063t);
            this.ae = 0;
            this.af = 0;
        } catch (MediaCryptoException e10) {
            throw a(e10, this.f15060q, 6006);
        }
    }

    private void ad() throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.l.a.b(!this.al);
        com.applovin.exoplayer2.w t10 = t();
        this.f15053i.a();
        do {
            this.f15053i.a();
            int a10 = a(t10, this.f15053i, 0);
            if (a10 != -5) {
                if (a10 != -4) {
                    if (a10 == -3) {
                        return;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    if (this.f15053i.c()) {
                        this.al = true;
                        return;
                    }
                    if (this.an) {
                        com.applovin.exoplayer2.v vVar = (com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(this.f15060q);
                        this.f15061r = vVar;
                        a(vVar, (MediaFormat) null);
                        this.an = false;
                    }
                    this.f15053i.h();
                }
            } else {
                a(t10);
                return;
            }
        } while (this.f15054j.a(this.f15053i));
        this.f15044aa = true;
    }

    private List<i> d(boolean z10) throws l.b {
        List<i> a10 = a(this.f15049d, this.f15060q, z10);
        if (a10.isEmpty() && z10) {
            a10 = a(this.f15049d, this.f15060q, false);
            if (!a10.isEmpty()) {
                com.applovin.exoplayer2.l.q.c("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f15060q.f16838l + ", but no secure decoder available. Trying to proceed with " + a10 + ".");
            }
        }
        return a10;
    }

    private boolean e(int i10) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.w t10 = t();
        this.f15051g.a();
        int a10 = a(t10, this.f15051g, i10 | 4);
        if (a10 == -5) {
            a(t10);
            return true;
        }
        if (a10 != -4 || !this.f15051g.c()) {
            return false;
        }
        this.al = true;
        aa();
        return false;
    }

    private boolean f(long j10) {
        int size = this.f15056l.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f15056l.get(i10).longValue() == j10) {
                this.f15056l.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean g(String str) {
        if (ai.f16274a == 21 && "OMX.google.aac.decoder".equals(str)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return this.am;
    }

    public final void E() throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.v vVar;
        boolean z10;
        if (this.f15068z == null && !this.Z && (vVar = this.f15060q) != null) {
            if (this.f15063t == null && b(vVar)) {
                d(this.f15060q);
                return;
            }
            b(this.f15063t);
            String str = this.f15060q.f16838l;
            com.applovin.exoplayer2.d.f fVar = this.f15062s;
            if (fVar != null) {
                if (this.f15064u == null) {
                    com.applovin.exoplayer2.d.n c10 = c(fVar);
                    if (c10 == null) {
                        if (this.f15062s.e() == null) {
                            return;
                        }
                    } else {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(c10.f14045b, c10.f14046c);
                            this.f15064u = mediaCrypto;
                            if (!c10.f14047d && mediaCrypto.requiresSecureDecoderComponent(str)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f15065v = z10;
                        } catch (MediaCryptoException e10) {
                            throw a(e10, this.f15060q, 6006);
                        }
                    }
                }
                if (com.applovin.exoplayer2.d.n.f14044a) {
                    int c11 = this.f15062s.c();
                    if (c11 != 1) {
                        if (c11 != 4) {
                            return;
                        }
                    } else {
                        f.a aVar = (f.a) com.applovin.exoplayer2.l.a.b(this.f15062s.e());
                        throw a(aVar, this.f15060q, aVar.f14029a);
                    }
                }
            }
            try {
                a(this.f15064u, this.f15065v);
            } catch (a e11) {
                throw a(e11, this.f15060q, br.f21566i);
            }
        }
    }

    public boolean F() {
        return false;
    }

    public final g G() {
        return this.f15068z;
    }

    public final MediaFormat H() {
        return this.B;
    }

    public final i I() {
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void J() {
        try {
            g gVar = this.f15068z;
            if (gVar != null) {
                gVar.e();
                this.f15043a.f13635b++;
                a(this.G.f15032a);
            }
            this.f15068z = null;
            try {
                MediaCrypto mediaCrypto = this.f15064u;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f15068z = null;
            try {
                MediaCrypto mediaCrypto2 = this.f15064u;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public final boolean K() throws com.applovin.exoplayer2.p {
        boolean L = L();
        if (L) {
            E();
        }
        return L;
    }

    public boolean L() {
        if (this.f15068z == null) {
            return false;
        }
        if (this.af != 3 && !this.J && ((!this.K || this.ai) && (!this.L || !this.ah))) {
            R();
            return false;
        }
        J();
        return true;
    }

    public void M() {
        T();
        U();
        this.T = com.anythink.expressad.exoplayer.b.f7291b;
        this.ah = false;
        this.ag = false;
        this.P = false;
        this.Q = false;
        this.X = false;
        this.Y = false;
        this.f15056l.clear();
        this.aj = com.anythink.expressad.exoplayer.b.f7291b;
        this.ak = com.anythink.expressad.exoplayer.b.f7291b;
        e eVar = this.S;
        if (eVar != null) {
            eVar.a();
        }
        this.ae = 0;
        this.af = 0;
        this.f15047ad = this.f15046ac ? 1 : 0;
    }

    public void N() {
        M();
        this.as = null;
        this.S = null;
        this.E = null;
        this.G = null;
        this.A = null;
        this.B = null;
        this.C = false;
        this.ai = false;
        this.D = -1.0f;
        this.H = 0;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.R = false;
        this.f15046ac = false;
        this.f15047ad = 0;
        this.f15065v = false;
    }

    public float O() {
        return this.f15067x;
    }

    public final void P() {
        this.ao = true;
    }

    public final long Q() {
        return this.au;
    }

    public float a(float f, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v[] vVarArr) {
        return -1.0f;
    }

    public abstract int a(k kVar, com.applovin.exoplayer2.v vVar) throws l.b;

    public abstract g.a a(i iVar, com.applovin.exoplayer2.v vVar, MediaCrypto mediaCrypto, float f);

    public abstract List<i> a(k kVar, com.applovin.exoplayer2.v vVar, boolean z10) throws l.b;

    public abstract boolean a(long j10, long j11, g gVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, com.applovin.exoplayer2.v vVar) throws com.applovin.exoplayer2.p;

    public void b(com.applovin.exoplayer2.c.g gVar) throws com.applovin.exoplayer2.p {
    }

    public void c(boolean z10) {
        this.ar = z10;
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.as
    public final int o() {
        return 8;
    }

    @Override // com.applovin.exoplayer2.e
    public void r() {
        this.f15060q = null;
        this.at = com.anythink.expressad.exoplayer.b.f7291b;
        this.au = com.anythink.expressad.exoplayer.b.f7291b;
        this.av = 0;
        L();
    }

    @Override // com.applovin.exoplayer2.e
    public void s() {
        try {
            B();
            J();
        } finally {
            a((com.applovin.exoplayer2.d.f) null);
        }
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        if (this.f15060q != null && (x() || S() || (this.T != com.anythink.expressad.exoplayer.b.f7291b && SystemClock.elapsedRealtime() < this.T))) {
            return true;
        }
        return false;
    }

    public void a(com.applovin.exoplayer2.c.g gVar) throws com.applovin.exoplayer2.p {
    }

    public boolean b(com.applovin.exoplayer2.v vVar) {
        return false;
    }

    public final void c(long j10) throws com.applovin.exoplayer2.p {
        boolean z10;
        com.applovin.exoplayer2.v a10 = this.f15055k.a(j10);
        if (a10 == null && this.C) {
            a10 = this.f15055k.c();
        }
        if (a10 != null) {
            this.f15061r = a10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.C && this.f15061r != null)) {
            a(this.f15061r, this.B);
            this.C = false;
        }
    }

    public void a(com.applovin.exoplayer2.v vVar, MediaFormat mediaFormat) throws com.applovin.exoplayer2.p {
    }

    public void b(boolean z10) {
        this.aq = z10;
    }

    private void b(com.applovin.exoplayer2.d.f fVar) {
        com.applovin.exoplayer2.d.f.a(this.f15062s, fVar);
        this.f15062s = fVar;
    }

    private static boolean f(String str) {
        if (ai.f16274a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(ai.f16276c)) {
            String str2 = ai.f16275b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public void a(Exception exc) {
    }

    public void a(String str) {
    }

    private boolean b(long j10, long j11) throws com.applovin.exoplayer2.p {
        boolean z10;
        boolean a10;
        g gVar;
        ByteBuffer byteBuffer;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        int a11;
        if (!S()) {
            if (this.M && this.ah) {
                try {
                    a11 = this.f15068z.a(this.f15057m);
                } catch (IllegalStateException unused) {
                    aa();
                    if (this.am) {
                        J();
                    }
                    return false;
                }
            } else {
                a11 = this.f15068z.a(this.f15057m);
            }
            if (a11 < 0) {
                if (a11 == -2) {
                    Z();
                    return true;
                }
                if (this.R && (this.al || this.ae == 2)) {
                    aa();
                }
                return false;
            }
            if (this.Q) {
                this.Q = false;
                this.f15068z.a(a11, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f15057m;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                aa();
                return false;
            }
            this.V = a11;
            ByteBuffer b10 = this.f15068z.b(a11);
            this.W = b10;
            if (b10 != null) {
                b10.position(this.f15057m.offset);
                ByteBuffer byteBuffer2 = this.W;
                MediaCodec.BufferInfo bufferInfo3 = this.f15057m;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.N) {
                MediaCodec.BufferInfo bufferInfo4 = this.f15057m;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j12 = this.aj;
                    if (j12 != com.anythink.expressad.exoplayer.b.f7291b) {
                        bufferInfo4.presentationTimeUs = j12;
                    }
                }
            }
            this.X = f(this.f15057m.presentationTimeUs);
            long j13 = this.ak;
            long j14 = this.f15057m.presentationTimeUs;
            this.Y = j13 == j14;
            c(j14);
        }
        if (this.M && this.ah) {
            try {
                gVar = this.f15068z;
                byteBuffer = this.W;
                i10 = this.V;
                bufferInfo = this.f15057m;
                z10 = false;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                a10 = a(j10, j11, gVar, byteBuffer, i10, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.X, this.Y, this.f15061r);
            } catch (IllegalStateException unused3) {
                aa();
                if (this.am) {
                    J();
                }
                return z10;
            }
        } else {
            z10 = false;
            g gVar2 = this.f15068z;
            ByteBuffer byteBuffer3 = this.W;
            int i11 = this.V;
            MediaCodec.BufferInfo bufferInfo5 = this.f15057m;
            a10 = a(j10, j11, gVar2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.X, this.Y, this.f15061r);
        }
        if (a10) {
            d(this.f15057m.presentationTimeUs);
            boolean z11 = (this.f15057m.flags & 4) != 0 ? true : z10;
            U();
            if (!z11) {
                return true;
            }
            aa();
        }
        return z10;
    }

    public void a(String str, long j10, long j11) {
    }

    public boolean a(i iVar) {
        return true;
    }

    private void d(com.applovin.exoplayer2.v vVar) {
        B();
        String str = vVar.f16838l;
        if (!com.anythink.expressad.exoplayer.k.o.f9083r.equals(str) && !com.anythink.expressad.exoplayer.k.o.f9085t.equals(str) && !com.anythink.expressad.exoplayer.k.o.H.equals(str)) {
            this.f15054j.g(1);
        } else {
            this.f15054j.g(32);
        }
        this.Z = true;
    }

    private boolean e(long j10) {
        return this.f15066w == com.anythink.expressad.exoplayer.b.f7291b || SystemClock.elapsedRealtime() - j10 < this.f15066w;
    }

    public void a(boolean z10) {
        this.ap = z10;
    }

    public static boolean c(com.applovin.exoplayer2.v vVar) {
        int i10 = vVar.E;
        return i10 == 0 || i10 == 2;
    }

    @Override // com.applovin.exoplayer2.as
    public final int a(com.applovin.exoplayer2.v vVar) throws com.applovin.exoplayer2.p {
        try {
            return a(this.f15049d, vVar);
        } catch (l.b e10) {
            throw a(e10, vVar, 4002);
        }
    }

    private com.applovin.exoplayer2.d.n c(com.applovin.exoplayer2.d.f fVar) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.c.b g6 = fVar.g();
        if (g6 != null && !(g6 instanceof com.applovin.exoplayer2.d.n)) {
            throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + g6), this.f15060q, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
        }
        return (com.applovin.exoplayer2.d.n) g6;
    }

    private boolean e(com.applovin.exoplayer2.v vVar) throws com.applovin.exoplayer2.p {
        if (ai.f16274a >= 23 && this.f15068z != null && this.af != 3 && d_() != 0) {
            float a10 = a(this.y, vVar, u());
            float f = this.D;
            if (f == a10) {
                return true;
            }
            if (a10 == -1.0f) {
                Y();
                return false;
            }
            if (f == -1.0f && a10 <= this.f) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", a10);
            this.f15068z.a(bundle);
            this.D = a10;
        }
        return true;
    }

    public final void a(com.applovin.exoplayer2.p pVar) {
        this.as = pVar;
    }

    @Override // com.applovin.exoplayer2.e
    public void a(boolean z10, boolean z11) throws com.applovin.exoplayer2.p {
        this.f15043a = new com.applovin.exoplayer2.c.e();
    }

    @Override // com.applovin.exoplayer2.e
    public void a(com.applovin.exoplayer2.v[] vVarArr, long j10, long j11) throws com.applovin.exoplayer2.p {
        if (this.au == com.anythink.expressad.exoplayer.b.f7291b) {
            com.applovin.exoplayer2.l.a.b(this.at == com.anythink.expressad.exoplayer.b.f7291b);
            this.at = j10;
            this.au = j11;
            return;
        }
        int i10 = this.av;
        if (i10 == this.o.length) {
            com.applovin.exoplayer2.l.q.c("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.o[this.av - 1]);
        } else {
            this.av = i10 + 1;
        }
        long[] jArr = this.f15058n;
        int i11 = this.av;
        jArr[i11 - 1] = j10;
        this.o[i11 - 1] = j11;
        this.f15059p[i11 - 1] = this.aj;
    }

    private boolean c(long j10, long j11) throws com.applovin.exoplayer2.p {
        boolean z10;
        com.applovin.exoplayer2.l.a.b(!this.am);
        if (this.f15054j.l()) {
            d dVar = this.f15054j;
            if (!a(j10, j11, null, dVar.f13645b, this.V, 0, dVar.k(), this.f15054j.i(), this.f15054j.b(), this.f15054j.c(), this.f15061r)) {
                return false;
            }
            d(this.f15054j.j());
            this.f15054j.a();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.al) {
            this.am = true;
            return z10;
        }
        if (this.f15044aa) {
            com.applovin.exoplayer2.l.a.b(this.f15054j.a(this.f15053i));
            this.f15044aa = z10;
        }
        if (this.f15045ab) {
            if (this.f15054j.l()) {
                return true;
            }
            B();
            this.f15045ab = z10;
            E();
            if (!this.Z) {
                return z10;
            }
        }
        ad();
        if (this.f15054j.l()) {
            this.f15054j.h();
        }
        if (this.f15054j.l() || this.al || this.f15045ab) {
            return true;
        }
        return z10;
    }

    public void d(long j10) {
        while (true) {
            int i10 = this.av;
            if (i10 == 0 || j10 < this.f15059p[0]) {
                return;
            }
            long[] jArr = this.f15058n;
            this.at = jArr[0];
            this.au = this.o[0];
            int i11 = i10 - 1;
            this.av = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.o;
            System.arraycopy(jArr2, 1, jArr2, 0, this.av);
            long[] jArr3 = this.f15059p;
            System.arraycopy(jArr3, 1, jArr3, 0, this.av);
            C();
        }
    }

    private static boolean e(String str) {
        int i10 = ai.f16274a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = ai.f16275b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) throws com.applovin.exoplayer2.p {
        this.al = false;
        this.am = false;
        this.ao = false;
        if (this.Z) {
            this.f15054j.a();
            this.f15053i.a();
            this.f15044aa = false;
        } else {
            K();
        }
        if (this.f15055k.b() > 0) {
            this.an = true;
        }
        this.f15055k.a();
        int i10 = this.av;
        if (i10 != 0) {
            this.au = this.o[i10 - 1];
            this.at = this.f15058n[i10 - 1];
            this.av = 0;
        }
    }

    private static boolean d(String str) {
        return ai.f16274a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public void C() {
    }

    public void D() throws com.applovin.exoplayer2.p {
    }

    @Override // com.applovin.exoplayer2.e
    public void p() {
    }

    @Override // com.applovin.exoplayer2.e
    public void q() {
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(float f, float f10) throws com.applovin.exoplayer2.p {
        this.f15067x = f;
        this.y = f10;
        e(this.A);
    }

    private static boolean c(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private int c(String str) {
        int i10 = ai.f16274a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = ai.f16277d;
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
        String str3 = ai.f16275b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j10, long j11) throws com.applovin.exoplayer2.p {
        boolean z10 = false;
        if (this.ao) {
            this.ao = false;
            aa();
        }
        com.applovin.exoplayer2.p pVar = this.as;
        if (pVar == null) {
            try {
                if (this.am) {
                    D();
                    return;
                }
                if (this.f15060q != null || e(2)) {
                    E();
                    if (this.Z) {
                        ah.a("bypassRender");
                        do {
                        } while (c(j10, j11));
                        ah.a();
                    } else if (this.f15068z != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        ah.a("drainAndFeed");
                        while (b(j10, j11) && e(elapsedRealtime)) {
                        }
                        while (V() && e(elapsedRealtime)) {
                        }
                        ah.a();
                    } else {
                        this.f15043a.f13637d += b(j10);
                        e(1);
                    }
                    this.f15043a.a();
                    return;
                }
                return;
            } catch (IllegalStateException e10) {
                if (a(e10)) {
                    a((Exception) e10);
                    if (ai.f16274a >= 21 && c(e10)) {
                        z10 = true;
                    }
                    if (z10) {
                        J();
                    }
                    throw a(a(e10, I()), this.f15060q, z10, 4003);
                }
                throw e10;
            }
        }
        this.as = null;
        throw pVar;
    }

    private static boolean b(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean b(String str) {
        int i10 = ai.f16274a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && ai.f16277d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean b(i iVar) {
        String str = iVar.f15032a;
        int i10 = ai.f16274a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || (Platform.MANUFACTURER_AMAZON.equals(ai.f16276c) && "AFTS".equals(ai.f16277d) && iVar.f15037g));
    }

    private static boolean b(String str, com.applovin.exoplayer2.v vVar) {
        return ai.f16274a <= 18 && vVar.y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public h a(Throwable th, i iVar) {
        return new h(th, iVar);
    }

    private void a(MediaCrypto mediaCrypto, boolean z10) throws a {
        if (this.E == null) {
            try {
                List<i> d10 = d(z10);
                ArrayDeque<i> arrayDeque = new ArrayDeque<>();
                this.E = arrayDeque;
                if (this.f15050e) {
                    arrayDeque.addAll(d10);
                } else if (!d10.isEmpty()) {
                    this.E.add(d10.get(0));
                }
                this.F = null;
            } catch (l.b e10) {
                throw new a(this.f15060q, e10, z10, -49998);
            }
        }
        if (!this.E.isEmpty()) {
            while (this.f15068z == null) {
                i peekFirst = this.E.peekFirst();
                if (!a(peekFirst)) {
                    return;
                }
                try {
                    a(peekFirst, mediaCrypto);
                } catch (Exception e11) {
                    com.applovin.exoplayer2.l.q.b("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, e11);
                    this.E.removeFirst();
                    a aVar = new a(this.f15060q, e11, z10, peekFirst);
                    a(aVar);
                    if (this.F != null) {
                        this.F = this.F.a(aVar);
                    } else {
                        this.F = aVar;
                    }
                    if (this.E.isEmpty()) {
                        throw this.F;
                    }
                }
            }
            this.E = null;
            return;
        }
        throw new a(this.f15060q, (Throwable) null, z10, -49999);
    }

    private void a(i iVar, MediaCrypto mediaCrypto) throws Exception {
        g b10;
        String str = iVar.f15032a;
        int i10 = ai.f16274a;
        float a10 = i10 < 23 ? -1.0f : a(this.y, this.f15060q, u());
        float f = a10 > this.f ? a10 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ah.a("createCodec:" + str);
        g.a a11 = a(iVar, this.f15060q, mediaCrypto, f);
        if (this.ap && i10 >= 23) {
            b10 = new a.C0171a(a(), this.aq, this.ar).b(a11);
        } else {
            b10 = this.f15048c.b(a11);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.f15068z = b10;
        this.G = iVar;
        this.D = f;
        this.A = this.f15060q;
        this.H = c(str);
        this.I = a(str, this.A);
        this.J = b(str);
        this.K = d(str);
        this.L = e(str);
        this.M = g(str);
        this.N = f(str);
        this.O = b(str, this.A);
        this.R = b(iVar) || F();
        if (b10.a()) {
            this.f15046ac = true;
            this.f15047ad = 1;
            this.P = this.H != 0;
        }
        if ("c2.android.mp3.decoder".equals(iVar.f15032a)) {
            this.S = new e();
        }
        if (d_() == 2) {
            this.T = SystemClock.elapsedRealtime() + 1000;
        }
        this.f15043a.f13634a++;
        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }

    private void a(com.applovin.exoplayer2.d.f fVar) {
        com.applovin.exoplayer2.d.f.a(this.f15063t, fVar);
        this.f15063t = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (X() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b2, code lost:
    
        if (X() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.w r12) throws com.applovin.exoplayer2.p {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.j.a(com.applovin.exoplayer2.w):com.applovin.exoplayer2.c.h");
    }

    public com.applovin.exoplayer2.c.h a(i iVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v vVar2) {
        return new com.applovin.exoplayer2.c.h(iVar.f15032a, vVar, vVar2, 0, 1);
    }

    private boolean a(i iVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.d.f fVar, com.applovin.exoplayer2.d.f fVar2) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.d.n c10;
        if (fVar == fVar2) {
            return false;
        }
        if (fVar2 == null || fVar == null || ai.f16274a < 23) {
            return true;
        }
        UUID uuid = com.applovin.exoplayer2.h.f15243e;
        if (uuid.equals(fVar.f()) || uuid.equals(fVar2.f()) || (c10 = c(fVar2)) == null) {
            return true;
        }
        return !iVar.f15037g && (c10.f14047d ? false : fVar2.a(vVar.f16838l));
    }

    private static boolean a(IllegalStateException illegalStateException) {
        if (ai.f16274a >= 21 && b(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean a(String str, com.applovin.exoplayer2.v vVar) {
        return ai.f16274a < 21 && vVar.f16840n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }
}
