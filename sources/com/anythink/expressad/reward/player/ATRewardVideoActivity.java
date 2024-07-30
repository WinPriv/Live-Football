package com.anythink.expressad.reward.player;

import a3.k;
import a3.l;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.anythink.core.common.a.j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.p;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.bt.module.ATTempContainer;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.bt.module.b.h;
import com.anythink.expressad.video.dynview.h.b;
import com.anythink.expressad.video.signal.activity.AbstractJSActivity;
import com.anythink.expressad.videocommon.a;
import com.anythink.expressad.videocommon.b.c;
import com.anythink.expressad.videocommon.b.e;
import com.anythink.expressad.videocommon.b.n;
import com.anythink.expressad.videocommon.e.d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ATRewardVideoActivity extends AbstractJSActivity {

    /* renamed from: a, reason: collision with root package name */
    public static String f10831a = "unitId";

    /* renamed from: b, reason: collision with root package name */
    public static String f10832b = "userId";

    /* renamed from: c, reason: collision with root package name */
    public static String f10833c = "reward";

    /* renamed from: d, reason: collision with root package name */
    public static String f10834d = "mute";

    /* renamed from: e, reason: collision with root package name */
    public static String f10835e = "isIV";
    public static String f = "isBid";

    /* renamed from: g, reason: collision with root package name */
    public static String f10836g = "isBigOffer";

    /* renamed from: h, reason: collision with root package name */
    public static String f10837h = "hasRelease";

    /* renamed from: i, reason: collision with root package name */
    public static String f10838i = "ivRewardMode";

    /* renamed from: j, reason: collision with root package name */
    public static String f10839j = "ivRewardValueType";

    /* renamed from: k, reason: collision with root package name */
    public static String f10840k = "ivRewardValue";

    /* renamed from: l, reason: collision with root package name */
    public static String f10841l = "extraData";

    /* renamed from: m, reason: collision with root package name */
    public static String f10842m = "baserequestInfo";

    /* renamed from: p, reason: collision with root package name */
    private static final String f10843p = "ATRewardVideoActivity";
    private h C;
    private d D;
    private c G;
    private com.anythink.expressad.foundation.d.c H;
    private List<c> I;
    private List<com.anythink.expressad.foundation.d.c> J;
    private ATTempContainer K;
    private AnythinkBTContainer L;
    private WindVaneWebView M;
    private com.anythink.expressad.video.bt.module.a.a N;
    private String O;
    private String P;
    private boolean Q;

    /* renamed from: q, reason: collision with root package name */
    private String f10844q;

    /* renamed from: r, reason: collision with root package name */
    private String f10845r;

    /* renamed from: s, reason: collision with root package name */
    private String f10846s;

    /* renamed from: t, reason: collision with root package name */
    private com.anythink.expressad.videocommon.c.c f10847t;

    /* renamed from: x, reason: collision with root package name */
    private int f10851x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private int f10852z;

    /* renamed from: u, reason: collision with root package name */
    private int f10848u = 2;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10849v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10850w = false;
    private boolean A = false;
    private boolean B = false;
    private boolean E = false;
    private boolean F = false;
    private int R = 1;
    private int S = 0;
    private int T = 0;
    private int U = 0;
    private int V = 0;
    private int W = 0;
    private int X = 0;
    private com.anythink.expressad.video.dynview.f.a Y = new com.anythink.expressad.video.dynview.f.a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.1
        @Override // com.anythink.expressad.video.dynview.f.a
        public final void a(Map<String, Object> map) {
            if (map.containsKey("mute")) {
                ATRewardVideoActivity.this.f10848u = ((Integer) map.get("mute")).intValue();
            }
            if (map.containsKey("position")) {
                int intValue = ((Integer) map.get("position")).intValue();
                if (ATRewardVideoActivity.this.J != null && ATRewardVideoActivity.this.J.size() > 0 && intValue > 0) {
                    ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                    aTRewardVideoActivity.H = (com.anythink.expressad.foundation.d.c) aTRewardVideoActivity.J.get(intValue);
                    ATRewardVideoActivity.b(ATRewardVideoActivity.this);
                    int i10 = intValue - 1;
                    if (ATRewardVideoActivity.this.J.get(i10) != null) {
                        ATRewardVideoActivity aTRewardVideoActivity2 = ATRewardVideoActivity.this;
                        ATRewardVideoActivity.b(aTRewardVideoActivity2, ((com.anythink.expressad.foundation.d.c) aTRewardVideoActivity2.J.get(i10)).bi());
                    }
                    ATRewardVideoActivity aTRewardVideoActivity3 = ATRewardVideoActivity.this;
                    ATRewardVideoActivity.this.H.b(aTRewardVideoActivity3.a(aTRewardVideoActivity3.H.i(), ATRewardVideoActivity.this.R));
                    ATRewardVideoActivity aTRewardVideoActivity4 = ATRewardVideoActivity.this;
                    aTRewardVideoActivity4.b(aTRewardVideoActivity4.H);
                }
            }
        }
    };
    private com.anythink.expressad.video.dynview.f.d Z = new com.anythink.expressad.video.dynview.f.d() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.2
        @Override // com.anythink.expressad.video.dynview.f.d
        public final void a(com.anythink.expressad.foundation.d.c cVar) {
            if (cVar != null) {
                if (ATRewardVideoActivity.this.L != null) {
                    new b().d(ATRewardVideoActivity.this.L);
                }
                ATRewardVideoActivity.this.H = cVar;
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                aTRewardVideoActivity.b(aTRewardVideoActivity.H);
                return;
            }
            ATRewardVideoActivity.this.b("campaign is null");
        }

        @Override // com.anythink.expressad.video.dynview.f.d
        public final void a() {
            if (ATRewardVideoActivity.this.L != null) {
                new b().d(ATRewardVideoActivity.this.L);
            }
            ATRewardVideoActivity.f(ATRewardVideoActivity.this);
            ATRewardVideoActivity.this.b();
            if (ATRewardVideoActivity.this.K != null) {
                ATRewardVideoActivity.this.K.setNotchPadding(ATRewardVideoActivity.this.X, ATRewardVideoActivity.this.T, ATRewardVideoActivity.this.V, ATRewardVideoActivity.this.U, ATRewardVideoActivity.this.W);
            }
        }
    };

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<c> f10857a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10858b;

        /* renamed from: c, reason: collision with root package name */
        private final String f10859c;

        public a(List<c> list, String str, String str2) {
            this.f10857a = list;
            this.f10858b = str;
            this.f10859c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<c> list = this.f10857a;
                if (list != null && list.size() > 0) {
                    for (c cVar : this.f10857a) {
                        if (cVar != null && cVar.n() != null) {
                            com.anythink.expressad.foundation.d.c n10 = cVar.n();
                            String str = n10.Z() + n10.aZ() + n10.S();
                            n c10 = e.a().c(this.f10858b);
                            if (c10 != null) {
                                try {
                                    c10.b(str);
                                } catch (Exception unused) {
                                }
                            }
                            if (n10.M() != null) {
                                if (!TextUtils.isEmpty(n10.M().e())) {
                                    com.anythink.expressad.videocommon.a.b(this.f10858b + "_" + n10.aZ() + "_" + this.f10859c + "_" + n10.M().e());
                                    com.anythink.expressad.videocommon.a.b(n10.w(), n10);
                                }
                                if (!TextUtils.isEmpty(n10.ar())) {
                                    com.anythink.expressad.videocommon.a.b(this.f10858b + "_" + this.f10859c + "_" + n10.ar());
                                }
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                o.a(ATRewardVideoActivity.f10843p, e10.getMessage());
            }
        }
    }

    public static /* synthetic */ int b(ATRewardVideoActivity aTRewardVideoActivity) {
        int i10 = aTRewardVideoActivity.R;
        aTRewardVideoActivity.R = i10 + 1;
        return i10;
    }

    public static /* synthetic */ boolean f(ATRewardVideoActivity aTRewardVideoActivity) {
        aTRewardVideoActivity.A = true;
        return true;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        int a10 = i.a(this, "anythink_reward_activity_close", i.f);
        int a11 = i.a(this, "anythink_reward_activity_stay", i.f);
        if (a10 > 1 && a11 > 1) {
            overridePendingTransition(a11, a10);
        }
        ATTempContainer aTTempContainer = this.K;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.K = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.L;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.L = null;
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f10844q + "_1");
        com.anythink.expressad.foundation.f.b.a().c(this.f10844q + "_2");
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        ATTempContainer aTTempContainer = this.K;
        if (aTTempContainer != null) {
            aTTempContainer.onBackPressed();
        }
        AnythinkBTContainer anythinkBTContainer = this.L;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onBackPressed();
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.K != null) {
            a(configuration.orientation);
            this.K.onConfigurationChanged(configuration);
        }
        AnythinkBTContainer anythinkBTContainer = this.L;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        WindVaneWebView windVaneWebView;
        int i10;
        List<c> list;
        String str = "";
        super.onCreate(bundle);
        com.anythink.expressad.a.f6577x = true;
        com.anythink.expressad.foundation.b.a.b().b(this);
        try {
            Intent intent = getIntent();
            this.f10844q = intent.getStringExtra(f10831a);
            int a10 = i.a(getApplicationContext(), "anythink_more_offer_activity", "layout");
            if (a10 < 0) {
                b("no anythink_more_offer_activity layout");
                return;
            }
            setContentView(a10);
            if (TextUtils.isEmpty(this.f10844q)) {
                b("data empty error");
                return;
            }
            this.C = com.anythink.expressad.reward.b.a.f10781c.get(this.f10844q);
            this.f10845r = intent.getStringExtra(com.anythink.expressad.a.y);
            this.f10847t = com.anythink.expressad.videocommon.c.c.b(intent.getStringExtra(f10833c));
            this.f10846s = intent.getStringExtra(f10832b);
            this.f10848u = intent.getIntExtra(f10834d, 2);
            this.f10849v = intent.getBooleanExtra(f10835e, false);
            this.f10850w = intent.getBooleanExtra(f, false);
            this.P = intent.getStringExtra(f10841l);
            if (this.f10849v) {
                this.f10851x = intent.getIntExtra(f10838i, 0);
                this.y = intent.getIntExtra(f10839j, 0);
                this.f10852z = intent.getIntExtra(f10840k, 0);
            }
            com.anythink.expressad.video.signal.factory.b bVar = new com.anythink.expressad.video.signal.factory.b(this);
            this.o = bVar;
            a(bVar);
            if (this.C == null) {
                b("showRewardListener is null");
                return;
            }
            d a11 = com.anythink.expressad.reward.a.e.a().a(this.f10845r, this.f10844q);
            this.D = a11;
            if (a11 == null) {
                d a12 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f10844q);
                this.D = a12;
                if (a12 == null) {
                    this.D = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f10844q, this.f10849v);
                }
            }
            d dVar = this.D;
            if (dVar != null) {
                this.f10847t.a(dVar.m());
                this.f10847t.a(this.D.n());
            }
            com.anythink.expressad.videocommon.c.c cVar = this.f10847t;
            if (cVar != null && cVar.b() <= 0) {
                this.f10847t.a(1);
            }
            int a13 = i.a(this, "anythink_reward_activity_open", i.f);
            int a14 = i.a(this, "anythink_reward_activity_stay", i.f);
            if (a13 > 1 && a14 > 1) {
                overridePendingTransition(a13, a14);
            }
            if (bundle != null) {
                try {
                    this.F = bundle.getBoolean(f10837h);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            this.I = e.a().b(this.f10844q);
            boolean booleanExtra = intent.getBooleanExtra(f10836g, false);
            this.A = booleanExtra;
            if (!booleanExtra) {
                List<c> list2 = this.I;
                if (list2 != null && list2.size() > 0) {
                    this.G = this.I.get(0);
                }
                c cVar2 = this.G;
                if (cVar2 != null) {
                    this.H = cVar2.n();
                    this.G.a(true);
                    this.G.b(false);
                }
                if (this.G == null || this.H == null || this.f10847t == null) {
                    b("data empty error");
                }
                b();
                return;
            }
            List<com.anythink.expressad.foundation.d.c> a15 = e.a().a(this.f10844q);
            this.J = a15;
            this.O = "";
            if (a15 != null && a15.size() > 0) {
                com.anythink.expressad.foundation.d.c cVar3 = this.J.get(0);
                str = cVar3.ar();
                this.O = cVar3.Z();
            }
            a.C0140a a16 = com.anythink.expressad.videocommon.a.a(this.f10844q + "_" + this.O + "_" + str);
            c cVar4 = null;
            if (a16 != null) {
                windVaneWebView = a16.a();
            } else {
                windVaneWebView = null;
            }
            this.M = windVaneWebView;
            if (windVaneWebView == null) {
                if (this.G == null && (list = this.I) != null && list.size() > 0) {
                    this.G = this.I.get(0);
                }
                if (this.G == null) {
                    e a17 = e.a();
                    if (this.f10849v) {
                        i10 = com.anythink.expressad.foundation.g.a.aU;
                    } else {
                        i10 = 94;
                    }
                    String str2 = this.f10844q;
                    boolean z10 = this.f10850w;
                    n c10 = a17.c(str2);
                    if (c10 != null) {
                        cVar4 = c10.b(i10, z10);
                    }
                    this.G = cVar4;
                }
                c cVar5 = this.G;
                if (cVar5 != null) {
                    this.H = cVar5.n();
                    this.G.a(true);
                    this.G.b(false);
                }
                if (this.G == null || this.H == null || this.f10847t == null) {
                    b("data empty error");
                }
                this.A = false;
                com.anythink.expressad.videocommon.a.a.a();
                List<com.anythink.expressad.foundation.d.c> a18 = com.anythink.expressad.videocommon.a.a.a(this.J);
                if (a18 == null) {
                    b("no available campaign");
                    return;
                }
                int size = a18.size();
                if (size == 0) {
                    b("no available campaign");
                    return;
                }
                if (a18.get(0) != null && a18.get(0).j()) {
                    if (size == 1) {
                        com.anythink.expressad.foundation.d.c cVar6 = a18.get(0);
                        this.H = cVar6;
                        if (cVar6 != null) {
                            cVar6.m();
                        }
                        b(this.H);
                        return;
                    }
                    a(a18);
                    return;
                }
                b();
                return;
            }
            c();
        } catch (Throwable th) {
            b("onCreate error".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Throwable unused) {
        }
        try {
            List<com.anythink.expressad.foundation.d.c> list = this.J;
            if (list != null && list.size() > 0) {
                Iterator<com.anythink.expressad.foundation.d.c> it = this.J.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            com.anythink.expressad.foundation.d.c cVar = this.H;
            if (cVar != null) {
                c(cVar);
            }
        } catch (Throwable th) {
            o.d(f10843p, th.getMessage());
        }
        com.anythink.expressad.video.module.b.a.a(this.f10844q);
        ATTempContainer aTTempContainer = this.K;
        com.anythink.expressad.foundation.d.c cVar2 = null;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.K = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.L;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.L = null;
        }
        this.Y = null;
        this.Z = null;
        com.anythink.expressad.foundation.g.h.a.a().execute(new a(this.I, this.f10844q, this.O));
        List<com.anythink.expressad.foundation.d.c> list2 = this.J;
        if (list2 != null && list2.size() > 0) {
            cVar2 = this.J.get(0);
        }
        if (cVar2 == null) {
            cVar2 = this.H;
        }
        if (cVar2 != null && !TextUtils.isEmpty(cVar2.S())) {
            j.a().b();
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ATTempContainer aTTempContainer = this.K;
        if (aTTempContainer != null) {
            aTTempContainer.onPause();
        }
        AnythinkBTContainer anythinkBTContainer = this.L;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        ATTempContainer aTTempContainer = this.K;
        if (aTTempContainer != null) {
            aTTempContainer.onRestart();
        }
        AnythinkBTContainer anythinkBTContainer = this.L;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onRestart();
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.anythink.expressad.foundation.f.b.f9758c) {
            return;
        }
        com.anythink.expressad.foundation.b.a.b().b(this);
        ATTempContainer aTTempContainer = this.K;
        if (aTTempContainer != null) {
            aTTempContainer.onResume();
        }
        AnythinkBTContainer anythinkBTContainer = this.L;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(f10837h, this.F);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.4
            @Override // com.anythink.expressad.foundation.f.a
            public final void a() {
                ATRewardVideoActivity.this.onPause();
            }

            @Override // com.anythink.expressad.foundation.f.a
            public final void b() {
                ATRewardVideoActivity.this.onResume();
            }

            @Override // com.anythink.expressad.foundation.f.a
            public final void c() {
                ATRewardVideoActivity.this.onResume();
            }
        };
        if (com.anythink.expressad.foundation.f.b.f9758c) {
            return;
        }
        ATTempContainer aTTempContainer = this.K;
        if (aTTempContainer != null) {
            aTTempContainer.onStart();
            this.H.l(this.f10844q);
            com.anythink.expressad.foundation.f.b.a().a(l.p(new StringBuilder(), this.f10844q, "_1"), this.H);
        }
        AnythinkBTContainer anythinkBTContainer = this.L;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStart();
            List<com.anythink.expressad.foundation.d.c> list = this.J;
            if (list != null && list.size() > 0) {
                com.anythink.expressad.foundation.d.c cVar = this.J.get(0);
                cVar.l(this.f10844q);
                com.anythink.expressad.foundation.f.b.a().a(this.f10844q + "_1", cVar);
            }
        }
        if (!this.Q) {
            com.anythink.expressad.foundation.f.b.a().b(this.f10844q + "_1", 1);
            com.anythink.expressad.foundation.f.b.a().c(this.f10844q + "_2");
            this.Q = true;
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        com.anythink.expressad.a.f6577x = false;
        try {
            super.onStop();
        } catch (Throwable unused) {
        }
        ATTempContainer aTTempContainer = this.K;
        if (aTTempContainer != null) {
            aTTempContainer.onStop();
        }
        AnythinkBTContainer anythinkBTContainer = this.L;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i.a(this, "anythink_transparent_theme", "style"));
    }

    public static /* synthetic */ int b(ATRewardVideoActivity aTRewardVideoActivity, int i10) {
        int i11 = aTRewardVideoActivity.S - i10;
        aTRewardVideoActivity.S = i11;
        return i11;
    }

    private void c() {
        p pVar;
        int c10 = c("anythink_bt_container");
        if (c10 < 0) {
            b("no anythink_webview_framelayout in anythink_more_offer_activity layout");
        }
        AnythinkBTContainer anythinkBTContainer = (AnythinkBTContainer) findViewById(c10);
        this.L = anythinkBTContainer;
        if (anythinkBTContainer == null) {
            b("env error");
        }
        this.L.setVisibility(0);
        com.anythink.expressad.video.bt.module.a.a d10 = d();
        this.N = d10;
        this.L.setBTContainerCallback(d10);
        this.L.setShowRewardVideoListener(this.C);
        this.L.setChoiceOneCallback(this.Z);
        this.L.setCampaigns(this.J);
        this.L.setCampaignDownLoadTasks(this.I);
        this.L.setRewardUnitSetting(this.D);
        this.L.setUnitId(this.f10844q);
        this.L.setPlacementId(this.f10845r);
        this.L.setUserId(this.f10846s);
        this.L.setActivity(this);
        this.L.setDeveloperExtraData(this.P);
        com.anythink.expressad.foundation.d.c cVar = this.H;
        if (((cVar != null && (pVar = cVar.aH) != null) || (this.J.get(0) != null && (pVar = this.J.get(0).aH) != null)) && !TextUtils.isEmpty(pVar.b()) && pVar.a() > 0) {
            com.anythink.expressad.videocommon.c.c cVar2 = new com.anythink.expressad.videocommon.c.c(pVar.b(), pVar.a());
            if (cVar2.b() < 0) {
                cVar2.a(1);
            }
            this.f10847t = cVar2;
        }
        this.L.setReward(this.f10847t);
        this.L.setIVRewardEnable(this.f10851x, this.y, this.f10852z);
        this.L.setIV(this.f10849v);
        this.L.setMute(this.f10848u);
        this.L.setJSFactory((com.anythink.expressad.video.signal.factory.b) this.o);
        this.L.init(this);
        this.L.onCreate();
    }

    private com.anythink.expressad.video.bt.module.a.a d() {
        if (this.N == null) {
            this.N = new com.anythink.expressad.video.bt.module.a.a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.3
                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a() {
                    if (ATRewardVideoActivity.this.C != null) {
                        ATRewardVideoActivity.this.C.a();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void b() {
                    if (ATRewardVideoActivity.this.C != null) {
                        ATRewardVideoActivity.this.C.b();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void c() {
                    if (ATRewardVideoActivity.this.C != null) {
                        ATRewardVideoActivity.this.C.c();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(boolean z10, com.anythink.expressad.videocommon.c.c cVar) {
                    if (ATRewardVideoActivity.this.C != null) {
                        ATRewardVideoActivity.this.C.a(z10, cVar);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(boolean z10, int i10) {
                    if (ATRewardVideoActivity.this.C != null) {
                        ATRewardVideoActivity.this.C.a(z10, i10);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(String str) {
                    if (ATRewardVideoActivity.this.C != null) {
                        ATRewardVideoActivity.this.C.a(str);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(com.anythink.expressad.foundation.d.c cVar) {
                    if (ATRewardVideoActivity.this.C != null) {
                        ATRewardVideoActivity.this.C.a(cVar);
                    }
                }
            };
        }
        return this.N;
    }

    private void e() {
        try {
            List<com.anythink.expressad.foundation.d.c> list = this.J;
            if (list != null && list.size() > 0) {
                Iterator<com.anythink.expressad.foundation.d.c> it = this.J.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            com.anythink.expressad.foundation.d.c cVar = this.H;
            if (cVar != null) {
                c(cVar);
            }
        } catch (Throwable th) {
            o.d(f10843p, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.anythink.expressad.foundation.d.c cVar) {
        com.anythink.expressad.foundation.d.c n10;
        try {
            List<c> list = this.I;
            if (list != null && list.size() > 0) {
                for (c cVar2 : this.I) {
                    if (cVar2 != null && (n10 = cVar2.n()) != null && TextUtils.equals(n10.aZ(), cVar.aZ()) && TextUtils.equals(n10.Z(), cVar.Z())) {
                        this.G = cVar2;
                    }
                }
            }
            this.A = true;
            b();
            ATTempContainer aTTempContainer = this.K;
            if (aTTempContainer != null) {
                aTTempContainer.setNotchPadding(this.X, this.T, this.V, this.U, this.W);
            }
        } catch (Exception e10) {
            o.d(f10843p, e10.getMessage());
            b("more offer to one offer exception");
        }
    }

    private int d(String str) {
        return i.a(getApplicationContext(), str, "layout");
    }

    private void a(List<com.anythink.expressad.foundation.d.c> list) {
        if (list == null) {
            b("no available campaign");
            return;
        }
        if (list.size() == 0) {
            b("no available campaign");
            return;
        }
        if ((list.get(0) != null ? list.get(0).k() : 0) != 5) {
            c();
            return;
        }
        for (com.anythink.expressad.foundation.d.c cVar : list) {
            if (cVar != null) {
                this.S = cVar.bi() + this.S;
            }
        }
        com.anythink.expressad.foundation.d.c cVar2 = list.get(0);
        if (cVar2 != null) {
            int a10 = a(cVar2.i(), this.R);
            this.H = cVar2;
            cVar2.m();
            this.R = 1;
            this.H.b(a10);
            b(this.H);
            return;
        }
        b("campaign is less");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        o.d(f10843p, str);
        h hVar = this.C;
        if (hVar != null) {
            hVar.a(str);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        List<com.anythink.expressad.foundation.d.c> list;
        p pVar;
        List<com.anythink.expressad.foundation.d.c> list2;
        int c10 = c("anythink_temp_container");
        if (c10 < 0) {
            b("no id anythink_bt_container in anythink_more_offer_activity layout");
        }
        ATTempContainer aTTempContainer = (ATTempContainer) findViewById(c10);
        this.K = aTTempContainer;
        if (aTTempContainer == null) {
            b("env error");
        }
        List<com.anythink.expressad.foundation.d.c> list3 = this.J;
        if (list3 != null && list3.size() > 0 && this.J.get(0).j()) {
            new b();
            b.e(this.K);
        } else {
            this.K.setVisibility(0);
        }
        a(-1);
        this.K.setVisibility(0);
        this.K.setActivity(this);
        this.K.setBidCampaign(this.f10850w);
        this.K.setBigOffer(this.A);
        this.K.setUnitId(this.f10844q);
        this.K.setCampaign(this.H);
        if (this.H.k() == 5 && (list2 = this.J) != null && list2.size() > 1) {
            View findViewById = findViewById(c("anythink_reward_root_container"));
            if (findViewById != null) {
                findViewById.setBackgroundColor(-16777216);
            }
            this.K.removeAllViews();
            this.K.setCampOrderViewData(this.J, this.S);
            this.K.setCamPlayOrderCallback(this.Y, this.R);
        }
        this.K.setCampaignDownLoadTask(this.G);
        this.K.setIV(this.f10849v);
        com.anythink.expressad.foundation.d.c cVar = this.H;
        if (cVar != null && cVar.f() == 2) {
            this.K.setIVRewardEnable(0, 0, 0);
        } else {
            this.K.setIVRewardEnable(this.f10851x, this.y, this.f10852z);
        }
        this.K.setMute(this.f10848u);
        this.K.setDeveloperExtraData(this.P);
        com.anythink.expressad.foundation.d.c cVar2 = this.H;
        if (((cVar2 != null && (pVar = cVar2.aH) != null) || ((list = this.J) != null && list.size() > 0 && this.J.get(0) != null && (pVar = this.J.get(0).aH) != null)) && !TextUtils.isEmpty(pVar.b()) && pVar.a() > 0) {
            com.anythink.expressad.videocommon.c.c cVar3 = new com.anythink.expressad.videocommon.c.c(pVar.b(), pVar.a());
            if (cVar3.b() < 0) {
                cVar3.a(1);
            }
            this.f10847t = cVar3;
        }
        this.K.setReward(this.f10847t);
        this.K.setRewardUnitSetting(this.D);
        this.K.setPlacementId(this.f10845r);
        this.K.setUserId(this.f10846s);
        this.K.setShowRewardListener(this.C);
        this.K.init(this);
        this.K.onCreate();
    }

    private void a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            int a10 = a(cVar.i(), this.R);
            this.H = cVar;
            cVar.m();
            this.R = 1;
            this.H.b(a10);
            b(this.H);
            return;
        }
        b("campaign is less");
    }

    private static WindVaneWebView a(String str) {
        a.C0140a a10 = com.anythink.expressad.videocommon.a.a(str);
        if (a10 != null) {
            return a10.a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        List<com.anythink.expressad.foundation.d.c> list = this.J;
        if (list == null || list.size() == 0) {
            return i10;
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < this.J.size(); i14++) {
            if (this.J.get(0) != null) {
                if (i14 == 0) {
                    i13 = this.J.get(0).i();
                }
                i12 += this.J.get(i14).bi();
            }
        }
        if (i11 == 1) {
            if (i10 == 0) {
                if (i12 >= 45) {
                    return 45;
                }
            } else if (i12 > i10) {
                if (i10 > 45) {
                    return 45;
                }
                return i10;
            }
            return i12;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < i11 - 1; i16++) {
            if (this.J.get(i16) != null) {
                i15 += this.J.get(i16).bi();
            }
        }
        if (i13 > i15) {
            return i13 - i15;
        }
        return 0;
    }

    private int c(String str) {
        return i.a(getApplicationContext(), str, "id");
    }

    private static void c(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            if (!TextUtils.isEmpty(cVar.be())) {
                k.f().c(cVar.be());
            }
            if (TextUtils.isEmpty(cVar.bd())) {
                return;
            }
            k.f().c(cVar.bd());
        }
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity
    public final void a(int i10, int i11, int i12, int i13, int i14) {
        this.T = i11;
        this.V = i12;
        this.U = i13;
        this.W = i14;
        this.X = i10;
        ATTempContainer aTTempContainer = this.K;
        if (aTTempContainer != null) {
            aTTempContainer.setNotchPadding(i10, i11, i12, i13, i14);
        }
        AnythinkBTContainer anythinkBTContainer = this.L;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.setNotchPadding(i10, i11, i12, i13, i14);
        }
        com.anythink.expressad.video.dynview.a.b.f11407e = i10;
        com.anythink.expressad.video.dynview.a.b.f11403a = i11;
        com.anythink.expressad.video.dynview.a.b.f11404b = i12;
        com.anythink.expressad.video.dynview.a.b.f11405c = i13;
        com.anythink.expressad.video.dynview.a.b.f11406d = i14;
    }

    private void a(int i10) {
        try {
            com.anythink.expressad.foundation.d.c cVar = this.H;
            if (cVar == null || cVar.f() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundDrawable(new ColorDrawable(0));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.K.getLayoutParams();
            int b10 = t.b(this, 58.0f);
            int b11 = t.b(this, 104.0f);
            if (this.H.M().c() == 0) {
                if (i10 == 2) {
                    layoutParams.setMargins(b11, b10, b11, b10);
                } else {
                    layoutParams.setMargins(b10, b11, b10, b11);
                }
            } else if (this.H.M().c() == 2) {
                layoutParams.setMargins(b11, b10, b11, b10);
            } else {
                layoutParams.setMargins(b10, b11, b10, b11);
            }
            this.K.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            o.d(f10843p, th.getMessage());
        }
    }
}
