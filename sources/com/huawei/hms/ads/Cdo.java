package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;

/* renamed from: com.huawei.hms.ads.do, reason: invalid class name */
/* loaded from: classes2.dex */
public class Cdo extends dk {
    public static final String I = "16";
    public static final String V = "15";
    private static final String Z = "AlertReminder";

    public Cdo(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void I(final com.huawei.openalliance.ad.inter.data.AppInfo r9, final com.huawei.openalliance.ad.inter.data.AdContentData r10, long r11) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showNonWifiAlert, context:"
            r0.<init>(r1)
            android.content.Context r1 = r8.Code()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AlertReminder"
            com.huawei.hms.ads.ex.V(r1, r0)
            android.content.Context r2 = r8.Code()
            com.huawei.hms.ads.do$1 r7 = new com.huawei.hms.ads.do$1
            r7.<init>()
            int r9 = com.huawei.hms.ads.base.R.string.hiad_dialog_title_tip
            java.lang.String r3 = r2.getString(r9)
            int r9 = com.huawei.hms.ads.base.R.string.hiad_download_use_mobile_network
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r0 = 0
            java.lang.String r11 = gb.p.e(r2, r11)
            r10[r0] = r11
            android.content.res.Resources r11 = r2.getResources()
            com.huawei.hms.ads.cw r12 = com.huawei.hms.ads.cl.Code(r2)     // Catch: java.lang.Exception -> L51 java.lang.RuntimeException -> L53
            boolean r12 = r12.Code()     // Catch: java.lang.Exception -> L51 java.lang.RuntimeException -> L53
            if (r12 == 0) goto L67
            java.lang.String r12 = "hiad_download_use_mobile_network_zh"
            java.lang.String r0 = "string"
            java.lang.String r1 = r2.getPackageName()     // Catch: java.lang.Exception -> L51 java.lang.RuntimeException -> L53
            int r12 = r11.getIdentifier(r12, r0, r1)     // Catch: java.lang.Exception -> L51 java.lang.RuntimeException -> L53
            java.lang.String r12 = r11.getString(r12, r10)     // Catch: java.lang.Exception -> L51 java.lang.RuntimeException -> L53
            goto L68
        L51:
            r12 = move-exception
            goto L54
        L53:
            r12 = move-exception
        L54:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r0 = "getChinaString "
            java.lang.String r12 = r0.concat(r12)
            java.lang.String r0 = "CNStrUtil"
            com.huawei.hms.ads.ex.Z(r0, r12)
        L67:
            r12 = 0
        L68:
            if (r12 != 0) goto L70
            java.lang.String r9 = r11.getString(r9, r10)
            r4 = r9
            goto L71
        L70:
            r4 = r12
        L71:
            int r9 = com.huawei.hms.ads.base.R.string.hiad_continue_download_new
            java.lang.String r5 = r2.getString(r9)
            int r9 = com.huawei.hms.ads.base.R.string.hiad_dialog_cancel
            java.lang.String r6 = r2.getString(r9)
            gb.l0.b(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.Cdo.I(com.huawei.openalliance.ad.inter.data.AppInfo, com.huawei.openalliance.ad.inter.data.AdContentData, long):void");
    }

    @Override // com.huawei.hms.ads.dk
    public void Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo, AdContentData adContentData, long j10) {
        if (appInfo != null && adContentData != null) {
            I(appInfo, adContentData, j10);
        } else {
            ex.V(Z, "appInfo or contentRecord is empty");
            V(appInfo);
        }
    }
}
