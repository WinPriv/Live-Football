package com.anythink.basead.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.a.b.g;
import com.anythink.basead.c;
import com.anythink.basead.c.i;
import com.anythink.basead.e.b;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.basead.ui.EndCardView;
import com.anythink.basead.ui.MraidEndCardView;
import com.anythink.basead.ui.PanelView;
import com.anythink.basead.ui.PlayerView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.ac;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.k.h;
import com.anythink.expressad.video.module.a.a.m;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class BaseScreenAdView extends BaseAdView {
    public static final int FORMAT_INTERSTITIAL = 3;
    public static final int FORMAT_REWARD_VIDEO = 1;
    public static final String TAG = "BaseScreenAdView";
    public static final int TYPE_FULL_SCREEN = 0;
    public static final int TYPE_HALF_SCREEN = 1;
    protected b A;
    int B;
    protected int C;
    protected int D;
    protected b.InterfaceC0061b E;
    protected boolean F;
    protected int G;
    protected CountDownView H;
    protected CloseImageView I;
    protected ViewGroup J;
    protected MuteImageView K;
    protected int L;
    protected boolean M;
    protected float N;
    protected int O;
    protected int P;
    protected int Q;
    protected BaseShakeView R;
    protected BaseShakeView S;
    final long T;
    final long U;
    Runnable V;
    ConcurrentHashMap<Integer, Boolean> W;

    /* renamed from: a, reason: collision with root package name */
    protected int f4158a;

    /* renamed from: aa, reason: collision with root package name */
    protected int f4159aa;

    /* renamed from: ab, reason: collision with root package name */
    protected int f4160ab;

    /* renamed from: ac, reason: collision with root package name */
    protected int f4161ac;

    /* renamed from: ad, reason: collision with root package name */
    protected int f4162ad;
    private boolean ae;
    private boolean af;
    private long ag;
    private long ah;
    private long ai;
    private long aj;
    private com.anythink.basead.c ak;
    private boolean al;
    private boolean am;
    private boolean an;

    /* renamed from: t, reason: collision with root package name */
    protected int f4163t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f4164u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f4165v;

    /* renamed from: w, reason: collision with root package name */
    protected RelativeLayout f4166w;

    /* renamed from: x, reason: collision with root package name */
    protected PlayerView f4167x;
    protected PanelView y;

    /* renamed from: z, reason: collision with root package name */
    protected BaseEndCardView f4168z;

    /* renamed from: com.anythink.basead.ui.BaseScreenAdView$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements c.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.c.a
        public final void a() {
            BaseScreenAdView.c(BaseScreenAdView.this);
        }

        @Override // com.anythink.basead.c.a
        public final void b() {
            BaseScreenAdView.this.r();
            BaseScreenAdView.this.ak.b();
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseScreenAdView$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseScreenAdView.this.A();
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseScreenAdView$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass8 implements View.OnClickListener {
        public AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseScreenAdView.f(BaseScreenAdView.this);
        }
    }

    public BaseScreenAdView(Context context) {
        super(context);
        this.G = 0;
        this.al = false;
        this.T = m.ag;
        this.U = 500L;
        this.am = false;
        this.an = false;
        this.V = new Runnable() { // from class: com.anythink.basead.ui.BaseScreenAdView.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseScreenAdView.super.h();
            }
        };
    }

    private void K() {
        if (n() && !this.f4119c.f5664m.V() && this.f4168z == null) {
            this.f4168z = b(true);
        }
    }

    private void L() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.C = displayMetrics.widthPixels;
        this.D = displayMetrics.heightPixels;
    }

    private void M() {
        if (this.f4168z == null) {
            this.f4168z = b(false);
        }
        H();
    }

    private void N() {
        int q10 = q();
        this.Q = q10;
        final boolean c10 = c(q10);
        EndCardView endCardView = new EndCardView(getContext(), this.f4120d, this.f4119c);
        endCardView.setSize(this.C, this.D);
        endCardView.init(false, false, new EndCardView.a() { // from class: com.anythink.basead.ui.BaseScreenAdView.16
            @Override // com.anythink.basead.ui.EndCardView.a
            public final void a() {
                String str = BaseScreenAdView.TAG;
                BaseScreenAdView.this.b(1);
            }

            @Override // com.anythink.basead.ui.EndCardView.a
            public final void b() {
                BaseScreenAdView.this.I();
                if (c10) {
                    BaseScreenAdView.this.E();
                }
            }
        });
        this.f4168z = endCardView;
        H();
        PanelView panelView = this.y;
        if (panelView != null && panelView.getVisibility() == 0) {
            if (this.y.getCTAButton() != null && this.y.getCTAButton().getVisibility() == 0) {
                this.f4133s = this.y.getCTAButton();
            } else {
                this.f4133s = this.y;
            }
        }
        endCardView.load();
    }

    private void O() {
        s();
        if (this.ak == null) {
            this.ak = new com.anythink.basead.c();
        }
        this.ak.a(getContext(), this.f4120d, this.f4119c, new AnonymousClass2());
    }

    private void P() {
        this.ae = true;
        ViewGroup viewGroup = this.J;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    private void Q() {
        if (this.A == null) {
            this.A = new b(this.f4166w);
        }
        this.A.b();
    }

    private void R() {
        b bVar = this.A;
        if (bVar != null) {
            bVar.c();
        }
    }

    private void S() {
        com.anythink.basead.a.b.a(1, this.f4120d, i());
        b.InterfaceC0061b interfaceC0061b = this.E;
        if (interfaceC0061b != null) {
            interfaceC0061b.b();
        }
    }

    private void T() {
        CountDownView countDownView = this.H;
        if (countDownView != null) {
            countDownView.setVisibility(4);
        }
    }

    private void U() {
        CloseImageView closeImageView = this.I;
        if (closeImageView != null) {
            this.N = a(closeImageView, this.f4119c.f5664m.h());
            this.I.setVisibility(8);
            this.I.setOnClickListener(new AnonymousClass7());
        }
    }

    private void V() {
        ViewGroup viewGroup = this.J;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.J.setOnClickListener(new AnonymousClass8());
        }
    }

    private void W() {
        ViewGroup viewGroup;
        if (!this.ae && (viewGroup = this.J) != null && !viewGroup.isShown()) {
            this.J.setVisibility(0);
        }
    }

    public abstract void A();

    public final void B() {
        PlayerView playerView = this.f4167x;
        if (playerView != null && playerView.isPlaying()) {
            this.f4167x.stop();
            this.f4167x.removeAllViews();
            i i10 = i();
            i10.f3788g = j();
            com.anythink.basead.a.b.a(16, this.f4120d, i10);
        }
    }

    public final void C() {
        i i10 = i();
        i10.f3788g = j();
        com.anythink.basead.a.b.a(7, this.f4120d, i10);
        b.InterfaceC0061b interfaceC0061b = this.E;
        if (interfaceC0061b != null) {
            interfaceC0061b.e();
        }
    }

    public void D() {
        CountDownView countDownView = this.H;
        if (countDownView != null && !countDownView.isShown()) {
            this.H.setVisibility(0);
        }
        MuteImageView muteImageView = this.K;
        if (muteImageView != null && !muteImageView.isShown()) {
            this.K.setVisibility(0);
        }
    }

    public final void E() {
        if (this.y.getVisibility() != 0) {
            this.y.setVisibility(0);
        }
    }

    public void F() {
        if (this.y.getVisibility() != 8) {
            this.y.setVisibility(8);
        }
    }

    public void G() {
        ViewGroup viewGroup;
        CloseImageView closeImageView = this.I;
        if (closeImageView != null && !closeImageView.isShown()) {
            this.I.setVisibility(0);
            this.I.setClickAreaScaleFactor(this.N);
        }
        if (!this.ae && (viewGroup = this.J) != null && !viewGroup.isShown()) {
            this.J.setVisibility(0);
        }
    }

    public abstract void H();

    public abstract void I();

    public abstract void J();

    @Override // com.anythink.basead.ui.BaseAdView
    public void a() {
    }

    public void b() {
        this.f4166w = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_rl_root", "id"));
        this.f4167x = (PlayerView) findViewById(h.a(getContext(), "myoffer_player_view_id", "id"));
        this.y = (PanelView) findViewById(h.a(getContext(), "myoffer_banner_view_id", "id"));
        this.H = (CountDownView) findViewById(h.a(getContext(), "myoffer_count_down_view_id", "id"));
        this.K = (MuteImageView) findViewById(h.a(getContext(), "myoffer_btn_mute_id", "id"));
        this.I = (CloseImageView) findViewById(h.a(getContext(), "myoffer_btn_close_id", "id"));
        this.J = (ViewGroup) findViewById(h.a(getContext(), "myoffer_feedback_ll_id", "id"));
        CountDownView countDownView = this.H;
        if (countDownView != null) {
            countDownView.setVisibility(4);
        }
        z();
        CloseImageView closeImageView = this.I;
        if (closeImageView != null) {
            this.N = a(closeImageView, this.f4119c.f5664m.h());
            this.I.setVisibility(8);
            this.I.setOnClickListener(new AnonymousClass7());
        }
        ViewGroup viewGroup = this.J;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.J.setOnClickListener(new AnonymousClass8());
        }
        v();
    }

    public void c() {
        this.f4167x.setListener(new PlayerView.a() { // from class: com.anythink.basead.ui.BaseScreenAdView.9
            @Override // com.anythink.basead.ui.PlayerView.a
            public final void a() {
                String str = BaseScreenAdView.TAG;
                BaseScreenAdView.this.D();
                BaseScreenAdView.this.aj = System.currentTimeMillis();
                BaseScreenAdView.this.h();
                BaseScreenAdView.b(BaseScreenAdView.this);
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void b() {
                String str = BaseScreenAdView.TAG;
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void c() {
                String str = BaseScreenAdView.TAG;
                i i10 = BaseScreenAdView.this.i();
                com.anythink.basead.a.b.a(5, BaseScreenAdView.this.f4120d, i10);
                com.anythink.basead.a.b.a(31, BaseScreenAdView.this.f4120d, i10);
                b.InterfaceC0061b interfaceC0061b = BaseScreenAdView.this.E;
                if (interfaceC0061b != null) {
                    interfaceC0061b.c();
                }
                BaseScreenAdView baseScreenAdView = BaseScreenAdView.this;
                if (!baseScreenAdView.f4165v) {
                    baseScreenAdView.f4165v = true;
                    b.InterfaceC0061b interfaceC0061b2 = baseScreenAdView.E;
                    if (interfaceC0061b2 != null) {
                        interfaceC0061b2.d();
                    }
                }
                if (BaseScreenAdView.this.f4119c.f5664m.J() == 1) {
                    BaseScreenAdView.this.p();
                    BaseScreenAdView.this.l();
                    return;
                }
                BaseScreenAdView.this.l();
                BaseScreenAdView baseScreenAdView2 = BaseScreenAdView.this;
                CloseImageView closeImageView = baseScreenAdView2.I;
                if (closeImageView != null) {
                    baseScreenAdView2.a(closeImageView);
                }
                BaseScreenAdView.this.C();
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void d() {
                BaseScreenAdView baseScreenAdView = BaseScreenAdView.this;
                BaseScreenAdView.c(baseScreenAdView, baseScreenAdView.f4167x.getCurrentPosition());
                i i10 = BaseScreenAdView.this.i();
                i10.f3788g = BaseScreenAdView.this.j();
                com.anythink.basead.a.b.a(14, BaseScreenAdView.this.f4120d, i10);
                k kVar = BaseScreenAdView.this.f4119c.f5664m;
                if (kVar != null && kVar.u() == 1) {
                    BaseScreenAdView.this.b(1);
                }
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void e() {
                String str = BaseScreenAdView.TAG;
                i i10 = BaseScreenAdView.this.i();
                i10.f3788g = BaseScreenAdView.this.j();
                com.anythink.basead.a.b.a(12, BaseScreenAdView.this.f4120d, i10);
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void f() {
                String str = BaseScreenAdView.TAG;
                i i10 = BaseScreenAdView.this.i();
                i10.f3788g = BaseScreenAdView.this.j();
                com.anythink.basead.a.b.a(13, BaseScreenAdView.this.f4120d, i10);
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void g() {
                BaseScreenAdView baseScreenAdView = BaseScreenAdView.this;
                j jVar = baseScreenAdView.f4119c;
                new com.anythink.basead.a.b.f(jVar.f5654b, baseScreenAdView.f4120d, jVar.f5664m).b();
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void b(int i10) {
                i i11 = BaseScreenAdView.this.i();
                if (i10 == 25) {
                    String str = BaseScreenAdView.TAG;
                    com.anythink.basead.a.b.a(2, BaseScreenAdView.this.f4120d, i11);
                } else if (i10 == 50) {
                    String str2 = BaseScreenAdView.TAG;
                    com.anythink.basead.a.b.a(3, BaseScreenAdView.this.f4120d, i11);
                } else {
                    if (i10 != 75) {
                        return;
                    }
                    String str3 = BaseScreenAdView.TAG;
                    com.anythink.basead.a.b.a(4, BaseScreenAdView.this.f4120d, i11);
                }
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void a(int i10) {
                BaseScreenAdView.this.D();
                BaseScreenAdView.a(BaseScreenAdView.this, i10);
                BaseScreenAdView.b(BaseScreenAdView.this, i10);
                CountDownView countDownView = BaseScreenAdView.this.H;
                if (countDownView != null && countDownView.isShown()) {
                    BaseScreenAdView.this.H.refresh(i10);
                }
                BaseScreenAdView baseScreenAdView = BaseScreenAdView.this;
                int i11 = baseScreenAdView.L;
                if (i11 >= 0 && i10 >= i11) {
                    baseScreenAdView.G();
                }
                if (i10 >= BaseScreenAdView.this.f4119c.f5664m.e()) {
                    BaseScreenAdView baseScreenAdView2 = BaseScreenAdView.this;
                    if (baseScreenAdView2.f4165v) {
                        return;
                    }
                    baseScreenAdView2.G();
                    BaseScreenAdView baseScreenAdView3 = BaseScreenAdView.this;
                    baseScreenAdView3.f4165v = true;
                    b.InterfaceC0061b interfaceC0061b = baseScreenAdView3.E;
                    if (interfaceC0061b != null) {
                        interfaceC0061b.d();
                    }
                }
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void a(com.anythink.basead.c.e eVar) {
                BaseScreenAdView.this.p();
                i i10 = BaseScreenAdView.this.i();
                i10.f3789h = BaseScreenAdView.this.fillVideoEndRecord(false);
                com.anythink.basead.a.b.a(17, BaseScreenAdView.this.f4120d, i10);
                BaseScreenAdView.this.a(eVar);
                BaseScreenAdView baseScreenAdView = BaseScreenAdView.this;
                if (!baseScreenAdView.f4165v && baseScreenAdView.f4119c.f5664m.f() == 1 && com.anythink.basead.c.f.C.equals(eVar.b())) {
                    BaseScreenAdView baseScreenAdView2 = BaseScreenAdView.this;
                    baseScreenAdView2.f4165v = true;
                    b.InterfaceC0061b interfaceC0061b = baseScreenAdView2.E;
                    if (interfaceC0061b != null) {
                        interfaceC0061b.d();
                    }
                }
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void c(int i10) {
                BaseScreenAdView.this.d(i10);
                com.anythink.basead.a.b.a(35, BaseScreenAdView.this.f4120d, BaseScreenAdView.this.i());
            }
        });
        this.f4167x.initMuteStatus(this.M);
        this.f4167x.setVideoSize(this.O, this.P);
        this.f4167x.setVideoRateConfig(this.f4120d.k().S(), this.f4120d.k().T());
        this.f4167x.load(this.f4120d.x(), false);
    }

    public abstract boolean c(int i10);

    @Override // com.anythink.basead.ui.BaseAdView
    public void destroy() {
        super.destroy();
        this.E = null;
        BaseEndCardView baseEndCardView = this.f4168z;
        if (baseEndCardView != null) {
            baseEndCardView.a();
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void e() {
        com.anythink.basead.a.b.a(8, this.f4120d, i());
        b.InterfaceC0061b interfaceC0061b = this.E;
        if (interfaceC0061b != null) {
            interfaceC0061b.a();
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void f() {
        this.af = true;
        if (this.A == null) {
            this.A = new b(this.f4166w);
        }
        this.A.b();
    }

    public com.anythink.basead.c.j fillVideoEndRecord(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        com.anythink.basead.c.j jVar = new com.anythink.basead.c.j();
        int i15 = 1;
        int i16 = 2;
        if (this.f4163t == 2) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        jVar.f3808l = i10;
        jVar.f3809r = 1;
        PlayerView playerView = this.f4167x;
        int i17 = 0;
        if (playerView != null) {
            i11 = playerView.getVideoLength() / 1000;
        } else {
            i11 = 0;
        }
        jVar.f3800a = i11;
        jVar.f3801b = this.B / 1000;
        PlayerView playerView2 = this.f4167x;
        if (playerView2 != null) {
            i12 = playerView2.getCurrentPosition() / 1000;
        } else {
            i12 = 0;
        }
        jVar.f3802c = i12;
        int i18 = this.B;
        if (i18 == 0) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        jVar.f3803d = i13;
        if (i18 == 0) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        jVar.o = i14;
        PlayerView playerView3 = this.f4167x;
        if (playerView3 == null || playerView3.getCurrentPosition() != this.f4167x.getVideoLength()) {
            i15 = 0;
        }
        jVar.f3804e = i15;
        if (z10) {
            i16 = 0;
        }
        jVar.f3810u = i16;
        jVar.f = this.aj;
        jVar.f3805g = System.currentTimeMillis();
        PlayerView playerView4 = this.f4167x;
        if (playerView4 != null) {
            i17 = playerView4.getCurrentPosition();
        }
        jVar.f3806h = i17;
        jVar.toString();
        return jVar;
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void g() {
        this.af = false;
        post(new Runnable() { // from class: com.anythink.basead.ui.BaseScreenAdView.3
            @Override // java.lang.Runnable
            public final void run() {
                BaseScreenAdView.e(BaseScreenAdView.this);
            }
        });
    }

    public float getCloseButtonScaleFactor() {
        return this.N;
    }

    public boolean getHasPerformClick() {
        return this.an;
    }

    public long getHideBannerTime() {
        return this.ai;
    }

    public long getShowBannerTime() {
        return this.ag;
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final synchronized void h() {
        if (this.f4119c.f5664m.R() > 0) {
            n.a().a(this.V, this.f4119c.f5664m.R());
        } else {
            super.h();
        }
    }

    public boolean hasReward() {
        return this.f4165v;
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final i i() {
        i iVar = new i(this.f4119c.f5656d, this.f4131q);
        iVar.f3787e = getWidth();
        iVar.f = getHeight();
        PlayerView playerView = this.f4167x;
        if (playerView != null && playerView.hasVideo()) {
            iVar.f3789h = fillVideoEndRecord(true);
        }
        return iVar;
    }

    public void init() {
        b();
        this.F = c(this.Q);
        if (this.f4164u) {
            J();
            p();
            return;
        }
        int i10 = this.f4158a;
        if (1 == i10) {
            if (this.f4120d.E()) {
                J();
                c();
                K();
                return;
            } else {
                a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, com.anythink.basead.c.f.D));
                b.InterfaceC0061b interfaceC0061b = this.E;
                if (interfaceC0061b != null) {
                    interfaceC0061b.e();
                    return;
                }
                return;
            }
        }
        if (3 == i10) {
            if (this.f4120d.C() == 1 && this.f4120d.E()) {
                J();
                c();
                K();
            } else {
                J();
                p();
                if (!n()) {
                    h();
                }
            }
        }
    }

    public boolean isShowEndCard() {
        return this.f4164u;
    }

    public boolean isVideoMute() {
        return this.M;
    }

    public boolean needHideFeedbackButton() {
        return this.ae;
    }

    public final void o() {
        BaseShakeView baseShakeView = this.R;
        if (baseShakeView != null) {
            baseShakeView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseScreenAdView.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseScreenAdView.this.b(1);
                }
            });
            this.R.setOnShakeListener(new BaseShakeView.a() { // from class: com.anythink.basead.ui.BaseScreenAdView.11
                @Override // com.anythink.basead.ui.BaseShakeView.a
                public final boolean a() {
                    if (BaseScreenAdView.this.x()) {
                        BaseScreenAdView.this.b(4);
                        return true;
                    }
                    return false;
                }
            }, this.f4119c.f5664m);
        }
        BaseShakeView baseShakeView2 = this.S;
        if (baseShakeView2 != null) {
            baseShakeView2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseScreenAdView.12
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseScreenAdView.this.b(1);
                }
            });
            this.S.setOnShakeListener(new BaseShakeView.a() { // from class: com.anythink.basead.ui.BaseScreenAdView.13
                @Override // com.anythink.basead.ui.BaseShakeView.a
                public final boolean a() {
                    if (BaseScreenAdView.this.x()) {
                        BaseScreenAdView.this.b(4);
                        return true;
                    }
                    return false;
                }
            }, this.f4119c.f5664m);
        }
    }

    public final void p() {
        this.f4164u = true;
        if (n()) {
            M();
        } else {
            N();
        }
        BaseEndCardView baseEndCardView = this.f4168z;
        if (baseEndCardView != null) {
            baseEndCardView.postDelayed(new Runnable() { // from class: com.anythink.basead.ui.BaseScreenAdView.14
                @Override // java.lang.Runnable
                public final void run() {
                    BaseScreenAdView.this.G();
                }
            }, a(this.f4119c.f5664m));
        }
        com.anythink.basead.a.b.a(6, this.f4120d, i());
    }

    public abstract int q();

    public final void r() {
        PlayerView playerView;
        this.am = true;
        try {
            com.anythink.basead.c cVar = this.ak;
            if ((cVar == null || !cVar.a()) && (playerView = this.f4167x) != null && playerView.hasVideo()) {
                if (!this.f4167x.isPlaying()) {
                    this.aj = System.currentTimeMillis();
                    int currentPosition = this.f4167x.getCurrentPosition();
                    this.B = currentPosition;
                    if (currentPosition != 0) {
                        com.anythink.basead.a.b.a(15, this.f4120d, i());
                    }
                }
                this.f4167x.start();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void s() {
        this.am = false;
        PlayerView playerView = this.f4167x;
        if (playerView != null) {
            if (playerView.isPlaying()) {
                com.anythink.basead.a.b.a(11, this.f4120d, i());
            }
            this.f4167x.pause();
        }
    }

    public void setCloseButtonScaleFactor(float f) {
        this.N = f;
        CloseImageView closeImageView = this.I;
        if (closeImageView != null) {
            closeImageView.setClickAreaScaleFactor(f);
        }
    }

    public void setHasPerformClick(boolean z10) {
        this.an = z10;
    }

    public void setHasReward(boolean z10) {
        this.f4165v = z10;
    }

    public void setHideBannerTime(long j10) {
        this.ai = j10;
    }

    public void setHideFeedbackButton(boolean z10) {
        this.ae = z10;
    }

    public void setIsShowEndCard(boolean z10) {
        this.f4164u = z10;
    }

    public void setListener(b.InterfaceC0061b interfaceC0061b) {
        this.E = interfaceC0061b;
    }

    public void setShowBannerTime(long j10) {
        this.ag = j10;
    }

    public void setVideoMute(boolean z10) {
        this.M = z10;
    }

    public final void t() {
        destroy();
        n.a().c(this.V);
    }

    public void u() {
        String u2 = this.f4120d.u();
        if (!TextUtils.isEmpty(u2)) {
            com.anythink.basead.a.f.a();
            int[] a10 = com.anythink.core.common.k.b.a(com.anythink.basead.a.f.a(1, u2));
            if (a10 != null) {
                this.f4161ac = a10[0];
                this.f4162ad = a10[1];
            }
        }
        String x10 = this.f4120d.x();
        if (!TextUtils.isEmpty(x10)) {
            com.anythink.basead.a.f.a();
            g.a a11 = com.anythink.basead.a.b.g.a(com.anythink.basead.a.f.a(4, x10));
            if (a11 != null) {
                this.f4159aa = a11.f3607a;
                this.f4160ab = a11.f3608b;
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(u2)) {
            this.f4159aa = this.f4161ac;
            this.f4160ab = this.f4162ad;
        }
    }

    public void v() {
        PanelView panelView = this.y;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.y.init(this.f4120d, this.f4119c, this.f4163t, m(), new PanelView.a() { // from class: com.anythink.basead.ui.BaseScreenAdView.5
                @Override // com.anythink.basead.ui.PanelView.a
                public final void a() {
                    BaseScreenAdView.this.b(1);
                }

                @Override // com.anythink.basead.ui.PanelView.a
                public final boolean b() {
                    if (BaseScreenAdView.this.x()) {
                        BaseScreenAdView.this.b(4);
                        return true;
                    }
                    return false;
                }
            });
        }
        w();
    }

    public abstract void w();

    public final boolean x() {
        com.anythink.basead.c cVar = this.ak;
        if ((cVar == null || !cVar.a()) && this.am) {
            return true;
        }
        return false;
    }

    public void z() {
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
        this.K.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseScreenAdView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseScreenAdView baseScreenAdView = BaseScreenAdView.this;
                if (baseScreenAdView.f4167x != null && baseScreenAdView.K != null) {
                    if (!r0.isMute()) {
                        BaseScreenAdView baseScreenAdView2 = BaseScreenAdView.this;
                        baseScreenAdView2.M = true;
                        baseScreenAdView2.K.setMute(true);
                        BaseScreenAdView.this.f4167x.setMute(true);
                        return;
                    }
                    BaseScreenAdView baseScreenAdView3 = BaseScreenAdView.this;
                    baseScreenAdView3.M = false;
                    baseScreenAdView3.K.setMute(false);
                    BaseScreenAdView.this.f4167x.setMute(false);
                }
            }
        });
    }

    public final void d(int i10) {
        CountDownView countDownView = this.H;
        if (countDownView != null) {
            countDownView.setDuration(i10);
        }
    }

    private void g(int i10) {
        if (this.F && this.ag == -1) {
            long j10 = this.ah;
            if (j10 != 0) {
                long j11 = i10;
                this.ag = j11;
                if (j10 > 0) {
                    this.ai = j11 + j10;
                }
                E();
            }
        }
    }

    private static int a(k kVar) {
        int B;
        if (kVar == null || (B = (int) (kVar.B() / 100.0f)) == 0) {
            return 0;
        }
        Random random = new Random();
        if (random.nextInt(100) > B) {
            return 0;
        }
        int C = kVar.C();
        int D = kVar.D();
        if (D <= 0) {
            return 0;
        }
        if (C == D) {
            return C;
        }
        try {
            return random.nextInt(D - C) + C;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private void e(int i10) {
        ac X;
        Map<Integer, String[]> y;
        com.anythink.core.common.e.i iVar = this.f4120d;
        if (!(iVar instanceof aa) || (X = ((aa) iVar).X()) == null || (y = X.y()) == null || y.size() <= 0) {
            return;
        }
        if (this.W == null) {
            this.W = new ConcurrentHashMap<>();
        }
        int i11 = i10 / 1000;
        for (Integer num : y.keySet()) {
            if (this.W.get(num) == null || !this.W.get(num).booleanValue()) {
                if (i11 >= num.intValue()) {
                    this.W.put(num, Boolean.TRUE);
                    i i12 = i();
                    i12.f3789h.f3807i = num.intValue();
                    com.anythink.basead.a.b.a(32, this.f4120d, i12);
                }
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public void d() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.C = displayMetrics.widthPixels;
        this.D = displayMetrics.heightPixels;
        u();
    }

    private void f(int i10) {
        long j10 = this.ai;
        if (j10 >= 0 && i10 > j10) {
            F();
            return;
        }
        if (this.F) {
            long j11 = this.ag;
            if (j11 < 0 || i10 < j11) {
                return;
            }
            E();
        }
    }

    public static /* synthetic */ void c(BaseScreenAdView baseScreenAdView, int i10) {
        if (baseScreenAdView.F && baseScreenAdView.ag == -1) {
            long j10 = baseScreenAdView.ah;
            if (j10 != 0) {
                long j11 = i10;
                baseScreenAdView.ag = j11;
                if (j10 > 0) {
                    baseScreenAdView.ai = j11 + j10;
                }
                baseScreenAdView.E();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseScreenAdView(android.content.Context r3, com.anythink.core.common.e.j r4, com.anythink.core.common.e.i r5, java.lang.String r6, int r7, int r8) {
        /*
            r2 = this;
            r2.<init>(r3, r4, r5, r6)
            r3 = 0
            r2.G = r3
            r2.al = r3
            r4 = 3000(0xbb8, double:1.482E-320)
            r2.T = r4
            r4 = 500(0x1f4, double:2.47E-321)
            r2.U = r4
            r2.am = r3
            r2.an = r3
            com.anythink.basead.ui.BaseScreenAdView$1 r4 = new com.anythink.basead.ui.BaseScreenAdView$1
            r4.<init>()
            r2.V = r4
            r2.f4158a = r7
            r2.f4163t = r8
            com.anythink.core.common.e.j r4 = r2.f4119c
            com.anythink.core.common.e.k r4 = r4.f5664m
            int r4 = r4.v()
            if (r4 <= 0) goto L34
            com.anythink.core.common.e.j r4 = r2.f4119c
            com.anythink.core.common.e.k r4 = r4.f5664m
            int r4 = r4.v()
            int r4 = r4 * 1000
            goto L3c
        L34:
            com.anythink.core.common.e.j r4 = r2.f4119c
            com.anythink.core.common.e.k r4 = r4.f5664m
            int r4 = r4.v()
        L3c:
            long r4 = (long) r4
            r2.ag = r4
            com.anythink.core.common.e.j r4 = r2.f4119c
            com.anythink.core.common.e.k r4 = r4.f5664m
            int r4 = r4.w()
            if (r4 <= 0) goto L54
            com.anythink.core.common.e.j r4 = r2.f4119c
            com.anythink.core.common.e.k r4 = r4.f5664m
            int r4 = r4.w()
            int r4 = r4 * 1000
            goto L5c
        L54:
            com.anythink.core.common.e.j r4 = r2.f4119c
            com.anythink.core.common.e.k r4 = r4.f5664m
            int r4 = r4.w()
        L5c:
            long r4 = (long) r4
            r2.ah = r4
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L6f
            long r0 = r2.ag
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L6f
            long r0 = r0 + r4
            r2.ai = r0
            goto L71
        L6f:
            r2.ai = r4
        L71:
            com.anythink.core.common.e.j r4 = r2.f4119c
            com.anythink.core.common.e.k r4 = r4.f5664m
            int r4 = r4.z()
            int r4 = r4 * 1000
            r2.L = r4
            com.anythink.core.common.e.j r4 = r2.f4119c
            com.anythink.core.common.e.k r4 = r4.f5664m
            int r4 = r4.y()
            if (r4 != 0) goto L88
            r3 = 1
        L88:
            r2.M = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.ui.BaseScreenAdView.<init>(android.content.Context, com.anythink.core.common.e.j, com.anythink.core.common.e.i, java.lang.String, int, int):void");
    }

    public static /* synthetic */ void f(BaseScreenAdView baseScreenAdView) {
        baseScreenAdView.s();
        if (baseScreenAdView.ak == null) {
            baseScreenAdView.ak = new com.anythink.basead.c();
        }
        baseScreenAdView.ak.a(baseScreenAdView.getContext(), baseScreenAdView.f4120d, baseScreenAdView.f4119c, new AnonymousClass2());
    }

    public static /* synthetic */ void c(BaseScreenAdView baseScreenAdView) {
        baseScreenAdView.ae = true;
        ViewGroup viewGroup = baseScreenAdView.J;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final void a(com.anythink.basead.c.e eVar) {
        b.InterfaceC0061b interfaceC0061b = this.E;
        if (interfaceC0061b != null) {
            interfaceC0061b.a(eVar);
        }
        k();
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a(int i10) {
        b.InterfaceC0061b interfaceC0061b = this.E;
        if (interfaceC0061b != null) {
            interfaceC0061b.a(i10);
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a(boolean z10) {
        b.InterfaceC0061b interfaceC0061b = this.E;
        if (interfaceC0061b != null) {
            interfaceC0061b.a(z10);
        }
    }

    public static /* synthetic */ void e(BaseScreenAdView baseScreenAdView) {
        b bVar = baseScreenAdView.A;
        if (bVar != null) {
            bVar.c();
        }
    }

    public final void a(final BaseShakeView baseShakeView, final BaseShakeView baseShakeView2) {
        if (this.al) {
            return;
        }
        this.al = true;
        if (baseShakeView == null || !m()) {
            return;
        }
        baseShakeView.setVisibility(0);
        baseShakeView.postDelayed(new Runnable() { // from class: com.anythink.basead.ui.BaseScreenAdView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (!BaseScreenAdView.this.f4164u) {
                    try {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.2f);
                        ofFloat.setDuration(500L);
                        ofFloat.setRepeatCount(1);
                        ofFloat.setRepeatMode(2);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.BaseScreenAdView.4.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                if (baseShakeView.getVisibility() == 0) {
                                    baseShakeView.setAlpha(floatValue);
                                }
                                BaseShakeView baseShakeView3 = baseShakeView2;
                                if (baseShakeView3 != null && baseShakeView3.getVisibility() == 0) {
                                    baseShakeView2.setAlpha(floatValue);
                                }
                            }
                        });
                        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.BaseScreenAdView.4.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationRepeat(Animator animator) {
                                super.onAnimationRepeat(animator);
                                baseShakeView.setVisibility(8);
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                BaseShakeView baseShakeView3 = baseShakeView2;
                                if (baseShakeView3 != null && !BaseScreenAdView.this.f4164u) {
                                    baseShakeView3.setAlpha(0.2f);
                                    baseShakeView2.setVisibility(0);
                                }
                            }
                        });
                        ofFloat.start();
                    } catch (Throwable unused) {
                        baseShakeView.setVisibility(8);
                        BaseShakeView baseShakeView3 = baseShakeView2;
                        if (baseShakeView3 != null && !BaseScreenAdView.this.f4164u) {
                            baseShakeView3.setVisibility(0);
                        }
                    }
                }
            }
        }, m.ag);
    }

    private BaseEndCardView b(boolean z10) {
        MraidEndCardView mraidEndCardView = new MraidEndCardView(getContext(), this.f4120d, this.f4119c);
        mraidEndCardView.setEndCardListener(new MraidEndCardView.a() { // from class: com.anythink.basead.ui.BaseScreenAdView.15
            @Override // com.anythink.basead.ui.MraidEndCardView.a
            public final void a(String str) {
                String str2 = BaseScreenAdView.TAG;
                BaseScreenAdView.this.f4120d.v(str);
                BaseScreenAdView.this.b(1);
            }

            @Override // com.anythink.basead.ui.MraidEndCardView.a
            public final void b() {
                BaseScreenAdView.this.I();
            }

            @Override // com.anythink.basead.ui.MraidEndCardView.a
            public final void a() {
                BaseScreenAdView baseScreenAdView = BaseScreenAdView.this;
                if (3 == baseScreenAdView.f4158a) {
                    if (baseScreenAdView.f4120d.C() == 1 && BaseScreenAdView.this.f4120d.E()) {
                        return;
                    }
                    BaseScreenAdView.this.h();
                }
            }
        });
        mraidEndCardView.init(z10);
        return mraidEndCardView;
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public void b(int i10) {
        this.an = true;
        this.N = a(this.I, this.f4119c.f5664m.g());
        if (this.af || this.f4120d == null) {
            return;
        }
        super.b(i10);
    }

    public static /* synthetic */ void a(BaseScreenAdView baseScreenAdView, int i10) {
        ac X;
        Map<Integer, String[]> y;
        com.anythink.core.common.e.i iVar = baseScreenAdView.f4120d;
        if (!(iVar instanceof aa) || (X = ((aa) iVar).X()) == null || (y = X.y()) == null || y.size() <= 0) {
            return;
        }
        if (baseScreenAdView.W == null) {
            baseScreenAdView.W = new ConcurrentHashMap<>();
        }
        int i11 = i10 / 1000;
        for (Integer num : y.keySet()) {
            if (baseScreenAdView.W.get(num) == null || !baseScreenAdView.W.get(num).booleanValue()) {
                if (i11 >= num.intValue()) {
                    baseScreenAdView.W.put(num, Boolean.TRUE);
                    i i12 = baseScreenAdView.i();
                    i12.f3789h.f3807i = num.intValue();
                    com.anythink.basead.a.b.a(32, baseScreenAdView.f4120d, i12);
                }
            }
        }
    }

    public void y() {
    }

    public static /* synthetic */ void b(BaseScreenAdView baseScreenAdView) {
        com.anythink.basead.a.b.a(1, baseScreenAdView.f4120d, baseScreenAdView.i());
        b.InterfaceC0061b interfaceC0061b = baseScreenAdView.E;
        if (interfaceC0061b != null) {
            interfaceC0061b.b();
        }
    }

    public static /* synthetic */ void b(BaseScreenAdView baseScreenAdView, int i10) {
        long j10 = baseScreenAdView.ai;
        if (j10 >= 0 && i10 > j10) {
            baseScreenAdView.F();
            return;
        }
        if (baseScreenAdView.F) {
            long j11 = baseScreenAdView.ag;
            if (j11 < 0 || i10 < j11) {
                return;
            }
            baseScreenAdView.E();
        }
    }
}
