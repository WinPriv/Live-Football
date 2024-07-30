package com.anythink.basead.f;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.e.b;
import com.anythink.basead.ui.BaseAdActivity;
import com.anythink.core.common.e.j;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3986a = "d";

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.basead.e.g f3987k;

    public d(Context context, j jVar, String str, boolean z10) {
        super(context, jVar, str, z10);
    }

    public final void a(com.anythink.basead.e.g gVar) {
        this.f3987k = gVar;
    }

    @Override // com.anythink.basead.f.a
    public final void a(Activity activity, Map<String, Object> map) {
        try {
            if (this.f3980c == null) {
                com.anythink.basead.e.g gVar = this.f3987k;
                if (gVar != null) {
                    gVar.onShowFailed(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3752i, com.anythink.basead.c.f.B));
                    return;
                }
                return;
            }
            map.get(c.f3976h);
            String obj = map.get("extra_scenario").toString();
            int intValue = ((Integer) map.get(c.f3978j)).intValue();
            final String str = this.f3981d.f5654b + this.f3982e + System.currentTimeMillis();
            com.anythink.basead.e.b.a().a(str, new b.InterfaceC0061b() { // from class: com.anythink.basead.f.d.1
                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void a() {
                    if (d.this.f3987k != null) {
                        d.this.f3987k.onAdShow();
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void b() {
                    if (d.this.f3987k != null) {
                        d.this.f3987k.onVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void c() {
                    if (d.this.f3987k != null) {
                        d.this.f3987k.onVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void e() {
                    if (d.this.f3987k != null) {
                        d.this.f3987k.onAdClosed();
                    }
                    com.anythink.basead.e.b.a().b(str);
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void a(com.anythink.basead.c.e eVar) {
                    eVar.c();
                    if (d.this.f3987k != null) {
                        d.this.f3987k.onShowFailed(eVar);
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void a(int i10) {
                    if (d.this.f3987k != null) {
                        d.this.f3987k.onAdClick(i10);
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void a(boolean z10) {
                    if (d.this.f3987k != null) {
                        d.this.f3987k.onDeeplinkCallback(z10);
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0061b
                public final void d() {
                }
            });
            com.anythink.core.basead.b.a aVar = new com.anythink.core.basead.b.a();
            aVar.f4692c = this.f3983g;
            aVar.f4693d = str;
            aVar.f4690a = 3;
            aVar.f4696h = this.f3981d;
            aVar.f4694e = intValue;
            aVar.f4691b = obj;
            BaseAdActivity.a(activity, aVar);
        } catch (Exception e10) {
            e10.printStackTrace();
            com.anythink.basead.e.g gVar2 = this.f3987k;
            if (gVar2 != null) {
                gVar2.onShowFailed(com.anythink.basead.c.f.a("-9999", e10.getMessage()));
            }
        }
    }
}
