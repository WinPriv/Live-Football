package i1;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.savedstate.Recreator;
import i1.b;
import java.util.Map;
import k.b;

/* compiled from: SavedStateRegistryController.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f29033a;

    /* renamed from: b, reason: collision with root package name */
    public final b f29034b = new b();

    /* renamed from: c, reason: collision with root package name */
    public boolean f29035c;

    public c(d dVar) {
        this.f29033a = dVar;
    }

    public final void a() {
        boolean z10;
        d dVar = this.f29033a;
        i lifecycle = dVar.getLifecycle();
        zc.d.c(lifecycle, "owner.lifecycle");
        if (lifecycle.b() == i.c.INITIALIZED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lifecycle.a(new Recreator(dVar));
            final b bVar = this.f29034b;
            bVar.getClass();
            if (!bVar.f29029b) {
                lifecycle.a(new k() { // from class: i1.a
                    @Override // androidx.lifecycle.k
                    public final void c(m mVar, i.b bVar2) {
                        b bVar3 = b.this;
                        zc.d.d(bVar3, "this$0");
                        if (bVar2 == i.b.ON_START) {
                            bVar3.f = true;
                        } else if (bVar2 == i.b.ON_STOP) {
                            bVar3.f = false;
                        }
                    }
                });
                bVar.f29029b = true;
                this.f29035c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f29035c) {
            a();
        }
        i lifecycle = this.f29033a.getLifecycle();
        zc.d.c(lifecycle, "owner.lifecycle");
        if (!lifecycle.b().a(i.c.STARTED)) {
            b bVar = this.f29034b;
            if (bVar.f29029b) {
                if (!bVar.f29031d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    bVar.f29030c = bundle2;
                    bVar.f29031d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void c(Bundle bundle) {
        zc.d.d(bundle, "outBundle");
        b bVar = this.f29034b;
        bVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bVar.f29030c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        k.b<String, b.InterfaceC0395b> bVar2 = bVar.f29028a;
        bVar2.getClass();
        b.d dVar = new b.d();
        bVar2.f30232u.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((b.InterfaceC0395b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
