package com.huawei.openalliance.ad.ppskit.activity;

import android.content.Intent;
import com.huawei.openalliance.ad.constant.ba;
import e0.i;

/* loaded from: classes2.dex */
public class InnerPPSRewardActivity extends PPSRewardActivity {
    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity, com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String d() {
        return "InnerPPSRewardActivity";
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String f() {
        try {
            Intent intent = getIntent();
            if (intent != null) {
                return intent.getStringExtra(ba.y);
            }
        } catch (Throwable th) {
            i.p(th, "get caller error:", "InnerPPSRewardActivity");
        }
        return super.f();
    }
}
