package com.huawei.hms.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.jg;
import com.huawei.hms.ads.reward.RewardVerifyConfig;
import com.huawei.hms.ads.splash.R;
import com.huawei.hms.ads.splash.SplashAdDisplayListener;
import com.huawei.hms.ads.splash.SplashView;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.hms.ads.uiengine.d;
import com.huawei.openalliance.ad.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.beans.inner.SplashAdReqParam;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.views.PPSSplashView;
import gb.c0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class fo implements fs {
    protected AdContentData B;
    protected ec C;
    private jn G;
    protected WeakReference<kc> I;
    protected AdContentData L;
    protected com.huawei.openalliance.ad.constant.b Z;

    /* renamed from: b, reason: collision with root package name */
    protected RewardVerifyConfig f21664b;

    /* renamed from: c, reason: collision with root package name */
    protected int f21665c;

    /* renamed from: d, reason: collision with root package name */
    protected String f21666d;

    /* renamed from: e, reason: collision with root package name */
    protected Context f21667e;

    /* renamed from: i, reason: collision with root package name */
    private WeakReference<ka> f21669i;

    /* renamed from: j, reason: collision with root package name */
    private ga.b f21670j;

    /* renamed from: k, reason: collision with root package name */
    private SplashView.SplashAdLoadListener f21671k;

    /* renamed from: t, reason: collision with root package name */
    private ga.a f21679t;

    /* renamed from: u, reason: collision with root package name */
    private SplashAdDisplayListener f21680u;

    /* renamed from: v, reason: collision with root package name */
    private CountDownTimer f21681v;

    /* renamed from: w, reason: collision with root package name */
    private String f21682w;

    /* renamed from: h, reason: collision with root package name */
    private ha f21668h = new go();

    /* renamed from: l, reason: collision with root package name */
    private boolean f21672l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21673m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21674n = false;
    protected boolean S = false;
    private boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    private final String f21675p = "load_timeout_" + hashCode();

    /* renamed from: q, reason: collision with root package name */
    private boolean f21676q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f21677r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21678s = false;

    /* renamed from: x, reason: collision with root package name */
    private long f21683x = 0;
    private long y = -1;
    protected long F = 0;

    /* renamed from: z, reason: collision with root package name */
    private int f21684z = 0;
    protected boolean D = false;

    /* renamed from: a, reason: collision with root package name */
    protected DelayInfo f21663a = new DelayInfo();
    private boolean A = false;
    private boolean E = false;

    /* renamed from: com.huawei.hms.ads.fo$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements RemoteCallResultCallback<String> {
        final /* synthetic */ int Code;

        public AnonymousClass2(int i10) {
            this.Code = i10;
        }

        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public void onRemoteCallResult(String str, final CallResult<String> callResult) {
            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.fo.2.1
                @Override // java.lang.Runnable
                public void run() {
                    fo.this.f21666d = (String) callResult.getData();
                    final AdContentData adContentData = (AdContentData) gb.b.o(AdContentData.class, (String) callResult.getData(), new Class[0]);
                    if (adContentData != null) {
                        fo.this.F = System.currentTimeMillis();
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        fo.this.S(anonymousClass2.Code);
                        fo.this.B = adContentData;
                        c0.c(new Runnable() { // from class: com.huawei.hms.ads.fo.2.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                fo foVar = fo.this;
                                foVar.Code(foVar.f21667e, adContentData, anonymousClass22.Code);
                            }
                        });
                        if (!fo.this.V(adContentData)) {
                            fo.this.I(497);
                        } else {
                            return;
                        }
                    } else {
                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                        fo.this.I(anonymousClass22.Code);
                    }
                    fo.this.m();
                }
            });
        }
    }

    /* renamed from: com.huawei.hms.ads.fo$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements Runnable {
        final /* synthetic */ AdSlotParam Code;
        final /* synthetic */ SplashAdReqParam V;

        /* renamed from: com.huawei.hms.ads.fo$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 implements RemoteCallResultCallback<String> {

            /* renamed from: com.huawei.hms.ads.fo$4$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes2.dex */
            public class RunnableC02611 implements Runnable {
                final /* synthetic */ long Code;
                final /* synthetic */ CallResult V;

                public RunnableC02611(long j10, CallResult callResult) {
                    this.Code = j10;
                    this.V = callResult;
                }

                @Override // java.lang.Runnable
                public void run() {
                    fo.this.f21663a.w(System.currentTimeMillis() - this.Code);
                    fo.this.f21666d = (String) this.V.getData();
                    AdContentData adContentData = (AdContentData) gb.b.o(AdContentData.class, (String) this.V.getData(), new Class[0]);
                    if (adContentData != null) {
                        fo.this.f21682w = adContentData.E();
                    }
                    if (adContentData != null) {
                        fo.this.I(adContentData);
                    } else {
                        ha.i.e(fo.this.f21667e).d("getSpareSplashAd", String.valueOf(fo.this.C.I()), new RemoteCallResultCallback<String>() { // from class: com.huawei.hms.ads.fo.4.1.1.1
                            @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                            public void onRemoteCallResult(String str, final CallResult<String> callResult) {
                                gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.fo.4.1.1.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        fo.this.f21666d = (String) callResult.getData();
                                        AdContentData adContentData2 = (AdContentData) gb.b.o(AdContentData.class, (String) callResult.getData(), new Class[0]);
                                        if (adContentData2 != null) {
                                            fo.this.Code(adContentData2, 494);
                                        } else {
                                            fo.this.I((AdContentData) null);
                                        }
                                    }
                                });
                            }
                        }, String.class);
                    }
                }
            }

            public AnonymousClass1() {
            }

            @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
            public void onRemoteCallResult(String str, CallResult<String> callResult) {
                ex.V("AdMediator", "onDownloaded");
                fo foVar = fo.this;
                foVar.f21663a.r(foVar.f21683x, System.currentTimeMillis());
                synchronized (fo.this) {
                    ex.V("AdMediator", "onDownloaded, loadingTimeout:" + fo.this.f21672l);
                    fo foVar2 = fo.this;
                    if (!foVar2.S) {
                        foVar2.S = true;
                    }
                    if (callResult.getCode() != 200) {
                        fo.this.f21663a.J(Integer.valueOf(callResult.getCode()));
                    }
                    if (!fo.this.f21672l) {
                        fo.this.f21672l = true;
                        gb.w.d(fo.this.f21675p);
                        ex.V("AdMediator", "cancel loadTimeoutTask");
                        fo foVar3 = fo.this;
                        foVar3.f21663a.Q(foVar3.f21683x, System.currentTimeMillis());
                        gb.w.b(new RunnableC02611(System.currentTimeMillis(), callResult));
                    } else {
                        fo.this.f21663a.B(-2);
                        fo.this.o = true;
                    }
                    if (fo.this.o) {
                        fo.this.B((AdContentData) gb.b.o(AdContentData.class, callResult.getData(), new Class[0]));
                    }
                }
            }
        }

        public AnonymousClass4(AdSlotParam adSlotParam, SplashAdReqParam splashAdReqParam) {
            this.Code = adSlotParam;
            this.V = splashAdReqParam;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context = fo.this.f21667e;
            if (context == null) {
                return;
            }
            jd.Code(context, com.huawei.openalliance.ad.constant.w.cg, this.Code, gb.b.p(this.V), new AnonymousClass1(), String.class);
        }
    }

    /* renamed from: com.huawei.hms.ads.fo$5, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (fo.this) {
                ex.V("AdMediator", "on load task timeout, loadingTimeout: %s", Boolean.valueOf(fo.this.f21672l));
                if (!fo.this.f21672l) {
                    fo.this.f21672l = true;
                    ha.i.e(fo.this.f21667e).d("getSpareSplashAd", String.valueOf(fo.this.C.I()), new RemoteCallResultCallback<AdContentData>() { // from class: com.huawei.hms.ads.fo.5.1
                        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                        public void onRemoteCallResult(String str, final CallResult<AdContentData> callResult) {
                            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.fo.5.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AdContentData adContentData = (AdContentData) callResult.getData();
                                    if (adContentData != null) {
                                        fo.this.Code(adContentData, -2);
                                    } else {
                                        fo.this.I(-2);
                                        fo.this.f();
                                    }
                                }
                            });
                        }
                    }, AdContentData.class);
                }
            }
        }
    }

    public fo(ka kaVar) {
        this.f21669i = new WeakReference<>(kaVar);
        this.f21665c = kaVar.getAdType();
        Context applicationContext = kaVar.getContext().getApplicationContext();
        this.f21667e = applicationContext;
        this.C = ec.Code(applicationContext);
        n();
    }

    private void n() {
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.fo.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    fo foVar = fo.this;
                    foVar.G = new jn(foVar.f21667e);
                    fo.this.G.Code();
                    d V = g.V();
                    if (V != null) {
                        V.Code(fo.this.f21665c, (Bundle) null);
                    }
                } catch (Throwable th) {
                    ex.V("AdMediator", "inform err: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    private String o() {
        return gb.u.c(g());
    }

    private void p() {
        long j10 = this.y;
        if (j10 <= 0) {
            j10 = System.currentTimeMillis();
        }
        this.B.b0(j10);
    }

    private void q() {
        CountDownTimer countDownTimer = new CountDownTimer(2000L, 500L) { // from class: com.huawei.hms.ads.fo.7
            @Override // android.os.CountDownTimer
            public void onFinish() {
                ex.V("AdMediator", "onFinish");
                fo foVar = fo.this;
                if (foVar.Z != com.huawei.openalliance.ad.constant.b.LOADED) {
                    foVar.I(-10);
                    fo.this.m();
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                ex.Code("AdMediator", "onTick = %s", Long.valueOf(j10));
            }
        };
        this.f21681v = countDownTimer;
        countDownTimer.start();
    }

    private boolean r() {
        return this.f21676q;
    }

    private void s() {
        ex.Code("AdMediator", "onAdEnd");
        try {
            if (this.E) {
                ex.V("AdMediator", "already end");
                return;
            }
            ex.V("AdMediator", "onAdEnd");
            this.E = true;
            jn jnVar = this.G;
            if (jnVar != null) {
                jnVar.V();
            }
            d V = g.V();
            if (V != null) {
                V.V(this.f21665c, (Bundle) null);
            }
        } catch (Throwable th) {
            ex.V("AdMediator", "end err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.hms.ads.fs
    public void B() {
        Code(10, "onWhyThisAd hasShowFinish", Long.valueOf(this.F));
        kc h10 = h();
        if (h10 != null) {
            h10.F();
        }
    }

    @Override // com.huawei.hms.ads.fs
    public void C() {
        Code(11, "feedback hasShowFinish", Long.valueOf(this.F));
        kc h10 = h();
        if (h10 != null) {
            h10.D();
        }
    }

    public void D() {
        Context context = this.f21667e;
        if (context != null) {
            ha.i.e(context).d("resetDisplayDateAndCount", null, null, null);
        }
    }

    @Override // com.huawei.hms.ads.fs
    public void F() {
        this.f21663a.D(this.f21683x, System.currentTimeMillis());
    }

    public ga.b I() {
        return this.f21670j;
    }

    public abstract void I(AdContentData adContentData);

    @Override // com.huawei.hms.ads.fs
    public void L() {
        if (this.f21678s) {
            return;
        }
        this.f21678s = true;
        jh.Code(this.f21667e, this.B);
        ha haVar = this.f21668h;
        if (haVar != null) {
            haVar.L();
        }
    }

    public void S() {
        SplashAdDisplayListener splashAdDisplayListener = this.f21680u;
        if (splashAdDisplayListener != null) {
            splashAdDisplayListener.onAdClick();
        }
        gb.r.b(this.f21667e);
    }

    public int Z() {
        return this.f21684z;
    }

    @Override // com.huawei.hms.ads.fs
    public void a() {
        ex.V("AdMediator", "notifyAdDismissed");
        if (this.f21673m) {
            ex.V("AdMediator", "ad already dismissed");
            return;
        }
        this.f21673m = true;
        ga.b bVar = this.f21670j;
        if (bVar != null) {
            bVar.V();
        }
        SplashView.SplashAdLoadListener splashAdLoadListener = this.f21671k;
        if (splashAdLoadListener != null) {
            splashAdLoadListener.onAdDismissed();
        }
        AdContentData adContentData = this.B;
        if (adContentData != null && adContentData.f0() != 3) {
            jk.Code(this.f21667e).Code(this.B, -10);
        }
        kc h10 = h();
        if (h10 != null) {
            h10.destroyView();
        }
    }

    public AdSlotParam b() {
        ka g6 = g();
        if (g6 == null) {
            return null;
        }
        AdSlotParam adSlotParam = g6.getAdSlotParam();
        if (adSlotParam != null) {
            this.f21663a.u(adSlotParam.f());
        }
        return adSlotParam;
    }

    public void c() {
        AdSlotParam b10 = b();
        if (b10 == null) {
            I((AdContentData) null);
            return;
        }
        Context context = this.f21667e;
        if (context != null) {
            fa.j.a(context).getClass();
        }
        b10.q();
        SplashAdReqParam splashAdReqParam = new SplashAdReqParam();
        splashAdReqParam.b(d());
        splashAdReqParam.a(this.f21683x);
        String uuid = UUID.randomUUID().toString();
        this.f21682w = uuid;
        b10.x(uuid);
        b10.h(this.f21665c);
        Code(b10, splashAdReqParam);
    }

    public abstract String d();

    public void e() {
        int a10 = this.C.a();
        ex.V("AdMediator", "startAdLoadTimeoutTask - max load time: %d", Integer.valueOf(a10));
        gb.w.c(new AnonymousClass5(), this.f21675p, a10);
    }

    public void f() {
        a();
    }

    public ka g() {
        return this.f21669i.get();
    }

    public kc h() {
        WeakReference<kc> weakReference = this.I;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.ads.fs
    public void j() {
        ex.V("AdMediator", "onDisplayTimeUp hasShowFinish: %s", Boolean.valueOf(this.A));
        if (this.A) {
            return;
        }
        this.A = true;
        gb.r.b(this.f21667e);
        a();
    }

    @Override // com.huawei.hms.ads.fs
    public String k() {
        AdContentData adContentData = this.B;
        if (adContentData != null) {
            return adContentData.Y();
        }
        return null;
    }

    private void F(int i10) {
        if (this.L != null) {
            Code(this.f21667e, i10, this.f21682w, d(), this.L);
            ga.b bVar = this.f21670j;
            if (bVar instanceof ga.i) {
                bVar.Code();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i10) {
        if (i10 == -6) {
            Code(this.f21667e, i10, this.f21682w, d(), this.L);
        } else {
            Code(this.f21667e, i10, this.f21682w, d(), this.B);
        }
        B(i10);
    }

    public void B(int i10) {
        this.o = true;
        this.f21663a.B(i10);
        B(this.B);
    }

    @Override // com.huawei.hms.ads.fs
    public void C(int i10) {
        ka g6 = g();
        if (g6 != null) {
            g6.I(i10);
        }
    }

    @Override // com.huawei.hms.ads.fs
    public void I(int i10) {
        ex.V("AdMediator", "ad failed:" + i10);
        if (this.f21674n) {
            ex.V("AdMediator", "ad is already failed");
            return;
        }
        this.f21674n = true;
        this.F = System.currentTimeMillis();
        ga.b bVar = this.f21670j;
        if (bVar != null) {
            bVar.Code();
        }
        SplashView.SplashAdLoadListener splashAdLoadListener = this.f21671k;
        if (splashAdLoadListener != null) {
            splashAdLoadListener.onAdFailedToLoad(ci.Code(i10));
        }
        gb.r.b(this.f21667e);
        s();
        S(i10);
    }

    @Override // com.huawei.hms.ads.fs
    public com.huawei.openalliance.ad.constant.b V() {
        return this.Z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(AdContentData adContentData) {
        if (this.S && this.o && this.f21667e != null) {
            ex.V("AdMediator", "reportSplashCostTime");
            this.o = false;
            this.f21663a.Code(d());
            this.f21663a.I(this.f21683x, this.F);
            cz.Code(this.f21667e, this.f21682w, this.f21665c, adContentData, this.f21663a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(AdContentData adContentData) {
        if (adContentData == null) {
            return;
        }
        adContentData.Q0();
        Context context = this.f21667e;
        if (context != null) {
            ha.i.e(context).d("updateContentOnAdLoad", gb.b.p(adContentData), null, null);
        }
    }

    private void S(AdContentData adContentData) {
        if (this.f21668h == null) {
            return;
        }
        if (adContentData != null && adContentData.O0() == 9) {
            this.f21668h.Code(hz.Code(gl.Code, true, hy.STANDALONE));
        } else if (adContentData != null) {
            if (adContentData.O0() == 4 || adContentData.O0() == 2) {
                this.f21668h.L();
            }
        }
    }

    public kc Code(AdContentData adContentData, ka kaVar) {
        if (adContentData == null) {
            return null;
        }
        kc V = kaVar.V(adContentData.O0());
        if (V == null) {
            return V;
        }
        V.setAdContent(adContentData);
        V.setAdMediator(this);
        if (adContentData.O0() == 2 || adContentData.O0() == 4) {
            V.setDisplayDuration((adContentData.y0() > 0 ? adContentData.y0() : 0) + (adContentData.z0() >= 2000 ? adContentData.z0() : this.C.V()));
        }
        Code(V, adContentData, kaVar);
        return V;
    }

    @Override // com.huawei.hms.ads.fs
    public void V(int i10) {
        Context context;
        ex.V("AdMediator", "toShowSpare");
        if (!this.B.x0() && (context = this.f21667e) != null) {
            ha.i.e(context).d("getSpareSplashAd", String.valueOf(this.C.I()), new AnonymousClass2(i10), String.class);
        } else {
            I(i10);
            m();
        }
    }

    public void Z(int i10) {
        F(i10);
    }

    @Override // com.huawei.hms.ads.fs
    public void V(long j10) {
        this.f21683x = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:6:0x0005, B:8:0x000b, B:13:0x002e, B:14:0x0060, B:17:0x0011, B:19:0x0017, B:23:0x0023, B:24:0x0033), top: B:5:0x0005 }] */
    @Override // com.huawei.hms.ads.fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z(com.huawei.openalliance.ad.inter.data.AdContentData r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 0
            r1 = 1
            boolean r2 = gb.r0.f()     // Catch: java.lang.Throwable -> L69
            if (r2 != 0) goto L33
            android.content.Context r2 = r5.f21667e     // Catch: java.lang.Throwable -> L69
            if (r2 != 0) goto L11
        Lf:
            r2 = r0
            goto L2b
        L11:
            java.lang.Integer r2 = gb.r0.o(r2)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L23
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L69
            r3 = 30457100(0x1d0bd0c, float:7.66784E-38)
            if (r2 >= r3) goto L21
            goto L23
        L21:
            r2 = r1
            goto L2b
        L23:
            java.lang.String r2 = "HiAdTools"
            java.lang.String r3 = "hms version is too low to support v3."
            com.huawei.hms.ads.ex.V(r2, r3)     // Catch: java.lang.Throwable -> L69
            goto Lf
        L2b:
            if (r2 == 0) goto L2e
            goto L33
        L2e:
            java.lang.String r6 = r6.L()     // Catch: java.lang.Throwable -> L69
            goto L60
        L33:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r2.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "content_id"
            java.lang.String r4 = r6.L()     // Catch: java.lang.Throwable -> L69
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "templateId"
            java.lang.String r4 = r6.e0()     // Catch: java.lang.Throwable -> L69
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "slotid"
            java.lang.String r4 = r6.D()     // Catch: java.lang.Throwable -> L69
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "apiVer"
            int r6 = r6.f0()     // Catch: java.lang.Throwable -> L69
            r2.put(r3, r6)     // Catch: java.lang.Throwable -> L69
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L69
        L60:
            com.huawei.hms.ads.fo$8 r2 = new com.huawei.hms.ads.fo$8     // Catch: java.lang.Throwable -> L69
            r2.<init>()     // Catch: java.lang.Throwable -> L69
            gb.c0.a(r2)     // Catch: java.lang.Throwable -> L69
            goto L7d
        L69:
            r6 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r1[r0] = r6
            java.lang.String r6 = "AdMediator"
            java.lang.String r0 = "onMaterialLoadFailed err: %s"
            com.huawei.hms.ads.ex.V(r6, r0, r1)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.fo.Z(com.huawei.openalliance.ad.inter.data.AdContentData):void");
    }

    @Override // com.huawei.hms.ads.fs
    public void Code(int i10) {
        this.f21684z = i10;
    }

    private void V(boolean z10) {
        this.f21676q = z10;
    }

    @Override // com.huawei.hms.ads.fs
    public void Code(int i10, int i11) {
        kc h10 = h();
        if (h10 != null) {
            h10.Code(i10, i11);
        }
        if (this.A) {
            return;
        }
        this.A = true;
        gb.r.b(this.f21667e);
        jh.Code(this.f21667e, this.B, i10, i11, (List<String>) null);
        Code(Long.valueOf(this.F), 3, false);
        a();
    }

    private void Code(int i10, int i11, fb.m mVar, Long l10, MaterialClickInfo materialClickInfo, int i12) {
        Code(l10, 1, true);
        jh.Code(this.f21667e, this.B, i10, i11, mVar.c(), i12, materialClickInfo, a0.a.l(g()), gb.u.q(g()));
        if (this.A) {
            ex.V("AdMediator", "onDoActionSucc hasShowFinish");
            return;
        }
        this.A = true;
        gb.r.b(this.f21667e);
        S();
    }

    private void Code(int i10, String str, Long l10) {
        Code(l10, i10, false);
        if (this.A) {
            ex.V("AdMediator", str);
        } else {
            this.A = true;
            gb.r.b(this.f21667e);
        }
    }

    public boolean V(AdContentData adContentData) {
        ex.V("AdMediator", "showAdContent");
        if (this.f21664b != null) {
            ex.V("AdMediator", "set verifyConfig.");
            adContentData.V0(this.f21664b.getData());
            adContentData.X0(this.f21664b.getUserId());
        }
        this.D = true;
        ka g6 = g();
        if (g6 == null) {
            return false;
        }
        ex.V("AdMediator", "showAdContent, getTemplateIdV3 = %s", adContentData.e0());
        if (adContentData.e0() == null) {
            this.I = null;
            kc Code = Code(adContentData, g6);
            if (Code == null) {
                return false;
            }
            ha haVar = this.f21668h;
            if (haVar != null) {
                haVar.Z();
            }
            S(adContentData);
            g6.Code(Code, g6.Code(adContentData));
            Code.V();
            this.I = new WeakReference<>(Code);
        } else {
            if (!(g6 instanceof PPSSplashView)) {
                ex.I("AdMediator", "not PPSSplashView");
                return false;
            }
            IRemoteCreator Code2 = g.Code(this.f21667e);
            if (Code2 == null) {
                ex.V("AdMediator", "Creator is null");
                return false;
            }
            cg cgVar = new cg(g6.getContext(), this, adContentData);
            Bundle bundle = new Bundle();
            bundle.putInt("audioFocusType", g6.getAudioFocusType());
            PPSSplashView pPSSplashView = (PPSSplashView) g6;
            bundle.putInt(bj.f.S, pPSSplashView.getMediaNameResId());
            bundle.putInt(bj.f.C, pPSSplashView.getLogoResId());
            bundle.putString("content", this.f21666d);
            AdSlotParam b10 = b();
            if (b10 != null) {
                bundle.putInt("orientation", b10.v());
                bundle.putInt(bj.f.B, b10.E() != null ? b10.E().intValue() : 1);
            }
            try {
                View view = (View) ObjectWrapper.unwrap(Code2.newSplashTemplateView(bundle, cgVar));
                if (view == null) {
                    ex.I("AdMediator", "templateView is null;");
                    return false;
                }
                this.f21668h = null;
                g6.Code(view);
                Code2.bindData(ObjectWrapper.wrap(view), this.f21666d);
                q();
            } catch (Throwable th) {
                ex.I("AdMediator", "create splashTemplateView err: %s", th.getClass().getSimpleName());
                return false;
            }
        }
        return true;
    }

    @Override // com.huawei.hms.ads.fs
    public void Code(long j10) {
        this.y = j10;
    }

    private void Code(Context context, int i10, String str, String str2, AdContentData adContentData) {
        List<String> f;
        AnalysisEventReport analysisEventReport = new AnalysisEventReport();
        if (adContentData == null) {
            adContentData = new AdContentData();
        }
        adContentData.K0(this.f21665c);
        analysisEventReport.e(adContentData);
        analysisEventReport.c(i10);
        analysisEventReport.j(str);
        analysisEventReport.k(adContentData.e0());
        analysisEventReport.g(adContentData.D());
        analysisEventReport.b(adContentData.L());
        analysisEventReport.h(adContentData.f0());
        try {
            analysisEventReport.l(Integer.parseInt(str2));
        } catch (NumberFormatException e10) {
            ex.Code("AdMediator", "setShowMode error%s", e10.getClass().getSimpleName());
        }
        if (b() != null && (f = b().f()) != null && !f.isEmpty()) {
            ex.Code("AdMediator", "setSlotId: %s", f.get(0));
            analysisEventReport.o(f.get(0));
        }
        if (context != null) {
            ha.i.e(context).d("rptSplashFailedEvt", gb.b.p(analysisEventReport), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(Context context, AdContentData adContentData, int i10) {
        if (context == null) {
            return;
        }
        AnalysisEventReport analysisEventReport = new AnalysisEventReport();
        analysisEventReport.e(adContentData);
        analysisEventReport.c(i10);
        if (adContentData != null) {
            analysisEventReport.k(adContentData.e0());
            analysisEventReport.g(adContentData.D());
            analysisEventReport.b(adContentData.L());
            analysisEventReport.h(adContentData.f0());
        }
        ha.i.e(context).d("rptStartSpareSplashAd", gb.b.p(analysisEventReport), null, null);
    }

    private void Code(kc kcVar, AdContentData adContentData, ka kaVar) {
        if (adContentData == null || kcVar == null || this.f21668h == null) {
            ex.I("AdMediator", "there is no splash ad or adView is null");
            return;
        }
        ex.V("AdMediator", "initOmsdkResource");
        this.f21668h.Code(this.f21667e, adContentData, kaVar, true);
        kcVar.Code(this.f21668h);
    }

    @Override // com.huawei.hms.ads.fs
    public void Code(RewardVerifyConfig rewardVerifyConfig) {
        this.f21664b = rewardVerifyConfig;
    }

    @Override // com.huawei.hms.ads.fs
    public void Code(SplashAdDisplayListener splashAdDisplayListener) {
        this.f21680u = splashAdDisplayListener;
    }

    @Override // com.huawei.hms.ads.fs
    public void Code(SplashView.SplashAdLoadListener splashAdLoadListener) {
        this.f21671k = splashAdLoadListener;
    }

    private void Code(AdSlotParam adSlotParam, SplashAdReqParam splashAdReqParam) {
        c0.b(new AnonymousClass4(adSlotParam, splashAdReqParam), c0.a.SPLASH_NET);
    }

    @Override // com.huawei.hms.ads.fs
    public void Code(final AdContentData adContentData) {
        c0.a(new Runnable() { // from class: com.huawei.hms.ads.fo.3
            @Override // java.lang.Runnable
            public void run() {
                fo.this.C(adContentData);
            }
        });
        ka g6 = g();
        if (g6 != null) {
            int b10 = adContentData.b();
            g6.Code(adContentData.b(), adContentData.e0() == null);
            g6.V();
            if (adContentData.e0() == null) {
                g6.Code(adContentData, this.C.F());
                g6.Code(jf.C(adContentData.a1()), jf.S(adContentData.a1()), adContentData.C0(), 1 == b10, g6.Code(adContentData));
            }
        }
        this.Z = com.huawei.openalliance.ad.constant.b.LOADED;
        CountDownTimer countDownTimer = this.f21681v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ex.V("AdMediator", "ad loaded");
        this.F = System.currentTimeMillis();
        ga.b bVar = this.f21670j;
        if (bVar != null) {
            bVar.b();
        }
        SplashView.SplashAdLoadListener splashAdLoadListener = this.f21671k;
        if (splashAdLoadListener != null) {
            splashAdLoadListener.onAdLoaded();
        }
        p();
        L();
        if (!this.C.k()) {
            Code((Long) null, (Integer) null, (Integer) null, false);
        }
        B(200);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(final AdContentData adContentData, final int i10) {
        if (adContentData != null) {
            ex.V("AdMediator", "use spare ad");
            this.S = true;
            this.f21682w = adContentData.E();
            this.F = System.currentTimeMillis();
            S(i10);
            adContentData.O();
            c0.c(new Runnable() { // from class: com.huawei.hms.ads.fo.6
                @Override // java.lang.Runnable
                public void run() {
                    fo foVar = fo.this;
                    foVar.Code(foVar.f21667e, adContentData, i10);
                }
            });
            I(adContentData);
        }
    }

    @Override // com.huawei.hms.ads.fs
    public void Code(AdContentData adContentData, long j10, int i10) {
        String str;
        s();
        if (!this.C.k()) {
            ex.I("AdMediator", "onAdShowEnd - use old adshow event");
            return;
        }
        ex.V("AdMediator", "onAdShowEnd duration: %d showRatio: %d", Long.valueOf(j10), Integer.valueOf(i10));
        jh.Code(this.f21667e, adContentData, j10, i10);
        if (adContentData != null) {
            MetaData K = adContentData.K();
            if (K != null) {
                if (j10 < K.v() || i10 < K.r()) {
                    ex.I("AdMediator", "duration or show ratio is invalid for showId %s", adContentData.u());
                    return;
                } else {
                    Code(Long.valueOf(j10), Integer.valueOf(i10), (Integer) null, false);
                    return;
                }
            }
            str = "onAdShowEnd - metaData is null";
        } else {
            str = "onAdShowEnd - content record is null";
        }
        ex.I("AdMediator", str);
    }

    @Override // com.huawei.hms.ads.fs
    public void Code(ga.a aVar) {
    }

    @Override // com.huawei.hms.ads.fs
    public void Code(ga.b bVar) {
        this.f21670j = bVar;
    }

    private void Code(Long l10, int i10, boolean z10) {
        Code(l10 != null ? Long.valueOf(System.currentTimeMillis() - l10.longValue()) : null, (Integer) 100, Integer.valueOf(i10), z10);
    }

    public void Code(Long l10, Integer num, Integer num2, boolean z10) {
        AdContentData adContentData = this.B;
        boolean b10 = gb.y.b(adContentData != null ? adContentData.W() : null, num2);
        if (r() && (!b10 || Code())) {
            ex.I("AdMediator", "show event already reported before, ignore this");
            return;
        }
        String o = o();
        AdContentData adContentData2 = this.B;
        if (adContentData2 != null) {
            ex.Code("AdMediator", "slotId: %s, contentId: %s, slot pos: %s", adContentData2.D(), this.B.L(), o);
        }
        jg.a aVar = new jg.a();
        if (z10) {
            aVar.V(Long.valueOf(System.currentTimeMillis()));
        }
        if (!gb.p.f(o)) {
            aVar.I(o);
        }
        aVar.Code(l10).Code(num).V(num2).Code(a0.a.l(g()));
        jh.Code(this.f21667e, this.B, aVar.Code());
        if (b10) {
            Code(true);
        }
        if (r()) {
            return;
        }
        V(true);
        SplashAdDisplayListener splashAdDisplayListener = this.f21680u;
        if (splashAdDisplayListener != null) {
            splashAdDisplayListener.onAdShowed();
        }
        ha haVar = this.f21668h;
        if (haVar != null) {
            haVar.D();
        }
    }

    public void Code(boolean z10) {
        this.f21677r = z10;
    }

    public boolean Code() {
        return this.f21677r;
    }

    @Override // com.huawei.hms.ads.fs
    public boolean Code(int i10, int i11, AdContentData adContentData, Long l10, MaterialClickInfo materialClickInfo, int i12) {
        ex.V("AdMediator", "onTouch");
        Context context = g() instanceof View ? ((View) g()).getContext() : this.f21667e;
        boolean z10 = false;
        fb.m k10 = androidx.activity.n.k(context, adContentData, new HashMap(0));
        if (k10 instanceof com.huawei.openalliance.ad.uriaction.a) {
            new jq() { // from class: com.huawei.hms.ads.fo.9
            };
            k10.getClass();
        }
        if (k10.a()) {
            if (18 == i12 && (context instanceof Activity)) {
                ((Activity) context).overridePendingTransition(R.anim.hiad_open, R.anim.hiad_close);
            }
            Code(i10, i11, k10, l10, materialClickInfo, i12);
            z10 = true;
        }
        fa.g.a(this.f21667e).getClass();
        return z10;
    }
}
