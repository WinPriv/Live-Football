package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.huawei.hms.ads.gl;

/* loaded from: assets/audience_network.dex */
public class TC implements InterfaceC0965Im {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ T8 A01;

    public TC(T8 t82, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = t82;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0965Im
    public final void AES() {
        this.A00.setVolume(gl.Code);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0965Im
    public final void AEV(NativeAd nativeAd) {
        this.A01.A0I(C1228Sw.A0L(nativeAd.getInternalNativeAd()), null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0965Im
    public final void AF7() {
        this.A01.A0D();
    }
}
