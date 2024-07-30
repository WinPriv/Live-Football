package com.applovin.exoplayer2.m.a;

import android.opengl.Matrix;
import com.applovin.exoplayer2.l.af;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final af<float[]> f16391a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16392b;

    public void a(long j10, float[] fArr) {
        this.f16391a.a(j10, (long) fArr);
    }

    public void a() {
        this.f16391a.a();
        this.f16392b = false;
    }

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f10 = fArr2[8];
        float sqrt = (float) Math.sqrt((f10 * f10) + (f * f));
        float f11 = fArr2[10];
        fArr[0] = f11 / sqrt;
        float f12 = fArr2[8];
        fArr[2] = f12 / sqrt;
        fArr[8] = (-f12) / sqrt;
        fArr[10] = f11 / sqrt;
    }
}
