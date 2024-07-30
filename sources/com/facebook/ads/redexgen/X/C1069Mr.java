package com.facebook.ads.redexgen.X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.Mr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1069Mr extends WebViewClient {
    public final /* synthetic */ AbstractC1070Ms A00;

    public C1069Mr(AbstractC1070Ms abstractC1070Ms) {
        this.A00 = abstractC1070Ms;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1070Ms.A02(C06977l.A2e);
        return true;
    }
}
