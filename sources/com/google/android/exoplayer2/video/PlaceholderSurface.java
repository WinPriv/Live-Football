package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import d6.g0;
import d6.h;
import d6.l;
import d6.p;

/* loaded from: classes2.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: v, reason: collision with root package name */
    public static int f20377v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f20378w;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f20379s;

    /* renamed from: t, reason: collision with root package name */
    public final a f20380t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20381u;

    /* loaded from: classes2.dex */
    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: s, reason: collision with root package name */
        public h f20382s;

        /* renamed from: t, reason: collision with root package name */
        public Handler f20383t;

        /* renamed from: u, reason: collision with root package name */
        public Error f20384u;

        /* renamed from: v, reason: collision with root package name */
        public RuntimeException f20385v;

        /* renamed from: w, reason: collision with root package name */
        public PlaceholderSurface f20386w;

        public a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public final void a(int i10) throws l.a {
            boolean z10;
            boolean z11;
            int[] iArr;
            boolean z12;
            int[] iArr2;
            EGLSurface eglCreatePbufferSurface;
            boolean z13;
            this.f20382s.getClass();
            h hVar = this.f20382s;
            hVar.getClass();
            boolean z14 = false;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            l.c("eglGetDisplay failed", z10);
            int[] iArr3 = new int[2];
            l.c("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1));
            hVar.f27317u = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr4 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, h.y, 0, eGLConfigArr, 0, 1, iArr4, 0);
            if (eglChooseConfig && iArr4[0] > 0 && eGLConfigArr[0] != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            l.c(g0.l("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]), z11);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLDisplay eGLDisplay = hVar.f27317u;
            if (i10 == 0) {
                iArr = new int[]{12440, 2, 12344};
            } else {
                iArr = new int[]{12440, 2, 12992, 1, 12344};
            }
            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
            if (eglCreateContext != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            l.c("eglCreateContext failed", z12);
            hVar.f27318v = eglCreateContext;
            EGLDisplay eGLDisplay2 = hVar.f27317u;
            if (i10 == 1) {
                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                if (i10 == 2) {
                    iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                } else {
                    iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                }
                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                if (eglCreatePbufferSurface != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                l.c("eglCreatePbufferSurface failed", z13);
            }
            l.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
            hVar.f27319w = eglCreatePbufferSurface;
            int[] iArr5 = hVar.f27316t;
            GLES20.glGenTextures(1, iArr5, 0);
            l.b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
            hVar.f27320x = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(hVar);
            SurfaceTexture surfaceTexture2 = this.f20382s.f27320x;
            surfaceTexture2.getClass();
            if (i10 != 0) {
                z14 = true;
            }
            this.f20386w = new PlaceholderSurface(this, surfaceTexture2, z14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            this.f20382s.getClass();
            h hVar = this.f20382s;
            hVar.f27315s.removeCallbacks(hVar);
            try {
                SurfaceTexture surfaceTexture = hVar.f27320x;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, hVar.f27316t, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = hVar.f27317u;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = hVar.f27317u;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = hVar.f27319w;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(hVar.f27317u, hVar.f27319w);
                }
                EGLContext eGLContext = hVar.f27318v;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(hVar.f27317u, eGLContext);
                }
                if (g0.f27302a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = hVar.f27317u;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(hVar.f27317u);
                }
                hVar.f27317u = null;
                hVar.f27318v = null;
                hVar.f27319w = null;
                hVar.f27320x = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (l.a e10) {
                    p.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f20385v = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    p.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f20384u = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    p.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f20385v = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public PlaceholderSurface(a aVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f20380t = aVar;
        this.f20379s = z10;
    }

    public static int a(Context context) {
        boolean z10;
        String eglQueryString;
        String eglQueryString2;
        int i10 = g0.f27302a;
        boolean z11 = false;
        if (i10 >= 24 && ((i10 >= 26 || (!"samsung".equals(g0.f27304c) && !"XT1650".equals(g0.f27305d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_EXT_protected_content")))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        if (i10 >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z11 = true;
        }
        if (z11) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.video.PlaceholderSurface c(android.content.Context r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L23
            java.lang.Class<com.google.android.exoplayer2.video.PlaceholderSurface> r2 = com.google.android.exoplayer2.video.PlaceholderSurface.class
            monitor-enter(r2)
            boolean r3 = com.google.android.exoplayer2.video.PlaceholderSurface.f20378w     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L13
            int r4 = a(r4)     // Catch: java.lang.Throwable -> L20
            com.google.android.exoplayer2.video.PlaceholderSurface.f20377v = r4     // Catch: java.lang.Throwable -> L20
            com.google.android.exoplayer2.video.PlaceholderSurface.f20378w = r0     // Catch: java.lang.Throwable -> L20
        L13:
            int r4 = com.google.android.exoplayer2.video.PlaceholderSurface.f20377v     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L19
            r4 = r0
            goto L1a
        L19:
            r4 = r1
        L1a:
            monitor-exit(r2)
            if (r4 == 0) goto L1e
            goto L23
        L1e:
            r4 = r1
            goto L24
        L20:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L23:
            r4 = r0
        L24:
            d6.a.d(r4)
            com.google.android.exoplayer2.video.PlaceholderSurface$a r4 = new com.google.android.exoplayer2.video.PlaceholderSurface$a
            r4.<init>()
            if (r5 == 0) goto L31
            int r5 = com.google.android.exoplayer2.video.PlaceholderSurface.f20377v
            goto L32
        L31:
            r5 = r1
        L32:
            r4.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = r4.getLooper()
            r2.<init>(r3, r4)
            r4.f20383t = r2
            d6.h r3 = new d6.h
            r3.<init>(r2)
            r4.f20382s = r3
            monitor-enter(r4)
            android.os.Handler r2 = r4.f20383t     // Catch: java.lang.Throwable -> L7d
            android.os.Message r5 = r2.obtainMessage(r0, r5, r1)     // Catch: java.lang.Throwable -> L7d
            r5.sendToTarget()     // Catch: java.lang.Throwable -> L7d
        L51:
            com.google.android.exoplayer2.video.PlaceholderSurface r5 = r4.f20386w     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            java.lang.RuntimeException r5 = r4.f20385v     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            java.lang.Error r5 = r4.f20384u     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            r4.wait()     // Catch: java.lang.InterruptedException -> L61 java.lang.Throwable -> L7d
            goto L51
        L61:
            r1 = r0
            goto L51
        L63:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L6d
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L6d:
            java.lang.RuntimeException r5 = r4.f20385v
            if (r5 != 0) goto L7c
            java.lang.Error r5 = r4.f20384u
            if (r5 != 0) goto L7b
            com.google.android.exoplayer2.video.PlaceholderSurface r4 = r4.f20386w
            r4.getClass()
            return r4
        L7b:
            throw r5
        L7c:
            throw r5
        L7d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.PlaceholderSurface.c(android.content.Context, boolean):com.google.android.exoplayer2.video.PlaceholderSurface");
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f20380t) {
            if (!this.f20381u) {
                a aVar = this.f20380t;
                aVar.f20383t.getClass();
                aVar.f20383t.sendEmptyMessage(2);
                this.f20381u = true;
            }
        }
    }
}
