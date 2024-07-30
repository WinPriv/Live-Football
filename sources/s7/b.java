package s7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes2.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f35212a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<u<? super T>> f35213b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<l> f35214c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35215d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35216e;
    public final e<T> f;

    /* renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f35217g;

    /* compiled from: Component.java */
    /* loaded from: classes2.dex */
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public String f35218a = null;

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f35219b;

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f35220c;

        /* renamed from: d, reason: collision with root package name */
        public int f35221d;

        /* renamed from: e, reason: collision with root package name */
        public int f35222e;
        public e<T> f;

        /* renamed from: g, reason: collision with root package name */
        public final HashSet f35223g;

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f35219b = hashSet;
            this.f35220c = new HashSet();
            this.f35221d = 0;
            this.f35222e = 0;
            this.f35223g = new HashSet();
            hashSet.add(u.a(cls));
            for (Class cls2 : clsArr) {
                if (cls2 != null) {
                    this.f35219b.add(u.a(cls2));
                } else {
                    throw new NullPointerException("Null interface");
                }
            }
        }

        public final void a(l lVar) {
            if (!this.f35219b.contains(lVar.f35241a)) {
                this.f35220c.add(lVar);
                return;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final b<T> b() {
            boolean z10;
            if (this.f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return new b<>(this.f35218a, new HashSet(this.f35219b), new HashSet(this.f35220c), this.f35221d, this.f35222e, this.f, this.f35223g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }
    }

    public b(String str, Set<u<? super T>> set, Set<l> set2, int i10, int i11, e<T> eVar, Set<Class<?>> set3) {
        this.f35212a = str;
        this.f35213b = Collections.unmodifiableSet(set);
        this.f35214c = Collections.unmodifiableSet(set2);
        this.f35215d = i10;
        this.f35216e = i11;
        this.f = eVar;
        this.f35217g = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(T t10, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(u.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            if (cls2 != null) {
                hashSet.add(u.a(cls2));
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        return new b<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new s7.a(t10), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f35213b.toArray()) + ">{" + this.f35215d + ", type=" + this.f35216e + ", deps=" + Arrays.toString(this.f35214c.toArray()) + "}";
    }
}
