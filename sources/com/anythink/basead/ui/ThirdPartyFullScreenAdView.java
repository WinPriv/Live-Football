package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.e.b;
import com.anythink.basead.ui.PanelView;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.h;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class ThirdPartyFullScreenAdView extends BaseScreenAdView {
    public static final String TAG = "ThirdPartyFullScreenAdView";
    View ae;
    Timer af;
    private BaseAd ag;
    private final com.anythink.core.common.i.a ah;
    private final com.anythink.core.common.i.b ai;

    /* renamed from: com.anythink.basead.ui.ThirdPartyFullScreenAdView$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements com.anythink.core.common.i.b {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ThirdPartyFullScreenAdView.this.G();
        }
    }

    /* renamed from: com.anythink.basead.ui.ThirdPartyFullScreenAdView$4 */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ThirdPartyFullScreenAdView thirdPartyFullScreenAdView = ThirdPartyFullScreenAdView.this;
            if (thirdPartyFullScreenAdView.ae != null && thirdPartyFullScreenAdView.K != null && thirdPartyFullScreenAdView.ag != null) {
                ThirdPartyFullScreenAdView thirdPartyFullScreenAdView2 = ThirdPartyFullScreenAdView.this;
                boolean z10 = !thirdPartyFullScreenAdView2.M;
                thirdPartyFullScreenAdView2.M = z10;
                thirdPartyFullScreenAdView2.K.setMute(z10);
                ThirdPartyFullScreenAdView.this.ag.setVideoMute(ThirdPartyFullScreenAdView.this.M);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.ThirdPartyFullScreenAdView$5 */
    /* loaded from: classes.dex */
    public class AnonymousClass5 extends TimerTask {
        public AnonymousClass5() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ThirdPartyFullScreenAdView thirdPartyFullScreenAdView = ThirdPartyFullScreenAdView.this;
            ThirdPartyFullScreenAdView.a(thirdPartyFullScreenAdView, (int) thirdPartyFullScreenAdView.ag.getVideoProgress());
        }
    }

    public ThirdPartyFullScreenAdView(Context context) {
        super(context);
        this.ah = com.anythink.core.common.i.c.a();
        this.ai = new com.anythink.core.common.i.b() { // from class: com.anythink.basead.ui.ThirdPartyFullScreenAdView.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ThirdPartyFullScreenAdView.this.G();
            }
        };
    }

    private void K() {
        int i10 = this.L;
        if (i10 < 0) {
            return;
        }
        if (i10 > 0) {
            this.ah.a(this.ai, i10, true);
        } else {
            G();
        }
    }

    private void L() {
        ArrayList arrayList = new ArrayList();
        int x10 = this.f4119c.f5664m.x();
        if (x10 != 0) {
            if (x10 != 1) {
                if (x10 == 2) {
                    arrayList.addAll(this.y.getClickViews());
                    arrayList.add(this.y);
                }
            } else if (this.y.getCTAButton() != null) {
                arrayList.add(this.y.getCTAButton());
            }
        } else {
            arrayList.addAll(this.y.getClickViews());
            arrayList.add(this.y);
            BaseEndCardView baseEndCardView = this.f4168z;
            if (baseEndCardView != null) {
                arrayList.add(baseEndCardView);
            }
        }
        this.ag.registerListener(this, arrayList, null);
    }

    private void M() {
        if (this.af == null) {
            Timer timer = new Timer();
            this.af = timer;
            timer.schedule(new AnonymousClass5(), 0L, 300L);
        }
    }

    private void N() {
        Timer timer = this.af;
        if (timer != null) {
            timer.cancel();
        }
    }

    private void O() {
        Timer timer = this.af;
        if (timer != null) {
            timer.cancel();
            this.af = null;
        }
        this.ah.a(this.ai);
    }

    public static /* synthetic */ void b(ThirdPartyFullScreenAdView thirdPartyFullScreenAdView) {
        Timer timer = thirdPartyFullScreenAdView.af;
        if (timer != null) {
            timer.cancel();
        }
    }

    private void e(int i10) {
        post(new g(i10, 0, this));
    }

    public /* synthetic */ void f(int i10) {
        int i11 = i10 * 1000;
        CountDownView countDownView = this.H;
        if (countDownView != null && countDownView.isShown()) {
            this.H.refresh(i11);
        }
        int i12 = this.L;
        if (i12 >= 0 && i11 >= i12) {
            G();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void A() {
        super.C();
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void G() {
        super.G();
        this.ah.a(this.ai);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void H() {
        int a10;
        View shakeView;
        if (this.f4166w != null && this.f4168z != null) {
            this.f4168z.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            if (c(this.Q)) {
                int i10 = this.Q;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 == 8 && (shakeView = this.y.getShakeView()) != null) {
                                    shakeView.setVisibility(8);
                                }
                            }
                        } else {
                            int i11 = this.D;
                            int i12 = (int) (i11 * 0.5f);
                            this.f4168z.setLayoutParams(new RelativeLayout.LayoutParams(-1, i11 - i12));
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.width = this.C;
                                layoutParams.height = i12;
                                this.y.setLayoutParams(layoutParams);
                                this.y.removeAllViews();
                                this.y.setLayoutType(this.Q);
                            }
                        }
                    }
                    int a11 = h.a(getContext(), 300.0f);
                    this.f4168z.setLayoutParams(new RelativeLayout.LayoutParams(this.C - a11, -1));
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = a11;
                        layoutParams2.height = -1;
                        this.y.setLayoutParams(layoutParams2);
                        this.y.removeAllViews();
                        this.y.setLayoutType(this.Q);
                    }
                } else {
                    this.f4166w.setBackgroundColor(-1);
                    int i13 = (int) (this.D * 0.5f);
                    if (TextUtils.isEmpty(this.f4120d.t())) {
                        a10 = this.D - i13;
                    } else {
                        a10 = (this.D - i13) + h.a(getContext(), 50.0f);
                    }
                    this.f4168z.setLayoutParams(new RelativeLayout.LayoutParams(-1, i13));
                    this.f4168z.setNeedArc(true);
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.width = this.C;
                        layoutParams3.height = a10;
                        this.y.setLayoutParams(layoutParams3);
                        this.y.removeAllViews();
                        this.y.setLayoutType(this.Q);
                    }
                }
            }
            this.f4166w.addView(this.f4168z, 1);
            L();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void I() {
        View view = this.ae;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.ae.getParent()).removeView(this.ae);
        }
        CountDownView countDownView = this.H;
        if (countDownView != null) {
            countDownView.setVisibility(8);
        }
        MuteImageView muteImageView = this.K;
        if (muteImageView != null) {
            muteImageView.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void J() {
        this.O = this.C;
        this.P = this.D;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView, com.anythink.basead.ui.BaseAdView
    public final void a() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_thirdparty_full_screen", "layout"), this);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView, com.anythink.basead.ui.BaseAdView
    public void destroy() {
        super.destroy();
        Timer timer = this.af;
        if (timer != null) {
            timer.cancel();
            this.af = null;
        }
        this.ah.a(this.ai);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public void init() {
        b();
        this.F = c(this.Q);
        this.ag.setNativeEventListener(new m() { // from class: com.anythink.basead.ui.ThirdPartyFullScreenAdView.2
            public AnonymousClass2() {
            }

            @Override // com.anythink.core.common.b.m
            public final void a(String str, String str2) {
                ThirdPartyFullScreenAdView.this.p();
                ThirdPartyFullScreenAdView.this.a(com.anythink.basead.c.f.a(str, str2));
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdClicked(View view) {
                b.InterfaceC0061b interfaceC0061b = ThirdPartyFullScreenAdView.this.E;
                if (interfaceC0061b != null) {
                    interfaceC0061b.a(1);
                }
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdImpressed() {
                b.InterfaceC0061b interfaceC0061b = ThirdPartyFullScreenAdView.this.E;
                if (interfaceC0061b != null) {
                    interfaceC0061b.a();
                }
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdVideoEnd() {
                ThirdPartyFullScreenAdView.b(ThirdPartyFullScreenAdView.this);
                ThirdPartyFullScreenAdView.this.G();
                b.InterfaceC0061b interfaceC0061b = ThirdPartyFullScreenAdView.this.E;
                if (interfaceC0061b != null) {
                    interfaceC0061b.c();
                }
                ThirdPartyFullScreenAdView.this.p();
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdVideoProgress(int i10) {
                ThirdPartyFullScreenAdView.b(ThirdPartyFullScreenAdView.this);
                ThirdPartyFullScreenAdView.a(ThirdPartyFullScreenAdView.this, i10);
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdVideoStart() {
                ThirdPartyFullScreenAdView.a(ThirdPartyFullScreenAdView.this);
                b.InterfaceC0061b interfaceC0061b = ThirdPartyFullScreenAdView.this.E;
                if (interfaceC0061b != null) {
                    interfaceC0061b.b();
                }
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdDislikeButtonClick() {
            }

            @Override // com.anythink.core.common.b.l
            public final void onDeeplinkCallback(boolean z10) {
            }

            @Override // com.anythink.core.common.b.l
            public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            }
        });
        if (!this.f4164u) {
            int i10 = ((BaseScreenAdView) this).f4158a;
            if (1 != i10 && 3 == i10) {
                if (TextUtils.equals(this.ag.getAdType(), "1") && this.ae != null) {
                    J();
                    c();
                    int i11 = this.L;
                    if (i11 >= 0) {
                        if (i11 > 0) {
                            this.ah.a(this.ai, i11, true);
                            return;
                        } else {
                            G();
                            return;
                        }
                    }
                    return;
                }
            } else {
                return;
            }
        }
        J();
        p();
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final int q() {
        int i10 = this.Q;
        if (i10 == 8) {
            return i10;
        }
        if (this.C < this.D) {
            if (this.f4161ac >= this.f4162ad) {
                return 1;
            }
            return 5;
        }
        if (this.f4161ac < this.f4162ad) {
            return 2;
        }
        return 6;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void u() {
        String u2 = this.f4120d.u();
        if (!TextUtils.isEmpty(u2)) {
            com.anythink.basead.a.f.a();
            int[] a10 = com.anythink.core.common.k.b.a(com.anythink.basead.a.f.a(2, u2));
            if (a10 != null) {
                this.f4161ac = a10[0];
                this.f4162ad = a10[1];
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void v() {
        PanelView panelView = this.y;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.y.init(this.f4120d, this.f4119c, this.f4163t, false, new PanelView.a() { // from class: com.anythink.basead.ui.ThirdPartyFullScreenAdView.3
                public AnonymousClass3() {
                }

                @Override // com.anythink.basead.ui.PanelView.a
                public final boolean b() {
                    return false;
                }

                @Override // com.anythink.basead.ui.PanelView.a
                public final void a() {
                }
            });
        }
        w();
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void w() {
        if (this.y != null) {
            if (!com.anythink.basead.a.e.a(this.f4120d)) {
                this.Q = 8;
            } else {
                this.Q = 0;
            }
            this.y.setLayoutType(this.Q);
            if (this.Q == 8 && this.f4119c.f5664m.x() == 0) {
                this.y.getCTAButton().setVisibility(8);
            }
            this.y.setVisibility(0);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void z() {
        MuteImageView muteImageView = this.K;
        if (muteImageView == null) {
            return;
        }
        if (this.M) {
            muteImageView.setMute(true);
        } else {
            muteImageView.setMute(false);
        }
        this.K.setVisibility(4);
        this.K.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.ThirdPartyFullScreenAdView.4
            public AnonymousClass4() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdPartyFullScreenAdView thirdPartyFullScreenAdView = ThirdPartyFullScreenAdView.this;
                if (thirdPartyFullScreenAdView.ae != null && thirdPartyFullScreenAdView.K != null && thirdPartyFullScreenAdView.ag != null) {
                    ThirdPartyFullScreenAdView thirdPartyFullScreenAdView2 = ThirdPartyFullScreenAdView.this;
                    boolean z10 = !thirdPartyFullScreenAdView2.M;
                    thirdPartyFullScreenAdView2.M = z10;
                    thirdPartyFullScreenAdView2.K.setMute(z10);
                    ThirdPartyFullScreenAdView.this.ag.setVideoMute(ThirdPartyFullScreenAdView.this.M);
                }
            }
        });
    }

    public static /* synthetic */ void a(ThirdPartyFullScreenAdView thirdPartyFullScreenAdView) {
        if (thirdPartyFullScreenAdView.af == null) {
            Timer timer = new Timer();
            thirdPartyFullScreenAdView.af = timer;
            timer.schedule(new AnonymousClass5(), 0L, 300L);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void c() {
        View view = this.ae;
        if (view != null) {
            this.f4166w.addView(view, 0, new RelativeLayout.LayoutParams(-1, -1));
            d(((int) this.ag.getVideoDuration()) * 1000);
            D();
            L();
        }
    }

    public ThirdPartyFullScreenAdView(Context context, j jVar, i iVar, String str, int i10, int i11, BaseAd baseAd) {
        super(context, jVar, iVar, str, i10, i11);
        this.ah = com.anythink.core.common.i.c.a();
        this.ai = new com.anythink.core.common.i.b() { // from class: com.anythink.basead.ui.ThirdPartyFullScreenAdView.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ThirdPartyFullScreenAdView.this.G();
            }
        };
        this.ag = baseAd;
        this.ae = baseAd.getAdMediaView(new Object[0]);
        setId(h.a(getContext(), "myoffer_thirdparty_full_screen_view_id", "id"));
        this.G = 0;
    }

    public static /* synthetic */ void a(ThirdPartyFullScreenAdView thirdPartyFullScreenAdView, final int i10) {
        thirdPartyFullScreenAdView.post(new Runnable() { // from class: com.anythink.basead.ui.f
            @Override // java.lang.Runnable
            public final void run() {
                ThirdPartyFullScreenAdView.this.f(i10);
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final boolean c(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 5 || i10 == 6) {
            return com.anythink.basead.a.e.a(this.f4120d);
        }
        return i10 == 8;
    }

    /* renamed from: com.anythink.basead.ui.ThirdPartyFullScreenAdView$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements m {
        public AnonymousClass2() {
        }

        @Override // com.anythink.core.common.b.m
        public final void a(String str, String str2) {
            ThirdPartyFullScreenAdView.this.p();
            ThirdPartyFullScreenAdView.this.a(com.anythink.basead.c.f.a(str, str2));
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdClicked(View view) {
            b.InterfaceC0061b interfaceC0061b = ThirdPartyFullScreenAdView.this.E;
            if (interfaceC0061b != null) {
                interfaceC0061b.a(1);
            }
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdImpressed() {
            b.InterfaceC0061b interfaceC0061b = ThirdPartyFullScreenAdView.this.E;
            if (interfaceC0061b != null) {
                interfaceC0061b.a();
            }
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdVideoEnd() {
            ThirdPartyFullScreenAdView.b(ThirdPartyFullScreenAdView.this);
            ThirdPartyFullScreenAdView.this.G();
            b.InterfaceC0061b interfaceC0061b = ThirdPartyFullScreenAdView.this.E;
            if (interfaceC0061b != null) {
                interfaceC0061b.c();
            }
            ThirdPartyFullScreenAdView.this.p();
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdVideoProgress(int i10) {
            ThirdPartyFullScreenAdView.b(ThirdPartyFullScreenAdView.this);
            ThirdPartyFullScreenAdView.a(ThirdPartyFullScreenAdView.this, i10);
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdVideoStart() {
            ThirdPartyFullScreenAdView.a(ThirdPartyFullScreenAdView.this);
            b.InterfaceC0061b interfaceC0061b = ThirdPartyFullScreenAdView.this.E;
            if (interfaceC0061b != null) {
                interfaceC0061b.b();
            }
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdDislikeButtonClick() {
        }

        @Override // com.anythink.core.common.b.l
        public final void onDeeplinkCallback(boolean z10) {
        }

        @Override // com.anythink.core.common.b.l
        public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        }
    }

    /* renamed from: com.anythink.basead.ui.ThirdPartyFullScreenAdView$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements PanelView.a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.basead.ui.PanelView.a
        public final boolean b() {
            return false;
        }

        @Override // com.anythink.basead.ui.PanelView.a
        public final void a() {
        }
    }
}
