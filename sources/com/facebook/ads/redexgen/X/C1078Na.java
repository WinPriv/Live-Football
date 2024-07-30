package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.huawei.hms.ads.gl;

/* renamed from: com.facebook.ads.redexgen.X.Na, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1078Na extends RelativeLayout {
    public final View A00;
    public final NJ A01;

    public C1078Na(C1316Wj c1316Wj, View view) {
        super(c1316Wj);
        this.A00 = view;
        this.A01 = new NJ(c1316Wj);
        LE.A0K(this.A01);
    }

    public final void A00(int i10) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i10));
    }

    public final void A01(@Nullable NO no, boolean z10) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (no != null) {
            if (z10) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                no.setAlignment(3);
                layoutParams2.setMargins(NR.A08 / 2, NR.A08 / 2, NR.A08 / 2, NR.A08 / 2);
                linearLayout.addView(no, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(gl.Code);
                gradientDrawable.setGradientType(0);
                LE.A0S(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams insideLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, NR.A08, 0, 0);
                no.setAlignment(17);
                addView(no, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
