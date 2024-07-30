package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class OL extends LinearLayout {
    public static final int A04 = (int) (Kd.A02 * 32.0f);
    public static final int A05 = (int) (Kd.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public NI A02;
    public final C1316Wj A03;

    public OL(C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A03 = c1316Wj;
        A00(c1316Wj);
    }

    private final void A00(C1316Wj c1316Wj) {
        setGravity(16);
        this.A02 = new NI(c1316Wj);
        this.A02.setFullCircleCorners(true);
        int i10 = A04;
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(i10, i10);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c1316Wj);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c1316Wj);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LE.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c1316Wj);
        LE.A0X(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01(int i10, int i11) {
        this.A00.setTextColor(i10);
        this.A01.setTextColor(i11);
    }

    public void setPageDetails(C1U c1u) {
        AsyncTaskC1195Ro asyncTaskC1195Ro = new AsyncTaskC1195Ro(this.A02, this.A03);
        int i10 = A04;
        asyncTaskC1195Ro.A05(i10, i10);
        asyncTaskC1195Ro.A07(c1u.A01());
        this.A00.setText(c1u.A02());
        this.A01.setText(c1u.A03());
    }
}
