package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;

/* loaded from: classes2.dex */
public final class o implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f22930s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f22931t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f22932u;

    public o(Context context, q1 q1Var, String str) {
        this.f22930s = context;
        this.f22931t = q1Var;
        this.f22932u = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.t(this.f22930s, this.f22931t, this.f22932u);
    }
}
