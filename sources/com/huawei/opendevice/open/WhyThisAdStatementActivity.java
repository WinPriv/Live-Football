package com.huawei.opendevice.open;

import android.content.Context;
import android.os.Bundle;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import ib.f0;
import ib.p;
import ka.Cif;

/* loaded from: classes2.dex */
public class WhyThisAdStatementActivity extends BaseWebActivity {
    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final void f(p pVar) {
        p2.b(new f0(this, pVar));
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final int g() {
        if (!Cif.a(this).d()) {
            return R.string.hiad_choices_whythisad;
        }
        return R.string.opendevice_ad_info;
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final String h() {
        return "whyThisAdThird";
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final int j() {
        return R.layout.opendevice_web;
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        if (!this.A && this.f24189z && this.f24183s) {
            d0.k(applicationContext, w.al);
            finish();
        }
    }
}
