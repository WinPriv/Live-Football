package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import ka.n7;

/* loaded from: classes2.dex */
public final class z0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f23072s;

    public z0(Context context) {
        this.f23072s = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c1.b(this.f23072s);
        } catch (Throwable th) {
            n7.i("LocationUtils", "loc_tag asyncLocation exception: ".concat(th.getClass().getSimpleName()));
        }
    }
}
