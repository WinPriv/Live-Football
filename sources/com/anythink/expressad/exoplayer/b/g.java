package com.anythink.expressad.exoplayer.b;

import android.os.Handler;

/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f7352a;

        /* renamed from: b, reason: collision with root package name */
        private final g f7353b;

        public a(Handler handler, g gVar) {
            Handler handler2;
            if (gVar != null) {
                handler2 = (Handler) com.anythink.expressad.exoplayer.k.a.a(handler);
            } else {
                handler2 = null;
            }
            this.f7352a = handler2;
            this.f7353b = gVar;
        }

        public final void b(final com.anythink.expressad.exoplayer.c.d dVar) {
            if (this.f7353b != null) {
                this.f7352a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7353b.d(dVar);
                    }
                });
            }
        }

        public final void a(final com.anythink.expressad.exoplayer.c.d dVar) {
            if (this.f7353b != null) {
                this.f7352a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7353b.c(dVar);
                    }
                });
            }
        }

        public final void a(final String str, final long j10, final long j11) {
            if (this.f7353b != null) {
                this.f7352a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7353b.b(str, j10, j11);
                    }
                });
            }
        }

        public final void a(final com.anythink.expressad.exoplayer.m mVar) {
            if (this.f7353b != null) {
                this.f7352a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7353b.b(mVar);
                    }
                });
            }
        }

        public final void a(final int i10, final long j10, final long j11) {
            if (this.f7353b != null) {
                this.f7352a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7353b.a(i10, j10, j11);
                    }
                });
            }
        }

        public final void a(final int i10) {
            if (this.f7353b != null) {
                this.f7352a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7353b.a(i10);
                    }
                });
            }
        }
    }

    void a(int i10);

    void a(int i10, long j10, long j11);

    void b(com.anythink.expressad.exoplayer.m mVar);

    void b(String str, long j10, long j11);

    void c(com.anythink.expressad.exoplayer.c.d dVar);

    void d(com.anythink.expressad.exoplayer.c.d dVar);
}
