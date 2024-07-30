package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b3 extends a3 {
    public b3() {
        super("cancelDownloadApp");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String str4;
        AppInfo appInfo;
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString("content");
        n7.c("CancelDownloadCmd", " CancelDownloadCmd content=%s", string);
        AppDownloadTask appDownloadTask = (AppDownloadTask) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, string, AppDownloadTask.class, new Class[0]);
        if (!TextUtils.isEmpty(appDownloadTask.d0())) {
            str4 = appDownloadTask.d0();
        } else {
            str4 = str;
        }
        TextUtils.isEmpty(appDownloadTask.v0());
        ContentRecord f = a3.f(context, str4, appDownloadTask);
        w2 w2Var = new w2();
        if (!a3.j(context, str) && !w2Var.d(context, f, appDownloadTask)) {
            n7.f("CancelDownloadCmd", "CancelDownloadCmd has no api Permission %s", str4);
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
                n7.c("CancelDownloadCmd", "appInfo: %s", optString);
            }
            AppInfo appInfo2 = (AppInfo) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, optString, AppInfo.class, new Class[0]);
            if (appInfo2 != null && appInfo2.D(appDownloadTask.k0())) {
                appInfo = appInfo2;
            }
        }
        String str5 = this.f32203a;
        if (appInfo == null) {
            n7.e("CancelDownloadCmd", " appInfo is empty");
            y.d(aVar, str5, -4, "");
        } else {
            appInfo.v(appDownloadTask.j0());
            ra.g.j(context).getClass();
            y.d(aVar, str5, 200, String.valueOf(false));
        }
    }
}
