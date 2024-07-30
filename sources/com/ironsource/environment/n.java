package com.ironsource.environment;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final l f24700a;

    public n(l lVar) {
        zc.d.d(lVar, "time");
        this.f24700a = lVar;
    }

    public final boolean a(long j10, long j11) {
        long a10 = this.f24700a.a();
        if (j11 > 0 && j10 > 0 && a10 >= j10 && a10 - j10 <= j11) {
            return false;
        }
        return true;
    }
}
