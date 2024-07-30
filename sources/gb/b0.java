package gb;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.al;
import com.huawei.openalliance.ad.ppskit.utils.AdsCoreScopeUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f28550a;

    static {
        HashMap hashMap = new HashMap();
        f28550a = hashMap;
        hashMap.put(al.Code, Arrays.asList("b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"));
        hashMap.put(al.V, Arrays.asList(al.B));
        hashMap.put(al.I, Arrays.asList(al.C));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.security.cert.CertificateFactory] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.io.ByteArrayInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "ApkUtil"
            java.lang.String r1 = "getPackageSignatureBytes Exception:"
            java.lang.String r2 = "getPackageSignatureBytes RuntimeException:"
            r3 = 0
            r4 = 0
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40 java.lang.RuntimeException -> L4f
            if (r6 == 0) goto L63
            r5 = 64
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40 java.lang.RuntimeException -> L4f
            if (r6 == 0) goto L63
            android.content.pm.Signature[] r6 = r6.signatures     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40 java.lang.RuntimeException -> L4f
            int r7 = r6.length     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40 java.lang.RuntimeException -> L4f
            if (r7 <= 0) goto L63
            r6 = r6[r4]     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40 java.lang.RuntimeException -> L4f
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40 java.lang.RuntimeException -> L4f
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40 java.lang.RuntimeException -> L4f
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40 java.lang.RuntimeException -> L4f
            java.lang.String r6 = "X.509"
            java.security.cert.CertificateFactory r6 = java.security.cert.CertificateFactory.getInstance(r6)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.lang.RuntimeException -> L3c
            java.security.cert.Certificate r6 = r6.generateCertificate(r7)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.lang.RuntimeException -> L3c
            byte[] r6 = r6.getEncoded()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.lang.RuntimeException -> L3c
            androidx.transition.n.g(r7)
            goto L6a
        L38:
            r6 = move-exception
            goto L8d
        L3a:
            r6 = move-exception
            goto L42
        L3c:
            r6 = move-exception
            goto L51
        L3e:
            r6 = move-exception
            goto L8c
        L40:
            r6 = move-exception
            r7 = r3
        L42:
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Throwable -> L8a
            goto L5d
        L4f:
            r6 = move-exception
            r7 = r3
        L51:
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = r2.concat(r6)     // Catch: java.lang.Throwable -> L8a
        L5d:
            com.huawei.hms.ads.ex.Z(r0, r6)     // Catch: java.lang.Throwable -> L8a
            androidx.transition.n.g(r7)
        L63:
            java.lang.String r6 = "Failed to get application signature certificate fingerprint."
            com.huawei.hms.ads.ex.V(r0, r6)
            byte[] r6 = new byte[r4]
        L6a:
            if (r6 == 0) goto L89
            int r7 = r6.length
            if (r7 != 0) goto L70
            goto L89
        L70:
            java.lang.String r7 = "SHA-256"
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch: java.security.NoSuchAlgorithmException -> L7b
            byte[] r6 = r7.digest(r6)     // Catch: java.security.NoSuchAlgorithmException -> L7b
            goto L84
        L7b:
            java.lang.String r6 = "Sha256Util"
            java.lang.String r7 = "sha256 NoSuchAlgorithmException"
            com.huawei.hms.ads.ex.Z(r6, r7)
            byte[] r6 = new byte[r4]
        L84:
            java.lang.String r6 = androidx.transition.n.f(r6)
            return r6
        L89:
            return r3
        L8a:
            r6 = move-exception
            r3 = r7
        L8c:
            r7 = r3
        L8d:
            androidx.transition.n.g(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.b0.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public static boolean b(Context context, String str) {
        if (j(context, str) != null) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context, String str, String str2) {
        String str3;
        Intent i10;
        ex.V("ApkUtil", "openApp intent");
        try {
            if (context.getPackageManager() == null || (i10 = i(context, str2, str)) == null) {
                return false;
            }
            if (!(context instanceof Activity)) {
                i10.addFlags(268435456);
            }
            i10.setClipData(com.huawei.openalliance.ad.constant.w.cH);
            context.startActivity(i10);
            return true;
        } catch (ActivityNotFoundException unused) {
            str3 = "activity not exist";
            ex.I("ApkUtil", str3);
            return false;
        } catch (Exception unused2) {
            str3 = "handle intent url fail";
            ex.I("ApkUtil", str3);
            return false;
        }
    }

    public static boolean d(String str) {
        if (!al.Code.equals(str) && !al.V.equals(str) && !al.I.equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean e(List<String> list, String str) {
        if (list != null && !TextUtils.isEmpty(str)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f() {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 29) {
            return true;
        }
        try {
            z10 = ((Boolean) AdsCoreScopeUtil.class.getMethod("isScopePrime", new Class[0]).invoke(null, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            ex.V("ApkUtil", "AdsCoreScopeUtil wrapper not found");
            ex.Code("ApkUtil", "is prime sdk: %s.", Boolean.FALSE);
            z10 = false;
        }
        if (!z10) {
            return true;
        }
        return false;
    }

    public static String g(Context context) {
        if (b(context, al.Code)) {
            return al.Code;
        }
        if (b(context, al.V)) {
            return al.V;
        }
        if (!b(context, al.I)) {
            return al.Code;
        }
        return al.I;
    }

    public static boolean h(Context context, String str) {
        Intent launchIntentForPackage;
        ex.V("ApkUtil", "open app main page");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(str)) == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            launchIntentForPackage.addFlags(268435456);
        }
        launchIntentForPackage.setPackage(str);
        launchIntentForPackage.setClipData(com.huawei.openalliance.ad.constant.w.cH);
        context.startActivity(launchIntentForPackage);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040 A[Catch: Exception -> 0x0094, URISyntaxException -> 0x0097, TryCatch #2 {URISyntaxException -> 0x0097, Exception -> 0x0094, blocks: (B:3:0x0003, B:7:0x000a, B:9:0x0010, B:11:0x001c, B:14:0x0023, B:16:0x0029, B:18:0x0033, B:24:0x0040, B:26:0x0046, B:27:0x0049, B:29:0x004f, B:30:0x005b, B:34:0x0081, B:36:0x0087, B:38:0x008d, B:41:0x0066, B:42:0x006a, B:44:0x0070), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent i(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "ApkUtil"
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r2 == 0) goto La
            return r1
        La:
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r6 == 0) goto L9c
            java.lang.String r7 = android.net.Uri.decode(r7)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            r2 = 1
            android.content.Intent r7 = android.content.Intent.parseUri(r7, r2)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            r3 = 0
            if (r7 == 0) goto L3c
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r4 == 0) goto L23
            goto L3c
        L23:
            android.content.ComponentName r4 = r7.getComponent()     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r4 == 0) goto L3c
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r5 != 0) goto L3c
            boolean r4 = r8.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r4 == 0) goto L3a
            goto L3c
        L3a:
            r4 = r3
            goto L3d
        L3c:
            r4 = r2
        L3d:
            if (r4 != 0) goto L40
            return r1
        L40:
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r4 != 0) goto L49
            r7.setPackage(r8)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
        L49:
            android.net.Uri r8 = r7.getData()     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r8 == 0) goto L5b
            android.net.Uri r8 = r7.getData()     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            java.lang.String r4 = r7.getType()     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            android.content.Intent r7 = r7.setDataAndTypeAndNormalize(r8, r4)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
        L5b:
            java.util.List r6 = r6.queryIntentActivities(r7, r3)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            boolean r8 = androidx.transition.n.h(r6)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r8 == 0) goto L66
            goto L7f
        L66:
            java.util.Iterator r8 = r6.iterator()     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
        L6a:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            android.content.pm.ActivityInfo r4 = r4.activityInfo     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            boolean r4 = r4.exported     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r4 != 0) goto L6a
            r2 = r3
            goto L6a
        L7e:
            r3 = r2
        L7f:
            if (r3 != 0) goto L87
            java.lang.String r6 = "parseAndCheckIntent, activity not exists or not exported."
            com.huawei.hms.ads.ex.I(r0, r6)     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            return r1
        L87:
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r6 == 0) goto L93
            boolean r6 = f()     // Catch: java.lang.Exception -> L94 java.net.URISyntaxException -> L97
            if (r6 != 0) goto L9c
        L93:
            return r7
        L94:
            java.lang.String r6 = "handle intent url fail"
            goto L99
        L97:
            java.lang.String r6 = "parseAndCheckIntent, parse uri fail"
        L99:
            com.huawei.hms.ads.ex.I(r0, r6)
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.b0.i(android.content.Context, java.lang.String, java.lang.String):android.content.Intent");
    }

    public static PackageInfo j(Context context, String str) {
        String str2;
        if (ex.Code()) {
            ex.Code("ApkUtil", "getPackageInfo, packageName:%s", str);
        }
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
            ex.I("ApkUtil", str2);
            return null;
        } catch (Throwable unused2) {
            str2 = "getPackageInfo Exception";
            ex.I("ApkUtil", str2);
            return null;
        }
    }

    public static int k(Context context, String str) {
        try {
            PackageInfo j10 = j(context, str);
            if (j10 == null) {
                return 0;
            }
            return j10.versionCode;
        } catch (AndroidRuntimeException | Exception unused) {
            ex.I("ApkUtil", "getAppVersionCode fail");
            return 0;
        }
    }
}
