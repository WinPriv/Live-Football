package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.beans.inner.ApiStatisticsReq;
import com.huawei.openalliance.ad.beans.metadata.AdTimeStatistics;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.c;
import com.huawei.openalliance.ad.inter.data.d;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class cz {
    private static <T> void I(Context context, String str, String str2, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        ha.e.g(context).d(str, str2, remoteCallResultCallback, cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int V(DelayInfo delayInfo) {
        Integer c02;
        int X = delayInfo.X();
        if (X == -2) {
            Integer g6 = gb.p.g(delayInfo.U());
            X = delayInfo.a0() + (g6 != null ? 10000 + g6.intValue() : 10000);
        } else if (X == 494 && (c02 = delayInfo.c0()) != null) {
            X = c02.intValue();
        }
        delayInfo.B(X);
        return X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ApiStatisticsReq V(long j10, String str, String str2, int i10, int i11, DelayInfo delayInfo) {
        ApiStatisticsReq apiStatisticsReq = new ApiStatisticsReq();
        apiStatisticsReq.e(j10);
        apiStatisticsReq.f(str);
        apiStatisticsReq.c(str2);
        apiStatisticsReq.b(i10);
        apiStatisticsReq.d(i11);
        apiStatisticsReq.a(delayInfo);
        return apiStatisticsReq;
    }

    public static void Code(Context context) {
        V(context, cy.F, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void V(Context context, String str, String str2, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        ha.i.e(context).d(str, str2, remoteCallResultCallback, cls);
    }

    public static <T extends d> void Code(final Context context, final int i10, final String str, final int i11, final Map<String, List<T>> map, final long j10, final long j11, final long j12) {
        if (j10 <= 0 || j10 > j11) {
            return;
        }
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.cz.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList;
                ArrayList arrayList2;
                DelayInfo delayInfo;
                if (!a0.a.r(map)) {
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    delayInfo = null;
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(entry.getKey());
                        List<d> list = (List) entry.getValue();
                        if (!androidx.transition.n.h(list)) {
                            for (d dVar : list) {
                                if (dVar != null) {
                                    if (dVar instanceof c) {
                                        c cVar = (c) dVar;
                                        if (cVar.k_() != null) {
                                            delayInfo = cVar.k_();
                                        }
                                    }
                                    arrayList2.add(dVar.L());
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                    arrayList2 = null;
                    delayInfo = null;
                }
                if (delayInfo == null) {
                    delayInfo = new DelayInfo();
                }
                DelayInfo delayInfo2 = delayInfo;
                delayInfo2.u(arrayList);
                delayInfo2.K(arrayList2);
                delayInfo2.b0().l(j10);
                delayInfo2.b0().q(j11);
                delayInfo2.b0().s(j12);
                cz.V(context, com.huawei.openalliance.ad.constant.s.f22109c, gb.b.p(cz.V(j11 - j10, com.huawei.openalliance.ad.constant.h.Code, str, i11, i10, delayInfo2)), null, null);
            }
        });
    }

    public static <T extends d> void Code(final Context context, final int i10, final String str, final int i11, final Map<String, List<T>> map, final long j10, final DelayInfo delayInfo) {
        if (ex.Code()) {
            Object[] objArr = new Object[2];
            objArr[0] = Long.valueOf(j10);
            objArr[1] = Boolean.valueOf(delayInfo != null);
            ex.Code("AnalysisReport", "reportE2ECostTime,  duration = %s delayInfo: %s", objArr);
        }
        if (context == null || delayInfo == null || j10 <= 0) {
            return;
        }
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.cz.4
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList;
                ArrayList arrayList2;
                DelayInfo k_;
                if (!a0.a.r(map)) {
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(entry.getKey());
                        List<d> list = (List) entry.getValue();
                        if (!androidx.transition.n.h(list)) {
                            for (d dVar : list) {
                                if (dVar != null) {
                                    arrayList2.add(dVar.L());
                                    if (dVar instanceof c) {
                                        c cVar = (c) dVar;
                                        if (cVar.k_() != null && (k_ = cVar.k_()) != null && k_.e0() > 0) {
                                            delayInfo.R(k_.e0());
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                    arrayList2 = null;
                }
                delayInfo.u(arrayList);
                delayInfo.K(arrayList2);
                cz.V(context, com.huawei.openalliance.ad.constant.s.f22109c, gb.b.p(cz.V(j10, com.huawei.openalliance.ad.constant.h.Code, str, i11, i10, delayInfo)), null, null);
            }
        });
    }

    public static void Code(Context context, int i10, String str, AdContentData adContentData) {
        AnalysisEventReport analysisEventReport = new AnalysisEventReport();
        analysisEventReport.e(adContentData);
        analysisEventReport.c(i10);
        analysisEventReport.j(str);
        analysisEventReport.b(adContentData.L());
        analysisEventReport.k(adContentData.e0());
        analysisEventReport.g(adContentData.D());
        analysisEventReport.h(adContentData.f0());
        V(context, com.huawei.openalliance.ad.constant.s.f22121q, gb.b.p(analysisEventReport), null, null);
    }

    public static void Code(Context context, int i10, String str, String str2, String str3) {
        AnalysisEventReport analysisEventReport = new AnalysisEventReport();
        analysisEventReport.l(i10);
        analysisEventReport.j(str);
        analysisEventReport.o(str2);
        analysisEventReport.a(str3);
        V(context, "reqAgPendingIntent".equals(str3) ? cy.I : cy.Z, gb.b.p(analysisEventReport), null, null);
    }

    public static void Code(Context context, AdContentData adContentData, long j10, long j11) {
        AnalysisEventReport analysisEventReport = new AnalysisEventReport();
        analysisEventReport.m(j10);
        analysisEventReport.i(j11);
        if (adContentData != null) {
            analysisEventReport.b(adContentData.L());
            analysisEventReport.k(adContentData.e0());
            analysisEventReport.g(adContentData.D());
            analysisEventReport.h(adContentData.f0());
        } else {
            analysisEventReport.b("");
        }
        V(context, cy.V, gb.b.p(analysisEventReport), null, null);
    }

    public static void Code(Context context, AdContentData adContentData, String str) {
        AnalysisEventReport analysisEventReport = new AnalysisEventReport();
        analysisEventReport.e(adContentData);
        analysisEventReport.j(str);
        if (adContentData != null) {
            analysisEventReport.b(adContentData.L());
            analysisEventReport.k(adContentData.e0());
            analysisEventReport.g(adContentData.D());
            analysisEventReport.h(adContentData.f0());
        }
        V(context, com.huawei.openalliance.ad.constant.s.f22126v, gb.b.p(analysisEventReport), null, null);
    }

    public static void Code(final Context context, final String str, final int i10, final AdContentData adContentData, final DelayInfo delayInfo) {
        if (delayInfo == null || delayInfo.p() == null) {
            return;
        }
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.cz.2
            @Override // java.lang.Runnable
            public void run() {
                AdContentData adContentData2 = AdContentData.this;
                if (adContentData2 != null) {
                    delayInfo.V(adContentData2.r0());
                    delayInfo.K(Collections.singletonList(AdContentData.this.L()));
                    delayInfo.v(AdContentData.this.x0());
                    delayInfo.t(Integer.valueOf(AdContentData.this.O0()));
                    DelayInfo u02 = AdContentData.this.u0();
                    if (u02 != null) {
                        delayInfo.l(u02.W());
                        delayInfo.q(u02.G());
                        delayInfo.C(u02.O());
                        delayInfo.b(u02.k());
                        delayInfo.H(u02.A());
                        delayInfo.x(u02.Y().longValue());
                        delayInfo.E(u02.d0());
                        AdTimeStatistics b02 = u02.b0();
                        if (b02 != null) {
                            AdTimeStatistics b03 = delayInfo.b0();
                            b02.l(b03.k());
                            b02.q(b03.p());
                            b02.s(b03.r());
                            b02.v(b03.u());
                            b02.w(b03.e());
                            delayInfo.s(b02);
                        }
                    }
                }
                cz.V(context, com.huawei.openalliance.ad.constant.s.f22109c, gb.b.p(cz.V(delayInfo.p().longValue(), com.huawei.openalliance.ad.constant.h.Code, str, i10, cz.V(delayInfo), delayInfo)), null, null);
            }
        });
    }

    public static void Code(Context context, String str, AdContentData adContentData, String str2) {
        AnalysisEventReport analysisEventReport = new AnalysisEventReport();
        analysisEventReport.b(str);
        analysisEventReport.j(str2);
        if (adContentData != null) {
            analysisEventReport.k(adContentData.e0());
            analysisEventReport.g(adContentData.D());
            analysisEventReport.h(adContentData.f0());
        }
        V(context, cy.C, gb.b.p(analysisEventReport), null, null);
    }

    public static void Code(final Context context, final String str, final String str2, final int i10, final int i11, final String str3) {
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.cz.1
            @Override // java.lang.Runnable
            public void run() {
                AnalysisEventReport analysisEventReport = new AnalysisEventReport();
                analysisEventReport.c(i11);
                analysisEventReport.l(i10);
                analysisEventReport.j(str);
                analysisEventReport.o(str2);
                analysisEventReport.a(str3);
                cz.V(context, cy.Code, gb.b.p(analysisEventReport), null, null);
            }
        });
    }

    public static void Code(final Context context, final String str, final String str2, final int i10, final String str3) {
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.cz.6
            @Override // java.lang.Runnable
            public void run() {
                AnalysisEventReport analysisEventReport = new AnalysisEventReport();
                analysisEventReport.j(str);
                analysisEventReport.o(str2);
                analysisEventReport.c(i10);
                analysisEventReport.a(str3);
                cz.V(context, cy.D, gb.b.p(analysisEventReport), null, null);
            }
        });
    }

    public static void Code(final Context context, final String str, final String str2, final long j10) {
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.cz.5
            @Override // java.lang.Runnable
            public void run() {
                AnalysisEventReport analysisEventReport = new AnalysisEventReport();
                analysisEventReport.j(str);
                analysisEventReport.o(str2);
                analysisEventReport.m(j10);
                analysisEventReport.c(0);
                cz.V(context, cy.D, gb.b.p(analysisEventReport), null, null);
            }
        });
    }

    public static void Code(Context context, String str, String str2, long j10, AdContentData adContentData, String str3) {
        AnalysisEventReport analysisEventReport = new AnalysisEventReport();
        analysisEventReport.e(adContentData);
        analysisEventReport.b(str2);
        analysisEventReport.j(str);
        analysisEventReport.i(j10);
        analysisEventReport.n(str3);
        if (adContentData != null) {
            analysisEventReport.k(adContentData.e0());
            analysisEventReport.g(adContentData.D());
            analysisEventReport.h(adContentData.f0());
        }
        I(context, cy.B, gb.b.p(analysisEventReport), null, null);
    }
}
