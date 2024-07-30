package com.huawei.openalliance.ad.ppskit.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import cb.d;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.beans.metadata.GlobalShareData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.handlers.k;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.handlers.m;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.PPSFullScreenNotifyOptimizeView;
import com.huawei.openalliance.ad.ppskit.views.PPSFullScreenNotifyView;
import com.huawei.openalliance.ad.ppskit.views.n;
import com.huawei.openalliance.ad.ppskit.views.r;
import com.huawei.openalliance.ad.ppskit.views.s;
import com.huawei.openalliance.ad.ppskit.views.viewpager.WrapContentHeightGalleryView;
import e0.i;
import java.util.ArrayList;
import java.util.Map;
import ka.c7;
import ka.gj;
import ka.kc;
import ka.n7;
import ka.p;
import ka.r4;
import la.v;
import la.w;

/* loaded from: classes2.dex */
public class PPSFullScreenNotifyActivity extends SafeActivity implements gj {
    public String A;
    public WrapContentHeightGalleryView B;
    public p D;
    public String E;
    public b F;
    public Handler G;
    public int I;

    /* renamed from: s, reason: collision with root package name */
    public ViewGroup f22389s;

    /* renamed from: t, reason: collision with root package name */
    public int f22390t;

    /* renamed from: u, reason: collision with root package name */
    public int f22391u;

    /* renamed from: v, reason: collision with root package name */
    public View f22392v;

    /* renamed from: w, reason: collision with root package name */
    public View f22393w;

    /* renamed from: x, reason: collision with root package name */
    public PPSFullScreenNotifyView f22394x;
    public PPSFullScreenNotifyOptimizeView y;

    /* renamed from: z, reason: collision with root package name */
    public ContentRecord f22395z;
    public ArrayList C = new ArrayList();
    public boolean H = false;
    public final a J = new a();

