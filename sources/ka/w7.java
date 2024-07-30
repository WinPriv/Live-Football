package ka;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.huawei.hms.ads.gl;
import com.vungle.warren.model.Advertisement;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import ka.r8;

/* loaded from: classes2.dex */
public final class w7 {
    public static final com.huawei.openalliance.ad.ppskit.utils.c0 R = new com.huawei.openalliance.ad.ppskit.utils.c0("PPS-thread_media_player_ctrl");
    public final Context B;
    public MediaPlayer.OnVideoSizeChangedListener I;

    /* renamed from: a, reason: collision with root package name */
    public MediaPlayer f32076a;

    /* renamed from: d, reason: collision with root package name */
    public volatile String f32079d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32080e;

    /* renamed from: j, reason: collision with root package name */
    public int f32084j;

    /* renamed from: l, reason: collision with root package name */
    public int f32086l;

    /* renamed from: r, reason: collision with root package name */
    public final AudioManager f32091r;

    /* renamed from: x, reason: collision with root package name */
    public Object f32097x;
    public WeakReference<Surface> y;

    /* renamed from: z, reason: collision with root package name */
    public int f32098z;

    /* renamed from: b, reason: collision with root package name */
    public int f32077b = 0;
    public boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32081g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32082h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f32083i = 0;

    /* renamed from: k, reason: collision with root package name */
    public String f32085k = "normal";

    /* renamed from: m, reason: collision with root package name */
    public final r8 f32087m = new r8();

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f32088n = new byte[0];
    public final byte[] o = new byte[0];

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f32089p = new byte[0];

    /* renamed from: q, reason: collision with root package name */
    public int f32090q = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f32092s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f32093t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f32094u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f32095v = false;

    /* renamed from: w, reason: collision with root package name */
    public volatile int f32096w = 0;
    public boolean A = false;
    public final CopyOnWriteArraySet<h9> C = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<e9> D = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<f9> E = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<i9> F = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<g9> G = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<j9> H = new CopyOnWriteArraySet<>();
    public final e J = new e();
    public final a K = new a();
    public final h L = new h();
    public final n M = new n();
    public final p N = new p();
    public final q O = new q();
    public final j P = new j();
    public final o Q = new o();

    /* renamed from: c, reason: collision with root package name */
    public final String f32078c = "progress_task" + hashCode();

    /* loaded from: classes2.dex */
    public class a implements MediaPlayer.OnInfoListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            n7.f("MediaPlayerAgent", "onInfo what: %d extra: %d", Integer.valueOf(i10), Integer.valueOf(i11));
            w7 w7Var = w7.this;
            if (i10 != 3) {
                if (i10 != 701) {
                    if (i10 != 702) {
                        if (i10 == 804 || i10 == 805) {
                            w7Var.getClass();
                            n7.e("MediaPlayerAgent", "notifyVideoPictureNotPlaying");
                            if (i11 < -10000 || i11 == -1004) {
                                int i12 = w7Var.f32098z;
                                if (i12 < 20) {
                                    w7Var.f32098z = i12 + 1;
                                    w7.k(new m8(w7Var, false));
                                    w7.k(new i8(w7Var));
                                } else {
                                    w7.k(new m8(w7Var, true));
                                    w7Var.M.onError(w7Var.E(), i10, i11);
                                }
                            }
                            com.huawei.openalliance.ad.ppskit.utils.d2.a(new f8(w7Var, i11));
                        }
                    }
                } else {
                    w7Var.a();
                }
                return true;
            }
            w7Var.getClass();
            n7.e("MediaPlayerAgent", "notifyRenderStart");
            com.huawei.openalliance.ad.ppskit.utils.d2.a(new a8(w7Var));
            w7Var.b();
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f32100s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f32101t;

