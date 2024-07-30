package com.anythink.core.common.g;

import android.content.Context;
import com.anythink.core.api.AdError;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends a {
    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 2;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        return null;
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
    public final boolean n() {
        return true;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        long currentTimeMillis = System.currentTimeMillis();
        String c10 = com.anythink.core.common.k.f.c(String.valueOf(currentTimeMillis));
        StringBuilder sb2 = new StringBuilder();
        com.anythink.core.common.i.a();
        sb2.append(com.anythink.core.common.i.d());
        sb2.append("?t=");
        sb2.append(currentTimeMillis);
        sb2.append("&sign=");
        sb2.append(c10);
        return sb2.toString();
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
