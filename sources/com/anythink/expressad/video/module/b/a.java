package com.anythink.expressad.video.module.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.b.n;
import com.anythink.core.common.c.g;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.f.h.b;
import com.anythink.expressad.foundation.h.j;
import com.anythink.expressad.foundation.h.o;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static HashMap<String, ArrayList<String>> f11892a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final String f11893b = "VideoViewReport";

    public static void a() {
    }

    public static void b(Context context, c cVar) {
        if (cVar != null && cVar.L() != null && cVar.L().j() != null) {
            com.anythink.expressad.a.a.a(context, cVar, cVar.K(), cVar.L().j(), false);
        }
    }

    public static void c(Context context, c cVar) {
        if (cVar != null && cVar.L() != null && cVar.L().k() != null) {
            com.anythink.expressad.a.a.a(context, cVar, cVar.K(), cVar.L().k(), false);
        }
    }

    public static void d(Context context, c cVar) {
        if (cVar != null && cVar.L() != null && cVar.L().q() != null) {
            com.anythink.expressad.a.a.a(context, cVar, cVar.K(), cVar.L().q(), false);
        }
    }

    public static void e(Context context, c cVar) {
        if (cVar != null && cVar.L() != null && cVar.L().m() != null) {
            com.anythink.expressad.a.a.a(context, cVar, cVar.K(), cVar.L().m(), false);
        }
    }

    private static void f(Context context, c cVar) {
        if (cVar != null && cVar.L() != null && cVar.L().d() != null) {
            com.anythink.expressad.a.a.a(context, cVar, cVar.K(), cVar.L().d(), true);
        }
    }

    private static void g(Context context, c cVar) {
        if (cVar != null && cVar.L() != null && cVar.L().e() != null) {
            com.anythink.expressad.a.a.a(context, cVar, cVar.K(), cVar.L().e(), false);
        }
    }

    private static void h(Context context, c cVar) {
        if (cVar != null && cVar.L() != null && cVar.L().f() != null) {
            com.anythink.expressad.a.a.a(context, cVar, cVar.K(), cVar.L().f(), false);
        }
    }

    private static void i(Context context, c cVar) {
        if (cVar != null && cVar.L() != null && cVar.L().g() != null) {
            com.anythink.expressad.a.a.a(context, cVar, cVar.K(), cVar.L().g(), false);
        }
    }

    private static void j(Context context, c cVar) {
        if (cVar != null && cVar.L() != null && cVar.L().h() != null) {
            com.anythink.expressad.a.a.a(context, cVar, cVar.K(), cVar.L().h(), false);
        }
    }

    private static void k(Context context, c cVar) {
        if (cVar != null && cVar.L() != null && cVar.L().l() != null) {
            String K = cVar.K();
            ArrayList<String> arrayList = f11892a.get(K);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                f11892a.put(K, arrayList);
            }
            if (!arrayList.contains(cVar.aZ())) {
                com.anythink.expressad.a.a.a(context, cVar, cVar.K(), cVar.L().l(), false);
                arrayList.add(cVar.aZ());
            }
        }
    }

    public static void a(String str) {
        f11892a.remove(str);
    }

    public static void a(Context context, c cVar) {
        if (cVar == null || cVar.L() == null || cVar.L().o() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.K(), cVar.L().o(), false);
    }

    public static void a(Context context, c cVar, int i10, int i11) {
        try {
            String[] p10 = cVar.L().p();
            if (cVar.L() == null || p10 == null) {
                return;
            }
            String[] strArr = new String[p10.length];
            for (int i12 = 0; i12 < p10.length; i12++) {
                String str = p10[i12];
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endscreen_type", i10);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = j.a(jSONObject2);
                }
                if (!TextUtils.isEmpty(jSONObject2)) {
                    str = str + "&value=" + URLEncoder.encode(jSONObject2);
                }
                strArr[i12] = cVar.n() == 1 ? str + "&to=1&cbt=" + cVar.az() + "&tmorl=" + i11 : str + "&to=0&cbt=" + cVar.az() + "&tmorl=" + i11;
            }
            com.anythink.expressad.a.a.a(context, cVar, cVar.K(), strArr, true);
        } catch (Throwable unused) {
            o.d("", "reportEndcardshowData error");
        }
    }

    public static void a(Context context, c cVar, int i10, int i11, int i12) {
        String str;
        if (i11 == 0 || context == null || cVar == null) {
            return;
        }
        try {
            List<Map<Integer, String>> i13 = cVar.L().i();
            int i14 = ((i10 + 1) * 100) / i11;
            if (i13 != null) {
                int i15 = 0;
                while (i15 < i13.size()) {
                    Map<Integer, String> map = i13.get(i15);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            int intValue = next.getKey().intValue();
                            String value = next.getValue();
                            if (cVar.n() == 1) {
                                str = value + "&to=1&cbt=" + cVar.az() + "&tmorl=" + i12;
                            } else {
                                str = value + "&to=0&cbt=" + cVar.az() + "&tmorl=" + i12;
                            }
                            if (intValue <= i14 && !TextUtils.isEmpty(str)) {
                                com.anythink.expressad.a.a.a(context, cVar, cVar.K(), new String[]{str}, true);
                                it.remove();
                                i13.remove(i15);
                                i15--;
                            }
                        }
                    }
                    i15++;
                }
            }
        } catch (Throwable unused) {
            o.d("", "reportPlayPercentageData error");
        }
    }

    public static void a(c cVar, Map<Integer, String> map, String str, int i10) {
        if (cVar == null || map == null) {
            return;
        }
        try {
            if (map.size() > 0) {
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    Integer key = next.getKey();
                    String value = next.getValue();
                    if (i10 == key.intValue() && !TextUtils.isEmpty(value)) {
                        com.anythink.expressad.a.a.a(n.a().g(), cVar, str, value, false);
                        it.remove();
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void a(c cVar, String str) {
        if (cVar != null) {
            try {
                if (cVar.al() == null || cVar.al().size() <= 0) {
                    return;
                }
                for (String str2 : cVar.al()) {
                    if (!TextUtils.isEmpty(str2)) {
                        com.anythink.expressad.a.a.a(n.a().g(), cVar, str, str2, false);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(c cVar, com.anythink.expressad.videocommon.c.c cVar2, String str, String str2, String str3) {
        String str4 = ContainerUtils.FIELD_DELIMITER;
        String str5 = "";
        if (cVar == null || cVar2 == null) {
            return;
        }
        try {
            com.anythink.expressad.video.module.c.a aVar = new com.anythink.expressad.video.module.c.a(n.a().g());
            b bVar = new b();
            bVar.a("user_id", j.a(str2));
            bVar.a(com.anythink.expressad.d.a.b.aM, "1");
            bVar.a("reward_name", cVar2.a());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cVar2.b());
            bVar.a("reward_amount", sb2.toString());
            bVar.a("unit_id", str);
            bVar.a("click_id", cVar.aa());
            if (!TextUtils.isEmpty(str3)) {
                bVar.a(g.a.f5311h, str3);
            }
            aVar.a("", bVar);
            String str6 = cVar.ak() + "/addReward?";
            String trim = bVar.a().trim();
            if (!TextUtils.isEmpty(trim)) {
                if (!str6.endsWith("?") && !str6.endsWith(ContainerUtils.FIELD_DELIMITER)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str6);
                    if (!str6.contains("?")) {
                        str4 = "?";
                    }
                    sb3.append(str4);
                    str6 = sb3.toString();
                }
                str5 = str6 + trim;
            }
            o.d(f11893b, "rewardUrl:".concat(String.valueOf(str5)));
            com.anythink.expressad.a.a.a(n.a().g(), cVar, cVar.K(), str5, false);
        } catch (Throwable th) {
            o.b(f11893b, th.getMessage(), th);
        }
    }

    private static String a(String str, b bVar) {
        String trim = bVar.a().trim();
        if (TextUtils.isEmpty(trim)) {
            return "";
        }
        if (!str.endsWith("?") && !str.endsWith(ContainerUtils.FIELD_DELIMITER)) {
            str = str.concat(str.contains("?") ? ContainerUtils.FIELD_DELIMITER : "?");
        }
        return com.ironsource.adapters.facebook.a.h(str, trim);
    }
}
