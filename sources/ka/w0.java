package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w0 extends y {
    public w0() {
        super("preloadWebView");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String str4;
        Integer num;
        int i10;
        String str5;
        String str6;
        String str7;
        boolean disjoint;
        int i11 = 0;
        Integer num2 = null;
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        String J0 = adEventReport.J0();
        String x10 = adEventReport.x();
        if (TextUtils.isEmpty(J0)) {
            str4 = str;
        } else {
            str4 = J0;
        }
        ContentRecord m10 = j7.r.m(context, str4, x10, adEventReport.n(), adEventReport.o(), adEventReport.m());
        hf hfVar = new hf(context);
        hfVar.f31254b = m10;
        if (m10 == null) {
            str5 = "PreloadWebViewProcessor";
            str6 = "contentRecord is null";
        } else {
            String p32 = m10.p3();
            int V0 = hfVar.f31254b.V0();
            String h12 = hfVar.f31254b.h1();
            com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(hfVar.f31253a);
            synchronized (d10.f22585a) {
                Map<String, String> K = d10.K(h12, false);
                if (!a0.a.e0(K)) {
                    num = com.huawei.openalliance.ad.ppskit.utils.y1.q(K.get("webViewPreloadMaxNum"));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() > 0) {
                    i10 = num.intValue();
                }
                i10 = 20;
            }
            if (V0 == 0) {
                n7.f("PreloadWebViewProcessor", "not preload url. enablePreload: %s", Integer.valueOf(V0));
            } else {
                List<Integer> X = hfVar.f31254b.X();
                if (!androidx.transition.n.M(X)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Integer> it = X.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(it.next()));
                    }
                    com.huawei.openalliance.ad.ppskit.handlers.l d11 = com.huawei.openalliance.ad.ppskit.handlers.l.d(hfVar.f31253a);
                    synchronized (d11.f22585a) {
                        Map<String, String> K2 = d11.K(h12, false);
                        if (!a0.a.e0(K2)) {
                            str7 = com.huawei.openalliance.ad.ppskit.utils.y1.p(K2.get("webViewPreloadClickActionList"));
                        } else {
                            str7 = null;
                        }
                        if (com.huawei.openalliance.ad.ppskit.utils.y1.h(str7)) {
                            str7 = "1,4,14";
                        }
                    }
                    if (TextUtils.isEmpty(str7)) {
                        disjoint = true;
                    } else {
                        disjoint = Collections.disjoint(Arrays.asList(str7.split(",")), arrayList);
                    }
                    if (!disjoint) {
                        com.huawei.openalliance.ad.ppskit.handlers.l d12 = com.huawei.openalliance.ad.ppskit.handlers.l.d(hfVar.f31253a);
                        synchronized (d12.f22585a) {
                            Map<String, String> K3 = d12.K(h12, false);
                            if (!a0.a.e0(K3)) {
                                num2 = com.huawei.openalliance.ad.ppskit.utils.y1.q(K3.get("webViewPreloadNetwork"));
                            }
                            if (num2 != null && num2.intValue() > 0) {
                                i11 = num2.intValue();
                            }
                        }
                        if (i11 == 1 || (i11 == 0 && com.huawei.openalliance.ad.ppskit.utils.k1.c(hfVar.f31253a))) {
                            n7.e("PreloadWebViewProcessor", "preLoad");
                            com.huawei.openalliance.ad.ppskit.utils.d2.a(new gf(hfVar, p32, i10));
                        }
                    }
                }
                str5 = "PreloadWebViewProcessor";
                str6 = "not preload url. ClickActionList not support";
            }
            e(aVar);
        }
        n7.e(str5, str6);
        e(aVar);
    }
}
