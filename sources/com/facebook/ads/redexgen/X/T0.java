package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class T0 extends AbstractC1136Ph {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ Z9 A01;
    public final /* synthetic */ C1228Sw A02;
    public final /* synthetic */ boolean A03;

    public T0(C1228Sw c1228Sw, View view, boolean z10, Z9 z92) {
        this.A02 = c1228Sw;
        this.A00 = view;
        this.A03 = z10;
        this.A01 = z92;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1136Ph
    public final void A00() {
        J1 j12;
        j12 = this.A02.A0e;
        j12.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1136Ph
    public final void A01() {
        J1 j12;
        j12 = this.A02.A0e;
        j12.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1136Ph
    public final void A02() {
        J1 j12;
        J1 j13;
        C1316Wj c1316Wj;
        C1137Pi c1137Pi;
        WeakReference weakReference;
        L6 l62;
        J1 j14;
        Z0 z02;
        View view;
        View view2;
        Z0 z03;
        View view3;
        Z0 z04;
        View view4;
        Z0 z05;
        EnumC0973Iu enumC0973Iu;
        Z0 z06;
        boolean z10;
        Z0 z07;
        boolean z11;
        Z0 z08;
        boolean z12;
        Z0 z09;
        boolean A0p;
        Z0 z010;
        EnumC05420z enumC05420z;
        Z0 z011;
        boolean z13;
        Z0 z012;
        NativeAdLayout nativeAdLayout;
        Z0 z013;
        String str;
        Z0 z014;
        Z0 z015;
        WeakReference weakReference2;
        WeakReference weakReference3;
        C1137Pi c1137Pi2;
        Drawable drawable;
        C1137Pi c1137Pi3;
        J1 j15;
        C1137Pi c1137Pi4;
        J1 j16;
        j12 = this.A02.A0e;
        j12.A0B();
        if (ID.A1X(this.A02.A11())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof C1118Op) && !((C1118Op) adContentsView).A02()) {
                    c1137Pi4 = this.A02.A0R;
                    c1137Pi4.A0T();
                    j16 = this.A02.A0e;
                    j16.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            if (A04[6].length() != 8) {
                throw new RuntimeException();
            }
            A04[4] = "kV1RqodiW8kqR1rQOQ4NCiAB35VpASKe";
            drawable = this.A02.A01;
            if (drawable == null) {
                c1137Pi3 = this.A02.A0R;
                c1137Pi3.A0T();
                j15 = this.A02.A0e;
                j15.A07();
                return;
            }
            C1228Sw.A0e(drawable, imageView);
        }
        j13 = this.A02.A0e;
        c1316Wj = this.A02.A0c;
        j13.A0C(c1316Wj, this.A01.A0G());
        c1137Pi = this.A02.A0R;
        if (c1137Pi != null) {
            c1137Pi2 = this.A02.A0R;
            c1137Pi2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((AbstractC1136Ph) weakReference3.get()).A02();
            }
        }
        l62 = this.A02.A0f;
        if (l62.A07()) {
            j14 = this.A02.A0e;
            j14.A04();
            return;
        }
        this.A02.A0b();
        z02 = this.A02.A09;
        if (z02 != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    z03 = this.A02.A09;
                    view3 = this.A02.A04;
                    z03.A08(view3);
                    z04 = this.A02.A09;
                    view4 = this.A02.A06;
                    z04.A07(view4);
                    z05 = this.A02.A09;
                    enumC0973Iu = this.A02.A0I;
                    z05.A0B(enumC0973Iu);
                    z06 = this.A02.A09;
                    z10 = this.A02.A0W;
                    z06.A0E(z10);
                    z07 = this.A02.A09;
                    z11 = this.A02.A0Z;
                    z07.A0I(z11);
                    z08 = this.A02.A09;
                    z12 = this.A02.A0Y;
                    z08.A0H(z12);
                    z09 = this.A02.A09;
                    A0p = this.A02.A0p();
                    z09.A0F(A0p);
                    z010 = this.A02.A09;
                    enumC05420z = this.A02.A08;
                    z010.A09(enumC05420z);
                    z011 = this.A02.A09;
                    z13 = this.A02.A0X;
                    z011.A0G(z13);
                    z012 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    z012.A0A(MA.A00(nativeAdLayout));
                    z013 = this.A02.A09;
                    str = this.A02.A0S;
                    z013.A0C(str);
                    z014 = this.A02.A09;
                    z014.A0J(this.A03);
                    z015 = this.A02.A09;
                    z015.A02();
                }
            }
        }
    }
}
