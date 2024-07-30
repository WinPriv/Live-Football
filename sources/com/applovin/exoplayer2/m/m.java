package com.applovin.exoplayer2.m;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.applovin.exoplayer2.l.ai;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.m.e f16513a = new com.applovin.exoplayer2.m.e();

    /* renamed from: b, reason: collision with root package name */
    private final b f16514b;

    /* renamed from: c, reason: collision with root package name */
    private final e f16515c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16516d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f16517e;
    private float f;

    /* renamed from: g, reason: collision with root package name */
    private float f16518g;

    /* renamed from: h, reason: collision with root package name */
    private float f16519h;

    /* renamed from: i, reason: collision with root package name */
    private float f16520i;

    /* renamed from: j, reason: collision with root package name */
    private int f16521j;

    /* renamed from: k, reason: collision with root package name */
    private long f16522k;

    /* renamed from: l, reason: collision with root package name */
    private long f16523l;

    /* renamed from: m, reason: collision with root package name */
    private long f16524m;

    /* renamed from: n, reason: collision with root package name */
    private long f16525n;
    private long o;

    /* renamed from: p, reason: collision with root package name */
    private long f16526p;

    /* renamed from: q, reason: collision with root package name */
    private long f16527q;

    /* loaded from: classes.dex */
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
                com.applovin.exoplayer2.l.q.c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            void onDefaultDisplayChanged(Display display);
        }

        void a();

        void a(a aVar);
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowManager f16528a;

        private c(WindowManager windowManager) {
            this.f16528a = windowManager;
        }

        @Override // com.applovin.exoplayer2.m.m.b
        public void a() {
        }

        public static b a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // com.applovin.exoplayer2.m.m.b
        public void a(b.a aVar) {
            aVar.onDefaultDisplayChanged(this.f16528a.getDefaultDisplay());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Handler.Callback, Choreographer.FrameCallback {

        /* renamed from: b, reason: collision with root package name */
        private static final e f16531b = new e();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f16532a = com.anythink.expressad.exoplayer.b.f7291b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f16533c;

        /* renamed from: d, reason: collision with root package name */
        private final HandlerThread f16534d;

        /* renamed from: e, reason: collision with root package name */
        private Choreographer f16535e;
        private int f;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f16534d = handlerThread;
            handlerThread.start();
            Handler a10 = ai.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f16533c = a10;
            a10.sendEmptyMessage(0);
        }

        public static e a() {
            return f16531b;
        }

        private void d() {
            this.f16535e = Choreographer.getInstance();
        }

        private void e() {
            int i10 = this.f + 1;
            this.f = i10;
            if (i10 == 1) {
                ((Choreographer) com.applovin.exoplayer2.l.a.b(this.f16535e)).postFrameCallback(this);
            }
        }

        private void f() {
            int i10 = this.f - 1;
            this.f = i10;
            if (i10 == 0) {
                ((Choreographer) com.applovin.exoplayer2.l.a.b(this.f16535e)).removeFrameCallback(this);
                this.f16532a = com.anythink.expressad.exoplayer.b.f7291b;
            }
        }

        public void b() {
            this.f16533c.sendEmptyMessage(1);
        }

        public void c() {
            this.f16533c.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f16532a = j10;
            ((Choreographer) com.applovin.exoplayer2.l.a.b(this.f16535e)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    f();
                    return true;
                }
                e();
                return true;
            }
            d();
            return true;
        }
    }

    public m(Context context) {
        e eVar;
        b a10 = a(context);
        this.f16514b = a10;
        if (a10 != null) {
            eVar = e.a();
        } else {
            eVar = null;
        }
        this.f16515c = eVar;
        this.f16522k = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16523l = com.anythink.expressad.exoplayer.b.f7291b;
        this.f = -1.0f;
        this.f16520i = 1.0f;
        this.f16521j = 0;
    }

    private void f() {
        this.f16524m = 0L;
        this.f16526p = -1L;
        this.f16525n = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (java.lang.Math.abs(r0 - r7.f16518g) >= r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (r7.f16513a.c() >= 30) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g() {
        /*
            r7 = this;
            int r0 = com.applovin.exoplayer2.l.ai.f16274a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.f16517e
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            com.applovin.exoplayer2.m.e r0 = r7.f16513a
            boolean r0 = r0.b()
            if (r0 == 0) goto L1b
            com.applovin.exoplayer2.m.e r0 = r7.f16513a
            float r0 = r0.f()
            goto L1d
        L1b:
            float r0 = r7.f
        L1d:
            float r2 = r7.f16518g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            com.applovin.exoplayer2.m.e r1 = r7.f16513a
            boolean r1 = r1.b()
            if (r1 == 0) goto L49
            com.applovin.exoplayer2.m.e r1 = r7.f16513a
            long r1 = r1.d()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L49
            r1 = r6
            goto L4a
        L49:
            r1 = r5
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r7.f16518g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r6 = r5
            goto L6c
        L61:
            if (r4 == 0) goto L64
            goto L6c
        L64:
            com.applovin.exoplayer2.m.e r2 = r7.f16513a
            int r2 = r2.c()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.f16518g = r0
            r7.a(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.m.g():void");
    }

    private void h() {
        Surface surface;
        if (ai.f16274a >= 30 && (surface = this.f16517e) != null && this.f16521j != Integer.MIN_VALUE && this.f16519h != gl.Code) {
            this.f16519h = gl.Code;
            a.a(surface, gl.Code);
        }
    }

    public void b() {
        this.f16516d = true;
        f();
        a(false);
    }

    public void c() {
        f();
    }

    public void d() {
        this.f16516d = false;
        h();
    }

    public void e() {
        b bVar = this.f16514b;
        if (bVar != null) {
            bVar.a();
            ((e) com.applovin.exoplayer2.l.a.b(this.f16515c)).c();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements DisplayManager.DisplayListener, b {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayManager f16529a;

        /* renamed from: b, reason: collision with root package name */
        private b.a f16530b;

        private d(DisplayManager displayManager) {
            this.f16529a = displayManager;
        }

        public static b a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        private Display b() {
            return this.f16529a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f16530b;
            if (aVar != null && i10 == 0) {
                aVar.onDefaultDisplayChanged(b());
            }
        }

        @Override // com.applovin.exoplayer2.m.m.b
        public void a(b.a aVar) {
            this.f16530b = aVar;
            this.f16529a.registerDisplayListener(this, ai.a());
            aVar.onDefaultDisplayChanged(b());
        }

        @Override // com.applovin.exoplayer2.m.m.b
        public void a() {
            this.f16529a.unregisterDisplayListener(this);
            this.f16530b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    public void a(int i10) {
        if (this.f16521j == i10) {
            return;
        }
        this.f16521j = i10;
        a(true);
    }

    public void b(float f) {
        this.f = f;
        this.f16513a.a();
        g();
    }

    public void a() {
        if (this.f16514b != null) {
            ((e) com.applovin.exoplayer2.l.a.b(this.f16515c)).b();
            this.f16514b.a(new b0.b(this, 2));
        }
    }

    public long b(long j10) {
        long j11;
        e eVar;
        if (this.f16526p != -1 && this.f16513a.b()) {
            long e10 = this.f16527q + (((float) ((this.f16524m - this.f16526p) * this.f16513a.e())) / this.f16520i);
            if (!a(j10, e10)) {
                f();
            } else {
                j11 = e10;
                this.f16525n = this.f16524m;
                this.o = j11;
                eVar = this.f16515c;
                if (eVar != null || this.f16522k == com.anythink.expressad.exoplayer.b.f7291b) {
                    return j11;
                }
                long j12 = eVar.f16532a;
                return j12 == com.anythink.expressad.exoplayer.b.f7291b ? j11 : a(j11, j12, this.f16522k) - this.f16523l;
            }
        }
        j11 = j10;
        this.f16525n = this.f16524m;
        this.o = j11;
        eVar = this.f16515c;
        if (eVar != null) {
        }
        return j11;
    }

    public void a(Surface surface) {
        if (surface instanceof com.applovin.exoplayer2.m.d) {
            surface = null;
        }
        if (this.f16517e == surface) {
            return;
        }
        h();
        this.f16517e = surface;
        a(true);
    }

    public void a(float f) {
        this.f16520i = f;
        f();
        a(false);
    }

    public void a(long j10) {
        long j11 = this.f16525n;
        if (j11 != -1) {
            this.f16526p = j11;
            this.f16527q = this.o;
        }
        this.f16524m++;
        this.f16513a.a(j10 * 1000);
        g();
    }

    private static boolean a(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void a(boolean z10) {
        Surface surface;
        float f;
        if (ai.f16274a < 30 || (surface = this.f16517e) == null || this.f16521j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f16516d) {
            float f10 = this.f16518g;
            if (f10 != -1.0f) {
                f = f10 * this.f16520i;
                if (z10 && this.f16519h == f) {
                    return;
                }
                this.f16519h = f;
                a.a(surface, f);
            }
        }
        f = gl.Code;
        if (z10) {
        }
        this.f16519h = f;
        a.a(surface, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f16522k = refreshRate;
            this.f16523l = (refreshRate * 80) / 100;
        } else {
            com.applovin.exoplayer2.l.q.c("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f16522k = com.anythink.expressad.exoplayer.b.f7291b;
            this.f16523l = com.anythink.expressad.exoplayer.b.f7291b;
        }
    }

    private static long a(long j10, long j11, long j12) {
        long j13;
        long j14 = (((j10 - j11) / j12) * j12) + j11;
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j13 = j14;
            j14 = j12 + j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private static b a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b a10 = ai.f16274a >= 17 ? d.a(applicationContext) : null;
        return a10 == null ? c.a(applicationContext) : a10;
    }
}
