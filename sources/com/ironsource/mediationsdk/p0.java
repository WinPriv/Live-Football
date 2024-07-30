package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class p0 extends TimerTask {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1431v f25789s;

    public p0(C1431v c1431v) {
        this.f25789s = c1431v;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sb2 = new StringBuilder("load timed out state=");
        C1431v c1431v = this.f25789s;
        sb2.append(c1431v.i());
        ironLog.verbose(sb2.toString());
        c1431v.m(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "load timed out"));
    }
}
