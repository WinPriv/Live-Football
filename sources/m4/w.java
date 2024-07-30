package m4;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Handler;
import b5.q;
import com.applovin.exoplayer2.b.d0;
import d6.g0;
import j7.j0;
import j7.v1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import k4.a0;
import k4.d1;
import k4.i0;
import k4.i1;
import k4.k1;
import m4.k;
import m4.l;

/* compiled from: MediaCodecAudioRenderer.java */
/* loaded from: classes2.dex */
public final class w extends b5.n implements d6.q {
    public final Context W0;
    public final k.a X0;
    public final l Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f32862a1;

    /* renamed from: b1, reason: collision with root package name */
    public i0 f32863b1;

    /* renamed from: c1, reason: collision with root package name */
    public long f32864c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f32865d1;
    public boolean e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f32866f1;

    /* renamed from: g1, reason: collision with root package name */
    public i1.a f32867g1;

    /* compiled from: MediaCodecAudioRenderer.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(l lVar, Object obj) {
            lVar.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* compiled from: MediaCodecAudioRenderer.java */
    /* loaded from: classes2.dex */
    public final class b implements l.c {
        public b() {
        }

        public final void a(Exception exc) {
            d6.p.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            k.a aVar = w.this.X0;
            Handler handler = aVar.f32747a;
            if (handler != null) {
                handler.post(new androidx.appcompat.app.p(6, aVar, exc));
            }
        }
    }

    public w(Context context, b5.i iVar, Handler handler, a0.b bVar, r rVar) {
        super(1, iVar, 44100.0f);
        this.W0 = context.getApplicationContext();
        this.Y0 = rVar;
        this.X0 = new k.a(handler, bVar);
        rVar.f32820r = new b();
    }

    public static j0 A0(b5.o oVar, i0 i0Var, boolean z10, l lVar) throws q.b {
        b5.m mVar;
        String str = i0Var.D;
        if (str == null) {
            j0.b bVar = j0.f30006t;
            return v1.f30113w;
        }
        if (lVar.c(i0Var)) {
            List<b5.m> e10 = b5.q.e(com.anythink.expressad.exoplayer.k.o.f9088w, false, false);
            if (e10.isEmpty()) {
                mVar = null;
            } else {
                mVar = e10.get(0);
            }
            if (mVar != null) {
                return j0.G(mVar);
            }
        }
        List<b5.m> decoderInfos = oVar.getDecoderInfos(str, z10, false);
        String b10 = b5.q.b(i0Var);
        if (b10 == null) {
            return j0.C(decoderInfos);
        }
        List<b5.m> decoderInfos2 = oVar.getDecoderInfos(b10, z10, false);
        j0.b bVar2 = j0.f30006t;
        j0.a aVar = new j0.a();
        aVar.d(decoderInfos);
        aVar.d(decoderInfos2);
        return aVar.e();
    }

    @Override // b5.n, k4.e
    public final void A() {
        k.a aVar = this.X0;
        this.f32866f1 = true;
        try {
            this.Y0.flush();
            try {
                super.A();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A();
                throw th;
            } finally {
            }
        }
    }

    @Override // k4.e
    public final void B(boolean z10, boolean z11) throws k4.m {
        n4.e eVar = new n4.e();
        this.R0 = eVar;
        k.a aVar = this.X0;
        Handler handler = aVar.f32747a;
        if (handler != null) {
            handler.post(new e0.g(6, aVar, eVar));
        }
        k1 k1Var = this.f30406u;
        k1Var.getClass();
        boolean z12 = k1Var.f30561a;
        l lVar = this.Y0;
        if (z12) {
            lVar.o();
        } else {
            lVar.l();
        }
        l4.w wVar = this.f30408w;
        wVar.getClass();
        lVar.e(wVar);
    }

    public final void B0() {
        long k10 = this.Y0.k(b());
        if (k10 != Long.MIN_VALUE) {
            if (!this.e1) {
                k10 = Math.max(this.f32864c1, k10);
            }
            this.f32864c1 = k10;
            this.e1 = false;
        }
    }

