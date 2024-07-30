package p4;

/* compiled from: SeekMap.java */
/* loaded from: classes2.dex */
public interface u {

    /* compiled from: SeekMap.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final v f34350a;

        /* renamed from: b, reason: collision with root package name */
        public final v f34351b;

        public a() {
            throw null;
        }

        public a(v vVar, v vVar2) {
            this.f34350a = vVar;
            this.f34351b = vVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f34350a.equals(aVar.f34350a) && this.f34351b.equals(aVar.f34351b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f34351b.hashCode() + (this.f34350a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("[");
            v vVar = this.f34350a;
            sb2.append(vVar);
            v vVar2 = this.f34351b;
            if (vVar.equals(vVar2)) {
                str = "";
            } else {
                str = ", " + vVar2;
            }
            return a3.l.p(sb2, str, "]");
        }
    }

    /* compiled from: SeekMap.java */
    /* loaded from: classes2.dex */
    public static class b implements u {

        /* renamed from: a, reason: collision with root package name */
        public final long f34352a;

        /* renamed from: b, reason: collision with root package name */
        public final a f34353b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // p4.u
        public final boolean e() {
            return false;
        }

        @Override // p4.u
        public final a h(long j10) {
            return this.f34353b;
        }

        @Override // p4.u
        public final long i() {
            return this.f34352a;
        }

        public b(long j10, long j11) {
            this.f34352a = j10;
            v vVar = j11 == 0 ? v.f34354c : new v(0L, j11);
            this.f34353b = new a(vVar, vVar);
        }
    }

    boolean e();

    a h(long j10);

    long i();
}
