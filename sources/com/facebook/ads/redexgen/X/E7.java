package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import java.util.EnumSet;

/* loaded from: assets/audience_network.dex */
public final class E7 extends YP {
    public static String[] A02 = {"Wdifh5HSN4RyvogFUrIVqQJQULlKdEei", "S34yOHPbjBOZXrhEKXqsFwPvtnd1qciy", "vu9eRI", "x0OqZ", "VYF0eZRg0jpnLcLhIoRoBnoO3djZf6SI", "33GTCt01Ki3rQT8tpwoWMPFpMqFvVQrj", "pa13jV0ykdfTm6Oo414mEZE7qu5xzGka", "tj8XsVszyFe6dIsjKXzcwTwgC3z6jHVp"};

    @VisibleForTesting
    public static final AnonymousClass21 A03 = new YE();

    @Nullable
    public YJ A00;
    public final AnonymousClass20 A01;

    public E7(AnonymousClass20 anonymousClass20) {
        super(anonymousClass20.A05(), A03.A4N(anonymousClass20));
        this.A01 = anonymousClass20;
    }

    @Override // com.facebook.ads.redexgen.X.YP
    public final void A05() {
        YJ yj = this.A00;
        if (yj != null) {
            yj.A0F();
        }
        InterfaceC05641v interfaceC05641v = super.A00;
        EnumC05631u enumC05631u = EnumC05631u.A04;
        if (A02[1].charAt(8) == 'f') {
            throw new RuntimeException();
        }
        A02[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        interfaceC05641v.AEN(enumC05631u);
    }

    public final YJ A07() {
        return this.A00;
    }

    public final void A08() {
        this.A00 = new YJ(this.A01, this, this.A02);
        this.A00.A0I(this.A01.A0A(), this.A01.A06());
    }

    public final void A09(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, @Nullable String str) {
        if (super.A00.A5I()) {
            return;
        }
        this.A01.A0C(interstitialAd);
        YJ yj = this.A00;
        if (yj != null) {
            yj.A0I(cacheFlags, str);
            return;
        }
        this.A01.A0J(cacheFlags);
        this.A01.A0G(str);
        A08();
    }

    public final boolean A0A() {
        YJ yj = this.A00;
        if (yj != null) {
            return yj.A0J();
        }
        if (this.A01.A00() > 0) {
            long A00 = L5.A00();
            long A002 = this.A01.A00();
            if (A02[0].charAt(6) == 'y') {
                throw new RuntimeException();
            }
            A02[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            if (A00 > A002) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0B() {
        YJ yj = this.A00;
        if (yj != null) {
            return yj.A0K();
        }
        return super.A00.A5b() == EnumC05631u.A06;
    }

    public final boolean A0C(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A5J()) {
            return false;
        }
        this.A01.A0C(interstitialAd);
        YJ yj = this.A00;
        if (yj != null) {
            return yj.A0L();
        }
        this.A00 = new YJ(this.A01, this, this.A02);
        this.A00.A0L();
        return false;
    }
}
