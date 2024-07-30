package u3;

import android.util.Log;
import u3.d;

/* compiled from: FactoryPools.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0493a f35752a = new C0493a();

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        T create();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public static final class c<T> implements m0.d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final b<T> f35753a;

        /* renamed from: b, reason: collision with root package name */
        public final e<T> f35754b;

        /* renamed from: c, reason: collision with root package name */
        public final m0.d<T> f35755c;

        public c(m0.e eVar, b bVar, e eVar2) {
            this.f35755c = eVar;
            this.f35753a = bVar;
            this.f35754b = eVar2;
        }

        @Override // m0.d
        public final boolean a(T t10) {
            if (t10 instanceof d) {
                ((d) t10).b().f35756a = true;
            }
            this.f35754b.a(t10);
            return this.f35755c.a(t10);
        }

        @Override // m0.d
        public final T b() {
            T b10 = this.f35755c.b();
            if (b10 == null) {
                b10 = this.f35753a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b10.getClass());
                }
            }
            if (b10 instanceof d) {
                b10.b().f35756a = false;
            }
            return (T) b10;
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface d {
        d.a b();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t10);
    }

    public static c a(int i10, b bVar) {
        return new c(new m0.e(i10), bVar, f35752a);
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: u3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0493a implements e<Object> {
        @Override // u3.a.e
        public final void a(Object obj) {
        }
    }
}
