package com.huawei.hms.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ef {
    private static final byte[] I = new byte[0];
    private static ef V;
    private final Map<String, Class<? extends ad>> B;
    private final Map<String, ad> Z = new HashMap();

    private ef() {
        HashMap hashMap = new HashMap();
        this.B = hashMap;
        hashMap.put(aj.Z, ei.class);
        hashMap.put(aj.f21545k, en.class);
    }

    public ad Code(String str) {
        StringBuilder sb2;
        String sb3;
        if (!TextUtils.isEmpty(str)) {
            ad adVar = this.Z.get(str);
            if (adVar == null) {
                ex.Code("JsbInterstitialManger", "create command %s", str);
                Class<? extends ad> cls = this.B.get(str);
                if (cls == null) {
                    sb2 = new StringBuilder("no class found for cmd: ");
                } else {
                    try {
                        adVar = cls.newInstance();
                    } catch (InstantiationException unused) {
                        ex.I("JsbInterstitialManger", "get cmd %s Instantiation Exception", str);
                    } catch (Throwable th) {
                        ex.I("JsbInterstitialManger", "get cmd %s: %s", str, th.getClass().getSimpleName());
                    }
                    if (adVar == null) {
                        sb2 = new StringBuilder("no instance created for cmd: ");
                    } else {
                        this.Z.put(str, adVar);
                    }
                }
                sb2.append(str);
                sb3 = sb2.toString();
            }
            return adVar;
        }
        sb3 = "get cmd, method is empty";
        ex.I("JsbInterstitialManger", sb3);
        return null;
    }

    public static ef Code() {
        ef efVar;
        synchronized (I) {
            if (V == null) {
                V = new ef();
            }
            efVar = V;
        }
        return efVar;
    }
}
