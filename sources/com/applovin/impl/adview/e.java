package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.List;

/* loaded from: classes.dex */
public class e extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f17139a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f17140b;

    /* renamed from: c, reason: collision with root package name */
    private final b f17141c;

    public e(b bVar, com.applovin.impl.sdk.p pVar) {
        this.f17139a = pVar;
        this.f17140b = pVar.L();
        this.f17141c = bVar;
    }

    private void c() {
        this.f17141c.k();
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.y.a()) {
            this.f17140b.c("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        b bVar = this.f17141c;
        if (bVar != null) {
            bVar.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        b bVar = this.f17141c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p10 = bVar.p();
            this.f17139a.X().a(p10).a(com.applovin.impl.sdk.d.b.f18794z).a();
            if (com.applovin.impl.sdk.y.a()) {
                this.f17140b.e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + p10);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        b bVar = this.f17141c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p10 = bVar.p();
            String str = "Received SSL error: " + sslError;
            this.f17139a.X().a(p10).a(com.applovin.impl.sdk.d.b.B, str).a();
            if (com.applovin.impl.sdk.y.a()) {
                this.f17140b.e("AdWebView", str + " for ad: " + p10);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        boolean didCrash2;
        String str;
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        if (this.f17141c == null) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("Render process gone for ad: ");
        sb2.append(this.f17141c.p());
        sb2.append(". Process did crash: ");
        didCrash = renderProcessGoneDetail.didCrash();
        sb2.append(didCrash);
        com.applovin.impl.sdk.y.i("AdWebView", sb2.toString());
        com.applovin.impl.sdk.ad.e p10 = this.f17141c.p();
        if (p10 != null) {
            this.f17139a.X().a(p10).a(com.applovin.impl.sdk.d.b.A).a();
        }
        if (((Boolean) this.f17139a.a(com.applovin.impl.sdk.c.b.fq)).booleanValue()) {
            didCrash2 = renderProcessGoneDetail.didCrash();
            if (didCrash2 && ((Boolean) this.f17139a.a(com.applovin.impl.sdk.c.b.ft)).booleanValue()) {
                if (p10 != null) {
                    str = String.valueOf(p10.getAdIdNumber());
                } else {
                    str = "null";
                }
                throw new RuntimeException(s.f.b("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: ", str));
            }
            if (webView != null && webView.equals(this.f17141c.s())) {
                this.f17141c.f();
                AppLovinAdSize b10 = this.f17141c.b();
                if (Utils.isBML(b10)) {
                    this.f17141c.a(b10);
                    this.f17141c.e();
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!com.applovin.impl.sdk.y.a()) {
            return false;
        }
        this.f17140b.e("AdWebView", "No url found for request");
        return false;
    }

    private void b() {
        this.f17141c.l();
    }

    public b a() {
        return this.f17141c;
    }

    public boolean a(WebView webView, String str) {
        if (this.f17141c == null) {
            return true;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f17140b.c("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof d)) {
            Uri parse = Uri.parse(str);
            d dVar = (d) webView;
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            com.applovin.impl.sdk.ad.e p10 = this.f17141c.p();
            if (p10 == null) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f17140b.e("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            boolean z10 = !dVar.getLastClickLocation().equals(new PointF());
            boolean z11 = !p10.K() || z10;
            if ("applovin".equals(scheme) && "com.applovin.sdk".equals(host)) {
                if ("/adservice/close_ad".equals(path)) {
                    String str2 = this.f17139a.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.CLOSE_URL_AD_VALUE);
                    if (StringUtils.isValidString(str2) && Boolean.parseBoolean(str2)) {
                        p10.setMaxAdValue("close_url", str);
                    }
                    b();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (p10.J() && !z10) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f17140b.e("AdWebView", "Skipping expand command without user interaction");
                        }
                        return true;
                    }
                    a(dVar.getAndClearLastClickLocation());
                } else if ("/adservice/contract_ad".equals(path)) {
                    c();
                } else {
                    if ("/adservice/no_op".equals(path)) {
                        return true;
                    }
                    if ("/adservice/load_url".equals(path)) {
                        if (p10.J() && !z10) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f17140b.e("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        a(parse, dVar);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (p10.J() && !z10) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f17140b.e("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (p10 instanceof com.applovin.impl.c.a) {
                            a((com.applovin.impl.c.a) p10, dVar);
                        } else {
                            a(dVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (p10.J() && !z10) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f17140b.e("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (p10 instanceof com.applovin.impl.c.a) {
                            com.applovin.impl.c.a aVar = (com.applovin.impl.c.a) p10;
                            if (aVar.aT()) {
                                a(aVar, dVar);
                            }
                        }
                        a(dVar, parse);
                    } else if ("/adservice/postback".equals(path)) {
                        a(parse, p10);
                    } else if (this.f17141c.h() != null) {
                        if ("/video_began".equals(path)) {
                            this.f17141c.h().a(Utils.tryParseDouble(parse.getQueryParameter("duration"), 0.0d));
                        } else if ("/video_completed".equals(path)) {
                            this.f17141c.h().g_();
                        } else if ("/video_progress".equals(path)) {
                            this.f17141c.h().b(Utils.tryParseDouble(parse.getQueryParameter("percent_viewed"), 0.0d));
                        } else if ("/video_waiting".equals(path)) {
                            this.f17141c.h().h_();
                        } else if ("/video_resumed".equals(path)) {
                            this.f17141c.h().c();
                        }
                    } else {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f17140b.d("AdWebView", "Unknown URL: ".concat(str));
                        }
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f17140b.d("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else if (z11) {
                List<String> aA = p10.aA();
                List<String> aB = p10.aB();
                if ((!aA.isEmpty() && !aA.contains(scheme)) || (!aB.isEmpty() && !aB.contains(host))) {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f17140b.e("AdWebView", "URL is not whitelisted - bypassing click");
                    }
                } else {
                    if (p10 instanceof com.applovin.impl.c.a) {
                        com.applovin.impl.c.a aVar2 = (com.applovin.impl.c.a) p10;
                        if (aVar2.aT()) {
                            a(aVar2, dVar);
                        }
                    }
                    a(dVar, parse);
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        b bVar = this.f17141c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p10 = bVar.p();
            String str3 = "Received error with error code: " + i10 + " with description \\'" + str + "\\' for URL: " + str2;
            if (p10 != null) {
                this.f17139a.X().a(p10).a(com.applovin.impl.sdk.d.b.y, str3).a();
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f17140b.e("AdWebView", str3 + " for ad: " + p10);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    private void a(PointF pointF) {
        this.f17141c.a(pointF);
    }

    private void a(Uri uri, d dVar) {
        final String queryParameter = uri.getQueryParameter("n");
        if (StringUtils.isValidString(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("load_type");
            if ("external".equalsIgnoreCase(queryParameter2)) {
                if (com.applovin.impl.sdk.y.a()) {
                    a3.k.t("Loading new page externally: ", queryParameter, this.f17140b, "AdWebView");
                }
                Utils.openUri(dVar.getContext(), Uri.parse(queryParameter), this.f17139a);
                com.applovin.impl.sdk.utils.k.c(this.f17141c.g(), this.f17141c.p(), this.f17141c.r());
                return;
            }
            if ("internal".equalsIgnoreCase(queryParameter2)) {
                if (com.applovin.impl.sdk.y.a()) {
                    a3.k.t("Loading new page in WebView: ", queryParameter, this.f17140b, "AdWebView");
                }
                dVar.loadUrl(queryParameter);
                String queryParameter3 = uri.getQueryParameter("bg_color");
                if (StringUtils.isValidString(queryParameter3)) {
                    dVar.setBackgroundColor(Color.parseColor(queryParameter3));
                    return;
                }
                return;
            }
            if ("in_app".equalsIgnoreCase(queryParameter2)) {
                if (com.applovin.impl.sdk.y.a()) {
                    a3.k.t("Loading new page in slide-up webview: ", queryParameter, this.f17140b, "AdWebView");
                }
                this.f17139a.w().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.adview.e.1
                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, null);
                            com.applovin.impl.sdk.utils.k.a(e.this.f17141c.g(), e.this.f17141c.p(), e.this.f17141c.r());
                        }
                    }

                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            com.applovin.impl.sdk.utils.k.b(e.this.f17141c.g(), e.this.f17141c.p(), e.this.f17141c.r());
                            e.this.f17139a.w().b(this);
                        }
                    }
                });
                Intent intent = new Intent(com.applovin.impl.sdk.p.y(), (Class<?>) AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f17139a.B());
                intent.setFlags(268435456);
                com.applovin.impl.sdk.p.y().startActivity(intent);
                return;
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f17140b.e("AdWebView", "Could not find load type in original uri");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f17140b.e("AdWebView", "Could not find url to load from query in original uri");
        }
    }

    private void a(com.applovin.impl.c.a aVar, d dVar) {
        com.applovin.impl.c.d aQ = aVar.aQ();
        if (aQ != null) {
            com.applovin.impl.c.m.a(aQ.c(), this.f17141c.q());
            a(dVar, aQ.a());
        }
    }

    private void a(d dVar, Uri uri) {
        com.applovin.impl.sdk.ad.e currentAd = dVar.getCurrentAd();
        AppLovinAdView r10 = this.f17141c.r();
        if (r10 != null && currentAd != null) {
            com.applovin.impl.sdk.d.d statsManagerHelper = dVar.getStatsManagerHelper();
            if (statsManagerHelper != null) {
                statsManagerHelper.b();
            }
            if (currentAd instanceof com.applovin.impl.c.a) {
                ((com.applovin.impl.c.a) currentAd).o().o();
            }
            this.f17141c.a(currentAd, r10, uri, dVar.getAndClearLastClickLocation());
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f17140b.e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            this.f17139a.al().a(com.applovin.impl.sdk.network.j.o().c(StringUtils.appendQueryParameter(queryParameter, "clcode", eVar.getClCode())).a(false).d(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
        } else if (com.applovin.impl.sdk.y.a()) {
            this.f17140b.e("AdWebView", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }
}
