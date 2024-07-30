package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m3 extends a3 {

    /* loaded from: classes2.dex */
    public class a implements d7<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.huawei.android.hms.ppskit.a f31445a;

        public a(com.huawei.android.hms.ppskit.a aVar) {
            this.f31445a = aVar;
        }

        @Override // ka.d7
        public final void a(y6 y6Var) {
            n7.f("StartDownloadCmd", "start download on remote callback result: %s", Integer.valueOf(y6Var.f32210b));
            y.d(this.f31445a, m3.this.f32203a, y6Var.f32210b, "");
        }
    }

    public m3() {
        super("startDownloadApp");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String str4;
        AppInfo appInfo;
        ke keVar;
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString("content");
        String optString = jSONObject.optString("unique_id");
        AppDownloadTask appDownloadTask = (AppDownloadTask) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, string, AppDownloadTask.class, new Class[0]);
        if (n7.d()) {
            n7.c("StartDownloadCmd", "content 1: %s", string);
            n7.c("StartDownloadCmd", "callerPkgName: %s", str);
            n7.c("StartDownloadCmd", "task.callerPkgName: %s", appDownloadTask.d0());
            n7.c("StartDownloadCmd", "task.isInHmsTaskStack: %s", Boolean.valueOf(appDownloadTask.y0()));
        }
        if (appDownloadTask.y0()) {
            n7.e("StartDownloadCmd", "hms task");
        }
        String h10 = a3.h(context, str, appDownloadTask);
        if (!TextUtils.isEmpty(appDownloadTask.v0())) {
            str4 = appDownloadTask.v0();
        } else {
            str4 = str2;
        }
        n7.f("StartDownloadCmd", "callerSdkVersion=: %s, caller= %s, contentId= %s, data=%s", str4, h10, appDownloadTask.e0(), Boolean.valueOf(appDownloadTask.X()));
        ContentRecord f = a3.f(context, h10, appDownloadTask);
        y2 y2Var = new y2(h10);
        if (!a3.j(context, str) && !y2Var.d(context, f, appDownloadTask)) {
            n7.h("StartDownloadCmd", "StartDownloadCmd has no api Permission %s", h10);
            c(aVar);
            return;
        }
        if (f != null) {
            f.V1(appDownloadTask.w0());
            f.D(appDownloadTask.B0());
            appInfo = f.j0();
        } else {
            n7.e("StartDownloadCmd", "contentRecord is empty");
            appInfo = null;
        }
        if (appInfo == null) {
            n7.e("StartDownloadCmd", "appInfo is empty");
            y.d(aVar, this.f32203a, -4, "");
            return;
        }
        appInfo.v(appDownloadTask.j0());
        appInfo.c0(optString);
        if (!com.huawei.openalliance.ad.ppskit.utils.d0.m(context) && appInfo.D(appDownloadTask.k0())) {
            n7.e("StartDownloadCmd", "execute agd download in hms");
            a aVar2 = new a(aVar);
            try {
                JSONObject O = a0.a.O(string);
                a0.a.Q(context, f, optString, O);
                z6.m(context).k("startFatDownloadApp", O.toString(), aVar2, String.class);
                return;
            } catch (JSONException unused) {
                n7.g("ApReDnApi", "startDownload JSONException");
                n7.f("StartDownloadCmd", "start download on remote callback result: %s", -1);
                y.d(aVar2.f31445a, m3.this.f32203a, -1, "");
                return;
            }
        }
        ra.g.j(context).getClass();
        if (f != null) {
            ke keVar2 = new ke(context, zh.a(f.z0(), context), null);
            keVar2.f31382b = f;
            keVar = keVar2;
        } else {
            keVar = null;
        }
        String l10 = ra.g.j(context).l(appInfo);
        String m10 = ra.g.j(context).m(appInfo);
        AppDownloadTask appDownloadTask2 = new AppDownloadTask();
        appDownloadTask2.r(true);
        appDownloadTask2.D(l10);
        appDownloadTask2.r0(keVar);
        appDownloadTask2.p0(appInfo);
        appDownloadTask2.G(m10);
        appDownloadTask2.p(appInfo.getDownloadUrl());
        appDownloadTask2.u(appInfo.getSafeDownloadUrl());
        appDownloadTask2.A(appInfo.getSha256());
        appDownloadTask2.H(appInfo.isCheckSha256());
        appDownloadTask2.l(appInfo.getFileSize());
        appDownloadTask2.F(0);
        appDownloadTask2.q0(appDownloadTask.k0());
        appDownloadTask2.r(appDownloadTask.X());
        appDownloadTask2.F(appDownloadTask.T());
        appDownloadTask2.H0(appDownloadTask.m0());
        appDownloadTask2.L0(appDownloadTask.n0());
        appDownloadTask2.K0(appDownloadTask.j0());
        appDownloadTask2.q0(appDownloadTask.k0());
        if (a3.i(context, str)) {
            appDownloadTask2.J0(appDownloadTask.y0());
        }
        a3.g(context, h10, str4, appDownloadTask2, f);
        appDownloadTask2.G0(appDownloadTask.l0());
        ra.g.j(context).getClass();
        e(aVar);
    }
}
