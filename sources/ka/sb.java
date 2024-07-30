package ka;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class sb implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31825s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ub f31826t;

    public sb(ub ubVar, String str) {
        this.f31826t = ubVar;
        this.f31825s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ub ubVar = this.f31826t;
        String str = this.f31825s;
        synchronized (ubVar) {
            n7.e("AppDataCollectionManager", "report App Install List");
            long currentTimeMillis = System.currentTimeMillis();
            if (!ubVar.f(str, currentTimeMillis)) {
                com.huawei.openalliance.ad.ppskit.handlers.a0 a0Var = ubVar.f31947c;
                long currentTimeMillis2 = System.currentTimeMillis();
                synchronized (a0Var.f22500d) {
                    SharedPreferences.Editor edit = a0Var.f22498b.edit();
                    edit.putLong("app_install_list_last_time", currentTimeMillis2);
                    edit.commit();
                }
                ArrayList arrayList = new ArrayList();
                try {
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    List<String> b10 = ubVar.b();
                    boolean e10 = ubVar.e(currentTimeMillis, str, b10);
                    ub.d(arrayList, hashSet, arrayList2, b10, e10);
                    String a10 = ubVar.a(e10);
                    ubVar.c(arrayList, arrayList2, b10, e10);
                    n7.c("AppDataCollectionManager", "report App Install List size: %s", Integer.valueOf(arrayList.size()));
                    rd rdVar = new rd(ubVar.f31945a);
                    System.currentTimeMillis();
                    if (rdVar.a(str, arrayList, a10, e10)) {
                        String e11 = com.huawei.openalliance.ad.ppskit.utils.y1.e(arrayList2);
                        com.huawei.openalliance.ad.ppskit.handlers.a0 a0Var2 = ubVar.f31947c;
                        synchronized (a0Var2.f22501e) {
                            if (!TextUtils.isEmpty(e11)) {
                                a0Var2.f22499c.edit().putString("app_install_list", com.huawei.openalliance.ad.ppskit.utils.m2.a(e11, com.huawei.openalliance.ad.ppskit.utils.u1.h(a0Var2.f22497a))).commit();
                            }
                        }
                        if (e10) {
                            com.huawei.openalliance.ad.ppskit.handlers.a0 a0Var3 = ubVar.f31947c;
                            long currentTimeMillis3 = System.currentTimeMillis();
                            synchronized (a0Var3.f22500d) {
                                a0Var3.f22498b.edit().putLong("all_app_install_list_time", currentTimeMillis3).commit();
                            }
                        }
                    }
                } catch (Throwable unused) {
                    n7.g("AppDataCollectionManager", "reportAppInstallList Exception");
                }
            }
        }
    }
}
