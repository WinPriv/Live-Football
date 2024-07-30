package com.applovin.impl.mediation.debugger.b.b;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<b>> f17944a;

    /* renamed from: b, reason: collision with root package name */
    private final List<b> f17945b;

    public a(Map<String, List<b>> map, List<b> list) {
        this.f17944a = map;
        this.f17945b = list;
    }

    public boolean a(Object obj) {
        return obj instanceof a;
    }

    public List<b> b() {
        return this.f17945b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!aVar.a(this)) {
            return false;
        }
        Map<String, List<b>> a10 = a();
        Map<String, List<b>> a11 = aVar.a();
        if (a10 != null ? !a10.equals(a11) : a11 != null) {
            return false;
        }
        List<b> b10 = b();
        List<b> b11 = aVar.b();
        if (b10 != null ? b10.equals(b11) : b11 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Map<String, List<b>> a10 = a();
        int i10 = 43;
        if (a10 == null) {
            hashCode = 43;
        } else {
            hashCode = a10.hashCode();
        }
        List<b> b10 = b();
        int i11 = (hashCode + 59) * 59;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map<String, List<b>> a() {
        return this.f17944a;
    }
}
