package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.ads.gl;

/* renamed from: com.facebook.ads.redexgen.X.Lw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1048Lw extends LinearLayout {
    public static final int A06 = (int) (Kd.A02 * 10.0f);
    public static final int A07 = (int) (Kd.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final NB A05;

    public C1048Lw(C1316Wj c1316Wj, int i10) {
        super(c1316Wj);
        this.A01 = false;
        this.A02 = new ImageView(c1316Wj);
        ImageView imageView = this.A02;
        int i11 = A06;
        imageView.setPadding(i11, i11, i11, i11);
        this.A05 = new NB(c1316Wj);
        this.A05.setProgress(gl.Code);
        NB nb2 = this.A05;
        int i12 = A06;
        nb2.setPadding(i12, i12, i12, i12);
        this.A04 = new TextView(c1316Wj);
        setOrientation(0);
        this.A03 = new LinearLayout(c1316Wj);
        this.A00 = i10;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i10 = A07;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i10, i10);
        LE.A0X(this.A04, true, 16);
        this.A04.setTextColor(-1);
        this.A04.setVisibility(8);
        this.A03.addView(this.A02, layoutParams2);
        this.A03.addView(this.A05, layoutParams2);
        addView(this.A03, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A04, actionTextLayoutParams);
    }

    private void A01() {
        int i10;
        NB nb2 = this.A05;
        if (this.A00 == 2) {
            i10 = this.A01 ? 4 : 0;
        } else {
            i10 = 8;
        }
        nb2.setVisibility(i10);
        this.A02.setVisibility(this.A00 == 2 ? 8 : 0);
    }

    public final boolean A02() {
        return !this.A04.getText().toString().isEmpty();
    }

    public final boolean A03() {
        int i10 = this.A00;
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setColors(int i10) {
        this.A05.A02(C2U.A01(i10, 77), i10);
        this.A02.setColorFilter(i10);
    }

    public void setInitialUnskippableSeconds(int i10) {
        if (i10 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f) {
        this.A05.setProgressWithAnimation(f);
    }

    public void setProgressSpinnerInvisible(boolean z10) {
        this.A01 = z10;
        A01();
    }

    public void setToolbarActionMode(int i10) {
        LM lm;
        this.A00 = i10;
        A01();
        setVisibility(0);
        if (i10 == 0) {
            lm = LM.CROSS;
        } else if (i10 == 1) {
            lm = LM.SKIP_ARROW;
        } else if (i10 == 3) {
            lm = LM.MINIMIZE_ARROW;
        } else if (i10 != 4) {
            lm = LM.CROSS;
        } else {
            lm = LM.CROSS;
            this.A02.setVisibility(8);
            setVisibility(8);
        }
        this.A02.setImageBitmap(LN.A01(lm));
        LE.A0G(1002, this.A02);
    }

    public void setToolbarMessage(String str) {
        this.A04.setText(str);
        this.A04.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z10) {
        this.A04.setVisibility(z10 ? 0 : 4);
    }
}
