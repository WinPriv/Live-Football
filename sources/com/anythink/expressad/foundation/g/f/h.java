package com.anythink.expressad.foundation.g.f;

import android.os.Process;
import com.anythink.expressad.foundation.h.o;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10020a = "h";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.e.a f10021b;

    /* renamed from: c, reason: collision with root package name */
    private g f10022c;

    /* renamed from: d, reason: collision with root package name */
    private c f10023d;

    public h(SSLSocketFactory sSLSocketFactory, c cVar) {
        com.anythink.expressad.foundation.g.f.e.b bVar = new com.anythink.expressad.foundation.g.f.e.b(sSLSocketFactory, null);
        this.f10021b = bVar;
        this.f10022c = new com.anythink.expressad.foundation.g.f.f.a(bVar, cVar);
        this.f10023d = cVar;
    }

    private void b(i iVar) {
        try {
            this.f10023d.c(iVar);
            if (iVar.f()) {
                iVar.c();
                this.f10023d.b(iVar);
                this.f10023d.a(iVar);
            } else {
                this.f10023d.d(iVar);
                this.f10023d.a((i<?>) iVar, iVar.a(this.f10022c.a(iVar)));
            }
        } catch (com.anythink.expressad.foundation.g.f.a.a e10) {
            this.f10023d.a((i<?>) iVar, i.a(e10));
        } catch (Exception e11) {
            o.d(f10020a, "Unhandled exception " + e11.getMessage());
            this.f10023d.a((i<?>) iVar, new com.anythink.expressad.foundation.g.f.a.a(4, null));
        }
    }

    public final void a(i iVar) {
        Process.setThreadPriority(10);
        try {
            this.f10023d.c(iVar);
            if (iVar.f()) {
                iVar.c();
                this.f10023d.b(iVar);
                this.f10023d.a(iVar);
            } else {
                this.f10023d.d(iVar);
                this.f10023d.a((i<?>) iVar, iVar.a(this.f10022c.a(iVar)));
            }
        } catch (com.anythink.expressad.foundation.g.f.a.a e10) {
            this.f10023d.a((i<?>) iVar, i.a(e10));
        } catch (Exception e11) {
            o.d(f10020a, "Unhandled exception " + e11.getMessage());
            this.f10023d.a((i<?>) iVar, new com.anythink.expressad.foundation.g.f.a.a(4, null));
        }
    }
}
