package com.vungle.warren.ui.view;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.anythink.core.common.b.g;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.foundation.d.c;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.vungle.warren.BuildConfig;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.omsdk.WebViewObserver;
import com.vungle.warren.ui.view.WebViewAPI;
import e0.i;
import java.util.concurrent.ExecutorService;
import m8.q;

/* loaded from: classes2.dex */
public class VungleWebClient extends WebViewClient implements WebViewAPI {
    public static final String TAG = "VungleWebClient";
    private WebViewAPI.MRAIDDelegate MRAIDDelegate;
    private Advertisement advertisement;
    private boolean collectConsent;
    private WebViewAPI.WebClientErrorHandler errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private WebView loadedWebView;
    private ExecutorService offloadExecutor;
    private Placement placement;
    private boolean ready;
    private WebViewObserver webViewObserver;

    public VungleWebClient(Advertisement advertisement, Placement placement, ExecutorService executorService) {
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = executorService;
    }

    private void handleWebViewError(String str, String str2) {
        boolean isCriticalAsset = isCriticalAsset(str2);
        String f = i.f(str2, " ", str);
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(f, isCriticalAsset);
        }
    }

    private boolean isCriticalAsset(String str) {
        Advertisement advertisement;
        if (!TextUtils.isEmpty(str) && (advertisement = this.advertisement) != null) {
            return advertisement.getDownloadableUrls().containsValue(str);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runJavascriptOnWebView(WebView webView, String str) {
        webView.evaluateJavascript(str, null);
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void notifyPropertiesChange(boolean z10) {
        if (this.loadedWebView != null) {
            q qVar = new q();
            q qVar2 = new q();
            qVar2.p(ContentRecord.WIDTH, Integer.valueOf(this.loadedWebView.getWidth()));
            qVar2.p(ContentRecord.HEIGHT, Integer.valueOf(this.loadedWebView.getHeight()));
            q qVar3 = new q();
            boolean z11 = false;
            qVar3.p("x", 0);
            qVar3.p("y", 0);
            qVar3.p(ContentRecord.WIDTH, Integer.valueOf(this.loadedWebView.getWidth()));
            qVar3.p(ContentRecord.HEIGHT, Integer.valueOf(this.loadedWebView.getHeight()));
            q qVar4 = new q();
            Boolean bool = Boolean.FALSE;
            qVar4.o("sms", bool);
            qVar4.o("tel", bool);
            qVar4.o("calendar", bool);
            qVar4.o("storePicture", bool);
            qVar4.o("inlineVideo", bool);
            qVar.n(qVar2, "maxSize");
            qVar.n(qVar2, "screenSize");
            qVar.n(qVar3, "defaultPosition");
            qVar.n(qVar3, "currentPosition");
            qVar.n(qVar4, "supports");
            qVar.q(CallMraidJS.f7000a, this.advertisement.getTemplateType());
            Boolean bool2 = this.isViewable;
            if (bool2 != null) {
                qVar.o("isViewable", bool2);
            }
            qVar.q("os", "android");
            qVar.q("osVersion", Integer.toString(Build.VERSION.SDK_INT));
            qVar.o("incentivized", Boolean.valueOf(this.placement.isIncentivized()));
            if (this.advertisement.getShowCloseDelay(this.placement.isIncentivized()) == 0) {
                z11 = true;
            }
            qVar.o("enableBackImmediately", Boolean.valueOf(z11));
            qVar.q("version", g.c.f5034a);
            if (this.collectConsent) {
                qVar.o("consentRequired", Boolean.TRUE);
                qVar.q("consentTitleText", this.gdprTitle);
                qVar.q("consentBodyText", this.gdprBody);
                qVar.q("consentAcceptButtonText", this.gdprAccept);
                qVar.q("consentDenyButtonText", this.gdprDeny);
            } else {
                qVar.o("consentRequired", bool);
            }
            qVar.q(bj.f.Code, BuildConfig.VERSION_NAME);
            Log.d(TAG, "loadJsjavascript:window.vungle.mraidBridge.notifyPropertiesChange(" + qVar + "," + z10 + ")");
            runJavascriptOnWebView(this.loadedWebView, "window.vungle.mraidBridge.notifyPropertiesChange(" + qVar + "," + z10 + ")");
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        int adType = this.advertisement.getAdType();
        if (adType != 0) {
            if (adType == 1) {
                this.loadedWebView = webView;
                webView.setVisibility(0);
                notifyPropertiesChange(true);
            } else {
                throw new IllegalArgumentException("Unknown Client Type!");
            }
        } else {
            runJavascriptOnWebView(webView, "function actionClicked(action){Android.performAction(action);};");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new VungleWebViewRenderProcessClient(this.errorHandler));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String str = TAG;
        Log.e(str, "Error desc " + webResourceResponse.getStatusCode());
        Log.e(str, "Error for URL " + webResourceRequest.getUrl().toString());
        handleWebViewError(String.valueOf(webResourceResponse.getStatusCode()), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w(TAG, "onRenderProcessGone url: " + webView.getUrl() + ",  did crash: " + renderProcessGoneDetail.didCrash());
        this.loadedWebView = null;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            return webClientErrorHandler.onWebRenderingProcessGone(webView, renderProcessGoneDetail.didCrash());
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void setAdVisibility(boolean z10) {
        this.isViewable = Boolean.valueOf(z10);
        notifyPropertiesChange(false);
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void setConsentStatus(boolean z10, String str, String str2, String str3, String str4) {
        this.collectConsent = z10;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void setErrorHandler(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void setMRAIDDelegate(WebViewAPI.MRAIDDelegate mRAIDDelegate) {
        this.MRAIDDelegate = mRAIDDelegate;
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void setWebViewObserver(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(final WebView webView, String str) {
        String str2 = TAG;
        Log.d(str2, "MRAID Command " + str);
        if (TextUtils.isEmpty(str)) {
            Log.e(str2, "Invalid URL ");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null) {
            String scheme = parse.getScheme();
            if (scheme.equals(c.f9471m)) {
                final String host = parse.getHost();
                if (host == null) {
                    return false;
                }
                if ("propertiesChangeCompleted".equals(host) && !this.ready) {
                    runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this.advertisement.createMRAIDArgs() + ")");
                    this.ready = true;
                } else if (this.MRAIDDelegate != null) {
                    final q qVar = new q();
                    for (String str3 : parse.getQueryParameterNames()) {
                        qVar.q(str3, parse.getQueryParameter(str3));
                    }
                    final Handler handler = new Handler();
                    this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.warren.ui.view.VungleWebClient.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (VungleWebClient.this.MRAIDDelegate.processCommand(host, qVar)) {
                                handler.post(new Runnable() { // from class: com.vungle.warren.ui.view.VungleWebClient.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        VungleWebClient.this.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
                                    }
                                });
                            }
                        }
                    });
                }
                return true;
            }
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                Log.d(str2, "Open URL" + str);
                if (this.MRAIDDelegate != null) {
                    q qVar2 = new q();
                    qVar2.q("url", str);
                    this.MRAIDDelegate.processCommand("openNonMraid", qVar2);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String str = TAG;
        Log.e(str, "Error desc " + webResourceError.getDescription().toString());
        Log.e(str, "Error for URL " + webResourceRequest.getUrl().toString());
        handleWebViewError(webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    /* loaded from: classes2.dex */
    public static class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {
        WebViewAPI.WebClientErrorHandler errorHandler;

        public VungleWebViewRenderProcessClient(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            boolean z10;
            String str = VungleWebClient.TAG;
            StringBuilder sb2 = new StringBuilder("onRenderProcessUnresponsive(Title = ");
            sb2.append(webView.getTitle());
            sb2.append(", URL = ");
            sb2.append(webView.getOriginalUrl());
            sb2.append(", (webViewRenderProcess != null) = ");
            if (webViewRenderProcess != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            Log.w(str, sb2.toString());
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }
    }
}
