package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class k3 extends a3 {
    public k3() {
        super("resumeDownloadApp");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String str4;
        AppInfo appInfo;
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString("content");
        AppDownloadTask appDownloadTask = (AppDownloadTask) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, string, AppDownloadTask.class, new Class[0]);
        if (n7.d()) {
            n7.c("ResumeDownloadCmd", "content: %s", string);
            n7.c("ResumeDownloadCmd", "task.isInHmsTaskStack: %s", Boolean.valueOf(appDownloadTask.y0()));
        }
        if (!TextUtils.isEmpty(appDownloadTask.d0())) {
            str4 = appDownloadTask.d0();
        } else {
            str4 = str;
        }
        TextUtils.isEmpty(appDownloadTask.v0());
        ContentRecord f = a3.f(context, str4, appDownloadTask);
        y2 y2Var = new y2(str4);
        if (!a3.j(context, str) && !y2Var.d(context, f, appDownloadTask)) {
            n7.f("ResumeDownloadCmd", "ResumeDownloadCmd has no api Permission %s", str4);
            c(aVar);
            return;
        }
        if (f != null) {
            f.V1(appDownloadTask.w0());
            f.D(appDownloadTask.B0());
            appInfo = f.j0();
        } else {
            appInfo = null;
        }
        if (appInfo == null) {
            String optString = jSONObject.optString(com.huawei.openalliance.ad.constant.ba.D);
            if (n7.d()) {
                n7.c("ResumeDownloadCmd", "appInfo: %s", optString);
            }
            AppInfo appInfo2 = (AppInfo) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, optString, AppInfo.class, new Class[0]);
            if (appInfo2 != null && appInfo2.D(appDownloadTask.k0())) {
                appInfo = appInfo2;
            }
        }
        if (appInfo == null) {
            n7.e("ResumeDownloadCmd", " appInfo is empty");
            y.d(aVar, this.f32203a, -4, "");
        } else {
            appInfo.v(appDownloadTask.j0());
            ra.g.j(context).getClass();
            e(aVar);
        }
    }
}
