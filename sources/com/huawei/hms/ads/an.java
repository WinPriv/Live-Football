package com.huawei.hms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.hms.ads.base.R;
import com.huawei.hms.ads.jsb.inner.data.DeviceInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.Locale;

/* loaded from: classes2.dex */
public class an extends ag {
    public static final String Z = "JsbReqSettings";

    public an() {
        super(aj.Code);
    }

    private String V(Context context) {
        Resources resources = context.getResources();
        return "adLabel:" + resources.getString(R.string.hiad_ad_label) + ",download:" + resources.getString(R.string.hiad_download_download) + ",resume:" + resources.getString(R.string.hiad_download_resume) + ",installing:" + resources.getString(R.string.hiad_download_installing) + ",install:" + resources.getString(R.string.hiad_download_install) + ",open:" + resources.getString(R.string.hiad_download_open) + ",whyThisAd:" + resources.getString(R.string.hiad_choices_whythisad) + ",choicesHide:" + resources.getString(R.string.hiad_choices_hide) + ",noInterest:" + resources.getString(R.string.hiad_choices_ad_no_interest) + ",preOrder:" + resources.getString(R.string.hiad_app_preorder) + ",preOrdered:" + resources.getString(R.string.hiad_app_preordered) + ",thinkOfAd:" + resources.getString(R.string.hiad_feedback_think_of_this_ad) + ",detail:" + resources.getString(R.string.hiad_detail);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.Code(cl.Code(context).V());
        int i10 = gb.z.f28648a;
        deviceInfo.Code(Locale.getDefault().getLanguage());
        deviceInfo.V(V(context));
        try {
            ag.Code(remoteCallResultCallback, this.Code, 1000, gb.b.m(deviceInfo), true);
        } catch (IllegalAccessException unused) {
            throw gb.b.i(true, "toJson error", new Object[0]);
        }
    }
}
