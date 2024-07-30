package ka;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebViewClient;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;

/* loaded from: classes2.dex */
public final class ph {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31662a;

    /* renamed from: b, reason: collision with root package name */
    public String f31663b;

    /* renamed from: c, reason: collision with root package name */
    public String f31664c;

    /* renamed from: d, reason: collision with root package name */
    public x3 f31665d;

    public ph(Context context) {
        this.f31662a = context;
    }

    public final void a(qa qaVar, String str) {
        boolean z10;
        x2 a10 = nh.a(this.f31662a);
        if (a10 != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString(com.huawei.openalliance.ad.constant.w.cQ, this.f31663b);
                bundle.putString("callingPackage", this.f31664c);
                bundle.putString("landPageUrl", str);
                x3 k10 = a10.k(ObjectWrapper.wrap(qaVar), bundle);
                this.f31665d = k10;
                if (k10 == null) {
                    n7.g("RemoteLoader", "delegate is null");
                    return;
                }
                if (!k10.b()) {
                    n7.g("RemoteLoader", "delegate shouldOverrideUrlLoading false");
                    return;
                }
                IObjectWrapper a11 = this.f31665d.a();
                if (a11 == null) {
                    n7.g("RemoteLoader", "remoteWrapper is null");
                    return;
                }
                WebViewClient webViewClient = (WebViewClient) ObjectWrapper.unwrap(a11);
                StringBuilder sb2 = new StringBuilder("webViewClient is null ?  ");
                if (webViewClient == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sb2.append(z10);
                n7.e("RemoteLoader", sb2.toString());
                if (qaVar != null) {
                    ((PPSActivity) qaVar).t(webViewClient);
                }
            } catch (Throwable th) {
                n7.h("RemoteLoader", "create VmallWebView err: %s", th.getClass().getSimpleName());
            }
        }
    }
}
