package com.anythink.basead.f;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.a.a;
import com.anythink.basead.a.c;
import com.anythink.basead.c.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.s;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.basead.e.a f3990a;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.core.common.k.a.c f3991k;

    /* renamed from: l, reason: collision with root package name */
    com.anythink.basead.a.c f3992l;

    /* renamed from: m, reason: collision with root package name */
    View f3993m;

    /* renamed from: n, reason: collision with root package name */
    volatile boolean f3994n;
    View.OnClickListener o;

    /* renamed from: p, reason: collision with root package name */
    com.anythink.basead.a.a f3995p;

    /* renamed from: q, reason: collision with root package name */
    boolean f3996q;

    /* renamed from: r, reason: collision with root package name */
    private final String f3997r;

    /* renamed from: com.anythink.basead.f.e$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements a.InterfaceC0048a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.basead.a.a.InterfaceC0048a
        public final void a(int i10) {
            e.a(e.this, 2);
        }
    }

    public e(Context context, j jVar, String str, boolean z10) {
        super(context, jVar, str, z10);
        this.f3997r = getClass().getSimpleName();
        this.o = new View.OnClickListener() { // from class: com.anythink.basead.f.e.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.a(e.this, 1);
            }
        };
        this.f3996q = false;
    }

    private void b(View view) {
        if (this.f3981d.f5664m.F() != 2 || view == null || this.f3996q) {
            return;
        }
        this.f3996q = true;
        this.f3995p = new com.anythink.basead.a.a(view, this.f3981d, new AnonymousClass3());
    }

    private void c(View view) {
        this.f3993m = view;
        com.anythink.core.common.k.a.a aVar = new com.anythink.core.common.k.a.a() { // from class: com.anythink.basead.f.e.4
            @Override // com.anythink.core.common.k.a.a, com.anythink.core.common.k.a.b
            public final void recordImpression(View view2) {
                e.this.p();
            }
        };
        if (this.f3991k == null) {
            view.getContext();
            this.f3991k = new com.anythink.core.common.k.a.c();
        }
        this.f3991k.a(view, aVar);
    }

    public static View k() {
        return null;
    }

    private void n() {
        com.anythink.basead.a.a aVar = this.f3995p;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void o() {
        com.anythink.basead.a.a aVar = this.f3995p;
        if (aVar != null) {
            aVar.b();
            this.f3995p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.f3994n) {
            return;
        }
        this.f3994n = true;
        com.anythink.basead.f.a.b.a(this.f3980c).a(this.f3983g);
        com.anythink.basead.a.b.a(8, this.f3983g, new i(this.f3981d.f5656d, ""));
        com.anythink.basead.e.a aVar = this.f3990a;
        if (aVar != null) {
            aVar.onAdShow();
        }
        n();
    }

    @Override // com.anythink.basead.f.a
    public final void a(Activity activity, Map<String, Object> map) {
    }

    public final String f() {
        s sVar = this.f3983g;
        if (sVar != null) {
            return sVar.s();
        }
        return "";
    }

    public final String g() {
        s sVar = this.f3983g;
        if (sVar != null) {
            return sVar.w();
        }
        return "";
    }

    public final String h() {
        s sVar = this.f3983g;
        if (sVar != null) {
            return sVar.t();
        }
        return "";
    }

    public final String i() {
        s sVar = this.f3983g;
        if (sVar != null) {
            return sVar.u();
        }
        return "";
    }

    public final String j() {
        s sVar = this.f3983g;
        if (sVar != null) {
            return sVar.v();
        }
        return "";
    }

    public final void l() {
        com.anythink.core.common.k.a.c cVar = this.f3991k;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void m() {
        l();
        o();
        this.f3990a = null;
        com.anythink.basead.a.c cVar = this.f3992l;
        if (cVar != null) {
            cVar.d();
            this.f3992l = null;
        }
        this.f3991k = null;
    }

    /* renamed from: com.anythink.basead.f.e$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3999a;

        public AnonymousClass2(int i10) {
            this.f3999a = i10;
        }

        @Override // com.anythink.basead.a.c.b
        public final void a() {
            com.anythink.basead.e.a aVar = e.this.f3990a;
            if (aVar != null) {
                aVar.onAdClick(this.f3999a);
            }
        }

        @Override // com.anythink.basead.a.c.b
        public final void a(boolean z10) {
            com.anythink.basead.e.a aVar = e.this.f3990a;
            if (aVar != null) {
                aVar.onDeeplinkCallback(z10);
            }
        }

        @Override // com.anythink.basead.a.c.b
        public final void b() {
        }
    }

    private void a(int i10) {
        o();
        p();
        if (this.f3992l == null) {
            this.f3992l = new com.anythink.basead.a.c(this.f3980c, this.f3981d, this.f3983g);
        }
        if (this.f3992l.a()) {
            return;
        }
        this.f3992l.a(new AnonymousClass2(i10));
        this.f3992l.a(new i(this.f3981d.f5656d, ""));
    }

    public final String b() {
        s sVar = this.f3983g;
        return sVar != null ? sVar.r() : "";
    }

    public final void a(com.anythink.basead.e.a aVar) {
        this.f3990a = aVar;
    }

    public final void a(View view) {
        c(view);
        a(view, this.o);
    }

    private void a(View view, View.OnClickListener onClickListener) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), onClickListener);
            }
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public final void a(View view, List<View> list) {
        if (this.f3981d.f5664m.F() == 2 && view != null && !this.f3996q) {
            this.f3996q = true;
            this.f3995p = new com.anythink.basead.a.a(view, this.f3981d, new AnonymousClass3());
        }
        c(view);
        if (list != null) {
            for (View view2 : list) {
                if (view2 != null) {
                    view2.setOnClickListener(this.o);
                }
            }
            return;
        }
        view.setOnClickListener(this.o);
    }

    public static /* synthetic */ void a(e eVar, int i10) {
        eVar.o();
        eVar.p();
        if (eVar.f3992l == null) {
            eVar.f3992l = new com.anythink.basead.a.c(eVar.f3980c, eVar.f3981d, eVar.f3983g);
        }
        if (eVar.f3992l.a()) {
            return;
        }
        eVar.f3992l.a(new AnonymousClass2(i10));
        eVar.f3992l.a(new i(eVar.f3981d.f5656d, ""));
    }
}
