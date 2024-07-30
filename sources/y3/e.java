package y3;

import y3.k;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    public final k.a f36617a;

    /* renamed from: b, reason: collision with root package name */
    public final a f36618b;

    public e(k.a aVar, a aVar2) {
        this.f36617a = aVar;
        this.f36618b = aVar2;
    }

    @Override // y3.k
    public final a a() {
        return this.f36618b;
    }

    @Override // y3.k
    public final k.a b() {
        return this.f36617a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.a aVar = this.f36617a;
        if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
            a aVar2 = this.f36618b;
            if (aVar2 == null) {
                if (kVar.a() == null) {
                    return true;
                }
            } else if (aVar2.equals(kVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        k.a aVar = this.f36617a;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        a aVar2 = this.f36618b;
        if (aVar2 != null) {
            i10 = aVar2.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f36617a + ", androidClientInfo=" + this.f36618b + "}";
    }
}
