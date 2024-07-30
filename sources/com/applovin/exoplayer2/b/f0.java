package com.applovin.exoplayer2.b;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Executor {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13386s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Handler f13387t;

    public /* synthetic */ f0(int i10, Handler handler) {
        this.f13386s = i10;
        this.f13387t = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f13386s;
        Handler handler = this.f13387t;
        switch (i10) {
            case 0:
                handler.post(runnable);
                return;
            default:
                handler.post(runnable);
                return;
        }
    }
}
