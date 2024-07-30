package com.anythink.expressad.video.signal.a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: g, reason: collision with root package name */
    private static final String f11920g = "orientation";

    /* renamed from: h, reason: collision with root package name */
    private static final String f11921h = "onSystemPause";

    /* renamed from: i, reason: collision with root package name */
    private static final String f11922i = "onSystemResume";

    /* renamed from: j, reason: collision with root package name */
    private static final String f11923j = "onSystemDestory";

    /* renamed from: k, reason: collision with root package name */
    private static final String f11924k = "onSystemBackPressed";

    /* renamed from: l, reason: collision with root package name */
    private static final String f11925l = "portrait";

    /* renamed from: m, reason: collision with root package name */
    private static final String f11926m = "landscape";

    /* renamed from: n, reason: collision with root package name */
    private WebView f11927n;
    private int o = 0;

    public h(WebView webView) {
        this.f11927n = webView;
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void a() {
        super.a();
        this.o = 1;
        com.anythink.expressad.atsignalcommon.windvane.j.a();
        com.anythink.expressad.atsignalcommon.windvane.j.a(this.f11927n, "onSystemPause", "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void b() {
        super.b();
        this.o = 0;
        com.anythink.expressad.atsignalcommon.windvane.j.a();
        com.anythink.expressad.atsignalcommon.windvane.j.a(this.f11927n, "onSystemResume", "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void c() {
        super.c();
        com.anythink.expressad.atsignalcommon.windvane.j.a();
        com.anythink.expressad.atsignalcommon.windvane.j.a(this.f11927n, "onSystemDestory", "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void g() {
        super.g();
        com.anythink.expressad.atsignalcommon.windvane.j.a();
        com.anythink.expressad.atsignalcommon.windvane.j.a(this.f11927n, f11924k, "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final int h() {
        return this.o;
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", f11926m);
            } else {
                jSONObject.put("orientation", f11925l);
            }
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.f11927n, "orientation", encodeToString);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void a(int i10) {
        super.a(i10);
        this.o = i10;
    }
}
