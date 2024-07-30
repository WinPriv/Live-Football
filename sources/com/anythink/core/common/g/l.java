package com.anythink.core.common.g;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l extends a {

    /* renamed from: a, reason: collision with root package name */
    o f5930a;

    /* renamed from: b, reason: collision with root package name */
    boolean f5931b = true;

    public l(o oVar) {
        this.f5930a = oVar;
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
        String str = this.f5930a.f5725c;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    @Override // com.anythink.core.common.g.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] d() {
        /*
            r6 = this;
            com.anythink.core.common.e.o r0 = r6.f5930a
            java.lang.String r0 = r0.f5725c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            java.lang.String r3 = "gzip"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2a
            com.anythink.core.common.e.o r5 = r6.f5930a     // Catch: java.lang.Exception -> L2a
            java.lang.String r5 = r5.f5727e     // Catch: java.lang.Exception -> L2a
            r4.<init>(r5)     // Catch: java.lang.Exception -> L2a
            boolean r3 = r6.f5931b     // Catch: java.lang.Exception -> L27
            if (r3 == 0) goto L2f
            java.lang.String r3 = "ofl"
            r4.put(r3, r1)     // Catch: java.lang.Exception -> L27
            goto L2f
        L27:
            r1 = move-exception
            r3 = r4
            goto L2b
        L2a:
            r1 = move-exception
        L2b:
            r1.printStackTrace()
            r4 = r3
        L2f:
            if (r0 == 0) goto L3f
            if (r4 == 0) goto L3c
            java.lang.String r0 = r4.toString()
            byte[] r0 = com.anythink.core.common.g.a.c(r0)
            return r0
        L3c:
            byte[] r0 = new byte[r2]
            return r0
        L3f:
            if (r4 == 0) goto L4a
            java.lang.String r0 = r4.toString()
            byte[] r0 = r0.getBytes()
            return r0
        L4a:
            byte[] r0 = new byte[r2]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.g.l.d():byte[]");
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

    public final void p() {
        this.f5931b = false;
    }

    public final o q() {
        return this.f5930a;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        return this.f5930a.f5726d;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return this.f5930a.f5724b;
    }
}
