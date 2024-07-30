package g8;

/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f28523a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28524b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28525c;

    /* renamed from: d, reason: collision with root package name */
    public final f f28526d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28527e;

    public a(String str, String str2, String str3, f fVar, int i10) {
        this.f28523a = str;
        this.f28524b = str2;
        this.f28525c = str3;
        this.f28526d = fVar;
        this.f28527e = i10;
    }

    @Override // g8.d
    public final f a() {
        return this.f28526d;
    }

    @Override // g8.d
    public final String b() {
        return this.f28524b;
    }

    @Override // g8.d
    public final String c() {
        return this.f28525c;
    }

    @Override // g8.d
    public final int d() {
        return this.f28527e;
    }

    @Override // g8.d
    public final String e() {
        return this.f28523a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f28523a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f28524b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f28525c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.f28526d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        int i10 = this.f28527e;
                        if (i10 == 0) {
                            if (dVar.d() == 0) {
                                return true;
                            }
                        } else if (s.f.a(i10, dVar.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        String str = this.f28523a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f28524b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.f28525c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        f fVar = this.f28526d;
        if (fVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fVar.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        int i15 = this.f28527e;
        if (i15 != 0) {
            i10 = s.f.c(i15);
        }
        return i10 ^ i14;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f28523a + ", fid=" + this.f28524b + ", refreshToken=" + this.f28525c + ", authToken=" + this.f28526d + ", responseCode=" + com.ironsource.adapters.facebook.a.u(this.f28527e) + "}";
    }
}
