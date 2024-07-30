package com.huawei.openalliance.ad.ppskit.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import c5.e;
import com.anythink.expressad.exoplayer.k.p;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.e2;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.views.AppDownloadButton;
import com.huawei.openalliance.ad.ppskit.views.PPSWebView;
import com.huawei.openalliance.ad.ppskit.views.linkscroll.LinkScrollWebView;
import j7.r;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import ka.n7;

/* loaded from: classes2.dex */
public class LandingDetailsActivity extends PPSBaseActivity {
    public static final /* synthetic */ int C = 0;
    public String A;
    public MaterialClickInfo B;

    /* renamed from: u, reason: collision with root package name */
    public WeakReference<Context> f22341u;

    /* renamed from: v, reason: collision with root package name */
    public RelativeLayout f22342v;

    /* renamed from: w, reason: collision with root package name */
    public AppDownloadButton f22343w;

    /* renamed from: x, reason: collision with root package name */
    public PPSWebView f22344x;
    public ImageView y;

    /* renamed from: z, reason: collision with root package name */
    public ContentRecord f22345z;

    /* loaded from: classes2.dex */
    public class a implements Callable<ContentRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22346a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f22347b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f22348c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f22349d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f22350e;

        public a(String str, String str2, String str3, String str4, int i10) {
            this.f22346a = str;
            this.f22347b = str2;
            this.f22348c = str3;
            this.f22349d = str4;
            this.f22350e = i10;
        }

        @Override // java.util.concurrent.Callable
        public final ContentRecord call() {
            return r.m(LandingDetailsActivity.this, this.f22346a, this.f22347b, this.f22348c, this.f22349d, this.f22350e);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void b() {
        int i10;
        n7.e("LandingDetailActivity", "initLayout start.");
        if (m.K(this)) {
            i10 = R.layout.hiad_interstitial_landing_details;
        } else if (m.L(this) && m.M(this)) {
            i10 = R.layout.hiad_interstitial_foldable_landing_details;
        } else {
            i10 = R.layout.hiad_activity_landing_details;
        }
        setContentView(i10);
        i();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final String d() {
        return LandingDetailsActivity.class.getName();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        try {
            int action = motionEvent.getAction() & p.f9095b;
            if (action == 0 && (viewGroup2 = this.f22387s) != null) {
                MaterialClickInfo z10 = a0.a.z(viewGroup2, motionEvent);
                this.B = z10;
                AppDownloadButton appDownloadButton = this.f22343w;
                if (appDownloadButton != null) {
                    appDownloadButton.setClickInfo(z10);
                }
            }
            if (1 == action && (viewGroup = this.f22387s) != null) {
                a0.a.T(viewGroup, motionEvent, this.B);
                AppDownloadButton appDownloadButton2 = this.f22343w;
                if (appDownloadButton2 != null) {
                    appDownloadButton2.setClickInfo(this.B);
                }
            }
        } catch (Throwable th) {
            n7.h("LandingDetailActivity", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void e() {
        ViewGroup viewGroup = this.f22387s;
        if (viewGroup != null) {
            ((ViewGroup) viewGroup.getParent()).removeView(this.f22387s);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void finish() {
        n7.e("LandingDetailActivity", "landing detail activity is finish.");
        ViewGroup viewGroup = this.f22387s;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(getResources().getColor(R.color.hiad_0_percent_black));
        }
        super.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.activity.LandingDetailsActivity.g():void");
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void h() {
        this.f22345z = null;
        this.f22343w = null;
    }

    public final void i() {
        AppInfo j02;
        if (this.f22345z == null) {
            n7.e("LandingDetailActivity", "landing detail activity init intent.");
            SafeIntent safeIntent = new SafeIntent(getIntent());
            String stringExtra = safeIntent.getStringExtra("content_id");
            String stringExtra2 = safeIntent.getStringExtra("templateId");
            String stringExtra3 = safeIntent.getStringExtra("slotid");
            int intExtra = safeIntent.getIntExtra("apiVer", -1);
            String stringExtra4 = safeIntent.getStringExtra(ba.f22057e);
            String stringExtra5 = safeIntent.getStringExtra(ba.y);
            String stringExtra6 = safeIntent.getStringExtra("request_id");
            if (y1.h(stringExtra5)) {
                stringExtra5 = f();
            }
            String str = stringExtra5;
            if (safeIntent.hasExtra("unique_id")) {
                this.A = safeIntent.getStringExtra("unique_id");
            }
            ContentRecord contentRecord = (ContentRecord) e.e(new a(str, stringExtra, stringExtra2, stringExtra3, intExtra));
            this.f22345z = contentRecord;
            if (contentRecord == null) {
                n7.e("LandingDetailActivity", "record is null");
                finish();
                return;
            }
            if (!TextUtils.isEmpty(stringExtra4)) {
                n7.c("LandingDetailActivity", "updateShowId: %s", stringExtra4);
                this.f22345z.V1(stringExtra4);
                long a10 = y1.a(stringExtra4, -111111L);
                if (this.f22345z.W0() == 0 && -111111 != a10) {
                    this.f22345z.s2(a10);
                }
            }
            if (!TextUtils.isEmpty(this.A) && (j02 = this.f22345z.j0()) != null) {
                j02.c0(this.A);
                this.f22345z.E0(j02);
            }
            if (!TextUtils.isEmpty(stringExtra6)) {
                this.f22345z.D(stringExtra6);
            }
        }
    }

    public final void k(float f, float f10, boolean z10) {
        int a10;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f22342v.getLayoutParams();
        if (z10) {
            a10 = e2.b(this).heightPixels;
        } else {
            a10 = e2.b(this).heightPixels + d0.a(this);
        }
        layoutParams.width = (int) (e2.b(this).widthPixels * f);
        layoutParams.height = (int) (a10 * f10);
        this.f22342v.setLayoutParams(layoutParams);
    }

    public final void l() {
        AppDownloadButton appDownloadButton;
        Resources resources;
        int i10;
        if (m.K(this)) {
            k(0.72f, 0.74f, false);
            appDownloadButton = this.f22343w;
            if (appDownloadButton != null) {
                resources = getResources();
                i10 = R.dimen.hiad_274_dp;
            } else {
                return;
            }
        } else if (m.L(this) && m.M(this)) {
            k(0.72f, 0.74f, true);
            appDownloadButton = this.f22343w;
            if (appDownloadButton != null) {
                resources = getResources();
                i10 = R.dimen.hiad_228_dp;
            } else {
                return;
            }
        } else {
            k(1.0f, 0.84f, false);
            appDownloadButton = this.f22343w;
            if (appDownloadButton != null) {
                resources = getResources();
                i10 = R.dimen.hiad_200_dp;
            } else {
                return;
            }
        }
        appDownloadButton.setMinWidth(resources.getDimensionPixelSize(i10));
        this.f22343w.setMaxWidth(getResources().getDimensionPixelSize(i10));
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n7.e("LandingDetailActivity", "onConfigurationChanged.");
        l();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            n7.e("LandingDetailActivity", "onCreate start.");
            i();
            g();
        } catch (Throwable th) {
            n7.h("LandingDetailActivity", "onCreate ex: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onDestroy() {
        LinkScrollWebView linkScrollWebView;
        super.onDestroy();
        this.f22345z = null;
        PPSWebView pPSWebView = this.f22344x;
        if (pPSWebView != null && (linkScrollWebView = pPSWebView.f23296t) != null) {
            linkScrollWebView.destroy();
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        n7.e("LandingDetailActivity", "onNewIntent");
        super.onNewIntent(intent);
    }
}
