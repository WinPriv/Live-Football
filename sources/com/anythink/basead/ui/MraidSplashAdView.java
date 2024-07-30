package com.anythink.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.anythink.basead.ui.MraidContainerView;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.h;

/* loaded from: classes.dex */
public class MraidSplashAdView extends BaseSplashAdView {

    /* renamed from: a, reason: collision with root package name */
    MraidContainerView f4327a;

    /* renamed from: com.anythink.basead.ui.MraidSplashAdView$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MraidSplashAdView mraidSplashAdView = MraidSplashAdView.this;
            if (mraidSplashAdView.F != null) {
                MraidSplashAdView.super.h();
            }
        }
    }

    public MraidSplashAdView(Context context) {
        super(context);
    }

    private void c() {
        int R;
        if (this.f4120d.g() && this.f4327a == null) {
            return;
        }
        if (this.f4119c.f5664m.R() < 0) {
            R = 100;
        } else {
            R = this.f4119c.f5664m.R();
        }
        super.a(R, new AnonymousClass2());
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView, com.anythink.basead.ui.BaseAdView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.f4327a;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        MraidContainerView mraidContainerView = this.f4327a;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z10);
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView
    public final void p() {
        int size = this.f4132r.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.f4132r.get(i10);
            if (view != null) {
                view.setOnClickListener(this.K);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.MraidSplashAdView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements MraidContainerView.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a(String str) {
            MraidSplashAdView.this.f4120d.v(str);
            MraidSplashAdView.this.b(1);
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void b() {
            MraidSplashAdView.this.q();
            MraidSplashAdView.this.r();
            MraidSplashAdView.this.p();
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a() {
            try {
                MraidSplashAdView.a(MraidSplashAdView.this);
            } catch (Throwable unused) {
            }
        }
    }

    public MraidSplashAdView(Context context, j jVar, i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar, aVar);
    }

    private void b() {
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f4120d, this.f4119c, new AnonymousClass1());
        this.f4327a = mraidContainerView;
        mraidContainerView.setNeedRegisterVolumeChangeReceiver(true);
        this.f4327a.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(h.a(getContext(), "myoffer_splash_web", "id"));
        if (frameLayout != null) {
            frameLayout.addView(this.f4327a, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_web_splash_ad_layout", "layout"), this);
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f4120d, this.f4119c, new AnonymousClass1());
        this.f4327a = mraidContainerView;
        mraidContainerView.setNeedRegisterVolumeChangeReceiver(true);
        this.f4327a.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(h.a(getContext(), "myoffer_splash_web", "id"));
        if (frameLayout != null) {
            frameLayout.addView(this.f4327a, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public static /* synthetic */ void a(MraidSplashAdView mraidSplashAdView) {
        if (mraidSplashAdView.f4120d.g() && mraidSplashAdView.f4327a == null) {
            return;
        }
        super.a(mraidSplashAdView.f4119c.f5664m.R() < 0 ? 100 : mraidSplashAdView.f4119c.f5664m.R(), new AnonymousClass2());
    }
}
