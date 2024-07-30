package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.jsb.inner.data.JsbCallBackData;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class eo extends ag {

    /* loaded from: classes2.dex */
    public static class a implements ga.e {
        RewardItem Code;
        private RemoteCallResultCallback<String> I;
        private String V;

        public a(RemoteCallResultCallback<String> remoteCallResultCallback, String str, RewardItem rewardItem) {
            this.Code = rewardItem;
            this.I = remoteCallResultCallback;
            this.V = str;
        }

        @Override // ga.e
        public void B() {
            ag.Code(this.I, this.V, 1000, new JsbCallBackData(this.Code, false, ah.Z));
        }

        @Override // ga.e
        public void Code() {
            ag.Code(this.I, this.V, 1000, new JsbCallBackData(null, false, ah.I));
        }

        @Override // ga.e
        public void I() {
            ag.Code(this.I, this.V, 1000, new JsbCallBackData(null, false, ah.S));
        }

        @Override // ga.e
        public void V() {
            ag.Code(this.I, this.V, 1000, new JsbCallBackData(null, false, ah.C));
        }

        @Override // ga.e
        public void Z() {
            ag.Code(this.I, this.V, 1000, new JsbCallBackData(null, false, ah.V));
        }

        @Override // ga.e
        public void Code(int i10, int i11) {
            ag.Code(this.I, this.V, 1000, new JsbCallBackData(null, false, ah.B));
        }
    }

    public eo() {
        super(aj.f21544j);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, final String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        Code(context, str, true, new ac() { // from class: com.huawei.hms.ads.eo.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                if (adContentData == null) {
                    ex.V("JsbStartRewardAdActivity", "adContentData is null, start activity failed");
                    ag.Code(remoteCallResultCallback, eo.this.Code, 3002, null, true);
                    return;
                }
                com.huawei.openalliance.ad.inter.data.m mVar = new com.huawei.openalliance.ad.inter.data.m(adContentData);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString(com.huawei.openalliance.ad.constant.av.f22043t);
                    String optString2 = jSONObject.optString("userId");
                    boolean optBoolean = jSONObject.optBoolean(com.huawei.openalliance.ad.constant.av.aw, false);
                    int optInt = jSONObject.optInt("audioFocusType", 1);
                    if (!TextUtils.isEmpty(optString)) {
                        mVar.Code(optString);
                    }
                    if (!TextUtils.isEmpty(optString2)) {
                        mVar.V(optString2);
                    }
                    if (optInt == 1 || optInt == 2 || optInt == 0) {
                        mVar.y = optInt;
                    }
                    mVar.f22295z = optBoolean;
                } catch (Throwable unused) {
                    ex.I("JsbStartRewardAdActivity", "content parse error");
                }
                mVar.l(eo.this.Code(context), new a(remoteCallResultCallback, eo.this.Code, mVar.f22293w));
                eo.this.V(remoteCallResultCallback, false);
            }
        });
    }
}
