package db;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ka.n7;

/* loaded from: classes2.dex */
public class j extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27594a = 0;

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f27595a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WebView f27596b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SslError f27597c;

        public a(SslErrorHandler sslErrorHandler, WebView webView, SslError sslError) {
            this.f27595a = sslErrorHandler;
            this.f27596b = webView;
            this.f27597c = sslError;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ WebView f27599s;

        public b(WebView webView) {
            this.f27599s = webView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j.this.a(this.f27599s);
        }
    }

    public void b(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        n7.b("j", "handleSslError");
        new Handler(Looper.getMainLooper()).post(new b(webView));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        n7.h("j", "onReceivedSslError %s", sslError);
        if (webView == null) {
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
                return;
            }
            return;
        }
        try {
            n7.e("j", "WebView ssl check");
            a0.a.U(sslErrorHandler, sslError, sslError.getUrl(), webView.getContext().getApplicationContext(), new a(sslErrorHandler, webView, sslError));
        } catch (Exception | NoClassDefFoundError e10) {
            n7.g("j", e10.getClass().getSimpleName());
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    public void a(WebView webView) {
    }
}
