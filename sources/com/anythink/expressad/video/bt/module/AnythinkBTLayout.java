package com.anythink.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.video.bt.a.c;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkBTLayout extends BTBaseView {

    /* renamed from: p, reason: collision with root package name */
    private static final String f11282p = "portrait";

    /* renamed from: q, reason: collision with root package name */
    private static final String f11283q = "landscape";

    /* renamed from: r, reason: collision with root package name */
    private WebView f11284r;

    public AnythinkBTLayout(Context context) {
        super(context);
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f11284r != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f11343n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                j.a();
                j.a(this.f11284r, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                c.a();
                c.a(this.f11284r, "broadcast", getInstanceId());
            }
        }
    }

    public void notifyEvent(String str) {
        WebView webView = this.f11284r;
        if (webView != null) {
            BTBaseView.a(webView, str, this.f11348d);
        }
    }

    public void onBackPressed() {
        if (this.f11284r != null) {
            c.a();
            c.a(this.f11284r, "onSystemBackPressed", this.f11348d);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f11284r != null) {
            try {
                com.anythink.expressad.foundation.d.c cVar = this.f11346b;
                if (cVar != null && cVar.j()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", f11283q);
                } else {
                    jSONObject.put("orientation", f11282p);
                }
                jSONObject.put("instanceId", this.f11348d);
                String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                j.a();
                j.a(this.f11284r, "orientation", encodeToString);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void setWebView(WebView webView) {
        this.f11284r = webView;
    }

    public AnythinkBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
    }
}
