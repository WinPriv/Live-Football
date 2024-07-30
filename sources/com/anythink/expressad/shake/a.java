package com.anythink.expressad.shake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.anythink.core.common.b.n;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f10871c;

    /* renamed from: a, reason: collision with root package name */
    Sensor f10872a;

    /* renamed from: b, reason: collision with root package name */
    private SensorManager f10873b;

    private a() {
        Context g6 = n.a().g();
        if (g6 != null) {
            try {
                if (this.f10873b == null) {
                    this.f10873b = (SensorManager) g6.getSystemService("sensor");
                }
                if (this.f10872a == null) {
                    this.f10872a = this.f10873b.getDefaultSensor(1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static a a() {
        if (f10871c == null) {
            synchronized (a.class) {
                if (f10871c == null) {
                    f10871c = new a();
                }
            }
        }
        return f10871c;
    }

    public final boolean b() {
        return this.f10872a != null;
    }

    public final void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f10873b;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(SensorEventListener sensorEventListener) {
        try {
            this.f10873b.registerListener(sensorEventListener, this.f10872a, 2);
        } catch (Throwable unused) {
        }
    }
}
