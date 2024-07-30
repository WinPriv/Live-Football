package com.anythink.basead.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.a.f;
import com.anythink.core.common.k.h;
import com.anythink.core.common.k.u;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public abstract class BaseSplashAdView extends BaseAdView {
    protected TextView A;
    protected CloseFrameLayout B;
    protected String C;
    protected Timer D;
    protected boolean E;
    protected com.anythink.basead.e.a F;
    protected b G;
    final long H;
    protected BaseShakeView I;
    GuideToClickView J;
    protected final View.OnClickListener K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;

    /* renamed from: a */
    private f.b f4209a;

    /* renamed from: t */
    private long f4210t;

    /* renamed from: com.anythink.basead.ui.BaseSplashAdView$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseSplashAdView.super.b(1);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseSplashAdView$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (BaseSplashAdView.this.f4119c.f5664m.p() == 0 || BaseSplashAdView.this.N) {
                BaseSplashAdView.this.s();
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseSplashAdView$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 extends TimerTask {
        public AnonymousClass3() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            BaseSplashAdView baseSplashAdView = BaseSplashAdView.this;
            if (u.a(baseSplashAdView, baseSplashAdView.f4209a)) {
                BaseSplashAdView.this.post(new c(this, 0));
            }
        }

        public /* synthetic */ void a() {
            if (BaseSplashAdView.this.f4210t <= 0) {
                BaseSplashAdView.e(BaseSplashAdView.this);
            } else {
                BaseSplashAdView baseSplashAdView = BaseSplashAdView.this;
                baseSplashAdView.a(baseSplashAdView.f4210t);
            }
            BaseSplashAdView.this.f4210t -= 1000;
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseSplashAdView$4 */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSplashAdView.this.G.b();
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseSplashAdView$5 */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSplashAdView.this.G.c();
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseSplashAdView$6 */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements BaseShakeView.a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.basead.ui.BaseShakeView.a
        public final boolean a() {
            BaseSplashAdView baseSplashAdView = BaseSplashAdView.this;
            if (!baseSplashAdView.E) {
                baseSplashAdView.b(4);
                return true;
            }
            return false;
        }
    }

    public BaseSplashAdView(Context context) {
        super(context);
        this.C = "Skip";
        this.H = 1000L;
        this.f4210t = com.anythink.expressad.exoplayer.f.f7962a;
        this.K = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashAdView.1
            public AnonymousClass1() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashAdView.super.b(1);
            }
        };
        this.L = false;
        this.M = false;
        this.N = false;
    }

    private void o() {
        s();
        this.A.setText(this.C);
        this.N = true;
    }

    public void s() {
        Timer timer = this.D;
        if (timer != null) {
            timer.cancel();
        }
        this.D = null;
        if (!this.E) {
            this.E = true;
            if (!this.L) {
                a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, "SplashView not showing on screen."));
            }
            com.anythink.basead.e.a aVar = this.F;
            if (aVar != null) {
                aVar.onAdClosed();
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public void destroy() {
        super.destroy();
        this.F = null;
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void e() {
        this.L = true;
        com.anythink.basead.a.b.a(8, this.f4120d, i());
        com.anythink.basead.e.a aVar = this.F;
        if (aVar != null) {
            aVar.onAdShow();
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void f() {
        if (this.f4120d instanceof aa) {
            if (this.G == null) {
                this.G = new b(this);
            }
            post(new Runnable() { // from class: com.anythink.basead.ui.BaseSplashAdView.4
                public AnonymousClass4() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseSplashAdView.this.G.b();
                }
            });
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void g() {
        if ((this.f4120d instanceof aa) && this.G != null) {
            post(new Runnable() { // from class: com.anythink.basead.ui.BaseSplashAdView.5
                public AnonymousClass5() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseSplashAdView.this.G.c();
                }
            });
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.anythink.basead.ui.BaseAdView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0 && !this.M) {
            this.M = true;
            if (!this.O) {
                this.B.setVisibility(0);
                this.B.setOnClickListener(new AnonymousClass2());
                this.N = false;
                Timer timer = new Timer();
                this.D = timer;
                timer.schedule(new AnonymousClass3(), 1000L, 1000L);
                a(this.f4210t);
                this.f4210t -= 1000;
            }
        }
    }

    public void p() {
        int size = this.f4132r.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.f4132r.get(i10);
            if (view != null) {
                view.setOnClickListener(this.K);
            }
        }
    }

    public final void q() {
        if (m()) {
            BaseShakeView baseShakeView = (BaseShakeView) findViewById(h.a(getContext(), "myoffer_shake_view", "id"));
            this.I = baseShakeView;
            baseShakeView.setVisibility(0);
            this.I.setOnShakeListener(new BaseShakeView.a() { // from class: com.anythink.basead.ui.BaseSplashAdView.6
                public AnonymousClass6() {
                }

                @Override // com.anythink.basead.ui.BaseShakeView.a
                public final boolean a() {
                    BaseSplashAdView baseSplashAdView = BaseSplashAdView.this;
                    if (!baseSplashAdView.E) {
                        baseSplashAdView.b(4);
                        return true;
                    }
                    return false;
                }
            }, this.f4119c.f5664m);
            this.f4132r.add(this.I);
        }
    }

    public final void r() {
        GuideToClickView guideToClickView;
        this.J = (GuideToClickView) findViewById(h.a(getContext(), "myoffer_guide_to_click_view", "id"));
        if (this.f4119c.f5664m.i() == 1 && (guideToClickView = this.J) != null) {
            guideToClickView.setVisibility(0);
            this.f4132r.add(this.J);
        }
    }

    public void setDontCountDown(boolean z10) {
        CloseFrameLayout closeFrameLayout;
        this.O = z10;
        if (z10 && (closeFrameLayout = this.B) != null) {
            closeFrameLayout.setVisibility(8);
        }
    }

    private void c() {
        this.B.setVisibility(0);
        this.B.setOnClickListener(new AnonymousClass2());
        this.N = false;
        Timer timer = new Timer();
        this.D = timer;
        timer.schedule(new AnonymousClass3(), 1000L, 1000L);
        a(this.f4210t);
        this.f4210t -= 1000;
    }

    private void b() {
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.O) {
            return;
        }
        this.B.setVisibility(0);
        this.B.setOnClickListener(new AnonymousClass2());
        this.N = false;
        Timer timer = new Timer();
        this.D = timer;
        timer.schedule(new AnonymousClass3(), 1000L, 1000L);
        a(this.f4210t);
        this.f4210t -= 1000;
    }

    public final void a(com.anythink.basead.c.e eVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        com.anythink.basead.e.a aVar = this.F;
        if (aVar != null) {
            aVar.onShowFailed(eVar);
        }
    }

    public static /* synthetic */ void e(BaseSplashAdView baseSplashAdView) {
        baseSplashAdView.s();
        baseSplashAdView.A.setText(baseSplashAdView.C);
        baseSplashAdView.N = true;
    }

    public void a(long j10) {
        if (this.f4119c.f5664m.p() == 0) {
            this.A.setText((j10 / 1000) + "s | " + this.C);
            return;
        }
        this.A.setText((j10 / 1000) + " s");
    }

    public BaseSplashAdView(Context context, j jVar, i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar);
        this.C = "Skip";
        this.H = 1000L;
        this.f4210t = com.anythink.expressad.exoplayer.f.f7962a;
        this.K = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashAdView.1
            public AnonymousClass1() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashAdView.super.b(1);
            }
        };
        this.L = false;
        this.M = false;
        this.N = false;
        this.f4209a = new f.b();
        this.F = aVar;
        this.C = getResources().getString(h.a(getContext(), "myoffer_splash_skip_text", com.anythink.expressad.foundation.h.i.f10128g));
        this.A = (TextView) findViewById(h.a(getContext(), "myoffer_splash_skip", "id"));
        this.B = (CloseFrameLayout) findViewById(h.a(getContext(), "myoffer_splash_skip_area", "id"));
        this.f4210t = this.f4119c.f5664m.n();
        a(this.B, this.f4119c.f5664m.h());
        this.E = false;
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public void a(int i10) {
        com.anythink.basead.e.a aVar = this.F;
        if (aVar != null) {
            aVar.onAdClick(i10);
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a(boolean z10) {
        com.anythink.basead.e.a aVar = this.F;
        if (aVar != null) {
            aVar.onDeeplinkCallback(z10);
        }
    }
}
