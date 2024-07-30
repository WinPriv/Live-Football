package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.7s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C07047s implements SensorEventListener {
    public C07047s() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C07067u.A0D(sensorEvent.values);
        C07067u.A04();
    }
}
