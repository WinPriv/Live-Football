package com.anythink.core.common.g;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes.dex */
public final class e extends a {
    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpConnection.CONTENT_ENCODING, com.anythink.expressad.foundation.g.f.g.c.f10012d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        try {
            return g().getBytes(com.anythink.expressad.foundation.g.a.bN);
        } catch (Exception unused) {
            return g().getBytes();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject e() {
        JSONObject e10 = super.e();
        try {
            e10.put("app_id", n.a().p());
            e10.put("curr_ts", System.currentTimeMillis());
        } catch (Exception unused) {
        }
        return e10;
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        HashMap hashMap = new HashMap();
        String a10 = com.anythink.core.common.k.c.a(e().toString());
        hashMap.put(c.O, g.c.f5034a);
        hashMap.put(c.W, a10);
        ArrayList arrayList = new ArrayList(hashMap.size());
        arrayList.addAll(hashMap.keySet());
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb2.length() > 0) {
                sb2.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb2.append(str);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(hashMap.get(str));
        }
        try {
            hashMap.put("sign", URLEncoder.encode(com.anythink.core.common.k.f.c(n.a().q() + sb2.toString()), com.anythink.expressad.foundation.g.a.bN));
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        return new JSONObject(hashMap).toString();
    }

    @Override // com.anythink.core.common.g.a
    public final String h() {
        return n.a().p();
    }

    @Override // com.anythink.core.common.g.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String j() {
        return n.a().q();
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
    public final Object a(String str) {
        return str;
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.e();
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }
}
