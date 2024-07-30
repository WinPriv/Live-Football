package sa;

import a4.j;
import android.content.Context;
import android.text.TextUtils;
import androidx.activity.n;
import androidx.transition.t;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask;
import com.huawei.openalliance.ad.ppskit.download.local.RemoteAppDownloadTask;
import com.huawei.openalliance.ad.ppskit.download.local.base.LocalDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import java.util.HashSet;
import java.util.Set;
import k4.h0;
import ka.c7;
import ka.d7;
import ka.n7;
import ka.y6;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b extends j {

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f35296w = new byte[0];

    /* renamed from: x, reason: collision with root package name */
    public static b f35297x;

    /* renamed from: v, reason: collision with root package name */
    public final sa.a f35298v;

    /* loaded from: classes2.dex */
    public class a implements d7<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppLocalDownloadTask f35299a;

        public a(AppLocalDownloadTask appLocalDownloadTask) {
            this.f35299a = appLocalDownloadTask;
        }

        @Override // ka.d7
        public final void a(y6 y6Var) {
            if (y6Var.f32210b != -1) {
                b.this.c(this.f35299a);
            }
        }
    }

    /* renamed from: sa.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0482b implements d7<String> {

        /* renamed from: a, reason: collision with root package name */
        public final AppLocalDownloadTask f35301a;

        public C0482b(AppLocalDownloadTask appLocalDownloadTask) {
            this.f35301a = appLocalDownloadTask;
        }

        @Override // ka.d7
        public final void a(y6 y6Var) {
            AppLocalDownloadTask appLocalDownloadTask;
            if (y6Var.f32210b != -1 && (appLocalDownloadTask = this.f35301a) != null) {
                n7.e("ApDnMgr", " onRemoteCallResult task is success:" + appLocalDownloadTask.g());
            }
        }
    }

    public b(Context context) {
        super(context, 4);
        if (((t) this.f252u) == null) {
            this.f252u = new t(5);
        }
        sa.a aVar = new sa.a(context);
        this.f35298v = aVar;
        this.f251t = aVar;
    }

    public static b q() {
        b bVar;
        synchronized (f35296w) {
            bVar = f35297x;
            if (bVar == null) {
                throw new h0("AppLocalDownloadManager instance is not init!");
            }
        }
        return bVar;
    }

    public static boolean v(AppInfo appInfo) {
        if (appInfo != null && !TextUtils.isEmpty(appInfo.getPackageName())) {
            return false;
        }
        return true;
    }

    public final AppLocalDownloadTask p(String str) {
        AppLocalDownloadTask appLocalDownloadTask;
        LocalDownloadTask h10 = h(str);
        if (h10 instanceof AppLocalDownloadTask) {
            appLocalDownloadTask = (AppLocalDownloadTask) h10;
        } else {
            appLocalDownloadTask = null;
        }
        if (appLocalDownloadTask == null) {
            AppInfo appInfo = new AppInfo();
            appInfo.B(str);
            appInfo.W("5");
            RemoteAppDownloadTask remoteAppDownloadTask = (RemoteAppDownloadTask) n.D((Context) this.f250s, appInfo);
            if (remoteAppDownloadTask != null) {
                n7.e("ApDnMgr", " remote task is exist, create proxy task");
                AppLocalDownloadTask a10 = remoteAppDownloadTask.a(appInfo);
                c(a10);
                return a10;
            }
            return appLocalDownloadTask;
        }
        return appLocalDownloadTask;
    }

    public final void r(AppLocalDownloadTask appLocalDownloadTask) {
        boolean z10;
        if (appLocalDownloadTask == null) {
            return;
        }
        if ("7".equals(appLocalDownloadTask.K())) {
            AppInfo n10 = appLocalDownloadTask.n();
            if (n10 != null && !TextUtils.isEmpty(n10.K())) {
                ContentRecord I = appLocalDownloadTask.I();
                if (I != null) {
                    z10 = new ab.b((Context) this.f250s, I).a();
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
            }
            n7.e("ApDnMgr", "can not open Ag detail");
            w(appLocalDownloadTask);
            return;
        }
        Context context = (Context) this.f250s;
        a aVar = new a(appLocalDownloadTask);
        JSONObject jSONObject = new JSONObject();
        try {
            n.X(appLocalDownloadTask, jSONObject);
            c7.l(context).k("startDownloadApp", jSONObject.toString(), aVar, String.class);
        } catch (JSONException unused) {
            n.Z(aVar, "startDownload JSONException", "startDownloadApp");
        }
    }

    public final void s(AppInfo appInfo, ta.b bVar) {
        if (!v(appInfo)) {
            sa.a aVar = this.f35298v;
            String packageName = appInfo.getPackageName();
            synchronized (aVar) {
                Set set = (Set) aVar.f35290t.get(packageName);
                if (set == null) {
                    set = new HashSet();
                    aVar.f35290t.put(packageName, set);
                }
                set.add(bVar);
            }
        }
    }

    public final AppLocalDownloadTask t(AppInfo appInfo) {
        if (v(appInfo)) {
            return null;
        }
        LocalDownloadTask h10 = h(appInfo.getPackageName());
        if (h10 != null && (h10 instanceof AppLocalDownloadTask)) {
            return (AppLocalDownloadTask) h10;
        }
        RemoteAppDownloadTask remoteAppDownloadTask = (RemoteAppDownloadTask) n.D((Context) this.f250s, appInfo);
        if (remoteAppDownloadTask == null) {
            return null;
        }
        n7.e("ApDnMgr", " remote task is exist, create proxy task");
        AppLocalDownloadTask a10 = remoteAppDownloadTask.a(appInfo);
        c(a10);
        return a10;
    }

    public final void u(AppInfo appInfo, ta.b bVar) {
        if (!v(appInfo)) {
            sa.a aVar = this.f35298v;
            String packageName = appInfo.getPackageName();
            synchronized (aVar) {
                Set set = (Set) aVar.f35290t.get(packageName);
                if (set != null && set.size() > 0) {
                    set.remove(bVar);
                    if (set.size() <= 0) {
                        aVar.f35290t.remove(packageName);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r7.M() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        ka.n7.f("ApDnMgr", "switch next install way succ, curInstallWay:%s", r7.K());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r7.N() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        r2 = (android.content.Context) r6.f250s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r2 = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r2 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (com.huawei.openalliance.ad.ppskit.utils.d0.m(r2) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        r2 = a0.a.D(r2, com.huawei.openalliance.ad.ppskit.utils.o2.h(r2.getApplicationContext()), "ppskit_ver_code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (ka.n7.d() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        ka.n7.c("HiAdTools", "ppsKitVerCode:%s", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r2.intValue() >= 30445100) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        if (r7 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        ka.n7.e("HiAdTools", "hms version is too low to support switch next install way.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        ka.n7.f("ApDnMgr", "switch next install way fail, curInstallWay:%s", r7.K());
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0078, code lost:
    
        if (r2 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x007a, code lost:
    
        i(r7);
        r(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0080, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0081, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L7
        L4:
            r2 = r1
            goto L78
        L7:
            boolean r2 = r7.M()
            java.lang.String r3 = "ApDnMgr"
            if (r2 == 0) goto L6a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = r7.K()
            r2[r1] = r4
            java.lang.String r4 = "switch next install way succ, curInstallWay:%s"
            ka.n7.f(r3, r4, r2)
            boolean r2 = r7.N()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r6.f250s
            android.content.Context r2 = (android.content.Context) r2
            if (r2 != 0) goto L2b
            java.util.HashMap r2 = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a
            goto L64
        L2b:
            boolean r3 = com.huawei.openalliance.ad.ppskit.utils.d0.m(r2)
            if (r3 == 0) goto L32
            goto L5d
        L32:
            android.content.Context r3 = r2.getApplicationContext()
            java.lang.String r3 = com.huawei.openalliance.ad.ppskit.utils.o2.h(r3)
            java.lang.String r4 = "ppskit_ver_code"
            java.lang.Integer r2 = a0.a.D(r2, r3, r4)
            boolean r3 = ka.n7.d()
            java.lang.String r4 = "HiAdTools"
            if (r3 == 0) goto L51
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r1] = r2
            java.lang.String r5 = "ppsKitVerCode:%s"
            ka.n7.c(r4, r5, r3)
        L51:
            if (r2 == 0) goto L5f
            int r2 = r2.intValue()
            r3 = 30445100(0x1d08e2c, float:7.661114E-38)
            if (r2 >= r3) goto L5d
            goto L5f
        L5d:
            r2 = r0
            goto L65
        L5f:
            java.lang.String r2 = "hms version is too low to support switch next install way."
            ka.n7.e(r4, r2)
        L64:
            r2 = r1
        L65:
            if (r2 != 0) goto L68
            goto L7
        L68:
            r2 = r0
            goto L78
        L6a:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = r7.K()
            r2[r1] = r4
            java.lang.String r4 = "switch next install way fail, curInstallWay:%s"
            ka.n7.f(r3, r4, r2)
            goto L4
        L78:
            if (r2 == 0) goto L81
            r6.i(r7)
            r6.r(r7)
            return r0
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.b.w(com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask):boolean");
    }
}
