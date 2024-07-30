package g4;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    public final long f28479b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28480c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28481d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28482e;
    public final int f;

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f28479b = j10;
        this.f28480c = i10;
        this.f28481d = i11;
        this.f28482e = j11;
        this.f = i12;
    }

    @Override // g4.e
    public final int a() {
        return this.f28481d;
    }

    @Override // g4.e
    public final long b() {
        return this.f28482e;
    }

    @Override // g4.e
    public final int c() {
        return this.f28480c;
    }

    @Override // g4.e
    public final int d() {
        return this.f;
    }

    @Override // g4.e
    public final long e() {
        return this.f28479b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f28479b == eVar.e() && this.f28480c == eVar.c() && this.f28481d == eVar.a() && this.f28482e == eVar.b() && this.f == eVar.d()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f28479b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f28480c) * 1000003) ^ this.f28481d) * 1000003;
        long j11 = this.f28482e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f28479b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f28480c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f28481d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f28482e);
        sb2.append(", maxBlobByteSizePerRow=");
        return com.ironsource.adapters.facebook.a.i(sb2, this.f, "}");
    }
}
