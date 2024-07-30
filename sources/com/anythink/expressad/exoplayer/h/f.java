package com.anythink.expressad.exoplayer.h;

import android.os.Handler;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.h.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class f<T> extends c {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<T, b> f8357a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.h f8358b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f8359c;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final s f8365a;

        /* renamed from: b, reason: collision with root package name */
        public final s.b f8366b;

        /* renamed from: c, reason: collision with root package name */
        public final t f8367c;

        public b(s sVar, s.b bVar, t tVar) {
            this.f8365a = sVar;
            this.f8366b = bVar;
            this.f8367c = tVar;
        }
    }

    public int a(T t10, int i10) {
        return i10;
    }

    public abstract void a(T t10, s sVar, com.anythink.expressad.exoplayer.ae aeVar, Object obj);

    @Override // com.anythink.expressad.exoplayer.h.s
    public void b() {
        Iterator<b> it = this.f8357a.values().iterator();
        while (it.hasNext()) {
            it.next().f8365a.b();
        }
    }

    /* loaded from: classes.dex */
    public final class a implements t {

        /* renamed from: b, reason: collision with root package name */
        private final T f8363b;

        /* renamed from: c, reason: collision with root package name */
        private t.a f8364c;

        public a(T t10) {
            this.f8364c = f.this.a((s.a) null);
            this.f8363b = t10;
        }

        private boolean d(int i10, s.a aVar) {
            s.a aVar2;
            if (aVar != null) {
                aVar2 = f.this.a((f) this.f8363b, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a10 = f.this.a((f) this.f8363b, i10);
            t.a aVar3 = this.f8364c;
            if (aVar3.f8488a != a10 || !com.anythink.expressad.exoplayer.k.af.a(aVar3.f8489b, aVar2)) {
                this.f8364c = f.this.a(a10, aVar2);
                return true;
            }
            return true;
        }

        @Override // com.anythink.expressad.exoplayer.h.t
        public final void a(int i10, s.a aVar) {
            if (d(i10, aVar)) {
                this.f8364c.a();
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.t
        public final void b(int i10, s.a aVar) {
            if (d(i10, aVar)) {
                this.f8364c.b();
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.t
        public final void c(int i10, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i10, aVar)) {
                this.f8364c.c(bVar, a(cVar));
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.t
        public final void a(int i10, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i10, aVar)) {
                this.f8364c.a(bVar, a(cVar));
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.t
        public final void b(int i10, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i10, aVar)) {
                this.f8364c.b(bVar, a(cVar));
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.t
        public final void c(int i10, s.a aVar) {
            if (d(i10, aVar)) {
                this.f8364c.c();
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.t
        public final void a(int i10, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z10) {
            if (d(i10, aVar)) {
                this.f8364c.a(bVar, a(cVar), iOException, z10);
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.t
        public final void b(int i10, s.a aVar, t.c cVar) {
            if (d(i10, aVar)) {
                this.f8364c.b(a(cVar));
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.t
        public final void a(int i10, s.a aVar, t.c cVar) {
            if (d(i10, aVar)) {
                this.f8364c.a(a(cVar));
            }
        }

        private t.c a(t.c cVar) {
            long a10 = f.this.a(cVar.f);
            long a11 = f.this.a(cVar.f8532g);
            return (a10 == cVar.f && a11 == cVar.f8532g) ? cVar : new t.c(cVar.f8527a, cVar.f8528b, cVar.f8529c, cVar.f8530d, cVar.f8531e, a10, a11);
        }
    }

    public long a(long j10) {
        return j10;
    }

    public s.a a(T t10, s.a aVar) {
        return aVar;
    }

    @Override // com.anythink.expressad.exoplayer.h.c
    public void a(com.anythink.expressad.exoplayer.h hVar, boolean z10) {
        this.f8358b = hVar;
        this.f8359c = new Handler();
    }

    @Override // com.anythink.expressad.exoplayer.h.c
    public void a() {
        for (b bVar : this.f8357a.values()) {
            bVar.f8365a.a(bVar.f8366b);
            bVar.f8365a.a(bVar.f8367c);
        }
        this.f8357a.clear();
        this.f8358b = null;
    }

    public final void a(final T t10, s sVar) {
        com.anythink.expressad.exoplayer.k.a.a(!this.f8357a.containsKey(t10));
        s.b bVar = new s.b() { // from class: com.anythink.expressad.exoplayer.h.f.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.anythink.expressad.exoplayer.h.s.b
            public final void a(s sVar2, com.anythink.expressad.exoplayer.ae aeVar, Object obj) {
                f.this.a(t10, sVar2, aeVar, obj);
            }
        };
        a aVar = new a(t10);
        this.f8357a.put(t10, new b(sVar, bVar, aVar));
        sVar.a(this.f8359c, aVar);
        sVar.a(this.f8358b, false, bVar);
    }

    public final void a(T t10) {
        b remove = this.f8357a.remove(t10);
        remove.f8365a.a(remove.f8366b);
        remove.f8365a.a(remove.f8367c);
    }
}
