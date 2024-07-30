package b5;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import b5.k;
import b5.q;
import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.d;
import com.huawei.hms.ads.br;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import d6.c0;
import d6.g0;
import d6.s;
import j5.f0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k4.i0;
import l4.w;
import m4.x;
import n4.g;

/* compiled from: MediaCodecRenderer.java */
/* loaded from: classes2.dex */
public abstract class n extends k4.e {
    public static final byte[] V0 = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public final k.b E;
    public int E0;
    public final o F;
    public int F0;
    public final boolean G;
    public int G0;
    public final float H;
    public boolean H0;
    public final n4.g I;
    public boolean I0;
    public final n4.g J;
    public boolean J0;
    public final n4.g K;
    public long K0;
    public final g L;
    public long L0;
    public final ArrayList<Long> M;
    public boolean M0;
    public final MediaCodec.BufferInfo N;
    public boolean N0;
    public final ArrayDeque<c> O;
    public boolean O0;
    public i0 P;
    public boolean P0;
    public i0 Q;
    public k4.m Q0;
    public com.google.android.exoplayer2.drm.d R;
    public n4.e R0;
    public com.google.android.exoplayer2.drm.d S;
    public c S0;
    public MediaCrypto T;
    public long T0;
    public boolean U;
    public boolean U0;
    public final long V;
    public float W;
    public float X;
    public k Y;
    public i0 Z;

    /* renamed from: c0, reason: collision with root package name */
    public MediaFormat f2952c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2953d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f2954e0;

    /* renamed from: f0, reason: collision with root package name */
    public ArrayDeque<m> f2955f0;

    /* renamed from: g0, reason: collision with root package name */
    public b f2956g0;

    /* renamed from: h0, reason: collision with root package name */
    public m f2957h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f2958i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f2959j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f2960k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f2961l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f2962m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f2963n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f2964o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f2965p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f2966q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f2967r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f2968s0;

    /* renamed from: t0, reason: collision with root package name */
    public h f2969t0;

    /* renamed from: u0, reason: collision with root package name */
    public long f2970u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f2971v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f2972w0;

    /* renamed from: x0, reason: collision with root package name */
    public ByteBuffer f2973x0;
    public boolean y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2974z0;

    /* compiled from: MediaCodecRenderer.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(k.a aVar, w wVar) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            w.a aVar2 = wVar.f32481a;
            aVar2.getClass();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = aVar2.f32483a;
            equals = logSessionId2.equals(logSessionId);
            if (!equals) {
                MediaFormat mediaFormat = aVar.f2940b;
                stringId = logSessionId2.getStringId();
                mediaFormat.setString("log-session-id", stringId);
            }
        }
    }

    /* compiled from: MediaCodecRenderer.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: d, reason: collision with root package name */
        public static final c f2979d = new c(com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b);

        /* renamed from: a, reason: collision with root package name */
        public final long f2980a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2981b;

        /* renamed from: c, reason: collision with root package name */
        public final c0<i0> f2982c = new c0<>();

        public c(long j10, long j11) {
            this.f2980a = j10;
            this.f2981b = j11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i10, i iVar, float f) {
        super(i10);
        a3.l lVar = o.f2983a;
        this.E = iVar;
        this.F = lVar;
        this.G = false;
        this.H = f;
        this.I = new n4.g(0);
        this.J = new n4.g(0);
        this.K = new n4.g(2);
        g gVar = new g();
        this.L = gVar;
        this.M = new ArrayList<>();
        this.N = new MediaCodec.BufferInfo();
        this.W = 1.0f;
        this.X = 1.0f;
        this.V = com.anythink.expressad.exoplayer.b.f7291b;
        this.O = new ArrayDeque<>();
        s0(c.f2979d);
        gVar.j(0);
        gVar.f33322u.order(ByteOrder.nativeOrder());
        this.f2954e0 = -1.0f;
        this.f2958i0 = 0;
        this.E0 = 0;
        this.f2971v0 = -1;
        this.f2972w0 = -1;
        this.f2970u0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.K0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.L0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.T0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.F0 = 0;
        this.G0 = 0;
    }

