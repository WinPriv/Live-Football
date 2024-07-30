package com.ironsource.mediationsdk;

/* renamed from: com.ironsource.mediationsdk.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1429t {

    /* renamed from: a, reason: collision with root package name */
    public final String f25864a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25865b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25866c;

    public C1429t(String str, String str2, String str3) {
        zc.d.d(str, "cachedAppKey");
        zc.d.d(str2, "cachedUserId");
        zc.d.d(str3, "cachedSettings");
        this.f25864a = str;
        this.f25865b = str2;
        this.f25866c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1429t)) {
            return false;
        }
        C1429t c1429t = (C1429t) obj;
        if (zc.d.a(this.f25864a, c1429t.f25864a) && zc.d.a(this.f25865b, c1429t.f25865b) && zc.d.a(this.f25866c, c1429t.f25866c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25866c.hashCode() + e0.i.b(this.f25865b, this.f25864a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CachedResponse(cachedAppKey=" + this.f25864a + ", cachedUserId=" + this.f25865b + ", cachedSettings=" + this.f25866c + ')';
    }
}
