package com.anythink.expressad.exoplayer.k;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@TargetApi(17)
/* loaded from: classes.dex */
public final class g implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9035a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9036b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9037c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f9038d = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: e, reason: collision with root package name */
    private static final int f9039e = 12992;
    private final Handler f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f9040g = new int[1];

    /* renamed from: h, reason: collision with root package name */
    private EGLDisplay f9041h;

    /* renamed from: i, reason: collision with root package name */
    private EGLContext f9042i;

    /* renamed from: j, reason: collision with root package name */
    private EGLSurface f9043j;

    /* renamed from: k, reason: collision with root package name */
    private SurfaceTexture f9044k;

    /* loaded from: classes.dex */
    public static final class a extends RuntimeException {
        public /* synthetic */ a(String str, byte b10) {
            this(str);
        }

        private a(String str) {
            super(str);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public g(Handler handler) {
        this.f = handler;
    }

    private static EGLDisplay c() {
        byte b10 = 0;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new a("eglInitialize failed", b10);
        }
        throw new a("eglGetDisplay failed", b10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        this.f.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f9044k;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f9040g, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f9041h;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f9041h;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f9043j;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f9041h, this.f9043j);
            }
            EGLContext eGLContext = this.f9042i;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f9041h, eGLContext);
            }
            if (af.f8993a >= 19) {
                EGL14.eglReleaseThread();
            }
            this.f9041h = null;
            this.f9042i = null;
            this.f9043j = null;
            this.f9044k = null;
        }
    }

    public final SurfaceTexture b() {
        return (SurfaceTexture) com.anythink.expressad.exoplayer.k.a.a(this.f9044k);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f9044k;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f9038d, 0, eGLConfigArr, 0, 1, iArr, 0);
        byte b10 = 0;
        if (!eglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new a(af.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]), b10);
        }
        return eGLConfig;
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        byte b10 = 0;
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, f9039e, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new a("eglCreateContext failed", b10);
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eglCreatePbufferSurface;
        byte b10 = 0;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, f9039e, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new a("eglCreatePbufferSurface failed", b10);
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new a("eglMakeCurrent failed", b10);
    }

    private static void a(int[] iArr) {
        byte b10 = 0;
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new a("glGenTextures failed. Error: " + Integer.toHexString(glGetError), b10);
    }

    public final void a(int i10) {
        EGLConfig eGLConfig;
        EGLSurface eglCreatePbufferSurface;
        byte b10 = 0;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                this.f9041h = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f9038d, 0, eGLConfigArr, 0, 1, iArr2, 0);
                if (eglChooseConfig && iArr2[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f9041h, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, f9039e, 1, 12344}, 0);
                    if (eglCreateContext != null) {
                        this.f9042i = eglCreateContext;
                        EGLDisplay eGLDisplay = this.f9041h;
                        if (i10 == 1) {
                            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, f9039e, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                            if (eglCreatePbufferSurface == null) {
                                throw new a("eglCreatePbufferSurface failed", b10);
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                            this.f9043j = eglCreatePbufferSurface;
                            GLES20.glGenTextures(1, this.f9040g, 0);
                            int glGetError = GLES20.glGetError();
                            if (glGetError == 0) {
                                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9040g[0]);
                                this.f9044k = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(this);
                                return;
                            } else {
                                throw new a("glGenTextures failed. Error: " + Integer.toHexString(glGetError), b10);
                            }
                        }
                        throw new a("eglMakeCurrent failed", b10);
                    }
                    throw new a("eglCreateContext failed", b10);
                }
                throw new a(af.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), b10);
            }
            throw new a("eglInitialize failed", b10);
        }
        throw new a("eglGetDisplay failed", b10);
    }
}
