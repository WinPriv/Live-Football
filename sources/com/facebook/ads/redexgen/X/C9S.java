package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.9S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9S {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC07509n A03;
    public final EK A04;
    public final TrackGroupArray A05;
    public final GG A06;

    @Nullable
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C9S(AbstractC07509n abstractC07509n, long j10, TrackGroupArray trackGroupArray, GG gg) {
        this(abstractC07509n, null, new EK(0), j10, b.f7291b, 1, false, trackGroupArray, gg);
    }

    public C9S(AbstractC07509n abstractC07509n, @Nullable Object obj, EK ek, long j10, long j11, int i10, boolean z10, TrackGroupArray trackGroupArray, GG gg) {
        this.A03 = abstractC07509n;
        this.A07 = obj;
        this.A04 = ek;
        this.A02 = j10;
        this.A01 = j11;
        this.A0A = j10;
        this.A09 = j10;
        this.A00 = i10;
        this.A08 = z10;
        this.A05 = trackGroupArray;
        this.A06 = gg;
    }

    public static void A00(C9S c9s, C9S c9s2) {
        c9s2.A0A = c9s.A0A;
        c9s2.A09 = c9s.A09;
    }

    public final C9S A01(int i10) {
        C9S c9s = new C9S(this.A03, this.A07, this.A04.A00(i10), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c9s);
        return c9s;
    }

    public final C9S A02(int i10) {
        C9S playbackInfo = new C9S(this.A03, this.A07, this.A04, this.A02, this.A01, i10, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C9S A03(AbstractC07509n abstractC07509n, Object obj) {
        C9S playbackInfo = new C9S(abstractC07509n, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C9S A04(EK ek, long j10, long j11) {
        long j12 = j11;
        AbstractC07509n abstractC07509n = this.A03;
        Object obj = this.A07;
        if (!ek.A01()) {
            j12 = b.f7291b;
        }
        return new C9S(abstractC07509n, obj, ek, j10, j12, this.A00, this.A08, this.A05, this.A06);
    }

    public final C9S A05(TrackGroupArray trackGroupArray, GG gg) {
        C9S playbackInfo = new C9S(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, gg);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C9S A06(boolean z10) {
        C9S playbackInfo = new C9S(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z10, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
