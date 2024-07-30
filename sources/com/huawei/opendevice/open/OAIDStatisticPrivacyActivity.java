package com.huawei.opendevice.open;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.utils.h;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import ib.e0;
import ib.p;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public class OAIDStatisticPrivacyActivity extends BaseStatementActivity {
    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final int g() {
        return R.string.opendevice_title_stattistics_statement;
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final String h() {
        return "statistics";
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity, com.huawei.opendevice.open.BaseWebActivity
    public final int j() {
        return R.layout.opendevice_web;
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity
    public final void m(p pVar) {
        n7.b("OAIDStatisticPrivacyActivity", "loadFromServer");
        p2.b(new e0(this, pVar));
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity, com.huawei.opendevice.open.BaseWebActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WebView webView;
        n7.e("OAIDStatisticPrivacyActivity", "onCreate");
        super.onCreate(bundle);
        if (h.a(getApplicationContext()).c() && (webView = this.f24185u) != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) webView.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin + 48, layoutParams.rightMargin, layoutParams.bottomMargin);
            this.f24185u.setLayoutParams(layoutParams);
        }
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity
    public final void p(p pVar) {
        if (Cif.a(this).d()) {
            ((BaseWebActivity) pVar).d("");
        } else {
            super.p(pVar);
        }
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity
    public final String q() {
        return "privacy-statement";
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity
    public final String r() {
        return "htm/statistics_oobe/";
    }

    @Override // com.huawei.opendevice.open.BaseStatementActivity
    public final String s() {
        String s10 = super.s();
        if (h.a(this).c() && s10.equalsIgnoreCase("CN")) {
            return "UNKNOWN";
        }
        return s10;
    }
}
