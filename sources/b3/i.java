package b3;

import android.util.Log;
import androidx.activity.n;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* loaded from: classes.dex */
public final class i implements b3.b {

    /* renamed from: a, reason: collision with root package name */
    public final g<a, Object> f2865a = new g<>();

    /* renamed from: b, reason: collision with root package name */
    public final b f2866b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2867c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2868d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f2869e;
    public int f;

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes.dex */
    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public final b f2870a;

        /* renamed from: b, reason: collision with root package name */
        public int f2871b;

        /* renamed from: c, reason: collision with root package name */
        public Class<?> f2872c;

        public a(b bVar) {
            this.f2870a = bVar;
        }

        @Override // b3.l
        public final void a() {
            this.f2870a.h(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f2871b != aVar.f2871b || this.f2872c != aVar.f2872c) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f2871b * 31;
            Class<?> cls = this.f2872c;
            if (cls != null) {
                i10 = cls.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }

        public final String toString() {
            return "Key{size=" + this.f2871b + "array=" + this.f2872c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes.dex */
    public static final class b extends c {
        public b() {
            super(0);
        }

        @Override // b3.c
        public final l f() {
            return new a(this);
        }
    }

    public i(int i10) {
        this.f2869e = i10;
    }

    @Override // b3.b
    public final synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                f(this.f2869e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // b3.b
    public final synchronized void b() {
        f(0);
    }

    @Override // b3.b
    public final synchronized Object c(Class cls, int i10) {
        a aVar;
        boolean z10;
        Integer ceilingKey = i(cls).ceilingKey(Integer.valueOf(i10));
        boolean z11 = false;
        if (ceilingKey != null) {
            int i11 = this.f;
            if (i11 != 0 && this.f2869e / i11 < 2) {
                z10 = false;
                if (!z10 || ceilingKey.intValue() <= i10 * 8) {
                    z11 = true;
                }
            }
            z10 = true;
            if (!z10) {
            }
            z11 = true;
        }
        if (z11) {
            b bVar = this.f2866b;
            int intValue = ceilingKey.intValue();
            aVar = (a) bVar.g();
            aVar.f2871b = intValue;
            aVar.f2872c = cls;
        } else {
            a aVar2 = (a) this.f2866b.g();
            aVar2.f2871b = i10;
            aVar2.f2872c = cls;
            aVar = aVar2;
        }
        return h(aVar, cls);
    }

    @Override // b3.b
    public final synchronized Object d() {
        a aVar;
        aVar = (a) this.f2866b.g();
        aVar.f2871b = 8;
        aVar.f2872c = byte[].class;
        return h(aVar, byte[].class);
    }

    public final void e(Class cls, int i10) {
        NavigableMap<Integer, Integer> i11 = i(cls);
        Integer num = i11.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                i11.remove(Integer.valueOf(i10));
                return;
            } else {
                i11.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void f(int i10) {
        while (this.f > i10) {
            Object c10 = this.f2865a.c();
            n.n0(c10);
            b3.a g6 = g(c10.getClass());
            this.f -= g6.a() * g6.c(c10);
            e(c10.getClass(), g6.c(c10));
            if (Log.isLoggable(g6.b(), 2)) {
                Log.v(g6.b(), "evicted: " + g6.c(c10));
            }
        }
    }

    public final <T> b3.a<T> g(Class<T> cls) {
        HashMap hashMap = this.f2868d;
        b3.a<T> aVar = (b3.a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else if (cls.equals(byte[].class)) {
                aVar = new f();
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        b3.a<T> g6 = g(cls);
        T t10 = (T) this.f2865a.a(aVar);
        if (t10 != null) {
            this.f -= g6.a() * g6.c(t10);
            e(cls, g6.c(t10));
        }
        if (t10 == null) {
            if (Log.isLoggable(g6.b(), 2)) {
                Log.v(g6.b(), "Allocated " + aVar.f2871b + " bytes");
            }
            return g6.newArray(aVar.f2871b);
        }
        return t10;
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap hashMap = this.f2867c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // b3.b
    public final synchronized <T> void put(T t10) {
        boolean z10;
        Class<?> cls = t10.getClass();
        b3.a<T> g6 = g(cls);
        int c10 = g6.c(t10);
        int a10 = g6.a() * c10;
        int i10 = 1;
        if (a10 <= this.f2869e / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        a aVar = (a) this.f2866b.g();
        aVar.f2871b = c10;
        aVar.f2872c = cls;
        this.f2865a.b(aVar, t10);
        NavigableMap<Integer, Integer> i11 = i(cls);
        Integer num = i11.get(Integer.valueOf(aVar.f2871b));
        Integer valueOf = Integer.valueOf(aVar.f2871b);
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        i11.put(valueOf, Integer.valueOf(i10));
        this.f += a10;
        f(this.f2869e);
    }
}
