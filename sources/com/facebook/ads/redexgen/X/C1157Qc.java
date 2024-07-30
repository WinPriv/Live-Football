package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Qc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1157Qc extends LinearLayout implements InterfaceC1110Oh {
    public final NativeBannerAd A00;
    public final C1316Wj A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (Kd.A02 * 42.0f);
    public static final int A03 = (int) (Kd.A02 * 48.0f);
    public static final int A05 = (int) (Kd.A02 * 54.0f);
    public static final int A07 = (int) (Kd.A02 * 4.0f);
    public static final int A06 = (int) (Kd.A02 * 8.0f);

    public C1157Qc(C1316Wj c1316Wj, NativeBannerAd nativeBannerAd, C0972It c0972It, EnumC0973Iu enumC0973Iu, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c1316Wj);
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams ctaButtonParams;
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c1316Wj;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(enumC0973Iu);
        NJ nj = new NJ(this.A01);
        nj.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A00, A00);
        layoutParams2.gravity = 16;
        nj.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(nj, layoutParams2);
        C1107Oe c1107Oe = new C1107Oe(c1316Wj, this.A00, enumC0973Iu, c0972It, adOptionsView);
        c1107Oe.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(c1107Oe, layoutParams3);
        if (enumC0973Iu == EnumC0973Iu.A0A) {
            int i10 = A07;
            setPadding(i10, i10, i10, i10);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            ctaButtonParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            int i11 = A06;
            setPadding(i11, i11, i11, i11);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        int i12 = A06;
        int i13 = A07;
        textView.setPadding(i12, i13, i12, i13);
        c0972It.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, ctaButtonParams);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(EnumC0973Iu enumC0973Iu) {
        int i10 = C1108Of.A00[enumC0973Iu.ordinal()];
        if (i10 == 1) {
            return A04;
        }
        if (i10 != 2) {
            return A05;
        }
        return A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Oh
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Oh
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Oh
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
