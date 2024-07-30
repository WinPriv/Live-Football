package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.c0;

/* loaded from: classes2.dex */
public class fr extends fo {
    boolean f;

    /* renamed from: h, reason: collision with root package name */
    private final int f21685h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21686i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21687j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21688k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21689l;

    public fr(ka kaVar) {
        super(kaVar);
        this.f21685h = hashCode();
        this.f21686i = false;
        this.f21687j = false;
        this.f = false;
        this.f21688k = false;
        this.f21689l = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        Context context;
        ex.V("RealtimeAdMediator", "doOnShowSloganEnd");
        this.f21687j = true;
        if (this.f21688k) {
            ex.V("RealtimeAdMediator", "Ad fails to display or loading timeout, ad dismiss");
            I(499);
            a();
        } else if (!this.f) {
            ex.V(o(), "doOnShowSloganEnd Ad has been loaded, but not shown yet");
            if (this.f21689l && (context = this.f21667e) != null) {
                ha.i.e(context).d("getNormalSplashAd", String.valueOf(this.C.I()), new RemoteCallResultCallback<AdContentData>() { // from class: com.huawei.hms.ads.fr.3
                    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                    public void onRemoteCallResult(String str, final CallResult<AdContentData> callResult) {
                        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.fr.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                fr.this.B = (AdContentData) callResult.getData();
                                fr frVar = fr.this;
                                AdContentData adContentData = frVar.B;
                                String o = frVar.o();
                                if (adContentData != null) {
                                    ex.V(o, "linked loaded, display normal when slogan ends");
                                    fr frVar2 = fr.this;
                                    frVar2.I(frVar2.B);
                                    fr.this.Z(1202);
                                    return;
                                }
                                ex.V(o, "linked loaded, do not call play");
                                fr.this.I(-6);
                                fr.this.a();
                            }
                        });
                    }
                }, AdContentData.class);
            } else if (this.B != null) {
                ex.V(o(), "show splash");
                I(this.B);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        AdContentData adContentData;
        ex.V("RealtimeAdMediator", "doOnReachMinSloganShowTime");
        this.f21686i = true;
        if (!this.f && (adContentData = this.B) != null) {
            I(adContentData);
            return;
        }
        ex.V("RealtimeAdMediator", "doOnReachMinSloganShowTime adFailToDisplay: %s", Boolean.valueOf(this.f21688k));
        if (this.f21688k) {
            ex.V("RealtimeAdMediator", "ad fail to load when reach min slogan show time");
            I(499);
            a();
        }
    }

    @Override // com.huawei.hms.ads.fo
    public void I(AdContentData adContentData) {
        ex.V("RealtimeAdMediator", "on content loaded");
        this.B = adContentData;
        if (adContentData == null) {
            I(494);
            m();
            return;
        }
        ka g6 = g();
        if (g6 == null) {
            I(497);
            m();
            return;
        }
        dd ddVar = new dd(g6.getContext());
        if (ddVar.Code()) {
            I(496);
            m();
            return;
        }
        if (this.B.O0() == 12) {
            if (Z() == 1 && (I() instanceof ga.i)) {
                ex.V("RealtimeAdMediator", "on linked loaded, sloganShowEnd:" + this.f21687j);
                if (!this.f21687j) {
                    ga.i iVar = (ga.i) I();
                    ji.Code(this.B);
                    ex.V(o(), "on content loaded, linkedAd loaded. ");
                    this.F = System.currentTimeMillis();
                    iVar.a();
                    this.L = this.B;
                    this.f21689l = true;
                    B(200);
                    return;
                }
            }
            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.fr.4
                @Override // java.lang.Runnable
                public void run() {
                    fr.this.I(1200);
                    fr.this.m();
                }
            });
            return;
        }
        if (!this.f21686i && !this.f21687j) {
            ex.V("RealtimeAdMediator", "slogan hasn't reach min show time or end, show ad later");
            return;
        }
        if (ddVar.Code()) {
            I(496);
            m();
            return;
        }
        boolean V = V(this.B);
        this.f = true;
        if (!V) {
            V(497);
        }
    }

    @Override // com.huawei.hms.ads.fo
    public String d() {
        return String.valueOf(2);
    }

    @Override // com.huawei.hms.ads.fs
    public void l() {
        ex.V("RealtimeAdMediator", "start");
        ka g6 = g();
        if (g6 == null) {
            I(-4);
            a();
        } else {
            c();
            c0.a(new Runnable() { // from class: com.huawei.hms.ads.fr.1
                @Override // java.lang.Runnable
                public void run() {
                    fr.this.D();
                }
            });
            g6.Code(new ko() { // from class: com.huawei.hms.ads.fr.2
                @Override // com.huawei.hms.ads.ko
                public void Code() {
                    gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.fr.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            fr.this.q();
                        }
                    });
                }

                @Override // com.huawei.hms.ads.ko
                public void V() {
                    gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.fr.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            fr.this.p();
                        }
                    });
                }
            });
            e();
        }
    }

    @Override // com.huawei.hms.ads.fs
    public void m() {
        ex.V("RealtimeAdMediator", "onAdFailToDisplay - reachMinSloganShowTime: %s sloganShowEnd: %s", Boolean.valueOf(this.f21686i), Boolean.valueOf(this.f21687j));
        this.f21688k = true;
        if (this.f21686i || this.f21687j) {
            a();
        }
    }

    public String o() {
        return "RealtimeAdMediator" + this.f21685h;
    }
}
