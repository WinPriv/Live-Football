package com.applovin.exoplayer2.i.a;

import com.applovin.exoplayer2.c.i;
import com.applovin.exoplayer2.i.g;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.i.k;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f15610a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<k> f15611b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityQueue<a> f15612c;

    /* renamed from: d, reason: collision with root package name */
    private a f15613d;

    /* renamed from: e, reason: collision with root package name */
    private long f15614e;
    private long f;

    /* loaded from: classes.dex */
    public static final class a extends j implements Comparable<a> {

        /* renamed from: g, reason: collision with root package name */
        private long f15615g;

        private a() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            if (c() != aVar.c()) {
                return c() ? 1 : -1;
            }
            long j10 = this.f13647d - aVar.f13647d;
            if (j10 == 0) {
                j10 = this.f15615g - aVar.f15615g;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends k {

        /* renamed from: c, reason: collision with root package name */
        private i.a<b> f15616c;

        public b(i.a<b> aVar) {
            this.f15616c = aVar;
        }

        @Override // com.applovin.exoplayer2.c.i
        public final void f() {
            this.f15616c.releaseOutputBuffer(this);
        }
    }

    public c() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f15610a.add(new a());
        }
        this.f15611b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f15611b.add(new b(new i.a() { // from class: com.applovin.exoplayer2.i.a.f
                @Override // com.applovin.exoplayer2.c.i.a
                public final void releaseOutputBuffer(i iVar) {
                    c.this.a((k) iVar);
                }
            }));
        }
        this.f15612c = new PriorityQueue<>();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public abstract void a(j jVar);

    @Override // com.applovin.exoplayer2.c.d
    public void c() {
        this.f = 0L;
        this.f15614e = 0L;
        while (!this.f15612c.isEmpty()) {
            a((a) ai.a(this.f15612c.poll()));
        }
        a aVar = this.f15613d;
        if (aVar != null) {
            a(aVar);
            this.f15613d = null;
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public k b() throws h {
        if (this.f15611b.isEmpty()) {
            return null;
        }
        while (!this.f15612c.isEmpty() && ((a) ai.a(this.f15612c.peek())).f13647d <= this.f15614e) {
            a aVar = (a) ai.a(this.f15612c.poll());
            if (aVar.c()) {
                k kVar = (k) ai.a(this.f15611b.pollFirst());
                kVar.b(4);
                a(aVar);
                return kVar;
            }
            a((j) aVar);
            if (f()) {
                com.applovin.exoplayer2.i.f g6 = g();
                k kVar2 = (k) ai.a(this.f15611b.pollFirst());
                kVar2.a(aVar.f13647d, g6, Long.MAX_VALUE);
                a(aVar);
                return kVar2;
            }
            a(aVar);
        }
        return null;
    }

    public abstract boolean f();

    public abstract com.applovin.exoplayer2.i.f g();

    @Override // com.applovin.exoplayer2.c.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public j a() throws h {
        boolean z10;
        if (this.f15613d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        if (this.f15610a.isEmpty()) {
            return null;
        }
        a pollFirst = this.f15610a.pollFirst();
        this.f15613d = pollFirst;
        return pollFirst;
    }

    public final k j() {
        return this.f15611b.pollFirst();
    }

    public final long k() {
        return this.f15614e;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(j jVar) throws h {
        com.applovin.exoplayer2.l.a.a(jVar == this.f15613d);
        a aVar = (a) jVar;
        if (aVar.b()) {
            a(aVar);
        } else {
            long j10 = this.f;
            this.f = 1 + j10;
            aVar.f15615g = j10;
            this.f15612c.add(aVar);
        }
        this.f15613d = null;
    }

    @Override // com.applovin.exoplayer2.i.g
    public void a(long j10) {
        this.f15614e = j10;
    }

    private void a(a aVar) {
        aVar.a();
        this.f15610a.add(aVar);
    }

    public void a(k kVar) {
        kVar.a();
        this.f15611b.add(kVar);
    }

    @Override // com.applovin.exoplayer2.c.d
    public void d() {
    }
}
