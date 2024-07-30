package com.huawei.openalliance.ad.ppskit.utils;

import android.location.LocationListener;

/* loaded from: classes2.dex */
public final class b1 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LocationListener f22811s;

    public b1(a1 a1Var) {
        this.f22811s = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c1.c(this.f22811s);
    }
}
