package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.7t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C07057t implements SensorEventListener {
    public C07057t() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = C07067u.A0A = sensorEvent.values;
        C07067u.A07();
    }
}
