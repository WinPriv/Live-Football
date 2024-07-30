package com.applovin.exoplayer2.e;

/* loaded from: classes.dex */
public interface v {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final w f14938a;

        /* renamed from: b, reason: collision with root package name */
        public final w f14939b;

        public a(w wVar) {
            this(wVar, wVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f14938a.equals(aVar.f14938a) && this.f14939b.equals(aVar.f14939b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f14939b.hashCode() + (this.f14938a.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f14938a);
            if (this.f14938a.equals(this.f14939b)) {
                str = "";
            } else {
                str = ", " + this.f14939b;
            }
            return a3.l.p(sb2, str, "]");
        }

        public a(w wVar, w wVar2) {
            this.f14938a = (w) com.applovin.exoplayer2.l.a.b(wVar);
            this.f14939b = (w) com.applovin.exoplayer2.l.a.b(wVar2);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements v {

        /* renamed from: a, reason: collision with root package name */
        private final long f14940a;

        /* renamed from: b, reason: collision with root package name */
        private final a f14941b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // com.applovin.exoplayer2.e.v
        public boolean a() {
            return false;
        }

        @Override // com.applovin.exoplayer2.e.v
        public long b() {
            return this.f14940a;
        }

        public b(long j10, long j11) {
            this.f14940a = j10;
            this.f14941b = new a(j11 == 0 ? w.f14942a : new w(0L, j11));
        }

        @Override // com.applovin.exoplayer2.e.v
        public a a(long j10) {
            return this.f14941b;
        }
    }

    a a(long j10);

    boolean a();

    long b();
}
