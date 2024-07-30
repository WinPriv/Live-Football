package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.huawei.openalliance.ad.constant.ag;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1188Rh extends NR {
    public static byte[] A06;
    public static String[] A07 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public JK A00;

    @Nullable
    public HT A01;
    public HH A02;
    public final AnonymousClass18 A03;
    public final C1B A04;
    public final N5 A05;

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{9, 5, 7, 68, Ascii.FF, Ascii.VT, 9, Ascii.SI, 8, 5, 5, 1, 68, Ascii.VT, Ascii.SO, Ascii.EM, 68, 3, 4, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.EM, Ascii.RS, 3, Ascii.RS, 3, Ascii.VT, 6, 68, 9, 6, 3, 9, 1, Ascii.SI, Ascii.SO, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    static {
        A0B();
        A0B = (int) (Kd.A02 * 48.0f);
        A0F = (int) (Kd.A02 * 16.0f);
        A08 = (int) (Kd.A02 * 4.0f);
        A0E = (int) (Kd.A02 * 44.0f);
        A0C = (int) (Kd.A02 * 8.0f);
        A0D = (int) (Kd.A02 * 12.0f);
        A0H = (int) (Kd.A02 * 12.0f);
        A0G = (int) (Kd.A02 * 26.0f);
        A09 = C2U.A01(-1, 77);
        A0A = C2U.A01(A09, 90);
    }

    public AbstractC1188Rh(NV nv, boolean z10) {
        super(nv, z10);
        this.A03 = nv.A04();
        this.A04 = this.A03.A0O();
        this.A05 = A09(nv);
        AbstractC1028Lb A082 = nv.A08();
        if (A082 != null) {
            A082.setLayoutParams(new RelativeLayout.LayoutParams(-1, A082.getToolbarHeight()));
            A082.setPageDetailsVisible(false);
        }
    }

    private N5 A09(NV nv) {
        String A0A2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (nv.A04().A0Y().equals(A0A(37, 14, 56))) {
            A0A2 = EnumC1124Ov.A04.A02();
        } else {
            A0A2 = A0A(0, 37, 124);
        }
        C1189Ri c1189Ri = new C1189Ri(nv.A05(), A0B, this.A04.A0E().A00() == C1G.A05, getColors(), this.A04.A0F().A06(), A0A2, nv.A06(), nv.A09(), nv.A0B(), nv.A07());
        this.A02 = new HH(c1189Ri, ag.f21998i, 100, 0);
        LE.A0K(c1189Ri);
        c1189Ri.A0A(nv.A00());
        addView(c1189Ri, layoutParams);
        return c1189Ri;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public void A0b(C1B c1b, String str, double d10, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d10, bundle);
        this.A05.setInfo(c1b.A0E(), c1b.A0F(), str, this.A03.A0R().A01(), null);
    }

    public final int A0e(@Nullable AbstractC1028Lb abstractC1028Lb) {
        return abstractC1028Lb == null ? AbstractC1028Lb.A00 : abstractC1028Lb.getToolbarHeight();
    }

    public void A0f() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new JK(true);
            HT ht = this.A01;
            if (ht != null) {
                JK jk = this.A00;
                if (A07[0].charAt(30) == 'l') {
                    throw new RuntimeException();
                }
                A07[7] = "KTvg88bTO6HmKn15GgbH1";
                jk.A0I(ht);
            }
            C1K A01 = this.A03.A0N().A01();
            this.A00.A0I(new HK(getAdDetailsView().getCTAButton(), 300, -1, A01.A09(true)));
            Drawable A082 = LE.A08(A09, A0A, A08);
            Drawable startDrawable = LE.A05(A01.A08(true), A08);
            this.A00.A0I(new C0929Ha(getAdDetailsView().getCTAButton(), 300, A082, startDrawable));
            this.A00.A0I(new HS(expandableLayout, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, false));
            this.A00.A0H(IronSourceConstants.IS_AUCTION_FAILED);
        }
    }

    public AnonymousClass18 getAdDataBundle() {
        return this.A03;
    }

    public HH getAdDetailsAnimation() {
        return this.A02;
    }

    public N5 getAdDetailsView() {
        return this.A05;
    }

    public C1B getAdInfo() {
        return this.A04;
    }

    public JK getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.NR, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0A(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z10) {
            return;
        }
        HT ht = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A07[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (ht == null) {
            this.A01 = new HT(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A00.A0I(this.A01);
            this.A00.A0G();
        }
    }
}
