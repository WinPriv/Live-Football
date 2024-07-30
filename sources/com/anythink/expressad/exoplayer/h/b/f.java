package com.anythink.expressad.exoplayer.h.b;

import com.anythink.expressad.exoplayer.h.b.g;
import com.anythink.expressad.exoplayer.h.t;
import com.anythink.expressad.exoplayer.h.x;
import com.anythink.expressad.exoplayer.h.y;
import com.anythink.expressad.exoplayer.h.z;
import com.anythink.expressad.exoplayer.j.t;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.m;
import com.anythink.expressad.exoplayer.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f<T extends g> implements y, z, t.a<c>, t.d {

    /* renamed from: d, reason: collision with root package name */
    private static final String f8287d = "ChunkSampleStream";

    /* renamed from: a, reason: collision with root package name */
    public final int f8288a;

    /* renamed from: b, reason: collision with root package name */
    long f8289b;

    /* renamed from: c, reason: collision with root package name */
    boolean f8290c;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f8291e;
    private final m[] f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f8292g;

    /* renamed from: h, reason: collision with root package name */
    private final T f8293h;

    /* renamed from: i, reason: collision with root package name */
    private final z.a<f<T>> f8294i;

    /* renamed from: j, reason: collision with root package name */
    private final t.a f8295j;

    /* renamed from: k, reason: collision with root package name */
    private final int f8296k;

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.t f8297l = new com.anythink.expressad.exoplayer.j.t("Loader:ChunkSampleStream");

    /* renamed from: m, reason: collision with root package name */
    private final e f8298m = new e();

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList<com.anythink.expressad.exoplayer.h.b.a> f8299n;
    private final List<com.anythink.expressad.exoplayer.h.b.a> o;

    /* renamed from: p, reason: collision with root package name */
    private final x f8300p;

    /* renamed from: q, reason: collision with root package name */
    private final x[] f8301q;

    /* renamed from: r, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.h.b.b f8302r;

    /* renamed from: s, reason: collision with root package name */
    private m f8303s;

    /* renamed from: t, reason: collision with root package name */
    private b<T> f8304t;

    /* renamed from: u, reason: collision with root package name */
    private long f8305u;

    /* renamed from: v, reason: collision with root package name */
    private long f8306v;

    /* loaded from: classes.dex */
    public interface b<T extends g> {
        void a();
    }

    private f(int i10, int[] iArr, m[] mVarArr, T t10, z.a<f<T>> aVar, com.anythink.expressad.exoplayer.j.b bVar, long j10, int i11, t.a aVar2) {
        int length;
        this.f8288a = i10;
        this.f8291e = iArr;
        this.f = mVarArr;
        this.f8293h = t10;
        this.f8294i = aVar;
        this.f8295j = aVar2;
        this.f8296k = i11;
        ArrayList<com.anythink.expressad.exoplayer.h.b.a> arrayList = new ArrayList<>();
        this.f8299n = arrayList;
        this.o = Collections.unmodifiableList(arrayList);
        int i12 = 0;
        if (iArr == null) {
            length = 0;
        } else {
            length = iArr.length;
        }
        this.f8301q = new x[length];
        this.f8292g = new boolean[length];
        int i13 = length + 1;
        int[] iArr2 = new int[i13];
        x[] xVarArr = new x[i13];
        x xVar = new x(bVar);
        this.f8300p = xVar;
        iArr2[0] = i10;
        xVarArr[0] = xVar;
        while (i12 < length) {
            x xVar2 = new x(bVar);
            this.f8301q[i12] = xVar2;
            int i14 = i12 + 1;
            xVarArr[i14] = xVar2;
            iArr2[i14] = iArr[i12];
            i12 = i14;
        }
        this.f8302r = new com.anythink.expressad.exoplayer.h.b.b(iArr2, xVarArr);
        this.f8305u = j10;
        this.f8306v = j10;
    }

    private T f() {
        return this.f8293h;
    }

    private long h() {
        return this.f8293h.a();
    }

    private void i() {
        this.f8304t = null;
        this.f8300p.j();
        for (x xVar : this.f8301q) {
            xVar.j();
        }
        this.f8297l.a(this);
    }

    private com.anythink.expressad.exoplayer.h.b.a j() {
        return this.f8299n.get(r0.size() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[RETURN] */
    @Override // com.anythink.expressad.exoplayer.j.t.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ int a(com.anythink.expressad.exoplayer.h.b.c r24, long r25, long r27, java.io.IOException r29) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            com.anythink.expressad.exoplayer.h.b.c r1 = (com.anythink.expressad.exoplayer.h.b.c) r1
            long r17 = r1.d()
            boolean r2 = r1 instanceof com.anythink.expressad.exoplayer.h.b.a
            java.util.ArrayList<com.anythink.expressad.exoplayer.h.b.a> r3 = r0.f8299n
            int r3 = r3.size()
            r4 = 1
            int r3 = r3 - r4
            r5 = 0
            int r5 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            r21 = 0
            if (r5 == 0) goto L28
            if (r2 == 0) goto L28
            boolean r5 = r0.a(r3)
            if (r5 != 0) goto L25
            goto L28
        L25:
            r5 = r21
            goto L29
        L28:
            r5 = r4
        L29:
            T extends com.anythink.expressad.exoplayer.h.b.g r6 = r0.f8293h
            boolean r6 = r6.f()
            if (r6 == 0) goto L59
            if (r5 != 0) goto L3b
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r3 = "Ignoring attempt to cancel non-cancelable load."
            android.util.Log.w(r2, r3)
            goto L59
        L3b:
            if (r2 == 0) goto L56
            com.anythink.expressad.exoplayer.h.b.a r2 = r0.d(r3)
            if (r2 != r1) goto L45
            r2 = r4
            goto L47
        L45:
            r2 = r21
        L47:
            com.anythink.expressad.exoplayer.k.a.b(r2)
            java.util.ArrayList<com.anythink.expressad.exoplayer.h.b.a> r2 = r0.f8299n
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L56
            long r2 = r0.f8306v
            r0.f8305u = r2
        L56:
            r22 = r4
            goto L5b
        L59:
            r22 = r21
        L5b:
            com.anythink.expressad.exoplayer.h.t$a r2 = r0.f8295j
            com.anythink.expressad.exoplayer.j.k r3 = r1.f8266b
            int r4 = r1.f8267c
            int r5 = r0.f8288a
            com.anythink.expressad.exoplayer.m r6 = r1.f8268d
            int r7 = r1.f8269e
            java.lang.Object r8 = r1.f
            long r9 = r1.f8270g
            long r11 = r1.f8271h
            r13 = r25
            r15 = r27
            r19 = r29
            r20 = r22
            r2.a(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r17, r19, r20)
            if (r22 == 0) goto L81
            com.anythink.expressad.exoplayer.h.z$a<com.anythink.expressad.exoplayer.h.b.f<T extends com.anythink.expressad.exoplayer.h.b.g>> r1 = r0.f8294i
            r1.a(r0)
            r1 = 2
            return r1
        L81:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.h.b.f.a(com.anythink.expressad.exoplayer.j.t$c, long, long, java.io.IOException):int");
    }

    @Override // com.anythink.expressad.exoplayer.h.z
    public final void a_(long j10) {
        int size;
        int c10;
        if (this.f8297l.a() || a() || (size = this.f8299n.size()) <= (c10 = this.f8293h.c())) {
            return;
        }
        while (true) {
            if (c10 < size) {
                if (!a(c10)) {
                    break;
                } else {
                    c10++;
                }
            } else {
                c10 = size;
                break;
            }
        }
        if (c10 == size) {
            return;
        }
        long j11 = j().f8271h;
        com.anythink.expressad.exoplayer.h.b.a d10 = d(c10);
        if (this.f8299n.isEmpty()) {
            this.f8305u = this.f8306v;
        }
        this.f8290c = false;
        this.f8295j.a(this.f8288a, d10.f8270g, j11);
    }

    @Override // com.anythink.expressad.exoplayer.j.t.d
    public final void g() {
        this.f8300p.a();
        for (x xVar : this.f8301q) {
            xVar.a();
        }
    }

    private void b(long j10) {
        com.anythink.expressad.exoplayer.h.b.a aVar;
        boolean z10;
        this.f8306v = j10;
        this.f8300p.i();
        if (a()) {
            z10 = false;
        } else {
            for (int i10 = 0; i10 < this.f8299n.size(); i10++) {
                aVar = this.f8299n.get(i10);
                long j11 = aVar.f8270g;
                if (j11 == j10 && aVar.f8260a == com.anythink.expressad.exoplayer.b.f7291b) {
                    break;
                } else {
                    if (j11 > j10) {
                        break;
                    }
                }
            }
            aVar = null;
            if (aVar != null) {
                z10 = this.f8300p.b(aVar.a(0));
                this.f8289b = Long.MIN_VALUE;
            } else {
                z10 = this.f8300p.a(j10, (j10 > e() ? 1 : (j10 == e() ? 0 : -1)) < 0) != -1;
                this.f8289b = this.f8306v;
            }
        }
        if (z10) {
            for (x xVar : this.f8301q) {
                xVar.i();
                xVar.a(j10, false);
            }
            return;
        }
        this.f8305u = j10;
        this.f8290c = false;
        this.f8299n.clear();
        if (this.f8297l.a()) {
            this.f8297l.b();
            return;
        }
        this.f8300p.a();
        for (x xVar2 : this.f8301q) {
            xVar2.a();
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.y
    public final void c() {
        this.f8297l.c();
        this.f8297l.a();
    }

    @Override // com.anythink.expressad.exoplayer.h.z
    public final long d() {
        if (this.f8290c) {
            return Long.MIN_VALUE;
        }
        if (a()) {
            return this.f8305u;
        }
        long j10 = this.f8306v;
        com.anythink.expressad.exoplayer.h.b.a j11 = j();
        if (!j11.f()) {
            if (this.f8299n.size() > 1) {
                j11 = this.f8299n.get(r2.size() - 2);
            } else {
                j11 = null;
            }
        }
        if (j11 != null) {
            j10 = Math.max(j10, j11.f8271h);
        }
        return Math.max(j10, this.f8300p.g());
    }

    @Override // com.anythink.expressad.exoplayer.h.z
    public final long e() {
        if (a()) {
            return this.f8305u;
        }
        if (this.f8290c) {
            return Long.MIN_VALUE;
        }
        return j().f8271h;
    }

    /* loaded from: classes.dex */
    public final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final f<T> f8307a;

        /* renamed from: c, reason: collision with root package name */
        private final x f8309c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8310d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8311e;

        public a(f<T> fVar, x xVar, int i10) {
            this.f8307a = fVar;
            this.f8309c = xVar;
            this.f8310d = i10;
        }

        private void d() {
            if (!this.f8311e) {
                f.this.f8295j.a(f.this.f8291e[this.f8310d], f.this.f[this.f8310d], 0, (Object) null, f.this.f8306v);
                this.f8311e = true;
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final int a(long j10) {
            int a10;
            if (f.this.f8290c && j10 > this.f8309c.g()) {
                a10 = this.f8309c.k();
            } else {
                a10 = this.f8309c.a(j10, true);
                if (a10 == -1) {
                    a10 = 0;
                }
            }
            if (a10 > 0) {
                d();
            }
            return a10;
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final boolean b() {
            f fVar = f.this;
            if (!fVar.f8290c) {
                if (fVar.a() || !this.f8309c.c()) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final int a(n nVar, com.anythink.expressad.exoplayer.c.e eVar, boolean z10) {
            if (f.this.a()) {
                return -3;
            }
            x xVar = this.f8309c;
            f fVar = f.this;
            int a10 = xVar.a(nVar, eVar, z10, fVar.f8290c, fVar.f8289b);
            if (a10 == -4) {
                d();
            }
            return a10;
        }

        private void a() {
            com.anythink.expressad.exoplayer.k.a.b(f.this.f8292g[this.f8310d]);
            f.this.f8292g[this.f8310d] = false;
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final void c() {
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.z
    public final boolean c(long j10) {
        if (this.f8290c || this.f8297l.a()) {
            return false;
        }
        boolean a10 = a();
        if (!a10) {
            j();
        }
        e eVar = this.f8298m;
        boolean z10 = eVar.f8286b;
        c cVar = eVar.f8285a;
        eVar.f8285a = null;
        eVar.f8286b = false;
        if (z10) {
            this.f8305u = com.anythink.expressad.exoplayer.b.f7291b;
            this.f8290c = true;
            return true;
        }
        if (cVar == null) {
            return false;
        }
        if (cVar instanceof com.anythink.expressad.exoplayer.h.b.a) {
            com.anythink.expressad.exoplayer.h.b.a aVar = (com.anythink.expressad.exoplayer.h.b.a) cVar;
            if (a10) {
                long j11 = aVar.f8270g;
                long j12 = this.f8305u;
                if (j11 == j12) {
                    j12 = Long.MIN_VALUE;
                }
                this.f8289b = j12;
                this.f8305u = com.anythink.expressad.exoplayer.b.f7291b;
            }
            aVar.a(this.f8302r);
            this.f8299n.add(aVar);
        }
        this.f8295j.a(cVar.f8266b, cVar.f8267c, this.f8288a, cVar.f8268d, cVar.f8269e, cVar.f, cVar.f8270g, cVar.f8271h, this.f8297l.a(cVar, this, this.f8296k));
        return true;
    }

    private com.anythink.expressad.exoplayer.h.b.a d(int i10) {
        com.anythink.expressad.exoplayer.h.b.a aVar = this.f8299n.get(i10);
        ArrayList<com.anythink.expressad.exoplayer.h.b.a> arrayList = this.f8299n;
        af.a((List) arrayList, i10, arrayList.size());
        int i11 = 0;
        this.f8300p.a(aVar.a(0));
        while (true) {
            x[] xVarArr = this.f8301q;
            if (i11 >= xVarArr.length) {
                return aVar;
            }
            x xVar = xVarArr[i11];
            i11++;
            xVar.a(aVar.a(i11));
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.t.a
    public final /* synthetic */ void a(c cVar, long j10, long j11) {
        c cVar2 = cVar;
        this.f8295j.a(cVar2.f8266b, cVar2.f8267c, this.f8288a, cVar2.f8268d, cVar2.f8269e, cVar2.f, cVar2.f8270g, cVar2.f8271h, j10, j11, cVar2.d());
        this.f8294i.a(this);
    }

    @Override // com.anythink.expressad.exoplayer.j.t.a
    public final /* synthetic */ void a(c cVar, long j10, long j11, boolean z10) {
        c cVar2 = cVar;
        this.f8295j.b(cVar2.f8266b, cVar2.f8267c, this.f8288a, cVar2.f8268d, cVar2.f8269e, cVar2.f, cVar2.f8270g, cVar2.f8271h, j10, j11, cVar2.d());
        if (z10) {
            return;
        }
        this.f8300p.a();
        for (x xVar : this.f8301q) {
            xVar.a();
        }
        this.f8294i.a(this);
    }

    private void c(int i10) {
        com.anythink.expressad.exoplayer.h.b.a aVar = this.f8299n.get(i10);
        m mVar = aVar.f8268d;
        if (!mVar.equals(this.f8303s)) {
            this.f8295j.a(this.f8288a, mVar, aVar.f8269e, aVar.f, aVar.f8270g);
        }
        this.f8303s = mVar;
    }

    @Override // com.anythink.expressad.exoplayer.h.y
    public final boolean b() {
        if (this.f8290c) {
            return true;
        }
        return !a() && this.f8300p.c();
    }

    private void a(long j10, boolean z10) {
        int d10 = this.f8300p.d();
        this.f8300p.a(j10, z10, true);
        int d11 = this.f8300p.d();
        if (d11 > d10) {
            long h10 = this.f8300p.h();
            int i10 = 0;
            while (true) {
                x[] xVarArr = this.f8301q;
                if (i10 >= xVarArr.length) {
                    break;
                }
                xVarArr[i10].a(h10, z10, this.f8292g[i10]);
                i10++;
            }
            int b10 = b(d11, 0);
            if (b10 > 0) {
                af.a((List) this.f8299n, 0, b10);
            }
        }
    }

    private void b(int i10) {
        int b10 = b(i10, 0);
        if (b10 > 0) {
            af.a((List) this.f8299n, 0, b10);
        }
    }

    private int b(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f8299n.size()) {
                return this.f8299n.size() - 1;
            }
        } while (this.f8299n.get(i11).a(0) <= i10);
        return i11 - 1;
    }

    private f<T>.a a(long j10, int i10) {
        for (int i11 = 0; i11 < this.f8301q.length; i11++) {
            if (this.f8291e[i11] == i10) {
                com.anythink.expressad.exoplayer.k.a.b(!this.f8292g[i11]);
                this.f8292g[i11] = true;
                this.f8301q[i11].i();
                this.f8301q[i11].a(j10, true);
                return new a(this, this.f8301q[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    private void a(b<T> bVar) {
        this.f8304t = bVar;
        this.f8300p.j();
        for (x xVar : this.f8301q) {
            xVar.j();
        }
        this.f8297l.a(this);
    }

    @Override // com.anythink.expressad.exoplayer.h.y
    public final int a(n nVar, com.anythink.expressad.exoplayer.c.e eVar, boolean z10) {
        if (a()) {
            return -3;
        }
        int a10 = this.f8300p.a(nVar, eVar, z10, this.f8290c, this.f8289b);
        if (a10 == -4) {
            a(this.f8300p.e(), 1);
        }
        return a10;
    }

    @Override // com.anythink.expressad.exoplayer.h.y
    public final int a(long j10) {
        int i10 = 0;
        if (a()) {
            return 0;
        }
        if (this.f8290c && j10 > this.f8300p.g()) {
            i10 = this.f8300p.k();
        } else {
            int a10 = this.f8300p.a(j10, true);
            if (a10 != -1) {
                i10 = a10;
            }
        }
        if (i10 > 0) {
            a(this.f8300p.e(), i10);
        }
        return i10;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(c cVar, long j10, long j11) {
        this.f8295j.a(cVar.f8266b, cVar.f8267c, this.f8288a, cVar.f8268d, cVar.f8269e, cVar.f, cVar.f8270g, cVar.f8271h, j10, j11, cVar.d());
        this.f8294i.a(this);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(c cVar, long j10, long j11, boolean z10) {
        this.f8295j.b(cVar.f8266b, cVar.f8267c, this.f8288a, cVar.f8268d, cVar.f8269e, cVar.f, cVar.f8270g, cVar.f8271h, j10, j11, cVar.d());
        if (z10) {
            return;
        }
        this.f8300p.a();
        for (x xVar : this.f8301q) {
            xVar.a();
        }
        this.f8294i.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[RETURN] */
    /* renamed from: a, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a2(com.anythink.expressad.exoplayer.h.b.c r24, long r25, long r27, java.io.IOException r29) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            long r17 = r24.d()
            boolean r2 = r1 instanceof com.anythink.expressad.exoplayer.h.b.a
            java.util.ArrayList<com.anythink.expressad.exoplayer.h.b.a> r3 = r0.f8299n
            int r3 = r3.size()
            r4 = 1
            int r3 = r3 - r4
            r5 = 0
            int r5 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            r21 = 0
            if (r5 == 0) goto L26
            if (r2 == 0) goto L26
            boolean r5 = r0.a(r3)
            if (r5 != 0) goto L23
            goto L26
        L23:
            r5 = r21
            goto L27
        L26:
            r5 = r4
        L27:
            T extends com.anythink.expressad.exoplayer.h.b.g r6 = r0.f8293h
            boolean r6 = r6.f()
            if (r6 == 0) goto L57
            if (r5 != 0) goto L39
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r3 = "Ignoring attempt to cancel non-cancelable load."
            android.util.Log.w(r2, r3)
            goto L57
        L39:
            if (r2 == 0) goto L54
            com.anythink.expressad.exoplayer.h.b.a r2 = r0.d(r3)
            if (r2 != r1) goto L43
            r2 = r4
            goto L45
        L43:
            r2 = r21
        L45:
            com.anythink.expressad.exoplayer.k.a.b(r2)
            java.util.ArrayList<com.anythink.expressad.exoplayer.h.b.a> r2 = r0.f8299n
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L54
            long r2 = r0.f8306v
            r0.f8305u = r2
        L54:
            r22 = r4
            goto L59
        L57:
            r22 = r21
        L59:
            com.anythink.expressad.exoplayer.h.t$a r2 = r0.f8295j
            com.anythink.expressad.exoplayer.j.k r3 = r1.f8266b
            int r4 = r1.f8267c
            int r5 = r0.f8288a
            com.anythink.expressad.exoplayer.m r6 = r1.f8268d
            int r7 = r1.f8269e
            java.lang.Object r8 = r1.f
            long r9 = r1.f8270g
            long r11 = r1.f8271h
            r13 = r25
            r15 = r27
            r19 = r29
            r20 = r22
            r2.a(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r17, r19, r20)
            if (r22 == 0) goto L7f
            com.anythink.expressad.exoplayer.h.z$a<com.anythink.expressad.exoplayer.h.b.f<T extends com.anythink.expressad.exoplayer.h.b.g>> r1 = r0.f8294i
            r1.a(r0)
            r1 = 2
            return r1
        L7f:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.h.b.f.a2(com.anythink.expressad.exoplayer.h.b.c, long, long, java.io.IOException):int");
    }

    private static boolean a(c cVar) {
        return cVar instanceof com.anythink.expressad.exoplayer.h.b.a;
    }

    private boolean a(int i10) {
        int e10;
        com.anythink.expressad.exoplayer.h.b.a aVar = this.f8299n.get(i10);
        if (this.f8300p.e() > aVar.a(0)) {
            return true;
        }
        int i11 = 0;
        do {
            x[] xVarArr = this.f8301q;
            if (i11 >= xVarArr.length) {
                return false;
            }
            e10 = xVarArr[i11].e();
            i11++;
        } while (e10 <= aVar.a(i11));
        return true;
    }

    public final boolean a() {
        return this.f8305u != com.anythink.expressad.exoplayer.b.f7291b;
    }

    private void a(int i10, int i11) {
        int b10 = b(i10 - i11, 0);
        int b11 = i11 == 1 ? b10 : b(i10 - 1, b10);
        while (b10 <= b11) {
            c(b10);
            b10++;
        }
    }
}
