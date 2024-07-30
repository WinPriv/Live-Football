package ka;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Permission;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.PermissionEntity;
import java.lang.ref.SoftReference;
import java.util.List;

/* loaded from: classes2.dex */
public final class cf {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31062c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f31063a;

    /* renamed from: b, reason: collision with root package name */
    public final b f31064b;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AppInfo f31065s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.huawei.openalliance.ad.ppskit.utils.o1 f31066t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31067u;

        /* renamed from: ka.cf$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0423a implements d7<String> {
            public C0423a() {
            }

            @Override // ka.d7
            public final void a(y6 y6Var) {
                int i10 = y6Var.f32210b;
                LruCache<String, List<PermissionEntity>> lruCache = null;
                a aVar = a.this;
                if (i10 == 200) {
                    List<Permission> list = (List) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, (String) y6Var.f32211c, List.class, Permission.class);
                    if (!androidx.transition.n.M(list)) {
                        aVar.f31065s.C(list);
                    }
                    List<PermissionEntity> permissions = aVar.f31065s.getPermissions();
                    if (!androidx.transition.n.M(permissions)) {
                        String str = aVar.f31067u;
                        com.huawei.openalliance.ad.ppskit.utils.o1 o1Var = aVar.f31066t;
                        o1Var.getClass();
                        try {
                            SoftReference<LruCache<String, List<PermissionEntity>>> softReference = o1Var.f22936a;
                            if (softReference != null) {
                                lruCache = softReference.get();
                            }
                            if (lruCache == null) {
                                lruCache = new LruCache<>(5);
                                o1Var.f22936a = new SoftReference<>(lruCache);
                            }
                            lruCache.put(str, permissions);
                        } catch (Throwable th) {
                            e0.i.p(th, "put cache encounter: ", "o1");
                        }
                    }
                    int i11 = cf.f31062c;
                    cf.this.b(permissions);
                    return;
                }
                int i12 = cf.f31062c;
                n7.h("cf", "request permissions, retCode: %s", Integer.valueOf(i10));
                cf.this.b(null);
            }
        }

        public a(AppInfo appInfo, com.huawei.openalliance.ad.ppskit.utils.o1 o1Var, String str) {
            this.f31065s = appInfo;
            this.f31066t = o1Var;
            this.f31067u = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppInfo appInfo = this.f31065s;
            if (appInfo != null && !TextUtils.isEmpty(appInfo.getPackageName())) {
                c7.l(cf.this.f31063a).k("queryAppPermissions", com.huawei.openalliance.ad.ppskit.utils.y0.q(null, appInfo), new C0423a(), String.class);
            } else {
                int i10 = cf.f31062c;
                n7.g("cf", "empty request parameters");
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public cf(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f31063a = applicationContext;
        com.huawei.openalliance.ad.ppskit.handlers.i0.d(applicationContext);
    }

    public final void a(AppInfo appInfo) {
        com.huawei.openalliance.ad.ppskit.utils.o1 o1Var;
        LruCache<String, List<PermissionEntity>> lruCache;
        List<PermissionEntity> list = null;
        if (appInfo != null && androidx.transition.n.M(appInfo.getPermissions()) && appInfo.d0()) {
            synchronized (com.huawei.openalliance.ad.ppskit.utils.o1.f22934b) {
                if (com.huawei.openalliance.ad.ppskit.utils.o1.f22935c == null) {
                    com.huawei.openalliance.ad.ppskit.utils.o1.f22935c = new com.huawei.openalliance.ad.ppskit.utils.o1();
                }
                o1Var = com.huawei.openalliance.ad.ppskit.utils.o1.f22935c;
            }
            String str = appInfo.getPackageName() + "_" + appInfo.g0() + "_" + appInfo.h0() + "_" + com.huawei.openalliance.ad.ppskit.utils.i2.c() + "_" + com.huawei.openalliance.ad.ppskit.utils.z1.x();
            if (!TextUtils.isEmpty(str)) {
                o1Var.getClass();
                try {
                    SoftReference<LruCache<String, List<PermissionEntity>>> softReference = o1Var.f22936a;
                    if (softReference != null) {
                        lruCache = softReference.get();
                    } else {
                        lruCache = null;
                    }
                    if (lruCache == null) {
                        lruCache = new LruCache<>(5);
                        o1Var.f22936a = new SoftReference<>(lruCache);
                    }
                    list = lruCache.get(str);
                } catch (Throwable th) {
                    e0.i.p(th, "get cache encounter: ", "o1");
                }
            }
            if (!androidx.transition.n.M(list)) {
                appInfo.E(list);
            } else {
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(appInfo, o1Var, str), 0);
                return;
            }
        }
        b(list);
    }

    public final void b(List<PermissionEntity> list) {
        b bVar = this.f31064b;
        if (bVar != null) {
            ra.j jVar = (ra.j) bVar;
            jVar.getClass();
            com.huawei.openalliance.ad.ppskit.utils.d2.a(new ra.i(jVar, list));
        }
    }

    public cf(Context context, ra.j jVar) {
        this(context);
        this.f31064b = jVar;
    }
}
