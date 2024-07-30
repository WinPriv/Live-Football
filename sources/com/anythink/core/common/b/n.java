package com.anythink.core.common.b;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATCustomAdapterConfig;
import com.anythink.core.api.ATDebuggerConfig;
import com.anythink.core.api.ATInitConfig;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATNetworkConfig;
import com.anythink.core.api.ATPrivacyConfig;
import com.anythink.core.api.AdError;
import com.anythink.core.api.DeviceInfoCallback;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IATAdFilter;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.ak;
import com.anythink.core.common.k.s;
import com.anythink.core.common.r;
import com.anythink.core.common.t;
import com.anythink.core.common.u;
import com.anythink.core.common.v;
import com.anythink.core.common.w;
import com.anythink.core.common.x;
import com.anythink.network.adx.AdxATInitManager;
import com.huawei.hms.framework.common.ExceptionCode;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5189a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5190b = 1;

    /* renamed from: j, reason: collision with root package name */
    private static volatile n f5191j;
    private String F;
    private String G;
    private boolean I;
    private com.anythink.core.common.f.c K;
    private Location L;
    private JSONArray N;
    private List<String> O;
    private String Q;
    private ATDebuggerConfig R;
    private boolean S;
    private ConcurrentHashMap<String, IATAdFilter> W;
    private ATPrivacyConfig Y;

    /* renamed from: aa, reason: collision with root package name */
    private ak f5192aa;

    /* renamed from: c, reason: collision with root package name */
    Boolean f5194c;

    /* renamed from: e, reason: collision with root package name */
    WeakReference<Activity> f5196e;
    private int f;

    /* renamed from: k, reason: collision with root package name */
    private Context f5200k;

    /* renamed from: l, reason: collision with root package name */
    private String f5201l;

    /* renamed from: m, reason: collision with root package name */
    private String f5202m;
    private String o;

    /* renamed from: r, reason: collision with root package name */
    private ConcurrentHashMap<String, ATCustomAdapterConfig> f5206r;

    /* renamed from: s, reason: collision with root package name */
    private Map<String, Boolean> f5207s;

    /* renamed from: t, reason: collision with root package name */
    private String f5208t;

    /* renamed from: v, reason: collision with root package name */
    private BroadcastReceiver f5210v;

    /* renamed from: w, reason: collision with root package name */
    private String f5211w;

    /* renamed from: x, reason: collision with root package name */
    private String f5212x;
    private String y;

    /* renamed from: z, reason: collision with root package name */
    private IExHandler f5213z;

    /* renamed from: g, reason: collision with root package name */
    private final String f5197g = "SDK.init";

    /* renamed from: h, reason: collision with root package name */
    private final String f5198h = "com.anythink.pd.ExHandler";

    /* renamed from: i, reason: collision with root package name */
    private boolean f5199i = false;
    private boolean B = false;
    private boolean C = false;
    private long D = 0;
    private long E = 0;
    private boolean J = false;
    private String M = "";
    private int T = 1;
    private boolean U = false;
    private boolean V = false;
    private String X = "";
    private int Z = 1;

    /* renamed from: d, reason: collision with root package name */
    long f5195d = 0;

    /* renamed from: n, reason: collision with root package name */
    private Handler f5203n = new Handler(Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    private ConcurrentHashMap<String, Map<String, Object>> f5205q = new ConcurrentHashMap<>();

    /* renamed from: p, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f5204p = new ConcurrentHashMap<>();
    private final String A = a3.l.p(new StringBuilder(), File.separator, "anythink.test");
    private boolean H = true;
    private ConcurrentHashMap<String, List<String>> P = new ConcurrentHashMap<>();

    /* renamed from: u, reason: collision with root package name */
    private JSONObject f5209u = new JSONObject();

    /* renamed from: ab, reason: collision with root package name */
    private long f5193ab = System.currentTimeMillis();

    /* renamed from: com.anythink.core.common.b.n$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                com.anythink.core.common.k.d.a(n.this.f5200k);
                com.anythink.core.common.k.d.q(n.this.f5200k);
            } catch (Exception unused) {
            }
            if (n.this.A()) {
                String d10 = com.anythink.core.common.k.d.d(n.this.f5200k);
                Log.i("anythink", "********************************** " + com.anythink.core.common.k.g.a() + " *************************************");
                Log.i("anythink", "GAID(ADID): " + com.anythink.core.common.k.d.f() + " , AndroidID: " + d10);
                StringBuilder sb2 = new StringBuilder("********************************** ");
                sb2.append(com.anythink.core.common.k.g.a());
                sb2.append(" *************************************");
                Log.i("anythink", sb2.toString());
                if (!TextUtils.isEmpty(d10)) {
                    Log.i("anythink", "You can use \"ATSDK.setDebuggerConfig(context, \"" + d10 + "\",new ATDebuggerConfig.Builder(the NetworkFirmId you want to test).build());\" to open the debugger mode.");
                }
            }
        }
    }

    /* renamed from: com.anythink.core.common.b.n$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass10 extends BroadcastReceiver {
        public AnonymousClass10() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (com.anythink.core.common.k.h.a(context)) {
                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.n.10.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a().b();
                    }
                });
                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.n.10.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a().b();
                    }
                });
                com.anythink.core.common.j.b.a().b();
                n nVar = n.this;
                nVar.a(context, nVar.p(), n.this.q());
            }
            if (TextUtils.equals(intent.getAction(), g.C)) {
                com.anythink.core.common.j.c.a(intent.getStringExtra(g.D));
            }
        }
    }

    /* renamed from: com.anythink.core.common.b.n$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass11 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f5218a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5219b;

        public AnonymousClass11(Context context, String str) {
            this.f5218a = context;
            this.f5219b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.c.a b10 = com.anythink.core.c.b.a(this.f5218a.getApplicationContext()).b(this.f5219b);
            if (b10 != null) {
                if (!b10.G()) {
                    r.a(n.this.f5200k).a(b10);
                }
                if (!com.anythink.core.c.b.a(this.f5218a.getApplicationContext()).a(this.f5219b)) {
                    com.anythink.core.c.b.a(this.f5218a.getApplicationContext());
                }
            }
        }
    }

    /* renamed from: com.anythink.core.common.b.n$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATInitConfig f5237a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f5238b;

        public AnonymousClass5(ATInitConfig aTInitConfig, Context context) {
            this.f5237a = aTInitConfig;
            this.f5238b = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x0020, B:15:0x0058, B:18:0x0075, B:22:0x008c, B:24:0x009d, B:25:0x00d1, B:32:0x0055, B:38:0x0025), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r11 = this;
                com.anythink.core.api.ATInitConfig r0 = r11.f5237a     // Catch: java.lang.Throwable -> Ldc
                com.anythink.core.api.ATInitMediation r0 = r0.getInitMediation()     // Catch: java.lang.Throwable -> Ldc
                if (r0 == 0) goto Ldb
                java.lang.String r1 = r0.getNetworkName()     // Catch: java.lang.Throwable -> Ldc
                com.anythink.core.common.b.n r2 = com.anythink.core.common.b.n.this     // Catch: java.lang.Throwable -> Ldc
                android.content.Context r2 = com.anythink.core.common.b.n.a(r2)     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r3 = "anythink_network_init_data"
                java.lang.String r4 = ""
                java.lang.String r2 = com.anythink.core.common.k.p.b(r2, r3, r1, r4)     // Catch: java.lang.Throwable -> Ldc
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ldc
                if (r3 != 0) goto L25
                java.util.Map r2 = com.anythink.core.common.k.h.c(r2)     // Catch: java.lang.Throwable -> Ldc
                goto L32
            L25:
                com.anythink.core.api.ATInitConfig r2 = r11.f5237a     // Catch: java.lang.Throwable -> Ldc
                java.util.Map r2 = r2.getRequestParamMap()     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r3 = "anythink_local"
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Ldc
                r2.put(r3, r4)     // Catch: java.lang.Throwable -> Ldc
            L32:
                r3 = 0
                android.content.Context r4 = r11.f5238b     // Catch: java.lang.Throwable -> L52
                com.anythink.core.common.b.p r4 = com.anythink.core.common.b.p.a(r4)     // Catch: java.lang.Throwable -> L52
                boolean r4 = r4.c()     // Catch: java.lang.Throwable -> L52
                android.content.Context r5 = r11.f5238b     // Catch: java.lang.Throwable -> L4f
                com.anythink.core.common.b.p r5 = com.anythink.core.common.b.p.a(r5)     // Catch: java.lang.Throwable -> L4f
                boolean r5 = r5.d()     // Catch: java.lang.Throwable -> L4f
                android.content.Context r6 = r11.f5238b     // Catch: java.lang.Throwable -> L4d
                r0.setUserDataConsent(r6, r4, r5)     // Catch: java.lang.Throwable -> L4d
                goto L58
            L4d:
                r6 = move-exception
                goto L55
            L4f:
                r6 = move-exception
                r5 = r3
                goto L55
            L52:
                r6 = move-exception
                r4 = r3
                r5 = r4
            L55:
                r6.printStackTrace()     // Catch: java.lang.Throwable -> Ldc
            L58:
                android.content.Context r6 = r11.f5238b     // Catch: java.lang.Throwable -> Ldc
                com.anythink.core.c.b r6 = com.anythink.core.c.b.a(r6)     // Catch: java.lang.Throwable -> Ldc
                com.anythink.core.common.b.n r7 = com.anythink.core.common.b.n.this     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r7 = com.anythink.core.common.b.n.e(r7)     // Catch: java.lang.Throwable -> Ldc
                com.anythink.core.c.a r6 = r6.b(r7)     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r7 = "app_ccpa_switch"
                int r8 = r6.p()     // Catch: java.lang.Throwable -> Ldc
                r9 = 3
                r10 = 1
                if (r8 != r9) goto L74
                r8 = r10
                goto L75
            L74:
                r8 = r3
            L75:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> Ldc
                r2.put(r7, r8)     // Catch: java.lang.Throwable -> Ldc
                boolean r7 = com.anythink.core.common.k.g.b()     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r8 = "app_coppa_switch"
                int r6 = r6.q()     // Catch: java.lang.Throwable -> Ldc
                r9 = 2
                if (r6 != r9) goto L8c
                if (r7 == 0) goto L8c
                r3 = r10
            L8c:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Ldc
                r2.put(r8, r3)     // Catch: java.lang.Throwable -> Ldc
                com.anythink.core.common.b.n r3 = com.anythink.core.common.b.n.a()     // Catch: java.lang.Throwable -> Ldc
                boolean r3 = r3.A()     // Catch: java.lang.Throwable -> Ldc
                if (r3 == 0) goto Ld1
                java.lang.String r3 = "anythink"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r7 = "pre init network: ["
                r6.<init>(r7)     // Catch: java.lang.Throwable -> Ldc
                r6.append(r1)     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r1 = "], params: "
                r6.append(r1)     // Catch: java.lang.Throwable -> Ldc
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ldc
                r1.<init>(r2)     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ldc
                r6.append(r1)     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r1 = ", gdpr: "
                r6.append(r1)     // Catch: java.lang.Throwable -> Ldc
                r6.append(r4)     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r1 = ", in eu: "
                r6.append(r1)     // Catch: java.lang.Throwable -> Ldc
                r6.append(r5)     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> Ldc
                android.util.Log.i(r3, r1)     // Catch: java.lang.Throwable -> Ldc
            Ld1:
                com.anythink.core.common.b.n r1 = com.anythink.core.common.b.n.this     // Catch: java.lang.Throwable -> Ldc
                android.content.Context r1 = com.anythink.core.common.b.n.a(r1)     // Catch: java.lang.Throwable -> Ldc
                r3 = 0
                r0.initSDK(r1, r2, r3)     // Catch: java.lang.Throwable -> Ldc
            Ldb:
                return
            Ldc:
                r0 = move-exception
                r0.printStackTrace()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.b.n.AnonymousClass5.run():void");
        }
    }

    private n() {
    }

    public static /* synthetic */ void N() {
        try {
            Object obj = null;
            try {
                obj = AdxATInitManager.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
                Log.e("anythink", "Cannot instantiate " + AdxATInitManager.class.getName() + ", please check if SDK is imported");
            }
            if (obj != null && (obj instanceof ATInitMediation)) {
                ((ATInitMediation) obj).getResourceStatus();
            }
        } catch (Throwable unused2) {
        }
    }

    private void O() {
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass1());
    }

    private static void P() {
        try {
            Object obj = null;
            try {
                obj = AdxATInitManager.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
                Log.e("anythink", "Cannot instantiate " + AdxATInitManager.class.getName() + ", please check if SDK is imported");
            }
            if (obj != null && (obj instanceof ATInitMediation)) {
                ((ATInitMediation) obj).getResourceStatus();
            }
        } catch (Throwable unused2) {
        }
    }

    private void Q() {
        try {
            BroadcastReceiver broadcastReceiver = this.f5210v;
            if (broadcastReceiver != null) {
                this.f5200k.unregisterReceiver(broadcastReceiver);
                k.a(this.f5200k).a(this.f5210v);
            }
            this.f5210v = null;
        } catch (Throwable unused) {
        }
        try {
            this.f5210v = new AnonymousClass10();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction(g.C);
            this.f5200k.registerReceiver(this.f5210v, intentFilter);
            k.a(this.f5200k).a(this.f5210v, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    private static boolean R() {
        return true;
    }

    private void S() {
        Throwable th;
        boolean z10;
        boolean z11 = false;
        if (this.f5200k != null) {
            try {
                z10 = new File(this.f5200k.getExternalFilesDir(null), this.A).exists();
                if (!z10) {
                    try {
                        z10 = new File(this.f5200k.getFilesDir(), this.A).exists();
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                        z11 = z10;
                        this.B = z11;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
            z11 = z10;
        }
        this.B = z11;
    }

    private boolean T() {
        return this.H;
    }

    private long U() {
        return this.f5193ab;
    }

    private Map<String, Object> q(String str) {
        if (this.f5205q == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f5205q.get(str);
    }

    private void r(String str) {
        this.f5201l = str;
        com.anythink.core.common.k.p.a(this.f5200k, g.o, g.f5008p, str);
    }

    private void s(String str) {
        this.f5202m = str;
        com.anythink.core.common.k.p.a(this.f5200k, g.o, g.f5009q, str);
    }

    public final boolean A() {
        if (!this.B && !this.C) {
            return false;
        }
        return true;
    }

    public final com.anythink.core.common.f.c B() {
        if (this.K == null) {
            this.K = new com.anythink.core.common.h.d();
        }
        return this.K;
    }

    public final boolean C() {
        return this.U;
    }

    public final boolean D() {
        return this.V;
    }

    public final Context E() {
        WeakReference<Activity> weakReference = this.f5196e;
        if (weakReference != null && weakReference.get() != null) {
            return this.f5196e.get();
        }
        return this.f5200k;
    }

    public final Activity F() {
        WeakReference<Activity> weakReference = this.f5196e;
        if (weakReference != null && weakReference.get() != null) {
            return this.f5196e.get();
        }
        return null;
    }

    public final String G() {
        return this.X;
    }

    public final boolean H() {
        Boolean bool = this.f5194c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Class.forName("com.reyun.mobdna.MobDNA");
            this.f5194c = Boolean.TRUE;
        } catch (Throwable unused) {
            this.f5194c = Boolean.FALSE;
        }
        return this.f5194c.booleanValue();
    }

    public final boolean I() {
        return this.J;
    }

    public final ATPrivacyConfig J() {
        return this.Y;
    }

    public final int K() {
        return this.Z;
    }

    public final ak L() {
        if (this.f5192aa == null) {
            this.f5192aa = new ak();
        }
        try {
            this.f5192aa.a(com.anythink.core.common.k.d.s(a().f5200k));
            this.f5192aa.b(com.anythink.core.common.k.d.k());
            this.f5192aa.c(com.anythink.core.common.k.d.m());
            this.f5192aa.d(com.anythink.core.common.k.d.b(com.anythink.core.common.k.d.l()));
        } catch (Throwable unused) {
        }
        return this.f5192aa;
    }

    public final void M() {
        this.f5193ab = System.currentTimeMillis();
    }

    public final synchronized IExHandler b() {
        if (this.f5199i) {
            return this.f5213z;
        }
        try {
            Constructor declaredConstructor = Class.forName("com.anythink.pd.ExHandler").asSubclass(IExHandler.class).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            this.f5213z = (IExHandler) declaredConstructor.newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        this.f5199i = true;
        return this.f5213z;
    }

    public final synchronized String[] f() {
        Set<String> keySet;
        int size;
        Map<String, Boolean> map = this.f5207s;
        if (map == null || (size = (keySet = map.keySet()).size()) <= 0) {
            return null;
        }
        String[] strArr = new String[size];
        keySet.toArray(strArr);
        return strArr;
    }

    public final Context g() {
        return this.f5200k;
    }

    public final long h() {
        return this.D;
    }

    public final long i() {
        return this.E;
    }

    public final int j() {
        return this.f;
    }

    public final List<String> k() {
        return this.O;
    }

    public final JSONArray l() {
        return this.N;
    }

    public final Map<String, Object> m() {
        return this.f5204p;
    }

    public final String n() {
        Object obj = this.f5204p.get("channel");
        return obj != null ? obj.toString() : "";
    }

    public final String o() {
        Object obj = this.f5204p.get("sub_channel");
        return obj != null ? obj.toString() : "";
    }

    public final String p() {
        if (TextUtils.isEmpty(this.f5201l)) {
            this.f5201l = com.anythink.core.common.k.p.b(this.f5200k, g.o, g.f5008p, "");
        }
        return this.f5201l;
    }

    public final String t() {
        return this.M;
    }

    public final boolean u() {
        return this.S;
    }

    public final boolean v() {
        if (this.S && this.R != null) {
            return true;
        }
        return false;
    }

    public final ATDebuggerConfig w() {
        return this.R;
    }

    public final String x() {
        if (TextUtils.isEmpty(this.f5211w)) {
            this.f5211w = com.anythink.core.common.k.p.b(this.f5200k, g.o, g.o.f5141i, "");
        }
        return this.f5211w;
    }

    public final String y() {
        if (TextUtils.isEmpty(this.f5212x)) {
            this.f5212x = com.anythink.core.common.k.p.b(this.f5200k, g.f5015w, g.o.f5144l, "");
        }
        return this.f5212x;
    }

    public final String z() {
        if (TextUtils.isEmpty(this.y)) {
            this.y = com.anythink.core.common.k.p.b(this.f5200k, g.f5015w, g.o.f5145m, "");
        }
        return this.y;
    }

    public static n a() {
        if (f5191j == null) {
            synchronized (n.class) {
                if (f5191j == null) {
                    f5191j = new n();
                }
            }
        }
        return f5191j;
    }

    public static boolean h(String str) {
        try {
            Class.forName(str);
            Log.i("anythink", "SDK: VERIFIED");
            return true;
        } catch (Throwable unused) {
            Log.i("anythink", "SDK: NOT VERIFIED");
            return false;
        }
    }

    @Deprecated
    private void t(String str) {
        this.Q = str;
    }

    private synchronized String u(String str) {
        String optString = this.f5209u.optString(str);
        if (!TextUtils.isEmpty(optString)) {
            return optString;
        }
        String x10 = x();
        String str2 = "";
        if (TextUtils.isEmpty(x10)) {
            x10 = com.anythink.core.common.k.d.d(this.f5200k) + com.anythink.core.common.k.d.f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(new Random().nextInt(ExceptionCode.CRASH_EXCEPTION));
            str2 = sb2.toString();
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a10 = com.anythink.core.common.k.f.a(x10 + str + str2 + currentTimeMillis);
        try {
            this.f5209u.put(str, a10);
        } catch (Exception unused) {
        }
        com.anythink.core.common.k.p.a(this.f5200k, g.o, g.o.f5139g, this.f5209u.toString());
        if (!TextUtils.isEmpty(x())) {
            str2 = null;
        }
        com.anythink.core.common.j.c.a(str, "2", str2, String.valueOf(currentTimeMillis));
        return a10;
    }

    public final String c() {
        return b() != null ? g.c.f5038e : g.c.f;
    }

    public final String d() {
        return this.o;
    }

    public final int e() {
        return this.T;
    }

    public final String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String optString = this.f5209u.optString(str);
        return TextUtils.isEmpty(optString) ? u(str) : optString;
    }

    public final void i(String str) {
        this.f5212x = str;
        com.anythink.core.common.k.p.a(this.f5200k, g.f5015w, g.o.f5144l, str);
    }

    public final void j(String str) {
        this.y = str;
        com.anythink.core.common.k.p.a(this.f5200k, g.f5015w, g.o.f5145m, str);
    }

    public final void k(String str) {
        com.anythink.core.common.k.p.a(this.f5200k, g.o, g.o.f5141i, str);
        this.f5211w = str;
    }

    public final List<String> l(String str) {
        return this.P.get(str);
    }

    public final List<String> m(String str) {
        return this.P.get(str + "_network_firm");
    }

    public static void n(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("anythink", "AdSourceId is empty");
            return;
        }
        try {
            if (Long.parseLong(str) == 0) {
                Log.e("anythink", "AdSourceId can't set 0");
            }
        } catch (Exception unused) {
            Log.e("anythink", "AdSourceId '" + str + "' is not compliant");
        }
    }

    public final synchronized boolean c(String str) {
        Map<String, Boolean> map = this.f5207s;
        if (map == null) {
            return false;
        }
        return map.containsKey(str);
    }

    public final Map<String, Object> d(String str) {
        HashMap hashMap = new HashMap();
        Map<String, Object> map = this.f5205q.get(str);
        ConcurrentHashMap<String, Object> concurrentHashMap = this.f5204p;
        if (concurrentHashMap != null) {
            hashMap.putAll(concurrentHashMap);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.remove("channel");
        hashMap.remove("sub_channel");
        Object obj = this.f5204p.get("channel");
        Object obj2 = this.f5204p.get("sub_channel");
        if (obj != null) {
            hashMap.put("channel", obj);
        }
        if (obj2 != null) {
            hashMap.put("sub_channel", obj2);
        }
        return hashMap;
    }

    public final void e(String str) {
        this.F = str;
        this.f5204p.put("channel", str);
    }

    public final IATAdFilter o(String str) {
        ConcurrentHashMap<String, IATAdFilter> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.W) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    public final String q() {
        if (TextUtils.isEmpty(this.f5202m)) {
            this.f5202m = com.anythink.core.common.k.p.b(this.f5200k, g.o, g.f5009q, "");
        }
        return this.f5202m;
    }

    public final String r() {
        try {
            if (TextUtils.isEmpty(this.f5208t)) {
                a(this.f5200k, p(), 0);
            }
        } catch (Exception unused) {
        }
        return this.f5208t;
    }

    public final Location s() {
        return this.L;
    }

    public final void p(String str) {
        this.X = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(android.content.Context r23) {
        /*
            r22 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "playRecord"
            java.lang.String r2 = "anythink_sdk"
            r3 = r22
            long r4 = r3.f5195d
            r6 = 0
            com.anythink.core.common.b.n r8 = a()     // Catch: java.lang.Exception -> L92
            android.content.Context r8 = r8.f5200k     // Catch: java.lang.Exception -> L92
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L92
            r9.<init>()     // Catch: java.lang.Exception -> L92
            com.anythink.core.common.b.n r10 = a()     // Catch: java.lang.Exception -> L92
            java.lang.String r10 = r10.p()     // Catch: java.lang.Exception -> L92
            r9.append(r10)     // Catch: java.lang.Exception -> L92
            r9.append(r1)     // Catch: java.lang.Exception -> L92
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L92
            java.lang.String r8 = com.anythink.core.common.k.p.b(r8, r2, r9, r0)     // Catch: java.lang.Exception -> L92
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L92
            if (r9 != 0) goto Lb2
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L92
            r9.<init>(r8)     // Catch: java.lang.Exception -> L92
            java.lang.String r8 = "start_time"
            long r16 = r9.optLong(r8)     // Catch: java.lang.Exception -> L92
            java.lang.String r8 = "end_time"
            long r18 = r9.optLong(r8)     // Catch: java.lang.Exception -> L92
            java.lang.String r8 = "psid"
            java.lang.String r15 = r9.optString(r8)     // Catch: java.lang.Exception -> L92
            java.lang.String r8 = "launch_mode"
            int r8 = r9.optInt(r8)     // Catch: java.lang.Exception -> L92
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r20 = 1000(0x3e8, double:4.94E-321)
            if (r9 == 0) goto L69
            r9 = 1
            if (r8 != r9) goto L5b
            r8 = 4
            goto L5c
        L5b:
            r8 = 2
        L5c:
            r10 = r8
            r11 = r16
            r13 = r18
            com.anythink.core.common.j.c.a(r10, r11, r13, r15)     // Catch: java.lang.Exception -> L92
            long r18 = r18 - r16
            long r18 = r18 / r20
            goto L6f
        L69:
            long r18 = r18 - r16
            long r18 = r18 / r20
            r4 = r16
        L6f:
            com.anythink.core.common.b.n r8 = a()     // Catch: java.lang.Exception -> L92
            android.content.Context r8 = r8.f5200k     // Catch: java.lang.Exception -> L92
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L92
            r9.<init>()     // Catch: java.lang.Exception -> L92
            com.anythink.core.common.b.n r10 = a()     // Catch: java.lang.Exception -> L92
            java.lang.String r10 = r10.p()     // Catch: java.lang.Exception -> L92
            r9.append(r10)     // Catch: java.lang.Exception -> L92
            r9.append(r1)     // Catch: java.lang.Exception -> L92
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L92
            com.anythink.core.common.k.p.a(r8, r2, r9, r0)     // Catch: java.lang.Exception -> L92
            goto Lb2
        L90:
            r4 = r16
        L92:
            com.anythink.core.common.b.n r8 = a()
            android.content.Context r8 = r8.f5200k
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            com.anythink.core.common.b.n r10 = a()
            java.lang.String r10 = r10.p()
            r9.append(r10)
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            com.anythink.core.common.k.p.a(r8, r2, r1, r0)
        Lb2:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto Lc7
            java.lang.String r0 = "SPU_INIT_TIME_KEY"
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r8 = r23
            java.lang.Long r0 = com.anythink.core.common.k.p.a(r8, r2, r0, r1)
            long r4 = r0.longValue()
            goto Lc9
        Lc7:
            r8 = r23
        Lc9:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto Ld1
            long r4 = java.lang.System.currentTimeMillis()
        Ld1:
            android.content.Context r0 = r23.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            com.anythink.core.common.b.e r1 = new com.anythink.core.common.b.e
            r1.<init>(r4)
            r0.registerActivityLifecycleCallbacks(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.b.n.e(android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r2.importance != 100) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(android.content.Context r5) {
        /*
            r0 = 0
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r5.getSystemService(r1)     // Catch: java.lang.Throwable -> L32
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> L32
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L32
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L32
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r2.processName     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r5.getPackageName()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L11
            int r5 = r2.importance     // Catch: java.lang.Throwable -> L32
            r1 = 100
            if (r5 != r1) goto L31
            r5 = 1
            return r5
        L31:
            return r0
        L32:
            r5 = move-exception
            r5.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.b.n.c(android.content.Context):boolean");
    }

    public final void a(String str) {
        this.o = str;
    }

    public final void f(String str) {
        this.G = str;
        this.f5204p.put("sub_channel", str);
    }

    public final synchronized void a(String str, ATCustomAdapterConfig aTCustomAdapterConfig) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f5206r == null) {
            this.f5206r = new ConcurrentHashMap<>();
        }
        if (aTCustomAdapterConfig == null) {
            this.f5206r.remove(str);
        } else {
            this.f5206r.put(str, aTCustomAdapterConfig);
        }
    }

    public final ATCustomAdapterConfig b(String str) {
        if (this.f5206r == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f5206r.get(str);
    }

    public static boolean c(Context context, List<String> list) {
        PackageInfo packageInfo;
        boolean z10;
        boolean z11;
        if (list == null) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 8);
            z10 = true;
        } catch (Throwable th) {
            sb2.append(", error: ");
            sb2.append(th.getMessage());
            packageInfo = null;
            z10 = false;
        }
        if (packageInfo == null) {
            return false;
        }
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        for (String str : list) {
            int length = providerInfoArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z11 = false;
                    break;
                }
                if (TextUtils.equals(providerInfoArr[i10].name, str)) {
                    z11 = true;
                    break;
                }
                i10++;
            }
            if (!z11) {
                sb2.append(", ");
                sb2.append(str);
                z10 = false;
            }
        }
        if (sb2.length() > 2) {
            sb2.delete(0, 2);
        }
        if (z10) {
            Log.i("anythink", "Providers : VERIFIED");
        } else {
            Log.e("anythink", "Providers : Missing " + sb2.toString() + " declare in AndroidManifest");
        }
        return z10;
    }

    public final void b(int i10) {
        this.f = i10;
    }

    private void b(Context context, String str, String str2) {
        a(context.getApplicationContext(), str, str2);
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass11(context, str));
    }

    private boolean d(Context context) {
        String d10 = com.anythink.core.common.k.d.d(context);
        if (!TextUtils.isEmpty(d10) && d10.equals(this.Q)) {
            return true;
        }
        String f = com.anythink.core.common.k.d.f();
        if (!TextUtils.isEmpty(f) && f.equals(this.Q)) {
            return true;
        }
        IExHandler b10 = a().b();
        return b10 != null && b10.checkDebuggerDevice(context, this.Q);
    }

    public final void b(final Context context) {
        if (A()) {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.n.12
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ArrayList arrayList = new ArrayList();
                        Enumeration<String> entries = new DexFile(context.getPackageCodePath()).entries();
                        while (entries.hasMoreElements()) {
                            String nextElement = entries.nextElement();
                            if (nextElement.contains("com.anythink.network") && nextElement.contains("InitManager") && !nextElement.contains("$")) {
                                arrayList.add(nextElement);
                            }
                        }
                        Log.i("anythink", "********************************** Network Integration Status *************************************");
                        if (arrayList.size() != 0) {
                            Log.i("anythink", "----------------------------------------");
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                Class<?> cls = Class.forName((String) it.next());
                                boolean z10 = false;
                                Object obj = null;
                                try {
                                    obj = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                                } catch (Throwable unused) {
                                    Log.e("anythink", "Cannot instantiate " + cls.getName() + ", please check if a third-party SDK is imported");
                                    Log.i("anythink", "----------------------------------------");
                                }
                                if (obj != null && (obj instanceof ATInitMediation)) {
                                    ATInitMediation aTInitMediation = (ATInitMediation) obj;
                                    String networkName = aTInitMediation.getNetworkName();
                                    if (!TextUtils.isEmpty(networkName)) {
                                        String networkVersion = aTInitMediation.getNetworkVersion();
                                        if (!TextUtils.isEmpty(networkVersion)) {
                                            Log.i("anythink", "NetworkName: " + networkName + "  (v" + networkVersion + ")");
                                        } else {
                                            Log.i("anythink", "NetworkName: ".concat(String.valueOf(networkName)));
                                        }
                                        boolean h10 = n.h(aTInitMediation.getNetworkSDKClass());
                                        boolean b10 = n.b(aTInitMediation.getPluginClassStatus());
                                        boolean a10 = n.a(context, (List<String>) aTInitMediation.getActivityStatus());
                                        boolean b11 = n.b(context, (List<String>) aTInitMediation.getServiceStatus());
                                        boolean c10 = n.c(context, aTInitMediation.getProviderStatus());
                                        boolean d10 = n.d(context, aTInitMediation.getMetaValutStatus());
                                        boolean e10 = n.e(context, aTInitMediation.getPermissionStatus());
                                        aTInitMediation.getResourceStatus();
                                        if (h10 && b10 && a10 && b11 && c10 && d10 && e10) {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            Log.i("anythink", "Status: Success");
                                        } else {
                                            Log.e("anythink", "Status: Fail");
                                        }
                                        Log.i("anythink", "----------------------------------------");
                                    }
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                        Log.i("anythink", "********************************** Network Integration Status *************************************");
                    } catch (Exception unused3) {
                    }
                }
            });
        }
    }

    public static boolean b(Map<String, Boolean> map) {
        boolean z10 = true;
        if (map == null) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : map.keySet()) {
            if (!map.get(str).booleanValue()) {
                sb2.append(", ");
                sb2.append(str);
                z10 = false;
            }
        }
        if (sb2.length() > 2) {
            sb2.delete(0, 2);
        }
        if (z10) {
            Log.i("anythink", "Dependence Plugin: VERIFIED");
        } else {
            Log.e("anythink", "Dependence Plugin: Missing ".concat(String.valueOf(sb2)));
        }
        return z10;
    }

    public final void a(int i10) {
        if (i10 == 2) {
            this.T = 2;
        } else {
            this.T = 1;
        }
    }

    public final synchronized void a(String... strArr) {
        if (strArr != null) {
            this.f5207s = new HashMap();
            for (String str : strArr) {
                this.f5207s.put(str, Boolean.TRUE);
            }
            return;
        }
        this.f5207s = null;
    }

    public static boolean d(Context context, List<String> list) {
        boolean z10 = true;
        if (list == null || list.size() == 0) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = list.get(i10);
                if (TextUtils.isEmpty(applicationInfo.metaData.getString(str))) {
                    sb2.append(", \"");
                    sb2.append(str);
                    sb2.append("\"");
                    z10 = false;
                }
            }
            if (sb2.length() > 2) {
                sb2.delete(0, 2);
            }
            z11 = z10;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z11) {
            Log.i("anythink", "meta-data: VERIFIED");
        } else {
            Log.e("anythink", "meta-data: Missing " + sb2.toString() + " declare in AndroidManifest");
        }
        return z11;
    }

    public static boolean b(Context context, List<String> list) {
        boolean z10 = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        PackageManager packageManager = context.getPackageManager();
        for (String str : list) {
            try {
            } catch (Throwable th) {
                sb2.append(", error: ");
                sb2.append(th.getMessage());
            }
            if (packageManager.queryIntentServices(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                sb2.append(", ");
                sb2.append(str);
                z10 = false;
            }
        }
        if (sb2.length() > 2) {
            sb2.delete(0, 2);
        }
        if (z10) {
            Log.i("anythink", "Services : VERIFIED");
        } else {
            Log.e("anythink", "Services : Missing " + sb2.toString() + " declare in AndroidManifest");
        }
        return z10;
    }

    public final void a(Context context) {
        if (context == null) {
            Log.w("SDK.init", "ATSDK.setContext() is null!");
        } else {
            this.f5200k = context;
        }
    }

    public final void c(Runnable runnable) {
        this.f5203n.removeCallbacks(runnable);
    }

    public final void c(boolean z10) {
        this.H = z10;
    }

    public final void a(Map<String, Object> map) {
        if (map != null && map.containsKey("channel")) {
            Object obj = map.get("channel");
            String obj2 = obj != null ? obj.toString() : "";
            this.F = obj2;
            if (!com.anythink.core.common.k.g.a(obj2)) {
                this.F = null;
                map.remove("channel");
            }
        }
        if (map != null && map.containsKey("sub_channel")) {
            Object obj3 = map.get("sub_channel");
            String obj4 = obj3 != null ? obj3.toString() : "";
            this.G = obj4;
            if (!com.anythink.core.common.k.g.b(obj4)) {
                this.G = null;
                map.remove("sub_channel");
            }
        }
        this.f5204p.clear();
        if (map != null) {
            this.f5204p.putAll(map);
        }
        if (!TextUtils.isEmpty(this.F)) {
            this.f5204p.put("channel", this.F);
        }
        if (TextUtils.isEmpty(this.G)) {
            return;
        }
        this.f5204p.put("sub_channel", this.G);
    }

    public final void c(int i10) {
        this.Z = i10;
    }

    public static boolean e(Context context, List<String> list) {
        int size;
        boolean z10;
        if (list == null || (size = list.size()) == 0) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                boolean z12 = true;
                for (int i10 = 0; i10 < size; i10++) {
                    String str = list.get(i10);
                    int length = strArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            z10 = false;
                            break;
                        }
                        if (TextUtils.equals(str, strArr[i11])) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                    if (!z10) {
                        if (sb2.length() == 0) {
                            sb2.append(str);
                        } else {
                            sb2.append(", ");
                            sb2.append(str);
                        }
                        z12 = false;
                    }
                }
                z11 = z12;
            } else {
                for (int i12 = 0; i12 < size; i12++) {
                    String str2 = list.get(i12);
                    if (i12 == 0) {
                        sb2.append(str2);
                    } else {
                        sb2.append(", ");
                        sb2.append(str2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z11) {
            Log.i("anythink", "Permission: VERIFIED");
        } else {
            Log.e("anythink", "Permission: Missing " + sb2.toString() + " declare in AndroidManifest");
        }
        return z11;
    }

    public static void b(Runnable runnable) {
        com.anythink.core.common.k.b.a.a().a(runnable);
    }

    public final void b(boolean z10) {
        this.C = z10;
    }

    public final void b(String str, List<String> list) {
        this.P.put(str + "_network_firm", list);
    }

    public static /* synthetic */ void b(n nVar) {
        Throwable th;
        boolean z10;
        boolean z11 = false;
        if (nVar.f5200k != null) {
            try {
                z10 = new File(nVar.f5200k.getExternalFilesDir(null), nVar.A).exists();
                if (!z10) {
                    try {
                        z10 = new File(nVar.f5200k.getFilesDir(), nVar.A).exists();
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                        z11 = z10;
                        nVar.B = z11;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
            z11 = z10;
        }
        nVar.B = z11;
    }

    public static void d(Runnable runnable) {
        com.anythink.core.common.k.b.a.a().a(runnable, 1000L);
    }

    public final void d(boolean z10) {
        this.V = z10;
    }

    public final long d(int i10) {
        if (i10 != 1 && i10 != 4) {
            return 26214400L;
        }
        com.anythink.core.c.b.a(this.f5200k);
        return com.anythink.core.c.b.a() * 1024;
    }

    private void e(boolean z10) {
        this.U = z10;
    }

    public final void a(String str, Map<String, Object> map) {
        if (map != null) {
            this.f5205q.put(str, map);
        }
    }

    public final void a(List<String> list) {
        try {
            this.O = list;
            if (list != null && !list.isEmpty()) {
                this.N = new JSONArray((Collection) list);
            } else {
                this.N = null;
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void a(Location location) {
        this.L = location;
    }

    public final synchronized void a(boolean z10) {
        this.M = z10 ? "1" : "2";
    }

    public final synchronized void a(final Context context, final String str, String str2, final ATNetworkConfig aTNetworkConfig) {
        if (context == null) {
            return;
        }
        this.f5200k = context.getApplicationContext();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (this.I) {
                return;
            }
            this.I = true;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = com.anythink.core.common.k.p.a(context, g.o, g.o.f5143k, (Long) 0L).longValue();
                this.D = longValue;
                if (longValue == 0) {
                    this.D = currentTimeMillis;
                    com.anythink.core.common.k.p.a(context, g.o, g.o.f5143k, currentTimeMillis);
                }
                this.E = ((a(currentTimeMillis) - a(this.D)) / 86400000) + 1;
                this.f5195d = 0L;
                com.anythink.core.a.a.a(context.getApplicationContext()).a();
                this.Z = com.anythink.core.common.k.p.b(context, g.o, "r", 1);
                final Context applicationContext = context.getApplicationContext();
                a(applicationContext);
                this.f5201l = str;
                com.anythink.core.common.k.p.a(this.f5200k, g.o, g.f5008p, str);
                this.f5202m = str2;
                com.anythink.core.common.k.p.a(this.f5200k, g.o, g.f5009q, str2);
                this.U = com.anythink.core.common.k.h.a();
                try {
                    BroadcastReceiver broadcastReceiver = this.f5210v;
                    if (broadcastReceiver != null) {
                        this.f5200k.unregisterReceiver(broadcastReceiver);
                        k.a(this.f5200k).a(this.f5210v);
                    }
                    this.f5210v = null;
                } catch (Throwable unused) {
                }
                try {
                    this.f5210v = new AnonymousClass10();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addAction(g.C);
                    this.f5200k.registerReceiver(this.f5210v, intentFilter);
                    k.a(this.f5200k).a(this.f5210v, intentFilter);
                } catch (Throwable unused2) {
                }
                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.n.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.anythink.core.common.j.b.a().a(applicationContext);
                            n.this.a(applicationContext, str, 0);
                            n.a(n.this, context);
                            h.a(applicationContext).a();
                            n.b(n.this);
                            n.N();
                            com.anythink.core.common.a.j.a().b();
                            com.anythink.core.common.res.d.a(n.this.g()).b();
                        } catch (Exception unused3) {
                        }
                    }
                });
                ((Application) this.f5200k).registerActivityLifecycleCallbacks(new f(c(this.f5200k)));
                a(new Runnable() { // from class: com.anythink.core.common.b.n.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.anythink.core.common.k.d.p(applicationContext);
                    }
                }, com.anythink.expressad.exoplayer.f.f7962a);
                com.anythink.core.common.k.b.a.a().a(new AnonymousClass1());
                com.anythink.core.common.p.a().a(this.f5200k);
                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.n.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.this.b();
                        if (n.this.f5213z != null) {
                            n.this.f5213z.initDeviceInfo(context);
                        }
                        com.anythink.core.c.e.a(applicationContext).a();
                        com.anythink.core.common.k.d.r(n.this.f5200k);
                        x.a(context);
                    }
                });
                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.n.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        n nVar = n.this;
                        n.a(nVar, nVar.f5200k, aTNetworkConfig);
                    }
                });
                a(context.getApplicationContext(), str, str2);
                com.anythink.core.common.k.b.a.a().a(new AnonymousClass11(context, str));
            } catch (Exception unused3) {
            }
        }
    }

    public final void a(Context context, String str, ATDebuggerConfig aTDebuggerConfig) {
        IExHandler b10;
        if (context == null) {
            if (A()) {
                Log.e("SDK.init", "setDebuggerConfig fail, because context is null.");
                return;
            }
            return;
        }
        if (a().f5200k == null) {
            a().a(context.getApplicationContext());
        }
        this.Q = str;
        this.R = aTDebuggerConfig;
        String d10 = com.anythink.core.common.k.d.d(context);
        boolean z10 = true;
        if (TextUtils.isEmpty(d10) || !d10.equals(this.Q)) {
            String f = com.anythink.core.common.k.d.f();
            if ((TextUtils.isEmpty(f) || !f.equals(this.Q)) && ((b10 = a().b()) == null || !b10.checkDebuggerDevice(context, this.Q))) {
                z10 = false;
            }
        }
        this.S = z10;
        if (TextUtils.isEmpty(this.Q)) {
            if (A()) {
                Log.e("SDK.init", "Setting Debugger's device fail, because deviceId is empty.");
            }
            this.S = false;
        } else {
            if (this.S) {
                if (A()) {
                    Log.i("SDK.init", "Setting Debugger's device success.");
                }
                if (this.R == null || !A()) {
                    return;
                }
                Log.i("SDK.init", "Debugger config is in effect now.");
                return;
            }
            if (A()) {
                Log.e("SDK.init", "The incoming device id does not match the current device id, and the debugger mode cannot take effect.");
            }
        }
    }

    public final synchronized long a(Context context, String str, int i10) {
        com.anythink.core.c.a b10 = com.anythink.core.c.b.a(context).b(str);
        String b11 = com.anythink.core.common.k.p.b(context, g.o, g.o.f, "");
        String b12 = com.anythink.core.common.k.p.b(context, g.o, g.o.f5139g, "");
        long longValue = com.anythink.core.common.k.p.a(context, g.o, g.o.f5140h, (Long) 0L).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longValue < 0) {
            longValue = 0;
        }
        if (currentTimeMillis - longValue <= (i10 == 0 ? b10.N() : b10.B())) {
            b10.N();
            this.f5208t = b11;
            if (!TextUtils.isEmpty(b12)) {
                this.f5209u = new JSONObject(b12);
            }
            return 0L;
        }
        b10.N();
        String x10 = x();
        String str2 = "";
        if (TextUtils.isEmpty(x10)) {
            x10 = com.anythink.core.common.k.d.d(context) + com.anythink.core.common.k.d.f();
            str2 = String.valueOf(new Random().nextInt(ExceptionCode.CRASH_EXCEPTION));
        }
        this.f5208t = com.anythink.core.common.k.f.a(x10 + str + str2 + currentTimeMillis);
        this.f5209u = new JSONObject();
        com.anythink.core.common.k.p.a(context, g.o, g.o.f, this.f5208t);
        com.anythink.core.common.k.p.a(context, g.o, g.o.f5139g, "");
        com.anythink.core.common.k.p.a(context, g.o, g.o.f5140h, currentTimeMillis);
        com.anythink.core.common.j.c.a((String) null, "1", str2, String.valueOf(currentTimeMillis));
        if (i10 == 0) {
            this.f5195d = currentTimeMillis;
        }
        return currentTimeMillis;
    }

    public final void a(Context context, final String str, Map<String, Object> map) {
        if (A()) {
            Log.i("anythink", "Requesting placement(" + str + ") setting Info，please wait a moment.");
            new com.anythink.core.common.g.j(context, a().p(), a().q(), str, "", map, new HashMap(1)).a(0, new com.anythink.core.common.g.i() { // from class: com.anythink.core.common.b.n.13
                @Override // com.anythink.core.common.g.i
                public final void onLoadError(int i10, String str2, AdError adError) {
                    Log.i("anythink", "********************************** Get Splash Config Start(" + str + ") *************************************");
                    Log.i("anythink", "This placement(" + str + ") request error:" + adError.printStackTrace());
                    StringBuilder sb2 = new StringBuilder("********************************** Get Splash Config End(");
                    sb2.append(str);
                    sb2.append(") *************************************");
                    Log.i("anythink", sb2.toString());
                }

                @Override // com.anythink.core.common.g.i
                public final void onLoadFinish(int i10, Object obj) {
                    com.anythink.core.c.d b10 = com.anythink.core.c.d.b((String) obj);
                    if (!"4".equals(String.valueOf(b10.X()))) {
                        Log.i("anythink", "********************************** Get Splash Config Start(" + str + ") *************************************");
                        Log.i("anythink", "This placement(" + str + ") does not belong to Splash!");
                        Log.i("anythink", "********************************** Get Splash Config End(" + str + ") *************************************");
                        return;
                    }
                    Log.i("anythink", "********************************** Get Splash Config Start(" + str + ") *************************************");
                    List<ai> F = b10.F();
                    if (F != null && F.size() != 0) {
                        for (ai aiVar : F) {
                            Log.i("anythink", "------------------------------------------------");
                            Log.i("anythink", "Network Firm Id:" + aiVar.c());
                            Log.i("anythink", "AdSource Id:" + aiVar.t());
                            Log.i("anythink", "Network Content:" + aiVar.g());
                            Log.i("anythink", "------------------------------------------------");
                        }
                    } else {
                        Log.i("anythink", ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", "").getDesc());
                    }
                    Log.i("anythink", "********************************** Get Splash Config End(" + str + ") *************************************");
                }

                @Override // com.anythink.core.common.g.i
                public final void onLoadCanceled(int i10) {
                }

                @Override // com.anythink.core.common.g.i
                public final void onLoadStart(int i10) {
                }
            });
            return;
        }
        Log.i("anythink", "********************************** Get Splash Config Start(" + str + ") *************************************");
        Log.i("anythink", "Only use in debug mode!");
        Log.i("anythink", "********************************** Get Splash Config End(" + str + ") *************************************");
    }

    public static boolean a(Context context, List<String> list) {
        boolean z10 = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : list) {
            try {
            } catch (Throwable th) {
                sb2.append(", error: ");
                sb2.append(th.getMessage());
            }
            if (context.getPackageManager().queryIntentActivities(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                sb2.append(", ");
                sb2.append(str);
                z10 = false;
            }
        }
        if (sb2.length() > 2) {
            sb2.delete(0, 2);
        }
        if (z10) {
            Log.i("anythink", "Activities : VERIFIED");
        } else {
            Log.e("anythink", "Activities : Missing " + sb2.toString() + " declare in AndroidManifest");
        }
        return z10;
    }

    public final void a(final Context context, final String str, final String str2) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.n.2
            @Override // java.lang.Runnable
            public final void run() {
                if (com.anythink.core.c.b.a(context).a(str)) {
                    com.anythink.core.c.b.a(context).a(str, str2);
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f5203n.post(runnable);
        }
    }

    public final void a(Runnable runnable, long j10) {
        if (j10 <= 0 && Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f5203n.postDelayed(runnable, j10);
        }
    }

    private static long a(long j10) {
        Date date = new Date(j10);
        return new Date(date.getYear(), date.getMonth(), date.getDate()).getTime();
    }

    public final void a(String str, List<String> list) {
        this.P.put(str, list);
    }

    public final void a(final Context context, final DeviceInfoCallback deviceInfoCallback) {
        if (!this.I) {
            Log.e("anythink", "You should init SDK first.");
            if (deviceInfoCallback != null) {
                deviceInfoCallback.deviceInfo("You should init SDK first.");
                return;
            }
            return;
        }
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.n.3
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                com.anythink.core.c.a h10 = a3.l.h(com.anythink.core.c.b.a(context));
                String str2 = "";
                if (h10 == null) {
                    str = "";
                } else {
                    str = h10.F();
                }
                boolean z10 = true;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (!jSONObject.isNull("a")) {
                            if (jSONObject.optInt("a") != 1) {
                                z10 = false;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    IExHandler b10 = n.a().b();
                    if (b10 != null) {
                        b10.fillTestDeviceData(jSONObject2, h10);
                    }
                    jSONObject2.put(IronSourceConstants.TYPE_GAID, com.anythink.core.common.k.d.r(context));
                    if (z10) {
                        str2 = com.anythink.core.common.k.d.d(context);
                    }
                    jSONObject2.put("AndroidID", str2);
                    jSONObject2.put("How to config TestMode", "Please visit the document center and learn more through： Integration(Basic) -> How To Test");
                    com.anythink.core.common.k.n.a("testModeDeviceInfo", jSONObject2.toString());
                    DeviceInfoCallback deviceInfoCallback2 = deviceInfoCallback;
                    if (deviceInfoCallback2 != null) {
                        deviceInfoCallback2.deviceInfo(jSONObject2.toString());
                    }
                } catch (Throwable unused2) {
                }
            }
        });
    }

    public final void a(final String str, final String str2, final String str3, final Map<String, Object> map) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.n.4
            @Override // java.lang.Runnable
            public final void run() {
                String str4;
                com.anythink.core.common.e.b bVar;
                boolean z10;
                String str5;
                int i10;
                if (!n.this.I) {
                    Log.e("SDK.init", "SDK should be inited first!");
                    return;
                }
                com.anythink.core.common.f b10 = v.a().b(str);
                com.anythink.core.c.d a10 = com.anythink.core.c.e.a(n.this.f5200k).a(str);
                String b11 = w.a().b(str);
                if (TextUtils.isEmpty(str2) || !com.anythink.core.common.k.g.c(str2)) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (b10 != null) {
                    boolean e10 = b10.e();
                    bVar = b10.a(n.this.f5200k, false, false, map);
                    z10 = e10;
                } else {
                    bVar = null;
                    z10 = false;
                }
                if (bVar != null) {
                    com.anythink.core.common.e.e N = bVar.h().N();
                    N.d(1);
                    N.C = str4;
                    com.anythink.core.common.j.a.a(n.this.f5200k).a(16, N);
                    return;
                }
                if (TextUtils.isEmpty(b11)) {
                    str5 = "";
                } else {
                    str5 = b11;
                }
                com.anythink.core.common.e.e a11 = s.a(str5, str, "", a10, "", 0, 0, 0, map);
                if (z10) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
                a11.d(i10);
                if (a10 == null) {
                    a11.z(str3);
                }
                a11.C = str4;
                com.anythink.core.common.j.a.a(n.this.f5200k).a(16, a11);
            }
        });
    }

    public final void a(Activity activity) {
        WeakReference<Activity> weakReference = this.f5196e;
        if (weakReference == null || weakReference.get() == null) {
            this.f5196e = new WeakReference<>(activity);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.content.Context r7, com.anythink.core.api.ATNetworkConfig r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L7
            com.anythink.core.api.ATNetworkConfig r8 = new com.anythink.core.api.ATNetworkConfig
            r8.<init>()
        L7:
            java.util.List r8 = r8.getATInitConfigList()
            if (r8 != 0) goto L13
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 2
            r8.<init>(r0)
        L13:
            boolean r0 = r6.v()
            if (r0 == 0) goto L1c
            r8.clear()
        L1c:
            int r0 = r8.size()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L26
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            r6.J = r0
            r0 = 0
            java.lang.Class<com.anythink.network.facebook.FacebookATInitConfig> r3 = com.anythink.network.facebook.FacebookATInitConfig.class
            java.lang.Class<com.anythink.core.api.ATInitConfig> r4 = com.anythink.core.api.ATInitConfig.class
            java.lang.Class r3 = r3.asSubclass(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L46
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.Throwable -> L46
            com.anythink.core.api.ATInitConfig r3 = (com.anythink.core.api.ATInitConfig) r3     // Catch: java.lang.Throwable -> L46
            r8.add(r2, r3)     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r0 = r3
        L46:
            r3 = r0
        L47:
            java.util.Iterator r8 = r8.iterator()
        L4b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r8.next()
            com.anythink.core.api.ATInitConfig r0 = (com.anythink.core.api.ATInitConfig) r0
            if (r0 == 0) goto L4b
            if (r3 == 0) goto L74
            java.lang.Class r4 = r3.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L74
            if (r2 != 0) goto L4b
            r2 = r1
        L74:
            com.anythink.core.common.k.b.a r4 = com.anythink.core.common.k.b.a.a()
            com.anythink.core.common.b.n$5 r5 = new com.anythink.core.common.b.n$5
            r5.<init>(r0, r7)
            r4.a(r5)
            goto L4b
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.b.n.a(android.content.Context, com.anythink.core.api.ATNetworkConfig):void");
    }

    public final void a(String str, Map<String, Object> map, String... strArr) {
        com.anythink.core.common.e.e eVar;
        if (map == null || map.containsKey(ATInitMediation.KEY_LOCAL)) {
            return;
        }
        try {
            eVar = (com.anythink.core.common.e.e) map.get(g.k.f5116h);
        } catch (Throwable unused) {
            eVar = null;
        }
        map.remove(g.k.f5116h);
        String jSONObject = new JSONObject(map).toString();
        Log.e("anythink", "Mismatched initialization parameters! server params: [" + str + "], " + jSONObject);
        com.anythink.core.common.k.p.a(this.f5200k, g.f5016x, str, jSONObject);
        if (eVar == null || strArr == null) {
            return;
        }
        try {
            com.anythink.core.common.j.c.a(eVar, strArr[0], strArr.length > 1 ? strArr[1] : null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(String[] strArr, IATAdFilter iATAdFilter) {
        ConcurrentHashMap<String, IATAdFilter> concurrentHashMap = this.W;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        if (this.W == null) {
            this.W = new ConcurrentHashMap<>();
        }
        for (String str : strArr) {
            this.W.put(str, iATAdFilter);
        }
    }

    public final void a(ATPrivacyConfig aTPrivacyConfig) {
        this.Y = aTPrivacyConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.anythink.core.common.b.n r21, android.content.Context r22) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "playRecord"
            java.lang.String r2 = "anythink_sdk"
            r3 = r21
            long r3 = r3.f5195d
            r5 = 0
            com.anythink.core.common.b.n r7 = a()     // Catch: java.lang.Exception -> L8f
            android.content.Context r7 = r7.f5200k     // Catch: java.lang.Exception -> L8f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8f
            r8.<init>()     // Catch: java.lang.Exception -> L8f
            com.anythink.core.common.b.n r9 = a()     // Catch: java.lang.Exception -> L8f
            java.lang.String r9 = r9.p()     // Catch: java.lang.Exception -> L8f
            r8.append(r9)     // Catch: java.lang.Exception -> L8f
            r8.append(r1)     // Catch: java.lang.Exception -> L8f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L8f
            java.lang.String r7 = com.anythink.core.common.k.p.b(r7, r2, r8, r0)     // Catch: java.lang.Exception -> L8f
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L8f
            if (r8 != 0) goto Laf
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8f
            r8.<init>(r7)     // Catch: java.lang.Exception -> L8f
            java.lang.String r7 = "start_time"
            long r15 = r8.optLong(r7)     // Catch: java.lang.Exception -> L8f
            java.lang.String r7 = "end_time"
            long r17 = r8.optLong(r7)     // Catch: java.lang.Exception -> L8f
            java.lang.String r7 = "psid"
            java.lang.String r14 = r8.optString(r7)     // Catch: java.lang.Exception -> L8f
            java.lang.String r7 = "launch_mode"
            int r7 = r8.optInt(r7)     // Catch: java.lang.Exception -> L8f
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r19 = 1000(0x3e8, double:4.94E-321)
            if (r8 == 0) goto L68
            r8 = 1
            if (r7 != r8) goto L5b
            r7 = 4
            goto L5c
        L5b:
            r7 = 2
        L5c:
            r9 = r7
            r10 = r15
            r12 = r17
            com.anythink.core.common.j.c.a(r9, r10, r12, r14)     // Catch: java.lang.Exception -> L8f
            long r17 = r17 - r15
            long r17 = r17 / r19
            goto L6d
        L68:
            long r17 = r17 - r15
            long r17 = r17 / r19
            r3 = r15
        L6d:
            com.anythink.core.common.b.n r7 = a()     // Catch: java.lang.Exception -> L8f
            android.content.Context r7 = r7.f5200k     // Catch: java.lang.Exception -> L8f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8f
            r8.<init>()     // Catch: java.lang.Exception -> L8f
            com.anythink.core.common.b.n r9 = a()     // Catch: java.lang.Exception -> L8f
            java.lang.String r9 = r9.p()     // Catch: java.lang.Exception -> L8f
            r8.append(r9)     // Catch: java.lang.Exception -> L8f
            r8.append(r1)     // Catch: java.lang.Exception -> L8f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L8f
            com.anythink.core.common.k.p.a(r7, r2, r8, r0)     // Catch: java.lang.Exception -> L8f
            goto Laf
        L8e:
            r3 = r15
        L8f:
            com.anythink.core.common.b.n r7 = a()
            android.content.Context r7 = r7.f5200k
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            com.anythink.core.common.b.n r9 = a()
            java.lang.String r9 = r9.p()
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            com.anythink.core.common.k.p.a(r7, r2, r1, r0)
        Laf:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto Lc4
            java.lang.String r0 = "SPU_INIT_TIME_KEY"
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r7 = r22
            java.lang.Long r0 = com.anythink.core.common.k.p.a(r7, r2, r0, r1)
            long r3 = r0.longValue()
            goto Lc6
        Lc4:
            r7 = r22
        Lc6:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto Lce
            long r3 = java.lang.System.currentTimeMillis()
        Lce:
            android.content.Context r0 = r22.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            com.anythink.core.common.b.e r1 = new com.anythink.core.common.b.e
            r1.<init>(r3)
            r0.registerActivityLifecycleCallbacks(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.b.n.a(com.anythink.core.common.b.n, android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.anythink.core.common.b.n r6, android.content.Context r7, com.anythink.core.api.ATNetworkConfig r8) {
        /*
            if (r8 != 0) goto L7
            com.anythink.core.api.ATNetworkConfig r8 = new com.anythink.core.api.ATNetworkConfig
            r8.<init>()
        L7:
            java.util.List r8 = r8.getATInitConfigList()
            if (r8 != 0) goto L13
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 2
            r8.<init>(r0)
        L13:
            boolean r0 = r6.v()
            if (r0 == 0) goto L1c
            r8.clear()
        L1c:
            int r0 = r8.size()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L26
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            r6.J = r0
            r0 = 0
            java.lang.Class<com.anythink.network.facebook.FacebookATInitConfig> r3 = com.anythink.network.facebook.FacebookATInitConfig.class
            java.lang.Class<com.anythink.core.api.ATInitConfig> r4 = com.anythink.core.api.ATInitConfig.class
            java.lang.Class r3 = r3.asSubclass(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L46
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.Throwable -> L46
            com.anythink.core.api.ATInitConfig r3 = (com.anythink.core.api.ATInitConfig) r3     // Catch: java.lang.Throwable -> L46
            r8.add(r2, r3)     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r0 = r3
        L46:
            r3 = r0
        L47:
            java.util.Iterator r8 = r8.iterator()
        L4b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r8.next()
            com.anythink.core.api.ATInitConfig r0 = (com.anythink.core.api.ATInitConfig) r0
            if (r0 == 0) goto L4b
            if (r3 == 0) goto L74
            java.lang.Class r4 = r3.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L74
            if (r2 != 0) goto L4b
            r2 = r1
        L74:
            com.anythink.core.common.k.b.a r4 = com.anythink.core.common.k.b.a.a()
            com.anythink.core.common.b.n$5 r5 = new com.anythink.core.common.b.n$5
            r5.<init>(r0, r7)
            r4.a(r5)
            goto L4b
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.b.n.a(com.anythink.core.common.b.n, android.content.Context, com.anythink.core.api.ATNetworkConfig):void");
    }
}
