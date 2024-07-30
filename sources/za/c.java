package za;

import a3.k;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.net.http.d;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.v0;
import com.huawei.openalliance.ad.ppskit.utils.w1;
import com.huawei.openalliance.ad.ppskit.utils.x;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ka.d5;
import ka.n7;
import ka.u;
import ka.y4;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final LinkedHashMap<String, String> f37348h = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap f37349i = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final za.a f37350a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37351b;

    /* renamed from: c, reason: collision with root package name */
    public final SourceParam f37352c;

    /* renamed from: d, reason: collision with root package name */
    public final u f37353d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f37354e;
    public final d5 f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37355g;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(String str);
    }

    public c(Context context, SourceParam sourceParam) {
        String a10;
        String str;
        String str2;
        int i10;
        String str3;
        this.f37355g = "normal";
        if (!TextUtils.isEmpty(sourceParam.r())) {
            String str4 = v0.f23046a;
            String r10 = sourceParam.r();
            if (!TextUtils.isEmpty(r10) && r10.contains("__source__")) {
                int i11 = Build.VERSION.SDK_INT;
                int H = sourceParam.H();
                l d10 = l.d(context);
                String packageName = context.getPackageName();
                synchronized (d10.f22585a) {
                    i10 = d10.G(packageName).getInt("supImageFormat", 1);
                }
                int i12 = H & i10;
                if (i11 >= 28 && i12 == 1) {
                    str3 = "heif";
                } else {
                    str3 = "webp";
                }
                v0.f23046a = str3;
                if (!TextUtils.isEmpty(str3)) {
                    n7.f("ImageUtil", "dealUri replaceAll by replacedImageType %s", v0.f23046a);
                    r10 = r10.replaceAll("__source__", v0.f23046a);
                    sourceParam.n(r10);
                } else {
                    str = "ImageUtil";
                    str2 = "replacedImageType is null, return original url";
                }
            } else {
                str = "ImageUtil";
                str2 = "do not need dealUri";
            }
            n7.e(str, str2);
            sourceParam.n(r10);
        }
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.f37354e = createDeviceProtectedStorageContext;
        if (sourceParam.x()) {
            a10 = w1.c(createDeviceProtectedStorageContext);
        } else {
            a10 = w1.a(createDeviceProtectedStorageContext);
        }
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j(sourceParam.L() ? a10 : w1.f(createDeviceProtectedStorageContext));
        String str5 = File.separator;
        String m10 = k.m(j10, str5, "pps", str5);
        this.f37351b = m10;
        if (!y1.h(sourceParam.i())) {
            StringBuilder j11 = com.ironsource.adapters.facebook.a.j(m10);
            j11.append(sourceParam.i());
            j11.append(str5);
            this.f37351b = j11.toString();
        }
        File file = new File(this.f37351b);
        if (!file.exists() && !x.v(file)) {
            n7.g("SourceFetcher", "SourceFetcher mkdirs failed");
        }
        d.b bVar = new d.b(createDeviceProtectedStorageContext);
        bVar.f22765g = true;
        bVar.f22766h = false;
        bVar.f22761b = sourceParam.E();
        bVar.f22762c = sourceParam.F();
        this.f37350a = (za.a) new com.huawei.openalliance.ad.ppskit.net.http.d(bVar).b(za.a.class);
        this.f37352c = sourceParam;
        if (sourceParam.C() != null) {
            this.f = y4.a(createDeviceProtectedStorageContext, sourceParam.C());
            this.f37355g = sourceParam.C();
        } else {
            sourceParam.t("normal");
            this.f = y4.a(createDeviceProtectedStorageContext, "normal");
        }
        this.f37353d = new u(createDeviceProtectedStorageContext);
    }

    public static synchronized void b(String str, e6.c cVar) {
        synchronized (c.class) {
            try {
                Set set = (Set) f37349i.get(str);
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a(cVar.f27764a);
                    }
                }
                synchronized (c.class) {
                    if (!TextUtils.isEmpty(str)) {
                        f37349i.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void g(String str) {
        synchronized (c.class) {
            try {
                Set set = (Set) f37349i.get(str);
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                }
                synchronized (c.class) {
                    if (!TextUtils.isEmpty(str)) {
                        f37349i.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str, long j10) {
        c(str, "", 0, j10);
    }

    public final void c(String str, String str2, int i10, long j10) {
        if (this.f37353d != null) {
            p2.a(new b(this, this.f37352c, str, j10, System.currentTimeMillis(), i10, str2), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.String r11, java.lang.String r12, long r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: za.c.d(java.lang.String, java.lang.String, long):boolean");
    }

    public final e6.c e() {
        String w10;
        String simpleName;
        String str;
        String concat;
        String str2 = this.f37351b;
        e6.c cVar = null;
        if (y1.h(str2)) {
            return null;
        }
        SourceParam sourceParam = this.f37352c;
        if (sourceParam == null) {
            concat = "downloadFile - data is null";
        } else {
            String r10 = sourceParam.r();
            if (TextUtils.isEmpty(r10)) {
                concat = "downloadFile - file url is null";
            } else {
                boolean d10 = n7.d();
                String str3 = this.f37355g;
                if (d10) {
                    n7.c("SourceFetcher", "download file: %s useDiskCache: %s cacheType: %s", y1.j(r10), Boolean.valueOf(sourceParam.x()), str3);
                }
                if (sourceParam.x()) {
                    if (sourceParam.D()) {
                        w10 = d5.f(r10) + x.z(r10);
                    } else {
                        w10 = d5.f(r10);
                    }
                } else {
                    String K = sourceParam.K();
                    if (y1.h(K)) {
                        K = d.b(r10);
                    } else {
                        String[] split = K.split(File.separator);
                        if (!n.N(split)) {
                            StringBuilder sb2 = new StringBuilder();
                            for (int i10 = 0; i10 < split.length - 1; i10++) {
                                sb2.append(split[i10]);
                            }
                            File file = new File(str2 + ((Object) sb2) + File.separator);
                            if (!file.exists() && !x.v(file)) {
                                n7.g("SourceFetcher", "mkdirs failed");
                            }
                        }
                    }
                    w10 = x.w(new File(com.ironsource.adapters.facebook.a.h(str2, K)));
                }
                boolean I = sourceParam.I();
                Context context = this.f37354e;
                if (!I && x.r(context, w10, str3)) {
                    n7.e("SourceFetcher", "download file from local");
                    if (d5.i(w10)) {
                        d.c(context, w10, this.f, sourceParam, str3);
                    } else {
                        x.p(new File(w10));
                    }
                    e6.c cVar2 = new e6.c();
                    cVar2.f27764a = w10;
                    b(r10, cVar2);
                    return cVar2;
                }
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (d(r10, w10, currentTimeMillis)) {
                        n7.e("SourceFetcher", "download file from network");
                        a("5", currentTimeMillis);
                        e6.c cVar3 = new e6.c();
                        cVar3.f27764a = w10;
                        b(r10, cVar3);
                        cVar = cVar3;
                    } else {
                        g(r10);
                    }
                    return cVar;
                } catch (RuntimeException e10) {
                    x.f(context, w10, str3);
                    g(r10);
                    simpleName = e10.getClass().getSimpleName();
                    str = "downloadFile RuntimeException:";
                    concat = str.concat(simpleName);
                    n7.g("SourceFetcher", concat);
                    return cVar;
                } catch (Exception e11) {
                    x.f(context, w10, str3);
                    g(r10);
                    simpleName = e11.getClass().getSimpleName();
                    str = "downloadFile Exception:";
                    concat = str.concat(simpleName);
                    n7.g("SourceFetcher", concat);
                    return cVar;
                }
            }
        }
        n7.g("SourceFetcher", concat);
        return cVar;
    }

    public final synchronized void f(String str) {
        n7.c("SourceFetcher", "removeLoadingImages, key:%s", y1.j(str));
        f37348h.remove(str);
    }
}
