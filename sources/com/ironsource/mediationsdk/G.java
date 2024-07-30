package com.ironsource.mediationsdk;

/* loaded from: classes2.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final String f24798a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24799b;

    public G(String str, String str2) {
        zc.d.d(str, "appKey");
        zc.d.d(str2, "userId");
        this.f24798a = str;
        this.f24799b = str2;
    }

    public final String a() {
        return this.f24798a;
    }

    public final String b() {
        return this.f24799b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g6 = (G) obj;
        if (zc.d.a(this.f24798a, g6.f24798a) && zc.d.a(this.f24799b, g6.f24799b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24799b.hashCode() + (this.f24798a.hashCode() * 31);
    }

    public final String toString() {
        return "InitConfig(appKey=" + this.f24798a + ", userId=" + this.f24799b + ')';
    }
}
