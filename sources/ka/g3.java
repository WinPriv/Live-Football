package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Monitor;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g3 extends a3 {

    /* loaded from: classes2.dex */
    public class a implements d7<String> {

        /* renamed from: a, reason: collision with root package name */
        public final com.huawei.android.hms.ppskit.a f31200a;

        public a(com.huawei.android.hms.ppskit.a aVar) {
            this.f31200a = aVar;
        }

        @Override // ka.d7
        public final void a(y6 y6Var) {
            n7.f("CmdReserveDownload", "start download on remote callback result: %s", Integer.valueOf(y6Var.f32210b));
            y.d(this.f31200a, g3.this.f32203a, y6Var.f32210b, "");
        }
    }

    public g3() {
        super("reserveDownloadApp");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        JSONObject jSONObject = new JSONObject(str3);
        String optString = jSONObject.optString("content");
        if (n7.d()) {
            n7.c("CmdReserveDownload", " CmdReserveDownload content=%s", optString);
            n7.c("CmdReserveDownload", " callerPkgName=%s", str);
            n7.c("CmdReserveDownload", " callerSdkVersion=%s", str2);
        }
        AppDownloadTask appDownloadTask = (AppDownloadTask) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, optString, AppDownloadTask.class, new Class[0]);
        String h10 = a3.h(context, str, appDownloadTask);
        n7.c("CmdReserveDownload", " contentId=%s", appDownloadTask.e0());
        ContentRecord f = a3.f(context, h10, appDownloadTask);
        if (f == null) {
            String optString2 = jSONObject.optString("paramFromServer");
            String optString3 = jSONObject.optString("monitor");
            String optString4 = jSONObject.optString("contentRecord");
            if (n7.d()) {
                n7.c("CmdReserveDownload", " paramJsonObjString content=%s", com.huawei.openalliance.ad.ppskit.utils.y1.j(optString2));
                n7.c("CmdReserveDownload", " thirdMonitors content=%s", com.huawei.openalliance.ad.ppskit.utils.y1.j(optString3));
                n7.c("CmdReserveDownload", " adContent content=%s", com.huawei.openalliance.ad.ppskit.utils.y1.j(optString4));
            }
            ContentRecord contentRecord = (ContentRecord) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, optString4, ContentRecord.class, new Class[0]);
            contentRecord.t3(h10);
            contentRecord.B(str2);
            contentRecord.H2(optString2);
            if (!TextUtils.isEmpty(optString3)) {
                contentRecord.b2((List) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, optString3, List.class, Monitor.class));
            }
            contentRecord.V1(appDownloadTask.w0());
            f = contentRecord;
        }
        String optString5 = jSONObject.optString("unique_id");
        AppInfo j02 = f.j0();
        j02.v(appDownloadTask.j0());
        j02.c0(optString5);
        ke keVar = new ke(context, zh.a(f.z0(), context), null);
        keVar.f31382b = f;
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
        a3.g(context, h10, str2, appDownloadTask2, f);
        appDownloadTask2.G0(appDownloadTask.l0());
        if (!com.huawei.openalliance.ad.ppskit.utils.d0.m(context)) {
            n7.e("CmdReserveDownload", "sdk call remote to reserve app");
            String uniqueId = j02.getUniqueId();
            a aVar2 = new a(aVar);
            try {
                JSONObject O = a0.a.O(optString);
                a0.a.Q(context, f, uniqueId, O);
                z6.m(context).k("reserveDownloadApp", O.toString(), aVar2, String.class);
                return;
            } catch (JSONException unused) {
                n7.g("ApReDnApi", "reserveDownloadApp JSONException");
                n7.f("CmdReserveDownload", "start download on remote callback result: %s", -1);
                y.d(aVar2.f31200a, g3.this.f32203a, -1, "");
                return;
            }
        }
        n7.e("CmdReserveDownload", " reserve app");
        throw null;
    }
}
