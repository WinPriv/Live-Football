package com.anythink.basead.d.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.a.b.b;
import com.anythink.basead.c.e;
import com.anythink.basead.c.f;
import com.anythink.basead.d.a.b;
import com.anythink.core.api.AdError;
import com.anythink.core.common.a.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.g.i;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.d.d;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f3823d;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f3824a = new ConcurrentHashMap<>(3);

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, g> f3825b = new ConcurrentHashMap<>(2);

    /* renamed from: c, reason: collision with root package name */
    private Context f3826c;

    /* renamed from: com.anythink.basead.d.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0054a {
        void a(com.anythink.core.common.e.g gVar);

        void a(com.anythink.core.common.e.g gVar, e eVar);

        void a(com.anythink.core.common.e.g gVar, g gVar2);
    }

    private a(Context context) {
        this.f3826c = context.getApplicationContext();
    }

    private void b(j jVar, InterfaceC0054a interfaceC0054a) {
        com.anythink.core.common.e.g gVar;
        try {
            gVar = a(jVar);
        } catch (Throwable unused) {
            gVar = null;
        }
        if (gVar == null) {
            new com.anythink.basead.g.a(jVar).a(0, (i) new AnonymousClass1(jVar, interfaceC0054a));
            return;
        }
        com.anythink.core.common.a.a.a();
        if (!com.anythink.core.common.a.a.d(this.f3826c, gVar.b())) {
            com.anythink.basead.a.b.a(10, gVar, new com.anythink.basead.c.i(jVar.f5656d, ""));
            com.anythink.core.common.a.a.a();
            com.anythink.core.common.a.a.c(this.f3826c, gVar.b());
        }
        d a10 = a(gVar, jVar);
        if (interfaceC0054a != null) {
            interfaceC0054a.a(gVar);
        }
        a(gVar, jVar, a10, interfaceC0054a);
    }

    public static a a(Context context) {
        if (f3823d == null) {
            synchronized (a.class) {
                if (f3823d == null) {
                    f3823d = new a(context);
                }
            }
        }
        return f3823d;
    }

    public final void a(j jVar, InterfaceC0054a interfaceC0054a) {
        com.anythink.core.common.e.g gVar = null;
        if (this.f3824a.contains(jVar.f5654b + jVar.f5653a)) {
            if (this.f3824a.get(jVar.f5654b + jVar.f5653a).booleanValue()) {
                interfaceC0054a.a((com.anythink.core.common.e.g) null, f.a(f.f3750g, f.f3759q));
                return;
            }
        }
        this.f3824a.put(jVar.f5654b + jVar.f5653a, Boolean.TRUE);
        try {
            gVar = a(jVar);
        } catch (Throwable unused) {
        }
        if (gVar == null) {
            new com.anythink.basead.g.a(jVar).a(0, (i) new AnonymousClass1(jVar, interfaceC0054a));
            return;
        }
        com.anythink.core.common.a.a.a();
        if (!com.anythink.core.common.a.a.d(this.f3826c, gVar.b())) {
            com.anythink.basead.a.b.a(10, gVar, new com.anythink.basead.c.i(jVar.f5656d, ""));
            com.anythink.core.common.a.a.a();
            com.anythink.core.common.a.a.c(this.f3826c, gVar.b());
        }
        d a10 = a(gVar, jVar);
        interfaceC0054a.a(gVar);
        a(gVar, jVar, a10, interfaceC0054a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized d a(com.anythink.core.common.e.g gVar, j jVar) {
        if (TextUtils.isEmpty(gVar.a())) {
            return null;
        }
        d a10 = d.a(gVar.a());
        ArrayList<c> arrayList = a10.J;
        b.a(gVar, arrayList.get(0));
        b.a(gVar, arrayList);
        b.a(jVar, arrayList);
        return a10;
    }

    /* renamed from: com.anythink.basead.d.a.a$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f3827a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0054a f3828b;

        public AnonymousClass1(j jVar, InterfaceC0054a interfaceC0054a) {
            this.f3827a = jVar;
            this.f3828b = interfaceC0054a;
        }

        @Override // com.anythink.core.common.g.i
        public final void onLoadCanceled(int i10) {
            InterfaceC0054a interfaceC0054a = this.f3828b;
            if (interfaceC0054a != null) {
                interfaceC0054a.a((com.anythink.core.common.e.g) null, f.a(f.f3752i, "Cancel Request."));
            }
        }

        @Override // com.anythink.core.common.g.i
        public final void onLoadError(int i10, String str, AdError adError) {
            InterfaceC0054a interfaceC0054a = this.f3828b;
            if (interfaceC0054a != null) {
                interfaceC0054a.a((com.anythink.core.common.e.g) null, f.a(f.f3752i, str));
            }
        }

        @Override // com.anythink.core.common.g.i
        public final void onLoadFinish(int i10, Object obj) {
            com.anythink.core.common.e.g gVar;
            String str;
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                j jVar = this.f3827a;
                gVar = com.anythink.core.common.a.c.a(jVar.f5653a, jSONObject, jVar.f);
            } catch (Exception unused) {
                gVar = null;
            }
            if (gVar != null) {
                com.anythink.basead.d.c.b.a(gVar);
                com.anythink.basead.d.c.a.a(this.f3827a, gVar);
                com.anythink.basead.d.c.d.a(this.f3827a, gVar);
                if (this.f3827a.f == 67) {
                    com.anythink.core.common.d.c.a(a.this.f3826c).a(gVar.p(), gVar.P());
                    com.anythink.core.common.d.b.a(a.this.f3826c).a(gVar.q(), gVar.P());
                }
                com.anythink.basead.a.b.a(10, gVar, new com.anythink.basead.c.i(this.f3827a.f5656d, ""));
                com.anythink.core.common.a.a a10 = com.anythink.core.common.a.a.a();
                Context context = a.this.f3826c;
                j jVar2 = this.f3827a;
                a10.a(context, jVar2.f, jVar2.f5655c, jVar2.f5653a, obj.toString());
                d a11 = a.this.a(gVar, this.f3827a);
                InterfaceC0054a interfaceC0054a = this.f3828b;
                if (interfaceC0054a != null) {
                    interfaceC0054a.a(gVar);
                }
                a.this.a(gVar, this.f3827a, a11, this.f3828b);
                return;
            }
            InterfaceC0054a interfaceC0054a2 = this.f3828b;
            if (interfaceC0054a2 != null) {
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = "No Ad Return.";
                }
                interfaceC0054a2.a((com.anythink.core.common.e.g) null, f.a(f.f3752i, str));
            }
        }

        @Override // com.anythink.core.common.g.i
        public final void onLoadStart(int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.anythink.core.common.e.g gVar, final j jVar, d dVar, final InterfaceC0054a interfaceC0054a) {
        if (!TextUtils.isEmpty(gVar.a())) {
            b.a().a(gVar, jVar, dVar, new b.a() { // from class: com.anythink.basead.d.a.a.2
                @Override // com.anythink.basead.d.a.b.a
                public final void a(g gVar2) {
                    a.this.f3824a.put(jVar.f5654b + jVar.f5653a, Boolean.FALSE);
                    InterfaceC0054a interfaceC0054a2 = interfaceC0054a;
                    if (interfaceC0054a2 != null) {
                        interfaceC0054a2.a(gVar, gVar2);
                    }
                }

                @Override // com.anythink.basead.d.a.b.a
                public final void a(e eVar) {
                    a.this.f3824a.put(jVar.f5654b + jVar.f5653a, Boolean.FALSE);
                    InterfaceC0054a interfaceC0054a2 = interfaceC0054a;
                    if (interfaceC0054a2 != null) {
                        interfaceC0054a2.a(gVar, eVar);
                    }
                }
            });
        } else {
            com.anythink.basead.a.f.a();
            com.anythink.basead.a.f.a(jVar.f5654b, gVar, jVar, new b.InterfaceC0049b() { // from class: com.anythink.basead.d.a.a.3
                @Override // com.anythink.basead.a.b.b.InterfaceC0049b
                public final void a() {
                    a.this.f3824a.put(jVar.f5654b + jVar.f5653a, Boolean.FALSE);
                    InterfaceC0054a interfaceC0054a2 = interfaceC0054a;
                    if (interfaceC0054a2 != null) {
                        interfaceC0054a2.a(gVar, (g) null);
                    }
                }

                @Override // com.anythink.basead.a.b.b.InterfaceC0049b
                public final void a(e eVar) {
                    a.this.f3824a.put(jVar.f5654b + jVar.f5653a, Boolean.FALSE);
                    InterfaceC0054a interfaceC0054a2 = interfaceC0054a;
                    if (interfaceC0054a2 != null) {
                        interfaceC0054a2.a(gVar, eVar);
                    }
                }
            });
        }
    }

    public final com.anythink.core.common.e.g a(j jVar) {
        String a10 = com.anythink.core.common.a.a.a().a(this.f3826c, jVar.f5653a);
        com.anythink.core.common.e.g gVar = null;
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        try {
            gVar = com.anythink.core.common.a.c.a(jVar.f5653a, new JSONObject(a10), jVar.f);
        } catch (Throwable unused) {
        }
        if (gVar != null) {
            com.anythink.basead.d.c.b.a(gVar);
            com.anythink.basead.d.c.a.a(jVar, gVar);
            com.anythink.basead.d.c.d.a(jVar, gVar);
        }
        return gVar;
    }
}
