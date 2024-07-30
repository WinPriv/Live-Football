package com.anythink.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.ui.MraidContainerView;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.k.h;

/* loaded from: classes.dex */
public class MraidBannerAdView extends BaseBannerAdView {

    /* renamed from: u, reason: collision with root package name */
    MraidContainerView f4302u;

    public MraidBannerAdView(Context context) {
        super(context);
    }

    private void o() {
        String r10 = this.f4119c.f5664m.r();
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_web_banner_ad_layout", "layout"), this);
        int a10 = h.a(getContext(), 50.0f);
        int a11 = h.a(getContext(), 320.0f);
        r10.getClass();
        char c10 = 65535;
        switch (r10.hashCode()) {
            case -559799608:
                if (r10.equals(k.f5668c)) {
                    c10 = 0;
                    break;
                }
                break;
            case 1507809854:
                if (r10.equals(k.f5667b)) {
                    c10 = 1;
                    break;
                }
                break;
            case 1622564786:
                if (r10.equals(k.f5669d)) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                a11 = h.a(getContext(), 300.0f);
                a10 = h.a(getContext(), 250.0f);
                break;
            case 1:
                a11 = h.a(getContext(), 320.0f);
                a10 = h.a(getContext(), 90.0f);
                break;
            case 2:
                a11 = h.a(getContext(), 720.0f);
                a10 = h.a(getContext(), 90.0f);
                break;
        }
        int min = Math.min(a11, getResources().getDisplayMetrics().widthPixels);
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f4120d, this.f4119c, new AnonymousClass1());
        this.f4302u = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(h.a(getContext(), "myoffer_banner_web", "id"));
        this.f4302u.setMinimumHeight(h.a(getContext(), 50.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(min, a10);
        layoutParams.gravity = 17;
        frameLayout.addView(this.f4302u, 0, layoutParams);
        setLayoutParams(new ViewGroup.LayoutParams(min, a10));
        this.f4141t = (CloseImageView) findViewById(h.a(getContext(), "myoffer_banner_close", "id"));
        if (this.f4119c.f5664m.s() == 0) {
            this.f4141t.setVisibility(0);
            a(this.f4141t, this.f4119c.f5664m.h());
        } else {
            this.f4141t.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a() {
        String r10 = this.f4119c.f5664m.r();
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_web_banner_ad_layout", "layout"), this);
        int a10 = h.a(getContext(), 50.0f);
        int a11 = h.a(getContext(), 320.0f);
        r10.getClass();
        char c10 = 65535;
        switch (r10.hashCode()) {
            case -559799608:
                if (r10.equals(k.f5668c)) {
                    c10 = 0;
                    break;
                }
                break;
            case 1507809854:
                if (r10.equals(k.f5667b)) {
                    c10 = 1;
                    break;
                }
                break;
            case 1622564786:
                if (r10.equals(k.f5669d)) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                a11 = h.a(getContext(), 300.0f);
                a10 = h.a(getContext(), 250.0f);
                break;
            case 1:
                a11 = h.a(getContext(), 320.0f);
                a10 = h.a(getContext(), 90.0f);
                break;
            case 2:
                a11 = h.a(getContext(), 720.0f);
                a10 = h.a(getContext(), 90.0f);
                break;
        }
        int min = Math.min(a11, getResources().getDisplayMetrics().widthPixels);
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f4120d, this.f4119c, new AnonymousClass1());
        this.f4302u = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(h.a(getContext(), "myoffer_banner_web", "id"));
        this.f4302u.setMinimumHeight(h.a(getContext(), 50.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(min, a10);
        layoutParams.gravity = 17;
        frameLayout.addView(this.f4302u, 0, layoutParams);
        setLayoutParams(new ViewGroup.LayoutParams(min, a10));
        this.f4141t = (CloseImageView) findViewById(h.a(getContext(), "myoffer_banner_close", "id"));
        if (this.f4119c.f5664m.s() == 0) {
            this.f4141t.setVisibility(0);
            a(this.f4141t, this.f4119c.f5664m.h());
        } else {
            this.f4141t.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseBannerAdView
    public final void b() {
        if (this.f4302u == null) {
            return;
        }
        super.b();
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.f4302u;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    /* renamed from: com.anythink.basead.ui.MraidBannerAdView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements MraidContainerView.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a(String str) {
            MraidBannerAdView.this.f4120d.v(str);
            MraidBannerAdView.this.b(1);
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a() {
            try {
                MraidBannerAdView.this.b();
            } catch (Throwable unused) {
            }
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void b() {
        }
    }

    public MraidBannerAdView(Context context, j jVar, i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar, aVar);
        c();
    }
}
