package com.anythink.expressad.exoplayer.i;

import com.anythink.expressad.exoplayer.h.ae;
import com.anythink.expressad.exoplayer.i.f;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.m;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8589a = 10000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8590b = 25000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8591c = 25000;

    /* renamed from: d, reason: collision with root package name */
    public static final float f8592d = 0.75f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f8593e = 0.75f;
    public static final long f = 2000;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.d f8594j;

    /* renamed from: k, reason: collision with root package name */
    private final long f8595k;

    /* renamed from: l, reason: collision with root package name */
    private final long f8596l;

    /* renamed from: m, reason: collision with root package name */
    private final long f8597m;

    /* renamed from: n, reason: collision with root package name */
    private final float f8598n;
    private final float o;

    /* renamed from: p, reason: collision with root package name */
    private final long f8599p;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.k.c f8600q;

    /* renamed from: r, reason: collision with root package name */
    private float f8601r;

    /* renamed from: s, reason: collision with root package name */
    private int f8602s;

    /* renamed from: t, reason: collision with root package name */
    private int f8603t;

    /* renamed from: u, reason: collision with root package name */
    private long f8604u;

    /* renamed from: com.anythink.expressad.exoplayer.i.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0111a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.expressad.exoplayer.j.d f8605a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8606b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8607c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8608d;

        /* renamed from: e, reason: collision with root package name */
        private final float f8609e;
        private final float f;

        /* renamed from: g, reason: collision with root package name */
        private final long f8610g;

        /* renamed from: h, reason: collision with root package name */
        private final com.anythink.expressad.exoplayer.k.c f8611h;

        public C0111a(com.anythink.expressad.exoplayer.j.d dVar) {
            this(dVar, 10000, 25000, 25000, 0.75f, com.anythink.expressad.exoplayer.k.c.f9012a);
        }

        private a b(ae aeVar, int... iArr) {
            return new a(aeVar, iArr, this.f8605a, this.f8606b, this.f8607c, this.f8608d, this.f8609e, this.f, this.f8610g, this.f8611h);
        }

        @Override // com.anythink.expressad.exoplayer.i.f.a
        public final /* synthetic */ f a(ae aeVar, int[] iArr) {
            return new a(aeVar, iArr, this.f8605a, this.f8606b, this.f8607c, this.f8608d, this.f8609e, this.f, this.f8610g, this.f8611h);
        }

        private C0111a(com.anythink.expressad.exoplayer.j.d dVar, int i10, int i11, int i12, float f) {
            this(dVar, i10, i11, i12, f, com.anythink.expressad.exoplayer.k.c.f9012a);
        }

        private C0111a(com.anythink.expressad.exoplayer.j.d dVar, int i10, int i11, int i12, float f, com.anythink.expressad.exoplayer.k.c cVar) {
            this.f8605a = dVar;
            this.f8606b = i10;
            this.f8607c = i11;
            this.f8608d = i12;
            this.f8609e = f;
            this.f = 0.75f;
            this.f8610g = 2000L;
            this.f8611h = cVar;
        }
    }

    private a(ae aeVar, int[] iArr, com.anythink.expressad.exoplayer.j.d dVar) {
        this(aeVar, iArr, dVar, 10000L, 25000L, 25000L, 0.75f, 0.75f, 2000L, com.anythink.expressad.exoplayer.k.c.f9012a);
    }

    @Override // com.anythink.expressad.exoplayer.i.b, com.anythink.expressad.exoplayer.i.f
    public final void a() {
        this.f8604u = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final int b() {
        return this.f8602s;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final int c() {
        return this.f8603t;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final Object d() {
        return null;
    }

    public a(ae aeVar, int[] iArr, com.anythink.expressad.exoplayer.j.d dVar, long j10, long j11, long j12, float f10, float f11, long j13, com.anythink.expressad.exoplayer.k.c cVar) {
        super(aeVar, iArr);
        this.f8594j = dVar;
        this.f8595k = j10 * 1000;
        this.f8596l = j11 * 1000;
        this.f8597m = j12 * 1000;
        this.f8598n = f10;
        this.o = f11;
        this.f8599p = j13;
        this.f8600q = cVar;
        this.f8601r = 1.0f;
        this.f8603t = 1;
        this.f8604u = com.anythink.expressad.exoplayer.b.f7291b;
        this.f8602s = a(Long.MIN_VALUE);
    }

    private long b(long j10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b && j10 <= this.f8595k) {
            return ((float) j10) * this.o;
        }
        return this.f8595k;
    }

    @Override // com.anythink.expressad.exoplayer.i.b, com.anythink.expressad.exoplayer.i.f
    public final void a(float f10) {
        this.f8601r = f10;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final void a(long j10, long j11) {
        long j12;
        long a10 = this.f8600q.a();
        int i10 = this.f8602s;
        int a11 = a(a10);
        this.f8602s = a11;
        if (a11 == i10) {
            return;
        }
        if (!b(i10, a10)) {
            m a12 = a(i10);
            int i11 = a(this.f8602s).f9254d;
            int i12 = a12.f9254d;
            if (i11 > i12) {
                if (j11 != com.anythink.expressad.exoplayer.b.f7291b && j11 <= this.f8595k) {
                    j12 = ((float) j11) * this.o;
                } else {
                    j12 = this.f8595k;
                }
                if (j10 < j12) {
                    this.f8602s = i10;
                }
            }
            if (i11 < i12 && j10 >= this.f8596l) {
                this.f8602s = i10;
            }
        }
        if (this.f8602s != i10) {
            this.f8603t = 3;
        }
    }

    @Override // com.anythink.expressad.exoplayer.i.b, com.anythink.expressad.exoplayer.i.f
    public final int a(long j10, List<? extends com.anythink.expressad.exoplayer.h.b.i> list) {
        int i10;
        int i11;
        long a10 = this.f8600q.a();
        long j11 = this.f8604u;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b && a10 - j11 < this.f8599p) {
            return list.size();
        }
        this.f8604u = a10;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (af.b(list.get(size - 1).f8270g - j10, this.f8601r) < this.f8597m) {
            return size;
        }
        m a11 = a(a(a10));
        for (int i12 = 0; i12 < size; i12++) {
            com.anythink.expressad.exoplayer.h.b.i iVar = list.get(i12);
            m mVar = iVar.f8268d;
            if (af.b(iVar.f8270g - j10, this.f8601r) >= this.f8597m && mVar.f9254d < a11.f9254d && (i10 = mVar.f9263n) != -1 && i10 < 720 && (i11 = mVar.f9262m) != -1 && i11 < 1280 && i10 < a11.f9263n) {
                return i12;
            }
        }
        return size;
    }

    private int a(long j10) {
        long a10 = ((float) this.f8594j.a()) * this.f8598n;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f8616h; i11++) {
            if (j10 == Long.MIN_VALUE || !b(i11, j10)) {
                if (Math.round(a(i11).f9254d * this.f8601r) <= a10) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }
}
