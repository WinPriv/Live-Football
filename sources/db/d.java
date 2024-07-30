package db;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.f2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import db.f;
import java.util.HashMap;
import ka.d5;
import ka.f5;
import ka.n7;
import ka.y4;

/* loaded from: classes2.dex */
public final class d implements f.a {

    @SuppressLint({"StaticFieldLeak"})
    public static d f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f27579g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public WebView f27580a;

    /* renamed from: d, reason: collision with root package name */
    public String f27583d;

    /* renamed from: e, reason: collision with root package name */
    public int f27584e;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f27582c = new HashMap(5);

    /* renamed from: b, reason: collision with root package name */
    public f f27581b = new f(this);

    /* loaded from: classes2.dex */
    public static class a {
        @JavascriptInterface
        public boolean isPreload() {
            n7.b("PreloadWebView", "isPreload:true");
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class b extends j {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            int intValue;
            n7.c("PreloadWebView", "onLoadResource. url: %s", y1.j(str));
            d dVar = d.this;
            if (dVar.f27582c.get(dVar.f27583d) == null) {
                intValue = 0;
            } else {
                intValue = ((Integer) dVar.f27582c.get(dVar.f27583d)).intValue();
            }
            if (f2.b(str) && intValue < dVar.f27584e) {
                dVar.f27582c.put(dVar.f27583d, Integer.valueOf(intValue + 1));
                Context context = webView.getContext();
                d5 a10 = y4.a(context, "webview_preload");
                long longValue = ConfigSpHandler.b(context).a().longValue();
                f5 b10 = a10.b(context, false);
                if (b10 != null) {
                    b10.f = longValue * 60000;
                }
                a10.d(context, 104857600L);
                a10.c(100, context);
                p2.a(new c(str, context, a10), 20);
            } else {
                n7.c("PreloadWebView", "don't download url: %s", y1.j(str));
            }
            super.onLoadResource(webView, str);
        }
    }

    public d(Context context) {
        WebView webView = new WebView(context);
        this.f27580a = webView;
        f2.a(webView);
        this.f27580a.setWebViewClient(new b());
        this.f27580a.addJavascriptInterface(new a(), "HwPPS");
        z1.Q(context);
    }

    public final void a(String str, int i10) {
        if (y1.h(str)) {
            return;
        }
        n7.c("PreloadWebView", "preLoad: %s", y1.j(str));
        this.f27583d = str;
        this.f27580a.loadUrl(str);
        f fVar = this.f27581b;
        synchronized (fVar) {
            fVar.f27588b++;
            d2.d(fVar.f27587a);
            n7.c("PreloadWebViewMonitor", "inc count: %s", Integer.valueOf(fVar.f27588b));
        }
        f fVar2 = this.f27581b;
        synchronized (fVar2) {
            int i11 = fVar2.f27588b - 1;
            fVar2.f27588b = i11;
            if (i11 < 0) {
                fVar2.f27588b = 0;
            }
            n7.c("PreloadWebViewMonitor", "dec count: %s", Integer.valueOf(fVar2.f27588b));
            if (fVar2.f27588b <= 0) {
                d2.c(new e(fVar2), fVar2.f27587a, 60000L);
            }
        }
        this.f27584e = i10;
    }
}
