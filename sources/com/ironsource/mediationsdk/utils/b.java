package com.ironsource.mediationsdk.utils;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25883a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25884b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25885c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25886d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25887e;

    public b() {
        this(true, "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData", true, false, 0);
    }

    public final boolean a() {
        return this.f25885c;
    }

    public final boolean b() {
        return this.f25886d;
    }

    public final int c() {
        return this.f25887e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f25883a == bVar.f25883a && zc.d.a(this.f25884b, bVar.f25884b) && this.f25885c == bVar.f25885c && this.f25886d == bVar.f25886d && this.f25887e == bVar.f25887e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f25883a;
        int i10 = 1;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int b10 = e0.i.b(this.f25884b, r02 * 31, 31);
        ?? r22 = this.f25885c;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (b10 + i11) * 31;
        boolean z11 = this.f25886d;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return Integer.hashCode(this.f25887e) + ((i12 + i10) * 31);
    }

    public final String toString() {
        return "ApplicationGeneralSettings(isExternalArmEventsEnabled=" + this.f25883a + ", externalArmEventsUrl=" + this.f25884b + ", shouldUseAppSet=" + this.f25885c + ", shouldReuseAdvId=" + this.f25886d + ", userAgentExpirationThresholdInHours=" + this.f25887e + ')';
    }

    public b(boolean z10, String str, boolean z11, boolean z12, int i10) {
        zc.d.d(str, "externalArmEventsUrl");
        this.f25883a = z10;
        this.f25884b = str;
        this.f25885c = z11;
        this.f25886d = z12;
        this.f25887e = i10;
    }
}
