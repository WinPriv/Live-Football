package m4;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import d6.f0;
import d6.g0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k4.d1;
import k4.i0;
import k4.i1;
import l4.w;
import m4.k;
import m4.l;
import m4.n;
import m4.t;

/* compiled from: DefaultAudioSink.java */
/* loaded from: classes2.dex */
public final class r implements l {

    /* renamed from: d0, reason: collision with root package name */
    public static final Object f32799d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public static ExecutorService f32800e0;

    /* renamed from: f0, reason: collision with root package name */
    public static int f32801f0;
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public m4.f[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public o X;
    public c Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final m4.e f32802a;

    /* renamed from: a0, reason: collision with root package name */
    public long f32803a0;

    /* renamed from: b, reason: collision with root package name */
    public final m4.g f32804b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f32805b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32806c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f32807c0;

    /* renamed from: d, reason: collision with root package name */
    public final q f32808d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f32809e;
    public final m4.f[] f;

    /* renamed from: g, reason: collision with root package name */
    public final m4.f[] f32810g;

    /* renamed from: h, reason: collision with root package name */
    public final d6.e f32811h;

    /* renamed from: i, reason: collision with root package name */
    public final n f32812i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque<h> f32813j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f32814k;

    /* renamed from: l, reason: collision with root package name */
    public final int f32815l;

    /* renamed from: m, reason: collision with root package name */
    public k f32816m;

    /* renamed from: n, reason: collision with root package name */
    public final i<l.b> f32817n;
    public final i<l.e> o;

    /* renamed from: p, reason: collision with root package name */
    public final t f32818p;

    /* renamed from: q, reason: collision with root package name */
    public l4.w f32819q;

    /* renamed from: r, reason: collision with root package name */
    public l.c f32820r;

    /* renamed from: s, reason: collision with root package name */
    public f f32821s;

    /* renamed from: t, reason: collision with root package name */
    public f f32822t;

    /* renamed from: u, reason: collision with root package name */
    public AudioTrack f32823u;

    /* renamed from: v, reason: collision with root package name */
    public m4.d f32824v;

    /* renamed from: w, reason: collision with root package name */
    public h f32825w;

    /* renamed from: x, reason: collision with root package name */
    public h f32826x;
    public d1 y;

    /* renamed from: z, reason: collision with root package name */
    public ByteBuffer f32827z;

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(AudioTrack audioTrack, c cVar) {
            AudioDeviceInfo audioDeviceInfo;
            if (cVar == null) {
                audioDeviceInfo = null;
            } else {
                audioDeviceInfo = cVar.f32828a;
            }
            audioTrack.setPreferredDevice(audioDeviceInfo);
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public static void a(AudioTrack audioTrack, l4.w wVar) {
            LogSessionId logSessionId;
            boolean equals;
            w.a aVar = wVar.f32481a;
            aVar.getClass();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = aVar.f32483a;
            equals = logSessionId2.equals(logSessionId);
            if (!equals) {
                audioTrack.setLogSessionId(logSessionId2);
            }
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final AudioDeviceInfo f32828a;

        public c(AudioDeviceInfo audioDeviceInfo) {
            this.f32828a = audioDeviceInfo;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final t f32829a = new t(new t.a());
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        public g f32831b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f32832c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f32833d;

        /* renamed from: a, reason: collision with root package name */
        public m4.e f32830a = m4.e.f32726c;

        /* renamed from: e, reason: collision with root package name */
        public int f32834e = 0;
        public final t f = d.f32829a;
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f32835a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32836b;

        /* renamed from: c, reason: collision with root package name */
        public final int f32837c;

        /* renamed from: d, reason: collision with root package name */
        public final int f32838d;

        /* renamed from: e, reason: collision with root package name */
        public final int f32839e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f32840g;

        /* renamed from: h, reason: collision with root package name */
        public final int f32841h;

        /* renamed from: i, reason: collision with root package name */
        public final m4.f[] f32842i;

        public f(i0 i0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, m4.f[] fVarArr) {
            this.f32835a = i0Var;
            this.f32836b = i10;
            this.f32837c = i11;
            this.f32838d = i12;
            this.f32839e = i13;
            this.f = i14;
            this.f32840g = i15;
            this.f32841h = i16;
            this.f32842i = fVarArr;
        }

        public static AudioAttributes c(m4.d dVar, boolean z10) {
            if (z10) {
                return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            }
            return dVar.a().f32725a;
        }

        public final AudioTrack a(boolean z10, m4.d dVar, int i10) throws l.b {
            boolean z11;
            boolean z12;
            int i11 = this.f32837c;
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
                int i12 = this.f32839e;
                int i13 = this.f;
                int i14 = this.f32841h;
                i0 i0Var = this.f32835a;
                if (i11 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                throw new l.b(state, i12, i13, i14, i0Var, z12, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                int i15 = this.f32839e;
                int i16 = this.f;
                int i17 = this.f32841h;
                i0 i0Var2 = this.f32835a;
                if (i11 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                throw new l.b(0, i15, i16, i17, i0Var2, z11, e10);
            }
        }

        public final AudioTrack b(boolean z10, m4.d dVar, int i10) {
            AudioTrack.Builder offloadedPlayback;
            int i11 = g0.f27302a;
            int i12 = this.f32840g;
            int i13 = this.f;
            int i14 = this.f32839e;
            if (i11 >= 29) {
                AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(c(dVar, z10)).setAudioFormat(r.u(i14, i13, i12));
                boolean z11 = true;
                AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.f32841h).setSessionId(i10);
                if (this.f32837c != 1) {
                    z11 = false;
                }
                offloadedPlayback = sessionId.setOffloadedPlayback(z11);
                return offloadedPlayback.build();
            }
            if (i11 >= 21) {
                return new AudioTrack(c(dVar, z10), r.u(i14, i13, i12), this.f32841h, 1, i10);
            }
            int y = g0.y(dVar.f32721u);
            if (i10 == 0) {
                return new AudioTrack(y, this.f32839e, this.f, this.f32840g, this.f32841h, 1);
            }
            return new AudioTrack(y, this.f32839e, this.f, this.f32840g, this.f32841h, 1, i10);
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static class g implements m4.g {

        /* renamed from: a, reason: collision with root package name */
        public final m4.f[] f32843a;

        /* renamed from: b, reason: collision with root package name */
        public final z f32844b;

        /* renamed from: c, reason: collision with root package name */
        public final b0 f32845c;

        public g(m4.f... fVarArr) {
            z zVar = new z();
            b0 b0Var = new b0();
            m4.f[] fVarArr2 = new m4.f[fVarArr.length + 2];
            this.f32843a = fVarArr2;
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            this.f32844b = zVar;
            this.f32845c = b0Var;
            fVarArr2[fVarArr.length] = zVar;
            fVarArr2[fVarArr.length + 1] = b0Var;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final d1 f32846a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f32847b;

        /* renamed from: c, reason: collision with root package name */
        public final long f32848c;

        /* renamed from: d, reason: collision with root package name */
        public final long f32849d;

        public h(d1 d1Var, boolean z10, long j10, long j11) {
            this.f32846a = d1Var;
            this.f32847b = z10;
            this.f32848c = j10;
            this.f32849d = j11;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class i<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        public T f32850a;

        /* renamed from: b, reason: collision with root package name */
        public long f32851b;

        public final void a(T t10) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f32850a == null) {
                this.f32850a = t10;
                this.f32851b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f32851b) {
                T t11 = this.f32850a;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f32850a;
                this.f32850a = null;
                throw t12;
            }
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public final class j implements n.a {
        public j() {
        }

        @Override // m4.n.a
        public final void a(final long j10) {
            final k.a aVar;
            Handler handler;
            l.c cVar = r.this.f32820r;
            if (cVar != null && (handler = (aVar = w.this.X0).f32747a) != null) {
                handler.post(new Runnable() { // from class: m4.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a aVar2 = k.a.this;
                        aVar2.getClass();
                        int i10 = g0.f27302a;
                        aVar2.f32748b.n(j10);
                    }
                });
            }
        }

        @Override // m4.n.a
        public final void b(int i10, long j10) {
            r rVar = r.this;
            if (rVar.f32820r != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - rVar.f32803a0;
                k.a aVar = w.this.X0;
                Handler handler = aVar.f32747a;
                if (handler != null) {
                    handler.post(new com.applovin.exoplayer2.b.c0(aVar, i10, j10, elapsedRealtime, 1));
                }
            }
        }

        @Override // m4.n.a
        public final void c(long j10) {
            d6.p.f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // m4.n.a
        public final void d(long j10, long j11, long j12, long j13) {
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Spurious audio timestamp (frame position mismatch): ", j10, ", ");
            k10.append(j11);
            k10.append(", ");
            k10.append(j12);
            k10.append(", ");
            k10.append(j13);
            k10.append(", ");
            r rVar = r.this;
            k10.append(rVar.w());
            k10.append(", ");
            k10.append(rVar.x());
            String sb2 = k10.toString();
            Object obj = r.f32799d0;
            d6.p.f("DefaultAudioSink", sb2);
        }

        @Override // m4.n.a
        public final void e(long j10, long j11, long j12, long j13) {
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Spurious audio timestamp (system clock mismatch): ", j10, ", ");
            k10.append(j11);
            k10.append(", ");
            k10.append(j12);
            k10.append(", ");
            k10.append(j13);
            k10.append(", ");
            r rVar = r.this;
            k10.append(rVar.w());
            k10.append(", ");
            k10.append(rVar.x());
            String sb2 = k10.toString();
            Object obj = r.f32799d0;
            d6.p.f("DefaultAudioSink", sb2);
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public final class k {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f32853a = new Handler(Looper.myLooper());

        /* renamed from: b, reason: collision with root package name */
        public final a f32854b = new a();

        /* compiled from: DefaultAudioSink.java */
        /* loaded from: classes2.dex */
        public class a extends AudioTrack.StreamEventCallback {
            public a() {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onDataRequest(AudioTrack audioTrack, int i10) {
                r rVar;
                l.c cVar;
                i1.a aVar;
                if (audioTrack.equals(r.this.f32823u) && (cVar = (rVar = r.this).f32820r) != null && rVar.U && (aVar = w.this.f32867g1) != null) {
                    aVar.b();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onTearDown(AudioTrack audioTrack) {
                r rVar;
                l.c cVar;
                i1.a aVar;
                if (audioTrack.equals(r.this.f32823u) && (cVar = (rVar = r.this).f32820r) != null && rVar.U && (aVar = w.this.f32867g1) != null) {
                    aVar.b();
                }
            }
        }

        public k() {
        }
    }

    public r(e eVar) {
        boolean z10;
        boolean z11;
        int i10;
        this.f32802a = eVar.f32830a;
        g gVar = eVar.f32831b;
        this.f32804b = gVar;
        int i11 = g0.f27302a;
        if (i11 >= 21 && eVar.f32832c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32806c = z10;
        if (i11 >= 23 && eVar.f32833d) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32814k = z11;
        if (i11 >= 29) {
            i10 = eVar.f32834e;
        } else {
            i10 = 0;
        }
        this.f32815l = i10;
        this.f32818p = eVar.f;
        d6.e eVar2 = new d6.e(0);
        this.f32811h = eVar2;
        eVar2.a();
        this.f32812i = new n(new j());
        q qVar = new q();
        this.f32808d = qVar;
        c0 c0Var = new c0();
        this.f32809e = c0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new y(), qVar, c0Var);
        Collections.addAll(arrayList, gVar.f32843a);
        this.f = (m4.f[]) arrayList.toArray(new m4.f[0]);
        this.f32810g = new m4.f[]{new v()};
        this.J = 1.0f;
        this.f32824v = m4.d.y;
        this.W = 0;
        this.X = new o();
        d1 d1Var = d1.f30400v;
        this.f32826x = new h(d1Var, false, 0L, 0L);
        this.y = d1Var;
        this.R = -1;
        this.K = new m4.f[0];
        this.L = new ByteBuffer[0];
        this.f32813j = new ArrayDeque<>();
        this.f32817n = new i<>();
        this.o = new i<>();
    }

    public static boolean A(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (g0.f27302a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    public static AudioFormat u(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public final void B() {
        if (!this.T) {
            this.T = true;
            long x10 = x();
            n nVar = this.f32812i;
            nVar.A = nVar.a();
            nVar.y = SystemClock.elapsedRealtime() * 1000;
            nVar.B = x10;
            this.f32823u.stop();
            this.A = 0;
        }
    }

    public final void C(long j10) throws l.e {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = m4.f.f32732a;
                }
            }
            if (i10 == length) {
                J(byteBuffer, j10);
            } else {
                m4.f fVar = this.K[i10];
                if (i10 > this.R) {
                    fVar.a(byteBuffer);
                }
                ByteBuffer output = fVar.getOutput();
                this.L[i10] = output;
                if (output.hasRemaining()) {
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

    public final void D() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i10 = 0;
        this.f32807c0 = false;
        this.F = 0;
        this.f32826x = new h(v().f32846a, v().f32847b, 0L, 0L);
        this.I = 0L;
        this.f32825w = null;
        this.f32813j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f32827z = null;
        this.A = 0;
        this.f32809e.o = 0L;
        while (true) {
            m4.f[] fVarArr = this.K;
            if (i10 < fVarArr.length) {
                m4.f fVar = fVarArr[i10];
                fVar.flush();
                this.L[i10] = fVar.getOutput();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void E(d1 d1Var, boolean z10) {
        h v3 = v();
        if (!d1Var.equals(v3.f32846a) || z10 != v3.f32847b) {
            h hVar = new h(d1Var, z10, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b);
            if (z()) {
                this.f32825w = hVar;
            } else {
                this.f32826x = hVar;
            }
        }
    }

    public final void F(d1 d1Var) {
        if (z()) {
            try {
                this.f32823u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(d1Var.f30401s).setPitch(d1Var.f30402t).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                d6.p.g("DefaultAudioSink", "Failed to set playback params", e10);
            }
            d1Var = new d1(this.f32823u.getPlaybackParams().getSpeed(), this.f32823u.getPlaybackParams().getPitch());
            n nVar = this.f32812i;
            nVar.f32774j = d1Var.f30401s;
            m mVar = nVar.f;
            if (mVar != null) {
                mVar.a();
            }
            nVar.c();
        }
        this.y = d1Var;
    }

    public final void G() {
        if (z()) {
            if (g0.f27302a >= 21) {
                this.f32823u.setVolume(this.J);
                return;
            }
            AudioTrack audioTrack = this.f32823u;
            float f10 = this.J;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H() {
        /*
            r4 = this;
            boolean r0 = r4.Z
            r1 = 0
            if (r0 != 0) goto L37
            m4.r$f r0 = r4.f32822t
            k4.i0 r0 = r0.f32835a
            java.lang.String r0 = r0.D
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            m4.r$f r0 = r4.f32822t
            k4.i0 r0 = r0.f32835a
            int r0 = r0.S
            boolean r2 = r4.f32806c
            r3 = 1
            if (r2 == 0) goto L33
            int r2 = d6.g0.f27302a
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 == r2) goto L2e
            r2 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == r2) goto L2e
            r2 = 4
            if (r0 != r2) goto L2c
            goto L2e
        L2c:
            r0 = r1
            goto L2f
        L2e:
            r0 = r3
        L2f:
            if (r0 == 0) goto L33
            r0 = r3
            goto L34
        L33:
            r0 = r1
        L34:
            if (r0 != 0) goto L37
            r1 = r3
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r.H():boolean");
    }

    public final boolean I(i0 i0Var, m4.d dVar) {
        int i10;
        int n10;
        boolean isOffloadedPlaybackSupported;
        int i11;
        boolean z10;
        boolean z11;
        int i12 = g0.f27302a;
        if (i12 < 29 || (i10 = this.f32815l) == 0) {
            return false;
        }
        String str = i0Var.D;
        str.getClass();
        int d10 = d6.r.d(str, i0Var.A);
        if (d10 == 0 || (n10 = g0.n(i0Var.Q)) == 0) {
            return false;
        }
        AudioFormat u2 = u(i0Var.R, n10, d10);
        AudioAttributes audioAttributes = dVar.a().f32725a;
        if (i12 >= 31) {
            i11 = AudioManager.getPlaybackOffloadSupport(u2, audioAttributes);
        } else {
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(u2, audioAttributes);
            if (!isOffloadedPlaybackSupported) {
                i11 = 0;
            } else if (i12 == 30 && g0.f27305d.startsWith("Pixel")) {
                i11 = 2;
            } else {
                i11 = 1;
            }
        }
        if (i11 == 0) {
            return false;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                return true;
            }
            throw new IllegalStateException();
        }
        if (i0Var.T == 0 && i0Var.U == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e3, code lost:
    
        if (r15 < r14) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(java.nio.ByteBuffer r13, long r14) throws m4.l.e {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r.J(java.nio.ByteBuffer, long):void");
    }

    @Override // m4.l
    public final void a(d1 d1Var) {
        d1 d1Var2 = new d1(g0.g(d1Var.f30401s, 0.1f, 8.0f), g0.g(d1Var.f30402t, 0.1f, 8.0f));
        if (this.f32814k && g0.f27302a >= 23) {
            F(d1Var2);
        } else {
            E(d1Var2, v().f32847b);
        }
    }

    @Override // m4.l
    public final boolean b() {
        if (z() && (!this.S || h())) {
            return false;
        }
        return true;
    }

    @Override // m4.l
    public final boolean c(i0 i0Var) {
        if (f(i0Var) != 0) {
            return true;
        }
        return false;
    }

    @Override // m4.l
    public final d1 d() {
        if (this.f32814k) {
            return this.y;
        }
        return v().f32846a;
    }

    @Override // m4.l
    public final void e(l4.w wVar) {
        this.f32819q = wVar;
    }

    @Override // m4.l
    public final int f(i0 i0Var) {
        boolean z10 = true;
        if (com.anythink.expressad.exoplayer.k.o.f9088w.equals(i0Var.D)) {
            int i10 = i0Var.S;
            if (!g0.G(i10)) {
                d6.p.f("DefaultAudioSink", "Invalid PCM encoding: " + i10);
                return 0;
            }
            if (i10 != 2 && (!this.f32806c || i10 != 4)) {
                return 1;
            }
            return 2;
        }
        if (!this.f32805b0 && I(i0Var, this.f32824v)) {
            return 2;
        }
        if (this.f32802a.a(i0Var) == null) {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        return 2;
    }

    @Override // m4.l
    public final void flush() {
        boolean z10;
        if (z()) {
            D();
            AudioTrack audioTrack = this.f32812i.f32768c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f32823u.pause();
            }
            if (A(this.f32823u)) {
                k kVar = this.f32816m;
                kVar.getClass();
                this.f32823u.unregisterStreamEventCallback(kVar.f32854b);
                kVar.f32853a.removeCallbacksAndMessages(null);
            }
            if (g0.f27302a < 21 && !this.V) {
                this.W = 0;
            }
            f fVar = this.f32821s;
            if (fVar != null) {
                this.f32822t = fVar;
                this.f32821s = null;
            }
            n nVar = this.f32812i;
            nVar.c();
            nVar.f32768c = null;
            nVar.f = null;
            AudioTrack audioTrack2 = this.f32823u;
            d6.e eVar = this.f32811h;
            synchronized (eVar) {
                eVar.f27296a = false;
            }
            synchronized (f32799d0) {
                try {
                    if (f32800e0 == null) {
                        f32800e0 = Executors.newSingleThreadExecutor(new f0("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f32801f0++;
                    f32800e0.execute(new e0.g(7, audioTrack2, eVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f32823u = null;
        }
        this.o.f32850a = null;
        this.f32817n.f32850a = null;
    }

    @Override // m4.l
    public final void g() throws l.e {
        if (!this.S && z() && t()) {
            B();
            this.S = true;
        }
    }

    @Override // m4.l
    public final boolean h() {
        if (z() && this.f32812i.b(x())) {
            return true;
        }
        return false;
    }

    @Override // m4.l
    public final void i(o oVar) {
        if (this.X.equals(oVar)) {
            return;
        }
        int i10 = oVar.f32789a;
        AudioTrack audioTrack = this.f32823u;
        if (audioTrack != null) {
            if (this.X.f32789a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f32823u.setAuxEffectSendLevel(oVar.f32790b);
            }
        }
        this.X = oVar;
    }

    @Override // m4.l
    public final void j(int i10) {
        boolean z10;
        if (this.W != i10) {
            this.W = i10;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.V = z10;
            flush();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b1 A[ADDED_TO_REGION, EDGE_INSN: B:121:0x02b1->B:105:0x02b1 BREAK  A[LOOP:1: B:99:0x0294->B:103:0x02a8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025f  */
    @Override // m4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(boolean r31) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r.k(boolean):long");
    }

    @Override // m4.l
    public final void l() {
        if (this.Z) {
            this.Z = false;
            flush();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0154, code lost:
    
        if ((r4 & r5) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
    
        if (r21 > 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015a, code lost:
    
        if (r2 > 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015d, code lost:
    
        if (r2 < 0) goto L98;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x012a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    @Override // m4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(k4.i0 r25, int[] r26) throws m4.l.a {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r.m(k4.i0, int[]):void");
    }

    @Override // m4.l
    public final void n() {
        this.G = true;
    }

    @Override // m4.l
    public final void o() {
        boolean z10;
        if (g0.f27302a >= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        d6.a.d(this.V);
        if (!this.Z) {
            this.Z = true;
            flush();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x00f3, code lost:
    
        if (r5.a() == 0) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    @Override // m4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(java.nio.ByteBuffer r19, long r20, int r22) throws m4.l.b, m4.l.e {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r.p(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // m4.l
    public final void pause() {
        boolean z10 = false;
        this.U = false;
        if (z()) {
            n nVar = this.f32812i;
            nVar.c();
            if (nVar.y == com.anythink.expressad.exoplayer.b.f7291b) {
                m mVar = nVar.f;
                mVar.getClass();
                mVar.a();
                z10 = true;
            }
            if (z10) {
                this.f32823u.pause();
            }
        }
    }

    @Override // m4.l
    public final void play() {
        this.U = true;
        if (z()) {
            m mVar = this.f32812i.f;
            mVar.getClass();
            mVar.a();
            this.f32823u.play();
        }
    }

    @Override // m4.l
    public final void q(m4.d dVar) {
        if (this.f32824v.equals(dVar)) {
            return;
        }
        this.f32824v = dVar;
        if (this.Z) {
            return;
        }
        flush();
    }

    @Override // m4.l
    public final void r(boolean z10) {
        E(v().f32846a, z10);
    }

    @Override // m4.l
    public final void reset() {
        flush();
        for (m4.f fVar : this.f) {
            fVar.reset();
        }
        for (m4.f fVar2 : this.f32810g) {
            fVar2.reset();
        }
        this.U = false;
        this.f32805b0 = false;
    }

    public final void s(long j10) {
        d1 d1Var;
        boolean z10;
        k.a aVar;
        Handler handler;
        boolean H = H();
        m4.g gVar = this.f32804b;
        if (H) {
            d1Var = v().f32846a;
            g gVar2 = (g) gVar;
            gVar2.getClass();
            float f10 = d1Var.f30401s;
            b0 b0Var = gVar2.f32845c;
            if (b0Var.f32697c != f10) {
                b0Var.f32697c = f10;
                b0Var.f32702i = true;
            }
            float f11 = b0Var.f32698d;
            float f12 = d1Var.f30402t;
            if (f11 != f12) {
                b0Var.f32698d = f12;
                b0Var.f32702i = true;
            }
        } else {
            d1Var = d1.f30400v;
        }
        d1 d1Var2 = d1Var;
        int i10 = 0;
        if (H()) {
            z10 = v().f32847b;
            ((g) gVar).f32844b.f32885m = z10;
        } else {
            z10 = false;
        }
        this.f32813j.add(new h(d1Var2, z10, Math.max(0L, j10), (x() * 1000000) / this.f32822t.f32839e));
        m4.f[] fVarArr = this.f32822t.f32842i;
        ArrayList arrayList = new ArrayList();
        for (m4.f fVar : fVarArr) {
            if (fVar.e()) {
                arrayList.add(fVar);
            } else {
                fVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (m4.f[]) arrayList.toArray(new m4.f[size]);
        this.L = new ByteBuffer[size];
        int i11 = 0;
        while (true) {
            m4.f[] fVarArr2 = this.K;
            if (i11 >= fVarArr2.length) {
                break;
            }
            m4.f fVar2 = fVarArr2[i11];
            fVar2.flush();
            this.L[i11] = fVar2.getOutput();
            i11++;
        }
        l.c cVar = this.f32820r;
        if (cVar != null && (handler = (aVar = w.this.X0).f32747a) != null) {
            handler.post(new m4.j(i10, aVar, z10));
        }
    }

    @Override // m4.l
    public final void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        c cVar;
        if (audioDeviceInfo == null) {
            cVar = null;
        } else {
            cVar = new c(audioDeviceInfo);
        }
        this.Y = cVar;
        AudioTrack audioTrack = this.f32823u;
        if (audioTrack != null) {
            a.a(audioTrack, cVar);
        }
    }

    @Override // m4.l
    public final void setVolume(float f10) {
        if (this.J != f10) {
            this.J = f10;
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t() throws m4.l.e {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.R
            m4.f[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.c()
        L1f:
            r9.C(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.R
            int r0 = r0 + r1
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.J(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r.t():boolean");
    }

    public final h v() {
        h hVar = this.f32825w;
        if (hVar == null) {
            ArrayDeque<h> arrayDeque = this.f32813j;
            if (!arrayDeque.isEmpty()) {
                return arrayDeque.getLast();
            }
            return this.f32826x;
        }
        return hVar;
    }

    public final long w() {
        if (this.f32822t.f32837c == 0) {
            return this.B / r0.f32836b;
        }
        return this.C;
    }

    public final long x() {
        if (this.f32822t.f32837c == 0) {
            return this.D / r0.f32838d;
        }
        return this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v3, types: [m4.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y() throws m4.l.b {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r.y():boolean");
    }

    public final boolean z() {
        if (this.f32823u != null) {
            return true;
        }
        return false;
    }
}
