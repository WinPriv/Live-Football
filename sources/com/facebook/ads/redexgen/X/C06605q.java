package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.5q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06605q {
    public final long A00;
    public final EnumC06595p A01;
    public final String A02;
    public final boolean A03;

    public C06605q(String str, boolean z10, EnumC06595p enumC06595p) {
        this(str, z10, enumC06595p, System.currentTimeMillis());
    }

    public C06605q(String str, boolean z10, EnumC06595p enumC06595p, long j10) {
        this.A02 = str;
        this.A03 = z10;
        this.A01 = enumC06595p;
        this.A00 = j10;
    }

    public static C06605q A00() {
        return new C06605q("", true, EnumC06595p.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC06595p A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
