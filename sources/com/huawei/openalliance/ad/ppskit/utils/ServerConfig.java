package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import ka.n7;

@OuterVisible
/* loaded from: classes2.dex */
public class ServerConfig {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f22800a = "hms";

    /* renamed from: b, reason: collision with root package name */
    public static volatile String f22801b;

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final Context f22802s;

        public a(Context context) {
            this.f22802s = context.getApplicationContext();
        }

        @Override // java.lang.Runnable
        public final void run() {
            n7.e("ServerConfig", "init begin");
            Context context = this.f22802s;
            q1.m(context).R(a0.a.K(context).a());
            if (d0.m(context)) {
                g.e(context);
            }
        }
    }

    public static String a() {
        if (TextUtils.isEmpty(f22800a)) {
            return "hms";
        }
        return f22800a;
    }

    public static String b() {
        if (TextUtils.equals(a(), "hms")) {
            return "com.huawei.cloud.pps.kit";
        }
        return "com.huawei.cloud.pps";
    }

    @OuterVisible
    public static void init(Context context) {
        p2.b(new a(context.getApplicationContext()));
    }

    @OuterVisible
    public static void setGrsAppName(String str) {
        f22800a = str;
    }

    @OuterVisible
    public static void setRouterCountryCode(String str) {
        f22801b = str;
    }
}
