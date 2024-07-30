package y3;

import y3.o;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    public final o.b f36638a;

    /* renamed from: b, reason: collision with root package name */
    public final o.a f36639b;

    public i(o.b bVar, o.a aVar) {
        this.f36638a = bVar;
        this.f36639b = aVar;
    }

    @Override // y3.o
    public final o.a a() {
        return this.f36639b;
    }

    @Override // y3.o
    public final o.b b() {
        return this.f36638a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f36638a;
        if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
            o.a aVar = this.f36639b;
            if (aVar == null) {
                if (oVar.a() == null) {
                    return true;
                }
            } else if (aVar.equals(oVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        o.b bVar = this.f36638a;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        o.a aVar = this.f36639b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f36638a + ", mobileSubtype=" + this.f36639b + "}";
    }
}
