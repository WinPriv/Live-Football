package com.iab.omid.library.ironsrc.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.internal.g;
import com.iab.omid.library.ironsrc.utils.c;
import com.iab.omid.library.ironsrc.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {
    private WebView f;

    /* renamed from: g, reason: collision with root package name */
    private Long f24416g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f24417h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24418i;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f24419a;

        public a() {
            this.f24419a = b.this.f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24419a.destroy();
        }
    }

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f24417h = map;
        this.f24418i = str;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void b() {
        long convert;
        super.b();
        if (this.f24416g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(f.b() - this.f24416g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new a(), Math.max(4000 - convert, 2000L));
        this.f = null;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.ironsrc.internal.f.b().a());
        this.f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f.getSettings().setAllowContentAccess(false);
        a(this.f);
        g.a().c(this.f, this.f24418i);
        for (String str : this.f24417h.keySet()) {
            g.a().a(this.f, this.f24417h.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f24416g = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
