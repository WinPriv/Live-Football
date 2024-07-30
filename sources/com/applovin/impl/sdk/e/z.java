package com.applovin.impl.sdk.e;

/* loaded from: classes.dex */
public class z extends a {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f18952a;

    public z(com.applovin.impl.sdk.p pVar, Runnable runnable) {
        this(pVar, false, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f18952a.run();
    }

    public z(com.applovin.impl.sdk.p pVar, boolean z10, Runnable runnable) {
        super("TaskRunnable", pVar, z10);
        this.f18952a = runnable;
    }
}
