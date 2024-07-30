package androidx.lifecycle;

import android.app.Application;
import b1.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider.kt */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f1966a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1967b;

    /* renamed from: c, reason: collision with root package name */
    public final b1.a f1968c;

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public static a f1969c;

        /* renamed from: b, reason: collision with root package name */
        public final Application f1970b;

        public a(Application application) {
            this.f1970b = application;
        }

        @Override // androidx.lifecycle.g0.c, androidx.lifecycle.g0.b
        public final <T extends e0> T a(Class<T> cls) {
            Application application = this.f1970b;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.g0.b
        public final e0 b(Class cls, b1.d dVar) {
            if (this.f1970b != null) {
                return a(cls);
            }
            Application application = (Application) dVar.f2797a.get(f0.f1965a);
            if (application != null) {
                return c(cls, application);
            }
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public final <T extends e0> T c(Class<T> cls, Application application) {
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    zc.d.c(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e13);
                }
            }
            return (T) super.a(cls);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public interface b {
        default <T extends e0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default e0 b(Class cls, b1.d dVar) {
            return a(cls);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static c f1971a;

        @Override // androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            try {
                T newInstance = cls.newInstance();
                zc.d.c(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }
    }

    public g0(i0 i0Var, b bVar, b1.a aVar) {
        zc.d.d(i0Var, "store");
        zc.d.d(bVar, "factory");
        zc.d.d(aVar, "defaultCreationExtras");
        this.f1966a = i0Var;
        this.f1967b = bVar;
        this.f1968c = aVar;
    }

    public final <T extends e0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e0 b(Class cls, String str) {
        e0 a10;
        d dVar;
        zc.d.d(str, "key");
        i0 i0Var = this.f1966a;
        e0 e0Var = i0Var.f1981a.get(str);
        boolean isInstance = cls.isInstance(e0Var);
        b bVar = this.f1967b;
        if (isInstance) {
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                zc.d.c(e0Var, "viewModel");
                dVar.c(e0Var);
            }
            if (e0Var != null) {
                return e0Var;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        b1.d dVar2 = new b1.d(this.f1968c);
        dVar2.f2797a.put(h0.f1972a, str);
        try {
            a10 = bVar.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            a10 = bVar.a(cls);
        }
        e0 put = i0Var.f1981a.put(str, a10);
        if (put != null) {
            put.b();
        }
        return a10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, b bVar) {
        this(i0Var, bVar, a.C0029a.f2798b);
        zc.d.d(i0Var, "store");
        zc.d.d(bVar, "factory");
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class d {
        public void c(e0 e0Var) {
        }
    }
}
