package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.b;

/* renamed from: com.facebook.ads.redexgen.X.9l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07489l {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public long A04;
    public C0872Ev A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i10) {
        return this.A05.A04[i10].A00;
    }

    public final int A02(int i10) {
        return this.A05.A04[i10].A00();
    }

    public final int A03(int i10, int i11) {
        return this.A05.A04[i10].A01(i11);
    }

    public final int A04(long j10) {
        return this.A05.A00(j10);
    }

    public final int A05(long j10) {
        return this.A05.A01(j10);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return AnonymousClass92.A01(this.A04);
    }

    public final long A09(int i10) {
        return this.A05.A03[i10];
    }

    public final long A0A(int i10, int i11) {
        C0870Et c0870Et = this.A05.A04[i10];
        return c0870Et.A00 != -1 ? c0870Et.A02[i11] : b.f7291b;
    }

    public final C07489l A0B(Object obj, Object obj2, int i10, long j10, long j11) {
        return A0C(obj, obj2, i10, j10, j11, C0872Ev.A06);
    }

    public final C07489l A0C(Object obj, Object obj2, int i10, long j10, long j11, C0872Ev c0872Ev) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i10;
        this.A01 = j10;
        this.A04 = j11;
        this.A05 = c0872Ev;
        return this;
    }

    public final boolean A0D(int i10) {
        return !this.A05.A04[i10].A02();
    }

    public final boolean A0E(int i10, int i11) {
        C0870Et c0870Et = this.A05.A04[i10];
        return (c0870Et.A00 == -1 || c0870Et.A01[i11] == 0) ? false : true;
    }
}
