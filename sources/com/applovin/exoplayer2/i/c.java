package com.applovin.exoplayer2.i;

import com.applovin.exoplayer2.common.a.s;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a */
    private final b f15672a = new b();

    /* renamed from: b */
    private final j f15673b = new j();

    /* renamed from: c */
    private final Deque<k> f15674c = new ArrayDeque();

    /* renamed from: d */
    private int f15675d;

    /* renamed from: e */
    private boolean f15676e;

    /* loaded from: classes.dex */
    public static final class a implements f {

        /* renamed from: a */
        private final long f15677a;

        /* renamed from: b */
        private final s<com.applovin.exoplayer2.i.a> f15678b;

        public a(long j10, s<com.applovin.exoplayer2.i.a> sVar) {
            this.f15677a = j10;
            this.f15678b = sVar;
        }

        @Override // com.applovin.exoplayer2.i.f
        public int a(long j10) {
            return this.f15677a > j10 ? 0 : -1;
        }

        @Override // com.applovin.exoplayer2.i.f
        public List<com.applovin.exoplayer2.i.a> b(long j10) {
            if (j10 >= this.f15677a) {
                return this.f15678b;
            }
            return s.g();
        }

        @Override // com.applovin.exoplayer2.i.f
        public int f_() {
            return 1;
        }

        @Override // com.applovin.exoplayer2.i.f
        public long a(int i10) {
            com.applovin.exoplayer2.l.a.a(i10 == 0);
            return this.f15677a;
        }
    }

    public c() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f15674c.addFirst(new e(new b0.b(this, 1)));
        }
        this.f15675d = 0;
    }

    @Override // com.applovin.exoplayer2.c.d
    public void c() {
        com.applovin.exoplayer2.l.a.b(!this.f15676e);
        this.f15673b.a();
        this.f15675d = 0;
    }

    @Override // com.applovin.exoplayer2.c.d
    public void d() {
        this.f15676e = true;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* renamed from: e */
    public j a() throws h {
        com.applovin.exoplayer2.l.a.b(!this.f15676e);
        if (this.f15675d != 0) {
            return null;
        }
        this.f15675d = 1;
        return this.f15673b;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* renamed from: f */
    public k b() throws h {
        com.applovin.exoplayer2.l.a.b(!this.f15676e);
        if (this.f15675d == 2 && !this.f15674c.isEmpty()) {
            k removeFirst = this.f15674c.removeFirst();
            if (this.f15673b.c()) {
                removeFirst.b(4);
            } else {
                j jVar = this.f15673b;
                removeFirst.a(this.f15673b.f13647d, new a(jVar.f13647d, this.f15672a.a(((ByteBuffer) com.applovin.exoplayer2.l.a.b(jVar.f13645b)).array())), 0L);
            }
            this.f15673b.a();
            this.f15675d = 0;
            return removeFirst;
        }
        return null;
    }

    @Override // com.applovin.exoplayer2.i.g
    public void a(long j10) {
    }

    @Override // com.applovin.exoplayer2.c.d
    public void a(j jVar) throws h {
        com.applovin.exoplayer2.l.a.b(!this.f15676e);
        com.applovin.exoplayer2.l.a.b(this.f15675d == 1);
        com.applovin.exoplayer2.l.a.a(this.f15673b == jVar);
        this.f15675d = 2;
    }

    public void a(k kVar) {
        com.applovin.exoplayer2.l.a.b(this.f15674c.size() < 2);
        com.applovin.exoplayer2.l.a.a(!this.f15674c.contains(kVar));
        kVar.a();
        this.f15674c.addFirst(kVar);
    }
}
