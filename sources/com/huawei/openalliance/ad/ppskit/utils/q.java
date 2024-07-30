package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;

/* loaded from: classes2.dex */
public final class q implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f22958s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f22959t;

    public q(Context context, q1 q1Var) {
        this.f22958s = context;
        this.f22959t = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.m(this.f22958s, this.f22959t);
    }
}
