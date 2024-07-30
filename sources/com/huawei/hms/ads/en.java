package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener;
import com.huawei.hms.ads.jsb.inner.data.JsbCallBackData;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class en extends ag {
    public en() {
        super(aj.f21545k);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, final String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        Code(context, str, true, new ac() { // from class: com.huawei.hms.ads.en.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                if (adContentData == null) {
                    ag.Code(remoteCallResultCallback, en.this.Code, 3002, null, true);
                    ex.Code("JsbStartInterstitialAdActivity", "adContentData is null, start activity failed");
                    return;
                }
                com.huawei.hms.ads.inter.data.a aVar = new com.huawei.hms.ads.inter.data.a(adContentData);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString(com.huawei.openalliance.ad.constant.av.f22043t);
                    String optString2 = jSONObject.optString("userId");
                    if (!TextUtils.isEmpty(optString)) {
                        aVar.Code(optString);
                    }
                    if (!TextUtils.isEmpty(optString2)) {
                        aVar.V(optString2);
                    }
                } catch (Throwable unused) {
                    ex.I("JsbStartInterstitialAdActivity", "content parse error");
                }
                aVar.show(en.this.Code(context), new a(remoteCallResultCallback, en.this.Code));
                en.this.V(remoteCallResultCallback, false);
            }
        });
    }

    /* loaded from: classes2.dex */
    public static class a implements IInterstitialAdStatusListener {
        private String Code;
        private RemoteCallResultCallback<String> V;

        public a(RemoteCallResultCallback<String> remoteCallResultCallback, String str) {
            this.V = remoteCallResultCallback;
            this.Code = str;
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onAdClicked() {
            ag.Code(this.V, this.Code, 1000, new JsbCallBackData(null, false, ah.f21535b));
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onAdClosed() {
            ag.Code(this.V, this.Code, 1000, new JsbCallBackData(null, false, ah.F));
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onAdCompleted() {
            ag.Code(this.V, this.Code, 1000, new JsbCallBackData(null, false, ah.f21534a));
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onAdError(int i10, int i11) {
            ag.Code(this.V, this.Code, 1000, new JsbCallBackData(null, false, ah.L));
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onAdShown() {
            ag.Code(this.V, this.Code, 1000, new JsbCallBackData(null, false, ah.D));
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onLeftApp() {
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onRewarded() {
        }
    }
}
