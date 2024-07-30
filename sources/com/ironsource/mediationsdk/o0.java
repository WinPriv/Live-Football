package com.ironsource.mediationsdk;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public final class o0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1422k f25767s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1431v f25768t;

    public o0(C1431v c1431v, C1422k c1422k) {
        this.f25768t = c1431v;
        this.f25767s = c1422k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1431v c1431v = this.f25768t;
        c1431v.l(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_REQUEST, null);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sb2 = new StringBuilder("auction waterfallString = ");
        C1422k c1422k = this.f25767s;
        sb2.append(c1422k.a());
        ironLog.verbose(sb2.toString());
        c1431v.l(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c1422k.a()}});
        try {
            com.ironsource.environment.e.c.f24668a.c(c1431v.f25959b.f25445a.a(ContextProvider.getInstance().getApplicationContext(), c1422k, c1431v));
        } catch (Exception e10) {
            IronLog.INTERNAL.error("execute auction exception " + e10.getMessage());
            if (c1431v != null) {
                c1431v.a(1000, e10.getMessage(), 0, "other", 0L);
            }
        }
    }
}
