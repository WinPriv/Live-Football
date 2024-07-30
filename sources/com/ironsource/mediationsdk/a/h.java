package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.a.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.o;

/* loaded from: classes2.dex */
public final class h extends b {
    public static h E;
    public final String D;

    private h() {
        this.f25047x = "outcome";
        this.f25045u = 3;
        this.y = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.D = "";
    }

    public static synchronized h d() {
        h hVar;
        synchronized (h.class) {
            if (E == null) {
                h hVar2 = new h();
                E = hVar2;
                hVar2.b();
            }
            hVar = E;
        }
        return hVar;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final void f() {
        this.f25048z.add(1000);
        this.f25048z.add(1001);
        this.f25048z.add(1002);
        this.f25048z.add(1003);
        this.f25048z.add(1200);
        this.f25048z.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_TRUE));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_FALSE));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean g(c cVar) {
        if (cVar.a() == 305) {
            return true;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final String h(int i10) {
        if (i10 != 15 && (i10 < 300 || i10 >= 400)) {
            return "";
        }
        return this.D;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean j(c cVar) {
        int a10 = cVar.a();
        if (a10 != 14 && a10 != 514 && a10 != 305 && a10 != 1003 && a10 != 1005 && a10 != 1203 && a10 != 1010 && a10 != 1301 && a10 != 1302) {
            return false;
        }
        return true;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final int l(c cVar) {
        int i10;
        if (b.k(cVar.a()) == b.a.OFFERWALL.f25055s) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return o.a().b(i10 ^ 1);
    }
}
