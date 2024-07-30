package com.huawei.openalliance.ad.ppskit.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.transition.n;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.beans.metadata.GlobalShareData;
import com.huawei.openalliance.ad.ppskit.handlers.k;
import com.huawei.openalliance.ad.ppskit.handlers.m;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import e0.i;
import ka.Cif;
import ka.l;
import ka.n7;
import ka.r4;
import l3.d;

/* loaded from: classes2.dex */
public abstract class PPSBaseActivity extends SafeActivity {

    /* renamed from: s, reason: collision with root package name */
    public ViewGroup f22387s;

    /* renamed from: t, reason: collision with root package name */
    public l f22388t;

    private void i() {
        try {
            n.A(this);
            int i10 = 0;
            if (d0.m(this)) {
                d dVar = new d(i10);
                synchronized (a0.a.G0) {
                    a0.a.F0 = dVar;
                }
            }
            com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this);
            d10.getClass();
            p2.a(new k(d10), 0);
            p2.a(new m(d10), 0);
            synchronized (sa.b.f35296w) {
                if (sa.b.f35297x == null) {
                    sa.b.f35297x = new sa.b(this);
                }
            }
            this.f22388t = Cif.a(this);
            b();
            z1.s(this.f22387s, this);
        } catch (Throwable th) {
            n7.g("PPSBaseActivity", "error occurs,".concat(th.getClass().getSimpleName()));
            n7.a();
        }
    }

    public abstract void b();

    public final boolean c(Intent intent) {
        boolean z10;
        if (d0.m(getApplicationContext()) && intent != null && intent.getBooleanExtra(ba.ag, false)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (n7.d()) {
            n7.c(d(), "isInHmsTask: %s", Boolean.valueOf(z10));
        }
        return z10;
    }

    public abstract String d();

    public String f() {
        GlobalShareData globalShareData;
        String callingPackage = getCallingPackage();
        if (TextUtils.isEmpty(callingPackage)) {
            callingPackage = z1.z(this);
        }
        if (TextUtils.isEmpty(callingPackage)) {
            synchronized (r4.f31739d) {
                globalShareData = r4.f31736a;
            }
            if (globalShareData != null) {
                callingPackage = globalShareData.a();
            }
        }
        if (TextUtils.isEmpty(callingPackage)) {
            try {
                return getIntent().getStringExtra(ba.y);
            } catch (Throwable th) {
                i.p(th, "get caller error:", d());
                return callingPackage;
            }
        }
        return callingPackage;
    }

    public final void j() {
        try {
            if (Build.VERSION.SDK_INT < 28 && Cif.a(this).a(this) && d0.m(getApplicationContext()) && this.f22387s != null) {
                int e10 = Cif.a(this).e(this.f22387s);
                if (n7.d()) {
                    n7.c("PPSBaseActivity", "notchHeight:%s", Integer.valueOf(e10));
                }
                ViewGroup viewGroup = this.f22387s;
                viewGroup.setPadding(viewGroup.getPaddingLeft(), e10, this.f22387s.getPaddingRight(), 0);
            }
        } catch (Throwable th) {
            i.p(th, "adapterONotch error:", "PPSBaseActivity");
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        n7.e(d(), "onNewIntent");
        super.onNewIntent(intent);
        setIntent(intent);
        try {
            e();
            h();
            i();
            g();
        } catch (Throwable th) {
            i.p(th, "onNewIntent error occurs,", "PPSBaseActivity");
        }
    }

    public void e() {
    }

    public void g() {
    }

    public void h() {
    }
}
