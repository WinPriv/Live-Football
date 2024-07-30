package ca;

import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import da.n;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a implements AppDownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3470a = new ConcurrentHashMap();

    /* renamed from: ca.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0042a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3471a = new a();
    }

    public a() {
        com.huawei.openalliance.ad.download.app.a.t().f22197w.f27542u = this;
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public final void Code(AppInfo appInfo) {
        for (AppDownloadListener appDownloadListener : this.f3470a.values()) {
            if (appDownloadListener != null) {
                appDownloadListener.Code(appInfo);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public final void V(AppInfo appInfo) {
        for (AppDownloadListener appDownloadListener : this.f3470a.values()) {
            if (appDownloadListener != null) {
                appDownloadListener.V(appInfo);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public final void Code(AppInfo appInfo, int i10) {
        for (AppDownloadListener appDownloadListener : this.f3470a.values()) {
            if (appDownloadListener != null) {
                appDownloadListener.Code(appInfo, i10);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public final void Code(n nVar, AppInfo appInfo) {
        for (AppDownloadListener appDownloadListener : this.f3470a.values()) {
            if (appDownloadListener != null) {
                appDownloadListener.Code(nVar, appInfo);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public final void Code(String str) {
        for (AppDownloadListener appDownloadListener : this.f3470a.values()) {
            if (appDownloadListener != null) {
                appDownloadListener.Code(str);
            }
        }
    }
}
