package com.applovin.exoplayer2.h;

import android.os.Handler;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e<T> extends com.applovin.exoplayer2.h.a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<T, b<T>> f15314a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Handler f15315b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.exoplayer2.k.aa f15316c;

    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final p f15321a;

        /* renamed from: b, reason: collision with root package name */
        public final p.b f15322b;

        /* renamed from: c, reason: collision with root package name */
        public final e<T>.a f15323c;

        public b(p pVar, p.b bVar, e<T>.a aVar) {
            this.f15321a = pVar;
            this.f15322b = bVar;
            this.f15323c = aVar;
        }
    }

    public int a(T t10, int i10) {
        return i10;
    }

    public abstract void a(T t10, p pVar, ba baVar);

    @Override // com.applovin.exoplayer2.h.a
    public void b() {
        for (b<T> bVar : this.f15314a.values()) {
            bVar.f15321a.b(bVar.f15322b);
        }
    }

    @Override // com.applovin.exoplayer2.h.a
    public void c() {
        for (b<T> bVar : this.f15314a.values()) {
            bVar.f15321a.c(bVar.f15322b);
            bVar.f15321a.a((q) bVar.f15323c);
            bVar.f15321a.a((com.applovin.exoplayer2.d.g) bVar.f15323c);
        }
        this.f15314a.clear();
    }

    public long a(T t10, long j10) {
        return j10;
    }

    @Override // com.applovin.exoplayer2.h.p
    public void e() throws IOException {
        Iterator<b<T>> it = this.f15314a.values().iterator();
        while (it.hasNext()) {
            it.next().f15321a.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void b(Object obj, p pVar, ba baVar) {
        a((e<T>) obj, pVar, baVar);
    }

    public p.a a(T t10, p.a aVar) {
        return aVar;
    }

    /* loaded from: classes.dex */
    public final class a implements com.applovin.exoplayer2.d.g, q {

        /* renamed from: b, reason: collision with root package name */
        private final T f15318b;

        /* renamed from: c, reason: collision with root package name */
        private q.a f15319c;

        /* renamed from: d, reason: collision with root package name */
        private g.a f15320d;

        public a(T t10) {
            this.f15319c = e.this.a((p.a) null);
            this.f15320d = e.this.b((p.a) null);
            this.f15318b = t10;
        }

        private boolean f(int i10, p.a aVar) {
            p.a aVar2;
            if (aVar != null) {
                aVar2 = e.this.a((e) this.f15318b, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a10 = e.this.a((e) this.f15318b, i10);
            q.a aVar3 = this.f15319c;
            if (aVar3.f15394a != a10 || !ai.a(aVar3.f15395b, aVar2)) {
                this.f15319c = e.this.a(a10, aVar2, 0L);
            }
            g.a aVar4 = this.f15320d;
            if (aVar4.f14030a != a10 || !ai.a(aVar4.f14031b, aVar2)) {
                this.f15320d = e.this.a(a10, aVar2);
                return true;
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, p.a aVar, j jVar, m mVar) {
            if (f(i10, aVar)) {
                this.f15319c.a(jVar, a(mVar));
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void b(int i10, p.a aVar, j jVar, m mVar) {
            if (f(i10, aVar)) {
                this.f15319c.b(jVar, a(mVar));
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void c(int i10, p.a aVar, j jVar, m mVar) {
            if (f(i10, aVar)) {
                this.f15319c.c(jVar, a(mVar));
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void d(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f15320d.d();
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, p.a aVar, j jVar, m mVar, IOException iOException, boolean z10) {
            if (f(i10, aVar)) {
                this.f15319c.a(jVar, a(mVar), iOException, z10);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void b(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f15320d.b();
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void c(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f15320d.c();
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, p.a aVar, m mVar) {
            if (f(i10, aVar)) {
                this.f15319c.a(a(mVar));
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, p.a aVar, int i11) {
            if (f(i10, aVar)) {
                this.f15320d.a(i11);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f15320d.a();
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, p.a aVar, Exception exc) {
            if (f(i10, aVar)) {
                this.f15320d.a(exc);
            }
        }

        private m a(m mVar) {
            long a10 = e.this.a((e) this.f15318b, mVar.f);
            long a11 = e.this.a((e) this.f15318b, mVar.f15388g);
            return (a10 == mVar.f && a11 == mVar.f15388g) ? mVar : new m(mVar.f15383a, mVar.f15384b, mVar.f15385c, mVar.f15386d, mVar.f15387e, a10, a11);
        }
    }

    @Override // com.applovin.exoplayer2.h.a
    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        this.f15316c = aaVar;
        this.f15315b = ai.a();
    }

    @Override // com.applovin.exoplayer2.h.a
    public void a() {
        for (b<T> bVar : this.f15314a.values()) {
            bVar.f15321a.a(bVar.f15322b);
        }
    }

    public final void a(final T t10, p pVar) {
        com.applovin.exoplayer2.l.a.a(!this.f15314a.containsKey(t10));
        p.b bVar = new p.b() { // from class: com.applovin.exoplayer2.h.b0
            @Override // com.applovin.exoplayer2.h.p.b
            public final void onSourceInfoRefreshed(p pVar2, ba baVar) {
                e.this.b(t10, pVar2, baVar);
            }
        };
        a aVar = new a(t10);
        this.f15314a.put(t10, new b<>(pVar, bVar, aVar));
        pVar.a((Handler) com.applovin.exoplayer2.l.a.b(this.f15315b), (q) aVar);
        pVar.a((Handler) com.applovin.exoplayer2.l.a.b(this.f15315b), (com.applovin.exoplayer2.d.g) aVar);
        pVar.a(bVar, this.f15316c);
        if (d()) {
            return;
        }
        pVar.b(bVar);
    }
}
