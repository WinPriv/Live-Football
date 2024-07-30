package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.y;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f19532a;

    /* renamed from: b, reason: collision with root package name */
    private String f19533b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19534c = a(com.applovin.impl.sdk.c.d.f18742j, (String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.f18741i, (Object) null, com.applovin.impl.sdk.p.y()));

    /* renamed from: d, reason: collision with root package name */
    private final String f19535d;

    public q(com.applovin.impl.sdk.p pVar) {
        this.f19532a = pVar;
        this.f19535d = a(com.applovin.impl.sdk.c.d.f18743k, (String) pVar.a(com.applovin.impl.sdk.c.b.f18706ad));
        a(d());
    }

    private String a(com.applovin.impl.sdk.c.d<String> dVar, String str) {
        String str2 = (String) com.applovin.impl.sdk.c.e.b(dVar, (Object) null, com.applovin.impl.sdk.p.y());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        com.applovin.impl.sdk.c.e.a(dVar, str, com.applovin.impl.sdk.p.y());
        return str;
    }

    private String d() {
        if (!((Boolean) this.f19532a.a(com.applovin.impl.sdk.c.b.dS)).booleanValue()) {
            this.f19532a.b(com.applovin.impl.sdk.c.d.f18740h);
        }
        String str = (String) this.f19532a.a(com.applovin.impl.sdk.c.d.f18740h);
        if (StringUtils.isValidString(str)) {
            this.f19532a.L();
            if (y.a()) {
                this.f19532a.L().b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
            }
            return str;
        }
        return null;
    }

    public String b() {
        return this.f19534c;
    }

    public String c() {
        return this.f19535d;
    }

    public void a(String str) {
        if (((Boolean) this.f19532a.a(com.applovin.impl.sdk.c.b.dS)).booleanValue()) {
            this.f19532a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.f18740h, (com.applovin.impl.sdk.c.d<String>) str);
        }
        this.f19533b = str;
        Bundle bundle = new Bundle(2);
        bundle.putString("user_id", StringUtils.emptyIfNull(str));
        bundle.putString("applovin_random_token", c());
        this.f19532a.ab().a(bundle, "user_info");
    }

    public static String a(com.applovin.impl.sdk.p pVar) {
        com.applovin.impl.sdk.c.d<String> dVar = com.applovin.impl.sdk.c.d.f18744l;
        String str = (String) pVar.a(dVar);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        pVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) dVar, (com.applovin.impl.sdk.c.d<String>) valueOf);
        return valueOf;
    }

    public String a() {
        return this.f19533b;
    }
}
