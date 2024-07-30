package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import ka.n7;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f22813s;

    public c(Context context) {
        this.f22813s = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n7.e("CoreAccountUtil", "Can't get accountInfo in ten seconds , retry");
        com.huawei.openalliance.ad.ppskit.handlers.x.k(1, this.f22813s);
    }
}
