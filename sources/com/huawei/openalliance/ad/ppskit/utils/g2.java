package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.util.Map;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public final class g2 {
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #0 {all -> 0x0127, blocks: (B:16:0x003d, B:18:0x004c, B:20:0x005b, B:22:0x0062, B:24:0x006c, B:26:0x0074, B:28:0x008c, B:30:0x0096, B:31:0x009a, B:33:0x00a0, B:36:0x00a9, B:38:0x00af, B:46:0x00b9, B:42:0x00c8, B:55:0x011b, B:60:0x0123, B:61:0x00d1, B:63:0x00d9, B:65:0x00e3, B:66:0x00e7, B:68:0x00ed, B:72:0x00f8, B:79:0x0100, B:75:0x0108), top: B:15:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.util.List<com.huawei.openalliance.ad.ppskit.beans.metadata.WifiInfo>> a(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.g2.a(android.content.Context):android.util.Pair");
    }

    public static Integer b(WifiConfiguration wifiConfiguration) {
        int i10 = 1;
        if (!wifiConfiguration.allowedKeyManagement.get(1) && !wifiConfiguration.allowedKeyManagement.get(2) && !wifiConfiguration.allowedKeyManagement.get(3)) {
            if (wifiConfiguration.wepKeys[0] == null) {
                i10 = 0;
            }
            return Integer.valueOf(i10);
        }
        return 1;
    }

    public static boolean c(Context context, String str) {
        Integer num;
        int i10;
        long j10;
        if (!Cif.a(context).j()) {
            n7.e("WifiUtils", "base location switch off");
            return false;
        }
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        if (!d10.t(str)) {
            n7.e("WifiUtils", "collect devCntList switch off");
            return false;
        }
        if (com.huawei.openalliance.ad.ppskit.handlers.l.d(context).u(str) <= 0) {
            return false;
        }
        synchronized (d10.f22585a) {
            Map<String, String> K = d10.K(str, false);
            if (!a0.a.e0(K)) {
                num = y1.q(K.get("devCntListClctIntval"));
            } else {
                num = null;
            }
            if (num != null && num.intValue() > 0) {
                i10 = num.intValue();
            }
            i10 = 60;
        }
        long j11 = i10;
        long currentTimeMillis = System.currentTimeMillis();
        ConfigSpHandler b10 = ConfigSpHandler.b(context);
        synchronized (b10.f22478a) {
            j10 = b10.s().getLong("rtDevCntLastTime", 0L);
        }
        if (currentTimeMillis - j10 < 60000 * j11) {
            n7.f("WifiUtils", "The rptInterval less than %s min", Long.valueOf(j11));
            return false;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        synchronized (b10.f22478a) {
            SharedPreferences.Editor edit = b10.s().edit();
            edit.putLong("rtDevCntLastTime", currentTimeMillis2);
            edit.commit();
        }
        return true;
    }

    public static WifiInfo d(Context context) {
        WifiManager wifiManager;
        if (context != null && d0.m(context.getApplicationContext())) {
            try {
                if (p1.a(context, "android.permission.ACCESS_WIFI_STATE") && (wifiManager = (WifiManager) context.getSystemService("wifi")) != null) {
                    return wifiManager.getConnectionInfo();
                }
            } catch (Exception unused) {
                n7.g("WifiUtils", "get wifi info fail");
            }
        }
        return null;
    }
}
