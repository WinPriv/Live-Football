package com.huawei.openalliance.ad.ppskit.handlers;

import com.huawei.openalliance.ad.ppskit.beans.metadata.LandpageAppWhiteList;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class k implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f22578s;

    public k(l lVar) {
        this.f22578s = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Serializable C = a0.a.C(this.f22578s.f22590g);
        if (C != null && (C instanceof LandpageAppWhiteList)) {
            synchronized (this.f22578s.f22591h) {
                this.f22578s.f = (LandpageAppWhiteList) C;
            }
        }
    }
}
