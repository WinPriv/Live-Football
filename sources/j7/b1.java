package j7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: Iterators.java */
/* loaded from: classes2.dex */
public final class b1 {

    /* compiled from: Iterators.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends j7.a<T> {

        /* renamed from: w, reason: collision with root package name */
        public static final a f29879w = new a(new Object[0]);

        /* renamed from: u, reason: collision with root package name */
        public final T[] f29880u;

        /* renamed from: v, reason: collision with root package name */
        public final int f29881v;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object[] objArr) {
            super(0, 0);
            this.f29880u = objArr;
            this.f29881v = 0;
        }

        @Override // j7.a
        public final T b(int i10) {
            return this.f29880u[this.f29881v + i10];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Iterators.java */
    /* loaded from: classes2.dex */
    public static final class b implements Iterator<Object> {

        /* renamed from: s, reason: collision with root package name */
        public static final b f29882s;

        /* renamed from: t, reason: collision with root package name */
        public static final /* synthetic */ b[] f29883t;

        static {
            b bVar = new b();
            f29882s = bVar;
            f29883t = new b[]{bVar};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f29883t.clone();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            i7.f.f(false, "no calls to next() since the last call to remove()");
        }
    }

    public static void a(Iterator<?> it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        if (r2.hasNext() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (r3.equals(r2.next()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0020, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0001, code lost:
    
        if (r3 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r2.hasNext() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r2.next() != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.util.Iterator<?> r2, @javax.annotation.CheckForNull java.lang.Object r3) {
        /*
            r0 = 1
            if (r3 != 0) goto L10
        L3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()
            if (r3 != 0) goto L3
            return r0
        L10:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L10
            return r0
        L21:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.b1.b(java.util.Iterator, java.lang.Object):boolean");
    }

    public static Object c(Iterator it, String str) {
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    @CheckForNull
    public static <T> T d(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }
}
