package com.applovin.impl.sdk.d;

import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f18768a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18769b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f18770c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18771d;

    public a(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f18768a;
    }

    public String b() {
        return this.f18769b;
    }

    public Map<String, String> c() {
        return this.f18770c;
    }

    public boolean d() {
        return this.f18771d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f18768a + "', backupUrl='" + this.f18769b + "', headers='" + this.f18770c + "', shouldFireInWebView='" + this.f18771d + "'}";
    }

    public a(String str, String str2, Map<String, String> map, boolean z10) {
        this.f18768a = str;
        this.f18769b = str2;
        this.f18770c = map;
        this.f18771d = z10;
    }
}
