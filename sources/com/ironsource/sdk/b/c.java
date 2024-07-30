package com.ironsource.sdk.b;

import android.annotation.TargetApi;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes2.dex */
public class c extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final e.a f26032a;

    public c(e.a aVar) {
        this.f26032a = aVar;
    }

    public static String a(String str, String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        try {
            this.f26032a.a(a("onReceivedError", String.valueOf(i10)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f26032a.a(a("onReceivedHttpError", String.valueOf(webResourceResponse.getStatusCode())));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        boolean didCrash2;
        String str;
        try {
            StringBuilder sb2 = new StringBuilder("Chromium process crashed - detail.didCrash():");
            didCrash = renderProcessGoneDetail.didCrash();
            sb2.append(didCrash);
            Logger.e("c", sb2.toString());
            didCrash2 = renderProcessGoneDetail.didCrash();
            if (didCrash2) {
                str = "Render process was observed to crash";
            } else {
                str = "Render process was killed by the system";
            }
            this.f26032a.b(str);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f26032a.a(a("onReceivedErrorM", String.valueOf(webResourceError.getErrorCode())));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }
}
