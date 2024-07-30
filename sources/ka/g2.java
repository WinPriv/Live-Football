package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.client.ApiStatisticsReq;
import com.huawei.openalliance.ad.ppskit.beans.client.ApiStatisticsRsp;
import java.util.Date;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g2 extends y {
    public g2() {
        super(com.huawei.openalliance.ad.constant.s.f22109c);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        boolean h10 = com.huawei.openalliance.ad.ppskit.utils.y1.h(str3);
        String str4 = this.f32203a;
        if (h10) {
            n7.i("CmdReportApiStatistics", "apiStatistics req is empty, please check it!");
            y.d(aVar, str4, -1, "");
            return;
        }
        ApiStatisticsReq apiStatisticsReq = (ApiStatisticsReq) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, str3, ApiStatisticsReq.class, new Class[0]);
        if (apiStatisticsReq == null) {
            y.d(aVar, str4, -1, "");
            return;
        }
        String j10 = com.huawei.openalliance.ad.ppskit.utils.o2.j(context, str);
        String m10 = apiStatisticsReq.m();
        if (!TextUtils.isEmpty(str) && oa.j.b(str, j10) && !TextUtils.isEmpty(m10)) {
            try {
                String optString = new JSONObject(m10).optString("fast_app_package");
                if (!TextUtils.isEmpty(optString)) {
                    str = optString;
                }
            } catch (Throwable unused) {
                n7.g("CmdReportApiStatistics", "get pkgName failed, params is not valid json");
            }
            n7.c("CmdReportApiStatistics", "fast app set app package name: %s", str);
        } else {
            n7.c("CmdReportApiStatistics", "app set app package name: %s", str);
        }
        p pVar = new p(context);
        Context context2 = pVar.f31722a;
        try {
            o c10 = pVar.c(str, true);
            if (c10 != null) {
                c10.f31525a = "65";
                c10.f31528b = com.huawei.openalliance.ad.ppskit.utils.d0.e("yyyy-MM-dd HH:mm:ss.SSSZ").format(new Date(apiStatisticsReq.i()));
                c10.f31565s = com.huawei.openalliance.ad.ppskit.utils.y1.n(apiStatisticsReq.m());
                c10.H = str2;
                c10.I = apiStatisticsReq.a();
                c10.J = apiStatisticsReq.d();
                c10.K = apiStatisticsReq.f();
                c10.L = apiStatisticsReq.g();
                c10.f31567t = apiStatisticsReq.q();
                c10.D = apiStatisticsReq.s();
                c10.f31561q = apiStatisticsReq.t();
                int r10 = apiStatisticsReq.r();
                c10.b(r10);
                c10.f31577z = apiStatisticsReq.k();
                p.s(c10, apiStatisticsReq.u());
                r.b(context2, c10);
                r.d(context2, c10);
                c10.P = com.huawei.openalliance.ad.ppskit.utils.m.q(context2);
                c10.N = com.huawei.openalliance.ad.ppskit.handlers.u.a(context2).b();
                boolean equals = "requestConsentUpdate".equals(apiStatisticsReq.d());
                if (n7.d()) {
                    n7.c("AnalysisReport", "onApiStatisticsReport apiName: %s requestId: %s  adType: %s resultCode: %s e2e: %s", c10.J, c10.f31567t, c10.f31569u, Integer.valueOf(c10.L), c10.f());
                    n7.c("AnalysisReport", "rec engine cost time: %s", Long.valueOf(c10.f31551k0));
                }
                new ke(context2, zh.a(r10, context2), null).t(str, c10, equals, false);
            }
        } catch (Throwable th) {
            e0.i.p(th, "onApiStatisticsReport:", "AnalysisReport");
        }
        ApiStatisticsRsp apiStatisticsRsp = new ApiStatisticsRsp();
        apiStatisticsRsp.a();
        y.d(aVar, str4, 200, com.huawei.openalliance.ad.ppskit.utils.y0.q(null, apiStatisticsRsp));
    }
}
