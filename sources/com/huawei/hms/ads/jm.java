package com.huawei.hms.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes2.dex */
public class jm implements SensorEventListener {
    private static final String Code = "PhoneAccelerometerDetec";
    private static final float V = 9.80665f;
    private a B;
    private SensorManager I;
    private Sensor Z;

    /* loaded from: classes2.dex */
    public interface a {
        void Code(float f, float f10, float f11);
    }

    public jm(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.I = sensorManager;
        this.Z = sensorManager.getDefaultSensor(1);
    }

    public void Code() {
        Sensor sensor = this.Z;
        if (sensor != null) {
            this.I.registerListener(this, sensor, 2);
        }
    }

    public void V() {
        try {
            this.I.unregisterListener(this, this.Z);
        } catch (Throwable th) {
            ex.I(Code, "unregister err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (1 == sensorEvent.sensor.getType()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            ex.Code(Code, "onSensorChanged x:" + f + " y:" + f10 + " z:" + f11);
            a aVar = this.B;
            if (aVar != null) {
                aVar.Code(f, f10, f11);
            }
        }
    }

    public void Code(a aVar) {
        this.B = aVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
