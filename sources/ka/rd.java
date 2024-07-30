package ka;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.server.AppInsListConfigReq;
import com.huawei.openalliance.ad.ppskit.beans.server.AppInsListConfigRsp;
import com.huawei.openalliance.ad.ppskit.net.http.Response;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class rd {

    /* renamed from: a, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.i0 f31758a;

    /* renamed from: b, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.h0 f31759b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f31760c;

    /* renamed from: d, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.g0 f31761d;

    public rd(Context context) {
        this.f31760c = context.getApplicationContext();
        this.f31758a = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
        this.f31761d = com.huawei.openalliance.ad.ppskit.handlers.g0.a(context);
        this.f31759b = com.huawei.openalliance.ad.ppskit.handlers.h0.a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r12, java.util.ArrayList r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.rd.a(java.lang.String, java.util.ArrayList, java.lang.String, boolean):boolean");
    }

    public final boolean b(ArrayList arrayList) {
        AppInsListConfigRsp appInsListConfigRsp;
        String str;
        Response d10;
        if (androidx.transition.n.M(arrayList)) {
            n7.g("AppDataCollectionProcessor", "insApps empty");
            return false;
        }
        n7.c("AppDataCollectionProcessor", "insApps size:%s, eventType:%s", Integer.valueOf(arrayList.size()), "insAppsList");
        com.huawei.openalliance.ad.ppskit.handlers.h0 h0Var = this.f31759b;
        h0Var.getClass();
        n7.e("KitNetHandler", "request install app list config");
        AppInsListConfigReq appInsListConfigReq = new AppInsListConfigReq(h0Var.f22549d, 3);
        if (arrayList.size() != 0) {
            String e10 = com.huawei.openalliance.ad.ppskit.utils.y1.e(arrayList);
            if (!TextUtils.isEmpty(e10)) {
                appInsListConfigReq.e(e10);
                try {
                    u9 c10 = h0Var.c(h0Var.f22549d.getPackageName());
                    com.huawei.openalliance.ad.ppskit.handlers.g0 a10 = com.huawei.openalliance.ad.ppskit.handlers.g0.a(h0Var.f22549d);
                    synchronized (a10.f22543b) {
                        a10.f22542a.getInt("support_sdk_server_gzip", 0);
                    }
                    h0Var.b(appInsListConfigReq);
                    d10 = c10.d();
                } catch (Throwable th) {
                    e0.i.p(th, "reportAppDataCollection:", "KitNetHandler");
                }
                if (d10 != null) {
                    appInsListConfigRsp = (AppInsListConfigRsp) d10.k();
                    if (appInsListConfigRsp == null && 200 == appInsListConfigRsp.b() && appInsListConfigRsp.k() != null && appInsListConfigRsp.p() != null) {
                        if (!androidx.transition.n.M(appInsListConfigRsp.k())) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<String> it = appInsListConfigRsp.k().iterator();
                            while (it.hasNext()) {
                                arrayList2.add(it.next());
                            }
                            this.f31761d.b(com.huawei.openalliance.ad.ppskit.utils.y1.e(arrayList2));
                            com.huawei.openalliance.ad.ppskit.utils.q1.m(this.f31760c).F(appInsListConfigRsp.r());
                        } else {
                            this.f31761d.b("");
                        }
                        String d11 = com.huawei.openalliance.ad.ppskit.utils.y1.d(appInsListConfigRsp.p());
                        if (TextUtils.isEmpty(d11)) {
                            com.huawei.openalliance.ad.ppskit.handlers.g0 g0Var = this.f31761d;
                            String d12 = com.huawei.openalliance.ad.ppskit.utils.y1.d(1);
                            synchronized (g0Var.f22543b) {
                                g0Var.f22542a.edit().putString("ENCODING_MODE", d12).commit();
                            }
                        } else {
                            com.huawei.openalliance.ad.ppskit.handlers.g0 g0Var2 = this.f31761d;
                            synchronized (g0Var2.f22543b) {
                                g0Var2.f22542a.edit().putString("ENCODING_MODE", d11).commit();
                            }
                        }
                        com.huawei.openalliance.ad.ppskit.handlers.g0 g0Var3 = this.f31761d;
                        String a11 = appInsListConfigRsp.a();
                        synchronized (g0Var3.f22543b) {
                            if (a11 != null) {
                                SharedPreferences.Editor edit = g0Var3.f22542a.edit();
                                if (3 != null) {
                                    str = "SHA256_" + ((Object) 3);
                                } else {
                                    str = "SHA256";
                                }
                                edit.putString(str, a11).commit();
                            }
                        }
                        com.huawei.openalliance.ad.ppskit.handlers.g0 g0Var4 = this.f31761d;
                        Integer q10 = appInsListConfigRsp.q();
                        synchronized (g0Var4.f22543b) {
                            if (q10 != null) {
                                g0Var4.f22542a.edit().putInt("support_sdk_server_gzip", q10.intValue()).commit();
                            }
                        }
                        return true;
                    }
                    if (appInsListConfigRsp == null && 206 == appInsListConfigRsp.b()) {
                        n7.b("AppDataCollectionProcessor", "report same insApps data collection");
                        return true;
                    }
                    n7.b("AppDataCollectionProcessor", "report insApps data collection failed");
                    return false;
                }
            }
        }
        appInsListConfigRsp = null;
        if (appInsListConfigRsp == null) {
        }
        if (appInsListConfigRsp == null) {
        }
        n7.b("AppDataCollectionProcessor", "report insApps data collection failed");
        return false;
    }
}
