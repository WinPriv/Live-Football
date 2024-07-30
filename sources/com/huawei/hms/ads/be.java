package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public class be extends as {
    public be() {
        super(aj.L);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        Code(context, str, new ac() { // from class: com.huawei.hms.ads.be.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                RemoteCallResultCallback remoteCallResultCallback2;
                String str2;
                if (adContentData != null) {
                    adContentData.K();
                    com.huawei.openalliance.ad.inter.data.AppInfo c12 = adContentData.c1();
                    if (c12 != null) {
                        be beVar = be.this;
                        if (c12 == null) {
                            c12 = adContentData.c1();
                        }
                        da.e.a(context).b(beVar.Code(c12, adContentData));
                        be.this.V((RemoteCallResultCallback<String>) remoteCallResultCallback, true);
                        return;
                    }
                    remoteCallResultCallback2 = remoteCallResultCallback;
                    str2 = be.this.Code;
                } else {
                    remoteCallResultCallback2 = remoteCallResultCallback;
                    str2 = be.this.Code;
                }
                ag.Code(remoteCallResultCallback2, str2, 3002, null, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AppDownloadTask Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo, AdContentData adContentData) {
        AppDownloadTask appDownloadTask;
        if (appInfo == null) {
            appDownloadTask = null;
        } else {
            AppDownloadTask appDownloadTask2 = new AppDownloadTask();
            appDownloadTask2.f(false);
            appDownloadTask2.w(appInfo);
            appDownloadTask2.e(appInfo.G());
            appDownloadTask2.n(appInfo.p());
            appDownloadTask2.d(appInfo.k());
            appDownloadTask2.l();
            AppDownloadTask.u(appDownloadTask2, appInfo);
            appDownloadTask = appDownloadTask2;
        }
        appDownloadTask.s(adContentData.f0());
        appDownloadTask.y(adContentData.E());
        appDownloadTask.C(adContentData.u());
        appDownloadTask.G(adContentData.D());
        appDownloadTask.t(adContentData.L());
        return appDownloadTask;
    }
}
