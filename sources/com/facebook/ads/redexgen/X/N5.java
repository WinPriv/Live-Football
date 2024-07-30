package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class N5 extends LinearLayout {
    public static final LinearLayout.LayoutParams A05 = new LinearLayout.LayoutParams(-2, -2);
    public final int A00;
    public final RelativeLayout A01;
    public final C1316Wj A02;
    public final ViewOnClickListenerC1193Rm A03;
    public final NI A04;

    public abstract void A0A(int i10);

    public N5(C1316Wj c1316Wj, int i10, C1K c1k, boolean z10, String str, IT it, InterfaceC1029Lc interfaceC1029Lc, C1137Pi c1137Pi, L6 l62) {
        super(c1316Wj);
        LE.A0K(this);
        this.A02 = c1316Wj;
        this.A00 = i10;
        this.A04 = new NI(c1316Wj);
        LE.A0M(this.A04, 0);
        LE.A0K(this.A04);
        this.A03 = new ViewOnClickListenerC1193Rm(c1316Wj, str, c1k, z10, it, interfaceC1029Lc, c1137Pi, l62);
        LE.A0G(1001, this.A03);
        this.A01 = new RelativeLayout(c1316Wj);
        this.A01.setLayoutParams(A05);
        LE.A0K(this.A01);
    }

    public void A08() {
    }

    public void A09() {
    }

    public final ViewOnClickListenerC1193Rm getCTAButton() {
        return this.A03;
    }

    public View getExpandableLayout() {
        return null;
    }

    @VisibleForTesting
    public final ImageView getIconView() {
        return this.A04;
    }

    public void setInfo(C1I c1i, C1L c1l, String str, String str2, @Nullable N8 n82) {
        this.A03.setCta(c1l, str, new HashMap(), n82);
        AsyncTaskC1195Ro asyncTaskC1195Ro = new AsyncTaskC1195Ro(this.A04, this.A02);
        int i10 = this.A00;
        asyncTaskC1195Ro.A05(i10, i10).A07(str2);
    }

    public void setTitleMaxLines(int i10) {
    }
}
