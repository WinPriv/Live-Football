package com.huawei.openalliance.ad.download.app;

import android.text.TextUtils;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import y9.b;

@DataKeep
/* loaded from: classes2.dex */
public class AppDownloadTask extends DownloadTask {
    private static final String TAG = "AppDownloadTask";

    @b
    private AdContentData adContentData;
    private Integer agdDownloadSource;
    private int apiVer;

    @b
    private AppInfo appInfo;
    private String apptaskInfo;
    private String contentId;
    private String curInstallWay;
    private String customData;
    private Integer downloadSource;
    private Integer downloadSourceMutable;

    @b
    private int installResult;

    @b
    private Queue<String> installWayQueue = new ConcurrentLinkedQueue();
    private String requestId;
    private String showId;
    private String slotId;

    @b
    private long startTime;
    private String templateId;
    private String userId;

    public static boolean J(String str) {
        if (!TextUtils.isEmpty(str) && (str.equals("8") || str.equals("6") || str.equals("5"))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(com.huawei.openalliance.ad.download.app.AppDownloadTask r10, com.huawei.openalliance.ad.inter.data.AppInfo r11) {
        /*
            if (r11 != 0) goto L4
            goto Lbe
        L4:
            r0 = 1
            r1 = 0
            java.util.Queue<java.lang.String> r2 = r10.installWayQueue     // Catch: java.lang.Throwable -> La4
            r2.clear()     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = r11.i()     // Catch: java.lang.Throwable -> La4
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La4
            if (r3 != 0) goto L1a
            java.util.Queue<java.lang.String> r3 = r10.installWayQueue     // Catch: java.lang.Throwable -> La4
            r3.offer(r2)     // Catch: java.lang.Throwable -> La4
        L1a:
            java.lang.String r2 = r11.k0()     // Catch: java.lang.Throwable -> La4
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La4
            if (r3 == 0) goto L26
            goto Lb8
        L26:
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)     // Catch: java.lang.Throwable -> La4
            int r3 = r2.length     // Catch: java.lang.Throwable -> La4
            if (r3 <= 0) goto Lb8
            int r3 = r2.length     // Catch: java.lang.Throwable -> La4
            r4 = r1
        L31:
            if (r4 >= r3) goto Lb8
            r5 = r2[r4]     // Catch: java.lang.Throwable -> La4
            boolean r6 = J(r5)     // Catch: java.lang.Throwable -> La4
            if (r6 != 0) goto L9c
            java.lang.String r6 = "7"
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L53
            com.huawei.openalliance.ad.inter.data.AppInfo r6 = r10.appInfo     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L53
            java.lang.String r6 = r6.j()     // Catch: java.lang.Throwable -> La4
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La4
            if (r6 != 0) goto L53
            r6 = r0
            goto L54
        L53:
            r6 = r1
        L54:
            if (r6 != 0) goto L9c
            com.huawei.openalliance.ad.inter.data.AppInfo r6 = r10.appInfo     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L99
            java.lang.String r6 = r6.q()     // Catch: java.lang.Throwable -> La4
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La4
            if (r6 != 0) goto L99
            com.huawei.openalliance.ad.inter.data.AppInfo r6 = r10.appInfo     // Catch: java.lang.Throwable -> La4
            java.lang.String r6 = r6.G()     // Catch: java.lang.Throwable -> La4
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La4
            if (r6 != 0) goto L99
            com.huawei.openalliance.ad.inter.data.AppInfo r6 = r10.appInfo     // Catch: java.lang.Throwable -> La4
            if (r6 != 0) goto L75
            goto L85
        L75:
            boolean r7 = r6.C()     // Catch: java.lang.Throwable -> La4
            if (r7 == 0) goto L87
            java.lang.String r6 = r6.p()     // Catch: java.lang.Throwable -> La4
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L87
        L85:
            r6 = r0
            goto L88
        L87:
            r6 = r1
        L88:
            if (r6 != 0) goto L99
            com.huawei.openalliance.ad.inter.data.AppInfo r6 = r10.appInfo     // Catch: java.lang.Throwable -> La4
            long r6 = r6.k()     // Catch: java.lang.Throwable -> La4
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L97
            goto L99
        L97:
            r6 = r1
            goto L9a
        L99:
            r6 = r0
        L9a:
            if (r6 != 0) goto La1
        L9c:
            java.util.Queue<java.lang.String> r6 = r10.installWayQueue     // Catch: java.lang.Throwable -> La4
            r6.offer(r5)     // Catch: java.lang.Throwable -> La4
        La1:
            int r4 = r4 + 1
            goto L31
        La4:
            r2 = move-exception
            java.lang.String r3 = "AppDownloadTask"
            java.lang.String r4 = "parse install way exception: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lbf
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.Throwable -> Lbf
            r0[r1] = r2     // Catch: java.lang.Throwable -> Lbf
            com.huawei.hms.ads.ex.I(r3, r4, r0)     // Catch: java.lang.Throwable -> Lbf
        Lb8:
            java.lang.String r11 = r11.i()
            r10.curInstallWay = r11
        Lbe:
            return
        Lbf:
            r0 = move-exception
            java.lang.String r11 = r11.i()
            r10.curInstallWay = r11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.download.app.AppDownloadTask.u(com.huawei.openalliance.ad.download.app.AppDownloadTask, com.huawei.openalliance.ad.inter.data.AppInfo):void");
    }

    public final void A(long j10) {
        this.startTime = j10;
    }

    public final void B(Integer num) {
        this.agdDownloadSource = num;
    }

    public final void C(String str) {
        this.showId = str;
    }

    public final AppInfo D() {
        AppInfo appInfo = this.appInfo;
        if (appInfo != null && TextUtils.isEmpty(appInfo.U())) {
            this.appInfo.V(UUID.randomUUID().toString());
        }
        return this.appInfo;
    }

    public final void E(String str) {
        this.customData = str;
    }

    public final void F(Integer num) {
        this.downloadSourceMutable = num;
    }

    public final void G(String str) {
        this.slotId = str;
    }

    public final void H(String str) {
        this.templateId = str;
    }

    public final Integer I() {
        return this.downloadSource;
    }

    public final AdContentData K() {
        return this.adContentData;
    }

    public final String L() {
        if (!TextUtils.isEmpty(this.curInstallWay)) {
            return this.curInstallWay;
        }
        AppInfo appInfo = this.appInfo;
        if (appInfo != null) {
            return appInfo.i();
        }
        return "4";
    }

    public final boolean M() {
        boolean z10;
        Integer num;
        boolean z11 = true;
        if (this.installWayQueue.size() > 1 && ((num = this.agdDownloadSource) == null || num.intValue() == 2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.installWayQueue.poll() == null || this.installWayQueue.isEmpty()) {
            z11 = false;
        }
        this.curInstallWay = this.installWayQueue.peek();
        return z11;
    }

    public final boolean N() {
        AppInfo appInfo = this.appInfo;
        if (appInfo != null && !TextUtils.isEmpty(appInfo.q()) && J(L())) {
            return true;
        }
        return false;
    }

    public final int O() {
        return this.installResult;
    }

    public final long P() {
        return this.startTime;
    }

    @Override // com.huawei.openalliance.ad.download.DownloadTask
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.huawei.openalliance.ad.download.DownloadTask
    public final String h() {
        AppInfo appInfo = this.appInfo;
        if (appInfo != null) {
            return appInfo.q();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.download.DownloadTask
    public final int hashCode() {
        return super.hashCode();
    }

    public final void q(int i10) {
        this.installResult = i10;
    }

    public final void r(String str) {
        this.apptaskInfo = str;
    }

    public final void s(int i10) {
        this.apiVer = i10;
    }

    public final void t(String str) {
        this.contentId = str;
    }

    public final void v(AdContentData adContentData) {
        this.adContentData = adContentData;
    }

    public final void w(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    public final void x(Integer num) {
        if (this.downloadSource == null) {
            this.downloadSource = num;
        }
        this.downloadSourceMutable = num;
    }

    public final void y(String str) {
        this.requestId = str;
    }

    public final void z(String str) {
        this.userId = str;
    }
}
