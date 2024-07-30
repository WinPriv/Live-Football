package com.facebook.ads.redexgen.X;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1053Mb implements View.OnClickListener {
    public final /* synthetic */ C1056Me A00;

    public ViewOnClickListenerC1053Mb(C1056Me c1056Me) {
        this.A00 = c1056Me;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A08;
            if (!webView.canGoForward()) {
                return;
            }
            webView2 = this.A00.A08;
            webView2.goForward();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
