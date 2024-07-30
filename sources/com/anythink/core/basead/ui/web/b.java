package com.anythink.core.basead.ui.web;

import android.webkit.WebView;
import com.anythink.core.common.e.i;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    i f4727a;

    /* renamed from: b, reason: collision with root package name */
    JSONObject f4728b;

    /* renamed from: c, reason: collision with root package name */
    HashMap<String, Boolean> f4729c = new HashMap<>(3);

    public b(i iVar) {
        JSONObject jSONObject;
        this.f4727a = iVar;
        if (iVar != null) {
            try {
                jSONObject = new JSONObject(iVar.M());
            } catch (Throwable unused) {
                return;
            }
        } else {
            jSONObject = null;
        }
        this.f4728b = jSONObject;
    }

    private void a(WebView webView, String str) {
        JSONObject jSONObject = this.f4728b;
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && str != null && str.contains(next) && this.f4729c.get(next) == null) {
                    this.f4729c.put(next, Boolean.TRUE);
                    webView.loadUrl(this.f4728b.optString(next));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
