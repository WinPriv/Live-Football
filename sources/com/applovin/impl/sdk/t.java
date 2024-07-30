package com.applovin.impl.sdk;

import android.content.pm.PackageInfo;
import android.os.Build;
import com.applovin.sdk.AppLovinSdk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    protected final p f19362a;

    /* renamed from: b, reason: collision with root package name */
    protected final y f19363b;

    /* loaded from: classes.dex */
    public enum a {
        BLACK_VIEW("black_view"),
        CRASH("crash");


        /* renamed from: c, reason: collision with root package name */
        private final String f19367c;

        a(String str) {
            this.f19367c = str;
        }

        public String a() {
            return this.f19367c;
        }
    }

    public t(p pVar) {
        this.f19362a = pVar;
        this.f19363b = pVar.L();
    }

    private Map<String, String> a(String str, Map<String, String> map) {
        HashMap t10 = a3.l.t("type", str);
        if (this.f19362a.S() != null) {
            t10.put("platform", this.f19362a.Q().v());
        } else {
            t10.put("platform", this.f19362a.R().f());
        }
        t10.put("applovin_random_token", this.f19362a.q());
        t10.put("compass_random_token", this.f19362a.p());
        t10.put("model", Build.MODEL);
        t10.put("brand", Build.MANUFACTURER);
        t10.put("brand_name", Build.BRAND);
        t10.put("hardware", Build.HARDWARE);
        t10.put("revision", Build.DEVICE);
        t10.put("os", Build.VERSION.RELEASE);
        t10.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        t10.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        t10.put("aei", String.valueOf(this.f19362a.a(com.applovin.impl.sdk.c.b.ax)));
        t10.put("mei", String.valueOf(this.f19362a.a(com.applovin.impl.sdk.c.b.ay)));
        a(t10);
        b(t10);
        if (map != null) {
            t10.putAll(map);
        }
        return t10;
    }

    private void b(Map<String, String> map) {
        Object c10 = this.f19362a.Z().c();
        if (c10 instanceof com.applovin.impl.sdk.ad.e) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.e) c10).getAdIdNumber()));
        } else if (c10 instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) c10;
            map.put("fs_ad_network", aVar.getNetworkName());
            map.put("fs_ad_creative_id", aVar.getCreativeId());
        } else {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
        }
    }

    public void a(a aVar, Map<String, String> map) {
        if (y.a()) {
            this.f19363b.b("ErrorReporter", "Reporting " + aVar.a() + " error...");
        }
        this.f19362a.al().a(com.applovin.impl.sdk.network.j.o().c("https://ms.applovin.com/1.0/sdk/error").a(false).b("POST").a(a(aVar.a(), map)).a());
    }

    private void a(Map<String, String> map) {
        PackageInfo packageInfo;
        try {
            packageInfo = p.y().getPackageManager().getPackageInfo(p.y().getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", String.valueOf(packageInfo != null ? packageInfo.versionCode : 0));
    }
}
