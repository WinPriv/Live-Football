package com.onesignal;

import android.view.animation.Interpolator;

/* compiled from: OneSignalBounceInterpolator.java */
/* loaded from: classes2.dex */
public final class m3 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final double f26925a;

    /* renamed from: b, reason: collision with root package name */
    public final double f26926b;

    public m3() {
        this.f26925a = 1.0d;
        this.f26926b = 10.0d;
        this.f26925a = 0.1d;
        this.f26926b = 8.0d;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.cos(this.f26926b * f) * Math.pow(2.718281828459045d, (-f) / this.f26925a) * (-1.0d)) + 1.0d);
    }
}
