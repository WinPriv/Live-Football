package com.applovin.impl.sdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class j implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f19420a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f19421b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f19422c;

    /* renamed from: d, reason: collision with root package name */
    private final a f19423d;

    /* renamed from: e, reason: collision with root package name */
    private float f19424e;

    /* loaded from: classes.dex */
    public interface a {
        void d();

        void e();
    }

    public j(com.applovin.impl.sdk.p pVar, a aVar) {
        this.f19420a = pVar;
        SensorManager sensorManager = (SensorManager) com.applovin.impl.sdk.p.y().getSystemService("sensor");
        this.f19421b = sensorManager;
        this.f19422c = sensorManager.getDefaultSensor(1);
        this.f19423d = aVar;
    }

    public void a() {
        this.f19421b.unregisterListener(this);
        this.f19421b.registerListener(this, this.f19422c, (int) TimeUnit.MILLISECONDS.toMicros(50L));
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f19421b.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f = this.f19424e;
            float f10 = (max * 0.5f) + (f * 0.5f);
            this.f19424e = f10;
            if (f < 0.8f && f10 > 0.8f) {
                this.f19423d.e();
            } else if (f > -0.8f && f10 < -0.8f) {
                this.f19423d.d();
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
