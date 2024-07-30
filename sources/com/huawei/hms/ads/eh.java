package com.huawei.hms.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class eh {
    private static final byte[] I = new byte[0];
    private static eh V;
    private final Map<String, Class<? extends ad>> B;
    private final Map<String, ad> Z = new HashMap();

    private eh() {
        HashMap hashMap = new HashMap();
        this.B = hashMap;
        hashMap.put(aj.B, ek.class);
    }

    public ad Code(String str) {
        StringBuilder sb2;
        String sb3;
        if (!TextUtils.isEmpty(str)) {
            ad adVar = this.Z.get(str);
            if (adVar == null) {
                ex.Code("JsbPlacementManger", "create command " + str);
                Class<? extends ad> cls = this.B.get(str);
                if (cls == null) {
                    sb2 = new StringBuilder("no class found for cmd: ");
                } else {
                    try {
                        adVar = cls.newInstance();
                    } catch (InstantiationException unused) {
                        ex.I("JsbPlacementManger", "get cmd %s Instantiation Exception", str);
                    } catch (Throwable th) {
                        ex.I("JsbPlacementManger", "get cmd %s: %s", str, th.getClass().getSimpleName());
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
        ex.I("JsbPlacementManger", sb3);
        return null;
    }

    public static eh Code() {
        eh ehVar;
        synchronized (I) {
            if (V == null) {
                V = new eh();
            }
            ehVar = V;
        }
        return ehVar;
    }
}
