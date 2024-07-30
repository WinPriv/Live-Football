package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class RB extends FrameLayout implements InterfaceC1030Ld {
    public static final RelativeLayout.LayoutParams A0D = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AnonymousClass18 A01;
    public final C6G A02;
    public final C1316Wj A03;
    public final IT A04;
    public final C0954Ib A05;
    public final L6 A06;
    public final AbstractC1028Lb A07;
    public final InterfaceC1029Lc A08;
    public final M4 A09;
    public final C1137Pi A0A;
    public final L1 A0B;

    @DoNotStrip
    public final AbstractC1136Ph A0C;

    public abstract void A0Q();

    public abstract void A0S(AnonymousClass59 anonymousClass59);

    public abstract boolean A0T();

    public RB(C1316Wj c1316Wj, M4 m42, IT it, AnonymousClass18 anonymousClass18, C6G c6g, InterfaceC1029Lc interfaceC1029Lc) {
        super(c1316Wj);
        this.A0C = new RF(this);
        this.A06 = new L6();
        this.A00 = false;
        this.A03 = c1316Wj;
        this.A09 = m42;
        this.A04 = it;
        this.A01 = anonymousClass18;
        this.A02 = c6g;
        this.A08 = interfaceC1029Lc;
        this.A05 = new C0954Ib(this.A01.A0U(), this.A04);
        this.A0A = new C1137Pi(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0W(this.A01.A0H());
        this.A0A.A0X(this.A01.A0I());
        this.A07 = A0N();
        this.A0B = new L1(this);
        this.A0B.A05(L0.A03);
    }

    private AbstractC1028Lb A0N() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0F());
        int A03 = this.A01.A0O().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A0R(), this.A01.A0U(), A03, this.A01.A0S());
        fullScreenAdToolbar.A04(this.A01.A0N().A01(), true);
        if (A03 < 0 && this.A01.A0O().A0M()) {
            fullScreenAdToolbar.setToolbarActionMode(4);
        }
        fullScreenAdToolbar.setToolbarListener(new RC(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        if (this.A01.A0O().A0P()) {
            OD A0B = new OB(this.A03, this.A01.A0O().A0E(), this.A01.A0R()).A08(this.A01.A0N().A01()).A0B();
            C0956Id.A04(A0B, this.A05, EnumC0953Ia.A0U);
            addView(A0B, A0D);
            A0B.A04(new RD(this));
            return;
        }
        A0Q();
    }

    public final void A0P() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0R(int i10, AbstractRunnableC0997Ju abstractRunnableC0997Ju) {
        new KX(i10, new RE(this, i10, abstractRunnableC0997Ju)).A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void A8k(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        this.A08.A3I(this, A0D);
        A0S(anonymousClass59);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AEA(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A0U())) {
            this.A04.A8r(this.A01.A0U(), new N2().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1029Lc interfaceC1029Lc) {
    }

    public void setUpFullscreenMode(boolean z10) {
        L0 l02;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z10) {
            l02 = L0.A04;
        } else {
            l02 = L0.A03;
        }
        this.A0B.A05(l02);
    }
}
