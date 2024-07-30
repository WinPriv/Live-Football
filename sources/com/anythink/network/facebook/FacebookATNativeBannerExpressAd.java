package com.anythink.network.facebook;

import android.view.View;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;

/* loaded from: classes.dex */
public class FacebookATNativeBannerExpressAd extends FacebookATBaseNativeAd<NativeBannerAd> {

    /* renamed from: i, reason: collision with root package name */
    NativeBannerAdView.Type f12679i;

    /* renamed from: j, reason: collision with root package name */
    View f12680j;

    /* renamed from: k, reason: collision with root package name */
    private final String f12681k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r5.equals("100") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FacebookATNativeBannerExpressAd(android.content.Context r3, com.facebook.ads.NativeBannerAd r4, java.lang.String r5) {
        /*
            r2 = this;
            r0 = 1
            r2.<init>(r3, r4, r0)
            java.lang.String r3 = "FacebookATNativeBannerExpressAd"
            r2.f12681k = r3
            com.facebook.ads.NativeBannerAdView$Type r3 = com.facebook.ads.NativeBannerAdView.Type.HEIGHT_50
            r2.f12679i = r3
            r5.getClass()
            int r4 = r5.hashCode()
            r1 = -1
            switch(r4) {
                case 1691: goto L2d;
                case 48625: goto L24;
                case 48687: goto L19;
                default: goto L17;
            }
        L17:
            r0 = r1
            goto L37
        L19:
            java.lang.String r4 = "120"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L22
            goto L17
        L22:
            r0 = 2
            goto L37
        L24:
            java.lang.String r4 = "100"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L37
            goto L17
        L2d:
            java.lang.String r4 = "50"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L36
            goto L17
        L36:
            r0 = 0
        L37:
            switch(r0) {
                case 0: goto L45;
                case 1: goto L40;
                case 2: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L3f
        L3b:
            com.facebook.ads.NativeBannerAdView$Type r3 = com.facebook.ads.NativeBannerAdView.Type.HEIGHT_120
            r2.f12679i = r3
        L3f:
            return
        L40:
            com.facebook.ads.NativeBannerAdView$Type r3 = com.facebook.ads.NativeBannerAdView.Type.HEIGHT_100
            r2.f12679i = r3
            return
        L45:
            r2.f12679i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.network.facebook.FacebookATNativeBannerExpressAd.<init>(android.content.Context, com.facebook.ads.NativeBannerAd, java.lang.String):void");
    }

    @Override // com.anythink.network.facebook.FacebookATBaseNativeAd, com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        T t10;
        try {
            if (this.f12653c && (t10 = this.f12651a) != 0 && (t10 instanceof NativeBannerAd)) {
                if (this.f12680j == null) {
                    this.f12680j = NativeBannerAdView.render(this.f12652b, (NativeBannerAd) t10, this.f12679i);
                }
                return this.f12680j;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
