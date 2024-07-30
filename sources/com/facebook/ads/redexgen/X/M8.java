package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class M8 extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C2D A02;
    public final C1316Wj A03;
    public final MB A04;
    public final boolean A05;
    public static final int A09 = (int) (Kd.A02 * 16.0f);
    public static final int A0A = (int) (Kd.A02 * 8.0f);
    public static final int A0D = (int) (Kd.A02 * 44.0f);
    public static final int A08 = (int) (Kd.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (Kd.A02 * 75.0f);
    public static final int A0B = (int) (Kd.A02 * 25.0f);
    public static final int A0F = (int) (Kd.A02 * 45.0f);
    public static final int A0C = (int) (Kd.A02 * 15.0f);
    public static final int A06 = (int) (Kd.A02 * 16.0f);

    public M8(M7 m72) {
        super(M7.A01(m72));
        this.A03 = M7.A01(m72);
        this.A02 = C2E.A00(this.A03.A00());
        this.A04 = M7.A03(m72);
        this.A01 = M7.A09(m72) ? A0E : A0F;
        this.A00 = M7.A09(m72) ? A0B : A0C;
        this.A05 = M7.A0A(m72);
        setFocusable(true);
        View A01 = A01(m72);
        View A00 = A00(m72);
        View footerView = getFooterView();
        LE.A0K(A01);
        LE.A0K(A00);
        LE.A0K(footerView);
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(10);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-1, -1);
        headerParams.addRule(13);
        headerParams.addRule(3, A01.getId());
        headerParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i10 = A09;
        layoutParams.setMargins(i10, 0, i10, i10);
        addView(A01, footerParams);
        addView(A00, headerParams);
        addView(footerView, layoutParams);
        footerView.setVisibility(M7.A0B(m72) ? 0 : 8);
    }

    public /* synthetic */ M8(M7 m72, M5 m52) {
        this(m72);
    }

    private View A00(M7 m72) {
        ImageView imageView = new ImageView(getContext());
        int i10 = this.A00;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setImageBitmap(LN.A01(M7.A02(m72)));
        imageView.setColorFilter(-1);
        int i11 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(M7.A00(m72));
        LE.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i12 = A09;
        layoutParams.setMargins(i12, 0, i12, i12);
        TextView textView = new TextView(getContext());
        LE.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(M7.A04(m72));
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i13 = A09;
        layoutParams2.setMargins(i13, 0, i13, i13);
        TextView textView2 = new TextView(getContext());
        LE.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(M7.A05(m72));
        textView2.setGravity(17);
        LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(-1, -2);
        int i14 = A09;
        subtitleParams.setMargins(i14, 0, i14, i14);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        linearLayout.addView(textView2, subtitleParams);
        if (M7.A08(m72)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(M7.A06(m72))) {
                NI ni = new NI(this.A03);
                int i15 = A0F;
                LinearLayout.LayoutParams subtitleParams2 = new LinearLayout.LayoutParams(i15, i15);
                subtitleParams2.setMargins(0, 0, A0A, 0);
                ni.setFullCircleCorners(true);
                AsyncTaskC1195Ro asyncTaskC1195Ro = new AsyncTaskC1195Ro(ni, this.A03);
                int i16 = A0F;
                asyncTaskC1195Ro.A05(i16, i16).A07(M7.A06(m72));
                linearLayout2.addView(ni, subtitleParams2);
            }
            MD md2 = new MD(this.A03);
            md2.setData(M7.A07(m72), LM.CHECKMARK);
            md2.setSelected(true);
            linearLayout2.addView(md2, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(M7 m72) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (M7.A0C(m72)) {
            ImageView imageView = new ImageView(getContext());
            int i10 = A08;
            imageView.setPadding(i10, i10, i10, i10);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(LN.A01(LM.CROSS));
            imageView.setOnClickListener(new M5(this));
            int i11 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
            int i12 = A07;
            layoutParams.setMargins(i12, i12, i12, i12);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(LN.A01(LM.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i10 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        LE.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i11 = A0A;
        managePrefsText.setPadding(i11, i11, i11, i11);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new M6(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
