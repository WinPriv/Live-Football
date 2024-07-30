package com.anythink.expressad.foundation.g.f;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f9924a = "d";

    /* renamed from: b, reason: collision with root package name */
    private final Executor f9925b;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final i f9946b;

        /* renamed from: c, reason: collision with root package name */
        private final k f9947c;

        public a(i iVar, k kVar) {
            this.f9946b = iVar;
            this.f9947c = kVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            if (this.f9946b.f()) {
                this.f9946b.c();
                this.f9946b.m();
                return;
            }
            k kVar = this.f9947c;
            com.anythink.expressad.foundation.g.f.a.a aVar = kVar.f10062b;
            if (aVar == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f9946b.a(kVar);
            } else {
                this.f9946b.b(aVar);
            }
            this.f9946b.c();
            this.f9946b.o();
        }
    }

    public d(final Handler handler) {
        this.f9925b = new Executor() { // from class: com.anythink.expressad.foundation.g.f.d.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(i<?> iVar, k<?> kVar) {
        Executor executor = this.f9925b;
        if (executor != null) {
            executor.execute(new a(iVar, kVar));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void b(final i<?> iVar) {
        Executor executor = this.f9925b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.m();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void c(final i<?> iVar) {
        Executor executor = this.f9925b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.n();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void d(final i<?> iVar) {
        Executor executor = this.f9925b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.5
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void e(final i<?> iVar) {
        Executor executor = this.f9925b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.6
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(i<?> iVar, com.anythink.expressad.foundation.g.f.a.a aVar) {
        if (this.f9925b != null) {
            this.f9925b.execute(new a(iVar, k.a(aVar)));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(final i<?> iVar) {
        Executor executor = this.f9925b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.o();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(final i<?> iVar, final long j10, final long j11) {
        Executor executor = this.f9925b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.7
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.a(j10, j11);
                }
            });
        }
    }
}
