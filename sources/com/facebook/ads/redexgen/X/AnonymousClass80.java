package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.80, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass80 extends RB {

    @Nullable
    public NR A00;
    public final ImageView A01;
    public final AnonymousClass57 A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public AnonymousClass80(C1316Wj c1316Wj, M4 m42, IT it, AnonymousClass18 anonymousClass18, C6G c6g, InterfaceC1029Lc interfaceC1029Lc) {
        super(c1316Wj, m42, it, anonymousClass18, c6g, interfaceC1029Lc);
        this.A02 = new RA(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        this.A01 = new ImageView(getContext());
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setAdjustViewBounds(true);
        new AsyncTaskC1195Ro(this.A01, super.A03).A05(super.A01.A0O().A0D().A00(), super.A01.A0O().A0D().A01()).A06(new R9(this)).A07(super.A01.A0O().A0D().A07());
    }

    private NR A01(int i10) {
        if (this.A01.getParent() != null) {
            LE.A0J(this.A01);
        }
        return NS.A00(new NU(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0E(this.A07.getToolbarHeight()).A0H(this.A07).A0D(i10).A0J(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0P();
        }
    }

    private void A06(int i10) {
        LE.A0J(this.A00);
        this.A00 = A01(i10);
        C1K colors = this.A00.getColors();
        NR nr = this.A00;
        LE.A0M(this, colors.A07(nr != null && (nr.A0c() || (this.A00 instanceof AbstractC1188Rh))));
        this.A07.A04(colors, this.A00.A0c());
        addView(this.A00, 0, RB.A0D);
        NR nr2 = this.A00;
        setUpFullscreenMode(nr2 != null && nr2.A0c());
    }

    @Override // com.facebook.ads.redexgen.X.RB
    public final void A0Q() {
        LE.A0L(this.A00);
        LE.A0L(this.A07);
        this.A03.set(true);
        A05();
        int A03 = super.A01.A0O().A0D().A03();
        if (A03 > 0) {
            NR nr = this.A00;
            if (nr != null) {
                nr.A0a();
            }
            A0R(A03, new R8(this));
            return;
        }
        this.A05.set(true);
        AbstractC1028Lb abstractC1028Lb = this.A07;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC1028Lb.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.facebook.ads.redexgen.X.RB
    public final void A0S(AnonymousClass59 anonymousClass59) {
        anonymousClass59.A0K(this.A02);
        int orientation = anonymousClass59.A0H().getResources().getConfiguration().orientation;
        A06(orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        LE.A0H(this.A00);
        LE.A0H(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.RB
    public final boolean A0T() {
        NR nr = this.A00;
        return nr != null && nr.A0d(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void ABd(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AC2(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        NR nr = this.A00;
        if (nr != null) {
            return nr.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.RB, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0O().A0N()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RB, com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void onDestroy() {
        if (ID.A1K(super.A03)) {
            super.A03.A09().AF4(this.A01);
        }
        NR nr = this.A00;
        if (nr != null) {
            nr.A0W();
        }
        super.onDestroy();
    }
}
