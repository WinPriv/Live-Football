package com.anythink.expressad.exoplayer.e;

/* loaded from: classes.dex */
public interface k {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l f7951a;

        /* renamed from: b, reason: collision with root package name */
        public final l f7952b;

        public a(l lVar) {
            this(lVar, lVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7951a.equals(aVar.f7951a) && this.f7952b.equals(aVar.f7952b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7952b.hashCode() + (this.f7951a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f7951a);
            if (this.f7951a.equals(this.f7952b)) {
                str = "";
            } else {
                str = ", " + this.f7952b;
            }
            return a3.l.p(sb2, str, "]");
        }

        public a(l lVar, l lVar2) {
            this.f7951a = (l) com.anythink.expressad.exoplayer.k.a.a(lVar);
            this.f7952b = (l) com.anythink.expressad.exoplayer.k.a.a(lVar2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        private final long f7953a;

        /* renamed from: b, reason: collision with root package name */
        private final a f7954b;

        private b(long j10) {
            this(j10, 0L);
        }

        @Override // com.anythink.expressad.exoplayer.e.k
        public final boolean a() {
            return false;
        }

        @Override // com.anythink.expressad.exoplayer.e.k
        public final long b() {
            return this.f7953a;
        }

        public b(long j10, long j11) {
            this.f7953a = j10;
            this.f7954b = new a(j11 == 0 ? l.f7955a : new l(0L, j11));
        }

        @Override // com.anythink.expressad.exoplayer.e.k
        public final a a(long j10) {
            return this.f7954b;
        }
    }

    a a(long j10);

    boolean a();

    long b();
}
