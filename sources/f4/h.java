package f4;

import a4.m;
import android.content.Context;
import com.applovin.exoplayer2.a.o;
import com.applovin.exoplayer2.a.x;
import com.applovin.exoplayer2.a.y;
import h4.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import z3.h;
import z3.p;
import z3.s;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28089a;

    /* renamed from: b, reason: collision with root package name */
    public final a4.e f28090b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.d f28091c;

    /* renamed from: d, reason: collision with root package name */
    public final k f28092d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f28093e;
    public final h4.b f;

    /* renamed from: g, reason: collision with root package name */
    public final i4.a f28094g;

    /* renamed from: h, reason: collision with root package name */
    public final i4.a f28095h;

    /* renamed from: i, reason: collision with root package name */
    public final g4.c f28096i;

    public h(Context context, a4.e eVar, g4.d dVar, k kVar, Executor executor, h4.b bVar, i4.a aVar, i4.a aVar2, g4.c cVar) {
        this.f28089a = context;
        this.f28090b = eVar;
        this.f28091c = dVar;
        this.f28092d = kVar;
        this.f28093e = executor;
        this.f = bVar;
        this.f28094g = aVar;
        this.f28095h = aVar2;
        this.f28096i = cVar;
    }

    public final void a(final s sVar, int i10) {
        boolean z10;
        a4.b b10;
        boolean z11;
        m mVar = this.f28090b.get(sVar.b());
        new a4.b(1, 0L);
        final long j10 = 0;
        while (true) {
            int i11 = 2;
            o oVar = new o(i11, this, sVar);
            h4.b bVar = this.f;
            if (((Boolean) bVar.e(oVar)).booleanValue()) {
                final Iterable iterable = (Iterable) bVar.e(new com.applovin.exoplayer2.a.c(5, this, sVar));
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                int i12 = 3;
                if (mVar == null) {
                    d4.a.a(sVar, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                    b10 = new a4.b(3, -1L);
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((g4.i) it.next()).a());
                    }
                    if (sVar.c() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        g4.c cVar = this.f28096i;
                        Objects.requireNonNull(cVar);
                        c4.a aVar = (c4.a) bVar.e(new x(cVar, i12));
                        h.a aVar2 = new h.a();
                        aVar2.f = new HashMap();
                        aVar2.f36934d = Long.valueOf(this.f28094g.a());
                        aVar2.f36935e = Long.valueOf(this.f28095h.a());
                        aVar2.d("GDT_CLIENT_METRICS");
                        w3.b bVar2 = new w3.b("proto");
                        aVar.getClass();
                        y7.g gVar = p.f36956a;
                        gVar.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            gVar.a(aVar, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        aVar2.c(new z3.m(bVar2, byteArrayOutputStream.toByteArray()));
                        arrayList.add(mVar.a(aVar2.b()));
                    }
                    b10 = mVar.b(new a4.a(arrayList, sVar.c()));
                }
                if (b10.f241a == 2) {
                    bVar.e(new b.a() { // from class: f4.f
                        @Override // h4.b.a
                        public final Object execute() {
                            h hVar = h.this;
                            g4.d dVar = hVar.f28091c;
                            dVar.R(iterable);
                            dVar.F(hVar.f28094g.a() + j10, sVar);
                            return null;
                        }
                    });
                    this.f28092d.b(sVar, i10 + 1, true);
                    return;
                }
                bVar.e(new y(3, this, iterable));
                int i13 = b10.f241a;
                if (i13 == 1) {
                    j10 = Math.max(j10, b10.f242b);
                    if (sVar.c() != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        bVar.e(new q0.d(this, i11));
                    }
                } else if (i13 == 4) {
                    HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String g6 = ((g4.i) it2.next()).a().g();
                        if (!hashMap.containsKey(g6)) {
                            hashMap.put(g6, 1);
                        } else {
                            hashMap.put(g6, Integer.valueOf(((Integer) hashMap.get(g6)).intValue() + 1));
                        }
                    }
                    bVar.e(new com.applovin.exoplayer2.a.c(6, this, hashMap));
                }
            } else {
                bVar.e(new b.a() { // from class: f4.g
                    @Override // h4.b.a
                    public final Object execute() {
                        h hVar = h.this;
                        hVar.f28091c.F(hVar.f28094g.a() + j10, sVar);
                        return null;
                    }
                });
                return;
            }
        }
    }
}
