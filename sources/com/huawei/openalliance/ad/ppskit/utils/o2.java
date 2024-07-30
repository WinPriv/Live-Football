package com.huawei.openalliance.ad.ppskit.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.al;
import java.util.Iterator;
import java.util.List;
import ka.n7;

/* loaded from: classes2.dex */
public final class o2 {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f22937a;

        /* renamed from: b, reason: collision with root package name */
        public String f22938b;

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f22937a;
            if (str == null || !str.equals(aVar.f22937a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f22937a;
            if (str != null) {
                return str.hashCode();
            }
            return super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent a(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "ApkUtil"
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            if (r2 == 0) goto La
            return r1
        La:
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            if (r6 == 0) goto L7e
            java.lang.String r7 = android.net.Uri.decode(r7)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            r2 = 1
            android.content.Intent r7 = android.content.Intent.parseUri(r7, r2)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            r3 = 0
            if (r7 == 0) goto L3b
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            if (r4 == 0) goto L23
            goto L3b
        L23:
            android.content.ComponentName r4 = r7.getComponent()     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            if (r4 == 0) goto L3b
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            if (r5 != 0) goto L3b
            boolean r4 = r8.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            if (r4 == 0) goto L3a
            goto L3b
        L3a:
            r2 = r3
        L3b:
            if (r2 != 0) goto L3e
            return r1
        L3e:
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            if (r2 != 0) goto L47
            r7.setPackage(r8)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
        L47:
            android.net.Uri r8 = r7.getData()     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            if (r8 == 0) goto L59
            android.net.Uri r8 = r7.getData()     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            java.lang.String r2 = r7.getType()     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            android.content.Intent r7 = r7.setDataAndTypeAndNormalize(r8, r2)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
        L59:
            java.util.List r6 = r6.queryIntentActivities(r7, r3)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            boolean r8 = e(r6)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            if (r8 != 0) goto L69
            java.lang.String r6 = "parseAndCheckIntent, activity not exists or not exported."
            ka.n7.g(r0, r6)     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            return r1
        L69:
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            if (r6 == 0) goto L75
            boolean r6 = b()     // Catch: java.lang.Exception -> L76 java.net.URISyntaxException -> L79
            if (r6 != 0) goto L7e
        L75:
            return r7
        L76:
            java.lang.String r6 = "handle intent url fail"
            goto L7b
        L79:
            java.lang.String r6 = "parseAndCheckIntent, parse uri fail"
        L7b:
            ka.n7.g(r0, r6)
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.o2.a(android.content.Context, java.lang.String, java.lang.String):android.content.Intent");
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT > 29 && AdsCoreScopeUtil.isScopePrime()) {
            return false;
        }
        return true;
    }

    public static boolean c(Context context, String str) {
        if (f(context, str) != null) {
            return true;
        }
        return false;
    }

    public static boolean d(String str) {
        if (!al.Code.equals(str) && !al.V.equals(str) && !al.I.equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean e(List<ResolveInfo> list) {
        if (androidx.transition.n.M(list)) {
            return false;
        }
        Iterator<ResolveInfo> it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!it.next().activityInfo.exported) {
                z10 = false;
            }
        }
        return z10;
    }

    public static PackageInfo f(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getPackageInfo(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "getPackageInfo NameNotFoundException";
            n7.g("ApkUtil", str2);
            return null;
        } catch (Throwable unused2) {
            str2 = "getPackageInfo Exception";
            n7.g("ApkUtil", str2);
            return null;
        }
    }

    public static boolean g(Context context, String str, String str2) {
        String str3;
        Intent a10;
        n7.e("ApkUtil", "openApp intent");
        try {
            if (context.getPackageManager() == null || (a10 = a(context, str2, str)) == null) {
                return false;
            }
            if (!(context instanceof Activity)) {
                a10.addFlags(268435456);
            }
            a10.setClipData(oa.a.f33785b);
            context.startActivity(a10);
            return true;
        } catch (ActivityNotFoundException unused) {
            str3 = "activity not exist";
            n7.g("ApkUtil", str3);
            return false;
        } catch (Exception unused2) {
            str3 = "handle intent url fail";
            n7.g("ApkUtil", str3);
            return false;
        }
    }

    public static String h(Context context) {
        if (c(context, al.Code)) {
            return al.Code;
        }
        if (c(context, al.V)) {
            return al.V;
        }
        if (!c(context, al.I)) {
            return al.Code;
        }
        return al.I;
    }

    public static String i(PackageManager packageManager, String str) {
        String concat;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return packageManager.getApplicationLabel(applicationInfo).toString();
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            concat = "getAppName NameNotFoundException";
            n7.g("ApkUtil", concat);
            return null;
        } catch (Exception e10) {
            concat = "getAppName Exception:".concat(e10.getClass().getSimpleName());
            n7.g("ApkUtil", concat);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String j(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "ApkUtil"
            java.lang.String r1 = "getPackageSignatureBytes Exception:"
            java.lang.String r2 = "getPackageSignatureBytes RuntimeException:"
            r3 = 0
            r4 = 0
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L4b
            if (r6 == 0) goto L5f
            r5 = 64
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r5)     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L4b
            if (r6 == 0) goto L5f
            android.content.pm.Signature[] r6 = r6.signatures     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L4b
            int r7 = r6.length     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L4b
            if (r7 <= 0) goto L5f
            r6 = r6[r4]     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L4b
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L4b
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L4b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L4b
            java.lang.String r6 = "X.509"
            java.security.cert.CertificateFactory r6 = java.security.cert.CertificateFactory.getInstance(r6)     // Catch: java.lang.Throwable -> L38 java.lang.RuntimeException -> L3a
            java.security.cert.Certificate r6 = r6.generateCertificate(r7)     // Catch: java.lang.Throwable -> L38 java.lang.RuntimeException -> L3a
            byte[] r6 = r6.getEncoded()     // Catch: java.lang.Throwable -> L38 java.lang.RuntimeException -> L3a
            androidx.transition.n.D(r7)
            goto L66
        L38:
            r6 = move-exception
            goto L3e
        L3a:
            r6 = move-exception
            goto L4d
        L3c:
            r6 = move-exception
            r7 = r3
        L3e:
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Throwable -> L86
            goto L59
        L4b:
            r6 = move-exception
            r7 = r3
        L4d:
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r2.concat(r6)     // Catch: java.lang.Throwable -> L86
        L59:
            ka.n7.i(r0, r6)     // Catch: java.lang.Throwable -> L86
            androidx.transition.n.D(r7)
        L5f:
            java.lang.String r6 = "Failed to get application signature certificate fingerprint."
            ka.n7.e(r0, r6)
            byte[] r6 = new byte[r4]
        L66:
            if (r6 == 0) goto L85
            int r7 = r6.length
            if (r7 != 0) goto L6c
            goto L85
        L6c:
            java.lang.String r7 = "SHA-256"
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch: java.security.NoSuchAlgorithmException -> L77
            byte[] r6 = r7.digest(r6)     // Catch: java.security.NoSuchAlgorithmException -> L77
            goto L80
        L77:
            java.lang.String r6 = "Sha256Util"
            java.lang.String r7 = "sha256 NoSuchAlgorithmException"
            ka.n7.i(r6, r7)
            byte[] r6 = new byte[r4]
        L80:
            java.lang.String r6 = androidx.transition.n.w(r6)
            return r6
        L85:
            return r3
        L86:
            r6 = move-exception
            androidx.transition.n.D(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.o2.j(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String k(Context context, String str) {
        try {
            PackageInfo f = f(context, str);
            if (f == null) {
                return null;
            }
            return f.versionName;
        } catch (Throwable unused) {
            n7.g("ApkUtil", "getVersionName fail");
            return null;
        }
    }

    public static ApplicationInfo l(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                n7.e("ApkUtil", "pm is null");
                return null;
            }
            return packageManager.getApplicationInfo(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            if (!n7.d()) {
                return null;
            }
            n7.c("ApkUtil", "%s not exist", str);
            return null;
        } catch (Exception e10) {
            n7.g("ApkUtil", "getApplicationInfo ".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    public static boolean m(Context context, String str) {
        Intent launchIntentForPackage;
        n7.e("ApkUtil", "open app main page");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(str)) == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            launchIntentForPackage.addFlags(268435456);
        }
        launchIntentForPackage.setPackage(str);
        launchIntentForPackage.setClipData(oa.a.f33785b);
        context.startActivity(launchIntentForPackage);
        return true;
    }
}
