package com.ironsource.sdk.c;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public String f26047a;

    /* renamed from: d, reason: collision with root package name */
    public com.ironsource.sdk.a f26048d;

    /* renamed from: s, reason: collision with root package name */
    public final String f26049s;

    /* renamed from: t, reason: collision with root package name */
    public WebView f26050t;

    /* renamed from: u, reason: collision with root package name */
    public com.ironsource.sdk.b.b f26051u;

    /* renamed from: v, reason: collision with root package name */
    public Activity f26052v;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26057s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26058t;

        public a(String str, String str2) {
            this.f26057s = str;
            this.f26058t = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            try {
                WebView webView = cVar.f26050t;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", cVar.f26049s);
                com.ironsource.sdk.b.b bVar = cVar.f26051u;
                if (bVar != null) {
                    bVar.a(this.f26057s, jSONObject);
                    com.ironsource.sdk.b.b bVar2 = cVar.f26051u;
                    bVar2.f26027a = null;
                    bVar2.f26028b = null;
                }
                cVar.f26051u = null;
                cVar.f26052v = null;
            } catch (Exception e10) {
                Log.e("c", "performCleanup | could not destroy ISNAdView webView ID: " + cVar.f26049s);
                com.ironsource.sdk.a.d.a(f.f26011q, new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).f25984a);
                cVar.b(this.f26058t, e10.getMessage());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements e.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f26060a;

        public b(String str) {
            this.f26060a = str;
        }

        @Override // com.ironsource.sdk.c.e.a
        public final void a(String str) {
            Logger.i("c", "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            c.this.b(this.f26060a, str);
        }

        @Override // com.ironsource.sdk.c.e.a
        public final void b(String str) {
            Logger.i("c", "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) c.this.f26050t.getParent()).removeView(c.this.f26050t);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            c cVar = c.this;
            synchronized (cVar) {
                cVar.a("", "");
            }
        }
    }

    public c(com.ironsource.sdk.b.a aVar, Activity activity, String str, com.ironsource.sdk.a aVar2) {
        this.f26052v = activity;
        com.ironsource.sdk.b.b bVar = new com.ironsource.sdk.b.b();
        this.f26051u = bVar;
        bVar.f26030d = str;
        this.f26049s = str;
        bVar.f26027a = aVar;
        this.f26048d = aVar2;
    }

    public static /* synthetic */ void b(c cVar, String str) {
        Logger.i("c", "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(cVar.f26052v);
        cVar.f26050t = webView;
        webView.addJavascriptInterface(new com.ironsource.sdk.c.b(cVar), "containerMsgHandler");
        cVar.f26050t.setWebViewClient(new com.ironsource.sdk.b.c(new b(str)));
        com.ironsource.sdk.utils.d.a(cVar.f26050t);
        cVar.f26051u.f26029c = cVar.f26050t;
    }

    @Override // com.ironsource.sdk.c.e
    public final WebView a() {
        return this.f26050t;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        com.ironsource.sdk.b.b bVar = this.f26051u;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (!TextUtils.isEmpty(optString) && bVar.c(optString)) {
                if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                    bVar.a(bVar.a(jSONObject).toString(), (String) null, (String) null);
                    return;
                }
                return;
            }
            bVar.a("containerSendMessage", jSONObject);
        } catch (JSONException e10) {
            Log.e(bVar.f26031e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e10.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final synchronized void a(String str, String str2) {
        if (this.f26052v == null) {
            return;
        }
        Logger.i("c", "performCleanup");
        com.ironsource.environment.e.a.f24660a.a(new a(str, str2));
    }

    public final void b(String str, String str2) {
        com.ironsource.sdk.b.b bVar = this.f26051u;
        if (bVar != null) {
            bVar.a(str, str2);
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, "action parameter empty");
            return;
        }
        Logger.i("c", "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.f26050t.onPause();
            } else {
                if (!str.equals("onResume")) {
                    b(str3, "action not supported");
                    return;
                }
                this.f26050t.onResume();
            }
            this.f26051u.a(str2);
        } catch (Exception unused) {
            b(str3, "failed to perform action");
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void b(JSONObject jSONObject, String str, String str2) {
        try {
            this.f26051u.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e10) {
            Logger.i("c", "sendMessageToAd fail message: " + e10.getMessage());
            throw e10;
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f26051u.b(str);
        } catch (Exception e10) {
            Logger.i("c", "sendHandleGetViewVisibility fail with reason: " + e10.getMessage());
        }
    }
}
