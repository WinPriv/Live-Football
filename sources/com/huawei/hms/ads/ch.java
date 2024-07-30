package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.base.R;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import gb.b0;

/* loaded from: classes2.dex */
public class ch {
    private static final String Code = "AppDownloadUtils";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public static da.n Code(AppDownloadTask appDownloadTask) {
        int a10 = appDownloadTask.a();
        da.n nVar = da.n.DOWNLOAD;
        da.n nVar2 = da.n.PAUSE;
        switch (a10) {
            case 0:
                return nVar2;
            case 1:
                return da.n.WAITING;
            case 2:
                return da.n.DOWNLOADING;
            case 3:
                return da.n.INSTALL;
            case 4:
                if (appDownloadTask.k() <= 0) {
                    return nVar;
                }
                return nVar2;
            case 5:
                return da.n.INSTALLING;
            case 6:
                return da.n.INSTALLED;
            default:
                return nVar;
        }
    }

    public static String Code(Context context, com.huawei.openalliance.ad.inter.data.AppInfo appInfo) {
        return (context == null || appInfo == null) ? "" : Code(appInfo.b0(), context.getString(R.string.hiad_download_download));
    }

    public static String Code(Context context, com.huawei.openalliance.ad.inter.data.AppInfo appInfo, int i10) {
        int i11;
        if (context == null || appInfo == null) {
            return "";
        }
        String c02 = appInfo.c0();
        if (!Code(appInfo)) {
            i11 = R.string.hiad_download_open;
        } else {
            if (i10 == 1) {
                return context.getString(R.string.hiad_app_preordered);
            }
            i11 = R.string.hiad_app_preorder;
        }
        return Code(c02, context.getString(i11));
    }

    public static String Code(Context context, com.huawei.openalliance.ad.inter.data.AppInfo appInfo, String str) {
        return (appInfo == null || context == null || b0.j(context, appInfo.q()) == null || !TextUtils.isEmpty(appInfo.A())) ? str : context.getString(R.string.hiad_download_open);
    }

    public static String Code(String str, String str2) {
        return (TextUtils.isEmpty(str) || (!(gb.u.a() && "zh-CN".equalsIgnoreCase(gb.z.i())) && gb.u.a())) ? str2 : str;
    }

    public static boolean Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo) {
        return (appInfo == null || TextUtils.isEmpty(appInfo.A())) ? false : true;
    }
}
