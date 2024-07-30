package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public abstract class dg {
    private static final byte[] I = new byte[0];
    private static com.huawei.openalliance.ad.inter.data.g V;

    public static com.huawei.openalliance.ad.inter.data.g Code() {
        com.huawei.openalliance.ad.inter.data.g gVar;
        synchronized (I) {
            gVar = V;
        }
        return gVar;
    }

    public static void Code(com.huawei.openalliance.ad.inter.data.g gVar) {
        synchronized (I) {
            if (gVar == null) {
                ex.Code("GlobalDataShare", "set reward ad null");
                V = null;
            } else {
                V = gVar;
            }
        }
    }
}
