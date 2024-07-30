package com.huawei.openalliance.ad.ppskit.handlers;

import com.huawei.openalliance.ad.ppskit.beans.metadata.LandpageWebBlackList;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class m implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f22610s;

    public m(l lVar) {
        this.f22610s = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Serializable C = a0.a.C(this.f22610s.f22598p);
        if (C != null && (C instanceof LandpageWebBlackList)) {
            synchronized (this.f22610s.f22599q) {
                this.f22610s.o = (LandpageWebBlackList) C;
            }
        }
    }
}
