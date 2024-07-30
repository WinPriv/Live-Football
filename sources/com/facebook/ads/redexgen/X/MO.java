package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class MO extends LinearLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public static final int A05 = (int) (Kd.A02 * 8.0f);
    public static final int A06 = (int) (Kd.A02 * 14.5d);
    public static final int A04 = (int) (Kd.A02 * 20.0f);
    public static final LinearLayout.LayoutParams A03 = new LinearLayout.LayoutParams(-1, -2);

    public MO(C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A00 = new ImageView(c1316Wj);
        this.A00.setColorFilter(-10459280);
        int i10 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 16;
        this.A00.setLayoutParams(layoutParams);
        this.A01 = new LinearLayout(c1316Wj);
        this.A01.setOrientation(1);
        this.A01.setPadding(A05 * 2, 0, 0, 0);
        LinearLayout linearLayout = this.A01;
        LinearLayout.LayoutParams iconParams = A03;
        linearLayout.setLayoutParams(iconParams);
        this.A02 = new TextView(c1316Wj);
        LE.A0X(this.A02, true, 16);
        this.A02.setTextColor(-14934495);
        LinearLayout linearLayout2 = this.A01;
        TextView textView = this.A02;
        LinearLayout.LayoutParams iconParams2 = A03;
        linearLayout2.addView(textView, iconParams2);
        setOrientation(0);
        addView(this.A00);
        addView(this.A01);
    }

    public void setInfo(LM lm, String str, String str2) {
        this.A00.setImageBitmap(LN.A01(lm));
        this.A02.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = new TextView(getContext());
            LE.A0X(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.A01.addView(textView, A03);
            int i10 = A05;
            setPadding(0, i10, 0, i10);
            return;
        }
        int i11 = A06;
        setPadding(0, i11, 0, i11);
    }
}
