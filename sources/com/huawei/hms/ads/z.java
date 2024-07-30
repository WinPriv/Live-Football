package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.instreamad.InstreamAdLoadListener;
import com.huawei.openalliance.ad.inter.HiAd;
import fa.s;
import gb.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class z implements y, ga.l {
    private InstreamAdLoadListener B;
    private int C;
    private boolean D = false;
    private s.b F;
    private Context I;
    private int L;
    private int S;
    private String V;
    private fa.s Z;

    public z(Context context, String str) {
        this.V = str;
        Context applicationContext = context.getApplicationContext();
        this.I = applicationContext;
        this.F = new s.b(applicationContext);
        this.L = h0.c(this.I);
    }

    private void Z(int i10) {
        InstreamAdLoadListener instreamAdLoadListener = this.B;
        if (instreamAdLoadListener != null) {
            instreamAdLoadListener.onAdFailed(i10);
        }
    }

    @Override // com.huawei.hms.ads.y
    public void Code(int i10) {
        this.C = i10;
    }

    @Override // ga.l
    public void I(int i10) {
        Z(ci.Code(i10));
        this.D = false;
    }

    @Override // com.huawei.hms.ads.y
    public void V(int i10) {
        this.S = i10;
    }

    private void V(AdParam adParam) {
        s.b bVar;
        if (adParam == null || (bVar = this.F) == null) {
            return;
        }
        bVar.f28315g = cj.Code(adParam.V());
        bVar.f28311b = (String[]) Arrays.copyOf(new String[]{this.V}, 1);
        bVar.f28312c = this.L;
        bVar.f28314e = false;
        bVar.f = true;
        s.b bVar2 = this.F;
        bVar2.getClass();
        this.Z = new fa.s(bVar2);
        adParam.getTargetingContentUrl();
        fa.s sVar = this.Z;
        adParam.getGender();
        sVar.getClass();
        fa.s sVar2 = this.Z;
        adParam.getKeywords();
        sVar2.getClass();
        fa.s sVar3 = this.Z;
        adParam.I();
        sVar3.getClass();
        this.Z.f28307p = adParam.C();
        HiAd.getInstance(this.I).setCountryCode(adParam.Z());
    }

    @Override // com.huawei.hms.ads.y
    public void Code(AdParam adParam) {
        String str;
        if (TextUtils.isEmpty(this.V)) {
            Z(1);
            str = "ad unit id is invalid.";
        } else if (this.C <= 0) {
            Z(1);
            str = "totalDuration is invalid.";
        } else {
            if (!this.D) {
                k.Code().Code(this.I);
                V(adParam);
                fa.s sVar = this.Z;
                if (sVar != null) {
                    this.D = true;
                    int i10 = this.C;
                    int i11 = this.S;
                    sVar.f28297d = this;
                    sVar.a(i10, i11);
                    return;
                }
                return;
            }
            Z(4);
            str = "ad is loading.";
        }
        ex.V("InstreamAdLoadMediator", str);
    }

    @Override // com.huawei.hms.ads.y
    public void Code(InstreamAdLoadListener instreamAdLoadListener) {
        this.B = instreamAdLoadListener;
    }

    @Override // ga.l
    public void Code(Map<String, List<com.huawei.openalliance.ad.inter.data.f>> map) {
        this.D = false;
        if (!map.keySet().contains(this.V)) {
            Z(3);
            return;
        }
        List<com.huawei.openalliance.ad.inter.data.f> list = map.get(this.V);
        if (list == null || list.size() <= 0) {
            Z(3);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<com.huawei.openalliance.ad.inter.data.f> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new x(this.I, it.next()));
        }
        InstreamAdLoadListener instreamAdLoadListener = this.B;
        if (instreamAdLoadListener != null) {
            instreamAdLoadListener.onAdLoaded(arrayList);
        }
    }

    @Override // com.huawei.hms.ads.y
    public boolean Code() {
        return this.D;
    }
}
