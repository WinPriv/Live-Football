package com.huawei.hms.ads.nativead;

import android.content.Context;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.bw;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.download.app.a;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.IHiAd;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager;
import da.n;

@GlobalApi
/* loaded from: classes2.dex */
public class NativeAppDownloadManager {
    private static NativeAppDownloadManager I;
    private static final byte[] V = new byte[0];
    private IAppDownloadManager B;
    private IHiAd Z;

    @GlobalApi
    /* loaded from: classes2.dex */
    public interface AppDownloadListener {
        void onAppOpen(String str, String str2);

        void onDownloadProgress(int i10, String str);

        void onStatusChanged(String str, String str2);

        void onUserCancel(String str, String str2);
    }

    @GlobalApi
    /* loaded from: classes2.dex */
    public interface ResultCode {
        public static final int DOWNLOAD_NO_PERMISSION = -2;
        public static final int DOWNLOAD_PARAMS_ERROR = -1;
        public static final int DOWNLOAD_SUCCESS = 0;
    }

    private NativeAppDownloadManager(Context context) {
        IHiAd hiAd = HiAd.getInstance(context);
        this.Z = hiAd;
        this.B = hiAd.getAppDownloadManager();
    }

    private static NativeAppDownloadManager Code(Context context) {
        NativeAppDownloadManager nativeAppDownloadManager;
        synchronized (V) {
            if (I == null) {
                I = new NativeAppDownloadManager(context);
            }
            nativeAppDownloadManager = I;
        }
        return nativeAppDownloadManager;
    }

    @GlobalApi
    public static NativeAppDownloadManager getInstance(Context context) {
        return Code(context);
    }

    @GlobalApi
    public void cancelDownload(Context context, NativeAd nativeAd) {
        IAppDownloadManager iAppDownloadManager = this.B;
        if (iAppDownloadManager != null && (nativeAd instanceof bw)) {
            iAppDownloadManager.e(context, ((bw) nativeAd).Code());
        } else {
            ex.V("NativeAppDownloadManager", "ad is not native ad when cancel download");
        }
    }

    @GlobalApi
    public String getAppStatus(Context context, NativeAd nativeAd) {
        String str;
        IAppDownloadManager iAppDownloadManager = this.B;
        if (iAppDownloadManager != null && (nativeAd instanceof bw)) {
            n g6 = iAppDownloadManager.g(context, ((bw) nativeAd).Code());
            if (g6 == null) {
                str = "appStatus obj is null when get app status";
            } else {
                return g6.name();
            }
        } else {
            str = "ad is not native ad when get app status";
        }
        ex.V("NativeAppDownloadManager", str);
        return "DOWNLOAD";
    }

    @GlobalApi
    public int getDownloadProgress(Context context, NativeAd nativeAd) {
        IAppDownloadManager iAppDownloadManager = this.B;
        if (iAppDownloadManager != null && (nativeAd instanceof bw)) {
            return iAppDownloadManager.c(((bw) nativeAd).Code());
        }
        ex.V("NativeAppDownloadManager", "ad is not native ad when get download progress");
        return 0;
    }

    @GlobalApi
    public void pauseDownload(Context context, NativeAd nativeAd) {
        IAppDownloadManager iAppDownloadManager = this.B;
        if (iAppDownloadManager != null && (nativeAd instanceof bw)) {
            iAppDownloadManager.f(context, ((bw) nativeAd).Code());
        } else {
            ex.V("NativeAppDownloadManager", "appDownloadManager is null or nativeAd is invalid when resume download");
        }
    }

    @GlobalApi
    public int resumeDownload(Context context, NativeAd nativeAd) {
        IAppDownloadManager iAppDownloadManager = this.B;
        if (iAppDownloadManager != null && (nativeAd instanceof bw)) {
            return iAppDownloadManager.d(context, ((bw) nativeAd).Code());
        }
        ex.V("NativeAppDownloadManager", "appDownloadManager is null or nativeAd is invalid when resume download");
        return -1;
    }

    @GlobalApi
    public void setAppDownloadListener(final AppDownloadListener appDownloadListener) {
        this.Z.setAppDownloadListener(new com.huawei.openalliance.ad.inter.listeners.AppDownloadListener() { // from class: com.huawei.hms.ads.nativead.NativeAppDownloadManager.1
            @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
            public void Code(AppInfo appInfo) {
            }

            @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
            public void V(AppInfo appInfo) {
                AppDownloadListener appDownloadListener2 = appDownloadListener;
                if (appDownloadListener2 != null && appInfo != null) {
                    appDownloadListener2.onUserCancel(appInfo.q(), appInfo.U());
                }
            }

            @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
            public void Code(AppInfo appInfo, int i10) {
                AppDownloadListener appDownloadListener2 = appDownloadListener;
                if (appDownloadListener2 != null) {
                    appDownloadListener2.onDownloadProgress(i10, appInfo.U());
                }
            }

            @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
            public void Code(n nVar, AppInfo appInfo) {
                if (appDownloadListener != null) {
                    ex.V("NativeAppDownloadManager", "onStatusChanged: " + nVar.toString());
                    ex.V("NativeAppDownloadManager", "onStatusChanged after switch: " + NativeAppDownloadManager.this.Code(nVar));
                    appDownloadListener.onStatusChanged(NativeAppDownloadManager.this.Code(nVar), appInfo.U());
                }
            }

            @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
            public void Code(String str) {
                AppDownloadTask u2;
                AppInfo D;
                if (appDownloadListener == null || (u2 = a.t().u(str)) == null || (D = u2.D()) == null) {
                    return;
                }
                appDownloadListener.onAppOpen(str, D.U());
            }
        });
    }

    @GlobalApi
    public int startDownload(Context context, NativeAd nativeAd) {
        IAppDownloadManager iAppDownloadManager = this.B;
        if (iAppDownloadManager != null && (nativeAd instanceof bw)) {
            return iAppDownloadManager.b(context, ((bw) nativeAd).Code());
        }
        ex.V("NativeAppDownloadManager", "appDownloadManager is null or nativeAd is invalid when start download");
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Code(n nVar) {
        if (nVar == null) {
            return "DOWNLOAD";
        }
        n nVar2 = nVar == n.DOWNLOADED ? n.INSTALL : nVar;
        if (nVar == n.RESUME) {
            nVar2 = n.DOWNLOADING;
        }
        return nVar2.toString();
    }
}
