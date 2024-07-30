package com.anythink.expressad.splash.d;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.splash.b.c {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.expressad.out.d f11017a;

    /* renamed from: b, reason: collision with root package name */
    private c f11018b;

    /* renamed from: c, reason: collision with root package name */
    private String f11019c;

    /* renamed from: d, reason: collision with root package name */
    private String f11020d;

    public b(c cVar) {
        this.f11018b = cVar;
    }

    public final void a(com.anythink.expressad.out.d dVar) {
        this.f11017a = dVar;
    }

    public final void b(String str) {
        this.f11020d = str;
    }

    @Override // com.anythink.expressad.splash.b.c
    public final void a(com.anythink.expressad.foundation.d.c cVar, int i10) {
        c cVar2;
        c cVar3 = this.f11018b;
        if (cVar3 == null || !cVar3.a() || cVar == null) {
            return;
        }
        com.anythink.expressad.out.d dVar = this.f11017a;
        if (dVar != null) {
            dVar.a();
            cVar.t();
        }
        this.f11018b.b();
        new ArrayList().add(cVar);
        if (i10 != 2 || (cVar2 = this.f11018b) == null) {
            return;
        }
        cVar2.a(cVar, true);
    }

    @Override // com.anythink.expressad.splash.b.c
    public final void a(String str) {
        c cVar = this.f11018b;
        if (cVar == null || !cVar.a()) {
            return;
        }
        com.anythink.expressad.out.d dVar = this.f11017a;
        if (dVar != null) {
            dVar.a(str);
        }
        this.f11018b.b();
    }

    private void a() {
        if (this.f11017a != null) {
            this.f11017a = null;
        }
    }
}
