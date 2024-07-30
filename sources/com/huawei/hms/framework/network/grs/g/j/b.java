package com.huawei.hms.framework.network.grs.g.j;

import android.os.SystemClock;
import com.huawei.openalliance.ad.constant.w;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Future<com.huawei.hms.framework.network.grs.g.d> f21908a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21909b = SystemClock.elapsedRealtime();

    public b(Future<com.huawei.hms.framework.network.grs.g.d> future) {
        this.f21908a = future;
    }

    public Future<com.huawei.hms.framework.network.grs.g.d> a() {
        return this.f21908a;
    }

    public boolean b() {
        if (SystemClock.elapsedRealtime() - this.f21909b <= w.as) {
            return true;
        }
        return false;
    }
}
