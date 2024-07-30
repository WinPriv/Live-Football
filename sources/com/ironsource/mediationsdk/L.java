package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.huawei.hms.ads.ep;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.Q;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class L implements com.ironsource.mediationsdk.utils.i {

    /* renamed from: m0, reason: collision with root package name */
    public static boolean f24837m0 = false;
    public boolean A;
    public IronSourceSegment B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final ConcurrentHashMap<String, ISDemandOnlyBannerLayout> J;
    public Boolean K;
    public IronSourceBannerLayout L;
    public String M;
    public Boolean N;
    public s O;
    public i0 P;
    public T Q;
    public com.ironsource.mediationsdk.adunit.c.g R;
    public com.ironsource.mediationsdk.adunit.c.h S;
    public InitializationListener T;
    public final AtomicBoolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f24838a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f24839a0;

    /* renamed from: b, reason: collision with root package name */
    public AbstractAdapter f24840b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f24841b0;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f24842c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f24843c0;

    /* renamed from: d, reason: collision with root package name */
    public final w f24844d;

    /* renamed from: d0, reason: collision with root package name */
    public int f24845d0;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f24846e;

    /* renamed from: e0, reason: collision with root package name */
    public final CopyOnWriteArraySet<String> f24847e0;
    public C1426p f;

    /* renamed from: f0, reason: collision with root package name */
    public final CopyOnWriteArraySet<String> f24848f0;

    /* renamed from: g, reason: collision with root package name */
    public final IronSourceLoggerManager f24849g;

    /* renamed from: g0, reason: collision with root package name */
    public final CopyOnWriteArraySet<String> f24850g0;

    /* renamed from: h, reason: collision with root package name */
    public final com.ironsource.mediationsdk.sdk.i f24851h;

    /* renamed from: h0, reason: collision with root package name */
    public q0 f24852h0;

    /* renamed from: i, reason: collision with root package name */
    public final com.ironsource.mediationsdk.logger.b f24853i;

    /* renamed from: i0, reason: collision with root package name */
    public r0 f24854i0;

    /* renamed from: j, reason: collision with root package name */
    public String f24855j;

    /* renamed from: j0, reason: collision with root package name */
    public com.ironsource.d.a f24856j0;

    /* renamed from: k, reason: collision with root package name */
    public String f24857k;

    /* renamed from: k0, reason: collision with root package name */
    public final com.ironsource.mediationsdk.impressionData.a f24858k0;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f24859l;

    /* renamed from: l0, reason: collision with root package name */
    public final com.ironsource.sdk.controller.u f24860l0;

    /* renamed from: m, reason: collision with root package name */
    public String f24861m;

    /* renamed from: n, reason: collision with root package name */
    public Map<String, String> f24862n;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public String f24863p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f24864q;

    /* renamed from: r, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.l f24865r;

    /* renamed from: s, reason: collision with root package name */
    public String f24866s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f24867t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24868u;

    /* renamed from: v, reason: collision with root package name */
    public List<IronSource.AD_UNIT> f24869v;

    /* renamed from: w, reason: collision with root package name */
    public Context f24870w;

    /* renamed from: x, reason: collision with root package name */
    public Boolean f24871x;
    public final HashSet y;

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f24872z;

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24873a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f24874b;

        static {
            int[] iArr = new int[k.a.a().length];
            f24874b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24874b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24874b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24874b[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.AD_UNIT.values().length];
            f24873a = iArr2;
            try {
                iArr2[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24873a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24873a[IronSource.AD_UNIT.OFFERWALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24873a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static volatile L f24875a = new L(0);
    }

    private L() {
        this.f24838a = L.class.getName();
        this.f24864q = new Object();
        this.f24865r = null;
        this.f24855j = null;
        this.f24857k = null;
        this.f24866s = null;
        this.f24861m = null;
        this.f24862n = null;
        this.o = null;
        this.f24868u = false;
        this.f24863p = null;
        this.f24871x = null;
        this.A = true;
        this.N = null;
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger(0);
        this.f24849g = logger;
        com.ironsource.mediationsdk.logger.b bVar = new com.ironsource.mediationsdk.logger.b(null, 1);
        this.f24853i = bVar;
        logger.addLogger(bVar);
        com.ironsource.mediationsdk.sdk.i iVar = new com.ironsource.mediationsdk.sdk.i();
        this.f24851h = iVar;
        l0 l0Var = new l0();
        this.f24842c = l0Var;
        l0Var.f25566n = iVar;
        w wVar = new w();
        this.f24844d = wVar;
        wVar.f25966n = iVar;
        f0 f0Var = new f0();
        this.f24846e = f0Var;
        f0Var.f25438c = iVar;
        this.f24859l = new AtomicBoolean();
        this.y = new HashSet();
        this.f24872z = new HashSet();
        this.E = false;
        this.D = false;
        this.F = false;
        this.f24867t = new AtomicBoolean(true);
        this.U = new AtomicBoolean(false);
        this.C = 0;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f24863p = UUID.randomUUID().toString();
        this.K = Boolean.FALSE;
        this.f24841b0 = false;
        this.M = null;
        this.O = null;
        this.P = null;
        this.T = null;
        this.Q = null;
        this.V = false;
        this.W = false;
        this.Z = false;
        this.f24843c0 = false;
        this.f24847e0 = new CopyOnWriteArraySet<>();
        this.f24848f0 = new CopyOnWriteArraySet<>();
        this.f24850g0 = new CopyOnWriteArraySet<>();
        this.J = new ConcurrentHashMap<>();
        this.f24852h0 = null;
        this.f24854i0 = null;
        this.f24856j0 = null;
        this.f = null;
        this.f24845d0 = 1;
        this.f24858k0 = new com.ironsource.mediationsdk.impressionData.a();
        this.f24860l0 = new com.ironsource.sdk.controller.u();
        new am();
    }

    public static L a() {
        return c.f24875a;
    }

    public static com.ironsource.mediationsdk.utils.l f(Context context, String str) {
        if (IronSourceUtils.isInitResponseCached(context)) {
            String cachedValueByKeyOfCachedInitResponse = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "appKey");
            String cachedValueByKeyOfCachedInitResponse2 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "userId");
            String cachedValueByKeyOfCachedInitResponse3 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "response");
            if (cachedValueByKeyOfCachedInitResponse.equals(str)) {
                com.ironsource.mediationsdk.utils.l lVar = new com.ironsource.mediationsdk.utils.l(context, cachedValueByKeyOfCachedInitResponse, cachedValueByKeyOfCachedInitResponse2, cachedValueByKeyOfCachedInitResponse3);
                lVar.f25938e = l.a.f25942b;
                return lVar;
            }
        }
        return null;
    }

    public static String h(String str, int i10) {
        if (i10 == 0) {
            return null;
        }
        int i11 = b.f24874b[i10 - 1];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return a3.k.l("placement ", str, " is capped");
        }
        return null;
    }

    public static void i(int i10, JSONObject jSONObject) {
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, jSONObject));
    }

    public static void n(JSONObject jSONObject, Object[][] objArr) {
        for (int i10 = 0; i10 <= 0; i10++) {
            try {
                Object[] objArr2 = objArr[0];
                jSONObject.put(objArr2[0].toString(), objArr2[1]);
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e10), 3);
                return;
            }
        }
    }

    public static void o(boolean z10, int i10, JSONObject jSONObject) {
        String str;
        boolean z11;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (a.AnonymousClass1.d()) {
                sb2.append("appLanguage=Kotlin");
                str = a.AnonymousClass1.c();
            } else {
                str = "appLanguage=Java";
            }
            sb2.append(str);
            sb2.append(String.format(",androidx=%s", Boolean.valueOf(IronSourceUtils.isAndroidXAvailable())));
            if (z10) {
                Object[] objArr = new Object[1];
                if (ContextProvider.getInstance().getCurrentActiveActivity() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objArr[0] = Boolean.valueOf(z11);
                sb2.append(String.format(",Activity=%s", objArr));
            }
            sb2.append(String.format(",cachedUserAgent=%s", Boolean.valueOf(com.ironsource.environment.h.f24687a)));
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb2.toString());
            jSONObject.put(IronSourceConstants.KEY_SESSION_DEPTH, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(14, jSONObject));
    }

    public static boolean q(int i10, int i11, String str) {
        if (str != null && str.length() >= i10 && str.length() <= i11) {
            return true;
        }
        return false;
    }

    public static IronSourceError t(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        String str2;
        if (activity == null && ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            return new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_MISSING_ACTIVITY, "Banner was initialized and loaded without Activity");
        }
        if (iSDemandOnlyBannerLayout != null && !iSDemandOnlyBannerLayout.isDestroyed()) {
            if (TextUtils.isEmpty(str)) {
                return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Missing instance Id");
            }
            return null;
        }
        if (iSDemandOnlyBannerLayout == null) {
            str2 = "Missing banner layout";
        } else {
            str2 = "Banner layout is destroyed";
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str2);
    }

    public static void w(int i10, JSONObject jSONObject) {
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, jSONObject));
    }

    public final boolean A() {
        boolean z10;
        com.ironsource.mediationsdk.model.p pVar;
        ArrayList<String> arrayList;
        if (z()) {
            com.ironsource.mediationsdk.utils.l lVar = this.f24865r;
            if (lVar != null && (pVar = lVar.f25934a) != null && (arrayList = pVar.f25711a) != null && arrayList.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final InterstitialPlacement B() {
        com.ironsource.mediationsdk.model.k kVar = this.f24865r.f25936c.f25675b;
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    public final boolean C() {
        com.ironsource.mediationsdk.model.j jVar;
        com.ironsource.mediationsdk.utils.l lVar = this.f24865r;
        if (lVar != null && (jVar = lVar.f25936c) != null && jVar.f25675b != null) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        boolean z10;
        com.ironsource.mediationsdk.model.p pVar;
        ArrayList<String> arrayList;
        if (C()) {
            com.ironsource.mediationsdk.utils.l lVar = this.f24865r;
            if (lVar != null && (pVar = lVar.f25934a) != null && (arrayList = pVar.f25714d) != null && arrayList.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean E() {
        com.ironsource.mediationsdk.model.j jVar;
        com.ironsource.mediationsdk.utils.l lVar = this.f24865r;
        if (lVar != null && (jVar = lVar.f25936c) != null && jVar.f25676c != null) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        if (!this.D && !this.E && !this.F) {
            return false;
        }
        return true;
    }

    public final Placement G(String str) {
        com.ironsource.mediationsdk.model.r rVar = this.f24865r.f25936c.f25674a;
        if (rVar != null) {
            Iterator<Placement> it = rVar.f25719a.iterator();
            while (it.hasNext()) {
                Placement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.ironsource.mediationsdk.D, com.ironsource.mediationsdk.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(java.lang.String r7) {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r6.f24849g
            r1 = 3
            r2 = 0
            com.ironsource.mediationsdk.model.Placement r7 = r6.G(r7)     // Catch: java.lang.Exception -> L29
            if (r7 != 0) goto L11
            com.ironsource.mediationsdk.model.Placement r7 = r6.u()     // Catch: java.lang.Exception -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L2b
        L11:
            if (r7 != 0) goto L32
            java.lang.String r3 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch: java.lang.Exception -> Lf
            r0.log(r4, r3, r1)     // Catch: java.lang.Exception -> Lf
            com.ironsource.mediationsdk.logger.IronSourceError r4 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> Lf
            r5 = 1021(0x3fd, float:1.431E-42)
            r4.<init>(r5, r3)     // Catch: java.lang.Exception -> Lf
            com.ironsource.mediationsdk.ae r3 = com.ironsource.mediationsdk.ae.a()     // Catch: java.lang.Exception -> Lf
            r3.a(r4, r2)     // Catch: java.lang.Exception -> Lf
            return
        L29:
            r3 = move-exception
            r7 = r2
        L2b:
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r5 = "showProgrammaticRewardedVideo()"
            r0.logException(r4, r5, r3)
        L32:
            com.ironsource.mediationsdk.adunit.c.h r3 = r6.S
            if (r3 == 0) goto L42
            boolean r4 = r6.W
            if (r4 != 0) goto L3e
            boolean r4 = r6.Y
            if (r4 == 0) goto L42
        L3e:
            r3.a(r7)
            return
        L42:
            com.ironsource.mediationsdk.s r3 = r6.O
            if (r3 == 0) goto L4a
            r3.a(r7)
            return
        L4a:
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"
            r0.log(r7, r3, r1)
            com.ironsource.mediationsdk.logger.IronSourceError r7 = new com.ironsource.mediationsdk.logger.IronSourceError
            r0 = 1023(0x3ff, float:1.434E-42)
            r7.<init>(r0, r3)
            com.ironsource.mediationsdk.ae r0 = com.ironsource.mediationsdk.ae.a()
            r0.a(r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.H(java.lang.String):void");
    }

    public final Placement I(String str) {
        Placement G = G(str);
        IronSourceLoggerManager ironSourceLoggerManager = this.f24849g;
        if (G == null) {
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            Placement u2 = u();
            if (u2 == null) {
                ironSourceLoggerManager.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
            G = u2;
        }
        String h10 = h(G.getPlacementName(), com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getApplicationContext(), G));
        if (!TextUtils.isEmpty(h10)) {
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.API, h10, 1);
            ae.a().a(ErrorBuilder.buildCappedPerPlacementError(h10), (AdInfo) null);
            return null;
        }
        return G;
    }

    public final InterstitialPlacement J(String str) {
        com.ironsource.mediationsdk.model.k kVar = this.f24865r.f25936c.f25675b;
        if (kVar != null) {
            Iterator<InterstitialPlacement> it = kVar.f25679a.iterator();
            while (it.hasNext()) {
                InterstitialPlacement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final ArrayList K() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f24865r.f25934a.f25711a.size(); i10++) {
            String str = this.f24865r.f25934a.f25711a.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f24865r.f25935b.a(str));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(java.lang.String r7) {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r6.f24849g
            r1 = 0
            com.ironsource.mediationsdk.model.InterstitialPlacement r7 = r6.J(r7)     // Catch: java.lang.Exception -> L29
            if (r7 != 0) goto L10
            com.ironsource.mediationsdk.model.InterstitialPlacement r7 = r6.B()     // Catch: java.lang.Exception -> Le
            goto L10
        Le:
            r1 = move-exception
            goto L2d
        L10:
            if (r7 != 0) goto L34
            java.lang.String r2 = "showProgrammaticInterstitial error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch: java.lang.Exception -> Le
            r4 = 3
            r0.log(r3, r2, r4)     // Catch: java.lang.Exception -> Le
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> Le
            r4 = 1020(0x3fc, float:1.43E-42)
            r3.<init>(r4, r2)     // Catch: java.lang.Exception -> Le
            com.ironsource.mediationsdk.F r2 = com.ironsource.mediationsdk.F.a()     // Catch: java.lang.Exception -> Le
            r2.a(r3, r1)     // Catch: java.lang.Exception -> Le
            return
        L29:
            r7 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
        L2d:
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "showProgrammaticInterstitial()"
            r0.logException(r2, r3, r1)
        L34:
            boolean r0 = r6.f24839a0
            if (r0 == 0) goto L43
            com.ironsource.mediationsdk.adunit.c.g r0 = r6.R
            com.ironsource.mediationsdk.model.Placement r1 = new com.ironsource.mediationsdk.model.Placement
            r1.<init>(r7)
            r0.a(r1)
            return
        L43:
            com.ironsource.mediationsdk.i0 r0 = r6.P
            java.lang.String r7 = r7.getPlacementName()
            r0.a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.L(java.lang.String):void");
    }

    public final InterstitialPlacement M(String str) {
        InterstitialPlacement J = J(str);
        IronSourceLoggerManager ironSourceLoggerManager = this.f24849g;
        if (J == null) {
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            InterstitialPlacement B = B();
            if (B == null) {
                ironSourceLoggerManager.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
            J = B;
        }
        String h10 = h(J.getPlacementName(), O(J.getPlacementName()));
        if (!TextUtils.isEmpty(h10)) {
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.API, h10, 1);
            this.f24851h.f25818e = J;
            F.a().a(ErrorBuilder.buildCappedPerPlacementError(h10), null);
            return null;
        }
        return J;
    }

    public final ArrayList N() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f24865r.f25934a.f25714d.size(); i10++) {
            String str = this.f24865r.f25934a.f25714d.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f24865r.f25935b.a(str));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int O(java.lang.String r5) {
        /*
            r4 = this;
            com.ironsource.mediationsdk.utils.l r0 = r4.f24865r
            if (r0 == 0) goto L3d
            com.ironsource.mediationsdk.model.j r0 = r0.f25936c
            if (r0 == 0) goto L3d
            com.ironsource.mediationsdk.model.k r0 = r0.f25675b
            if (r0 != 0) goto Ld
            goto L3d
        Ld:
            com.ironsource.mediationsdk.model.InterstitialPlacement r5 = r4.J(r5)     // Catch: java.lang.Exception -> L26
            if (r5 != 0) goto L2b
            com.ironsource.mediationsdk.model.InterstitialPlacement r5 = r4.B()     // Catch: java.lang.Exception -> L24
            if (r5 != 0) goto L2b
            java.lang.String r0 = "Default placement was not found"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f24849g     // Catch: java.lang.Exception -> L24
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Exception -> L24
            r3 = 3
            r1.log(r2, r0, r3)     // Catch: java.lang.Exception -> L24
            goto L2b
        L24:
            r0 = move-exception
            goto L28
        L26:
            r0 = move-exception
            r5 = 0
        L28:
            r0.printStackTrace()
        L2b:
            if (r5 != 0) goto L30
            int r5 = com.ironsource.mediationsdk.utils.k.a.f25931d
            return r5
        L30:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            int r5 = com.ironsource.mediationsdk.utils.k.b(r0, r5)
            return r5
        L3d:
            int r5 = com.ironsource.mediationsdk.utils.k.a.f25931d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.O(java.lang.String):int");
    }

    public final com.ironsource.mediationsdk.model.i P(String str) {
        com.ironsource.mediationsdk.model.h hVar = this.f24865r.f25936c.f25677d;
        if (hVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return hVar.a();
        }
        com.ironsource.mediationsdk.model.i a10 = hVar.a(str);
        if (a10 != null) {
            return a10;
        }
        return hVar.a();
    }

    public final boolean b() {
        com.ironsource.mediationsdk.model.p pVar;
        ArrayList<String> arrayList;
        com.ironsource.mediationsdk.model.j jVar;
        com.ironsource.mediationsdk.utils.l lVar = this.f24865r;
        if ((lVar == null || (jVar = lVar.f25936c) == null || jVar.f25677d == null) ? false : true) {
            if ((lVar == null || (pVar = lVar.f25934a) == null || (arrayList = pVar.f25715e) == null || arrayList.size() <= 0) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void c(Activity activity, String str, String str2) {
        if (str2 != null) {
            d(activity, str, str2);
        } else {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            E.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
        }
    }

    public final void d() {
        if (this.T == null || !this.U.compareAndSet(false, true)) {
            return;
        }
        IronLog.CALLBACK.verbose("onInitializationCompleted()");
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
        this.T.onInitializationComplete();
    }

    public final IronSourceError e(Q.f fVar) {
        if (!this.I) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource SDK was not initialized");
        }
        if (!this.F) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (fVar == Q.f.INIT_FAILED) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource initialization failed");
        }
        if (fVar == Q.f.INIT_IN_PROGRESS && Q.a().c()) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource initialization in progress");
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01c9 A[Catch: all -> 0x02d9, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:10:0x000e, B:12:0x0016, B:15:0x006a, B:17:0x0097, B:18:0x00a1, B:20:0x00a7, B:21:0x00b1, B:23:0x00b5, B:25:0x00b9, B:29:0x00c2, B:30:0x00cc, B:32:0x00d2, B:33:0x00dc, B:35:0x00e8, B:36:0x0150, B:37:0x01be, B:39:0x01c9, B:40:0x0231, B:41:0x029f, B:42:0x02a8, B:44:0x02ae, B:45:0x02c9, B:47:0x0236, B:48:0x02a2, B:50:0x0155, B:51:0x01c1, B:57:0x02d7, B:59:0x001c, B:61:0x002f), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ae A[Catch: all -> 0x02d9, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:10:0x000e, B:12:0x0016, B:15:0x006a, B:17:0x0097, B:18:0x00a1, B:20:0x00a7, B:21:0x00b1, B:23:0x00b5, B:25:0x00b9, B:29:0x00c2, B:30:0x00cc, B:32:0x00d2, B:33:0x00dc, B:35:0x00e8, B:36:0x0150, B:37:0x01be, B:39:0x01c9, B:40:0x0231, B:41:0x029f, B:42:0x02a8, B:44:0x02ae, B:45:0x02c9, B:47:0x0236, B:48:0x02a2, B:50:0x0155, B:51:0x01c1, B:57:0x02d7, B:59:0x001c, B:61:0x002f), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.mediationsdk.utils.l g(android.content.Context r11, java.lang.String r12, com.ironsource.mediationsdk.Q.g.a r13) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.g(android.content.Context, java.lang.String, com.ironsource.mediationsdk.Q$g$a):com.ironsource.mediationsdk.utils.l");
    }

    public final void j(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f24849g.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    public final void k(IronSource.AD_UNIT ad_unit, boolean z10) {
        int i10 = b.f24873a[ad_unit.ordinal()];
        if (i10 == 1) {
            if (this.D) {
                Iterator<String> it = this.f24848f0.iterator();
                while (it.hasNext()) {
                    ad.a().a(it.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f24848f0.clear();
                return;
            }
            if (this.W) {
                if (this.X) {
                    this.X = false;
                    C1430u.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                return;
            }
            if (z10 || z() || this.f24872z.contains(ad_unit)) {
                ae.a().a(false, (AdInfo) null);
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (!this.E) {
                if (this.f24841b0) {
                    this.f24841b0 = false;
                    C1430u.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
                return;
            }
            Iterator<String> it2 = this.f24847e0.iterator();
            while (it2.hasNext()) {
                E.a().a(it2.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            this.f24847e0.clear();
            return;
        }
        if (i10 == 3) {
            if (z10 || E() || this.f24872z.contains(ad_unit)) {
                this.f24851h.onOfferwallAvailable(false);
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        if (this.F) {
            Iterator<String> it3 = this.f24850g0.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.J.get(next);
                if (iSDemandOnlyBannerLayout != null) {
                    iSDemandOnlyBannerLayout.mListenerWrapper.a(next, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                }
            }
            this.f24850g0.clear();
            return;
        }
        synchronized (this.K) {
            if (this.K.booleanValue()) {
                this.K = Boolean.FALSE;
                C1425o.a().a(this.L, new IronSourceError(602, "Init had failed"), false);
                this.L = null;
                this.M = null;
            }
        }
    }

    public final void l(String str, boolean z10) {
        IronLog.API.verbose("userId = " + str + ", isFromPublisher = " + z10);
        this.f24857k = str;
        if (z10) {
            com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(52, IronSourceUtils.getJsonForUserId(false)));
        }
    }

    public final void m(ArrayList<NetworkSettings> arrayList) {
        this.f24849g.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
        this.Q = new T(arrayList, new com.ironsource.mediationsdk.utils.k(this.f24855j, IronSourceUtils.getUserIdForNetworks(), this.f24865r.f25936c.f25677d), com.ironsource.d.b.a().b(), this.B);
        if (this.K.booleanValue()) {
            this.K = Boolean.FALSE;
            a(this.L, this.M);
            this.L = null;
            this.M = null;
        }
    }

    public final synchronized void p(boolean z10, IronSource.AD_UNIT... ad_unitArr) {
        int i10 = 0;
        for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
            if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                this.H = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                this.I = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                this.G = true;
            }
        }
        if (Q.a().b() == Q.f.INIT_FAILED) {
            try {
                if (this.f24851h != null) {
                    int length = ad_unitArr.length;
                    while (i10 < length) {
                        IronSource.AD_UNIT ad_unit2 = ad_unitArr[i10];
                        if (!this.y.contains(ad_unit2)) {
                            k(ad_unit2, true);
                        }
                        i10++;
                    }
                }
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        if (!this.f24868u) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z10);
            int length2 = ad_unitArr.length;
            boolean z11 = false;
            while (i10 < length2) {
                IronSource.AD_UNIT ad_unit3 = ad_unitArr[i10];
                if (!this.y.contains(ad_unit3)) {
                    this.y.add(ad_unit3);
                    this.f24872z.add(ad_unit3);
                    try {
                        mediationAdditionalData.put(ad_unit3.toString(), true);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    z11 = true;
                } else {
                    this.f24849g.log(IronSourceLogger.IronSourceTag.API, ad_unit3 + " ad unit has started initializing.", 3);
                }
                i10++;
            }
            if (z11) {
                int i11 = this.C + 1;
                this.C = i11;
                o(z10, i11, mediationAdditionalData);
            }
            return;
        }
        Q.a().b(z10);
        if (this.f24869v == null) {
            return;
        }
        JSONObject mediationAdditionalData2 = IronSourceUtils.getMediationAdditionalData(z10);
        boolean z12 = false;
        for (IronSource.AD_UNIT ad_unit4 : ad_unitArr) {
            if (!this.y.contains(ad_unit4)) {
                this.y.add(ad_unit4);
                this.f24872z.add(ad_unit4);
                try {
                    mediationAdditionalData2.put(ad_unit4.toString(), true);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                List<IronSource.AD_UNIT> list = this.f24869v;
                if (list != null && list.contains(ad_unit4)) {
                    x(ad_unit4);
                } else {
                    k(ad_unit4, false);
                }
                z12 = true;
            } else {
                j(ad_unit4);
            }
        }
        if (z12) {
            int i12 = this.C + 1;
            this.C = i12;
            o(z10, i12, mediationAdditionalData2);
        }
        return;
    }

    public final boolean r(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        synchronized (this.f24850g0) {
            if (this.f24856j0 == null) {
                if (!this.f24850g0.contains(str)) {
                    this.f24850g0.add(str);
                }
                this.J.put(str, iSDemandOnlyBannerLayout);
                return true;
            }
            return false;
        }
    }

    public final synchronized AbstractAdapter s(String str) {
        try {
            AbstractAdapter abstractAdapter = this.f24840b;
            if (abstractAdapter != null && abstractAdapter.getProviderName().equals(str)) {
                return this.f24840b;
            }
        } catch (Exception e10) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.INTERNAL, "getOfferwallAdapter exception: " + e10, 1);
        }
        return null;
    }

    public final Placement u() {
        com.ironsource.mediationsdk.model.r rVar = this.f24865r.f25936c.f25674a;
        if (rVar != null) {
            return rVar.a();
        }
        return null;
    }

    public final com.ironsource.mediationsdk.utils.l v(Context context, String str, Q.g.a aVar) {
        Vector<Pair<String, String>> vector;
        com.ironsource.mediationsdk.utils.l lVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String a10 = a(context);
            if (TextUtils.isEmpty(a10)) {
                a10 = com.ironsource.environment.h.x(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = a10;
            IronSourceSegment ironSourceSegment = this.B;
            if (ironSourceSegment != null) {
                vector = ironSourceSegment.a();
            } else {
                vector = null;
            }
            String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, this.f24855j, str, str2, this.o, this.W, vector, F()), aVar);
            if (stringFromURL == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.getSerr() == 1) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                String optString = new JSONObject(stringFromURL).optString("response", null);
                if (TextUtils.isEmpty(optString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                stringFromURL = IronSourceAES.decode(com.ironsource.mediationsdk.utils.g.a().b(), optString);
                if (TextUtils.isEmpty(stringFromURL)) {
                    ironLog.warning("encoded response invalid - return null");
                    if (!f24837m0) {
                        f24837m0 = true;
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        try {
                            mediationAdditionalData.put("status", ep.V);
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(114, mediationAdditionalData));
                    }
                    return null;
                }
            }
            com.ironsource.mediationsdk.utils.l lVar2 = new com.ironsource.mediationsdk.utils.l(context, this.f24855j, str, stringFromURL);
            try {
                lVar2.f25938e = l.a.f25943c;
                if (!lVar2.b()) {
                    IronLog.INTERNAL.warning("response invalid - return null");
                    return null;
                }
                return lVar2;
            } catch (Exception e11) {
                e = e11;
                lVar = lVar2;
                IronLog.INTERNAL.warning("exception = " + e);
                e.printStackTrace();
                return lVar;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [com.ironsource.mediationsdk.e0] */
    public final void x(IronSource.AD_UNIT ad_unit) {
        boolean z10;
        boolean z11;
        int i10;
        l0 l0Var;
        NetworkSettings a10;
        NetworkSettings a11;
        boolean z12;
        NetworkSettings a12;
        boolean z13;
        j0 j0Var;
        NetworkSettings a13;
        boolean z14;
        NetworkSettings a14;
        int i11 = b.f24873a[ad_unit.ordinal()];
        boolean z15 = true;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        if (this.F) {
                            this.f24849g.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
                            ArrayList arrayList = new ArrayList();
                            for (int i12 = 0; i12 < this.f24865r.f25934a.f25715e.size(); i12++) {
                                String str = this.f24865r.f25934a.f25715e.get(i12);
                                if (!TextUtils.isEmpty(str)) {
                                    arrayList.add(this.f24865r.f25935b.a(str));
                                }
                            }
                            if (arrayList.size() > 0) {
                                synchronized (this.f24850g0) {
                                    this.f24856j0 = new com.ironsource.d.a(arrayList, this.f24865r.f25936c.f25677d, this.f24855j, this.f24857k);
                                }
                                Iterator<String> it = this.f24850g0.iterator();
                                while (it.hasNext()) {
                                    String next = it.next();
                                    this.f24856j0.a(this.J.get(next), next);
                                }
                                this.J.clear();
                                this.f24850g0.clear();
                                return;
                            }
                            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
                            n(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                            w(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
                            k(IronSource.AD_UNIT.BANNER, false);
                            return;
                        }
                        synchronized (this.K) {
                            this.f24843c0 = this.f24865r.f25936c.f25677d.f25670g.f25888a;
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("mIsBnProgrammatic = " + this.f24843c0);
                            ironLog.verbose("mIsBnLoadBeforeInitCompleted = " + this.K);
                            w(IronSourceConstants.TROUBLESHOOTING_BN_FORK, IronSourceUtils.getMediationAdditionalData(false, this.f24843c0, 1));
                            ArrayList<NetworkSettings> arrayList2 = new ArrayList<>();
                            for (int i13 = 0; i13 < this.f24865r.f25934a.f25715e.size(); i13++) {
                                String str2 = this.f24865r.f25934a.f25715e.get(i13);
                                if (!TextUtils.isEmpty(str2) && (a14 = this.f24865r.f25935b.a(str2)) != null) {
                                    arrayList2.add(a14);
                                }
                            }
                            if (arrayList2.size() > 0) {
                                if (this.f24843c0) {
                                    m(arrayList2);
                                } else {
                                    com.ironsource.mediationsdk.model.h hVar = this.f24865r.f25936c.f25677d;
                                    this.f = new C1426p(arrayList2, this.f24855j, IronSourceUtils.getUserIdForNetworks(), hVar.f25666b, hVar.f25669e, hVar.f);
                                    if (this.K.booleanValue()) {
                                        this.K = Boolean.FALSE;
                                        a(this.L, this.M);
                                        this.L = null;
                                        this.M = null;
                                    }
                                }
                            } else {
                                JSONObject mediationAdditionalData2 = IronSourceUtils.getMediationAdditionalData(false, this.f24843c0, 1);
                                n(mediationAdditionalData2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                                w(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData2);
                                k(IronSource.AD_UNIT.BANNER, false);
                            }
                        }
                        return;
                    }
                    return;
                }
                this.f24846e.a(this.f24855j, this.f24857k);
                return;
            }
            if (this.E) {
                this.f24849g.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
                ArrayList arrayList3 = new ArrayList();
                for (int i14 = 0; i14 < this.f24865r.f25934a.f25714d.size(); i14++) {
                    String str3 = this.f24865r.f25934a.f25714d.get(i14);
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList3.add(this.f24865r.f25935b.a(str3));
                    }
                }
                if (arrayList3.size() > 0) {
                    synchronized (this.f24847e0) {
                        this.f24852h0 = new q0(arrayList3, this.f24865r.f25936c.f25675b, this.f24855j, this.f24857k);
                    }
                    Iterator<String> it2 = this.f24847e0.iterator();
                    while (it2.hasNext()) {
                        this.f24852h0.a(it2.next(), (String) null, false);
                    }
                    this.f24847e0.clear();
                    return;
                }
                JSONObject mediationAdditionalData3 = IronSourceUtils.getMediationAdditionalData(false, false, 1);
                n(mediationAdditionalData3, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                w(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData3);
                k(IronSource.AD_UNIT.INTERSTITIAL, false);
                return;
            }
            com.ironsource.mediationsdk.utils.c cVar = this.f24865r.f25936c.f25675b.f25686i;
            boolean z16 = cVar.f25888a;
            this.Z = z16;
            this.f24839a0 = cVar.f25889b;
            w(IronSourceConstants.TROUBLESHOOTING_IS_FORK, IronSourceUtils.getMediationAdditionalData(false, z16, 1));
            if (this.Z) {
                if (this.f24839a0) {
                    IronLog.INTERNAL.verbose();
                    ArrayList N = N();
                    if (N.size() > 0) {
                        com.ironsource.mediationsdk.adunit.c.g gVar = new com.ironsource.mediationsdk.adunit.c.g(N, this.f24865r.f25936c.f25675b, IronSourceUtils.getUserIdForNetworks(), com.ironsource.d.b.a().b(), this.B);
                        this.R = gVar;
                        Boolean bool = this.f24871x;
                        if (bool != null) {
                            gVar.b(bool.booleanValue());
                        }
                        if (this.f24841b0) {
                            this.f24841b0 = false;
                            this.R.d();
                            return;
                        }
                        return;
                    }
                    JSONObject mediationAdditionalData4 = IronSourceUtils.getMediationAdditionalData(false, true, 1);
                    n(mediationAdditionalData4, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                    w(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData4);
                    k(IronSource.AD_UNIT.INTERSTITIAL, false);
                    return;
                }
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                this.f24849g.log(ironSourceTag, "Adunit: Interstitial is now initiated - programmatic mode", 0);
                ArrayList N2 = N();
                if (N2.size() > 0) {
                    i0 i0Var = new i0(N2, this.f24865r.f25936c.f25675b, this.f24855j, IronSourceUtils.getUserIdForNetworks(), this.f24865r.f25936c.f25675b.f, com.ironsource.d.b.a().b(), this.B);
                    this.P = i0Var;
                    Boolean bool2 = this.f24871x;
                    if (bool2 != null) {
                        boolean booleanValue = bool2.booleanValue();
                        IronSourceLoggerManager.getLogger().log(ironSourceTag, "Should Track Network State: " + booleanValue, 0);
                        i0Var.A = booleanValue;
                        if (this.f24871x.booleanValue()) {
                            this.f24844d.f(this.f24870w, false);
                        }
                    }
                    if (this.f24841b0) {
                        this.f24841b0 = false;
                        this.P.e();
                        return;
                    }
                    return;
                }
                JSONObject mediationAdditionalData5 = IronSourceUtils.getMediationAdditionalData(false, true, 1);
                n(mediationAdditionalData5, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                w(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData5);
                k(IronSource.AD_UNIT.INTERSTITIAL, false);
                return;
            }
            com.ironsource.mediationsdk.model.k kVar = this.f24865r.f25936c.f25675b;
            int i15 = kVar.f25683e;
            int i16 = kVar.f;
            w wVar = this.f24844d;
            wVar.f25970s.a(IronSource.AD_UNIT.INTERSTITIAL, i16);
            for (int i17 = 0; i17 < this.f24865r.f25934a.f25714d.size(); i17++) {
                String str4 = this.f24865r.f25934a.f25714d.get(i17);
                if (!TextUtils.isEmpty(str4) && (a13 = this.f24865r.f25935b.a(str4)) != null) {
                    J j10 = new J(a13, i15);
                    if (j10.o > 0 && j10.f25333p > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        j10.f24832u = wVar;
                        j10.f25332n = i17 + 1;
                        wVar.a((AbstractC1414b) j10);
                    }
                }
            }
            if (wVar.f25553c.size() > 0) {
                wVar.f25552b = kVar.f25681c;
                wVar.a(this.f24855j, IronSourceUtils.getUserIdForNetworks());
                if (this.f24841b0) {
                    this.f24841b0 = false;
                    wVar.c();
                    return;
                }
                return;
            }
            JSONObject mediationAdditionalData6 = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            n(mediationAdditionalData6, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            w(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData6);
            k(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        if (this.D) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
            ArrayList arrayList4 = new ArrayList();
            for (int i18 = 0; i18 < this.f24865r.f25934a.f25711a.size(); i18++) {
                String str5 = this.f24865r.f25934a.f25711a.get(i18);
                if (!TextUtils.isEmpty(str5)) {
                    arrayList4.add(this.f24865r.f25935b.a(str5));
                }
            }
            if (arrayList4.size() > 0) {
                synchronized (this.f24848f0) {
                    this.f24854i0 = new r0(arrayList4, this.f24865r.f25936c.f25674a, this.f24855j, this.f24857k);
                }
                if (ContextProvider.getInstance().getCurrentActiveActivity() != null) {
                    Iterator<String> it3 = this.f24848f0.iterator();
                    while (it3.hasNext()) {
                        this.f24854i0.a(it3.next(), (String) null, false);
                    }
                    this.f24848f0.clear();
                    return;
                }
            }
            k(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        com.ironsource.mediationsdk.utils.c cVar2 = this.f24865r.f25936c.f25674a.f25731n;
        if (!cVar2.f25888a && !this.W) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.V = z10;
        boolean z17 = cVar2.f25889b;
        this.Y = z17;
        if (!z17 && !this.W && cVar2.o) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        this.f24845d0 = i10;
        i(IronSourceConstants.TROUBLESHOOTING_RV_FORK, IronSourceUtils.getMediationAdditionalData(false, z10, i10));
        if (!this.W && !this.Y) {
            if (this.V) {
                this.f24849g.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
                ArrayList K = K();
                if (K.size() > 0) {
                    com.ironsource.mediationsdk.model.r rVar = this.f24865r.f25936c.f25674a;
                    if (rVar.f25731n.o) {
                        j0Var = new e0(K, rVar, this.f24855j, IronSourceUtils.getUserIdForNetworks(), com.ironsource.d.b.a().b(), this.B);
                    } else {
                        j0Var = new j0(K, rVar, this.f24855j, IronSourceUtils.getUserIdForNetworks(), com.ironsource.d.b.a().b(), this.B);
                    }
                    this.O = j0Var;
                    Boolean bool3 = this.f24871x;
                    if (bool3 != null) {
                        j0Var.a(this.f24870w, bool3.booleanValue());
                        if (this.f24871x.booleanValue()) {
                            this.f24842c.e(this.f24870w, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                JSONObject mediationAdditionalData7 = IronSourceUtils.getMediationAdditionalData(false, true, this.f24845d0);
                n(mediationAdditionalData7, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                i(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData7);
                k(IronSource.AD_UNIT.REWARDED_VIDEO, false);
                return;
            }
            com.ironsource.mediationsdk.model.r rVar2 = this.f24865r.f25936c.f25674a;
            int i19 = rVar2.f25723e;
            int i20 = 0;
            while (true) {
                int size = this.f24865r.f25934a.f25711a.size();
                l0Var = this.f24842c;
                if (i20 >= size) {
                    break;
                }
                String str6 = this.f24865r.f25934a.f25711a.get(i20);
                if (!TextUtils.isEmpty(str6) && (a12 = this.f24865r.f25935b.a(str6)) != null) {
                    ag agVar = new ag(a12, i19);
                    if (agVar.o > 0 && agVar.f25333p > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        agVar.f25309u = l0Var;
                        agVar.f25332n = i20 + 1;
                        l0Var.a((AbstractC1414b) agVar);
                    }
                }
                i20++;
            }
            if (l0Var.f25553c.size() > 0) {
                l0Var.f25567p = rVar2.f25720b.f25651a;
                l0Var.f25552b = rVar2.f25721c;
                l0Var.f25571t = rVar2.f25725h;
                String c10 = this.f24865r.c();
                if (!TextUtils.isEmpty(c10) && (a11 = this.f24865r.f25935b.a(c10)) != null) {
                    ag agVar2 = new ag(a11, i19);
                    if (agVar2.o > 0 && agVar2.f25333p > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        agVar2.f25309u = l0Var;
                        l0Var.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, a3.l.p(new StringBuilder(), agVar2.f25324e, " is set as backfill"), 0);
                        l0Var.f25554d = agVar2;
                    }
                }
                String d10 = this.f24865r.d();
                if (!TextUtils.isEmpty(d10) && (a10 = this.f24865r.f25935b.a(d10)) != null) {
                    ag agVar3 = new ag(a10, i19);
                    if (agVar3.o <= 0 || agVar3.f25333p <= 0) {
                        z15 = false;
                    }
                    if (z15) {
                        agVar3.f25309u = l0Var;
                        l0Var.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, a3.l.p(new StringBuilder(), agVar3.f25324e, " is set as premium"), 0);
                        l0Var.f25555e = agVar3;
                    }
                }
                l0Var.y = new B(rVar2.f25726i, l0Var);
                l0Var.a(this.f24855j, IronSourceUtils.getUserIdForNetworks());
                return;
            }
            JSONObject mediationAdditionalData8 = IronSourceUtils.getMediationAdditionalData(false, false, this.f24845d0);
            n(mediationAdditionalData8, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            i(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData8);
            k(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        IronLog.INTERNAL.verbose();
        ArrayList K2 = K();
        if (K2.size() > 0) {
            com.ironsource.mediationsdk.adunit.c.h hVar2 = new com.ironsource.mediationsdk.adunit.c.h(K2, this.f24865r.f25936c.f25674a, IronSourceUtils.getUserIdForNetworks(), this.W, com.ironsource.d.b.a().b(), this.B);
            this.S = hVar2;
            Boolean bool4 = this.f24871x;
            if (bool4 != null) {
                hVar2.b(bool4.booleanValue());
            }
            if (this.X && this.W) {
                this.X = false;
                this.S.d();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData9 = IronSourceUtils.getMediationAdditionalData(false, true, this.f24845d0);
        n(mediationAdditionalData9, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        i(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData9);
        k(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    public final boolean y(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        if (Q.a().b() == Q.f.INIT_IN_PROGRESS) {
            synchronized (this.f24850g0) {
                if (!this.f24850g0.contains(str)) {
                    this.f24850g0.add(str);
                }
                this.J.put(str, iSDemandOnlyBannerLayout);
            }
            return true;
        }
        return false;
    }

    public final boolean z() {
        com.ironsource.mediationsdk.model.j jVar;
        com.ironsource.mediationsdk.utils.l lVar = this.f24865r;
        if (lVar != null && (jVar = lVar.f25936c) != null && jVar.f25674a != null) {
            return true;
        }
        return false;
    }

    public /* synthetic */ L(int i10) {
        this();
    }

    public static String a(Context context) {
        String C = com.ironsource.environment.h.C(context);
        return !TextUtils.isEmpty(C) ? C : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x003a, code lost:
    
        if (r4.b() != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:22:0x003f, B:24:0x0047, B:25:0x005d, B:28:0x0066), top: B:21:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.ironsource.mediationsdk.D, com.ironsource.mediationsdk.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r9 = this;
            java.lang.String r0 = "isRewardedVideoAvailable():"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r9.f24849g
            r2 = 1
            r3 = 0
            boolean r4 = r9.D     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L13
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead"
            r6 = 3
            r1.log(r4, r5, r6)     // Catch: java.lang.Throwable -> L85
            return r3
        L13:
            boolean r4 = r9.W     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto L32
            boolean r4 = r9.Y     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L1c
            goto L32
        L1c:
            boolean r4 = r9.V     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L2b
            com.ironsource.mediationsdk.s r4 = r9.O     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L3e
            boolean r4 = r4.c()     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L3e
            goto L3c
        L2b:
            com.ironsource.mediationsdk.l0 r4 = r9.f24842c     // Catch: java.lang.Throwable -> L85
            boolean r4 = r4.c()     // Catch: java.lang.Throwable -> L85
            goto L3f
        L32:
            com.ironsource.mediationsdk.adunit.c.h r4 = r9.S     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L3e
            boolean r4 = r4.b()     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L3e
        L3c:
            r4 = r2
            goto L3f
        L3e:
            r4 = r3
        L3f:
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3)     // Catch: java.lang.Throwable -> L83
            boolean r6 = r9.V     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L5d
            java.lang.Object[][] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L83
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L83
            java.lang.String r8 = "programmatic"
            r7[r3] = r8     // Catch: java.lang.Throwable -> L83
            int r8 = r9.f24845d0     // Catch: java.lang.Throwable -> L83
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L83
            r7[r2] = r8     // Catch: java.lang.Throwable -> L83
            r6[r3] = r7     // Catch: java.lang.Throwable -> L83
            n(r5, r6)     // Catch: java.lang.Throwable -> L83
        L5d:
            com.ironsource.mediationsdk.a.c r6 = new com.ironsource.mediationsdk.a.c     // Catch: java.lang.Throwable -> L83
            if (r4 == 0) goto L64
            r7 = 1101(0x44d, float:1.543E-42)
            goto L66
        L64:
            r7 = 1102(0x44e, float:1.544E-42)
        L66:
            r6.<init>(r7, r5)     // Catch: java.lang.Throwable -> L83
            com.ironsource.mediationsdk.a.h r5 = com.ironsource.mediationsdk.a.h.d()     // Catch: java.lang.Throwable -> L83
            r5.b(r6)     // Catch: java.lang.Throwable -> L83
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L83
            r6.append(r4)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L83
            r1.log(r5, r6, r2)     // Catch: java.lang.Throwable -> L83
            r3 = r4
            goto L9e
        L83:
            r5 = move-exception
            goto L88
        L85:
            r4 = move-exception
            r5 = r4
            r4 = r3
        L88:
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r1.log(r6, r0, r2)
            java.lang.String r0 = "isRewardedVideoAvailable()"
            r1.logException(r6, r0, r5)
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.c():boolean");
    }

    public final synchronized void d(Activity activity, String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
        } catch (Throwable th) {
            this.f24849g.logException(IronSourceLogger.IronSourceTag.API, "loadDemandOnlyInterstitial", th);
            E.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
        if (!this.H) {
            this.f24849g.log(ironSourceTag, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()", 3);
            E.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
            return;
        }
        if (!this.E) {
            this.f24849g.log(ironSourceTag, "Interstitial was initialized in mediation mode. Use loadInterstitial instead", 3);
            E.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
            return;
        }
        boolean z10 = false;
        if (activity != null) {
            ContextProvider.getInstance().updateActivity(activity);
        } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            if (str2 != null) {
                z10 = true;
            }
            w(IronSourceConstants.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, z10, 1));
            this.f24849g.log(ironSourceTag, "Interstitial was initialized and loaded without Activity", 3);
            E.a().a(str, new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY, "Interstitial was initialized and loaded without Activity"));
            return;
        }
        Q.f b10 = Q.a().b();
        if (b10 == Q.f.INIT_FAILED) {
            this.f24849g.log(ironSourceTag, "init() had failed", 3);
            E.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            return;
        }
        if (b10 == Q.f.INIT_IN_PROGRESS) {
            if (Q.a().c()) {
                this.f24849g.log(ironSourceTag, "init() had failed", 3);
                E.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            synchronized (this.f24847e0) {
                this.f24847e0.add(str);
            }
            if (str2 != null) {
                w(IronSourceConstants.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, 1));
            }
            return;
        }
        if (!D()) {
            this.f24849g.log(ironSourceTag, "No interstitial configurations found", 3);
            E.a().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
            return;
        }
        synchronized (this.f24847e0) {
            q0 q0Var = this.f24852h0;
            if (q0Var == null) {
                this.f24847e0.add(str);
                if (str2 != null) {
                    w(IronSourceConstants.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, 1));
                }
            } else if (str2 == null) {
                q0Var.a(str, (String) null, false);
            } else {
                q0Var.a(str, str2, true);
            }
        }
    }

    public final void e(String str) {
        l0 l0Var = this.f24842c;
        String l10 = a3.k.l("showRewardedVideo(", str, ")");
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        IronSourceLoggerManager ironSourceLoggerManager = this.f24849g;
        ironSourceLoggerManager.log(ironSourceTag, l10, 1);
        try {
            if (this.D) {
                ironSourceLoggerManager.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                ae.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
                return;
            }
            if (!z()) {
                ae.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
                return;
            }
            if (this.V) {
                H(str);
                return;
            }
            Placement I = I(str);
            if (I != null) {
                l0Var.f25569r = I;
                l0Var.f25566n.f = I.getPlacementName();
                l0Var.a(I.getPlacementName());
            }
        } catch (Exception e10) {
            ironSourceLoggerManager.logException(IronSourceLogger.IronSourceTag.API, l10, e10);
            ae.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e10.getMessage()), (AdInfo) null);
        }
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void f() {
        synchronized (this.K) {
            if (this.K.booleanValue()) {
                this.K = Boolean.FALSE;
                C1425o.a().a(this.L, new IronSourceError(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init had failed"), false);
                this.L = null;
                this.M = null;
            }
        }
        if (this.f24841b0) {
            this.f24841b0 = false;
            C1430u.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.X) {
            this.X = false;
            C1430u.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.f24847e0) {
            Iterator<String> it = this.f24847e0.iterator();
            while (it.hasNext()) {
                E.a().a(it.next(), ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
            this.f24847e0.clear();
        }
        synchronized (this.f24848f0) {
            Iterator<String> it2 = this.f24848f0.iterator();
            while (it2.hasNext()) {
                ad.a().a(it2.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f24848f0.clear();
        }
        synchronized (this.f24850g0) {
            Iterator<String> it3 = this.f24850g0.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.J.get(next);
                if (iSDemandOnlyBannerLayout != null) {
                    iSDemandOnlyBannerLayout.mListenerWrapper.a(next, ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                }
            }
            this.f24850g0.clear();
            this.J.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean i(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.q0 r0 = r4.f24852h0     // Catch: java.lang.Throwable -> L35
            r1 = 0
            if (r0 == 0) goto L33
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.x> r2 = r0.f25805a     // Catch: java.lang.Throwable -> L35
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L35
            r3 = 1
            if (r2 != 0) goto L13
            com.ironsource.mediationsdk.q0.c(r5)     // Catch: java.lang.Throwable -> L35
            goto L2e
        L13:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.x> r0 = r0.f25805a     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L35
            com.ironsource.mediationsdk.x r5 = (com.ironsource.mediationsdk.C1432x) r5     // Catch: java.lang.Throwable -> L35
            boolean r0 = r5.b()     // Catch: java.lang.Throwable -> L35
            r2 = 0
            if (r0 == 0) goto L29
            r0 = 2211(0x8a3, float:3.098E-42)
            com.ironsource.mediationsdk.q0.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L35
            r5 = r3
            goto L2f
        L29:
            r0 = 2212(0x8a4, float:3.1E-42)
            com.ironsource.mediationsdk.q0.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L35
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L33
            monitor-exit(r4)
            return r3
        L33:
            monitor-exit(r4)
            return r1
        L35:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.i(java.lang.String):boolean");
    }

    public final void j(String str) {
        com.ironsource.mediationsdk.sdk.i iVar = this.f24851h;
        String l10 = a3.k.l("showOfferwall(", str, ")");
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        IronSourceLoggerManager ironSourceLoggerManager = this.f24849g;
        ironSourceLoggerManager.log(ironSourceTag, l10, 1);
        try {
            if (!E()) {
                iVar.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            com.ironsource.mediationsdk.model.m a10 = this.f24865r.f25936c.f25676c.a(str);
            if (a10 == null) {
                ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a10 = this.f24865r.f25936c.f25676c.a();
                if (a10 == null) {
                    ironSourceLoggerManager.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f24846e.a(a10.f25695b);
        } catch (Exception e10) {
            ironSourceLoggerManager.logException(IronSourceLogger.IronSourceTag.API, l10, e10);
            iVar.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public final InterstitialPlacement k(String str) {
        try {
            InterstitialPlacement J = J(str);
            IronSourceLoggerManager ironSourceLoggerManager = this.f24849g;
            if (J == null) {
                try {
                    ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    J = B();
                } catch (Exception unused) {
                    return J;
                }
            }
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + J, 1);
            return J;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Placement l(String str) {
        try {
            Placement G = G(str);
            IronSourceLoggerManager ironSourceLoggerManager = this.f24849g;
            if (G == null) {
                try {
                    ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    G = u();
                } catch (Exception unused) {
                    return G;
                }
            }
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + G, 1);
            return G;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m() {
        /*
            r8 = this;
            r0 = 83005(0x1443d, float:1.16315E-40)
            r1 = 0
            i(r0, r1)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            r0.info()
            com.ironsource.mediationsdk.utils.l r2 = r8.f24865r
            if (r2 != 0) goto L17
            java.lang.String r2 = "bidding data cannot be retrieved, SDK not initialized"
            r0.error(r2)
            goto Le4
        L17:
            com.ironsource.mediationsdk.model.q r0 = r2.f25935b
            java.lang.String r2 = "IronSource"
            com.ironsource.mediationsdk.model.NetworkSettings r0 = r0.a(r2)
            if (r0 == 0) goto Le4
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.ironsource.mediationsdk.d r3 = com.ironsource.mediationsdk.C1416d.a()
            org.json.JSONObject r4 = r0.getApplicationSettings()
            r5 = 0
            r6 = 1
            com.ironsource.mediationsdk.AbstractAdapter r0 = r3.a(r0, r4, r6, r5)
            if (r0 == 0) goto L3a
            org.json.JSONObject r2 = r0.getPlayerBiddingData()     // Catch: java.lang.Exception -> Lc3
        L3a:
            com.ironsource.mediationsdk.utils.l r0 = r8.f24865r     // Catch: java.lang.Exception -> Lc3
            com.ironsource.mediationsdk.model.j r0 = r0.f25936c     // Catch: java.lang.Exception -> Lc3
            com.ironsource.mediationsdk.model.c r0 = r0.f25678e     // Catch: java.lang.Exception -> Lc3
            com.ironsource.mediationsdk.utils.p r0 = r0.f25639c     // Catch: java.lang.Exception -> Lc3
            boolean r3 = r0.f25957d     // Catch: java.lang.Exception -> Lc3
            if (r3 == 0) goto L57
            com.ironsource.environment.f.b r2 = new com.ironsource.environment.f.b     // Catch: java.lang.Exception -> Lc3
            r2.<init>()     // Catch: java.lang.Exception -> Lc3
            org.json.JSONObject r2 = r2.a()     // Catch: java.lang.Exception -> Lc3
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C1418f.a()     // Catch: java.lang.Exception -> Lc3
            r3.a(r2, r6)     // Catch: java.lang.Exception -> Lc3
            goto L63
        L57:
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C1418f.a()     // Catch: java.lang.Exception -> Lc3
            org.json.JSONObject r4 = r0.f25956c     // Catch: java.lang.Exception -> Lc3
            java.util.ArrayList<java.lang.String> r5 = r0.f25954a     // Catch: java.lang.Exception -> Lc3
            org.json.JSONObject r2 = r3.a(r2, r4, r5)     // Catch: java.lang.Exception -> Lc3
        L63:
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Exception -> Lc3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc3
            java.lang.String r5 = "bidding data: "
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lc3
            r4.append(r2)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lc3
            r3.verbose(r4)     // Catch: java.lang.Exception -> Lc3
            if (r2 == 0) goto Le4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc3
            java.lang.String r5 = "raw biddingData length: "
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> Lc3
            int r5 = r5.length()     // Catch: java.lang.Exception -> Lc3
            r4.append(r5)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lc3
            r3.verbose(r4)     // Catch: java.lang.Exception -> Lc3
            boolean r0 = r0.f25958e     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto L9e
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Lc3
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r0)     // Catch: java.lang.Exception -> Lc3
            goto La6
        L9e:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Lc3
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encrypt(r0)     // Catch: java.lang.Exception -> Lc3
        La6:
            if (r0 == 0) goto Le5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbe
            java.lang.String r4 = "biddingData length: "
            r2.<init>(r4)     // Catch: java.lang.Exception -> Lbe
            int r4 = r0.length()     // Catch: java.lang.Exception -> Lbe
            r2.append(r4)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lbe
            r3.verbose(r2)     // Catch: java.lang.Exception -> Lbe
            goto Le5
        Lbe:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto Lc5
        Lc3:
            r0 = move-exception
            r2 = r1
        Lc5:
            r3 = 83007(0x1443f, float:1.16318E-40)
            i(r3, r1)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "got error during creating the token: "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.error(r0)
            r0 = r2
            goto Le5
        Le4:
            r0 = r1
        Le5:
            if (r0 != 0) goto Led
            r2 = 83006(0x1443e, float:1.16316E-40)
            i(r2, r1)
        Led:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.m():java.lang.String");
    }

    public final synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        IronSourceError t10 = t(activity, iSDemandOnlyBannerLayout, str);
        if (t10 != null) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, t10.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.mListenerWrapper.a(str, t10);
            }
            return;
        }
        IronSourceError e10 = e(Q.a().b());
        if (e10 != null) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, e10.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.mListenerWrapper.a(str, e10);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (y(iSDemandOnlyBannerLayout, str)) {
            return;
        }
        if (!b()) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.mListenerWrapper.a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (r(iSDemandOnlyBannerLayout, str)) {
                return;
            }
            this.f24856j0.a(iSDemandOnlyBannerLayout, str);
        }
    }

    public final String b(Context context) {
        String str;
        com.ironsource.mediationsdk.utils.p pVar;
        com.ironsource.sdk.controller.u uVar = this.f24860l0;
        i(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED, null);
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            return null;
        }
        Q.f b10 = Q.a().b();
        Q.f fVar = Q.f.NOT_INIT;
        if (b10 == fVar) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            i(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, null);
            return null;
        }
        if (b10 == Q.f.INIT_FAILED) {
            IronLog.API.error("bidding data cannot be retrieved, SDK failed to initialize");
            i(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, null);
            return null;
        }
        try {
            com.ironsource.mediationsdk.utils.l lVar = this.f24865r;
            if (lVar == null) {
                lVar = H.a(context);
            }
            if (b10 == fVar) {
                uVar.a(context);
                uVar.b(IronSourceUtils.getSDKVersion());
                uVar.c(this.f24863p);
                uVar.d(ConfigFile.getConfigFile().getPluginType());
                uVar.a(com.ironsource.c.a.a());
                uVar.b(IronSourceUtils.isGooglePlayInstalled(context));
            }
            if (b10 != Q.f.INITIATED) {
                Q.a().a(lVar);
                if (lVar != null) {
                    Q.a().a(context, lVar);
                }
            }
            if (lVar == null || !lVar.b()) {
                pVar = new com.ironsource.mediationsdk.utils.p();
            } else {
                pVar = lVar.f25936c.f25678e.f25639c;
                if (!pVar.f25957d) {
                    pVar.f25955b = lVar.f25935b.a(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
                }
            }
            JSONObject a10 = am.a(context, pVar);
            C1418f.a().a(a10, true);
            str = pVar.f25958e ? IronSourceAES.compressAndEncrypt(a10.toString()) : IronSourceAES.encrypt(a10.toString());
        } catch (Throwable th) {
            i(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, null);
            IronLog.API.error("got error during token creation: " + th.getMessage());
            str = null;
        }
        if (str == null) {
            i(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, null);
        }
        return str;
    }

    public final boolean c(String str) {
        String str2 = this.f24838a;
        IronSourceLoggerManager ironSourceLoggerManager = this.f24849g;
        try {
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str2 + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            com.ironsource.sdk.f.a aVar = new com.ironsource.sdk.f.a();
            if (!q(1, 128, str)) {
                aVar.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
            }
            if (!aVar.a()) {
                IronSourceLoggerManager.getLogger().log(ironSourceTag, aVar.b().toString(), 2);
                return false;
            }
            this.f24861m = str;
            com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(52, IronSourceUtils.getJsonForUserId(true)));
            return true;
        } catch (Exception e10) {
            ironSourceLoggerManager.logException(IronSourceLogger.IronSourceTag.API, str2 + ":setDynamicUserId(dynamicUserId:" + str + ")", e10);
            return false;
        }
    }

    public final void d(String str) {
        String str2 = this.f24838a;
        IronSourceLoggerManager ironSourceLoggerManager = this.f24849g;
        try {
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2 + ":setMediationType(mediationType:" + str + ")", 1);
            if (q(1, 64, str)) {
                if (str == null ? false : str.matches("^[a-zA-Z0-9]*$")) {
                    this.o = str;
                    return;
                }
            }
            ironSourceLoggerManager.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
        } catch (Exception e10) {
            ironSourceLoggerManager.logException(IronSourceLogger.IronSourceTag.API, str2 + ":setMediationType(mediationType:" + str + ")", e10);
        }
    }

    public final synchronized void f(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
        } catch (Exception e10) {
            this.f24849g.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyRewardedVideo", e10);
            ad.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e10.getMessage()));
        }
        if (!this.D) {
            this.f24849g.log(ironSourceTag, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead", 3);
            ad.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        r0 r0Var = this.f24854i0;
        if (r0Var == null) {
            this.f24849g.log(ironSourceTag, "Rewarded video was not initiated", 3);
            ad.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
        } else if (r0Var.f25806a.containsKey(str)) {
            z zVar = r0Var.f25806a.get(str);
            r0.a(1201, zVar, (Object[][]) null);
            zVar.a();
        } else {
            r0.c(str);
            ad.a().b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean g(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.r0 r0 = r4.f24854i0     // Catch: java.lang.Throwable -> L35
            r1 = 0
            if (r0 == 0) goto L33
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.z> r2 = r0.f25806a     // Catch: java.lang.Throwable -> L35
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L35
            r3 = 1
            if (r2 != 0) goto L13
            com.ironsource.mediationsdk.r0.c(r5)     // Catch: java.lang.Throwable -> L35
            goto L2e
        L13:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.z> r0 = r0.f25806a     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L35
            com.ironsource.mediationsdk.z r5 = (com.ironsource.mediationsdk.z) r5     // Catch: java.lang.Throwable -> L35
            boolean r0 = r5.b()     // Catch: java.lang.Throwable -> L35
            r2 = 0
            if (r0 == 0) goto L29
            r0 = 1210(0x4ba, float:1.696E-42)
            com.ironsource.mediationsdk.r0.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L35
            r5 = r3
            goto L2f
        L29:
            r0 = 1211(0x4bb, float:1.697E-42)
            com.ironsource.mediationsdk.r0.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L35
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L33
            monitor-exit(r4)
            return r3
        L33:
            monitor-exit(r4)
            return r1
        L35:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.g(java.lang.String):boolean");
    }

    public final boolean l() {
        try {
            f0 f0Var = this.f24846e;
            if (f0Var != null) {
                return f0Var.a();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        IronSourceError t10 = t(activity, iSDemandOnlyBannerLayout, str);
        if (t10 == null && str2 == null) {
            t10 = new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Missing adm");
        }
        if (t10 != null) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, t10.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.mListenerWrapper.a(str, t10);
            }
            return;
        }
        IronSourceError e10 = e(Q.a().b());
        if (e10 != null) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, e10.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.mListenerWrapper.a(str, e10);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (y(iSDemandOnlyBannerLayout, str)) {
            return;
        }
        if (!b()) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.mListenerWrapper.a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (r(iSDemandOnlyBannerLayout, str)) {
                return;
            }
            this.f24856j0.a(iSDemandOnlyBannerLayout, str, str2);
        }
    }

    public final synchronized void b(Activity activity, String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f24849g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
        } catch (Throwable th) {
            this.f24849g.logException(IronSourceLogger.IronSourceTag.API, "loadISDemandOnlyRewardedVideo", th);
            ad.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
        if (!this.G) {
            this.f24849g.log(ironSourceTag, "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()", 3);
            ad.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()"));
            return;
        }
        if (!this.D) {
            this.f24849g.log(ironSourceTag, "Rewarded video was initialized in mediation mode", 3);
            ad.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode"));
            return;
        }
        boolean z10 = false;
        if (activity != null) {
            ContextProvider.getInstance().updateActivity(activity);
        } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            if (str2 != null) {
                z10 = true;
            }
            i(IronSourceConstants.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, z10, 1));
            this.f24849g.log(ironSourceTag, "Rewarded video was initialized and loaded without Activity", 3);
            ad.a().a(str, new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, "Rewarded video was initialized and loaded without Activity"));
            return;
        }
        Q.f b10 = Q.a().b();
        if (b10 == Q.f.INIT_FAILED) {
            this.f24849g.log(ironSourceTag, "init() had failed", 3);
            ad.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (b10 == Q.f.INIT_IN_PROGRESS) {
            if (Q.a().c()) {
                this.f24849g.log(ironSourceTag, "init() had failed", 3);
                ad.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.f24848f0) {
                this.f24848f0.add(str);
            }
            if (str2 != null) {
                i(IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, this.f24845d0));
            }
            return;
        }
        if (!A()) {
            this.f24849g.log(ironSourceTag, "No rewarded video configurations found", 3);
            ad.a().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        synchronized (this.f24848f0) {
            r0 r0Var = this.f24854i0;
            if (r0Var == null) {
                this.f24848f0.add(str);
                if (str2 != null) {
                    i(IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, this.f24845d0));
                }
            } else if (str2 == null) {
                r0Var.a(str, (String) null, false);
            } else {
                r0Var.a(str, str2, true);
            }
        }
    }

    public final synchronized void a(Activity activity, String str, String str2) {
        if (str2 != null) {
            b(activity, str, str2);
        } else {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            ad.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
        }
    }

    public final void b(boolean z10) {
        this.N = Boolean.valueOf(z10);
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "setConsent : " + z10, 1);
        C1416d.a().a(z10);
        if (this.f24840b != null) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.ADAPTER_API, "Offerwall | setConsent(consent:" + z10 + ")", 1);
            this.f24840b.setConsent(z10);
        }
        int i10 = !z10 ? 41 : 40;
        this.f24860l0.a(z10);
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, IronSourceUtils.getMediationAdditionalData(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x000e, B:10:0x0012, B:12:0x001c, B:14:0x0087, B:15:0x0036, B:17:0x003e, B:19:0x0042, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:27:0x005d, B:28:0x0061, B:30:0x0069, B:31:0x006c, B:33:0x0074, B:35:0x0078, B:37:0x007c, B:39:0x0084, B:45:0x00bf, B:47:0x00c3, B:48:0x00cd, B:49:0x00d8, B:51:0x00de, B:56:0x008a, B:58:0x008e, B:59:0x009b, B:61:0x009f, B:62:0x00ac, B:64:0x00b0, B:65:0x00b6, B:66:0x00a5, B:67:0x0094), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x000e, B:10:0x0012, B:12:0x001c, B:14:0x0087, B:15:0x0036, B:17:0x003e, B:19:0x0042, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:27:0x005d, B:28:0x0061, B:30:0x0069, B:31:0x006c, B:33:0x0074, B:35:0x0078, B:37:0x007c, B:39:0x0084, B:45:0x00bf, B:47:0x00c3, B:48:0x00cd, B:49:0x00d8, B:51:0x00de, B:56:0x008a, B:58:0x008e, B:59:0x009b, B:61:0x009f, B:62:0x00ac, B:64:0x00b0, B:65:0x00b6, B:66:0x00a5, B:67:0x0094), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(android.content.Context r8, java.lang.String r9, com.ironsource.mediationsdk.sdk.InitializationListener r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00c0 A[Catch: all -> 0x029d, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000e, B:10:0x0017, B:11:0x0019, B:13:0x001d, B:16:0x0027, B:19:0x002b, B:21:0x002f, B:23:0x0043, B:24:0x0045, B:26:0x004d, B:27:0x004f, B:29:0x0057, B:31:0x0059, B:34:0x0074, B:36:0x0090, B:37:0x009a, B:39:0x00a1, B:41:0x00aa, B:44:0x00b6, B:45:0x00c9, B:46:0x00cc, B:48:0x00d2, B:49:0x00d4, B:51:0x00dc, B:52:0x00f9, B:56:0x0149, B:57:0x0163, B:59:0x0173, B:61:0x0187, B:64:0x0190, B:66:0x0193, B:68:0x0197, B:70:0x019d, B:71:0x01c2, B:73:0x01c6, B:75:0x01d9, B:76:0x01e1, B:78:0x01eb, B:79:0x01f4, B:82:0x0207, B:84:0x022b, B:86:0x0231, B:88:0x0235, B:90:0x0237, B:96:0x0241, B:97:0x024b, B:99:0x0255, B:100:0x025e, B:104:0x00c0, B:105:0x005c, B:107:0x0064, B:109:0x006e, B:111:0x027b, B:114:0x028c, B:119:0x0291), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[Catch: all -> 0x029d, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000e, B:10:0x0017, B:11:0x0019, B:13:0x001d, B:16:0x0027, B:19:0x002b, B:21:0x002f, B:23:0x0043, B:24:0x0045, B:26:0x004d, B:27:0x004f, B:29:0x0057, B:31:0x0059, B:34:0x0074, B:36:0x0090, B:37:0x009a, B:39:0x00a1, B:41:0x00aa, B:44:0x00b6, B:45:0x00c9, B:46:0x00cc, B:48:0x00d2, B:49:0x00d4, B:51:0x00dc, B:52:0x00f9, B:56:0x0149, B:57:0x0163, B:59:0x0173, B:61:0x0187, B:64:0x0190, B:66:0x0193, B:68:0x0197, B:70:0x019d, B:71:0x01c2, B:73:0x01c6, B:75:0x01d9, B:76:0x01e1, B:78:0x01eb, B:79:0x01f4, B:82:0x0207, B:84:0x022b, B:86:0x0231, B:88:0x0235, B:90:0x0237, B:96:0x0241, B:97:0x024b, B:99:0x0255, B:100:0x025e, B:104:0x00c0, B:105:0x005c, B:107:0x0064, B:109:0x006e, B:111:0x027b, B:114:0x028c, B:119:0x0291), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1 A[Catch: all -> 0x029d, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000e, B:10:0x0017, B:11:0x0019, B:13:0x001d, B:16:0x0027, B:19:0x002b, B:21:0x002f, B:23:0x0043, B:24:0x0045, B:26:0x004d, B:27:0x004f, B:29:0x0057, B:31:0x0059, B:34:0x0074, B:36:0x0090, B:37:0x009a, B:39:0x00a1, B:41:0x00aa, B:44:0x00b6, B:45:0x00c9, B:46:0x00cc, B:48:0x00d2, B:49:0x00d4, B:51:0x00dc, B:52:0x00f9, B:56:0x0149, B:57:0x0163, B:59:0x0173, B:61:0x0187, B:64:0x0190, B:66:0x0193, B:68:0x0197, B:70:0x019d, B:71:0x01c2, B:73:0x01c6, B:75:0x01d9, B:76:0x01e1, B:78:0x01eb, B:79:0x01f4, B:82:0x0207, B:84:0x022b, B:86:0x0231, B:88:0x0235, B:90:0x0237, B:96:0x0241, B:97:0x024b, B:99:0x0255, B:100:0x025e, B:104:0x00c0, B:105:0x005c, B:107:0x0064, B:109:0x006e, B:111:0x027b, B:114:0x028c, B:119:0x0291), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2 A[Catch: all -> 0x029d, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000e, B:10:0x0017, B:11:0x0019, B:13:0x001d, B:16:0x0027, B:19:0x002b, B:21:0x002f, B:23:0x0043, B:24:0x0045, B:26:0x004d, B:27:0x004f, B:29:0x0057, B:31:0x0059, B:34:0x0074, B:36:0x0090, B:37:0x009a, B:39:0x00a1, B:41:0x00aa, B:44:0x00b6, B:45:0x00c9, B:46:0x00cc, B:48:0x00d2, B:49:0x00d4, B:51:0x00dc, B:52:0x00f9, B:56:0x0149, B:57:0x0163, B:59:0x0173, B:61:0x0187, B:64:0x0190, B:66:0x0193, B:68:0x0197, B:70:0x019d, B:71:0x01c2, B:73:0x01c6, B:75:0x01d9, B:76:0x01e1, B:78:0x01eb, B:79:0x01f4, B:82:0x0207, B:84:0x022b, B:86:0x0231, B:88:0x0235, B:90:0x0237, B:96:0x0241, B:97:0x024b, B:99:0x0255, B:100:0x025e, B:104:0x00c0, B:105:0x005c, B:107:0x0064, B:109:0x006e, B:111:0x027b, B:114:0x028c, B:119:0x0291), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc A[Catch: all -> 0x029d, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000e, B:10:0x0017, B:11:0x0019, B:13:0x001d, B:16:0x0027, B:19:0x002b, B:21:0x002f, B:23:0x0043, B:24:0x0045, B:26:0x004d, B:27:0x004f, B:29:0x0057, B:31:0x0059, B:34:0x0074, B:36:0x0090, B:37:0x009a, B:39:0x00a1, B:41:0x00aa, B:44:0x00b6, B:45:0x00c9, B:46:0x00cc, B:48:0x00d2, B:49:0x00d4, B:51:0x00dc, B:52:0x00f9, B:56:0x0149, B:57:0x0163, B:59:0x0173, B:61:0x0187, B:64:0x0190, B:66:0x0193, B:68:0x0197, B:70:0x019d, B:71:0x01c2, B:73:0x01c6, B:75:0x01d9, B:76:0x01e1, B:78:0x01eb, B:79:0x01f4, B:82:0x0207, B:84:0x022b, B:86:0x0231, B:88:0x0235, B:90:0x0237, B:96:0x0241, B:97:0x024b, B:99:0x0255, B:100:0x025e, B:104:0x00c0, B:105:0x005c, B:107:0x0064, B:109:0x006e, B:111:0x027b, B:114:0x028c, B:119:0x0291), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173 A[Catch: all -> 0x029d, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000e, B:10:0x0017, B:11:0x0019, B:13:0x001d, B:16:0x0027, B:19:0x002b, B:21:0x002f, B:23:0x0043, B:24:0x0045, B:26:0x004d, B:27:0x004f, B:29:0x0057, B:31:0x0059, B:34:0x0074, B:36:0x0090, B:37:0x009a, B:39:0x00a1, B:41:0x00aa, B:44:0x00b6, B:45:0x00c9, B:46:0x00cc, B:48:0x00d2, B:49:0x00d4, B:51:0x00dc, B:52:0x00f9, B:56:0x0149, B:57:0x0163, B:59:0x0173, B:61:0x0187, B:64:0x0190, B:66:0x0193, B:68:0x0197, B:70:0x019d, B:71:0x01c2, B:73:0x01c6, B:75:0x01d9, B:76:0x01e1, B:78:0x01eb, B:79:0x01f4, B:82:0x0207, B:84:0x022b, B:86:0x0231, B:88:0x0235, B:90:0x0237, B:96:0x0241, B:97:0x024b, B:99:0x0255, B:100:0x025e, B:104:0x00c0, B:105:0x005c, B:107:0x0064, B:109:0x006e, B:111:0x027b, B:114:0x028c, B:119:0x0291), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197 A[Catch: all -> 0x029d, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000e, B:10:0x0017, B:11:0x0019, B:13:0x001d, B:16:0x0027, B:19:0x002b, B:21:0x002f, B:23:0x0043, B:24:0x0045, B:26:0x004d, B:27:0x004f, B:29:0x0057, B:31:0x0059, B:34:0x0074, B:36:0x0090, B:37:0x009a, B:39:0x00a1, B:41:0x00aa, B:44:0x00b6, B:45:0x00c9, B:46:0x00cc, B:48:0x00d2, B:49:0x00d4, B:51:0x00dc, B:52:0x00f9, B:56:0x0149, B:57:0x0163, B:59:0x0173, B:61:0x0187, B:64:0x0190, B:66:0x0193, B:68:0x0197, B:70:0x019d, B:71:0x01c2, B:73:0x01c6, B:75:0x01d9, B:76:0x01e1, B:78:0x01eb, B:79:0x01f4, B:82:0x0207, B:84:0x022b, B:86:0x0231, B:88:0x0235, B:90:0x0237, B:96:0x0241, B:97:0x024b, B:99:0x0255, B:100:0x025e, B:104:0x00c0, B:105:0x005c, B:107:0x0064, B:109:0x006e, B:111:0x027b, B:114:0x028c, B:119:0x0291), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c6 A[Catch: all -> 0x029d, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000e, B:10:0x0017, B:11:0x0019, B:13:0x001d, B:16:0x0027, B:19:0x002b, B:21:0x002f, B:23:0x0043, B:24:0x0045, B:26:0x004d, B:27:0x004f, B:29:0x0057, B:31:0x0059, B:34:0x0074, B:36:0x0090, B:37:0x009a, B:39:0x00a1, B:41:0x00aa, B:44:0x00b6, B:45:0x00c9, B:46:0x00cc, B:48:0x00d2, B:49:0x00d4, B:51:0x00dc, B:52:0x00f9, B:56:0x0149, B:57:0x0163, B:59:0x0173, B:61:0x0187, B:64:0x0190, B:66:0x0193, B:68:0x0197, B:70:0x019d, B:71:0x01c2, B:73:0x01c6, B:75:0x01d9, B:76:0x01e1, B:78:0x01eb, B:79:0x01f4, B:82:0x0207, B:84:0x022b, B:86:0x0231, B:88:0x0235, B:90:0x0237, B:96:0x0241, B:97:0x024b, B:99:0x0255, B:100:0x025e, B:104:0x00c0, B:105:0x005c, B:107:0x0064, B:109:0x006e, B:111:0x027b, B:114:0x028c, B:119:0x0291), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0207 A[Catch: all -> 0x029d, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000e, B:10:0x0017, B:11:0x0019, B:13:0x001d, B:16:0x0027, B:19:0x002b, B:21:0x002f, B:23:0x0043, B:24:0x0045, B:26:0x004d, B:27:0x004f, B:29:0x0057, B:31:0x0059, B:34:0x0074, B:36:0x0090, B:37:0x009a, B:39:0x00a1, B:41:0x00aa, B:44:0x00b6, B:45:0x00c9, B:46:0x00cc, B:48:0x00d2, B:49:0x00d4, B:51:0x00dc, B:52:0x00f9, B:56:0x0149, B:57:0x0163, B:59:0x0173, B:61:0x0187, B:64:0x0190, B:66:0x0193, B:68:0x0197, B:70:0x019d, B:71:0x01c2, B:73:0x01c6, B:75:0x01d9, B:76:0x01e1, B:78:0x01eb, B:79:0x01f4, B:82:0x0207, B:84:0x022b, B:86:0x0231, B:88:0x0235, B:90:0x0237, B:96:0x0241, B:97:0x024b, B:99:0x0255, B:100:0x025e, B:104:0x00c0, B:105:0x005c, B:107:0x0064, B:109:0x006e, B:111:0x027b, B:114:0x028c, B:119:0x0291), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(android.content.Context r9, java.lang.String r10, boolean r11, com.ironsource.mediationsdk.sdk.InitializationListener r12, com.ironsource.mediationsdk.IronSource.AD_UNIT... r13) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (android.text.TextUtils.isEmpty(r9) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "showInterstitial("
            java.lang.String r1 = ")"
            java.lang.String r0 = a3.k.l(r0, r9, r1)
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2 = 1
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r8.f24849g
            r3.log(r1, r0, r2)
            r2 = 510(0x1fe, float:7.15E-43)
            r4 = 0
            boolean r5 = r8.E     // Catch: java.lang.Exception -> L87
            if (r5 == 0) goto L2a
            java.lang.String r9 = "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"
            r5 = 3
            r3.log(r1, r9, r5)     // Catch: java.lang.Exception -> L87
            com.ironsource.mediationsdk.F r1 = com.ironsource.mediationsdk.F.a()     // Catch: java.lang.Exception -> L87
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> L87
            r5.<init>(r2, r9)     // Catch: java.lang.Exception -> L87
            r1.a(r5, r4)     // Catch: java.lang.Exception -> L87
            return
        L2a:
            boolean r1 = r8.C()     // Catch: java.lang.Exception -> L87
            if (r1 != 0) goto L40
            com.ironsource.mediationsdk.F r9 = com.ironsource.mediationsdk.F.a()     // Catch: java.lang.Exception -> L87
            java.lang.String r1 = "showInterstitial can't be called before the Interstitial ad unit initialization completed successfully"
            java.lang.String r5 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r1, r5)     // Catch: java.lang.Exception -> L87
            r9.a(r1, r4)     // Catch: java.lang.Exception -> L87
            return
        L40:
            boolean r1 = r8.Z     // Catch: java.lang.Exception -> L87
            if (r1 == 0) goto L48
            r8.L(r9)     // Catch: java.lang.Exception -> L87
            return
        L48:
            com.ironsource.mediationsdk.model.InterstitialPlacement r1 = r8.M(r9)     // Catch: java.lang.Exception -> L87
            r5 = 0
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r5)     // Catch: java.lang.Exception -> L87
            java.lang.String r6 = "placement"
            if (r1 == 0) goto L5a
            java.lang.String r9 = r1.getPlacementName()     // Catch: org.json.JSONException -> L64 java.lang.Exception -> L87
            goto L60
        L5a:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch: org.json.JSONException -> L64 java.lang.Exception -> L87
            if (r7 != 0) goto L68
        L60:
            r5.put(r6, r9)     // Catch: org.json.JSONException -> L64 java.lang.Exception -> L87
            goto L68
        L64:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Exception -> L87
        L68:
            com.ironsource.mediationsdk.a.c r9 = new com.ironsource.mediationsdk.a.c     // Catch: java.lang.Exception -> L87
            r6 = 2100(0x834, float:2.943E-42)
            r9.<init>(r6, r5)     // Catch: java.lang.Exception -> L87
            com.ironsource.mediationsdk.a.d r5 = com.ironsource.mediationsdk.a.d.d()     // Catch: java.lang.Exception -> L87
            r5.b(r9)     // Catch: java.lang.Exception -> L87
            if (r1 == 0) goto L86
            com.ironsource.mediationsdk.w r9 = r8.f24844d     // Catch: java.lang.Exception -> L87
            r9.f25969r = r1     // Catch: java.lang.Exception -> L87
            com.ironsource.mediationsdk.sdk.i r5 = r9.f25966n     // Catch: java.lang.Exception -> L87
            r5.f25818e = r1     // Catch: java.lang.Exception -> L87
            r1.getPlacementName()     // Catch: java.lang.Exception -> L87
            r9.d()     // Catch: java.lang.Exception -> L87
        L86:
            return
        L87:
            r9 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3.logException(r1, r0, r9)
            com.ironsource.mediationsdk.F r0 = com.ironsource.mediationsdk.F.a()
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError
            java.lang.String r9 = r9.getMessage()
            r1.<init>(r2, r9)
            r0.a(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.h(java.lang.String):void");
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        com.ironsource.adapters.facebook.a.q("placementName = ", str, IronLog.INTERNAL);
        if (this.F) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            C1425o.a().a(ironSourceBannerLayout, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"), false);
            return;
        }
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            String concat = "loadBanner can't be called - ".concat(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, concat, 3);
            C1425o.a().a(ironSourceBannerLayout, ErrorBuilder.buildLoadFailedError(concat), false);
            return;
        }
        if (!this.I) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            C1425o.a().a(ironSourceBannerLayout, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"), false);
            return;
        }
        if (ironSourceBannerLayout.getSize().getDescription().equals("CUSTOM") && (ironSourceBannerLayout.getSize().getWidth() <= 0 || ironSourceBannerLayout.getSize().getHeight() <= 0)) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            C1425o.a().a(ironSourceBannerLayout, ErrorBuilder.unsupportedBannerSize(""), false);
            return;
        }
        Q.f b10 = Q.a().b();
        if (b10 == Q.f.INIT_FAILED) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
            C1425o.a().a(ironSourceBannerLayout, new IronSourceError(600, "Init() had failed"), false);
            return;
        }
        if (b10 == Q.f.INIT_IN_PROGRESS) {
            if (Q.a().c()) {
                this.f24849g.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                C1425o.a().a(ironSourceBannerLayout, new IronSourceError(601, "Init had failed"), false);
                return;
            } else {
                this.L = ironSourceBannerLayout;
                this.K = Boolean.TRUE;
                this.M = str;
                return;
            }
        }
        if (!b()) {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            C1425o.a().a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "the server response does not contain banner data"), false);
            return;
        }
        synchronized (this.K) {
            C1426p c1426p = this.f;
            if (c1426p == null && this.Q == null) {
                this.L = ironSourceBannerLayout;
                this.K = Boolean.TRUE;
                this.M = str;
            } else if (this.f24843c0) {
                this.Q.a(ironSourceBannerLayout, P(str));
            } else {
                c1426p.a(ironSourceBannerLayout, P(str));
            }
        }
    }

    public static void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        E.a().f24757a = iSDemandOnlyInterstitialListener;
    }

    public static void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayInterstitialListener == null) {
            ironLog.info("ISListener is null");
        } else {
            ironLog.info();
        }
        F.a().a(levelPlayInterstitialListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (r4.b() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003c, code lost:
    
        if (r4.e() != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r9 = this;
            java.lang.String r0 = "isInterstitialReady():"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r9.f24849g
            r2 = 1
            r3 = 0
            boolean r4 = r9.E     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L13
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead"
            r6 = 3
            r1.log(r4, r5, r6)     // Catch: java.lang.Throwable -> L70
            return r3
        L13:
            boolean r4 = r9.Z     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L34
            boolean r4 = r9.f24839a0     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L29
            com.ironsource.mediationsdk.adunit.c.g r4 = r9.R     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L27
            boolean r4 = r4.b()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L27
        L25:
            r4 = r2
            goto L3f
        L27:
            r4 = r3
            goto L3f
        L29:
            com.ironsource.mediationsdk.i0 r4 = r9.P     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L27
            boolean r4 = r4.f()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L27
            goto L25
        L34:
            com.ironsource.mediationsdk.w r4 = r9.f24844d     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L27
            boolean r4 = r4.e()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L27
            goto L25
        L3f:
            boolean r5 = r9.Z     // Catch: java.lang.Throwable -> L6b
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r5, r2)     // Catch: java.lang.Throwable -> L6b
            com.ironsource.mediationsdk.a.c r6 = new com.ironsource.mediationsdk.a.c     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L4c
            r7 = 2101(0x835, float:2.944E-42)
            goto L4e
        L4c:
            r7 = 2102(0x836, float:2.946E-42)
        L4e:
            r6.<init>(r7, r5)     // Catch: java.lang.Throwable -> L6b
            com.ironsource.mediationsdk.a.d r5 = com.ironsource.mediationsdk.a.d.d()     // Catch: java.lang.Throwable -> L6b
            r5.b(r6)     // Catch: java.lang.Throwable -> L6b
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            r6.append(r4)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6b
            r1.log(r5, r6, r2)     // Catch: java.lang.Throwable -> L6b
            r3 = r4
            goto L88
        L6b:
            r5 = move-exception
            r8 = r5
            r5 = r4
            r4 = r8
            goto L72
        L70:
            r4 = move-exception
            r5 = r3
        L72:
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r0 = r7.toString()
            r1.log(r6, r0, r2)
            java.lang.String r0 = "isInterstitialReady()"
            r1.logException(r6, r0, r4)
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.h():boolean");
    }

    public static void a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayRewardedVideoListener == null) {
            ironLog.info("RVListener is null");
        } else {
            ironLog.info();
        }
        ae.a().f25272b = levelPlayRewardedVideoListener;
    }

    public final synchronized void a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (levelPlayRewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.G) {
            if (levelPlayRewardedVideoManualListener == null) {
                this.W = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.W = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        ae.a().f25272b = levelPlayRewardedVideoManualListener;
    }

    public final synchronized void a(RewardedVideoManualListener rewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (rewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.G) {
            if (rewardedVideoManualListener == null) {
                this.W = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.W = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        this.f24851h.f25814a = rewardedVideoManualListener;
        ae.a().f25271a = rewardedVideoManualListener;
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(String str) {
        try {
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f24851h != null) {
                Iterator it = this.y.iterator();
                while (it.hasNext()) {
                    k((IronSource.AD_UNIT) it.next(), true);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        StringBuilder s10 = a3.l.s("key = ", str, ", values = ");
        s10.append(list.toString());
        ironLog.verbose(s10.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            ironLog.verbose(checkMetaDataKeyValidity);
            return;
        }
        if (checkMetaDataValueValidity.length() > 0) {
            ironLog.verbose(checkMetaDataValueValidity);
            return;
        }
        MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = formatMetaData.getMetaDataKey();
        List<String> metaDataValue = formatMetaData.getMetaDataValue();
        if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            C1416d.a().a(metaDataKey, metaDataValue);
        } else if (Q.a().b() == Q.f.INITIATED && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
            ironLog.error("setMetaData with key = " + metaDataKey + " must to be called before init");
        } else {
            com.ironsource.d.b.a().a(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> concurrentHashMap = C1416d.a().f25384g;
            concurrentHashMap.putAll(com.ironsource.d.b.a().d());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.f24860l0.a(jSONObject);
        } catch (JSONException e10) {
            IronLog.INTERNAL.error("got the following error " + e10.getMessage());
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(Q.a().b() == Q.f.INITIATED ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
    }

    public static void a(String str, JSONObject jSONObject) {
        String b10 = s.f.b("networkKey = ", str);
        if (jSONObject != null) {
            b10 = b10 + " networkData = " + jSONObject;
        }
        IronLog.API.verbose(b10);
        C1416d.a().a(str, jSONObject);
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(List<IronSource.AD_UNIT> list, boolean z10, com.ironsource.mediationsdk.model.j jVar) {
        IronLog.INTERNAL.verbose();
        try {
            this.f24869v = list;
            this.f24868u = true;
            this.f24849g.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z10) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(114, mediationAdditionalData));
            }
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            if (currentActiveActivity != null) {
                String screenSizeParams = AdapterUtils.getScreenSizeParams(currentActiveActivity);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, screenSizeParams);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.TROUBLESHOOTING_SCREEN_SIZE, jSONObject));
            }
            com.ironsource.mediationsdk.a.d.d().c();
            com.ironsource.mediationsdk.a.h.d().c();
            C1416d a10 = C1416d.a();
            String str = this.f24855j;
            String str2 = this.f24857k;
            a10.f25381c = str;
            a10.f25382d = str2;
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.y.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        x(ad_unit);
                    } else {
                        k(ad_unit, false);
                    }
                }
            }
            d();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    public static void a(boolean z10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "setAdaptersDebug : " + z10, 1);
        C1416d.a().b(z10);
    }
}
