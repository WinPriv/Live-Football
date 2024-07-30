package t3;

/* compiled from: MultiClassKey.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Class<?> f35426a;

    /* renamed from: b, reason: collision with root package name */
    public Class<?> f35427b;

    /* renamed from: c, reason: collision with root package name */
    public Class<?> f35428c;

    public k() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f35426a.equals(kVar.f35426a) && this.f35427b.equals(kVar.f35427b) && l.b(this.f35428c, kVar.f35428c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f35427b.hashCode() + (this.f35426a.hashCode() * 31)) * 31;
        Class<?> cls = this.f35428c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f35426a + ", second=" + this.f35427b + '}';
    }

    public k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f35426a = cls;
        this.f35427b = cls2;
        this.f35428c = cls3;
    }
}
