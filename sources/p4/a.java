package p4;

import d6.g0;
import java.io.IOException;
import p4.u;

/* compiled from: BinarySearchSeeker.java */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0457a f34279a;

    /* renamed from: b, reason: collision with root package name */
    public final f f34280b;

    /* renamed from: c, reason: collision with root package name */
    public c f34281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34282d;

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: p4.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0457a implements u {

        /* renamed from: a, reason: collision with root package name */
        public final d f34283a;

        /* renamed from: b, reason: collision with root package name */
        public final long f34284b;

        /* renamed from: c, reason: collision with root package name */
        public final long f34285c = 0;

        /* renamed from: d, reason: collision with root package name */
        public final long f34286d;

        /* renamed from: e, reason: collision with root package name */
        public final long f34287e;
        public final long f;

        /* renamed from: g, reason: collision with root package name */
        public final long f34288g;

        public C0457a(d dVar, long j10, long j11, long j12, long j13, long j14) {
            this.f34283a = dVar;
            this.f34284b = j10;
            this.f34286d = j11;
            this.f34287e = j12;
            this.f = j13;
            this.f34288g = j14;
        }

        @Override // p4.u
        public final boolean e() {
            return true;
        }

        @Override // p4.u
        public final u.a h(long j10) {
            v vVar = new v(j10, c.a(this.f34283a.timeUsToTargetTime(j10), this.f34285c, this.f34286d, this.f34287e, this.f, this.f34288g));
            return new u.a(vVar, vVar);
        }

        @Override // p4.u
        public final long i() {
            return this.f34284b;
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f34289a;

        /* renamed from: b, reason: collision with root package name */
        public final long f34290b;

        /* renamed from: c, reason: collision with root package name */
        public final long f34291c;

        /* renamed from: d, reason: collision with root package name */
        public long f34292d;

        /* renamed from: e, reason: collision with root package name */
        public long f34293e;
        public long f;

        /* renamed from: g, reason: collision with root package name */
        public long f34294g;

        /* renamed from: h, reason: collision with root package name */
        public long f34295h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f34289a = j10;
            this.f34290b = j11;
            this.f34292d = j12;
            this.f34293e = j13;
            this.f = j14;
            this.f34294g = j15;
            this.f34291c = j16;
            this.f34295h = a(j11, j12, j13, j14, j15, j16);
        }

        public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 < j14 && j11 + 1 < j12) {
                long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
                return g0.i(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
            }
            return j13;
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public interface d {
        long timeUsToTargetTime(long j10);
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f34296d = new e(-3, com.anythink.expressad.exoplayer.b.f7291b, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f34297a;

        /* renamed from: b, reason: collision with root package name */
        public final long f34298b;

        /* renamed from: c, reason: collision with root package name */
        public final long f34299c;

        public e(int i10, long j10, long j11) {
            this.f34297a = i10;
            this.f34298b = j10;
            this.f34299c = j11;
        }

        public static e a(long j10) {
            return new e(0, com.anythink.expressad.exoplayer.b.f7291b, j10);
        }
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f34280b = fVar;
        this.f34282d = i10;
        this.f34279a = new C0457a(dVar, j10, j11, j12, j13, j14);
    }

    public static int b(p4.e eVar, long j10, t tVar) {
        if (j10 == eVar.f34314d) {
            return 0;
        }
        tVar.f34349a = j10;
        return 1;
    }

    public final int a(p4.e eVar, t tVar) throws IOException {
        boolean z10;
        while (true) {
            c cVar = this.f34281c;
            d6.a.e(cVar);
            long j10 = cVar.f;
            long j11 = cVar.f34294g;
            long j12 = cVar.f34295h;
            long j13 = j11 - j10;
            long j14 = this.f34282d;
            f fVar = this.f34280b;
            if (j13 <= j14) {
                this.f34281c = null;
                fVar.b();
                return b(eVar, j10, tVar);
            }
            long j15 = j12 - eVar.f34314d;
            if (j15 >= 0 && j15 <= 262144) {
                eVar.i((int) j15);
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return b(eVar, j12, tVar);
            }
            eVar.f = 0;
            e a10 = fVar.a(eVar, cVar.f34290b);
            int i10 = a10.f34297a;
            if (i10 != -3) {
                long j16 = a10.f34298b;
                long j17 = a10.f34299c;
                if (i10 != -2) {
                    if (i10 != -1) {
                        if (i10 == 0) {
                            long j18 = j17 - eVar.f34314d;
                            if (j18 >= 0 && j18 <= 262144) {
                                eVar.i((int) j18);
                            }
                            this.f34281c = null;
                            fVar.b();
                            return b(eVar, j17, tVar);
                        }
                        throw new IllegalStateException("Invalid case");
                    }
                    cVar.f34293e = j16;
                    cVar.f34294g = j17;
                    cVar.f34295h = c.a(cVar.f34290b, cVar.f34292d, j16, cVar.f, j17, cVar.f34291c);
                } else {
                    cVar.f34292d = j16;
                    cVar.f = j17;
                    cVar.f34295h = c.a(cVar.f34290b, j16, cVar.f34293e, j17, cVar.f34294g, cVar.f34291c);
                }
            } else {
                this.f34281c = null;
                fVar.b();
                return b(eVar, j12, tVar);
            }
        }
    }

    public final void c(long j10) {
        c cVar = this.f34281c;
        if (cVar != null && cVar.f34289a == j10) {
            return;
        }
        C0457a c0457a = this.f34279a;
        this.f34281c = new c(j10, c0457a.f34283a.timeUsToTargetTime(j10), c0457a.f34285c, c0457a.f34286d, c0457a.f34287e, c0457a.f, c0457a.f34288g);
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public interface f {
        e a(p4.e eVar, long j10) throws IOException;

        default void b() {
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public static final class b implements d {
        @Override // p4.a.d
        public final long timeUsToTargetTime(long j10) {
            return j10;
        }
    }
}
