package com.anythink.expressad.foundation.g.f.c;

import a3.l;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f9922a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9923b;

    public c(String str, String str2) {
        this.f9922a = str;
        this.f9923b = str2;
    }

    public final String a() {
        return this.f9922a;
    }

    public final String b() {
        return this.f9923b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (TextUtils.equals(this.f9922a, cVar.f9922a) && TextUtils.equals(this.f9923b, cVar.f9923b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9923b.hashCode() + (this.f9922a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.f9922a);
        sb2.append(",value=");
        return l.p(sb2, this.f9923b, "]");
    }
}
