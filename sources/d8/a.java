package d8;

import a3.l;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes2.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final String f27489a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27490b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27491c;

    public a(String str, long j10, long j11) {
        this.f27489a = str;
        this.f27490b = j10;
        this.f27491c = j11;
    }

    @Override // d8.g
    public final String a() {
        return this.f27489a;
    }

    @Override // d8.g
    public final long b() {
        return this.f27491c;
    }

    @Override // d8.g
    public final long c() {
        return this.f27490b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f27489a.equals(gVar.a()) && this.f27490b == gVar.c() && this.f27491c == gVar.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f27489a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f27490b;
        long j11 = this.f27491c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f27489a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f27490b);
        sb2.append(", tokenCreationTimestamp=");
        return l.n(sb2, this.f27491c, "}");
    }
}
