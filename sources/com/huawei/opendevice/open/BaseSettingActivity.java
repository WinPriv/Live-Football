package com.huawei.opendevice.open;

import android.app.ActionBar;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.transition.n;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import f1.f;
import ka.Cif;
import ka.ae;
import ka.n7;
import l3.d;

/* loaded from: classes2.dex */
public class BaseSettingActivity extends PPSBaseActivity {

    /* renamed from: u, reason: collision with root package name */
    public boolean f24178u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24179v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24180w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24181x = false;
    public ae y;

    /* renamed from: z, reason: collision with root package name */
    public f f24182z;

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        n7.e("BaseSettingActivity", "attachBaseContext");
        Configuration configuration = context.getResources().getConfiguration();
        configuration.fontScale = 1.0f;
        super.attachBaseContext(context.createConfigurationContext(configuration));
        n7.e("BaseSettingActivity", "reset fontScale to 1.0");
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String d() {
        return "BaseSettingActivity";
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void finish() {
        super.finish();
        if (this.f24182z == null) {
            this.f24182z = new f(this);
        }
        this.f24182z.a(2);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void finishAndRemoveTask() {
        super.finishAndRemoveTask();
        if (this.f24182z == null) {
            this.f24182z = new f(this);
        }
        this.f24182z.a(2);
    }

    public final void i() {
        int i10;
        String str;
        if ((this.f24180w && Cif.b()) || Cif.g(this)) {
            if (d0.r(this)) {
                i10 = R.style.HiAdDroiSettingThemeDrak;
            } else {
                i10 = R.style.HiAdDroiSettingTheme;
            }
        } else {
            if (Cif.e(this)) {
                str = "androidhwext:style/Theme.Emui.WithActionBar";
            } else if (Cif.f(this)) {
                str = "androidhnext:style/Theme.Magic.WithActionBar";
            } else {
                i10 = R.style.HiAdDeviceDefault;
            }
            k(str);
            return;
        }
        setTheme(i10);
    }

    public final void k(String str) {
        int identifier = getResources().getIdentifier(str, null, null);
        if (identifier > 0) {
            setTheme(identifier);
        }
    }

    public int l() {
        return 0;
    }

    public boolean m() {
        return false;
    }

    public final void o() {
        ActionBar actionBar = getActionBar();
        if (actionBar == null) {
            return;
        }
        z1.p(this);
        View inflate = getLayoutInflater().inflate(R.layout.action_bar_title_layout_hm, (ViewGroup) null);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setElevation(gl.Code);
        actionBar.setCustomView(inflate);
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            Toolbar toolbar = (Toolbar) inflate.getParent();
            if (toolbar != null) {
                toolbar.setLayoutParams(layoutParams);
                toolbar.setBackgroundColor(getResources().getColor(R.color.hiad_emui_color_subbg));
            }
            inflate.post(new ib.a(this, inflate, toolbar));
        } catch (Throwable unused) {
            n7.g("BaseSettingActivity", "setCustomToolBar error.");
        }
        if (l() != 0) {
            ((TextView) findViewById(R.id.custom_action_bar_title)).setText(l());
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = configuration.orientation;
        if (i10 == 2) {
            getWindow().addFlags(1024);
        } else if (i10 == 1) {
            getWindow().clearFlags(1024);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        f fVar = new f(this);
        this.f24182z = fVar;
        boolean z10 = true;
        fVar.a(1);
        this.f24178u = z1.R(this);
        n7.e("BaseSettingActivity", "is oobe: " + this.f24178u);
        if (getResources().getConfiguration().orientation == 2 && !this.f24178u) {
            getWindow().setFlags(1024, 1024);
        }
        super.onCreate(bundle);
        n.A(this);
        this.f24180w = d0.m(this);
        this.f24179v = Cif.a(this).d();
        int i10 = 0;
        if (d0.m(this)) {
            d dVar = new d(i10);
            synchronized (a0.a.G0) {
                a0.a.F0 = dVar;
            }
        }
        if (this.f24178u) {
            q();
        }
        this.y = new ae(this);
        if (m()) {
            o();
        }
        if (!Cif.c(this) || m.I() || Cif.g(this) || Cif.b()) {
            z10 = false;
        }
        this.f24181x = z10;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            super.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        n7.e("BaseSettingActivity", "is oobe onResume: " + this.f24178u);
        if (this.f24178u) {
            q();
        }
    }

    public final boolean p() {
        boolean z10;
        ((j1.a) this.f22388t).getClass();
        try {
            Class.forName("com.huawei.uikit.phone.hwadvancedcardview.widget.HwAdvancedCardView");
            z10 = true;
        } catch (Throwable unused) {
            n7.g("BaseDeviceImpl", "check widget available error");
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        try {
            getResources().getDrawable(hb.a.hwlistdrawable_round_rectangle_card_bg);
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public final void q() {
        View decorView;
        try {
            Window window = getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                n7.e("BaseSettingActivity", "hideNavigationBar");
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2 | 4096);
            }
        } catch (Throwable unused) {
            n7.e("BaseSettingActivity", "hideNavigation error ");
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public void b() {
    }
}
