package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.analysis.DynamicLoaderAnalysis;
import com.huawei.hms.ads.analysis.IDynamicLoaderAnalysis;
import com.huawei.openalliance.ad.inter.HiAd;

/* loaded from: classes2.dex */
public class da {
    private static final String Code = "DyLoaderAnalysisUtil";
    private static a I = null;
    private static final String V = "decouple";

    /* loaded from: classes2.dex */
    public static class a implements IDynamicLoaderAnalysis {
        private Context Code;

        public a(Context context) {
            this.Code = context.getApplicationContext();
        }

        public void onLoaderException(String str, String str2, int i10, String str3) {
            if (!HiAd.getInstance(this.Code).isEnableUserInfo()) {
                return;
            }
            cz.Code(this.Code, str, str2, i10, str3);
        }

        public void onLoaderSuccess(String str, String str2, long j10) {
            if (!HiAd.getInstance(this.Code).isEnableUserInfo()) {
                return;
            }
            cz.Code(this.Code, str, str2, j10);
        }
    }

    public static void Code(Context context) {
        try {
            if (I == null) {
                I = new a(context);
            }
            DynamicLoaderAnalysis.getInstance().registerDynamicLoaderAnalysis(V, I);
        } catch (Throwable th) {
            ex.I(Code, "init analysis err: %s", th.getClass().getSimpleName());
        }
    }
}
