package com.anythink.expressad.exoplayer.i;

import com.anythink.expressad.exoplayer.h.af;
import com.anythink.expressad.exoplayer.z;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private a f8686a;

    /* loaded from: classes.dex */
    public interface a {
        void c();
    }

    public abstract i a(z[] zVarArr, af afVar);

    public final void a(a aVar) {
        this.f8686a = aVar;
    }

    public abstract void a(Object obj);

    public final void b() {
        a aVar = this.f8686a;
        if (aVar != null) {
            aVar.c();
        }
    }
}
