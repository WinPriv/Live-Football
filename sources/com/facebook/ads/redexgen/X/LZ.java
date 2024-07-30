package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class LZ extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C2D A02;
    public final C1316Wj A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{118, 83};
    }

    static {
        A03();
        A08 = (int) (Kd.A02 * 50.0f);
        A05 = (int) (Kd.A02 * 10.0f);
        A06 = (int) (Kd.A02 * 20.0f);
        A09 = (int) (Kd.A02 * 4.0f);
        A07 = (int) (Kd.A02 * 12.0f);
    }

    public LZ(C1316Wj c1316Wj, int i10) {
        super(c1316Wj);
        this.A03 = c1316Wj;
        this.A02 = C2E.A00(c1316Wj.A00());
        setOrientation(0);
        this.A00 = new ImageView(c1316Wj);
        this.A01 = new ImageView(c1316Wj);
        A04(i10);
    }

    private void A04(int i10) {
        LM lm;
        A05(this.A00, LM.AD_CHOICES_ICON);
        if (i10 == 2) {
            int i11 = A05;
            setPadding(i11, i11 / 3, i11, i11 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 108));
            textView.setTextColor(-1);
            int i12 = A05;
            textView.setPadding(0, i12 / 2, i12 / 2, i12 / 2);
            LE.A0X(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            int i13 = A07;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13, i13);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        int i14 = A05;
        setPadding(i14, i14, i14, i14);
        if (i10 == 1) {
            lm = LM.AN_INFO_ICON;
        } else {
            lm = LM.DEFAULT_INFO_ICON;
        }
        A05(this.A01, lm);
        int i15 = A06;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i15, i15);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        int i16 = A06;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i16, i16);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, LM lm) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(LN.A01(lm));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1U c1u, String str, C0954Ib c0954Ib, InterfaceC1029Lc interfaceC1029Lc) {
        setOnClickListener(new LY(this, c0954Ib, interfaceC1029Lc, str, c1u));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i10);
        LE.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i10) {
        this.A00.setColorFilter(i10);
        this.A01.setColorFilter(i10);
    }
}
