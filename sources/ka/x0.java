package ka;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public final class x0 extends y {
    public x0() {
        super("queryActivityExist");
    }

    public static boolean f(Context context, Intent intent) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            if (intent.getData() != null) {
                intent = intent.setDataAndTypeAndNormalize(intent.getData(), intent.getType());
            }
            if (!packageManager.queryIntentActivities(intent, 0).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:12|(1:14)(1:32)|15|(3:20|9|10)|21|22|(1:24)(5:25|(1:27)|28|9|10)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        ka.n7.g("CmdQueryActivity", "handle intent url fail:".concat(r3.getClass().getSimpleName()));
     */
    @Override // ka.y, ka.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r2 = this;
            java.lang.String r5 = "CmdQueryActivity"
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7e
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r6 = "content_id"
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> L7e
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r4 = j7.r.n(r3, r4, r6, r0)     // Catch: java.lang.Throwable -> L7e
            if (r4 != 0) goto L1f
            boolean r3 = ka.n7.d()     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L84
            java.lang.String r3 = "content record is empty"
            ka.n7.b(r5, r3)     // Catch: java.lang.Throwable -> L7e
            goto L84
        L1f:
            java.lang.String r6 = r4.C()     // Catch: java.lang.Throwable -> L7e
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r4 = r4.j0()     // Catch: java.lang.Throwable -> L7e
            if (r4 != 0) goto L2b
            r0 = 0
            goto L2f
        L2b:
            java.lang.String r0 = r4.getPackageName()     // Catch: java.lang.Throwable -> L7e
        L2f:
            java.lang.String r4 = r4.p()     // Catch: java.lang.Throwable -> L7e
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L4d
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L40
            goto L4d
        L40:
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Throwable -> L7e
            r6.<init>()     // Catch: java.lang.Throwable -> L7e
            r6.setClassName(r0, r4)     // Catch: java.lang.Throwable -> L7e
            boolean r3 = f(r3, r6)     // Catch: java.lang.Throwable -> L7e
            goto L85
        L4d:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L54
            goto L84
        L54:
            java.lang.String r4 = android.net.Uri.decode(r6)     // Catch: java.lang.Throwable -> L6b
            r6 = 1
            android.content.Intent r4 = android.content.Intent.parseUri(r4, r6)     // Catch: java.lang.Throwable -> L6b
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L6b
            if (r6 != 0) goto L66
            r4.setPackage(r0)     // Catch: java.lang.Throwable -> L6b
        L66:
            boolean r3 = f(r3, r4)     // Catch: java.lang.Throwable -> L6b
            goto L85
        L6b:
            r3 = move-exception
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = "handle intent url fail:"
            java.lang.String r3 = r4.concat(r3)     // Catch: java.lang.Throwable -> L7e
            ka.n7.g(r5, r3)     // Catch: java.lang.Throwable -> L7e
            goto L84
        L7e:
            r3 = move-exception
            java.lang.String r4 = "query activity err, "
            e0.i.p(r3, r4, r5)
        L84:
            r3 = 0
        L85:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.x0.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
