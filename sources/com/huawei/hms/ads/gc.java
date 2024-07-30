package com.huawei.hms.ads;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.openalliance.ad.activity.PPSNotificationActivity;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import gb.b0;
import gb.w0;

/* loaded from: classes2.dex */
public class gc extends gh {
    private static final int C = 1;
    private static final String I = "AppInstalledNotification";
    private AdContentData B;
    private int S;
    private com.huawei.openalliance.ad.inter.data.AppInfo Z;

    public gc(Context context, AdContentData adContentData, String str) {
        super(context);
        com.huawei.openalliance.ad.inter.data.AppInfo appInfo;
        this.B = adContentData;
        this.Z = adContentData.c1();
        if (!TextUtils.isEmpty(str) && (appInfo = this.Z) != null) {
            appInfo.V(str);
        }
    }

    private boolean D() {
        com.huawei.openalliance.ad.inter.data.AppInfo appInfo = this.Z;
        if (appInfo != null && appInfo.d0() == 1 && !TextUtils.isEmpty(this.Z.e0())) {
            return true;
        }
        return false;
    }

    private boolean F() {
        com.huawei.openalliance.ad.inter.data.AppInfo appInfo = this.Z;
        if (appInfo != null && !TextUtils.isEmpty(appInfo.q())) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.hms.ads.gh
    public String B() {
        return I;
    }

    @Override // com.huawei.hms.ads.gh
    public String C() {
        com.huawei.openalliance.ad.inter.data.AppInfo appInfo = this.Z;
        if (appInfo != null) {
            return gb.p.j(appInfo.e0());
        }
        return "";
    }

    @Override // com.huawei.hms.ads.gh
    public int Code() {
        if (F()) {
            return this.Z.q().hashCode();
        }
        return 1;
    }

    @Override // com.huawei.hms.ads.gh
    public void I() {
        boolean z10;
        if (!D()) {
            return;
        }
        gj.Code(this.Code).Code(this.Z.q());
        super.I();
        if (this.B != null) {
            Context context = this.Code;
            int i10 = gb.u.f28631a;
            if (Build.VERSION.SDK_INT >= 33) {
                z10 = gb.l.a(context, com.huawei.openalliance.ad.constant.w.cx);
            } else {
                z10 = true;
            }
            if (z10) {
                gg.I(this.Code, this.B);
            }
        }
    }

    @Override // com.huawei.hms.ads.gh
    public PendingIntent S() {
        return V(gj.Code);
    }

    public int V() {
        return this.S;
    }

    @Override // com.huawei.hms.ads.gh
    public String Z() {
        com.huawei.openalliance.ad.inter.data.AppInfo appInfo = this.Z;
        if (appInfo != null) {
            return appInfo.L();
        }
        return "";
    }

    private PendingIntent Code(String str) {
        if (!F()) {
            return null;
        }
        Intent intent = new Intent();
        intent.setAction(str);
        intent.setPackage(this.Code.getPackageName());
        intent.putExtra("type", 1);
        intent.putExtra(ge.Code, this.Z);
        intent.putExtra(ge.I, this.S);
        intent.putExtra("contentRecord", this.B);
        return PendingIntent.getBroadcast(this.Code, Code(), intent, 201326592);
    }

    private PendingIntent V(String str) {
        if (!F()) {
            return null;
        }
        Intent intent = new Intent(this.Code, (Class<?>) PPSNotificationActivity.class);
        intent.setAction(str);
        intent.putExtra("type", 1);
        intent.putExtra(ge.Code, this.Z);
        intent.putExtra(ge.I, this.S);
        intent.putExtra("contentRecord", this.B);
        return PendingIntent.getActivity(this.Code, Code(), intent, 201326592);
    }

    private void V(Notification.Builder builder) {
        Context context;
        ApplicationInfo applicationInfo;
        Drawable loadIcon;
        if (!F() || (context = this.Code) == null || (applicationInfo = b0.j(context, this.Z.q()).applicationInfo) == null || (loadIcon = applicationInfo.loadIcon(this.Code.getPackageManager())) == null) {
            return;
        }
        builder.setLargeIcon(w0.c(loadIcon));
    }

    public void Code(int i10) {
        this.S = i10;
    }

    @Override // com.huawei.hms.ads.gh
    public void Code(Notification.Builder builder) {
        if (builder == null || !F()) {
            return;
        }
        V(builder);
        builder.setDeleteIntent(Code(gj.V));
    }
}
