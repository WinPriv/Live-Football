package com.huawei.openalliance.ad.views;

import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.views.AppDownloadButton;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppDownloadButton f24107s;

    public a(AppDownloadButton appDownloadButton) {
        this.f24107s = appDownloadButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppInfo appInfo;
        AppInfo appInfo2;
        AppDownloadButton appDownloadButton = this.f24107s;
        appDownloadButton.getContext();
        appInfo = appDownloadButton.C;
        if (appInfo == null) {
            ex.V("PPSAppDownloadManager", "appInfo is empty.");
        } else {
            gb.c0.c(new da.c(appInfo));
        }
        if (appDownloadButton.D != null) {
            AppDownloadButton.q qVar = appDownloadButton.D;
            appInfo2 = appDownloadButton.C;
            qVar.Code(appInfo2);
        }
    }
}
