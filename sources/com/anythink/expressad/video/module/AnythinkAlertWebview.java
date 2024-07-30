package com.anythink.expressad.video.module;

import a3.l;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.b.a;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.webview.BrowserView;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.videocommon.b.i;
import com.anythink.expressad.videocommon.e.c;
import com.anythink.expressad.videocommon.e.d;

/* loaded from: classes.dex */
public class AnythinkAlertWebview extends AnythinkH5EndCardView {
    private String A;

    public AnythinkAlertWebview(Context context) {
        super(context);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final String a() {
        if (!TextUtils.isEmpty(this.f11744x)) {
            c.a().a(a.b().e(), this.f11744x, false);
            String J = d.J();
            this.A = J;
            if (!TextUtils.isEmpty(J)) {
                return i.a().c(this.A);
            }
            return "";
        }
        return "";
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        String a10 = a();
        if (this.f && this.f11686b != null && !TextUtils.isEmpty(a10)) {
            BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.f11686b);
            downloadListener.setTitle(this.f11686b.bb());
            this.f11739s.setDownloadListener(downloadListener);
            this.f11739s.setCampaignId(this.f11686b.aZ());
            setCloseVisible(8);
            this.f11739s.setApiManagerJSFactory(bVar);
            this.f11739s.setWebViewListener(new com.anythink.expressad.atsignalcommon.a.b() { // from class: com.anythink.expressad.video.module.AnythinkAlertWebview.1
                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    o.d("AlertWebview", "===========finish+".concat(String.valueOf(str)));
                    j.a();
                    j.a(webView, "onJSBridgeConnected", "");
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onReceivedError(WebView webView, int i10, String str, String str2) {
                    super.onReceivedError(webView, i10, str, str2);
                    o.d("AlertWebview", "===========onReceivedError");
                    if (!AnythinkAlertWebview.this.f11743w) {
                        l.C(str2, "onReceivedError,url:", AnythinkBaseView.TAG);
                        AnythinkAlertWebview.this.f11743w = true;
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void readyState(WebView webView, int i10) {
                    super.readyState(webView, i10);
                    o.d("MBridgeAlertWebview", "===========readyState  :  ".concat(String.valueOf(i10)));
                    AnythinkAlertWebview anythinkAlertWebview = AnythinkAlertWebview.this;
                    if (!anythinkAlertWebview.f11743w) {
                        boolean z10 = true;
                        if (i10 != 1) {
                            z10 = false;
                        }
                        anythinkAlertWebview.f11742v = z10;
                    }
                }
            });
            setHtmlSource(com.anythink.expressad.videocommon.b.j.a().b(a10));
            this.f11742v = false;
            if (TextUtils.isEmpty(this.f11741u)) {
                l.C(a10, "load url:", AnythinkBaseView.TAG);
                this.f11739s.loadUrl(a10);
            } else {
                o.a(AnythinkBaseView.TAG, "load html...");
                this.f11739s.loadDataWithBaseURL(a10, this.f11741u, "text/html", "UTF-8", null);
            }
            this.f11739s.setBackgroundColor(0);
            setBackgroundColor(0);
            return;
        }
        this.f11689e.a(101, "");
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.h
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f11737q;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
    }

    public AnythinkAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
