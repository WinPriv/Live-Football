package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager;
import gb.r0;

/* loaded from: classes2.dex */
public class as extends ag {
    private static final String Z = "CmdBaseDownload";

    public as(String str) {
        super(str);
    }

    public IAppDownloadManager V(Context context, String str) {
        IAppDownloadManager Code = com.huawei.hms.ads.jsb.a.Code(context).Code();
        Code.Code(B(str));
        if (r0.a(context)) {
            Code.a();
        }
        return Code;
    }
}
