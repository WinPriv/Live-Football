package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class MD extends LinearLayout {
    public boolean A00;
    public final ImageView A01;
    public final TextView A02;
    public static final int A04 = (int) (Kd.A02 * 16.0f);
    public static final int A05 = (int) (Kd.A02 * 12.0f);
    public static final int A06 = (int) (Kd.A02 * 12.0f);
    public static final int A03 = (int) (Kd.A02 * 16.0f);

    public MD(C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A00 = false;
        setOrientation(0);
        int i10 = A04;
        int i11 = A05;
        setPadding(i10, i11, i10, i11);
        this.A01 = new ImageView(getContext());
        int i12 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i12, i12);
        layoutParams.gravity = 17;
        this.A02 = new TextView(getContext());
        ViewGroup.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
        addView(this.A01, layoutParams);
        addView(this.A02, textViewParams);
        A00();
    }

    private void A00() {
        int textColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.A00 ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        LE.A0S(this, gradientDrawable);
        LE.A0X(this.A02, false, 14);
        if (this.A00) {
            textColor = -1;
        } else {
            textColor = -10459280;
        }
        this.A02.setTextColor(textColor);
        this.A01.setColorFilter(textColor);
    }

    public final void A01() {
        setSelected(!this.A00);
    }

    public void setData(String str, @Nullable LM lm) {
        this.A02.setText(str);
        if (lm != null) {
            this.A01.setImageBitmap(LN.A01(lm));
            this.A01.setVisibility(0);
            this.A02.setPadding(A06, 0, 0, 0);
        } else {
            this.A01.setVisibility(8);
            this.A02.setPadding(0, 0, 0, 0);
        }
        A00();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.A00 = z10;
        A00();
    }
}
