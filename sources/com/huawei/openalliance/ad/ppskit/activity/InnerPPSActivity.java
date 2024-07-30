package com.huawei.openalliance.ad.ppskit.activity;

import android.content.Intent;
import com.huawei.openalliance.ad.constant.ba;
import e0.i;

/* loaded from: classes2.dex */
public class InnerPPSActivity extends PPSActivity {
    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSActivity, com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String d() {
        return "InnerPPSActivity";
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSActivity, com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String f() {
        try {
            Intent intent = getIntent();
            if (intent != null) {
                return intent.getStringExtra(ba.y);
            }
        } catch (Throwable th) {
            i.p(th, "get caller error:", "InnerPPSActivity");
        }
        return super.f();
    }
}
