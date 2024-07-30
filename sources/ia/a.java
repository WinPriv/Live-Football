package ia;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import com.huawei.hms.ads.dr;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fg;
import com.huawei.hms.ads.fh;
import com.huawei.hms.ads.fi;
import com.huawei.hms.ads.fj;
import com.huawei.hms.ads.fk;
import com.huawei.hms.ads.fl;
import com.huawei.hms.ads.fm;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.bw;
import gb.c0;
import gb.q0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class a {
    private static final int B = 20;
    private static final int C = 805;
    private static final int F = 2;
    private static final String I = "MediaPlayerAgent";
    private static final int L = 100;
    private static final int S = 300;
    private static final int Z = -10000;

    /* renamed from: a, reason: collision with root package name */
    private static final int f29349a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final String f29350b = "progress_task";

    /* renamed from: c, reason: collision with root package name */
    private static final int f29351c = 100;

    /* renamed from: d, reason: collision with root package name */
    private static final int f29352d = 200;

    /* renamed from: e, reason: collision with root package name */
    private static final int f29353e = 0;
    private Object A;
    private MediaPlayer D;
    private WeakReference<Surface> E;
    private int G;
    private Context J;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f29359h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f29360i;

    /* renamed from: n, reason: collision with root package name */
    private int f29365n;
    private int o;

    /* renamed from: u, reason: collision with root package name */
    private AudioManager f29371u;
    private static final String Code = "thread_media_player_ctrl";
    private static final q0 V = new q0(Code);
    private int f = 0;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29361j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29362k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29363l = false;

    /* renamed from: m, reason: collision with root package name */
    private int f29364m = 0;

    /* renamed from: p, reason: collision with root package name */
    private final ia.b f29366p = new ia.b();

    /* renamed from: q, reason: collision with root package name */
    private final byte[] f29367q = new byte[0];

    /* renamed from: r, reason: collision with root package name */
    private final byte[] f29368r = new byte[0];

    /* renamed from: s, reason: collision with root package name */
    private final byte[] f29369s = new byte[0];

    /* renamed from: t, reason: collision with root package name */
    private int f29370t = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f29372v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f29373w = false;

    /* renamed from: x, reason: collision with root package name */
    private int f29374x = 0;
    private boolean y = false;

    /* renamed from: z, reason: collision with root package name */
    private volatile int f29375z = 0;
    private boolean H = false;
    private final CopyOnWriteArraySet<fk> K = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<fg> M = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<fh> N = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<fl> O = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<fi> P = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<MediaPlayer.OnVideoSizeChangedListener> Q = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<fm> R = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<fj> T = new CopyOnWriteArraySet<>();
    private final MediaPlayer.OnVideoSizeChangedListener U = new k();
    private MediaPlayer.OnCompletionListener W = new c();
    private MediaPlayer.OnInfoListener X = new o();
    private MediaPlayer.OnPreparedListener Y = new a0();

    /* renamed from: aa, reason: collision with root package name */
    private MediaPlayer.OnErrorListener f29354aa = new e0();

    /* renamed from: ab, reason: collision with root package name */
    private MediaPlayer.OnBufferingUpdateListener f29355ab = new f0();

    /* renamed from: ac, reason: collision with root package name */
    private Callable<Boolean> f29356ac = new n0();

    /* renamed from: ad, reason: collision with root package name */
    private Runnable f29357ad = new w();
    private AudioManager.OnAudioFocusChangeListener ae = new c0();

    /* renamed from: g, reason: collision with root package name */
    private String f29358g = f29350b + hashCode();

    /* renamed from: ia.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0399a implements Runnable {
        public RunnableC0399a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.p();
        }
    }

    /* loaded from: classes2.dex */
    public class a0 implements MediaPlayer.OnPreparedListener {
        public a0() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            ex.V(a.I, "onPrepared");
            a aVar = a.this;
            aVar.f29362k = false;
            mediaPlayer.setOnInfoListener(aVar.X);
            boolean z10 = aVar.f29363l;
            ia.d dVar = ia.d.PREPARED;
            if (!z10 && !aVar.f29366p.d(ia.d.PREPARING)) {
                try {
                    aVar.f29366p.c(dVar);
                    mediaPlayer.start();
                    a.V(mediaPlayer, aVar.o, 3);
                    aVar.f29366p.c(ia.d.PLAYING);
                    if (ex.Code()) {
                        ex.Code(a.I, "seek to prefer pos: %d", Integer.valueOf(aVar.o));
                    }
                    aVar.S(mediaPlayer.getCurrentPosition());
                    aVar.L(aVar.l());
                    aVar.x();
                    return;
                } catch (IllegalStateException unused) {
                    ex.I(a.I, "onPrepared - IllegalStateException");
                    aVar.f29366p.c(ia.d.ERROR);
                    aVar.Code(0, -1, -1);
                    return;
                }
            }
            aVar.f29366p.c(dVar);
            aVar.L(aVar.l());
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.q();
        }
    }

    /* loaded from: classes2.dex */
    public class b0 implements Runnable {
        public b0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.E();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements MediaPlayer.OnCompletionListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            a aVar = a.this;
            if (!aVar.f29366p.b(ia.d.ERROR)) {
                ia.b bVar = aVar.f29366p;
                ia.d dVar = ia.d.PLAYBACK_COMPLETED;
                if (!bVar.b(dVar)) {
                    aVar.f29366p.c(dVar);
                    int currentPosition = mediaPlayer.getCurrentPosition();
                    int l10 = aVar.l();
                    ex.V(a.I, "onCompletion " + currentPosition + " duration: " + l10);
                    int max = Math.max(currentPosition, l10);
                    aVar.Code(100, max);
                    aVar.B(max);
                    aVar.u();
                    a.F(aVar.f29358g);
                    aVar.f29364m = 0;
                    aVar.f29370t = 0;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c0 implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: ia.a$c0$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0400a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f29382s;

            public RunnableC0400a(int i10) {
                this.f29382s = i10;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
            
                if (r6.f29373w != false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
            
                r6.q();
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
            
                if (r6.f29373w != false) goto L25;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r10 = this;
                    r0 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    int r2 = r10.f29382s
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    r4 = 0
                    r1[r4] = r3
                    ia.a$c0 r3 = ia.a.c0.this
                    ia.a r5 = ia.a.this
                    int r5 = ia.a.z(r5)
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    r6 = 1
                    r1[r6] = r5
                    java.lang.String r5 = "MediaPlayerAgent"
                    java.lang.String r7 = "onAudioFocusChange %d previous: %d"
                    com.huawei.hms.ads.ex.V(r5, r7, r1)
                    r1 = -3
                    if (r2 == r1) goto Lba
                    r7 = -2
                    if (r2 == r7) goto L7f
                    r8 = -1
                    if (r2 == r8) goto L7f
                    if (r2 == r6) goto L31
                    if (r2 == r0) goto L31
                    goto Lbd
                L31:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r6 = "handleAudioFocusGain - muteOnlyOnLostAudioFocus: "
                    r0.<init>(r6)
                    ia.a r6 = ia.a.this
                    boolean r9 = ia.a.A(r6)
                    r0.append(r9)
                    java.lang.String r0 = r0.toString()
                    com.huawei.hms.ads.ex.V(r5, r0)
                    boolean r0 = ia.a.A(r6)
                    if (r0 == 0) goto L55
                    boolean r0 = ia.a.G(r6)
                    if (r0 == 0) goto Lbd
                    goto L6e
                L55:
                    int r0 = ia.a.z(r6)
                    if (r0 == r7) goto L72
                    int r0 = ia.a.z(r6)
                    if (r0 != r8) goto L62
                    goto L72
                L62:
                    int r0 = ia.a.z(r6)
                    if (r0 != r1) goto Lbd
                    boolean r0 = ia.a.G(r6)
                    if (r0 == 0) goto Lbd
                L6e:
                    ia.a.h(r6)
                    goto Lbd
                L72:
                    boolean r0 = ia.a.H(r6)
                    if (r0 == 0) goto Lbd
                    ia.a.a(r6)
                    ia.a.V(r6, r4)
                    goto Lbd
                L7f:
                    ia.a r0 = ia.a.this
                    boolean r1 = ia.a.A(r0)
                    if (r1 == 0) goto La0
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r4 = "handleAudioFocusLoss muteOnlyOnLostAudioFocus: "
                    r1.<init>(r4)
                    boolean r0 = ia.a.A(r0)
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.huawei.hms.ads.ex.V(r5, r0)
                    r3.a()
                    goto Lbd
                La0:
                    boolean r1 = ia.a.f(r0)
                    java.lang.Object[] r7 = new java.lang.Object[r6]
                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
                    r7[r4] = r8
                    java.lang.String r4 = "handleAudioFocusLoss isPlaying: %s"
                    com.huawei.hms.ads.ex.V(r5, r4, r7)
                    if (r1 == 0) goto Lbd
                    r0.Z()
                    ia.a.V(r0, r6)
                    goto Lbd
                Lba:
                    r3.a()
                Lbd:
                    ia.a r0 = ia.a.this
                    ia.a.b(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ia.a.c0.RunnableC0400a.run():void");
            }
        }

        public c0() {
        }

        public final void a() {
            StringBuilder sb2 = new StringBuilder("handleAudioFocusLossTransientCanDuck soundMuted: ");
            a aVar = a.this;
            sb2.append(aVar.y);
            ex.V(a.I, sb2.toString());
            if (!aVar.y) {
                aVar.p();
                aVar.f29373w = true;
            }
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i10) {
            a.V(new RunnableC0400a(i10));
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f29384s;

        public d(float f) {
            this.f29384s = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            float f = this.f29384s;
            ex.Code(a.I, "setSoundVolume %f result: %s", Float.valueOf(f), Boolean.valueOf(aVar.I(f)));
        }
    }

    /* loaded from: classes2.dex */
    public class d0 implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f29386s;

        public d0(float f) {
            this.f29386s = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.Z(this.f29386s);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29388s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f29389t;

        public e(int i10, int i11) {
            this.f29388s = i10;
            this.f29389t = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = a.this.K.iterator();
            while (it.hasNext()) {
                fk fkVar = (fk) it.next();
                if (fkVar != null) {
                    fkVar.Code(this.f29388s, this.f29389t);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e0 implements MediaPlayer.OnErrorListener {
        public e0() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            a aVar = a.this;
            ex.I(a.I, "onError - what: %d extra: %d currentState: %s - agent: %s", Integer.valueOf(i10), Integer.valueOf(i11), aVar.f29366p, aVar);
            aVar.u();
            ia.b bVar = aVar.f29366p;
            ia.d dVar = ia.d.ERROR;
            if (bVar.b(dVar)) {
                return true;
            }
            aVar.f29366p.c(dVar);
            aVar.Code(mediaPlayer.getCurrentPosition(), i10, i11);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29392s;

        public f(int i10) {
            this.f29392s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            Iterator it = aVar.K.iterator();
            while (it.hasNext()) {
                fk fkVar = (fk) it.next();
                if (fkVar != null) {
                    fkVar.Z(aVar, this.f29392s);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f0 implements MediaPlayer.OnBufferingUpdateListener {
        public f0() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            a aVar = a.this;
            if (aVar.f29366p.a()) {
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 > 100) {
                    i10 = 100;
                }
                aVar.C(i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29395s;

        public g(int i10) {
            this.f29395s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = a.this.M.iterator();
            while (it.hasNext()) {
                fg fgVar = (fg) it.next();
                if (fgVar != null) {
                    fgVar.Code(this.f29395s);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g0 implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f29397s;

        public g0(String str) {
            this.f29397s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f29397s;
            if (str != null) {
                a aVar = a.this;
                if (TextUtils.equals(str, aVar.f29359h)) {
                    aVar.i();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = a.this.M.iterator();
            while (it.hasNext()) {
                fg fgVar = (fg) it.next();
                if (fgVar != null) {
                    fgVar.Code();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h0 implements Runnable {
        public h0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.g();
        }
    }

    /* loaded from: classes2.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = a.this.R.iterator();
            while (it.hasNext()) {
                fm fmVar = (fm) it.next();
                if (fmVar != null) {
                    fmVar.Code();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class i0 implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f29402s;

        public i0(String str) {
            this.f29402s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f29402s;
            if (str != null) {
                a aVar = a.this;
                if (TextUtils.equals(str, aVar.f29359h)) {
                    aVar.g();
                    return;
                }
            }
            ex.V(a.I, "playWhenUrlMatchs - url not match");
        }
    }

    /* loaded from: classes2.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = a.this.T.iterator();
            while (it.hasNext()) {
                fj fjVar = (fj) it.next();
                if (fjVar != null) {
                    fjVar.Code();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class j0 implements Runnable {
        public j0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.h();
        }
    }

    /* loaded from: classes2.dex */
    public class k implements MediaPlayer.OnVideoSizeChangedListener {
        public k() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            a.this.Code(mediaPlayer, i10, i11);
        }
    }

    /* loaded from: classes2.dex */
    public class k0 implements Runnable {
        public k0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.j();
        }
    }

    /* loaded from: classes2.dex */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = a.this.M.iterator();
            while (it.hasNext()) {
                fg fgVar = (fg) it.next();
                if (fgVar != null) {
                    fgVar.V();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class l0 implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f29409s;

        public l0(String str) {
            this.f29409s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f29409s;
            if (str != null) {
                a aVar = a.this;
                if (TextUtils.equals(str, aVar.f29359h)) {
                    aVar.j();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class m implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29411s;

        public m(int i10) {
            this.f29411s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            Iterator it = aVar.K.iterator();
            while (it.hasNext()) {
                fk fkVar = (fk) it.next();
                if (fkVar != null) {
                    fkVar.Code(aVar, this.f29411s);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class m0 implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f29413s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f29414t;

        public m0(long j10, int i10) {
            this.f29413s = j10;
            this.f29414t = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.V(this.f29413s, this.f29414t);
        }
    }

    /* loaded from: classes2.dex */
    public class n implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29416s;

        public n(int i10) {
            this.f29416s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            Iterator it = aVar.K.iterator();
            while (it.hasNext()) {
                fk fkVar = (fk) it.next();
                if (fkVar != null) {
                    fkVar.I(aVar, this.f29416s);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class n0 implements Callable<Boolean> {
        public n0() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() {
            return Boolean.valueOf(a.this.n());
        }
    }

    /* loaded from: classes2.dex */
    public class o implements MediaPlayer.OnInfoListener {
        public o() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            if (r5 != 702) goto L15;
         */
        @Override // android.media.MediaPlayer.OnInfoListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onInfo(android.media.MediaPlayer r4, int r5, int r6) {
            /*
                r3 = this;
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r0 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r4[r0] = r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                r1 = 1
                r4[r1] = r0
                java.lang.String r0 = "MediaPlayerAgent"
                java.lang.String r2 = "onInfo what: %d extra: %d"
                com.huawei.hms.ads.ex.V(r0, r2, r4)
                r4 = 3
                ia.a r0 = ia.a.this
                if (r5 == r4) goto L32
                r4 = 805(0x325, float:1.128E-42)
                if (r5 == r4) goto L2e
                r4 = 701(0x2bd, float:9.82E-43)
                if (r5 == r4) goto L2a
                r4 = 702(0x2be, float:9.84E-43)
                if (r5 == r4) goto L35
                goto L38
            L2a:
                ia.a.B(r0)
                goto L38
            L2e:
                ia.a.F(r0, r6)
                goto L38
            L32:
                ia.a.C(r0)
            L35:
                ia.a.I(r0)
            L38:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ia.a.o.onInfo(android.media.MediaPlayer, int, int):boolean");
        }
    }

    /* loaded from: classes2.dex */
    public class o0 implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f29420s;

        public o0(String str) {
            this.f29420s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a.this.C(this.f29420s);
            } catch (dr e10) {
                ex.Code(a.I, "set media file error:%s", e10.getMessage());
                ex.I(a.I, "set media file error:".concat(e10.getClass().getSimpleName()));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class p implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29422s;

        public p(int i10) {
            this.f29422s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            Iterator it = aVar.K.iterator();
            while (it.hasNext()) {
                fk fkVar = (fk) it.next();
                if (fkVar != null) {
                    fkVar.V(aVar, this.f29422s);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class p0 implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Surface f29424s;

        public p0(Surface surface) {
            this.f29424s = surface;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.V(this.f29424s);
        }
    }

    /* loaded from: classes2.dex */
    public class q implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29426s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f29427t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f29428u;

        public q(int i10, int i11, int i12) {
            this.f29426s = i10;
            this.f29427t = i11;
            this.f29428u = i12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            Iterator it = aVar.N.iterator();
            while (it.hasNext()) {
                fh fhVar = (fh) it.next();
                if (fhVar != null) {
                    fhVar.Code(aVar, this.f29426s, this.f29427t, this.f29428u);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = a.this.O.iterator();
            while (it.hasNext()) {
                fl flVar = (fl) it.next();
                if (flVar != null) {
                    flVar.Code();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = a.this.O.iterator();
            while (it.hasNext()) {
                fl flVar = (fl) it.next();
                if (flVar != null) {
                    flVar.V();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class t implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29432s;

        public t(int i10) {
            this.f29432s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = a.this.P.iterator();
            while (it.hasNext()) {
                fi fiVar = (fi) it.next();
                if (fiVar != null) {
                    fiVar.Code(this.f29432s);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class u implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29434s;

        public u(int i10) {
            this.f29434s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = a.this.P.iterator();
            while (it.hasNext()) {
                fi fiVar = (fi) it.next();
                if (fiVar != null) {
                    fiVar.V(this.f29434s);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.i();
        }
    }

    /* loaded from: classes2.dex */
    public class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int l10;
            a aVar = a.this;
            a.F(aVar.f29358g);
            if (aVar.f29366p.d(ia.d.PREPARING) && aVar.f29366p.d(ia.d.PLAYING) && aVar.f29366p.d(ia.d.PREPARED)) {
                return;
            }
            int B = aVar.B();
            if (aVar.K.size() > 0 && (l10 = aVar.l()) > 0) {
                int ceil = (int) Math.ceil((B * 100.0f) / l10);
                if (ceil > 100) {
                    ceil = 100;
                }
                aVar.Code(ceil, B);
                if (B >= l10) {
                    a.p(aVar);
                    if (aVar.f29370t > 2) {
                        ex.V(a.I, "reach end count exceeds");
                        aVar.W.onCompletion(aVar.f());
                        return;
                    }
                }
            }
            if (aVar.f29360i && aVar.M.size() > 0 && aVar.f29370t == 0) {
                if (Math.abs(B - aVar.f29364m) < 100) {
                    aVar.r();
                } else {
                    aVar.u();
                    aVar.f29364m = B;
                }
            }
            a.V(aVar.f29357ad, aVar.f29358g, 200L);
        }
    }

    /* loaded from: classes2.dex */
    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.y();
        }
    }

    /* loaded from: classes2.dex */
    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.y();
        }
    }

    /* loaded from: classes2.dex */
    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.z();
        }
    }

    public a(Context context) {
        this.J = context.getApplicationContext();
        this.f29371u = (AudioManager) context.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
        V.b();
    }

    private void A() {
        String concat;
        if (!G()) {
            ex.I(I, "audio focus is not needed");
            return;
        }
        try {
            ex.V(I, "requestAudioFocus");
            if (Build.VERSION.SDK_INT < 26) {
                this.f29371u.requestAudioFocus(this.ae, 3, 2);
            } else {
                AudioFocusRequest build = new AudioFocusRequest.Builder(2).setOnAudioFocusChangeListener(this.ae).build();
                this.A = build;
                this.f29371u.requestAudioFocus(build);
            }
        } catch (IllegalStateException unused) {
            concat = "requestAudioFocus IllegalStateException";
            ex.I(I, concat);
        } catch (Exception e10) {
            concat = "requestAudioFocus ".concat(e10.getClass().getSimpleName());
            ex.I(I, concat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void E() {
        String concat;
        try {
            try {
                ex.V(I, "abandonAudioFocus");
                if (Build.VERSION.SDK_INT < 26) {
                    this.f29371u.abandonAudioFocus(this.ae);
                } else {
                    Object obj = this.A;
                    if (obj instanceof AudioFocusRequest) {
                        this.f29371u.abandonAudioFocusRequest((AudioFocusRequest) obj);
                    }
                    this.A = null;
                }
            } catch (IllegalStateException unused) {
                concat = "abandonAudioFocus IllegalStateException";
                ex.I(I, concat);
            } catch (Exception e10) {
                concat = "abandonAudioFocus ".concat(e10.getClass().getSimpleName());
                ex.I(I, concat);
            }
        } finally {
            this.f29373w = false;
            this.f29372v = false;
            this.f29374x = 0;
        }
    }

    private boolean G() {
        ex.V(I, "isNeedAudioFocus type: %s soundMute: %s", Integer.valueOf(this.f29375z), Boolean.valueOf(this.y));
        if (this.f29375z == 0) {
            return true;
        }
        if (this.f29375z == 2) {
            return false;
        }
        return (this.f29375z == 1 && this.y) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaPlayer f() {
        MediaPlayer mediaPlayer;
        synchronized (this.f29367q) {
            if (this.D == null) {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                mediaPlayer2.setOnCompletionListener(this.W);
                mediaPlayer2.setOnPreparedListener(this.Y);
                mediaPlayer2.setOnErrorListener(this.f29354aa);
                mediaPlayer2.setOnBufferingUpdateListener(this.f29355ab);
                mediaPlayer2.setOnVideoSizeChangedListener(this.U);
                mediaPlayer2.setLooping(false);
                mediaPlayer2.setAudioStreamType(3);
                this.D = mediaPlayer2;
            }
            mediaPlayer = this.D;
        }
        return mediaPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:12|(2:14|(8:20|21|(2:23|(1:25)(1:26))|27|(1:29)(1:34)|30|31|32))|36|37|(1:39)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        com.huawei.hms.ads.ex.Code(ia.a.I, "set media file error:%s", r0.getMessage());
        com.huawei.hms.ads.ex.I(ia.a.I, "set media file error:".concat(r0.getClass().getSimpleName()));
        r13.f29366p.c(r6);
        Code(0, -1, -1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.a.g():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ex.V(I, "prepareInternal - current state: %s - agent: %s", this.f29366p, this);
        if (this.f29366p.b(ia.d.END)) {
            return;
        }
        ex.V(I, "prepareInternal - current state after set file: %s", this.f29366p);
        if (this.f29366p.b(ia.d.INITIALIZED)) {
            this.f29363l = true;
            V(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l() {
        MediaPlayer mediaPlayer;
        int duration;
        if (this.f29366p.b(ia.d.END)) {
            return 0;
        }
        int m10 = m();
        if (!this.f29366p.a() || this.f29362k) {
            return m10;
        }
        try {
            synchronized (this.f29367q) {
                mediaPlayer = this.D;
            }
            return (mediaPlayer == null || (duration = mediaPlayer.getDuration()) <= 0) ? m10 : duration;
        } catch (IllegalStateException unused) {
            ex.I(I, "getDuration IllegalStateException");
            return m10;
        }
    }

    private int m() {
        int i10;
        synchronized (this.f29368r) {
            i10 = this.f29365n;
        }
        return i10;
    }

    private Surface o() {
        WeakReference<Surface> weakReference = this.E;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static /* synthetic */ int p(a aVar) {
        int i10 = aVar.f29370t;
        aVar.f29370t = i10 + 1;
        return i10;
    }

    private void t() {
        CopyOnWriteArraySet<fj> copyOnWriteArraySet = this.T;
        if (copyOnWriteArraySet == null || copyOnWriteArraySet.size() == 0) {
            return;
        }
        ex.V(I, "notify player release");
        gb.w.b(new j());
    }

    private void w() {
        if (!this.y) {
            ex.V(I, "already unmuted, don't notify");
            return;
        }
        ex.V(I, "notifyUnmute");
        this.y = false;
        gb.w.b(new s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        F(this.f29358g);
        if (this.K.size() > 0) {
            V(this.f29357ad);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.media.MediaPlayer, android.media.MediaPlayer$OnVideoSizeChangedListener] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void y() {
        synchronized (this.f29367q) {
            ia.b bVar = this.f29366p;
            ia.d dVar = ia.d.END;
            if (bVar.b(dVar)) {
                return;
            }
            this.f29366p.c(dVar);
            ex.V(I, "release - agent: %s", this);
            V.d();
            z();
            MediaPlayer mediaPlayer = this.D;
            if (mediaPlayer != null) {
                ?? r22 = 0;
                try {
                    try {
                        mediaPlayer.setSurface(null);
                        this.D.setOnVideoSizeChangedListener(null);
                        this.D.release();
                        this.D = null;
                        ex.V(I, "release media player");
                        r22 = "release media player";
                    } catch (Throwable th) {
                        this.D.setOnVideoSizeChangedListener(r22);
                        this.D.release();
                        this.D = r22;
                        ex.V(I, "release media player");
                        t();
                        throw th;
                    }
                } catch (IllegalStateException unused) {
                    ex.I(I, "media player reset surface IllegalStateException");
                    this.D.setOnVideoSizeChangedListener(null);
                    this.D.release();
                    this.D = null;
                    ex.V(I, "release media player");
                    r22 = "release media player";
                }
                t();
            }
            this.K.clear();
            this.M.clear();
            this.N.clear();
            this.O.clear();
        }
    }

    public int B() {
        MediaPlayer mediaPlayer;
        if (!this.f29366p.b(ia.d.END) && !this.f29366p.b(ia.d.ERROR) && !this.f29366p.b(ia.d.IDLE)) {
            try {
                synchronized (this.f29367q) {
                    mediaPlayer = this.D;
                }
                if (mediaPlayer != null) {
                    return mediaPlayer.getCurrentPosition();
                }
            } catch (IllegalStateException unused) {
                ex.I(I, "getCurrentPlayPosition IllegalStateException");
            }
        }
        return 0;
    }

    public String F() {
        return this.f29359h;
    }

    public void I() {
        V(new j0());
    }

    public void L() {
        V(new b());
    }

    public void a() {
        synchronized (this.f29369s) {
            int i10 = this.f - 1;
            this.f = i10;
            if (i10 < 0) {
                this.f = 0;
            }
            if (ex.Code()) {
                ex.Code(I, "release - instanceRefCount: %d - agent: %s", Integer.valueOf(this.f), this);
            }
            if (this.f == 0) {
                V(new x());
            }
        }
    }

    public void c() {
        synchronized (this.f29369s) {
            this.f++;
            if (ex.Code()) {
                ex.Code(I, "acquire - instanceRefCount: %d - agent: %s", Integer.valueOf(this.f), this);
            }
        }
    }

    public int d() {
        int i10;
        synchronized (this.f29369s) {
            i10 = this.f;
        }
        return i10;
    }

    public void e() {
        V(new b0());
    }

    public void finalize() {
        super.finalize();
        V(new y());
    }

    public String toString() {
        return "MediaPlayerAgent@" + Integer.toHexString(hashCode()) + " [" + androidx.transition.n.e(this.f29359h) + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i10) {
        ex.V(I, "notifyMediaCompletion playTime: %d", Integer.valueOf(i10));
        e();
        gb.w.b(new f(i10));
    }

    private void F(int i10) {
        ex.V(I, "notifyMediaStop playTime: %d", Integer.valueOf(i10));
        e();
        gb.w.b(new n(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(int i10) {
        ex.V(I, "notifyDurationReady: %d", Integer.valueOf(i10));
        gb.w.b(new t(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        ex.V(I, "notifyVideoPictureNotPlaying");
        if (i10 < -10000) {
            int i11 = this.G;
            if (i11 < 20) {
                this.G = i11 + 1;
                Code();
                V();
            } else {
                Code();
                this.f29354aa.onError(f(), C, i10);
            }
        }
        gb.w.b(new u(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f29366p.b(ia.d.END)) {
            return;
        }
        ia.b bVar = this.f29366p;
        ia.d dVar = ia.d.ERROR;
        if (bVar.b(dVar) || this.f29366p.b(ia.d.IDLE)) {
            return;
        }
        if (this.f29366p.a() || this.f29366p.b(ia.d.PREPARING)) {
            try {
                MediaPlayer f10 = f();
                int currentPosition = f10.getCurrentPosition();
                if (this.f29366p.a() && !this.f29362k) {
                    f10.stop();
                }
                if (this.f29366p.b(ia.d.PLAYBACK_COMPLETED)) {
                    currentPosition = 0;
                }
                F(currentPosition);
                Code(0, 0);
                this.f29366p.c(ia.d.INITIALIZED);
            } catch (IllegalStateException unused) {
                ex.I(I, "stop IllegalStateException");
                this.f29366p.c(dVar);
            }
        }
        this.f29364m = 0;
        this.f29370t = 0;
        u();
        F(this.f29358g);
        ex.V(I, "stop - agent: %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ex.V(I, "pauseInternal before State: %s - agent: %s", this.f29366p, this);
        this.f29372v = false;
        if (k()) {
            return;
        }
        try {
            MediaPlayer f10 = f();
            if (f10.isPlaying()) {
                f10.pause();
            }
            this.f29366p.c(ia.d.PAUSED);
            D(f10.getCurrentPosition());
        } catch (IllegalStateException unused) {
            ex.I(I, "pause IllegalStateException");
            this.f29366p.c(ia.d.ERROR);
        }
        u();
        F(this.f29358g);
        ex.V(I, com.anythink.expressad.foundation.d.c.f9459cb);
    }

    private boolean k() {
        return this.f29366p.b(ia.d.END) || this.f29366p.b(ia.d.ERROR) || this.f29366p.b(ia.d.PAUSED) || this.f29366p.b(ia.d.INITIALIZED) || this.f29366p.b(ia.d.IDLE) || this.f29366p.b(ia.d.PLAYBACK_COMPLETED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        MediaPlayer mediaPlayer;
        if (!this.f29366p.a()) {
            return false;
        }
        try {
            synchronized (this.f29367q) {
                mediaPlayer = this.D;
            }
            if (mediaPlayer != null) {
                return mediaPlayer.isPlaying();
            }
            return false;
        } catch (IllegalStateException unused) {
            ex.I(I, "isPlaying IllegalStateException");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.f29373w = false;
        if (I(gl.Code)) {
            v();
        }
        if (this.f29375z == 1 && n()) {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.f29373w = false;
        if (I(1.0f)) {
            w();
        }
        if (this.f29375z == 1 && n()) {
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (!this.f29361j && this.f29360i && this.M.size() > 0) {
            if (this.f29366p.b(ia.d.PLAYING) || this.f29366p.b(ia.d.PREPARING)) {
                ex.V(I, "notifyBufferingStart currentState: %s", this.f29366p);
                this.f29361j = true;
                gb.w.b(new h());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        CopyOnWriteArraySet<fm> copyOnWriteArraySet = this.R;
        if (copyOnWriteArraySet == null || copyOnWriteArraySet.size() == 0) {
            return;
        }
        ex.V(I, "notifyRenderStart");
        gb.w.b(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.f29361j && this.f29360i) {
            this.f29361j = false;
            ex.V(I, "notifyBufferingEnd currentState: %s", this.f29366p);
            gb.w.b(new l());
        }
    }

    private void v() {
        if (this.y) {
            ex.V(I, "already muted, don't notify");
            return;
        }
        ex.V(I, "notifyMute");
        this.y = true;
        gb.w.b(new r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        synchronized (this.f29367q) {
            ex.V(I, "resetInternal - agent: %s", this);
            try {
                if (this.D != null) {
                    if (this.f29366p.a()) {
                        int currentPosition = this.D.getCurrentPosition();
                        this.D.stop();
                        if (this.f29366p.b(ia.d.PLAYBACK_COMPLETED)) {
                            currentPosition = 0;
                        }
                        F(currentPosition);
                        Code(0, 0);
                        C(0);
                    }
                    this.D.reset();
                }
            } catch (IllegalStateException unused) {
                ex.I(I, "media player reset IllegalStateException");
            } catch (Throwable th) {
                ex.I(I, "media player reset exception: %s", th.getClass().getSimpleName());
            }
            this.f29364m = 0;
            this.f29370t = 0;
            this.f29362k = false;
            this.f29373w = false;
            this.f29372v = false;
            this.f29374x = 0;
            this.G = 0;
            this.f29366p.c(ia.d.IDLE);
            u();
            F(this.f29358g);
        }
    }

    public ia.b C() {
        return this.f29366p;
    }

    public void Code() {
        V(new v());
    }

    public void D() {
        V(new RunnableC0399a());
    }

    public void I(int i10) {
        ex.Code(I, "setPreferStartPlayTime %s", Integer.valueOf(i10));
        this.o = i10;
    }

    public void V() {
        V(new h0());
    }

    public void Z() {
        V(new k0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(int i10) {
        if (this.f29360i) {
            gb.w.b(new g(i10));
        }
    }

    private void D(int i10) {
        ex.V(I, "notifyMediaPause playTime: %d", Integer.valueOf(i10));
        gb.w.b(new p(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i10) {
        ex.V(I, "notifyMediaStart playTime: %d", Integer.valueOf(i10));
        A();
        gb.w.b(new m(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(float f10) {
        this.f29373w = false;
        if (I(f10)) {
            w();
        }
        if (this.f29375z == 1 && n()) {
            A();
        }
    }

    public void Code(float f10) {
        V(new d(f10));
    }

    public void I(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (onVideoSizeChangedListener == null) {
            return;
        }
        this.Q.remove(onVideoSizeChangedListener);
    }

    public void V(float f10) {
        V(new d0(f10));
    }

    public void b() {
        V(new z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(String str) {
        q0 q0Var = V;
        if (q0Var.e()) {
            gb.n0 a10 = q0Var.a();
            if (a10 != null) {
                Handler handler = a10.f28607a;
                if (handler == null || str == null) {
                    return;
                }
                handler.removeCallbacksAndMessages(str);
                return;
            }
            gb.c0.b(new gb.p0(q0Var, new q0.a(2, null, str, 0L)), c0.a.SEQUENCE);
        }
    }

    private void S(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        MediaPlayer f10 = f();
        if (Uri.parse(str).getScheme() != null) {
            bw bwVar = bw.FILE;
            if (str.startsWith(bwVar.toString())) {
                str = str.substring(bwVar.toString().length());
            } else {
                if (str.startsWith(bw.CONTENT.toString())) {
                    if (!Code(str, f10)) {
                        ex.I(I, "set remote media fail");
                        throw new dr();
                    }
                    f10.setVideoScalingMode(1);
                    this.f29366p.c(ia.d.INITIALIZED);
                }
                if (str.startsWith(bw.HTTP.toString()) || str.startsWith(bw.HTTPS.toString())) {
                    this.f29360i = true;
                }
            }
        }
        f10.setDataSource(str);
        f10.setVideoScalingMode(1);
        this.f29366p.c(ia.d.INITIALIZED);
    }

    public void Code(int i10) {
        V(i10, 0);
    }

    public void I(fj fjVar) {
        if (fjVar == null) {
            return;
        }
        this.T.remove(fjVar);
    }

    public void V(int i10) {
        synchronized (this.f29368r) {
            this.f29365n = i10;
        }
    }

    public void Z(int i10) {
        this.f29375z = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(String str) {
        if (this.f29366p.b(ia.d.END)) {
            return;
        }
        ex.Code(I, "setMediaFileUrl: %s", androidx.transition.n.e(str));
        MediaPlayer f10 = f();
        try {
            if (this.f29366p.a()) {
                f10.stop();
            }
        } catch (IllegalStateException unused) {
            ex.I(I, "setMediaFileUrl stop IllegalStateException");
        } catch (Throwable th) {
            ex.I(I, "setMediaFileUrl exception: %s", th.getClass().getSimpleName());
        }
        try {
            f10.reset();
            this.f29366p.c(ia.d.IDLE);
        } catch (Throwable th2) {
            ex.I(I, "mediaPlayer reset exception: %s", th2.getClass().getSimpleName());
        }
        this.G = 0;
        this.f29359h = str;
        boolean isEmpty = TextUtils.isEmpty(str);
        ia.d dVar = ia.d.ERROR;
        if (isEmpty) {
            ex.I(I, "media file url is empty");
            this.f29366p.c(dVar);
            throw new dr("media file url is empty");
        }
        try {
            S(str);
        } catch (Exception unused2) {
            ex.I(I, "setMediaFileUrl Exception");
            this.f29366p.c(dVar);
            throw new dr("setMediaFileUrl Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(int i10, int i11) {
        gb.w.b(new e(i10, i11));
    }

    public void I(fm fmVar) {
        if (fmVar == null) {
            return;
        }
        this.R.remove(fmVar);
    }

    public boolean S() {
        if (this.f29366p.b(ia.d.END)) {
            return false;
        }
        Callable<Boolean> callable = this.f29356ac;
        Boolean valueOf = Boolean.valueOf(this.f29366p.b(ia.d.PLAYING));
        int i10 = gb.q.f28612a;
        return ((Boolean) gb.q.b(callable, valueOf, 300L, TimeUnit.MILLISECONDS)).booleanValue();
    }

    public void V(int i10, int i11) {
        MediaPlayer mediaPlayer;
        try {
            if (!this.f29366p.a() || this.f29362k) {
                return;
            }
            synchronized (this.f29367q) {
                mediaPlayer = this.D;
            }
            int l10 = (l() * i10) / 100;
            V(mediaPlayer, l10, i11);
            Code(i10, l10);
        } catch (IllegalStateException unused) {
            ex.I(I, "seekTo IllegalStateException");
        }
    }

    public void Z(String str) {
        V(new o0(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(int i10, int i11, int i12) {
        ex.V(I, "notifyError playTime: %d", Integer.valueOf(i10));
        e();
        gb.w.b(new q(i10, i11, i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(long j10, int i10) {
        MediaPlayer mediaPlayer;
        try {
            ex.V(I, "seekToMillis " + j10);
            if (this.f29366p.a()) {
                synchronized (this.f29367q) {
                    mediaPlayer = this.D;
                }
                V(mediaPlayer, j10, i10);
                long l10 = l();
                if (l10 > 0) {
                    Code((int) ((100 * j10) / l10), (int) j10);
                }
            }
        } catch (IllegalStateException unused) {
            ex.I(I, "seekTo IllegalStateException");
        }
    }

    public void Code(long j10, int i10) {
        V(new m0(j10, i10));
    }

    public void I(String str) {
        V(new l0(str));
    }

    public void V(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (onVideoSizeChangedListener == null) {
            return;
        }
        this.Q.add(onVideoSizeChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I(float f10) {
        if (this.f29366p.b(ia.d.END)) {
            return false;
        }
        try {
            f().setVolume(f10, f10);
            return true;
        } catch (IllegalStateException unused) {
            ex.I(I, "mute IllegalStateException");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void V(MediaPlayer mediaPlayer, long j10, int i10) {
        if (mediaPlayer != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                mediaPlayer.seekTo(j10, i10);
            } else {
                mediaPlayer.seekTo((int) j10);
            }
        }
    }

    public void Code(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        V(onVideoSizeChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(MediaPlayer mediaPlayer, int i10, int i11) {
        Iterator<MediaPlayer.OnVideoSizeChangedListener> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(mediaPlayer, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(Surface surface) {
        String str;
        if (this.f29366p.b(ia.d.END)) {
            return;
        }
        if (surface != null && !surface.isValid()) {
            ex.I(I, "setSurfaceInternal - surface is invalid");
            return;
        }
        if (surface == o()) {
            ex.V(I, "setSurfaceInternal - pass-in surface is the same as currentSurface");
            return;
        }
        this.E = new WeakReference<>(surface);
        try {
            ex.V(I, "setSurfaceInternal");
            f().setSurface(surface);
        } catch (IllegalArgumentException unused) {
            str = "setSurface IllegalArgumentException";
            ex.I(I, str);
        } catch (IllegalStateException unused2) {
            str = "setSurface IllegalStateException";
            ex.I(I, str);
        }
    }

    public void V(fg fgVar) {
        if (fgVar == null) {
            return;
        }
        this.M.remove(fgVar);
    }

    public void Code(Surface surface) {
        V(new p0(surface));
    }

    public void V(fh fhVar) {
        if (fhVar == null) {
            return;
        }
        this.N.remove(fhVar);
    }

    public void Code(fg fgVar) {
        if (fgVar == null) {
            return;
        }
        this.M.add(fgVar);
    }

    public void V(fi fiVar) {
        if (fiVar == null) {
            return;
        }
        this.P.remove(fiVar);
    }

    public void Code(fh fhVar) {
        if (fhVar == null) {
            return;
        }
        this.N.add(fhVar);
    }

    public void V(fj fjVar) {
        if (fjVar == null) {
            return;
        }
        this.T.add(fjVar);
    }

    public void Code(fi fiVar) {
        if (fiVar == null) {
            return;
        }
        this.P.add(fiVar);
    }

    public void V(fk fkVar) {
        if (fkVar == null) {
            return;
        }
        this.K.remove(fkVar);
    }

    public void Code(fj fjVar) {
        V(fjVar);
    }

    public void V(fl flVar) {
        if (flVar == null) {
            return;
        }
        this.O.remove(flVar);
    }

    public void Code(fk fkVar) {
        if (fkVar == null) {
            return;
        }
        this.K.add(fkVar);
    }

    public void V(fm fmVar) {
        if (fmVar == null) {
            return;
        }
        this.R.add(fmVar);
    }

    public void Code(fl flVar) {
        if (flVar == null) {
            return;
        }
        this.O.add(flVar);
    }

    public void Code(fm fmVar) {
        V(fmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void V(Runnable runnable) {
        V.c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void V(Runnable runnable, String str, long j10) {
        q0 q0Var = V;
        if (q0Var.e()) {
            gb.n0 a10 = q0Var.a();
            if (a10 != null) {
                a10.a(runnable, str, j10);
            } else {
                gb.c0.b(new gb.p0(q0Var, new q0.a(1, runnable, str, j10)), c0.a.SEQUENCE);
            }
        }
    }

    public void V(String str) {
        V(new g0(str));
    }

    private void V(boolean z10) {
        if (this.f29366p.b(ia.d.END)) {
            return;
        }
        try {
            ex.V(I, "prepareMediaPlayer");
            this.f29366p.c(ia.d.PREPARING);
            this.f29362k = true;
            f().prepareAsync();
            if (z10) {
                r();
            }
        } catch (IllegalStateException unused) {
            ex.I(I, "prepareMediaPlayer IllegalStateException");
            this.f29366p.c(ia.d.ERROR);
            Code(0, -1, -1);
        }
    }

    public void Code(String str) {
        V(new i0(str));
    }

    public void Code(boolean z10) {
        this.H = z10;
    }

    public boolean Code(String str, MediaPlayer mediaPlayer) {
        AssetFileDescriptor openTypedAssetFileDescriptor = this.J.getContentResolver().openTypedAssetFileDescriptor(Uri.parse(str), "*/*", null);
        if (openTypedAssetFileDescriptor == null) {
            androidx.transition.n.g(openTypedAssetFileDescriptor);
            return false;
        }
        try {
            if (openTypedAssetFileDescriptor.getDeclaredLength() < 0) {
                mediaPlayer.setDataSource(openTypedAssetFileDescriptor.getFileDescriptor());
            } else {
                mediaPlayer.setDataSource(openTypedAssetFileDescriptor.getFileDescriptor(), openTypedAssetFileDescriptor.getStartOffset(), openTypedAssetFileDescriptor.getDeclaredLength());
            }
            androidx.transition.n.g(openTypedAssetFileDescriptor);
            return true;
        } catch (Throwable th) {
            androidx.transition.n.g(openTypedAssetFileDescriptor);
            throw th;
        }
    }
}
