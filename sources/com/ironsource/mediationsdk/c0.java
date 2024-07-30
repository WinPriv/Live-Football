package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class c0 extends TimerTask {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f25371s;

    public c0(J j10) {
        this.f25371s = j10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        cancel();
        J j10 = this.f25371s;
        if (j10.f25320a == AbstractC1414b.a.INIT_PENDING && j10.f24832u != null) {
            j10.a(AbstractC1414b.a.INIT_FAILED);
            j10.f24832u.a(ErrorBuilder.buildInitFailedError("Timeout", "Interstitial"), j10);
        }
    }
}
