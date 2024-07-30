package com.huawei.openalliance.ad.inter.data;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.ads.AdvertiserInfo;
import com.huawei.hms.ads.ep;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jh;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;
import com.huawei.openalliance.ad.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import gb.r0;
import gb.u;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j extends c implements e {
    public boolean A;
    public boolean E;
    public int G;
    public String H;
    public NativeAdConfiguration J;

    @y9.b
    public long K;
    public final Integer L;

    /* renamed from: s, reason: collision with root package name */
    public String f22272s;

    /* renamed from: t, reason: collision with root package name */
    public String f22273t;

    /* renamed from: u, reason: collision with root package name */
    public h f22274u;

    /* renamed from: v, reason: collision with root package name */
    public List<h> f22275v;

    /* renamed from: w, reason: collision with root package name */
    public p f22276w;

    /* renamed from: x, reason: collision with root package name */
    public List<String> f22277x;
    public List<String> y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22278z;

    public j(AdContentData adContentData) {
        super(adContentData);
        this.f22278z = false;
        this.A = false;
        this.E = false;
        this.G = 0;
        this.L = Integer.valueOf(adContentData.f0());
    }

    @Override // com.huawei.openalliance.ad.inter.data.e
    public final p B() {
        AdContentData adContentData = this.Code;
        if (adContentData != null && adContentData.Y0() != null) {
            if (this.f22276w == null) {
                p pVar = new p(this.Code.Y0());
                this.f22276w = pVar;
                pVar.E = this.Code.v();
            }
            return this.f22276w;
        }
        return null;
    }

    public final List<AdvertiserInfo> E() {
        if (this.Code != null && b0()) {
            return this.Code.i0();
        }
        return null;
    }

    public final String F() {
        MetaData K;
        if (this.f22273t == null && (K = this.Code.K()) != null) {
            this.f22273t = gb.p.j(K.k());
        }
        return this.f22273t;
    }

    @Override // com.huawei.openalliance.ad.inter.data.e
    public final h I() {
        MetaData h_;
        List<ImageInfo> p10;
        if (this.f22274u == null && (h_ = h_()) != null && (p10 = h_.p()) != null && !p10.isEmpty()) {
            this.f22274u = new h(p10.get(0));
        }
        return this.f22274u;
    }

    public final void S(long j10) {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            adContentData.b0(j10);
        }
    }

    public final void V(Context context) {
        ex.V("INativeAd", "jump to landing details start.");
        if (context != null) {
            AdContentData m10 = m();
            if (m10 != null && m10.c1() != null && !TextUtils.isEmpty(m10.c1().h0())) {
                try {
                    Intent intent = new Intent();
                    intent.putExtra("content_id", m10.L());
                    intent.putExtra("templateId", m10.e0());
                    intent.putExtra("slotid", m10.D());
                    intent.putExtra("apiVer", m10.f0());
                    intent.putExtra(ba.y, context.getPackageName());
                    intent.putExtra(ba.f22057e, m10.u());
                    intent.putExtra("request_id", m10.E());
                    intent.setAction(w.cO);
                    intent.setPackage(r0.n(context));
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    AppInfo c12 = m10.c1();
                    if (c12 != null) {
                        intent.putExtra("unique_id", c12.U());
                    }
                    u.f(context, intent);
                    return;
                } catch (Throwable th) {
                    ex.Z("INativeAd", "start ac failed: %s", th.getClass().getSimpleName());
                    return;
                }
            }
            ex.V("INativeAd", "jump to landing details detailUrl is empty.");
        }
    }

    public final HashMap X() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("appId", u());
        MetaData h_ = h_();
        if (h_ != null) {
            str = h_.L();
        } else {
            str = "";
        }
        hashMap.put("thirdId", str);
        if (B() == null) {
            return hashMap;
        }
        hashMap.put(ba.f22064m, this.H);
        int i10 = B().y;
        ex.V("INativeAd", "buildLinkedAdConfig, set progress from native view " + i10);
        hashMap.put(ba.f22065n, String.valueOf(Y()));
        if (B().E) {
            str2 = ep.Code;
        } else {
            str2 = ep.V;
        }
        hashMap.put(ba.f22067q, str2);
        hashMap.put(ba.f22066p, B().f22309z);
        hashMap.put(ba.o, String.valueOf(i10));
        return hashMap;
    }

    public final int Y() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            this.G = adContentData.x();
        }
        return this.G;
    }

    @Override // com.huawei.openalliance.ad.inter.data.e
    public final List<h> Z() {
        MetaData h_;
        if (this.f22275v == null && (h_ = h_()) != null) {
            this.f22275v = c.Code(h_.E());
        }
        return this.f22275v;
    }

    public final String a0() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.v0();
        }
        return null;
    }

    public final boolean b0() {
        if (this.Code != null) {
            return !androidx.transition.n.h(r0.i0());
        }
        return false;
    }

    public final HashMap c0() {
        AdContentData adContentData = this.Code;
        if (adContentData == null) {
            return null;
        }
        List<ImpEX> E0 = adContentData.E0();
        List<ContentExt> F0 = this.Code.F0();
        HashMap hashMap = new HashMap();
        if (!androidx.transition.n.h(F0)) {
            for (ContentExt contentExt : F0) {
                hashMap.put(contentExt.k(), gb.p.j(contentExt.p()));
            }
        }
        if (!androidx.transition.n.h(E0)) {
            for (ImpEX impEX : E0) {
                hashMap.put(impEX.k(), gb.p.j(impEX.p()));
            }
        }
        return hashMap;
    }

    @Override // com.huawei.openalliance.ad.inter.data.e
    public final boolean d_() {
        AdContentData adContentData = this.Code;
        if (adContentData == null || adContentData.s0() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.huawei.openalliance.ad.inter.data.e
    public final List<FeedbackInfo> f_() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            return adContentData.d0();
        }
        return null;
    }

    public final void l(String str) {
        this.H = str;
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            adContentData.y(str);
        }
    }

    public final boolean o(Context context, Bundle bundle) {
        if (context == null) {
            return false;
        }
        fb.m k10 = androidx.activity.n.k(context, m(), X());
        boolean a10 = k10.a();
        if (a10) {
            r(context, k10.c(), bundle);
        }
        return a10;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c
    public final String p() {
        return this.H;
    }

    public final void r(Context context, String str, Bundle bundle) {
        String jSONObject;
        boolean z10;
        ex.V("INativeAd", "api report click event.");
        if (bundle == null) {
            jSONObject = null;
        } else {
            jSONObject = gb.p.k(bundle).toString();
        }
        AdContentData m10 = m();
        String k10 = a0.a.k(context);
        JSONObject k11 = gb.p.k(bundle);
        Integer valueOf = Integer.valueOf(k11.optInt(ba.aj, -111111));
        Integer valueOf2 = Integer.valueOf(k11.optInt(ba.ak, -111111));
        String optString = k11.optString(ba.al, "");
        Float c10 = gb.p.c(k11.optString(ba.ap, "-111111"), Float.valueOf(-111111.0f));
        Integer valueOf3 = Integer.valueOf(k11.optInt(ba.an, -111111));
        Integer valueOf4 = Integer.valueOf(k11.optInt(ba.ao, -111111));
        Integer valueOf5 = Integer.valueOf(k11.optInt(ba.am, -111111));
        if (valueOf.intValue() == -111111) {
            valueOf = null;
        }
        if (valueOf2.intValue() == -111111) {
            valueOf2 = null;
        }
        if (!TextUtils.isEmpty(optString) && Pattern.matches("^[0-9\\*\\+\\-\\.]*$", optString) && optString.length() < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            optString = null;
        }
        if (c10.floatValue() == -111111.0f) {
            c10 = null;
        }
        if (valueOf3.intValue() == -111111) {
            valueOf3 = null;
        }
        if (valueOf4.intValue() == -111111) {
            valueOf4 = null;
        }
        if (valueOf5.intValue() == -111111) {
            valueOf5 = null;
        }
        MaterialClickInfo.a aVar = new MaterialClickInfo.a();
        aVar.f22249a = valueOf;
        aVar.f22250b = valueOf2;
        aVar.f22251c = optString;
        aVar.f22254g = c10;
        aVar.f22252d = valueOf5;
        aVar.f22253e = valueOf3;
        aVar.f = valueOf4;
        jh.Code(context, m10, jSONObject, 0, 0, str, 12, k10, new MaterialClickInfo(aVar));
    }

    @Override // com.huawei.openalliance.ad.inter.data.e
    public final List<String> l() {
        AdContentData adContentData;
        List<String> R0;
        if (this.f22277x == null && (adContentData = this.Code) != null && (R0 = adContentData.R0()) != null && R0.size() > 0) {
            this.f22277x = R0;
        }
        return this.f22277x;
    }

    @Override // com.huawei.openalliance.ad.inter.data.e
    public final List<String> o() {
        AdContentData adContentData;
        if (this.y == null && (adContentData = this.Code) != null) {
            List<String> U = adContentData.U();
            if (!androidx.transition.n.h(U) && U.size() > 0) {
                this.y = U;
            }
        }
        return this.y;
    }
}
