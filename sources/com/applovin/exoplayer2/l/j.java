package com.applovin.exoplayer2.l;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* loaded from: classes.dex */
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f16304a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b, reason: collision with root package name */
    private final Handler f16305b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f16306c;

    /* renamed from: d, reason: collision with root package name */
    private final b f16307d;

    /* renamed from: e, reason: collision with root package name */
    private EGLDisplay f16308e;
    private EGLContext f;

    /* renamed from: g, reason: collision with root package name */
    private EGLSurface f16309g;

    /* renamed from: h, reason: collision with root package name */
    private SurfaceTexture f16310h;

    /* loaded from: classes.dex */
    public static final class a extends RuntimeException {
        private a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public j(Handler handler) {
        this(handler, null);
    }

    private void c() {
        b bVar = this.f16307d;
        if (bVar != null) {
            bVar.a();
        }
    }

    private static EGLDisplay d() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new a("eglInitialize failed");
        }
        throw new a("eglGetDisplay failed");
    }

    public void a(int i10) {
        EGLDisplay d10 = d();
        this.f16308e = d10;
        EGLConfig a10 = a(d10);
        EGLContext a11 = a(this.f16308e, a10, i10);
        this.f = a11;
        this.f16309g = a(this.f16308e, a10, a11, i10);
        a(this.f16306c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f16306c[0]);
        this.f16310h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public SurfaceTexture b() {
        return (SurfaceTexture) com.applovin.exoplayer2.l.a.b(this.f16310h);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f16305b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        c();
        SurfaceTexture surfaceTexture = this.f16310h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public j(Handler handler, b bVar) {
        this.f16305b = handler;
        this.f16307d = bVar;
        this.f16306c = new int[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        this.f16305b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f16310h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f16306c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f16308e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f16308e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f16309g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f16308e, this.f16309g);
            }
            EGLContext eGLContext = this.f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f16308e, eGLContext);
            }
            if (ai.f16274a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f16308e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f16308e);
            }
            this.f16308e = null;
            this.f = null;
            this.f16309g = null;
            this.f16310h = null;
        }
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f16304a, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new a(ai.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new a("eglCreateContext failed");
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new a("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new a("eglMakeCurrent failed");
    }

    private static void a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        n.b();
    }
}
