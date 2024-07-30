package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.base.R;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.l0;

/* loaded from: classes2.dex */
public class dl extends dk {
    private static final String B = "117";
    private static final String I = "115";
    private static final String V = "ConfirmDownloadAlertStrategy";
    private static final String Z = "116";

    /* loaded from: classes2.dex */
    public static class a implements RemoteCallResultCallback<String> {
        private a() {
        }

        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public void onRemoteCallResult(String str, CallResult<String> callResult) {
            if (callResult.getCode() != -1) {
                ex.V(dl.V, "confirm reminder reject");
            }
        }
    }

    public dl(Context context) {
        super(context);
    }

    private void Code(final com.huawei.openalliance.ad.inter.data.AppInfo appInfo, final AdContentData adContentData) {
        ex.V(V, "showConfirmDownloadAlert, context:" + Code());
        Code(I, adContentData);
        Context Code = Code();
        l0.b(Code, "", Code.getString(R.string.hiad_confirm_download_app), Code.getString(R.string.hiad_download_install), Code.getString(R.string.hiad_dialog_cancel), new l0.a() { // from class: com.huawei.hms.ads.dl.1
            @Override // gb.l0.a
            public void Code() {
                dl.this.Code(dl.Z, adContentData);
                dl.this.Code(appInfo);
            }

            @Override // gb.l0.a
            public void V() {
                dl.this.Code(dl.B, adContentData);
                dl.this.V(appInfo);
            }
        });
    }

    @Override // com.huawei.hms.ads.dk
    public void Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo, AdContentData adContentData, long j10) {
        if (appInfo != null && adContentData != null) {
            Code(appInfo, adContentData);
        } else {
            ex.V(V, "appInfo or contentRecord is empty");
            V(appInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(String str, AdContentData adContentData) {
        j7.r.f(this.Code, str, adContentData, new a(), String.class);
    }
}
