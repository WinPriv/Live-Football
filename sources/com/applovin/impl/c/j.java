package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private String f17437a;

    /* renamed from: b, reason: collision with root package name */
    private String f17438b;

    private j() {
    }

    public static j a(t tVar, j jVar, p pVar) {
        if (tVar != null) {
            if (pVar != null) {
                if (jVar == null) {
                    try {
                        jVar = new j();
                    } catch (Throwable th) {
                        pVar.L();
                        if (y.a()) {
                            pVar.L().b("VastSystemInfo", "Error occurred while initializing", th);
                            return null;
                        }
                        return null;
                    }
                }
                if (!StringUtils.isValidString(jVar.f17437a)) {
                    String c10 = tVar.c();
                    if (StringUtils.isValidString(c10)) {
                        jVar.f17437a = c10;
                    }
                }
                if (!StringUtils.isValidString(jVar.f17438b)) {
                    String str = tVar.b().get("version");
                    if (StringUtils.isValidString(str)) {
                        jVar.f17438b = str;
                    }
                }
                return jVar;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f17437a;
        if (str == null ? jVar.f17437a != null : !str.equals(jVar.f17437a)) {
            return false;
        }
        String str2 = this.f17438b;
        String str3 = jVar.f17438b;
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
        String str = this.f17437a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f17438b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastSystemInfo{name='");
        sb2.append(this.f17437a);
        sb2.append("', version='");
        return a3.l.p(sb2, this.f17438b, "'}");
    }
}
