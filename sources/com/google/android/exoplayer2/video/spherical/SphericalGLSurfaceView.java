package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.n0;
import com.applovin.exoplayer2.b.d0;
import com.google.android.exoplayer2.video.spherical.a;
import com.google.android.exoplayer2.video.spherical.b;
import com.huawei.hms.ads.gl;
import d6.c0;
import d6.g0;
import d6.l;
import d6.p;
import e6.i;
import f6.c;
import f6.d;
import f6.f;
import f6.h;
import java.nio.Buffer;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f20396s;

    /* renamed from: t, reason: collision with root package name */
    public final SensorManager f20397t;

    /* renamed from: u, reason: collision with root package name */
    public final Sensor f20398u;

    /* renamed from: v, reason: collision with root package name */
    public final com.google.android.exoplayer2.video.spherical.a f20399v;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f20400w;

    /* renamed from: x, reason: collision with root package name */
    public final h f20401x;
    public SurfaceTexture y;

    /* renamed from: z, reason: collision with root package name */
    public Surface f20402z;

    /* loaded from: classes2.dex */
    public final class a implements GLSurfaceView.Renderer, b.a, a.InterfaceC0235a {

        /* renamed from: s, reason: collision with root package name */
        public final h f20403s;

        /* renamed from: v, reason: collision with root package name */
        public final float[] f20406v;

        /* renamed from: w, reason: collision with root package name */
        public final float[] f20407w;

        /* renamed from: x, reason: collision with root package name */
        public final float[] f20408x;
        public float y;

        /* renamed from: z, reason: collision with root package name */
        public float f20409z;

        /* renamed from: t, reason: collision with root package name */
        public final float[] f20404t = new float[16];

        /* renamed from: u, reason: collision with root package name */
        public final float[] f20405u = new float[16];
        public final float[] A = new float[16];
        public final float[] B = new float[16];

        public a(h hVar) {
            float[] fArr = new float[16];
            this.f20406v = fArr;
            float[] fArr2 = new float[16];
            this.f20407w = fArr2;
            float[] fArr3 = new float[16];
            this.f20408x = fArr3;
            this.f20403s = hVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f20409z = 3.1415927f;
        }

        @Override // com.google.android.exoplayer2.video.spherical.a.InterfaceC0235a
        public final synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.f20406v;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f10 = -f;
            this.f20409z = f10;
            Matrix.setRotateM(this.f20407w, 0, -this.y, (float) Math.cos(f10), (float) Math.sin(this.f20409z), gl.Code);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            float[] fArr;
            Long d10;
            d d11;
            float[] d12;
            float[] fArr2;
            synchronized (this) {
                Matrix.multiplyMM(this.B, 0, this.f20406v, 0, this.f20408x, 0);
                Matrix.multiplyMM(this.A, 0, this.f20407w, 0, this.B, 0);
            }
            Matrix.multiplyMM(this.f20405u, 0, this.f20404t, 0, this.A, 0);
            h hVar = this.f20403s;
            float[] fArr3 = this.f20405u;
            hVar.getClass();
            GLES20.glClear(16384);
            try {
                l.b();
            } catch (l.a e10) {
                p.d("SceneRenderer", "Failed to draw a frame", e10);
            }
            if (hVar.f28139s.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = hVar.B;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    l.b();
                } catch (l.a e11) {
                    p.d("SceneRenderer", "Failed to draw a frame", e11);
                }
                if (hVar.f28140t.compareAndSet(true, false)) {
                    Matrix.setIdentityM(hVar.y, 0);
                }
                long timestamp = hVar.B.getTimestamp();
                c0<Long> c0Var = hVar.f28143w;
                synchronized (c0Var) {
                    d10 = c0Var.d(timestamp, false);
                }
                Long l10 = d10;
                if (l10 != null) {
                    c cVar = hVar.f28142v;
                    float[] fArr4 = hVar.y;
                    long longValue = l10.longValue();
                    c0<float[]> c0Var2 = cVar.f28113c;
                    synchronized (c0Var2) {
                        d12 = c0Var2.d(longValue, true);
                    }
                    float[] fArr5 = d12;
                    if (fArr5 != null) {
                        float[] fArr6 = cVar.f28112b;
                        float f = fArr5[0];
                        float f10 = -fArr5[1];
                        float f11 = -fArr5[2];
                        float length = Matrix.length(f, f10, f11);
                        if (length != gl.Code) {
                            fArr2 = fArr4;
                            Matrix.setRotateM(fArr6, 0, (float) Math.toDegrees(length), f / length, f10 / length, f11 / length);
                        } else {
                            fArr2 = fArr4;
                            Matrix.setIdentityM(fArr6, 0);
                        }
                        if (!cVar.f28114d) {
                            c.a(cVar.f28111a, cVar.f28112b);
                            cVar.f28114d = true;
                        }
                        Matrix.multiplyMM(fArr2, 0, cVar.f28111a, 0, cVar.f28112b, 0);
                    }
                }
                c0<d> c0Var3 = hVar.f28144x;
                synchronized (c0Var3) {
                    d11 = c0Var3.d(timestamp, true);
                }
                d dVar = d11;
                if (dVar != null) {
                    f fVar = hVar.f28141u;
                    fVar.getClass();
                    if (f.b(dVar)) {
                        fVar.f28127a = dVar.f28117c;
                        fVar.f28128b = new f.a(dVar.f28115a.f28119a[0]);
                        if (!dVar.f28118d) {
                            d.b bVar = dVar.f28116b.f28119a[0];
                            float[] fArr7 = bVar.f28122c;
                            int length2 = fArr7.length / 3;
                            l.d(fArr7);
                            l.d(bVar.f28123d);
                            int i10 = bVar.f28121b;
                        }
                    }
                }
            }
            Matrix.multiplyMM(hVar.f28145z, 0, fArr3, 0, hVar.y, 0);
            f fVar2 = hVar.f28141u;
            int i11 = hVar.A;
            float[] fArr8 = hVar.f28145z;
            f.a aVar = fVar2.f28128b;
            if (aVar != null) {
                int i12 = fVar2.f28127a;
                if (i12 == 1) {
                    fArr = f.f28125j;
                } else if (i12 == 2) {
                    fArr = f.f28126k;
                } else {
                    fArr = f.f28124i;
                }
                GLES20.glUniformMatrix3fv(fVar2.f28131e, 1, false, fArr, 0);
                GLES20.glUniformMatrix4fv(fVar2.f28130d, 1, false, fArr8, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, i11);
                GLES20.glUniform1i(fVar2.f28133h, 0);
                try {
                    l.b();
                } catch (l.a e12) {
                    Log.e("ProjectionRenderer", "Failed to bind uniforms", e12);
                }
                GLES20.glVertexAttribPointer(fVar2.f, 3, 5126, false, 12, (Buffer) aVar.f28135b);
                try {
                    l.b();
                } catch (l.a e13) {
                    Log.e("ProjectionRenderer", "Failed to load position data", e13);
                }
                GLES20.glVertexAttribPointer(fVar2.f28132g, 2, 5126, false, 8, (Buffer) aVar.f28136c);
                try {
                    l.b();
                } catch (l.a e14) {
                    Log.e("ProjectionRenderer", "Failed to load texture data", e14);
                }
                GLES20.glDrawArrays(aVar.f28137d, 0, aVar.f28134a);
                try {
                    l.b();
                } catch (l.a e15) {
                    Log.e("ProjectionRenderer", "Failed to render", e15);
                }
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            float f;
            boolean z10 = false;
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            if (f10 > 1.0f) {
                z10 = true;
            }
            if (z10) {
                f = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            } else {
                f = 90.0f;
            }
            Matrix.perspectiveM(this.f20404t, 0, f, f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
            sphericalGLSurfaceView.f20400w.post(new d0(10, sphericalGLSurfaceView, this.f20403s.b()));
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void x();

        void y(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        super(context, null);
        this.f20396s = new CopyOnWriteArrayList<>();
        this.f20400w = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f20397t = sensorManager;
        Sensor defaultSensor = g0.f27302a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f20398u = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        h hVar = new h();
        this.f20401x = hVar;
        a aVar = new a(hVar);
        View.OnTouchListener bVar = new com.google.android.exoplayer2.video.spherical.b(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f20399v = new com.google.android.exoplayer2.video.spherical.a(windowManager.getDefaultDisplay(), bVar, aVar);
        this.A = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(bVar);
    }

    public final void a() {
        boolean z10;
        if (this.A && this.B) {
            z10 = true;
        } else {
            z10 = false;
        }
        Sensor sensor = this.f20398u;
        if (sensor != null && z10 != this.C) {
            com.google.android.exoplayer2.video.spherical.a aVar = this.f20399v;
            SensorManager sensorManager = this.f20397t;
            if (z10) {
                sensorManager.registerListener(aVar, sensor, 0);
            } else {
                sensorManager.unregisterListener(aVar);
            }
            this.C = z10;
        }
    }

    public f6.a getCameraMotionListener() {
        return this.f20401x;
    }

    public i getVideoFrameMetadataListener() {
        return this.f20401x;
    }

    public Surface getVideoSurface() {
        return this.f20402z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20400w.post(new n0(this, 8));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.B = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.B = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f20401x.C = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.A = z10;
        a();
    }
}
