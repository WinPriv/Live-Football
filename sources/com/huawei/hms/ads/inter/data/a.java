package com.huawei.hms.ads.inter.data;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.hms.ads.e;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.f;
import com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener;
import com.huawei.hms.ads.je;
import com.huawei.hms.ads.reward.RewardAdListener;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener;
import gb.r0;
import ha.i;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends com.huawei.openalliance.ad.inter.data.a implements IInterstitialAd {
    private transient INonwifiActionListener B;
    private RewardAdListener C;
    private List<ImageInfo> F;
    private VideoInfo S;
    private transient IInterstitialAdStatusListener Z;

    public a(AdContentData adContentData) {
        super(adContentData);
    }

    private void V(Context context) {
        ex.V("InnerInterstitialAd", "startInterstitialViaAidl");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content_id", L());
            jSONObject.put("sdk_version", "13.4.65.300");
            jSONObject.put("request_id", i_());
            jSONObject.put(ba.f22057e, p());
            jSONObject.put(ba.N, G());
            jSONObject.put(ba.O, H());
            jSONObject.put("slotid", n());
            if (this.B != null) {
                if (W() != null) {
                    jSONObject.put("reward_key_nonwifi_action_play", this.B.Code(r2.x()));
                }
                AppInfo w10 = w();
                if (w10 != null) {
                    jSONObject.put("reward_key_nonwifi_action_download", this.B.Code(w10, w10.k()));
                }
            }
            AppInfo w11 = w();
            if (w11 != null && !TextUtils.isEmpty(w11.U())) {
                jSONObject.put("unique_id", w11.U());
            }
            i.e(context).d("interstitial_ad_show", jSONObject.toString(), null, null);
        } catch (JSONException e10) {
            ex.I("InnerInterstitialAd", "startInterstitialViaAidl, e:".concat(e10.getClass().getSimpleName()));
        }
    }

    private VideoInfo W() {
        MetaData h_;
        if (this.S == null && (h_ = h_()) != null) {
            this.S = h_.x();
        }
        return this.S;
    }

    public RewardAdListener Code() {
        return this.C;
    }

    public IInterstitialAdStatusListener I() {
        return this.Z;
    }

    @Override // com.huawei.hms.ads.inter.data.IInterstitialAd
    public void setNonwifiActionListener(INonwifiActionListener iNonwifiActionListener) {
        this.B = iNonwifiActionListener;
    }

    @Override // com.huawei.hms.ads.inter.data.IInterstitialAd
    public void setRewardAdListener(RewardAdListener rewardAdListener) {
        this.C = rewardAdListener;
    }

    @Override // com.huawei.hms.ads.inter.data.IInterstitialAd
    public void show(Context context, IInterstitialAdStatusListener iInterstitialAdStatusListener) {
        if (context == null) {
            return;
        }
        V(true);
        Code(iInterstitialAdStatusListener);
        e.Code(context).Code();
        f.Code(this);
        AppInfo w10 = w();
        if (w10 != null) {
            ex.Code("InnerInterstitialAd", "appName:" + w10.L() + ", uniqueId:" + v() + ", appuniqueId:" + w10.U());
        }
        if (context instanceof Activity) {
            Code((Activity) context);
            je.Code(context).V(context);
        } else {
            V(context);
        }
    }

    private void Code(Activity activity) {
        ex.V("InnerInterstitialAd", "startInterstitialViaActivity");
        Intent intent = new Intent();
        intent.setAction(w.aj);
        intent.setPackage(r0.n(activity));
        intent.putExtra("content_id", L());
        intent.putExtra("sdk_version", "13.4.65.300");
        intent.putExtra("request_id", i_());
        intent.putExtra(ba.f22057e, p());
        intent.putExtra(ba.N, G());
        intent.putExtra(ba.O, H());
        intent.putExtra("slotid", n());
        if (this.B != null) {
            if (W() != null) {
                intent.putExtra("reward_key_nonwifi_action_play", this.B.Code(r1.x()));
            }
            AppInfo w10 = w();
            if (w10 != null) {
                intent.putExtra("reward_key_nonwifi_action_download", this.B.Code(w10, w10.k()));
            }
        }
        AppInfo w11 = w();
        if (w11 != null && !TextUtils.isEmpty(w11.U())) {
            intent.putExtra("unique_id", w11.U());
        }
        intent.setClipData(w.cH);
        activity.startActivityForResult(intent, 1);
    }

    @Override // com.huawei.openalliance.ad.inter.data.a, com.huawei.hms.ads.inter.data.IInterstitialAd
    public boolean V() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            this.S = adContentData.Y0();
            MetaData K = this.Code.K();
            if (K != null) {
                this.F = K.E();
            }
            if (this.Code.O0() == 9) {
                return this.S != null;
            }
            if (this.Code.O0() == 2 || this.Code.O0() == 4) {
                return !n.h(this.F);
            }
        }
        return false;
    }

    private void Code(IInterstitialAdStatusListener iInterstitialAdStatusListener) {
        this.Z = iInterstitialAdStatusListener;
    }
}
