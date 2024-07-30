package com.huawei.opendevice.open;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.huawei.openalliance.ad.ppskit.utils.e;
import com.huawei.openalliance.ad.ppskit.utils.h;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import ib.b0;
import ib.p;

/* loaded from: classes2.dex */
public class SimplePrivacyActivity extends BaseStatementActivity {
    @Override // com.huawei.opendevice.open.BaseStatementActivity
    public final void m(p pVar) {
        p2.b(new b0(this, pVar, this.A));
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity, com.huawei.opendevice.open.BaseWebActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WebView webView;
        if (h.a(getApplicationContext()).c()) {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
        }
        super.onCreate(bundle);
        if (h.a(getApplicationContext()).c() && (webView = this.f24185u) != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) webView.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin + 48, layoutParams.rightMargin, layoutParams.bottomMargin);
            this.f24185u.setLayoutParams(layoutParams);
        }
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity
    public final String q() {
        return "privacy-statement";
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity
    public final String r() {
        if (e.a(z1.a(getApplicationContext()), z1.w(getApplicationContext(), getContentResolver()), 0, e.f22834a)) {
            return "htm/privacy_oobe_cn/";
        }
        return "htm/privacy_oobe_oversea/";
    }
}
