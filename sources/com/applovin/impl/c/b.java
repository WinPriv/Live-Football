package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f17390a;

    /* renamed from: b, reason: collision with root package name */
    private final List<h> f17391b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17392c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<k> f17393d;

    private b(String str, List<h> list, String str2, Set<k> set) {
        this.f17390a = str;
        this.f17391b = list;
        this.f17392c = str2;
        this.f17393d = set;
    }

    public static b a(t tVar, e eVar, p pVar) {
        try {
            String str = tVar.b().get("vendor");
            t c10 = tVar.c("VerificationParameters");
            String c11 = c10 != null ? c10.c() : null;
            List<t> a10 = tVar.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a10.size());
            Iterator<t> it = a10.iterator();
            while (it.hasNext()) {
                h a11 = h.a(it.next(), pVar);
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            Map map = CollectionUtils.map();
            m.a(tVar, (Map<String, Set<k>>) map, eVar, pVar);
            return new b(str, arrayList, c11, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("VastAdVerification", "Error occurred while initializing", th);
            }
            return null;
        }
    }

    public List<h> b() {
        return this.f17391b;
    }

    public String c() {
        return this.f17392c;
    }

    public Set<k> d() {
        return this.f17393d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f17390a;
        if (str == null ? bVar.f17390a != null : !str.equals(bVar.f17390a)) {
            return false;
        }
        List<h> list = this.f17391b;
        if (list == null ? bVar.f17391b != null : !list.equals(bVar.f17391b)) {
            return false;
        }
        String str2 = this.f17392c;
        if (str2 == null ? bVar.f17392c != null : !str2.equals(bVar.f17392c)) {
            return false;
        }
        Set<k> set = this.f17393d;
        Set<k> set2 = bVar.f17393d;
        if (set != null) {
            return set.equals(set2);
        }
        if (set2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        String str = this.f17390a;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = i10 * 31;
        List<h> list = this.f17391b;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str2 = this.f17392c;
        if (str2 != null) {
            i12 = str2.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        Set<k> set = this.f17393d;
        if (set != null) {
            i13 = set.hashCode();
        }
        return i16 + i13;
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f17390a + "'javascriptResources='" + this.f17391b + "'verificationParameters='" + this.f17392c + "'errorEventTrackers='" + this.f17393d + "'}";
    }

    public String a() {
        return this.f17390a;
    }
}
