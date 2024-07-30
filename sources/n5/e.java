package n5;

import d6.g0;

/* compiled from: Descriptor.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f33379a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33380b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33381c;

    public e(String str, String str2, String str3) {
        this.f33379a = str;
        this.f33380b = str2;
        this.f33381c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (g0.a(this.f33379a, eVar.f33379a) && g0.a(this.f33380b, eVar.f33380b) && g0.a(this.f33381c, eVar.f33381c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f33379a.hashCode() * 31;
        int i11 = 0;
        String str = this.f33380b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f33381c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
