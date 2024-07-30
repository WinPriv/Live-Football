package com.anythink.expressad.exoplayer;

import android.util.Pair;
import com.anythink.expressad.exoplayer.h.a.a;

/* loaded from: classes.dex */
public abstract class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final ae f7271a = new ae() { // from class: com.anythink.expressad.exoplayer.ae.1
        @Override // com.anythink.expressad.exoplayer.ae
        public final int a(Object obj) {
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final int b() {
            return 0;
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final int c() {
            return 0;
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final b a(int i10, b bVar, boolean z10, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final a a(int i10, a aVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }
    };

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f7272a;

        /* renamed from: b, reason: collision with root package name */
        public Object f7273b;

        /* renamed from: c, reason: collision with root package name */
        public int f7274c;

        /* renamed from: d, reason: collision with root package name */
        public long f7275d;

        /* renamed from: e, reason: collision with root package name */
        private long f7276e;
        private com.anythink.expressad.exoplayer.h.a.a f;

        private long e() {
            return com.anythink.expressad.exoplayer.b.a(this.f7275d);
        }

        private long f() {
            return this.f7275d;
        }

        public final a a(Object obj, Object obj2, long j10, long j11) {
            return a(obj, obj2, 0, j10, j11, com.anythink.expressad.exoplayer.h.a.a.f);
        }

        public final long b() {
            return this.f7276e;
        }

        public final int c() {
            return this.f.f8153g;
        }

        public final int d(int i10) {
            return this.f.f8155i[i10].f8158a;
        }

        public final a a(Object obj, Object obj2, int i10, long j10, long j11, com.anythink.expressad.exoplayer.h.a.a aVar) {
            this.f7272a = obj;
            this.f7273b = obj2;
            this.f7274c = i10;
            this.f7275d = j10;
            this.f7276e = j11;
            this.f = aVar;
            return this;
        }

        public final int b(int i10) {
            return this.f.f8155i[i10].a(-1);
        }

        public final boolean c(int i10) {
            return !this.f.f8155i[i10].a();
        }

        public final long d() {
            return this.f.f8156j;
        }

        public final long c(int i10, int i11) {
            a.C0106a c0106a = this.f.f8155i[i10];
            return c0106a.f8158a != -1 ? c0106a.f8161d[i11] : com.anythink.expressad.exoplayer.b.f7291b;
        }

        public final int b(long j10) {
            com.anythink.expressad.exoplayer.h.a.a aVar = this.f;
            int i10 = 0;
            while (true) {
                long[] jArr = aVar.f8154h;
                if (i10 >= jArr.length) {
                    break;
                }
                long j11 = jArr[i10];
                if (j11 == Long.MIN_VALUE || (j10 < j11 && aVar.f8155i[i10].a())) {
                    break;
                }
                i10++;
            }
            if (i10 < aVar.f8154h.length) {
                return i10;
            }
            return -1;
        }

        public final long a() {
            return com.anythink.expressad.exoplayer.b.a(this.f7276e);
        }

        public final boolean b(int i10, int i11) {
            a.C0106a c0106a = this.f.f8155i[i10];
            return (c0106a.f8158a == -1 || c0106a.f8160c[i11] == 0) ? false : true;
        }

        public final long a(int i10) {
            return this.f.f8154h[i10];
        }

        public final int a(int i10, int i11) {
            return this.f.f8155i[i10].a(i11);
        }

        public final int a(long j10) {
            com.anythink.expressad.exoplayer.h.a.a aVar = this.f;
            int length = aVar.f8154h.length - 1;
            while (length >= 0) {
                long j11 = aVar.f8154h[length];
                if (j11 != Long.MIN_VALUE && j11 <= j10) {
                    break;
                }
                length--;
            }
            if (length < 0 || !aVar.f8155i[length].a()) {
                return -1;
            }
            return length;
        }
    }

    public abstract int a(Object obj);

    public abstract a a(int i10, a aVar, boolean z10);

    public abstract b a(int i10, b bVar, boolean z10, long j10);

    public final boolean a() {
        return b() == 0;
    }

    public abstract int b();

    public int b(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == b(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == b(z10) ? a(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract int c();

    public int a(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? b(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public int b(boolean z10) {
        return a() ? -1 : 0;
    }

    public int a(boolean z10) {
        if (a()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean b(int i10, a aVar, b bVar, int i11, boolean z10) {
        return a(i10, aVar, bVar, i11, z10) == -1;
    }

    private b a(int i10, b bVar) {
        return a(i10, bVar, false);
    }

    public final b a(int i10, b bVar, boolean z10) {
        return a(i10, bVar, z10, 0L);
    }

    public final Pair<Integer, Long> a(b bVar, a aVar, int i10, long j10) {
        return a(bVar, aVar, i10, j10, 0L);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f7277a;

        /* renamed from: b, reason: collision with root package name */
        public long f7278b;

        /* renamed from: c, reason: collision with root package name */
        public long f7279c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7280d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7281e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f7282g;

        /* renamed from: h, reason: collision with root package name */
        public long f7283h;

        /* renamed from: i, reason: collision with root package name */
        public long f7284i;

        /* renamed from: j, reason: collision with root package name */
        public long f7285j;

        private long b() {
            return this.f7283h;
        }

        private long c() {
            return com.anythink.expressad.exoplayer.b.a(this.f7284i);
        }

        private long d() {
            return this.f7284i;
        }

        private long e() {
            return com.anythink.expressad.exoplayer.b.a(this.f7285j);
        }

        private long f() {
            return this.f7285j;
        }

        public final b a(Object obj, long j10, long j11, boolean z10, boolean z11, long j12, long j13, long j14) {
            this.f7277a = obj;
            this.f7278b = j10;
            this.f7279c = j11;
            this.f7280d = z10;
            this.f7281e = z11;
            this.f7283h = j12;
            this.f7284i = j13;
            this.f = 0;
            this.f7282g = 0;
            this.f7285j = j14;
            return this;
        }

        private long a() {
            return com.anythink.expressad.exoplayer.b.a(this.f7283h);
        }
    }

    public final Pair<Integer, Long> a(b bVar, a aVar, int i10, long j10, long j11) {
        com.anythink.expressad.exoplayer.k.a.a(i10, b());
        a(i10, bVar, false, j11);
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = bVar.f7283h;
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                return null;
            }
        }
        int i11 = bVar.f;
        long j12 = bVar.f7285j + j10;
        long j13 = a(i11, aVar, false).f7275d;
        while (j13 != com.anythink.expressad.exoplayer.b.f7291b && j12 >= j13 && i11 < bVar.f7282g) {
            j12 -= j13;
            i11++;
            j13 = a(i11, aVar, false).f7275d;
        }
        return Pair.create(Integer.valueOf(i11), Long.valueOf(j12));
    }

    private a a(int i10, a aVar) {
        return a(i10, aVar, false);
    }

    public final int a(int i10, a aVar, b bVar, int i11, boolean z10) {
        int i12 = a(i10, aVar, false).f7274c;
        if (a(i12, bVar, false).f7282g != i10) {
            return i10 + 1;
        }
        int a10 = a(i12, i11, z10);
        if (a10 == -1) {
            return -1;
        }
        return a(a10, bVar, false).f;
    }
}
