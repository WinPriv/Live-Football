package com.applovin.impl.mediation.debugger.b.a;

/* loaded from: classes.dex */
public class d implements Comparable<d> {

    /* renamed from: a, reason: collision with root package name */
    private final String f17938a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17939b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17940c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.c.b f17941d;

    public d(String str, String str2, boolean z10, com.applovin.impl.mediation.debugger.b.c.b bVar) {
        this.f17938a = str;
        this.f17939b = str2;
        this.f17940c = z10;
        this.f17941d = bVar;
    }

    public String a() {
        return this.f17938a;
    }

    public String b() {
        return this.f17939b;
    }

    public com.applovin.impl.mediation.debugger.b.c.b c() {
        return this.f17941d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f17938a;
        if (str == null ? dVar.f17938a != null : !str.equals(dVar.f17938a)) {
            return false;
        }
        String str2 = this.f17939b;
        if (str2 == null ? dVar.f17939b != null : !str2.equals(dVar.f17939b)) {
            return false;
        }
        if (this.f17940c == dVar.f17940c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String str = this.f17938a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f17939b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((i12 + i11) * 31) + (this.f17940c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return this.f17939b.compareToIgnoreCase(dVar.f17939b);
    }
}
