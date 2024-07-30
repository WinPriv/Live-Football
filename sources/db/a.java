package db;

import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.web.PureWebView;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f27574s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PureWebView f27575t;

    public a(PureWebView pureWebView, View view) {
        this.f27575t = pureWebView;
        this.f27574s = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        int id2 = this.f27574s.getId();
        PureWebView pureWebView = this.f27575t;
        if (id2 == R.id.privacy_set_network) {
            Intent intent = new Intent("android.settings.WIFI_SETTINGS");
            intent.setFlags(268435456);
            z1.r(pureWebView.getContext(), intent);
        } else if (m.z(pureWebView.getContext()) && (webView = pureWebView.f23600u) != null) {
            webView.loadUrl(pureWebView.getCurrentPageUrl());
        }
    }
}
