package com.anythink.basead.g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends com.anythink.core.common.g.a {

    /* renamed from: a, reason: collision with root package name */
    String f4020a;

    /* renamed from: b, reason: collision with root package name */
    boolean f4021b;

    public c(String str, String str2, boolean z10) {
        this.f4021b = z10;
        this.f4020a = str.replaceAll("\\{req_id\\}", str2 == null ? "" : str2);
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 2;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        if (this.f4021b) {
            HashMap hashMap = new HashMap();
            String i10 = com.anythink.core.common.k.d.i();
            if (!TextUtils.isEmpty(i10)) {
                hashMap.put("User-Agent", i10);
            }
            return hashMap;
        }
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        return new byte[0];
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        return "";
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
    public final Object a(String str) {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        return this.f4020a;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }
}
