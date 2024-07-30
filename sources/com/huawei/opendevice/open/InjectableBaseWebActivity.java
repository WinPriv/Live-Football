package com.huawei.opendevice.open;

import android.os.Bundle;
import android.webkit.WebView;
import com.huawei.opendevice.open.a;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class InjectableBaseWebActivity extends BaseWebActivity implements a.InterfaceC0307a {
    public boolean G = false;
    public boolean H = false;

    @Override // com.huawei.opendevice.open.a.InterfaceC0307a
    public void h_() {
        n7.e("InjectableBaseWebActivity", "onScriptLoaded.");
        this.G = true;
    }

    public boolean l() {
        return true;
    }

    public abstract void m();

    @Override // com.huawei.opendevice.open.BaseWebActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        WebView webView;
        super.onCreate(bundle);
        if (l() && (webView = this.f24185u) != null) {
            webView.addJavascriptInterface(new a(this), "ContentInject");
        }
    }
}
