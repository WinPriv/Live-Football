package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;

/* loaded from: classes2.dex */
public final class s implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f23009s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f23010t;

    public s(Context context, q1 q1Var) {
        this.f23009s = context;
        this.f23010t = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.c(this.f23009s, this.f23010t);
    }
}
