package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final C0163a f14078a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f14079b;

    /* renamed from: c, reason: collision with root package name */
    protected c f14080c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14081d;

    /* renamed from: com.applovin.exoplayer2.e.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0163a implements v {

        /* renamed from: a, reason: collision with root package name */
        private final d f14082a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14083b;

        /* renamed from: c, reason: collision with root package name */
        private final long f14084c;

        /* renamed from: d, reason: collision with root package name */
        private final long f14085d;

        /* renamed from: e, reason: collision with root package name */
        private final long f14086e;
        private final long f;

        /* renamed from: g, reason: collision with root package name */
        private final long f14087g;

        public C0163a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f14082a = dVar;
            this.f14083b = j10;
            this.f14084c = j11;
            this.f14085d = j12;
            this.f14086e = j13;
            this.f = j14;
            this.f14087g = j15;
        }

        @Override // com.applovin.exoplayer2.e.v
        public boolean a() {
            return true;
        }

        @Override // com.applovin.exoplayer2.e.v
        public long b() {
            return this.f14083b;
        }

        @Override // com.applovin.exoplayer2.e.v
        public v.a a(long j10) {
            return new v.a(new w(j10, c.a(this.f14082a.timeUsToTargetTime(j10), this.f14084c, this.f14085d, this.f14086e, this.f, this.f14087g)));
        }

        public long b(long j10) {
            return this.f14082a.timeUsToTargetTime(j10);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f14107a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14108b;

        /* renamed from: c, reason: collision with root package name */
        private final long f14109c;

        /* renamed from: d, reason: collision with root package name */
        private long f14110d;

        /* renamed from: e, reason: collision with root package name */
        private long f14111e;
        private long f;

        /* renamed from: g, reason: collision with root package name */
        private long f14112g;

        /* renamed from: h, reason: collision with root package name */
        private long f14113h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f14107a = j10;
            this.f14108b = j11;
            this.f14110d = j12;
            this.f14111e = j13;
            this.f = j14;
            this.f14112g = j15;
            this.f14109c = j16;
            this.f14113h = a(j11, j12, j13, j14, j15, j16);
        }

        private void f() {
            this.f14113h = a(this.f14108b, this.f14110d, this.f14111e, this.f, this.f14112g, this.f14109c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long c() {
            return this.f14108b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long d() {
            return this.f14107a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long e() {
            return this.f14113h;
        }

        public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return ai.a(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f14112g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10, long j11) {
            this.f14111e = j10;
            this.f14112g = j11;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10, long j11) {
            this.f14110d = j10;
            this.f = j11;
            f();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        long timeUsToTargetTime(long j10);
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f14114a = new e(-3, com.anythink.expressad.exoplayer.b.f7291b, -1);

        /* renamed from: b, reason: collision with root package name */
        private final int f14115b;

        /* renamed from: c, reason: collision with root package name */
        private final long f14116c;

        /* renamed from: d, reason: collision with root package name */
        private final long f14117d;

        private e(int i10, long j10, long j11) {
            this.f14115b = i10;
            this.f14116c = j10;
            this.f14117d = j11;
        }

        public static e a(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e b(long j10, long j11) {
            return new e(-2, j10, j11);
        }

        public static e a(long j10) {
            return new e(0, com.anythink.expressad.exoplayer.b.f7291b, j10);
        }
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f14079b = fVar;
        this.f14081d = i10;
        this.f14078a = new C0163a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public final v a() {
        return this.f14078a;
    }

    public void b(boolean z10, long j10) {
    }

    public final void a(long j10) {
        c cVar = this.f14080c;
        if (cVar == null || cVar.d() != j10) {
            this.f14080c = b(j10);
        }
    }

    public final boolean b() {
        return this.f14080c != null;
    }

    public c b(long j10) {
        return new c(j10, this.f14078a.b(j10), this.f14078a.f14084c, this.f14078a.f14085d, this.f14078a.f14086e, this.f14078a.f, this.f14078a.f14087g);
    }

    public int a(i iVar, u uVar) throws IOException {
        while (true) {
            c cVar = (c) com.applovin.exoplayer2.l.a.a(this.f14080c);
            long a10 = cVar.a();
            long b10 = cVar.b();
            long e10 = cVar.e();
            if (b10 - a10 <= this.f14081d) {
                a(false, a10);
                return a(iVar, a10, uVar);
            }
            if (!a(iVar, e10)) {
                return a(iVar, e10, uVar);
            }
            iVar.a();
            e a11 = this.f14079b.a(iVar, cVar.c());
            int i10 = a11.f14115b;
            if (i10 == -3) {
                a(false, e10);
                return a(iVar, e10, uVar);
            }
            if (i10 == -2) {
                cVar.a(a11.f14116c, a11.f14117d);
            } else {
                if (i10 != -1) {
                    if (i10 == 0) {
                        a(iVar, a11.f14117d);
                        a(true, a11.f14117d);
                        return a(iVar, a11.f14117d, uVar);
                    }
                    throw new IllegalStateException("Invalid case");
                }
                cVar.b(a11.f14116c, a11.f14117d);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        e a(i iVar, long j10) throws IOException;

        default void a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // com.applovin.exoplayer2.e.a.d
        public long timeUsToTargetTime(long j10) {
            return j10;
        }
    }

    public final void a(boolean z10, long j10) {
        this.f14080c = null;
        this.f14079b.a();
        b(z10, j10);
    }

    public final boolean a(i iVar, long j10) throws IOException {
        long c10 = j10 - iVar.c();
        if (c10 < 0 || c10 > 262144) {
            return false;
        }
        iVar.b((int) c10);
        return true;
    }

    public final int a(i iVar, long j10, u uVar) {
        if (j10 == iVar.c()) {
            return 0;
        }
        uVar.f14937a = j10;
        return 1;
    }
}
