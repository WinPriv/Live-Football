package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.b;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.Aa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0763Aa extends AbstractC1257Tz {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final GL A0A;
    public final H9 A0B;

    public C0763Aa(TrackGroup trackGroup, int[] iArr, GL gl, long j10, long j11, long j12, float f, float f10, long j13, H9 h92) {
        super(trackGroup, iArr);
        this.A0A = gl;
        this.A07 = j10 * 1000;
        this.A06 = j11 * 1000;
        this.A08 = 1000 * j12;
        this.A04 = f;
        this.A05 = f10;
        this.A09 = j13;
        this.A0B = h92;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = b.f7291b;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j10) {
        long A5l = ((float) this.A0A.A5l()) * this.A04;
        int i10 = 0;
        for (int i11 = 0; i11 < super.A03; i11++) {
            if (j10 == Long.MIN_VALUE || !A00(i11, j10)) {
                if (Math.round(A6f(i11).A04 * this.A00) <= A5l) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1257Tz, com.facebook.ads.redexgen.X.GC
    public final void A58() {
        this.A03 = b.f7291b;
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final int A7O() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1257Tz, com.facebook.ads.redexgen.X.GC
    public final void ABj(float f) {
        this.A00 = f;
    }
}
