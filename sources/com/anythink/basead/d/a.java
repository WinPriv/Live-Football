package com.anythink.basead.d;

import android.content.Context;
import android.view.View;
import com.anythink.basead.d.b;
import com.anythink.basead.ui.BaseBannerAdView;
import com.anythink.basead.ui.MraidBannerAdView;
import com.anythink.basead.ui.SdkBannerAdView;
import com.anythink.core.common.e.j;
import com.anythink.expressad.out.TemplateBannerView;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    BaseBannerAdView f3817a;

    /* renamed from: k, reason: collision with root package name */
    private final String f3818k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.out.h f3819l;

    public a(Context context, b.a aVar, j jVar) {
        super(context, aVar, jVar);
        this.f3818k = "a";
        this.f3819l = new com.anythink.expressad.out.h() { // from class: com.anythink.basead.d.a.1
            @Override // com.anythink.expressad.out.h
            public final void a() {
            }

            @Override // com.anythink.expressad.out.h
            public final void b() {
                com.anythink.basead.e.a aVar2 = a.this.f3865h;
                if (aVar2 != null) {
                    aVar2.onAdShow();
                }
            }

            @Override // com.anythink.expressad.out.h
            public final void f() {
                com.anythink.basead.e.a aVar2 = a.this.f3865h;
                if (aVar2 != null) {
                    aVar2.onAdClosed();
                }
            }

            @Override // com.anythink.expressad.out.h
            public final void a(String str) {
            }

            @Override // com.anythink.expressad.out.h
            public final void a(final com.anythink.expressad.foundation.d.c cVar) {
                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.basead.d.a.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.a(cVar, "");
                    }
                });
            }

            @Override // com.anythink.expressad.out.h
            public final void c() {
            }

            @Override // com.anythink.expressad.out.h
            public final void d() {
            }

            @Override // com.anythink.expressad.out.h
            public final void e() {
            }
        };
    }

    public final View a() {
        com.anythink.core.common.a.g gVar = this.f;
        if ((gVar instanceof TemplateBannerView) && gVar != null) {
            ((TemplateBannerView) gVar).setBannerAdListener(this.f3819l);
            return (TemplateBannerView) this.f;
        }
        if (this.f3817a == null && super.c()) {
            if (this.f3863e.g()) {
                this.f3817a = new MraidBannerAdView(this.f3860b, this.f3861c, this.f3863e, this.f3865h);
            } else {
                this.f3817a = new SdkBannerAdView(this.f3860b, this.f3861c, this.f3863e, this.f3865h);
            }
        }
        return this.f3817a;
    }

    @Override // com.anythink.basead.d.b
    public final void b() {
        super.b();
        com.anythink.core.common.a.g gVar = this.f;
        if (gVar instanceof TemplateBannerView) {
            ((TemplateBannerView) gVar).release();
        }
        this.f = null;
        this.f3865h = null;
    }
}
