package s7;

import java.lang.annotation.Annotation;

/* compiled from: Qualified.java */
/* loaded from: classes2.dex */
public final class u<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f35258a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f35259b;

    /* compiled from: Qualified.java */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public u(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f35258a = cls;
        this.f35259b = cls2;
    }

    public static <T> u<T> a(Class<T> cls) {
        return new u<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.f35259b.equals(uVar.f35259b)) {
            return false;
        }
        return this.f35258a.equals(uVar.f35258a);
    }

    public final int hashCode() {
        return this.f35258a.hashCode() + (this.f35259b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.f35259b;
        Class<? extends Annotation> cls2 = this.f35258a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
