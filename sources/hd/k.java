package hd;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f28911a;

    /* renamed from: b, reason: collision with root package name */
    public int f28912b;

    /* renamed from: c, reason: collision with root package name */
    public int f28913c;

    /* renamed from: d, reason: collision with root package name */
    public long f28914d;

    /* renamed from: e, reason: collision with root package name */
    public String f28915e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f28916g;

    /* renamed from: h, reason: collision with root package name */
    public int f28917h;

    /* renamed from: i, reason: collision with root package name */
    public k f28918i;

    public k() {
    }

    public k(int i10) {
        this.f28911a = i10;
    }

    public final void a(int i10, String str, String str2, String str3) {
        int hashCode;
        int i11;
        this.f28912b = i10;
        this.f28915e = str;
        this.f = str2;
        this.f28916g = str3;
        if (i10 != 1) {
            if (i10 != 12) {
                if (i10 != 16 && i10 != 30) {
                    if (i10 != 7) {
                        if (i10 != 8) {
                            hashCode = str3.hashCode() * str2.hashCode() * str.hashCode();
                            i11 = (hashCode + i10) & Integer.MAX_VALUE;
                            this.f28917h = i11;
                        }
                    } else {
                        this.f28913c = 0;
                    }
                }
            } else {
                i11 = ((str2.hashCode() * str.hashCode()) + i10) & Integer.MAX_VALUE;
                this.f28917h = i11;
            }
        }
        hashCode = str.hashCode();
        i11 = (hashCode + i10) & Integer.MAX_VALUE;
        this.f28917h = i11;
    }

    public k(int i10, k kVar) {
        this.f28911a = i10;
        this.f28912b = kVar.f28912b;
        this.f28913c = kVar.f28913c;
        this.f28914d = kVar.f28914d;
        this.f28915e = kVar.f28915e;
        this.f = kVar.f;
        this.f28916g = kVar.f28916g;
        this.f28917h = kVar.f28917h;
    }
}
