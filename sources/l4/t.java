package l4;

import j5.u;
import java.util.HashMap;
import java.util.Random;
import k4.q1;
import l4.b;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: DefaultPlaybackSessionManager.java */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: g, reason: collision with root package name */
    public static final s f32440g = new s();

    /* renamed from: h, reason: collision with root package name */
    public static final Random f32441h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public v f32445d;
    public String f;

    /* renamed from: a, reason: collision with root package name */
    public final q1.c f32442a = new q1.c();

    /* renamed from: b, reason: collision with root package name */
    public final q1.b f32443b = new q1.b();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, a> f32444c = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public q1 f32446e = q1.f30752s;

    /* compiled from: DefaultPlaybackSessionManager.java */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f32447a;

        /* renamed from: b, reason: collision with root package name */
        public int f32448b;

        /* renamed from: c, reason: collision with root package name */
        public long f32449c;

        /* renamed from: d, reason: collision with root package name */
        public final u.b f32450d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f32451e;
        public boolean f;

        public a(String str, int i10, u.b bVar) {
            long j10;
            this.f32447a = str;
            this.f32448b = i10;
            if (bVar == null) {
                j10 = -1;
            } else {
                j10 = bVar.f29838d;
            }
            this.f32449c = j10;
            if (bVar != null && bVar.a()) {
                this.f32450d = bVar;
            }
        }

        public final boolean a(b.a aVar) {
            u.b bVar = aVar.f32397d;
            if (bVar == null) {
                if (this.f32448b != aVar.f32396c) {
                    return true;
                }
                return false;
            }
            long j10 = this.f32449c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f29838d > j10) {
                return true;
            }
            u.b bVar2 = this.f32450d;
            if (bVar2 == null) {
                return false;
            }
            q1 q1Var = aVar.f32395b;
            int b10 = q1Var.b(bVar.f29835a);
            int b11 = q1Var.b(bVar2.f29835a);
            if (bVar.f29838d < bVar2.f29838d || b10 < b11) {
                return false;
            }
            if (b10 > b11) {
                return true;
            }
            boolean a10 = bVar.a();
            int i10 = bVar2.f29836b;
            if (a10) {
                int i11 = bVar.f29836b;
                if (i11 > i10) {
                    return true;
                }
                if (i11 == i10) {
                    if (bVar.f29837c > bVar2.f29837c) {
                        return true;
                    }
                }
                return false;
            }
            int i12 = bVar.f29839e;
            if (i12 == -1 || i12 > i10) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
        
            if (r0 < r8.o()) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean b(k4.q1 r7, k4.q1 r8) {
            /*
                r6 = this;
                int r0 = r6.f32448b
                int r1 = r7.o()
                r2 = 0
                r3 = -1
                if (r0 < r1) goto L13
                int r7 = r8.o()
                if (r0 >= r7) goto L11
                goto L38
            L11:
                r0 = r3
                goto L38
            L13:
                l4.t r1 = l4.t.this
                k4.q1$c r4 = r1.f32442a
                r7.m(r0, r4)
                k4.q1$c r0 = r1.f32442a
                int r4 = r0.G
            L1e:
                int r5 = r0.H
                if (r4 > r5) goto L11
                java.lang.Object r5 = r7.l(r4)
                int r5 = r8.b(r5)
                if (r5 == r3) goto L35
                k4.q1$b r7 = r1.f32443b
                k4.q1$b r7 = r8.f(r5, r7, r2)
                int r0 = r7.f30756u
                goto L38
            L35:
                int r4 = r4 + 1
                goto L1e
            L38:
                r6.f32448b = r0
                if (r0 != r3) goto L3d
                return r2
            L3d:
                r7 = 1
                j5.u$b r0 = r6.f32450d
                if (r0 != 0) goto L43
                return r7
            L43:
                java.lang.Object r0 = r0.f29835a
                int r8 = r8.b(r0)
                if (r8 == r3) goto L4c
                r2 = r7
            L4c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: l4.t.a.b(k4.q1, k4.q1):boolean");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r16 == r8.f32448b) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        r10 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l4.t.a a(int r16, j5.u.b r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap<java.lang.String, l4.t$a> r3 = r0.f32444c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L80
            java.lang.Object r8 = r4.next()
            l4.t$a r8 = (l4.t.a) r8
            long r9 = r8.f32449c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L33
            int r9 = r8.f32448b
            if (r1 != r9) goto L33
            if (r2 == 0) goto L33
            long r9 = r2.f29838d
            r8.f32449c = r9
        L33:
            j5.u$b r9 = r8.f32450d
            if (r2 != 0) goto L3c
            int r10 = r8.f32448b
            if (r1 != r10) goto L61
            goto L5f
        L3c:
            long r13 = r2.f29838d
            if (r9 != 0) goto L4d
            boolean r10 = r17.a()
            if (r10 != 0) goto L61
            long r11 = r8.f32449c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L61
            goto L5f
        L4d:
            long r10 = r9.f29838d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L61
            int r10 = r2.f29836b
            int r11 = r9.f29836b
            if (r10 != r11) goto L61
            int r10 = r2.f29837c
            int r11 = r9.f29837c
            if (r10 != r11) goto L61
        L5f:
            r10 = 1
            goto L62
        L61:
            r10 = 0
        L62:
            if (r10 == 0) goto L15
            long r10 = r8.f32449c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L7d
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L71
            goto L7d
        L71:
            if (r12 != 0) goto L15
            int r10 = d6.g0.f27302a
            j5.u$b r10 = r5.f32450d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L7d:
            r5 = r8
            r6 = r10
            goto L15
        L80:
            if (r5 != 0) goto L92
            l4.s r4 = l4.t.f32440g
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            l4.t$a r5 = new l4.t$a
            r5.<init>(r4, r1, r2)
            r3.put(r4, r5)
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.t.a(int, j5.u$b):l4.t$a");
    }

    @RequiresNonNull({"listener"})
    public final void b(b.a aVar) {
        u.b bVar;
        if (aVar.f32395b.p()) {
            this.f = null;
            return;
        }
        a aVar2 = this.f32444c.get(this.f);
        int i10 = aVar.f32396c;
        u.b bVar2 = aVar.f32397d;
        this.f = a(i10, bVar2).f32447a;
        c(aVar);
        if (bVar2 != null && bVar2.a()) {
            long j10 = bVar2.f29838d;
            if (aVar2 == null || aVar2.f32449c != j10 || (bVar = aVar2.f32450d) == null || bVar.f29836b != bVar2.f29836b || bVar.f29837c != bVar2.f29837c) {
                a(i10, new u.b(bVar2.f29835a, j10));
                this.f32445d.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        if (r1.f29838d < r3) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(l4.b.a r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            l4.v r0 = r7.f32445d     // Catch: java.lang.Throwable -> Lc0
            r0.getClass()     // Catch: java.lang.Throwable -> Lc0
            k4.q1 r0 = r8.f32395b     // Catch: java.lang.Throwable -> Lc0
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto L10
            monitor-exit(r7)
            return
        L10:
            java.util.HashMap<java.lang.String, l4.t$a> r0 = r7.f32444c     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = r7.f     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc0
            l4.t$a r0 = (l4.t.a) r0     // Catch: java.lang.Throwable -> Lc0
            j5.u$b r1 = r8.f32397d     // Catch: java.lang.Throwable -> Lc0
            r2 = 1
            if (r1 == 0) goto L3d
            if (r0 == 0) goto L3d
            long r3 = r0.f32449c     // Catch: java.lang.Throwable -> Lc0
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L30
            int r0 = r0.f32448b     // Catch: java.lang.Throwable -> Lc0
            int r3 = r8.f32396c     // Catch: java.lang.Throwable -> Lc0
            if (r0 == r3) goto L38
            goto L36
        L30:
            long r5 = r1.f29838d     // Catch: java.lang.Throwable -> Lc0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L38
        L36:
            r0 = r2
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L3d
            monitor-exit(r7)
            return
        L3d:
            int r0 = r8.f32396c     // Catch: java.lang.Throwable -> Lc0
            l4.t$a r0 = r7.a(r0, r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = r7.f     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto L4b
            java.lang.String r1 = r0.f32447a     // Catch: java.lang.Throwable -> Lc0
            r7.f = r1     // Catch: java.lang.Throwable -> Lc0
        L4b:
            j5.u$b r1 = r8.f32397d     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto L9a
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto L9a
            j5.u$b r1 = new j5.u$b     // Catch: java.lang.Throwable -> Lc0
            j5.u$b r3 = r8.f32397d     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r4 = r3.f29835a     // Catch: java.lang.Throwable -> Lc0
            long r5 = r3.f29838d     // Catch: java.lang.Throwable -> Lc0
            int r3 = r3.f29836b     // Catch: java.lang.Throwable -> Lc0
            r1.<init>(r4, r5, r3)     // Catch: java.lang.Throwable -> Lc0
            int r3 = r8.f32396c     // Catch: java.lang.Throwable -> Lc0
            l4.t$a r1 = r7.a(r3, r1)     // Catch: java.lang.Throwable -> Lc0
            boolean r3 = r1.f32451e     // Catch: java.lang.Throwable -> Lc0
            if (r3 != 0) goto L9a
            r1.f32451e = r2     // Catch: java.lang.Throwable -> Lc0
            k4.q1 r1 = r8.f32395b     // Catch: java.lang.Throwable -> Lc0
            j5.u$b r3 = r8.f32397d     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r3 = r3.f29835a     // Catch: java.lang.Throwable -> Lc0
            k4.q1$b r4 = r7.f32443b     // Catch: java.lang.Throwable -> Lc0
            r1.g(r3, r4)     // Catch: java.lang.Throwable -> Lc0
            k4.q1$b r1 = r7.f32443b     // Catch: java.lang.Throwable -> Lc0
            j5.u$b r3 = r8.f32397d     // Catch: java.lang.Throwable -> Lc0
            int r3 = r3.f29836b     // Catch: java.lang.Throwable -> Lc0
            long r3 = r1.d(r3)     // Catch: java.lang.Throwable -> Lc0
            long r3 = d6.g0.S(r3)     // Catch: java.lang.Throwable -> Lc0
            k4.q1$b r1 = r7.f32443b     // Catch: java.lang.Throwable -> Lc0
            long r5 = r1.f30758w     // Catch: java.lang.Throwable -> Lc0
            long r5 = d6.g0.S(r5)     // Catch: java.lang.Throwable -> Lc0
            long r3 = r3 + r5
            r5 = 0
            java.lang.Math.max(r5, r3)     // Catch: java.lang.Throwable -> Lc0
            l4.v r1 = r7.f32445d     // Catch: java.lang.Throwable -> Lc0
            r1.getClass()     // Catch: java.lang.Throwable -> Lc0
        L9a:
            boolean r1 = r0.f32451e     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto La5
            r0.f32451e = r2     // Catch: java.lang.Throwable -> Lc0
            l4.v r1 = r7.f32445d     // Catch: java.lang.Throwable -> Lc0
            r1.getClass()     // Catch: java.lang.Throwable -> Lc0
        La5:
            java.lang.String r1 = r0.f32447a     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = r7.f     // Catch: java.lang.Throwable -> Lc0
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto Lbe
            boolean r1 = r0.f     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto Lbe
            r0.f = r2     // Catch: java.lang.Throwable -> Lc0
            l4.v r1 = r7.f32445d     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r0 = r0.f32447a     // Catch: java.lang.Throwable -> Lc0
            l4.u r1 = (l4.u) r1     // Catch: java.lang.Throwable -> Lc0
            r1.l(r8, r0)     // Catch: java.lang.Throwable -> Lc0
        Lbe:
            monitor-exit(r7)
            return
        Lc0:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.t.c(l4.b$a):void");
    }
}
