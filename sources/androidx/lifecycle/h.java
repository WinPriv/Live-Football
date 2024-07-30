package androidx.lifecycle;

import androidx.lifecycle.i;
import i1.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: LegacySavedStateHandleController.java */
/* loaded from: classes.dex */
public final class h {

    /* compiled from: LegacySavedStateHandleController.java */
    /* loaded from: classes.dex */
    public static final class a implements b.a {
        @Override // i1.b.a
        public final void a(i1.d dVar) {
            HashMap<String, e0> hashMap;
            if (dVar instanceof j0) {
                i0 viewModelStore = ((j0) dVar).getViewModelStore();
                i1.b savedStateRegistry = dVar.getSavedStateRegistry();
                viewModelStore.getClass();
                Iterator it = new HashSet(viewModelStore.f1981a.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashMap = viewModelStore.f1981a;
                    if (!hasNext) {
                        break;
                    } else {
                        h.a(hashMap.get((String) it.next()), savedStateRegistry, dVar.getLifecycle());
                    }
                }
                if (!new HashSet(hashMap.keySet()).isEmpty()) {
                    savedStateRegistry.d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    public static void a(e0 e0Var, i1.b bVar, i iVar) {
        Object obj;
        boolean z10;
        HashMap hashMap = e0Var.f1962a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = e0Var.f1962a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !(z10 = savedStateHandleController.f1938t)) {
            if (!z10) {
                savedStateHandleController.f1938t = true;
                iVar.a(savedStateHandleController);
                bVar.c(savedStateHandleController.f1937s, savedStateHandleController.f1939u.f2010e);
                b(iVar, bVar);
                return;
            }
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
    }

    public static void b(final i iVar, final i1.b bVar) {
        i.c b10 = iVar.b();
        if (b10 != i.c.INITIALIZED && !b10.a(i.c.STARTED)) {
            iVar.a(new k() { // from class: androidx.lifecycle.LegacySavedStateHandleController$1
                @Override // androidx.lifecycle.k
                public final void c(m mVar, i.b bVar2) {
                    if (bVar2 == i.b.ON_START) {
                        i.this.c(this);
                        bVar.d();
                    }
                }
            });
        } else {
            bVar.d();
        }
    }
}
