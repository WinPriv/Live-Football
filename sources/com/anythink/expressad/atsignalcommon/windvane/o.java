package com.anythink.expressad.atsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class o extends WebChromeClient {

    /* renamed from: b, reason: collision with root package name */
    private static final String f7082b = "H5_ENTRY";

    /* renamed from: a, reason: collision with root package name */
    WindVaneWebView f7083a;

    /* renamed from: c, reason: collision with root package name */
    private e f7084c;

    public o(WindVaneWebView windVaneWebView) {
        this.f7083a = windVaneWebView;
    }

    public final void a(e eVar) {
        this.f7084c = eVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        d signalCommunication = this.f7083a.getSignalCommunication();
        if (signalCommunication != null) {
            String message = consoleMessage.message();
            if (TextUtils.isEmpty(message) || !message.startsWith("mv://")) {
                return false;
            }
            com.anythink.expressad.foundation.h.o.a(f7082b, "onConsoleMessage: message.length() = " + message.length() + " " + message);
            if (message.contains("wv_hybrid:") && signalCommunication.a("wv_hybrid:")) {
                String substring = message.substring(0, message.lastIndexOf(" ") + 1);
                com.anythink.expressad.foundation.h.o.a(f7082b, "message = ".concat(String.valueOf(substring)));
                signalCommunication.c(substring);
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        com.anythink.expressad.foundation.h.o.d(f7082b, String.valueOf(str2));
        d signalCommunication = this.f7083a.getSignalCommunication();
        if (signalCommunication != null && str3 != null && signalCommunication.a(str3)) {
            signalCommunication.c(str2);
            jsPromptResult.confirm("");
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        e eVar = this.f7084c;
        if (eVar != null) {
            eVar.onProgressChanged(webView, i10);
        }
    }
}