    /* loaded from: classes2.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            PPSFullScreenNotifyActivity pPSFullScreenNotifyActivity = PPSFullScreenNotifyActivity.this;
            try {
                String action = intent.getAction();
                if (!TextUtils.isEmpty(action) && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                    String stringExtra = intent.getStringExtra("reason");
                    pPSFullScreenNotifyActivity.getClass();
                    n7.c("PPSFullScreenNotifyActivity", "systemReason:%s", stringExtra);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        if (stringExtra.equalsIgnoreCase("homekey")) {
                            pPSFullScreenNotifyActivity.getClass();
                            n7.b("PPSFullScreenNotifyActivity", "closedialog SYSTEM_HOME_KEY");
                        } else if (stringExtra.equalsIgnoreCase("recentapps")) {
                            pPSFullScreenNotifyActivity.getClass();
                            n7.e("PPSFullScreenNotifyActivity", "closedialog SYSTEM_RECENT_APPS");
                        } else {
                            return;
                        }
                        PPSFullScreenNotifyActivity.e(pPSFullScreenNotifyActivity);
                    }
                }
            } catch (Throwable th) {
                pPSFullScreenNotifyActivity.getClass();
                n7.g("PPSFullScreenNotifyActivity", "onReceive ex: ".concat(th.getClass().getSimpleName()));
            }
        }
    }

    public static void e(PPSFullScreenNotifyActivity pPSFullScreenNotifyActivity) {
        Handler handler = pPSFullScreenNotifyActivity.G;
        if (handler != null) {
            handler.postDelayed(new w(pPSFullScreenNotifyActivity), 300L);
        }
    }

    public final void b(Intent intent) {
        int i10;
        String str;
        String str2;
        int i11;
        boolean z10;
        boolean z11;
        if (intent == null) {
            str = "PPSFullScreenNotifyActivity";
            str2 = "intent is null";
        } else {
            l d10 = l.d(this);
            d10.getClass();
            p2.a(new k(d10), 0);
            p2.a(new m(d10), 0);
            synchronized (sa.b.f35296w) {
                if (sa.b.f35297x == null) {
                    sa.b.f35297x = new sa.b(this);
                }
            }
            int V = z1.V(this);
            z1.q(this, V);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            }
            int i12 = displayMetrics.heightPixels;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            WindowManager windowManager2 = (WindowManager) getSystemService("window");
            if (windowManager2 != null) {
                windowManager2.getDefaultDisplay().getRealMetrics(displayMetrics2);
            }
            int i13 = displayMetrics2.widthPixels;
            if (i12 <= i13) {
                i12 = i13;
            }
            DisplayMetrics displayMetrics3 = new DisplayMetrics();
            WindowManager windowManager3 = (WindowManager) getSystemService("window");
            if (windowManager3 != null) {
                windowManager3.getDefaultDisplay().getRealMetrics(displayMetrics3);
            }
            int i14 = displayMetrics3.heightPixels;
            DisplayMetrics displayMetrics4 = new DisplayMetrics();
            WindowManager windowManager4 = (WindowManager) getSystemService("window");
            if (windowManager4 != null) {
                windowManager4.getDefaultDisplay().getRealMetrics(displayMetrics4);
            }
            int i15 = displayMetrics4.widthPixels;
            if (i14 > i15) {
                i14 = i15;
            }
            if (V != 0 && V != 8) {
                if (com.huawei.openalliance.ad.ppskit.utils.m.K(this) || (com.huawei.openalliance.ad.ppskit.utils.m.L(this) && com.huawei.openalliance.ad.ppskit.utils.m.M(this))) {
                    this.f22390t = (i14 * 2) / 3;
                } else {
                    this.f22390t = i14;
                }
                this.f22391u = i14;
            } else {
                if (com.huawei.openalliance.ad.ppskit.utils.m.K(this) || (com.huawei.openalliance.ad.ppskit.utils.m.L(this) && com.huawei.openalliance.ad.ppskit.utils.m.M(this))) {
                    i10 = (i12 * 2) / 3;
                } else {
                    i10 = i12 / 2;
                }
                this.f22390t = i10;
                this.f22391u = i12;
            }
            this.D = new p(this);
            this.f22395z = (ContentRecord) y0.o(null, intent.getStringExtra("contentRecord"), ContentRecord.class, new Class[0]);
            if (intent.hasExtra("unique_id")) {
                String stringExtra = intent.getStringExtra("unique_id");
                this.A = stringExtra;
                this.f22395z.i3(stringExtra);
            }
            ContentRecord contentRecord = this.f22395z;
            if (contentRecord != null && contentRecord.j0() != null) {
                AppInfo j02 = this.f22395z.j0();
                l d11 = l.d(this);
                String h12 = this.f22395z.h1();
                synchronized (d11.f22585a) {
                    i11 = d11.G(h12).getInt("activate_notify_style", 0);
                    if (i11 != 1 && i11 != 2) {
                        i11 = 0;
                    }
                }
                int Y = j02.Y();
                if (i11 != 1 && i11 != 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    this.I = i11;
                } else {
                    if (Y != 1 && Y != 2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        this.I = Y;
                    } else {
                        this.I = 1;
                    }
                }
                int i16 = this.I;
                if (i16 != 1) {
                    if (i16 == 2) {
                        n7.e("PPSFullScreenNotifyActivity", "initOptimizeView");
                        ArrayList arrayList = new ArrayList();
                        this.C = arrayList;
                        WrapContentHeightGalleryView wrapContentHeightGalleryView = this.B;
                        if (wrapContentHeightGalleryView != null) {
                            wrapContentHeightGalleryView.setAdapter(new qa.l(arrayList));
                        }
                        setContentView(R.layout.hiad_activity_full_screen_notify);
                        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.hiad_installed_notify_layout);
                        this.f22389s = viewGroup;
                        viewGroup.setOnClickListener(new v(this));
                        z1.s(this.f22389s, this);
                        PPSFullScreenNotifyOptimizeView pPSFullScreenNotifyOptimizeView = new PPSFullScreenNotifyOptimizeView(this);
                        this.y = pPSFullScreenNotifyOptimizeView;
                        ContentRecord contentRecord2 = this.f22395z;
                        String str3 = this.A;
                        pPSFullScreenNotifyOptimizeView.D = contentRecord2;
                        pPSFullScreenNotifyOptimizeView.E = new kc(pPSFullScreenNotifyOptimizeView.A, contentRecord2, 2);
                        ContentRecord contentRecord3 = pPSFullScreenNotifyOptimizeView.D;
                        if (contentRecord3 != null && contentRecord3.j0() != null) {
                            pPSFullScreenNotifyOptimizeView.f23172s = pPSFullScreenNotifyOptimizeView.D.j0();
                            if (!TextUtils.isEmpty(str3)) {
                                pPSFullScreenNotifyOptimizeView.f23172s.c0(str3);
                            }
                            String appName = pPSFullScreenNotifyOptimizeView.f23172s.getAppName();
                            if (!TextUtils.isEmpty(appName)) {
                                pPSFullScreenNotifyOptimizeView.f23173t.setText(appName);
                            } else {
                                pPSFullScreenNotifyOptimizeView.f23173t.setVisibility(8);
                            }
                            String a02 = pPSFullScreenNotifyOptimizeView.f23172s.a0();
                            if (!TextUtils.isEmpty(a02)) {
                                pPSFullScreenNotifyOptimizeView.f23174u.setText(a02);
                            }
                            String b02 = pPSFullScreenNotifyOptimizeView.f23172s.b0();
                            if (!TextUtils.isEmpty(b02)) {
                                pPSFullScreenNotifyOptimizeView.f23177x.setText(b02);
                            }
                            pPSFullScreenNotifyOptimizeView.F = pPSFullScreenNotifyOptimizeView.f23172s.t();
                            ImageView imageView = pPSFullScreenNotifyOptimizeView.f23175v;
                            String iconUrl = pPSFullScreenNotifyOptimizeView.f23172s.getIconUrl();
                            if (!TextUtils.isEmpty(iconUrl) && imageView != null) {
                                n7.e("PPSFullScreenNotifyOptimizeView", "load app icon:" + y1.j(iconUrl));
                                p2.a(new com.huawei.openalliance.ad.ppskit.views.m(pPSFullScreenNotifyOptimizeView, iconUrl, imageView), 4);
                            }
                        } else {
                            n7.e("PPSFullScreenNotifyOptimizeView", "contentRecord or appInfo is null");
                        }
                        this.y.setOnCloseListener(this);
                        this.C.add(this.y);
                        WrapContentHeightGalleryView wrapContentHeightGalleryView2 = (WrapContentHeightGalleryView) findViewById(R.id.hiad_view_pager);
                        this.B = wrapContentHeightGalleryView2;
                        wrapContentHeightGalleryView2.setAdapter(new qa.l(this.C));
                        this.B.setCurrentItem(1);
                        PPSFullScreenNotifyOptimizeView pPSFullScreenNotifyOptimizeView2 = this.y;
                        pPSFullScreenNotifyOptimizeView2.B.post(new n(pPSFullScreenNotifyOptimizeView2));
                    }
                } else {
                    n7.e("PPSFullScreenNotifyActivity", "initView");
                    ArrayList arrayList2 = new ArrayList();
                    this.C = arrayList2;
                    WrapContentHeightGalleryView wrapContentHeightGalleryView3 = this.B;
                    if (wrapContentHeightGalleryView3 != null) {
                        wrapContentHeightGalleryView3.setAdapter(new qa.l(arrayList2));
                    }
                    setContentView(R.layout.hiad_activity_full_screen_notify);
                    ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.hiad_installed_notify_layout);
                    this.f22389s = viewGroup2;
                    viewGroup2.setOnClickListener(new v(this));
                    z1.s(this.f22389s, this);
                    View view = new View(this);
                    this.f22392v = view;
                    view.setBackgroundColor(0);
                    PPSFullScreenNotifyView pPSFullScreenNotifyView = new PPSFullScreenNotifyView(this);
                    this.f22394x = pPSFullScreenNotifyView;
                    ContentRecord contentRecord4 = this.f22395z;
                    String str4 = this.A;
                    pPSFullScreenNotifyView.G = contentRecord4;
                    pPSFullScreenNotifyView.H = new kc(pPSFullScreenNotifyView.A, contentRecord4, 1);
                    ContentRecord contentRecord5 = pPSFullScreenNotifyView.G;
                    if (contentRecord5 != null && contentRecord5.j0() != null) {
                        pPSFullScreenNotifyView.f23180s = pPSFullScreenNotifyView.G.j0();
                        if (!TextUtils.isEmpty(str4)) {
                            pPSFullScreenNotifyView.f23180s.c0(str4);
                        }
                        String appName2 = pPSFullScreenNotifyView.f23180s.getAppName();
                        if (!TextUtils.isEmpty(appName2)) {
                            pPSFullScreenNotifyView.f23184w.setText(appName2);
                        }
                        String a03 = pPSFullScreenNotifyView.f23180s.a0();
                        if (!TextUtils.isEmpty(a03)) {
                            pPSFullScreenNotifyView.f23185x.setText(a03);
                        }
                        ImageView imageView2 = pPSFullScreenNotifyView.y;
                        String iconUrl2 = pPSFullScreenNotifyView.f23180s.getIconUrl();
                        if (!TextUtils.isEmpty(iconUrl2) && imageView2 != null) {
                            n7.e("PPSFullScreenNotifyView", "load app icon:" + y1.j(iconUrl2));
                            p2.a(new r(pPSFullScreenNotifyView, iconUrl2, imageView2), 4);
                        }
                    } else {
                        n7.e("PPSFullScreenNotifyView", "contentRecord or appInfo is null");
                    }
                    this.f22394x.setOnCloseListener(this);
                    PPSFullScreenNotifyView pPSFullScreenNotifyView2 = this.f22394x;
                    int i17 = this.f22390t;
                    int i18 = this.f22391u;
                    pPSFullScreenNotifyView2.B = i17;
                    pPSFullScreenNotifyView2.C = i18;
                    View view2 = new View(this);
                    this.f22393w = view2;
                    view2.setBackgroundColor(0);
                    this.C.add(this.f22392v);
                    this.C.add(this.f22394x);
                    this.C.add(this.f22393w);
                    WrapContentHeightGalleryView wrapContentHeightGalleryView4 = (WrapContentHeightGalleryView) findViewById(R.id.hiad_view_pager);
                    this.B = wrapContentHeightGalleryView4;
                    wrapContentHeightGalleryView4.setAdapter(new qa.l(this.C));
                    this.B.setCurrentItem(1);
                    WrapContentHeightGalleryView wrapContentHeightGalleryView5 = this.B;
                    a aVar = this.J;
                    if (wrapContentHeightGalleryView5.f23563f0 == null) {
                        wrapContentHeightGalleryView5.f23563f0 = new ArrayList();
                    }
                    wrapContentHeightGalleryView5.f23563f0.add(aVar);
                    PPSFullScreenNotifyView pPSFullScreenNotifyView3 = this.f22394x;
                    pPSFullScreenNotifyView3.E.post(new s(pPSFullScreenNotifyView3));
                }
                ka.w wVar = new ka.w();
                wVar.f32042e = y1.d(Integer.valueOf(this.I));
                c("5", wVar);
                if (this.H) {
                    c("4", wVar);
                    this.H = false;
                }
                b bVar = this.F;
                if (bVar != null) {
                    unregisterReceiver(bVar);
                    this.F = null;
                }
                this.G = new Handler(Looper.myLooper());
                this.F = new b();
                registerReceiver(this.F, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), "android.permission.WRITE_SECURE_SETTINGS", null);
                return;
            }
            str = "PPSFullScreenNotifyActivity";
            str2 = "contentRecord or appInfo is null";
        }
        n7.e(str, str2);
        finish();
    }

    public final void c(String str, ka.w wVar) {
        if (d0.m(this)) {
            n7.e("PPSFullScreenNotifyActivity", "report event in HMS");
            AnalysisEventReport y = a0.a.y(this.f22395z);
            y.h(str);
            if (wVar != null) {
                y.j(wVar.f32042e);
                y.l(wVar.f);
            }
            c7.l(this).k("reportEventFullScreenNotify", y0.q(null, y), null, null);
            return;
        }
        this.D.m(this.E, this.f22395z, str, wVar);
    }

    public final void d() {
        PPSFullScreenNotifyView pPSFullScreenNotifyView = this.f22394x;
        if (pPSFullScreenNotifyView != null) {
            pPSFullScreenNotifyView.setVisibility(8);
        }
        PPSFullScreenNotifyOptimizeView pPSFullScreenNotifyOptimizeView = this.y;
        if (pPSFullScreenNotifyOptimizeView != null) {
            pPSFullScreenNotifyOptimizeView.setVisibility(8);
        }
        finish();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z10;
        String h12 = this.f22395z.h1();
        l d10 = l.d(this);
        synchronized (d10.f22585a) {
            Map<String, String> K = d10.K(h12, true);
            if (!a0.a.e0(K)) {
                String str = K.get("dialogDismissOnBack");
                if (!TextUtils.equals(str, "1") && TextUtils.equals(str, "0")) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        n7.f("PPSFullScreenNotifyActivity", "onBackPressed dialogDismiss: %S; pkgName: %s", Boolean.valueOf(z10), h12);
        if (z10) {
            super.onBackPressed();
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        GlobalShareData globalShareData;
        androidx.transition.n.A(this);
        super.onCreate(bundle);
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
                callingPackage = getIntent().getStringExtra(ba.y);
            } catch (Throwable th) {
                i.p(th, "get caller error:", "PPSFullScreenNotifyActivity");
            }
        }
        this.E = callingPackage;
        n7.e("PPSFullScreenNotifyActivity", "onCreate");
        try {
            b(getIntent());
        } catch (Throwable th2) {
            i.p(th2, "init error when create:", "PPSFullScreenNotifyActivity");
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onDestroy() {
        if (n7.d()) {
            n7.b("PPSFullScreenNotifyActivity", "onDestroy");
        }
        super.onDestroy();
        b bVar = this.F;
        if (bVar != null) {
            unregisterReceiver(bVar);
            this.F = null;
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        n7.e("PPSFullScreenNotifyActivity", "onNewIntent");
        super.onNewIntent(intent);
        this.H = true;
        try {
            b(intent);
        } catch (Throwable th) {
            i.p(th, "init error when create:", "PPSFullScreenNotifyActivity");
        }
    }

    /* loaded from: classes2.dex */
    public class a implements d {
        public a() {
        }

        @Override // cb.d
        public final void b(int i10) {
            if (i10 == 0) {
                PPSFullScreenNotifyActivity pPSFullScreenNotifyActivity = PPSFullScreenNotifyActivity.this;
                if (pPSFullScreenNotifyActivity.B.getCurrentItem() != 1) {
                    pPSFullScreenNotifyActivity.getClass();
                    n7.e("PPSFullScreenNotifyActivity", "onPageScrollStateChanged, state = " + i10);
                    ka.w wVar = new ka.w();
                    wVar.f32042e = y1.d(1);
                    pPSFullScreenNotifyActivity.c("3", wVar);
                    pPSFullScreenNotifyActivity.d();
                }
            }
        }

        @Override // cb.d
        public final void a() {
        }

        @Override // cb.d
        public final void c() {
        }
    }
}
