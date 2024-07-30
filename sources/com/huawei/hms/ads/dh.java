package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public abstract class dh {
    private static final byte[] I = new byte[0];
    private static com.huawei.openalliance.ad.inter.data.j V;

    public static com.huawei.openalliance.ad.inter.data.j Code() {
        com.huawei.openalliance.ad.inter.data.j jVar;
        synchronized (I) {
            jVar = V;
        }
        return jVar;
    }

    public static void Code(com.huawei.openalliance.ad.inter.data.j jVar) {
        synchronized (I) {
            if (jVar == null) {
                ex.Code("GlobalDataShare", "set native ad null");
                V = null;
            } else {
                V = jVar;
            }
        }
    }
}
