package com.applovin.exoplayer2.m;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.t;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.m.n;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import com.google.android.gms.common.Scopes;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class h extends com.applovin.exoplayer2.f.j {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f16466c = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: d, reason: collision with root package name */
    private static boolean f16467d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f16468e;
    private int A;
    private long B;
    private long C;
    private long D;
    private int E;
    private int F;
    private int G;
    private int H;
    private float I;
    private o J;
    private boolean K;
    private int L;
    private l M;

    /* renamed from: b, reason: collision with root package name */
    b f16469b;
    private final Context f;

    /* renamed from: g, reason: collision with root package name */
    private final m f16470g;

    /* renamed from: h, reason: collision with root package name */
    private final n.a f16471h;

    /* renamed from: i, reason: collision with root package name */
    private final long f16472i;

    /* renamed from: j, reason: collision with root package name */
    private final int f16473j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f16474k;

    /* renamed from: l, reason: collision with root package name */
    private a f16475l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16476m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16477n;
    private Surface o;

    /* renamed from: p, reason: collision with root package name */
    private d f16478p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16479q;

    /* renamed from: r, reason: collision with root package name */
    private int f16480r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f16481s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f16482t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f16483u;

    /* renamed from: v, reason: collision with root package name */
    private long f16484v;

    /* renamed from: w, reason: collision with root package name */
    private long f16485w;

    /* renamed from: x, reason: collision with root package name */
    private long f16486x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private int f16487z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16488a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16489b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16490c;

        public a(int i10, int i11, int i12) {
            this.f16488a = i10;
            this.f16489b = i11;
            this.f16490c = i12;
        }
    }

    public h(Context context, com.applovin.exoplayer2.f.k kVar, long j10, boolean z10, Handler handler, n nVar, int i10) {
        this(context, g.b.f15029a, kVar, j10, z10, handler, nVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        P();
    }

    private void S() {
        long j10;
        if (this.f16472i > 0) {
            j10 = SystemClock.elapsedRealtime() + this.f16472i;
        } else {
            j10 = com.anythink.expressad.exoplayer.b.f7291b;
        }
        this.f16485w = j10;
    }

    private void T() {
        com.applovin.exoplayer2.f.g G;
        this.f16481s = false;
        if (ai.f16274a >= 23 && this.K && (G = G()) != null) {
            this.f16469b = new b(G);
        }
    }

    private void U() {
        if (this.f16479q) {
            this.f16471h.a(this.o);
        }
    }

    private void V() {
        this.J = null;
    }

    private void W() {
        int i10 = this.F;
        if (i10 != -1 || this.G != -1) {
            o oVar = this.J;
            if (oVar == null || oVar.f16539b != i10 || oVar.f16540c != this.G || oVar.f16541d != this.H || oVar.f16542e != this.I) {
                o oVar2 = new o(this.F, this.G, this.H, this.I);
                this.J = oVar2;
                this.f16471h.a(oVar2);
            }
        }
    }

    private void X() {
        o oVar = this.J;
        if (oVar != null) {
            this.f16471h.a(oVar);
        }
    }

    private void Y() {
        if (this.y > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f16471h.a(this.y, elapsedRealtime - this.f16486x);
            this.y = 0;
            this.f16486x = elapsedRealtime;
        }
    }

    private void Z() {
        int i10 = this.E;
        if (i10 != 0) {
            this.f16471h.a(this.D, i10);
            this.D = 0L;
            this.E = 0;
        }
    }

    private static boolean aa() {
        return "NVIDIA".equals(ai.f16276c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x07cd, code lost:
    
        if (r0.equals("NX573J") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x082f, code lost:
    
        if (r0.equals("AFTN") == false) goto L610;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x0818. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean ab() {
        /*
            Method dump skipped, instructions count: 3044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.h.ab():boolean");
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

    public void B() {
        this.f16483u = true;
        if (!this.f16481s) {
            this.f16481s = true;
            this.f16471h.a(this.o);
            this.f16479q = true;
        }
    }

    @Override // com.applovin.exoplayer2.f.j
    public void C() {
        super.C();
        T();
    }

    @Override // com.applovin.exoplayer2.f.j
    public boolean F() {
        if (this.K && ai.f16274a < 23) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.f.j
    public void M() {
        super.M();
        this.A = 0;
    }

    @Override // com.applovin.exoplayer2.f.j
    @TargetApi(29)
    public void b(com.applovin.exoplayer2.c.g gVar) throws com.applovin.exoplayer2.p {
        if (this.f16477n) {
            ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(gVar.f13648e);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a(G(), bArr);
                }
            }
        }
    }

    public void c(com.applovin.exoplayer2.f.g gVar, int i10, long j10) {
        W();
        ah.a("releaseOutputBuffer");
        gVar.a(i10, true);
        ah.a();
        this.C = SystemClock.elapsedRealtime() * 1000;
        ((com.applovin.exoplayer2.f.j) this).f15043a.f13638e++;
        this.f16487z = 0;
        B();
    }

    @Override // com.applovin.exoplayer2.f.j
    public void d(long j10) {
        super.d(j10);
        if (!this.K) {
            this.A--;
        }
    }

    public void e(long j10) throws com.applovin.exoplayer2.p {
        c(j10);
        W();
        ((com.applovin.exoplayer2.f.j) this).f15043a.f13638e++;
        B();
        d(j10);
    }

    public void f(long j10) {
        ((com.applovin.exoplayer2.f.j) this).f15043a.a(j10);
        this.D += j10;
        this.E++;
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void p() {
        super.p();
        this.y = 0;
        this.f16486x = SystemClock.elapsedRealtime();
        this.C = SystemClock.elapsedRealtime() * 1000;
        this.D = 0L;
        this.E = 0;
        this.f16470g.b();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void q() {
        this.f16485w = com.anythink.expressad.exoplayer.b.f7291b;
        Y();
        Z();
        this.f16470g.d();
        super.q();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void r() {
        V();
        T();
        this.f16479q = false;
        this.f16470g.e();
        this.f16469b = null;
        try {
            super.r();
        } finally {
            this.f16471h.b(((com.applovin.exoplayer2.f.j) this).f15043a);
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    @TargetApi(17)
    public void s() {
        try {
            super.s();
            d dVar = this.f16478p;
            if (dVar != null) {
                if (this.o == dVar) {
                    this.o = null;
                }
                dVar.release();
                this.f16478p = null;
            }
        } catch (Throwable th) {
            if (this.f16478p != null) {
                Surface surface = this.o;
                d dVar2 = this.f16478p;
                if (surface == dVar2) {
                    this.o = null;
                }
                dVar2.release();
                this.f16478p = null;
            }
            throw th;
        }
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.ar
    public boolean z() {
        d dVar;
        if (super.z() && (this.f16481s || (((dVar = this.f16478p) != null && this.o == dVar) || G() == null || this.K))) {
            this.f16485w = com.anythink.expressad.exoplayer.b.f7291b;
            return true;
        }
        if (this.f16485w == com.anythink.expressad.exoplayer.b.f7291b) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f16485w) {
            return true;
        }
        this.f16485w = com.anythink.expressad.exoplayer.b.f7291b;
        return false;
    }

    public h(Context context, g.b bVar, com.applovin.exoplayer2.f.k kVar, long j10, boolean z10, Handler handler, n nVar, int i10) {
        super(2, bVar, kVar, z10, 30.0f);
        this.f16472i = j10;
        this.f16473j = i10;
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        this.f16470g = new m(applicationContext);
        this.f16471h = new n.a(handler, nVar);
        this.f16474k = aa();
        this.f16485w = com.anythink.expressad.exoplayer.b.f7291b;
        this.F = -1;
        this.G = -1;
        this.I = -1.0f;
        this.f16480r = 1;
        this.L = 0;
        V();
    }

    @Override // com.applovin.exoplayer2.f.j
    public int a(com.applovin.exoplayer2.f.k kVar, v vVar) throws l.b {
        int i10 = 0;
        if (!u.b(vVar.f16838l)) {
            return as.b(0);
        }
        boolean z10 = vVar.o != null;
        List<com.applovin.exoplayer2.f.i> a10 = a(kVar, vVar, z10, false);
        if (z10 && a10.isEmpty()) {
            a10 = a(kVar, vVar, false, false);
        }
        if (a10.isEmpty()) {
            return as.b(1);
        }
        if (!com.applovin.exoplayer2.f.j.c(vVar)) {
            return as.b(2);
        }
        com.applovin.exoplayer2.f.i iVar = a10.get(0);
        boolean a11 = iVar.a(vVar);
        int i11 = iVar.c(vVar) ? 16 : 8;
        if (a11) {
            List<com.applovin.exoplayer2.f.i> a12 = a(kVar, vVar, z10, true);
            if (!a12.isEmpty()) {
                com.applovin.exoplayer2.f.i iVar2 = a12.get(0);
                if (iVar2.a(vVar) && iVar2.c(vVar)) {
                    i10 = 32;
                }
            }
        }
        return as.a(a11 ? 4 : 3, i11, i10);
    }

    /* loaded from: classes.dex */
    public final class b implements Handler.Callback, g.c {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f16492b;

        public b(com.applovin.exoplayer2.f.g gVar) {
            Handler a10 = ai.a((Handler.Callback) this);
            this.f16492b = a10;
            gVar.a(this, a10);
        }

        @Override // com.applovin.exoplayer2.f.g.c
        public void a(com.applovin.exoplayer2.f.g gVar, long j10, long j11) {
            if (ai.f16274a < 30) {
                this.f16492b.sendMessageAtFrontOfQueue(Message.obtain(this.f16492b, 0, (int) (j10 >> 32), (int) j10));
            } else {
                a(j10);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(ai.b(message.arg1, message.arg2));
            return true;
        }

        private void a(long j10) {
            h hVar = h.this;
            if (this != hVar.f16469b) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                hVar.R();
                return;
            }
            try {
                hVar.e(j10);
            } catch (com.applovin.exoplayer2.p e10) {
                h.this.a(e10);
            }
        }
    }

    public void e(int i10) {
        com.applovin.exoplayer2.c.e eVar = ((com.applovin.exoplayer2.f.j) this).f15043a;
        eVar.f13639g += i10;
        this.y += i10;
        int i11 = this.f16487z + i10;
        this.f16487z = i11;
        eVar.f13640h = Math.max(i11, eVar.f13640h);
        int i12 = this.f16473j;
        if (i12 <= 0 || this.y < i12) {
            return;
        }
        Y();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0070, code lost:
    
        if (r3.equals(com.anythink.expressad.exoplayer.k.o.f9075i) == false) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x007d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int c(com.applovin.exoplayer2.f.i r10, com.applovin.exoplayer2.v r11) {
        /*
            int r0 = r11.f16842q
            int r1 = r11.f16843r
            r2 = -1
            if (r0 == r2) goto Lc1
            if (r1 != r2) goto Lb
            goto Lc1
        Lb:
            java.lang.String r3 = r11.f16838l
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            r6 = 1
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L34
            android.util.Pair r11 = com.applovin.exoplayer2.f.l.a(r11)
            if (r11 == 0) goto L33
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r11 == r3) goto L31
            if (r11 == r6) goto L31
            if (r11 != r8) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = r7
        L34:
            r3.getClass()
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L73;
                case -1662541442: goto L6c;
                case 1187890754: goto L61;
                case 1331836730: goto L58;
                case 1599127256: goto L4d;
                case 1599127257: goto L42;
                default: goto L40;
            }
        L40:
            r6 = r2
            goto L7d
        L42:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L4b
            goto L40
        L4b:
            r6 = 5
            goto L7d
        L4d:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L56
            goto L40
        L56:
            r6 = r4
            goto L7d
        L58:
            boolean r11 = r3.equals(r5)
            if (r11 != 0) goto L5f
            goto L40
        L5f:
            r6 = r9
            goto L7d
        L61:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L6a
            goto L40
        L6a:
            r6 = r8
            goto L7d
        L6c:
            boolean r11 = r3.equals(r7)
            if (r11 != 0) goto L7d
            goto L40
        L73:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L7c
            goto L40
        L7c:
            r6 = 0
        L7d:
            switch(r6) {
                case 0: goto Lbb;
                case 1: goto Lb9;
                case 2: goto Lbb;
                case 3: goto L81;
                case 4: goto Lbb;
                case 5: goto Lb9;
                default: goto L80;
            }
        L80:
            return r2
        L81:
            java.lang.String r11 = com.applovin.exoplayer2.l.ai.f16277d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lb8
            java.lang.String r3 = "Amazon"
            java.lang.String r4 = com.applovin.exoplayer2.l.ai.f16276c
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Laa
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lb8
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto Laa
            boolean r10 = r10.f15037g
            if (r10 == 0) goto Laa
            goto Lb8
        Laa:
            r10 = 16
            int r11 = com.applovin.exoplayer2.l.ai.a(r0, r10)
            int r0 = com.applovin.exoplayer2.l.ai.a(r1, r10)
            int r0 = r0 * r11
            int r0 = r0 * r10
            int r0 = r0 * r10
            goto Lbc
        Lb8:
            return r2
        Lb9:
            int r0 = r0 * r1
            goto Lbd
        Lbb:
            int r0 = r0 * r1
        Lbc:
            r4 = r8
        Lbd:
            int r0 = r0 * r9
            int r4 = r4 * r8
            int r0 = r0 / r4
            return r0
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.h.c(com.applovin.exoplayer2.f.i, com.applovin.exoplayer2.v):int");
    }

    public boolean b(long j10, long j11, boolean z10) {
        return h(j10) && !z10;
    }

    public boolean b(long j10, long j11) {
        return g(j10) && j11 > 100000;
    }

    public void b(com.applovin.exoplayer2.f.g gVar, int i10, long j10) {
        ah.a("dropVideoBuffer");
        gVar.a(i10, false);
        ah.a();
        e(1);
    }

    public boolean b(long j10, boolean z10) throws com.applovin.exoplayer2.p {
        int b10 = b(j10);
        if (b10 == 0) {
            return false;
        }
        com.applovin.exoplayer2.c.e eVar = ((com.applovin.exoplayer2.f.j) this).f15043a;
        eVar.f13641i++;
        int i10 = this.A + b10;
        if (z10) {
            eVar.f += i10;
        } else {
            e(i10);
        }
        K();
        return true;
    }

    @Override // com.applovin.exoplayer2.f.j
    public List<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.k kVar, v vVar, boolean z10) throws l.b {
        return a(kVar, vVar, z10, this.K);
    }

    private static List<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.k kVar, v vVar, boolean z10, boolean z11) throws l.b {
        Pair<Integer, Integer> a10;
        String str = vVar.f16838l;
        if (str == null) {
            return Collections.emptyList();
        }
        List<com.applovin.exoplayer2.f.i> a11 = com.applovin.exoplayer2.f.l.a(kVar.getDecoderInfos(str, z10, z11), vVar);
        if ("video/dolby-vision".equals(str) && (a10 = com.applovin.exoplayer2.f.l.a(vVar)) != null) {
            int intValue = ((Integer) a10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                a11.addAll(kVar.getDecoderInfos(com.anythink.expressad.exoplayer.k.o.f9075i, z10, z11));
            } else if (intValue == 512) {
                a11.addAll(kVar.getDecoderInfos(com.anythink.expressad.exoplayer.k.o.f9074h, z10, z11));
            }
        }
        return Collections.unmodifiableList(a11);
    }

    private boolean b(com.applovin.exoplayer2.f.i iVar) {
        return ai.f16274a >= 23 && !this.K && !b(iVar.f15032a) && (!iVar.f15037g || d.a(this.f));
    }

    private static Point b(com.applovin.exoplayer2.f.i iVar, v vVar) {
        int i10 = vVar.f16843r;
        int i11 = vVar.f16842q;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f = i10 / i12;
        for (int i13 : f16466c) {
            int i14 = (int) (i13 * f);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (ai.f16274a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point a10 = iVar.a(i15, i13);
                if (iVar.a(a10.x, a10.y, vVar.f16844s)) {
                    return a10;
                }
            } else {
                try {
                    int a11 = ai.a(i13, 16) * 16;
                    int a12 = ai.a(i14, 16) * 16;
                    if (a11 * a12 <= com.applovin.exoplayer2.f.l.b()) {
                        int i16 = z10 ? a12 : a11;
                        if (!z10) {
                            a11 = a12;
                        }
                        return new Point(i16, a11);
                    }
                } catch (l.b unused) {
                }
            }
        }
        return null;
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void a(boolean z10, boolean z11) throws com.applovin.exoplayer2.p {
        super.a(z10, z11);
        boolean z12 = v().f13250b;
        com.applovin.exoplayer2.l.a.b((z12 && this.L == 0) ? false : true);
        if (this.K != z12) {
            this.K = z12;
            J();
        }
        this.f16471h.a(((com.applovin.exoplayer2.f.j) this).f15043a);
        this.f16470g.a();
        this.f16482t = z11;
        this.f16483u = false;
    }

    public boolean b(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!f16467d) {
                f16468e = ab();
                f16467d = true;
            }
        }
        return f16468e;
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) throws com.applovin.exoplayer2.p {
        super.a(j10, z10);
        T();
        this.f16470g.c();
        this.B = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16484v = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16487z = 0;
        if (z10) {
            S();
        } else {
            this.f16485w = com.anythink.expressad.exoplayer.b.f7291b;
        }
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ao.b
    public void a(int i10, Object obj) throws com.applovin.exoplayer2.p {
        if (i10 == 1) {
            a(obj);
            return;
        }
        if (i10 == 7) {
            this.M = (l) obj;
            return;
        }
        if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.L != intValue) {
                this.L = intValue;
                if (this.K) {
                    J();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.a(i10, obj);
                return;
            } else {
                this.f16470g.a(((Integer) obj).intValue());
                return;
            }
        }
        this.f16480r = ((Integer) obj).intValue();
        com.applovin.exoplayer2.f.g G = G();
        if (G != null) {
            G.c(this.f16480r);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.applovin.exoplayer2.m.h, com.applovin.exoplayer2.e, com.applovin.exoplayer2.f.j] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void a(Object obj) throws com.applovin.exoplayer2.p {
        d dVar = obj instanceof Surface ? (Surface) obj : null;
        if (dVar == null) {
            d dVar2 = this.f16478p;
            if (dVar2 != null) {
                dVar = dVar2;
            } else {
                com.applovin.exoplayer2.f.i I = I();
                if (I != null && b(I)) {
                    dVar = d.a(this.f, I.f15037g);
                    this.f16478p = dVar;
                }
            }
        }
        if (this.o != dVar) {
            this.o = dVar;
            this.f16470g.a(dVar);
            this.f16479q = false;
            int d_ = d_();
            com.applovin.exoplayer2.f.g G = G();
            if (G != null) {
                if (ai.f16274a >= 23 && dVar != null && !this.f16476m) {
                    a(G, dVar);
                } else {
                    J();
                    E();
                }
            }
            if (dVar != null && dVar != this.f16478p) {
                X();
                T();
                if (d_ == 2) {
                    S();
                    return;
                }
                return;
            }
            V();
            T();
            return;
        }
        if (dVar == null || dVar == this.f16478p) {
            return;
        }
        X();
        U();
    }

    @Override // com.applovin.exoplayer2.f.j
    public boolean a(com.applovin.exoplayer2.f.i iVar) {
        return this.o != null || b(iVar);
    }

    @Override // com.applovin.exoplayer2.f.j
    @TargetApi(17)
    public g.a a(com.applovin.exoplayer2.f.i iVar, v vVar, MediaCrypto mediaCrypto, float f) {
        d dVar = this.f16478p;
        if (dVar != null && dVar.f16441a != iVar.f15037g) {
            dVar.release();
            this.f16478p = null;
        }
        String str = iVar.f15034c;
        a a10 = a(iVar, vVar, u());
        this.f16475l = a10;
        MediaFormat a11 = a(vVar, str, a10, f, this.f16474k, this.K ? this.L : 0);
        if (this.o == null) {
            if (b(iVar)) {
                if (this.f16478p == null) {
                    this.f16478p = d.a(this.f, iVar.f15037g);
                }
                this.o = this.f16478p;
            } else {
                throw new IllegalStateException();
            }
        }
        return g.a.a(iVar, a11, vVar, this.o, mediaCrypto);
    }

    @Override // com.applovin.exoplayer2.f.j
    public com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.f.i iVar, v vVar, v vVar2) {
        com.applovin.exoplayer2.c.h a10 = iVar.a(vVar, vVar2);
        int i10 = a10.f13656e;
        int i11 = vVar2.f16842q;
        a aVar = this.f16475l;
        if (i11 > aVar.f16488a || vVar2.f16843r > aVar.f16489b) {
            i10 |= 256;
        }
        if (a(iVar, vVar2) > this.f16475l.f16490c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new com.applovin.exoplayer2.c.h(iVar.f15032a, vVar, vVar2, i12 != 0 ? 0 : a10.f13655d, i12);
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.ar
    public void a(float f, float f10) throws com.applovin.exoplayer2.p {
        super.a(f, f10);
        this.f16470g.a(f);
    }

    @Override // com.applovin.exoplayer2.f.j
    public float a(float f, v vVar, v[] vVarArr) {
        float f10 = -1.0f;
        for (v vVar2 : vVarArr) {
            float f11 = vVar2.f16844s;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        if (f10 == -1.0f) {
            return -1.0f;
        }
        return f10 * f;
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(String str, long j10, long j11) {
        this.f16471h.a(str, j10, j11);
        this.f16476m = b(str);
        this.f16477n = ((com.applovin.exoplayer2.f.i) com.applovin.exoplayer2.l.a.b(I())).b();
        if (ai.f16274a < 23 || !this.K) {
            return;
        }
        this.f16469b = new b((com.applovin.exoplayer2.f.g) com.applovin.exoplayer2.l.a.b(G()));
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(String str) {
        this.f16471h.a(str);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(Exception exc) {
        com.applovin.exoplayer2.l.q.c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f16471h.a(exc);
    }

    @Override // com.applovin.exoplayer2.f.j
    public com.applovin.exoplayer2.c.h a(w wVar) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.c.h a10 = super.a(wVar);
        this.f16471h.a(wVar.f16876b, a10);
        return a10;
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(com.applovin.exoplayer2.c.g gVar) throws com.applovin.exoplayer2.p {
        boolean z10 = this.K;
        if (!z10) {
            this.A++;
        }
        if (ai.f16274a >= 23 || !z10) {
            return;
        }
        e(gVar.f13647d);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(v vVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        com.applovin.exoplayer2.f.g G = G();
        if (G != null) {
            G.c(this.f16480r);
        }
        if (this.K) {
            this.F = vVar.f16842q;
            this.G = vVar.f16843r;
        } else {
            com.applovin.exoplayer2.l.a.b(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger(ContentRecord.WIDTH);
            }
            this.F = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger(ContentRecord.HEIGHT);
            }
            this.G = integer2;
        }
        float f = vVar.f16846u;
        this.I = f;
        if (ai.f16274a >= 21) {
            int i10 = vVar.f16845t;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.F;
                this.F = this.G;
                this.G = i11;
                this.I = 1.0f / f;
            }
        } else {
            this.H = vVar.f16845t;
        }
        this.f16470g.b(vVar.f16844s);
    }

    @Override // com.applovin.exoplayer2.f.j
    public boolean a(long j10, long j11, com.applovin.exoplayer2.f.g gVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, v vVar) throws com.applovin.exoplayer2.p {
        boolean z12;
        long j13;
        com.applovin.exoplayer2.l.a.b(gVar);
        if (this.f16484v == com.anythink.expressad.exoplayer.b.f7291b) {
            this.f16484v = j10;
        }
        if (j12 != this.B) {
            this.f16470g.a(j12);
            this.B = j12;
        }
        long Q = Q();
        long j14 = j12 - Q;
        if (z10 && !z11) {
            a(gVar, i10, j14);
            return true;
        }
        double O = O();
        boolean z13 = d_() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = (long) ((j12 - j10) / O);
        if (z13) {
            j15 -= elapsedRealtime - j11;
        }
        if (this.o == this.f16478p) {
            if (!g(j15)) {
                return false;
            }
            a(gVar, i10, j14);
            f(j15);
            return true;
        }
        long j16 = elapsedRealtime - this.C;
        if (this.f16483u ? this.f16481s : !(z13 || this.f16482t)) {
            j13 = j16;
            z12 = false;
        } else {
            z12 = true;
            j13 = j16;
        }
        if (this.f16485w == com.anythink.expressad.exoplayer.b.f7291b && j10 >= Q && (z12 || (z13 && b(j15, j13)))) {
            long nanoTime = System.nanoTime();
            a(j14, nanoTime, vVar);
            if (ai.f16274a >= 21) {
                a(gVar, i10, j14, nanoTime);
            } else {
                c(gVar, i10, j14);
            }
            f(j15);
            return true;
        }
        if (z13 && j10 != this.f16484v) {
            long nanoTime2 = System.nanoTime();
            long b10 = this.f16470g.b((j15 * 1000) + nanoTime2);
            long j17 = (b10 - nanoTime2) / 1000;
            boolean z14 = this.f16485w != com.anythink.expressad.exoplayer.b.f7291b;
            if (b(j17, j11, z11) && b(j10, z14)) {
                return false;
            }
            if (a(j17, j11, z11)) {
                if (z14) {
                    a(gVar, i10, j14);
                } else {
                    b(gVar, i10, j14);
                }
                f(j17);
                return true;
            }
            if (ai.f16274a >= 21) {
                if (j17 < 50000) {
                    a(j14, b10, vVar);
                    a(gVar, i10, j14, b10);
                    f(j17);
                    return true;
                }
            } else if (j17 < 30000) {
                if (j17 > 11000) {
                    try {
                        Thread.sleep((j17 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                a(j14, b10, vVar);
                c(gVar, i10, j14);
                f(j17);
                return true;
            }
        }
        return false;
    }

    private void a(long j10, long j11, v vVar) {
        l lVar = this.M;
        if (lVar != null) {
            lVar.a(j10, j11, vVar, H());
        }
    }

    public boolean a(long j10, long j11, boolean z10) {
        return g(j10) && !z10;
    }

    public void a(com.applovin.exoplayer2.f.g gVar, int i10, long j10) {
        ah.a("skipVideoBuffer");
        gVar.a(i10, false);
        ah.a();
        ((com.applovin.exoplayer2.f.j) this).f15043a.f++;
    }

    public void a(com.applovin.exoplayer2.f.g gVar, int i10, long j10, long j11) {
        W();
        ah.a("releaseOutputBuffer");
        gVar.a(i10, j11);
        ah.a();
        this.C = SystemClock.elapsedRealtime() * 1000;
        ((com.applovin.exoplayer2.f.j) this).f15043a.f13638e++;
        this.f16487z = 0;
        B();
    }

    private static void a(com.applovin.exoplayer2.f.g gVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        gVar.a(bundle);
    }

    public void a(com.applovin.exoplayer2.f.g gVar, Surface surface) {
        gVar.a(surface);
    }

    private static void a(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    public MediaFormat a(v vVar, String str, a aVar, float f, boolean z10, int i10) {
        Pair<Integer, Integer> a10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ContentRecord.WIDTH, vVar.f16842q);
        mediaFormat.setInteger(ContentRecord.HEIGHT, vVar.f16843r);
        t.a(mediaFormat, vVar.f16840n);
        t.a(mediaFormat, "frame-rate", vVar.f16844s);
        t.a(mediaFormat, "rotation-degrees", vVar.f16845t);
        t.a(mediaFormat, vVar.f16849x);
        if ("video/dolby-vision".equals(vVar.f16838l) && (a10 = com.applovin.exoplayer2.f.l.a(vVar)) != null) {
            t.a(mediaFormat, Scopes.PROFILE, ((Integer) a10.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f16488a);
        mediaFormat.setInteger("max-height", aVar.f16489b);
        t.a(mediaFormat, "max-input-size", aVar.f16490c);
        if (ai.f16274a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            a(mediaFormat, i10);
        }
        return mediaFormat;
    }

    public a a(com.applovin.exoplayer2.f.i iVar, v vVar, v[] vVarArr) {
        int c10;
        int i10 = vVar.f16842q;
        int i11 = vVar.f16843r;
        int a10 = a(iVar, vVar);
        if (vVarArr.length == 1) {
            if (a10 != -1 && (c10 = c(iVar, vVar)) != -1) {
                a10 = Math.min((int) (a10 * 1.5f), c10);
            }
            return new a(i10, i11, a10);
        }
        int length = vVarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            v vVar2 = vVarArr[i12];
            if (vVar.f16849x != null && vVar2.f16849x == null) {
                vVar2 = vVar2.a().a(vVar.f16849x).a();
            }
            if (iVar.a(vVar, vVar2).f13655d != 0) {
                int i13 = vVar2.f16842q;
                z10 |= i13 == -1 || vVar2.f16843r == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, vVar2.f16843r);
                a10 = Math.max(a10, a(iVar, vVar2));
            }
        }
        if (z10) {
            com.applovin.exoplayer2.l.q.c("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point b10 = b(iVar, vVar);
            if (b10 != null) {
                i10 = Math.max(i10, b10.x);
                i11 = Math.max(i11, b10.y);
                a10 = Math.max(a10, c(iVar, vVar.a().g(i10).h(i11).a()));
                com.applovin.exoplayer2.l.q.c("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new a(i10, i11, a10);
    }

    @Override // com.applovin.exoplayer2.f.j
    public com.applovin.exoplayer2.f.h a(Throwable th, com.applovin.exoplayer2.f.i iVar) {
        return new g(th, iVar, this.o);
    }

    public static int a(com.applovin.exoplayer2.f.i iVar, v vVar) {
        if (vVar.f16839m != -1) {
            int size = vVar.f16840n.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += vVar.f16840n.get(i11).length;
            }
            return vVar.f16839m + i10;
        }
        return c(iVar, vVar);
    }
}
