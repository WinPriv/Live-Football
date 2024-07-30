package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ae extends ag {
    private static final String Z = "JsbAdClick";

    public ae() {
        super(aj.C);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, final String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        ex.Code(Z, "start");
        final JSONObject jSONObject = new JSONObject(str);
        final int optInt = jSONObject.optInt("adType", -1);
        Code(context, str, true, new ac() { // from class: com.huawei.hms.ads.ae.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                int i10;
                String str2;
                String str3;
                if (adContentData != null) {
                    MetaData K = adContentData.K();
                    if (K != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("appId", K.a());
                        hashMap.put("thirdId", K.L());
                        if (optInt == 3 && adContentData.Y0() != null) {
                            VideoInfo Y0 = adContentData.Y0();
                            if (Y0 != null) {
                                if (!TextUtils.equals(Y0.k(), "y")) {
                                    TextUtils.equals(Y0.k(), "a");
                                }
                                str2 = Y0.p();
                                if (Y0.A() != null) {
                                    Y0.A().intValue();
                                }
                                if (Y0.C() != null) {
                                    Y0.C().intValue();
                                }
                                TextUtils.equals(Y0.k(), "a");
                                "y".equalsIgnoreCase(Y0.F());
                                Float E = Y0.E();
                                if (E != null) {
                                    E.floatValue();
                                }
                            } else {
                                str2 = "n";
                            }
                            hashMap.put(com.huawei.openalliance.ad.constant.ba.f22064m, adContentData.u());
                            hashMap.put(com.huawei.openalliance.ad.constant.ba.f22065n, String.valueOf(adContentData.x()));
                            if (adContentData.v()) {
                                str3 = ep.Code;
                            } else {
                                str3 = ep.V;
                            }
                            hashMap.put(com.huawei.openalliance.ad.constant.ba.f22067q, str3);
                            hashMap.put(com.huawei.openalliance.ad.constant.ba.f22066p, str2);
                        }
                        fb.m k10 = androidx.activity.n.k(ae.this.Code(context), adContentData, hashMap);
                        if (k10.a()) {
                            if (ae.this.Code(adContentData)) {
                                adContentData.q(ae.this.S(jSONObject.optString(com.huawei.openalliance.ad.constant.av.aP)));
                                ae aeVar = ae.this;
                                aeVar.Code(k10, context, adContentData, aeVar.C(str), ae.this.B(str));
                            } else {
                                ex.V(ae.Z, "ad is not in whitelist");
                                i10 = br.f;
                            }
                        } else {
                            ex.Code(ae.Z, "fail open land page");
                            i10 = br.f21563e;
                        }
                    }
                    i10 = 1000;
                } else {
                    ex.Code(ae.Z, "ad not exist");
                    i10 = 3002;
                }
                ag.Code(remoteCallResultCallback, ae.this.Code, i10, null, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(fb.m mVar, Context context, AdContentData adContentData, MaterialClickInfo materialClickInfo, Integer num) {
        Integer valueOf = Integer.valueOf(num == null ? 12 : num.intValue());
        ex.V(Z, "source = %s", valueOf);
        jh.Code(context, adContentData, (String) null, 0, 0, mVar.c(), valueOf.intValue(), a0.a.k(context), materialClickInfo);
    }
}
