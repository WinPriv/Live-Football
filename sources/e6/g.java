package e6;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.appcompat.app.p;
import b5.k;
import b5.o;
import b5.q;
import com.applovin.exoplayer2.b.d0;
import com.applovin.exoplayer2.b.e0;
import com.applovin.exoplayer2.m.s;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.gms.common.Scopes;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import d6.g0;
import d6.r;
import e6.j;
import e6.m;
import j7.j0;
import j7.v1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import k4.a0;
import k4.i0;
import k4.j1;
import k4.k1;

/* compiled from: MediaCodecVideoRenderer.java */
/* loaded from: classes2.dex */
public final class g extends b5.n {
    public static final int[] G1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean H1;
    public static boolean I1;
    public float A1;
    public n B1;
    public boolean C1;
    public int D1;
    public c E1;
    public i F1;
    public final Context W0;
    public final j X0;
    public final m.a Y0;
    public final long Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final int f27781a1;

    /* renamed from: b1, reason: collision with root package name */
    public final boolean f27782b1;

    /* renamed from: c1, reason: collision with root package name */
    public b f27783c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f27784d1;
    public boolean e1;

    /* renamed from: f1, reason: collision with root package name */
    public Surface f27785f1;

    /* renamed from: g1, reason: collision with root package name */
    public PlaceholderSurface f27786g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f27787h1;

    /* renamed from: i1, reason: collision with root package name */
    public int f27788i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f27789j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f27790k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f27791l1;

    /* renamed from: m1, reason: collision with root package name */
    public long f27792m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f27793n1;

    /* renamed from: o1, reason: collision with root package name */
    public long f27794o1;

    /* renamed from: p1, reason: collision with root package name */
    public int f27795p1;
    public int q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f27796r1;

    /* renamed from: s1, reason: collision with root package name */
    public long f27797s1;

    /* renamed from: t1, reason: collision with root package name */
    public long f27798t1;

    /* renamed from: u1, reason: collision with root package name */
    public long f27799u1;

    /* renamed from: v1, reason: collision with root package name */
    public int f27800v1;

    /* renamed from: w1, reason: collision with root package name */
    public long f27801w1;

    /* renamed from: x1, reason: collision with root package name */
    public int f27802x1;

    /* renamed from: y1, reason: collision with root package name */
    public int f27803y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f27804z1;

    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static boolean a(Context context) {
            Display display;
            boolean isHdr;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            } else {
                display = null;
            }
            if (display != null) {
                isHdr = display.isHdr();
                if (!isHdr) {
                    return false;
                }
                for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i10 == 1) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f27805a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27806b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27807c;

