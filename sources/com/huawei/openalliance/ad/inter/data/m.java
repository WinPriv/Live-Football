package com.huawei.openalliance.ad.inter.data;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.ads.dg;
import com.huawei.hms.ads.di;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.je;
import com.huawei.hms.ads.jf;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.w;
import gb.r0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m extends a implements g {
    public boolean A;

    /* renamed from: s, reason: collision with root package name */
    public VideoInfo f22289s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f22290t;

    /* renamed from: u, reason: collision with root package name */
    public transient ga.e f22291u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f22292v;

    /* renamed from: w, reason: collision with root package name */
    public final RewardItem f22293w;

    /* renamed from: x, reason: collision with root package name */
    public ga.f f22294x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22295z;

    public m(AdContentData adContentData) {
        super(adContentData);
        this.f22290t = false;
        this.y = 1;
        this.f22295z = true;
        this.A = true;
        if (adContentData.M() != null && adContentData.H() != 0) {
            this.f22293w = new RewardItem(adContentData.M(), adContentData.H());
        }
    }

    @Override // com.huawei.openalliance.ad.inter.data.a
    public final RewardItem B() {
        return this.f22293w;
    }

    @Override // com.huawei.openalliance.ad.inter.data.a
    public final boolean C() {
        return this.f22292v;
    }

    @Override // com.huawei.openalliance.ad.inter.data.a
    public final void Code(boolean z10) {
        this.f22292v = z10;
    }

    public final void V(Context context) {
        ex.V("RewardAd", "startRewardViaAidl");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content_id", L());
            jSONObject.put("slotid", n());
            jSONObject.put("sdk_version", "13.4.65.300");
            jSONObject.put("request_id", i_());
            jSONObject.put(ba.f22060i, this.y);
            jSONObject.put(ba.f22061j, this.f22295z);
            jSONObject.put(ba.f22057e, p());
            jSONObject.put(ba.N, G());
            jSONObject.put(ba.J, this.A);
            jSONObject.put(ba.O, H());
            AppInfo w10 = w();
            if (w10 != null && !TextUtils.isEmpty(w10.U())) {
                jSONObject.put("unique_id", w10.U());
            }
            ha.i.e(context).d("showReward", jSONObject.toString(), null, null);
        } catch (JSONException e10) {
            ex.I("RewardAd", "startRewardViaAidl, e:".concat(e10.getClass().getSimpleName()));
        }
    }

    @Override // com.huawei.openalliance.ad.inter.data.a
    public final boolean Z() {
        return this.f22290t;
    }

    public final void l(Context context, ga.e eVar) {
        ex.V("RewardAd", "showAd");
        if (context == null) {
            return;
        }
        this.f22291u = eVar;
        di.Code(context).Code();
        dg.Code(this);
        AppInfo w10 = w();
        if (w10 != null) {
            ex.Code("RewardAd", "appName:" + w10.L() + ", uniqueId:" + v() + ", appuniqueId:" + w10.U());
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            ex.V("RewardAd", "startRewardViaActivity");
            Intent intent = new Intent();
            intent.setAction(w.af);
            intent.setPackage(r0.n(activity));
            intent.putExtra("content_id", L());
            intent.putExtra("slotid", n());
            intent.putExtra("sdk_version", "13.4.65.300");
            intent.putExtra("request_id", i_());
            intent.putExtra(ba.f22060i, this.y);
            intent.putExtra(ba.f22061j, this.f22295z);
            intent.putExtra(ba.f22057e, p());
            intent.putExtra(ba.J, this.A);
            intent.putExtra(ba.N, G());
            intent.putExtra(ba.O, H());
            String a12 = this.Code.a1();
            if (r0.a(activity) && a12 != null && jf.F(a12)) {
                intent.addFlags(268959744);
                intent.putExtra(ba.ag, true);
            }
            AppInfo w11 = w();
            if (w11 != null && !TextUtils.isEmpty(w11.U())) {
                intent.putExtra("unique_id", w11.U());
            }
            intent.setClipData(w.cH);
            activity.startActivityForResult(intent, 1);
            je.Code(context).V(context);
            return;
        }
        V(context);
    }

    @Override // com.huawei.openalliance.ad.inter.data.a
    public final void V(boolean z10) {
        this.f22290t = z10;
    }

    @Override // com.huawei.openalliance.ad.inter.data.a, com.huawei.hms.ads.inter.data.IInterstitialAd
    public final boolean V() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            this.f22289s = adContentData.Y0();
        }
        return this.f22289s != null;
    }
}
