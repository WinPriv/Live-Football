package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.mediation.h;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q extends com.applovin.impl.sdk.e.a implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f18921a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinAdLoadListener f18922b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.adview.d f18923c;

    /* loaded from: classes.dex */
    public class a extends com.applovin.impl.adview.e {
        @Override // com.applovin.impl.adview.e
        public boolean a(WebView webView, String str) {
            com.applovin.impl.sdk.y yVar = q.this.f18839h;
            if (com.applovin.impl.sdk.y.a()) {
                q qVar = q.this;
                qVar.f18839h.c(qVar.f18838g, "Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof com.applovin.impl.adview.d)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (!a(scheme, com.applovin.impl.sdk.c.b.co)) {
                return true;
            }
            if (a(host, com.applovin.impl.sdk.c.b.cp)) {
                com.applovin.impl.sdk.y yVar2 = q.this.f18839h;
                if (com.applovin.impl.sdk.y.a()) {
                    q qVar2 = q.this;
                    qVar2.f18839h.b(qVar2.f18838g, "Ad load succeeded");
                }
                if (q.this.f18922b == null) {
                    return true;
                }
                q.this.f18922b.adReceived(q.this.f18921a);
                q.this.f18922b = null;
                return true;
            }
            if (a(host, com.applovin.impl.sdk.c.b.cq)) {
                com.applovin.impl.sdk.y yVar3 = q.this.f18839h;
                if (com.applovin.impl.sdk.y.a()) {
                    q qVar3 = q.this;
                    qVar3.f18839h.b(qVar3.f18838g, "Ad load failed");
                }
                if (q.this.f18922b == null) {
                    return true;
                }
                q.this.f18922b.failedToReceiveAd(204);
                q.this.f18922b = null;
                return true;
            }
            com.applovin.impl.sdk.y yVar4 = q.this.f18839h;
            if (!com.applovin.impl.sdk.y.a()) {
                return true;
            }
            q qVar4 = q.this;
            qVar4.f18839h.e(qVar4.f18838g, "Unrecognized webview event");
            return true;
        }

        private a(com.applovin.impl.sdk.p pVar) {
            super(null, pVar);
        }

        private boolean a(String str, com.applovin.impl.sdk.c.b<String> bVar) {
            Iterator<String> it = q.this.f.b(bVar).iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public q(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskProcessJavaScriptTagAd", pVar);
        this.f18921a = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, bVar, pVar);
        this.f18922b = appLovinAdLoadListener;
        pVar.ar().a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Rendering AppLovin ad #" + this.f18921a.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.q.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    q qVar = q.this;
                    q qVar2 = q.this;
                    a aVar = new a(qVar2.f);
                    q qVar3 = q.this;
                    qVar.f18923c = new com.applovin.impl.adview.d(aVar, qVar3.f, qVar3.f());
                    q.this.f18923c.loadDataWithBaseURL(q.this.f18921a.aw(), q.this.f18921a.b(), "text/html", null, "");
                } catch (Throwable th) {
                    q.this.f.ar().b(q.this);
                    com.applovin.impl.sdk.y yVar = q.this.f18839h;
                    if (com.applovin.impl.sdk.y.a()) {
                        q qVar4 = q.this;
                        qVar4.f18839h.b(qVar4.f18838g, "Failed to initialize WebView", th);
                    }
                    if (q.this.f18922b != null) {
                        q.this.f18922b.failedToReceiveAd(-1);
                        q.this.f18922b = null;
                    }
                }
            }
        });
    }

    @Override // com.applovin.impl.mediation.h.a
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.g().equalsIgnoreCase(this.f18921a.N())) {
            this.f.ar().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f18922b;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f18921a);
                this.f18922b = null;
            }
        }
    }
}
