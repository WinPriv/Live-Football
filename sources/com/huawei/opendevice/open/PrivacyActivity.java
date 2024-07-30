package com.huawei.opendevice.open;

import android.os.Bundle;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.vungle.warren.ui.JavascriptBridge;
import ib.b0;
import ib.p;
import ka.Cif;

/* loaded from: classes2.dex */
public class PrivacyActivity extends BaseWebActivity {
    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final void f(p pVar) {
        p2.b(new b0(this, pVar, this.A));
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final String h() {
        if (Cif.a(getApplicationContext()).d() && !this.A) {
            return "privacyThirdCN";
        }
        return JavascriptBridge.MraidHandler.PRIVACY_ACTION.concat(z1.b(getApplicationContext()));
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final int j() {
        return R.layout.opendevice_web;
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A && this.f24189z && this.f24183s) {
            d0.k(this, "hwpps://privacy");
            finish();
        }
    }
}
