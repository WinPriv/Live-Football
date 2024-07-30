package com.anythink.basead.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import com.anythink.basead.ui.BaseAdActivity;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.k;
import com.anythink.core.common.k.u;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.basead.d f3518a;

    /* renamed from: b, reason: collision with root package name */
    com.anythink.core.common.k.a.c f3519b;

    /* renamed from: d, reason: collision with root package name */
    private View f3521d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.core.common.e.j f3522e;
    private InterfaceC0048a f;

    /* renamed from: i, reason: collision with root package name */
    private Application.ActivityLifecycleCallbacks f3525i;

    /* renamed from: c, reason: collision with root package name */
    private final String f3520c = "a";

    /* renamed from: g, reason: collision with root package name */
    private Activity f3523g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3524h = false;

    /* renamed from: com.anythink.basead.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0048a {
        void a(int i10);
    }

    public a(View view, com.anythink.core.common.e.j jVar, InterfaceC0048a interfaceC0048a) {
        this.f3521d = view;
        this.f3522e = jVar;
        this.f = interfaceC0048a;
        final Context applicationContext = view.getContext().getApplicationContext();
        applicationContext = applicationContext instanceof Application ? applicationContext : n.a().g();
        com.anythink.basead.a aVar = new com.anythink.basead.a() { // from class: com.anythink.basead.a.a.1
            @Override // com.anythink.basead.a, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                if ((a.this.f3523g == activity || a.b(a.this)) && a.this.f3525i != null) {
                    ((Application) applicationContext).unregisterActivityLifecycleCallbacks(a.this.f3525i);
                    a.this.f3525i = null;
                }
            }

            @Override // com.anythink.basead.a, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                if (a.this.f3523g == activity || a.b(a.this)) {
                    a.this.f3518a.b();
                }
            }

            @Override // com.anythink.basead.a, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                if (a.this.f3523g == null && (activity instanceof BaseAdActivity)) {
                    a.this.f3523g = activity;
                }
                if (a.this.f3523g == activity || a.b(a.this)) {
                    a.c(a.this);
                }
            }
        };
        this.f3525i = aVar;
        try {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(aVar);
        } catch (Exception unused) {
            com.anythink.core.common.j.c.a("Error", "Error, cannot registerActivityLifecycleCallbacks here!", n.a().r());
        }
        this.f3518a = new com.anythink.basead.d(this.f3522e.f5664m.G(), new Runnable() { // from class: com.anythink.basead.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(2);
            }
        });
    }

    public final void b() {
        if (this.f3525i != null) {
            ((Application) n.a().g()).unregisterActivityLifecycleCallbacks(this.f3525i);
            this.f3525i = null;
        }
        this.f3518a.c();
        com.anythink.core.common.k.a.c cVar = this.f3519b;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void c() {
        if (this.f3522e.f5664m.F() == 3) {
            a(3);
        }
    }

    private boolean d() {
        return this.f3522e.f5661j == 4;
    }

    private void e() {
        if (this.f3524h) {
            a();
        }
    }

    private void f() {
        this.f3518a.b();
    }

    public static /* synthetic */ void c(a aVar) {
        if (aVar.f3524h) {
            aVar.a();
        }
    }

    public final void a() {
        this.f3524h = true;
        k kVar = this.f3522e.f5664m;
        if (kVar.F() != 2 || kVar.G() < 0) {
            return;
        }
        this.f3518a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i10) {
        if (this.f != null) {
            n.a().a(new Runnable() { // from class: com.anythink.basead.a.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.f.a(i10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i10) {
        int i11;
        View view;
        View view2;
        boolean z10 = true;
        if (i10 == 2 && ((i11 = this.f3522e.f5661j) == 0 || i11 == 2 ? (view = this.f3521d) == null || view.getParent() == null || !this.f3521d.isShown() || !u.b(this.f3521d) : (view2 = this.f3521d) == null || view2.getParent() == null || !this.f3521d.isShown())) {
            z10 = false;
        }
        if (z10) {
            b(i10);
            return;
        }
        int i12 = this.f3522e.f5661j;
        if (i12 == 2 || i12 == 0) {
            com.anythink.core.common.k.a.a aVar = new com.anythink.core.common.k.a.a() { // from class: com.anythink.basead.a.a.3
                @Override // com.anythink.core.common.k.a.a, com.anythink.core.common.k.a.b
                public final int getImpressionMinPercentageViewed() {
                    return 30;
                }

                @Override // com.anythink.core.common.k.a.a, com.anythink.core.common.k.a.b
                public final void recordImpression(View view3) {
                    a.this.b(i10);
                }
            };
            if (this.f3519b == null) {
                this.f3521d.getContext();
                this.f3519b = new com.anythink.core.common.k.a.c();
            }
            this.f3519b.a(this.f3521d, aVar);
        }
    }

    public static /* synthetic */ boolean b(a aVar) {
        return aVar.f3522e.f5661j == 4;
    }
}
