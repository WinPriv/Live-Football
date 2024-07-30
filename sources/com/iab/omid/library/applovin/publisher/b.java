package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {
    private WebView f;

    /* renamed from: g, reason: collision with root package name */
    private Long f24298g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f24299h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24300i;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f24301a;

        public a() {
            this.f24301a = b.this.f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24301a.destroy();
        }
    }

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f24299h = map;
        this.f24300i = str;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        long convert;
        super.b();
        if (this.f24298g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(f.b() - this.f24298g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new a(), Math.max(4000 - convert, 2000L));
        this.f = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.applovin.internal.f.b().a());
        this.f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f.getSettings().setAllowContentAccess(false);
        a(this.f);
        g.a().c(this.f, this.f24300i);
        for (String str : this.f24299h.keySet()) {
            g.a().a(this.f, this.f24299h.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f24298g = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
