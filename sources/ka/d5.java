package ka;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public f5 f31087a;

    /* renamed from: b, reason: collision with root package name */
    public g5 f31088b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f31089c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public final String f31090d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31091e;

    public d5(Context context, String str) {
        this.f31090d = s.f.b("DiskCacheManager_", str);
        this.f31091e = str;
        p(context, str);
    }

    public static File a(Context context, String str) {
        File cacheDir = context.createDeviceProtectedStorageContext().getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(str) && !com.huawei.openalliance.ad.ppskit.utils.y1.o(str, "normal")) {
            StringBuilder sb2 = new StringBuilder();
            String str2 = File.separator;
            e0.i.o(sb2, str2, "pps", str2, "new_diskcache");
            return new File(cacheDir, a3.l.p(sb2, str2, str));
        }
        StringBuilder sb3 = new StringBuilder();
        String str3 = File.separator;
        return new File(cacheDir, a3.l.q(sb3, str3, "pps", str3, "diskcache"));
    }

    public static String f(String str) {
        return "diskcache://" + androidx.transition.n.Q(str);
    }

    public static boolean i(String str) {
        if (str != null && str.startsWith("diskcache://")) {
            return true;
        }
        return false;
    }

    public static String k(String str) {
        if (str != null && str.startsWith("diskcache://")) {
            return str.substring(12);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        if (r5.exists() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ka.f5 b(android.content.Context r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "init diskcache error:"
            byte[] r1 = r3.f31089c
            monitor-enter(r1)
            ka.f5 r2 = r3.f31087a     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L16
            java.lang.String r5 = r3.f31090d     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = "fileDiskCache is null, recreate"
            ka.n7.e(r5, r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r3.f31091e     // Catch: java.lang.Throwable -> L41
            r3.p(r4, r5)     // Catch: java.lang.Throwable -> L41
            goto L3d
        L16:
            if (r5 == 0) goto L3d
            java.io.File r5 = r2.f31158c     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L22
            boolean r5 = r5.exists()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L41
            if (r5 != 0) goto L3d
        L22:
            r5 = 0
            r3.f31087a = r5     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L41
            java.lang.String r5 = r3.f31091e     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L41
            r3.p(r4, r5)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L41
            goto L3d
        L2b:
            r4 = move-exception
            java.lang.String r5 = r3.f31090d     // Catch: java.lang.Throwable -> L41
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r4.getSimpleName()     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r0.concat(r4)     // Catch: java.lang.Throwable -> L41
            ka.n7.g(r5, r4)     // Catch: java.lang.Throwable -> L41
        L3d:
            ka.f5 r4 = r3.f31087a     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            return r4
        L41:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.d5.b(android.content.Context, boolean):ka.f5");
    }

    public final void c(int i10, Context context) {
        f5 b10 = b(context, false);
        if (b10 == null) {
            return;
        }
        n7.c("FileDiskCache", "set max num: %s", Integer.valueOf(i10));
        b10.f31157b = i10;
    }

    public final void d(Context context, long j10) {
        f5 b10 = b(context, false);
        if (b10 == null) {
            return;
        }
        n7.c("FileDiskCache", "set max size: %s", Long.valueOf(j10));
        b10.f31156a = j10;
    }

    public final boolean e(String str) {
        g5 g5Var = this.f31088b;
        if (g5Var == null) {
            return false;
        }
        boolean d10 = n7.d();
        ConcurrentHashMap concurrentHashMap = g5Var.f31202a;
        if (d10) {
            n7.c("FileListener", "accessMap = %s", Arrays.asList(concurrentHashMap));
        }
        if (!concurrentHashMap.containsKey(str) || ((Integer) concurrentHashMap.get(str)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    public final void g(Context context, String str) {
        h5 h5Var;
        f5 b10 = b(context, true);
        if (b10 == null) {
            n7.g(this.f31090d, "fileDiskCache is null");
            return;
        }
        String k10 = k(str);
        if (!TextUtils.isEmpty(k10) && new File(b10.f31158c, k10).exists() && (h5Var = b10.f31159d) != null) {
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new c5((com.huawei.openalliance.ad.ppskit.utils.h) h5Var, k10), 10);
        }
    }

    public final String h(Context context, String str) {
        f5 b10;
        String k10 = k(str);
        if (k10 == null || (b10 = b(context, false)) == null) {
            return "";
        }
        try {
            return new File(b10.f31158c, k10).getCanonicalPath();
        } catch (IOException e10) {
            n7.g("FileDiskCache", "getFilePath ".concat(e10.getClass().getSimpleName()));
            return "";
        }
    }

    public final String j(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String f = f(str);
        if (!l(context, f)) {
            return "";
        }
        return f;
    }

    public final boolean l(Context context, String str) {
        String h10 = h(context, str);
        if (h10 != null && com.huawei.openalliance.ad.ppskit.utils.x.q(h10)) {
            return true;
        }
        return false;
    }

    public final void m(Context context, String str) {
        f5 b10 = b(context, true);
        if (b10 == null) {
            n7.g(this.f31090d, "fileDiskCache is null");
            return;
        }
        String k10 = k(str);
        if (!TextUtils.isEmpty(k10)) {
            File file = new File(b10.f31158c, k10);
            if (file.exists()) {
                com.huawei.openalliance.ad.ppskit.utils.x.p(file);
                h5 h5Var = b10.f31159d;
                if (h5Var != null) {
                    com.huawei.openalliance.ad.ppskit.utils.p2.a(new a5((com.huawei.openalliance.ad.ppskit.utils.h) h5Var, k10, System.currentTimeMillis()), 10);
                }
            }
        }
    }

    public final int n(Context context, String str) {
        h5 h5Var;
        f5 b10 = b(context, true);
        if (b10 == null) {
            n7.g(this.f31090d, "fileDiskCache is null");
            return 0;
        }
        String k10 = k(str);
        if (TextUtils.isEmpty(k10) || (h5Var = b10.f31159d) == null) {
            return 0;
        }
        com.huawei.openalliance.ad.ppskit.utils.h hVar = (com.huawei.openalliance.ad.ppskit.utils.h) h5Var;
        ArrayList r10 = com.huawei.openalliance.ad.ppskit.handlers.s.n(hVar.f22856a).r(k10, hVar.f22857b);
        if (androidx.transition.n.M(r10)) {
            return 0;
        }
        Iterator it = r10.iterator();
        if (!it.hasNext()) {
            return 0;
        }
        return ((ContentResource) it.next()).W();
    }

    public final void o(Context context, String str) {
        String k10;
        f5 b10 = b(context, true);
        if (b10 != null && (k10 = k(str)) != null) {
            try {
                n7.e("FileDiskCache", "remove key ".concat(k10));
                com.huawei.openalliance.ad.ppskit.utils.x.n(new File(b10.f31158c, k10));
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new e5(b10, k10), 10);
            } catch (Exception e10) {
                n7.g(this.f31090d, "deleteCacheFile ".concat(e10.getClass().getSimpleName()));
            }
        }
    }

    public final void p(Context context, String str) {
        File a10;
        long j10;
        int i10;
        g5 g5Var;
        if (context == null || (a10 = a(context.getApplicationContext(), str)) == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                g5Var = new g5(a10);
            } else {
                g5Var = new g5(a10.getPath());
            }
            this.f31088b = g5Var;
            g5Var.startWatching();
        } catch (Throwable th) {
            n7.g(this.f31090d, "start fileListener failed, ".concat(th.getClass().getSimpleName()));
            n7.a();
            this.f31088b = null;
        }
        try {
            ConfigSpHandler b10 = ConfigSpHandler.b(context);
            synchronized (b10.f22478a) {
                j10 = b10.s().getLong("exsplash_cache_max_size", 300L);
            }
            long j11 = j10 * 1024 * 1024;
            synchronized (b10.f22478a) {
                i10 = b10.s().getInt("exsplash_cache_max_num", 300);
            }
            f5 f5Var = new f5(a10, j11, i10);
            this.f31087a = f5Var;
            f5Var.f31160e = this;
            f5Var.f = b10.a().longValue() * 60000;
            this.f31087a.f31159d = new com.huawei.openalliance.ad.ppskit.utils.h(context, str);
        } catch (Throwable th2) {
            e0.i.p(th2, "Unable to create disk cache ", this.f31090d);
        }
    }
}
