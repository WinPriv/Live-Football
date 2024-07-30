package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1086Ni {
    public static AbstractC07288q A00(final NV nv, int i10, final String str, final C1176Qv c1176Qv) {
        if (i10 == 1) {
            return new AbstractC07288q(nv, str, c1176Qv) { // from class: com.facebook.ads.redexgen.X.1i
                public static final int A00 = (int) (Kd.A02 * 20.0f);
                public static final int A01 = (int) (Kd.A02 * 16.0f);

                @Override // com.facebook.ads.redexgen.X.NR
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC07288q
                public final void A0j(C1316Wj c1316Wj) {
                    NO titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c1316Wj);
                    LE.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    int i11 = A01;
                    linearLayout.setPadding(i11, i11, i11, i11);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new AbstractC07288q(nv, str, c1176Qv) { // from class: com.facebook.ads.redexgen.X.26
            public static final int A00 = (int) (Kd.A02 * 12.0f);

            @Override // com.facebook.ads.redexgen.X.NR
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC07288q, com.facebook.ads.redexgen.X.NR
            public final boolean A0B() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC07288q
            public final void A0j(C1316Wj c1316Wj) {
                NO titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                int i11 = A00;
                titleDescContainer.setPadding(i11, i11, i11, i11);
                LE.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
