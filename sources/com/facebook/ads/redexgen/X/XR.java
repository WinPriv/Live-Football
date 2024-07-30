package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class XR implements InterfaceC1029Lc {
    public static String[] A01 = {"JdxG2e87fiw1QxhKtyp6wy4hCZ34K54h", "5l6PiVFmWkFi4LSRmzN6ZIbVVY4PyA16", "qh41B7qjlQhNnOsbjTqj3JtjZfsrgLHf", "L6JKyztUTZrhaC2oSi2AGhNMneOalgfU", "mLvzPn8zSeH", "6Oneq6t5dYPlbDhRy7qxaYTJsizasisX", "J8", "lXMgpjBtmdYXVX4s4nwhe"};
    public final WeakReference<AnonymousClass59> A00;

    public XR(AnonymousClass59 anonymousClass59) {
        this.A00 = new WeakReference<>(anonymousClass59);
    }

    private void A00(AnonymousClass59 anonymousClass59) {
        OU ou;
        RelativeLayout relativeLayout;
        ou = anonymousClass59.A0C;
        if (ou != null) {
            relativeLayout = anonymousClass59.A06;
            relativeLayout.bringChildToFront(ou);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1029Lc
    public final void A3H(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        AnonymousClass59 anonymousClass59 = this.A00.get();
        if (anonymousClass59 != null) {
            relativeLayout = anonymousClass59.A06;
            relativeLayout.addView(view, i10, layoutParams);
            A00(anonymousClass59);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1029Lc
    public final void A3I(View view, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        AnonymousClass59 anonymousClass59 = this.A00.get();
        if (anonymousClass59 != null) {
            relativeLayout = anonymousClass59.A06;
            relativeLayout.addView(view, layoutParams);
            A00(anonymousClass59);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1029Lc
    public void A3s(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0D(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1029Lc
    public void A3t(String str, C8M c8m) {
        if (this.A00.get() != null) {
            this.A00.get().A0F(str, c8m);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1029Lc
    public final void A8g(String str, C1U c1u) {
        if (this.A00.get() != null) {
            AnonymousClass59 anonymousClass59 = this.A00.get();
            String[] strArr = A01;
            if (strArr[0].charAt(19) != strArr[1].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "LaehfLm13EgRqqa58La6JsJDVjNkKsjm";
            strArr2[1] = "U7opStToMRhy5hKGwjx6Oh4Ofub1lgfJ";
            anonymousClass59.A0E(str, c1u);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1029Lc
    public final void AA9(int i10) {
        AnonymousClass59 activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i10);
        }
    }
}
