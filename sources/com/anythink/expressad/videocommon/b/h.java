package com.anythink.expressad.videocommon.b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.g.c f12366a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static h f12367a = new h(0);

        private a() {
        }
    }

    public /* synthetic */ h(byte b10) {
        this();
    }

    private static h a() {
        return a.f12367a;
    }

    private void b() {
        if (com.anythink.expressad.foundation.b.a.b().d() != null) {
            this.f12366a = new com.anythink.expressad.foundation.g.g.c(com.anythink.expressad.foundation.b.a.b().d());
        }
    }

    private h() {
        if (com.anythink.expressad.foundation.b.a.b().d() != null) {
            this.f12366a = new com.anythink.expressad.foundation.g.g.c(com.anythink.expressad.foundation.b.a.b().d());
        }
    }

    public final void a(com.anythink.expressad.foundation.g.g.a aVar) {
        com.anythink.expressad.foundation.g.g.c cVar = this.f12366a;
        if (cVar != null) {
            cVar.a(aVar);
        }
    }
}