    @Override // b5.n, k4.e
    public final void C(long j10, boolean z10) throws k4.m {
        super.C(j10, z10);
        this.Y0.flush();
        this.f32864c1 = j10;
        this.f32865d1 = true;
        this.e1 = true;
    }

    @Override // k4.e
    public final void D() {
        l lVar = this.Y0;
        try {
            try {
                L();
                n0();
            } finally {
                com.google.android.exoplayer2.drm.d.c(this.S, null);
                this.S = null;
            }
        } finally {
            if (this.f32866f1) {
                this.f32866f1 = false;
                lVar.reset();
            }
        }
    }

    @Override // k4.e
    public final void E() {
        this.Y0.play();
    }

    @Override // k4.e
    public final void F() {
        B0();
        this.Y0.pause();
    }

    @Override // b5.n
    public final n4.i J(b5.m mVar, i0 i0Var, i0 i0Var2) {
        int i10;
        n4.i b10 = mVar.b(i0Var, i0Var2);
        int z02 = z0(i0Var2, mVar);
        int i11 = this.Z0;
        int i12 = b10.f33332e;
        if (z02 > i11) {
            i12 |= 64;
        }
        int i13 = i12;
        String str = mVar.f2945a;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = b10.f33331d;
        }
        return new n4.i(str, i0Var, i0Var2, i10, i13);
    }

    @Override // b5.n
    public final float T(float f, i0[] i0VarArr) {
        int i10 = -1;
        for (i0 i0Var : i0VarArr) {
            int i11 = i0Var.R;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f * i10;
    }

    @Override // b5.n
    public final ArrayList U(b5.o oVar, i0 i0Var, boolean z10) throws q.b {
        j0 A0 = A0(oVar, i0Var, z10, this.Y0);
        Pattern pattern = b5.q.f2985a;
        ArrayList arrayList = new ArrayList(A0);
        Collections.sort(arrayList, new b5.p(new b0.b(i0Var, 8)));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    @Override // b5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b5.k.a W(b5.m r12, k4.i0 r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.w.W(b5.m, k4.i0, android.media.MediaCrypto, float):b5.k$a");
    }

    @Override // d6.q
    public final void a(d1 d1Var) {
        this.Y0.a(d1Var);
    }

    @Override // b5.n, k4.i1
    public final boolean b() {
        if (this.N0 && this.Y0.b()) {
            return true;
        }
        return false;
    }

    @Override // b5.n
    public final void b0(Exception exc) {
        d6.p.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        k.a aVar = this.X0;
        Handler handler = aVar.f32747a;
        if (handler != null) {
            handler.post(new d0(4, aVar, exc));
        }
    }

    @Override // b5.n
    public final void c0(final String str, final long j10, final long j11) {
        final k.a aVar = this.X0;
        Handler handler = aVar.f32747a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: m4.i
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    long j12 = j10;
                    long j13 = j11;
                    k kVar = k.a.this.f32748b;
                    int i10 = g0.f27302a;
                    kVar.k(j12, str2, j13);
                }
            });
        }
    }

    @Override // d6.q
    public final d1 d() {
        return this.Y0.d();
    }

    @Override // b5.n
    public final void d0(String str) {
        k.a aVar = this.X0;
        Handler handler = aVar.f32747a;
        if (handler != null) {
            handler.post(new e0.g(5, aVar, str));
        }
    }

    @Override // b5.n
    public final n4.i e0(j1.a aVar) throws k4.m {
        n4.i e02 = super.e0(aVar);
        i0 i0Var = (i0) aVar.f29569u;
        k.a aVar2 = this.X0;
        Handler handler = aVar2.f32747a;
        if (handler != null) {
            handler.post(new androidx.emoji2.text.g(aVar2, i0Var, e02, 4));
        }
        return e02;
    }

    @Override // b5.n
    public final void f0(i0 i0Var, MediaFormat mediaFormat) throws k4.m {
        int i10;
        int i11;
        i0 i0Var2 = this.f32863b1;
        int[] iArr = null;
        if (i0Var2 != null) {
            i0Var = i0Var2;
        } else if (this.Y != null) {
            if (com.anythink.expressad.exoplayer.k.o.f9088w.equals(i0Var.D)) {
                i10 = i0Var.S;
            } else if (g0.f27302a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = g0.v(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            i0.a aVar = new i0.a();
            aVar.f30534k = com.anythink.expressad.exoplayer.k.o.f9088w;
            aVar.f30547z = i10;
            aVar.A = i0Var.T;
            aVar.B = i0Var.U;
            aVar.f30546x = mediaFormat.getInteger("channel-count");
            aVar.y = mediaFormat.getInteger("sample-rate");
            i0 i0Var3 = new i0(aVar);
            if (this.f32862a1 && i0Var3.Q == 6 && (i11 = i0Var.Q) < 6) {
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr2[i12] = i12;
                }
                iArr = iArr2;
            }
            i0Var = i0Var3;
        }
        try {
            this.Y0.m(i0Var, iArr);
        } catch (l.a e10) {
            throw y(5001, e10.f32749s, e10, false);
        }
    }

    @Override // b5.n
    public final void g0(long j10) {
        this.Y0.getClass();
    }

    @Override // k4.i1, k4.j1
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // b5.n
    public final void i0() {
        this.Y0.n();
    }

    @Override // b5.n, k4.i1
    public final boolean isReady() {
        if (!this.Y0.h() && !super.isReady()) {
            return false;
        }
        return true;
    }

    @Override // b5.n
    public final void j0(n4.g gVar) {
        if (this.f32865d1 && !gVar.g()) {
            if (Math.abs(gVar.f33324w - this.f32864c1) > 500000) {
                this.f32864c1 = gVar.f33324w;
            }
            this.f32865d1 = false;
        }
    }

    @Override // d6.q
    public final long l() {
        if (this.f30409x == 2) {
            B0();
        }
        return this.f32864c1;
    }

    @Override // b5.n
    public final boolean l0(long j10, long j11, b5.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, i0 i0Var) throws k4.m {
        byteBuffer.getClass();
        if (this.f32863b1 != null && (i11 & 2) != 0) {
            kVar.getClass();
            kVar.h(i10, false);
            return true;
        }
        l lVar = this.Y0;
        if (z10) {
            if (kVar != null) {
                kVar.h(i10, false);
            }
            this.R0.f += i12;
            lVar.n();
            return true;
        }
        try {
            if (!lVar.p(byteBuffer, j12, i12)) {
                return false;
            }
            if (kVar != null) {
                kVar.h(i10, false);
            }
            this.R0.f33314e += i12;
            return true;
        } catch (l.b e10) {
            throw y(5001, e10.f32752u, e10, e10.f32751t);
        } catch (l.e e11) {
            throw y(5002, i0Var, e11, e11.f32754t);
        }
    }

    @Override // b5.n
    public final void o0() throws k4.m {
        try {
            this.Y0.g();
        } catch (l.e e10) {
            throw y(5002, e10.f32755u, e10, e10.f32754t);
        }
    }

    @Override // k4.e, k4.f1.b
    public final void p(int i10, Object obj) throws k4.m {
        l lVar = this.Y0;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    switch (i10) {
                        case 9:
                            lVar.r(((Boolean) obj).booleanValue());
                            return;
                        case 10:
                            lVar.j(((Integer) obj).intValue());
                            return;
                        case 11:
                            this.f32867g1 = (i1.a) obj;
                            return;
                        case 12:
                            if (g0.f27302a >= 23) {
                                a.a(lVar, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                lVar.i((o) obj);
                return;
            }
            lVar.q((d) obj);
            return;
        }
        lVar.setVolume(((Float) obj).floatValue());
    }

    @Override // b5.n
    public final boolean u0(i0 i0Var) {
        return this.Y0.c(i0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r4 != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // b5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int v0(b5.o r12, k4.i0 r13) throws b5.q.b {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.w.v0(b5.o, k4.i0):int");
    }

    public final int z0(i0 i0Var, b5.m mVar) {
        int i10;
        if ("OMX.google.raw.decoder".equals(mVar.f2945a) && (i10 = g0.f27302a) < 24 && (i10 != 23 || !g0.I(this.W0))) {
            return -1;
        }
        return i0Var.E;
    }

    @Override // k4.e, k4.i1
    public final d6.q w() {
        return this;
    }
}
