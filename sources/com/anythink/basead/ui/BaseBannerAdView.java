package com.anythink.basead.ui;

import android.content.Context;
import android.view.View;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;

/* loaded from: classes.dex */
public abstract class BaseBannerAdView extends BaseAdView {
    public final String TAG;

    /* renamed from: a, reason: collision with root package name */
    protected com.anythink.basead.e.a f4140a;

    /* renamed from: t, reason: collision with root package name */
    protected CloseImageView f4141t;

    public BaseBannerAdView(Context context) {
        super(context);
        this.TAG = getClass().getSimpleName();
    }

    public void b() {
        int R;
        if (this.f4119c.f5664m.R() < 0) {
            R = 100;
        } else {
            R = this.f4119c.f5664m.R();
        }
        a(R, new Runnable() { // from class: com.anythink.basead.ui.BaseBannerAdView.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseBannerAdView.super.h();
            }
        });
    }

    public void c() {
        this.f4141t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseBannerAdView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.anythink.basead.e.a aVar = BaseBannerAdView.this.f4140a;
                if (aVar != null) {
                    aVar.onAdClosed();
                }
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void e() {
        com.anythink.basead.a.b.a(8, this.f4120d, i());
        com.anythink.basead.e.a aVar = this.f4140a;
        if (aVar != null) {
            aVar.onAdShow();
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a(int i10) {
        a(this.f4141t, this.f4119c.f5664m.g());
        com.anythink.basead.e.a aVar = this.f4140a;
        if (aVar != null) {
            aVar.onAdClick(i10);
        }
    }

    public BaseBannerAdView(Context context, j jVar, i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar);
        this.TAG = getClass().getSimpleName();
        this.f4140a = aVar;
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a(boolean z10) {
        com.anythink.basead.e.a aVar = this.f4140a;
        if (aVar != null) {
            aVar.onDeeplinkCallback(z10);
        }
    }
}
