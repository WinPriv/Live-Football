package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1421j;
import com.ironsource.mediationsdk.C1428r;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.bidding.b;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class T extends s implements IronSourceBannerLayout.a, U, InterfaceC1419g {
    public final boolean A;
    public final long B;
    public final c C;
    public final T D;

    /* renamed from: e, reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.k f24952e;
    public f f;

    /* renamed from: g, reason: collision with root package name */
    public final com.ironsource.lifecycle.a.a f24953g;

    /* renamed from: h, reason: collision with root package name */
    public IronSourceBannerLayout f24954h;

    /* renamed from: i, reason: collision with root package name */
    public com.ironsource.mediationsdk.model.i f24955i;

    /* renamed from: j, reason: collision with root package name */
    public int f24956j;

    /* renamed from: k, reason: collision with root package name */
    public V f24957k;

    /* renamed from: l, reason: collision with root package name */
    public int f24958l;

    /* renamed from: m, reason: collision with root package name */
    public final ConcurrentHashMap<String, V> f24959m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList<V> f24960n;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public JSONObject f24961p;

    /* renamed from: q, reason: collision with root package name */
    public String f24962q;

    /* renamed from: r, reason: collision with root package name */
    public int f24963r;

    /* renamed from: s, reason: collision with root package name */
    public final C1420h f24964s;

    /* renamed from: t, reason: collision with root package name */
    public com.ironsource.mediationsdk.c.b f24965t;

    /* renamed from: u, reason: collision with root package name */
    public C1421j f24966u;

    /* renamed from: v, reason: collision with root package name */
    public final ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> f24967v;

    /* renamed from: w, reason: collision with root package name */
    public final ConcurrentHashMap<String, C1421j.a> f24968w;

    /* renamed from: x, reason: collision with root package name */
    public final long f24969x;
    public final Object y;

    /* renamed from: z, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.f f24970z;

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r6 = this;
                com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.String r1 = "start reloading banner task"
                r0.verbose(r1)
                com.ironsource.mediationsdk.T r1 = com.ironsource.mediationsdk.T.this
                com.ironsource.mediationsdk.IronSourceBannerLayout r2 = r1.f24954h
                r3 = 0
                if (r2 != 0) goto L14
                java.lang.String r2 = "banner is null"
            L10:
                r0.verbose(r2)
                goto L28
            L14:
                boolean r2 = r2.isShown()
                if (r2 != 0) goto L1d
                java.lang.String r2 = "banner or one of its parents are INVISIBLE or GONE"
                goto L10
            L1d:
                com.ironsource.mediationsdk.IronSourceBannerLayout r2 = r1.f24954h
                boolean r2 = r2.hasWindowFocus()
                if (r2 != 0) goto L2a
                java.lang.String r2 = "banner has no window focus"
                goto L10
            L28:
                r2 = r3
                goto L46
            L2a:
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                com.ironsource.mediationsdk.IronSourceBannerLayout r4 = r1.f24954h
                boolean r2 = r4.getGlobalVisibleRect(r2)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "visible = "
                r4.<init>(r5)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                r0.verbose(r4)
            L46:
                r4 = 1
                if (r2 != 0) goto L80
                java.lang.String r2 = "banner is not visible, reload skipped"
                r0.verbose(r2)
                java.lang.Object[][] r0 = new java.lang.Object[r4]
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r5 = "errorCode"
                r2[r3] = r5
                r5 = 613(0x265, float:8.59E-43)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r2[r4] = r5
                r0[r3] = r2
                r2 = 3200(0xc80, float:4.484E-42)
                r1.e(r2, r0)
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                com.ironsource.mediationsdk.utils.k r2 = r1.f24952e
                int r2 = r2.g()
                long r2 = (long) r2
                long r2 = r0.toMillis(r2)
                com.ironsource.lifecycle.a.a r0 = r1.f24953g
                r0.a(r2)
                com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r1.f24954h
                com.ironsource.mediationsdk.T r1 = r1.D
                r0.setWindowFocusChangedListener(r1)
                return
            L80:
                com.ironsource.mediationsdk.T$f r2 = com.ironsource.mediationsdk.T.f.LOADED
                com.ironsource.mediationsdk.T$f r3 = com.ironsource.mediationsdk.T.f.STARTED_LOADING
                boolean r2 = r1.k(r2, r3)
                if (r2 == 0) goto L8e
                r1.l(r4)
                goto La1
            L8e:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "wrong state = "
                r2.<init>(r3)
                com.ironsource.mediationsdk.T$f r1 = r1.f
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.error(r1)
            La1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.T.c.run():void");
        }
    }

    /* loaded from: classes2.dex */
    public class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f24977a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f24978b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f24979c;

        public d(StringBuilder sb2, ArrayList arrayList, HashMap hashMap) {
            this.f24977a = hashMap;
            this.f24978b = sb2;
            this.f24979c = arrayList;
        }

        @Override // com.ironsource.mediationsdk.bidding.b.a
        public final void a(String str) {
            Object[][] objArr = {new Object[]{"duration", str}};
            T t10 = T.this;
            t10.e(IronSourceConstants.BN_COLLECT_TOKENS_FAILED, objArr);
            t10.i(this.f24977a, this.f24979c, this.f24978b);
        }

        @Override // com.ironsource.mediationsdk.bidding.b.a
        public final void a(List<com.ironsource.sdk.a.e> list, long j10, List<String> list2) {
            StringBuilder sb2;
            Map<String, Object> map;
            Object[][] objArr = {new Object[]{"duration", Long.valueOf(j10)}};
            T t10 = T.this;
            t10.e(IronSourceConstants.BN_COLLECT_TOKENS_COMPLETED, objArr);
            Iterator<com.ironsource.sdk.a.e> it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                sb2 = this.f24978b;
                map = this.f24977a;
                if (!hasNext) {
                    break;
                }
                com.ironsource.sdk.a.e next = it.next();
                if (next.c() != null) {
                    map.put(next.b(), next.c());
                    sb2.append(next.a());
                    sb2.append(next.b());
                    sb2.append(",");
                    t10.f24959m.get(next.b()).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(next.d())}});
                } else {
                    t10.f24959m.get(next.b()).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(next.d())}, new Object[]{"reason", next.e()}});
                }
            }
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                t10.f24959m.get(it2.next()).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            }
            t10.i(map, this.f24979c, sb2);
        }
    }

    /* loaded from: classes2.dex */
    public class e extends TimerTask {
        public e() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            T t10 = T.this;
            t10.getClass();
            IronLog.INTERNAL.verbose("");
            AsyncTask.execute(new g0(t10));
        }
    }

    /* loaded from: classes2.dex */
    public enum f {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public T(List<NetworkSettings> list, com.ironsource.mediationsdk.utils.k kVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        boolean z10;
        this.f = f.NONE;
        this.f24962q = "";
        this.y = new Object();
        this.C = new c();
        this.D = this;
        e(IronSourceConstants.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog.INTERNAL.verbose("isAuctionEnabled = " + kVar.c());
        this.f24952e = kVar;
        this.f24959m = new ConcurrentHashMap<>();
        this.f24960n = new CopyOnWriteArrayList<>();
        this.f24967v = new ConcurrentHashMap<>();
        this.f24968w = new ConcurrentHashMap<>();
        this.f24958l = com.ironsource.mediationsdk.utils.o.a().b(3);
        C1425o.a().f25762c = kVar.e();
        if (kVar.c()) {
            this.f24964s = new C1420h(com.anythink.expressad.foundation.g.a.f.f9817e, kVar.h(), this);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getProviderName());
        }
        this.f24966u = new C1421j(arrayList, this.f24952e.h().f25893g);
        for (int i10 = 0; i10 < list.size(); i10++) {
            NetworkSettings networkSettings = list.get(i10);
            AbstractAdapter a10 = C1416d.a().a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a10 != null) {
                com.ironsource.mediationsdk.utils.k kVar2 = this.f24952e;
                int i11 = this.f24958l;
                f fVar = this.f;
                if (fVar != f.RELOADING && fVar != f.AUCTION) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                V v3 = new V(kVar2, this, networkSettings, a10, i11, "", null, 0, "", z10);
                this.f24959m.put(v3.k(), v3);
            } else {
                IronLog.INTERNAL.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
            }
        }
        this.f24969x = e0.i.e();
        g(f.READY_TO_LOAD);
        this.A = kVar.i();
        this.B = kVar.j();
        this.f24953g = new com.ironsource.lifecycle.a.a(this.C, com.ironsource.lifecycle.d.a(), new com.ironsource.mediationsdk.server.b());
    }

    public static void j(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        char c10;
        try {
            String description = iSBannerSize.getDescription();
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 == 4) {
                                jSONObject.put("bannerAdSize", 6);
                                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                            }
                        } else {
                            jSONObject.put("bannerAdSize", 5);
                        }
                    } else {
                        jSONObject.put("bannerAdSize", 3);
                    }
                } else {
                    jSONObject.put("bannerAdSize", 2);
                }
            } else {
                jSONObject.put("bannerAdSize", 1);
            }
            if (iSBannerSize.isAdaptive()) {
                String str = "Adaptive=true";
                if (jSONObject.has(IronSourceConstants.EVENTS_EXT1)) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , Adaptive=true";
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e10));
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f);
            return;
        }
        this.f24962q = str2;
        this.f24963r = i11;
        this.f24961p = null;
        n();
        e(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}});
        g(this.f == f.FIRST_AUCTION ? f.LOADING : f.RELOADING);
        e();
    }

    @Override // com.ironsource.mediationsdk.U
    public final void b(V v3) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v3.p());
        if (p()) {
            C1424n.a().b(this.f25810d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        f(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, v3.m());
    }

    @Override // com.ironsource.mediationsdk.U
    public final void c(V v3) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v3.p());
        if (p()) {
            C1424n.a().a(this.f25810d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        f(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, v3.m());
    }

    @Override // com.ironsource.mediationsdk.U
    public final void d(V v3) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v3.p());
        if (p()) {
            C1424n.a().c(this.f25810d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        f(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, v3.m());
    }

    public final void e(int i10, Object[][] objArr) {
        f(i10, objArr, this.f24958l);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075 A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0012, B:8:0x0015, B:10:0x0019, B:11:0x0022, B:13:0x002f, B:14:0x0036, B:16:0x003a, B:18:0x0040, B:42:0x0075, B:44:0x0084, B:46:0x008d, B:48:0x0091), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0012, B:8:0x0015, B:10:0x0019, B:11:0x0022, B:13:0x002f, B:14:0x0036, B:16:0x003a, B:18:0x0040, B:42:0x0075, B:44:0x0084, B:46:0x008d, B:48:0x0091), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r7, java.lang.Object[][] r8, int r9) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r0, r1, r1)
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r6.f24954h     // Catch: java.lang.Exception -> La1
            if (r3 == 0) goto Lf
            com.ironsource.mediationsdk.ISBannerSize r3 = r3.getSize()     // Catch: java.lang.Exception -> La1
            goto L10
        Lf:
            r3 = 0
        L10:
            if (r3 == 0) goto L15
            j(r2, r3)     // Catch: java.lang.Exception -> La1
        L15:
            com.ironsource.mediationsdk.model.i r3 = r6.f24955i     // Catch: java.lang.Exception -> La1
            if (r3 == 0) goto L22
            java.lang.String r3 = "placement"
            java.lang.String r4 = r6.q()     // Catch: java.lang.Exception -> La1
            r2.put(r3, r4)     // Catch: java.lang.Exception -> La1
        L22:
            java.lang.String r3 = "sessionDepth"
            r2.put(r3, r9)     // Catch: java.lang.Exception -> La1
            java.lang.String r9 = r6.o     // Catch: java.lang.Exception -> La1
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> La1
            if (r9 != 0) goto L36
            java.lang.String r9 = "auctionId"
            java.lang.String r3 = r6.o     // Catch: java.lang.Exception -> La1
            r2.put(r9, r3)     // Catch: java.lang.Exception -> La1
        L36:
            org.json.JSONObject r9 = r6.f24961p     // Catch: java.lang.Exception -> La1
            if (r9 == 0) goto L47
            int r9 = r9.length()     // Catch: java.lang.Exception -> La1
            if (r9 <= 0) goto L47
            java.lang.String r9 = "genericParams"
            org.json.JSONObject r3 = r6.f24961p     // Catch: java.lang.Exception -> La1
            r2.put(r9, r3)     // Catch: java.lang.Exception -> La1
        L47:
            r9 = 3201(0xc81, float:4.486E-42)
            if (r7 == r9) goto L72
            r9 = 3110(0xc26, float:4.358E-42)
            if (r7 == r9) goto L72
            r9 = 3111(0xc27, float:4.36E-42)
            if (r7 == r9) goto L72
            r9 = 3116(0xc2c, float:4.366E-42)
            if (r7 == r9) goto L72
            r9 = 3119(0xc2f, float:4.37E-42)
            if (r7 == r9) goto L72
            r9 = 3112(0xc28, float:4.361E-42)
            if (r7 == r9) goto L72
            r9 = 3115(0xc2b, float:4.365E-42)
            if (r7 == r9) goto L72
            r9 = 3501(0xdad, float:4.906E-42)
            if (r7 == r9) goto L72
            r9 = 3502(0xdae, float:4.907E-42)
            if (r7 == r9) goto L72
            r9 = 3506(0xdb2, float:4.913E-42)
            if (r7 != r9) goto L70
            goto L72
        L70:
            r9 = r0
            goto L73
        L72:
            r9 = r1
        L73:
            if (r9 == 0) goto L8b
            java.lang.String r9 = "auctionTrials"
            int r3 = r6.f24963r     // Catch: java.lang.Exception -> La1
            r2.put(r9, r3)     // Catch: java.lang.Exception -> La1
            java.lang.String r9 = r6.f24962q     // Catch: java.lang.Exception -> La1
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> La1
            if (r9 != 0) goto L8b
            java.lang.String r9 = "auctionFallback"
            java.lang.String r3 = r6.f24962q     // Catch: java.lang.Exception -> La1
            r2.put(r9, r3)     // Catch: java.lang.Exception -> La1
        L8b:
            if (r8 == 0) goto Lab
            int r9 = r8.length     // Catch: java.lang.Exception -> La1
            r3 = r0
        L8f:
            if (r3 >= r9) goto Lab
            r4 = r8[r3]     // Catch: java.lang.Exception -> La1
            r5 = r4[r0]     // Catch: java.lang.Exception -> La1
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> La1
            r4 = r4[r1]     // Catch: java.lang.Exception -> La1
            r2.put(r5, r4)     // Catch: java.lang.Exception -> La1
            int r3 = r3 + 1
            goto L8f
        La1:
            r8 = move-exception
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            r9.error(r8)
        Lab:
            com.ironsource.mediationsdk.a.c r8 = new com.ironsource.mediationsdk.a.c
            r8.<init>(r7, r2)
            com.ironsource.mediationsdk.a.d r7 = com.ironsource.mediationsdk.a.d.d()
            r7.b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.T.f(int, java.lang.Object[][], int):void");
    }

    public final void g(f fVar) {
        IronLog.INTERNAL.verbose("from '" + this.f + "' to '" + fVar + "'");
        synchronized (this.y) {
            this.f = fVar;
        }
    }

    public final void h(V v3, com.ironsource.mediationsdk.c.b bVar) {
        C1420h.a(bVar, v3.i(), this.f24965t, q());
        b(this.f24967v.get(v3.k()), q());
    }

    public final void i(Map<String, Object> map, List<String> list, StringBuilder sb2) {
        ISBannerSize iSBannerSize;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((Object) sb2));
        if (map.size() == 0 && list.size() == 0) {
            e(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}});
            if (k(f.AUCTION, f.LOADED)) {
                this.f24953g.a(TimeUnit.SECONDS.toMillis(this.f24952e.g()));
                return;
            }
            C1425o.a().a(this.f24954h, new IronSourceError(1005, "No candidates available for auctioning"), false);
            e(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
            g(f.READY_TO_LOAD);
            return;
        }
        e(IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}});
        C1420h c1420h = this.f24964s;
        if (c1420h != null) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            C1421j c1421j = this.f24966u;
            int i10 = this.f24958l;
            IronSourceSegment ironSourceSegment = this.f25809c;
            IronSourceBannerLayout ironSourceBannerLayout = this.f24954h;
            if (ironSourceBannerLayout != null && ironSourceBannerLayout.getSize() != null) {
                if (this.f24954h.getSize().isSmart()) {
                    if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getCurrentActiveActivity())) {
                        iSBannerSize = ISBannerSize.f24801e;
                    } else {
                        iSBannerSize = ISBannerSize.BANNER;
                    }
                } else {
                    iSBannerSize = this.f24954h.getSize();
                }
            } else {
                iSBannerSize = null;
            }
            c1420h.a(applicationContext, map, list, c1421j, i10, ironSourceSegment, iSBannerSize);
            return;
        }
        ironLog.error("mAuctionHandler is null");
    }

    public final boolean k(f fVar, f fVar2) {
        boolean z10;
        synchronized (this.y) {
            try {
                if (this.f == fVar) {
                    IronLog.INTERNAL.verbose("set state from '" + this.f + "' to '" + fVar2 + "'");
                    this.f = fVar2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public final void l(boolean z10) {
        f fVar;
        int i10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f);
        com.ironsource.mediationsdk.utils.k kVar = this.f24952e;
        if (kVar.c()) {
            if (z10) {
                fVar = f.AUCTION;
            } else {
                fVar = f.FIRST_AUCTION;
            }
        } else if (z10) {
            fVar = f.RELOADING;
        } else {
            fVar = f.LOADING;
        }
        if (k(f.STARTED_LOADING, fVar)) {
            this.f24970z = new com.ironsource.mediationsdk.utils.f();
            this.o = "";
            this.f24961p = null;
            this.f24956j = 0;
            this.f24958l = com.ironsource.mediationsdk.utils.o.a().b(3);
            if (z10) {
                i10 = IronSourceConstants.BN_RELOAD;
            } else {
                i10 = 3001;
            }
            e(i10, null);
            if (kVar.c()) {
                ironLog.verbose("");
                AsyncTask.execute(new g0(this));
                return;
            } else {
                n();
                e();
                return;
            }
        }
        ironLog.error("wrong state - " + this.f);
    }

    public final String m(List<com.ironsource.mediationsdk.c.b> list) {
        ConcurrentHashMap<String, V> concurrentHashMap;
        com.ironsource.mediationsdk.c.b bVar;
        int i10;
        StringBuilder sb2;
        int i11;
        String str;
        boolean z10;
        T t10 = this;
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        CopyOnWriteArrayList<V> copyOnWriteArrayList = t10.f24960n;
        copyOnWriteArrayList.clear();
        ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap2 = t10.f24967v;
        concurrentHashMap2.clear();
        ConcurrentHashMap<String, C1421j.a> concurrentHashMap3 = t10.f24968w;
        concurrentHashMap3.clear();
        StringBuilder sb3 = new StringBuilder();
        int i12 = 0;
        while (i12 < list.size()) {
            com.ironsource.mediationsdk.c.b bVar2 = list.get(i12);
            ConcurrentHashMap<String, V> concurrentHashMap4 = t10.f24959m;
            V v3 = concurrentHashMap4.get(bVar2.a());
            if (v3 != null) {
                C1416d a10 = C1416d.a();
                com.ironsource.mediationsdk.model.a aVar = v3.f25099b;
                AbstractAdapter a11 = a10.a(aVar.f25630a);
                if (a11 != null) {
                    com.ironsource.mediationsdk.utils.k kVar = t10.f24952e;
                    NetworkSettings networkSettings = aVar.f25630a;
                    int i13 = t10.f24958l;
                    String str2 = t10.o;
                    JSONObject jSONObject = t10.f24961p;
                    int i14 = t10.f24963r;
                    String str3 = t10.f24962q;
                    f fVar = t10.f;
                    if (fVar != f.RELOADING && fVar != f.AUCTION) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    sb2 = sb3;
                    concurrentHashMap = concurrentHashMap4;
                    i10 = i12;
                    V v10 = new V(kVar, this, networkSettings, a11, i13, str2, jSONObject, i14, str3, z10);
                    v10.f25100c = true;
                    copyOnWriteArrayList.add(v10);
                    bVar = bVar2;
                    concurrentHashMap2.put(v10.k(), bVar);
                    concurrentHashMap3.put(bVar.a(), C1421j.a.ISAuctionPerformanceDidntAttemptToLoad);
                    i11 = 1;
                } else {
                    concurrentHashMap = concurrentHashMap4;
                    bVar = bVar2;
                    i10 = i12;
                    sb2 = sb3;
                    i11 = 1;
                }
            } else {
                concurrentHashMap = concurrentHashMap4;
                bVar = bVar2;
                i10 = i12;
                sb2 = sb3;
                i11 = 1;
                IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + bVar.a());
            }
            V v11 = concurrentHashMap.get(bVar.a());
            if (v11 == null ? TextUtils.isEmpty(bVar.b()) : !v11.g()) {
                str = "1";
            } else {
                str = "2";
            }
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
            j10.append(bVar.a());
            StringBuilder sb4 = sb2;
            sb4.append(j10.toString());
            int size = list.size() - i11;
            int i15 = i10;
            if (i15 != size) {
                sb4.append(",");
            }
            i12 = i15 + 1;
            t10 = this;
            sb3 = sb4;
        }
        StringBuilder sb5 = sb3;
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb5.toString());
        return sb5.toString();
    }

    public final void n() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (V v3 : this.f24959m.values()) {
            if (!v3.g() && !com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), q())) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.c.b(v3.k()));
            }
        }
        this.o = s.d();
        m(copyOnWriteArrayList);
    }

    public final void o(V v3) {
        Iterator<V> it = this.f24960n.iterator();
        while (it.hasNext()) {
            V next = it.next();
            if (!next.equals(v3)) {
                next.c();
            }
        }
    }

    public final boolean p() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f24954h;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            return true;
        }
        return false;
    }

    public final String q() {
        com.ironsource.mediationsdk.model.i iVar = this.f24955i;
        if (iVar != null) {
            return iVar.getPlacementName();
        }
        return "";
    }

    public final boolean r() {
        boolean z10;
        synchronized (this.y) {
            f fVar = this.f;
            if (fVar != f.FIRST_AUCTION && fVar != f.AUCTION) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.model.i iVar) {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        this.f25808b.a(IronSource.AD_UNIT.BANNER, false);
        a_();
        if (!k(f.READY_TO_LOAD, f.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
            return;
        }
        if (C1425o.a().b()) {
            ironLog.verbose("can't load banner - already has pending invocation");
            return;
        }
        a aVar = new a(iVar, ironSourceBannerLayout);
        if ((ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true) {
            str = null;
        } else {
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            str = String.format("can't load banner - %s", objArr);
        }
        if (iVar == null || TextUtils.isEmpty(iVar.getPlacementName())) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = iVar == null ? "placement is null" : "placement name is empty";
            str = String.format("can't load banner - %s", objArr2);
        }
        if (TextUtils.isEmpty(str)) {
            aVar.a();
        } else {
            ironLog.error(str);
            aVar.a(str);
        }
    }

    public final void e() {
        int i10 = this.f24956j;
        while (true) {
            CopyOnWriteArrayList<V> copyOnWriteArrayList = this.f24960n;
            String str = null;
            if (i10 >= copyOnWriteArrayList.size()) {
                String str2 = copyOnWriteArrayList.isEmpty() ? "Empty waterfall" : "Mediation No fill";
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("errorReason = ".concat(str2));
                o(null);
                f fVar = f.LOADING;
                f fVar2 = f.READY_TO_LOAD;
                if (k(fVar, fVar2)) {
                    e(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{"reason", str2}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f24970z))}});
                    C1425o.a().a(this.f24954h, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str2), false);
                    return;
                } else if (k(f.RELOADING, f.LOADED)) {
                    e(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f24970z))}});
                    C1425o.a().a(this.f24954h, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str2), true);
                    this.f24953g.a(TimeUnit.SECONDS.toMillis(this.f24952e.g()));
                    return;
                } else {
                    g(fVar2);
                    ironLog.error("wrong state = " + this.f);
                    return;
                }
            }
            V v3 = copyOnWriteArrayList.get(i10);
            if (v3.f25100c) {
                IronLog.INTERNAL.verbose("loading smash - " + v3.p());
                this.f24956j = i10 + 1;
                IronSourceBannerLayout ironSourceBannerLayout = this.f24954h;
                if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
                    return;
                }
                boolean g6 = v3.g();
                ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap = this.f24967v;
                if (g6) {
                    str = concurrentHashMap.get(v3.k()).b();
                    v3.a(str);
                }
                v3.a(this.f24954h.a(), this.f24955i, str, concurrentHashMap.get(v3.k()).c());
                return;
            }
            i10++;
        }
    }

    /* loaded from: classes2.dex */
    public class a implements C1428r.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.mediationsdk.model.i f24971a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceBannerLayout f24972b;

        public a(com.ironsource.mediationsdk.model.i iVar, IronSourceBannerLayout ironSourceBannerLayout) {
            this.f24971a = iVar;
            this.f24972b = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.C1428r.a
        public final void a() {
            IronLog ironLog = IronLog.INTERNAL;
            StringBuilder sb2 = new StringBuilder("placement = ");
            com.ironsource.mediationsdk.model.i iVar = this.f24971a;
            sb2.append(iVar.getPlacementName());
            ironLog.verbose(sb2.toString());
            T t10 = T.this;
            IronSourceBannerLayout ironSourceBannerLayout = this.f24972b;
            t10.f24954h = ironSourceBannerLayout;
            t10.f24955i = iVar;
            if (com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), iVar.getPlacementName())) {
                ironLog.verbose("placement is capped");
                C1425o.a().a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + iVar.getPlacementName() + " is capped"), false);
                t10.e(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
                t10.g(f.READY_TO_LOAD);
                return;
            }
            t10.l(false);
        }

        @Override // com.ironsource.mediationsdk.C1428r.a
        public final void a(String str) {
            IronLog.API.error("can't load banner - errorMessage = " + str);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements C1428r.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceBannerLayout f24974a;

        public b(IronSourceBannerLayout ironSourceBannerLayout) {
            this.f24974a = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.C1428r.a
        public final void a() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("destroying banner");
            T t10 = T.this;
            com.ironsource.lifecycle.a.a aVar = t10.f24953g;
            aVar.a();
            aVar.f24704a.b(aVar.f24706c);
            aVar.f24705b.b();
            V v3 = t10.f24957k;
            t10.f(IronSourceConstants.BN_DESTROY, null, v3 != null ? v3.m() : t10.f24958l);
            if (t10.f24957k != null) {
                ironLog.verbose("mActiveSmash = " + t10.f24957k.p());
                t10.f24957k.a();
                t10.f24957k = null;
            }
            IronSourceBannerLayout ironSourceBannerLayout = this.f24974a;
            ironSourceBannerLayout.f24820w = true;
            ironSourceBannerLayout.f24819v = null;
            ironSourceBannerLayout.f24817t = null;
            ironSourceBannerLayout.f24818u = null;
            ironSourceBannerLayout.f24816s = null;
            ironSourceBannerLayout.y = null;
            ironSourceBannerLayout.removeBannerListener();
            t10.f24954h = null;
            t10.f24955i = null;
            t10.g(f.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.C1428r.a
        public final void a(String str) {
            IronLog.API.error("destroy banner failed - errorMessage = " + str);
        }
    }

    @Override // com.ironsource.mediationsdk.U
    public final void e(V v3) {
        boolean z10;
        Object[][] objArr;
        int i10;
        com.ironsource.mediationsdk.c.b bVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(v3.p());
        synchronized (this.y) {
            z10 = this.f == f.LOADED;
        }
        if (z10) {
            if (this.f24952e.c() && this.f24952e.h().f25905t && (bVar = this.f24967v.get(v3.k())) != null) {
                h(v3, bVar);
            }
            i10 = IronSourceConstants.BN_CALLBACK_SHOW;
            objArr = null;
        } else {
            ironLog.warning("wrong state - mCurrentState = " + this.f);
            String k10 = v3.k();
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.f}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}};
            i10 = IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE;
        }
        e(i10, objArr);
    }

    @Override // com.ironsource.mediationsdk.U
    public final void a(V v3) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v3.p());
        if (p()) {
            C1424n.a().d(this.f25810d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        f(IronSourceConstants.BN_CALLBACK_CLICK, objArr, v3.m());
    }

    @Override // com.ironsource.mediationsdk.U
    public final void a(V v3, View view, FrameLayout.LayoutParams layoutParams) {
        f fVar;
        boolean z10;
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + v3.p());
        String str = this.o;
        String str2 = v3.f24995m;
        if (str2 != str) {
            StringBuilder s10 = a3.l.s("invoked with auctionId: ", str2, " and the current id is ");
            s10.append(this.o);
            ironLog.error(s10.toString());
            Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            StringBuilder s11 = a3.l.s("Wrong auction id ", str2, " State - ");
            s11.append(this.f);
            v3.a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr2, new Object[]{"reason", s11.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, v3.k()}});
            return;
        }
        synchronized (this.y) {
            f fVar2 = this.f;
            fVar = f.LOADING;
            if (fVar2 != fVar && fVar2 != f.RELOADING) {
                z10 = false;
            }
            z10 = true;
        }
        if (!z10) {
            ironLog.warning("wrong state - mCurrentState = " + this.f);
            return;
        }
        V v10 = this.f24957k;
        if (v10 != null) {
            v10.c();
        }
        o(v3);
        this.f24957k = v3;
        IronSourceBannerLayout ironSourceBannerLayout = this.f24954h;
        if (ironSourceBannerLayout != null) {
            com.ironsource.environment.e.c.f24668a.b(new b0(ironSourceBannerLayout, view, layoutParams));
        }
        this.f24968w.put(v3.k(), C1421j.a.ISAuctionPerformanceShowedSuccessfully);
        com.ironsource.mediationsdk.utils.k kVar = this.f24952e;
        if (kVar.c()) {
            ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap = this.f24967v;
            com.ironsource.mediationsdk.c.b bVar = concurrentHashMap.get(v3.k());
            if (bVar != null) {
                a(bVar.b(q()));
                C1420h.a(bVar, v3.i(), this.f24965t);
                this.f24964s.a(this.f24960n, concurrentHashMap, v3.i(), this.f24965t, bVar);
                if (!kVar.h().f25905t) {
                    h(v3, bVar);
                }
            } else {
                String k10 = v3.k();
                StringBuilder s12 = a3.l.s("onLoadSuccess winner instance ", k10, " missing from waterfall. auctionId = ");
                s12.append(this.o);
                ironLog.error(s12.toString());
                e(IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}});
            }
        }
        if (this.f == fVar) {
            if (p()) {
                IronSourceBannerLayout ironSourceBannerLayout2 = this.f24954h;
                AdInfo adInfo = this.f25810d;
                ironSourceBannerLayout2.getClass();
                C1424n.a().a(adInfo, false);
                ironSourceBannerLayout2.f24821x = true;
                objArr = new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f24970z))}};
            } else {
                objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f24970z))}};
            }
            e(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, objArr);
        } else {
            if (p()) {
                IronSourceBannerLayout ironSourceBannerLayout3 = this.f24954h;
                AdInfo adInfo2 = this.f25810d;
                ironSourceBannerLayout3.getClass();
                C1424n.a().a(adInfo2, true);
                ironSourceBannerLayout3.f24821x = true;
            }
            IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
            e(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f24970z))}});
        }
        String q10 = q();
        com.ironsource.mediationsdk.utils.k.f(ContextProvider.getInstance().getCurrentActiveActivity(), q10);
        if (com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), q10)) {
            e(IronSourceConstants.BN_PLACEMENT_CAPPED, null);
        }
        com.ironsource.mediationsdk.utils.o.a().a(3);
        g(f.LOADED);
        this.f24953g.a(TimeUnit.SECONDS.toMillis(kVar.g()));
    }

    @Override // com.ironsource.mediationsdk.U
    public final void a(IronSourceError ironSourceError, V v3) {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (v3.f24995m != this.o) {
            StringBuilder sb2 = new StringBuilder("invoked with auctionId: ");
            String str = v3.f24995m;
            sb2.append(str);
            sb2.append(" and the current id is ");
            sb2.append(this.o);
            ironLog.error(sb2.toString());
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 3};
            StringBuilder s10 = a3.l.s("Wrong auction ", str, " State - ");
            s10.append(this.f);
            v3.a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", s10.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, v3.k()}});
            return;
        }
        synchronized (this.y) {
            f fVar = this.f;
            z10 = fVar == f.LOADING || fVar == f.RELOADING;
        }
        if (z10) {
            this.f24968w.put(v3.k(), C1421j.a.ISAuctionPerformanceFailedToLoad);
            e();
        } else {
            ironLog.warning("wrong state - mCurrentState = " + this.f);
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1419g
    public final void a(List<com.ironsource.mediationsdk.c.b> list, String str, com.ironsource.mediationsdk.c.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f);
            return;
        }
        this.f24962q = "";
        this.o = str;
        this.f24963r = i10;
        this.f24965t = bVar;
        this.f24961p = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            e(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}});
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        c(ad_unit, jSONObject2);
        if (!this.f25808b.a(ad_unit)) {
            e(IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            g(this.f == f.FIRST_AUCTION ? f.LOADING : f.RELOADING);
            e(IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, m(list)}});
            e();
            return;
        }
        e(IronSourceConstants.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
        f fVar = this.f;
        g(f.READY_TO_LOAD);
        if (fVar == f.FIRST_AUCTION) {
            C1425o.a().a(this.f24954h, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"), false);
        }
    }

    @Override // com.ironsource.mediationsdk.IronSourceBannerLayout.a
    public void a(boolean z10) {
        if (z10) {
            IronLog.INTERNAL.verbose("troubleshoot event - check if the banner is visible and has focus");
            e(IronSourceConstants.TROUBLESHOOTING_BN_LAYOUT_VISIBLE_LISTENER, null);
            this.f24954h.setWindowFocusChangedListener(null);
        }
    }
}
