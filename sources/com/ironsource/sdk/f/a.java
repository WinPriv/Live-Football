package com.ironsource.sdk.f;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.g.d;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26461a = true;

    /* renamed from: b, reason: collision with root package name */
    public IronSourceError f26462b = null;

    /* renamed from: com.ironsource.sdk.f.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0342a {

        /* renamed from: a, reason: collision with root package name */
        public String f26463a;

        /* renamed from: b, reason: collision with root package name */
        public String f26464b;

        /* renamed from: c, reason: collision with root package name */
        public String f26465c;

        public static C0342a a(d.e eVar) {
            String str;
            C0342a c0342a = new C0342a();
            if (eVar == d.e.RewardedVideo) {
                c0342a.f26463a = "showRewardedVideo";
                c0342a.f26464b = "onShowRewardedVideoSuccess";
                str = "onShowRewardedVideoFail";
            } else if (eVar == d.e.Interstitial) {
                c0342a.f26463a = "showInterstitial";
                c0342a.f26464b = "onShowInterstitialSuccess";
                str = "onShowInterstitialFail";
            } else {
                if (eVar == d.e.OfferWall) {
                    c0342a.f26463a = "showOfferWall";
                    c0342a.f26464b = "onShowOfferWallSuccess";
                    str = "onInitOfferWallFail";
                }
                return c0342a;
            }
            c0342a.f26465c = str;
            return c0342a;
        }
    }

    public void a(IronSourceError ironSourceError) {
        this.f26461a = false;
        this.f26462b = ironSourceError;
    }

    public IronSourceError b() {
        return this.f26462b;
    }

    public String toString() {
        StringBuilder sb2;
        if (a()) {
            sb2 = new StringBuilder("valid:");
            sb2.append(this.f26461a);
        } else {
            sb2 = new StringBuilder("valid:");
            sb2.append(this.f26461a);
            sb2.append(", IronSourceError:");
            sb2.append(this.f26462b);
        }
        return sb2.toString();
    }

    public boolean a() {
        return this.f26461a;
    }
}
