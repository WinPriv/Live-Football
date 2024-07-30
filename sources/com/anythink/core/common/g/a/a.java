package com.anythink.core.common.g.a;

import android.text.TextUtils;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.o;
import com.anythink.core.common.k.f;
import com.anythink.core.common.u;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    List<String> f5830a;

    /* renamed from: b, reason: collision with root package name */
    int f5831b;

    /* renamed from: c, reason: collision with root package name */
    boolean f5832c;

    /* renamed from: k, reason: collision with root package name */
    private final String f5833k = "a";

    public a(List<String> list) {
        this.f5830a = list;
        this.f5831b = list.size();
    }

    private String i() {
        JSONObject g6 = super.g();
        JSONObject a10 = com.anythink.core.common.g.c.a();
        if (g6 != null) {
            try {
                g6.put("app_id", n.a().p());
                g6.put("nw_ver", com.anythink.core.common.k.d.h());
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.f5830a;
                if (list != null && list.size() > 0) {
                    for (String str : this.f5830a) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(new JSONObject(str));
                        }
                    }
                }
                g6.put("data", jSONArray);
            } catch (Exception unused) {
            }
        }
        try {
            a10.put(com.anythink.core.common.g.c.T, this.f5843i);
            a10.put(com.anythink.core.common.g.c.V, this.f5844j);
        } catch (Exception unused2) {
        }
        HashMap hashMap = new HashMap();
        String a11 = com.anythink.core.common.k.c.a(g6.toString());
        String a12 = com.anythink.core.common.k.c.a(a10.toString());
        hashMap.put(com.anythink.core.common.g.c.O, g.c.f5034a);
        hashMap.put(com.anythink.core.common.g.c.W, a11);
        hashMap.put(com.anythink.core.common.g.c.X, a12);
        ArrayList arrayList = new ArrayList(hashMap.size());
        arrayList.addAll(hashMap.keySet());
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (sb2.length() > 0) {
                sb2.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb2.append(str2);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(hashMap.get(str2));
        }
        hashMap.put("sign", f.c(n.a().q() + sb2.toString()));
        return new JSONObject(hashMap).toString();
    }

    public final void a() {
        this.f5832c = true;
    }

    public final int b() {
        return this.f5831b;
    }

    @Override // com.anythink.core.common.g.a.c
    public final int c() {
        return 2;
    }

    @Override // com.anythink.core.common.g.a.c
    public final int d() {
        return 3;
    }

    @Override // com.anythink.core.common.g.a.c
    public final byte[] e() {
        return c.a(i());
    }

    @Override // com.anythink.core.common.g.a.c
    public final boolean f() {
        return false;
    }

    @Override // com.anythink.core.common.g.a.c
    public final void a(String str, String str2, String str3, int i10) {
        if (this.f5832c) {
            u.a().a(3, "", "", i(), o.a(1001));
        }
    }
}
