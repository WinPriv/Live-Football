package g4;

/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final long f28483a;

    /* renamed from: b, reason: collision with root package name */
    public final z3.s f28484b;

    /* renamed from: c, reason: collision with root package name */
    public final z3.n f28485c;

    public b(long j10, z3.s sVar, z3.n nVar) {
        this.f28483a = j10;
        if (sVar != null) {
            this.f28484b = sVar;
            if (nVar != null) {
                this.f28485c = nVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // g4.i
    public final z3.n a() {
        return this.f28485c;
    }

    @Override // g4.i
    public final long b() {
        return this.f28483a;
    }

    @Override // g4.i
    public final z3.s c() {
        return this.f28484b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f28483a == iVar.b() && this.f28484b.equals(iVar.c()) && this.f28485c.equals(iVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f28483a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f28484b.hashCode()) * 1000003) ^ this.f28485c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f28483a + ", transportContext=" + this.f28484b + ", event=" + this.f28485c + "}";
    }
}
