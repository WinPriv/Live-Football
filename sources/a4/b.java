package a4;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final int f241a;

    /* renamed from: b, reason: collision with root package name */
    public final long f242b;

    public b(int i10, long j10) {
        if (i10 != 0) {
            this.f241a = i10;
            this.f242b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // a4.g
    public final long a() {
        return this.f242b;
    }

    @Override // a4.g
    public final int b() {
        return this.f241a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (s.f.a(this.f241a, gVar.b()) && this.f242b == gVar.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c10 = (s.f.c(this.f241a) ^ 1000003) * 1000003;
        long j10 = this.f242b;
        return c10 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(a3.k.B(this.f241a));
        sb2.append(", nextRequestWaitMillis=");
        return a3.l.n(sb2, this.f242b, "}");
    }
}
