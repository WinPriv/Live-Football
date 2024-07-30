package com.ironsource.sdk;

import java.util.Map;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26020a;

    /* renamed from: b, reason: collision with root package name */
    public String f26021b;

    /* renamed from: c, reason: collision with root package name */
    public String f26022c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26023d;

    /* renamed from: e, reason: collision with root package name */
    public a f26024e;
    public Map<String, String> f;

    /* renamed from: g, reason: collision with root package name */
    public com.ironsource.sdk.j.a f26025g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26026h;

    public b(String str, String str2, boolean z10, boolean z11, boolean z12, Map<String, String> map, com.ironsource.sdk.j.a aVar, a aVar2) {
        this.f26021b = str;
        this.f26022c = str2;
        this.f26020a = z10;
        this.f26023d = z11;
        this.f = map;
        this.f26025g = aVar;
        this.f26024e = aVar2;
        this.f26026h = z12;
    }

    public final boolean a() {
        boolean z10;
        a aVar = this.f26024e;
        if (aVar != null) {
            if (aVar.f25982b > 0 && aVar.f25981a > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
