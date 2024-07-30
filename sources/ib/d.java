package ib;

import com.huawei.opendevice.open.InjectableBaseWebActivity;
import ka.n7;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InjectableBaseWebActivity f29474s;

    public d(InjectableBaseWebActivity injectableBaseWebActivity) {
        this.f29474s = injectableBaseWebActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InjectableBaseWebActivity injectableBaseWebActivity = this.f29474s;
        injectableBaseWebActivity.m();
        n7.e("InjectableBaseWebActivity", "inject portraitInfo.");
        injectableBaseWebActivity.f24185u.loadUrl("javascript:var __injectJs;if(window.ContentInjectJs){__injectJs = window.ContentInjectJs;} else {var iframe = document.getElementById(\"policyFrame\");if(iframe && iframe.contentWindow.ContentInjectJs){__injectJs = iframe.contentWindow.ContentInjectJs;}}if(__injectJs) {__injectJs.injectContent(JSON.stringify(" + ((String) null) + "));}");
    }
}
