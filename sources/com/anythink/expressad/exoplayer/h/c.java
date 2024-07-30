package com.anythink.expressad.exoplayer.h;

import android.os.Handler;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.h.t;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c implements s {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<s.b> f8325a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final t.a f8326b = new t.a();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.h f8327c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.ae f8328d;

    /* renamed from: e, reason: collision with root package name */
    private Object f8329e;

    public abstract void a();

    public final void a(com.anythink.expressad.exoplayer.ae aeVar, Object obj) {
        this.f8328d = aeVar;
        this.f8329e = obj;
        Iterator<s.b> it = this.f8325a.iterator();
        while (it.hasNext()) {
            it.next().a(this, aeVar, obj);
        }
    }

    public abstract void a(com.anythink.expressad.exoplayer.h hVar, boolean z10);

    public final t.a a(s.a aVar) {
        return this.f8326b.a(0, aVar, 0L);
    }

    private t.a a(s.a aVar, long j10) {
        com.anythink.expressad.exoplayer.k.a.a(aVar != null);
        return this.f8326b.a(0, aVar, j10);
    }

    public final t.a a(int i10, s.a aVar) {
        return this.f8326b.a(i10, aVar, 0L);
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void a(Handler handler, t tVar) {
        this.f8326b.a(handler, tVar);
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void a(t tVar) {
        this.f8326b.a(tVar);
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void a(com.anythink.expressad.exoplayer.h hVar, boolean z10, s.b bVar) {
        com.anythink.expressad.exoplayer.h hVar2 = this.f8327c;
        com.anythink.expressad.exoplayer.k.a.a(hVar2 == null || hVar2 == hVar);
        this.f8325a.add(bVar);
        if (this.f8327c == null) {
            this.f8327c = hVar;
            a(hVar, z10);
        } else {
            com.anythink.expressad.exoplayer.ae aeVar = this.f8328d;
            if (aeVar != null) {
                bVar.a(this, aeVar, this.f8329e);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void a(s.b bVar) {
        this.f8325a.remove(bVar);
        if (this.f8325a.isEmpty()) {
            this.f8327c = null;
            this.f8328d = null;
            this.f8329e = null;
            a();
        }
    }
}
