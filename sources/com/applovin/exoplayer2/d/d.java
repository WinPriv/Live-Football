package com.applovin.exoplayer2.d;

import android.net.Uri;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.common.a.ax;
import com.applovin.exoplayer2.d.c;
import com.applovin.exoplayer2.k.q;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.l.ai;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14013a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private ab.d f14014b;

    /* renamed from: c, reason: collision with root package name */
    private h f14015c;

    /* renamed from: d, reason: collision with root package name */
    private t.b f14016d;

    /* renamed from: e, reason: collision with root package name */
    private String f14017e;

    @Override // com.applovin.exoplayer2.d.i
    public h a(ab abVar) {
        h hVar;
        com.applovin.exoplayer2.l.a.b(abVar.f13027c);
        ab.d dVar = abVar.f13027c.f13078c;
        if (dVar != null && ai.f16274a >= 18) {
            synchronized (this.f14013a) {
                if (!ai.a(dVar, this.f14014b)) {
                    this.f14014b = dVar;
                    this.f14015c = a(dVar);
                }
                hVar = (h) com.applovin.exoplayer2.l.a.b(this.f14015c);
            }
            return hVar;
        }
        return h.f14035b;
    }

    private h a(ab.d dVar) {
        t.b bVar = this.f14016d;
        if (bVar == null) {
            bVar = new q.a().a(this.f14017e);
        }
        Uri uri = dVar.f13052b;
        p pVar = new p(uri == null ? null : uri.toString(), dVar.f, bVar);
        ax<Map.Entry<String, String>> it = dVar.f13053c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            pVar.a(next.getKey(), next.getValue());
        }
        c a10 = new c.a().a(dVar.f13051a, o.f14048a).a(dVar.f13054d).b(dVar.f13055e).a(com.applovin.exoplayer2.common.b.c.a(dVar.f13056g)).a(pVar);
        a10.a(0, dVar.a());
        return a10;
    }
}
