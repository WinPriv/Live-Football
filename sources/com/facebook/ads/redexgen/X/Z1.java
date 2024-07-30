package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class Z1 extends AbstractC05320p {
    public static String[] A05 = {"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    public static final String A06 = Z1.class.getSimpleName();
    public Z3 A00;
    public boolean A01;
    public final C1316Wj A02;
    public final IT A03;
    public final AbstractC1070Ms A04;

    public Z1(C1316Wj c1316Wj, IT it, AbstractC1070Ms abstractC1070Ms, C1137Pi c1137Pi, AbstractC05330q abstractC05330q) {
        super(c1316Wj, abstractC05330q, c1137Pi);
        this.A03 = it;
        this.A04 = abstractC1070Ms;
        this.A02 = c1316Wj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05320p
    public final void A06(Map<String, String> map) {
        Z3 z32 = this.A00;
        if (z32 != null && !TextUtils.isEmpty(z32.A63())) {
            this.A02.A0D().A2Y();
            AnonymousClass29.A00(this.A00.A05());
            IT it = this.A03;
            String A63 = this.A00.A63();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            it.A8z(A63, map);
        }
    }

    public final synchronized void A07() {
        if (!this.A01 && this.A00 != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                L8.A00(new Z2(this));
            }
        }
    }

    public final void A08(Z3 z32) {
        this.A00 = z32;
    }
}
