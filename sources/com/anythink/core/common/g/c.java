package com.anythink.core.common.g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATPrivacyConfig;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.n;
import com.anythink.core.common.b.p;
import com.anythink.core.common.e.ak;
import com.anythink.core.common.k.q;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    public static final String A = "it_src";
    public static final String B = "lat";
    public static final String C = "lon";
    public static final String D = "inst_wx";
    public static final String E = "mini_sdk";
    public static final String F = "ms_type";
    public static final String G = "device_set";
    public static final String H = "gdpr_cs";
    public static final String I = "abtest_id";
    public static final String J = "first_init_time";
    public static final String K = "days_from_first_init";
    public static final String L = "cs_cl";
    public static final String M = "is_ofm";
    public static final String N = "app_id";
    public static final String O = "api_ver";
    public static final String P = "custom";
    public static final String Q = "rdid";
    public static final String R = "rc";
    public static final String S = "data";
    public static final String T = "tcp_tk_da_type";
    public static final String U = "ofl";
    public static final String V = "tcp_rate";
    public static final String W = "p";
    public static final String X = "p2";
    public static final String Y = "sign";
    public static final String Z = "common";

    /* renamed from: a, reason: collision with root package name */
    public static final String f5866a = "platform";

    /* renamed from: aa, reason: collision with root package name */
    public static final int f5867aa = 1;

    /* renamed from: ab, reason: collision with root package name */
    public static final int f5868ab = 2;

    /* renamed from: ac, reason: collision with root package name */
    public static final int f5869ac = 3;

    /* renamed from: ad, reason: collision with root package name */
    public static final String f5870ad = "area_type";
    public static final String ae = "sp_http";
    public static final String af = "os_fw";
    public static final String ag = "is_test";
    public static final String ah = "mdna_oid";
    public static final String ai = "mdna_appkey";
    public static final String aj = "mdna_r";
    public static final String ak = "user_num";
    public static final String al = "cp_device_id";
    public static final String am = "cp_pl_id";
    public static int an = -1;
    public static int ao = -1;
    public static final String ap = "al_it_apil";
    public static final String aq = "wx_data";

    /* renamed from: b, reason: collision with root package name */
    public static final String f5871b = "os_vn";

    /* renamed from: c, reason: collision with root package name */
    public static final String f5872c = "os_vc";

    /* renamed from: d, reason: collision with root package name */
    public static final String f5873d = "package_name";

    /* renamed from: e, reason: collision with root package name */
    public static final String f5874e = "app_vn";
    public static final String f = "app_vc";

    /* renamed from: g, reason: collision with root package name */
    public static final String f5875g = "brand";

    /* renamed from: h, reason: collision with root package name */
    public static final String f5876h = "model";

    /* renamed from: i, reason: collision with root package name */
    public static final String f5877i = "screen";

    /* renamed from: j, reason: collision with root package name */
    public static final String f5878j = "network_type";

    /* renamed from: k, reason: collision with root package name */
    public static final String f5879k = "mnc";

    /* renamed from: l, reason: collision with root package name */
    public static final String f5880l = "mcc";

    /* renamed from: m, reason: collision with root package name */
    public static final String f5881m = "language";

    /* renamed from: n, reason: collision with root package name */
    public static final String f5882n = "timezone";
    public static final String o = "sdk_ver";

    /* renamed from: p, reason: collision with root package name */
    public static final String f5883p = "gp_ver";

    /* renamed from: q, reason: collision with root package name */
    public static final String f5884q = "nw_ver";

    /* renamed from: r, reason: collision with root package name */
    public static final String f5885r = "ua";

    /* renamed from: s, reason: collision with root package name */
    public static final String f5886s = "orient";

    /* renamed from: t, reason: collision with root package name */
    public static final String f5887t = "system";

    /* renamed from: u, reason: collision with root package name */
    public static final String f5888u = "android_id";

    /* renamed from: v, reason: collision with root package name */
    public static final String f5889v = "gaid";

    /* renamed from: w, reason: collision with root package name */
    public static final String f5890w = "channel";

    /* renamed from: x, reason: collision with root package name */
    public static final String f5891x = "sub_channel";
    public static final String y = "upid";

    /* renamed from: z, reason: collision with root package name */
    public static final String f5892z = "ps_id";

    public static JSONObject a(int i10) {
        String str;
        com.anythink.core.common.k.d.q(n.a().g());
        JSONObject jSONObject = new JSONObject();
        Context g6 = n.a().g();
        try {
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", com.anythink.core.common.k.d.e());
            jSONObject.put("os_vc", com.anythink.core.common.k.d.d());
            jSONObject.put("package_name", com.anythink.core.common.k.d.k(g6));
            jSONObject.put("app_vn", com.anythink.core.common.k.d.i(g6));
            jSONObject.put("app_vc", com.anythink.core.common.k.d.h(g6));
            jSONObject.put("brand", com.anythink.core.common.k.d.b());
            jSONObject.put("model", com.anythink.core.common.k.d.a());
            jSONObject.put("screen", com.anythink.core.common.k.d.j(g6));
            jSONObject.put("network_type", com.anythink.core.common.k.d.m(g6));
            jSONObject.put("mnc", com.anythink.core.common.k.d.c(g6));
            jSONObject.put("mcc", com.anythink.core.common.k.d.b(g6));
            jSONObject.put("language", com.anythink.core.common.k.d.f(g6));
            jSONObject.put("timezone", com.anythink.core.common.k.d.c());
            jSONObject.put("sdk_ver", com.anythink.core.common.k.g.a());
            jSONObject.put("gp_ver", com.anythink.core.common.k.d.n(g6));
            jSONObject.put("ua", com.anythink.core.common.k.d.i());
            jSONObject.put("orient", com.anythink.core.common.k.d.g(g6));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(n.a().n())) {
                jSONObject.put("channel", n.a().n());
            }
            if (!TextUtils.isEmpty(n.a().o())) {
                jSONObject.put("sub_channel", n.a().o());
            }
            jSONObject.put("upid", p.a(g6).b() ? n.a().x() : "");
            jSONObject.put("ps_id", n.a().r());
            com.anythink.core.c.a b10 = com.anythink.core.c.b.a(g6).b(n.a().p());
            if (b10 != null) {
                jSONObject.put(I, TextUtils.isEmpty(b10.A()) ? "" : b10.A());
            }
            jSONObject.put(J, n.a().h());
            jSONObject.put(K, n.a().i());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(n.a().e());
            sb2.append(p.a(g6).a());
            jSONObject.put(H, sb2.toString());
            if (n.a().j() == 1) {
                jSONObject.put(M, 1);
            }
            if (n.a().H() && com.anythink.core.common.b.i.a().a(b10)) {
                String b11 = com.anythink.core.common.b.i.a().b();
                String c10 = com.anythink.core.common.b.i.a().c();
                String d10 = com.anythink.core.common.b.i.a().d();
                if (TextUtils.isEmpty(b11)) {
                    b11 = "";
                }
                jSONObject.put(ah, b11);
                if (TextUtils.isEmpty(c10)) {
                    c10 = "";
                }
                jSONObject.put(ai, c10);
                jSONObject.put(Q, TextUtils.isEmpty(d10) ? "" : d10);
                jSONObject.put("mdna_r", n.a().K());
            }
            if (n.a().C()) {
                str = n.a().D() ? "1" : "3";
            } else {
                str = n.a().D() ? "2" : "4";
            }
            jSONObject.put(ae, str);
            IExHandler b12 = n.a().b();
            if (b12 != null) {
                b12.fillRequestDeviceData(jSONObject, i10);
            }
            String j10 = com.anythink.core.common.k.d.j();
            if (!TextUtils.isEmpty(j10)) {
                jSONObject.put(af, Integer.parseInt(j10));
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void b(JSONObject jSONObject) {
        ATPrivacyConfig J2 = n.a().J();
        if (J2 != null) {
            String devGaid = J2.getDevGaid();
            String devImei = J2.getDevImei();
            String devOaid = J2.getDevOaid();
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(devGaid)) {
                jSONObject2.put("set_gaid", devGaid);
            }
            if (!TextUtils.isEmpty(devImei)) {
                jSONObject2.put("set_imei", devImei);
            }
            if (!TextUtils.isEmpty(devOaid)) {
                jSONObject2.put("set_oaid", devOaid);
            }
            jSONObject.put(G, jSONObject2);
        }
    }

    public static JSONObject b() {
        return a(n.a().m());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:1|(2:84|85)(1:3)|4|5|(3:76|77|(2:79|(27:81|8|(1:10)(1:75)|11|12|(1:14)(1:74)|15|(1:17)|18|(1:20)|21|(1:23)|24|25|(1:(1:28))(5:64|(1:66)(1:73)|(1:69)|(1:71)|72)|29|30|(1:(1:33))(3:60|(1:62)|63)|34|(7:36|(1:38)|39|(1:41)|42|(1:44)|45)|46|47|48|(1:50)|52|(1:54)|55)))|7|8|(0)(0)|11|12|(0)(0)|15|(0)|18|(0)|21|(0)|24|25|(0)(0)|29|30|(0)(0)|34|(0)|46|47|48|(0)|52|(0)|55) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041 A[Catch: all -> 0x016f, TryCatch #2 {all -> 0x016f, blocks: (B:85:0x001b, B:4:0x0021, B:10:0x0041, B:11:0x0047, B:14:0x005f, B:15:0x006d, B:17:0x007b, B:18:0x008d, B:20:0x009b, B:21:0x00a4, B:24:0x00ad, B:28:0x00c0, B:29:0x00e5, B:33:0x00ed, B:34:0x0100, B:36:0x010a, B:38:0x0121, B:39:0x0126, B:41:0x012c, B:42:0x0131, B:44:0x0137, B:45:0x013c, B:46:0x0141, B:60:0x00f1, B:62:0x00fb, B:63:0x00fe, B:64:0x00c4, B:71:0x00e0, B:72:0x00e3, B:74:0x0068), top: B:84:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: all -> 0x016f, TRY_ENTER, TryCatch #2 {all -> 0x016f, blocks: (B:85:0x001b, B:4:0x0021, B:10:0x0041, B:11:0x0047, B:14:0x005f, B:15:0x006d, B:17:0x007b, B:18:0x008d, B:20:0x009b, B:21:0x00a4, B:24:0x00ad, B:28:0x00c0, B:29:0x00e5, B:33:0x00ed, B:34:0x0100, B:36:0x010a, B:38:0x0121, B:39:0x0126, B:41:0x012c, B:42:0x0131, B:44:0x0137, B:45:0x013c, B:46:0x0141, B:60:0x00f1, B:62:0x00fb, B:63:0x00fe, B:64:0x00c4, B:71:0x00e0, B:72:0x00e3, B:74:0x0068), top: B:84:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b A[Catch: all -> 0x016f, TryCatch #2 {all -> 0x016f, blocks: (B:85:0x001b, B:4:0x0021, B:10:0x0041, B:11:0x0047, B:14:0x005f, B:15:0x006d, B:17:0x007b, B:18:0x008d, B:20:0x009b, B:21:0x00a4, B:24:0x00ad, B:28:0x00c0, B:29:0x00e5, B:33:0x00ed, B:34:0x0100, B:36:0x010a, B:38:0x0121, B:39:0x0126, B:41:0x012c, B:42:0x0131, B:44:0x0137, B:45:0x013c, B:46:0x0141, B:60:0x00f1, B:62:0x00fb, B:63:0x00fe, B:64:0x00c4, B:71:0x00e0, B:72:0x00e3, B:74:0x0068), top: B:84:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[Catch: all -> 0x016f, TryCatch #2 {all -> 0x016f, blocks: (B:85:0x001b, B:4:0x0021, B:10:0x0041, B:11:0x0047, B:14:0x005f, B:15:0x006d, B:17:0x007b, B:18:0x008d, B:20:0x009b, B:21:0x00a4, B:24:0x00ad, B:28:0x00c0, B:29:0x00e5, B:33:0x00ed, B:34:0x0100, B:36:0x010a, B:38:0x0121, B:39:0x0126, B:41:0x012c, B:42:0x0131, B:44:0x0137, B:45:0x013c, B:46:0x0141, B:60:0x00f1, B:62:0x00fb, B:63:0x00fe, B:64:0x00c4, B:71:0x00e0, B:72:0x00e3, B:74:0x0068), top: B:84:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a A[Catch: all -> 0x016f, TryCatch #2 {all -> 0x016f, blocks: (B:85:0x001b, B:4:0x0021, B:10:0x0041, B:11:0x0047, B:14:0x005f, B:15:0x006d, B:17:0x007b, B:18:0x008d, B:20:0x009b, B:21:0x00a4, B:24:0x00ad, B:28:0x00c0, B:29:0x00e5, B:33:0x00ed, B:34:0x0100, B:36:0x010a, B:38:0x0121, B:39:0x0126, B:41:0x012c, B:42:0x0131, B:44:0x0137, B:45:0x013c, B:46:0x0141, B:60:0x00f1, B:62:0x00fb, B:63:0x00fe, B:64:0x00c4, B:71:0x00e0, B:72:0x00e3, B:74:0x0068), top: B:84:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151 A[Catch: all -> 0x015e, TRY_LEAVE, TryCatch #1 {all -> 0x015e, blocks: (B:48:0x0149, B:50:0x0151), top: B:47:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1 A[Catch: all -> 0x016f, TryCatch #2 {all -> 0x016f, blocks: (B:85:0x001b, B:4:0x0021, B:10:0x0041, B:11:0x0047, B:14:0x005f, B:15:0x006d, B:17:0x007b, B:18:0x008d, B:20:0x009b, B:21:0x00a4, B:24:0x00ad, B:28:0x00c0, B:29:0x00e5, B:33:0x00ed, B:34:0x0100, B:36:0x010a, B:38:0x0121, B:39:0x0126, B:41:0x012c, B:42:0x0131, B:44:0x0137, B:45:0x013c, B:46:0x0141, B:60:0x00f1, B:62:0x00fb, B:63:0x00fe, B:64:0x00c4, B:71:0x00e0, B:72:0x00e3, B:74:0x0068), top: B:84:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4 A[Catch: all -> 0x016f, TryCatch #2 {all -> 0x016f, blocks: (B:85:0x001b, B:4:0x0021, B:10:0x0041, B:11:0x0047, B:14:0x005f, B:15:0x006d, B:17:0x007b, B:18:0x008d, B:20:0x009b, B:21:0x00a4, B:24:0x00ad, B:28:0x00c0, B:29:0x00e5, B:33:0x00ed, B:34:0x0100, B:36:0x010a, B:38:0x0121, B:39:0x0126, B:41:0x012c, B:42:0x0131, B:44:0x0137, B:45:0x013c, B:46:0x0141, B:60:0x00f1, B:62:0x00fb, B:63:0x00fe, B:64:0x00c4, B:71:0x00e0, B:72:0x00e3, B:74:0x0068), top: B:84:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068 A[Catch: all -> 0x016f, TryCatch #2 {all -> 0x016f, blocks: (B:85:0x001b, B:4:0x0021, B:10:0x0041, B:11:0x0047, B:14:0x005f, B:15:0x006d, B:17:0x007b, B:18:0x008d, B:20:0x009b, B:21:0x00a4, B:24:0x00ad, B:28:0x00c0, B:29:0x00e5, B:33:0x00ed, B:34:0x0100, B:36:0x010a, B:38:0x0121, B:39:0x0126, B:41:0x012c, B:42:0x0131, B:44:0x0137, B:45:0x013c, B:46:0x0141, B:60:0x00f1, B:62:0x00fb, B:63:0x00fe, B:64:0x00c4, B:71:0x00e0, B:72:0x00e3, B:74:0x0068), top: B:84:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0046  */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.anythink.core.api.IExHandler] */
    /* JADX WARN: Type inference failed for: r2v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.g.c.a():org.json.JSONObject");
    }

    private static void a(Context context, JSONObject jSONObject) {
        int i10 = an;
        if (i10 == -1) {
            boolean b10 = q.a().b(context);
            boolean a10 = q.a().a(context);
            int i11 = a10 ? 2 : b10 ? 1 : 0;
            if (b10 && a10) {
                i11 = 3;
            }
            if (i11 > 0) {
                jSONObject.put(F, i11);
            }
            an = i11;
        } else if (i10 > 0) {
            jSONObject.put(F, i10);
        }
        int i12 = ao;
        if (i12 != -1) {
            if (i12 == 1) {
                jSONObject.put(E, i12);
            }
        } else {
            boolean b11 = q.a().b();
            if (b11) {
                jSONObject.put(E, 1);
            }
            ao = b11 ? 1 : 0;
        }
    }

    public static void a(JSONObject jSONObject) {
        try {
            ak L2 = n.a().L();
            JSONObject jSONObject2 = new JSONObject();
            int i10 = 1;
            if (L2.b() != 1) {
                i10 = 0;
            }
            jSONObject2.put("has_sdk", i10);
            jSONObject2.put("sdk_ver", String.valueOf(L2.c()));
            jSONObject2.put("sdk_api_ver", String.valueOf(L2.d()));
            jSONObject2.put("open_app_id", com.anythink.core.common.k.d.l());
            jSONObject.put(aq, jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public static JSONObject a(String str) {
        return a(n.a().d(str));
    }

    public static JSONObject a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        try {
                            jSONObject.put(str, obj.toString());
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            return jSONObject;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
