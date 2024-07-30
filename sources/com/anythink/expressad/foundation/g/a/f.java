package com.anythink.expressad.foundation.g.a;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9813a = "native";

    /* renamed from: b, reason: collision with root package name */
    public static final String f9814b = "reward";

    /* renamed from: c, reason: collision with root package name */
    public static final String f9815c = "interactive";

    /* renamed from: d, reason: collision with root package name */
    public static final String f9816d = "interstitial";

    /* renamed from: e, reason: collision with root package name */
    public static final String f9817e = "banner";
    public static final String f = "splash";

    /* renamed from: g, reason: collision with root package name */
    public static final String f9818g = "h5_native";

    /* renamed from: h, reason: collision with root package name */
    public static Map<String, Long> f9819h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f9820i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f9821j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f9822k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f9823l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f9824m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f9825n = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f9826p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    private static final String f9827q = "f";

    public static void a(String str, com.anythink.expressad.foundation.d.c cVar, String str2) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> b10 = b(str2);
        if (cVar == null || b10 == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(cVar.aZ())) {
                return;
            }
            com.anythink.expressad.foundation.g.e.a aVar = new com.anythink.expressad.foundation.g.e.a(cVar.aZ(), cVar.Z());
            if (b10.containsKey(str)) {
                List<com.anythink.expressad.foundation.g.e.a> list = b10.get(str);
                if (list != null && list.size() == 20) {
                    list.remove(0);
                }
                if (list != null) {
                    list.add(aVar);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            b10.put(str, arrayList);
        } catch (Throwable th) {
            o.b(f9827q, th.getMessage(), th);
        }
    }

    private static void b(String str, com.anythink.expressad.foundation.d.c cVar, String str2) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> b10 = b(str2);
        if (cVar == null || b10 == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(cVar.aZ())) {
                return;
            }
            com.anythink.expressad.foundation.g.e.a aVar = new com.anythink.expressad.foundation.g.e.a(cVar.aZ(), cVar.Z());
            if (b10.containsKey(str)) {
                List<com.anythink.expressad.foundation.g.e.a> list = b10.get(str);
                if (list != null) {
                    list.add(aVar);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            b10.put(str, arrayList);
        } catch (Throwable th) {
            o.b(f9827q, th.getMessage(), th);
        }
    }

    private static Map<String, List<com.anythink.expressad.foundation.g.e.a>> b(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals(f9817e)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1052618729:
                if (str.equals(f9813a)) {
                    c10 = 1;
                    break;
                }
                break;
            case -934326481:
                if (str.equals("reward")) {
                    c10 = 2;
                    break;
                }
                break;
            case -895866265:
                if (str.equals(f)) {
                    c10 = 3;
                    break;
                }
                break;
            case 538816457:
                if (str.equals(f9818g)) {
                    c10 = 4;
                    break;
                }
                break;
            case 604727084:
                if (str.equals("interstitial")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1844104930:
                if (str.equals(f9815c)) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f9825n;
            case 1:
                return f9821j;
            case 2:
                return f9822k;
            case 3:
                return o;
            case 4:
                return f9826p;
            case 5:
                return f9824m;
            case 6:
                return f9823l;
            default:
                return null;
        }
    }

    private static String a(String str, String str2) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> b10;
        List<com.anythink.expressad.foundation.g.e.a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            if (f9821j.containsKey(str)) {
                b10 = f9821j;
            } else if (f9822k.containsKey(str)) {
                b10 = f9822k;
            } else if (f9823l.containsKey(str)) {
                b10 = f9823l;
            } else if (f9824m.containsKey(str)) {
                b10 = f9824m;
            } else if (f9825n.containsKey(str)) {
                b10 = f9825n;
            } else if (o.containsKey(str)) {
                b10 = o;
            } else {
                b10 = f9826p.containsKey(str) ? f9826p : null;
            }
        } else {
            b10 = b(str2);
        }
        if (b10 != null) {
            try {
                if (w.b(str) && b10.containsKey(str) && (list = b10.get(str)) != null && list.size() > 0) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("cid", list.get(i10).a());
                        jSONObject.put("rid", list.get(i10).b());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    private static void a(Map... mapArr) {
        try {
            for (Map map : mapArr) {
                if (map != null) {
                    map.clear();
                }
            }
        } catch (Throwable th) {
            o.b(f9827q, th.getMessage(), th);
        }
    }

    private static Map<String, List<com.anythink.expressad.foundation.g.e.a>> a(String str) {
        if (f9821j.containsKey(str)) {
            return f9821j;
        }
        if (f9822k.containsKey(str)) {
            return f9822k;
        }
        if (f9823l.containsKey(str)) {
            return f9823l;
        }
        if (f9824m.containsKey(str)) {
            return f9824m;
        }
        if (f9825n.containsKey(str)) {
            return f9825n;
        }
        if (o.containsKey(str)) {
            return o;
        }
        if (f9826p.containsKey(str)) {
            return f9826p;
        }
        return null;
    }
}
