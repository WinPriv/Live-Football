package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openplatform.abl.log.HiAdLog;
import com.huawei.openplatform.abl.log.LogParams;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f22808s;

    public b(Context context) {
        this.f22808s = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f22808s;
        if (TextUtils.isEmpty(w1.e(m.A(context)))) {
            HiAdLog.w("CommonLibLogTool", "enable log failed, due to root path is null");
        } else {
            HiAdLog.init(context, new LogParams().setPriority(4).setModuleName("HiAd.RecEngine").setVersion("HiAd-3.4.65.300").setDisableFileLog(true));
        }
    }
}
