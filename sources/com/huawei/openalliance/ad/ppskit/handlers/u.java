package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.ads.jsb.constant.Constant;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f22629c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static u f22630d;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22631a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final Context f22632b;

    public u(Context context) {
        this.f22632b = context.createDeviceProtectedStorageContext();
    }

    public static u a(Context context) {
        u uVar;
        synchronized (f22629c) {
            if (f22630d == null) {
                f22630d = new u(context);
            }
            uVar = f22630d;
        }
        return uVar;
    }

    public final String b() {
        String string;
        synchronized (this.f22631a) {
            string = this.f22632b.getSharedPreferences("HiAd_adsUUID", 4).getString(Constant.MAP_KEY_UUID, "");
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString();
                synchronized (this.f22631a) {
                    SharedPreferences.Editor edit = this.f22632b.getSharedPreferences("HiAd_adsUUID", 4).edit();
                    edit.putString(Constant.MAP_KEY_UUID, string);
                    edit.apply();
                }
            }
        }
        return string;
    }
}
