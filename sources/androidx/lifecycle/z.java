package androidx.lifecycle;

import android.os.Bundle;
import i1.b;
import java.util.Map;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class z implements b.InterfaceC0395b {

    /* renamed from: a, reason: collision with root package name */
    public final i1.b f2015a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2016b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2017c;

    /* renamed from: d, reason: collision with root package name */
    public final uc.c f2018d;

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class a extends zc.e implements yc.a<a0> {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ j0 f2019s;

        public a(j0 j0Var) {
            this.f2019s = j0Var;
        }

        @Override // yc.a
        public final a0 k() {
            return y.b(this.f2019s);
        }
    }

    public z(i1.b bVar, j0 j0Var) {
        zc.d.d(bVar, "savedStateRegistry");
        zc.d.d(j0Var, "viewModelStoreOwner");
        this.f2015a = bVar;
        this.f2018d = new uc.c(new a(j0Var));
    }

    @Override // i1.b.InterfaceC0395b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2017c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((a0) this.f2018d.k()).f1941d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((x) entry.getValue()).f2010e.a();
            if (!zc.d.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f2016b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f2016b) {
            this.f2017c = this.f2015a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f2016b = true;
        }
    }
}
