package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class m0 extends TimerTask {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ag f25603s;

    public m0(ag agVar) {
        this.f25603s = agVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        synchronized (this.f25603s) {
            cancel();
            if (this.f25603s.f25309u != null) {
                String str = "Timeout for " + this.f25603s.f25324e;
                this.f25603s.f25336s.log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                this.f25603s.a(AbstractC1414b.a.NOT_AVAILABLE);
                long time = new Date().getTime();
                ag agVar = this.f25603s;
                long j10 = time - agVar.f25312x;
                if (agVar.f25310v.compareAndSet(true, false)) {
                    this.f25603s.k(1200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{"duration", Long.valueOf(j10)}});
                    this.f25603s.k(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}});
                } else {
                    this.f25603s.k(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{"duration", Long.valueOf(j10)}});
                }
                ag agVar2 = this.f25603s;
                agVar2.f25309u.a(false, agVar2);
            }
        }
    }
}
