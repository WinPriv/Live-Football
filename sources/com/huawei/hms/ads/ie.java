package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.jg;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.views.PPSNativeView;
import java.util.List;

/* loaded from: classes2.dex */
public class ie extends fz<jy> implements ir<jy> {
    private static final String V = "ie";
    private PPSNativeView.m B;
    private Context I;
    private com.huawei.openalliance.ad.inter.data.j Z;

    public ie(Context context, jy jyVar) {
        this.I = context;
        Code((ie) jyVar);
    }

    @Override // com.huawei.hms.ads.ir
    public void Code() {
        jh.Code(this.I, this.Code);
    }

    @Override // com.huawei.hms.ads.ir
    public void V() {
        jh.V(this.I, this.Code);
    }

    @Override // com.huawei.hms.ads.ir
    public void Code(long j10, int i10) {
        jh.Code(this.I, this.Code, j10, i10);
    }

    @Override // com.huawei.hms.ads.ir
    public void V(String str) {
        AdContentData adContentData = this.Code;
        if (adContentData == null) {
            return;
        }
        adContentData.I0(str);
    }

    @Override // com.huawei.hms.ads.ir
    public void Code(com.huawei.openalliance.ad.inter.data.j jVar) {
        this.Z = jVar;
        this.Code = jVar != null ? jVar.m() : null;
    }

    @Override // com.huawei.hms.ads.ir
    public void Code(PPSNativeView.m mVar) {
        this.B = mVar;
    }

    private void Code(fb.m mVar, MaterialClickInfo materialClickInfo, Integer num) {
        jh.Code(this.I, this.Code, 0, 0, mVar.c(), num.intValue(), materialClickInfo, a0.a.l(I()), gb.u.q(I()));
    }

    @Override // com.huawei.hms.ads.ir
    public void Code(Long l10, Integer num, Integer num2, boolean z10) {
        String B = B();
        com.huawei.openalliance.ad.inter.data.j jVar = this.Z;
        if (jVar != null) {
            ex.Code(V, "slotId: %s, contentId: %s, slot pos: %s", jVar.n(), this.Z.L(), B);
        }
        jg.a aVar = new jg.a();
        if (z10) {
            aVar.V(Long.valueOf(System.currentTimeMillis()));
        }
        aVar.Code(l10).Code(num).V(num2).I(B).Code(a0.a.l(I()));
        jh.Code(this.I, this.Code, aVar.Code());
    }

    @Override // com.huawei.hms.ads.ir
    public void Code(List<String> list) {
        jh.Code(this.I, this.Code, 0, 0, list);
    }

    @Override // com.huawei.hms.ads.ir
    public boolean Code(MaterialClickInfo materialClickInfo, Integer num) {
        if (this.Z == null) {
            return false;
        }
        ex.Code(V, "deal click");
        fb.m k10 = androidx.activity.n.k(this.I, this.Code, this.Z.X());
        boolean a10 = k10.a();
        if (a10) {
            Code(k10, materialClickInfo, num);
            PPSNativeView.m mVar = this.B;
            if (mVar != null) {
                mVar.V();
                this.B.I();
            }
        }
        return a10;
    }
}
