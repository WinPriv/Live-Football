package com.applovin.exoplayer2;

import android.os.Handler;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.h.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ah {

    /* renamed from: d, reason: collision with root package name */
    private final d f13165d;

    /* renamed from: e, reason: collision with root package name */
    private final q.a f13166e;
    private final g.a f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<c, b> f13167g;

    /* renamed from: h, reason: collision with root package name */
    private final Set<c> f13168h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13170j;

    /* renamed from: k, reason: collision with root package name */
    private com.applovin.exoplayer2.k.aa f13171k;

    /* renamed from: i, reason: collision with root package name */
    private com.applovin.exoplayer2.h.z f13169i = new z.a(0);

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<com.applovin.exoplayer2.h.n, c> f13163b = new IdentityHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Object, c> f13164c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f13162a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.p f13176a;

        /* renamed from: b, reason: collision with root package name */
        public final p.b f13177b;

        /* renamed from: c, reason: collision with root package name */
        public final a f13178c;

        public b(com.applovin.exoplayer2.h.p pVar, p.b bVar, a aVar) {
            this.f13176a = pVar;
            this.f13177b = bVar;
            this.f13178c = aVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void e();
    }

    public ah(d dVar, com.applovin.exoplayer2.a.a aVar, Handler handler) {
        this.f13165d = dVar;
        q.a aVar2 = new q.a();
        this.f13166e = aVar2;
        g.a aVar3 = new g.a();
        this.f = aVar3;
        this.f13167g = new HashMap<>();
        this.f13168h = new HashSet();
        if (aVar != null) {
            aVar2.a(handler, aVar);
            aVar3.a(handler, aVar);
        }
    }

    private void e() {
        Iterator<c> it = this.f13168h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f13181c.isEmpty()) {
                b(next);
                it.remove();
            }
        }
    }

    public void c() {
        for (b bVar : this.f13167g.values()) {
            try {
                bVar.f13176a.c(bVar.f13177b);
            } catch (RuntimeException e10) {
                com.applovin.exoplayer2.l.q.c("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f13176a.a((com.applovin.exoplayer2.h.q) bVar.f13178c);
            bVar.f13176a.a((com.applovin.exoplayer2.d.g) bVar.f13178c);
        }
        this.f13167g.clear();
        this.f13168h.clear();
        this.f13170j = false;
    }

    public ba d() {
        if (this.f13162a.isEmpty()) {
            return ba.f13573a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f13162a.size(); i11++) {
            c cVar = this.f13162a.get(i11);
            cVar.f13182d = i10;
            i10 += cVar.f13179a.f().b();
        }
        return new ap(this.f13162a, this.f13169i);
    }

    /* loaded from: classes.dex */
    public final class a implements com.applovin.exoplayer2.d.g, com.applovin.exoplayer2.h.q {

        /* renamed from: b, reason: collision with root package name */
        private final c f13173b;

        /* renamed from: c, reason: collision with root package name */
        private q.a f13174c;

        /* renamed from: d, reason: collision with root package name */
        private g.a f13175d;

        public a(c cVar) {
            this.f13174c = ah.this.f13166e;
            this.f13175d = ah.this.f;
            this.f13173b = cVar;
        }

        private boolean f(int i10, p.a aVar) {
            p.a aVar2;
            if (aVar != null) {
                aVar2 = ah.b(this.f13173b, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int b10 = ah.b(this.f13173b, i10);
            q.a aVar3 = this.f13174c;
            if (aVar3.f15394a != b10 || !com.applovin.exoplayer2.l.ai.a(aVar3.f15395b, aVar2)) {
                this.f13174c = ah.this.f13166e.a(b10, aVar2, 0L);
            }
            g.a aVar4 = this.f13175d;
            if (aVar4.f14030a != b10 || !com.applovin.exoplayer2.l.ai.a(aVar4.f14031b, aVar2)) {
                this.f13175d = ah.this.f.a(b10, aVar2);
                return true;
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i10, aVar)) {
                this.f13174c.a(jVar, mVar);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void b(int i10, p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i10, aVar)) {
                this.f13174c.b(jVar, mVar);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void c(int i10, p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i10, aVar)) {
                this.f13174c.c(jVar, mVar);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void d(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f13175d.d();
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar, IOException iOException, boolean z10) {
            if (f(i10, aVar)) {
                this.f13174c.a(jVar, mVar, iOException, z10);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void b(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f13175d.b();
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void c(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f13175d.c();
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, p.a aVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i10, aVar)) {
                this.f13174c.a(mVar);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, p.a aVar, int i11) {
            if (f(i10, aVar)) {
                this.f13175d.a(i11);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f13175d.a();
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, p.a aVar, Exception exc) {
            if (f(i10, aVar)) {
                this.f13175d.a(exc);
            }
        }
    }

    public int b() {
        return this.f13162a.size();
    }

    /* loaded from: classes.dex */
    public static final class c implements ag {

        /* renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.l f13179a;

        /* renamed from: d, reason: collision with root package name */
        public int f13182d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13183e;

        /* renamed from: c, reason: collision with root package name */
        public final List<p.a> f13181c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f13180b = new Object();

        public c(com.applovin.exoplayer2.h.p pVar, boolean z10) {
            this.f13179a = new com.applovin.exoplayer2.h.l(pVar, z10);
        }

        public void a(int i10) {
            this.f13182d = i10;
            this.f13183e = false;
            this.f13181c.clear();
        }

        @Override // com.applovin.exoplayer2.ag
        public ba b() {
            return this.f13179a.f();
        }

        @Override // com.applovin.exoplayer2.ag
        public Object a() {
            return this.f13180b;
        }
    }

    private void b(c cVar) {
        b bVar = this.f13167g.get(cVar);
        if (bVar != null) {
            bVar.f13176a.b(bVar.f13177b);
        }
    }

    private void b(int i10, int i11) {
        while (i10 < this.f13162a.size()) {
            this.f13162a.get(i10).f13182d += i11;
            i10++;
        }
    }

    public ba a(List<c> list, com.applovin.exoplayer2.h.z zVar) {
        a(0, this.f13162a.size());
        return a(this.f13162a.size(), list, zVar);
    }

    public ba a(int i10, List<c> list, com.applovin.exoplayer2.h.z zVar) {
        if (!list.isEmpty()) {
            this.f13169i = zVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f13162a.get(i11 - 1);
                    cVar.a(cVar2.f13179a.f().b() + cVar2.f13182d);
                } else {
                    cVar.a(0);
                }
                b(i11, cVar.f13179a.f().b());
                this.f13162a.add(i11, cVar);
                this.f13164c.put(cVar.f13180b, cVar);
                if (this.f13170j) {
                    c(cVar);
                    if (this.f13163b.isEmpty()) {
                        this.f13168h.add(cVar);
                    } else {
                        b(cVar);
                    }
                }
            }
        }
        return d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p.a b(c cVar, p.a aVar) {
        for (int i10 = 0; i10 < cVar.f13181c.size(); i10++) {
            if (cVar.f13181c.get(i10).f15392d == aVar.f15392d) {
                return aVar.a(a(cVar, aVar.f15389a));
            }
        }
        return null;
    }

    private void d(c cVar) {
        if (cVar.f13183e && cVar.f13181c.isEmpty()) {
            b bVar = (b) com.applovin.exoplayer2.l.a.b(this.f13167g.remove(cVar));
            bVar.f13176a.c(bVar.f13177b);
            bVar.f13176a.a((com.applovin.exoplayer2.h.q) bVar.f13178c);
            bVar.f13176a.a((com.applovin.exoplayer2.d.g) bVar.f13178c);
            this.f13168h.remove(cVar);
        }
    }

    private void c(c cVar) {
        com.applovin.exoplayer2.h.l lVar = cVar.f13179a;
        p.b bVar = new p.b() { // from class: com.applovin.exoplayer2.d0
            @Override // com.applovin.exoplayer2.h.p.b
            public final void onSourceInfoRefreshed(com.applovin.exoplayer2.h.p pVar, ba baVar) {
                ah.this.a(pVar, baVar);
            }
        };
        a aVar = new a(cVar);
        this.f13167g.put(cVar, new b(lVar, bVar, aVar));
        lVar.a(com.applovin.exoplayer2.l.ai.b(), (com.applovin.exoplayer2.h.q) aVar);
        lVar.a(com.applovin.exoplayer2.l.ai.b(), (com.applovin.exoplayer2.d.g) aVar);
        lVar.a(bVar, this.f13171k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(c cVar, int i10) {
        return i10 + cVar.f13182d;
    }

    private static Object b(Object obj) {
        return com.applovin.exoplayer2.a.b(obj);
    }

    public ba a(int i10, int i11, com.applovin.exoplayer2.h.z zVar) {
        com.applovin.exoplayer2.l.a.a(i10 >= 0 && i10 <= i11 && i11 <= b());
        this.f13169i = zVar;
        a(i10, i11);
        return d();
    }

    public ba a(int i10, int i11, int i12, com.applovin.exoplayer2.h.z zVar) {
        com.applovin.exoplayer2.l.a.a(i10 >= 0 && i10 <= i11 && i11 <= b() && i12 >= 0);
        this.f13169i = zVar;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = this.f13162a.get(min).f13182d;
            com.applovin.exoplayer2.l.ai.a(this.f13162a, i10, i11, i12);
            while (min <= max) {
                c cVar = this.f13162a.get(min);
                cVar.f13182d = i13;
                i13 += cVar.f13179a.f().b();
                min++;
            }
            return d();
        }
        return d();
    }

    public boolean a() {
        return this.f13170j;
    }

    public ba a(com.applovin.exoplayer2.h.z zVar) {
        int b10 = b();
        if (zVar.a() != b10) {
            zVar = zVar.d().a(0, b10);
        }
        this.f13169i = zVar;
        return d();
    }

    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        com.applovin.exoplayer2.l.a.b(!this.f13170j);
        this.f13171k = aaVar;
        for (int i10 = 0; i10 < this.f13162a.size(); i10++) {
            c cVar = this.f13162a.get(i10);
            c(cVar);
            this.f13168h.add(cVar);
        }
        this.f13170j = true;
    }

    public com.applovin.exoplayer2.h.n a(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j10) {
        Object a10 = a(aVar.f15389a);
        p.a a11 = aVar.a(b(aVar.f15389a));
        c cVar = (c) com.applovin.exoplayer2.l.a.b(this.f13164c.get(a10));
        a(cVar);
        cVar.f13181c.add(a11);
        com.applovin.exoplayer2.h.k b10 = cVar.f13179a.b(a11, bVar, j10);
        this.f13163b.put(b10, cVar);
        e();
        return b10;
    }

    public void a(com.applovin.exoplayer2.h.n nVar) {
        c cVar = (c) com.applovin.exoplayer2.l.a.b(this.f13163b.remove(nVar));
        cVar.f13179a.a(nVar);
        cVar.f13181c.remove(((com.applovin.exoplayer2.h.k) nVar).f15362a);
        if (!this.f13163b.isEmpty()) {
            e();
        }
        d(cVar);
    }

    private void a(c cVar) {
        this.f13168h.add(cVar);
        b bVar = this.f13167g.get(cVar);
        if (bVar != null) {
            bVar.f13176a.a(bVar.f13177b);
        }
    }

    private void a(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f13162a.remove(i12);
            this.f13164c.remove(remove.f13180b);
            b(i12, -remove.f13179a.f().b());
            remove.f13183e = true;
            if (this.f13170j) {
                d(remove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.exoplayer2.h.p pVar, ba baVar) {
        this.f13165d.e();
    }

    private static Object a(Object obj) {
        return com.applovin.exoplayer2.a.a(obj);
    }

    private static Object a(c cVar, Object obj) {
        return com.applovin.exoplayer2.a.a(cVar.f13180b, obj);
    }
}
