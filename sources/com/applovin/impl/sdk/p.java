package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinCFError;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinUserSegment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static p f19228a;

    /* renamed from: b, reason: collision with root package name */
    public static p f19229b;

    /* renamed from: c, reason: collision with root package name */
    protected static Context f19230c;

    /* renamed from: e, reason: collision with root package name */
    private static final long f19231e = System.currentTimeMillis();
    private static final boolean f;

    /* renamed from: g, reason: collision with root package name */
    private static a f19232g;
    private s A;
    private q B;
    private r C;
    private com.applovin.impl.sdk.c.e D;
    private o E;
    private com.applovin.impl.sdk.utils.q F;
    private e G;
    private d H;
    private v I;
    private com.applovin.impl.sdk.d.c J;
    private SessionTracker K;
    private w L;
    private ae M;
    private com.applovin.impl.sdk.network.d N;
    private m O;
    private com.applovin.impl.sdk.utils.o P;
    private k Q;
    private com.applovin.impl.b.a.b R;
    private com.applovin.impl.a.a.a S;
    private com.applovin.impl.sdk.a.f T;
    private x U;
    private ArrayService V;
    private t W;
    private PostbackServiceImpl X;
    private com.applovin.impl.sdk.network.k Y;
    private g Z;

    /* renamed from: aa, reason: collision with root package name */
    private com.applovin.impl.mediation.f f19233aa;

    /* renamed from: ab, reason: collision with root package name */
    private com.applovin.impl.mediation.e f19234ab;

    /* renamed from: ac, reason: collision with root package name */
    private MediationServiceImpl f19235ac;

    /* renamed from: ad, reason: collision with root package name */
    private com.applovin.mediation.hybridAds.d f19236ad;
    private com.applovin.impl.mediation.h ae;
    private com.applovin.impl.mediation.debugger.b af;
    private z ag;
    private com.applovin.impl.mediation.d ah;
    private com.applovin.impl.mediation.debugger.ui.testmode.c ai;
    private List<MaxAdFormat> aj;
    private final Object ak = new Object();
    private final AtomicBoolean al = new AtomicBoolean(true);
    private final AtomicBoolean am = new AtomicBoolean();
    private boolean an = false;
    private boolean ao = false;
    private boolean ap = false;
    private boolean aq = false;
    private boolean ar = false;
    private int as = 0;
    private AppLovinSdk.SdkInitializationListener at;
    private AppLovinSdk.SdkInitializationListener au;
    private AppLovinSdkConfiguration av;

    /* renamed from: d, reason: collision with root package name */
    protected com.applovin.impl.sdk.c.c f19237d;

    /* renamed from: h, reason: collision with root package name */
    private String f19238h;

    /* renamed from: i, reason: collision with root package name */
    private WeakReference<Activity> f19239i;

    /* renamed from: j, reason: collision with root package name */
    private long f19240j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19241k;

    /* renamed from: l, reason: collision with root package name */
    private AppLovinSdkSettings f19242l;

    /* renamed from: m, reason: collision with root package name */
    private AppLovinUserSegment f19243m;

    /* renamed from: n, reason: collision with root package name */
    private AppLovinTargetingData f19244n;
    private String o;

    /* renamed from: p, reason: collision with root package name */
    private AppLovinAdServiceImpl f19245p;

    /* renamed from: q, reason: collision with root package name */
    private AppLovinNativeAdService f19246q;

    /* renamed from: r, reason: collision with root package name */
    private EventServiceImpl f19247r;

    /* renamed from: s, reason: collision with root package name */
    private UserServiceImpl f19248s;

    /* renamed from: t, reason: collision with root package name */
    private AppLovinCFService f19249t;

    /* renamed from: u, reason: collision with root package name */
    private VariableServiceImpl f19250u;

    /* renamed from: v, reason: collision with root package name */
    private AppLovinSdk f19251v;

    /* renamed from: w, reason: collision with root package name */
    private y f19252w;

    /* renamed from: x, reason: collision with root package name */
    private com.applovin.impl.sdk.e.o f19253x;
    private com.applovin.impl.sdk.network.b y;

    /* renamed from: z, reason: collision with root package name */
    private com.applovin.impl.sdk.d.g f19254z;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z10 = false;
        try {
            try {
                AppLovinSdkUtils.runOnUiThread(new a0(0 == true ? 1 : 0));
                z10 = true;
            } catch (Throwable unused) {
                y.i("AppLovinSdk", "Running on older Java version.");
            }
        } finally {
            f = false;
        }
    }

    public static boolean A() {
        return f;
    }

    private void ay() {
        int i10 = this.as + 1;
        this.as = i10;
        M().a(new com.applovin.impl.sdk.e.i(i10, this, new i.a() { // from class: com.applovin.impl.sdk.p.4
            @Override // com.applovin.impl.sdk.e.i.a
            public void a(JSONObject jSONObject) {
                boolean z10;
                boolean z11;
                if (jSONObject.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                com.applovin.impl.sdk.utils.i.d(jSONObject, p.this);
                com.applovin.impl.sdk.utils.i.c(jSONObject, p.this);
                h.a(p.this);
                com.applovin.impl.sdk.utils.i.e(jSONObject, p.this);
                com.applovin.impl.sdk.utils.i.a(jSONObject, z10, p.this);
                com.applovin.impl.mediation.d.b.a(jSONObject, p.this);
                com.applovin.impl.mediation.d.b.a(jSONObject);
                com.applovin.impl.mediation.d.b.b(jSONObject, p.this);
                p.this.as().a(JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
                p pVar = p.this;
                pVar.aj = pVar.b(jSONObject);
                if (z10) {
                    List<String> explode = CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", ""));
                    p pVar2 = p.this;
                    pVar2.av = new SdkConfigurationImpl(explode, pVar2);
                }
                com.applovin.impl.sdk.utils.i.f(jSONObject, p.this);
                p.this.av().a(jSONObject);
                p.this.a(jSONObject);
                p pVar3 = p.this;
                com.applovin.impl.sdk.c.d<Boolean> dVar = com.applovin.impl.sdk.c.d.f18752u;
                Boolean bool = (Boolean) pVar3.a(dVar);
                if (bool == null) {
                    if (p.this.av.getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p.this.ar = z11;
                    p.this.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) dVar, (com.applovin.impl.sdk.c.d<Boolean>) Boolean.valueOf(z11));
                } else if (bool.booleanValue()) {
                    p.this.ar = true;
                } else {
                    p.this.ar = false;
                    if (p.this.av.getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
                        p.this.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) dVar, (com.applovin.impl.sdk.c.d<Boolean>) Boolean.TRUE);
                    }
                }
                if (p.this.e() || !p.this.f()) {
                    p.this.e("Initializing SDK in non-MAX environment...");
                } else {
                    Activity x10 = p.this.x();
                    if (!p.this.am.compareAndSet(false, true)) {
                        p.this.e("Initializing SDK in MAX environment...");
                    } else {
                        p.this.R.a(false);
                        p.this.R.a(x10, new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.sdk.p.4.1
                            @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                            public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                                p.this.e("Initializing SDK in MAX environment...");
                            }
                        });
                    }
                }
                if (((Boolean) p.this.a(com.applovin.impl.sdk.c.b.dp)).booleanValue() && !z10 && com.applovin.impl.sdk.utils.i.a(p.y())) {
                    y unused = p.this.f19252w;
                    if (y.a()) {
                        p.this.f19252w.c("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                    }
                    p.this.az();
                }
            }
        }), o.a.MAIN, StringUtils.parseInt(this.f19242l.getExtraParameters().get(AppLovinSdkExtraParameterKey.INITIALIZATION_DELAY_MILLIS), ((Integer) a(com.applovin.impl.sdk.c.b.eq)).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az() {
        this.N.a(new d.a() { // from class: com.applovin.impl.sdk.p.6
            @Override // com.applovin.impl.sdk.network.d.a
            public void a() {
                y unused = p.this.f19252w;
                if (y.a()) {
                    p.this.f19252w.c("AppLovinSdk", "Connected to internet - re-initializing SDK");
                }
                synchronized (p.this.ak) {
                    if (!p.this.an) {
                        p.this.b();
                    }
                }
                p.this.N.b(this);
            }

            @Override // com.applovin.impl.sdk.network.d.a
            public void b() {
            }
        });
    }

    public static Context y() {
        return f19230c;
    }

    public static long z() {
        return f19231e;
    }

    public String B() {
        return this.f19238h;
    }

    public AppLovinSdkSettings C() {
        return this.f19242l;
    }

    public AppLovinUserSegment D() {
        return this.f19243m;
    }

    public AppLovinAdServiceImpl E() {
        return this.f19245p;
    }

    public AppLovinNativeAdService F() {
        return this.f19246q;
    }

    public EventServiceImpl G() {
        return this.f19247r;
    }

    public UserServiceImpl H() {
        return this.f19248s;
    }

    public AppLovinCFService I() {
        return this.f19249t;
    }

    public VariableServiceImpl J() {
        return this.f19250u;
    }

    public AppLovinSdk K() {
        return this.f19251v;
    }

    public y L() {
        return this.f19252w;
    }

    public com.applovin.impl.sdk.e.o M() {
        return this.f19253x;
    }

    public com.applovin.impl.sdk.c.c N() {
        return this.f19237d;
    }

    public com.applovin.impl.sdk.network.b O() {
        return this.y;
    }

    public com.applovin.impl.sdk.d.g P() {
        return this.f19254z;
    }

    public s Q() {
        return this.A;
    }

    public q R() {
        return this.B;
    }

    public r S() {
        return this.C;
    }

    public o T() {
        return this.E;
    }

    public e U() {
        return this.G;
    }

    public d V() {
        return this.H;
    }

    public v W() {
        return this.I;
    }

    public com.applovin.impl.sdk.d.c X() {
        return this.J;
    }

    public SessionTracker Y() {
        return this.K;
    }

    public w Z() {
        return this.L;
    }

    public ae aa() {
        return this.M;
    }

    public m ab() {
        return this.O;
    }

    public com.applovin.impl.sdk.utils.o ac() {
        return this.P;
    }

    public k ad() {
        return this.Q;
    }

    public com.applovin.impl.b.a.b ae() {
        return this.R;
    }

    public com.applovin.impl.a.a.a af() {
        return this.S;
    }

    public com.applovin.impl.sdk.a.f ag() {
        return this.T;
    }

    public x ah() {
        return this.U;
    }

    public ArrayService ai() {
        return this.V;
    }

    public t aj() {
        return this.W;
    }

    public PostbackServiceImpl ak() {
        return this.X;
    }

    public com.applovin.impl.sdk.network.k al() {
        return this.Y;
    }

    public g am() {
        return this.Z;
    }

    public com.applovin.impl.mediation.f an() {
        return this.f19233aa;
    }

    public com.applovin.impl.mediation.e ao() {
        return this.f19234ab;
    }

    public MediationServiceImpl ap() {
        return this.f19235ac;
    }

    public com.applovin.mediation.hybridAds.d aq() {
        return this.f19236ad;
    }

    public com.applovin.impl.mediation.h ar() {
        return this.ae;
    }

    public com.applovin.impl.mediation.debugger.b as() {
        return this.af;
    }

    public z at() {
        return this.ag;
    }

    public com.applovin.impl.mediation.d au() {
        return this.ah;
    }

    public com.applovin.impl.mediation.debugger.ui.testmode.c av() {
        return this.ai;
    }

    public boolean aw() {
        return this.ap;
    }

    public AppLovinSdkConfiguration ax() {
        return this.av;
    }

    public void j() {
        this.O.a();
    }

    public void k() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (!this.R.g() && (sdkInitializationListener = this.at) != null) {
            if (d()) {
                this.at = null;
                this.au = null;
                this.f19234ab.a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
            } else {
                if (this.au == sdkInitializationListener) {
                    return;
                }
                this.f19234ab.a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
                if (((Boolean) a(com.applovin.impl.sdk.c.b.ap)).booleanValue()) {
                    this.at = null;
                } else {
                    this.au = sdkInitializationListener;
                }
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.p.5
                @Override // java.lang.Runnable
                public void run() {
                    y unused = p.this.f19252w;
                    if (y.a()) {
                        p.this.f19252w.b("AppLovinSdk", "Calling back publisher's initialization completion handler...");
                    }
                    sdkInitializationListener.onSdkInitialized(p.this.av);
                }
            }, Math.max(0L, ((Long) a(com.applovin.impl.sdk.c.b.aq)).longValue()));
        }
    }

    public void l() {
        y.i("AppLovinSdk", "Resetting SDK state...");
        com.applovin.impl.sdk.d.g gVar = this.f19254z;
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f18814i;
        long b10 = gVar.b(fVar);
        this.f19237d.c();
        this.f19237d.a();
        this.f19254z.a();
        this.f19254z.b(fVar, b10 + 1);
        if (this.al.compareAndSet(true, false)) {
            b();
        } else {
            this.al.set(true);
        }
    }

    public void m() {
        a((Map<String, List<?>>) null);
    }

    public void n() {
        this.S.b();
    }

    public String o() {
        return this.F.a();
    }

    public String p() {
        return this.F.b();
    }

    public String q() {
        return this.F.c();
    }

    public AppLovinTargetingDataImpl r() {
        return (AppLovinTargetingDataImpl) this.f19244n;
    }

    public String s() {
        String str = (String) a(com.applovin.impl.sdk.c.d.I);
        if (StringUtils.isValidString(str)) {
            return str;
        }
        return this.o;
    }

    public Activity t() {
        WeakReference<Activity> weakReference = this.f19239i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f19238h + "', enabled=" + this.ao + ", isFirstSession=" + this.ap + '}';
    }

    public boolean u() {
        return this.aq;
    }

    public boolean v() {
        return this.ar;
    }

    public a w() {
        return f19232g;
    }

    public Activity x() {
        Activity a10 = a(y()).a();
        if (a10 != null) {
            return a10;
        }
        return t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (y.a()) {
            this.f19252w.b("AppLovinSdk", str);
        }
        M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.sdk.e.n(this));
    }

    public boolean c() {
        boolean z10;
        synchronized (this.ak) {
            z10 = this.an;
        }
        return z10;
    }

    public boolean d() {
        boolean z10;
        synchronized (this.ak) {
            z10 = this.ao;
        }
        return z10;
    }

    public boolean f() {
        return StringUtils.containsIgnoreCase(s(), AppLovinMediationProvider.MAX);
    }

    public boolean g() {
        return Utils.checkClassExistence("com.unity3d.player.UnityPlayerActivity");
    }

    public boolean h() {
        Map<String, String> extraParameters = C().getExtraParameters();
        if (!extraParameters.containsKey("eifc")) {
            return false;
        }
        boolean equals = "iOf8gUDWef".equals(extraParameters.get("eifc"));
        if (!equals) {
            y.i("AppLovinSdk", "Invalid internal features code. Please contact your account manager to get the code.");
        }
        return equals;
    }

    public void i() {
        String str = (String) this.D.b(com.applovin.impl.sdk.c.d.f, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < Utils.toVersionCode(str)) {
                y.i("AppLovinSdk", a3.l.q(new StringBuilder("Current version ("), AppLovinSdk.VERSION, ") is older than earlier installed version (", str, "), which may cause compatibility issues."));
            }
        }
    }

    public void b() {
        synchronized (this.ak) {
            this.an = true;
            M().d();
            ay();
        }
    }

    public List<MaxAdFormat> c(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.f19237d.c(bVar);
    }

    public void d(String str) {
        this.o = str;
        b(com.applovin.impl.sdk.c.d.I);
    }

    public boolean e() {
        return this.f19241k;
    }

    public void c(String str) {
        if (y.a()) {
            a3.k.t("Setting user id: ", str, this.f19252w, "AppLovinSdk");
        }
        if (StringUtils.isValidString(str) && str.length() > Utils.kilobytesToByes(8)) {
            y.i("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + Utils.kilobytesToByes(8) + " maximum)");
        }
        this.F.a(str);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f19251v = appLovinSdk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MaxAdFormat> b(JSONObject jSONObject) {
        List asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString((String) it.next());
            if (formatFromString != null) {
                arrayList.add(formatFromString);
            }
        }
        return arrayList;
    }

    public void a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!d()) {
            this.at = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.p.1
                @Override // java.lang.Runnable
                public void run() {
                    sdkInitializationListener.onSdkInitialized(p.this.av);
                }
            });
        }
    }

    public void a(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.f19238h = str;
        this.f19240j = System.currentTimeMillis();
        this.an = true;
        this.f19242l = appLovinSdkSettings;
        this.f19243m = new j();
        this.f19244n = new AppLovinTargetingDataImpl();
        this.av = new SdkConfigurationImpl(null, this);
        f19230c = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f19239i = new WeakReference<>((Activity) context);
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(str)) {
            this.f19241k = true;
            f19229b = this;
        } else if (f19228a == null) {
            f19228a = this;
        } else {
            y.i("AppLovinSdk", "Multiple SDK instances detected");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.D = new com.applovin.impl.sdk.c.e(this);
        this.f19237d = new com.applovin.impl.sdk.c.c(this);
        this.f19252w = new y(this);
        this.I = new v(this);
        this.G = new e(this);
        this.f19247r = new EventServiceImpl(this);
        this.f19248s = new UserServiceImpl(this);
        this.f19249t = new i(this) { // from class: com.applovin.impl.sdk.p.2
        };
        this.f19250u = new VariableServiceImpl(this);
        this.J = new com.applovin.impl.sdk.d.c(this);
        this.f19253x = new com.applovin.impl.sdk.e.o(this);
        this.y = new com.applovin.impl.sdk.network.b(this);
        this.f19254z = new com.applovin.impl.sdk.d.g(this);
        this.T = new com.applovin.impl.sdk.a.f(this);
        this.P = new com.applovin.impl.sdk.utils.o(this);
        if (((Boolean) a(com.applovin.impl.sdk.c.b.dE)).booleanValue()) {
            this.A = new s(this);
            this.C = new r(this);
        } else {
            this.B = new q(this);
        }
        this.f19245p = new AppLovinAdServiceImpl(this);
        this.f19246q = new AppLovinNativeAdService(this);
        this.K = new SessionTracker(this);
        this.L = new w(this);
        this.M = new ae(this);
        this.X = new PostbackServiceImpl(this);
        this.Z = new g(this);
        this.f19233aa = new com.applovin.impl.mediation.f(this);
        this.f19234ab = new com.applovin.impl.mediation.e(this);
        this.f19235ac = new MediationServiceImpl(this);
        this.f19236ad = new com.applovin.mediation.hybridAds.d(this);
        this.ag = new z(this);
        this.af = new com.applovin.impl.mediation.debugger.b(this);
        this.ae = new com.applovin.impl.mediation.h();
        this.ah = new com.applovin.impl.mediation.d(this);
        this.E = new o(this);
        this.P = new com.applovin.impl.sdk.utils.o(this);
        this.Q = new k(this);
        this.ai = new com.applovin.impl.mediation.debugger.ui.testmode.c(this);
        this.R = new com.applovin.impl.b.a.b(this);
        this.S = new com.applovin.impl.a.a.a(this);
        this.U = new x(this);
        this.V = new ArrayService(this);
        this.W = new t(this);
        this.Y = (((Boolean) a(com.applovin.impl.sdk.c.b.f18718db)).booleanValue() || Boolean.parseBoolean(appLovinSdkSettings.getExtraParameters().get(AppLovinSdkExtraParameterKey.USE_NEW_POSTBACK_MANAGER))) ? new com.applovin.impl.sdk.network.g(this) : new com.applovin.impl.sdk.network.f(this);
        if (((Boolean) a(com.applovin.impl.sdk.c.b.bG)).booleanValue()) {
            this.H = new d(this);
        }
        this.O = new m(this);
        this.F = new com.applovin.impl.sdk.utils.q(this);
        this.f19234ab.a(MaxAdapter.InitializationStatus.INITIALIZING);
        if (appLovinSdkSettings.isExceptionHandlerEnabled() && ((Boolean) a(com.applovin.impl.sdk.c.b.au)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        com.applovin.impl.sdk.c.b<Boolean> bVar = com.applovin.impl.sdk.c.b.dp;
        if (((Boolean) a(bVar)).booleanValue()) {
            this.N = new com.applovin.impl.sdk.network.d(context);
        }
        if (TextUtils.isEmpty(str)) {
            y.i("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            y.i("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        if (str.length() != 86 && Utils.isPubInDebugMode(context, this)) {
            StringBuilder s10 = a3.l.s("Please double-check that you entered your SDK key correctly (", str, ") : ");
            s10.append(Log.getStackTraceString(new Throwable("")));
            y.i("AppLovinSdk", s10.toString());
        }
        if (Utils.isProguardRulesOmitted()) {
            y.i("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!Utils.hasAndroidCoreJsonLibrary(this)) {
            y.i("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (Utils.isVerboseLoggingEnabled(context)) {
            appLovinSdkSettings.setVerboseLogging(true);
        }
        N().a(com.applovin.impl.sdk.c.b.ah, Boolean.valueOf(appLovinSdkSettings.isVerboseLoggingEnabled()));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        com.applovin.impl.sdk.c.e eVar = this.D;
        com.applovin.impl.sdk.c.d<String> dVar = com.applovin.impl.sdk.c.d.f18737d;
        if (TextUtils.isEmpty((String) eVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) dVar, (com.applovin.impl.sdk.c.d<String>) null, defaultSharedPreferences))) {
            this.ap = true;
            this.D.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) dVar, (com.applovin.impl.sdk.c.d<String>) Boolean.toString(true), defaultSharedPreferences);
        } else {
            this.D.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) dVar, (com.applovin.impl.sdk.c.d<String>) Boolean.toString(false), defaultSharedPreferences);
        }
        com.applovin.impl.sdk.c.e eVar2 = this.D;
        com.applovin.impl.sdk.c.d<Boolean> dVar2 = com.applovin.impl.sdk.c.d.f18738e;
        if (((Boolean) eVar2.b(dVar2, Boolean.FALSE)).booleanValue()) {
            if (y.a()) {
                this.f19252w.b("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.aq = true;
        } else {
            if (y.a()) {
                this.f19252w.b("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            this.D.a(dVar2, Boolean.TRUE);
            this.D.a(com.applovin.impl.sdk.c.d.f18750s, Boolean.valueOf(this.R.b()));
        }
        com.applovin.impl.sdk.c.e eVar3 = this.D;
        com.applovin.impl.sdk.c.d<String> dVar3 = com.applovin.impl.sdk.c.d.f;
        String str2 = (String) eVar3.b(dVar3, null);
        if (StringUtils.isValidString(str2)) {
            if (AppLovinSdk.VERSION_CODE > Utils.toVersionCode(str2)) {
                this.D.a(dVar3, AppLovinSdk.VERSION);
            }
        } else {
            this.D.a(dVar3, AppLovinSdk.VERSION);
        }
        boolean a10 = com.applovin.impl.sdk.utils.i.a(y());
        if (!((Boolean) a(com.applovin.impl.sdk.c.b.dq)).booleanValue() || a10) {
            b();
        }
        if (((Boolean) a(bVar)).booleanValue() && !a10) {
            if (y.a()) {
                this.f19252w.c("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            az();
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public List<String> b(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.f19237d.b(bVar);
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t10) {
        return (T) this.D.b(dVar, t10);
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        return (T) this.D.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) t10, sharedPreferences);
    }

    public <T> void b(com.applovin.impl.sdk.c.d<T> dVar) {
        this.D.a(dVar);
    }

    public void b(String str) {
        y.f("AppLovinSdk", "Setting plugin version: " + str);
        this.f19237d.a(com.applovin.impl.sdk.c.b.dT, str);
    }

    public void a(boolean z10) {
        synchronized (this.ak) {
            this.an = false;
            this.ao = z10;
        }
        if (this.f19237d == null || this.f19253x == null) {
            return;
        }
        List<String> b10 = b(com.applovin.impl.sdk.c.a.f18679a);
        if (b10.isEmpty()) {
            this.f19253x.e();
            k();
            return;
        }
        long longValue = ((Long) a(com.applovin.impl.sdk.c.a.f18682b)).longValue();
        com.applovin.impl.sdk.e.z zVar = new com.applovin.impl.sdk.e.z(this, true, new Runnable() { // from class: com.applovin.impl.sdk.p.3
            @Override // java.lang.Runnable
            public void run() {
                if (!p.this.f19253x.a()) {
                    y unused = p.this.f19252w;
                    if (y.a()) {
                        p.this.f19252w.b("AppLovinSdk", "Timing out adapters init...");
                    }
                    p.this.f19253x.e();
                    p.this.k();
                }
            }
        });
        if (y.a()) {
            this.f19252w.b("AppLovinSdk", "Waiting for required adapters to init: " + b10 + " - timing out in " + longValue + "ms...");
        }
        this.f19253x.a(zVar, o.a.MEDIATION_TIMEOUT, longValue, true);
    }

    public void a(com.applovin.impl.mediation.a.f fVar) {
        if (this.f19253x.a()) {
            return;
        }
        List<String> b10 = b(com.applovin.impl.sdk.c.a.f18679a);
        if (b10.size() <= 0 || !this.f19234ab.b().keySet().containsAll(b10)) {
            return;
        }
        if (y.a()) {
            this.f19252w.b("AppLovinSdk", "All required adapters initialized");
        }
        this.f19253x.e();
        k();
    }

    public void a() {
        synchronized (this.ak) {
            if (!this.an && !this.ao) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            y.i("AppLovinSdk", (String) it.next());
        }
    }

    public <T> T a(com.applovin.impl.sdk.c.b<T> bVar) {
        return (T) this.f19237d.a(bVar);
    }

    public boolean a(com.applovin.impl.sdk.c.b<String> bVar, MaxAdFormat maxAdFormat) {
        return c(bVar).contains(maxAdFormat);
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t10) {
        this.D.a(dVar, t10);
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        this.D.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) t10, sharedPreferences);
    }

    public <T> void a(String str, T t10, SharedPreferences.Editor editor) {
        this.D.a(str, (String) t10, editor);
    }

    public <T> T a(com.applovin.impl.sdk.c.d<T> dVar) {
        return (T) b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) null);
    }

    public <T> T a(String str, T t10, Class<?> cls, SharedPreferences sharedPreferences) {
        return (T) com.applovin.impl.sdk.c.e.a(str, t10, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        this.D.a(sharedPreferences);
    }

    public static String a(String str) {
        return a(str, (List<String>) null);
    }

    public static String a(int i10) {
        return a(i10, (List<String>) null);
    }

    public static String a(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context y = y();
        return a(y.getResources().getIdentifier(str, com.anythink.expressad.foundation.h.i.f10128g, y.getPackageName()), list);
    }

    public static String a(int i10, List<String> list) {
        String string = y().getResources().getString(i10);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List<MaxAdFormat> list = this.aj;
        return (list == null || list.size() <= 0 || this.aj.contains(maxAdFormat)) ? false : true;
    }

    public void a(Map<String, List<?>> map) {
        this.af.a(map);
    }

    public void a(long j10) {
        this.E.a(j10);
    }

    public static a a(Context context) {
        if (f19232g == null) {
            f19232g = new a(context);
        }
        return f19232g;
    }
}
