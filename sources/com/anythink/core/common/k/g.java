package com.anythink.core.common.k;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.ae;
import com.anythink.core.common.e.ai;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f6178a = "com.android.vending";
    }

    public static boolean a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() <= 128) {
            if (Pattern.matches("^([.A-Za-z0-9_-]){1,128}$", str)) {
                return true;
            }
            Log.e("anythink", "Invalid Channel(" + str + "): contains some characters that are not in the ^([.A-Za-z0-9_-]){1,128}$");
            return false;
        }
        Log.e("anythink", "Invalid Channel(" + str + "):Channel'length over 128");
        return false;
    }

    public static boolean b(String str) {
        if (!TextUtils.isEmpty(str) && str.length() <= 128) {
            if (Pattern.matches("^([.A-Za-z0-9_-]){1,128}$", str)) {
                return true;
            }
            Log.e("anythink", "Invalid SubChannel(" + str + "):SubChannel contains some characters that are not in the ^([.A-Za-z0-9_-]){1,128}$");
            return false;
        }
        Log.e("anythink", "Invalid SubChannel(" + str + "):SubChannel'length over 128");
        return false;
    }

    public static boolean c(String str) {
        if (!TextUtils.isEmpty(str) && str.length() == 14) {
            if (Pattern.matches("^[A-Za-z0-9]+$", str)) {
                return true;
            }
            Log.e("anythink", "Invalid Scenario(" + str + "):Scenario contains some characters that are not in the [A-Za-z0-9]");
            return false;
        }
        Log.e("anythink", "Invalid Scenario(" + str + "):Scenario'length isn't 14");
        return false;
    }

    public static String d(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c10 = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c10 = 1;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c10 = 2;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return g.C0076g.f5065a;
            case 1:
                return g.C0076g.f5066b;
            case 2:
                return "Banner";
            case 3:
                return "Interstitial";
            case 4:
                return g.C0076g.f5069e;
            default:
                return "";
        }
    }

    private static boolean d(Context context) {
        return q.a().b(context);
    }

    public static String a(String str, String str2, long j10) {
        return str + "_" + str2 + "_" + j10;
    }

    public static String b(String str, String str2, long j10) {
        return a(str, str2, j10) + "_refresh";
    }

    private static boolean c(Context context) {
        return q.a().a(context);
    }

    public static JSONObject a(Context context, String str, String str2, int i10, int i11) {
        ae aeVar;
        int i12;
        int i13;
        Map<String, ae> a10 = com.anythink.core.a.a.a(context).a(i10);
        if (a10 != null) {
            i12 = 0;
            i13 = 0;
            for (ae aeVar2 : a10.values()) {
                i12 += aeVar2.f5459c;
                i13 += aeVar2.f5460d;
            }
            aeVar = a10.get(str2);
        } else {
            aeVar = null;
            i12 = 0;
            i13 = 0;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sr", "tp");
            jSONObject.put("rid", str);
            jSONObject.put(com.anythink.expressad.foundation.d.d.f9543h, i12);
            jSONObject.put("ahs", i13);
            jSONObject.put("pds", aeVar != null ? aeVar.f5459c : 0);
            jSONObject.put("phs", aeVar != null ? aeVar.f5460d : 0);
            jSONObject.put("ap", i11);
            jSONObject.put("tpl", str2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String b(Context context) {
        String x10 = com.anythink.core.common.b.n.a().x();
        if (TextUtils.isEmpty(x10)) {
            x10 = d.d(context) + d.f();
        }
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j(x10);
        j10.append(UUID.randomUUID().toString());
        return f.a(j10.toString());
    }

    private static boolean c() {
        return q.a().b();
    }

    public static boolean b() {
        try {
            Map<String, Object> m10 = com.anythink.core.common.b.n.a().m();
            if (m10 == null || !m10.containsKey("age")) {
                return false;
            }
            return Integer.parseInt(m10.get("age").toString()) <= 13;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(Context context) {
        String x10 = com.anythink.core.common.b.n.a().x();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(d.d(context));
        stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(d.f());
        stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(x10);
        stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(new Random().nextInt(10000));
        return f.a(stringBuffer.toString());
    }

    public static void a(List<ai> list, ai aiVar, boolean z10) {
        if (list == null) {
            return;
        }
        int size = list.size();
        if (z10) {
            if (aiVar.a() == -1 || size == 0) {
                list.add(aiVar);
                return;
            }
        } else if (size == 0) {
            list.add(aiVar);
            return;
        }
        int i10 = size - 1;
        for (int i11 = 0; i11 < size; i11++) {
            ai aiVar2 = list.get(i11);
            boolean z11 = true;
            if (z10 && aiVar2.a() == -1) {
                list.add(i11, aiVar);
            } else if (a(aiVar) >= a(aiVar2)) {
                list.add(i11, aiVar);
            } else if (i11 == i10) {
                list.add(aiVar);
            } else {
                z11 = false;
            }
            if (z11) {
                return;
            }
        }
    }

    private static boolean a(List<ai> list, ai aiVar, ai aiVar2, int i10, int i11, boolean z10) {
        if (z10 && aiVar.a() == -1) {
            list.add(i10, aiVar2);
            return true;
        }
        if (a(aiVar2) >= a(aiVar)) {
            list.add(i10, aiVar2);
            return true;
        }
        if (i10 != i11) {
            return false;
        }
        list.add(aiVar2);
        return true;
    }

    public static void a(com.anythink.core.common.e.e eVar, String str, String str2, String str3) {
        if (!ATSDK.isNetworkLogDebug() || eVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (eVar.y() != 0) {
                jSONObject.put("defaultAdSourceType", eVar.y());
            }
            jSONObject.put("placementId", eVar.W());
            jSONObject.put("adType", eVar.Z());
            jSONObject.put("mixedFormatAdType", eVar.L());
            jSONObject.put("action", str);
            jSONObject.put("refresh", eVar.F());
            jSONObject.put("result", str2);
            jSONObject.put("segmentId", eVar.I());
            jSONObject.put("adSourceId", eVar.x());
            jSONObject.put("position", eVar.z());
            jSONObject.put("networkType", eVar.H());
            jSONObject.put("networkName", eVar.T());
            jSONObject.put("networkVersion", eVar.f5599u);
            jSONObject.put("networkUnit", eVar.G());
            jSONObject.put("isHB", eVar.v());
            jSONObject.put("msg", str3);
            jSONObject.put("hourly_frequency", eVar.B());
            jSONObject.put("daily_frequency", eVar.C());
            jSONObject.put("network_list", eVar.D());
            jSONObject.put("request_network_num", eVar.E());
            jSONObject.put("handle_class", eVar.i());
        } catch (Throwable unused) {
        }
        n.a("network", jSONObject.toString());
    }

    public static void a(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("searchBoxjavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setSavePassword(false);
    }

    public static double a(ai aiVar) {
        if (aiVar == null) {
            return 0.0d;
        }
        if (aiVar.aa()) {
            return com.anythink.core.b.f.a().b(aiVar);
        }
        return aiVar.ag();
    }

    private static void a(String str, List<ai> list) {
        if (list != null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ai aiVar = list.get(i10);
                    sb2.append("\n");
                    sb2.append(i10);
                    sb2.append(" --> adSourceId: ");
                    sb2.append(aiVar.t());
                    sb2.append(", ");
                    sb2.append(aiVar.d());
                    sb2.append(", real: ");
                    sb2.append(aiVar.x());
                    sb2.append(", sort: ");
                    sb2.append(a(aiVar));
                    String z10 = aiVar.z();
                    if (!TextUtils.isEmpty(z10)) {
                        sb2.append(", errorMsg: ");
                        sb2.append(z10);
                    }
                }
                Log.e(str, sb2.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String a() {
        return TextUtils.isEmpty(com.anythink.core.common.b.g.f4995a) ? "UA_0.0.0" : com.anythink.core.common.b.g.f4995a;
    }

    public static String a(com.anythink.core.common.e.i iVar) {
        return f.a(iVar.p() + iVar.A());
    }

    public static void a(Map<String, Object> map, com.anythink.core.common.e.e eVar) {
        if (eVar == null || eVar.H() >= 100000) {
            return;
        }
        map.put(g.k.f5116h, eVar);
    }

    private static int a(int i10, int[] iArr, int i11) {
        if (iArr == null) {
            return i11;
        }
        for (int i12 : iArr) {
            if (i10 == i12) {
                return i10;
            }
        }
        return i11;
    }
}
