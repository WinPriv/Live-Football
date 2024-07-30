package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f22526c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static e f22527d;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22528a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f22529b;

    public e(Context context) {
        this.f22529b = context.getApplicationContext().createDeviceProtectedStorageContext().getSharedPreferences("HiAd_preload_sp", 0);
    }
}
