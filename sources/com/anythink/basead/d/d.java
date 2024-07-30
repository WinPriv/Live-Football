package com.anythink.basead.d;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.d.b;
import com.anythink.basead.e.b;
import com.anythink.basead.ui.BaseAdActivity;
import com.anythink.core.common.e.j;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3910a = "d";

    public d(Context context, b.a aVar, j jVar) {
        super(context, aVar, jVar);
    }

    public final void a(Activity activity, Map<String, Object> map) {
        try {
            if (!c()) {
                com.anythink.basead.e.a aVar = this.f3865h;
                if (aVar != null) {
                    aVar.onShowFailed(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3752i, com.anythink.basead.c.f.f3766x));
                }
                this.f3863e = null;
                return;
            }
            final String obj = map.get("extra_scenario").toString();
            int intValue = ((Integer) map.get(com.anythink.basead.f.c.f3978j)).intValue();
            final String a10 = a(this.f3863e);
            com.anythink.core.common.a.g gVar = this.f;
            if (gVar instanceof com.anythink.expressad.reward.b.a) {
                ((com.anythink.expressad.reward.b.a) gVar).a(new com.anythink.expressad.videocommon.d.a() { // from class: com.anythink.basead.d.d.1
                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void a() {
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void b() {
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void c() {
                        com.anythink.basead.e.a aVar2 = d.this.f3865h;
                        if (aVar2 != null) {
                            aVar2.onAdShow();
                        }
                        d.this.f3863e = null;
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void d() {
                        com.anythink.basead.e.a aVar2 = d.this.f3865h;
                        if (aVar2 != null && (aVar2 instanceof com.anythink.basead.e.g)) {
                            ((com.anythink.basead.e.g) aVar2).onVideoAdPlayEnd();
                        }
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void a(String str) {
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void b(String str) {
                        com.anythink.basead.e.a aVar2 = d.this.f3865h;
                        if (aVar2 != null) {
                            aVar2.onShowFailed(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, str));
                        }
                        d.this.f3863e = null;
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void a(boolean z10, String str, float f) {
                        com.anythink.basead.e.a aVar2 = d.this.f3865h;
                        if (aVar2 != null) {
                            aVar2.onAdClosed();
                        }
                        com.anythink.basead.a.c cVar = d.this.f3864g;
                        if (cVar != null) {
                            cVar.d();
                        }
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void a(final com.anythink.expressad.foundation.d.c cVar) {
                        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.basead.d.d.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                d.this.a(cVar, obj);
                            }
                        });
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void e() {
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void f() {
                    }
                });
                ((com.anythink.expressad.reward.b.a) this.f).a(activity, "", "", "", this.f3861c);
                return;
            }
            com.anythink.basead.e.b.a().a(a10, new b.InterfaceC0061b() { // from class: com.anythink.basead.d.d.2
                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void a() {
                    com.anythink.basead.e.a aVar2 = d.this.f3865h;
                    if (aVar2 != null) {
                        aVar2.onAdShow();
                    }
                    d.this.f3863e = null;
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void b() {
                    com.anythink.basead.e.a aVar2 = d.this.f3865h;
                    if (aVar2 != null && (aVar2 instanceof com.anythink.basead.e.g)) {
                        ((com.anythink.basead.e.g) aVar2).onVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void c() {
                    com.anythink.basead.e.a aVar2 = d.this.f3865h;
                    if (aVar2 != null && (aVar2 instanceof com.anythink.basead.e.g)) {
                        ((com.anythink.basead.e.g) aVar2).onVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void e() {
                    com.anythink.basead.e.a aVar2 = d.this.f3865h;
                    if (aVar2 != null) {
                        aVar2.onAdClosed();
                    }
                    com.anythink.basead.e.b.a().b(a10);
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void a(com.anythink.basead.c.e eVar) {
                    com.anythink.basead.e.a aVar2 = d.this.f3865h;
                    if (aVar2 != null) {
                        aVar2.onShowFailed(eVar);
                    }
                    d.this.f3863e = null;
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void a(int i10) {
                    String str = d.f3910a;
                    com.anythink.basead.e.a aVar2 = d.this.f3865h;
                    if (aVar2 != null) {
                        aVar2.onAdClick(i10);
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void a(boolean z10) {
                    String str = d.f3910a;
                    com.anythink.basead.e.a aVar2 = d.this.f3865h;
                    if (aVar2 != null) {
                        aVar2.onDeeplinkCallback(z10);
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void d() {
                }
            });
            com.anythink.core.basead.b.a aVar2 = new com.anythink.core.basead.b.a();
            aVar2.f4692c = this.f3863e;
            aVar2.f4693d = a10;
            aVar2.f4690a = 3;
            aVar2.f4696h = this.f3861c;
            aVar2.f4694e = intValue;
            aVar2.f4691b = obj;
            BaseAdActivity.a(activity, aVar2);
        } catch (Exception e10) {
            e10.printStackTrace();
            com.anythink.basead.e.a aVar3 = this.f3865h;
            if (aVar3 != null) {
                aVar3.onShowFailed(com.anythink.basead.c.f.a("-9999", e10.getMessage()));
            }
            this.f3863e = null;
        }
    }

    @Override // com.anythink.basead.d.b
    public final void b() {
        super.b();
        this.f3865h = null;
    }
}
