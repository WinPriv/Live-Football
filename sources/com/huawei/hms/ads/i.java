package com.huawei.hms.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;
import com.huawei.openalliance.ad.inter.HiAd;
import gb.h0;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class i implements p, ga.h {
    private static final Integer Z = 2;
    NativeAdConfiguration Code;
    private NativeAd.NativeAdLoadedListener D;
    private String F;
    private AdListener L;
    private Context S;
    fa.o V;

    /* renamed from: a, reason: collision with root package name */
    private boolean f21713a = false;

    /* renamed from: b, reason: collision with root package name */
    private int f21714b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21715c;

    public i(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.S = applicationContext;
        this.F = str;
        this.f21714b = h0.c(applicationContext);
    }

    private void Code(int i10) {
        AdListener adListener = this.L;
        if (adListener != null) {
            adListener.onAdFailed(i10);
        }
    }

    private fa.k V() {
        if (this.V == null) {
            fa.o oVar = new fa.o(this.S, new String[]{this.F});
            oVar.f28272m = 3;
            this.V = oVar;
        }
        return this.V;
    }

    @Override // ga.h
    public void Code(int i10, boolean z10) {
        Code(ci.Code(i10));
        if (z10) {
            this.f21713a = false;
        }
    }

    private void V(AdParam adParam) {
        fa.o oVar;
        if (adParam == null || (oVar = this.V) == null) {
            return;
        }
        RequestOptions Code = cj.Code(adParam.V());
        oVar.f28273n = Code;
        App app = Code.getApp();
        if (app != null) {
            oVar.D = app;
        }
        this.V.f28268i = true;
        Location Code2 = adParam.Code();
        fa.o oVar2 = this.V;
        oVar2.o = Code2;
        oVar2.f28278t = adParam.getKeywords();
        this.V.f28275q = adParam.getGender();
        this.V.f28276r = adParam.getTargetingContentUrl();
        this.V.f28277s = adParam.I();
        this.V.E = adParam.B();
        this.V.G = adParam.C();
        fa.o oVar3 = this.V;
        boolean S = adParam.S();
        oVar3.getClass();
        ex.V("o", "setSupportTptAd: %s", Boolean.valueOf(S));
        oVar3.f28270k = S;
        HiAd.getInstance(this.S).setCountryCode(adParam.Z());
    }

    @Override // com.huawei.hms.ads.p
    public void Code(AdListener adListener) {
        this.L = adListener;
    }

    @Override // com.huawei.hms.ads.p
    public void Code(AdParam adParam) {
        Code(adParam, 1);
    }

    @Override // com.huawei.hms.ads.p
    public void Code(AdParam adParam, int i10) {
        if (TextUtils.isEmpty(this.F)) {
            Code(1);
            ex.V("AdLoadMediator", " ad uint id is invalid.");
            return;
        }
        k.Code().Code(this.S);
        V();
        V(adParam);
        V(this.Code);
        fa.o oVar = this.V;
        if (oVar != null) {
            this.f21713a = true;
            oVar.f28279u = i10;
            oVar.f = this;
            oVar.H = this.f21715c;
            oVar.a(this.f21714b);
        }
    }

    @Override // com.huawei.hms.ads.p
    public void Code(NativeAd.NativeAdLoadedListener nativeAdLoadedListener) {
        this.D = nativeAdLoadedListener;
    }

    @Override // com.huawei.hms.ads.p
    public void Code(NativeAdConfiguration nativeAdConfiguration) {
        this.Code = nativeAdConfiguration;
    }

    @Override // ga.h
    public void Code(Map<String, List<com.huawei.openalliance.ad.inter.data.e>> map, boolean z10) {
        if (z10) {
            this.f21713a = false;
        }
        if (map == null || map.size() <= 0) {
            ex.V("AdLoadMediator", " ads map is empty.");
            Code(3);
            return;
        }
        List<com.huawei.openalliance.ad.inter.data.e> list = map.get(this.F);
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.huawei.openalliance.ad.inter.data.e eVar : list) {
            if (this.D != null && eVar != null) {
                bw bwVar = new bw(this.S, eVar);
                NativeAdConfiguration nativeAdConfiguration = this.Code;
                if (nativeAdConfiguration != null) {
                    bwVar.Code(nativeAdConfiguration.Code());
                }
                bwVar.Code(this.L);
                this.D.onNativeAdLoaded(bwVar);
            }
        }
        AdListener adListener = this.L;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.huawei.hms.ads.p
    public void Code(boolean z10) {
        this.f21715c = z10;
    }

    @Override // com.huawei.hms.ads.p
    public boolean Code() {
        return this.f21713a;
    }

    private void V(NativeAdConfiguration nativeAdConfiguration) {
        if (nativeAdConfiguration != null) {
            fa.o oVar = this.V;
            if (oVar instanceof fa.o) {
                oVar.y = nativeAdConfiguration;
                Integer V = nativeAdConfiguration.V();
                if (V != null) {
                    if (V.intValue() == -1) {
                        this.V.f28280v = 0;
                    } else {
                        this.V.f28280v = Integer.valueOf(Z.intValue() + V.intValue());
                    }
                }
                AdSize adSize = nativeAdConfiguration.getAdSize();
                if (adSize != null) {
                    if (AdSize.AD_SIZE_SMART.equals(adSize)) {
                        this.V.f28280v = 1;
                    } else {
                        this.V.f28280v = 0;
                    }
                    this.V.f28281w = Integer.valueOf(adSize.getWidthPx(this.S));
                    this.V.f28282x = Integer.valueOf(adSize.getHeightPx(this.S));
                }
                int adType = nativeAdConfiguration.getAdType();
                if (-1 != adType) {
                    this.V.f28272m = adType;
                }
            }
        }
    }
}
