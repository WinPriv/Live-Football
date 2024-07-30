package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f17126a;

    /* renamed from: b, reason: collision with root package name */
    private final b f17127b;

    public c(b bVar, com.applovin.impl.sdk.p pVar) {
        this.f17126a = pVar.L();
        this.f17127b = bVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (!com.applovin.impl.sdk.y.a()) {
            return true;
        }
        this.f17126a.b("AdWebView", str);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f17126a.d("AdWebView", "Alert attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f17126a.d("AdWebView", "JS onBeforeUnload attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f17126a.d("AdWebView", "JS confirm attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        b bVar;
        if (i10 == 100 && (bVar = this.f17127b) != null) {
            bVar.a(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f17126a.d("AdWebView", "console.log[" + i10 + "] :" + str);
        }
    }
}
