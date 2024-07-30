package com.huawei.openalliance.ad.ppskit.utils;

import com.huawei.openalliance.ad.ppskit.beans.metadata.BluetoothInfo;
import java.util.Collections;
import java.util.List;
import ka.n7;
import ka.u;

/* loaded from: classes2.dex */
public final class t2 {

    /* loaded from: classes2.dex */
    public interface a {
    }

    public static void a(a aVar, List<BluetoothInfo> list, int i10) {
        if (aVar != null) {
            try {
                Collections.sort(list);
            } catch (Throwable th) {
                n7.h("BluetoothUtils", "sort bluetoothInfos exception: %s", th.getClass().getSimpleName());
            }
            u.a aVar2 = (u.a) aVar;
            if (list != null) {
                int size = list.size();
                int i11 = aVar2.f31919a;
                if (size > i11) {
                    list = list.subList(0, i11);
                }
            }
            boolean M = androidx.transition.n.M(list);
            ka.o oVar = aVar2.f31920b;
            if (!M) {
                oVar.E0 = y0.q(null, list);
            }
            oVar.K0 = Integer.valueOf(i10);
            if (n7.d()) {
                n7.c("AnalysisReport", "wifi retCode: %s,  bt retCode: %s", oVar.J0, oVar.K0);
            }
            aVar2.f31921c.p(aVar2.f31922d, oVar, aVar2.f31923e, false);
        }
    }

    public static void b(a aVar, List<BluetoothInfo> list) {
        int i10;
        if (androidx.transition.n.M(list)) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        a(aVar, list, i10);
    }
}
