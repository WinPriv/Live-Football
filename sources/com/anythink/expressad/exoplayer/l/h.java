package com.anythink.expressad.exoplayer.l;

import android.os.Handler;
import android.view.Surface;
import com.anythink.expressad.exoplayer.m;

/* loaded from: classes.dex */
public interface h {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f9229a;

        /* renamed from: b, reason: collision with root package name */
        private final h f9230b;

        public a(Handler handler, h hVar) {
            Handler handler2;
            if (hVar != null) {
                handler2 = (Handler) com.anythink.expressad.exoplayer.k.a.a(handler);
            } else {
                handler2 = null;
            }
            this.f9229a = handler2;
            this.f9230b = hVar;
        }

        public final void b(final com.anythink.expressad.exoplayer.c.d dVar) {
            if (this.f9230b != null) {
                this.f9229a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9230b.b(dVar);
                    }
                });
            }
        }

        public final void a(final com.anythink.expressad.exoplayer.c.d dVar) {
            if (this.f9230b != null) {
                this.f9229a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9230b.a(dVar);
                    }
                });
            }
        }

        public final void a(final String str, final long j10, final long j11) {
            if (this.f9230b != null) {
                this.f9229a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9230b.a(str, j10, j11);
                    }
                });
            }
        }

        public final void a(final m mVar) {
            if (this.f9230b != null) {
                this.f9229a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9230b.a(mVar);
                    }
                });
            }
        }

        public final void a(final int i10, final long j10) {
            if (this.f9230b != null) {
                this.f9229a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9230b.a(i10, j10);
                    }
                });
            }
        }

        public final void a(final int i10, final int i11, final int i12, final float f) {
            if (this.f9230b != null) {
                this.f9229a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9230b.a(i10, i11, i12, f);
                    }
                });
            }
        }

        public final void a(final Surface surface) {
            if (this.f9230b != null) {
                this.f9229a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9230b.a(surface);
                    }
                });
            }
        }
    }

    void a(int i10, int i11, int i12, float f);

    void a(int i10, long j10);

    void a(Surface surface);

    void a(com.anythink.expressad.exoplayer.c.d dVar);

    void a(m mVar);

    void a(String str, long j10, long j11);

    void b(com.anythink.expressad.exoplayer.c.d dVar);
}
