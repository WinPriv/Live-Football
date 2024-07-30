package com.anythink.expressad.exoplayer.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.anythink.expressad.exoplayer.b.h;
import com.anythink.expressad.exoplayer.b.j;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f7421b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f7422c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final long f7423d = 250000;

    /* renamed from: e, reason: collision with root package name */
    private static final long f7424e = 750000;
    private static final long f = 250000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7425g = 4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7426h = -2;

    /* renamed from: i, reason: collision with root package name */
    private static final int f7427i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static final int f7428j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f7429k = 1;

    /* renamed from: l, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    private static final int f7430l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final String f7431m = "AudioTrack";

    /* renamed from: n, reason: collision with root package name */
    private static final int f7432n = 0;
    private static final int o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f7433p = 2;
    private h.c A;
    private AudioTrack B;
    private AudioTrack C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private int I;
    private com.anythink.expressad.exoplayer.b.b J;
    private boolean K;
    private boolean L;
    private int M;
    private v N;
    private v O;
    private long P;
    private long Q;
    private ByteBuffer R;
    private int S;
    private int T;
    private long U;
    private long V;
    private int W;
    private long X;
    private long Y;
    private int Z;

    /* renamed from: aa, reason: collision with root package name */
    private int f7434aa;

    /* renamed from: ab, reason: collision with root package name */
    private long f7435ab;

    /* renamed from: ac, reason: collision with root package name */
    private float f7436ac;

    /* renamed from: ad, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.b.f[] f7437ad;
    private ByteBuffer[] ae;
    private ByteBuffer af;
    private ByteBuffer ag;
    private byte[] ah;
    private int ai;
    private int aj;
    private boolean ak;
    private boolean al;
    private int am;
    private boolean an;
    private long ao;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.b.c f7438q;

    /* renamed from: r, reason: collision with root package name */
    private final a f7439r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f7440s;

    /* renamed from: t, reason: collision with root package name */
    private final k f7441t;

    /* renamed from: u, reason: collision with root package name */
    private final u f7442u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.b.f[] f7443v;

    /* renamed from: w, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.b.f[] f7444w;

    /* renamed from: x, reason: collision with root package name */
    private final ConditionVariable f7445x;
    private final j y;

    /* renamed from: z, reason: collision with root package name */
    private final ArrayDeque<d> f7446z;

    /* loaded from: classes.dex */
    public interface a {
        long a(long j10);

        v a(v vVar);

        com.anythink.expressad.exoplayer.b.f[] a();

        long b();
    }

    /* loaded from: classes.dex */
    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.expressad.exoplayer.b.f[] f7451a;

        /* renamed from: b, reason: collision with root package name */
        private final q f7452b;

        /* renamed from: c, reason: collision with root package name */
        private final t f7453c;

        public b(com.anythink.expressad.exoplayer.b.f... fVarArr) {
            com.anythink.expressad.exoplayer.b.f[] fVarArr2 = (com.anythink.expressad.exoplayer.b.f[]) Arrays.copyOf(fVarArr, fVarArr.length + 2);
            this.f7451a = fVarArr2;
            q qVar = new q();
            this.f7452b = qVar;
            t tVar = new t();
            this.f7453c = tVar;
            fVarArr2[fVarArr.length] = qVar;
            fVarArr2[fVarArr.length + 1] = tVar;
        }

        @Override // com.anythink.expressad.exoplayer.b.l.a
        public final com.anythink.expressad.exoplayer.b.f[] a() {
            return this.f7451a;
        }

        @Override // com.anythink.expressad.exoplayer.b.l.a
        public final long b() {
            return this.f7452b.j();
        }

        @Override // com.anythink.expressad.exoplayer.b.l.a
        public final v a(v vVar) {
            this.f7452b.a(vVar.f9348d);
            return new v(this.f7453c.a(vVar.f9346b), this.f7453c.b(vVar.f9347c), vVar.f9348d);
        }

        @Override // com.anythink.expressad.exoplayer.b.l.a
        public final long a(long j10) {
            return this.f7453c.a(j10);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends RuntimeException {
        public /* synthetic */ c(String str, byte b10) {
            this(str);
        }

        private c(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final v f7454a;

        /* renamed from: b, reason: collision with root package name */
        private final long f7455b;

        /* renamed from: c, reason: collision with root package name */
        private final long f7456c;

        public /* synthetic */ d(v vVar, long j10, long j11, byte b10) {
            this(vVar, j10, j11);
        }

        private d(v vVar, long j10, long j11) {
            this.f7454a = vVar;
            this.f7455b = j10;
            this.f7456c = j11;
        }
    }

    /* loaded from: classes.dex */
    public final class e implements j.a {
        private e() {
        }

        @Override // com.anythink.expressad.exoplayer.b.j.a
        public final void a(long j10, long j11, long j12, long j13) {
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Spurious audio timestamp (frame position mismatch): ", j10, ", ");
            k10.append(j11);
            k10.append(", ");
            k10.append(j12);
            k10.append(", ");
            k10.append(j13);
            k10.append(", ");
            k10.append(l.this.r());
            k10.append(", ");
            k10.append(l.this.s());
            String sb2 = k10.toString();
            if (!l.f7422c) {
                Log.w(l.f7431m, sb2);
                return;
            }
            throw new c(sb2, (byte) 0);
        }

        @Override // com.anythink.expressad.exoplayer.b.j.a
        public final void b(long j10, long j11, long j12, long j13) {
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Spurious audio timestamp (system clock mismatch): ", j10, ", ");
            k10.append(j11);
            k10.append(", ");
            k10.append(j12);
            k10.append(", ");
            k10.append(j13);
            k10.append(", ");
            k10.append(l.this.r());
            k10.append(", ");
            k10.append(l.this.s());
            String sb2 = k10.toString();
            if (!l.f7422c) {
                Log.w(l.f7431m, sb2);
                return;
            }
            throw new c(sb2, (byte) 0);
        }

        public /* synthetic */ e(l lVar, byte b10) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.b.j.a
        public final void a(long j10) {
            Log.w(l.f7431m, "Ignoring impossibly large audio latency: ".concat(String.valueOf(j10)));
        }

        @Override // com.anythink.expressad.exoplayer.b.j.a
        public final void a(int i10, long j10) {
            if (l.this.A != null) {
                l.this.A.a(i10, j10, SystemClock.elapsedRealtime() - l.this.ao);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface f {
    }

    public l(com.anythink.expressad.exoplayer.b.c cVar, com.anythink.expressad.exoplayer.b.f[] fVarArr) {
        this(cVar, fVarArr, (byte) 0);
    }

    private void k() {
        ArrayList arrayList = new ArrayList();
        for (com.anythink.expressad.exoplayer.b.f fVar : v()) {
            if (fVar.a()) {
                arrayList.add(fVar);
            } else {
                fVar.h();
            }
        }
        int size = arrayList.size();
        this.f7437ad = (com.anythink.expressad.exoplayer.b.f[]) arrayList.toArray(new com.anythink.expressad.exoplayer.b.f[size]);
        this.ae = new ByteBuffer[size];
        l();
    }

    private void l() {
        int i10 = 0;
        while (true) {
            com.anythink.expressad.exoplayer.b.f[] fVarArr = this.f7437ad;
            if (i10 < fVarArr.length) {
                com.anythink.expressad.exoplayer.b.f fVar = fVarArr[i10];
                fVar.h();
                this.ae[i10] = fVar.f();
                i10++;
            } else {
                return;
            }
        }
    }

    private void m() {
        v vVar;
        this.f7445x.block();
        AudioTrack t10 = t();
        this.C = t10;
        int audioSessionId = t10.getAudioSessionId();
        if (f7421b && af.f8993a < 21) {
            AudioTrack audioTrack = this.B;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                p();
            }
            if (this.B == null) {
                this.B = new AudioTrack(3, 4000, 4, 2, 2, 0, audioSessionId);
            }
        }
        if (this.am != audioSessionId) {
            this.am = audioSessionId;
            h.c cVar = this.A;
            if (cVar != null) {
                cVar.a(audioSessionId);
            }
        }
        if (this.L) {
            vVar = this.f7439r.a(this.O);
        } else {
            vVar = v.f9345a;
        }
        this.O = vVar;
        k();
        this.y.a(this.C, this.I, this.W, this.M);
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:7:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean n() {
        /*
            r9 = this;
            int r0 = r9.aj
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.K
            if (r0 == 0) goto Ld
            r0 = r2
            goto L10
        Ld:
            com.anythink.expressad.exoplayer.b.f[] r0 = r9.f7437ad
            int r0 = r0.length
        L10:
            r9.aj = r0
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            int r4 = r9.aj
            com.anythink.expressad.exoplayer.b.f[] r5 = r9.f7437ad
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.e()
        L28:
            r9.a(r7)
            boolean r0 = r4.g()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.aj
            int r0 = r0 + r1
            r9.aj = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.ag
            if (r0 == 0) goto L44
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.ag
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.aj = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.b.l.n():boolean");
    }

    private void o() {
        if (q()) {
            if (af.f8993a >= 21) {
                this.C.setVolume(this.f7436ac);
                return;
            }
            AudioTrack audioTrack = this.C;
            float f10 = this.f7436ac;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    private void p() {
        final AudioTrack audioTrack = this.B;
        if (audioTrack == null) {
            return;
        }
        this.B = null;
        new Thread() { // from class: com.anythink.expressad.exoplayer.b.l.2
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                audioTrack.release();
            }
        }.start();
    }

    private boolean q() {
        if (this.C != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        if (this.D) {
            return this.U / this.T;
        }
        return this.V;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long s() {
        if (this.D) {
            return this.X / this.W;
        }
        return this.Y;
    }

    private AudioTrack t() {
        AudioTrack audioTrack;
        AudioAttributes a10;
        if (af.f8993a >= 21) {
            if (this.an) {
                a10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                a10 = this.J.a();
            }
            AudioAttributes audioAttributes = a10;
            AudioFormat build = new AudioFormat.Builder().setChannelMask(this.H).setEncoding(this.I).setSampleRate(this.G).build();
            int i10 = this.am;
            if (i10 == 0) {
                i10 = 0;
            }
            audioTrack = new AudioTrack(audioAttributes, build, this.M, 1, i10);
        } else {
            int f10 = af.f(this.J.f7338d);
            if (this.am == 0) {
                audioTrack = new AudioTrack(f10, this.G, this.H, this.I, this.M, 1);
            } else {
                audioTrack = new AudioTrack(f10, this.G, this.H, this.I, this.M, 1, this.am);
            }
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new h.b(state, this.G, this.H, this.M);
    }

    @TargetApi(21)
    private AudioTrack u() {
        AudioAttributes a10;
        if (this.an) {
            a10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            a10 = this.J.a();
        }
        AudioAttributes audioAttributes = a10;
        AudioFormat build = new AudioFormat.Builder().setChannelMask(this.H).setEncoding(this.I).setSampleRate(this.G).build();
        int i10 = this.am;
        if (i10 == 0) {
            i10 = 0;
        }
        return new AudioTrack(audioAttributes, build, this.M, 1, i10);
    }

    private com.anythink.expressad.exoplayer.b.f[] v() {
        if (this.E) {
            return this.f7444w;
        }
        return this.f7443v;
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final v f() {
        return this.O;
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void g() {
        if (this.an) {
            this.an = false;
            this.am = 0;
            i();
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void h() {
        this.al = false;
        if (q() && this.y.c()) {
            this.C.pause();
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void i() {
        if (q()) {
            this.U = 0L;
            this.V = 0L;
            this.X = 0L;
            this.Y = 0L;
            this.Z = 0;
            v vVar = this.N;
            if (vVar != null) {
                this.O = vVar;
                this.N = null;
            } else if (!this.f7446z.isEmpty()) {
                this.O = this.f7446z.getLast().f7454a;
            }
            this.f7446z.clear();
            this.P = 0L;
            this.Q = 0L;
            this.af = null;
            this.ag = null;
            l();
            this.ak = false;
            this.aj = -1;
            this.R = null;
            this.S = 0;
            this.f7434aa = 0;
            if (this.y.b()) {
                this.C.pause();
            }
            final AudioTrack audioTrack = this.C;
            this.C = null;
            this.y.d();
            this.f7445x.close();
            new Thread() { // from class: com.anythink.expressad.exoplayer.b.l.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        l.this.f7445x.open();
                    }
                }
            }.start();
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void j() {
        i();
        p();
        for (com.anythink.expressad.exoplayer.b.f fVar : this.f7443v) {
            fVar.i();
        }
        for (com.anythink.expressad.exoplayer.b.f fVar2 : this.f7444w) {
            fVar2.i();
        }
        this.am = 0;
        this.al = false;
    }

    private l(com.anythink.expressad.exoplayer.b.c cVar, com.anythink.expressad.exoplayer.b.f[] fVarArr, byte b10) {
        this(cVar, new b(fVarArr));
    }

    private long f(long j10) {
        return (j10 * this.G) / 1000000;
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void a(h.c cVar) {
        this.A = cVar;
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void b() {
        if (this.f7434aa == 1) {
            this.f7434aa = 2;
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void c() {
        if (!this.ak && q() && n()) {
            this.y.d(s());
            this.C.stop();
            this.S = 0;
            this.ak = true;
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final boolean d() {
        if (q()) {
            return this.ak && !e();
        }
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final boolean e() {
        return q() && this.y.e(s());
    }

    private l(com.anythink.expressad.exoplayer.b.c cVar, a aVar) {
        this.f7438q = cVar;
        this.f7439r = (a) com.anythink.expressad.exoplayer.k.a.a(aVar);
        this.f7440s = false;
        this.f7445x = new ConditionVariable(true);
        this.y = new j(new e(this, (byte) 0));
        k kVar = new k();
        this.f7441t = kVar;
        u uVar = new u();
        this.f7442u = uVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new p(), kVar, uVar);
        Collections.addAll(arrayList, aVar.a());
        this.f7443v = (com.anythink.expressad.exoplayer.b.f[]) arrayList.toArray(new com.anythink.expressad.exoplayer.b.f[arrayList.size()]);
        this.f7444w = new com.anythink.expressad.exoplayer.b.f[]{new n()};
        this.f7436ac = 1.0f;
        this.f7434aa = 0;
        this.J = com.anythink.expressad.exoplayer.b.b.f7335a;
        this.am = 0;
        this.O = v.f9345a;
        this.aj = -1;
        this.f7437ad = new com.anythink.expressad.exoplayer.b.f[0];
        this.ae = new ByteBuffer[0];
        this.f7446z = new ArrayDeque<>();
    }

    private long d(long j10) {
        return (j10 * 1000000) / this.F;
    }

    private long e(long j10) {
        return (j10 * 1000000) / this.G;
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final boolean a(int i10) {
        if (af.b(i10)) {
            return i10 != 4 || af.f8993a >= 21;
        }
        com.anythink.expressad.exoplayer.b.c cVar = this.f7438q;
        return cVar != null && cVar.a(i10);
    }

    private void b(ByteBuffer byteBuffer, long j10) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.ag;
            int i10 = 0;
            if (byteBuffer2 != null) {
                com.anythink.expressad.exoplayer.k.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.ag = byteBuffer;
                if (af.f8993a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.ah;
                    if (bArr == null || bArr.length < remaining) {
                        this.ah = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.ah, 0, remaining);
                    byteBuffer.position(position);
                    this.ai = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (af.f8993a < 21) {
                int b10 = this.y.b(this.X);
                if (b10 > 0) {
                    i10 = this.C.write(this.ah, this.ai, Math.min(remaining2, b10));
                    if (i10 > 0) {
                        this.ai += i10;
                        byteBuffer.position(byteBuffer.position() + i10);
                    }
                }
            } else if (this.an) {
                com.anythink.expressad.exoplayer.k.a.b(j10 != com.anythink.expressad.exoplayer.b.f7291b);
                i10 = a(this.C, byteBuffer, remaining2, j10);
            } else {
                i10 = this.C.write(byteBuffer, remaining2, 1);
            }
            this.ao = SystemClock.elapsedRealtime();
            if (i10 >= 0) {
                boolean z10 = this.D;
                if (z10) {
                    this.X += i10;
                }
                if (i10 == remaining2) {
                    if (!z10) {
                        this.Y += this.Z;
                    }
                    this.ag = null;
                    return;
                }
                return;
            }
            throw new h.d(i10);
        }
    }

    private static AudioTrack d(int i10) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final long a(boolean z10) {
        long j10;
        long a10;
        long j11;
        if (!q() || this.f7434aa == 0) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.y.a(z10), e(s()));
        long j12 = this.f7435ab;
        d dVar = null;
        while (!this.f7446z.isEmpty() && min >= this.f7446z.getFirst().f7456c) {
            dVar = this.f7446z.remove();
        }
        if (dVar != null) {
            this.O = dVar.f7454a;
            this.Q = dVar.f7456c;
            this.P = dVar.f7455b - this.f7435ab;
        }
        if (this.O.f9346b == 1.0f) {
            j11 = (min + this.P) - this.Q;
        } else {
            if (this.f7446z.isEmpty()) {
                j10 = this.P;
                a10 = this.f7439r.a(min - this.Q);
            } else {
                j10 = this.P;
                a10 = af.a(min - this.Q, this.O.f9346b);
            }
            j11 = a10 + j10;
        }
        return j11 + e(this.f7439r.b()) + j12;
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void c(int i10) {
        com.anythink.expressad.exoplayer.k.a.b(af.f8993a >= 21);
        if (this.an && this.am == i10) {
            return;
        }
        this.an = true;
        this.am = i10;
        i();
    }

    private long c(long j10) {
        return j10 + e(this.f7439r.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    @Override // com.anythink.expressad.exoplayer.b.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r18, int r19, int r20, int[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.b.l.a(int, int, int, int[], int, int):void");
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void b(int i10) {
        if (this.am != i10) {
            this.am = i10;
            i();
        }
    }

    private long b(long j10) {
        d dVar = null;
        while (!this.f7446z.isEmpty() && j10 >= this.f7446z.getFirst().f7456c) {
            dVar = this.f7446z.remove();
        }
        if (dVar != null) {
            this.O = dVar.f7454a;
            this.Q = dVar.f7456c;
            this.P = dVar.f7455b - this.f7435ab;
        }
        if (this.O.f9346b == 1.0f) {
            return (j10 + this.P) - this.Q;
        }
        if (this.f7446z.isEmpty()) {
            return this.f7439r.a(j10 - this.Q) + this.P;
        }
        return af.a(j10 - this.Q, this.O.f9346b) + this.P;
    }

    private static void b(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void a() {
        this.al = true;
        if (q()) {
            this.y.a();
            this.C.play();
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final boolean a(ByteBuffer byteBuffer, long j10) {
        int a10;
        v vVar;
        ByteBuffer byteBuffer2 = this.af;
        com.anythink.expressad.exoplayer.k.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!q()) {
            this.f7445x.block();
            AudioTrack t10 = t();
            this.C = t10;
            int audioSessionId = t10.getAudioSessionId();
            if (f7421b && af.f8993a < 21) {
                AudioTrack audioTrack = this.B;
                if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                    p();
                }
                if (this.B == null) {
                    this.B = new AudioTrack(3, 4000, 4, 2, 2, 0, audioSessionId);
                }
            }
            if (this.am != audioSessionId) {
                this.am = audioSessionId;
                h.c cVar = this.A;
                if (cVar != null) {
                    cVar.a(audioSessionId);
                }
            }
            if (this.L) {
                vVar = this.f7439r.a(this.O);
            } else {
                vVar = v.f9345a;
            }
            this.O = vVar;
            k();
            this.y.a(this.C, this.I, this.W, this.M);
            o();
            if (this.al) {
                a();
            }
        }
        if (!this.y.a(s())) {
            return false;
        }
        if (this.af == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.D && this.Z == 0) {
                int i10 = this.I;
                if (i10 == 7 || i10 == 8) {
                    a10 = m.a(byteBuffer);
                } else if (i10 == 5) {
                    a10 = com.anythink.expressad.exoplayer.b.a.a();
                } else if (i10 == 6) {
                    a10 = com.anythink.expressad.exoplayer.b.a.a(byteBuffer);
                } else if (i10 == 14) {
                    int b10 = com.anythink.expressad.exoplayer.b.a.b(byteBuffer);
                    a10 = b10 == -1 ? 0 : com.anythink.expressad.exoplayer.b.a.a(byteBuffer, b10) * 16;
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: ".concat(String.valueOf(i10)));
                }
                this.Z = a10;
                if (a10 == 0) {
                    return true;
                }
            }
            if (this.N != null) {
                if (!n()) {
                    return false;
                }
                v vVar2 = this.N;
                this.N = null;
                this.f7446z.add(new d(this.f7439r.a(vVar2), Math.max(0L, j10), e(s()), (byte) 0));
                k();
            }
            if (this.f7434aa == 0) {
                this.f7435ab = Math.max(0L, j10);
                this.f7434aa = 1;
            } else {
                long r10 = ((r() * 1000000) / this.F) + this.f7435ab;
                if (this.f7434aa == 1 && Math.abs(r10 - j10) > 200000) {
                    StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Discontinuity detected [expected ", r10, ", got ");
                    k10.append(j10);
                    k10.append("]");
                    Log.e(f7431m, k10.toString());
                    this.f7434aa = 2;
                }
                if (this.f7434aa == 2) {
                    this.f7435ab = (j10 - r10) + this.f7435ab;
                    this.f7434aa = 1;
                    h.c cVar2 = this.A;
                    if (cVar2 != null) {
                        cVar2.a();
                    }
                }
            }
            if (this.D) {
                this.U += byteBuffer.remaining();
            } else {
                this.V += this.Z;
            }
            this.af = byteBuffer;
        }
        if (this.K) {
            a(j10);
        } else {
            b(this.af, j10);
        }
        if (!this.af.hasRemaining()) {
            this.af = null;
            return true;
        }
        if (!this.y.c(s())) {
            return false;
        }
        Log.w(f7431m, "Resetting stalled audio track");
        i();
        return true;
    }

    private void a(long j10) {
        ByteBuffer byteBuffer;
        int length = this.f7437ad.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.ae[i10 - 1];
            } else {
                byteBuffer = this.af;
                if (byteBuffer == null) {
                    byteBuffer = com.anythink.expressad.exoplayer.b.f.f7351a;
                }
            }
            if (i10 == length) {
                b(byteBuffer, j10);
            } else {
                com.anythink.expressad.exoplayer.b.f fVar = this.f7437ad[i10];
                fVar.a(byteBuffer);
                ByteBuffer f10 = fVar.f();
                this.ae[i10] = f10;
                if (f10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final v a(v vVar) {
        if (q() && !this.L) {
            v vVar2 = v.f9345a;
            this.O = vVar2;
            return vVar2;
        }
        v vVar3 = this.N;
        if (vVar3 == null) {
            if (!this.f7446z.isEmpty()) {
                vVar3 = this.f7446z.getLast().f7454a;
            } else {
                vVar3 = this.O;
            }
        }
        if (!vVar.equals(vVar3)) {
            if (q()) {
                this.N = vVar;
            } else {
                this.O = this.f7439r.a(vVar);
            }
        }
        return this.O;
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void a(com.anythink.expressad.exoplayer.b.b bVar) {
        if (this.J.equals(bVar)) {
            return;
        }
        this.J = bVar;
        if (this.an) {
            return;
        }
        i();
        this.am = 0;
    }

    @Override // com.anythink.expressad.exoplayer.b.h
    public final void a(float f10) {
        if (this.f7436ac != f10) {
            this.f7436ac = f10;
            o();
        }
    }

    private static int a(int i10, ByteBuffer byteBuffer) {
        if (i10 == 7 || i10 == 8) {
            return m.a(byteBuffer);
        }
        if (i10 == 5) {
            return com.anythink.expressad.exoplayer.b.a.a();
        }
        if (i10 == 6) {
            return com.anythink.expressad.exoplayer.b.a.a(byteBuffer);
        }
        if (i10 == 14) {
            int b10 = com.anythink.expressad.exoplayer.b.a.b(byteBuffer);
            if (b10 == -1) {
                return 0;
            }
            return com.anythink.expressad.exoplayer.b.a.a(byteBuffer, b10) * 16;
        }
        throw new IllegalStateException("Unexpected audio encoding: ".concat(String.valueOf(i10)));
    }

    @TargetApi(21)
    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    @TargetApi(21)
    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (this.R == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.R = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.R.putInt(1431633921);
        }
        if (this.S == 0) {
            this.R.putInt(4, i10);
            this.R.putLong(8, j10 * 1000);
            this.R.position(0);
            this.S = i10;
        }
        int remaining = this.R.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.R, remaining, 1);
            if (write < 0) {
                this.S = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int write2 = audioTrack.write(byteBuffer, i10, 1);
        if (write2 < 0) {
            this.S = 0;
            return write2;
        }
        this.S -= write2;
        return write2;
    }

    @TargetApi(21)
    private static void a(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }
}
