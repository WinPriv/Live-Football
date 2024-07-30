package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ee extends ag {
    public ee() {
        super(aj.F);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        if (ex.Code()) {
            ex.Code("JsbClickComplianceEle", "start");
        }
        final String optString = new JSONObject(str).optString(com.huawei.openalliance.ad.constant.av.aM, "");
        Code(context, str, true, new ac() { // from class: com.huawei.hms.ads.ee.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                String str2;
                int i10 = 3002;
                if (adContentData != null) {
                    com.huawei.openalliance.ad.inter.data.AppInfo c12 = adContentData.c1();
                    if (c12 != null) {
                        String str3 = optString;
                        str3.getClass();
                        char c10 = 65535;
                        switch (str3.hashCode()) {
                            case -1891164985:
                                if (str3.equals("privacyUrl")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -1431863008:
                                if (str3.equals("permissionUrl")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -262766019:
                                if (str3.equals("appDetailUrl")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                                c12.Code(context);
                                break;
                            case 1:
                                c12.F(context);
                                break;
                            case 2:
                                new com.huawei.openalliance.ad.inter.data.j(adContentData).V(ee.this.Code(context));
                                break;
                        }
                        i10 = 1000;
                        ag.Code(remoteCallResultCallback, ee.this.Code, i10, null, true);
                    }
                    str2 = "appInfo not exist";
                } else {
                    str2 = "ad not exist";
                }
                ex.Code("JsbClickComplianceEle", str2);
                ag.Code(remoteCallResultCallback, ee.this.Code, i10, null, true);
            }
        });
    }
}
