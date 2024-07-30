package d6;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* compiled from: EGLSurfaceTexture.java */
/* loaded from: classes2.dex */
public final class h implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] y = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: s, reason: collision with root package name */
    public final Handler f27315s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f27316t = new int[1];

    /* renamed from: u, reason: collision with root package name */
    public EGLDisplay f27317u;

    /* renamed from: v, reason: collision with root package name */
    public EGLContext f27318v;

    /* renamed from: w, reason: collision with root package name */
    public EGLSurface f27319w;

    /* renamed from: x, reason: collision with root package name */
    public SurfaceTexture f27320x;

    public h(Handler handler) {
        this.f27315s = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f27315s.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f27320x;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
