package com.applovin.impl.a.a.a;

import com.applovin.impl.sdk.ad.e;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f16906a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f16907b;

    /* renamed from: c, reason: collision with root package name */
    private String f16908c;

    /* renamed from: d, reason: collision with root package name */
    private String f16909d;

    public a(Object obj, long j10) {
        String str;
        this.f16907b = obj;
        this.f16906a = j10;
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.getAdZone().b() != null) {
                str = eVar.getAdZone().b().getLabel();
            } else {
                str = null;
            }
            this.f16908c = str;
            this.f16909d = "AppLovin";
            return;
        }
        if (obj instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) obj;
            this.f16908c = aVar.getFormat().getLabel();
            this.f16909d = aVar.getNetworkName();
        }
    }

    public String a() {
        String str = this.f16908c;
        if (str == null) {
            return "Unknown";
        }
        return str;
    }

    public String b() {
        String str = this.f16909d;
        if (str == null) {
            return "Unknown";
        }
        return str;
    }

    public Object c() {
        return this.f16907b;
    }

    public long d() {
        return this.f16906a;
    }
}
