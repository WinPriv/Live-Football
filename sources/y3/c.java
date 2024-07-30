package y3;

/* compiled from: AutoValue_AndroidClientInfo.java */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f36605a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36606b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36607c;

    /* renamed from: d, reason: collision with root package name */
    public final String f36608d;

    /* renamed from: e, reason: collision with root package name */
    public final String f36609e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f36610g;

    /* renamed from: h, reason: collision with root package name */
    public final String f36611h;

    /* renamed from: i, reason: collision with root package name */
    public final String f36612i;

    /* renamed from: j, reason: collision with root package name */
    public final String f36613j;

    /* renamed from: k, reason: collision with root package name */
    public final String f36614k;

    /* renamed from: l, reason: collision with root package name */
    public final String f36615l;

    public c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f36605a = num;
        this.f36606b = str;
        this.f36607c = str2;
        this.f36608d = str3;
        this.f36609e = str4;
        this.f = str5;
        this.f36610g = str6;
        this.f36611h = str7;
        this.f36612i = str8;
        this.f36613j = str9;
        this.f36614k = str10;
        this.f36615l = str11;
    }

    @Override // y3.a
    public final String a() {
        return this.f36615l;
    }

    @Override // y3.a
    public final String b() {
        return this.f36613j;
    }

    @Override // y3.a
    public final String c() {
        return this.f36608d;
    }

    @Override // y3.a
    public final String d() {
        return this.f36611h;
    }

    @Override // y3.a
    public final String e() {
        return this.f36607c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f36605a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f36606b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.f36607c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.f36608d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f36609e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f36610g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f36611h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f36612i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f36613j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f36614k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f36615l;
                                                    if (str11 == null) {
                                                        if (aVar.a() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.a())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // y3.a
    public final String f() {
        return this.f36612i;
    }

    @Override // y3.a
    public final String g() {
        return this.f36610g;
    }

    @Override // y3.a
    public final String h() {
        return this.f36614k;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int i10 = 0;
        Integer num = this.f36605a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str = this.f36606b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str2 = this.f36607c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str3 = this.f36608d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        String str4 = this.f36609e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        String str5 = this.f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i16 = (i15 ^ hashCode6) * 1000003;
        String str6 = this.f36610g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i17 = (i16 ^ hashCode7) * 1000003;
        String str7 = this.f36611h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i18 = (i17 ^ hashCode8) * 1000003;
        String str8 = this.f36612i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i19 = (i18 ^ hashCode9) * 1000003;
        String str9 = this.f36613j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i20 = (i19 ^ hashCode10) * 1000003;
        String str10 = this.f36614k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i21 = (i20 ^ hashCode11) * 1000003;
        String str11 = this.f36615l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return i10 ^ i21;
    }

    @Override // y3.a
    public final String i() {
        return this.f36606b;
    }

    @Override // y3.a
    public final String j() {
        return this.f;
    }

    @Override // y3.a
    public final String k() {
        return this.f36609e;
    }

    @Override // y3.a
    public final Integer l() {
        return this.f36605a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f36605a);
        sb2.append(", model=");
        sb2.append(this.f36606b);
        sb2.append(", hardware=");
        sb2.append(this.f36607c);
        sb2.append(", device=");
        sb2.append(this.f36608d);
        sb2.append(", product=");
        sb2.append(this.f36609e);
        sb2.append(", osBuild=");
        sb2.append(this.f);
        sb2.append(", manufacturer=");
        sb2.append(this.f36610g);
        sb2.append(", fingerprint=");
        sb2.append(this.f36611h);
        sb2.append(", locale=");
        sb2.append(this.f36612i);
        sb2.append(", country=");
        sb2.append(this.f36613j);
        sb2.append(", mccMnc=");
        sb2.append(this.f36614k);
        sb2.append(", applicationBuild=");
        return a3.l.p(sb2, this.f36615l, "}");
    }
}
