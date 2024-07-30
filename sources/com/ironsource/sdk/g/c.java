package com.ironsource.sdk.g;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f26484a;

    /* renamed from: b, reason: collision with root package name */
    public String f26485b;

    /* renamed from: c, reason: collision with root package name */
    public int f26486c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, String> f26487d;

    /* renamed from: e, reason: collision with root package name */
    public int f26488e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public com.ironsource.sdk.j.a f26489g;

    /* renamed from: h, reason: collision with root package name */
    public com.ironsource.sdk.b f26490h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(com.ironsource.sdk.b r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f26021b
            java.lang.String r1 = r7.f26022c
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "instanceId"
            java.lang.String r4 = r7.f26021b
            r2.put(r3, r4)
            java.lang.String r3 = "instanceName"
            java.lang.String r4 = r7.f26022c
            r2.put(r3, r4)
            boolean r3 = r7.f26020a
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            java.lang.String r4 = "rewarded"
            r2.put(r4, r3)
            boolean r3 = r7.f26023d
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            java.lang.String r4 = "inAppBidding"
            r2.put(r4, r3)
            boolean r3 = r7.f26026h
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            java.lang.String r4 = "isOneFlow"
            r2.put(r4, r3)
            java.lang.String r3 = "apiVersion"
            java.lang.String r4 = "2"
            r2.put(r3, r4)
            com.ironsource.sdk.a r3 = r7.f26024e
            java.lang.String r4 = "0"
            if (r3 == 0) goto L4c
            int r3 = r3.f25981a
            java.lang.String r3 = java.lang.Integer.toString(r3)
            goto L4d
        L4c:
            r3 = r4
        L4d:
            java.lang.String r5 = "width"
            r2.put(r5, r3)
            com.ironsource.sdk.a r3 = r7.f26024e
            if (r3 == 0) goto L5c
            int r3 = r3.f25982b
            java.lang.String r4 = java.lang.Integer.toString(r3)
        L5c:
            java.lang.String r3 = "height"
            r2.put(r3, r4)
            com.ironsource.sdk.a r3 = r7.f26024e
            if (r3 == 0) goto L68
            java.lang.String r3 = r3.f25983c
            goto L6a
        L68:
            java.lang.String r3 = ""
        L6a:
            java.lang.String r4 = "label"
            r2.put(r4, r3)
            boolean r3 = r7.a()
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            java.lang.String r4 = "isBanner"
            r2.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f
            if (r3 == 0) goto L83
            r2.putAll(r3)
        L83:
            com.ironsource.sdk.j.a r3 = r7.f26025g
            r6.<init>(r0, r1, r2, r3)
            r6.f26490h = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.g.c.<init>(com.ironsource.sdk.b):void");
    }

    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f26485b);
        hashMap.put("demandSourceName", this.f26484a);
        Map<String, String> map = this.f26487d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public c(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.a aVar) {
        this.f26486c = -1;
        this.f26485b = str;
        this.f26484a = str2;
        this.f26487d = map;
        this.f26489g = aVar;
        this.f26488e = 0;
        this.f = false;
        this.f26490h = null;
    }

    public final synchronized void a(int i10) {
        this.f26488e = i10;
    }
}
