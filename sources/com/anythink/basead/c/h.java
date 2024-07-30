package com.anythink.basead.c;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public abstract class h implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3775a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f3776b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3777c = 2;

    /* renamed from: d, reason: collision with root package name */
    public float f3778d = gl.Code;

    /* renamed from: e, reason: collision with root package name */
    public float f3779e = gl.Code;
    public float f = gl.Code;

    /* renamed from: g, reason: collision with root package name */
    public long f3780g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f3781h = 10;

    /* renamed from: i, reason: collision with root package name */
    private long f3782i = com.anythink.expressad.exoplayer.f.f7962a;

    public final void a(int i10, long j10) {
        this.f3781h = i10;
        this.f3782i = j10;
    }

    public abstract boolean a();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (java.lang.Math.abs(r9 - r2) > r8.f3781h) goto L14;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSensorChanged(android.hardware.SensorEvent r9) {
        /*
            r8 = this;
            float[] r9 = r9.values
            r0 = 0
            r0 = r9[r0]
            float r0 = -r0
            r1 = 1
            r1 = r9[r1]
            float r1 = -r1
            r2 = 2
            r9 = r9[r2]
            float r9 = -r9
            float r2 = r8.f3778d
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L22
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.f3781h
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L22:
            float r2 = r8.f3779e
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L35
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.f3781h
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L35:
            float r2 = r8.f
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L5e
            float r2 = r9 - r2
            float r2 = java.lang.Math.abs(r2)
            int r3 = r8.f3781h
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5e
        L48:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r8.f3780g
            long r4 = r2 - r4
            long r6 = r8.f3782i
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L5e
            boolean r4 = r8.a()
            if (r4 == 0) goto L5e
            r8.f3780g = r2
        L5e:
            r8.f3778d = r0
            r8.f3779e = r1
            r8.f = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.c.h.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
