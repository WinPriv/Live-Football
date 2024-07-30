package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class w implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f23050s;

    public w(Context context) {
        this.f23050s = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f23050s;
        Settings.Global.putInt(context.getContentResolver(), "ex_splash_func_status", 0);
        Settings.Global.putString(context.getContentResolver(), "ex_splash_list", "");
    }
}
