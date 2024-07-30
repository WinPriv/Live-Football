package com.anythink.basead.d;

import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.d.b;
import com.anythink.basead.ui.AsseblemSplashAdView;
import com.anythink.basead.ui.BaseSdkSplashAdView;
import com.anythink.basead.ui.BaseSplashAdView;
import com.anythink.basead.ui.MraidSplashAdView;
import com.anythink.basead.ui.SinglePictureSplashAdView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.u;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: a, reason: collision with root package name */
    BaseSplashAdView f3926a;

    /* renamed from: k, reason: collision with root package name */
    boolean f3927k;

    public g(Context context, b.a aVar, j jVar) {
        super(context, aVar, jVar);
    }

    public final void a() {
        this.f3927k = true;
    }

    @Override // com.anythink.basead.d.b
    public final void b() {
        BaseSplashAdView baseSplashAdView = this.f3926a;
        if (baseSplashAdView != null) {
            baseSplashAdView.destroy();
            this.f3926a = null;
        }
        com.anythink.core.common.a.g gVar = this.f;
        if (gVar != null && (gVar instanceof com.anythink.expressad.splash.d.c)) {
            ((com.anythink.expressad.splash.d.c) gVar).g();
        }
    }

    public final boolean e() {
        if (this.f == null) {
            return true;
        }
        return false;
    }

    public final void a(final ViewGroup viewGroup) {
        if (super.c()) {
            u.a(false);
            n.a().a(new Runnable() { // from class: com.anythink.basead.d.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    g gVar = g.this;
                    com.anythink.core.common.a.g gVar2 = gVar.f;
                    if (gVar2 instanceof com.anythink.expressad.splash.d.c) {
                        ((com.anythink.expressad.splash.d.c) gVar2).a(new com.anythink.expressad.out.e() { // from class: com.anythink.basead.d.g.1.1
                            @Override // com.anythink.expressad.out.e
                            public final void a() {
                                com.anythink.basead.e.a aVar = g.this.f3865h;
                                if (aVar != null) {
                                    aVar.onAdShow();
                                }
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void b() {
                                com.anythink.basead.e.a aVar = g.this.f3865h;
                                if (aVar != null) {
                                    aVar.onAdClosed();
                                }
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void a(String str) {
                                com.anythink.basead.e.a aVar = g.this.f3865h;
                                if (aVar != null) {
                                    aVar.onShowFailed(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, str));
                                }
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void a(com.anythink.expressad.foundation.d.c cVar) {
                                com.anythink.basead.a.c cVar2 = g.this.f3864g;
                                if (cVar2 != null) {
                                    com.anythink.basead.d.a.b.a(cVar2.b(), cVar);
                                    com.anythink.basead.c.i iVar = new com.anythink.basead.c.i(g.this.f3861c.f5656d, "");
                                    iVar.f3788g = new com.anythink.basead.c.a();
                                    g.this.f3864g.a(iVar);
                                }
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void c() {
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void d() {
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void e() {
                            }
                        });
                        ((com.anythink.expressad.splash.d.c) g.this.f).a(viewGroup);
                        return;
                    }
                    if (gVar.f3863e.g()) {
                        g gVar3 = g.this;
                        Context context = viewGroup.getContext();
                        g gVar4 = g.this;
                        gVar3.f3926a = new MraidSplashAdView(context, gVar4.f3861c, gVar4.f3863e, gVar4.f3865h);
                    } else {
                        g gVar5 = g.this;
                        if (BaseSdkSplashAdView.isSinglePicture(gVar5.f3863e, gVar5.f3861c.f5664m)) {
                            g gVar6 = g.this;
                            Context context2 = viewGroup.getContext();
                            g gVar7 = g.this;
                            gVar6.f3926a = new SinglePictureSplashAdView(context2, gVar7.f3861c, gVar7.f3863e, gVar7.f3865h);
                        } else {
                            g gVar8 = g.this;
                            Context context3 = viewGroup.getContext();
                            g gVar9 = g.this;
                            gVar8.f3926a = new AsseblemSplashAdView(context3, gVar9.f3861c, gVar9.f3863e, gVar9.f3865h);
                        }
                    }
                    g gVar10 = g.this;
                    gVar10.f3926a.setDontCountDown(gVar10.f3927k);
                    viewGroup.addView(g.this.f3926a);
                }
            });
        }
    }
}
