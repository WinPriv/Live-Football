package com.anythink.expressad.exoplayer.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.anythink.expressad.exoplayer.b.g;
import com.anythink.expressad.exoplayer.b.h;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.v;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes.dex */
public final class o extends com.anythink.expressad.exoplayer.f.b implements com.anythink.expressad.exoplayer.k.n {
    private int A;
    private int B;
    private long C;
    private boolean D;
    private boolean E;

    /* renamed from: r, reason: collision with root package name */
    private final Context f7475r;

    /* renamed from: s, reason: collision with root package name */
    private final g.a f7476s;

    /* renamed from: t, reason: collision with root package name */
    private final h f7477t;

    /* renamed from: u, reason: collision with root package name */
    private int f7478u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7479v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7480w;

    /* renamed from: x, reason: collision with root package name */
    private MediaFormat f7481x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private int f7482z;

    /* loaded from: classes.dex */
    public final class a implements h.c {
        private a() {
        }

        @Override // com.anythink.expressad.exoplayer.b.h.c
        public final void a(int i10) {
            o.this.f7476s.a(i10);
        }

        public /* synthetic */ a(o oVar, byte b10) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.b.h.c
        public final void a() {
            o.b(o.this);
        }

        @Override // com.anythink.expressad.exoplayer.b.h.c
        public final void a(int i10, long j10, long j11) {
            o.this.f7476s.a(i10, j10, j11);
        }
    }

    private o(Context context, com.anythink.expressad.exoplayer.f.c cVar) {
        this(context, cVar, null);
    }

    private void F() {
        long a10 = this.f7477t.a(v());
        if (a10 != Long.MIN_VALUE) {
            if (!this.E) {
                a10 = Math.max(this.C, a10);
            }
            this.C = a10;
            this.E = false;
        }
    }

