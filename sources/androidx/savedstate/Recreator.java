package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import i1.b;
import i1.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import s.f;

/* compiled from: Recreator.kt */
/* loaded from: classes.dex */
public final class Recreator implements k {

    /* renamed from: s, reason: collision with root package name */
    public final d f2405s;

    /* compiled from: Recreator.kt */
    /* loaded from: classes.dex */
    public static final class a implements b.InterfaceC0395b {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f2406a;

        public a(b bVar) {
            zc.d.d(bVar, "registry");
            this.f2406a = new LinkedHashSet();
            bVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // i1.b.InterfaceC0395b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f2406a));
            return bundle;
        }
    }

    public Recreator(d dVar) {
        zc.d.d(dVar, "owner");
        this.f2405s = dVar;
    }

    @Override // androidx.lifecycle.k
    public final void c(m mVar, i.b bVar) {
        if (bVar == i.b.ON_CREATE) {
            mVar.getLifecycle().c(this);
            d dVar = this.f2405s;
            Bundle a10 = dVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(b.a.class);
                        zc.d.c(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                zc.d.c(newInstance, "{\n                constr…wInstance()\n            }");
                                ((b.a) newInstance).a(dVar);
                            } catch (Exception e10) {
                                throw new RuntimeException(f.b("Failed to instantiate ", str), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(a3.k.l("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
