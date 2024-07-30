package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XL extends AbstractC05310o {
    public static byte[] A03;

    @Nullable
    public View A00;
    public final AnonymousClass54 A01;
    public final DY A02;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, Ascii.DC4, Ascii.DC4, Ascii.NAK, Ascii.SUB, -58, Ascii.SYN, Ascii.CAN, Ascii.VT, Ascii.EM, Ascii.VT, Ascii.DC4, Ascii.SUB, -58, Ascii.DC4, Ascii.ESC, Ascii.DC2, Ascii.DC2, -58, 7, 10, -4, Ascii.SI, Ascii.VT, Ascii.GS};
    }

    public XL(AnonymousClass54 anonymousClass54) {
        this.A02 = anonymousClass54.A09();
        this.A01 = anonymousClass54;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0C() {
        this.A02.A0D().A3d();
        C0989Jl.A00(new XN(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0D() {
        this.A02.A0D().A3g();
        C0989Jl.A00(new XM(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0D().A3f();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof C1197Rq) {
                JA.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            ED controller = this.A01.A08();
            if (controller != null) {
                controller.A0F();
            }
            C0989Jl.A00(new XO(this));
            AnonymousClass54 anonymousClass54 = this.A01;
            anonymousClass54.A0B(anonymousClass54.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && ID.A0y(this.A01.A07().getContext())) {
                final N0 n02 = new N0();
                this.A01.A0D(n02);
                n02.A0C(this.A01.getPlacementId());
                n02.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0D() != null) {
                    n02.A09(this.A01.A08().A0D().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof C1197Rq) {
                    n02.A0A(((C1197Rq) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5D
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        View view4;
                        View view5;
                        View view6;
                        view4 = XL.this.A00;
                        if (view4 != null) {
                            N0 n03 = n02;
                            view5 = XL.this.A00;
                            int width = view5.getWidth();
                            view6 = XL.this.A00;
                            n03.setBounds(0, 0, width, view6.getHeight());
                            n02.A0D(!r1.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(n02);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0F(InterfaceC05300n interfaceC05300n) {
        this.A02.A0D().A3e(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0G(J3 j32) {
        this.A02.A0D().A2a(L5.A01(this.A01.A04()), j32.A03().getErrorCode(), j32.A04());
        C0989Jl.A00(new XP(this, j32));
    }
}
