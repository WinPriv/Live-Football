package com.huawei.hms.ads;

import android.content.Context;
import android.view.View;
import com.huawei.hms.ads.jg;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.views.PPSNativeView;
import java.util.List;

/* loaded from: classes2.dex */
public class bz implements by<View> {
    private static final String Code = "bz";
    private com.huawei.openalliance.ad.inter.data.j B;
    private PPSNativeView.m C;
    private View I;
    private Context V;
    private AdContentData Z;

    public bz(Context context, View view) {
        this.V = context;
        Code(view);
    }

    @Override // com.huawei.hms.ads.by
    public void Code() {
        jh.Code(this.V, this.Z);
    }

    public View I() {
        return this.I;
    }

    @Override // com.huawei.hms.ads.by
    public boolean V() {
        if (this.B == null) {
            return false;
        }
        ex.Code(Code, "deal click");
        fb.m k10 = androidx.activity.n.k(this.V, this.Z, this.B.X());
        boolean a10 = k10.a();
        if (a10) {
            Code(k10);
            PPSNativeView.m mVar = this.C;
            if (mVar != null) {
                mVar.V();
                this.C.I();
            }
        }
        return a10;
    }

    @Override // com.huawei.hms.ads.by
    public void Code(long j10, int i10) {
        jh.Code(this.V, this.Z, j10, i10);
    }

    public final void Code(View view) {
        this.I = view;
    }

    @Override // com.huawei.hms.ads.by
    public void Code(com.huawei.openalliance.ad.inter.data.j jVar) {
        this.B = jVar;
        this.Z = jVar != null ? jVar.m() : null;
    }

    @Override // com.huawei.hms.ads.by
    public void Code(PPSNativeView.m mVar) {
        this.C = mVar;
    }

    private void Code(fb.m mVar) {
        jh.Code(this.V, this.Z, 0, 0, mVar.c(), a0.a.l(I()), gb.u.p(I()));
    }

    @Override // com.huawei.hms.ads.by
    public void Code(Long l10, Integer num, Integer num2, boolean z10) {
        jg.a aVar = new jg.a();
        if (z10) {
            aVar.V(Long.valueOf(System.currentTimeMillis()));
        }
        int[] p10 = gb.u.p(I());
        String format = String.format("%s,%s", Integer.valueOf(p10[0]), Integer.valueOf(p10[1]));
        com.huawei.openalliance.ad.inter.data.j jVar = this.B;
        if (jVar != null) {
            ex.Code(Code, "slotId: %s, contentId: %s, slot pos: %s", jVar.n(), this.B.L(), format);
        }
        aVar.Code(l10).Code(num).V(num2).I(format).Code(a0.a.l(I()));
        jh.Code(this.V, this.Z, aVar.Code());
    }

    @Override // com.huawei.hms.ads.by
    public void Code(String str) {
        AdContentData adContentData = this.Z;
        if (adContentData == null) {
            return;
        }
        adContentData.y(str);
    }

    @Override // com.huawei.hms.ads.by
    public void Code(List<String> list) {
        jh.Code(this.V, this.Z, 0, 0, list);
    }
}
