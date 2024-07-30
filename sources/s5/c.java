package s5;

import com.applovin.exoplayer2.a.x;
import d6.g0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import n4.f;
import n4.h;
import r5.h;
import r5.k;
import r5.l;

/* compiled from: CeaDecoder.java */
/* loaded from: classes2.dex */
public abstract class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f35204a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<l> f35205b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue<a> f35206c;

    /* renamed from: d, reason: collision with root package name */
    public a f35207d;

    /* renamed from: e, reason: collision with root package name */
    public long f35208e;
    public long f;

    /* compiled from: CeaDecoder.java */
    /* loaded from: classes2.dex */
    public static final class a extends k implements Comparable<a> {
        public long B;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (f(4) != aVar2.f(4)) {
                if (f(4)) {
                    return 1;
                }
            } else {
                long j10 = this.f33324w - aVar2.f33324w;
                if (j10 == 0) {
                    j10 = this.B - aVar2.B;
                    if (j10 == 0) {
                        return 0;
                    }
                }
                if (j10 > 0) {
                    return 1;
                }
            }
            return -1;
        }
    }

    /* compiled from: CeaDecoder.java */
    /* loaded from: classes2.dex */
    public static final class b extends l {

        /* renamed from: w, reason: collision with root package name */
        public final h.a<b> f35209w;

        public b(x xVar) {
            this.f35209w = xVar;
        }

        @Override // n4.h
        public final void h() {
            c cVar = (c) ((x) this.f35209w).f13016t;
            cVar.getClass();
            this.f33298s = 0;
            this.f34928u = null;
            cVar.f35205b.add(this);
        }
    }

    public c() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f35204a.add(new a());
        }
        this.f35205b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f35205b.add(new b(new x(this, 7)));
        }
        this.f35206c = new PriorityQueue<>();
    }

    @Override // r5.h
    public final void a(long j10) {
        this.f35208e = j10;
    }

    @Override // n4.d
    public final k c() throws f {
        boolean z10;
        if (this.f35207d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        ArrayDeque<a> arrayDeque = this.f35204a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        a pollFirst = arrayDeque.pollFirst();
        this.f35207d = pollFirst;
        return pollFirst;
    }

    @Override // n4.d
    public final void d(k kVar) throws f {
        boolean z10;
        if (kVar == this.f35207d) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        a aVar = (a) kVar;
        if (aVar.g()) {
            aVar.h();
            this.f35204a.add(aVar);
        } else {
            long j10 = this.f;
            this.f = 1 + j10;
            aVar.B = j10;
            this.f35206c.add(aVar);
        }
        this.f35207d = null;
    }

    public abstract d e();

    public abstract void f(a aVar);

    @Override // n4.d
    public void flush() {
        ArrayDeque<a> arrayDeque;
        this.f = 0L;
        this.f35208e = 0L;
        while (true) {
            PriorityQueue<a> priorityQueue = this.f35206c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f35204a;
            if (isEmpty) {
                break;
            }
            a poll = priorityQueue.poll();
            int i10 = g0.f27302a;
            poll.h();
            arrayDeque.add(poll);
        }
        a aVar = this.f35207d;
        if (aVar != null) {
            aVar.h();
            arrayDeque.add(aVar);
            this.f35207d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return null;
     */
    @Override // n4.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r5.l b() throws r5.i {
        /*
            r12 = this;
            java.util.ArrayDeque<r5.l> r0 = r12.f35205b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue<s5.c$a> r1 = r12.f35206c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r1.peek()
            s5.c$a r3 = (s5.c.a) r3
            int r4 = d6.g0.f27302a
            long r3 = r3.f33324w
            long r5 = r12.f35208e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6d
            java.lang.Object r1 = r1.poll()
            s5.c$a r1 = (s5.c.a) r1
            r3 = 4
            boolean r4 = r1.f(r3)
            java.util.ArrayDeque<s5.c$a> r5 = r12.f35204a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            r5.l r0 = (r5.l) r0
            r0.e(r3)
            r1.h()
            r5.add(r1)
            return r0
        L41:
            r12.f(r1)
            boolean r3 = r12.h()
            if (r3 == 0) goto L66
            s5.d r9 = r12.e()
            java.lang.Object r0 = r0.pollFirst()
            r5.l r0 = (r5.l) r0
            long r7 = r1.f33324w
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r0
            r6.i(r7, r9, r10)
            r1.h()
            r5.add(r1)
            return r0
        L66:
            r1.h()
            r5.add(r1)
            goto La
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.c.b():r5.l");
    }

    public abstract boolean h();

    @Override // n4.d
    public void release() {
    }
}
