package com.huawei.hms.ads;

import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.inter.data.AdContentData;

/* loaded from: classes2.dex */
public class ji {
    public static com.huawei.openalliance.ad.inter.data.i Code(AdContentData adContentData) {
        com.huawei.openalliance.ad.inter.data.i iVar = new com.huawei.openalliance.ad.inter.data.i(adContentData);
        iVar.l(adContentData);
        iVar.K = adContentData.c1();
        iVar.L = adContentData.T0();
        iVar.H = adContentData.R0();
        iVar.f22265s = adContentData.O0();
        iVar.f22266t = adContentData.L();
        iVar.J = adContentData.U();
        iVar.N = adContentData.D();
        iVar.O = adContentData.u();
        iVar.f22267u = adContentData.K();
        iVar.M = adContentData.a1();
        iVar.G = new com.huawei.openalliance.ad.inter.data.p(adContentData.Y0());
        MetaData K = adContentData.K();
        if (K != null) {
            gb.p.j(K.A());
            gb.p.j(K.k());
            iVar.y = K.v();
            iVar.f22271z = K.r();
            iVar.f22269w = gb.p.j(adContentData.K().D());
            iVar.A = K.L();
            iVar.E = K.a();
            iVar.f22268v = gb.p.j(K.q());
            ApkInfo F = K.F();
            if (F != null) {
                com.huawei.openalliance.ad.inter.data.AppInfo appInfo = new com.huawei.openalliance.ad.inter.data.AppInfo(F);
                appInfo.Code(iVar.k());
                appInfo.V(iVar.v());
                appInfo.s(K.u());
                iVar.K = appInfo;
            }
        }
        iVar.I(adContentData.U0());
        iVar.f22270x = adContentData.L0();
        return iVar;
    }
}
