package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<b> f17394a;

    private c(List<b> list) {
        this.f17394a = list;
    }

    public static c a(t tVar, c cVar, e eVar, p pVar) {
        try {
            List<b> a10 = cVar != null ? cVar.a() : new ArrayList<>();
            Iterator<t> it = tVar.a("Verification").iterator();
            while (it.hasNext()) {
                b a11 = b.a(it.next(), eVar, pVar);
                if (a11 != null) {
                    a10.add(a11);
                }
            }
            return new c(a10);
        } catch (Throwable th) {
            pVar.L();
            if (!y.a()) {
                return null;
            }
            pVar.L().b("VastAdVerifications", "Error occurred while initializing", th);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f17394a.equals(((c) obj).f17394a);
    }

    public int hashCode() {
        return this.f17394a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f17394a + "'}";
    }

    public List<b> a() {
        return this.f17394a;
    }
}
