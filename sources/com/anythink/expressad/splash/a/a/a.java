package com.anythink.expressad.splash.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.w;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10896a = "a";

    private static String a() {
        return "";
    }

    private static String b() {
        return "";
    }

    private static String a(String str) {
        List<com.anythink.expressad.foundation.g.e.a> list;
        try {
            Map<String, List<com.anythink.expressad.foundation.g.e.a>> map = f.f9820i;
            if (map == null || !w.b(str) || !map.containsKey(str) || (list = map.get(str)) == null || list.size() <= 0) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < list.size(); i10++) {
                JSONObject jSONObject = new JSONObject();
                com.anythink.expressad.foundation.g.e.a aVar = list.get(i10);
                jSONObject.put("cid", aVar.a());
                jSONObject.put("crid", aVar.c());
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private static void a(String str, List<c> list) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> map = f.f9820i;
        if (map == null || list == null || list.size() <= 0) {
            return;
        }
        if (w.b(str)) {
            if (map.containsKey(str)) {
                map.put(str, a(map.get(str), list));
            } else {
                map.put(str, a(new ArrayList(), list));
            }
        }
        f.f9820i = map;
    }

    private static synchronized List<com.anythink.expressad.foundation.g.e.a> a(List<com.anythink.expressad.foundation.g.e.a> list, List<c> list2) {
        synchronized (a.class) {
            if (list2 != null) {
                if (list2.size() > 0) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    for (c cVar : list2) {
                        if (cVar != null) {
                            com.anythink.expressad.foundation.g.e.a aVar = new com.anythink.expressad.foundation.g.e.a(cVar.aZ(), cVar.r());
                            if (list.size() >= 20) {
                                list.remove(0);
                            }
                            list.add(aVar);
                        }
                    }
                }
            }
        }
        return list;
    }

    private static void a(Context context, List<c> list) {
        String str = f10896a;
        o.b(str, "updateInstallList 开始 更新本机已安装广告列表");
        if (context != null && list != null && list.size() != 0) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                c cVar = list.get(i10);
                if (cVar != null) {
                    t.a(context, cVar.ba());
                }
            }
            return;
        }
        o.b(str, "updateInstallList 列表为空 不做更新本机已安装广告列表");
    }

    public static c a(String str, c cVar) {
        if (TextUtils.isEmpty(str)) {
            return cVar;
        }
        if (TextUtils.isEmpty(str) && cVar == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject a10 = c.a(cVar);
                c b10 = c.b(a10);
                if (b10 == null) {
                    b10 = cVar;
                }
                if (!TextUtils.isEmpty(str)) {
                    String optString = a10.optString("unitId");
                    if (!TextUtils.isEmpty(optString)) {
                        b10.l(optString);
                    }
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.anythink.expressad.foundation.g.a.ce);
                    if (optJSONObject != null) {
                        String.valueOf(t.b(n.a().g(), Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.f9775cc)).intValue()));
                        String.valueOf(t.b(n.a().g(), Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.f9776cd)).intValue()));
                    }
                    b10.p(b10.ad());
                    String ah = b10.ah();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb2 = new StringBuilder();
                        while (keys.hasNext()) {
                            sb2.append(ContainerUtils.FIELD_DELIMITER);
                            String next = keys.next();
                            String optString2 = optJSONObject.optString(next);
                            if (com.anythink.expressad.foundation.g.a.f9775cc.equals(next) || com.anythink.expressad.foundation.g.a.f9776cd.equals(next)) {
                                optString2 = String.valueOf(t.b(n.a().g(), Integer.valueOf(optString2).intValue()));
                            }
                            sb2.append(next);
                            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb2.append(optString2);
                        }
                        b10.q(ah + ((Object) sb2));
                    }
                }
                return b10;
            } catch (Throwable unused) {
                return cVar;
            }
        }
        try {
            JSONObject a11 = c.a(cVar);
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (!jSONObject.has(c.O)) {
                    a11.put(c.O, "");
                }
            } catch (Exception unused2) {
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                a11.put(next2, jSONObject.getString(next2));
            }
            c b11 = c.b(a11);
            String optString3 = a11.optString("unitId");
            if (!TextUtils.isEmpty(optString3)) {
                b11.l(optString3);
            }
            return b11;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return cVar;
        }
    }

    public static String a(int i10, float f, float f10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (i10 == 4) {
                jSONObject2.put(com.anythink.expressad.foundation.g.a.f9775cc, com.anythink.expressad.video.bt.a.c.f11213a);
                jSONObject2.put(com.anythink.expressad.foundation.g.a.f9776cd, com.anythink.expressad.video.bt.a.c.f11213a);
            } else {
                jSONObject2.put(com.anythink.expressad.foundation.g.a.f9775cc, t.a(n.a().g(), f));
                jSONObject2.put(com.anythink.expressad.foundation.g.a.f9776cd, t.a(n.a().g(), f10));
            }
            jSONObject2.put(com.anythink.expressad.foundation.g.a.cf, i10);
            jSONObject2.put(com.anythink.expressad.foundation.g.a.cg, n.a().g().getResources().getConfiguration().orientation);
            jSONObject2.put(com.anythink.expressad.foundation.g.a.ch, t.c(n.a().g()));
            jSONObject.put(com.anythink.expressad.foundation.g.a.ce, jSONObject2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    private static String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            o.d(f10896a, "code to string is error");
            return "";
        }
    }
}
