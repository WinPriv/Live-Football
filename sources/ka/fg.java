package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Monitor;
import com.huawei.openalliance.ad.ppskit.beans.server.ThirdReportRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ThirdPartyEventRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ka.hg;
import ka.xe;

/* loaded from: classes2.dex */
public final class fg implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f31187s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31188t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31189u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ hg f31190v;

    public fg(hg hgVar, ArrayList arrayList, String str, ContentRecord contentRecord) {
        this.f31190v = hgVar;
        this.f31187s = arrayList;
        this.f31188t = str;
        this.f31189u = contentRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xe.a aVar;
        boolean z10;
        fg fgVar = this;
        String str = fgVar.f31188t;
        hg hgVar = fgVar.f31190v;
        hgVar.getClass();
        List<Monitor> list = fgVar.f31187s;
        if (list != null && !list.isEmpty()) {
            byte[] h10 = com.huawei.openalliance.ad.ppskit.utils.u1.h(hgVar.f31256a);
            for (Monitor monitor : list) {
                List<String> k10 = monitor.k();
                if (k10 != null && !k10.isEmpty()) {
                    int p10 = monitor.p();
                    Iterator<String> it = k10.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(next)) {
                            boolean z11 = false;
                            n7.f("ThirdMonitorReporter", "report third party event，excute origin url, eventType:%s, originUrl:%s", str, com.huawei.openalliance.ad.ppskit.utils.y1.j(next));
                            if (!androidx.transition.n.M(hgVar.f) && !TextUtils.isEmpty(next)) {
                                Iterator it2 = hgVar.f.iterator();
                                while (it2.hasNext()) {
                                    hg.a aVar2 = (hg.a) it2.next();
                                    if (aVar2 != null) {
                                        next = aVar2.a(next);
                                    }
                                }
                            }
                            ContentRecord contentRecord = fgVar.f31189u;
                            String h12 = contentRecord.h1();
                            long W0 = contentRecord.W0();
                            xe xeVar = hgVar.f31258c;
                            xeVar.getClass();
                            if (TextUtils.isEmpty(next)) {
                                n7.e("MonitorUrlFomatter", " url is empty");
                                aVar = null;
                            } else {
                                xe.a aVar3 = new xe.a();
                                aVar3.f32193a = next;
                                String a10 = xeVar.a(h12);
                                aVar3.f32194b = a10;
                                if (next.indexOf("__HWPPSREQUESTID__") > 0) {
                                    aVar3.f32193a = next.replace("__HWPPSREQUESTID__", a10);
                                }
                                if (next.indexOf("__TS__") > 0) {
                                    if (W0 != -111111 && W0 > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        aVar3.f32193a = next.replace("__TS__", com.huawei.openalliance.ad.ppskit.utils.y1.d(Long.valueOf(W0)));
                                    }
                                }
                                aVar = aVar3;
                            }
                            if (aVar != null) {
                                String str2 = aVar.f32193a;
                                if (TextUtils.isEmpty(str2)) {
                                    n7.g("ThirdMonitorReporter", "url is empty when format third party url ");
                                } else {
                                    n7.f("ThirdMonitorReporter", "report third party event, eventType:%s, url:%s", str, com.huawei.openalliance.ad.ppskit.utils.y1.j(str2));
                                    HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    ThirdReportRsp c10 = hgVar.f31259d.c(contentRecord.h1(), str2);
                                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                    if (c10 != null && c10.responseCode == 0) {
                                        z11 = true;
                                    }
                                    if (!z11) {
                                        if (p10 == 1) {
                                            if (n7.d()) {
                                                n7.b("ThirdMonitorReporter", "reportThird failed, add event");
                                            }
                                            ThirdPartyEventRecord thirdPartyEventRecord = new ThirdPartyEventRecord(hgVar.f31260e.a(), next, aVar.f32194b);
                                            thirdPartyEventRecord.L(contentRecord.h1());
                                            thirdPartyEventRecord.H(contentRecord.h());
                                            thirdPartyEventRecord.G(contentRecord.p2());
                                            thirdPartyEventRecord.a(contentRecord.z0());
                                            thirdPartyEventRecord.B(contentRecord.u1());
                                            thirdPartyEventRecord.o(h10);
                                            thirdPartyEventRecord.P(str);
                                            thirdPartyEventRecord.C(System.currentTimeMillis());
                                            thirdPartyEventRecord.F(contentRecord.W0());
                                            com.huawei.openalliance.ad.ppskit.handlers.s sVar = hgVar.f31257b;
                                            sVar.d(ThirdPartyEventRecord.class, thirdPartyEventRecord.l(sVar.f22513b));
                                            hg.b(hgVar.f31256a, str, str2, aVar.f32194b, currentTimeMillis2, contentRecord, c10);
                                        }
                                    } else {
                                        if (n7.d()) {
                                            n7.b("ThirdMonitorReporter", "reportThird success");
                                        }
                                        hg.c(hgVar.f31256a, str, str2, aVar.f32194b, contentRecord, currentTimeMillis2);
                                    }
                                }
                            }
                        }
                        fgVar = this;
                    }
                } else {
                    n7.g("ThirdMonitorReporter", "thirdParty monitor urls is empty ");
                }
                fgVar = this;
            }
            return;
        }
        n7.g("ThirdMonitorReporter", "fail to report to thirdParty event, thirdParty  is empty");
    }
}