        public b(int i10, int i11, int i12) {
            this.f27805a = i10;
            this.f27806b = i11;
            this.f27807c = i12;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes2.dex */
    public final class c implements k.c, Handler.Callback {

        /* renamed from: s, reason: collision with root package name */
        public final Handler f27808s;

        public c(b5.k kVar) {
            Handler k10 = g0.k(this);
            this.f27808s = k10;
            kVar.f(this, k10);
        }

        public final void a(long j10) {
            g gVar = g.this;
            if (this == gVar.E1 && gVar.Y != null) {
                if (j10 == Long.MAX_VALUE) {
                    gVar.P0 = true;
                    return;
                }
                try {
                    gVar.y0(j10);
                    gVar.H0();
                    gVar.R0.f33314e++;
                    gVar.G0();
                    gVar.h0(j10);
                } catch (k4.m e10) {
                    gVar.Q0 = e10;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i10 = message.arg1;
            int i11 = message.arg2;
            int i12 = g0.f27302a;
            a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
            return true;
        }
    }

    public g(Context context, b5.i iVar, Handler handler, a0.b bVar) {
        super(2, iVar, 30.0f);
        this.Z0 = com.anythink.expressad.exoplayer.f.f7962a;
        this.f27781a1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.W0 = applicationContext;
        this.X0 = new j(applicationContext);
        this.Y0 = new m.a(handler, bVar);
        this.f27782b1 = "NVIDIA".equals(g0.f27304c);
        this.f27793n1 = com.anythink.expressad.exoplayer.b.f7291b;
        this.f27802x1 = -1;
        this.f27803y1 = -1;
        this.A1 = -1.0f;
        this.f27788i1 = 1;
        this.D1 = 0;
        this.B1 = null;
    }

    public static boolean A0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (g.class) {
            if (!H1) {
                I1 = B0();
                H1 = true;
            }
        }
        return I1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0844, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x089b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean B0() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.g.B0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0070, code lost:
    
        if (r4.equals(com.anythink.expressad.exoplayer.k.o.f9075i) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int C0(k4.i0 r10, b5.m r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.g.C0(k4.i0, b5.m):int");
    }

    public static j0 D0(Context context, o oVar, i0 i0Var, boolean z10, boolean z11) throws q.b {
        String str = i0Var.D;
        if (str == null) {
            j0.b bVar = j0.f30006t;
            return v1.f30113w;
        }
        List<b5.m> decoderInfos = oVar.getDecoderInfos(str, z10, z11);
        String b10 = q.b(i0Var);
        if (b10 == null) {
            return j0.C(decoderInfos);
        }
        List<b5.m> decoderInfos2 = oVar.getDecoderInfos(b10, z10, z11);
        if (g0.f27302a >= 26 && "video/dolby-vision".equals(i0Var.D) && !decoderInfos2.isEmpty() && !a.a(context)) {
            return j0.C(decoderInfos2);
        }
        j0.b bVar2 = j0.f30006t;
        j0.a aVar = new j0.a();
        aVar.d(decoderInfos);
        aVar.d(decoderInfos2);
        return aVar.e();
    }

    public static int E0(i0 i0Var, b5.m mVar) {
        if (i0Var.E != -1) {
            List<byte[]> list = i0Var.F;
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += list.get(i11).length;
            }
            return i0Var.E + i10;
        }
        return C0(i0Var, mVar);
    }

    @Override // b5.n, k4.e
    public final void A() {
        m.a aVar = this.Y0;
        this.B1 = null;
        z0();
        this.f27787h1 = false;
        this.E1 = null;
        int i10 = 10;
        try {
            super.A();
            n4.e eVar = this.R0;
            aVar.getClass();
            synchronized (eVar) {
            }
            Handler handler = aVar.f27840a;
            if (handler != null) {
                handler.post(new e0.g(i10, aVar, eVar));
            }
        } catch (Throwable th) {
            n4.e eVar2 = this.R0;
            aVar.getClass();
            synchronized (eVar2) {
                Handler handler2 = aVar.f27840a;
                if (handler2 != null) {
                    handler2.post(new e0.g(i10, aVar, eVar2));
                }
                throw th;
            }
        }
    }

    @Override // k4.e
    public final void B(boolean z10, boolean z11) throws k4.m {
        boolean z12;
        this.R0 = new n4.e();
        k1 k1Var = this.f30406u;
        k1Var.getClass();
        boolean z13 = k1Var.f30561a;
        if (z13 && this.D1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        d6.a.d(z12);
        if (this.C1 != z13) {
            this.C1 = z13;
            n0();
        }
        n4.e eVar = this.R0;
        m.a aVar = this.Y0;
        Handler handler = aVar.f27840a;
        if (handler != null) {
            handler.post(new p(9, aVar, eVar));
        }
        this.f27790k1 = z11;
        this.f27791l1 = false;
    }

    @Override // b5.n, k4.e
    public final void C(long j10, boolean z10) throws k4.m {
        super.C(j10, z10);
        z0();
        j jVar = this.X0;
        jVar.f27821m = 0L;
        jVar.f27823p = -1L;
        jVar.f27822n = -1L;
        long j11 = com.anythink.expressad.exoplayer.b.f7291b;
        this.f27797s1 = com.anythink.expressad.exoplayer.b.f7291b;
        this.f27792m1 = com.anythink.expressad.exoplayer.b.f7291b;
        this.q1 = 0;
        if (z10) {
            long j12 = this.Z0;
            if (j12 > 0) {
                j11 = SystemClock.elapsedRealtime() + j12;
            }
            this.f27793n1 = j11;
            return;
        }
        this.f27793n1 = com.anythink.expressad.exoplayer.b.f7291b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k4.e
    @TargetApi(17)
    public final void D() {
        try {
            try {
                L();
                n0();
            } finally {
                com.google.android.exoplayer2.drm.d.c(this.S, null);
                this.S = null;
            }
        } finally {
            PlaceholderSurface placeholderSurface = this.f27786g1;
            if (placeholderSurface != null) {
                if (this.f27785f1 == placeholderSurface) {
                    this.f27785f1 = null;
                }
                placeholderSurface.release();
                this.f27786g1 = null;
            }
        }
    }

    @Override // k4.e
    public final void E() {
        this.f27795p1 = 0;
        this.f27794o1 = SystemClock.elapsedRealtime();
        this.f27798t1 = SystemClock.elapsedRealtime() * 1000;
        this.f27799u1 = 0L;
        this.f27800v1 = 0;
        j jVar = this.X0;
        jVar.f27813d = true;
        jVar.f27821m = 0L;
        jVar.f27823p = -1L;
        jVar.f27822n = -1L;
        j.b bVar = jVar.f27811b;
        if (bVar != null) {
            j.e eVar = jVar.f27812c;
            eVar.getClass();
            eVar.f27830t.sendEmptyMessage(1);
            bVar.a(new b0.b(jVar, 9));
        }
        jVar.c(false);
    }

    @Override // k4.e
    public final void F() {
        this.f27793n1 = com.anythink.expressad.exoplayer.b.f7291b;
        F0();
        int i10 = this.f27800v1;
        if (i10 != 0) {
            long j10 = this.f27799u1;
            m.a aVar = this.Y0;
            Handler handler = aVar.f27840a;
            if (handler != null) {
                handler.post(new k(aVar, j10, i10));
            }
            this.f27799u1 = 0L;
            this.f27800v1 = 0;
        }
        j jVar = this.X0;
        jVar.f27813d = false;
        j.b bVar = jVar.f27811b;
        if (bVar != null) {
            bVar.b();
            j.e eVar = jVar.f27812c;
            eVar.getClass();
            eVar.f27830t.sendEmptyMessage(2);
        }
        jVar.a();
    }

    public final void F0() {
        if (this.f27795p1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f27794o1;
            int i10 = this.f27795p1;
            m.a aVar = this.Y0;
            Handler handler = aVar.f27840a;
            if (handler != null) {
                handler.post(new k(aVar, i10, j10));
            }
            this.f27795p1 = 0;
            this.f27794o1 = elapsedRealtime;
        }
    }

    public final void G0() {
        this.f27791l1 = true;
        if (!this.f27789j1) {
            this.f27789j1 = true;
            Surface surface = this.f27785f1;
            m.a aVar = this.Y0;
            Handler handler = aVar.f27840a;
            if (handler != null) {
                handler.post(new l(aVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f27787h1 = true;
        }
    }

    public final void H0() {
        int i10 = this.f27802x1;
        if (i10 != -1 || this.f27803y1 != -1) {
            n nVar = this.B1;
            if (nVar == null || nVar.f27845s != i10 || nVar.f27846t != this.f27803y1 || nVar.f27847u != this.f27804z1 || nVar.f27848v != this.A1) {
                n nVar2 = new n(this.f27802x1, this.f27803y1, this.f27804z1, this.A1);
                this.B1 = nVar2;
                m.a aVar = this.Y0;
                Handler handler = aVar.f27840a;
                if (handler != null) {
                    handler.post(new e0(9, aVar, nVar2));
                }
            }
        }
    }

    public final void I0(b5.k kVar, int i10) {
        H0();
        a0.a.n0("releaseOutputBuffer");
        kVar.h(i10, true);
        a0.a.F0();
        this.f27798t1 = SystemClock.elapsedRealtime() * 1000;
        this.R0.f33314e++;
        this.q1 = 0;
        G0();
    }

    @Override // b5.n
    public final n4.i J(b5.m mVar, i0 i0Var, i0 i0Var2) {
        int i10;
        n4.i b10 = mVar.b(i0Var, i0Var2);
        b bVar = this.f27783c1;
        int i11 = bVar.f27805a;
        int i12 = i0Var2.I;
        int i13 = b10.f33332e;
        if (i12 > i11 || i0Var2.J > bVar.f27806b) {
            i13 |= 256;
        }
        if (E0(i0Var2, mVar) > this.f27783c1.f27807c) {
            i13 |= 64;
        }
        int i14 = i13;
        String str = mVar.f2945a;
        if (i14 != 0) {
            i10 = 0;
        } else {
            i10 = b10.f33331d;
        }
        return new n4.i(str, i0Var, i0Var2, i10, i14);
    }

    public final void J0(b5.k kVar, int i10, long j10) {
        H0();
        a0.a.n0("releaseOutputBuffer");
        kVar.d(i10, j10);
        a0.a.F0();
        this.f27798t1 = SystemClock.elapsedRealtime() * 1000;
        this.R0.f33314e++;
        this.q1 = 0;
        G0();
    }

    @Override // b5.n
    public final b5.l K(IllegalStateException illegalStateException, b5.m mVar) {
        return new f(illegalStateException, mVar, this.f27785f1);
    }

    public final boolean K0(b5.m mVar) {
        boolean z10;
        if (g0.f27302a < 23 || this.C1 || A0(mVar.f2945a)) {
            return false;
        }
        if (mVar.f) {
            Context context = this.W0;
            int i10 = PlaceholderSurface.f20377v;
            synchronized (PlaceholderSurface.class) {
                if (!PlaceholderSurface.f20378w) {
                    PlaceholderSurface.f20377v = PlaceholderSurface.a(context);
                    PlaceholderSurface.f20378w = true;
                }
                if (PlaceholderSurface.f20377v != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void L0(b5.k kVar, int i10) {
        a0.a.n0("skipVideoBuffer");
        kVar.h(i10, false);
        a0.a.F0();
        this.R0.f++;
    }

    public final void M0(int i10, int i11) {
        n4.e eVar = this.R0;
        eVar.f33316h += i10;
        int i12 = i10 + i11;
        eVar.f33315g += i12;
        this.f27795p1 += i12;
        int i13 = this.q1 + i12;
        this.q1 = i13;
        eVar.f33317i = Math.max(i13, eVar.f33317i);
        int i14 = this.f27781a1;
        if (i14 > 0 && this.f27795p1 >= i14) {
            F0();
        }
    }

    public final void N0(long j10) {
        n4.e eVar = this.R0;
        eVar.f33319k += j10;
        eVar.f33320l++;
        this.f27799u1 += j10;
        this.f27800v1++;
    }

    @Override // b5.n
    public final boolean S() {
        if (this.C1 && g0.f27302a < 23) {
            return true;
        }
        return false;
    }

    @Override // b5.n
    public final float T(float f, i0[] i0VarArr) {
        float f10 = -1.0f;
        for (i0 i0Var : i0VarArr) {
            float f11 = i0Var.K;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        if (f10 == -1.0f) {
            return -1.0f;
        }
        return f10 * f;
    }

    @Override // b5.n
    public final ArrayList U(o oVar, i0 i0Var, boolean z10) throws q.b {
        j0 D0 = D0(this.W0, oVar, i0Var, z10, this.C1);
        Pattern pattern = q.f2985a;
        ArrayList arrayList = new ArrayList(D0);
        Collections.sort(arrayList, new b5.p(new b0.b(i0Var, 8)));
        return arrayList;
    }

    @Override // b5.n
    @TargetApi(17)
    public final k.a W(b5.m mVar, i0 i0Var, MediaCrypto mediaCrypto, float f) {
        String str;
        int i10;
        int i11;
        e6.b bVar;
        b bVar2;
        boolean z10;
        int i12;
        int i13;
        Point point;
        float f10;
        int i14;
        int i15;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i16;
        boolean z11;
        int i17;
        boolean z12;
        Pair<Integer, Integer> d10;
        int C0;
        PlaceholderSurface placeholderSurface = this.f27786g1;
        if (placeholderSurface != null && placeholderSurface.f20379s != mVar.f) {
            if (this.f27785f1 == placeholderSurface) {
                this.f27785f1 = null;
            }
            placeholderSurface.release();
            this.f27786g1 = null;
        }
        String str2 = mVar.f2947c;
        i0[] i0VarArr = this.f30410z;
        i0VarArr.getClass();
        int i18 = i0Var.I;
        int E0 = E0(i0Var, mVar);
        int length = i0VarArr.length;
        float f11 = i0Var.K;
        int i19 = i0Var.I;
        e6.b bVar3 = i0Var.P;
        int i20 = i0Var.J;
        if (length == 1) {
            if (E0 != -1 && (C0 = C0(i0Var, mVar)) != -1) {
                E0 = Math.min((int) (E0 * 1.5f), C0);
            }
            bVar2 = new b(i18, i20, E0);
            str = str2;
            i10 = i20;
            i11 = i19;
            bVar = bVar3;
        } else {
            int length2 = i0VarArr.length;
            int i21 = i20;
            int i22 = 0;
            boolean z13 = false;
            while (i22 < length2) {
                i0 i0Var2 = i0VarArr[i22];
                i0[] i0VarArr2 = i0VarArr;
                if (bVar3 != null && i0Var2.P == null) {
                    i0.a aVar = new i0.a(i0Var2);
                    aVar.f30545w = bVar3;
                    i0Var2 = new i0(aVar);
                }
                if (mVar.b(i0Var, i0Var2).f33331d != 0) {
                    int i23 = i0Var2.J;
                    i16 = length2;
                    int i24 = i0Var2.I;
                    if (i24 != -1 && i23 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    int max = Math.max(i18, i24);
                    i21 = Math.max(i21, i23);
                    i18 = max;
                    E0 = Math.max(E0, E0(i0Var2, mVar));
                } else {
                    i16 = length2;
                }
                i22++;
                i0VarArr = i0VarArr2;
                length2 = i16;
            }
            if (z13) {
                d6.p.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i18 + "x" + i21);
                if (i20 > i19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i12 = i20;
                } else {
                    i12 = i19;
                }
                if (z10) {
                    i13 = i19;
                } else {
                    i13 = i20;
                }
                bVar = bVar3;
                i10 = i20;
                float f12 = i13 / i12;
                int[] iArr = G1;
                str = str2;
                i11 = i19;
                int i25 = 0;
                while (i25 < 9) {
                    int i26 = iArr[i25];
                    int[] iArr2 = iArr;
                    int i27 = (int) (i26 * f12);
                    if (i26 <= i12 || i27 <= i13) {
                        break;
                    }
                    int i28 = i12;
                    int i29 = i13;
                    if (g0.f27302a >= 21) {
                        if (z10) {
                            i15 = i27;
                        } else {
                            i15 = i26;
                        }
                        if (!z10) {
                            i26 = i27;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f2948d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f10 = f12;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f10 = f12;
                            point2 = new Point((((i15 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i26 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        if (mVar.f(point2.x, point2.y, f11)) {
                            point = point2;
                            break;
                        }
                        i25++;
                        iArr = iArr2;
                        i12 = i28;
                        i13 = i29;
                        f12 = f10;
                    } else {
                        f10 = f12;
                        try {
                            int i30 = (((i26 + 16) - 1) / 16) * 16;
                            int i31 = (((i27 + 16) - 1) / 16) * 16;
                            if (i30 * i31 <= q.i()) {
                                if (z10) {
                                    i14 = i31;
                                } else {
                                    i14 = i30;
                                }
                                if (!z10) {
                                    i30 = i31;
                                }
                                point = new Point(i14, i30);
                            } else {
                                i25++;
                                iArr = iArr2;
                                i12 = i28;
                                i13 = i29;
                                f12 = f10;
                            }
                        } catch (q.b unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i18 = Math.max(i18, point.x);
                    i21 = Math.max(i21, point.y);
                    i0.a aVar2 = new i0.a(i0Var);
                    aVar2.f30538p = i18;
                    aVar2.f30539q = i21;
                    E0 = Math.max(E0, C0(new i0(aVar2), mVar));
                    d6.p.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i18 + "x" + i21);
                }
            } else {
                str = str2;
                i10 = i20;
                i11 = i19;
                bVar = bVar3;
            }
            bVar2 = new b(i18, i21, E0);
        }
        this.f27783c1 = bVar2;
        if (this.C1) {
            i17 = this.D1;
        } else {
            i17 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ContentRecord.WIDTH, i11);
        mediaFormat.setInteger(ContentRecord.HEIGHT, i10);
        d6.a.o(mediaFormat, i0Var.F);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        d6.a.n(mediaFormat, "rotation-degrees", i0Var.L);
        if (bVar != null) {
            e6.b bVar4 = bVar;
            d6.a.n(mediaFormat, "color-transfer", bVar4.f27761u);
            d6.a.n(mediaFormat, "color-standard", bVar4.f27759s);
            d6.a.n(mediaFormat, "color-range", bVar4.f27760t);
            byte[] bArr = bVar4.f27762v;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(i0Var.D) && (d10 = q.d(i0Var)) != null) {
            d6.a.n(mediaFormat, Scopes.PROFILE, ((Integer) d10.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar2.f27805a);
        mediaFormat.setInteger("max-height", bVar2.f27806b);
        d6.a.n(mediaFormat, "max-input-size", bVar2.f27807c);
        if (g0.f27302a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f27782b1) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i17 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i17);
        }
        if (this.f27785f1 == null) {
            if (K0(mVar)) {
                if (this.f27786g1 == null) {
                    this.f27786g1 = PlaceholderSurface.c(this.W0, mVar.f);
                }
                this.f27785f1 = this.f27786g1;
            } else {
                throw new IllegalStateException();
            }
        }
        return new k.a(mVar, mediaFormat, i0Var, this.f27785f1, mediaCrypto);
    }

    @Override // b5.n
    @TargetApi(29)
    public final void X(n4.g gVar) throws k4.m {
        if (!this.e1) {
            return;
        }
        ByteBuffer byteBuffer = gVar.f33325x;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b10 = byteBuffer.get();
            short s10 = byteBuffer.getShort();
            short s11 = byteBuffer.getShort();
            byte b11 = byteBuffer.get();
            byte b12 = byteBuffer.get();
            byteBuffer.position(0);
            if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                if (b12 == 0 || b12 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    b5.k kVar = this.Y;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    kVar.c(bundle);
                }
            }
        }
    }

    @Override // b5.n
    public final void b0(Exception exc) {
        d6.p.d("MediaCodecVideoRenderer", "Video codec error", exc);
        m.a aVar = this.Y0;
        Handler handler = aVar.f27840a;
        if (handler != null) {
            handler.post(new d0(9, aVar, exc));
        }
    }

    @Override // b5.n
    public final void c0(String str, long j10, long j11) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        m.a aVar = this.Y0;
        Handler handler = aVar.f27840a;
        if (handler != null) {
            handler.post(new s(aVar, str, j10, j11, 1));
        }
        this.f27784d1 = A0(str);
        b5.m mVar = this.f2957h0;
        mVar.getClass();
        boolean z10 = false;
        if (g0.f27302a >= 29 && com.anythink.expressad.exoplayer.k.o.f9077k.equals(mVar.f2946b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f2948d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.e1 = z10;
        if (g0.f27302a >= 23 && this.C1) {
            b5.k kVar = this.Y;
            kVar.getClass();
            this.E1 = new c(kVar);
        }
    }

    @Override // b5.n
    public final void d0(String str) {
        m.a aVar = this.Y0;
        Handler handler = aVar.f27840a;
        if (handler != null) {
            handler.post(new d0(8, aVar, str));
        }
    }

    @Override // b5.n
    public final n4.i e0(j1.a aVar) throws k4.m {
        n4.i e02 = super.e0(aVar);
        i0 i0Var = (i0) aVar.f29569u;
        m.a aVar2 = this.Y0;
        Handler handler = aVar2.f27840a;
        if (handler != null) {
            handler.post(new androidx.emoji2.text.g(aVar2, i0Var, e02, 5));
        }
        return e02;
    }

    @Override // b5.n
    public final void f0(i0 i0Var, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        b5.k kVar = this.Y;
        if (kVar != null) {
            kVar.i(this.f27788i1);
        }
        if (this.C1) {
            this.f27802x1 = i0Var.I;
            this.f27803y1 = i0Var.J;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger(ContentRecord.WIDTH);
            }
            this.f27802x1 = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger(ContentRecord.HEIGHT);
            }
            this.f27803y1 = integer2;
        }
        float f = i0Var.M;
        this.A1 = f;
        int i10 = g0.f27302a;
        int i11 = i0Var.L;
        if (i10 >= 21) {
            if (i11 == 90 || i11 == 270) {
                int i12 = this.f27802x1;
                this.f27802x1 = this.f27803y1;
                this.f27803y1 = i12;
                this.A1 = 1.0f / f;
            }
        } else {
            this.f27804z1 = i11;
        }
        j jVar = this.X0;
        jVar.f = i0Var.K;
        d dVar = jVar.f27810a;
        dVar.f27765a.c();
        dVar.f27766b.c();
        dVar.f27767c = false;
        dVar.f27768d = com.anythink.expressad.exoplayer.b.f7291b;
        dVar.f27769e = 0;
        jVar.b();
    }

    @Override // k4.i1, k4.j1
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // b5.n
    public final void h0(long j10) {
        super.h0(j10);
        if (!this.C1) {
            this.f27796r1--;
        }
    }

    @Override // b5.n
    public final void i0() {
        z0();
    }

    @Override // b5.n, k4.i1
    public final boolean isReady() {
        PlaceholderSurface placeholderSurface;
        if (super.isReady() && (this.f27789j1 || (((placeholderSurface = this.f27786g1) != null && this.f27785f1 == placeholderSurface) || this.Y == null || this.C1))) {
            this.f27793n1 = com.anythink.expressad.exoplayer.b.f7291b;
            return true;
        }
        if (this.f27793n1 == com.anythink.expressad.exoplayer.b.f7291b) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f27793n1) {
            return true;
        }
        this.f27793n1 = com.anythink.expressad.exoplayer.b.f7291b;
        return false;
    }

    @Override // b5.n
    public final void j0(n4.g gVar) throws k4.m {
        boolean z10 = this.C1;
        if (!z10) {
            this.f27796r1++;
        }
        if (g0.f27302a < 23 && z10) {
            long j10 = gVar.f33324w;
            y0(j10);
            H0();
            this.R0.f33314e++;
            G0();
            h0(j10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if ((r9 == 0 ? false : r1.f27775g[(int) ((r9 - 1) % 15)]) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0133, code lost:
    
        if ((((r5 > (-30000) ? 1 : (r5 == (-30000) ? 0 : -1)) < 0) && r11 > 100000) != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0161  */
    @Override // b5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l0(long r27, long r29, b5.k r31, java.nio.ByteBuffer r32, int r33, int r34, int r35, long r36, boolean r38, boolean r39, k4.i0 r40) throws k4.m {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.g.l0(long, long, b5.k, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, k4.i0):boolean");
    }

    @Override // b5.n, k4.i1
    public final void m(float f, float f10) throws k4.m {
        super.m(f, f10);
        j jVar = this.X0;
        jVar.f27817i = f;
        jVar.f27821m = 0L;
        jVar.f27823p = -1L;
        jVar.f27822n = -1L;
        jVar.c(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.Surface] */
    @Override // k4.e, k4.f1.b
    public final void p(int i10, Object obj) throws k4.m {
        PlaceholderSurface placeholderSurface;
        Handler handler;
        PlaceholderSurface placeholderSurface2;
        long j10;
        Handler handler2;
        int intValue;
        j jVar = this.X0;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 4) {
                        if (i10 == 5 && jVar.f27818j != (intValue = ((Integer) obj).intValue())) {
                            jVar.f27818j = intValue;
                            jVar.c(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.f27788i1 = intValue2;
                    b5.k kVar = this.Y;
                    if (kVar != null) {
                        kVar.i(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.D1 != intValue3) {
                    this.D1 = intValue3;
                    if (this.C1) {
                        n0();
                        return;
                    }
                    return;
                }
                return;
            }
            this.F1 = (i) obj;
            return;
        }
        if (obj instanceof Surface) {
            placeholderSurface = (Surface) obj;
        } else {
            placeholderSurface = null;
        }
        if (placeholderSurface == null) {
            PlaceholderSurface placeholderSurface3 = this.f27786g1;
            if (placeholderSurface3 != null) {
                placeholderSurface = placeholderSurface3;
            } else {
                b5.m mVar = this.f2957h0;
                if (mVar != null && K0(mVar)) {
                    placeholderSurface = PlaceholderSurface.c(this.W0, mVar.f);
                    this.f27786g1 = placeholderSurface;
                }
            }
        }
        Surface surface = this.f27785f1;
        int i11 = 9;
        m.a aVar = this.Y0;
        if (surface != placeholderSurface) {
            this.f27785f1 = placeholderSurface;
            jVar.getClass();
            if (placeholderSurface instanceof PlaceholderSurface) {
                placeholderSurface2 = null;
            } else {
                placeholderSurface2 = placeholderSurface;
            }
            if (jVar.f27814e != placeholderSurface2) {
                jVar.a();
                jVar.f27814e = placeholderSurface2;
                jVar.c(true);
            }
            this.f27787h1 = false;
            int i12 = this.f30409x;
            b5.k kVar2 = this.Y;
            if (kVar2 != null) {
                if (g0.f27302a >= 23 && placeholderSurface != null && !this.f27784d1) {
                    kVar2.l(placeholderSurface);
                } else {
                    n0();
                    Z();
                }
            }
            if (placeholderSurface != null && placeholderSurface != this.f27786g1) {
                n nVar = this.B1;
                if (nVar != null && (handler2 = aVar.f27840a) != null) {
                    handler2.post(new e0(i11, aVar, nVar));
                }
                z0();
                if (i12 == 2) {
                    long j11 = this.Z0;
                    if (j11 > 0) {
                        j10 = SystemClock.elapsedRealtime() + j11;
                    } else {
                        j10 = com.anythink.expressad.exoplayer.b.f7291b;
                    }
                    this.f27793n1 = j10;
                    return;
                }
                return;
            }
            this.B1 = null;
            z0();
            return;
        }
        if (placeholderSurface != null && placeholderSurface != this.f27786g1) {
            n nVar2 = this.B1;
            if (nVar2 != null && (handler = aVar.f27840a) != null) {
                handler.post(new e0(i11, aVar, nVar2));
            }
            if (this.f27787h1) {
                Surface surface2 = this.f27785f1;
                Handler handler3 = aVar.f27840a;
                if (handler3 != null) {
                    handler3.post(new l(aVar, surface2, SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    @Override // b5.n
    public final void p0() {
        super.p0();
        this.f27796r1 = 0;
    }

    @Override // b5.n
    public final boolean t0(b5.m mVar) {
        if (this.f27785f1 == null && !K0(mVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b5.n
    public final int v0(o oVar, i0 i0Var) throws q.b {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (!r.m(i0Var.D)) {
            return j1.k(0, 0, 0);
        }
        if (i0Var.G != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.W0;
        j0 D0 = D0(context, oVar, i0Var, z10, false);
        if (z10 && D0.isEmpty()) {
            D0 = D0(context, oVar, i0Var, false, false);
        }
        if (D0.isEmpty()) {
            return j1.k(1, 0, 0);
        }
        int i15 = i0Var.Y;
        if (i15 != 0 && i15 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return j1.k(2, 0, 0);
        }
        b5.m mVar = (b5.m) D0.get(0);
        boolean d10 = mVar.d(i0Var);
        if (!d10) {
            for (int i16 = 1; i16 < D0.size(); i16++) {
                b5.m mVar2 = (b5.m) D0.get(i16);
                if (mVar2.d(i0Var)) {
                    z12 = false;
                    d10 = true;
                    mVar = mVar2;
                    break;
                }
            }
        }
        z12 = true;
        if (d10) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        if (mVar.e(i0Var)) {
            i11 = 16;
        } else {
            i11 = 8;
        }
        if (mVar.f2950g) {
            i12 = 64;
        } else {
            i12 = 0;
        }
        if (z12) {
            i13 = 128;
        } else {
            i13 = 0;
        }
        if (g0.f27302a >= 26 && "video/dolby-vision".equals(i0Var.D) && !a.a(context)) {
            i13 = 256;
        }
        if (d10) {
            j0 D02 = D0(context, oVar, i0Var, z10, true);
            if (!D02.isEmpty()) {
                Pattern pattern = q.f2985a;
                ArrayList arrayList = new ArrayList(D02);
                Collections.sort(arrayList, new b5.p(new b0.b(i0Var, 8)));
                b5.m mVar3 = (b5.m) arrayList.get(0);
                if (mVar3.d(i0Var) && mVar3.e(i0Var)) {
                    i14 = 32;
                }
            }
        }
        return i10 | i11 | i14 | i12 | i13;
    }

    public final void z0() {
        b5.k kVar;
        this.f27789j1 = false;
        if (g0.f27302a >= 23 && this.C1 && (kVar = this.Y) != null) {
            this.E1 = new c(kVar);
        }
    }
}
