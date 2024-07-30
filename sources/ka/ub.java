package ka;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AppCollectInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.InnerPackageInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class ub {

    /* renamed from: d, reason: collision with root package name */
    public static ub f31943d;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f31944e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f31945a;

    /* renamed from: b, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.l f31946b;

    /* renamed from: c, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.a0 f31947c;

    public ub(Context context) {
        com.huawei.openalliance.ad.ppskit.handlers.a0 a0Var;
        this.f31945a = context.getApplicationContext();
        this.f31946b = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        synchronized (com.huawei.openalliance.ad.ppskit.handlers.a0.f22496g) {
            if (com.huawei.openalliance.ad.ppskit.handlers.a0.f == null) {
                com.huawei.openalliance.ad.ppskit.handlers.a0.f = new com.huawei.openalliance.ad.ppskit.handlers.a0(context);
            }
            a0Var = com.huawei.openalliance.ad.ppskit.handlers.a0.f;
        }
        this.f31947c = a0Var;
    }

    public static void d(ArrayList arrayList, HashSet hashSet, ArrayList arrayList2, List list, boolean z10) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            InnerPackageInfo innerPackageInfo = (InnerPackageInfo) it.next();
            String a10 = innerPackageInfo.a();
            if (z10 || (!androidx.transition.n.M(list) && !list.contains(a10))) {
                AppCollectInfo appCollectInfo = new AppCollectInfo();
                appCollectInfo.a(a10);
                appCollectInfo.c(av.ag);
                appCollectInfo.d();
                String b10 = innerPackageInfo.b();
                if (com.huawei.openalliance.ad.ppskit.utils.y1.h(b10)) {
                    b10 = "";
                }
                appCollectInfo.b(b10);
                arrayList.add(appCollectInfo);
            }
            arrayList2.add(a10);
        }
    }

    public final String a(boolean z10) {
        String string;
        com.huawei.openalliance.ad.ppskit.handlers.a0 a0Var = this.f31947c;
        synchronized (a0Var.f22500d) {
            string = a0Var.f22498b.getString("app_install_list_uuid", null);
        }
        if (z10 || TextUtils.isEmpty(string)) {
            n7.b("AppDataCollectionManager", "update UUID ");
            HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
            string = UUID.randomUUID().toString();
            com.huawei.openalliance.ad.ppskit.handlers.a0 a0Var2 = this.f31947c;
            synchronized (a0Var2.f22500d) {
                if (!TextUtils.isEmpty(string)) {
                    a0Var2.f22498b.edit().putString("app_install_list_uuid", string).commit();
                }
            }
        }
        return string;
    }

    public final List<String> b() {
        String c10;
        com.huawei.openalliance.ad.ppskit.handlers.a0 a0Var = this.f31947c;
        synchronized (a0Var.f22501e) {
            String string = a0Var.f22499c.getString("app_install_list", null);
            if (TextUtils.isEmpty(string)) {
                c10 = null;
            } else {
                c10 = com.huawei.openalliance.ad.ppskit.utils.m2.c(string, com.huawei.openalliance.ad.ppskit.utils.u1.h(a0Var.f22497a));
            }
        }
        if (TextUtils.isEmpty(c10)) {
            n7.e("AppDataCollectionManager", "local InstallList list is empty");
            return null;
        }
        try {
            return Arrays.asList(c10.split(","));
        } catch (Throwable unused) {
            n7.g("AppDataCollectionManager", "fromString Exception");
            return null;
        }
    }

    public final void c(ArrayList arrayList, ArrayList arrayList2, List list, boolean z10) {
        if (!androidx.transition.n.M(list) && !z10) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (androidx.transition.n.M(arrayList2) || !arrayList2.contains(str)) {
                    AppCollectInfo appCollectInfo = new AppCollectInfo();
                    appCollectInfo.a(str);
                    appCollectInfo.c("unInstall");
                    appCollectInfo.d();
                    String str2 = null;
                    try {
                        PackageInfo f = com.huawei.openalliance.ad.ppskit.utils.o2.f(this.f31945a, str);
                        if (f != null) {
                            str2 = f.versionName;
                        }
                    } catch (AndroidRuntimeException | Exception unused) {
                        n7.g("ApkUtil", "getVersionName fail");
                    }
                    if (com.huawei.openalliance.ad.ppskit.utils.y1.h(str2)) {
                        str2 = "";
                    }
                    appCollectInfo.b(str2);
                    arrayList.add(appCollectInfo);
                }
            }
        }
    }

    public final boolean e(long j10, String str, List list) {
        Integer num;
        int i10;
        long j11;
        com.huawei.openalliance.ad.ppskit.handlers.l lVar = this.f31946b;
        synchronized (lVar.f22585a) {
            Map<String, String> K = lVar.K(str, false);
            if (!a0.a.e0(K)) {
                num = com.huawei.openalliance.ad.ppskit.utils.y1.q(K.get("clctSdkAllApplistIntval"));
            } else {
                num = null;
            }
            if (num != null && num.intValue() > 0) {
                i10 = num.intValue();
            }
            i10 = 30;
        }
        long j12 = i10;
        com.huawei.openalliance.ad.ppskit.handlers.a0 a0Var = this.f31947c;
        synchronized (a0Var.f22500d) {
            j11 = a0Var.f22498b.getLong("all_app_install_list_time", 0L);
        }
        if (j10 - j11 <= j12 * 86400000 && !androidx.transition.n.M(list)) {
            return false;
        }
        n7.b("AppDataCollectionManager", "report All App Install List ");
        return true;
    }

    public final boolean f(String str, long j10) {
        long j11;
        boolean z10;
        if (!com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f31945a).q(str)) {
            n7.e("AppDataCollectionManager", "clctInstAppList is off");
            return true;
        }
        com.huawei.openalliance.ad.ppskit.handlers.a0 a0Var = this.f31947c;
        synchronized (a0Var.f22500d) {
            j11 = a0Var.f22498b.getLong("app_install_list_last_time", 0L);
        }
        long p10 = this.f31946b.p(str);
        if (j11 != 0 && j10 - j11 < 60000 * p10) {
            n7.f("AppDataCollectionManager", "The reporting appinstall list interval is less than %s min", Long.valueOf(p10));
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return true;
        }
        return false;
    }
}
