package com.iab.omid.library.vungle.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.b.e;
import com.iab.omid.library.vungle.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private WebView f24534a;

    /* renamed from: b, reason: collision with root package name */
    private Long f24535b = null;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f24536c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24537d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f24536c = map;
        this.f24537d = str;
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void b() {
        long convert;
        super.b();
        if (this.f24535b == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(d.a() - this.f24535b.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.vungle.publisher.b.1

            /* renamed from: b, reason: collision with root package name */
            private final WebView f24539b;

            {
                this.f24539b = b.this.f24534a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24539b.destroy();
            }
        }, Math.max(4000 - convert, 2000L));
        this.f24534a = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.vungle.b.d.a().b());
        this.f24534a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f24534a);
        e.a().a(this.f24534a, this.f24537d);
        for (String str : this.f24536c.keySet()) {
            e.a().a(this.f24534a, this.f24536c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f24535b = Long.valueOf(d.a());
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.vungle.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.vungle.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
