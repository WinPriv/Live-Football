package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: assets/audience_network.dex */
public final class OD extends LinearLayout {

    @Nullable
    public LinearLayout A00;
    public final int A01;
    public final C1316Wj A02;
    public final NI A03;
    public final NO A04;
    public static final int A07 = (int) (Kd.A02 * 16.0f);
    public static final int A08 = (int) (Kd.A02 * 16.0f);
    public static final int A06 = (int) (Kd.A02 * 8.0f);
    public static final int A05 = (int) (Kd.A02 * 72.0f);

    public OD(OB ob2) {
        super(OB.A04(ob2));
        this.A02 = OB.A04(ob2);
        this.A03 = new NI(this.A02);
        this.A04 = new NO(this.A02, OB.A02(ob2), true, false, true);
        this.A01 = OB.A00(ob2);
        A03(ob2);
    }

    public /* synthetic */ OD(OB ob2, R6 r62) {
        this(ob2);
    }

    private void A00() {
        A01(this.A03, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i10) {
        view.setTranslationY(i10);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i10).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(OB ob2) {
        if (!TextUtils.isEmpty(OB.A05(ob2))) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            LinearLayout linearLayout = this.A00;
            int i10 = A08;
            linearLayout.setPadding(i10, i10 / 2, i10, i10 / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, A08 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            LE.A0X(textView, false, 16);
            textView.setText(OB.A05(ob2));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new AsyncTaskC1195Ro(imageView, this.A02).A04().A07(OB.A06(ob2));
            int i11 = A07;
            LinearLayout.LayoutParams informativeTextViewParams = new LinearLayout.LayoutParams(i11, i11);
            informativeTextViewParams.setMargins(0, 0, A08 / 2, 0);
            this.A00.addView(imageView, informativeTextViewParams);
            this.A00.addView(textView, layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setColor(469762047);
            LE.A0S(this.A00, gradientDrawable);
            addView(this.A00, layoutParams);
        }
    }

    private void A03(OB ob2) {
        LE.A0M(this.A03, 0);
        this.A03.setRadius(50);
        if (OB.A01(ob2).A00() == C1G.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        new AsyncTaskC1195Ro(this.A03, this.A02).A04().A07(OB.A03(ob2).A01());
        this.A04.A01(OB.A01(ob2).A06(), OB.A03(ob2).A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A08;
        layoutParams.setMargins(0, i10, 0, i10 / 2);
        View view = this.A03;
        int i11 = A05;
        ViewGroup.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(i11, i11);
        addView(view, titleAndDescriptionParams);
        addView(this.A04, layoutParams);
        A02(ob2);
        LE.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(OC oc2) {
        A00();
        postDelayed(new R6(this, oc2), this.A01);
    }
}
