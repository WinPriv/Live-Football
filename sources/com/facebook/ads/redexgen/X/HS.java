package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Nullable;
import com.huawei.hms.ads.gl;

/* loaded from: assets/audience_network.dex */
public final class HS implements PF {
    public static String[] A05 = {"hBpWhHnhmL5X5T638nUqTTajkmWXq0Jo", "NpDFSQumXtRd9HWL09JYgYkJkV27cWXf", "AxBlHN1IgfTmgBmsQuewVQ8cZkGbRxm7", "auJ8KOWij5XUc2OVh7MwLzJgAA213fGo", "l76sAXRLIUx67IYksgmFi2YoLkAbbgnJ", "1g5g87wiu8KgxwL4MK6lukjj0pQl5xRt", "P6OmLQzTnVk1JPGEjhdY9fnbkCpMcnWe", "QfRSCgXdOTNJYzcBVbNAL0t7GjPIPusf"};

    @Nullable
    public ViewPropertyAnimator A00;
    public PE A01 = PE.A05;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public HS(View view, int i10, boolean z10) {
        this.A02 = i10;
        this.A03 = view;
        this.A04 = z10;
    }

    private void A04(boolean z10) {
        this.A01 = PE.A04;
        if (this.A04) {
            LE.A0L(this.A03);
        }
        String[] strArr = A05;
        if (strArr[4].charAt(27) != strArr[2].charAt(27)) {
            throw new RuntimeException();
        }
        A05[0] = "iTCONHrR5nymrEIlx0VHUpGctJrwflIU";
        if (!z10) {
            this.A03.setAlpha(1.0f);
            this.A01 = PE.A03;
        } else {
            this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new PJ(this));
        }
    }

    private void A05(boolean z10) {
        this.A01 = PE.A06;
        if (z10) {
            this.A00 = this.A03.animate().alpha(gl.Code).setDuration(this.A02).setListener(new PK(this));
            return;
        }
        View view = this.A03;
        if (A05[3].charAt(11) != 'U') {
            throw new RuntimeException();
        }
        A05[1] = "Va1KnH22vapH99C3A8HUoUYkLtllReKa";
        view.setAlpha(gl.Code);
        this.A01 = PE.A05;
    }

    @Override // com.facebook.ads.redexgen.X.PF
    public final void A3M(boolean z10, boolean z11) {
        if (z11) {
            A05(z10);
        } else {
            A04(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PF
    public final PE A7V() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.PF
    public final void cancel() {
        this.A03.clearAnimation();
        ViewPropertyAnimator viewPropertyAnimator = this.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }
}
