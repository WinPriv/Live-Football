package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;

/* loaded from: classes2.dex */
public final class l implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f22887s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f22888t;

    public l(Context context, q1 q1Var) {
        this.f22887s = context;
        this.f22888t = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.j(this.f22887s, this.f22888t);
    }
}
