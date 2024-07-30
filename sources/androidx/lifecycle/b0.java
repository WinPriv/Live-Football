package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.lifecycle.x;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class b0 extends g0.d implements g0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Application f1949a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.a f1950b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1951c;

    /* renamed from: d, reason: collision with root package name */
    public final i f1952d;

    /* renamed from: e, reason: collision with root package name */
    public final i1.b f1953e;

    @SuppressLint({"LambdaLast"})
    public b0(Application application, i1.d dVar, Bundle bundle) {
        g0.a aVar;
        zc.d.d(dVar, "owner");
        this.f1953e = dVar.getSavedStateRegistry();
        this.f1952d = dVar.getLifecycle();
        this.f1951c = bundle;
        this.f1949a = application;
        if (application != null) {
            if (g0.a.f1969c == null) {
                g0.a.f1969c = new g0.a(application);
            }
            aVar = g0.a.f1969c;
            zc.d.b(aVar);
        } else {
            aVar = new g0.a(null);
        }
        this.f1950b = aVar;
    }

    @Override // androidx.lifecycle.g0.b
    public final <T extends e0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.g0.b
    public final e0 b(Class cls, b1.d dVar) {
        Constructor a10;
        h0 h0Var = h0.f1972a;
        LinkedHashMap linkedHashMap = dVar.f2797a;
        String str = (String) linkedHashMap.get(h0Var);
        if (str != null) {
            if (linkedHashMap.get(y.f2011a) != null && linkedHashMap.get(y.f2012b) != null) {
                Application application = (Application) linkedHashMap.get(f0.f1965a);
                boolean isAssignableFrom = a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a10 = c0.a(cls, c0.f1954a);
                } else {
                    a10 = c0.a(cls, c0.f1955b);
                }
                if (a10 == null) {
                    return this.f1950b.b(cls, dVar);
                }
                if (isAssignableFrom && application != null) {
                    return c0.b(cls, a10, application, y.a(dVar));
                }
                return c0.b(cls, a10, y.a(dVar));
            }
            if (this.f1952d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.g0.d
    public final void c(e0 e0Var) {
        i iVar = this.f1952d;
        if (iVar != null) {
            h.a(e0Var, this.f1953e, iVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e0 d(Class cls, String str) {
        Constructor a10;
        e0 b10;
        Object obj;
        Application application;
        if (this.f1952d != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            if (isAssignableFrom && this.f1949a != null) {
                a10 = c0.a(cls, c0.f1954a);
            } else {
                a10 = c0.a(cls, c0.f1955b);
            }
            if (a10 == null) {
                if (this.f1949a != null) {
                    return this.f1950b.a(cls);
                }
                if (g0.c.f1971a == null) {
                    g0.c.f1971a = new g0.c();
                }
                g0.c cVar = g0.c.f1971a;
                zc.d.b(cVar);
                return cVar.a(cls);
            }
            i1.b bVar = this.f1953e;
            i iVar = this.f1952d;
            Bundle bundle = this.f1951c;
            Bundle a11 = bVar.a(str);
            Class<? extends Object>[] clsArr = x.f;
            x a12 = x.a.a(a11, bundle);
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, a12);
            if (!savedStateHandleController.f1938t) {
                savedStateHandleController.f1938t = true;
                iVar.a(savedStateHandleController);
                bVar.c(str, a12.f2010e);
                h.b(iVar, bVar);
                if (isAssignableFrom && (application = this.f1949a) != null) {
                    b10 = c0.b(cls, a10, application, a12);
                } else {
                    b10 = c0.b(cls, a10, a12);
                }
                synchronized (b10.f1962a) {
                    obj = b10.f1962a.get("androidx.lifecycle.savedstate.vm.tag");
                    if (obj == 0) {
                        b10.f1962a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                    }
                }
                if (obj != 0) {
                    savedStateHandleController = obj;
                }
                if (b10.f1964c) {
                    e0.a(savedStateHandleController);
                }
                return b10;
            }
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
