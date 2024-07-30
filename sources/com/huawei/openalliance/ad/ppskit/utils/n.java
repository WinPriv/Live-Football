package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;

/* loaded from: classes2.dex */
public final class n implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f22926s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f22927t;

    public n(Context context, q1 q1Var) {
        this.f22926s = context;
        this.f22927t = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.k(this.f22926s, this.f22927t);
    }
}
