package com.anythink.expressad.video.bt.module;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.c.g;
import com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.r;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.bt.module.b.h;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.module.a.a.f;
import com.anythink.expressad.video.module.a.a.m;
import com.anythink.expressad.video.signal.a.c;
import com.anythink.expressad.video.signal.container.AbstractJSContainer;
import com.anythink.expressad.videocommon.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ATTempContainer extends AbstractJSContainer {
    private static final String A = "ATTempContainer";

    /* renamed from: aa, reason: collision with root package name */
    private static final long f11243aa = 5000;

    /* renamed from: ab, reason: collision with root package name */
    private static final long f11244ab = 2000;

    /* renamed from: ac, reason: collision with root package name */
    private static final long f11245ac = 100;

    /* renamed from: ad, reason: collision with root package name */
    private static final int f11246ad = -1;
    private static final int ae = -2;
    private static final int af = -3;
    private static final int ag = -3;
    private static final int ah = -4;
    private static final int al = 250;

    /* renamed from: b, reason: collision with root package name */
    protected static final int f11247b = 0;
    private View B;
    private com.anythink.expressad.foundation.d.c C;
    private com.anythink.expressad.videocommon.b.c D;
    private h E;
    private com.anythink.expressad.video.bt.module.a.b F;
    private com.anythink.expressad.video.dynview.f.a G;
    private int H;
    private String I;
    private com.anythink.expressad.video.signal.factory.b J;
    private int K;
    private int L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private String S;
    private String T;
    private List<com.anythink.expressad.foundation.d.c> U;
    private int V;
    private LayoutInflater W;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f11248a;
    private int ai;
    private int aj;
    private int ak;
    private View am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private boolean at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private MraidVolumeChangeReceiver ax;
    private Runnable ay;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f11249c;

    /* renamed from: d, reason: collision with root package name */
    protected a f11250d;

    /* renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f11251e;
    protected AnythinkVideoView f;

    /* renamed from: g, reason: collision with root package name */
    protected AnythinkContainerView f11252g;

    /* renamed from: h, reason: collision with root package name */
    protected Handler f11253h;

    /* renamed from: i, reason: collision with root package name */
    protected Runnable f11254i;

    /* renamed from: j, reason: collision with root package name */
    protected Runnable f11255j;

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass5() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            String str;
            ATTempContainer.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (n.a().g() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                o.b(ATTempContainer.A, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) ATTempContainer.this.f11251e, AbsFeedBackForH5.f7027a, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            String str;
            ATTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (n.a().g() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                o.b(ATTempContainer.A, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) ATTempContainer.this.f11251e, AbsFeedBackForH5.f7027a, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            String str;
            ATTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (n.a().g() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                o.b(ATTempContainer.A, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) ATTempContainer.this.f11251e, AbsFeedBackForH5.f7027a, encodeToString);
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements MraidVolumeChangeReceiver.VolumeChangeListener {
        public AnonymousClass6() {
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver.VolumeChangeListener
        public final void onVolumeChanged(double d10) {
            AnythinkContainerView anythinkContainerView;
            o.d(ATTempContainer.A, "volume is : ".concat(String.valueOf(d10)));
            try {
                if (ATTempContainer.this.C.H() && (anythinkContainerView = ATTempContainer.this.f11252g) != null && anythinkContainerView.getH5EndCardView() != null) {
                    ATTempContainer.this.f11252g.getH5EndCardView().volumeChange(d10);
                }
            } catch (Exception e10) {
                o.d(ATTempContainer.A, e10.getMessage());
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements Runnable {
        public AnonymousClass7() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATTempContainer.this.am.setBackgroundColor(0);
            ATTempContainer.this.am.setVisibility(0);
            ATTempContainer.this.am.bringToFront();
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass8 implements Runnable {
        public AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATTempContainer.this.am.setVisibility(8);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);

        boolean a();

        void b();

        /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0135a implements a {

            /* renamed from: b, reason: collision with root package name */
            private static final String f11264b = "ActivityErrorListener";

            /* renamed from: a, reason: collision with root package name */
            private boolean f11265a = false;

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public void a(String str) {
                o.d(f11264b, str);
                this.f11265a = true;
            }

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public final void b() {
                this.f11265a = true;
            }

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public final boolean a() {
                return this.f11265a;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class b extends f {
        private Activity V;
        private com.anythink.expressad.foundation.d.c W;

        public b(Activity activity, com.anythink.expressad.foundation.d.c cVar) {
            this.V = activity;
            this.W = cVar;
        }

        @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i10, Object obj) {
            Context context = ATTempContainer.this.getContext();
            if (context != null && context != context.getApplicationContext()) {
                ATTempContainer.this.getJSCommon().a(context);
            }
            if (this.V != null) {
                ATTempContainer.this.getJSCommon().a(this.V);
            }
            ATTempContainer.m(ATTempContainer.this);
            String str = "";
            if (i10 != 108) {
                if (i10 != 113) {
                    if (i10 != 117) {
                        if (i10 != 126 && i10 != 128) {
                            switch (i10) {
                                case 103:
                                case 104:
                                    ATTempContainer.k(ATTempContainer.this);
                                    break;
                                case 105:
                                    com.anythink.expressad.video.signal.c jSCommon = ATTempContainer.this.getJSCommon();
                                    if (obj != null) {
                                        str = obj.toString();
                                    }
                                    jSCommon.click(1, str);
                                    break;
                                case 106:
                                    if (ATTempContainer.this.F != null) {
                                        ATTempContainer.this.F.a(ATTempContainer.this.I, this.W);
                                    } else {
                                        ATTempContainer.this.E.a(this.W);
                                    }
                                    if (this.V != null && this.W != null) {
                                        n.a().a(new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.b.1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ATTempContainer.k(ATTempContainer.this);
                                            }
                                        }, 50L);
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            ATTempContainer.this.E.a(this.W);
                        }
                    } else {
                        AnythinkVideoView anythinkVideoView = ATTempContainer.this.f;
                        if (anythinkVideoView != null) {
                            anythinkVideoView.setVisible(4);
                        }
                        ATTempContainer.m(ATTempContainer.this);
                        ATTempContainer.this.E.c();
                    }
                } else {
                    ATTempContainer.this.E.a(this.W);
                }
            } else {
                ATTempContainer.this.getJSCommon().a(new c.b(ATTempContainer.this.getJSCommon(), new d(ATTempContainer.this, (byte) 0)));
                com.anythink.expressad.video.signal.c jSCommon2 = ATTempContainer.this.getJSCommon();
                if (obj != null) {
                    str = obj.toString();
                }
                jSCommon2.click(1, str);
            }
            super.a(i10, obj);
        }
    }

    /* loaded from: classes.dex */
    public final class c extends f {
        private c() {
        }

        @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i10, Object obj) {
            String str;
            String str2;
            super.a(i10, obj);
            try {
                if (obj instanceof JSONObject) {
                    str2 = obj.toString();
                } else {
                    str2 = (String) obj;
                }
                if (((AbstractJSContainer) ATTempContainer.this).f12262t && !TextUtils.isEmpty(str2)) {
                    JSONObject jSONObject = new JSONObject(str2);
                    int optInt = jSONObject.optInt("type");
                    int optInt2 = jSONObject.optInt("complete");
                    if (optInt != 2) {
                        if (optInt != 3) {
                            ATTempContainer.this.K = com.anythink.expressad.foundation.g.a.cv;
                        } else {
                            ATTempContainer.this.K = com.anythink.expressad.foundation.g.a.cw;
                        }
                    } else {
                        ATTempContainer.this.K = com.anythink.expressad.foundation.g.a.cx;
                    }
                    ATTempContainer.this.L = optInt2;
                }
            } catch (Exception unused) {
                o.d("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i10 != 120) {
                if (i10 != 126) {
                    if (i10 != 127) {
                        switch (i10) {
                            case 100:
                                ATTempContainer.q(ATTempContainer.this);
                                ATTempContainer aTTempContainer = ATTempContainer.this;
                                aTTempContainer.f11253h.postDelayed(aTTempContainer.ay, 250L);
                                ATTempContainer.this.E.a();
                                return;
                            case 101:
                            case 102:
                                ATTempContainer.this.getJSCommon().j();
                                return;
                            case 103:
                                ATTempContainer.h(ATTempContainer.this);
                                if (ATTempContainer.this.C.H()) {
                                    ATTempContainer.k(ATTempContainer.this);
                                    return;
                                } else {
                                    ATTempContainer.this.getJSCommon().j();
                                    return;
                                }
                            case 104:
                                ATTempContainer.k(ATTempContainer.this);
                                return;
                            case 105:
                                com.anythink.expressad.video.signal.c jSCommon = ATTempContainer.this.getJSCommon();
                                if (obj != null) {
                                    str = obj.toString();
                                } else {
                                    str = "";
                                }
                                jSCommon.click(1, str);
                                return;
                            default:
                                return;
                        }
                    }
                    ATTempContainer.h(ATTempContainer.this);
                    ATTempContainer.this.E.a();
                    ATTempContainer.this.E.c();
                    ATTempContainer.this.getJSContainerModule().showEndcard(100);
                    return;
                }
                ATTempContainer.this.E.a(ATTempContainer.this.C);
                return;
            }
            ATTempContainer.this.E.c();
        }

        public /* synthetic */ c(ATTempContainer aTTempContainer, byte b10) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class d extends c.a {
        private d() {
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void a(com.anythink.expressad.foundation.d.c cVar, String str) {
            super.a(cVar, str);
            ATTempContainer.s(ATTempContainer.this);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void b() {
            super.b();
            ATTempContainer.this.receiveSuccess();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void c() {
            super.c();
            ATTempContainer aTTempContainer = ATTempContainer.this;
            Handler handler = aTTempContainer.f11253h;
            if (handler != null) {
                handler.removeCallbacks(aTTempContainer.f11254i);
            }
        }

        public /* synthetic */ d(ATTempContainer aTTempContainer, byte b10) {
            this();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void a(com.anythink.expressad.out.j jVar, String str) {
            super.a(jVar, str);
            ATTempContainer.t(ATTempContainer.this);
            ATTempContainer.u(ATTempContainer.this);
            if (jVar == null || !(jVar instanceof com.anythink.expressad.foundation.d.c)) {
                return;
            }
            try {
                com.anythink.expressad.foundation.d.c cVar = (com.anythink.expressad.foundation.d.c) jVar;
                String optString = new JSONObject(ATTempContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                if (cVar.Q() == 3 && cVar.C() == 2 && optString.equals(g.c.f5034a) && ((AbstractJSContainer) ATTempContainer.this).f12255l != null) {
                    if (!((AbstractJSContainer) ATTempContainer.this).y) {
                        ((AbstractJSContainer) ATTempContainer.this).f12255l.finish();
                    } else {
                        ATTempContainer.k(ATTempContainer.this);
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void b(com.anythink.expressad.out.j jVar, String str) {
            super.b(jVar, str);
            ATTempContainer.u(ATTempContainer.this);
            ATTempContainer.t(ATTempContainer.this);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(com.anythink.expressad.foundation.d.c cVar, boolean z10) {
            super.a(cVar, z10);
            ATTempContainer.this.E.a(cVar);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(int i10, String str) {
            super.a(i10, str);
            ATTempContainer.this.defaultLoad(i10, str);
        }
    }

    /* loaded from: classes.dex */
    public final class e extends f {
        private e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
        
            if (r2.f11270a.C.l() != false) goto L62;
         */
        @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(int r3, java.lang.Object r4) {
            /*
                Method dump skipped, instructions count: 330
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.bt.module.ATTempContainer.e.a(int, java.lang.Object):void");
        }

        public /* synthetic */ e(ATTempContainer aTTempContainer, byte b10) {
            this();
        }
    }

    public ATTempContainer(Context context) {
        super(context);
        this.H = 1;
        this.I = "";
        this.K = com.anythink.expressad.foundation.g.a.cv;
        this.M = false;
        this.S = "";
        this.U = new ArrayList();
        this.V = 0;
        this.f11248a = false;
        this.f11249c = false;
        this.f11250d = new a.C0135a();
        this.f11253h = new Handler();
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.f11254i = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.ai = -3;
                } else {
                    Log.d(ATTempContainer.A, "run: WebView load timeout");
                    ATTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f11255j = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.ai = -4;
                } else {
                    ATTempContainer.this.defaultLoad(-3, "JS bridge connect timeout");
                }
            }
        };
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.ar = false;
        this.as = false;
        this.at = false;
        this.au = false;
        this.av = false;
        this.aw = false;
        this.ay = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.am != null) {
                    ATTempContainer.this.am.setVisibility(8);
                }
            }
        };
        init(context);
    }

    public static /* synthetic */ boolean h(ATTempContainer aTTempContainer) {
        aTTempContainer.ao = true;
        return true;
    }

    private void k() {
        Runnable runnable;
        int i10 = this.ai;
        if (i10 == -3) {
            runnable = this.f11254i;
        } else {
            runnable = i10 == -4 ? this.f11255j : null;
        }
        if (runnable != null) {
            runnable.run();
            this.ai = 0;
        }
    }

    public static /* synthetic */ boolean m(ATTempContainer aTTempContainer) {
        aTTempContainer.au = true;
        return true;
    }

    private static void n() {
    }

    private static void p() {
    }

    public static /* synthetic */ boolean q(ATTempContainer aTTempContainer) {
        aTTempContainer.av = true;
        return true;
    }

    private void s() {
        if (this.ao) {
            o.a(A, "sendToServerRewardInfo");
            com.anythink.expressad.video.module.b.a.a(this.C, this.f12259q, this.f12256m, this.f12258p, this.T);
        }
    }

    public static /* synthetic */ boolean t(ATTempContainer aTTempContainer) {
        aTTempContainer.as = true;
        return true;
    }

    private static int u() {
        try {
            com.anythink.expressad.videocommon.e.a b10 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b10 == null) {
                com.anythink.expressad.videocommon.e.c.a();
                com.anythink.expressad.videocommon.e.c.c();
            }
            r0 = b10 != null ? (int) b10.g() : 5;
            o.b(A, "AnythinkBaseView buffetTimeout:".concat(String.valueOf(r0)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return r0;
    }

    public boolean canBackPress() {
        AnythinkContainerView anythinkContainerView = this.f11252g;
        if (anythinkContainerView != null && !anythinkContainerView.canBackPress()) {
            return false;
        }
        return true;
    }

    public void defaultLoad(int i10, String str) {
        int i11;
        int e10;
        int i12;
        int p10;
        superDefaultLoad(i10, str);
        o.a(A, "hybrid load error ,start defaultLoad,desc:".concat(String.valueOf(str)));
        if (isLoadSuccess()) {
            byte b10 = 0;
            if (this.C.J() == 2) {
                this.f11252g.setCampaign(this.C);
                this.f11252g.addOrderViewData(this.U);
                this.f11252g.setUnitID(this.f12256m);
                if (this.C.g() > -2) {
                    p10 = this.C.g();
                } else {
                    p10 = this.o.p();
                }
                this.f11252g.setCloseDelayTime(p10);
                this.f11252g.setPlayCloseBtnTm(this.o.j());
                this.f11252g.setNotifyListener(new com.anythink.expressad.video.module.a.a.h(this.C, this.D, this.f12259q, b(), this.f12256m, new c(this, b10), this.o.M(), this.y));
                this.f11252g.preLoadData(this.J);
                this.f11252g.showPlayableView();
                return;
            }
            a(i10, str);
            this.am.setVisibility(8);
            loadModuleDatas();
            int f = this.o.f();
            int e11 = e();
            if (e11 != 0) {
                i11 = e11;
            } else {
                i11 = f;
            }
            com.anythink.expressad.foundation.d.c cVar = this.C;
            if (cVar != null && cVar.j()) {
                this.f.setContainerViewOnNotifyListener(new b(this.f12255l, this.C));
            }
            com.anythink.expressad.foundation.d.c cVar2 = this.C;
            if (cVar2 != null && cVar2.h() > -2) {
                e10 = this.C.h();
            } else {
                e10 = this.o.e();
            }
            if (this.C.k() == 5 && (i12 = this.H) > 1) {
                e10 = a(e10, i12);
                this.C.a(e10);
            }
            int i13 = e10;
            this.f.setVideoSkipTime(i13);
            AnythinkVideoView anythinkVideoView = this.f;
            anythinkVideoView.setNotifyListener(new m(anythinkVideoView, this.f11252g, this.C, this.f12259q, this.D, b(), this.f12256m, i11, i13, new e(this, b10), this.o.M(), this.y, this.o.U()));
            this.f.defaultShow();
            AnythinkContainerView anythinkContainerView = this.f11252g;
            anythinkContainerView.setNotifyListener(new com.anythink.expressad.video.module.a.a.b(this.f, anythinkContainerView, this.C, this.f12259q, this.D, b(), this.f12256m, new b(this.f12255l, this.C), this.o.M(), this.y));
            this.f11252g.defaultShow();
            return;
        }
        a(i10, str);
        Activity activity = this.f12255l;
        if (activity != null) {
            activity.finish();
        }
    }

    public AnythinkContainerView findAnythinkContainerView() {
        return (AnythinkContainerView) findViewById(findID("anythink_video_templete_container"));
    }

    public AnythinkVideoView findAnythinkVideoView() {
        return (AnythinkVideoView) findViewById(findID("anythink_video_templete_videoview"));
    }

    public int findID(String str) {
        return i.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return i.a(getContext(), str, "layout");
    }

    public WindVaneWebView findWindVaneWebView() {
        a.C0140a a10;
        try {
            if (this.y) {
                String str = A;
                o.a(str, "当前大模板");
                com.anythink.expressad.foundation.d.c cVar = this.C;
                if (cVar != null && cVar.M() != null) {
                    o.a(str, "当前大模板，存在播放模板");
                    a.C0140a a11 = com.anythink.expressad.videocommon.a.a(this.f12256m + "_" + this.C.aZ() + "_" + this.C.Z() + "_" + this.C.M().e());
                    if (a11 != null) {
                        return a11.a();
                    }
                    return null;
                }
                return null;
            }
            o.a(A, "当前非大模板");
            if (this.f12262t) {
                a10 = com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aU, this.C);
            } else {
                a10 = com.anythink.expressad.videocommon.a.a(94, this.C);
            }
            if (a10 != null && a10.c()) {
                if (this.f12262t) {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aU, this.C);
                } else {
                    com.anythink.expressad.videocommon.a.b(94, this.C);
                }
                WindVaneWebView a12 = a10.a();
                if (this.ar) {
                    a12.setWebViewTransparent();
                }
                return a12;
            }
            return null;
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
                return null;
            }
            return null;
        }
    }

    public com.anythink.expressad.foundation.d.c getCampaign() {
        return this.C;
    }

    public String getInstanceId() {
        return this.I;
    }

    public int getLayoutID() {
        String str;
        if (this.ar) {
            str = "anythink_reward_activity_video_templete_transparent";
        } else {
            str = "anythink_reward_activity_video_templete";
        }
        return findLayout(str);
    }

    public void init(Context context) {
        this.W = LayoutInflater.from(context);
    }

    public boolean initViews() {
        View findViewById = findViewById(findID("anythink_video_templete_progressbar"));
        this.am = findViewById;
        if (findViewById != null) {
            return true;
        }
        return false;
    }

    public boolean isLoadSuccess() {
        return this.f11249c;
    }

    public void loadModuleDatas() {
        int i10;
        int i11;
        int e10;
        int p10;
        int i12;
        int i13;
        int i14;
        com.anythink.expressad.video.signal.a.j b10 = b(this.C);
        byte b11 = 0;
        if (b10 != null) {
            i10 = b10.b();
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            this.f12261s = i10;
        }
        int f = this.o.f();
        int e11 = e();
        if (e11 != 0) {
            i11 = e11;
        } else {
            i11 = f;
        }
        this.f.setSoundState(this.f12261s);
        this.f.setCampaign(this.C);
        this.f.setPlayURL(this.D.r());
        com.anythink.expressad.foundation.d.c cVar = this.C;
        if (cVar != null && cVar.h() > -2) {
            e10 = this.C.h();
        } else {
            e10 = this.o.e();
        }
        if (this.C.k() == 5 && (i14 = this.H) > 1) {
            e10 = a(e10, i14);
            this.C.a(e10);
        }
        this.f.setVideoSkipTime(e10);
        this.f.setCloseAlert(this.o.k());
        this.f.setBufferTimeout(u());
        this.f.setNotifyListener(new com.anythink.expressad.video.module.a.a.n(this.J, this.C, this.f12259q, this.D, b(), this.f12256m, i11, e10, new e(this, b11), this.o.M(), this.y, this.o.U()));
        this.f.setShowingTransparent(this.ar);
        if (this.f12262t && ((i12 = this.f12264v) == com.anythink.expressad.foundation.g.a.cr || i12 == com.anythink.expressad.foundation.g.a.cs)) {
            this.f.setIVRewardEnable(i12, this.f12265w, this.f12266x);
            AnythinkVideoView anythinkVideoView = this.f;
            if (getJSCommon() != null) {
                i13 = getJSCommon().n();
            } else {
                i13 = 1;
            }
            anythinkVideoView.setDialogRole(i13);
        }
        this.f11252g.setCampaign(this.C);
        this.f11252g.addOrderViewData(this.U);
        this.f11252g.setUnitID(this.f12256m);
        if (this.C.g() > -2) {
            p10 = this.C.g();
        } else {
            p10 = this.o.p();
        }
        this.f11252g.setCloseDelayTime(p10);
        this.f11252g.setPlayCloseBtnTm(this.o.j());
        this.f11252g.setVideoInteractiveType(this.o.h());
        this.f11252g.setEndscreenType(this.o.r());
        this.f11252g.setVideoSkipTime(e10);
        this.f11252g.setShowingTransparent(this.ar);
        this.f11252g.setJSFactory(this.J);
        if (this.C.J() == 2) {
            this.f11252g.setNotifyListener(new com.anythink.expressad.video.module.a.a.h(this.C, this.D, this.f12259q, b(), this.f12256m, new c(this, (byte) 0), this.o.M(), this.y));
            this.f11252g.preLoadData(this.J);
            this.f11252g.showPlayableView();
        } else {
            this.f11252g.setNotifyListener(new com.anythink.expressad.video.module.a.a.c(this.J, this.C, this.f12259q, this.D, b(), this.f12256m, new b(this.f12255l, this.C), this.o.M(), this.y));
            this.f11252g.preLoadData(this.J);
            this.f.preLoadData(this.J);
        }
        if (this.ar) {
            this.f11252g.setAnythinkClickMiniCardViewTransparent();
        }
    }

    public void notifyEvent(String str) {
        WindVaneWebView windVaneWebView = this.f11251e;
        if (windVaneWebView != null) {
            String str2 = this.I;
            j.a();
            j.a((WebView) windVaneWebView, str, Base64.encodeToString(str2.getBytes(), 2));
        }
    }

    public void onBackPressed() {
        AnythinkContainerView anythinkContainerView;
        AnythinkContainerView anythinkContainerView2;
        AnythinkVideoView anythinkVideoView;
        AnythinkVideoView anythinkVideoView2;
        if (this.ar && (anythinkVideoView2 = this.f) != null) {
            anythinkVideoView2.notifyVideoClose();
            return;
        }
        if (this.at && (anythinkVideoView = this.f) != null) {
            if (anythinkVideoView.isMiniCardShowing()) {
                AnythinkContainerView anythinkContainerView3 = this.f11252g;
                if (anythinkContainerView3 != null) {
                    anythinkContainerView3.onMiniEndcardBackPress();
                    return;
                }
                return;
            }
            this.f.onBackPress();
            return;
        }
        if (this.av && (anythinkContainerView2 = this.f11252g) != null) {
            anythinkContainerView2.onPlayableBackPress();
            return;
        }
        if (this.au && (anythinkContainerView = this.f11252g) != null) {
            anythinkContainerView.onEndcardBackPress();
        }
        if (getJSCommon().g()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().g();
                return;
            }
            return;
        }
        if (canBackPress()) {
            Activity activity = this.f12255l;
            if (activity != null && !this.y && !this.aw) {
                this.aw = true;
                activity.onBackPressed();
                return;
            }
            return;
        }
        o.a(A, "onBackPressed can't excute");
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        boolean z10;
        ViewGroup viewGroup;
        List<com.anythink.expressad.foundation.d.c> list;
        String str = A;
        o.a(str, "onCreate isBigOffer: " + this.y);
        if (this.o == null) {
            this.o = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f12256m, this.f12262t);
        }
        byte b10 = 0;
        this.aw = false;
        try {
            if (this.y) {
                com.anythink.expressad.foundation.d.c cVar = this.C;
                if (cVar != null && cVar.j()) {
                    this.E = new com.anythink.expressad.video.bt.module.b.e(getContext(), this.f12262t, this.o, this.C, this.E, b(), this.f12256m);
                } else {
                    this.E = new com.anythink.expressad.video.bt.module.b.d(this.F, this.I);
                }
            } else {
                this.E = new com.anythink.expressad.video.bt.module.b.e(getContext(), this.f12262t, this.o, this.C, this.E, b(), this.f12256m);
            }
            registerErrorListener(new com.anythink.expressad.video.bt.module.b.f(this.E));
            a(this.o, this.C);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                a("layoutID not found");
                return;
            }
            View inflate = this.W.inflate(layoutID, (ViewGroup) null);
            this.B = inflate;
            addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.f11248a) {
                setMatchParent();
            }
            this.f11251e = findWindVaneWebView();
            AnythinkVideoView findAnythinkVideoView = findAnythinkVideoView();
            this.f = findAnythinkVideoView;
            findAnythinkVideoView.setVideoLayout(this.C);
            this.f.setIsIV(this.f12262t);
            this.f.setUnitId(this.f12256m);
            this.f.setCamPlayOrderCallback(this.G, this.U, this.H, this.V);
            if (this.y) {
                this.f.setNotchPadding(this.O, this.P, this.Q, this.R);
            }
            AnythinkContainerView findAnythinkContainerView = findAnythinkContainerView();
            this.f11252g = findAnythinkContainerView;
            if (this.y) {
                findAnythinkContainerView.setNotchPadding(this.N, this.O, this.P, this.Q, this.R);
            }
            if (this.f != null && this.f11252g != null && initViews()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f11250d.a(com.anythink.expressad.foundation.e.a.f9728b);
                Activity activity = this.f12255l;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            this.f11249c = true;
            WindVaneWebView windVaneWebView = this.f11251e;
            this.J = new com.anythink.expressad.video.signal.factory.b(this.f12255l, windVaneWebView, this.f, this.f11252g, this.C, new d(this, b10));
            com.anythink.expressad.foundation.d.c cVar2 = this.C;
            if (cVar2 != null && cVar2.k() == 5 && (list = this.U) != null) {
                this.J.a(list);
            }
            registerJsFactory(this.J);
            com.anythink.expressad.foundation.f.b.a().a(this.f12256m + "_1", new AnonymousClass5());
            if (windVaneWebView != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.B.findViewById(i.a(getContext(), "anythink_video_templete_webview_parent", "id"));
                windVaneWebView.setApiManagerJSFactory(this.J);
                if (windVaneWebView.getParent() != null) {
                    defaultLoad(0, "preload template webview is null or load error");
                    return;
                }
                if (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                    this.J.a((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject());
                    getJSCommon().a(this.f12261s);
                    getJSCommon().a(this.f12256m);
                    getJSCommon().a(this.o);
                    getJSCommon().a(new d(this, b10));
                    com.anythink.expressad.foundation.d.c cVar3 = this.C;
                    if (cVar3 != null && (cVar3.H() || this.C.ay())) {
                        MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(getContext());
                        this.ax = mraidVolumeChangeReceiver;
                        mraidVolumeChangeReceiver.registerReceiver();
                        this.ax.getCurrentVolume();
                        this.ax.setVolumeChangeListener(new AnonymousClass6());
                    }
                    getJSContainerModule().readyStatus(((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).r());
                    j();
                    ((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).f11912r.b();
                    if (this.y) {
                        getJSCommon().f(this.aj);
                        getJSCommon().e(this.ak);
                    }
                }
                if (getJSCommon().f() == 1 && (viewGroup = (ViewGroup) this.B.findViewById(i.a(getContext(), "anythink_video_templete_webview_parent", "id"))) != null) {
                    ((ViewGroup) this.B).removeView(viewGroup);
                    ((ViewGroup) this.B).addView(viewGroup, 1);
                }
                viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            o.a(str, "template webview is null");
            defaultLoad(0, "preload template webview is null or load error");
        } catch (Throwable th) {
            a("onCreate error".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        com.anythink.expressad.foundation.d.c cVar;
        int i10;
        if (this.M) {
            return;
        }
        boolean z10 = true;
        this.M = true;
        super.onDestroy();
        try {
            AnythinkVideoView anythinkVideoView = this.f;
            if (anythinkVideoView != null) {
                anythinkVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.f11251e;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f11251e.clearWebView();
                this.f11251e.release();
            }
            if (this.F != null) {
                this.F = null;
            }
            this.f11253h.removeCallbacks(this.f11254i);
            this.f11253h.removeCallbacks(this.f11255j);
            getJSCommon().k();
            if (this.f12262t) {
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.b.c(this.f12256m);
            }
            if (!this.an) {
                try {
                    this.an = true;
                    com.anythink.expressad.foundation.d.c cVar2 = this.C;
                    if (cVar2 != null && cVar2.J() == 2) {
                        this.ao = true;
                    }
                    h hVar = this.E;
                    if (hVar != null) {
                        if (this.f12262t && ((i10 = this.f12264v) == com.anythink.expressad.foundation.g.a.cr || i10 == com.anythink.expressad.foundation.g.a.cs)) {
                            if (this.L != 1) {
                                z10 = false;
                            }
                            hVar.a(z10, this.K);
                        }
                        if (!this.ao) {
                            this.f12259q.a(0);
                        }
                        this.E.a(this.ao, this.f12259q);
                    }
                    this.f11253h.removeCallbacks(this.ay);
                    if (((!this.f12262t && !this.y) || ((cVar = this.C) != null && cVar.j())) && this.ao) {
                        o.a(A, "sendToServerRewardInfo");
                        com.anythink.expressad.video.module.b.a.a(this.C, this.f12259q, this.f12256m, this.f12258p, this.T);
                    }
                    if (!this.y) {
                        if (this.f12262t) {
                            com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aU, this.C);
                        } else {
                            com.anythink.expressad.videocommon.a.b(94, this.C);
                        }
                    }
                    AnythinkContainerView anythinkContainerView = this.f11252g;
                    if (anythinkContainerView != null) {
                        anythinkContainerView.release();
                    }
                } catch (Throwable th) {
                    o.b(A, th.getMessage(), th);
                }
            }
            MraidVolumeChangeReceiver mraidVolumeChangeReceiver = this.ax;
            if (mraidVolumeChangeReceiver != null) {
                mraidVolumeChangeReceiver.unregisterReceiver();
            }
            if (!this.y) {
                if (isLoadSuccess()) {
                    this.f11253h.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (((AbstractJSContainer) ATTempContainer.this).f12255l != null) {
                                ((AbstractJSContainer) ATTempContainer.this).f12255l.finish();
                            }
                        }
                    }, f11245ac);
                } else {
                    Activity activity = this.f12255l;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.f(this.I);
        } catch (Throwable th2) {
            o.a(A, th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.ap = true;
        try {
            getJSVideoModule().videoOperate(2);
            AnythinkContainerView anythinkContainerView = this.f11252g;
            if (anythinkContainerView != null) {
                anythinkContainerView.setOnPause();
            }
        } catch (Throwable th) {
            o.b(A, th.getMessage(), th);
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onResume() {
        Runnable runnable;
        Activity activity;
        super.onResume();
        int i10 = this.ai;
        if (i10 == -3) {
            runnable = this.f11254i;
        } else if (i10 == -4) {
            runnable = this.f11255j;
        } else {
            runnable = null;
        }
        if (runnable != null) {
            runnable.run();
            this.ai = 0;
        }
        try {
            if (this.f != null && !i() && !this.f.isMiniCardShowing() && !com.anythink.expressad.foundation.f.b.f9758c) {
                this.f.setCover(false);
            }
            AnythinkContainerView anythinkContainerView = this.f11252g;
            if (anythinkContainerView != null) {
                anythinkContainerView.setOnResume();
            }
            if (this.ap && !i() && !com.anythink.expressad.foundation.f.b.f9758c) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f12255l;
            if (activity2 != null) {
                t.a(activity2.getWindow().getDecorView());
            }
            if (this.ar && this.as && (activity = this.f12255l) != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            o.b(A, th.getMessage(), th);
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        AnythinkVideoView anythinkVideoView = this.f;
        if (anythinkVideoView != null) {
            anythinkVideoView.setCover(true);
        }
    }

    public void receiveSuccess() {
        o.a(A, "receiveSuccess ,start hybrid");
        this.f11253h.removeCallbacks(this.f11255j);
        this.f11253h.postDelayed(this.ay, 250L);
    }

    public void registerErrorListener(a aVar) {
        this.f11250d = aVar;
    }

    public void setAnythinkTempCallback(com.anythink.expressad.video.bt.module.a.b bVar) {
        this.F = bVar;
    }

    public void setCamPlayOrderCallback(com.anythink.expressad.video.dynview.f.a aVar, int i10) {
        this.G = aVar;
        this.H = i10;
    }

    public void setCampOrderViewData(List<com.anythink.expressad.foundation.d.c> list, int i10) {
        if (list != null) {
            this.U = list;
        }
        this.V = i10;
    }

    public void setCampaign(com.anythink.expressad.foundation.d.c cVar) {
        this.C = cVar;
        if (cVar != null) {
            if (TextUtils.isEmpty(cVar.K()) && !TextUtils.isEmpty(this.f12256m)) {
                cVar.l(this.f12256m);
            }
            com.anythink.expressad.foundation.f.b.a().a(cVar.K() + "_1", cVar);
        }
    }

    public void setCampaignDownLoadTask(com.anythink.expressad.videocommon.b.c cVar) {
        this.D = cVar;
    }

    public void setCampaignExpired(boolean z10) {
        try {
            com.anythink.expressad.foundation.d.c cVar = this.C;
            if (cVar != null) {
                if (z10) {
                    cVar.e(1);
                    if (this.f12263u) {
                        this.C.m(0);
                        return;
                    }
                    com.anythink.expressad.videocommon.e.d dVar = this.o;
                    if (dVar != null) {
                        if (dVar.M() == 1) {
                            this.C.m(1);
                            return;
                        } else {
                            this.C.m(0);
                            return;
                        }
                    }
                    return;
                }
                cVar.e(0);
                if (this.C.A()) {
                    this.C.m(0);
                    return;
                }
                com.anythink.expressad.videocommon.e.d dVar2 = this.o;
                if (dVar2 != null) {
                    this.C.m(dVar2.a());
                }
            }
        } catch (Exception e10) {
            o.d(A, e10.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.T = str;
    }

    public void setH5Cbp(int i10) {
        this.ak = i10;
    }

    public void setInstanceId(String str) {
        this.I = str;
    }

    public void setJSFactory(com.anythink.expressad.video.signal.factory.b bVar) {
        this.J = bVar;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        this.N = i10;
        this.O = i11;
        this.P = i12;
        this.Q = i13;
        this.R = i14;
        String a10 = com.anythink.expressad.foundation.h.h.a(i10, i11, i12, i13, i14);
        this.S = a10;
        o.d(A, a10);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.S)) {
            getJSCommon().b(this.S);
            if (this.f11251e != null && !TextUtils.isEmpty(this.S)) {
                j.a();
                j.a((WebView) this.f11251e, "oncutoutfetched", Base64.encodeToString(this.S.getBytes(), 0));
            }
        }
        AnythinkVideoView anythinkVideoView = this.f;
        if (anythinkVideoView != null) {
            anythinkVideoView.setNotchPadding(i11, i12, i13, i14);
        }
        AnythinkContainerView anythinkContainerView = this.f11252g;
        if (anythinkContainerView != null) {
            anythinkContainerView.setNotchPadding(i10, i11, i12, i13, i14);
        }
    }

    public void setShowRewardListener(h hVar) {
        this.E = hVar;
    }

    public void setShowingTransparent() {
        int a10;
        Activity activity;
        boolean h10 = h();
        this.ar = h10;
        if (!h10 && (a10 = i.a(getContext(), "anythink_reward_theme", "style")) > 1 && (activity = this.f12255l) != null) {
            activity.setTheme(a10);
        }
    }

    public void setWebViewFront(int i10) {
        this.aj = i10;
    }

    public void superDefaultLoad(int i10, String str) {
        o.d(A, "receiveError:" + i10 + ",descroption:" + str);
        this.f11253h.removeCallbacks(this.f11254i);
        this.f11253h.removeCallbacks(this.f11255j);
        this.f11250d.b();
        WindVaneWebView windVaneWebView = this.f11251e;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    private void d() {
        if (this.f11248a) {
            setMatchParent();
        }
    }

    private int e() {
        com.anythink.expressad.video.signal.a.j b10 = b(this.C);
        if (b10 != null) {
            return b10.c();
        }
        return 0;
    }

    private int f() {
        if (getJSCommon() != null) {
            return getJSCommon().n();
        }
        return 1;
    }

    private int g() {
        com.anythink.expressad.video.signal.a.j b10 = b(this.C);
        if (b10 != null) {
            return b10.b();
        }
        return 0;
    }

    private boolean h() {
        com.anythink.expressad.video.signal.a.j b10 = b(this.C);
        if (b10 != null) {
            return b10.a();
        }
        return false;
    }

    private boolean i() {
        AnythinkVideoView anythinkVideoView = this.f;
        if (anythinkVideoView != null) {
            return anythinkVideoView.isShowingAlertView() || this.f.isInstallDialogShowing();
        }
        return false;
    }

    private void j() {
        int f;
        int e10;
        try {
            if (this.f11251e != null) {
                int i10 = getResources().getConfiguration().orientation;
                if (h()) {
                    f = t.g(getContext());
                    e10 = t.h(getContext());
                    if (com.anythink.expressad.foundation.h.g.a(getContext())) {
                        int i11 = t.i(getContext());
                        if (i10 == 2) {
                            f += i11;
                        } else {
                            e10 += i11;
                        }
                    }
                } else {
                    f = t.f(getContext());
                    e10 = t.e(getContext());
                }
                int c10 = this.C.M().c();
                if (c(this.C) == 1) {
                    c10 = i10;
                }
                getJSNotifyProxy().a(i10, c10, f, e10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.anythink.expressad.foundation.g.a.ch, t.c(getContext()));
                try {
                    if (this.f12259q != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.f12259q.a());
                        jSONObject2.put("amount", this.f12259q.b());
                        jSONObject2.put("id", this.f12260r);
                        jSONObject.put("userId", this.f12258p);
                        jSONObject.put("reward", jSONObject2);
                        jSONObject.put("playVideoMute", this.f12261s);
                        jSONObject.put(g.a.f5311h, this.T);
                    }
                } catch (JSONException e11) {
                    o.a(A, e11.getMessage());
                } catch (Exception e12) {
                    o.a(A, e12.getMessage());
                }
                getJSNotifyProxy().a(jSONObject.toString());
                j.a();
                j.a((WebView) this.f11251e, "oncutoutfetched", Base64.encodeToString(this.S.getBytes(), 0));
                getJSCommon().h();
                loadModuleDatas();
                this.f11253h.postDelayed(this.f11254i, 2000L);
            }
        } catch (Exception e13) {
            if (com.anythink.expressad.a.f6552a) {
                e13.printStackTrace();
            }
        }
    }

    private boolean l() {
        this.f11251e = findWindVaneWebView();
        AnythinkVideoView findAnythinkVideoView = findAnythinkVideoView();
        this.f = findAnythinkVideoView;
        findAnythinkVideoView.setVideoLayout(this.C);
        this.f.setIsIV(this.f12262t);
        this.f.setUnitId(this.f12256m);
        this.f.setCamPlayOrderCallback(this.G, this.U, this.H, this.V);
        if (this.y) {
            this.f.setNotchPadding(this.O, this.P, this.Q, this.R);
        }
        AnythinkContainerView findAnythinkContainerView = findAnythinkContainerView();
        this.f11252g = findAnythinkContainerView;
        if (this.y) {
            findAnythinkContainerView.setNotchPadding(this.N, this.O, this.P, this.Q, this.R);
        }
        return (this.f == null || this.f11252g == null || !initViews()) ? false : true;
    }

    private void m() {
        if (this.o == null) {
            this.o = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f12256m, this.f12262t);
        }
    }

    private void o() {
        int i10;
        try {
            com.anythink.expressad.video.bt.module.a.b bVar = this.F;
            if (bVar != null) {
                if (this.f12262t && ((i10 = this.f12264v) == com.anythink.expressad.foundation.g.a.cr || i10 == com.anythink.expressad.foundation.g.a.cs)) {
                    boolean z10 = true;
                    if (this.L != 1) {
                        z10 = false;
                    }
                    bVar.a(z10, this.K);
                }
                this.F.a(this.I, this.ao, this.f12259q);
                return;
            }
            Activity activity = this.f12255l;
            if (activity != null) {
                activity.finish();
            }
        } catch (Exception unused) {
            Activity activity2 = this.f12255l;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    private void q() {
        ViewGroup viewGroup;
        List<com.anythink.expressad.foundation.d.c> list;
        WindVaneWebView windVaneWebView = this.f11251e;
        byte b10 = 0;
        this.J = new com.anythink.expressad.video.signal.factory.b(this.f12255l, windVaneWebView, this.f, this.f11252g, this.C, new d(this, b10));
        com.anythink.expressad.foundation.d.c cVar = this.C;
        if (cVar != null && cVar.k() == 5 && (list = this.U) != null) {
            this.J.a(list);
        }
        registerJsFactory(this.J);
        com.anythink.expressad.foundation.f.b.a().a(l.p(new StringBuilder(), this.f12256m, "_1"), new AnonymousClass5());
        if (windVaneWebView != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.B.findViewById(i.a(getContext(), "anythink_video_templete_webview_parent", "id"));
            windVaneWebView.setApiManagerJSFactory(this.J);
            if (windVaneWebView.getParent() != null) {
                defaultLoad(0, "preload template webview is null or load error");
                return;
            }
            if (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                this.J.a((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject());
                getJSCommon().a(this.f12261s);
                getJSCommon().a(this.f12256m);
                getJSCommon().a(this.o);
                getJSCommon().a(new d(this, b10));
                com.anythink.expressad.foundation.d.c cVar2 = this.C;
                if (cVar2 != null && (cVar2.H() || this.C.ay())) {
                    MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(getContext());
                    this.ax = mraidVolumeChangeReceiver;
                    mraidVolumeChangeReceiver.registerReceiver();
                    this.ax.getCurrentVolume();
                    this.ax.setVolumeChangeListener(new AnonymousClass6());
                }
                getJSContainerModule().readyStatus(((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).r());
                j();
                ((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).f11912r.b();
                if (this.y) {
                    getJSCommon().f(this.aj);
                    getJSCommon().e(this.ak);
                }
            }
            if (getJSCommon().f() == 1 && (viewGroup = (ViewGroup) this.B.findViewById(i.a(getContext(), "anythink_video_templete_webview_parent", "id"))) != null) {
                ((ViewGroup) this.B).removeView(viewGroup);
                ((ViewGroup) this.B).addView(viewGroup, 1);
            }
            viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        o.a(A, "template webview is null");
        defaultLoad(0, "preload template webview is null or load error");
    }

    private void r() {
        getJSCommon().a(this.f12261s);
        getJSCommon().a(this.f12256m);
        getJSCommon().a(this.o);
        getJSCommon().a(new d(this, (byte) 0));
        com.anythink.expressad.foundation.d.c cVar = this.C;
        if (cVar != null) {
            if (cVar.H() || this.C.ay()) {
                MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(getContext());
                this.ax = mraidVolumeChangeReceiver;
                mraidVolumeChangeReceiver.registerReceiver();
                this.ax.getCurrentVolume();
                this.ax.setVolumeChangeListener(new AnonymousClass6());
            }
        }
    }

    private void t() {
        com.anythink.expressad.foundation.d.c cVar;
        int i10;
        boolean z10 = true;
        try {
            this.an = true;
            com.anythink.expressad.foundation.d.c cVar2 = this.C;
            if (cVar2 != null && cVar2.J() == 2) {
                this.ao = true;
            }
            h hVar = this.E;
            if (hVar != null) {
                if (this.f12262t && ((i10 = this.f12264v) == com.anythink.expressad.foundation.g.a.cr || i10 == com.anythink.expressad.foundation.g.a.cs)) {
                    if (this.L != 1) {
                        z10 = false;
                    }
                    hVar.a(z10, this.K);
                }
                if (!this.ao) {
                    this.f12259q.a(0);
                }
                this.E.a(this.ao, this.f12259q);
            }
            this.f11253h.removeCallbacks(this.ay);
            if (((!this.f12262t && !this.y) || ((cVar = this.C) != null && cVar.j())) && this.ao) {
                o.a(A, "sendToServerRewardInfo");
                com.anythink.expressad.video.module.b.a.a(this.C, this.f12259q, this.f12256m, this.f12258p, this.T);
            }
            if (!this.y) {
                if (this.f12262t) {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aU, this.C);
                } else {
                    com.anythink.expressad.videocommon.a.b(94, this.C);
                }
            }
            AnythinkContainerView anythinkContainerView = this.f11252g;
            if (anythinkContainerView != null) {
                anythinkContainerView.release();
            }
        } catch (Throwable th) {
            o.b(A, th.getMessage(), th);
        }
    }

    private void v() {
        if (isLoadSuccess()) {
            this.f12255l.runOnUiThread(new AnonymousClass7());
        }
    }

    private void w() {
        if (isLoadSuccess()) {
            this.f12255l.runOnUiThread(new AnonymousClass8());
        }
    }

    private static RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public static /* synthetic */ void s(ATTempContainer aTTempContainer) {
        if (aTTempContainer.isLoadSuccess()) {
            aTTempContainer.f12255l.runOnUiThread(new AnonymousClass7());
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.E;
        if (hVar != null) {
            hVar.a(str);
        }
        super.a(str);
    }

    public static /* synthetic */ void k(ATTempContainer aTTempContainer) {
        int i10;
        try {
            com.anythink.expressad.video.bt.module.a.b bVar = aTTempContainer.F;
            if (bVar != null) {
                if (aTTempContainer.f12262t && ((i10 = aTTempContainer.f12264v) == com.anythink.expressad.foundation.g.a.cr || i10 == com.anythink.expressad.foundation.g.a.cs)) {
                    boolean z10 = true;
                    if (aTTempContainer.L != 1) {
                        z10 = false;
                    }
                    bVar.a(z10, aTTempContainer.K);
                }
                aTTempContainer.F.a(aTTempContainer.I, aTTempContainer.ao, aTTempContainer.f12259q);
                return;
            }
            Activity activity = aTTempContainer.f12255l;
            if (activity != null) {
                activity.finish();
            }
        } catch (Exception unused) {
            Activity activity2 = aTTempContainer.f12255l;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public static /* synthetic */ void u(ATTempContainer aTTempContainer) {
        if (aTTempContainer.isLoadSuccess()) {
            aTTempContainer.f12255l.runOnUiThread(new AnonymousClass8());
        }
    }

    private void a(int i10, String str) {
        try {
            r rVar = new r();
            rVar.h(r.f9707i);
            rVar.c("code=" + i10 + ",desc=" + str);
            com.anythink.expressad.foundation.d.c cVar = this.C;
            rVar.b((cVar == null || cVar.M() == null) ? "" : this.C.M().e());
            rVar.f(this.f12256m);
            com.anythink.expressad.foundation.d.c cVar2 = this.C;
            rVar.g(cVar2 != null ? cVar2.aZ() : "");
            com.anythink.expressad.foundation.d.c cVar3 = this.C;
            if (cVar3 != null && !TextUtils.isEmpty(cVar3.Z())) {
                rVar.d(this.C.Z());
            }
            com.anythink.expressad.foundation.d.c cVar4 = this.C;
            if (cVar4 != null && !TextUtils.isEmpty(cVar4.aa())) {
                rVar.e(this.C.aa());
            }
            getContext();
            int a10 = k.a();
            rVar.c(a10);
            rVar.j(k.a(getContext(), a10));
            r.a(rVar);
            com.anythink.expressad.video.module.b.a.a();
        } catch (Throwable th) {
            o.b(A, th.getMessage(), th);
        }
    }

    public void preload() {
    }

    private int a(int i10, int i11) {
        List<com.anythink.expressad.foundation.d.c> list;
        if (i10 < 0 || (list = this.U) == null || list.size() == 0 || i11 <= 1) {
            return i10;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11 - 1; i13++) {
            if (this.U.get(i13) != null) {
                i12 += this.U.get(i13).bi();
            }
        }
        if (i10 > i12) {
            return i10 - i12;
        }
        return 0;
    }

    public ATTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = 1;
        this.I = "";
        this.K = com.anythink.expressad.foundation.g.a.cv;
        this.M = false;
        this.S = "";
        this.U = new ArrayList();
        this.V = 0;
        this.f11248a = false;
        this.f11249c = false;
        this.f11250d = new a.C0135a();
        this.f11253h = new Handler();
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.f11254i = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.ai = -3;
                } else {
                    Log.d(ATTempContainer.A, "run: WebView load timeout");
                    ATTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f11255j = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.ai = -4;
                } else {
                    ATTempContainer.this.defaultLoad(-3, "JS bridge connect timeout");
                }
            }
        };
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.ar = false;
        this.as = false;
        this.at = false;
        this.au = false;
        this.av = false;
        this.aw = false;
        this.ay = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.am != null) {
                    ATTempContainer.this.am.setVisibility(8);
                }
            }
        };
        init(context);
    }

    public void setMediaPlayerUrl(String str) {
    }
}
