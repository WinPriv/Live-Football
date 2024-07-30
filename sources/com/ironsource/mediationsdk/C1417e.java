package com.ironsource.mediationsdk;

import com.applovin.sdk.AppLovinMediationProvider;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1417e {

    /* renamed from: c, reason: collision with root package name */
    public static final C1417e f25389c = new C1417e();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f25390a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f25391b;

    private C1417e() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        this.f25390a = concurrentHashMap;
        concurrentHashMap.put("adcolony", "4.1.6");
        concurrentHashMap.put("vungle", "4.1.5");
        concurrentHashMap.put("applovin", "4.3.3");
        concurrentHashMap.put(AppLovinMediationProvider.ADMOB, "4.3.2");
        ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.f25391b = concurrentHashMap2;
        concurrentHashMap2.put("adcolony", "4.1.6");
        concurrentHashMap2.put(AppLovinMediationProvider.ADMOB, "4.3.2");
        concurrentHashMap2.put("applovin", "4.3.3");
        concurrentHashMap2.put("chartboost", "4.1.9");
        concurrentHashMap2.put(AppLovinMediationProvider.FYBER, "4.1.0");
        concurrentHashMap2.put("hyprmx", "4.1.2");
        concurrentHashMap2.put("inmobi", "4.3.1");
        concurrentHashMap2.put("maio", "4.1.3");
        concurrentHashMap2.put("tapjoy", "4.0.0");
        concurrentHashMap2.put("unityads", "4.1.4");
        concurrentHashMap2.put("vungle", "4.1.5");
    }

    public static C1417e a() {
        return f25389c;
    }

    public static boolean b(AbstractAdapter abstractAdapter, ConcurrentHashMap concurrentHashMap, String str) {
        String lowerCase = abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH);
        if (!concurrentHashMap.containsKey(lowerCase)) {
            return true;
        }
        String str2 = (String) concurrentHashMap.get(lowerCase);
        String version = abstractAdapter.getVersion();
        boolean c10 = c(str2, version);
        if (!c10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(abstractAdapter.getProviderName());
            sb2.append(" adapter ");
            sb2.append(version);
            sb2.append(" is incompatible with SDK version ");
            sb2.append(IronSourceUtils.getSDKVersion());
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, a3.k.m(sb2, " for ", str, " ad unit, please update your adapter to the latest version"), 3);
        }
        return c10;
    }

    public static boolean c(String str, String str2) {
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i10 = 0; i10 < 3; i10++) {
            int parseInt = Integer.parseInt(split[i10]);
            int parseInt2 = Integer.parseInt(split2[i10]);
            if (parseInt2 < parseInt) {
                return false;
            }
            if (parseInt2 > parseInt) {
                return true;
            }
        }
        return true;
    }

    public final boolean a(AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return false;
        }
        String version = abstractAdapter.getVersion();
        boolean c10 = c("4.3.0", version);
        if (!c10) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + ", please update your adapter to the latest version", 3);
        }
        return c10;
    }
}
