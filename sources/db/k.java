package db;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.HiProgressBar;
import com.huawei.openalliance.ad.ppskit.views.web.NetworkLoadStatusView;
import com.huawei.opendevice.open.BaseWebActivity;
import java.net.URISyntaxException;
import ka.n7;

/* loaded from: classes2.dex */
public final class k extends j {

    /* renamed from: b, reason: collision with root package name */
    public View f27601b;

    /* renamed from: c, reason: collision with root package name */
    public final b f27602c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27603d = false;

    public k(b bVar) {
        this.f27602c = bVar;
    }

    @Override // db.j
    public final void a(WebView webView) {
        NetworkLoadStatusView networkLoadStatusView;
        int i10;
        n7.e("k", "onReceivedError");
        b bVar = this.f27602c;
        if (bVar != null && (z1.R((BaseWebActivity) bVar) || m.I())) {
            return;
        }
        webView.loadUrl(com.anythink.core.common.res.d.f6477a);
        View view = this.f27601b;
        if (view != null && view.getVisibility() == 0) {
            this.f27601b.setVisibility(4);
        }
        if (bVar != null) {
            BaseWebActivity baseWebActivity = (BaseWebActivity) bVar;
            if (baseWebActivity.f24184t != null) {
                if (!m.z(baseWebActivity)) {
                    networkLoadStatusView = baseWebActivity.f24184t;
                    i10 = -2;
                } else {
                    networkLoadStatusView = baseWebActivity.f24184t;
                    i10 = -1;
                }
                networkLoadStatusView.setState(i10);
            }
        }
    }

    public final void c(View view, boolean z10) {
        this.f27601b = view;
        this.f27603d = z10;
        if (z1.D()) {
            n7.e("k", "rtl language, set rtl direction.");
            if (z10) {
                view.setRotation(180.0f);
            } else {
                view.setLayoutDirection(1);
            }
        }
    }

    public final boolean d(String str) {
        String str2 = "com.huawei.systemmanager";
        BaseWebActivity baseWebActivity = (BaseWebActivity) this.f27602c;
        baseWebActivity.getClass();
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(str, "oobe://more")) {
                try {
                    Intent intent = new Intent();
                    if (!o2.c(baseWebActivity, "com.huawei.systemmanager")) {
                        str2 = "com.hihonor.systemmanager";
                    }
                    intent.setClassName(str2, "com.huawei.dataprivacycenter.MainActivity");
                    intent.setClipData(oa.a.f33785b);
                    baseWebActivity.startActivity(intent);
                } catch (Exception e10) {
                    n7.g("k", e10.getClass().getSimpleName());
                }
                return true;
            }
            if (!str.startsWith("http")) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    parseUri.addCategory("android.intent.category.BROWSABLE");
                    parseUri.addFlags(268435456);
                    if (d0.m(baseWebActivity)) {
                        parseUri.addFlags(32768);
                    }
                    parseUri.setComponent(null);
                    parseUri.setSelector(null);
                    if (baseWebActivity.getPackageManager().queryIntentActivities(parseUri, 0).size() > 0) {
                        parseUri.setClipData(oa.a.f33785b);
                        baseWebActivity.startActivity(parseUri);
                    }
                } catch (URISyntaxException e11) {
                    n7.g("k", e11.getClass().getSimpleName());
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[LOOP:0: B:7:0x0035->B:19:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[EDGE_INSN: B:20:0x0087->B:21:0x0087 BREAK  A[LOOP:0: B:7:0x0035->B:19:0x0082], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db.k.e(java.lang.String):void");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        View view = this.f27601b;
        if (view != null) {
            view.setVisibility(4);
            if (this.f27603d) {
                this.f27601b.setProgress(100, true);
            } else {
                ((HiProgressBar) this.f27601b).setProgress(100);
            }
        }
        n7.e("k", "onPageFinished");
        BaseWebActivity baseWebActivity = (BaseWebActivity) this.f27602c;
        NetworkLoadStatusView networkLoadStatusView = baseWebActivity.f24184t;
        if (networkLoadStatusView != null) {
            if (networkLoadStatusView.getCurrentState() == 1 && m.z(baseWebActivity)) {
                baseWebActivity.f24184t.setState(0);
            }
            baseWebActivity.f24184t.setState(1);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        n7.c("k", "onPageStarted url=%s", str);
        View view = this.f27601b;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        n7.c("k", "onReceivedError description:%s", str);
        a(webView);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        n7.c("k", "WebResourceRequest url=%s", webResourceRequest.getUrl().toString());
        String uri = webResourceRequest.getUrl().toString();
        if (!d(uri)) {
            e(uri);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        n7.c("k", "onReceivedError error:%s", webResourceError.getDescription());
        a(webView);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        n7.c("k", "shouldOverrideUrlLoading url=%s", str);
        if (!d(str)) {
            e(str);
        }
        return true;
    }
}
