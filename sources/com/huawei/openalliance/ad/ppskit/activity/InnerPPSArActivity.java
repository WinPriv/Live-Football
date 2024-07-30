package com.huawei.openalliance.ad.ppskit.activity;

import com.huawei.openalliance.ad.constant.ba;
import e0.i;

/* loaded from: classes2.dex */
public class InnerPPSArActivity extends PPSArActivity {
    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSArActivity, com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String d() {
        return "InnerPPSArActivity";
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String f() {
        try {
            return getIntent().getStringExtra(ba.y);
        } catch (Throwable th) {
            i.p(th, "get caller error:", "InnerPPSArActivity");
            return super.f();
        }
    }
}
