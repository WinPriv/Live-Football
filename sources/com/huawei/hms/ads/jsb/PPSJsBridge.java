package com.huawei.hms.ads.jsb;

import a3.k;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.huawei.hms.ads.jsb.annotations.OuterVisible;
import com.huawei.hms.ads.jsb.constant.Constant;
import com.huawei.hms.ads.jsb.inner.impl.JsBridgeImpl;
import com.huawei.hms.ads.jsbridge.b;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import e0.i;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

@OuterVisible
/* loaded from: classes2.dex */
public class PPSJsBridge extends com.huawei.hms.ads.jsbridge.a {

    /* renamed from: a, reason: collision with root package name */
    private static JsbConfig f21739a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<WebView> f21740b;

    /* renamed from: c, reason: collision with root package name */
    private IWebView f21741c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21742d;

    @OuterVisible
    public PPSJsBridge(WebView webView) {
        if (webView == null) {
            b.b("webView object is null, cannot register it.");
            return;
        }
        b(webView);
        a();
        webView.addJavascriptInterface(this, "_HwJSBridge");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context b() {
        if (this.f21742d) {
            IWebView iWebView = this.f21741c;
            if (iWebView != null) {
                Context context = iWebView.getContext();
                if (context == null) {
                    b.b("custom webView context is null.");
                }
                return context;
            }
        } else {
            WeakReference<WebView> weakReference = this.f21740b;
            if (weakReference != null && weakReference.get() != null) {
                return this.f21740b.get().getContext();
            }
        }
        b.b("the webview context is null.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        if (this.f21742d) {
            IWebView iWebView = this.f21741c;
            if (iWebView != null) {
                return a(iWebView);
            }
            return null;
        }
        WeakReference<WebView> weakReference = this.f21740b;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return a(this.f21740b.get());
    }

    @OuterVisible
    public static void init(JsbConfig jsbConfig) {
        f21739a = jsbConfig;
    }

    @OuterVisible
    public void destroy() {
        WeakReference<WebView> weakReference = this.f21740b;
        if (weakReference != null) {
            weakReference.clear();
        }
        IWebView iWebView = this.f21741c;
        if (iWebView != null) {
            iWebView.removeJavascriptInterface("_HwJSBridge");
            this.f21741c = null;
        }
    }

    @JavascriptInterface
    public String invoke(String str, String str2) {
        WeakReference<WebView> weakReference = this.f21740b;
        if (weakReference != null && weakReference.get() != null) {
            return JsBridgeImpl.invoke(this.f21740b.get().getContext(), str, str2);
        }
        b.b("this webView is destroyed");
        return null;
    }

    @JavascriptInterface
    public void invokeAsync(final String str, final String str2, final String str3) {
        final JSONObject jSONObject = new JSONObject();
        com.huawei.hms.ads.jsbridge.a.a(new Runnable() { // from class: com.huawei.hms.ads.jsb.PPSJsBridge.1
            @Override // java.lang.Runnable
            public void run() {
                String str4 = str2;
                final boolean z10 = true;
                final String str5 = null;
                try {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    z10 = jSONObject2.optBoolean(Constant.MAP_KEY_TOP, true);
                    str5 = jSONObject2.optString(Constant.MAP_KEY_UUID);
                    jSONObject2.put("url", PPSJsBridge.this.c());
                    str4 = jSONObject2.toString();
                } catch (Throwable unused) {
                    b.b("jsb response data error.");
                }
                Context b10 = PPSJsBridge.this.b();
                if (b10 == null) {
                    b.b("invoke method param context is null.");
                }
                JsBridgeImpl.invoke(b10, str, str4, new RemoteCallResultCallback<String>() { // from class: com.huawei.hms.ads.jsb.PPSJsBridge.1.1
                    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                    public void onRemoteCallResult(String str6, CallResult<String> callResult) {
                        try {
                            JSONObject jSONObject3 = new JSONObject(callResult.getData());
                            boolean optBoolean = jSONObject3.optBoolean("complete", true);
                            jSONObject.put("code", callResult.getCode());
                            jSONObject.put("data", jSONObject3);
                            jSONObject.put("msg", callResult.getMsg());
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            PPSJsBridge.this.a(str3, jSONObject.toString(), optBoolean, z10, str5);
                        } catch (Throwable unused2) {
                            b.b("jsb response data error.");
                        }
                    }
                }, String.class);
            }
        });
    }

    @OuterVisible
    public PPSJsBridge(IWebView iWebView) {
        if (iWebView == null) {
            b.b("webView object is null, cannot register it.");
            return;
        }
        b(iWebView);
        a();
        iWebView.addJavascriptInterface(this, "_HwJSBridge");
    }

    private void a() {
        JsBridgeImpl.initConfig(b(), f21739a);
    }

    private void b(WebView webView) {
        this.f21740b = new WeakReference<>(webView);
    }

    private void a(final String str) {
        com.huawei.hms.ads.jsbridge.a.a(new Runnable() { // from class: com.huawei.hms.ads.jsb.PPSJsBridge.2
            @Override // java.lang.Runnable
            public void run() {
                if (PPSJsBridge.this.f21742d) {
                    if (PPSJsBridge.this.f21741c != null) {
                        PPSJsBridge.this.f21741c.evaluateJavascript(str, new ValueCallback<String>() { // from class: com.huawei.hms.ads.jsb.PPSJsBridge.2.1
                            @Override // android.webkit.ValueCallback
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public void onReceiveValue(String str2) {
                            }
                        });
                        return;
                    }
                } else if (PPSJsBridge.this.f21740b != null && PPSJsBridge.this.f21740b.get() != null) {
                    ((WebView) PPSJsBridge.this.f21740b.get()).evaluateJavascript(str, new ValueCallback<String>() { // from class: com.huawei.hms.ads.jsb.PPSJsBridge.2.2
                        @Override // android.webkit.ValueCallback
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str2) {
                        }
                    });
                    return;
                }
                b.b("please register a webView object to jsb.");
            }
        });
    }

    private void b(IWebView iWebView) {
        this.f21742d = true;
        this.f21741c = iWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, boolean z10, boolean z11, String str3) {
        String sb2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z11) {
            sb2 = String.format(Locale.ENGLISH, "if(%s){%s(%s)};", str, str, str2);
            if (z10) {
                sb2 = i.f(sb2, "delete window.", str);
            }
        } else {
            if (str3 == null) {
                str3 = "";
            }
            StringBuilder o = k.o("var iframeEles=document.querySelectorAll('iframe');if(iframeEles && iframeEles.length>0){for (let index = 0; index < iframeEles.length; index++) {var iframe = iframeEles[index];if (iframe &&iframe.contentWindow) {iframe.contentWindow.postMessage({ppsMsgType:1,data:", str2, ",cb:'", str, "',complete:");
            o.append(z10);
            o.append(",uuid:'");
            o.append(str3);
            o.append("'},'*');}}};var myEvent = new CustomEvent(\"tmp\", {detail:{ppsMsgType:1,data:");
            i.o(o, str2, ",cb:'", str, "',complete:");
            o.append(z10);
            o.append(",uuid:'");
            o.append(str3);
            o.append("'}});window.dispatchEvent(myEvent);");
            sb2 = o.toString();
        }
        a(sb2);
    }
}
