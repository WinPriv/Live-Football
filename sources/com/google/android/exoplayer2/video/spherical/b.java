package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.a;
import com.huawei.hms.ads.gl;

/* compiled from: TouchTracker.java */
/* loaded from: classes2.dex */
public final class b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, a.InterfaceC0235a {

    /* renamed from: u, reason: collision with root package name */
    public final a f20418u;

    /* renamed from: w, reason: collision with root package name */
    public final GestureDetector f20420w;

    /* renamed from: s, reason: collision with root package name */
    public final PointF f20416s = new PointF();

    /* renamed from: t, reason: collision with root package name */
    public final PointF f20417t = new PointF();

    /* renamed from: v, reason: collision with root package name */
    public final float f20419v = 25.0f;

    /* renamed from: x, reason: collision with root package name */
    public volatile float f20421x = 3.1415927f;

    /* compiled from: TouchTracker.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public b(Context context, SphericalGLSurfaceView.a aVar) {
        this.f20418u = aVar;
        this.f20420w = new GestureDetector(context, this);
    }

    @Override // com.google.android.exoplayer2.video.spherical.a.InterfaceC0235a
    public final void a(float[] fArr, float f) {
        this.f20421x = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f20416s.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f10) {
        float x10 = (motionEvent2.getX() - this.f20416s.x) / this.f20419v;
        float y = motionEvent2.getY();
        PointF pointF = this.f20416s;
        float f11 = (y - pointF.y) / this.f20419v;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f20421x;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f20417t;
        pointF2.x -= (cos * x10) - (sin * f11);
        float f12 = (cos * f11) + (sin * x10) + pointF2.y;
        pointF2.y = f12;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f12));
        a aVar = this.f20418u;
        PointF pointF3 = this.f20417t;
        SphericalGLSurfaceView.a aVar2 = (SphericalGLSurfaceView.a) aVar;
        synchronized (aVar2) {
            float f13 = pointF3.y;
            aVar2.y = f13;
            Matrix.setRotateM(aVar2.f20407w, 0, -f13, (float) Math.cos(aVar2.f20409z), (float) Math.sin(aVar2.f20409z), gl.Code);
            Matrix.setRotateM(aVar2.f20408x, 0, -pointF3.x, gl.Code, 1.0f, gl.Code);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return SphericalGLSurfaceView.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f20420w.onTouchEvent(motionEvent);
    }
}
