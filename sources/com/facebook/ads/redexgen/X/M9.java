package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public abstract class M9 extends FrameLayout {
    public int A00;
    public C2F A01;
    public C2G A02;

    @Nullable
    public C2H A03;
    public final C2D A04;
    public final C1316Wj A05;
    public final IT A06;

    @Nullable
    public final InterfaceC1029Lc A07;

    @Nullable
    public final InterfaceC1030Ld A08;
    public final String A09;

    @Nullable
    public final C1U A0A;
    public final MB A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(C2H c2h, C2F c2f);

    public abstract void A0O(C2H c2h, C2F c2f);

    public abstract boolean A0P();

    public M9(C1316Wj c1316Wj, IT it, String str) {
        this(c1316Wj, it, str, null, null, null);
    }

    public M9(C1316Wj c1316Wj, IT it, String str, @Nullable C1U c1u, @Nullable InterfaceC1030Ld interfaceC1030Ld, @Nullable InterfaceC1029Lc interfaceC1029Lc) {
        super(c1316Wj);
        this.A00 = 0;
        this.A01 = C2F.A04;
        this.A03 = null;
        this.A0B = new S4(this);
        this.A05 = c1316Wj;
        this.A06 = it;
        this.A08 = interfaceC1030Ld;
        this.A07 = interfaceC1029Lc;
        this.A09 = str;
        this.A0A = c1u;
        this.A04 = C2E.A00(this.A05.A00());
    }

    public static /* synthetic */ int A00(M9 m92) {
        int i10 = m92.A00;
        m92.A00 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A01(M9 m92) {
        int i10 = m92.A00;
        m92.A00 = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A8n(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C2H c2h) {
        this.A02.A08(this.A01);
        A0N(c2h, this.A01);
        C05370u.A01(this.A05).A0L();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C2H c2h) {
        this.A03 = c2h;
        this.A02.A09(this.A01, this.A00);
        A0O(c2h, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new C2G(new C0954Ib(this.A09, this.A06));
        InterfaceC1030Ld interfaceC1030Ld = this.A08;
        if (interfaceC1030Ld != null) {
            interfaceC1030Ld.ABd(true);
        }
        A0C();
    }
}
