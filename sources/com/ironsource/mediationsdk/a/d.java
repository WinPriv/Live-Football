package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.a.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.o;

/* loaded from: classes2.dex */
public final class d extends b {
    public static d E;
    public final String D;

    private d() {
        this.f25047x = "ironbeast";
        this.f25045u = 2;
        this.y = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.D = "";
    }

    public static synchronized d d() {
        d dVar;
        synchronized (d.class) {
            if (E == null) {
                d dVar2 = new d();
                E = dVar2;
                dVar2.b();
            }
            dVar = E;
        }
        return dVar;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final void f() {
        this.f25048z.add(2001);
        this.f25048z.add(2002);
        this.f25048z.add(2003);
        this.f25048z.add(2004);
        this.f25048z.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_TRUE));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_FALSE));
        this.f25048z.add(3001);
        this.f25048z.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.BN_RELOAD));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.BN_RELOAD_FAILED));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.f25048z.add(3002);
        this.f25048z.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD));
        this.f25048z.add(3005);
        this.f25048z.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_ERROR));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.f25048z.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_SHOW));
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean g(c cVar) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final String h(int i10) {
        return this.D;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean j(c cVar) {
        int a10 = cVar.a();
        if (a10 != 2204 && a10 != 2004 && a10 != 2005 && a10 != 2301 && a10 != 2300 && a10 != 3009) {
            return false;
        }
        return true;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final int l(c cVar) {
        boolean z10;
        int i10;
        if (b.k(cVar.a()) == b.a.BANNER.f25055s) {
            z10 = true;
        } else {
            z10 = false;
        }
        o a10 = o.a();
        if (z10) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        return a10.b(i10);
    }
}
