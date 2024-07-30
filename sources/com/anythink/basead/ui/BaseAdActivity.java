package com.anythink.basead.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.anythink.basead.e.b;
import com.anythink.core.api.BaseAd;
import com.anythink.core.basead.a;
import com.anythink.core.common.b;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.y;
import com.anythink.core.common.k.h;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class BaseAdActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4095a = "BaseAdActivity";

    /* renamed from: b, reason: collision with root package name */
    boolean f4096b;

    /* renamed from: c, reason: collision with root package name */
    y f4097c;

    /* renamed from: d, reason: collision with root package name */
    long f4098d = 0;

    /* renamed from: e, reason: collision with root package name */
    long f4099e = 0;
    float f = gl.Code;

    /* renamed from: g, reason: collision with root package name */
    boolean f4100g = false;

    /* renamed from: h, reason: collision with root package name */
    b.a f4101h = new b.a() { // from class: com.anythink.basead.ui.BaseAdActivity.1
        @Override // com.anythink.core.common.b.a
        public final void a(Object obj) {
            if (!(obj instanceof y) || BaseAdActivity.this.f4104k == null) {
                return;
            }
            y yVar = (y) obj;
            if (yVar.a().B().equals(BaseAdActivity.this.f4104k.B())) {
                BaseAdActivity baseAdActivity = BaseAdActivity.this;
                if (baseAdActivity.f4096b) {
                    yVar.a(baseAdActivity);
                } else {
                    baseAdActivity.f4097c = yVar;
                }
            }
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private BaseScreenAdView f4102i;

    /* renamed from: j, reason: collision with root package name */
    private j f4103j;

    /* renamed from: k, reason: collision with root package name */
    private i f4104k;

    /* renamed from: l, reason: collision with root package name */
    private String f4105l;

    /* renamed from: m, reason: collision with root package name */
    private b.InterfaceC0061b f4106m;

    /* renamed from: n, reason: collision with root package name */
    private String f4107n;
    private int o;

    /* renamed from: p, reason: collision with root package name */
    private int f4108p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4109q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f4110r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4111s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4112t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f4113u;

    /* renamed from: v, reason: collision with root package name */
    private BaseAd f4114v;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        BaseScreenAdView fullScreenAdView;
        super.onCreate(bundle);
        if (n.a().g() == null) {
            n.a().a(getApplicationContext());
        }
        if (this instanceof AdLandscapeActivity) {
            this.f4108p = 2;
        } else {
            this.f4108p = 1;
        }
        Intent intent = getIntent();
        try {
            if (intent != null) {
                this.f4107n = intent.getStringExtra("extra_scenario");
                this.o = intent.getIntExtra(a.C0068a.f4676b, 1);
                this.f4104k = (i) intent.getSerializableExtra(a.C0068a.f4677c);
                this.f4103j = (j) intent.getSerializableExtra(a.C0068a.f4679e);
                this.f4105l = intent.getStringExtra(a.C0068a.f4678d);
                this.f4113u = a(this.o, this.f4103j);
            } else {
                Log.e("anythink", f4095a + " Intent is null.");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f4106m = com.anythink.basead.e.b.a().a(this.f4105l);
        this.f4114v = com.anythink.basead.d.i.a().a(this.f4105l);
        j jVar = this.f4103j;
        if (jVar != null && jVar.f5664m != null) {
            if (this.f4104k == null) {
                StringBuilder sb2 = new StringBuilder();
                String str = f4095a;
                sb2.append(str);
                sb2.append(" onCreate: OfferAd = null");
                Log.e("anythink", sb2.toString());
                try {
                    b.InterfaceC0061b interfaceC0061b = this.f4106m;
                    if (interfaceC0061b != null) {
                        interfaceC0061b.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, str + " onCreate: OfferAd = null"));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                finish();
                return;
            }
            com.anythink.core.common.b.a().a("1", this.f4101h);
            if (this.o != 3) {
                fullScreenAdView = new FullScreenAdView(this, this.f4103j, this.f4104k, this.f4107n, this.o, this.f4108p);
            } else if (this.f4114v != null) {
                fullScreenAdView = new ThirdPartyFullScreenAdView(this, this.f4103j, this.f4104k, this.f4107n, this.o, this.f4108p, this.f4114v);
            } else if (this.f4113u) {
                fullScreenAdView = new HalfScreenAdView(this, this.f4103j, this.f4104k, this.f4107n, this.o, this.f4108p);
            } else {
                fullScreenAdView = new FullScreenAdView(this, this.f4103j, this.f4104k, this.f4107n, this.o, this.f4108p);
            }
            this.f4102i = fullScreenAdView;
            BaseAd baseAd = this.f4114v;
            if (baseAd != null && baseAd.getCustomAdContainer() != null) {
                ViewGroup customAdContainer = this.f4114v.getCustomAdContainer();
                customAdContainer.addView(this.f4102i);
                setContentView(customAdContainer);
            } else {
                setContentView(this.f4102i);
            }
            this.f4102i.setListener(new AnonymousClass2());
            if (bundle != null) {
                this.f4109q = bundle.getBoolean(a.C0068a.f);
                this.f4110r = bundle.getBoolean(a.C0068a.f4680g);
                this.f4111s = bundle.getBoolean(a.C0068a.f4681h);
                this.f4112t = bundle.getBoolean(a.C0068a.f4684k);
                this.f4098d = bundle.getLong(a.C0068a.f4686m);
                this.f4099e = bundle.getLong(a.C0068a.f4687n);
                this.f = bundle.getFloat(a.C0068a.o);
                this.f4100g = bundle.getBoolean(a.C0068a.f4682i);
            }
            this.f4102i.setIsShowEndCard(this.f4109q);
            this.f4102i.setHideFeedbackButton(this.f4110r);
            this.f4102i.setHasReward(this.f4112t);
            if (bundle != null) {
                this.f4102i.setVideoMute(this.f4111s);
                this.f4102i.setShowBannerTime(this.f4098d);
                this.f4102i.setHideBannerTime(this.f4099e);
                this.f4102i.setCloseButtonScaleFactor(this.f);
                this.f4102i.setHasPerformClick(this.f4100g);
            }
            try {
                this.f4102i.init();
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                try {
                    b.InterfaceC0061b interfaceC0061b2 = this.f4106m;
                    if (interfaceC0061b2 != null) {
                        interfaceC0061b2.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, h.a(th2.getStackTrace())));
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                finish();
                return;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        String str2 = f4095a;
        sb3.append(str2);
        sb3.append("Start Screen Ad Error.");
        Log.e("anythink", sb3.toString());
        try {
            b.InterfaceC0061b interfaceC0061b3 = this.f4106m;
            if (interfaceC0061b3 != null) {
                interfaceC0061b3.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, str2 + "Start FullScreen Ad Error."));
            }
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f4097c = null;
        com.anythink.core.common.b.a().b("1", this.f4101h);
        BaseScreenAdView baseScreenAdView = this.f4102i;
        if (baseScreenAdView != null) {
            baseScreenAdView.t();
        }
        i iVar = this.f4104k;
        if (iVar != null && iVar.E() && !this.f4104k.L()) {
            com.anythink.core.common.a.j.a().b();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (4 == i10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f4096b = false;
        BaseScreenAdView baseScreenAdView = this.f4102i;
        if (baseScreenAdView != null) {
            baseScreenAdView.s();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f4096b = true;
        BaseScreenAdView baseScreenAdView = this.f4102i;
        if (baseScreenAdView != null) {
            baseScreenAdView.r();
        }
        y yVar = this.f4097c;
        if (yVar != null) {
            yVar.a(this);
            this.f4097c = null;
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        BaseScreenAdView baseScreenAdView = this.f4102i;
        if (baseScreenAdView != null) {
            if (baseScreenAdView.isShowEndCard()) {
                bundle.putBoolean(a.C0068a.f, true);
            }
            bundle.putBoolean(a.C0068a.f4680g, this.f4102i.needHideFeedbackButton());
            bundle.putBoolean(a.C0068a.f4681h, this.f4102i.isVideoMute());
            bundle.putBoolean(a.C0068a.f4684k, this.f4102i.hasReward());
            bundle.putLong(a.C0068a.f4686m, this.f4102i.getShowBannerTime());
            bundle.putLong(a.C0068a.f4687n, this.f4102i.getHideBannerTime());
            bundle.putFloat(a.C0068a.o, this.f4102i.getCloseButtonScaleFactor());
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setTheme(h.a(this, "myoffer_half_screen_fit_by_o", "style"));
        } else {
            super.setTheme(i10);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseAdActivity$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements b.InterfaceC0061b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void a() {
            if (BaseAdActivity.this.f4106m != null) {
                BaseAdActivity.this.f4106m.a();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void b() {
            if (BaseAdActivity.this.f4106m != null) {
                BaseAdActivity.this.f4106m.b();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void c() {
            if (BaseAdActivity.this.f4106m != null) {
                BaseAdActivity.this.f4106m.c();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void d() {
            if (BaseAdActivity.this.f4106m != null) {
                BaseAdActivity.this.f4106m.d();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void e() {
            BaseAdActivity.this.finish();
            if (BaseAdActivity.this.f4113u) {
                BaseAdActivity.this.overridePendingTransition(0, 0);
            }
            if (BaseAdActivity.this.f4106m != null) {
                BaseAdActivity.this.f4106m.e();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void a(com.anythink.basead.c.e eVar) {
            if (BaseAdActivity.this.f4106m != null) {
                BaseAdActivity.this.f4106m.a(eVar);
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void a(int i10) {
            if (BaseAdActivity.this.f4106m != null) {
                BaseAdActivity.this.f4106m.a(i10);
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void a(boolean z10) {
            if (BaseAdActivity.this.f4106m != null) {
                BaseAdActivity.this.f4106m.a(z10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context] */
    public static void a(Activity activity, com.anythink.core.basead.b.a aVar) {
        Intent intent = new Intent();
        ?? g6 = n.a().g();
        if (activity == null || activity.isFinishing()) {
            Log.i("anythink_BaseAdActivity", "Activity is null");
            activity = g6;
        }
        boolean a10 = a(aVar.f4690a, aVar.f4696h);
        if (aVar.f4694e == 2) {
            if (a10) {
                intent.setClass(activity, AdLandscapeTranslucentActivity.class);
            } else {
                intent.setClass(activity, AdLandscapeActivity.class);
            }
        } else if (a10) {
            intent.setClass(activity, AdPortraitTranslucentActivity.class);
        } else {
            intent.setClass(activity, AdPortraitActivity.class);
        }
        intent.putExtra("extra_scenario", aVar.f4691b);
        intent.putExtra(a.C0068a.f4676b, aVar.f4690a);
        intent.putExtra(a.C0068a.f4677c, aVar.f4692c);
        intent.putExtra(a.C0068a.f4678d, aVar.f4693d);
        intent.putExtra(a.C0068a.f4679e, aVar.f4696h);
        if (!(activity instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            activity.startActivity(intent);
        } catch (Throwable th) {
            b.InterfaceC0061b a11 = com.anythink.basead.e.b.a().a(aVar.f4693d);
            if (a11 != null) {
                a11.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3746b, th.getMessage()));
            }
        }
    }

    private BaseScreenAdView b() {
        if (this.o != 3) {
            return new FullScreenAdView(this, this.f4103j, this.f4104k, this.f4107n, this.o, this.f4108p);
        }
        if (this.f4114v != null) {
            return new ThirdPartyFullScreenAdView(this, this.f4103j, this.f4104k, this.f4107n, this.o, this.f4108p, this.f4114v);
        }
        if (this.f4113u) {
            return new HalfScreenAdView(this, this.f4103j, this.f4104k, this.f4107n, this.o, this.f4108p);
        }
        return new FullScreenAdView(this, this.f4103j, this.f4104k, this.f4107n, this.o, this.f4108p);
    }

    private void b(Bundle bundle) {
        this.f4102i.setListener(new AnonymousClass2());
        if (bundle != null) {
            this.f4109q = bundle.getBoolean(a.C0068a.f);
            this.f4110r = bundle.getBoolean(a.C0068a.f4680g);
            this.f4111s = bundle.getBoolean(a.C0068a.f4681h);
            this.f4112t = bundle.getBoolean(a.C0068a.f4684k);
            this.f4098d = bundle.getLong(a.C0068a.f4686m);
            this.f4099e = bundle.getLong(a.C0068a.f4687n);
            this.f = bundle.getFloat(a.C0068a.o);
            this.f4100g = bundle.getBoolean(a.C0068a.f4682i);
        }
        this.f4102i.setIsShowEndCard(this.f4109q);
        this.f4102i.setHideFeedbackButton(this.f4110r);
        this.f4102i.setHasReward(this.f4112t);
        if (bundle != null) {
            this.f4102i.setVideoMute(this.f4111s);
            this.f4102i.setShowBannerTime(this.f4098d);
            this.f4102i.setHideBannerTime(this.f4099e);
            this.f4102i.setCloseButtonScaleFactor(this.f);
            this.f4102i.setHasPerformClick(this.f4100g);
        }
        try {
            this.f4102i.init();
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                b.InterfaceC0061b interfaceC0061b = this.f4106m;
                if (interfaceC0061b != null) {
                    interfaceC0061b.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, h.a(th.getStackTrace())));
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            finish();
        }
    }

    private void a() {
        Intent intent = getIntent();
        try {
            if (intent != null) {
                this.f4107n = intent.getStringExtra("extra_scenario");
                this.o = intent.getIntExtra(a.C0068a.f4676b, 1);
                this.f4104k = (i) intent.getSerializableExtra(a.C0068a.f4677c);
                this.f4103j = (j) intent.getSerializableExtra(a.C0068a.f4679e);
                this.f4105l = intent.getStringExtra(a.C0068a.f4678d);
                this.f4113u = a(this.o, this.f4103j);
                return;
            }
            Log.e("anythink", f4095a + " Intent is null.");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static boolean a(int i10, j jVar) {
        k kVar;
        if (jVar == null || (kVar = jVar.f5664m) == null || i10 != 3) {
            return false;
        }
        return TextUtils.equals("2", kVar.E());
    }

    private void a(Bundle bundle) {
        if (bundle != null) {
            this.f4109q = bundle.getBoolean(a.C0068a.f);
            this.f4110r = bundle.getBoolean(a.C0068a.f4680g);
            this.f4111s = bundle.getBoolean(a.C0068a.f4681h);
            this.f4112t = bundle.getBoolean(a.C0068a.f4684k);
            this.f4098d = bundle.getLong(a.C0068a.f4686m);
            this.f4099e = bundle.getLong(a.C0068a.f4687n);
            this.f = bundle.getFloat(a.C0068a.o);
            this.f4100g = bundle.getBoolean(a.C0068a.f4682i);
        }
    }
}
