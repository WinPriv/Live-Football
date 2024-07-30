package com.huawei.opendevice.open;

import android.os.Bundle;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.utils.h;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import ib.d0;
import ib.p;

/* loaded from: classes2.dex */
public class AboutOaidActivity extends BaseStatementActivity {
    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final int g() {
        return R.string.opendevice_title_oaid_statement;
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final String h() {
        return "aboutOaid";
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity
    public final void m(p pVar) {
        p2.b(new d0(this, pVar));
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity, com.huawei.opendevice.open.BaseWebActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i10;
        super.onCreate(bundle);
        if (h.a(getApplicationContext()).c()) {
            if (this.G) {
                i10 = R.id.simple_web_appbar_tv;
            } else {
                i10 = R.id.web_appbar_tv;
            }
            TextView textView = (TextView) findViewById(i10);
            textView.setText(R.string.opendevice_title_oaid_statement);
            textView.setVisibility(0);
        }
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity
    public final String q() {
        return "terms";
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity
    public final String r() {
        return "htm/instructions/";
    }
}
