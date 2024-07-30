package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class a0 {
    public static a0 f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f22496g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f22497a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f22498b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f22499c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f22500d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f22501e = new byte[0];

    public a0(Context context) {
        Context createDeviceProtectedStorageContext = context.getApplicationContext().createDeviceProtectedStorageContext();
        this.f22497a = createDeviceProtectedStorageContext;
        this.f22498b = createDeviceProtectedStorageContext.getSharedPreferences("HiAd_AppDataSharedPreferences", 0);
        this.f22499c = createDeviceProtectedStorageContext.getSharedPreferences("HiAd_AppDataSharedPreferences_sec", 0);
    }
}
