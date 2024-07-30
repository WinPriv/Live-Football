package o1;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: VersionedParcel.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final q.b<String, Method> f33539a;

    /* renamed from: b, reason: collision with root package name */
    public final q.b<String, Method> f33540b;

    /* renamed from: c, reason: collision with root package name */
    public final q.b<String, Class> f33541c;

    public a(q.b<String, Method> bVar, q.b<String, Method> bVar2, q.b<String, Class> bVar3) {
        this.f33539a = bVar;
        this.f33540b = bVar2;
        this.f33541c = bVar3;
    }

    public abstract b a();

    public final Class b(Class<? extends c> cls) throws ClassNotFoundException {
        String name = cls.getName();
        q.b<String, Class> bVar = this.f33541c;
        Class orDefault = bVar.getOrDefault(name, null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            bVar.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    public final Method c(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        q.b<String, Method> bVar = this.f33539a;
        Method orDefault = bVar.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            bVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        q.b<String, Method> bVar = this.f33540b;
        Method orDefault = bVar.getOrDefault(name, null);
        if (orDefault == null) {
            Class b10 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b10.getDeclaredMethod("write", cls, a.class);
            bVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i10);

    public abstract int i();

    public final int j(int i10, int i11) {
        if (!h(i11)) {
            return i10;
        }
        return i();
    }

    public abstract <T extends Parcelable> T k();

    public final <T extends Parcelable> T l(T t10, int i10) {
        if (!h(i10)) {
            return t10;
        }
        return (T) k();
    }

    public abstract String m();

    public final <T extends c> T n() {
        String m10 = m();
        if (m10 == null) {
            return null;
        }
        try {
            return (T) c(m10).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void o(int i10);

    public abstract void p(boolean z10);

    public abstract void q(byte[] bArr);

    public abstract void r(CharSequence charSequence);

    public abstract void s(int i10);

    public final void t(int i10, int i11) {
        o(i11);
        s(i10);
    }

    public abstract void u(Parcelable parcelable);

    public abstract void v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(c cVar) {
        if (cVar == null) {
            v(null);
            return;
        }
        try {
            v(b(cVar.getClass()).getName());
            b a10 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a10);
                a10.x();
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (e13.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e13.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
