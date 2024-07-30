package com.applovin.impl.sdk.b;

import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f18672a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f18673b;

    private c(String str, Map<String, String> map) {
        this.f18672a = str;
        this.f18673b = map;
    }

    public static c a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f18672a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f18672a + "'params='" + this.f18673b + "'}";
    }

    public static c a(String str, Map<String, String> map) {
        return new c(str, map);
    }

    public Map<String, String> a() {
        return this.f18673b;
    }
}
