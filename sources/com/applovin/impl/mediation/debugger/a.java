package com.applovin.impl.mediation.debugger;

import com.applovin.impl.mediation.debugger.c.a;
import com.applovin.impl.mediation.debugger.c.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class a implements a.InterfaceC0209a, b.a {

    /* renamed from: a, reason: collision with root package name */
    private final p f17894a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0206a f17895b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.b.a f17896c;

    /* renamed from: com.applovin.impl.mediation.debugger.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0206a {
        void a(b bVar);

        void a(com.applovin.impl.mediation.debugger.b.b.a aVar);
    }

    /* loaded from: classes.dex */
    public enum b {
        DEVELOPER_URI_NOT_FOUND,
        APPADSTXT_NOT_FOUND
    }

    public a(p pVar, InterfaceC0206a interfaceC0206a) {
        this.f17894a = pVar;
        this.f17895b = interfaceC0206a;
    }

    public void a() {
        com.applovin.impl.mediation.debugger.b.b.a aVar = this.f17896c;
        if (aVar != null) {
            this.f17895b.a(aVar);
        } else {
            this.f17894a.M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.debugger.c.b(this.f17894a, this));
        }
    }

    @Override // com.applovin.impl.mediation.debugger.c.a.InterfaceC0209a
    public void b(String str) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("\n");
        int length = split.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            com.applovin.impl.mediation.debugger.b.b.b bVar = new com.applovin.impl.mediation.debugger.b.b.b(split[i11], i10);
            if (bVar.g()) {
                String a10 = bVar.a();
                List arrayList2 = hashMap.containsKey(a10) ? (List) hashMap.get(a10) : new ArrayList();
                if (arrayList2 != null) {
                    arrayList2.add(bVar);
                    hashMap.put(a10, arrayList2);
                }
            } else {
                arrayList.add(bVar);
            }
            i11++;
            i10 = i12;
        }
        this.f17896c = new com.applovin.impl.mediation.debugger.b.b.a(hashMap, arrayList);
        this.f17894a.L();
        if (y.a()) {
            this.f17894a.L().b("AppAdsTxtService", "app-ads.txt fetched: " + this.f17896c);
        }
        this.f17895b.a(this.f17896c);
    }

    @Override // com.applovin.impl.mediation.debugger.c.b.a
    public void a(String str) {
        this.f17894a.M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.debugger.c.a(this.f17894a, str, this));
    }

    @Override // com.applovin.impl.mediation.debugger.c.b.a
    public void a(b bVar) {
        this.f17895b.a(bVar);
    }

    @Override // com.applovin.impl.mediation.debugger.c.a.InterfaceC0209a
    public void b(b bVar) {
        this.f17895b.a(bVar);
    }
}
