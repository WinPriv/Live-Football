package com.anythink.expressad.atsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    private static g f7053a = new g();

    private g() {
    }

    private static g a() {
        return f7053a;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.b
    public final void b(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.MvBridge.onFailure(%s,'');", aVar.f7050g);
            } else {
                str = n.c(str);
            }
            String format = String.format("javascript:window.MvBridge.onFailure(%s,'%s');", aVar.f7050g, str);
            WindVaneWebView windVaneWebView = aVar.f7045a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(format);
                } catch (Exception e10) {
                    e10.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.b
    public final void a(Object obj, String str, String str2) {
        String format;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str2)) {
                format = String.format("javascript:window.MvBridge.fireEvent('%s', '');", str);
            } else {
                format = String.format("javascript:window.MvBridge.fireEvent('%s','%s');", str, n.c(str2));
            }
            WindVaneWebView windVaneWebView = aVar.f7045a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(format);
                } catch (Exception e10) {
                    e10.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private static void a(WebView webView, String str, String str2) {
        String format;
        if (TextUtils.isEmpty(str2)) {
            format = String.format("javascript:window.MvBridge.fireEvent('%s', '');", str);
        } else {
            format = String.format("javascript:window.MvBridge.fireEvent('%s','%s');", str, n.c(str2));
        }
        if (webView != null) {
            try {
                webView.loadUrl(format);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.b
    public final void a(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            String format = TextUtils.isEmpty(str) ? String.format("javascript:window.OW.onSuccess(%s,'');", aVar.f7050g) : String.format("javascript:window.OW.onSuccess(%s,'%s');", aVar.f7050g, n.c(str));
            WindVaneWebView windVaneWebView = aVar.f7045a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(format);
                } catch (Exception e10) {
                    e10.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
