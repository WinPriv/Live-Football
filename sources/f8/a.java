package f8;

import a3.l;
import f8.d;
import s.f;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f28149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28150c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28151d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28152e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28153g;

    /* renamed from: h, reason: collision with root package name */
    public final String f28154h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* renamed from: f8.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0379a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f28155a;

        /* renamed from: b, reason: collision with root package name */
        public int f28156b;

        /* renamed from: c, reason: collision with root package name */
        public String f28157c;

        /* renamed from: d, reason: collision with root package name */
        public String f28158d;

        /* renamed from: e, reason: collision with root package name */
        public Long f28159e;
        public Long f;

        /* renamed from: g, reason: collision with root package name */
        public String f28160g;

        public C0379a() {
        }

        public final a a() {
            String str;
            if (this.f28156b == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (this.f28159e == null) {
                str = str.concat(" expiresInSecs");
            }
            if (this.f == null) {
                str = com.ironsource.adapters.facebook.a.h(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f28155a, this.f28156b, this.f28157c, this.f28158d, this.f28159e.longValue(), this.f.longValue(), this.f28160g);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final C0379a b(int i10) {
            if (i10 != 0) {
                this.f28156b = i10;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public C0379a(d dVar) {
            this.f28155a = dVar.c();
            this.f28156b = dVar.f();
            this.f28157c = dVar.a();
            this.f28158d = dVar.e();
            this.f28159e = Long.valueOf(dVar.b());
            this.f = Long.valueOf(dVar.g());
            this.f28160g = dVar.d();
        }
    }

    public a(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.f28149b = str;
        this.f28150c = i10;
        this.f28151d = str2;
        this.f28152e = str3;
        this.f = j10;
        this.f28153g = j11;
        this.f28154h = str4;
    }

    @Override // f8.d
    public final String a() {
        return this.f28151d;
    }

    @Override // f8.d
    public final long b() {
        return this.f;
    }

    @Override // f8.d
    public final String c() {
        return this.f28149b;
    }

    @Override // f8.d
    public final String d() {
        return this.f28154h;
    }

    @Override // f8.d
    public final String e() {
        return this.f28152e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f28149b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (f.a(this.f28150c, dVar.f()) && ((str = this.f28151d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f28152e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f == dVar.b() && this.f28153g == dVar.g()) {
                String str4 = this.f28154h;
                if (str4 == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f8.d
    public final int f() {
        return this.f28150c;
    }

    @Override // f8.d
    public final long g() {
        return this.f28153g;
    }

    public final C0379a h() {
        return new C0379a(this);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i10 = 0;
        String str = this.f28149b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ f.c(this.f28150c)) * 1000003;
        String str2 = this.f28151d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (c10 ^ hashCode2) * 1000003;
        String str3 = this.f28152e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        long j10 = this.f;
        int i13 = (i12 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f28153g;
        int i14 = (i13 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f28154h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i14;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f28149b);
        sb2.append(", registrationStatus=");
        sb2.append(com.ironsource.adapters.facebook.a.t(this.f28150c));
        sb2.append(", authToken=");
        sb2.append(this.f28151d);
        sb2.append(", refreshToken=");
        sb2.append(this.f28152e);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f28153g);
        sb2.append(", fisError=");
        return l.p(sb2, this.f28154h, "}");
    }
}
