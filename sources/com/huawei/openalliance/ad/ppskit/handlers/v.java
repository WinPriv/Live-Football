package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f22633c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static v f22634d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22635a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22636b = new byte[0];

    public v(Context context) {
        this.f22635a = context.getApplicationContext().createDeviceProtectedStorageContext();
    }

    public final void a(Integer num) {
        if (num != null && num.intValue() >= 0) {
            synchronized (this.f22636b) {
                SharedPreferences.Editor edit = this.f22635a.getSharedPreferences("HiAd_interval_cache_sp", 0).edit();
                edit.putInt("display_ad_min_time_sleep", num.intValue());
                edit.commit();
            }
        }
    }

    public final void b(Integer num) {
        if (num != null && num.intValue() >= 0) {
            synchronized (this.f22636b) {
                SharedPreferences.Editor edit = this.f22635a.getSharedPreferences("HiAd_interval_cache_sp", 0).edit();
                edit.putInt("display_ad_min_time_close", num.intValue());
                edit.commit();
            }
        }
    }
}
