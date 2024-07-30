package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import ka.n7;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22860a;

    /* renamed from: b, reason: collision with root package name */
    public final AppInfo f22861b;

    public i0(Context context, AppInfo appInfo) {
        this.f22860a = context;
        this.f22861b = appInfo;
    }

    @JavascriptInterface
    public void showPageDetail(int i10) {
        n7.e("com.huawei.openalliance.ad.ppskit.utils.i0", "show page details type:" + i10);
        AppInfo appInfo = this.f22861b;
        if (i10 != 1) {
            if (i10 == 2) {
                n7.e("com.huawei.openalliance.ad.ppskit.utils.i0", "load permissionUrl start.");
                if (appInfo != null && !TextUtils.isEmpty(appInfo.N())) {
                    d2.a(new h0(this));
                    return;
                } else {
                    n7.e("com.huawei.openalliance.ad.ppskit.utils.i0", "load permission url is empty.");
                    return;
                }
            }
            return;
        }
        n7.e("com.huawei.openalliance.ad.ppskit.utils.i0", "load privacyUrl start.");
        if (appInfo != null && !TextUtils.isEmpty(appInfo.M())) {
            d2.a(new g0(this));
        } else {
            n7.e("com.huawei.openalliance.ad.ppskit.utils.i0", "load privacy url is empty.");
        }
    }
}
