package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;

/* loaded from: classes2.dex */
public final class r implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f23002s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f23003t;

    public r(Context context, q1 q1Var) {
        this.f23002s = context;
        this.f23003t = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.Y(this.f23002s, this.f23003t);
    }
}
