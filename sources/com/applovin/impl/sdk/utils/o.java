package com.applovin.impl.sdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.huawei.hms.ads.gl;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class o implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final int f19518a;

    /* renamed from: b, reason: collision with root package name */
    private final float f19519b;

    /* renamed from: c, reason: collision with root package name */
    private final SensorManager f19520c;

    /* renamed from: d, reason: collision with root package name */
    private final Sensor f19521d;

    /* renamed from: e, reason: collision with root package name */
    private final Sensor f19522e;
    private final com.applovin.impl.sdk.p f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f19523g;

    /* renamed from: h, reason: collision with root package name */
    private float f19524h;

    public o(com.applovin.impl.sdk.p pVar) {
        this.f = pVar;
        SensorManager sensorManager = (SensorManager) com.applovin.impl.sdk.p.y().getSystemService("sensor");
        this.f19520c = sensorManager;
        this.f19521d = sensorManager.getDefaultSensor(9);
        this.f19522e = sensorManager.getDefaultSensor(4);
        this.f19518a = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.em)).intValue();
        this.f19519b = ((Float) pVar.a(com.applovin.impl.sdk.c.b.el)).floatValue();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a() {
        this.f19520c.unregisterListener(this);
        if (((Boolean) this.f.N().a(com.applovin.impl.sdk.c.b.ej)).booleanValue()) {
            this.f19520c.registerListener(this, this.f19521d, (int) TimeUnit.MILLISECONDS.toMicros(this.f19518a));
        }
        if (((Boolean) this.f.N().a(com.applovin.impl.sdk.c.b.ek)).booleanValue()) {
            this.f19520c.registerListener(this, this.f19522e, (int) TimeUnit.MILLISECONDS.toMicros(this.f19518a));
        }
    }

    public float b() {
        return this.f19524h;
    }

    public float c() {
        if (this.f19523g == null) {
            return gl.Code;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f19520c.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f19523g = sensorEvent.values;
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f = this.f19524h * this.f19519b;
            this.f19524h = f;
            this.f19524h = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[0]) + f;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
