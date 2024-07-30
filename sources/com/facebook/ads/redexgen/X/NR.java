package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class NR extends RelativeLayout {
    public static final int A08 = (int) (Kd.A02 * 16.0f);
    public static final int A09 = (int) (Kd.A02 * 28.0f);
    public C1K A00;
    public boolean A01;
    public boolean A02;
    public final C1316Wj A03;
    public final IT A04;
    public final ViewOnClickListenerC1193Rm A05;
    public final NO A06;
    public final NV A07;

    public abstract boolean A0c();

    public NR(NV nv, boolean z10) {
        super(nv.A05());
        C1K A00;
        this.A01 = false;
        this.A07 = nv;
        this.A03 = nv.A05();
        this.A04 = nv.A06();
        if (nv.A00() == 1) {
            A00 = nv.A04().A0N().A01();
        } else {
            A00 = nv.A04().A0N().A00();
        }
        this.A00 = A00;
        this.A02 = z10;
        this.A05 = new ViewOnClickListenerC1193Rm(nv.A05(), nv.A04().A0T(), this.A00, nv.A04().A0O().A0F().A06(), nv.A06(), nv.A09(), nv.A0B(), nv.A07());
        this.A05.setRoundedCornersEnabled(A00());
        this.A05.setViewShowsOverMedia(A0B());
        LE.A0G(1001, this.A05);
        this.A06 = new NO(this.A03, this.A00, this.A02, A01(), A02());
        LE.A0K(this.A06);
    }

    public boolean A00() {
        return true;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public void A09(C6v c6v) {
        this.A01 = true;
    }

    public void A0A(C06826r c06826r) {
    }

    public boolean A0B() {
        return true;
    }

    public void A0W() {
    }

    public void A0X() {
    }

    public void A0Y() {
    }

    public void A0Z() {
    }

    public void A0a() {
    }

    public void A0b(C1B c1b, String str, double d10, @Nullable Bundle bundle) {
        this.A06.A01(c1b.A0E().A05(), c1b.A0E().A01(), null, false, !A0c() && d10 > 0.0d && d10 < 1.0d);
        this.A05.setCta(c1b.A0F(), str, new HashMap());
    }

    public boolean A0d(boolean z10) {
        return false;
    }

    public C1316Wj getAdContextWrapper() {
        return this.A03;
    }

    public IT getAdEventManager() {
        return this.A04;
    }

    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    public C1K getColors() {
        return this.A00;
    }

    public ViewOnClickListenerC1193Rm getCtaButton() {
        return this.A05;
    }

    public NO getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C1K A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            A00 = this.A07.A04().A0N().A01();
        } else {
            A00 = this.A07.A04().A0N().A00();
        }
        this.A00 = A00;
        this.A05.setViewShowsOverMedia(A0B());
        this.A05.setUpButtonColors(this.A00);
        this.A06.A00(this.A00, this.A02);
    }
}
