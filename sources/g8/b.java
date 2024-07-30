package g8;

import e0.i;

/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f28528a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28529b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28530c;

    public b(String str, long j10, int i10) {
        this.f28528a = str;
        this.f28529b = j10;
        this.f28530c = i10;
    }

    @Override // g8.f
    public final int a() {
        return this.f28530c;
    }

    @Override // g8.f
    public final String b() {
        return this.f28528a;
    }

    @Override // g8.f
    public final long c() {
        return this.f28529b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f28528a;
        if (str != null ? str.equals(fVar.b()) : fVar.b() == null) {
            if (this.f28529b == fVar.c()) {
                int i10 = this.f28530c;
                if (i10 == 0) {
                    if (fVar.a() == 0) {
                        return true;
                    }
                } else if (s.f.a(i10, fVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        String str = this.f28528a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f28529b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i12 = this.f28530c;
        if (i12 != 0) {
            i10 = s.f.c(i12);
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f28528a + ", tokenExpirationTimestamp=" + this.f28529b + ", responseCode=" + i.r(this.f28530c) + "}";
    }
}
