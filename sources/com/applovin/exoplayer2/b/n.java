package com.applovin.exoplayer2.b;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.anythink.core.common.b.g;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.b.h;
import com.applovin.exoplayer2.b.j;
import com.applovin.exoplayer2.l.ai;
import com.huawei.hms.ads.gl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n implements com.applovin.exoplayer2.b.h {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f13442a = false;
    private long A;
    private long B;
    private long C;
    private long D;
    private int E;
    private boolean F;
    private boolean G;
    private long H;
    private float I;
    private com.applovin.exoplayer2.b.f[] J;
    private ByteBuffer[] K;
    private ByteBuffer L;
    private int M;
    private ByteBuffer N;
    private byte[] O;
    private int P;
    private int Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private k W;
    private boolean X;
    private long Y;
    private boolean Z;

    /* renamed from: aa, reason: collision with root package name */
    private boolean f13443aa;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.b.e f13444b;

    /* renamed from: c, reason: collision with root package name */
    private final a f13445c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13446d;

    /* renamed from: e, reason: collision with root package name */
    private final m f13447e;
    private final x f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.b.f[] f13448g;

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.exoplayer2.b.f[] f13449h;

    /* renamed from: i, reason: collision with root package name */
    private final ConditionVariable f13450i;

    /* renamed from: j, reason: collision with root package name */
    private final j f13451j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayDeque<e> f13452k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f13453l;

    /* renamed from: m, reason: collision with root package name */
    private final int f13454m;

    /* renamed from: n, reason: collision with root package name */
    private h f13455n;
    private final f<h.b> o;

    /* renamed from: p, reason: collision with root package name */
    private final f<h.e> f13456p;

    /* renamed from: q, reason: collision with root package name */
    private h.c f13457q;

    /* renamed from: r, reason: collision with root package name */
    private b f13458r;

    /* renamed from: s, reason: collision with root package name */
    private b f13459s;

    /* renamed from: t, reason: collision with root package name */
    private AudioTrack f13460t;

    /* renamed from: u, reason: collision with root package name */
    private com.applovin.exoplayer2.b.d f13461u;

    /* renamed from: v, reason: collision with root package name */
    private e f13462v;

    /* renamed from: w, reason: collision with root package name */
    private e f13463w;

    /* renamed from: x, reason: collision with root package name */
    private am f13464x;
    private ByteBuffer y;

    /* renamed from: z, reason: collision with root package name */
    private int f13465z;

    /* loaded from: classes.dex */
    public interface a {
        long a(long j10);

        am a(am amVar);

        boolean a(boolean z10);

        com.applovin.exoplayer2.b.f[] a();

        long b();
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f13468a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13469b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13470c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13471d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13472e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f13473g;

        /* renamed from: h, reason: collision with root package name */
        public final int f13474h;

        /* renamed from: i, reason: collision with root package name */
        public final com.applovin.exoplayer2.b.f[] f13475i;

        public b(com.applovin.exoplayer2.v vVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, com.applovin.exoplayer2.b.f[] fVarArr) {
            this.f13468a = vVar;
            this.f13469b = i10;
            this.f13470c = i11;
            this.f13471d = i12;
            this.f13472e = i13;
            this.f = i14;
            this.f13473g = i15;
            this.f13475i = fVarArr;
            this.f13474h = a(i16, z10);
        }

        private AudioTrack d(boolean z10, com.applovin.exoplayer2.b.d dVar, int i10) {
            return new AudioTrack(a(dVar, z10), n.b(this.f13472e, this.f, this.f13473g), this.f13474h, 1, i10);
        }

        public boolean a(b bVar) {
            return bVar.f13470c == this.f13470c && bVar.f13473g == this.f13473g && bVar.f13472e == this.f13472e && bVar.f == this.f && bVar.f13471d == this.f13471d;
        }

        public long b(long j10) {
            return (j10 * 1000000) / this.f13472e;
        }

        public long c(long j10) {
            return (j10 * this.f13472e) / 1000000;
        }

        private AudioTrack b(boolean z10, com.applovin.exoplayer2.b.d dVar, int i10) {
            int i11 = ai.f16274a;
            if (i11 >= 29) {
                return c(z10, dVar, i10);
            }
            if (i11 >= 21) {
                return d(z10, dVar, i10);
            }
            return a(dVar, i10);
        }

        private AudioTrack c(boolean z10, com.applovin.exoplayer2.b.d dVar, int i10) {
            AudioTrack.Builder offloadedPlayback;
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(a(dVar, z10)).setAudioFormat(n.b(this.f13472e, this.f, this.f13473g)).setTransferMode(1).setBufferSizeInBytes(this.f13474h).setSessionId(i10).setOffloadedPlayback(this.f13470c == 1);
            return offloadedPlayback.build();
        }

        public long a(long j10) {
            return (j10 * 1000000) / this.f13468a.f16850z;
        }

        public AudioTrack a(boolean z10, com.applovin.exoplayer2.b.d dVar, int i10) throws h.b {
            try {
                AudioTrack b10 = b(z10, dVar, i10);
                int state = b10.getState();
                if (state == 1) {
                    return b10;
                }
                try {
                    b10.release();
                } catch (Exception unused) {
                }
                throw new h.b(state, this.f13472e, this.f, this.f13474h, this.f13468a, a(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new h.b(0, this.f13472e, this.f, this.f13474h, this.f13468a, a(), e10);
            }
        }

        private int d(long j10) {
            int f = n.f(this.f13473g);
            if (this.f13473g == 5) {
                f *= 2;
            }
            return (int) ((j10 * f) / 1000000);
        }

        private static AudioAttributes b() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        private AudioTrack a(com.applovin.exoplayer2.b.d dVar, int i10) {
            int g6 = ai.g(dVar.f13362d);
            if (i10 == 0) {
                return new AudioTrack(g6, this.f13472e, this.f, this.f13473g, this.f13474h, 1);
            }
            return new AudioTrack(g6, this.f13472e, this.f, this.f13473g, this.f13474h, 1, i10);
        }

        private int a(int i10, boolean z10) {
            if (i10 != 0) {
                return i10;
            }
            int i11 = this.f13470c;
            if (i11 == 0) {
                return a(z10 ? 8.0f : 1.0f);
            }
            if (i11 == 1) {
                return d(50000000L);
            }
            if (i11 == 2) {
                return d(250000L);
            }
            throw new IllegalStateException();
        }

        private int a(float f) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f13472e, this.f, this.f13473g);
            com.applovin.exoplayer2.l.a.b(minBufferSize != -2);
            int a10 = ai.a(minBufferSize * 4, ((int) c(250000L)) * this.f13471d, Math.max(minBufferSize, ((int) c(750000L)) * this.f13471d));
            return f != 1.0f ? Math.round(a10 * f) : a10;
        }

        private static AudioAttributes a(com.applovin.exoplayer2.b.d dVar, boolean z10) {
            if (z10) {
                return b();
            }
            return dVar.a();
        }

        public boolean a() {
            return this.f13470c == 1;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.b.f[] f13476a;

        /* renamed from: b, reason: collision with root package name */
        private final u f13477b;

        /* renamed from: c, reason: collision with root package name */
        private final w f13478c;

        public c(com.applovin.exoplayer2.b.f... fVarArr) {
            this(fVarArr, new u(), new w());
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public com.applovin.exoplayer2.b.f[] a() {
            return this.f13476a;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public long b() {
            return this.f13477b.k();
        }

        public c(com.applovin.exoplayer2.b.f[] fVarArr, u uVar, w wVar) {
            com.applovin.exoplayer2.b.f[] fVarArr2 = new com.applovin.exoplayer2.b.f[fVarArr.length + 2];
            this.f13476a = fVarArr2;
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            this.f13477b = uVar;
            this.f13478c = wVar;
            fVarArr2[fVarArr.length] = uVar;
            fVarArr2[fVarArr.length + 1] = wVar;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public am a(am amVar) {
            this.f13478c.a(amVar.f13211b);
            this.f13478c.b(amVar.f13212c);
            return amVar;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public boolean a(boolean z10) {
            this.f13477b.a(z10);
            return z10;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public long a(long j10) {
            return this.f13478c.a(j10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends RuntimeException {
        private d(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final am f13479a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13480b;

        /* renamed from: c, reason: collision with root package name */
        public final long f13481c;

        /* renamed from: d, reason: collision with root package name */
        public final long f13482d;

        private e(am amVar, boolean z10, long j10, long j11) {
            this.f13479a = amVar;
            this.f13480b = z10;
            this.f13481c = j10;
            this.f13482d = j11;
        }
    }

    /* loaded from: classes.dex */
    public final class h {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f13488b = new Handler();

        /* renamed from: c, reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f13489c;

        public h() {
            this.f13489c = new AudioTrack.StreamEventCallback() { // from class: com.applovin.exoplayer2.b.n.h.1
                @Override // android.media.AudioTrack.StreamEventCallback
                public void onDataRequest(AudioTrack audioTrack, int i10) {
                    boolean z10;
                    if (audioTrack == n.this.f13460t) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    com.applovin.exoplayer2.l.a.b(z10);
                    if (n.this.f13457q != null && n.this.T) {
                        n.this.f13457q.b();
                    }
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public void onTearDown(AudioTrack audioTrack) {
                    boolean z10;
                    if (audioTrack == n.this.f13460t) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    com.applovin.exoplayer2.l.a.b(z10);
                    if (n.this.f13457q != null && n.this.T) {
                        n.this.f13457q.b();
                    }
                }
            };
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f13488b;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new f0(0, handler), this.f13489c);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f13489c);
            this.f13488b.removeCallbacksAndMessages(null);
        }
    }

    public n(com.applovin.exoplayer2.b.e eVar, a aVar, boolean z10, boolean z11, int i10) {
        boolean z12;
        boolean z13;
        int i11;
        this.f13444b = eVar;
        this.f13445c = (a) com.applovin.exoplayer2.l.a.b(aVar);
        int i12 = ai.f16274a;
        if (i12 >= 21 && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f13446d = z12;
        if (i12 >= 23 && z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f13453l = z13;
        if (i12 >= 29) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        this.f13454m = i11;
        this.f13450i = new ConditionVariable(true);
        this.f13451j = new j(new g());
        m mVar = new m();
        this.f13447e = mVar;
        x xVar = new x();
        this.f = xVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new t(), mVar, xVar);
        Collections.addAll(arrayList, aVar.a());
        this.f13448g = (com.applovin.exoplayer2.b.f[]) arrayList.toArray(new com.applovin.exoplayer2.b.f[0]);
        this.f13449h = new com.applovin.exoplayer2.b.f[]{new p()};
        this.I = 1.0f;
        this.f13461u = com.applovin.exoplayer2.b.d.f13359a;
        this.V = 0;
        this.W = new k(0, gl.Code);
        am amVar = am.f13209a;
        this.f13463w = new e(amVar, false, 0L, 0L);
        this.f13464x = amVar;
        this.Q = -1;
        this.J = new com.applovin.exoplayer2.b.f[0];
        this.K = new ByteBuffer[0];
        this.f13452k = new ArrayDeque<>();
        this.o = new f<>(100L);
        this.f13456p = new f<>(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A() {
        if (this.f13459s.f13470c == 0) {
            return this.C / r0.f13471d;
        }
        return this.D;
    }

    private void B() {
        if (!this.S) {
            this.S = true;
            this.f13451j.e(A());
            this.f13460t.stop();
            this.f13465z = 0;
        }
    }

    private void n() {
        com.applovin.exoplayer2.b.f[] fVarArr = this.f13459s.f13475i;
        ArrayList arrayList = new ArrayList();
        for (com.applovin.exoplayer2.b.f fVar : fVarArr) {
            if (fVar.a()) {
                arrayList.add(fVar);
            } else {
                fVar.e();
            }
        }
        int size = arrayList.size();
        this.J = (com.applovin.exoplayer2.b.f[]) arrayList.toArray(new com.applovin.exoplayer2.b.f[size]);
        this.K = new ByteBuffer[size];
        o();
    }

    private void o() {
        int i10 = 0;
        while (true) {
            com.applovin.exoplayer2.b.f[] fVarArr = this.J;
            if (i10 < fVarArr.length) {
                com.applovin.exoplayer2.b.f fVar = fVarArr[i10];
                fVar.e();
                this.K[i10] = fVar.c();
                i10++;
            } else {
                return;
            }
        }
    }

    private void p() throws h.b {
        boolean z10;
        this.f13450i.block();
        AudioTrack q10 = q();
        this.f13460t = q10;
        if (b(q10)) {
            a(this.f13460t);
            if (this.f13454m != 3) {
                AudioTrack audioTrack = this.f13460t;
                com.applovin.exoplayer2.v vVar = this.f13459s.f13468a;
                audioTrack.setOffloadDelayPadding(vVar.B, vVar.C);
            }
        }
        this.V = this.f13460t.getAudioSessionId();
        j jVar = this.f13451j;
        AudioTrack audioTrack2 = this.f13460t;
        b bVar = this.f13459s;
        if (bVar.f13470c == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        jVar.a(audioTrack2, z10, bVar.f13473g, bVar.f13471d, bVar.f13474h);
        t();
        int i10 = this.W.f13432a;
        if (i10 != 0) {
            this.f13460t.attachAuxEffect(i10);
            this.f13460t.setAuxEffectSendLevel(this.W.f13433b);
        }
        this.G = true;
    }

    private AudioTrack q() throws h.b {
        try {
            return ((b) com.applovin.exoplayer2.l.a.b(this.f13459s)).a(this.X, this.f13461u, this.V);
        } catch (h.b e10) {
            r();
            h.c cVar = this.f13457q;
            if (cVar != null) {
                cVar.a(e10);
            }
            throw e10;
        }
    }

    private void r() {
        if (!this.f13459s.a()) {
            return;
        }
        this.Z = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean s() throws com.applovin.exoplayer2.b.h.e {
        /*
            r9 = this;
            int r0 = r9.Q
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.Q = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.Q
            com.applovin.exoplayer2.b.f[] r5 = r9.J
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.b()
        L1f:
            r9.a(r7)
            boolean r0 = r4.d()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.Q
            int r0 = r0 + r1
            r9.Q = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.N
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.N
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.Q = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.n.s():boolean");
    }

    private void t() {
        if (y()) {
            if (ai.f16274a >= 21) {
                a(this.f13460t, this.I);
            } else {
                b(this.f13460t, this.I);
            }
        }
    }

    private void u() {
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.f13443aa = false;
        this.E = 0;
        this.f13463w = new e(v(), m(), 0L, 0L);
        this.H = 0L;
        this.f13462v = null;
        this.f13452k.clear();
        this.L = null;
        this.M = 0;
        this.N = null;
        this.S = false;
        this.R = false;
        this.Q = -1;
        this.y = null;
        this.f13465z = 0;
        this.f.k();
        o();
    }

    private am v() {
        return w().f13479a;
    }

    private e w() {
        e eVar = this.f13462v;
        if (eVar == null) {
            if (!this.f13452k.isEmpty()) {
                return this.f13452k.getLast();
            }
            return this.f13463w;
        }
        return eVar;
    }

    private boolean x() {
        if (!this.X && com.anythink.expressad.exoplayer.k.o.f9088w.equals(this.f13459s.f13468a.f16838l) && !d(this.f13459s.f13468a.A)) {
            return true;
        }
        return false;
    }

    private boolean y() {
        if (this.f13460t != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long z() {
        if (this.f13459s.f13470c == 0) {
            return this.A / r0.f13469b;
        }
        return this.B;
    }

    @Override // com.applovin.exoplayer2.b.h
    public void h() {
        if (this.X) {
            this.X = false;
            j();
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void i() {
        this.T = false;
        if (y() && this.f13451j.c()) {
            this.f13460t.pause();
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void j() {
        if (y()) {
            u();
            if (this.f13451j.b()) {
                this.f13460t.pause();
            }
            if (b(this.f13460t)) {
                ((h) com.applovin.exoplayer2.l.a.b(this.f13455n)).b(this.f13460t);
            }
            final AudioTrack audioTrack = this.f13460t;
            this.f13460t = null;
            if (ai.f16274a < 21 && !this.U) {
                this.V = 0;
            }
            b bVar = this.f13458r;
            if (bVar != null) {
                this.f13459s = bVar;
                this.f13458r = null;
            }
            this.f13451j.d();
            this.f13450i.close();
            new Thread("ExoPlayer:AudioTrackReleaseThread") { // from class: com.applovin.exoplayer2.b.n.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        n.this.f13450i.open();
                    }
                }
            }.start();
        }
        this.f13456p.a();
        this.o.a();
    }

    @Override // com.applovin.exoplayer2.b.h
    public void k() {
        boolean z10;
        if (ai.f16274a < 25) {
            j();
            return;
        }
        this.f13456p.a();
        this.o.a();
        if (!y()) {
            return;
        }
        u();
        if (this.f13451j.b()) {
            this.f13460t.pause();
        }
        this.f13460t.flush();
        this.f13451j.d();
        j jVar = this.f13451j;
        AudioTrack audioTrack = this.f13460t;
        b bVar = this.f13459s;
        if (bVar.f13470c == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        jVar.a(audioTrack, z10, bVar.f13473g, bVar.f13471d, bVar.f13474h);
        this.G = true;
    }

    @Override // com.applovin.exoplayer2.b.h
    public void l() {
        j();
        for (com.applovin.exoplayer2.b.f fVar : this.f13448g) {
            fVar.f();
        }
        for (com.applovin.exoplayer2.b.f fVar2 : this.f13449h) {
            fVar2.f();
        }
        this.T = false;
        this.Z = false;
    }

    public boolean m() {
        return w().f13480b;
    }

    @Override // com.applovin.exoplayer2.b.h
    public void c() throws h.e {
        if (!this.R && y() && s()) {
            B();
            this.R = true;
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean d() {
        return !y() || (this.R && !e());
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean e() {
        return y() && this.f13451j.f(A());
    }

    @Override // com.applovin.exoplayer2.b.h
    public am f() {
        if (this.f13453l) {
            return this.f13464x;
        }
        return v();
    }

    @Override // com.applovin.exoplayer2.b.h
    public void g() {
        com.applovin.exoplayer2.l.a.b(ai.f16274a >= 21);
        com.applovin.exoplayer2.l.a.b(this.U);
        if (this.X) {
            return;
        }
        this.X = true;
        j();
    }

    private boolean d(int i10) {
        return this.f13446d && ai.e(i10);
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(h.c cVar) {
        this.f13457q = cVar;
    }

    @Override // com.applovin.exoplayer2.b.h
    public int b(com.applovin.exoplayer2.v vVar) {
        if (!com.anythink.expressad.exoplayer.k.o.f9088w.equals(vVar.f16838l)) {
            return ((this.Z || !a(vVar, this.f13461u)) && !a(vVar, this.f13444b)) ? 0 : 2;
        }
        if (!ai.d(vVar.A)) {
            com.applovin.exoplayer2.l.q.c("DefaultAudioSink", "Invalid PCM encoding: " + vVar.A);
            return 0;
        }
        int i10 = vVar.A;
        return (i10 == 2 || (this.f13446d && i10 == 4)) ? 2 : 1;
    }

    private long d(long j10) {
        return j10 + this.f13459s.b(this.f13445c.b());
    }

    private static int e(int i10) {
        int i11 = ai.f16274a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(ai.f16275b) && i10 == 1) {
            i10 = 2;
        }
        return ai.f(i10);
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean a(com.applovin.exoplayer2.v vVar) {
        return b(vVar) != 0;
    }

    private static boolean c(int i10) {
        return (ai.f16274a >= 24 && i10 == -6) || i10 == -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return g.j.f5109p;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public long a(boolean z10) {
        if (!y() || this.G) {
            return Long.MIN_VALUE;
        }
        return d(c(Math.min(this.f13451j.a(z10), this.f13459s.b(A()))));
    }

    private long c(long j10) {
        while (!this.f13452k.isEmpty() && j10 >= this.f13452k.getFirst().f13482d) {
            this.f13463w = this.f13452k.remove();
        }
        e eVar = this.f13463w;
        long j11 = j10 - eVar.f13482d;
        if (eVar.f13479a.equals(am.f13209a)) {
            return this.f13463w.f13481c + j11;
        }
        if (this.f13452k.isEmpty()) {
            return this.f13463w.f13481c + this.f13445c.a(j11);
        }
        e first = this.f13452k.getFirst();
        return first.f13481c - ai.a(first.f13482d - j10, this.f13463w.f13479a.f13211b);
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(com.applovin.exoplayer2.v vVar, int i10, int[] iArr) throws h.a {
        int i11;
        com.applovin.exoplayer2.b.f[] fVarArr;
        int intValue;
        int i12;
        int i13;
        int intValue2;
        int i14;
        com.applovin.exoplayer2.b.f[] fVarArr2;
        int[] iArr2;
        if (com.anythink.expressad.exoplayer.k.o.f9088w.equals(vVar.f16838l)) {
            com.applovin.exoplayer2.l.a.a(ai.d(vVar.A));
            int c10 = ai.c(vVar.A, vVar.y);
            if (d(vVar.A)) {
                fVarArr2 = this.f13449h;
            } else {
                fVarArr2 = this.f13448g;
            }
            this.f.a(vVar.B, vVar.C);
            if (ai.f16274a < 21 && vVar.y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i15 = 0; i15 < 6; i15++) {
                    iArr2[i15] = i15;
                }
            } else {
                iArr2 = iArr;
            }
            this.f13447e.a(iArr2);
            f.a aVar = new f.a(vVar.f16850z, vVar.y, vVar.A);
            for (com.applovin.exoplayer2.b.f fVar : fVarArr2) {
                try {
                    f.a a10 = fVar.a(aVar);
                    if (fVar.a()) {
                        aVar = a10;
                    }
                } catch (f.b e10) {
                    throw new h.a(e10, vVar);
                }
            }
            int i16 = aVar.f13384d;
            i12 = aVar.f13382b;
            intValue2 = ai.f(aVar.f13383c);
            fVarArr = fVarArr2;
            intValue = i16;
            i13 = c10;
            i11 = ai.c(i16, aVar.f13383c);
            i14 = 0;
        } else {
            com.applovin.exoplayer2.b.f[] fVarArr3 = new com.applovin.exoplayer2.b.f[0];
            int i17 = vVar.f16850z;
            i11 = -1;
            if (a(vVar, this.f13461u)) {
                fVarArr = fVarArr3;
                intValue = com.applovin.exoplayer2.l.u.b((String) com.applovin.exoplayer2.l.a.b(vVar.f16838l), vVar.f16835i);
                i14 = 1;
                intValue2 = ai.f(vVar.y);
                i12 = i17;
                i13 = -1;
            } else {
                Pair<Integer, Integer> b10 = b(vVar, this.f13444b);
                if (b10 != null) {
                    fVarArr = fVarArr3;
                    intValue = ((Integer) b10.first).intValue();
                    i12 = i17;
                    i13 = -1;
                    intValue2 = ((Integer) b10.second).intValue();
                    i14 = 2;
                } else {
                    throw new h.a("Unable to configure passthrough for: " + vVar, vVar);
                }
            }
        }
        if (intValue == 0) {
            throw new h.a("Invalid output encoding (mode=" + i14 + ") for: " + vVar, vVar);
        }
        if (intValue2 != 0) {
            this.Z = false;
            b bVar = new b(vVar, i13, i14, i11, i12, intValue2, intValue, i10, this.f13453l, fVarArr);
            if (y()) {
                this.f13458r = bVar;
                return;
            } else {
                this.f13459s = bVar;
                return;
            }
        }
        throw new h.a("Invalid output channel config (mode=" + i14 + ") for: " + vVar, vVar);
    }

    @Override // com.applovin.exoplayer2.b.h
    public void b() {
        this.F = true;
    }

    /* loaded from: classes.dex */
    public static final class f<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        private final long f13483a;

        /* renamed from: b, reason: collision with root package name */
        private T f13484b;

        /* renamed from: c, reason: collision with root package name */
        private long f13485c;

        public f(long j10) {
            this.f13483a = j10;
        }

        public void a(T t10) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f13484b == null) {
                this.f13484b = t10;
                this.f13485c = this.f13483a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f13485c) {
                T t11 = this.f13484b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f13484b;
                a();
                throw t12;
            }
        }

        public void a() {
            this.f13484b = null;
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void b(boolean z10) {
        a(v(), z10);
    }

    /* loaded from: classes.dex */
    public final class g implements j.a {
        private g() {
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void a(long j10, long j11, long j12, long j13) {
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Spurious audio timestamp (frame position mismatch): ", j10, ", ");
            k10.append(j11);
            k10.append(", ");
            k10.append(j12);
            k10.append(", ");
            k10.append(j13);
            k10.append(", ");
            k10.append(n.this.z());
            k10.append(", ");
            k10.append(n.this.A());
            String sb2 = k10.toString();
            if (!n.f13442a) {
                com.applovin.exoplayer2.l.q.c("DefaultAudioSink", sb2);
                return;
            }
            throw new d(sb2);
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void b(long j10, long j11, long j12, long j13) {
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Spurious audio timestamp (system clock mismatch): ", j10, ", ");
            k10.append(j11);
            k10.append(", ");
            k10.append(j12);
            k10.append(", ");
            k10.append(j13);
            k10.append(", ");
            k10.append(n.this.z());
            k10.append(", ");
            k10.append(n.this.A());
            String sb2 = k10.toString();
            if (!n.f13442a) {
                com.applovin.exoplayer2.l.q.c("DefaultAudioSink", sb2);
                return;
            }
            throw new d(sb2);
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void a(long j10) {
            if (n.this.f13457q != null) {
                n.this.f13457q.a(j10);
            }
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void b(long j10) {
            com.applovin.exoplayer2.l.q.c("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void a(int i10, long j10) {
            if (n.this.f13457q != null) {
                n.this.f13457q.a(i10, j10, SystemClock.elapsedRealtime() - n.this.Y);
            }
        }
    }

    private void b(am amVar) {
        if (y()) {
            try {
                this.f13460t.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(amVar.f13211b).setPitch(amVar.f13212c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                com.applovin.exoplayer2.l.q.b("DefaultAudioSink", "Failed to set playback params", e10);
            }
            amVar = new am(this.f13460t.getPlaybackParams().getSpeed(), this.f13460t.getPlaybackParams().getPitch());
            this.f13451j.a(amVar.f13211b);
        }
        this.f13464x = amVar;
    }

    private void b(long j10) {
        am amVar;
        if (x()) {
            amVar = this.f13445c.a(v());
        } else {
            amVar = am.f13209a;
        }
        am amVar2 = amVar;
        boolean a10 = x() ? this.f13445c.a(m()) : false;
        this.f13452k.add(new e(amVar2, a10, Math.max(0L, j10), this.f13459s.b(A())));
        n();
        h.c cVar = this.f13457q;
        if (cVar != null) {
            cVar.a(a10);
        }
    }

    private static Pair<Integer, Integer> b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.b.e eVar) {
        if (eVar == null) {
            return null;
        }
        int b10 = com.applovin.exoplayer2.l.u.b((String) com.applovin.exoplayer2.l.a.b(vVar.f16838l), vVar.f16835i);
        int i10 = 6;
        if (!(b10 == 5 || b10 == 6 || b10 == 18 || b10 == 17 || b10 == 7 || b10 == 8 || b10 == 14)) {
            return null;
        }
        if (b10 == 18 && !eVar.a(18)) {
            b10 = 6;
        } else if (b10 == 8 && !eVar.a(8)) {
            b10 = 7;
        }
        if (!eVar.a(b10)) {
            return null;
        }
        if (b10 == 18) {
            if (ai.f16274a >= 29 && (i10 = a(18, vVar.f16850z)) == 0) {
                com.applovin.exoplayer2.l.q.c("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        } else {
            i10 = vVar.y;
            if (i10 > eVar.a()) {
                return null;
            }
        }
        int e10 = e(i10);
        if (e10 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(b10), Integer.valueOf(e10));
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a() {
        this.T = true;
        if (y()) {
            this.f13451j.a();
            this.f13460t.play();
        }
    }

    private static boolean b(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (ai.f16274a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    private static void b(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean a(ByteBuffer byteBuffer, long j10, int i10) throws h.b, h.e {
        ByteBuffer byteBuffer2 = this.L;
        com.applovin.exoplayer2.l.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f13458r != null) {
            if (!s()) {
                return false;
            }
            if (!this.f13458r.a(this.f13459s)) {
                B();
                if (e()) {
                    return false;
                }
                j();
            } else {
                this.f13459s = this.f13458r;
                this.f13458r = null;
                if (b(this.f13460t) && this.f13454m != 3) {
                    this.f13460t.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f13460t;
                    com.applovin.exoplayer2.v vVar = this.f13459s.f13468a;
                    audioTrack.setOffloadDelayPadding(vVar.B, vVar.C);
                    this.f13443aa = true;
                }
            }
            b(j10);
        }
        if (!y()) {
            try {
                p();
            } catch (h.b e10) {
                if (!e10.f13392b) {
                    this.o.a(e10);
                    return false;
                }
                throw e10;
            }
        }
        this.o.a();
        if (this.G) {
            this.H = Math.max(0L, j10);
            this.F = false;
            this.G = false;
            if (this.f13453l && ai.f16274a >= 23) {
                b(this.f13464x);
            }
            b(j10);
            if (this.T) {
                a();
            }
        }
        if (!this.f13451j.a(A())) {
            return false;
        }
        if (this.L == null) {
            com.applovin.exoplayer2.l.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            b bVar = this.f13459s;
            if (bVar.f13470c != 0 && this.E == 0) {
                int a10 = a(bVar.f13473g, byteBuffer);
                this.E = a10;
                if (a10 == 0) {
                    return true;
                }
            }
            if (this.f13462v != null) {
                if (!s()) {
                    return false;
                }
                b(j10);
                this.f13462v = null;
            }
            long a11 = this.H + this.f13459s.a(z() - this.f.l());
            if (!this.F && Math.abs(a11 - j10) > 200000) {
                this.f13457q.a(new h.d(j10, a11));
                this.F = true;
            }
            if (this.F) {
                if (!s()) {
                    return false;
                }
                long j11 = j10 - a11;
                this.H += j11;
                this.F = false;
                b(j10);
                h.c cVar = this.f13457q;
                if (cVar != null && j11 != 0) {
                    cVar.a();
                }
            }
            if (this.f13459s.f13470c == 0) {
                this.A += byteBuffer.remaining();
            } else {
                this.B += this.E * i10;
            }
            this.L = byteBuffer;
            this.M = i10;
        }
        a(j10);
        if (!this.L.hasRemaining()) {
            this.L = null;
            this.M = 0;
            return true;
        }
        if (!this.f13451j.d(A())) {
            return false;
        }
        com.applovin.exoplayer2.l.q.c("DefaultAudioSink", "Resetting stalled audio track");
        j();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat b(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private void a(AudioTrack audioTrack) {
        if (this.f13455n == null) {
            this.f13455n = new h();
        }
        this.f13455n.a(audioTrack);
    }

    private void a(long j10) throws h.e {
        ByteBuffer byteBuffer;
        int length = this.J.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.K[i10 - 1];
            } else {
                byteBuffer = this.L;
                if (byteBuffer == null) {
                    byteBuffer = com.applovin.exoplayer2.b.f.f13380a;
                }
            }
            if (i10 == length) {
                a(byteBuffer, j10);
            } else {
                com.applovin.exoplayer2.b.f fVar = this.J[i10];
                if (i10 > this.Q) {
                    fVar.a(byteBuffer);
                }
                ByteBuffer c10 = fVar.c();
                this.K[i10] = c10;
                if (c10.hasRemaining()) {
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

    private void a(ByteBuffer byteBuffer, long j10) throws h.e {
        int a10;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.N;
            if (byteBuffer2 != null) {
                com.applovin.exoplayer2.l.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.N = byteBuffer;
                if (ai.f16274a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.O;
                    if (bArr == null || bArr.length < remaining) {
                        this.O = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.O, 0, remaining);
                    byteBuffer.position(position);
                    this.P = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (ai.f16274a < 21) {
                int b10 = this.f13451j.b(this.C);
                if (b10 > 0) {
                    a10 = this.f13460t.write(this.O, this.P, Math.min(remaining2, b10));
                    if (a10 > 0) {
                        this.P += a10;
                        byteBuffer.position(byteBuffer.position() + a10);
                    }
                } else {
                    a10 = 0;
                }
            } else if (this.X) {
                com.applovin.exoplayer2.l.a.b(j10 != com.anythink.expressad.exoplayer.b.f7291b);
                a10 = a(this.f13460t, byteBuffer, remaining2, j10);
            } else {
                a10 = a(this.f13460t, byteBuffer, remaining2);
            }
            this.Y = SystemClock.elapsedRealtime();
            if (a10 < 0) {
                boolean c10 = c(a10);
                if (c10) {
                    r();
                }
                h.e eVar = new h.e(a10, this.f13459s.f13468a, c10);
                h.c cVar = this.f13457q;
                if (cVar != null) {
                    cVar.a(eVar);
                }
                if (!eVar.f13397b) {
                    this.f13456p.a(eVar);
                    return;
                }
                throw eVar;
            }
            this.f13456p.a();
            if (b(this.f13460t)) {
                long j11 = this.D;
                if (j11 > 0) {
                    this.f13443aa = false;
                }
                if (this.T && this.f13457q != null && a10 < remaining2 && !this.f13443aa) {
                    this.f13457q.b(this.f13451j.c(j11));
                }
            }
            int i10 = this.f13459s.f13470c;
            if (i10 == 0) {
                this.C += a10;
            }
            if (a10 == remaining2) {
                if (i10 != 0) {
                    com.applovin.exoplayer2.l.a.b(byteBuffer == this.L);
                    this.D += this.E * this.M;
                }
                this.N = null;
            }
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(am amVar) {
        am amVar2 = new am(ai.a(amVar.f13211b, 0.1f, 8.0f), ai.a(amVar.f13212c, 0.1f, 8.0f));
        if (this.f13453l && ai.f16274a >= 23) {
            b(amVar2);
        } else {
            a(amVar2, m());
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(com.applovin.exoplayer2.b.d dVar) {
        if (this.f13461u.equals(dVar)) {
            return;
        }
        this.f13461u = dVar;
        if (this.X) {
            return;
        }
        j();
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(int i10) {
        if (this.V != i10) {
            this.V = i10;
            this.U = i10 != 0;
            j();
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(k kVar) {
        if (this.W.equals(kVar)) {
            return;
        }
        int i10 = kVar.f13432a;
        float f10 = kVar.f13433b;
        AudioTrack audioTrack = this.f13460t;
        if (audioTrack != null) {
            if (this.W.f13432a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f13460t.setAuxEffectSendLevel(f10);
            }
        }
        this.W = kVar;
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(float f10) {
        if (this.I != f10) {
            this.I = f10;
            t();
        }
    }

    private void a(am amVar, boolean z10) {
        e w10 = w();
        if (amVar.equals(w10.f13479a) && z10 == w10.f13480b) {
            return;
        }
        e eVar = new e(amVar, z10, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b);
        if (y()) {
            this.f13462v = eVar;
        } else {
            this.f13463w = eVar;
        }
    }

    private static boolean a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.b.e eVar) {
        return b(vVar, eVar) != null;
    }

    private static int a(int i10, int i11) {
        boolean isDirectPlaybackSupported;
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i12 = 8; i12 > 0; i12--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(ai.f(i12)).build(), build);
            if (isDirectPlaybackSupported) {
                return i12;
            }
        }
        return 0;
    }

    private boolean a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.b.d dVar) {
        int b10;
        int f10;
        int a10;
        if (ai.f16274a < 29 || this.f13454m == 0 || (b10 = com.applovin.exoplayer2.l.u.b((String) com.applovin.exoplayer2.l.a.b(vVar.f16838l), vVar.f16835i)) == 0 || (f10 = ai.f(vVar.y)) == 0 || (a10 = a(b(vVar.f16850z, f10, b10), dVar.a())) == 0) {
            return false;
        }
        if (a10 == 1) {
            return ((vVar.B != 0 || vVar.C != 0) && (this.f13454m == 1)) ? false : true;
        }
        if (a10 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        int i10 = ai.f16274a;
        if (i10 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            return playbackOffloadSupport;
        }
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (isOffloadedPlaybackSupported) {
            return (i10 == 30 && ai.f16277d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    private static int a(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return com.applovin.exoplayer2.b.b.a(byteBuffer);
            case 7:
            case 8:
                return o.a(byteBuffer);
            case 9:
                int b10 = r.b(ai.a(byteBuffer, byteBuffer.position()));
                if (b10 != -1) {
                    return b10;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException(a3.l.i("Unexpected audio encoding: ", i10));
            case 14:
                int b11 = com.applovin.exoplayer2.b.b.b(byteBuffer);
                if (b11 == -1) {
                    return 0;
                }
                return com.applovin.exoplayer2.b.b.a(byteBuffer, b11) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return com.applovin.exoplayer2.b.c.a(byteBuffer);
        }
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (ai.f16274a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.y == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.y = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.y.putInt(1431633921);
        }
        if (this.f13465z == 0) {
            this.y.putInt(4, i10);
            this.y.putLong(8, j10 * 1000);
            this.y.position(0);
            this.f13465z = i10;
        }
        int remaining = this.y.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.y, remaining, 1);
            if (write < 0) {
                this.f13465z = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int a10 = a(audioTrack, byteBuffer, i10);
        if (a10 < 0) {
            this.f13465z = 0;
            return a10;
        }
        this.f13465z -= a10;
        return a10;
    }

    private static void a(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }
}
