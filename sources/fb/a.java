package fb;

import android.content.Context;
import ca.a;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import gb.c0;

/* loaded from: classes2.dex */
public final class a extends m {

    /* renamed from: fb.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class RunnableC0384a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AppInfo f28338s;

        public RunnableC0384a(AppInfo appInfo) {
            this.f28338s = appInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ca.a aVar = a.C0042a.f3471a;
            if (aVar != null) {
                aVar.Code(this.f28338s.q());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AppInfo f28339s;

        public b(AppInfo appInfo) {
            this.f28339s = appInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ca.a aVar = a.C0042a.f3471a;
            if (aVar != null) {
                aVar.Code(this.f28339s);
            }
        }
    }

    public a(Context context, AdContentData adContentData) {
        super(context, adContentData);
    }

    public static void f(AppInfo appInfo) {
        if (appInfo == null) {
            ex.V("AppAction", "appInfo is empty.");
        } else {
            c0.c(new RunnableC0384a(appInfo));
            c0.c(new b(appInfo));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[Catch: Exception -> 0x0097, IllegalStateException -> 0x00a7, TryCatch #3 {IllegalStateException -> 0x00a7, Exception -> 0x0097, blocks: (B:21:0x006b, B:23:0x0071, B:25:0x0077, B:30:0x0089), top: B:20:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    @Override // fb.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r9 = this;
            android.content.Context r0 = r9.f28346a
            com.huawei.openalliance.ad.inter.data.AdContentData r1 = r9.f28347b
            java.lang.String r2 = "AppAction"
            java.lang.String r3 = "handle app action"
            com.huawei.hms.ads.ex.V(r2, r3)
            r3 = 1
            com.huawei.openalliance.ad.inter.data.AppInfo r4 = r1.c1()     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            r5 = 0
            if (r4 != 0) goto L15
            r4 = r5
            goto L19
        L15:
            java.lang.String r4 = r4.q()     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
        L19:
            java.lang.String r6 = r1.P0()     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            android.content.Intent r4 = gb.b0.i(r0, r6, r4)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            if (r4 == 0) goto L5d
            boolean r7 = r0 instanceof android.app.Activity     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            r8 = 268435456(0x10000000, float:2.524355E-29)
            if (r7 != 0) goto L2c
            r4.addFlags(r8)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
        L2c:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            if (r7 != 0) goto L3d
            java.lang.String r7 = "hwpps"
            int r6 = r6.indexOf(r7)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            if (r6 <= 0) goto L3d
            r4.addFlags(r8)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
        L3d:
            android.content.ClipData r6 = com.huawei.openalliance.ad.constant.w.cH     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            r4.setClipData(r6)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            r9.e(r4)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            r0.startActivity(r4)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            java.lang.String r4 = "app"
            r9.f28348c = r4     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            com.huawei.openalliance.ad.inter.data.AppInfo r4 = r1.c1()     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            f(r4)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            java.lang.String r4 = "intentSuccess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            com.huawei.hms.ads.jh.Code(r0, r1, r4, r6, r5)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            return r3
        L5d:
            java.lang.String r4 = "cannot find target activity"
            com.huawei.hms.ads.ex.I(r2, r4)     // Catch: java.lang.Exception -> L63 android.content.ActivityNotFoundException -> L66
            goto L6b
        L63:
            java.lang.String r4 = "handle intent url fail"
            goto L68
        L66:
            java.lang.String r4 = "activity not exist"
        L68:
            com.huawei.hms.ads.ex.I(r2, r4)
        L6b:
            com.huawei.openalliance.ad.beans.metadata.MetaData r4 = r1.K()     // Catch: java.lang.Exception -> L97 java.lang.IllegalStateException -> La7
            if (r4 == 0) goto L83
            com.huawei.openalliance.ad.beans.metadata.ApkInfo r4 = r4.F()     // Catch: java.lang.Exception -> L97 java.lang.IllegalStateException -> La7
            if (r4 == 0) goto L83
            java.lang.String r4 = r4.r()     // Catch: java.lang.Exception -> L97 java.lang.IllegalStateException -> La7
            android.content.pm.PackageInfo r4 = gb.b0.j(r0, r4)     // Catch: java.lang.Exception -> L97 java.lang.IllegalStateException -> La7
            if (r4 == 0) goto L83
            r4 = r3
            goto L84
        L83:
            r4 = 0
        L84:
            if (r4 == 0) goto L88
            r4 = 2
            goto L89
        L88:
            r4 = r3
        L89:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L97 java.lang.IllegalStateException -> La7
            java.lang.String r5 = "intentFail"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L97 java.lang.IllegalStateException -> La7
            com.huawei.hms.ads.jh.Code(r0, r1, r5, r3, r4)     // Catch: java.lang.Exception -> L97 java.lang.IllegalStateException -> La7
            goto Lac
        L97:
            r0 = move-exception
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "recordOpenFailEvent "
            java.lang.String r0 = r1.concat(r0)
            goto La9
        La7:
            java.lang.String r0 = "recordOpenFailEvent IllegalStateException"
        La9:
            com.huawei.hms.ads.ex.I(r2, r0)
        Lac:
            boolean r0 = r9.d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.a.a():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (gb.b0.e((java.util.List) gb.b0.f28550a.get(r3), gb.b0.a(r1, r3)) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.content.Intent r7) {
        /*
            r6 = this;
            fa.e r0 = fa.e.a()
            java.lang.String r0 = r0.f28224b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "at is null ? "
            r1.<init>(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "AppAction"
            com.huawei.hms.ads.ex.V(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L24
            return
        L24:
            java.lang.String r1 = r7.getDataString()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 1
            if (r3 == 0) goto L30
            goto L54
        L30:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r1.getHost()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r1.getScheme()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = "hwpps"
            boolean r1 = android.text.TextUtils.equals(r5, r1)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L54
            java.lang.String r1 = "landingpage"
            boolean r1 = android.text.TextUtils.equals(r1, r3)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L54
            r1 = r4
            goto L55
        L4e:
            r1 = move-exception
            java.lang.String r3 = "isHwPPSUri exception."
            e0.i.q(r1, r3, r2)
        L54:
            r1 = 0
        L55:
            if (r1 != 0) goto L5d
            java.lang.String r7 = "isHwPPSUri false."
            com.huawei.hms.ads.ex.V(r2, r7)
            return
        L5d:
            android.content.Context r1 = r6.f28346a
            java.lang.String r3 = gb.b0.g(r1)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L6a
            goto L7d
        L6a:
            java.lang.String r1 = gb.b0.a(r1, r3)
            java.util.HashMap r5 = gb.b0.f28550a
            java.lang.Object r5 = r5.get(r3)
            java.util.List r5 = (java.util.List) r5
            boolean r1 = gb.b0.e(r5, r1)
            if (r1 == 0) goto L7d
            goto L7e
        L7d:
            r3 = 0
        L7e:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            r1 = r1 ^ r4
            if (r1 != 0) goto L8b
            java.lang.String r7 = "isHMSInstalled false."
            com.huawei.hms.ads.ex.V(r2, r7)
            return
        L8b:
            java.lang.String r1 = "accessToken"
            r7.putExtra(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.a.e(android.content.Intent):void");
    }
}
