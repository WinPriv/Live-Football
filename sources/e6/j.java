package e6;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import com.huawei.hms.ads.gl;
import d6.g0;
import d6.p;

/* compiled from: VideoFrameReleaseHelper.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final e6.d f27810a = new e6.d();

    /* renamed from: b, reason: collision with root package name */
    public final b f27811b;

    /* renamed from: c, reason: collision with root package name */
    public final e f27812c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27813d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f27814e;
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public float f27815g;

    /* renamed from: h, reason: collision with root package name */
    public float f27816h;

    /* renamed from: i, reason: collision with root package name */
    public float f27817i;

    /* renamed from: j, reason: collision with root package name */
    public int f27818j;

    /* renamed from: k, reason: collision with root package name */
    public long f27819k;

    /* renamed from: l, reason: collision with root package name */
    public long f27820l;

    /* renamed from: m, reason: collision with root package name */
    public long f27821m;

    /* renamed from: n, reason: collision with root package name */
    public long f27822n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public long f27823p;

    /* renamed from: q, reason: collision with root package name */
    public long f27824q;

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Surface surface, float f) {
            int i10;
            if (f == gl.Code) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            try {
                surface.setFrameRate(f, i10);
            } catch (IllegalStateException e10) {
                p.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes2.dex */
    public interface b {

        /* compiled from: VideoFrameReleaseHelper.java */
        /* loaded from: classes2.dex */
        public interface a {
        }

        void a(b0.b bVar);

        void b();
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes2.dex */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: w, reason: collision with root package name */
        public static final e f27828w = new e();

        /* renamed from: s, reason: collision with root package name */
        public volatile long f27829s = com.anythink.expressad.exoplayer.b.f7291b;

        /* renamed from: t, reason: collision with root package name */
        public final Handler f27830t;

        /* renamed from: u, reason: collision with root package name */
        public Choreographer f27831u;

        /* renamed from: v, reason: collision with root package name */
        public int f27832v;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i10 = g0.f27302a;
            Handler handler = new Handler(looper, this);
            this.f27830t = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            this.f27829s = j10;
            Choreographer choreographer = this.f27831u;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    Choreographer choreographer = this.f27831u;
                    if (choreographer != null) {
                        int i11 = this.f27832v - 1;
                        this.f27832v = i11;
                        if (i11 == 0) {
                            choreographer.removeFrameCallback(this);
                            this.f27829s = com.anythink.expressad.exoplayer.b.f7291b;
                        }
                    }
                    return true;
                }
                Choreographer choreographer2 = this.f27831u;
                if (choreographer2 != null) {
                    int i12 = this.f27832v + 1;
                    this.f27832v = i12;
                    if (i12 == 1) {
                        choreographer2.postFrameCallback(this);
                    }
                }
                return true;
            }
            try {
                this.f27831u = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                p.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            e6.d r0 = new e6.d
            r0.<init>()
            r3.f27810a = r0
            r0 = 0
            if (r4 == 0) goto L3a
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = d6.g0.f27302a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            e6.j$d r2 = new e6.j$d
            r2.<init>(r1)
            goto L28
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L3b
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L3a
            e6.j$c r2 = new e6.j$c
            r2.<init>(r4)
            goto L3b
        L3a:
            r2 = r0
        L3b:
            r3.f27811b = r2
            if (r2 == 0) goto L41
            e6.j$e r0 = e6.j.e.f27828w
        L41:
            r3.f27812c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f27819k = r0
            r3.f27820l = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f27817i = r4
            r4 = 0
            r3.f27818j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.j.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (g0.f27302a >= 30 && (surface = this.f27814e) != null && this.f27818j != Integer.MIN_VALUE && this.f27816h != gl.Code) {
            this.f27816h = gl.Code;
            a.a(surface, gl.Code);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (java.lang.Math.abs(r2 - r9.f27815g) < r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        if (r0.f27769e >= 30) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r9 = this;
            int r0 = d6.g0.f27302a
            r1 = 30
            if (r0 < r1) goto L8f
            android.view.Surface r0 = r9.f27814e
            if (r0 != 0) goto Lc
            goto L8f
        Lc:
            e6.d r0 = r9.f27810a
            boolean r2 = r0.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L35
            boolean r2 = r0.a()
            if (r2 == 0) goto L33
            e6.d$a r2 = r0.f27765a
            long r4 = r2.f27774e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L27
            goto L2a
        L27:
            long r6 = r2.f
            long r6 = r6 / r4
        L2a:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L37
        L33:
            r2 = r3
            goto L37
        L35:
            float r2 = r9.f
        L37:
            float r4 = r9.f27815g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L3e
            return
        L3e:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L7f
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L7f
            boolean r1 = r0.a()
            if (r1 == 0) goto L69
            boolean r1 = r0.a()
            if (r1 == 0) goto L59
            e6.d$a r0 = r0.f27765a
            long r0 = r0.f
            goto L5e
        L59:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L5e:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L69
            r0 = r7
            goto L6a
        L69:
            r0 = r6
        L6a:
            if (r0 == 0) goto L70
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L72
        L70:
            r0 = 1065353216(0x3f800000, float:1.0)
        L72:
            float r1 = r9.f27815g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L87
            goto L88
        L7f:
            if (r5 == 0) goto L82
            goto L88
        L82:
            int r0 = r0.f27769e
            if (r0 < r1) goto L87
            goto L88
        L87:
            r7 = r6
        L88:
            if (r7 == 0) goto L8f
            r9.f27815g = r2
            r9.c(r6)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.j.b():void");
    }

    public final void c(boolean z10) {
        Surface surface;
        float f;
        if (g0.f27302a >= 30 && (surface = this.f27814e) != null && this.f27818j != Integer.MIN_VALUE) {
            if (this.f27813d) {
                float f10 = this.f27815g;
                if (f10 != -1.0f) {
                    f = f10 * this.f27817i;
                    if (z10 && this.f27816h == f) {
                        return;
                    }
                    this.f27816h = f;
                    a.a(surface, f);
                }
            }
            f = gl.Code;
            if (z10) {
            }
            this.f27816h = f;
            a.a(surface, f);
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final WindowManager f27825a;

        public c(WindowManager windowManager) {
            this.f27825a = windowManager;
        }

        @Override // e6.j.b
        public final void a(b0.b bVar) {
            bVar.onDefaultDisplayChanged(this.f27825a.getDefaultDisplay());
        }

        @Override // e6.j.b
        public final void b() {
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes2.dex */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayManager f27826a;

        /* renamed from: b, reason: collision with root package name */
        public b.a f27827b;

        public d(DisplayManager displayManager) {
            this.f27826a = displayManager;
        }

        @Override // e6.j.b
        public final void a(b0.b bVar) {
            this.f27827b = bVar;
            Handler k10 = g0.k(null);
            DisplayManager displayManager = this.f27826a;
            displayManager.registerDisplayListener(this, k10);
            bVar.onDefaultDisplayChanged(displayManager.getDisplay(0));
        }

        @Override // e6.j.b
        public final void b() {
            this.f27826a.unregisterDisplayListener(this);
            this.f27827b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            b.a aVar = this.f27827b;
            if (aVar != null && i10 == 0) {
                ((b0.b) aVar).onDefaultDisplayChanged(this.f27826a.getDisplay(0));
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
        }
    }
}
