package com.huawei.hms.ads;

import android.content.Context;
import android.view.View;
import com.huawei.hms.ads.jg;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ii extends fz<jx> implements iu {
    private com.huawei.openalliance.ad.inter.data.i B;
    private ga.a C;
    private Context Z;
    private boolean S = false;
    private boolean F = false;
    private boolean D = false;

    public ii(Context context, jx jxVar) {
        this.Z = context.getApplicationContext();
        Code((ii) jxVar);
    }

    private void Z(boolean z10) {
        this.S = z10;
    }

    private boolean a() {
        return this.S;
    }

    @Override // com.huawei.hms.ads.iu
    public void C() {
        jh.Code(this.Z, this.Code);
    }

    @Override // com.huawei.hms.ads.iu
    public void Code(long j10, int i10) {
        jh.Code(this.Z, this.Code, j10, i10);
    }

    @Override // com.huawei.hms.ads.iu
    public void D() {
        jh.Code(this.Z, this.Code, com.huawei.openalliance.ad.constant.ah.S, (Long) null, (Long) null, (Integer) null, (Integer) null);
    }

    @Override // com.huawei.hms.ads.iu
    public void F() {
        jh.Code(this.Z, this.Code, com.huawei.openalliance.ad.constant.ah.B, (Long) null, (Long) null, (Integer) null, (Integer) null);
    }

    @Override // com.huawei.hms.ads.fz, com.huawei.hms.ads.ga
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public jx I() {
        return (jx) super.I();
    }

    @Override // com.huawei.hms.ads.iu
    public void Code(long j10, long j11, long j12, long j13) {
        jh.Code(this.Z, this.Code, com.huawei.openalliance.ad.constant.ah.Z, Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf((int) j12), Integer.valueOf((int) j13));
    }

    @Override // com.huawei.hms.ads.iu
    public void V(long j10, long j11, long j12, long j13) {
        jh.Code(this.Z, this.Code, com.huawei.openalliance.ad.constant.ah.C, Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf((int) j12), Integer.valueOf((int) j13));
    }

    private void Code(fb.m mVar, int i10, MaterialClickInfo materialClickInfo) {
        jh.Code(this.Z, this.Code, 0, 0, mVar.c(), i10, materialClickInfo, a0.a.l(I()), gb.u.q(I()));
    }

    @Override // com.huawei.hms.ads.iu
    public void V(boolean z10) {
        jh.Code(this.Z, this.Code, z10);
    }

    @Override // com.huawei.hms.ads.iu
    public void Code(ga.a aVar) {
    }

    @Override // com.huawei.hms.ads.iu
    public void Code(Long l10, Integer num, Integer num2, boolean z10) {
        String str;
        com.huawei.openalliance.ad.inter.data.i iVar = this.B;
        boolean b10 = gb.y.b(iVar != null ? iVar.b_() : null, num2);
        if (a() && (!b10 || Code())) {
            ex.I("PPSLinkedVideoViewPresenter", "show event already reported before, ignore this");
            return;
        }
        jg.a aVar = new jg.a();
        if (z10) {
            aVar.V(Long.valueOf(System.currentTimeMillis()));
        }
        jx I = I();
        if (I != null) {
            str = I.getSplashViewSlotPosition();
            com.huawei.openalliance.ad.inter.data.i iVar2 = this.B;
            if (iVar2 != null) {
                ex.Code("PPSLinkedVideoViewPresenter", "slotId: %s, contentId: %s, slot pos: %s", iVar2.N, iVar2.f22266t, str);
            }
        } else {
            str = "";
        }
        if (!gb.p.f(str)) {
            aVar.I(str);
        }
        aVar.Code(l10).Code(num).V(num2).Code(a0.a.l(I()));
        jh.Code(this.Z, this.Code, aVar.Code());
        if (b10) {
            Code(true);
        }
        if (a()) {
            return;
        }
        Z(true);
    }

    @Override // com.huawei.hms.ads.fz, com.huawei.hms.ads.iu
    public void Code(String str) {
        super.Code(str);
        Z(false);
        Code(false);
    }

    private void Code(Map<String, String> map) {
        com.huawei.openalliance.ad.inter.data.i iVar;
        com.huawei.openalliance.ad.inter.data.p pVar;
        if (map == null || map.isEmpty() || (iVar = this.B) == null || (pVar = iVar.G) == null) {
            return;
        }
        int i10 = pVar.y;
        if (Math.abs(pVar.f22304t - i10) < 1000) {
            i10 = 0;
        }
        ex.V("PPSLinkedVideoViewPresenter", "buildLinkedAdConfig, duration: %s, set progress from LinkedSplash view:%s ", Integer.valueOf(this.B.G.f22304t), Integer.valueOf(i10));
        map.put(com.huawei.openalliance.ad.constant.ba.f22067q, this.B.G.E ? ep.Code : ep.V);
        map.put(com.huawei.openalliance.ad.constant.ba.f22066p, this.B.G.f22309z);
        map.put(com.huawei.openalliance.ad.constant.ba.o, String.valueOf(i10));
        map.put(com.huawei.openalliance.ad.constant.ba.f22068r, this.B.f22270x);
        map.put(com.huawei.openalliance.ad.constant.ba.f22064m, this.B.O);
        map.put(com.huawei.openalliance.ad.constant.ba.f22065n, String.valueOf(10));
    }

    public void Code(boolean z10) {
        this.F = z10;
    }

    public boolean Code() {
        return this.F;
    }

    @Override // com.huawei.hms.ads.iu
    public boolean Code(int i10, MaterialClickInfo materialClickInfo) {
        com.huawei.openalliance.ad.inter.data.i iVar = this.B;
        if (iVar == null) {
            return false;
        }
        iVar.getClass();
        ex.V("PPSLinkedVideoViewPresenter", "begin to deal click");
        HashMap hashMap = new HashMap();
        hashMap.put("appId", this.B.E);
        hashMap.put("thirdId", this.B.A);
        Code(hashMap);
        fb.m k10 = androidx.activity.n.k(I() instanceof View ? ((View) I()).getContext() : this.Z, this.Code, hashMap);
        boolean a10 = k10.a();
        if (a10) {
            Code(k10, i10, materialClickInfo);
        }
        fa.g.a(this.Z).getClass();
        return a10;
    }
}
