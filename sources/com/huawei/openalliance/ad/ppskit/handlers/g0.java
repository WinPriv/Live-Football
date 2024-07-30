package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: c, reason: collision with root package name */
    public static g0 f22540c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22541d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f22542a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22543b = new byte[0];

    public g0(Context context) {
        this.f22542a = context.getApplicationContext().createDeviceProtectedStorageContext().getSharedPreferences("HiAd_InsAppsSharedPreferences", 0);
    }

    public static g0 a(Context context) {
        g0 g0Var;
        synchronized (f22541d) {
            if (f22540c == null) {
                f22540c = new g0(context);
            }
            g0Var = f22540c;
        }
        return g0Var;
    }

    public final void b(String str) {
        synchronized (this.f22543b) {
            this.f22542a.edit().putString("INS_APPS_ENCODED", str).commit();
        }
    }
}
