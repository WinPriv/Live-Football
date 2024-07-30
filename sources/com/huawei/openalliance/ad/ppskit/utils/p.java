package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;

/* loaded from: classes2.dex */
public final class p implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f22939s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f22940t;

    public p(Context context, q1 q1Var) {
        this.f22939s = context;
        this.f22940t = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.l(this.f22939s, this.f22940t);
    }
}