    public static /* synthetic */ boolean b(o oVar) {
        oVar.E = true;
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final int a(com.anythink.expressad.exoplayer.f.a aVar, com.anythink.expressad.exoplayer.m mVar, com.anythink.expressad.exoplayer.m mVar2) {
        return 0;
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final long d() {
        if (a_() == 2) {
            F();
        }
        return this.C;
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final v e() {
        return this.f7477t.f();
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.a
    public final void n() {
        super.n();
        this.f7477t.a();
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.a
    public final void o() {
        F();
        this.f7477t.h();
        super.o();
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.a
    public final void p() {
        try {
            this.f7477t.j();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.y
    public final boolean u() {
        if (!this.f7477t.e() && !super.u()) {
            return false;
        }
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.y
    public final boolean v() {
        if (super.v() && this.f7477t.d()) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void w() {
        try {
            this.f7477t.c();
        } catch (h.d e10) {
            throw com.anythink.expressad.exoplayer.g.a(e10, s());
        }
    }

    private o(Context context, com.anythink.expressad.exoplayer.f.c cVar, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> gVar) {
        this(context, cVar, gVar, null, null);
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void b(com.anythink.expressad.exoplayer.m mVar) {
        super.b(mVar);
        this.f7476s.a(mVar);
        this.y = com.anythink.expressad.exoplayer.k.o.f9088w.equals(mVar.f9257h) ? mVar.f9271w : 2;
        this.f7482z = mVar.f9269u;
        this.A = mVar.f9272x;
        this.B = mVar.y;
    }

    private o(Context context, com.anythink.expressad.exoplayer.f.c cVar, Handler handler, g gVar) {
        this(context, cVar, null, handler, gVar);
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final int a(com.anythink.expressad.exoplayer.f.c cVar, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> gVar, com.anythink.expressad.exoplayer.m mVar) {
        boolean z10;
        int i10;
        int i11;
        String str = mVar.f9257h;
        boolean z11 = false;
        if (!com.anythink.expressad.exoplayer.k.o.a(str)) {
            return 0;
        }
        int i12 = af.f8993a >= 21 ? 32 : 0;
        boolean a10 = com.anythink.expressad.exoplayer.a.a(gVar, mVar.f9260k);
        if (a10 && a(str) && cVar.a() != null) {
            return i12 | 8 | 4;
        }
        if ((com.anythink.expressad.exoplayer.k.o.f9088w.equals(str) && !this.f7477t.a(mVar.f9271w)) || !this.f7477t.a(2)) {
            return 1;
        }
        com.anythink.expressad.exoplayer.d.e eVar = mVar.f9260k;
        if (eVar != null) {
            z10 = false;
            for (int i13 = 0; i13 < eVar.f7689b; i13++) {
                z10 |= eVar.a(i13).f7695d;
            }
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.f.a a11 = cVar.a(str, z10);
        if (a11 == null) {
            return (!z10 || cVar.a(str, false) == null) ? 1 : 2;
        }
        if (!a10) {
            return 2;
        }
        if (af.f8993a < 21 || (((i10 = mVar.f9270v) == -1 || a11.a(i10)) && ((i11 = mVar.f9269u) == -1 || a11.b(i11)))) {
            z11 = true;
        }
        return i12 | 8 | (z11 ? 4 : 3);
    }

    private o(Context context, com.anythink.expressad.exoplayer.f.c cVar, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> gVar, Handler handler, g gVar2) {
        this(context, cVar, gVar, handler, gVar2, null, new f[0]);
    }

    public o(Context context, com.anythink.expressad.exoplayer.f.c cVar, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> gVar, Handler handler, g gVar2, c cVar2, f... fVarArr) {
        this(context, cVar, gVar, handler, gVar2, new l(cVar2, fVarArr));
    }

    private o(Context context, com.anythink.expressad.exoplayer.f.c cVar, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> gVar, Handler handler, g gVar2, h hVar) {
        super(1, cVar, gVar, false);
        this.f7475r = context.getApplicationContext();
        this.f7477t = hVar;
        this.f7476s = new g.a(handler, gVar2);
        hVar.a(new a(this, (byte) 0));
    }

    private int b(com.anythink.expressad.exoplayer.f.a aVar, com.anythink.expressad.exoplayer.m mVar) {
        PackageManager packageManager;
        int i10 = af.f8993a;
        if (i10 < 24 && "OMX.google.raw.decoder".equals(aVar.f7973c)) {
            if ((i10 == 23 && (packageManager = this.f7475r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) ? false : true) {
                return -1;
            }
        }
        return mVar.f9258i;
    }

    private static boolean b(String str) {
        if (af.f8993a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(af.f8995c)) {
            return false;
        }
        String str2 = af.f8994b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final com.anythink.expressad.exoplayer.f.a a(com.anythink.expressad.exoplayer.f.c cVar, com.anythink.expressad.exoplayer.m mVar, boolean z10) {
        com.anythink.expressad.exoplayer.f.a a10;
        return (!a(mVar.f9257h) || (a10 = cVar.a()) == null) ? super.a(cVar, mVar, z10) : a10;
    }

    private boolean a(String str) {
        int e10 = com.anythink.expressad.exoplayer.k.o.e(str);
        return e10 != 0 && this.f7477t.a(e10);
    }

    private static void C() {
    }

    private static void D() {
    }

    private static void E() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r4.startsWith("heroqlte") == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    @Override // com.anythink.expressad.exoplayer.f.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.anythink.expressad.exoplayer.f.a r8, android.media.MediaCodec r9, com.anythink.expressad.exoplayer.m r10, android.media.MediaCrypto r11) {
        /*
            r7 = this;
            r7.q()
            int r0 = com.anythink.expressad.exoplayer.k.af.f8993a
            r1 = 23
            r2 = 1
            r3 = 0
            r4 = 24
            if (r0 >= r4) goto L30
            java.lang.String r5 = "OMX.google.raw.decoder"
            java.lang.String r6 = r8.f7973c
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L30
            if (r0 != r1) goto L2b
            android.content.Context r5 = r7.f7475r
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            if (r5 == 0) goto L2b
            java.lang.String r6 = "android.software.leanback"
            boolean r5 = r5.hasSystemFeature(r6)
            if (r5 == 0) goto L2b
            r5 = r3
            goto L2c
        L2b:
            r5 = r2
        L2c:
            if (r5 == 0) goto L30
            r5 = -1
            goto L32
        L30:
            int r5 = r10.f9258i
        L32:
            r7.f7478u = r5
            java.lang.String r5 = r8.f7973c
            if (r0 >= r4) goto L65
            java.lang.String r4 = "OMX.SEC.aac.dec"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L65
            java.lang.String r4 = "samsung"
            java.lang.String r5 = com.anythink.expressad.exoplayer.k.af.f8995c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L65
            java.lang.String r4 = com.anythink.expressad.exoplayer.k.af.f8994b
            java.lang.String r5 = "zeroflte"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L66
            java.lang.String r5 = "herolte"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L66
            java.lang.String r5 = "heroqlte"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L65
            goto L66
        L65:
            r2 = r3
        L66:
            r7.f7480w = r2
            boolean r2 = r8.f7978i
            r7.f7479v = r2
            java.lang.String r8 = r8.f7974d
            if (r8 != 0) goto L72
            java.lang.String r8 = "audio/raw"
        L72:
            int r2 = r7.f7478u
            android.media.MediaFormat r4 = new android.media.MediaFormat
            r4.<init>()
            java.lang.String r5 = "mime"
            r4.setString(r5, r8)
            int r8 = r10.f9269u
            java.lang.String r6 = "channel-count"
            r4.setInteger(r6, r8)
            java.lang.String r8 = "sample-rate"
            int r6 = r10.f9270v
            r4.setInteger(r8, r6)
            java.util.List<byte[]> r8 = r10.f9259j
            com.anythink.expressad.exoplayer.f.e.a(r4, r8)
            java.lang.String r8 = "max-input-size"
            com.anythink.expressad.exoplayer.f.e.a(r4, r8, r2)
            if (r0 < r1) goto L9d
            java.lang.String r8 = "priority"
            r4.setInteger(r8, r3)
        L9d:
            r8 = 0
            r9.configure(r4, r8, r11, r3)
            boolean r9 = r7.f7479v
            if (r9 == 0) goto Lad
            r7.f7481x = r4
            java.lang.String r8 = r10.f9257h
            r4.setString(r5, r8)
            return
        Lad:
            r7.f7481x = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.b.o.a(com.anythink.expressad.exoplayer.f.a, android.media.MediaCodec, com.anythink.expressad.exoplayer.m, android.media.MediaCrypto):void");
    }

    @Override // com.anythink.expressad.exoplayer.a, com.anythink.expressad.exoplayer.y
    public final com.anythink.expressad.exoplayer.k.n c() {
        return this;
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void a(String str, long j10, long j11) {
        this.f7476s.a(str, j10, j11);
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i10;
        int[] iArr;
        int i11;
        MediaFormat mediaFormat2 = this.f7481x;
        if (mediaFormat2 != null) {
            i10 = com.anythink.expressad.exoplayer.k.o.e(mediaFormat2.getString("mime"));
            mediaFormat = this.f7481x;
        } else {
            i10 = this.y;
        }
        int i12 = i10;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f7480w && integer == 6 && (i11 = this.f7482z) < 6) {
            iArr = new int[i11];
            for (int i13 = 0; i13 < this.f7482z; i13++) {
                iArr[i13] = i13;
            }
        } else {
            iArr = null;
        }
        try {
            this.f7477t.a(i12, integer, integer2, iArr, this.A, this.B);
        } catch (h.a e10) {
            throw com.anythink.expressad.exoplayer.g.a(e10, s());
        }
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.a
    public final void a(boolean z10) {
        super.a(z10);
        this.f7476s.a(((com.anythink.expressad.exoplayer.f.b) this).f7993q);
        int i10 = r().f7260b;
        if (i10 != 0) {
            this.f7477t.c(i10);
        } else {
            this.f7477t.g();
        }
    }

    @Override // com.anythink.expressad.exoplayer.f.b, com.anythink.expressad.exoplayer.a
    public final void a(long j10, boolean z10) {
        super.a(j10, z10);
        this.f7477t.i();
        this.C = j10;
        this.D = true;
        this.E = true;
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final v a(v vVar) {
        return this.f7477t.a(vVar);
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final void a(com.anythink.expressad.exoplayer.c.e eVar) {
        if (!this.D || eVar.b()) {
            return;
        }
        if (Math.abs(eVar.f - this.C) > 500000) {
            this.C = eVar.f;
        }
        this.D = false;
    }

    @Override // com.anythink.expressad.exoplayer.f.b
    public final boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) {
        if (this.f7479v && (i11 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            ((com.anythink.expressad.exoplayer.f.b) this).f7993q.f++;
            this.f7477t.b();
            return true;
        }
        try {
            if (!this.f7477t.a(byteBuffer, j12)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i10, false);
            ((com.anythink.expressad.exoplayer.f.b) this).f7993q.f7586e++;
            return true;
        } catch (h.b | h.d e10) {
            throw com.anythink.expressad.exoplayer.g.a(e10, s());
        }
    }

    @Override // com.anythink.expressad.exoplayer.a, com.anythink.expressad.exoplayer.x.b
    public final void a(int i10, Object obj) {
        if (i10 == 2) {
            this.f7477t.a(((Float) obj).floatValue());
        } else if (i10 != 3) {
            super.a(i10, obj);
        } else {
            this.f7477t.a((b) obj);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static MediaFormat a(com.anythink.expressad.exoplayer.m mVar, String str, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", mVar.f9269u);
        mediaFormat.setInteger("sample-rate", mVar.f9270v);
        com.anythink.expressad.exoplayer.f.e.a(mediaFormat, mVar.f9259j);
        com.anythink.expressad.exoplayer.f.e.a(mediaFormat, "max-input-size", i10);
        if (af.f8993a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        return mediaFormat;
    }

    private static boolean a(com.anythink.expressad.exoplayer.m mVar, com.anythink.expressad.exoplayer.m mVar2) {
        return mVar.f9257h.equals(mVar2.f9257h) && mVar.f9269u == mVar2.f9269u && mVar.f9270v == mVar2.f9270v && mVar.f9272x == 0 && mVar.y == 0 && mVar2.f9272x == 0 && mVar2.y == 0 && mVar.b(mVar2);
    }

    private int a(com.anythink.expressad.exoplayer.f.a aVar, com.anythink.expressad.exoplayer.m mVar) {
        PackageManager packageManager;
        int i10 = af.f8993a;
        if (i10 < 24 && "OMX.google.raw.decoder".equals(aVar.f7973c)) {
            if ((i10 == 23 && (packageManager = this.f7475r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) ? false : true) {
                return -1;
            }
        }
        return mVar.f9258i;
    }
}
