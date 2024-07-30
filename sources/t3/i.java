package t3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class i<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f35420a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f35421b;

    /* renamed from: c, reason: collision with root package name */
    public long f35422c;

    /* compiled from: LruCache.java */
    /* loaded from: classes.dex */
    public static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        public final Y f35423a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35424b;

        public a(Y y, int i10) {
            this.f35423a = y;
            this.f35424b = i10;
        }
    }

    public i(long j10) {
        this.f35421b = j10;
    }

    public final synchronized Y a(T t10) {
        Y y;
        a aVar = (a) this.f35420a.get(t10);
        if (aVar != null) {
            y = aVar.f35423a;
        } else {
            y = null;
        }
        return y;
    }

    public int b(Y y) {
        return 1;
    }

    public final synchronized Y d(T t10, Y y) {
        a aVar;
        int b10 = b(y);
        long j10 = b10;
        Y y10 = null;
        if (j10 >= this.f35421b) {
            c(t10, y);
            return null;
        }
        if (y != null) {
            this.f35422c += j10;
        }
        LinkedHashMap linkedHashMap = this.f35420a;
        if (y == null) {
            aVar = null;
        } else {
            aVar = new a(y, b10);
        }
        a aVar2 = (a) linkedHashMap.put(t10, aVar);
        if (aVar2 != null) {
            this.f35422c -= aVar2.f35424b;
            if (!aVar2.f35423a.equals(y)) {
                c(t10, aVar2.f35423a);
            }
        }
        e(this.f35421b);
        if (aVar2 != null) {
            y10 = aVar2.f35423a;
        }
        return y10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j10) {
        while (this.f35422c > j10) {
            Iterator it = this.f35420a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f35422c -= aVar.f35424b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.f35423a);
        }
    }

    public void c(T t10, Y y) {
    }
}
