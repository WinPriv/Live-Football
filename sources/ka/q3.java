package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Monitor;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q3 extends a3 {
    public q3() {
        super("startFatDownloadApp");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.content.Context, java.util.List, com.huawei.openalliance.ad.ppskit.beans.metadata.MediaFile, java.lang.String, com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo] */
    /* JADX WARN: Type inference failed for: r13v4 */
    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        ?? r13;
        JSONObject jSONObject = new JSONObject(str3);
        String optString = jSONObject.optString("content");
        if (n7.d()) {
            n7.c("StartFatDownloadCmd", " StartFatDownloadCmd content=%s", optString);
        }
        AppDownloadTask appDownloadTask = (AppDownloadTask) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, optString, AppDownloadTask.class, new Class[0]);
        String optString2 = jSONObject.optString("paramFromServer");
        String optString3 = jSONObject.optString("monitor");
        String optString4 = jSONObject.optString("contentRecord");
        String optString5 = jSONObject.optString("unique_id");
        ContentRecord contentRecord = (ContentRecord) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, optString4, ContentRecord.class, new Class[0]);
        if (n7.d()) {
            n7.c("StartFatDownloadCmd", " paramJsonObjString content=%s", com.huawei.openalliance.ad.ppskit.utils.y1.j(optString2));
            n7.c("StartFatDownloadCmd", " thirdMonitors content=%s", com.huawei.openalliance.ad.ppskit.utils.y1.j(optString3));
            n7.c("StartFatDownloadCmd", " adContent content=%s", com.huawei.openalliance.ad.ppskit.utils.y1.j(optString4));
        }
        contentRecord.t3(str);
        contentRecord.B(str2);
        contentRecord.H2(optString2);
        if (!TextUtils.isEmpty(optString3)) {
            r13 = 0;
            contentRecord.b2((List) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, optString3, List.class, Monitor.class));
        } else {
            r13 = 0;
        }
        MetaData X1 = contentRecord.X1();
        if (X1 != 0) {
            ApkInfo k02 = X1.k0();
            if (k02 != 0) {
                k02.M(r13);
                k02.X();
                k02.p0(r13);
                k02.r0(r13);
                k02.E();
            }
            X1.P(r13);
            X1.J(r13);
            X1.N(r13);
            X1.H(r13);
            X1.Q(r13);
            X1.e0(r13);
            X1.i0(r13);
            X1.j0(r13);
            X1.a0();
            X1.m4a();
            X1.I(r13);
            contentRecord.G1(com.huawei.openalliance.ad.ppskit.utils.y0.q(r13, X1));
        }
        contentRecord.E2(r13);
        contentRecord.M2(r13);
        contentRecord.D2(r13);
        contentRecord.r3(r13);
        contentRecord.w3(r13);
        contentRecord.i2(false);
        contentRecord.L2(r13);
        contentRecord.n0(r13);
        if (contentRecord.a1() == 3) {
            com.huawei.openalliance.ad.ppskit.handlers.f0.E(context).x(contentRecord);
        } else {
            new com.huawei.openalliance.ad.ppskit.handlers.e0(context).r(contentRecord);
        }
        if (n7.d()) {
            n7.c("StartFatDownloadCmd", " callerPkgName=%s", str);
            n7.c("StartFatDownloadCmd", " callerSdkVersion=%s", str2);
            n7.c("StartFatDownloadCmd", " contentId=%s", appDownloadTask.e0());
        }
        contentRecord.V1(appDownloadTask.w0());
        AppInfo j02 = contentRecord.j0();
        if (j02 == null) {
            n7.e("StartFatDownloadCmd", " appInfo is empty");
            y.d(aVar, this.f32203a, -4, "");
            return;
        }
        j02.v(appDownloadTask.j0());
        j02.c0(optString5);
        ra.g.j(context).getClass();
        ke keVar = new ke(context, zh.a(contentRecord.z0(), context), null);
        keVar.f31382b = contentRecord;
        String l10 = ra.g.j(context).l(j02);
        String m10 = ra.g.j(context).m(j02);
        AppDownloadTask appDownloadTask2 = new AppDownloadTask();
        appDownloadTask2.r(true);
        appDownloadTask2.D(l10);
        appDownloadTask2.r0(keVar);
        appDownloadTask2.p0(j02);
        appDownloadTask2.G(m10);
        appDownloadTask2.p(j02.getDownloadUrl());
        appDownloadTask2.u(j02.getSafeDownloadUrl());
        appDownloadTask2.A(j02.getSha256());
        appDownloadTask2.H(j02.isCheckSha256());
        appDownloadTask2.l(j02.getFileSize());
        appDownloadTask2.F(0);
        appDownloadTask2.q0(appDownloadTask.k0());
        appDownloadTask2.r(appDownloadTask.X());
        appDownloadTask2.F(appDownloadTask.T());
        appDownloadTask2.H0(appDownloadTask.m0());
        appDownloadTask2.L0(appDownloadTask.n0());
        appDownloadTask2.K0(appDownloadTask.j0());
        a3.g(context, str, str2, appDownloadTask2, contentRecord);
        appDownloadTask2.G0(appDownloadTask.l0());
        ra.g.j(context).getClass();
        e(aVar);
    }
}
