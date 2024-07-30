package com.huawei.hms.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class eg {
    private static final byte[] I = new byte[0];
    private static eg V;
    private final Map<String, Class<? extends ad>> B;
    private final Map<String, ad> Z = new HashMap();

    private eg() {
        HashMap hashMap = new HashMap();
        this.B = hashMap;
        hashMap.put(aj.V, ej.class);
        hashMap.put(aj.F, ee.class);
    }

    public ad Code(String str) {
        StringBuilder sb2;
        String sb3;
        if (!TextUtils.isEmpty(str)) {
            ad adVar = this.Z.get(str);
            if (adVar == null) {
                ex.Code("JsbNativeManger", "create command %s", str);
                Class<? extends ad> cls = this.B.get(str);
                if (cls == null) {
                    sb2 = new StringBuilder("no class found for cmd: ");
                } else {
                    try {
                        adVar = cls.newInstance();
                    } catch (InstantiationException unused) {
                        ex.I("JsbNativeManger", "get cmd %s Instantiation Exception", str);
                    } catch (Throwable th) {
                        ex.I("JsbNativeManger", "get cmd %s: %s", str, th.getClass().getSimpleName());
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
        ex.I("JsbNativeManger", sb3);
        return null;
    }

    public static eg Code() {
        eg egVar;
        synchronized (I) {
            if (V == null) {
                V = new eg();
            }
            egVar = V;
        }
        return egVar;
    }
}