    @Override // k4.e
    public void A() {
        this.P = null;
        s0(c.f2979d);
        this.O.clear();
        Q();
    }

    @Override // k4.e
    public void C(long j10, boolean z10) throws k4.m {
        int i10;
        this.M0 = false;
        this.N0 = false;
        this.P0 = false;
        if (this.A0) {
            this.L.h();
            this.K.h();
            this.B0 = false;
        } else if (Q()) {
            Z();
        }
        c0<i0> c0Var = this.S0.f2982c;
        synchronized (c0Var) {
            i10 = c0Var.f27287d;
        }
        if (i10 > 0) {
            this.O0 = true;
        }
        this.S0.f2982c.b();
        this.O.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r6 >= r4.K0) goto L12;
     */
    @Override // k4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(k4.i0[] r5, long r6, long r8) throws k4.m {
        /*
            r4 = this;
            b5.n$c r5 = r4.S0
            long r5 = r5.f2981b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L2d
            java.util.ArrayDeque<b5.n$c> r5 = r4.O
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L22
            long r6 = r4.T0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L22
            long r2 = r4.K0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 < 0) goto L22
            goto L2d
        L22:
            b5.n$c r6 = new b5.n$c
            long r0 = r4.K0
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L35
        L2d:
            b5.n$c r5 = new b5.n$c
            r5.<init>(r0, r8)
            r4.s0(r5)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.n.G(k4.i0[], long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final boolean I(long j10, long j11) throws k4.m {
        boolean z10;
        boolean z11;
        g gVar;
        boolean z12;
        boolean z13;
        boolean z14;
        d6.a.d(!this.N0);
        g gVar2 = this.L;
        int i10 = gVar2.B;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (l0(j10, j11, null, gVar2.f33322u, this.f2972w0, 0, i10, gVar2.f33324w, gVar2.g(), gVar2.f(4), this.Q)) {
                gVar = gVar2;
                h0(gVar.A);
                gVar.h();
                z11 = 0;
            } else {
                return false;
            }
        } else {
            z11 = 0;
            gVar = gVar2;
        }
        if (this.M0) {
            this.N0 = true;
            return z11;
        }
        boolean z15 = this.B0;
        n4.g gVar3 = this.K;
        if (z15) {
            d6.a.d(gVar.l(gVar3));
            this.B0 = z11;
        }
        if (this.C0) {
            if (gVar.B > 0) {
                z14 = true;
            } else {
                z14 = z11;
            }
            if (z14) {
                return true;
            }
            L();
            this.C0 = z11;
            Z();
            if (!this.A0) {
                return z11;
            }
        }
        d6.a.d(!this.M0);
        j1.a aVar = this.f30405t;
        aVar.n();
        gVar3.h();
        while (true) {
            gVar3.h();
            int H = H(aVar, gVar3, z11);
            if (H != -5) {
                if (H != -4) {
                    if (H != -3) {
                        throw new IllegalStateException();
                    }
                } else {
                    if (gVar3.f(4)) {
                        this.M0 = true;
                        break;
                    }
                    if (this.O0) {
                        i0 i0Var = this.P;
                        i0Var.getClass();
                        this.Q = i0Var;
                        f0(i0Var, null);
                        this.O0 = z11;
                    }
                    gVar3.k();
                    if (!gVar.l(gVar3)) {
                        this.B0 = true;
                        break;
                    }
                }
            } else {
                e0(aVar);
                break;
            }
        }
        if (gVar.B > 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if (z12) {
            gVar.k();
        }
        if (gVar.B > 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if (z13 || this.M0 || this.C0) {
            return true;
        }
        return z11;
    }

    public abstract n4.i J(m mVar, i0 i0Var, i0 i0Var2);

    public l K(IllegalStateException illegalStateException, m mVar) {
        return new l(illegalStateException, mVar);
    }

    public final void L() {
        this.C0 = false;
        this.L.h();
        this.K.h();
        this.B0 = false;
        this.A0 = false;
    }

    @TargetApi(23)
    public final boolean M() throws k4.m {
        if (this.H0) {
            this.F0 = 1;
            if (!this.f2960k0 && !this.f2962m0) {
                this.G0 = 2;
            } else {
                this.G0 = 3;
                return false;
            }
        } else {
            x0();
        }
        return true;
    }

    public final boolean N(long j10, long j11) throws k4.m {
        boolean z10;
        boolean z11;
        boolean z12;
        MediaCodec.BufferInfo bufferInfo;
        boolean l02;
        boolean z13;
        int g6;
        boolean z14;
        boolean z15;
        if (this.f2972w0 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.N;
        if (!z10) {
            if (this.f2963n0 && this.I0) {
                try {
                    g6 = this.Y.g(bufferInfo2);
                } catch (IllegalStateException unused) {
                    k0();
                    if (this.N0) {
                        n0();
                    }
                    return false;
                }
            } else {
                g6 = this.Y.g(bufferInfo2);
            }
            if (g6 < 0) {
                if (g6 == -2) {
                    this.J0 = true;
                    MediaFormat b10 = this.Y.b();
                    if (this.f2958i0 != 0 && b10.getInteger(ContentRecord.WIDTH) == 32 && b10.getInteger(ContentRecord.HEIGHT) == 32) {
                        this.f2967r0 = true;
                    } else {
                        if (this.f2965p0) {
                            b10.setInteger("channel-count", 1);
                        }
                        this.f2952c0 = b10;
                        this.f2953d0 = true;
                    }
                    return true;
                }
                if (this.f2968s0 && (this.M0 || this.F0 == 2)) {
                    k0();
                }
                return false;
            }
            if (this.f2967r0) {
                this.f2967r0 = false;
                this.Y.h(g6, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                k0();
                return false;
            }
            this.f2972w0 = g6;
            ByteBuffer m10 = this.Y.m(g6);
            this.f2973x0 = m10;
            if (m10 != null) {
                m10.position(bufferInfo2.offset);
                this.f2973x0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f2964o0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j12 = this.K0;
                if (j12 != com.anythink.expressad.exoplayer.b.f7291b) {
                    bufferInfo2.presentationTimeUs = j12;
                }
            }
            long j13 = bufferInfo2.presentationTimeUs;
            ArrayList<Long> arrayList = this.M;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (arrayList.get(i10).longValue() == j13) {
                        arrayList.remove(i10);
                        z14 = true;
                        break;
                    }
                    i10++;
                } else {
                    z14 = false;
                    break;
                }
            }
            this.y0 = z14;
            long j14 = this.L0;
            long j15 = bufferInfo2.presentationTimeUs;
            if (j14 == j15) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f2974z0 = z15;
            y0(j15);
        }
        if (this.f2963n0 && this.I0) {
            try {
                z11 = true;
                z12 = false;
            } catch (IllegalStateException unused2) {
                z12 = false;
            }
            try {
                l02 = l0(j10, j11, this.Y, this.f2973x0, this.f2972w0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.y0, this.f2974z0, this.Q);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                k0();
                if (this.N0) {
                    n0();
                }
                return z12;
            }
        } else {
            z11 = true;
            z12 = false;
            bufferInfo = bufferInfo2;
            l02 = l0(j10, j11, this.Y, this.f2973x0, this.f2972w0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.y0, this.f2974z0, this.Q);
        }
        if (l02) {
            h0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z13 = z11;
            } else {
                z13 = z12;
            }
            this.f2972w0 = -1;
            this.f2973x0 = null;
            if (!z13) {
                return z11;
            }
            k0();
        }
        return z12;
    }

    public final boolean O() throws k4.m {
        boolean z10;
        n4.c cVar;
        k kVar = this.Y;
        if (kVar == null || this.F0 == 2 || this.M0) {
            return false;
        }
        int i10 = this.f2971v0;
        n4.g gVar = this.J;
        if (i10 < 0) {
            int e10 = kVar.e();
            this.f2971v0 = e10;
            if (e10 < 0) {
                return false;
            }
            gVar.f33322u = this.Y.k(e10);
            gVar.h();
        }
        if (this.F0 == 1) {
            if (!this.f2968s0) {
                this.I0 = true;
                this.Y.n(this.f2971v0, 0, 0L, 4);
                this.f2971v0 = -1;
                gVar.f33322u = null;
            }
            this.F0 = 2;
            return false;
        }
        if (this.f2966q0) {
            this.f2966q0 = false;
            gVar.f33322u.put(V0);
            this.Y.n(this.f2971v0, 38, 0L, 0);
            this.f2971v0 = -1;
            gVar.f33322u = null;
            this.H0 = true;
            return true;
        }
        if (this.E0 == 1) {
            for (int i11 = 0; i11 < this.Z.F.size(); i11++) {
                gVar.f33322u.put(this.Z.F.get(i11));
            }
            this.E0 = 2;
        }
        int position = gVar.f33322u.position();
        j1.a aVar = this.f30405t;
        aVar.n();
        try {
            int H = H(aVar, gVar, 0);
            if (f()) {
                this.L0 = this.K0;
            }
            if (H == -3) {
                return false;
            }
            if (H == -5) {
                if (this.E0 == 2) {
                    gVar.h();
                    this.E0 = 1;
                }
                e0(aVar);
                return true;
            }
            if (gVar.f(4)) {
                if (this.E0 == 2) {
                    gVar.h();
                    this.E0 = 1;
                }
                this.M0 = true;
                if (!this.H0) {
                    k0();
                    return false;
                }
                try {
                    if (!this.f2968s0) {
                        this.I0 = true;
                        this.Y.n(this.f2971v0, 0, 0L, 4);
                        this.f2971v0 = -1;
                        gVar.f33322u = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e11) {
                    throw y(g0.r(e11.getErrorCode()), this.P, e11, false);
                }
            }
            if (!this.H0 && !gVar.f(1)) {
                gVar.h();
                if (this.E0 == 2) {
                    this.E0 = 1;
                }
                return true;
            }
            boolean f = gVar.f(1073741824);
            n4.c cVar2 = gVar.f33321t;
            if (f) {
                if (position == 0) {
                    cVar2.getClass();
                } else {
                    if (cVar2.f33302d == null) {
                        int[] iArr = new int[1];
                        cVar2.f33302d = iArr;
                        cVar2.f33306i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = cVar2.f33302d;
                    iArr2[0] = iArr2[0] + position;
                }
            }
            if (this.f2959j0 && !f) {
                ByteBuffer byteBuffer = gVar.f33322u;
                byte[] bArr = s.f27347a;
                int position2 = byteBuffer.position();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int i14 = i12 + 1;
                    if (i14 < position2) {
                        int i15 = byteBuffer.get(i12) & DefaultClassResolver.NAME;
                        if (i13 == 3) {
                            if (i15 == 1 && (byteBuffer.get(i14) & Ascii.US) == 7) {
                                ByteBuffer duplicate = byteBuffer.duplicate();
                                duplicate.position(i12 - 3);
                                duplicate.limit(position2);
                                byteBuffer.position(0);
                                byteBuffer.put(duplicate);
                                break;
                            }
                        } else if (i15 == 0) {
                            i13++;
                        }
                        if (i15 != 0) {
                            i13 = 0;
                        }
                        i12 = i14;
                    } else {
                        byteBuffer.clear();
                        break;
                    }
                }
                if (gVar.f33322u.position() == 0) {
                    return true;
                }
                this.f2959j0 = false;
            }
            long j10 = gVar.f33324w;
            h hVar = this.f2969t0;
            if (hVar != null) {
                i0 i0Var = this.P;
                if (hVar.f2932b == 0) {
                    hVar.f2931a = j10;
                }
                if (!hVar.f2933c) {
                    ByteBuffer byteBuffer2 = gVar.f33322u;
                    byteBuffer2.getClass();
                    int i16 = 0;
                    int i17 = 0;
                    for (int i18 = 4; i16 < i18; i18 = 4) {
                        i17 = (i17 << 8) | (byteBuffer2.get(i16) & DefaultClassResolver.NAME);
                        i16++;
                    }
                    int b10 = x.b(i17);
                    if (b10 == -1) {
                        hVar.f2933c = true;
                        hVar.f2932b = 0L;
                        hVar.f2931a = gVar.f33324w;
                        d6.p.f("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j10 = gVar.f33324w;
                    } else {
                        z10 = f;
                        long max = Math.max(0L, ((hVar.f2932b - 529) * 1000000) / i0Var.R) + hVar.f2931a;
                        hVar.f2932b += b10;
                        j10 = max;
                        long j11 = this.K0;
                        h hVar2 = this.f2969t0;
                        i0 i0Var2 = this.P;
                        hVar2.getClass();
                        cVar = cVar2;
                        this.K0 = Math.max(j11, Math.max(0L, ((hVar2.f2932b - 529) * 1000000) / i0Var2.R) + hVar2.f2931a);
                    }
                }
                z10 = f;
                long j112 = this.K0;
                h hVar22 = this.f2969t0;
                i0 i0Var22 = this.P;
                hVar22.getClass();
                cVar = cVar2;
                this.K0 = Math.max(j112, Math.max(0L, ((hVar22.f2932b - 529) * 1000000) / i0Var22.R) + hVar22.f2931a);
            } else {
                z10 = f;
                cVar = cVar2;
            }
            if (gVar.g()) {
                this.M.add(Long.valueOf(j10));
            }
            if (this.O0) {
                ArrayDeque<c> arrayDeque = this.O;
                if (!arrayDeque.isEmpty()) {
                    arrayDeque.peekLast().f2982c.a(j10, this.P);
                } else {
                    this.S0.f2982c.a(j10, this.P);
                }
                this.O0 = false;
            }
            this.K0 = Math.max(this.K0, j10);
            gVar.k();
            if (gVar.f(268435456)) {
                X(gVar);
            }
            j0(gVar);
            try {
                if (z10) {
                    this.Y.j(this.f2971v0, cVar, j10);
                } else {
                    this.Y.n(this.f2971v0, gVar.f33322u.limit(), j10, 0);
                }
                this.f2971v0 = -1;
                gVar.f33322u = null;
                this.H0 = true;
                this.E0 = 0;
                this.R0.f33312c++;
                return true;
            } catch (MediaCodec.CryptoException e12) {
                throw y(g0.r(e12.getErrorCode()), this.P, e12, false);
            }
        } catch (g.a e13) {
            b0(e13);
            m0(0);
            P();
            return true;
        }
    }

    public final void P() {
        try {
            this.Y.flush();
        } finally {
            p0();
        }
    }

    public final boolean Q() {
        boolean z10;
        if (this.Y == null) {
            return false;
        }
        int i10 = this.G0;
        if (i10 != 3 && !this.f2960k0 && ((!this.f2961l0 || this.J0) && (!this.f2962m0 || !this.I0))) {
            if (i10 == 2) {
                int i11 = g0.f27302a;
                if (i11 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d6.a.d(z10);
                if (i11 >= 23) {
                    try {
                        x0();
                    } catch (k4.m e10) {
                        d6.p.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                        n0();
                        return true;
                    }
                }
            }
            P();
            return false;
        }
        n0();
        return true;
    }

    public final List<m> R(boolean z10) throws q.b {
        i0 i0Var = this.P;
        o oVar = this.F;
        ArrayList U = U(oVar, i0Var, z10);
        if (U.isEmpty() && z10) {
            U = U(oVar, this.P, false);
            if (!U.isEmpty()) {
                d6.p.f("MediaCodecRenderer", "Drm session requires secure decoder for " + this.P.D + ", but no secure decoder available. Trying to proceed with " + U + ".");
            }
        }
        return U;
    }

    public boolean S() {
        return false;
    }

    public abstract float T(float f, i0[] i0VarArr);

    public abstract ArrayList U(o oVar, i0 i0Var, boolean z10) throws q.b;

    public final o4.g V(com.google.android.exoplayer2.drm.d dVar) throws k4.m {
        n4.b g6 = dVar.g();
        if (g6 != null && !(g6 instanceof o4.g)) {
            throw y(AdError.MEDIAVIEW_MISSING_ERROR_CODE, this.P, new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + g6), false);
        }
        return (o4.g) g6;
    }

    public abstract k.a W(m mVar, i0 i0Var, MediaCrypto mediaCrypto, float f);

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0376, code lost:
    
        if ("stvm8".equals(r11) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0386, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0401  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(b5.m r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.n.Y(b5.m, android.media.MediaCrypto):void");
    }

    public final void Z() throws k4.m {
        i0 i0Var;
        boolean z10;
        if (this.Y == null && !this.A0 && (i0Var = this.P) != null) {
            if (this.S == null && u0(i0Var)) {
                i0 i0Var2 = this.P;
                L();
                String str = i0Var2.D;
                boolean equals = com.anythink.expressad.exoplayer.k.o.f9083r.equals(str);
                g gVar = this.L;
                if (!equals && !com.anythink.expressad.exoplayer.k.o.f9085t.equals(str) && !com.anythink.expressad.exoplayer.k.o.H.equals(str)) {
                    gVar.getClass();
                    gVar.C = 1;
                } else {
                    gVar.getClass();
                    gVar.C = 32;
                }
                this.A0 = true;
                return;
            }
            r0(this.S);
            String str2 = this.P.D;
            com.google.android.exoplayer2.drm.d dVar = this.R;
            if (dVar != null) {
                if (this.T == null) {
                    o4.g V = V(dVar);
                    if (V == null) {
                        if (this.R.getError() == null) {
                            return;
                        }
                    } else {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(V.f33619a, V.f33620b);
                            this.T = mediaCrypto;
                            if (!V.f33621c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.U = z10;
                        } catch (MediaCryptoException e10) {
                            throw y(6006, this.P, e10, false);
                        }
                    }
                }
                if (o4.g.f33618d) {
                    int state = this.R.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        d.a error = this.R.getError();
                        error.getClass();
                        throw y(error.f19976s, this.P, error, false);
                    }
                }
            }
            try {
                a0(this.T, this.U);
            } catch (b e11) {
                throw y(br.f21566i, this.P, e11, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(android.media.MediaCrypto r12, boolean r13) throws b5.n.b {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.n.a0(android.media.MediaCrypto, boolean):void");
    }

    @Override // k4.i1
    public boolean b() {
        return this.N0;
    }

    public abstract void b0(Exception exc);

    @Override // k4.j1
    public final int c(i0 i0Var) throws k4.m {
        try {
            return v0(this.F, i0Var);
        } catch (q.b e10) {
            throw z(e10, i0Var);
        }
    }

    public abstract void c0(String str, long j10, long j11);

    public abstract void d0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0138, code lost:
    
        if (r0 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r12 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d9, code lost:
    
        if (M() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013a, code lost:
    
        r12 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fe, code lost:
    
        if (r5.J == r6.J) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010c, code lost:
    
        if (M() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0120, code lost:
    
        if (M() == false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n4.i e0(j1.a r12) throws k4.m {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.n.e0(j1.a):n4.i");
    }

    public abstract void f0(i0 i0Var, MediaFormat mediaFormat) throws k4.m;

    public void h0(long j10) {
        this.T0 = j10;
        ArrayDeque<c> arrayDeque = this.O;
        if (!arrayDeque.isEmpty() && j10 >= arrayDeque.peek().f2980a) {
            s0(arrayDeque.poll());
            i0();
        }
    }

    public abstract void i0();

    @Override // k4.i1
    public boolean isReady() {
        boolean isReady;
        boolean z10;
        if (this.P == null) {
            return false;
        }
        if (f()) {
            isReady = this.C;
        } else {
            f0 f0Var = this.y;
            f0Var.getClass();
            isReady = f0Var.isReady();
        }
        if (!isReady) {
            if (this.f2972w0 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (this.f2970u0 == com.anythink.expressad.exoplayer.b.f7291b || SystemClock.elapsedRealtime() >= this.f2970u0)) {
                return false;
            }
        }
        return true;
    }

    public abstract void j0(n4.g gVar) throws k4.m;

    @TargetApi(23)
    public final void k0() throws k4.m {
        int i10 = this.G0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.N0 = true;
                    o0();
                    return;
                } else {
                    n0();
                    Z();
                    return;
                }
            }
            P();
            x0();
            return;
        }
        P();
    }

    public abstract boolean l0(long j10, long j11, k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, i0 i0Var) throws k4.m;

    @Override // k4.i1
    public void m(float f, float f10) throws k4.m {
        this.W = f;
        this.X = f10;
        w0(this.Z);
    }

    public final boolean m0(int i10) throws k4.m {
        j1.a aVar = this.f30405t;
        aVar.n();
        n4.g gVar = this.I;
        gVar.h();
        int H = H(aVar, gVar, i10 | 4);
        if (H == -5) {
            e0(aVar);
            return true;
        }
        if (H == -4 && gVar.f(4)) {
            this.M0 = true;
            k0();
            return false;
        }
        return false;
    }

    @Override // k4.e, k4.j1
    public final int n() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0() {
        try {
            k kVar = this.Y;
            if (kVar != null) {
                kVar.release();
                this.R0.f33311b++;
                d0(this.f2957h0.f2945a);
            }
            this.Y = null;
            try {
                MediaCrypto mediaCrypto = this.T;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.Y = null;
            try {
                MediaCrypto mediaCrypto2 = this.T;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0068 A[LOOP:1: B:33:0x0048->B:42:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0069 A[EDGE_INSN: B:43:0x0069->B:44:0x0069 BREAK  A[LOOP:1: B:33:0x0048->B:42:0x0068], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0084 A[LOOP:2: B:45:0x0069->B:54:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0085 A[EDGE_INSN: B:55:0x0085->B:56:0x0085 BREAK  A[LOOP:2: B:45:0x0069->B:54:0x0084], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    @Override // k4.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(long r12, long r14) throws k4.m {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.n.o(long, long):void");
    }

    public void p0() {
        this.f2971v0 = -1;
        this.J.f33322u = null;
        this.f2972w0 = -1;
        this.f2973x0 = null;
        this.f2970u0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.I0 = false;
        this.H0 = false;
        this.f2966q0 = false;
        this.f2967r0 = false;
        this.y0 = false;
        this.f2974z0 = false;
        this.M.clear();
        this.K0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.L0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.T0 = com.anythink.expressad.exoplayer.b.f7291b;
        h hVar = this.f2969t0;
        if (hVar != null) {
            hVar.f2931a = 0L;
            hVar.f2932b = 0L;
            hVar.f2933c = false;
        }
        this.F0 = 0;
        this.G0 = 0;
        this.E0 = this.D0 ? 1 : 0;
    }

    public final void q0() {
        p0();
        this.Q0 = null;
        this.f2969t0 = null;
        this.f2955f0 = null;
        this.f2957h0 = null;
        this.Z = null;
        this.f2952c0 = null;
        this.f2953d0 = false;
        this.J0 = false;
        this.f2954e0 = -1.0f;
        this.f2958i0 = 0;
        this.f2959j0 = false;
        this.f2960k0 = false;
        this.f2961l0 = false;
        this.f2962m0 = false;
        this.f2963n0 = false;
        this.f2964o0 = false;
        this.f2965p0 = false;
        this.f2968s0 = false;
        this.D0 = false;
        this.E0 = 0;
        this.U = false;
    }

    public final void r0(com.google.android.exoplayer2.drm.d dVar) {
        com.google.android.exoplayer2.drm.d.c(this.R, dVar);
        this.R = dVar;
    }

    public final void s0(c cVar) {
        this.S0 = cVar;
        long j10 = cVar.f2981b;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.U0 = true;
            g0(j10);
        }
    }

    public boolean t0(m mVar) {
        return true;
    }

    public boolean u0(i0 i0Var) {
        return false;
    }

    public abstract int v0(o oVar, i0 i0Var) throws q.b;

    public final boolean w0(i0 i0Var) throws k4.m {
        if (g0.f27302a >= 23 && this.Y != null && this.G0 != 3 && this.f30409x != 0) {
            float f = this.X;
            i0[] i0VarArr = this.f30410z;
            i0VarArr.getClass();
            float T = T(f, i0VarArr);
            float f10 = this.f2954e0;
            if (f10 == T) {
                return true;
            }
            if (T == -1.0f) {
                if (this.H0) {
                    this.F0 = 1;
                    this.G0 = 3;
                    return false;
                }
                n0();
                Z();
                return false;
            }
            if (f10 == -1.0f && T <= this.H) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", T);
            this.Y.c(bundle);
            this.f2954e0 = T;
        }
        return true;
    }

    public final void x0() throws k4.m {
        try {
            this.T.setMediaDrmSession(V(this.S).f33620b);
            r0(this.S);
            this.F0 = 0;
            this.G0 = 0;
        } catch (MediaCryptoException e10) {
            throw y(6006, this.P, e10, false);
        }
    }

    public final void y0(long j10) throws k4.m {
        boolean z10;
        i0 d10;
        i0 e10;
        c0<i0> c0Var = this.S0.f2982c;
        synchronized (c0Var) {
            z10 = true;
            d10 = c0Var.d(j10, true);
        }
        i0 i0Var = d10;
        if (i0Var == null && this.U0 && this.f2952c0 != null) {
            c0<i0> c0Var2 = this.S0.f2982c;
            synchronized (c0Var2) {
                if (c0Var2.f27287d == 0) {
                    e10 = null;
                } else {
                    e10 = c0Var2.e();
                }
            }
            i0Var = e10;
        }
        if (i0Var != null) {
            this.Q = i0Var;
        } else {
            z10 = false;
        }
        if (z10 || (this.f2953d0 && this.Q != null)) {
            f0(this.Q, this.f2952c0);
            this.f2953d0 = false;
            this.U0 = false;
        }
    }

    /* compiled from: MediaCodecRenderer.java */
    /* loaded from: classes2.dex */
    public static class b extends Exception {

        /* renamed from: s, reason: collision with root package name */
        public final String f2975s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f2976t;

        /* renamed from: u, reason: collision with root package name */
        public final m f2977u;

        /* renamed from: v, reason: collision with root package name */
        public final String f2978v;

        public b(int i10, i0 i0Var, q.b bVar, boolean z10) {
            this("Decoder init failed: [" + i10 + "], " + i0Var, bVar, i0Var.D, z10, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
        }

        public b(String str, Throwable th, String str2, boolean z10, m mVar, String str3) {
            super(str, th);
            this.f2975s = str2;
            this.f2976t = z10;
            this.f2977u = mVar;
            this.f2978v = str3;
        }
    }

    public void o0() throws k4.m {
    }

    public void X(n4.g gVar) throws k4.m {
    }

    public void g0(long j10) {
    }
}
