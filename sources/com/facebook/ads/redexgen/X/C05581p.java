package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05581p {
    public static String[] A0D = {"erlsxJKV5RGKo0fyhsjft4C8myFkBTFD", "xxCOSS58nTJL4g358MAx2boWparhVsnt", "50HA7KO7TX73z1", "kwTSvTyvqMkAeNvnsZNufhK8xoNKpC5A", "CvvJJ5wn5WoPjh", "PJeUG8MSArG13FCqdbuWaTyquTMQa3YW", "KbVXHt7uQSAfPtAdYM2eE220TAgmiqZ3", "QWgxf2msfb1fWKXeTjGnwNJbVHOPLzwf"};
    public int A00;
    public long A01;

    @Nullable
    public RewardData A02;

    @Nullable
    public EnumC0964Il A03;

    @Nullable
    public String A04;

    @Nullable
    public String A05;
    public boolean A06;
    public final J6 A07;
    public final J8 A08;
    public final String A09;

    @Nullable
    public final EnumSet<CacheFlag> A0A;
    public final int A0B;
    public final AdPlacementType A0C;

    public C05581p(String str, J8 j82, AdPlacementType adPlacementType, J6 j62, int i10) {
        this(str, j82, adPlacementType, j62, i10, EnumSet.of(CacheFlag.NONE));
    }

    public C05581p(String str, J8 j82, AdPlacementType adPlacementType, J6 j62, int i10, @Nullable EnumSet<CacheFlag> cacheFlags) {
        this.A09 = str;
        this.A0C = adPlacementType;
        this.A07 = j62;
        this.A0B = i10;
        this.A0A = cacheFlags;
        this.A08 = j82;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0C;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        J6 j62 = this.A07;
        if (j62 == null) {
            return AdPlacementType.NATIVE;
        }
        if (j62 == J6.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final JT A01(C1316Wj c1316Wj, JD jd2, @Nullable AdExperienceType adExperienceType) {
        C1017Kq c1017Kq;
        String str;
        String str2 = this.A09;
        J6 j62 = this.A07;
        if (j62 != null) {
            c1017Kq = new C1017Kq(j62.A03(), this.A07.A02());
        } else {
            c1017Kq = null;
        }
        J8 j82 = this.A08;
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            str = AdSettings.getTestAdType().getAdTypeString();
        } else {
            str = null;
        }
        JT jt = new JT(c1316Wj, str2, c1017Kq, j82, str, this.A0B, AdSettings.isTestMode(c1316Wj), AdSettings.isMixedAudience(), jd2, C1023Kw.A01(ID.A0I(c1316Wj)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null);
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "1YKhexqCB6oyofjWexJTrFb8PReFz0lW";
        strArr2[3] = "PDYLpd11u8hpbIrKg4rw9QV8MRNrtAlX";
        return jt;
    }

    public final void A02(int i10) {
        this.A00 = i10;
    }

    public final void A03(long j10) {
        this.A01 = j10;
    }

    public final void A04(@Nullable RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(@Nullable EnumC0964Il enumC0964Il) {
        this.A03 = enumC0964Il;
    }

    public final void A06(@Nullable String str) {
        this.A04 = str;
    }

    public final void A07(@Nullable String str) {
        this.A05 = str;
    }

    public final void A08(boolean z10) {
        this.A06 = z10;
    }
}
