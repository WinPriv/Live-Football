package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<m> f25690a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public m f25691b;

    /* renamed from: c, reason: collision with root package name */
    public e f25692c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f25693d;

    public l(e eVar) {
        this.f25692c = eVar;
    }

    public final m a() {
        Iterator<m> it = this.f25690a.iterator();
        while (it.hasNext()) {
            m next = it.next();
            if (next.f25696c) {
                return next;
            }
        }
        return this.f25691b;
    }

    public final String b() {
        JSONObject jSONObject = this.f25693d;
        if (jSONObject != null && !TextUtils.isEmpty(jSONObject.optString("adapterName"))) {
            return this.f25693d.optString("adapterName");
        }
        return IronSourceConstants.SUPERSONIC_CONFIG_NAME;
    }

    public final m a(String str) {
        Iterator<m> it = this.f25690a.iterator();
        while (it.hasNext()) {
            m next = it.next();
            if (next.f25695b.equals(str)) {
                return next;
            }
        }
        return null;
    }
}
