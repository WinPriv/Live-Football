package com.huawei.openalliance.ad.ppskit.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.transition.n;
import c5.e;
import com.hamkho.livefoot.R;
import com.huawei.hag.abilitykit.api.KitSdkManager;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.bi;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.handlers.x;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView;
import j7.r;
import java.util.concurrent.Callable;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public class InterstitialAdActivity extends PPSBaseActivity implements va.a, PPSInterstitialView.e {

    /* renamed from: u, reason: collision with root package name */
    public ContentRecord f22332u;

    /* renamed from: v, reason: collision with root package name */
    public String f22333v;

    /* renamed from: w, reason: collision with root package name */
    public String f22334w;

    /* renamed from: x, reason: collision with root package name */
    public PPSInterstitialView f22335x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public String f22336z;

    /* loaded from: classes2.dex */
    public class a implements Callable<ContentRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22337a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Intent f22338b;

        public a(String str, Intent intent) {
            this.f22337a = str;
            this.f22338b = intent;
        }

        @Override // java.util.concurrent.Callable
        public final ContentRecord call() {
            InterstitialAdActivity interstitialAdActivity = InterstitialAdActivity.this;
            return r.o(interstitialAdActivity, interstitialAdActivity.f22334w, this.f22337a, this.f22338b);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final Context f22340s;

        public b(Context context) {
            this.f22340s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (x.i()) {
                n7.f("InterstitialAdActivity", "init abilitySDK retCode is %s", Integer.valueOf(KitSdkManager.getInstance().initSync(this.f22340s)));
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void b() {
        int i10;
        int i11;
        this.f22334w = f();
        l d10 = l.d(this);
        String str = this.f22334w;
        synchronized (d10.f22585a) {
            i10 = d10.G(str).getInt("ite_ad_fs", d10.f22601s ? 1 : 0);
        }
        this.y = i10;
        if (i10 != 1 && i10 != 0) {
            this.y = Cif.a(this).d() ? 1 : 0;
        }
        n7.c(d(), "iteAdFs %s", Integer.valueOf(this.y));
        if (this.y == 1) {
            setContentView(R.layout.hiad_activity_interstitial_half);
            i11 = R.id.hiad_interstitial_half_layout;
        } else {
            setContentView(R.layout.hiad_activity_interstitial);
            i11 = R.id.hiad_interstitial_layout;
        }
        this.f22387s = (ViewGroup) findViewById(i11);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public String d() {
        return "InterstitialAdActivity";
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void e() {
        ViewGroup viewGroup = this.f22387s;
        if (viewGroup != null) {
            ((ViewGroup) viewGroup.getParent()).removeView(this.f22387s);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void g() {
        int i10;
        this.f22334w = f();
        l d10 = l.d(this);
        String str = this.f22334w;
        synchronized (d10.f22585a) {
            i10 = d10.G(str).getInt("ite_ad_fs", d10.f22601s ? 1 : 0);
        }
        this.y = i10;
        if (i10 != 1 && i10 != 0) {
            this.y = Cif.a(this).d() ? 1 : 0;
        }
        Window window = getWindow();
        try {
            if (this.y == 0) {
                window.getDecorView().setBackground(getResources().getDrawable(R.color.hiad_black));
                window.getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-17));
            } else {
                window.getDecorView().setBackground(getResources().getDrawable(R.color.hiad_80_percent_white));
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
        } catch (Throwable th) {
            n7.e(d(), "interstitial adapterONotch error ".concat(th.getClass().getSimpleName()));
        }
        try {
            Intent intent = getIntent();
            if (intent == null) {
                n7.e(d(), "intent is null");
                finish();
                return;
            }
            String stringExtra = intent.getStringExtra("content_id");
            String stringExtra2 = intent.getStringExtra("request_id");
            String stringExtra3 = intent.getStringExtra(ba.f22057e);
            String stringExtra4 = intent.getStringExtra(ba.N);
            String stringExtra5 = intent.getStringExtra(ba.O);
            this.f22333v = intent.getStringExtra("sdk_version");
            if (intent.hasExtra("unique_id")) {
                this.f22336z = getIntent().getStringExtra("unique_id");
            }
            ContentRecord contentRecord = (ContentRecord) e.e(new a(stringExtra, intent));
            this.f22332u = contentRecord;
            if (contentRecord != null) {
                contentRecord.t3(this.f22334w);
                this.f22332u.B(this.f22333v);
                this.f22332u.D(stringExtra2);
                this.f22332u.V1(stringExtra3);
                this.f22332u.i2(c(intent));
                this.f22332u.Y(stringExtra4);
                this.f22332u.b0(stringExtra5);
                AppInfo j02 = this.f22332u.j0();
                if (j02 != null) {
                    j02.c0(this.f22336z);
                    this.f22332u.E0(j02);
                }
                z1.q(this, z1.V(this));
                l();
                p2.a(new b(getApplicationContext()), 1);
                return;
            }
            n7.g(d(), "Insterstitial ad is null, finish, this should not happen");
            finish();
        } catch (Throwable th2) {
            n7.e(d(), "init interstitial ad fail ".concat(th2.getClass().getSimpleName()));
        }
    }

    public final void k(int i10, int i11, int i12) {
        Intent intent = new Intent("com.huawei.hms.pps.action.PPS_INTERSTITIAL_STATUS_CHANGED");
        intent.setPackage(this.f22334w);
        intent.putExtra("interstitial_ad_status", i10);
        if (i10 == 6) {
            intent.putExtra("interstitial_ad_error", i11);
            intent.putExtra("interstitial_ad_extra", i12);
        }
        if (d0.m(this)) {
            sendBroadcast(intent);
        } else {
            n.B(this, this.f22334w, bi.V, intent);
        }
    }

    public final void l() {
        int i10;
        if (this.y == 1) {
            i10 = R.id.pps_interstitial_view_half;
        } else {
            i10 = R.id.pps_interstitial_view;
        }
        PPSInterstitialView pPSInterstitialView = (PPSInterstitialView) findViewById(i10);
        this.f22335x = pPSInterstitialView;
        ContentRecord contentRecord = this.f22332u;
        String str = this.f22334w;
        int i11 = getResources().getConfiguration().orientation;
        pPSInterstitialView.w(contentRecord, str, this.f22333v);
        this.f22335x.setOnCloseListener(this);
        this.f22335x.f23207v0 = this;
        k(1, -1, -1);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        k(4, -1, -1);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g();
        j();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        PPSInterstitialView pPSInterstitialView = this.f22335x;
        if (pPSInterstitialView != null) {
            pPSInterstitialView.f23207v0 = null;
            pPSInterstitialView.h();
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onPause() {
        n7.e("InterstitialActivity", "onPause");
        PPSInterstitialView pPSInterstitialView = this.f22335x;
        if (pPSInterstitialView != null) {
            pPSInterstitialView.g();
        }
        super.onPause();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onResume() {
        n7.e("InterstitialActivity", "onResume");
        PPSInterstitialView pPSInterstitialView = this.f22335x;
        if (pPSInterstitialView != null) {
            pPSInterstitialView.G(true);
        }
        super.onResume();
    }
}
