package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Yh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1364Yh implements AnonymousClass68 {
    public final C1W A00;
    public final InterfaceC05541l A01;
    public final C6G A02;
    public final C1316Wj A03;
    public final boolean A04;

    public C1364Yh(C1316Wj c1316Wj, InterfaceC05541l interfaceC05541l, C6G c6g, C1W c1w, boolean z10) {
        this.A03 = c1316Wj;
        this.A01 = interfaceC05541l;
        this.A02 = c6g;
        this.A00 = c1w;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C05551m(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z10) {
        if (this.A00.A09() == C1X.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z10) {
            C6G c6g = this.A02;
            String markupUrlResult = this.A00.A0E();
            A0E = c6g.A0R(markupUrlResult);
        }
        this.A00.A0H(A0E);
        this.A01.ABh();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAB() {
        if (this.A04) {
            this.A01.ABg(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAI() {
        A01(true);
    }
}
