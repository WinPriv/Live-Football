package com.anythink.expressad.exoplayer.l;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;
import com.anythink.expressad.exoplayer.k.af;

@TargetApi(16)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final long f9205a = 500;

    /* renamed from: b, reason: collision with root package name */
    private static final long f9206b = 20000000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f9207c = 80;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9208d = 6;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f9209e;
    private final b f;

    /* renamed from: g, reason: collision with root package name */
    private final a f9210g;

    /* renamed from: h, reason: collision with root package name */
    private long f9211h;

    /* renamed from: i, reason: collision with root package name */
    private long f9212i;

    /* renamed from: j, reason: collision with root package name */
    private long f9213j;

    /* renamed from: k, reason: collision with root package name */
    private long f9214k;

    /* renamed from: l, reason: collision with root package name */
    private long f9215l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9216m;

    /* renamed from: n, reason: collision with root package name */
    private long f9217n;
    private long o;

    /* renamed from: p, reason: collision with root package name */
    private long f9218p;

    /* loaded from: classes.dex */
    public static final class b implements Handler.Callback, Choreographer.FrameCallback {

        /* renamed from: b, reason: collision with root package name */
        private static final int f9221b = 0;

        /* renamed from: c, reason: collision with root package name */
        private static final int f9222c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f9223d = 2;

        /* renamed from: e, reason: collision with root package name */
        private static final b f9224e = new b();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f9225a = com.anythink.expressad.exoplayer.b.f7291b;
        private final Handler f;

        /* renamed from: g, reason: collision with root package name */
        private final HandlerThread f9226g;

        /* renamed from: h, reason: collision with root package name */
        private Choreographer f9227h;

        /* renamed from: i, reason: collision with root package name */
        private int f9228i;

        private b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f9226g = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f = handler;
            handler.sendEmptyMessage(0);
        }

        public static b a() {
            return f9224e;
        }

        private void d() {
            this.f9227h = Choreographer.getInstance();
        }

        private void e() {
            int i10 = this.f9228i + 1;
            this.f9228i = i10;
            if (i10 == 1) {
                this.f9227h.postFrameCallback(this);
            }
        }

        private void f() {
            int i10 = this.f9228i - 1;
            this.f9228i = i10;
            if (i10 == 0) {
                this.f9227h.removeFrameCallback(this);
                this.f9225a = com.anythink.expressad.exoplayer.b.f7291b;
            }
        }

        public final void b() {
            this.f.sendEmptyMessage(1);
        }

        public final void c() {
            this.f.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            this.f9225a = j10;
            this.f9227h.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    int i11 = this.f9228i - 1;
                    this.f9228i = i11;
                    if (i11 == 0) {
                        this.f9227h.removeFrameCallback(this);
                        this.f9225a = com.anythink.expressad.exoplayer.b.f7291b;
                    }
                    return true;
                }
                int i12 = this.f9228i + 1;
                this.f9228i = i12;
                if (i12 == 1) {
                    this.f9227h.postFrameCallback(this);
                }
                return true;
            }
            this.f9227h = Choreographer.getInstance();
            return true;
        }
    }

    public f() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            if (this.f9209e.getDefaultDisplay() != null) {
                long refreshRate = (long) (1.0E9d / r0.getRefreshRate());
                this.f9211h = refreshRate;
                this.f9212i = (refreshRate * f9207c) / 100;
            }
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        if (this.f9209e != null) {
            a aVar = this.f9210g;
            if (aVar != null) {
                aVar.b();
            }
            this.f.c();
        }
    }

    public f(Context context) {
        DisplayManager displayManager;
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f9209e = (WindowManager) context.getSystemService("window");
        } else {
            this.f9209e = null;
        }
        if (this.f9209e != null) {
            if (af.f8993a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                aVar = new a(displayManager);
            }
            this.f9210g = aVar;
            this.f = b.a();
        } else {
            this.f9210g = null;
            this.f = null;
        }
        this.f9211h = com.anythink.expressad.exoplayer.b.f7291b;
        this.f9212i = com.anythink.expressad.exoplayer.b.f7291b;
    }

    public final void a() {
        this.f9216m = false;
        if (this.f9209e != null) {
            this.f.b();
            a aVar = this.f9210g;
            if (aVar != null) {
                aVar.a();
            }
            c();
        }
    }

    private boolean b(long j10, long j11) {
        return Math.abs((j11 - this.f9217n) - (j10 - this.o)) > f9206b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r9, long r11) {
        /*
            r8 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r9
            boolean r2 = r8.f9216m
            if (r2 == 0) goto L41
            long r2 = r8.f9213j
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 == 0) goto L18
            long r2 = r8.f9218p
            r4 = 1
            long r2 = r2 + r4
            r8.f9218p = r2
            long r2 = r8.f9215l
            r8.f9214k = r2
        L18:
            long r2 = r8.f9218p
            r4 = 6
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 < 0) goto L39
            long r6 = r8.o
            long r6 = r0 - r6
            long r6 = r6 / r2
            long r2 = r8.f9214k
            long r2 = r2 + r6
            boolean r4 = r8.b(r2, r11)
            if (r4 == 0) goto L32
            r8.f9216m = r5
            goto L41
        L32:
            long r4 = r8.f9217n
            long r4 = r4 + r2
            long r6 = r8.o
            long r4 = r4 - r6
            goto L43
        L39:
            boolean r2 = r8.b(r0, r11)
            if (r2 == 0) goto L41
            r8.f9216m = r5
        L41:
            r4 = r11
            r2 = r0
        L43:
            boolean r6 = r8.f9216m
            if (r6 != 0) goto L52
            r8.o = r0
            r8.f9217n = r11
            r11 = 0
            r8.f9218p = r11
            r11 = 1
            r8.f9216m = r11
        L52:
            r8.f9213j = r9
            r8.f9215l = r2
            com.anythink.expressad.exoplayer.l.f$b r9 = r8.f
            if (r9 == 0) goto L8b
            long r10 = r8.f9211h
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 != 0) goto L66
            goto L8b
        L66:
            long r9 = r9.f9225a
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 != 0) goto L6d
            return r4
        L6d:
            long r11 = r8.f9211h
            long r0 = r4 - r9
            long r0 = r0 / r11
            long r0 = r0 * r11
            long r0 = r0 + r9
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 > 0) goto L7b
            long r9 = r0 - r11
            goto L7e
        L7b:
            long r11 = r11 + r0
            r9 = r0
            r0 = r11
        L7e:
            long r11 = r0 - r4
            long r4 = r4 - r9
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 >= 0) goto L86
            goto L87
        L86:
            r0 = r9
        L87:
            long r9 = r8.f9212i
            long r0 = r0 - r9
            return r0
        L8b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.l.f.a(long, long):long");
    }

    @TargetApi(17)
    /* loaded from: classes.dex */
    public final class a implements DisplayManager.DisplayListener {

        /* renamed from: b, reason: collision with root package name */
        private final DisplayManager f9220b;

        public a(DisplayManager displayManager) {
            this.f9220b = displayManager;
        }

        public final void a() {
            this.f9220b.registerDisplayListener(this, null);
        }

        public final void b() {
            this.f9220b.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            if (i10 == 0) {
                f.this.c();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
        }
    }

    @TargetApi(17)
    private a a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
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
}
