package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.Date;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class d0 extends TimerTask {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f25388s;

    public d0(J j10) {
        this.f25388s = j10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        cancel();
        J j10 = this.f25388s;
        if (j10.f25320a == AbstractC1414b.a.LOAD_PENDING && j10.f24832u != null) {
            j10.a(AbstractC1414b.a.NOT_AVAILABLE);
            j10.f24832u.a(ErrorBuilder.buildLoadFailedError("Timeout"), j10, new Date().getTime() - j10.f24833v);
        }
    }
}
