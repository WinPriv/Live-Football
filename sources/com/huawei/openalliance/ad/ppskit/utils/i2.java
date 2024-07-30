package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.hihonor.android.os.Build;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.XRInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.q1;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ka.Cif;
import ka.d5;
import ka.n7;
import ka.y4;

/* loaded from: classes2.dex */
public abstract class i2 {

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22863s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22864t;

        public a(Context context, q1 q1Var) {
            this.f22863s = context;
            this.f22864t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i2.A(this.f22863s, this.f22864t);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22865s;

        public b(Context context) {
            this.f22865s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            q1 m10 = q1.m(this.f22865s);
            String m11 = x.m(m.e(this.f22865s));
            m10.getClass();
            synchronized (q1.f22960g) {
                m10.B();
                q1.b bVar = m10.f22965a;
                if (bVar != null) {
                    bVar.memorySize = m11;
                    m10.n(bVar);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22866s;

        public c(Context context) {
            this.f22866s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j10;
            q1 m10 = q1.m(this.f22866s);
            String c10 = w1.c(this.f22866s);
            if (!TextUtils.isEmpty(c10)) {
                j10 = x.u(c10).longValue();
            } else {
                j10 = 0;
            }
            String m11 = x.m(j10);
            if (!m11.endsWith("T")) {
                if (!y1.h(m11) && m11.endsWith("G")) {
                    try {
                        long parseLong = Long.parseLong(m11.substring(0, m11.length() - 1));
                        long pow = (long) Math.pow(2.0d, (int) (Math.log(parseLong) / Math.log(2.0d)));
                        if (parseLong > pow) {
                            pow = (long) Math.pow(2.0d, r1 + 1);
                        }
                        m11 = pow + "G";
                    } catch (Throwable th) {
                        e0.i.p(th, "getStorageSize ", "FileUtil");
                    }
                }
                m11 = "";
            }
            m10.getClass();
            synchronized (q1.f22960g) {
                m10.B();
                q1.b bVar = m10.f22965a;
                if (bVar != null) {
                    bVar.storageSize = m11;
                    m10.n(bVar);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22867s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Integer f22868t;

        public d(Context context, Integer num) {
            this.f22867s = context;
            this.f22868t = num;
        }

        @Override // java.lang.Runnable
        public final void run() {
            q1 m10 = q1.m(this.f22867s);
            Integer num = this.f22868t;
            m10.getClass();
            synchronized (q1.f22963j) {
                m10.D();
                q1.d dVar = m10.f22967c;
                if (dVar != null) {
                    dVar.sdkType = num;
                    m10.p(dVar);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22869s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22870t;

        public e(Context context, q1 q1Var) {
            this.f22869s = context;
            this.f22870t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i2.u(this.f22869s, this.f22870t);
        }
    }

    /* loaded from: classes2.dex */
    public static class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22871s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22872t;

        public f(Context context, q1 q1Var) {
            this.f22871s = context;
            this.f22872t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i2.w(this.f22871s, this.f22872t);
        }
    }

    /* loaded from: classes2.dex */
    public static class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22873s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22874t;

        public g(Context context, q1 q1Var) {
            this.f22873s = context;
            this.f22874t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i2.y(this.f22873s, this.f22874t);
        }
    }

    /* loaded from: classes2.dex */
    public static class h implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22875s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22876t;

        public h(Context context, q1 q1Var) {
            this.f22875s = context;
            this.f22876t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context = this.f22875s;
            q1 q1Var = this.f22876t;
            n7.e("AdInfoUtil", "getAgCountryCodeFromAg");
            k2 k2Var = new k2(context);
            int i10 = c5.e.f3284t;
            String str = (String) c5.e.b(k2Var, com.huawei.openalliance.ad.constant.w.aU, 100L, TimeUnit.MILLISECONDS);
            if (str == null) {
                str = com.huawei.openalliance.ad.constant.w.aU;
            }
            if (!TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
                q1Var.getClass();
                synchronized (q1.f22960g) {
                    q1Var.B();
                    q1.b bVar = q1Var.f22965a;
                    bVar.agCountryCode = str;
                    q1Var.n(bVar);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22877s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f22878t;

        public i(Context context, q1 q1Var) {
            this.f22877s = context;
            this.f22878t = q1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i2.z(this.f22877s, this.f22878t);
        }
    }

    public static String A(Context context, q1 q1Var) {
        String e10 = e(context, "com.huawei.featurelayer.sharedfeature.xrkit");
        if (e10 == null) {
            e10 = com.huawei.openalliance.ad.constant.w.aU;
        }
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            bVar.xrKitAppVersion = e10;
            q1Var.n(bVar);
        }
        return e10;
    }

    public static ArrayList B(Context context) {
        String string;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        com.huawei.openalliance.ad.ppskit.handlers.g0 a10 = com.huawei.openalliance.ad.ppskit.handlers.g0.a(context);
        synchronized (a10.f22543b) {
            string = a10.f22542a.getString("INS_APPS_ENCODED", "");
        }
        if (TextUtils.equals(string, "")) {
            return arrayList;
        }
        try {
            return new ArrayList(Arrays.asList(string.split(",")));
        } catch (RuntimeException unused) {
            str = "AdInfoUtil";
            str2 = "fromString RuntimeException";
            n7.g(str, str2);
            return arrayList;
        } catch (Exception unused2) {
            str = "AdInfoUtil";
            str2 = "fromString Exception";
            n7.g(str, str2);
            return arrayList;
        }
    }

    public static int C(Context context) {
        String string;
        com.huawei.openalliance.ad.ppskit.handlers.g0 a10 = com.huawei.openalliance.ad.ppskit.handlers.g0.a(context);
        synchronized (a10.f22543b) {
            string = a10.f22542a.getString("ENCODING_MODE", y1.d(1));
        }
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException unused) {
            n7.g("AdInfoUtil", "EncodingMode fromString Exception");
            return 1;
        }
    }

    public static String D(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            q1.b bVar = m10.f22965a;
            if (bVar == null) {
                str = "";
            } else {
                str = bVar.memorySize;
            }
        }
        if (TextUtils.isEmpty(str)) {
            p2.g(new b(context));
        }
        return str;
    }

    public static String E(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            q1.b bVar = m10.f22965a;
            if (bVar == null) {
                str = "";
            } else {
                str = bVar.storageSize;
            }
        }
        if (TextUtils.isEmpty(str)) {
            p2.g(new c(context));
        }
        return str;
    }

    public static Integer F(Context context) {
        Integer num;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22963j) {
            m10.D();
            q1.d dVar = m10.f22967c;
            if (dVar == null) {
                num = null;
            } else {
                num = dVar.sdkType;
            }
        }
        if (num == null) {
            HashMap hashMap = d0.f22830a;
            num = a0.a.D(context, context.getApplicationContext().getPackageName(), "hw_ads_sdk_type");
            if (n7.d()) {
                n7.c("HiAdTools", "sdkType:%s", num);
            }
            p2.g(new d(context, num));
        }
        return num;
    }

    public static DisplayMetrics a(Context context) {
        WindowManager windowManager;
        Display defaultDisplay;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context == null || (windowManager = (WindowManager) context.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return null;
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r9 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r9 != null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r9) {
        /*
            java.lang.String r0 = "AdInfoUtil"
            java.lang.String r1 = "getWebviewUserAgent "
            r2 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L45
            android.net.Uri r4 = oa.h.f33797b     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L45
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L45
            if (r9 == 0) goto L2b
            boolean r3 = r9.moveToFirst()     // Catch: java.lang.Exception -> L29 java.lang.IllegalArgumentException -> L46 java.lang.Throwable -> L51
            if (r3 == 0) goto L2b
            java.lang.String r3 = "ua"
            int r3 = r9.getColumnIndexOrThrow(r3)     // Catch: java.lang.Exception -> L29 java.lang.IllegalArgumentException -> L46 java.lang.Throwable -> L51
            java.lang.String r0 = r9.getString(r3)     // Catch: java.lang.Exception -> L29 java.lang.IllegalArgumentException -> L46 java.lang.Throwable -> L51
            r9.close()
            return r0
        L29:
            r3 = move-exception
            goto L33
        L2b:
            if (r9 == 0) goto L50
            goto L4d
        L2e:
            r9 = move-exception
            goto L54
        L30:
            r9 = move-exception
            r3 = r9
            r9 = r2
        L33:
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = r1.concat(r3)     // Catch: java.lang.Throwable -> L51
            ka.n7.g(r0, r1)     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto L50
            goto L4d
        L45:
            r9 = r2
        L46:
            java.lang.String r1 = "getWebviewUserAgent IllegalArgumentException"
            ka.n7.g(r0, r1)     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto L50
        L4d:
            r9.close()
        L50:
            return r2
        L51:
            r0 = move-exception
            r2 = r9
            r9 = r0
        L54:
            if (r2 == 0) goto L59
            r2.close()
        L59:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.i2.b(android.content.Context):java.lang.String");
    }

    public static String c() {
        return Locale.getDefault().getLanguage();
    }

    public static String d(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "2";
                }
                return "5";
            }
            return "4";
        }
        return "3";
    }

    public static String e(Context context, String str) {
        try {
            PackageInfo f10 = o2.f(context, str);
            if (f10 == null) {
                return null;
            }
            return String.valueOf(f10.versionCode);
        } catch (AndroidRuntimeException | Exception unused) {
            n7.g("AdInfoUtil", "getVersionCode fail");
            return null;
        }
    }

    public static void f(Context context, ArrayList arrayList) {
        String e10 = y1.e(arrayList);
        com.huawei.openalliance.ad.ppskit.handlers.g0 a10 = com.huawei.openalliance.ad.ppskit.handlers.g0.a(context);
        if (androidx.transition.n.M(arrayList)) {
            a10.b("");
        } else {
            a10.b(e10);
        }
    }

    public static boolean g(Context context, ContentRecord contentRecord) {
        String packageName;
        if (contentRecord == null) {
            return false;
        }
        AppInfo j02 = contentRecord.j0();
        if (j02 == null) {
            packageName = "";
        } else {
            packageName = j02.getPackageName();
        }
        if (!a0.a.D0(contentRecord.s3()) || o2.c(context, packageName)) {
            return false;
        }
        return true;
    }

    public static boolean h(ContentRecord contentRecord) {
        if (contentRecord == null || !"4".equals(contentRecord.f1()) || !a0.a.D0(contentRecord.s3())) {
            return false;
        }
        return true;
    }

    public static float i(Context context) {
        try {
            DisplayMetrics a10 = a(context);
            if (a10 != null) {
                return a10.density;
            }
            return gl.Code;
        } catch (RuntimeException | Exception unused) {
            n7.g("AdInfoUtil", "getDensity fail");
            return gl.Code;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if ("1".equals(r6.toString()) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int j(android.content.Context r5, boolean r6) {
        /*
            r0 = -1
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 0
            r2 = 1
            if (r6 != 0) goto L47
            ka.l r6 = ka.Cif.a(r5)
            boolean r6 = r6.d()
            if (r6 == 0) goto L45
            int r6 = com.huawei.openalliance.ad.ppskit.utils.d0.l()
            r3 = 10
            if (r6 >= r3) goto L21
            boolean r6 = ka.Cif.f(r5)
            if (r6 != 0) goto L21
            goto L45
        L21:
            java.lang.String r6 = "com.huawei.parentcontrol"
            android.content.pm.PackageManager r3 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L45
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r6 = r3.getApplicationInfo(r6, r4)     // Catch: java.lang.Throwable -> L45
            android.os.Bundle r6 = r6.metaData     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "parentcontrol_issupport_contentswitch"
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> L47
            if (r6 != 0) goto L38
            goto L45
        L38:
            java.lang.String r3 = "1"
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L47
            boolean r6 = r3.equals(r6)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L45
            goto L47
        L45:
            r6 = r1
            goto L48
        L47:
            r6 = r2
        L48:
            if (r6 == 0) goto L65
            android.content.ContentResolver r6 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L64 android.provider.Settings.SettingNotFoundException -> L65
            java.lang.String r3 = "childmode_status"
            int r6 = android.provider.Settings.Secure.getInt(r6, r3)     // Catch: java.lang.Throwable -> L64 android.provider.Settings.SettingNotFoundException -> L65
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L64 android.provider.Settings.SettingNotFoundException -> L65
            java.lang.String r3 = "parentcontrol_screentime_status"
            int r5 = android.provider.Settings.Secure.getInt(r5, r3)     // Catch: java.lang.Throwable -> L64 android.provider.Settings.SettingNotFoundException -> L65
            if (r6 != 0) goto L64
            if (r5 != 0) goto L63
            return r0
        L63:
            return r1
        L64:
            return r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.i2.j(android.content.Context, boolean):int");
    }

    public static void k(Context context, List<XRInfo> list) {
        n7.e("AdInfoUtil", "update xr infos");
        if (androidx.transition.n.M(list)) {
            return;
        }
        d5 a10 = y4.a(context, com.anythink.expressad.video.dynview.a.a.f11377aa);
        for (XRInfo xRInfo : list) {
            if (xRInfo != null) {
                ImageInfo k10 = xRInfo.k();
                if (k10 != null) {
                    try {
                        String p10 = y1.p(xRInfo.p());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(Advertisement.FILE_SCHEME);
                        sb2.append(d5.a(context, com.anythink.expressad.video.dynview.a.a.f11377aa).getCanonicalPath());
                        String str = File.separator;
                        sb2.append(str);
                        sb2.append("arzip");
                        sb2.append(x.x(k10.g()));
                        sb2.append(str);
                        sb2.append(p10);
                        String sb3 = sb2.toString();
                        k10.h(sb3);
                        n7.c("AdInfoUtil", "xrPath: %s", y1.j(sb3));
                    } catch (Throwable unused) {
                        n7.g("AdInfoUtil", "get xf file path error");
                    }
                }
                ImageInfo q10 = xRInfo.q();
                if (q10 != null) {
                    String g6 = q10.g();
                    q10.h(Advertisement.FILE_SCHEME + a10.h(context, d5.f(g6)) + x.z(g6));
                    n7.c("AdInfoUtil", "bgPath: %s", y1.j(q10.g()));
                }
                ImageInfo r10 = xRInfo.r();
                if (r10 != null) {
                    r10.h(d5.f(r10.g()));
                    n7.c("AdInfoUtil", "prvPath: %s", y1.j(r10.g()));
                }
            }
        }
    }

    public static String l() {
        return Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
    }

    public static String m(Context context) {
        com.huawei.openalliance.ad.ppskit.handlers.r rVar;
        long j10;
        String str;
        q1 m10 = q1.m(context);
        synchronized (com.huawei.openalliance.ad.ppskit.handlers.r.f22618d) {
            if (com.huawei.openalliance.ad.ppskit.handlers.r.f22617c == null) {
                com.huawei.openalliance.ad.ppskit.handlers.r.f22617c = new com.huawei.openalliance.ad.ppskit.handlers.r(context);
            }
            rVar = com.huawei.openalliance.ad.ppskit.handlers.r.f22617c;
        }
        synchronized (rVar.f22619a) {
            j10 = rVar.f22620b.getSharedPreferences("HiAdSharedPreferences_ua", 4).getLong("last_query_time", 0L);
        }
        HashMap hashMap = d0.f22830a;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j10 >= 1209600000) {
            p2.a(new j2(context, m10, rVar, currentTimeMillis), 2);
        } else {
            n7.e("AdInfoUtil", "query ua once 2 week");
        }
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.useragent;
        }
        if (TextUtils.isEmpty(str)) {
            str = q();
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static String n(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.hsfVersion;
        }
        if (TextUtils.isEmpty(str)) {
            str = u(context, m10);
        } else if (c2.a("getHsfVersionCode")) {
            p2.d(new e(context, m10));
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static boolean o() {
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase(com.huawei.openalliance.ad.constant.w.bo) || Build.VERSION.SDK_INT < 31) {
                return false;
            }
            if (Build.VERSION.MAGIC_SDK_INT < 33) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            Log.e("AdInfoUtil", "isHonor6UpPhone Error:".concat(th.getClass().getSimpleName()));
            return false;
        }
    }

    public static String p(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.hmsVersion;
        }
        if (TextUtils.isEmpty(str)) {
            str = w(context, m10);
        } else if (c2.a("getHmsVersionCode")) {
            p2.d(new f(context, m10));
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static String q() {
        String str;
        try {
            return System.getProperty("http.agent");
        } catch (IllegalArgumentException unused) {
            str = "getSystemUserAgent fail";
            n7.g("AdInfoUtil", str);
            return null;
        } catch (Exception unused2) {
            str = "getSystemUserAgent Exception";
            n7.g("AdInfoUtil", str);
            return null;
        }
    }

    public static String r(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.agVersion;
        }
        if (TextUtils.isEmpty(str)) {
            str = y(context, m10);
        } else if (c2.a("getAgVersionCode")) {
            p2.d(new g(context, m10));
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static String s(Context context) {
        String str;
        String str2 = null;
        if (!Cif.c(context)) {
            return null;
        }
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.agCountryCode;
        }
        if (TextUtils.isEmpty(str) || c2.a("getAgCountryCode")) {
            p2.d(new h(context, m10));
        }
        if (!TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            str2 = str;
        }
        n7.c("AdInfoUtil", "ag country code = %s", str2);
        return str2;
    }

    public static String t(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.arEngineVersion;
        }
        if (TextUtils.isEmpty(str)) {
            str = z(context, m10);
        } else if (c2.a("getArEngineVersionCode")) {
            p2.d(new i(context, m10));
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static String u(Context context, q1 q1Var) {
        String e10 = e(context, "com.huawei.android.hsf");
        if (e10 == null) {
            e10 = e(context, "com.huawei.hsf");
        }
        if (e10 == null) {
            e10 = com.huawei.openalliance.ad.constant.w.aU;
        }
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            bVar.hsfVersion = e10;
            q1Var.n(bVar);
        }
        return e10;
    }

    public static String v(Context context) {
        String str;
        q1 m10 = q1.m(context);
        m10.getClass();
        synchronized (q1.f22960g) {
            m10.B();
            str = m10.f22965a.xrKitAppVersion;
        }
        if (TextUtils.isEmpty(str)) {
            str = A(context, m10);
        } else if (c2.a("getXrKitAppVersionCode")) {
            p2.d(new a(context, m10));
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    public static String w(Context context, q1 q1Var) {
        String e10 = e(context, o2.h(context));
        if (e10 == null) {
            e10 = com.huawei.openalliance.ad.constant.w.aU;
        }
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            bVar.hmsVersion = e10;
            q1Var.n(bVar);
        }
        return e10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r2 == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int x(android.content.Context r14) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "com.google.android.marvin.talkback"
            r3 = 1
            r4 = 0
            java.lang.String r5 = "AdInfoUtil"
            r6 = -1
            if (r14 != 0) goto Lf
            goto Lae
        Lf:
            int r7 = com.huawei.openalliance.ad.ppskit.utils.d0.l()
            r8 = 10
            java.lang.String r9 = "get ScreenReader status error."
            java.lang.String r10 = "get ScreenReader status error, setting not found."
            if (r7 >= r8) goto L8b
            boolean r7 = ka.Cif.f(r14)
            if (r7 == 0) goto L22
            goto L8b
        L22:
            android.content.ContentResolver r7 = r14.getContentResolver()     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            java.lang.String r8 = "accessibility_enabled"
            int r7 = android.provider.Settings.Secure.getInt(r7, r8)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            if (r7 != r3) goto L30
            r7 = r3
            goto L31
        L30:
            r7 = r4
        L31:
            if (r7 != 0) goto L35
            goto La5
        L35:
            android.content.ContentResolver r14 = r14.getContentResolver()     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            java.lang.String r7 = "enabled_accessibility_services"
            java.lang.String r14 = android.provider.Settings.Secure.getString(r14, r7)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            if (r14 != 0) goto L42
            goto La5
        L42:
            android.content.ComponentName r7 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            java.lang.String r8 = "com.google.android.marvin.talkback.TalkBackService"
            r7.<init>(r2, r8)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            java.lang.String r11 = "com.bjbyhd.screenreader_huawei"
            java.lang.String r12 = "com.bjbyhd.screenreader_huawei.ScreenReaderService"
            r8.<init>(r11, r12)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            android.content.ComponentName r11 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            java.lang.String r12 = ".TalkBackService"
            r11.<init>(r2, r12)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            java.lang.String r12 = "com.samsung.accessibility"
            java.lang.String r13 = "com.samsung.android.app.talkback.TalkBackService"
            r2.<init>(r12, r13)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            java.lang.String r7 = r7.flattenToString()     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            boolean r7 = r14.contains(r7)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            java.lang.String r8 = r8.flattenToString()     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            boolean r8 = r14.contains(r8)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            java.lang.String r11 = r11.flattenToString()     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            boolean r11 = r14.contains(r11)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            java.lang.String r2 = r2.flattenToString()     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            boolean r14 = r14.contains(r2)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            if (r7 != 0) goto La1
            if (r8 != 0) goto La1
            if (r11 != 0) goto La1
            if (r14 == 0) goto La5
            goto La1
        L8b:
            android.content.ContentResolver r2 = r14.getContentResolver()     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            java.lang.String r7 = "accessibility_screenreader_enabled"
            int r2 = android.provider.Settings.Secure.getInt(r2, r7)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            if (r2 != r6) goto L9f
            ka.n r2 = a0.a.L(r14)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
            int r2 = r2.a(r14)     // Catch: java.lang.Throwable -> La7 android.provider.Settings.SettingNotFoundException -> Lab
        L9f:
            if (r2 != r3) goto La3
        La1:
            r6 = r3
            goto Lae
        La3:
            if (r2 != 0) goto Lae
        La5:
            r6 = r4
            goto Lae
        La7:
            ka.n7.i(r5, r9)
            goto Lae
        Lab:
            ka.n7.i(r5, r10)
        Lae:
            boolean r14 = ka.n7.d()
            if (r14 == 0) goto Lc6
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Object[] r14 = new java.lang.Object[r3]
            long r7 = r7 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r14[r4] = r0
            java.lang.String r0 = "getScreenReaderStatus end duration: %d"
            ka.n7.c(r5, r0, r14)
        Lc6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.i2.x(android.content.Context):int");
    }

    public static String y(Context context, q1 q1Var) {
        String e10 = e(context, com.huawei.openalliance.ad.constant.w.W);
        if (e10 == null) {
            e10 = com.huawei.openalliance.ad.constant.w.aU;
        }
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            bVar.agVersion = e10;
            q1Var.n(bVar);
        }
        return e10;
    }

    public static String z(Context context, q1 q1Var) {
        String e10 = e(context, "com.huawei.arengine.service");
        if (e10 == null) {
            e10 = com.huawei.openalliance.ad.constant.w.aU;
        }
        q1Var.getClass();
        synchronized (q1.f22960g) {
            q1Var.B();
            q1.b bVar = q1Var.f22965a;
            bVar.arEngineVersion = e10;
            q1Var.n(bVar);
        }
        return e10;
    }
}
