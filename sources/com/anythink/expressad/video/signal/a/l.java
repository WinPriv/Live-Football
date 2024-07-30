package com.anythink.expressad.video.signal.a;

import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.module.AnythinkVideoView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: n, reason: collision with root package name */
    private static final String f11937n = "onVideoStatusNotify";
    private static final String o = "onJSClick";

    /* renamed from: p, reason: collision with root package name */
    private static final String f11938p = "onVideoProgressNotify";

    /* renamed from: q, reason: collision with root package name */
    private static final String f11939q = "webviewshow";

    /* renamed from: r, reason: collision with root package name */
    private static final String f11940r = "showDataInfo";

    /* renamed from: s, reason: collision with root package name */
    private static final String f11941s = "portrait";

    /* renamed from: t, reason: collision with root package name */
    private static final String f11942t = "landscape";

    /* renamed from: u, reason: collision with root package name */
    private WebView f11943u;

    public l(WebView webView) {
        this.f11943u = webView;
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a() {
        super.a();
        com.anythink.expressad.atsignalcommon.windvane.j.a();
        com.anythink.expressad.atsignalcommon.windvane.j.a(this.f11943u);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i10) {
        super.a(i10);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i10);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.f11943u, f11937n, encodeToString);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i10, String str) {
        super.a(i10, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i10);
            jSONObject.put("pt", str);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.f11943u, o, encodeToString);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(AnythinkVideoView.a aVar) {
        super.a(aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(aVar.f11841a, aVar.f11842b));
            jSONObject.put("time", String.valueOf(aVar.f11841a));
            jSONObject.put("duration", String.valueOf(aVar.f11842b));
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.f11943u, f11938p, encodeToString);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static String a(int i10, int i11) {
        if (i11 != 0) {
            double d10 = i10 / i11;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t.a(Double.valueOf(d10)));
                return sb2.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i11);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(Object obj) {
        super.a(obj);
        String encodeToString = (obj == null || !(obj instanceof String)) ? "" : Base64.encodeToString(obj.toString().getBytes(), 2);
        com.anythink.expressad.atsignalcommon.windvane.j.a();
        com.anythink.expressad.atsignalcommon.windvane.j.a(this.f11943u, f11939q, encodeToString);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i10, int i11, int i12, int i13) {
        super.a(i10, i11, i12, i13);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = f11942t;
            if (i10 != 2 ? i11 != 2 : i11 == 1) {
                str = f11941s;
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i12);
            jSONObject2.put("screen_height", i13);
            jSONObject.put("data", jSONObject2);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.f11943u, f11940r, encodeToString);
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }
}
