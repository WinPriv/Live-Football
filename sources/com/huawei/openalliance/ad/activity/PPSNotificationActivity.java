package com.huawei.openalliance.ad.activity;

import android.os.Bundle;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gj;

/* loaded from: classes2.dex */
public class PPSNotificationActivity extends c {
    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ex.Code("PPSNotificationActivity", "PPSNotification onCreate");
        gj.Code(this).Code(this, getIntent());
        finish();
    }
}
