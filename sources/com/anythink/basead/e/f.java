package com.anythink.basead.e;

import com.anythink.core.common.e.i;

/* loaded from: classes.dex */
public abstract class f implements g {

    /* renamed from: a, reason: collision with root package name */
    i f3964a;

    public f(i iVar) {
        this.f3964a = iVar;
    }

    private void a() {
        i iVar = this.f3964a;
        if (iVar instanceof com.anythink.core.common.e.g) {
            com.anythink.core.common.e.g gVar = (com.anythink.core.common.e.g) iVar;
            if (gVar.c() == 1) {
                com.anythink.core.common.a.b.a().b(gVar);
            }
        }
    }

    @Override // com.anythink.basead.e.a
    public void onAdShow() {
        i iVar = this.f3964a;
        if (iVar instanceof com.anythink.core.common.e.g) {
            com.anythink.core.common.e.g gVar = (com.anythink.core.common.e.g) iVar;
            if (gVar.c() == 1) {
                com.anythink.core.common.a.b.a().b(gVar);
            }
        }
    }
}
