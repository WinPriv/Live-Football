package fb;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;

/* loaded from: classes2.dex */
public final class b extends m {
    public b(Context context, AdContentData adContentData) {
        super(context, adContentData);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    @Override // fb.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r9 = this;
            java.lang.String r0 = "AppDeepLinkAction"
            java.lang.String r1 = "handle AppDeepLinkAction"
            com.huawei.hms.ads.ex.V(r0, r1)
            com.huawei.openalliance.ad.inter.data.AdContentData r1 = r9.f28347b
            android.content.Context r2 = r9.f28346a
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            if (r1 == 0) goto L95
            com.huawei.openalliance.ad.inter.data.AppInfo r5 = r1.c1()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            if (r5 != 0) goto L1b
            goto L95
        L1b:
            com.huawei.openalliance.ad.inter.data.AppInfo r5 = r1.c1()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            java.lang.String r6 = r5.j()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            java.lang.String r7 = r5.a0()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            android.content.Intent r6 = gb.b0.i(r2, r6, r7)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            if (r6 == 0) goto L8f
            boolean r7 = r2 instanceof android.app.Activity     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            if (r7 != 0) goto L36
            r7 = 268435456(0x10000000, float:2.524355E-29)
            r6.addFlags(r7)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
        L36:
            android.content.ClipData r7 = com.huawei.openalliance.ad.constant.w.cH     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r6.setClipData(r7)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r2.startActivity(r6)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            java.lang.String r6 = r5.q()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            if (r6 != 0) goto L84
            com.huawei.openalliance.ad.download.app.AppDownloadTask r6 = new com.huawei.openalliance.ad.download.app.AppDownloadTask     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r6.<init>()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r7 = 0
            r6.f(r7)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r6.w(r5)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            java.lang.String r7 = r5.G()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r6.e(r7)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            java.lang.String r7 = r5.p()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r6.n(r7)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            long r7 = r5.k()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r6.d(r7)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r6.l()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            com.huawei.openalliance.ad.download.app.AppDownloadTask.u(r6, r5)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r6.v(r1)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r6.A(r7)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            da.o r7 = da.o.a(r2)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            java.lang.String r5 = r5.q()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            r7.c(r5, r6)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
        L84:
            java.lang.String r5 = "appmarket"
            r9.f28348c = r5     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            java.lang.String r5 = "intentSuccess"
            r6 = 0
            com.huawei.hms.ads.jh.Code(r2, r1, r5, r3, r6)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            return r4
        L8f:
            java.lang.String r5 = "cannot find target activity"
            com.huawei.hms.ads.ex.I(r0, r5)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            goto La7
        L95:
            java.lang.String r5 = "getAppInfo is null"
            com.huawei.hms.ads.ex.V(r0, r5)     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            boolean r0 = r9.d()     // Catch: java.lang.Exception -> L9f android.content.ActivityNotFoundException -> La2
            return r0
        L9f:
            java.lang.String r5 = "handle intent url fail"
            goto La4
        La2:
            java.lang.String r5 = "activity not exist"
        La4:
            com.huawei.hms.ads.ex.I(r0, r5)
        La7:
            com.huawei.openalliance.ad.inter.data.AppInfo r0 = r1.c1()
            java.lang.String r0 = r0.a0()
            boolean r0 = gb.b0.b(r2, r0)
            if (r0 == 0) goto Lb6
            r4 = 2
        Lb6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "intentFail"
            com.huawei.hms.ads.jh.Code(r2, r1, r4, r3, r0)
            boolean r0 = r9.d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.b.a():boolean");
    }
}
