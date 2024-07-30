package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f17427a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17428b;

    private h(String str, String str2) {
        this.f17427a = str;
        this.f17428b = str2;
    }

    public static h a(t tVar, p pVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar != null) {
            try {
                return new h(tVar.b().get("apiFramework"), tVar.c());
            } catch (Throwable th) {
                pVar.L();
                if (!y.a()) {
                    return null;
                }
                pVar.L().b("VastJavaScriptResource", "Error occurred while initializing", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public String b() {
        return this.f17428b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f17427a;
        if (str == null ? hVar.f17427a != null : !str.equals(hVar.f17427a)) {
            return false;
        }
        String str2 = this.f17428b;
        String str3 = hVar.f17428b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String str = this.f17427a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f17428b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastJavaScriptResource{apiFramework='");
        sb2.append(this.f17427a);
        sb2.append("', javascriptResourceUrl='");
        return a3.l.p(sb2, this.f17428b, "'}");
    }

    public String a() {
        return this.f17427a;
    }
}
