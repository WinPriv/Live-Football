package com.ironsource.sdk.a;

import com.ironsource.sdk.g.d;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f25992a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25993b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f25994c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25995d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25996e;

    public e(int i10, String str, Map<String, Object> map, long j10, String str2) {
        this.f25992a = i10;
        this.f25993b = str;
        this.f25994c = map;
        this.f25995d = j10;
        this.f25996e = str2;
    }

    public int a() {
        return this.f25992a;
    }

    public String b() {
        return this.f25993b;
    }

    public Map<String, Object> c() {
        return this.f25994c;
    }

    public long d() {
        return this.f25995d;
    }

    public String e() {
        return this.f25996e;
    }

    public static d.e a(com.ironsource.sdk.g.c cVar, d.e eVar) {
        Map<String, String> map;
        return (cVar == null || (map = cVar.f26487d) == null || map.get("rewarded") == null) ? eVar : Boolean.parseBoolean(cVar.f26487d.get("rewarded")) ? d.e.RewardedVideo : d.e.Interstitial;
    }

    public static boolean a(com.ironsource.sdk.g.c cVar) {
        if (cVar == null || cVar.f26487d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.f26487d.get("inAppBidding"));
    }
}
