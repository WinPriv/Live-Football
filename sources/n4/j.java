package n4;

import java.util.ArrayDeque;
import n4.f;
import n4.g;
import n4.h;

/* compiled from: SimpleDecoder.java */
/* loaded from: classes2.dex */
public abstract class j<I extends g, O extends h, E extends f> implements d<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    public final a f33333a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f33334b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f33335c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f33336d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public final I[] f33337e;
    public final O[] f;

    /* renamed from: g, reason: collision with root package name */
    public int f33338g;

    /* renamed from: h, reason: collision with root package name */
    public int f33339h;

    /* renamed from: i, reason: collision with root package name */
    public I f33340i;

    /* renamed from: j, reason: collision with root package name */
    public r5.i f33341j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f33342k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33343l;

    /* compiled from: SimpleDecoder.java */
    /* loaded from: classes2.dex */
    public class a extends Thread {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ j f33344s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r5.f fVar) {
            super("ExoPlayer:SimpleDecoder");
            this.f33344s = fVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            j jVar = this.f33344s;
            jVar.getClass();
            do {
                try {
                } catch (InterruptedException e10) {
                    throw new IllegalStateException(e10);
                }
            } while (jVar.f());
        }
    }

    public j(I[] iArr, O[] oArr) {
        this.f33337e = iArr;
        this.f33338g = iArr.length;
        for (int i10 = 0; i10 < this.f33338g; i10++) {
            this.f33337e[i10] = new r5.k();
        }
        this.f = oArr;
        this.f33339h = oArr.length;
        for (int i11 = 0; i11 < this.f33339h; i11++) {
            this.f[i11] = new r5.e((r5.f) this);
        }
        a aVar = new a((r5.f) this);
        this.f33333a = aVar;
        aVar.start();
    }

    @Override // n4.d
    public final Object b() throws f {
        synchronized (this.f33334b) {
            try {
                r5.i iVar = this.f33341j;
                if (iVar == null) {
                    if (this.f33336d.isEmpty()) {
                        return null;
                    }
                    return this.f33336d.removeFirst();
                }
                throw iVar;
            } finally {
            }
        }
    }

    @Override // n4.d
    public final Object c() throws f {
        boolean z10;
        I i10;
        synchronized (this.f33334b) {
            try {
                r5.i iVar = this.f33341j;
                if (iVar == null) {
                    if (this.f33340i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d6.a.d(z10);
                    int i11 = this.f33338g;
                    if (i11 == 0) {
                        i10 = null;
                    } else {
                        I[] iArr = this.f33337e;
                        int i12 = i11 - 1;
                        this.f33338g = i12;
                        i10 = iArr[i12];
                    }
                    this.f33340i = i10;
                } else {
                    throw iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    @Override // n4.d
    public final void d(r5.k kVar) throws f {
        boolean z10;
        synchronized (this.f33334b) {
            try {
                r5.i iVar = this.f33341j;
                if (iVar == null) {
                    boolean z11 = true;
                    if (kVar == this.f33340i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d6.a.a(z10);
                    this.f33335c.addLast(kVar);
                    if (this.f33335c.isEmpty() || this.f33339h <= 0) {
                        z11 = false;
                    }
                    if (z11) {
                        this.f33334b.notify();
                    }
                    this.f33340i = null;
                } else {
                    throw iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract r5.i e(g gVar, h hVar, boolean z10);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f33334b
            monitor-enter(r0)
        L3:
            boolean r1 = r7.f33343l     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L23
            java.util.ArrayDeque<I extends n4.g> r1 = r7.f33335c     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L1a
            int r1 = r7.f33339h     // Catch: java.lang.Throwable -> L17
            if (r1 <= 0) goto L1a
            r1 = r3
            goto L1b
        L17:
            r1 = move-exception
            goto Laf
        L1a:
            r1 = r2
        L1b:
            if (r1 != 0) goto L23
            java.lang.Object r1 = r7.f33334b     // Catch: java.lang.Throwable -> L17
            r1.wait()     // Catch: java.lang.Throwable -> L17
            goto L3
        L23:
            boolean r1 = r7.f33343l     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r2
        L29:
            java.util.ArrayDeque<I extends n4.g> r1 = r7.f33335c     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L17
            n4.g r1 = (n4.g) r1     // Catch: java.lang.Throwable -> L17
            O extends n4.h[] r4 = r7.f     // Catch: java.lang.Throwable -> L17
            int r5 = r7.f33339h     // Catch: java.lang.Throwable -> L17
            int r5 = r5 - r3
            r7.f33339h = r5     // Catch: java.lang.Throwable -> L17
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L17
            boolean r5 = r7.f33342k     // Catch: java.lang.Throwable -> L17
            r7.f33342k = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            r0 = 4
            boolean r6 = r1.f(r0)
            if (r6 == 0) goto L4a
            r4.e(r0)
            goto L83
        L4a:
            boolean r0 = r1.g()
            if (r0 == 0) goto L55
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.e(r0)
        L55:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.f(r0)
            if (r6 == 0) goto L60
            r4.e(r0)
        L60:
            r5.i r0 = r7.e(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L65 java.lang.RuntimeException -> L6e
            goto L77
        L65:
            r0 = move-exception
            r5.i r5 = new r5.i
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L76
        L6e:
            r0 = move-exception
            r5.i r5 = new r5.i
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L76:
            r0 = r5
        L77:
            if (r0 == 0) goto L83
            java.lang.Object r5 = r7.f33334b
            monitor-enter(r5)
            r7.f33341j = r0     // Catch: java.lang.Throwable -> L80
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            return r2
        L80:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            throw r0
        L83:
            java.lang.Object r2 = r7.f33334b
            monitor-enter(r2)
            boolean r0 = r7.f33342k     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto L8e
            r4.h()     // Catch: java.lang.Throwable -> Lac
            goto L9d
        L8e:
            boolean r0 = r4.g()     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto L98
            r4.h()     // Catch: java.lang.Throwable -> Lac
            goto L9d
        L98:
            java.util.ArrayDeque<O extends n4.h> r0 = r7.f33336d     // Catch: java.lang.Throwable -> Lac
            r0.addLast(r4)     // Catch: java.lang.Throwable -> Lac
        L9d:
            r1.h()     // Catch: java.lang.Throwable -> Lac
            int r0 = r7.f33338g     // Catch: java.lang.Throwable -> Lac
            int r4 = r0 + 1
            r7.f33338g = r4     // Catch: java.lang.Throwable -> Lac
            I extends n4.g[] r4 = r7.f33337e     // Catch: java.lang.Throwable -> Lac
            r4[r0] = r1     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lac
            return r3
        Lac:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lac
            throw r0
        Laf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.j.f():boolean");
    }

    @Override // n4.d
    public final void flush() {
        synchronized (this.f33334b) {
            this.f33342k = true;
            I i10 = this.f33340i;
            if (i10 != null) {
                i10.h();
                int i11 = this.f33338g;
                this.f33338g = i11 + 1;
                this.f33337e[i11] = i10;
                this.f33340i = null;
            }
            while (!this.f33335c.isEmpty()) {
                I removeFirst = this.f33335c.removeFirst();
                removeFirst.h();
                int i12 = this.f33338g;
                this.f33338g = i12 + 1;
                this.f33337e[i12] = removeFirst;
            }
            while (!this.f33336d.isEmpty()) {
                this.f33336d.removeFirst().h();
            }
        }
    }

    @Override // n4.d
    public final void release() {
        synchronized (this.f33334b) {
            this.f33343l = true;
            this.f33334b.notify();
        }
        try {
            this.f33333a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
