package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1427q;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1426p implements a {

    /* renamed from: a, reason: collision with root package name */
    public C1427q f25769a;

    /* renamed from: b, reason: collision with root package name */
    public IronSourceBannerLayout f25770b;

    /* renamed from: c, reason: collision with root package name */
    public com.ironsource.mediationsdk.model.i f25771c;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f25774g;

    /* renamed from: i, reason: collision with root package name */
    public final long f25776i;

    /* renamed from: j, reason: collision with root package name */
    public Timer f25777j;

    /* renamed from: k, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.f f25778k;

    /* renamed from: l, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.f f25779l;

    /* renamed from: m, reason: collision with root package name */
    public int f25780m;

    /* renamed from: n, reason: collision with root package name */
    public int f25781n;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList<C1427q> f25775h = new CopyOnWriteArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final IronSourceLoggerManager f25773e = IronSourceLoggerManager.getLogger();

    /* renamed from: d, reason: collision with root package name */
    public c f25772d = c.NOT_INITIATED;

    /* renamed from: com.ironsource.mediationsdk.p$b */
    /* loaded from: classes2.dex */
    public class b extends TimerTask {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
        @Override // java.util.TimerTask, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C1426p.b.run():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.p$c */
    /* loaded from: classes2.dex */
    public enum c {
        NOT_INITIATED,
        READY_TO_LOAD,
        FIRST_LOAD_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        RELOAD_IN_PROGRESS
    }

    public C1426p(List<NetworkSettings> list, String str, String str2, long j10, int i10, int i11) {
        new AtomicBoolean();
        new AtomicBoolean();
        this.f = str;
        this.f25774g = str2;
        this.f25776i = i10;
        C1425o.a().f25762c = i11;
        for (int i12 = 0; i12 < list.size(); i12++) {
            NetworkSettings networkSettings = list.get(i12);
            AbstractAdapter a10 = C1416d.a().a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a10 != null && C1417e.a().a(a10)) {
                this.f25775h.add(new C1427q(this, networkSettings, a10, j10, i12 + 1));
            } else {
                f(networkSettings.getProviderInstanceName() + " can't load adapter or wrong version");
            }
        }
        this.f25771c = null;
        e(c.READY_TO_LOAD);
    }

    public final void a(int i10, C1427q c1427q, Object[][] objArr) {
        b(i10, c1427q, objArr, this.f25781n);
    }

    public final void b(int i10, C1427q c1427q, Object[][] objArr, int i11) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(c1427q);
        try {
            IronSourceBannerLayout ironSourceBannerLayout = this.f25770b;
            if (ironSourceBannerLayout != null) {
                g(providerAdditionalData, ironSourceBannerLayout.getSize());
            }
            com.ironsource.mediationsdk.model.i iVar = this.f25771c;
            if (iVar != null) {
                providerAdditionalData.put("placement", iVar.getPlacementName());
            }
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i11);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e10) {
            this.f25773e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e10), 3);
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, providerAdditionalData));
    }

    public final void c(int i10, Object[][] objArr) {
        d(i10, objArr, this.f25781n);
    }

    public final void d(int i10, Object[][] objArr, int i11) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            IronSourceBannerLayout ironSourceBannerLayout = this.f25770b;
            if (ironSourceBannerLayout != null) {
                g(mediationAdditionalData, ironSourceBannerLayout.getSize());
            }
            com.ironsource.mediationsdk.model.i iVar = this.f25771c;
            if (iVar != null) {
                mediationAdditionalData.put("placement", iVar.getPlacementName());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i11);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e10) {
            this.f25773e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendMediationEvent " + Log.getStackTraceString(e10), 3);
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, mediationAdditionalData));
    }

    public final void e(c cVar) {
        this.f25772d = cVar;
        f("state=" + cVar.name());
    }

    public final void f(String str) {
        this.f25773e.log(IronSourceLogger.IronSourceTag.INTERNAL, "BannerManager " + str, 0);
    }

    public final void g(JSONObject jSONObject, ISBannerSize iSBannerSize) {
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
                                return;
                            }
                            return;
                        }
                        jSONObject.put("bannerAdSize", 5);
                        return;
                    }
                    jSONObject.put("bannerAdSize", 3);
                    return;
                }
                jSONObject.put("bannerAdSize", 2);
                return;
            }
            jSONObject.put("bannerAdSize", 1);
        } catch (Exception e10) {
            this.f25773e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e10), 3);
        }
    }

    public final boolean h() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f25770b;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            return true;
        }
        return false;
    }

    public final void i(C1427q c1427q, View view, FrameLayout.LayoutParams layoutParams, boolean z10) {
        IronLog.INTERNAL.info("bindView = " + z10 + " smash - " + c1427q.a());
        a(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, c1427q, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25779l))}});
        c(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25778k))}});
        this.f25780m = com.ironsource.mediationsdk.utils.o.a().b(3);
        com.ironsource.mediationsdk.utils.o.a().a(3);
        if (z10) {
            this.f25769a = c1427q;
            IronSourceBannerLayout ironSourceBannerLayout = this.f25770b;
            ironSourceBannerLayout.getClass();
            com.ironsource.environment.e.c.f24668a.b(new b0(ironSourceBannerLayout, view, layoutParams));
        }
        k();
    }

    public final boolean j() {
        int i10;
        Iterator<C1427q> it = this.f25775h.iterator();
        while (it.hasNext()) {
            C1427q next = it.next();
            if (next.f25796h && this.f25769a != next) {
                if (this.f25772d == c.FIRST_LOAD_IN_PROGRESS) {
                    i10 = 3002;
                } else {
                    i10 = IronSourceConstants.BN_INSTANCE_RELOAD;
                }
                a(i10, next, (Object[][]) null);
                this.f25779l = new com.ironsource.mediationsdk.utils.f();
                next.a(this.f25770b.a(), this.f, this.f25774g);
                return true;
            }
        }
        return false;
    }

    public final void k() {
        try {
            Timer timer = this.f25777j;
            if (timer != null) {
                timer.cancel();
                this.f25777j = null;
            }
            long j10 = this.f25776i;
            if (j10 > 0) {
                Timer timer2 = new Timer();
                this.f25777j = timer2;
                timer2.schedule(new b(), j10 * 1000);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout == null) {
            this.f25773e.log(IronSourceLogger.IronSourceTag.API, "destroyBanner banner cannot be null", 3);
            return;
        }
        if (ironSourceBannerLayout.isDestroyed()) {
            this.f25773e.log(IronSourceLogger.IronSourceTag.API, "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API", 3);
            return;
        }
        d(IronSourceConstants.BN_DESTROY, null, this.f25780m);
        Timer timer = this.f25777j;
        if (timer != null) {
            timer.cancel();
            this.f25777j = null;
        }
        C1427q c1427q = this.f25769a;
        if (c1427q != null) {
            a(IronSourceConstants.BN_INSTANCE_DESTROY, c1427q, (Object[][]) null);
            C1427q c1427q2 = this.f25769a;
            c1427q2.c("destroyBanner()");
            AbstractAdapter abstractAdapter = c1427q2.f25790a;
            if (abstractAdapter == null) {
                c1427q2.c("destroyBanner() mAdapter == null");
            } else {
                abstractAdapter.destroyBanner(c1427q2.f25791b.getBannerSettings());
                c1427q2.b(C1427q.a.DESTROYED);
            }
            this.f25769a = null;
        }
        ironSourceBannerLayout.f24820w = true;
        ironSourceBannerLayout.f24819v = null;
        ironSourceBannerLayout.f24817t = null;
        ironSourceBannerLayout.f24818u = null;
        ironSourceBannerLayout.f24816s = null;
        ironSourceBannerLayout.y = null;
        ironSourceBannerLayout.removeBannerListener();
        this.f25770b = null;
        this.f25771c = null;
        e(c.READY_TO_LOAD);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void b(IronSourceError ironSourceError, C1427q c1427q, boolean z10) {
        IronLog.INTERNAL.info("error = " + ironSourceError.getErrorMessage() + " smash - " + c1427q.a());
        if (this.f25772d != c.RELOAD_IN_PROGRESS) {
            f("onBannerAdReloadFailed " + c1427q.a() + " wrong state=" + this.f25772d.name());
            return;
        }
        if (z10) {
            a(IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, c1427q, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25779l))}});
        } else {
            a(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, c1427q, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25779l))}});
        }
        CopyOnWriteArrayList<C1427q> copyOnWriteArrayList = this.f25775h;
        if (copyOnWriteArrayList.size() == 1) {
            c(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25778k))}});
            k();
            return;
        }
        e(c.LOAD_IN_PROGRESS);
        Iterator<C1427q> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().f25796h = true;
        }
        j();
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void c(C1427q c1427q) {
        Object[][] objArr;
        IronLog.INTERNAL.info("smash - " + c1427q.a());
        if (h()) {
            objArr = null;
            C1424n.a().a(null);
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        d(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, this.f25780m);
        b(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, c1427q, objArr, this.f25780m);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void d(C1427q c1427q) {
        Object[][] objArr;
        IronLog.INTERNAL.info("smash - " + c1427q.a());
        if (h()) {
            objArr = null;
            C1424n.a().c(null);
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        d(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, this.f25780m);
        b(IronSourceConstants.BN_INSTANCE_LEAVE_APP, c1427q, objArr, this.f25780m);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void e(C1427q c1427q) {
        IronLog.INTERNAL.info("smash - " + c1427q.a());
        c(IronSourceConstants.BN_CALLBACK_SHOW, null);
        a(IronSourceConstants.BN_INSTANCE_SHOW, c1427q, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void b(C1427q c1427q) {
        Object[][] objArr;
        IronLog.INTERNAL.info("smash - " + c1427q.a());
        if (h()) {
            objArr = null;
            C1424n.a().b(null);
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        d(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, this.f25780m);
        b(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, c1427q, objArr, this.f25780m);
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.model.i iVar) {
        if (ironSourceBannerLayout != null) {
            try {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    if (iVar != null && !TextUtils.isEmpty(iVar.getPlacementName())) {
                        c cVar = this.f25772d;
                        c cVar2 = c.READY_TO_LOAD;
                        if (cVar == cVar2 && !C1425o.a().b()) {
                            this.f25781n = com.ironsource.mediationsdk.utils.o.a().b(3);
                            e(c.FIRST_LOAD_IN_PROGRESS);
                            this.f25770b = ironSourceBannerLayout;
                            this.f25771c = iVar;
                            c(3001, null);
                            if (com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), iVar.getPlacementName())) {
                                C1425o.a().a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + iVar.getPlacementName() + " is capped"));
                                c(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
                                e(cVar2);
                                return;
                            }
                            this.f25778k = new com.ironsource.mediationsdk.utils.f();
                            Iterator<C1427q> it = this.f25775h.iterator();
                            while (it.hasNext()) {
                                it.next().f25796h = true;
                            }
                            this.f25779l = new com.ironsource.mediationsdk.utils.f();
                            C1427q c1427q = this.f25775h.get(0);
                            a(3002, c1427q, (Object[][]) null);
                            c1427q.a(ironSourceBannerLayout.a(), this.f, this.f25774g);
                            return;
                        }
                        this.f25773e.log(IronSourceLogger.IronSourceTag.API, "A banner is already loaded", 3);
                        return;
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = iVar == null ? "placement is null" : "placement name is empty";
                    this.f25773e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr), 3);
                    return;
                }
            } catch (Exception e10) {
                C1425o.a().a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, "loadBanner() failed " + e10.getMessage()), false);
                c(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_EXCEPTION)}, new Object[]{"reason", e10.getMessage()}});
                e(c.READY_TO_LOAD);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        this.f25773e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr2), 3);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(IronSourceError ironSourceError, C1427q c1427q, boolean z10) {
        IronLog.INTERNAL.info("error = " + ironSourceError.getErrorMessage() + " smash - " + c1427q.a());
        c cVar = this.f25772d;
        c cVar2 = c.FIRST_LOAD_IN_PROGRESS;
        if (cVar != cVar2 && cVar != c.LOAD_IN_PROGRESS) {
            f("onBannerAdLoadFailed " + c1427q.a() + " wrong state=" + this.f25772d.name());
            return;
        }
        if (z10) {
            a(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, c1427q, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25779l))}});
        } else {
            a(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, c1427q, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25779l))}});
        }
        if (j()) {
            return;
        }
        if (this.f25772d == cVar2) {
            C1425o.a().a(this.f25770b, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, "No ads to show"), false);
            c(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25778k))}});
            e(c.READY_TO_LOAD);
        } else {
            c(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25778k))}});
            e(c.RELOAD_IN_PROGRESS);
            k();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C1427q c1427q) {
        Object[][] objArr;
        IronLog.INTERNAL.info("smash - " + c1427q.a());
        if (h()) {
            objArr = null;
            C1424n.a().d(null);
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        d(IronSourceConstants.BN_CALLBACK_CLICK, objArr, this.f25780m);
        b(IronSourceConstants.BN_INSTANCE_CLICK, c1427q, objArr, this.f25780m);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C1427q c1427q, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.info("smash - " + c1427q.a());
        c cVar = this.f25772d;
        if (cVar != c.FIRST_LOAD_IN_PROGRESS) {
            if (cVar != c.LOAD_IN_PROGRESS) {
                a(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, c1427q, (Object[][]) null);
                return;
            } else {
                e(c.RELOAD_IN_PROGRESS);
                i(c1427q, view, layoutParams, true);
                return;
            }
        }
        a(3005, c1427q, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25779l))}});
        this.f25769a = c1427q;
        IronSourceBannerLayout ironSourceBannerLayout = this.f25770b;
        ironSourceBannerLayout.getClass();
        com.ironsource.environment.e.c.f24668a.b(new b0(ironSourceBannerLayout, view, layoutParams));
        com.ironsource.mediationsdk.model.i iVar = this.f25771c;
        String placementName = iVar != null ? iVar.getPlacementName() : "";
        com.ironsource.mediationsdk.utils.k.f(ContextProvider.getInstance().getCurrentActiveActivity(), placementName);
        if (com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), placementName)) {
            c(IronSourceConstants.BN_PLACEMENT_CAPPED, null);
        }
        c(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f25778k))}});
        IronSourceBannerLayout ironSourceBannerLayout2 = this.f25770b;
        ironSourceBannerLayout2.getClass();
        C1424n.a().a((AdInfo) null, false);
        ironSourceBannerLayout2.f24821x = true;
        this.f25780m = com.ironsource.mediationsdk.utils.o.a().b(3);
        com.ironsource.mediationsdk.utils.o.a().a(3);
        e(c.RELOAD_IN_PROGRESS);
        k();
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C1427q c1427q, View view, FrameLayout.LayoutParams layoutParams, boolean z10) {
        IronLog.INTERNAL.info("smash - " + c1427q.a());
        if (this.f25772d == c.RELOAD_IN_PROGRESS) {
            IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
            i(c1427q, view, layoutParams, z10);
            return;
        }
        f("onBannerAdReloaded " + c1427q.a() + " wrong state=" + this.f25772d.name());
        a(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, c1427q, (Object[][]) null);
    }
}
