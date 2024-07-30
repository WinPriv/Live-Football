package y3;

import java.util.List;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    public final long f36631a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36632b;

    /* renamed from: c, reason: collision with root package name */
    public final k f36633c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f36634d;

    /* renamed from: e, reason: collision with root package name */
    public final String f36635e;
    public final List<l> f;

    /* renamed from: g, reason: collision with root package name */
    public final p f36636g;

    public g() {
        throw null;
    }

    public g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar) {
        this.f36631a = j10;
        this.f36632b = j11;
        this.f36633c = kVar;
        this.f36634d = num;
        this.f36635e = str;
        this.f = list;
        this.f36636g = pVar;
    }

    @Override // y3.m
    public final k a() {
        return this.f36633c;
    }

    @Override // y3.m
    public final List<l> b() {
        return this.f;
    }

    @Override // y3.m
    public final Integer c() {
        return this.f36634d;
    }

    @Override // y3.m
    public final String d() {
        return this.f36635e;
    }

    @Override // y3.m
    public final p e() {
        return this.f36636g;
    }

    public final boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f36631a == mVar.f() && this.f36632b == mVar.g() && ((kVar = this.f36633c) != null ? kVar.equals(mVar.a()) : mVar.a() == null) && ((num = this.f36634d) != null ? num.equals(mVar.c()) : mVar.c() == null) && ((str = this.f36635e) != null ? str.equals(mVar.d()) : mVar.d() == null) && ((list = this.f) != null ? list.equals(mVar.b()) : mVar.b() == null)) {
            p pVar = this.f36636g;
            if (pVar == null) {
                if (mVar.e() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // y3.m
    public final long f() {
        return this.f36631a;
    }

    @Override // y3.m
    public final long g() {
        return this.f36632b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j10 = this.f36631a;
        long j11 = this.f36632b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        int i11 = 0;
        k kVar = this.f36633c;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        Integer num = this.f36634d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        String str = this.f36635e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 ^ hashCode3) * 1000003;
        List<l> list = this.f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        p pVar = this.f36636g;
        if (pVar != null) {
            i11 = pVar.hashCode();
        }
        return i15 ^ i11;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f36631a + ", requestUptimeMs=" + this.f36632b + ", clientInfo=" + this.f36633c + ", logSource=" + this.f36634d + ", logSourceName=" + this.f36635e + ", logEvents=" + this.f + ", qosTier=" + this.f36636g + "}";
    }
}
