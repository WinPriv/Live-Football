package z6;

import android.content.Context;
import android.graphics.Typeface;
import androidx.activity.n;
import com.huawei.openalliance.ad.constant.ah;
import com.huawei.openalliance.ad.constant.s;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import ka.n7;

/* compiled from: TextAppearanceFontCallback.java */
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f37329s;

    public /* synthetic */ f(int i10) {
        this.f37329s = i10;
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        return str.replaceAll("\\s", "");
    }

    public abstract void c(String str);

    public abstract boolean d(long j10);

    public final boolean e(Context context, AppInfo appInfo, ContentRecord contentRecord, Integer num) {
        String str;
        int i10;
        if (context != null && appInfo != null && contentRecord != null) {
            String packageName = appInfo.getPackageName();
            if (!g(context, appInfo, packageName)) {
                if (o2.c(context, packageName)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                n.K(context, contentRecord, ah.D, 1, Integer.valueOf(i10));
                if (h(context, packageName)) {
                    AdEventReport y = n.y(contentRecord);
                    y.J(num);
                    n.P(context, s.D, y);
                    n.O(context, appInfo, contentRecord);
                    return true;
                }
                str = "handleClick, openAppMainPage failed";
            } else {
                n.O(context, appInfo, contentRecord);
                n.K(context, contentRecord, "intentSuccess", 1, null);
                return true;
            }
        } else {
            str = "parameters occur error";
        }
        n7.e("AppLauncher", str);
        return false;
    }

    public abstract boolean g(Context context, AppInfo appInfo, String str);

    public abstract boolean h(Context context, String str);

    public abstract void i(String str);

    public abstract Object p();

    public abstract void q(int i10);

    public abstract void r(Typeface typeface, boolean z10);

    public final String toString() {
        switch (this.f37329s) {
            case 1:
                return p().toString();
            default:
                return super.toString();
        }
    }
}
