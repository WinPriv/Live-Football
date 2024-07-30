package com.applovin.exoplayer2.c;

import com.applovin.exoplayer2.c.f;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.c.i;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class j<I extends g, O extends i, E extends f> implements d<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f13659a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13660b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f13661c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f13662d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final I[] f13663e;
    private final O[] f;

    /* renamed from: g, reason: collision with root package name */
    private int f13664g;

    /* renamed from: h, reason: collision with root package name */
    private int f13665h;

    /* renamed from: i, reason: collision with root package name */
    private I f13666i;

    /* renamed from: j, reason: collision with root package name */
    private E f13667j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13668k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13669l;

    /* renamed from: m, reason: collision with root package name */
    private int f13670m;

    public j(I[] iArr, O[] oArr) {
        this.f13663e = iArr;
        this.f13664g = iArr.length;
        for (int i10 = 0; i10 < this.f13664g; i10++) {
            this.f13663e[i10] = g();
        }
        this.f = oArr;
        this.f13665h = oArr.length;
        for (int i11 = 0; i11 < this.f13665h; i11++) {
            this.f[i11] = h();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: com.applovin.exoplayer2.c.j.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                j.this.k();
            }
        };
        this.f13659a = thread;
        thread.start();
    }

    private void i() throws f {
        E e10 = this.f13667j;
        if (e10 == null) {
        } else {
            throw e10;
        }
    }

    private void j() {
        if (m()) {
            this.f13660b.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (l());
    }

    private boolean l() throws InterruptedException {
        E a10;
        synchronized (this.f13660b) {
            while (!this.f13669l && !m()) {
                this.f13660b.wait();
            }
            if (this.f13669l) {
                return false;
            }
            I removeFirst = this.f13661c.removeFirst();
            O[] oArr = this.f;
            int i10 = this.f13665h - 1;
            this.f13665h = i10;
            O o = oArr[i10];
            boolean z10 = this.f13668k;
            this.f13668k = false;
            if (removeFirst.c()) {
                o.b(4);
            } else {
                if (removeFirst.b()) {
                    o.b(Integer.MIN_VALUE);
                }
                try {
                    a10 = a(removeFirst, o, z10);
                } catch (OutOfMemoryError e10) {
                    a10 = a((Throwable) e10);
                } catch (RuntimeException e11) {
                    a10 = a((Throwable) e11);
                }
                if (a10 != null) {
                    synchronized (this.f13660b) {
                        this.f13667j = a10;
                    }
                    return false;
                }
            }
            synchronized (this.f13660b) {
                if (this.f13668k) {
                    o.f();
                } else if (o.b()) {
                    this.f13670m++;
                    o.f();
                } else {
                    o.f13658b = this.f13670m;
                    this.f13670m = 0;
                    this.f13662d.addLast(o);
                }
                b((j<I, O, E>) removeFirst);
            }
            return true;
        }
    }

    private boolean m() {
        if (!this.f13661c.isEmpty() && this.f13665h > 0) {
            return true;
        }
        return false;
    }

    public abstract E a(I i10, O o, boolean z10);

    public abstract E a(Throwable th);

    @Override // com.applovin.exoplayer2.c.d
    public final void c() {
        synchronized (this.f13660b) {
            this.f13668k = true;
            this.f13670m = 0;
            I i10 = this.f13666i;
            if (i10 != null) {
                b((j<I, O, E>) i10);
                this.f13666i = null;
            }
            while (!this.f13661c.isEmpty()) {
                b((j<I, O, E>) this.f13661c.removeFirst());
            }
            while (!this.f13662d.isEmpty()) {
                this.f13662d.removeFirst().f();
            }
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    public void d() {
        synchronized (this.f13660b) {
            this.f13669l = true;
            this.f13660b.notify();
        }
        try {
            this.f13659a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final I a() throws f {
        boolean z10;
        I i10;
        synchronized (this.f13660b) {
            i();
            if (this.f13666i == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.applovin.exoplayer2.l.a.b(z10);
            int i11 = this.f13664g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f13663e;
                int i12 = i11 - 1;
                this.f13664g = i12;
                i10 = iArr[i12];
            }
            this.f13666i = i10;
        }
        return i10;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final O b() throws f {
        synchronized (this.f13660b) {
            i();
            if (this.f13662d.isEmpty()) {
                return null;
            }
            return this.f13662d.removeFirst();
        }
    }

    public abstract I g();

    public abstract O h();

    private void b(I i10) {
        i10.a();
        I[] iArr = this.f13663e;
        int i11 = this.f13664g;
        this.f13664g = i11 + 1;
        iArr[i11] = i10;
    }

    private void b(O o) {
        o.a();
        O[] oArr = this.f;
        int i10 = this.f13665h;
        this.f13665h = i10 + 1;
        oArr[i10] = o;
    }

    public final void a(int i10) {
        com.applovin.exoplayer2.l.a.b(this.f13664g == this.f13663e.length);
        for (I i11 : this.f13663e) {
            i11.f(i10);
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    public final void a(I i10) throws f {
        synchronized (this.f13660b) {
            i();
            com.applovin.exoplayer2.l.a.a(i10 == this.f13666i);
            this.f13661c.addLast(i10);
            j();
            this.f13666i = null;
        }
    }

    public void a(O o) {
        synchronized (this.f13660b) {
            b((j<I, O, E>) o);
            j();
        }
    }
}
