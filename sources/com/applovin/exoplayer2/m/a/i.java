package com.applovin.exoplayer2.m.a;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import androidx.activity.k;
import com.applovin.exoplayer2.m.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class i extends GLSurfaceView {

    /* renamed from: s */
    public static final /* synthetic */ int f16420s = 0;

    /* renamed from: a */
    private final CopyOnWriteArrayList<a> f16421a;

    /* renamed from: b */
    private final SensorManager f16422b;

    /* renamed from: c */
    private final Sensor f16423c;

    /* renamed from: d */
    private final d f16424d;

    /* renamed from: e */
    private final Handler f16425e;
    private final h f;

    /* renamed from: g */
    private SurfaceTexture f16426g;

    /* renamed from: h */
    private Surface f16427h;

    /* renamed from: i */
    private boolean f16428i;

    /* renamed from: j */
    private boolean f16429j;

    /* renamed from: k */
    private boolean f16430k;

    /* loaded from: classes.dex */
    public interface a {
        void a(Surface surface);
    }

    public static /* synthetic */ void a(i iVar) {
        iVar.b();
    }

    public void b(a aVar) {
        this.f16421a.remove(aVar);
    }

    public com.applovin.exoplayer2.m.a.a getCameraMotionListener() {
        return this.f;
    }

    public l getVideoFrameMetadataListener() {
        return this.f;
    }

    public Surface getVideoSurface() {
        return this.f16427h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16425e.post(new k(this, 2));
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f16429j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f16429j = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f.a(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f16428i = z10;
        a();
    }

    public /* synthetic */ void b() {
        Surface surface = this.f16427h;
        if (surface != null) {
            Iterator<a> it = this.f16421a.iterator();
            while (it.hasNext()) {
                it.next().a(surface);
            }
        }
        a(this.f16426g, surface);
        this.f16426g = null;
        this.f16427h = null;
    }

    public void a(a aVar) {
        this.f16421a.add(aVar);
    }

    private void a() {
        boolean z10 = this.f16428i && this.f16429j;
        Sensor sensor = this.f16423c;
        if (sensor == null || z10 == this.f16430k) {
            return;
        }
        if (z10) {
            this.f16422b.registerListener(this.f16424d, sensor, 0);
        } else {
            this.f16422b.unregisterListener(this.f16424d);
        }
        this.f16430k = z10;
    }

    private static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
