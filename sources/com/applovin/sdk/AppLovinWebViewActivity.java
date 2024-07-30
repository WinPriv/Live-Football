package com.applovin.sdk;

import a3.k;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f19709a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private String f19710b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f19711c;

    /* renamed from: d, reason: collision with root package name */
    private EventListener f19712d;

    /* loaded from: classes.dex */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f19712d = eventListener;
        this.f19710b = str;
        this.f19709a.set(false);
        WebView webView = this.f19711c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f19712d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            y.i("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        a(AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).coreSdk);
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra2 = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        this.f19710b = stringExtra2;
        if (StringUtils.isValidString(stringExtra2)) {
            this.f19711c.loadUrl(this.f19710b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final p pVar) {
        WebView tryToCreateWebView = Utils.tryToCreateWebView(this, "WebView Activity");
        this.f19711c = tryToCreateWebView;
        if (tryToCreateWebView == null) {
            finish();
            return;
        }
        setContentView(tryToCreateWebView);
        WebSettings settings = this.f19711c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f19711c.setVerticalScrollBarEnabled(true);
        this.f19711c.setHorizontalScrollBarEnabled(true);
        this.f19711c.setScrollBarStyle(33554432);
        this.f19711c.setWebViewClient(new WebViewClient() { // from class: com.applovin.sdk.AppLovinWebViewActivity.1
            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (AppLovinWebViewActivity.this.f19711c == webView) {
                    AppLovinWebViewActivity.this.f19711c.destroy();
                    AppLovinWebViewActivity.this.f19711c = null;
                    AppLovinWebViewActivity.this.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.AppLovinWebViewActivity.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (((Boolean) pVar.a(b.fr)).booleanValue() && AppLovinWebViewActivity.this.f19709a.compareAndSet(false, true)) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                AppLovinWebViewActivity.this.a(pVar);
                                if (StringUtils.isValidString(AppLovinWebViewActivity.this.f19710b)) {
                                    AppLovinWebViewActivity.this.f19711c.loadUrl(AppLovinWebViewActivity.this.f19710b);
                                    return;
                                }
                                return;
                            }
                            AppLovinWebViewActivity.this.finish();
                        }
                    });
                    return true;
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                String str2;
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                String path = parse.getPath();
                pVar.L();
                if (y.a()) {
                    k.t("Handling url load: ", str, pVar.L(), "AppLovinWebViewActivity");
                }
                if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && AppLovinWebViewActivity.this.f19712d != null) {
                    if (path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                        Set<String> queryParameterNames = parse.getQueryParameterNames();
                        if (queryParameterNames.isEmpty()) {
                            str2 = "";
                        } else {
                            str2 = (String) queryParameterNames.toArray()[0];
                        }
                        if (StringUtils.isValidString(str2)) {
                            String queryParameter = parse.getQueryParameter(str2);
                            pVar.L();
                            if (y.a()) {
                                pVar.L().b("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
                            }
                            AppLovinWebViewActivity.this.f19712d.onReceivedEvent(queryParameter);
                            return true;
                        }
                        pVar.L();
                        if (y.a()) {
                            pVar.L().e("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }
}
