package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.ErrorType;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.b.e;
import com.iab.omid.library.vungle.d.d;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private com.iab.omid.library.vungle.e.b f24525a;

    /* renamed from: b, reason: collision with root package name */
    private AdEvents f24526b;

    /* renamed from: c, reason: collision with root package name */
    private MediaEvents f24527c;

    /* renamed from: d, reason: collision with root package name */
    private a f24528d;

    /* renamed from: e, reason: collision with root package name */
    private long f24529e;

    /* loaded from: classes2.dex */
    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        i();
        this.f24525a = new com.iab.omid.library.vungle.e.b(null);
    }

    public void a() {
    }

    public void b() {
        this.f24525a.clear();
    }

    public AdEvents c() {
        return this.f24526b;
    }

    public MediaEvents d() {
        return this.f24527c;
    }

    public boolean e() {
        if (this.f24525a.get() != null) {
            return true;
        }
        return false;
    }

    public void f() {
        e.a().a(getWebView());
    }

    public void g() {
        e.a().b(getWebView());
    }

    public WebView getWebView() {
        return this.f24525a.get();
    }

    public void h() {
        e.a().c(getWebView());
    }

    public void i() {
        this.f24529e = d.a();
        this.f24528d = a.AD_STATE_IDLE;
    }

    public void a(float f) {
        e.a().a(getWebView(), f);
    }

    public void b(String str, long j10) {
        if (j10 >= this.f24529e) {
            a aVar = this.f24528d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f24528d = aVar2;
                e.a().b(getWebView(), str);
            }
        }
    }

    public void a(WebView webView) {
        this.f24525a = new com.iab.omid.library.vungle.e.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f24526b = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        e.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        e.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.vungle.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.vungle.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        com.iab.omid.library.vungle.d.b.a(jSONObject2, "environment", "app");
        com.iab.omid.library.vungle.d.b.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        com.iab.omid.library.vungle.d.b.a(jSONObject2, "deviceInfo", com.iab.omid.library.vungle.d.a.d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.iab.omid.library.vungle.d.b.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        com.iab.omid.library.vungle.d.b.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        com.iab.omid.library.vungle.d.b.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        com.iab.omid.library.vungle.d.b.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        com.iab.omid.library.vungle.d.b.a(jSONObject4, "libraryVersion", "1.3.21-Vungle");
        com.iab.omid.library.vungle.d.b.a(jSONObject4, "appId", com.iab.omid.library.vungle.b.d.a().b().getApplicationContext().getPackageName());
        com.iab.omid.library.vungle.d.b.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            com.iab.omid.library.vungle.d.b.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            com.iab.omid.library.vungle.d.b.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            com.iab.omid.library.vungle.d.b.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        e.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f24527c = mediaEvents;
    }

    public void a(String str) {
        e.a().a(getWebView(), str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        if (j10 >= this.f24529e) {
            this.f24528d = a.AD_STATE_VISIBLE;
            e.a().b(getWebView(), str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        e.a().a(getWebView(), str, jSONObject);
    }

    public void a(JSONObject jSONObject) {
        e.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            e.a().c(getWebView(), z10 ? "foregrounded" : "backgrounded");
        }
    }
}
