package com.huawei.openalliance.ad.ppskit.activity;

import com.huawei.openalliance.ad.ppskit.activity.PPSArActivity;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ka.ii;
import ka.n7;
import ka.p;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSArActivity.a f22433s;

    public b(PPSArActivity.a aVar) {
        this.f22433s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContentRecord contentRecord;
        n7.g("PPSArActivity", "copy files error");
        PPSArActivity.a aVar = this.f22433s;
        PPSArActivity pPSArActivity = PPSArActivity.this;
        ii N = a0.a.N(pPSArActivity, pPSArActivity.y, pPSArActivity.f22379x, false);
        p pVar = pPSArActivity.C;
        if (pVar != null && (contentRecord = pPSArActivity.y) != null) {
            pVar.u(pPSArActivity.y, contentRecord.h1(), "arAdClick");
        }
        N.a();
        PPSArActivity.this.finish();
    }
}
