package com.anythink.core.common.k;

import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.b.g;
import com.anythink.core.common.c.g;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.v;
import com.huawei.openalliance.ad.constant.w;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6219a = "anythink_bidding";

    public static void a(String str, com.anythink.core.common.e.e eVar, String str2, ai aiVar, int i10, int i11) {
        a(str, eVar, str2, aiVar, i10, i11, null);
    }

    public static void b(String str, String str2, String str3, String str4, String str5) {
        a(str, str2, str3, str4, str5, false);
    }

    public static void a(String str, com.anythink.core.common.e.e eVar, String str2, ai aiVar, int i10, int i11, List<String> list) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reason", str2);
                jSONObject.put("placementId", str);
                jSONObject.put("adtype", eVar.Z());
                jSONObject.put("adsourceId", aiVar.t());
                jSONObject.put("networkFirmId", aiVar.c());
                jSONObject.put("content", eVar.G());
                jSONObject.put("hourly_frequency", i10);
                jSONObject.put("hourly_limit", aiVar.f());
                jSONObject.put("daily_frequency", i11);
                jSONObject.put("daily_limit", aiVar.e());
                jSONObject.put("pacing_limit", aiVar.s());
                jSONObject.put("request_fail_interval", aiVar.H());
                jSONObject.put("filter_source_ids", list != null ? list : "");
                a("anythink_network", jSONObject.toString(), true);
            } catch (Throwable unused) {
            }
        }
    }

    private static void b(String str, String str2) {
        a(str, str2, false);
    }

    public static void a(String str, String str2, String str3, ai aiVar) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", g.i.f5093v);
                jSONObject.put("result", str);
                jSONObject.put("placementId", str2);
                jSONObject.put("adtype", str3);
                jSONObject.put("adsourceId", aiVar.t());
                jSONObject.put("networkFirmId", aiVar.c());
                jSONObject.put("content", aiVar.g());
                jSONObject.put("msg", aiVar.z());
                a(f6219a, jSONObject.toString(), TextUtils.equals(g.i.f5079g, str));
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(String str, String str2, String str3, String str4) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", g.i.f5094w);
                jSONObject.put("result", str);
                jSONObject.put("placementId", str2);
                jSONObject.put("adtype", str3);
                jSONObject.put("errorMsg", str4);
                a("anythink_network", jSONObject.toString(), TextUtils.equals(g.i.f5079g, str));
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, String str2) {
        if (ATSDK.isNetworkLogDebug()) {
            a("anythink_".concat(String.valueOf(str)), str2, false);
        }
    }

    public static void a(String str, String str2, boolean z10) {
        String property = System.getProperty("line.separator");
        try {
            if (str2.startsWith("{")) {
                str2 = new JSONObject(str2).toString(4);
            } else if (str2.startsWith("[")) {
                str2 = new JSONArray(str2).toString(4);
            }
        } catch (JSONException unused) {
        }
        String str3 = "╔═══════════════════════════════════════════════════════════════════════════════════════";
        for (String str4 : str2.split(property)) {
            str3 = e0.i.f(com.ironsource.adapters.facebook.a.h(str3, "\n"), "║ ", str4);
        }
        String h10 = com.ironsource.adapters.facebook.a.h(str3, "\n╚═══════════════════════════════════════════════════════════════════════════════════════");
        if (z10) {
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
            j10.append(com.anythink.core.common.b.n.a().v() ? "(DebuggerMode)" : "");
            Log.e(j10.toString(), " \n".concat(String.valueOf(h10)));
        } else {
            StringBuilder j11 = com.ironsource.adapters.facebook.a.j(str);
            j11.append(com.anythink.core.common.b.n.a().v() ? "(DebuggerMode)" : "");
            Log.i(j11.toString(), " \n".concat(String.valueOf(h10)));
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        String str6;
        if (ATSDK.isNetworkLogDebug()) {
            str2.getClass();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 48:
                    if (str2.equals("0")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 49:
                    if (str2.equals("1")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 50:
                    if (str2.equals("2")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 51:
                    if (str2.equals("3")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 52:
                    if (str2.equals("4")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    str6 = g.i.f5084l;
                    break;
                case 1:
                    str6 = g.i.f5083k;
                    break;
                case 2:
                    str6 = g.i.f5081i;
                    break;
                case 3:
                    str6 = g.i.f5082j;
                    break;
                case 4:
                    str6 = g.i.f5085m;
                    break;
                default:
                    str6 = "";
                    break;
            }
            a(str, str6, str3, str4, str5, false);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, boolean z10) {
        String str6;
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("placementId", str);
                jSONObject.put("adtype", str2);
                jSONObject.put("api", str3);
                jSONObject.put("result", str4);
                jSONObject.put("reason", str5);
                if (z10) {
                    if (!TextUtils.isEmpty(str)) {
                        Map<String, Object> c10 = v.a().c(str);
                        if (c10.size() > 0) {
                            String str7 = "";
                            for (Map.Entry<String, Object> entry : c10.entrySet()) {
                                str7 = str7 + "key=" + entry.getKey() + ",value=" + entry.getValue().toString() + w.aG;
                            }
                            str6 = "[" + str7 + "]";
                            jSONObject.put(g.a.f5311h, str6);
                        }
                    }
                    str6 = "";
                    jSONObject.put(g.a.f5311h, str6);
                }
                StringBuilder sb2 = new StringBuilder("anythink_network");
                sb2.append(com.anythink.core.common.b.n.a().v() ? "(DebuggerMode)" : "");
                Log.i(sb2.toString(), jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
    }
}
