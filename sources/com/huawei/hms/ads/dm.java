package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.c;
import com.huawei.openalliance.ad.inter.data.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class dm implements dn {
    private static long V;

    private Map<String, String> Code(AdContentData adContentData) {
        HashMap hashMap = new HashMap();
        if (adContentData != null && adContentData.K() != null) {
            MetaData K = adContentData.K();
            String a10 = K.a();
            String L = K.L();
            if (a10 != null && L != null) {
                hashMap.put("appId", a10);
                hashMap.put("thirdId", L);
            }
        }
        return hashMap;
    }

    private void Code(final Context context, final d dVar) {
        long currentTimeMillis = System.currentTimeMillis();
        ex.V("DownloadChecker", "trigger action list lastTime:%s curTime:%s", Long.valueOf(V), Long.valueOf(currentTimeMillis));
        if (currentTimeMillis - V < 500) {
            ex.V("DownloadChecker", "trigger action list too frequently");
        } else {
            V = currentTimeMillis;
            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.dm.1
                @Override // java.lang.Runnable
                public void run() {
                    dm.this.Code(dVar, context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(d dVar, Context context) {
        if (dVar == null || context == null) {
            return;
        }
        if (dVar instanceof com.huawei.openalliance.ad.inter.data.j) {
            ex.V("DownloadChecker", "native trigger action list result:%s", Boolean.valueOf(((com.huawei.openalliance.ad.inter.data.j) dVar).o(context, null)));
        } else if (!(dVar instanceof c)) {
            ex.V("DownloadChecker", "not baseAd no need trigger action list");
        } else {
            AdContentData m10 = dVar.m();
            ex.V("DownloadChecker", "trigger action list result:%s", Boolean.valueOf(androidx.activity.n.k(context, m10, Code(m10)).a()));
        }
    }

    @Override // com.huawei.hms.ads.dn
    public boolean Code(Context context, d dVar, boolean z10) {
        if (context == null || dVar == null) {
            return false;
        }
        if (dVar instanceof com.huawei.openalliance.ad.inter.data.o) {
            return true;
        }
        int z11 = dVar.z();
        ex.Code("DownloadChecker", "api control flag:%s", Integer.valueOf(z11));
        if (z11 == 0) {
            return true;
        }
        if (z11 != 1) {
            if (z11 != 2) {
                ex.I("DownloadChecker", "invalid apiDownloadFlag value!");
            }
            return false;
        }
        if (z10) {
            Code(context, dVar);
        }
        return false;
    }
}
