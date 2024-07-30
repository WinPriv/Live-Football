package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public class eq {
    private static final String Code = "InterstitialGlobalDataShare";
    private static final byte[] I = new byte[0];
    private static ep V;

    public static ep Code() {
        ep epVar;
        synchronized (I) {
            epVar = V;
        }
        return epVar;
    }

    public static void Code(ep epVar) {
        synchronized (I) {
            if (epVar == null) {
                ex.Code(Code, "set interstitial ad null");
                V = null;
            } else {
                V = epVar;
            }
        }
    }
}
