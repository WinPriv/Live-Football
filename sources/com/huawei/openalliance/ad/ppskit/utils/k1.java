package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huawei.hms.network.httpclient.HttpClient;
import java.io.File;
import ka.Cif;
import ka.n7;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class k1 {
    public static HttpClient.Builder a(Context context, boolean z10) {
        HttpClient.Builder builder = new HttpClient.Builder();
        if (!z10) {
            return builder;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("smallpkt_fec", true);
            jSONObject.put("tls_zero_rtt", true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(w1.a(m.A(context)));
            String str = File.separator;
            sb2.append(str);
            sb2.append("pps");
            sb2.append(str);
            sb2.append("quic");
            String sb3 = sb2.toString();
            x.v(new File(sb3));
            jSONObject.put("storage_path", sb3);
            jSONObject.put("max_server_configs_stored_properties", 10);
        } catch (JSONException unused) {
            n7.g("k1", "jsonObject catch a JSONException");
        }
        builder.enableQuic(true).options(jSONObject.toString());
        return builder;
    }

    public static boolean b() {
        try {
            g.d();
            return true;
        } catch (Throwable th) {
            e0.i.p(th, "isNetWorKkitSupported Exception:", "k1");
            return false;
        }
    }

    public static boolean c(Context context) {
        if (context == null || 2 != f(context) || Cif.a(context).b()) {
            return false;
        }
        return true;
    }

    public static boolean d() {
        if (!androidx.transition.n.U("com.huawei.hms.hquic.HQUICManager") && !androidx.transition.n.W("com.huawei.hms.hquic.HQUICManager")) {
            return false;
        }
        return true;
    }

    public static boolean e(Context context) {
        boolean z10;
        if (c(context)) {
            return true;
        }
        if (context != null && 1 == f(context)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public static int f(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || context.getApplicationContext() == null || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(connectivityManager.getActiveNetwork());
            if (17 == networkInfo.getType()) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo != null) {
                int type = networkInfo.getType();
                if (type == 0) {
                    switch (networkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            return 4;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            return 5;
                        case 13:
                        case 18:
                            return 6;
                        case 19:
                        default:
                            return 0;
                        case 20:
                            return 7;
                    }
                }
                if (9 == type) {
                    return 1;
                }
                if (1 == type) {
                    return 2;
                }
            }
        } catch (Throwable unused) {
            n7.g("k1", "fail to get network info");
        }
        return 0;
    }

    public static boolean g(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || context.getApplicationContext() == null || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(connectivityManager.getActiveNetwork());
            if (networkInfo == null) {
                return false;
            }
            if (!networkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            n7.g("k1", "fail to check network connection");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, android.util.Pair<java.lang.String, java.lang.String>> h(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.k1.h(android.content.Context):android.util.Pair");
    }
}
