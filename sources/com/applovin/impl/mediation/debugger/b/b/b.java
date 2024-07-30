package com.applovin.impl.mediation.debugger.b.b;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f17946a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17947b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17948c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17949d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17950e;
    private final String f;

    /* renamed from: g, reason: collision with root package name */
    private final int f17951g;

    public b(String str, int i10) {
        this.f = str;
        this.f17951g = i10;
        String[] split = str.split(",");
        boolean z10 = split.length == 3 || split.length == 4;
        this.f17950e = z10;
        if (z10) {
            this.f17946a = a(split[0]);
            this.f17947b = a(split[1]);
            this.f17948c = a(split[2]);
            this.f17949d = split.length == 4 ? a(split[3]) : "";
            return;
        }
        this.f17946a = "";
        this.f17947b = "";
        this.f17948c = "";
        this.f17949d = "";
    }

    public boolean a(Object obj) {
        return obj instanceof b;
    }

    public String b() {
        return this.f17947b;
    }

    public String c() {
        return this.f17948c;
    }

    public String d() {
        return this.f17949d;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!bVar.a(this) || g() != bVar.g()) {
            return false;
        }
        String a10 = a();
        String a11 = bVar.a();
        if (a10 != null ? !a10.equals(a11) : a11 != null) {
            return false;
        }
        String b10 = b();
        String b11 = bVar.b();
        if (b10 != null ? !b10.equals(b11) : b11 != null) {
            return false;
        }
        String c10 = c();
        String c11 = bVar.c();
        if (c10 != null ? !c10.equals(c11) : c11 != null) {
            return false;
        }
        String d10 = d();
        String d11 = bVar.d();
        if (d10 != null ? d10.equals(d11) : d11 == null) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.f17951g;
    }

    public boolean g() {
        return this.f17950e;
    }

    public int hashCode() {
        int i10;
        int hashCode;
        int hashCode2;
        int hashCode3;
        if (g()) {
            i10 = 79;
        } else {
            i10 = 97;
        }
        String a10 = a();
        int i11 = (i10 + 59) * 59;
        int i12 = 43;
        if (a10 == null) {
            hashCode = 43;
        } else {
            hashCode = a10.hashCode();
        }
        int i13 = i11 + hashCode;
        String b10 = b();
        int i14 = i13 * 59;
        if (b10 == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = b10.hashCode();
        }
        int i15 = i14 + hashCode2;
        String c10 = c();
        int i16 = i15 * 59;
        if (c10 == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = c10.hashCode();
        }
        int i17 = i16 + hashCode3;
        String d10 = d();
        int i18 = i17 * 59;
        if (d10 != null) {
            i12 = d10.hashCode();
        }
        return i18 + i12;
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + a() + ", publisherId=" + b() + ", relationship=" + c() + ", certificateAuthorityId=" + d() + ", valid=" + g() + ", rawValue=" + e() + ", rowNumber=" + f() + ")";
    }

    public String a() {
        return this.f17946a;
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public b(String str) {
        this(str, -1);
    }
}
