package e3;

import java.util.ArrayDeque;

/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public final class m<A, B> {

    /* renamed from: a, reason: collision with root package name */
    public final l f27698a = new l();

    /* compiled from: ModelCache.java */
    /* loaded from: classes.dex */
    public static final class a<A> {

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayDeque f27699d;

        /* renamed from: a, reason: collision with root package name */
        public int f27700a;

        /* renamed from: b, reason: collision with root package name */
        public int f27701b;

        /* renamed from: c, reason: collision with root package name */
        public A f27702c;

        static {
            char[] cArr = t3.l.f35429a;
            f27699d = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f27699d;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f27702c = obj;
            aVar.f27701b = 0;
            aVar.f27700a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f27701b != aVar.f27701b || this.f27700a != aVar.f27700a || !this.f27702c.equals(aVar.f27702c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f27702c.hashCode() + (((this.f27700a * 31) + this.f27701b) * 31);
        }
    }
}
