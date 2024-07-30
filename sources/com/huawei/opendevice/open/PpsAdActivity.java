package com.huawei.opendevice.open;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.beans.server.OaidPortraitReq;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.h;
import com.huawei.openalliance.ad.ppskit.utils.k1;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import ib.c0;
import ib.d;
import ib.p;
import ib.r;
import ib.s;
import ib.t;
import ib.u;
import java.util.Locale;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public class PpsAdActivity extends InjectableBaseWebActivity {
    public u I;

    /* loaded from: classes2.dex */
    public class a {
    }

    public PpsAdActivity() {
        new a();
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final void f(p pVar) {
        p2.b(new c0(this, pVar));
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final int g() {
        return R.string.opendevice_ad_info;
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final String h() {
        if (Cif.a(this).d()) {
            return "adinfo";
        }
        return "adinfoOversea";
    }

    @Override // com.huawei.opendevice.open.InjectableBaseWebActivity, com.huawei.opendevice.open.a.InterfaceC0307a
    public final void h_() {
        super.h_();
        if (!this.H && !TextUtils.isEmpty(null)) {
            n7.e("PpsAdActivity", "script loaded, injectContent.");
            if (l() && this.G && this.f24185u != null) {
                this.H = true;
                d2.a(new d(this));
            }
        }
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final int j() {
        return R.layout.opendevice_web;
    }

    @Override // com.huawei.opendevice.open.InjectableBaseWebActivity
    public final boolean l() {
        return !Cif.a(this).d();
    }

    @Override // com.huawei.opendevice.open.InjectableBaseWebActivity, com.huawei.opendevice.open.BaseWebActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n7.e("PpsAdActivity", "onCreate.");
        if (h.a(getApplicationContext()).c()) {
            ActionBar actionBar = getActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
            TextView textView = (TextView) findViewById(R.id.web_appbar_tv);
            textView.setText(R.string.opendevice_ad_info);
            textView.setVisibility(0);
        }
        this.I = new u(this);
        if (l()) {
            u uVar = this.I;
            Context context = uVar.f29515a;
            OaidPortraitReq oaidPortraitReq = uVar.f29516b;
            n7.e("OaidPortraitRequester", "request oaid portrait.");
            try {
                n7.e("OaidPortraitRequester", "init oaid info.");
                int i10 = r.f29513a;
                Pair<String, Boolean> b10 = r.b(context, context.getPackageName());
                if (b10 != null) {
                    oaidPortraitReq.f((String) b10.first);
                    ((Boolean) b10.second).booleanValue();
                }
            } catch (s unused) {
                n7.i("OaidPortraitRequester", "load oaid fail");
            }
            Locale locale = Locale.getDefault();
            String lowerCase = locale.getLanguage().toLowerCase(locale);
            String lowerCase2 = locale.getCountry().toLowerCase(locale);
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(lowerCase)) {
                sb2.append(lowerCase);
            }
            if (!TextUtils.isEmpty(lowerCase2)) {
                sb2.append("-");
                sb2.append(lowerCase2);
            }
            n7.f("OaidPortraitRequester", "init language info, language: %s, country: %s.", lowerCase, lowerCase2);
            oaidPortraitReq.g(sb2.toString());
            int f = k1.f(context);
            n7.f("OaidPortraitRequester", "init network info, netType: %s", Integer.valueOf(f));
            oaidPortraitReq.e(Integer.valueOf(f));
            n7.e("OaidPortraitRequester", "init access token.");
            p2.a(new t(uVar), 2);
        }
    }

    @Override // com.huawei.opendevice.open.InjectableBaseWebActivity
    public final void m() {
    }
}
