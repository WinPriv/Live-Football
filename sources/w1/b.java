package w1;

/* compiled from: NetworkState.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f36034a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f36035b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f36036c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f36037d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f36034a = z10;
        this.f36035b = z11;
        this.f36036c = z12;
        this.f36037d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f36034a == bVar.f36034a && this.f36035b == bVar.f36035b && this.f36036c == bVar.f36036c && this.f36037d == bVar.f36037d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    public final int hashCode() {
        boolean z10 = this.f36035b;
        ?? r12 = this.f36034a;
        int i10 = r12;
        if (z10) {
            i10 = r12 + 16;
        }
        int i11 = i10;
        if (this.f36036c) {
            i11 = i10 + 256;
        }
        if (this.f36037d) {
            return i11 + 4096;
        }
        return i11;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f36034a), Boolean.valueOf(this.f36035b), Boolean.valueOf(this.f36036c), Boolean.valueOf(this.f36037d));
    }
}
