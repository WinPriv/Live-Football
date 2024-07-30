package com.anythink.core.common.g;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: a, reason: collision with root package name */
    w f5929a;

    public k(w wVar) {
        this.f5929a = wVar;
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        String str = this.f5929a.f5751c;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        return new byte[0];
    }

    @Override // com.anythink.core.common.g.a
    public final String h() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String j() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, Object> l() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean o() {
        return true;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        return this.f5929a.f5752d;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return this.f5929a.f5750b;
    }
}
