package com.anythink.expressad.splash.c;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.js.SplashJsUtils;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.ATSplashWebview;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11003a = "WebViewRenderManager";

    /* renamed from: b, reason: collision with root package name */
    private boolean f11004b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11005c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f11010a = new e(0);

        public static /* synthetic */ e a() {
            return f11010a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void a(int i10);

        void a(String str);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f11011a;

        /* renamed from: b, reason: collision with root package name */
        private String f11012b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f11013c;

        /* renamed from: d, reason: collision with root package name */
        private String f11014d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f11015e;
        private int f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f11016g;

        private boolean g() {
            return this.f11016g;
        }

        public final void a(boolean z10) {
            this.f11016g = z10;
        }

        public final String b() {
            return this.f11011a;
        }

        public final String c() {
            return this.f11012b;
        }

        public final com.anythink.expressad.foundation.d.c d() {
            return this.f11013c;
        }

        public final boolean e() {
            return this.f11015e;
        }

        public final int f() {
            return this.f;
        }

        public final String a() {
            return this.f11014d;
        }

        public final void b(String str) {
            this.f11011a = str;
        }

        public final void c(String str) {
            this.f11012b = str;
        }

        public final void a(String str) {
            this.f11014d = str;
        }

        public final void b(boolean z10) {
            this.f11015e = z10;
        }

        public final void a(com.anythink.expressad.foundation.d.c cVar) {
            this.f11013c = cVar;
        }

        public final void a(int i10) {
            this.f = i10;
        }
    }

    public /* synthetic */ e(byte b10) {
        this();
    }

    public static /* synthetic */ boolean a(e eVar) {
        eVar.f11005c = true;
        return true;
    }

    private static e b() {
        return a.f11010a;
    }

    private e() {
        this.f11004b = false;
        this.f11005c = false;
    }

    public final void a() {
        this.f11004b = false;
        this.f11005c = false;
    }

    public final void a(final ATSplashView aTSplashView, c cVar, final b bVar) {
        String Z;
        if (aTSplashView != null) {
            String c10 = cVar.c();
            String b10 = cVar.b();
            final com.anythink.expressad.foundation.d.c d10 = cVar.d();
            String a10 = cVar.a();
            boolean e10 = cVar.e();
            int f = cVar.f();
            ATSplashWebview splashWebview = aTSplashView.getSplashWebview();
            if (splashWebview == null) {
                return;
            }
            SplashJSBridgeImpl splashJSBridgeImpl = new SplashJSBridgeImpl(aTSplashView.getContext(), b10, c10);
            ArrayList arrayList = new ArrayList();
            arrayList.add(d10);
            splashJSBridgeImpl.setCampaignList(arrayList);
            splashJSBridgeImpl.setAllowSkip(e10 ? 1 : 0);
            splashJSBridgeImpl.setCountdownS(f);
            aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl);
            if (TextUtils.isEmpty(d10.Z())) {
                Z = d10.aa();
            } else {
                Z = d10.Z();
            }
            String requestId = splashWebview.getRequestId();
            o.d(f11003a, "CampaignEx RequestId = " + Z + " WebView RequestId = " + requestId);
            if (!TextUtils.isEmpty(requestId) && requestId.equals(Z) && (this.f11004b || this.f11005c)) {
                aTSplashView.setH5Ready(true);
                if (bVar != null) {
                    bVar.a(1);
                    return;
                }
                return;
            }
            a();
            splashWebview.setRequestId(Z);
            System.currentTimeMillis();
            splashWebview.setWebViewListener(new com.anythink.expressad.atsignalcommon.a.b() { // from class: com.anythink.expressad.splash.c.e.1
                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a();
                    }
                    e.a(e.this);
                    if (!d10.s()) {
                        aTSplashView.setH5Ready(true);
                        o.a("WindVaneWebView", "======渲染成功：finish");
                    }
                    SplashJsUtils.fireOnJSBridgeConnected(webView);
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onReceivedError(WebView webView, int i10, String str, String str2) {
                    super.onReceivedError(webView, i10, str, str2);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(str);
                    }
                    e.this.a();
                    aTSplashView.setH5Ready(false);
                    o.a("WindVaneWebView", "======渲染失败");
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(sslError.toString());
                    }
                    e.this.a();
                    aTSplashView.setH5Ready(false);
                    o.a("WindVaneWebView", "======渲染失败");
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void readyState(WebView webView, int i10) {
                    super.readyState(webView, i10);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(i10);
                    }
                    if (i10 == 1) {
                        e.this.f11004b = true;
                        aTSplashView.setH5Ready(true);
                        o.a("WindVaneWebView", "======渲染成功：ready");
                    } else {
                        e.this.f11004b = false;
                        aTSplashView.setH5Ready(false);
                        o.a("WindVaneWebView", "======渲染失败");
                    }
                }
            });
            if (!splashWebview.isDestroyed()) {
                o.a(f11003a, "======开始渲染：".concat(String.valueOf(a10)));
                splashWebview.loadUrl(a10);
            } else {
                aTSplashView.setH5Ready(false);
            }
        }
    }
}
