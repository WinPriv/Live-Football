package com.anythink.expressad.exoplayer.c;

import com.anythink.expressad.exoplayer.c.e;
import com.anythink.expressad.exoplayer.c.f;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class g<I extends e, O extends f, E extends Exception> implements c<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f7598a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7599b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f7600c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f7601d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final I[] f7602e;
    private final O[] f;

    /* renamed from: g, reason: collision with root package name */
    private int f7603g;

    /* renamed from: h, reason: collision with root package name */
    private int f7604h;

    /* renamed from: i, reason: collision with root package name */
    private I f7605i;

    /* renamed from: j, reason: collision with root package name */
    private E f7606j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7607k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7608l;

    /* renamed from: m, reason: collision with root package name */
    private int f7609m;

    private g(I[] iArr, O[] oArr) {
        this.f7602e = iArr;
        this.f7603g = iArr.length;
        for (int i10 = 0; i10 < this.f7603g; i10++) {
            this.f7602e[i10] = h();
        }
        this.f = oArr;
        this.f7604h = oArr.length;
        for (int i11 = 0; i11 < this.f7604h; i11++) {
            this.f[i11] = i();
        }
        Thread thread = new Thread() { // from class: com.anythink.expressad.exoplayer.c.g.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                g.a(g.this);
            }
        };
        this.f7598a = thread;
        thread.start();
    }

    private void l() {
        E e10 = this.f7606j;
        if (e10 == null) {
        } else {
            throw e10;
        }
    }

    private void m() {
        if (p()) {
            this.f7599b.notify();
        }
    }

    private void n() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (o());
    }

    private boolean o() {
        synchronized (this.f7599b) {
            while (!this.f7608l && !p()) {
                this.f7599b.wait();
            }
            if (this.f7608l) {
                return false;
            }
            I removeFirst = this.f7600c.removeFirst();
            O[] oArr = this.f;
            int i10 = this.f7604h - 1;
            this.f7604h = i10;
            O o = oArr[i10];
            this.f7607k = false;
            if (removeFirst.c()) {
                o.b(4);
            } else {
                if (removeFirst.b()) {
                    o.b(Integer.MIN_VALUE);
                }
                try {
                    this.f7606j = k();
                } catch (OutOfMemoryError unused) {
                    this.f7606j = j();
                } catch (RuntimeException unused2) {
                    this.f7606j = j();
                }
                if (this.f7606j != null) {
                    synchronized (this.f7599b) {
                    }
                    return false;
                }
            }
            synchronized (this.f7599b) {
                if (this.f7607k) {
                    b((g<I, O, E>) o);
                } else if (o.b()) {
                    this.f7609m++;
                    b((g<I, O, E>) o);
                } else {
                    o.f7597b = this.f7609m;
                    this.f7609m = 0;
                    this.f7601d.addLast(o);
                }
                b((g<I, O, E>) removeFirst);
            }
            return true;
        }
    }

    private boolean p() {
        if (!this.f7600c.isEmpty() && this.f7604h > 0) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.c.c
    public final void d() {
        synchronized (this.f7599b) {
            this.f7607k = true;
            this.f7609m = 0;
            I i10 = this.f7605i;
            if (i10 != null) {
                b((g<I, O, E>) i10);
                this.f7605i = null;
            }
            while (!this.f7600c.isEmpty()) {
                b((g<I, O, E>) this.f7600c.removeFirst());
            }
            while (!this.f7601d.isEmpty()) {
                b((g<I, O, E>) this.f7601d.removeFirst());
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.c.c
    public final void e() {
        synchronized (this.f7599b) {
            this.f7608l = true;
            this.f7599b.notify();
        }
        try {
            this.f7598a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.anythink.expressad.exoplayer.c.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final I b() {
        boolean z10;
        I i10;
        synchronized (this.f7599b) {
            l();
            if (this.f7605i == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.anythink.expressad.exoplayer.k.a.b(z10);
            int i11 = this.f7603g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f7602e;
                int i12 = i11 - 1;
                this.f7603g = i12;
                i10 = iArr[i12];
            }
            this.f7605i = i10;
        }
        return i10;
    }

    @Override // com.anythink.expressad.exoplayer.c.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final O c() {
        synchronized (this.f7599b) {
            l();
            if (this.f7601d.isEmpty()) {
                return null;
            }
            return this.f7601d.removeFirst();
        }
    }

    public abstract I h();

    public abstract O i();

    public abstract E j();

    public abstract E k();

    private void a(int i10) {
        com.anythink.expressad.exoplayer.k.a.b(this.f7603g == this.f7602e.length);
        for (I i11 : this.f7602e) {
            i11.d(i10);
        }
    }

    private void b(I i10) {
        i10.a();
        I[] iArr = this.f7602e;
        int i11 = this.f7603g;
        this.f7603g = i11 + 1;
        iArr[i11] = i10;
    }

    private void b(O o) {
        o.a();
        O[] oArr = this.f;
        int i10 = this.f7604h;
        this.f7604h = i10 + 1;
        oArr[i10] = o;
    }

    @Override // com.anythink.expressad.exoplayer.c.c
    public final void a(I i10) {
        synchronized (this.f7599b) {
            l();
            com.anythink.expressad.exoplayer.k.a.a(i10 == this.f7605i);
            this.f7600c.addLast(i10);
            m();
            this.f7605i = null;
        }
    }

    public final void a(O o) {
        synchronized (this.f7599b) {
            b((g<I, O, E>) o);
            m();
        }
    }

    public static /* synthetic */ void a(g gVar) {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (gVar.o());
    }
}
