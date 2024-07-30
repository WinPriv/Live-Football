package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;
import java.util.List;

/* loaded from: classes2.dex */
public class a3 extends y {
    public a3(String str) {
        super(str);
    }

    public static ContentRecord f(Context context, String str, AppDownloadTask appDownloadTask) {
        if (TextUtils.isEmpty(appDownloadTask.e0())) {
            n7.e("BaseDownloadCmd", " content id is empty");
            return null;
        }
        ContentRecord m10 = j7.r.m(context, str, appDownloadTask.e0(), appDownloadTask.D0(), appDownloadTask.s0(), appDownloadTask.E0());
        if (m10 != null) {
            m10.Y(appDownloadTask.z0());
            m10.b0(appDownloadTask.A0());
        }
        return m10;
    }

    public static void g(Context context, String str, String str2, AppDownloadTask appDownloadTask, ContentRecord contentRecord) {
        n7.e("BaseDownloadCmd", "caller package:" + appDownloadTask.d0());
        if (TextUtils.isEmpty(appDownloadTask.d0())) {
            appDownloadTask.P0(str);
        }
        if (TextUtils.isEmpty(appDownloadTask.v0())) {
            appDownloadTask.Q0(str2);
        }
        if (contentRecord != null && TextUtils.isEmpty(appDownloadTask.e0())) {
            appDownloadTask.R0(contentRecord.h());
        }
        if (contentRecord != null && TextUtils.isEmpty(appDownloadTask.s0())) {
            appDownloadTask.M0(contentRecord.p2());
        }
        if (contentRecord != null && TextUtils.isEmpty(appDownloadTask.t0())) {
            appDownloadTask.N0(contentRecord.v0());
        }
        if (contentRecord != null && TextUtils.isEmpty(appDownloadTask.u0()) && contentRecord.A() != null) {
            appDownloadTask.O0(contentRecord.A().a(context));
        }
        if (contentRecord != null) {
            appDownloadTask.S0(contentRecord.M0());
        }
        if (contentRecord != null) {
            appDownloadTask.T0(contentRecord.N0());
        }
        if (contentRecord != null && TextUtils.isEmpty(appDownloadTask.B0())) {
            appDownloadTask.U0(contentRecord.o1());
        }
        if (contentRecord != null && contentRecord.X1() != null && TextUtils.isEmpty(appDownloadTask.a())) {
            appDownloadTask.N(com.huawei.openalliance.ad.ppskit.utils.y1.p(contentRecord.X1().x()));
        }
        if (appDownloadTask.g0() == null) {
            if (contentRecord != null) {
                ke keVar = new ke(context, zh.a(contentRecord.z0(), context), null);
                keVar.f31382b = contentRecord;
                appDownloadTask.r0(keVar);
                return;
            }
            return;
        }
        ContentRecord contentRecord2 = ((ke) appDownloadTask.g0()).f31382b;
        if (contentRecord2 != null && contentRecord != null) {
            contentRecord2.V1(contentRecord.j2());
            contentRecord2.Y(contentRecord.M0());
            contentRecord2.b0(contentRecord.N0());
        }
    }

    public static String h(Context context, String str, AppDownloadTask appDownloadTask) {
        if (!TextUtils.isEmpty(appDownloadTask.d0())) {
            if (i(context, str)) {
                return appDownloadTask.d0();
            }
            n7.e("BaseDownloadCmd", "not in whitelist");
            return str;
        }
        return str;
    }

    public static boolean i(Context context, String str) {
        if (TextUtils.isEmpty(str) || !oa.j.c(str, com.huawei.openalliance.ad.ppskit.utils.o2.j(context, str), (List) oa.j.f33804b.get(str))) {
            return false;
        }
        return true;
    }

    public static boolean j(Context context, String str) {
        if (TextUtils.isEmpty(str) || !oa.j.b(str, com.huawei.openalliance.ad.ppskit.utils.o2.j(context, str))) {
            return false;
        }
        return true;
    }
}
