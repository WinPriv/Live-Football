package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.CallResult;
import ha.c;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class fq extends fo {
    public fq(ka kaVar) {
        super(kaVar);
    }

    private void n() {
        gb.w.a(2000L, new Runnable() { // from class: com.huawei.hms.ads.fq.3
            @Override // java.lang.Runnable
            public void run() {
                fq.this.c();
            }
        });
    }

    @Override // com.huawei.hms.ads.fo
    public String d() {
        return String.valueOf(1);
    }

    @Override // com.huawei.hms.ads.fs
    public void l() {
        ex.V("CacheAdMediator", "start");
        ka g6 = g();
        if (g6 == null) {
            I(-4);
            a();
            return;
        }
        AdContentData adContentData = null;
        if (this.C.Z() != 0) {
            adContentData = (AdContentData) gb.q.a(new Callable<AdContentData>() { // from class: com.huawei.hms.ads.fq.1
                @Override // java.util.concurrent.Callable
                /* renamed from: Code, reason: merged with bridge method [inline-methods] */
                public AdContentData call() {
                    Context context;
                    AdSlotParam b10 = fq.this.b();
                    if (b10 != null && (context = fq.this.f21667e) != null) {
                        CallResult b11 = c.c(context).b(String.class, "queryCacheSplashAd", gb.b.p(b10), false);
                        fq.this.f21666d = (String) b11.getData();
                        return (AdContentData) gb.b.o(AdContentData.class, (String) b11.getData(), new Class[0]);
                    }
                    ex.I("CacheAdMediator", "adslot is null");
                    return null;
                }
            }, null);
        }
        this.B = adContentData;
        this.S = true;
        if (adContentData != null) {
            if (adContentData.O0() == 12) {
                if (Z() == 1 && (I() instanceof ga.i)) {
                    ga.i iVar = (ga.i) I();
                    ji.Code(adContentData);
                    ex.V("CacheAdMediator", "on content find, linkedAd loaded. ");
                    this.F = System.currentTimeMillis();
                    iVar.a();
                    this.L = adContentData;
                    n();
                    B(200);
                    return;
                }
                I(1200);
                m();
                n();
                return;
            }
            if (!V(adContentData)) {
                I(497);
                m();
            }
        } else {
            ex.V("CacheAdMediator", "show sloganView");
            g6.Code(new ko() { // from class: com.huawei.hms.ads.fq.2
                @Override // com.huawei.hms.ads.ko
                public void Code() {
                    ex.V("CacheAdMediator", "on Slogan Reach Min Show Time");
                }

                @Override // com.huawei.hms.ads.ko
                public void V() {
                    ex.V("CacheAdMediator", "on Slogan Show End");
                    gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.fq.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            fq.this.I(498);
                            fq.this.a();
                        }
                    });
                }
            });
        }
        n();
    }

    @Override // com.huawei.hms.ads.fs
    public void m() {
        ex.V("CacheAdMediator", "onAdFailToDisplay");
        a();
    }

    @Override // com.huawei.hms.ads.fo
    public void I(AdContentData adContentData) {
    }
}