        public b(int i10, int i11) {
            this.f32100s = i10;
            this.f32101t = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<h9> it = w7.this.C.iterator();
            while (it.hasNext()) {
                h9 next = it.next();
                if (next != null) {
                    next.a(this.f32100s, this.f32101t);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<e9> it = w7.this.D.iterator();
            while (it.hasNext()) {
                e9 next = it.next();
                if (next != null) {
                    next.a();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<e9> it = w7.this.D.iterator();
            while (it.hasNext()) {
                e9 next = it.next();
                if (next != null) {
                    next.b();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements MediaPlayer.OnCompletionListener {
        public e() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            w7 w7Var = w7.this;
            if (!w7Var.f32087m.b(r8.b.ERROR)) {
                r8 r8Var = w7Var.f32087m;
                r8.b bVar = r8.b.PLAYBACK_COMPLETED;
                if (!r8Var.b(bVar)) {
                    w7Var.f32087m.d(bVar);
                    int currentPosition = mediaPlayer.getCurrentPosition();
                    int H = w7Var.H();
                    n7.e("MediaPlayerAgent", "onCompletion " + currentPosition + " duration: " + H);
                    int max = Math.max(currentPosition, H);
                    w7Var.j(100, max);
                    w7Var.getClass();
                    n7.f("MediaPlayerAgent", "notifyMediaCompletion playTime: %d", Integer.valueOf(max));
                    w7Var.C();
                    com.huawei.openalliance.ad.ppskit.utils.d2.a(new y7(w7Var, max));
                    w7Var.b();
                    w7.w(w7Var.f32078c);
                    w7Var.f32083i = 0;
                    w7Var.f32090q = 0;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f32106s;

        public f(int i10) {
            this.f32106s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            w7 w7Var = w7.this;
            Iterator<h9> it = w7Var.C.iterator();
            while (it.hasNext()) {
                h9 next = it.next();
                if (next != null) {
                    next.j(w7Var, this.f32106s);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f32108s;

        public g(int i10) {
            this.f32108s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            w7 w7Var = w7.this;
            Iterator<h9> it = w7Var.C.iterator();
            while (it.hasNext()) {
                h9 next = it.next();
                if (next != null) {
                    next.o(w7Var, this.f32108s);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements MediaPlayer.OnPreparedListener {
        public h() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            n7.e("MediaPlayerAgent", "onPrepared");
            w7 w7Var = w7.this;
            w7Var.f32081g = false;
            boolean z10 = w7Var.f32082h;
            r8.b bVar = r8.b.PREPARED;
            r8 r8Var = w7Var.f32087m;
            if (!z10 && !r8Var.c(r8.b.PREPARING)) {
                try {
                    mediaPlayer.setOnInfoListener(w7Var.K);
                    r8Var.d(bVar);
                    mediaPlayer.start();
                    if (Build.VERSION.SDK_INT >= 26) {
                        mediaPlayer.seekTo(w7Var.f32086l, 3);
                    } else {
                        mediaPlayer.seekTo(w7Var.f32086l);
                    }
                    r8Var.d(r8.b.PLAYING);
                    if (n7.d()) {
                        n7.c("MediaPlayerAgent", "seek to prefer pos: %d", Integer.valueOf(w7Var.f32086l));
                    }
                    w7Var.s(mediaPlayer.getCurrentPosition());
                    w7.o(w7Var, w7Var.H());
                    w7Var.d();
                    return;
                } catch (IllegalStateException unused) {
                    n7.g("MediaPlayerAgent", "onPrepared - IllegalStateException");
                    r8Var.d(r8.b.ERROR);
                    w7Var.h(0, -1, -1);
                    return;
                }
            }
            r8Var.d(bVar);
            w7.o(w7Var, w7Var.H());
        }
    }

    /* loaded from: classes2.dex */
    public class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f32111s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f32112t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f32113u;

        public i(int i10, int i11, int i12) {
            this.f32111s = i10;
            this.f32112t = i11;
            this.f32113u = i12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            w7 w7Var = w7.this;
            Iterator<f9> it = w7Var.E.iterator();
            while (it.hasNext()) {
                f9 next = it.next();
                if (next != null) {
                    next.g(w7Var, this.f32111s, this.f32112t, this.f32113u);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int H;
            w7 w7Var = w7.this;
            w7.w(w7Var.f32078c);
            r8.b bVar = r8.b.PREPARING;
            r8 r8Var = w7Var.f32087m;
            if (r8Var.c(bVar) && r8Var.c(r8.b.PLAYING) && r8Var.c(r8.b.PREPARED)) {
                return;
            }
            int r10 = w7Var.r();
            if (w7Var.C.size() > 0 && (H = w7Var.H()) > 0) {
                int ceil = (int) Math.ceil((r10 * 100.0f) / H);
                if (ceil > 100) {
                    ceil = 100;
                }
                w7Var.j(ceil, r10);
                if (r10 >= H) {
                    int i10 = w7Var.f32090q + 1;
                    w7Var.f32090q = i10;
                    if (i10 > 2) {
                        n7.e("MediaPlayerAgent", "reach end count exceeds");
                        w7Var.J.onCompletion(w7Var.E());
                        return;
                    }
                }
            }
            if (w7Var.f32080e && w7Var.D.size() > 0 && w7Var.f32090q == 0) {
                if (Math.abs(r10 - w7Var.f32083i) < 100) {
                    w7Var.a();
                } else {
                    w7Var.b();
                    w7Var.f32083i = r10;
                }
            }
            w7.R.c(w7Var.P, w7Var.f32078c, 200L);
        }
    }

    /* loaded from: classes2.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            w7.c(w7.this);
        }
    }

    /* loaded from: classes2.dex */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            w7.c(w7.this);
        }
    }

    /* loaded from: classes2.dex */
    public class m implements Runnable {
        public m() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            String concat;
            w7 w7Var = w7.this;
            w7Var.getClass();
            try {
                try {
                    n7.e("MediaPlayerAgent", "abandonAudioFocus");
                    int i10 = Build.VERSION.SDK_INT;
                    AudioManager audioManager = w7Var.f32091r;
                    if (i10 < 26) {
                        audioManager.abandonAudioFocus(w7Var.Q);
                    } else {
                        Object obj = w7Var.f32097x;
                        if (obj instanceof AudioFocusRequest) {
                            audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
                        }
                        w7Var.f32097x = null;
                    }
                } catch (IllegalStateException unused) {
                    concat = "abandonAudioFocus IllegalStateException";
                    n7.g("MediaPlayerAgent", concat);
                } catch (Exception e10) {
                    concat = "abandonAudioFocus ".concat(e10.getClass().getSimpleName());
                    n7.g("MediaPlayerAgent", concat);
                }
            } finally {
                w7Var.f32093t = false;
                w7Var.f32092s = false;
                w7Var.f32094u = 0;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class n implements MediaPlayer.OnErrorListener {
        public n() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            w7 w7Var = w7.this;
            n7.h("MediaPlayerAgent", "onError - what: %d extra: %d currentState: %s - agent: %s", Integer.valueOf(i10), Integer.valueOf(i11), w7Var.f32087m, w7Var);
            w7Var.b();
            r8 r8Var = w7Var.f32087m;
            r8.b bVar = r8.b.ERROR;
            if (r8Var.b(bVar)) {
                return true;
            }
            w7Var.f32087m.d(bVar);
            w7Var.h(mediaPlayer.getCurrentPosition(), i10, i11);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class o implements AudioManager.OnAudioFocusChangeListener {

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f32121s;

            public a(int i10) {
                this.f32121s = i10;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r1.f32093t != false) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
            
                ka.w7.G(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
            
                if (r1.f32093t != false) goto L23;
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
                    int r2 = r10.f32121s
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    r4 = 0
                    r1[r4] = r3
                    ka.w7$o r3 = ka.w7.o.this
                    ka.w7 r5 = ka.w7.this
                    int r5 = r5.f32094u
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    r6 = 1
                    r1[r6] = r5
                    java.lang.String r5 = "onAudioFocusChange %d previous: %d"
                    java.lang.String r7 = "MediaPlayerAgent"
                    ka.n7.f(r7, r5, r1)
                    ka.w7 r1 = ka.w7.this
                    r5 = -3
                    if (r2 == r5) goto L9c
                    r8 = -2
                    if (r2 == r8) goto L68
                    r9 = -1
                    if (r2 == r9) goto L68
                    if (r2 == r6) goto L31
                    if (r2 == r0) goto L31
                    goto L9f
                L31:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r3 = "handleAudioFocusGain - muteOnlyOnLostAudioFocus: "
                    r0.<init>(r3)
                    boolean r3 = r1.A
                    r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    ka.n7.e(r7, r0)
                    boolean r0 = r1.A
                    if (r0 == 0) goto L4d
                    boolean r0 = r1.f32093t
                    if (r0 == 0) goto L9f
                    goto L5a
                L4d:
                    int r0 = r1.f32094u
                    if (r0 == r8) goto L5e
                    if (r0 != r9) goto L54
                    goto L5e
                L54:
                    if (r0 != r5) goto L9f
                    boolean r0 = r1.f32093t
                    if (r0 == 0) goto L9f
                L5a:
                    ka.w7.G(r1)
                    goto L9f
                L5e:
                    boolean r0 = r1.f32092s
                    if (r0 == 0) goto L9f
                    ka.w7.A(r1)
                    r1.f32092s = r4
                    goto L9f
                L68:
                    boolean r0 = r1.A
                    if (r0 == 0) goto L83
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r4 = "handleAudioFocusLoss muteOnlyOnLostAudioFocus: "
                    r0.<init>(r4)
                    boolean r4 = r1.A
                    r0.append(r4)
                    java.lang.String r0 = r0.toString()
                    ka.n7.e(r7, r0)
                    r3.a()
                    goto L9f
                L83:
                    boolean r0 = r1.I()
                    java.lang.Object[] r3 = new java.lang.Object[r6]
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
                    r3[r4] = r5
                    java.lang.String r4 = "handleAudioFocusLoss isPlaying: %s"
                    ka.n7.f(r7, r4, r3)
                    if (r0 == 0) goto L9f
                    r1.q()
                    r1.f32092s = r6
                    goto L9f
                L9c:
                    r3.a()
                L9f:
                    r1.f32094u = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ka.w7.o.a.run():void");
            }
        }

        public o() {
        }

        public final void a() {
            StringBuilder sb2 = new StringBuilder("handleAudioFocusLossTransientCanDuck soundMuted: ");
            w7 w7Var = w7.this;
            sb2.append(w7Var.f32095v);
            n7.e("MediaPlayerAgent", sb2.toString());
            if (!w7Var.f32095v) {
                w7.F(w7Var);
                w7Var.f32093t = true;
            }
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i10) {
            w7.k(new a(i10));
        }
    }

    /* loaded from: classes2.dex */
    public class p implements MediaPlayer.OnBufferingUpdateListener {
        public p() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            w7 w7Var = w7.this;
            if (w7Var.f32087m.a()) {
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 > 100) {
                    i10 = 100;
                }
                if (w7Var.f32080e) {
                    com.huawei.openalliance.ad.ppskit.utils.d2.a(new z7(w7Var, i10));
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class q implements Callable<Boolean> {
        public q() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() {
            return Boolean.valueOf(w7.this.I());
        }
    }

    /* loaded from: classes2.dex */
    public class r implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Surface f32125s;

        public r(Surface surface) {
            this.f32125s = surface;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Surface surface;
            String str;
            r8.b bVar = r8.b.END;
            w7 w7Var = w7.this;
            if (!w7Var.f32087m.b(bVar)) {
                Surface surface2 = this.f32125s;
                if (surface2 != null && !surface2.isValid()) {
                    str = "setSurfaceInternal - surface is invalid";
                } else {
                    WeakReference<Surface> weakReference = w7Var.y;
                    if (weakReference == null) {
                        surface = null;
                    } else {
                        surface = weakReference.get();
                    }
                    if (surface2 == surface) {
                        n7.e("MediaPlayerAgent", "setSurfaceInternal - pass-in surface is the same as currentSurface");
                        return;
                    }
                    w7Var.y = new WeakReference<>(surface2);
                    try {
                        n7.e("MediaPlayerAgent", "setSurfaceInternal");
                        w7Var.E().setSurface(surface2);
                        return;
                    } catch (IllegalArgumentException unused) {
                        str = "setSurface IllegalArgumentException";
                    } catch (IllegalStateException unused2) {
                        str = "setSurface IllegalStateException";
                    }
                }
                n7.g("MediaPlayerAgent", str);
            }
        }
    }

    public w7(Context context) {
        this.B = context.getApplicationContext();
        this.f32091r = (AudioManager) context.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
        R.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:15|(2:17|(6:23|24|(1:26)(1:31)|27|28|29))|33|34|(1:36)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        ka.n7.c("MediaPlayerAgent", "set media file error:%s", r0.getMessage());
        ka.n7.g("MediaPlayerAgent", "set media file error:".concat(ka.u5.class.getSimpleName()));
        r14.f32087m.d(r6);
        r14.h(0, -1, -1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A(ka.w7 r14) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.w7.A(ka.w7):void");
    }

    public static void D(w7 w7Var) {
        boolean z10;
        r8 r8Var = w7Var.f32087m;
        n7.f("MediaPlayerAgent", "pauseInternal before State: %s - agent: %s", r8Var, w7Var);
        w7Var.f32092s = false;
        boolean b10 = r8Var.b(r8.b.END);
        r8.b bVar = r8.b.PAUSED;
        r8.b bVar2 = r8.b.ERROR;
        if (!b10 && !r8Var.b(bVar2) && !r8Var.b(bVar) && !r8Var.b(r8.b.INITIALIZED) && !r8Var.b(r8.b.IDLE) && !r8Var.b(r8.b.PLAYBACK_COMPLETED)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            try {
                MediaPlayer E = w7Var.E();
                if (E.isPlaying()) {
                    E.pause();
                }
                r8Var.d(bVar);
                int currentPosition = E.getCurrentPosition();
                n7.f("MediaPlayerAgent", "notifyMediaPause playTime: %d", Integer.valueOf(currentPosition));
                com.huawei.openalliance.ad.ppskit.utils.d2.a(new b8(w7Var, currentPosition));
            } catch (IllegalStateException unused) {
                n7.g("MediaPlayerAgent", "pause IllegalStateException");
                r8Var.d(bVar2);
            }
            w7Var.b();
            w(w7Var.f32078c);
            n7.e("MediaPlayerAgent", com.anythink.expressad.foundation.d.c.f9459cb);
        }
    }

    public static void F(w7 w7Var) {
        w7Var.f32093t = false;
        if (w7Var.n(gl.Code)) {
            if (w7Var.f32095v) {
                n7.e("MediaPlayerAgent", "already muted, don't notify");
            } else {
                n7.e("MediaPlayerAgent", "notifyMute");
                w7Var.f32095v = true;
                com.huawei.openalliance.ad.ppskit.utils.d2.a(new c8(w7Var));
            }
        }
        if (w7Var.f32096w == 1 && w7Var.I()) {
            w7Var.C();
        }
    }

    public static void G(w7 w7Var) {
        w7Var.f32093t = false;
        if (w7Var.n(1.0f)) {
            if (!w7Var.f32095v) {
                n7.e("MediaPlayerAgent", "already unmuted, don't notify");
            } else {
                n7.e("MediaPlayerAgent", "notifyUnmute");
                w7Var.f32095v = false;
                com.huawei.openalliance.ad.ppskit.utils.d2.a(new d8(w7Var));
            }
        }
        if (w7Var.f32096w == 1 && w7Var.I()) {
            w7Var.f();
        }
    }

    public static void c(w7 w7Var) {
        String str;
        synchronized (w7Var.f32088n) {
            r8 r8Var = w7Var.f32087m;
            r8.b bVar = r8.b.END;
            if (!r8Var.b(bVar)) {
                w7Var.f32087m.d(bVar);
                n7.f("MediaPlayerAgent", "release - agent: %s", w7Var);
                R.e();
                w7Var.e();
                MediaPlayer mediaPlayer = w7Var.f32076a;
                try {
                    if (mediaPlayer != null) {
                        try {
                            mediaPlayer.setSurface(null);
                            w7Var.f32076a.setOnVideoSizeChangedListener(null);
                            w7Var.f32076a.release();
                            w7Var.f32076a = null;
                            str = "MediaPlayerAgent";
                        } catch (IllegalStateException unused) {
                            n7.g("MediaPlayerAgent", "media player reset surface IllegalStateException");
                            w7Var.f32076a.setOnVideoSizeChangedListener(null);
                            w7Var.f32076a.release();
                            w7Var.f32076a = null;
                            str = "MediaPlayerAgent";
                        }
                        n7.e(str, "release media player");
                    }
                    w7Var.C.clear();
                    w7Var.D.clear();
                    w7Var.E.clear();
                    w7Var.F.clear();
                    w7Var.I = null;
                } catch (Throwable th) {
                    w7Var.f32076a.setOnVideoSizeChangedListener(null);
                    w7Var.f32076a.release();
                    w7Var.f32076a = null;
                    n7.e("MediaPlayerAgent", "release media player");
                    throw th;
                }
            }
        }
    }

    public static void k(Runnable runnable) {
        R.b(runnable);
    }

    public static void o(w7 w7Var, int i10) {
        w7Var.getClass();
        n7.f("MediaPlayerAgent", "notifyDurationReady: %d", Integer.valueOf(i10));
        com.huawei.openalliance.ad.ppskit.utils.d2.a(new e8(w7Var, i10));
    }

    public static void w(String str) {
        R.d(str);
    }

    public final void B() {
        synchronized (this.f32089p) {
            this.f32077b++;
            if (n7.d()) {
                n7.c("MediaPlayerAgent", "acquire - instanceRefCount: %d - agent: %s", Integer.valueOf(this.f32077b), this);
            }
        }
    }

    public final void C() {
        k(new m());
    }

    public final MediaPlayer E() {
        MediaPlayer mediaPlayer;
        synchronized (this.f32088n) {
            if (this.f32076a == null) {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                mediaPlayer2.setOnCompletionListener(this.J);
                mediaPlayer2.setOnPreparedListener(this.L);
                mediaPlayer2.setOnErrorListener(this.M);
                mediaPlayer2.setOnBufferingUpdateListener(this.N);
                mediaPlayer2.setOnVideoSizeChangedListener(this.I);
                mediaPlayer2.setLooping(false);
                mediaPlayer2.setAudioStreamType(3);
                this.f32076a = mediaPlayer2;
            }
            mediaPlayer = this.f32076a;
        }
        return mediaPlayer;
    }

    public final int H() {
        int i10;
        MediaPlayer mediaPlayer;
        int duration;
        if (this.f32087m.b(r8.b.END)) {
            return 0;
        }
        synchronized (this.o) {
            i10 = this.f32084j;
        }
        if (this.f32087m.a() && !this.f32081g) {
            try {
                synchronized (this.f32088n) {
                    mediaPlayer = this.f32076a;
                }
                if (mediaPlayer != null && (duration = mediaPlayer.getDuration()) > 0) {
                    return duration;
                }
                return i10;
            } catch (IllegalStateException unused) {
                n7.g("MediaPlayerAgent", "getDuration IllegalStateException");
                return i10;
            }
        }
        return i10;
    }

    public final boolean I() {
        MediaPlayer mediaPlayer;
        if (this.f32087m.a()) {
            try {
                synchronized (this.f32088n) {
                    mediaPlayer = this.f32076a;
                }
                if (mediaPlayer != null) {
                    return mediaPlayer.isPlaying();
                }
                return false;
            } catch (IllegalStateException unused) {
                n7.g("MediaPlayerAgent", "isPlaying IllegalStateException");
                return false;
            }
        }
        return false;
    }

    public final void a() {
        if (!this.f && this.f32080e && this.D.size() > 0) {
            r8.b bVar = r8.b.PLAYING;
            r8 r8Var = this.f32087m;
            if (r8Var.b(bVar) || r8Var.b(r8.b.PREPARING)) {
                n7.f("MediaPlayerAgent", "notifyBufferingStart currentState: %s", r8Var);
                this.f = true;
                com.huawei.openalliance.ad.ppskit.utils.d2.a(new c());
            }
        }
    }

    public final void b() {
        if (this.f && this.f32080e) {
            this.f = false;
            n7.f("MediaPlayerAgent", "notifyBufferingEnd currentState: %s", this.f32087m);
            com.huawei.openalliance.ad.ppskit.utils.d2.a(new d());
        }
    }

    public final void d() {
        w(this.f32078c);
        if (this.C.size() > 0) {
            k(this.P);
        }
    }

    public final void e() {
        synchronized (this.f32088n) {
            n7.f("MediaPlayerAgent", "resetInternal - agent: %s", this);
            try {
                if (this.f32076a != null) {
                    if (this.f32087m.a()) {
                        int currentPosition = this.f32076a.getCurrentPosition();
                        this.f32076a.stop();
                        if (this.f32087m.b(r8.b.PLAYBACK_COMPLETED)) {
                            currentPosition = 0;
                        }
                        u(currentPosition);
                        j(0, 0);
                        if (this.f32080e) {
                            com.huawei.openalliance.ad.ppskit.utils.d2.a(new z7(this, 0));
                        }
                    }
                    this.f32076a.reset();
                }
            } catch (IllegalStateException unused) {
                n7.g("MediaPlayerAgent", "media player reset IllegalStateException");
            } catch (Throwable th) {
                n7.h("MediaPlayerAgent", "media player reset exception: %s", th.getClass().getSimpleName());
            }
            this.f32083i = 0;
            this.f32090q = 0;
            this.f32081g = false;
            this.f32093t = false;
            this.f32092s = false;
            this.f32094u = 0;
            this.f32098z = 0;
            this.f32087m.d(r8.b.IDLE);
            b();
            w(this.f32078c);
        }
    }

    public final void f() {
        String concat;
        boolean z10 = false;
        n7.f("MediaPlayerAgent", "isNeedAudioFocus type: %s soundMute: %s", Integer.valueOf(this.f32096w), Boolean.valueOf(this.f32095v));
        if (this.f32096w == 0 || (this.f32096w != 2 && (this.f32096w != 1 || !this.f32095v))) {
            z10 = true;
        }
        if (!z10) {
            n7.g("MediaPlayerAgent", "audio focus is not needed");
            return;
        }
        try {
            n7.e("MediaPlayerAgent", "requestAudioFocus");
            if (Build.VERSION.SDK_INT < 26) {
                this.f32091r.requestAudioFocus(this.Q, 3, 2);
            } else {
                AudioFocusRequest build = new AudioFocusRequest.Builder(2).setOnAudioFocusChangeListener(this.Q).build();
                this.f32097x = build;
                this.f32091r.requestAudioFocus(build);
            }
        } catch (IllegalStateException unused) {
            concat = "requestAudioFocus IllegalStateException";
            n7.g("MediaPlayerAgent", concat);
        } catch (Exception e10) {
            concat = "requestAudioFocus ".concat(e10.getClass().getSimpleName());
            n7.g("MediaPlayerAgent", concat);
        }
    }

    public final void finalize() {
        super.finalize();
        k(new l());
    }

    public final void g(int i10, int i11) {
        MediaPlayer mediaPlayer;
        try {
            if (this.f32087m.a() && !this.f32081g) {
                synchronized (this.f32088n) {
                    mediaPlayer = this.f32076a;
                }
                int H = (H() * i10) / 100;
                if (mediaPlayer != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        mediaPlayer.seekTo(H, i11);
                    } else {
                        mediaPlayer.seekTo(H);
                    }
                }
                j(i10, H);
            }
        } catch (IllegalStateException unused) {
            n7.g("MediaPlayerAgent", "seekTo IllegalStateException");
        }
    }

    public final void h(int i10, int i11, int i12) {
        n7.f("MediaPlayerAgent", "notifyError playTime: %d", Integer.valueOf(i10));
        C();
        com.huawei.openalliance.ad.ppskit.utils.d2.a(new i(i10, i11, i12));
    }

    public final void i(Surface surface) {
        k(new r(surface));
    }

    public final void j(int i10, int i11) {
        com.huawei.openalliance.ad.ppskit.utils.d2.a(new b(i10, i11));
    }

    public final void l(boolean z10) {
        r8.b bVar = r8.b.END;
        r8 r8Var = this.f32087m;
        if (r8Var.b(bVar)) {
            return;
        }
        try {
            n7.e("MediaPlayerAgent", "prepareMediaPlayer");
            r8Var.d(r8.b.PREPARING);
            this.f32081g = true;
            E().prepareAsync();
            if (z10) {
                a();
            }
        } catch (IllegalStateException unused) {
            n7.g("MediaPlayerAgent", "prepareMediaPlayer IllegalStateException");
            r8Var.d(r8.b.ERROR);
            h(0, -1, -1);
        }
    }

    public final void m() {
        k(new k8(this));
    }

    public final boolean n(float f10) {
        if (this.f32087m.b(r8.b.END)) {
            return false;
        }
        try {
            E().setVolume(f10, f10);
            return true;
        } catch (IllegalStateException unused) {
            n7.g("MediaPlayerAgent", "mute IllegalStateException");
            return false;
        }
    }

    public final void p(boolean z10) {
        r8.b bVar = r8.b.END;
        r8 r8Var = this.f32087m;
        if (r8Var.b(bVar)) {
            return;
        }
        r8.b bVar2 = r8.b.ERROR;
        if (r8Var.b(bVar2) || r8Var.b(r8.b.IDLE)) {
            return;
        }
        if (r8Var.a() || r8Var.b(r8.b.PREPARING)) {
            try {
                MediaPlayer E = E();
                int currentPosition = E.getCurrentPosition();
                if (r8Var.a() && !this.f32081g) {
                    E.stop();
                }
                if (r8Var.b(r8.b.PLAYBACK_COMPLETED)) {
                    currentPosition = 0;
                }
                u(currentPosition);
                if (z10) {
                    j(0, 0);
                }
                r8Var.d(r8.b.INITIALIZED);
            } catch (IllegalStateException unused) {
                n7.g("MediaPlayerAgent", "stop IllegalStateException");
                r8Var.d(bVar2);
            }
        }
        this.f32083i = 0;
        this.f32090q = 0;
        b();
        w(this.f32078c);
        n7.f("MediaPlayerAgent", "stop - agent: %s", this);
    }

    public final void q() {
        k(new l8(this));
    }

    public final int r() {
        MediaPlayer mediaPlayer;
        if (!this.f32087m.b(r8.b.END) && !this.f32087m.b(r8.b.ERROR) && !this.f32087m.b(r8.b.IDLE)) {
            try {
                synchronized (this.f32088n) {
                    mediaPlayer = this.f32076a;
                }
                if (mediaPlayer != null) {
                    return mediaPlayer.getCurrentPosition();
                }
            } catch (IllegalStateException unused) {
                n7.g("MediaPlayerAgent", "getCurrentPlayPosition IllegalStateException");
            }
        }
        return 0;
    }

    public final void s(int i10) {
        n7.f("MediaPlayerAgent", "notifyMediaStart playTime: %d", Integer.valueOf(i10));
        f();
        com.huawei.openalliance.ad.ppskit.utils.d2.a(new f(i10));
    }

    public final void t(String str) {
        if (this.f32087m.b(r8.b.END)) {
            return;
        }
        n7.c("MediaPlayerAgent", "setMediaFileUrl: %s", com.huawei.openalliance.ad.ppskit.utils.y1.j(str));
        MediaPlayer E = E();
        try {
            if (this.f32087m.a()) {
                E.stop();
            }
        } catch (IllegalStateException unused) {
            n7.g("MediaPlayerAgent", "setMediaFileUrl stop IllegalStateException");
        } catch (Throwable th) {
            n7.h("MediaPlayerAgent", "setMediaFileUrl exception: %s", th.getClass().getSimpleName());
        }
        try {
            E.reset();
            this.f32087m.d(r8.b.IDLE);
        } catch (Throwable th2) {
            n7.h("MediaPlayerAgent", "mediaPlayer reset exception: %s", th2.getClass().getSimpleName());
        }
        this.f32079d = str;
        boolean isEmpty = TextUtils.isEmpty(str);
        r8.b bVar = r8.b.ERROR;
        if (!isEmpty) {
            try {
                v(str);
                return;
            } catch (Exception unused2) {
                n7.g("MediaPlayerAgent", "setMediaFileUrl Exception");
                this.f32087m.d(bVar);
                throw new u5("setMediaFileUrl Exception");
            }
        }
        n7.g("MediaPlayerAgent", "media file url is empty");
        this.f32087m.d(bVar);
        throw new u5("media file url is empty");
    }

    public final String toString() {
        return "MediaPlayerAgent@" + Integer.toHexString(hashCode()) + " [" + com.huawei.openalliance.ad.ppskit.utils.y1.j(this.f32079d) + "]";
    }

    public final void u(int i10) {
        n7.f("MediaPlayerAgent", "notifyMediaStop playTime: %d", Integer.valueOf(i10));
        C();
        com.huawei.openalliance.ad.ppskit.utils.d2.a(new g(i10));
    }

    public final void v(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        MediaPlayer E = E();
        if (Uri.parse(str).getScheme() != null) {
            if (str.startsWith(Advertisement.FILE_SCHEME)) {
                str = str.substring(7);
            } else if (str.startsWith("diskcache://")) {
                if (TextUtils.isEmpty(this.f32085k)) {
                    this.f32085k = "normal";
                }
                String str2 = this.f32085k;
                Context context = this.B;
                str = y4.a(context, str2).h(context, str);
            } else if (str.startsWith("http://") || str.startsWith("https://")) {
                this.f32080e = true;
            }
        }
        E.setDataSource(str);
        E.setVideoScalingMode(1);
        this.f32087m.d(r8.b.INITIALIZED);
    }

    public final void x() {
        k(new p8(this));
    }

    public final void y() {
        k(new q8(this));
    }

    public final void z() {
        synchronized (this.f32089p) {
            int i10 = this.f32077b - 1;
            this.f32077b = i10;
            if (i10 < 0) {
                this.f32077b = 0;
            }
            if (n7.d()) {
                n7.c("MediaPlayerAgent", "release - instanceRefCount: %d - agent: %s", Integer.valueOf(this.f32077b), this);
            }
            if (this.f32077b == 0) {
                k(new k());
            }
        }
    }
}
