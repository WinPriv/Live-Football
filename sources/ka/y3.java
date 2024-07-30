package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class y3 extends r3 {
    public y3() {
        super(com.huawei.openalliance.ad.constant.s.C);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        boolean z10;
        n7.b("CmdReportCloseEvent", "CmdReportCloseEvent");
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        ke f = r3.f(context, str, str2, adEventReport);
        if (adEventReport.i0() != null && com.huawei.openalliance.ad.constant.ah.f22014a.equals(adEventReport.i0())) {
            int v02 = adEventReport.v0();
            int y0 = adEventReport.y0();
            EventRecord z11 = f.z(com.huawei.openalliance.ad.constant.ah.f22014a);
            if (!ke.v(z11, com.huawei.openalliance.ad.constant.ah.f22014a)) {
                z11.T0(v02);
                z11.W0(y0);
                String i10 = z11.i();
                Context context2 = f.f31386g;
                gi giVar = f.f31381a;
                androidx.transition.n.z(context2, giVar, i10).k(z11.i(), z11, false, f.f31382b);
                giVar.c(z11.K());
            }
        } else {
            int v03 = adEventReport.v0();
            int y02 = adEventReport.y0();
            List<String> E0 = adEventReport.E0();
            Boolean j10 = adEventReport.j();
            Context context3 = f.f31386g;
            if (j10 != null && j10.booleanValue()) {
                new yd(context3, f.f31382b).b(E0);
            } else {
                EventRecord z12 = f.z("userclose");
                if (!ke.v(z12, "userclose")) {
                    List<String> arrayList = new ArrayList<>();
                    List<String> arrayList2 = new ArrayList<>();
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList3 = new ArrayList();
                    ContentRecord contentRecord = f.f31382b;
                    if (contentRecord != null) {
                        arrayList = contentRecord.F();
                        if (!androidx.transition.n.M(arrayList)) {
                            n7.c("onAdClose", "fullDoseKeyWords: %s", arrayList.toString());
                        }
                        arrayList2 = f.f31382b.H();
                        if (!androidx.transition.n.M(arrayList2)) {
                            n7.c("onAdClose", "fullDoseKeyWordsType: %s", arrayList2.toString());
                        }
                    }
                    if (!androidx.transition.n.M(arrayList) && !androidx.transition.n.M(arrayList2)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10 && arrayList.size() == arrayList2.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            hashMap.put(arrayList.get(i11), arrayList2.get(i11));
                        }
                    }
                    if (!hashMap.isEmpty() && !androidx.transition.n.M(E0)) {
                        Iterator<String> it = E0.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(hashMap.get(it.next()));
                        }
                    }
                    if (!androidx.transition.n.M(E0)) {
                        n7.c("onAdClose", "selectedKeyWords: %s", E0.toString());
                    }
                    if (!androidx.transition.n.M(arrayList3)) {
                        n7.c("onAdClose", "selectedKeyWordsType: %s", arrayList3.toString());
                    }
                    z12.T0(v03);
                    z12.W0(y02);
                    z12.s0(E0);
                    z12.J0(arrayList3);
                    String i12 = z12.i();
                    gi giVar2 = f.f31381a;
                    androidx.transition.n.z(context3, giVar2, i12).k(z12.i(), z12, false, f.f31382b);
                    giVar2.c(z12.K());
                    new yd(context3, f.f31382b).b(E0);
                    f.f(z12);
                }
            }
        }
        e(aVar);
    }
}
