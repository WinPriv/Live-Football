package com.applovin.exoplayer2.m.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f16393a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f16394b;

    /* renamed from: c, reason: collision with root package name */
    private final float[] f16395c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f16396d;

    /* renamed from: e, reason: collision with root package name */
    private final Display f16397e;
    private final a[] f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16398g;

    /* loaded from: classes.dex */
    public interface a {
        void a(float[] fArr, float f);
    }

    private void a(float[] fArr, float f) {
        for (a aVar : this.f) {
            aVar.a(fArr, f);
        }
    }

    private float b(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f16394b);
        SensorManager.getOrientation(this.f16394b, this.f16396d);
        return this.f16396d[2];
    }

    private static void c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, gl.Code, gl.Code);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f16393a, sensorEvent.values);
        a(this.f16393a, this.f16397e.getRotation());
        float b10 = b(this.f16393a);
        c(this.f16393a);
        a(this.f16393a);
        a(this.f16393a, b10);
    }

    private void a(float[] fArr) {
        if (!this.f16398g) {
            c.a(this.f16395c, fArr);
            this.f16398g = true;
        }
        float[] fArr2 = this.f16394b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f16394b, 0, this.f16395c, 0);
    }

    private void a(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = com.anythink.expressad.video.module.a.a.T;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f16394b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f16394b, i11, i12, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
