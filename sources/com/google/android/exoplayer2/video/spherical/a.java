package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.huawei.hms.ads.gl;
import f6.c;

/* compiled from: OrientationListener.java */
/* loaded from: classes2.dex */
public final class a implements SensorEventListener {

    /* renamed from: s, reason: collision with root package name */
    public final float[] f20410s = new float[16];

    /* renamed from: t, reason: collision with root package name */
    public final float[] f20411t = new float[16];

    /* renamed from: u, reason: collision with root package name */
    public final float[] f20412u = new float[16];

    /* renamed from: v, reason: collision with root package name */
    public final float[] f20413v = new float[3];

    /* renamed from: w, reason: collision with root package name */
    public final Display f20414w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC0235a[] f20415x;
    public boolean y;

    /* compiled from: OrientationListener.java */
    /* renamed from: com.google.android.exoplayer2.video.spherical.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0235a {
        void a(float[] fArr, float f);
    }

    public a(Display display, InterfaceC0235a... interfaceC0235aArr) {
        this.f20414w = display;
        this.f20415x = interfaceC0235aArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f20410s;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f20414w.getRotation();
        float[] fArr3 = this.f20411t;
        if (rotation != 0) {
            int i11 = com.anythink.expressad.video.module.a.a.T;
            if (rotation != 1) {
                i10 = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i11 = 130;
                        i10 = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i10 = 129;
                i11 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i11, i10, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f20413v;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(this.f20410s, 0, 90.0f, 1.0f, gl.Code, gl.Code);
        float[] fArr5 = this.f20410s;
        if (!this.y) {
            c.a(this.f20412u, fArr5);
            this.y = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.f20411t, 0, this.f20412u, 0);
        for (InterfaceC0235a interfaceC0235a : this.f20415x) {
            interfaceC0235a.a(fArr2, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
