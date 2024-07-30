package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.jg;
import com.huawei.openalliance.ad.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class ik extends fz<jz> implements ix<jz> {
    private Context I;
    private com.huawei.openalliance.ad.inter.data.k Z;

    public ik(Context context, jz jzVar) {
        this.I = context;
        Code((ik) jzVar);
    }

    @Override // com.huawei.hms.ads.ix
    public void Code() {
        jh.Code(this.I, this.Code, 0, 0, (List<String>) null);
    }

    @Override // com.huawei.hms.ads.ix
    public void V() {
        jh.Code(this.I, this.Code);
    }

    @Override // com.huawei.hms.ads.ix
    public void Code(long j10, int i10) {
        jh.Code(this.I, this.Code, j10, i10);
    }

    @Override // com.huawei.hms.ads.ix
    public void Code(long j10, int i10, Integer num) {
        String B = B();
        com.huawei.openalliance.ad.inter.data.k kVar = this.Z;
        if (kVar != null) {
            ex.Code("PlacementAdPresenter", "slotId: %s, contentId: %s, slot pos: %s", kVar.n(), this.Z.L(), B);
        }
        jg.a aVar = new jg.a();
        if (num != null) {
            aVar.V(Long.valueOf(System.currentTimeMillis()));
        }
        aVar.Code(Long.valueOf(j10)).Code(Integer.valueOf(i10)).V(num).I(B).Code(a0.a.l(I()));
        jh.Code(this.I, this.Code, aVar.Code());
    }

    @Override // com.huawei.hms.ads.ix
    public void Code(MaterialClickInfo materialClickInfo) {
        com.huawei.openalliance.ad.inter.data.k kVar = this.Z;
        if (kVar == null) {
            return;
        }
        kVar.f22279s = true;
        ex.Code("PlacementAdPresenter", "begin to deal click");
        HashMap hashMap = new HashMap();
        hashMap.put("appId", this.Z.u());
        MetaData h_ = this.Z.h_();
        hashMap.put("thirdId", h_ != null ? h_.L() : null);
        fb.m k10 = androidx.activity.n.k(this.I, this.Code, hashMap);
        if (k10.a()) {
            Code(k10, materialClickInfo);
        }
    }

    @Override // com.huawei.hms.ads.ix
    public void Code(com.huawei.openalliance.ad.inter.data.k kVar) {
        this.Z = kVar;
        this.Code = kVar != null ? kVar.m() : null;
    }

    private void Code(fb.m mVar, MaterialClickInfo materialClickInfo) {
        jh.Code(this.I, this.Code, 0, 0, mVar.c(), materialClickInfo, a0.a.l(I()), gb.u.q(I()));
    }

    @Override // com.huawei.hms.ads.ix
    public void Code(String str, int i10, int i11, com.huawei.openalliance.ad.inter.data.k kVar) {
        AdContentData m10 = kVar.m();
        AnalysisEventReport analysisEventReport = new AnalysisEventReport();
        analysisEventReport.f(str);
        analysisEventReport.c(i10);
        analysisEventReport.l(i11);
        analysisEventReport.e(m10);
        if (m10 != null) {
            analysisEventReport.k(m10.e0());
            analysisEventReport.g(m10.D());
            analysisEventReport.b(m10.L());
            analysisEventReport.h(m10.f0());
        }
        ha.i.e(this.I).d("rptPlacePlayErr", gb.b.p(analysisEventReport), null, null);
    }

    @Override // com.huawei.hms.ads.ix
    public void Code(boolean z10) {
        jh.Code(this.I, this.Code, z10);
    }
}
