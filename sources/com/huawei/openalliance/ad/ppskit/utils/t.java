package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;

/* loaded from: classes2.dex */
public final class t implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f23021s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f23022t;

    public t(Context context, q1 q1Var) {
        this.f23021s = context;
        this.f23022t = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.d(this.f23021s, this.f23022t);
    }
}
