package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f19416a = {7, 4, 2, 1, 11};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f19417b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f19418c = {15, 13};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f19419d = {20};

    public static String a(String str, com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bg), str, pVar);
    }

    public static String b(String str, com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bh), str, pVar);
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            pVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.H, (com.applovin.impl.sdk.c.d<String>) string);
            pVar.L();
            if (y.a()) {
                pVar.L().c("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        if (jSONObject != null) {
            if (pVar != null) {
                try {
                    if (jSONObject.has("settings")) {
                        com.applovin.impl.sdk.c.c N = pVar.N();
                        if (!jSONObject.isNull("settings")) {
                            N.a(jSONObject.getJSONObject("settings"));
                            N.a();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException e10) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().b("ConnectionUtils", "Unable to parse settings out of API response", e10);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No response specified");
    }

    public static Map<String, String> e(com.applovin.impl.sdk.p pVar) {
        Map<String, String> map = CollectionUtils.map();
        String str = (String) pVar.a(com.applovin.impl.sdk.c.b.af);
        if (StringUtils.isValidString(str)) {
            map.put("device_token", str);
        } else if (!((Boolean) pVar.a(com.applovin.impl.sdk.c.b.f18726fa)).booleanValue()) {
            map.put("api_key", pVar.B());
        }
        if (pVar.S() != null) {
            map.putAll(Utils.stringifyObjectMap(pVar.S().e()));
        } else {
            map.putAll(Utils.stringifyObjectMap(pVar.R().i()));
        }
        return map;
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "variables", (JSONObject) null);
        if (jSONObject2 != null) {
            pVar.J().updateVariables(jSONObject2);
        }
    }

    public static int g(com.applovin.impl.sdk.p pVar) {
        NetworkInfo b10 = b(com.applovin.impl.sdk.p.y());
        if (b10 != null) {
            int type = b10.getType();
            int subtype = b10.getSubtype();
            if (type == 1) {
                return 2;
            }
            if (type == 0) {
                if (a(subtype, f19416a)) {
                    return 4;
                }
                if (a(subtype, f19417b)) {
                    return 5;
                }
                if (a(subtype, f19418c)) {
                    return 6;
                }
                if (a(subtype, f19419d)) {
                    return 7;
                }
                return 3;
            }
        }
        return 0;
    }

    public static String h(com.applovin.impl.sdk.p pVar) {
        String str;
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.du)).booleanValue()) {
            str = "5.0/ad";
        } else {
            str = "4.0/ad";
        }
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.be), str, pVar);
    }

    public static String i(com.applovin.impl.sdk.p pVar) {
        String str;
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.du)).booleanValue()) {
            str = "5.0/ad";
        } else {
            str = "4.0/ad";
        }
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bf), str, pVar);
    }

    public static String j(com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.be), "4.0/ad", pVar);
    }

    public static String k(com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bf), "4.0/ad", pVar);
    }

    public static String l(com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bk), "1.0/variable_config", pVar);
    }

    public static String m(com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bl), "1.0/variable_config", pVar);
    }

    public static void a(JSONObject jSONObject, boolean z10, com.applovin.impl.sdk.p pVar) {
        pVar.ab().a(jSONObject, z10);
    }

    public static JSONObject b(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    public static String f(com.applovin.impl.sdk.p pVar) {
        NetworkInfo b10 = b(com.applovin.impl.sdk.p.y());
        if (b10 == null) {
            return "unknown";
        }
        int type = b10.getType();
        int subtype = b10.getSubtype();
        return type == 1 ? "wifi" : type == 0 ? a(subtype, f19416a) ? "2g" : a(subtype, f19417b) ? "3g" : a(subtype, f19418c) ? "4g" : a(subtype, f19419d) ? "5g" : "mobile" : "unknown";
    }

    public static void a(int i10, com.applovin.impl.sdk.p pVar) {
        if (i10 == 401) {
            y.i("AppLovinSdk", "SDK key \"" + pVar.B() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i10 == 418) {
            pVar.N().a(com.applovin.impl.sdk.c.b.f18705ac, Boolean.TRUE);
            pVar.N().a();
        } else if (i10 >= 400 && i10 < 500) {
            if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.ae)).booleanValue()) {
                pVar.l();
            }
        } else if (i10 == -1 && ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.ae)).booleanValue()) {
            pVar.l();
        }
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.p.y()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    com.applovin.impl.sdk.c.e.a(next, object, (SharedPreferences) null, edit);
                }
            }
            edit.apply();
        }
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.p pVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (pVar != null) {
            return str.concat(str2);
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static String a(InputStream inputStream, com.applovin.impl.sdk.p pVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) pVar.a(com.applovin.impl.sdk.c.b.dm)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString("UTF-8");
            }
        }
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo b10 = b(context);
        if (b10 != null) {
            return b10.isConnected();
        }
        return false;
    }

    private static boolean a(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean a() {
        return a((String) null);
    }

    public static boolean a(String str) {
        if (!h.e()) {
            return true;
        }
        if (h.f() && !TextUtils.isEmpty(str)) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }
}
