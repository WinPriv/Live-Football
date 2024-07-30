package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.Utils;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18537s;

    public /* synthetic */ a0(int i10) {
        this.f18537s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18537s) {
            case 0:
                Utils.logJava8MethodReference();
                return;
            default:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f19903a;
                return;
        }
    }
}
