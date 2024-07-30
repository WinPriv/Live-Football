package com.applovin.exoplayer2.b;

import android.os.Handler;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.l.ai;

/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f13388a;

        /* renamed from: b */
        private final g f13389b;

        public a(Handler handler, g gVar) {
            Handler handler2;
            if (gVar != null) {
                handler2 = (Handler) com.applovin.exoplayer2.l.a.b(handler);
            } else {
                handler2 = null;
            }
            this.f13388a = handler2;
            this.f13389b = gVar;
        }

        public /* synthetic */ void b(String str, long j10, long j11) {
            ((g) ai.a(this.f13389b)).b(str, j10, j11);
        }

        public /* synthetic */ void c(com.applovin.exoplayer2.c.e eVar) {
            eVar.a();
            ((g) ai.a(this.f13389b)).d(eVar);
        }

        public /* synthetic */ void d(com.applovin.exoplayer2.c.e eVar) {
            ((g) ai.a(this.f13389b)).c(eVar);
        }

        public void a(com.applovin.exoplayer2.c.e eVar) {
            Handler handler = this.f13388a;
            if (handler != null) {
                handler.post(new e0.g(1, this, eVar));
            }
        }

        public /* synthetic */ void d(Exception exc) {
            ((g) ai.a(this.f13389b)).b(exc);
        }

        public /* synthetic */ void b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
            ((g) ai.a(this.f13389b)).a(vVar);
            ((g) ai.a(this.f13389b)).b(vVar, hVar);
        }

        public /* synthetic */ void c(Exception exc) {
            ((g) ai.a(this.f13389b)).c(exc);
        }

        public void a(final String str, final long j10, final long j11) {
            Handler handler = this.f13388a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.a.this.b(str, j10, j11);
                    }
                });
            }
        }

        public /* synthetic */ void b(long j10) {
            ((g) ai.a(this.f13389b)).a(j10);
        }

        public void a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
            Handler handler = this.f13388a;
            if (handler != null) {
                handler.post(new androidx.emoji2.text.g(this, vVar, hVar, 1));
            }
        }

        public /* synthetic */ void b(int i10, long j10, long j11) {
            ((g) ai.a(this.f13389b)).a(i10, j10, j11);
        }

        public void a(final long j10) {
            Handler handler = this.f13388a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.a.this.b(j10);
                    }
                });
            }
        }

        public /* synthetic */ void b(String str) {
            ((g) ai.a(this.f13389b)).b(str);
        }

        public void a(int i10, long j10, long j11) {
            Handler handler = this.f13388a;
            if (handler != null) {
                handler.post(new c0(this, i10, j10, j11, 0));
            }
        }

        public void b(com.applovin.exoplayer2.c.e eVar) {
            eVar.a();
            Handler handler = this.f13388a;
            if (handler != null) {
                handler.post(new d0(0, this, eVar));
            }
        }

        public void a(String str) {
            Handler handler = this.f13388a;
            if (handler != null) {
                handler.post(new e0(0, this, str));
            }
        }

        public /* synthetic */ void b(boolean z10) {
            ((g) ai.a(this.f13389b)).a_(z10);
        }

        public void a(boolean z10) {
            Handler handler = this.f13388a;
            if (handler != null) {
                handler.post(new z(0, this, z10));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.f13388a;
            if (handler != null) {
                handler.post(new d0(1, this, exc));
            }
        }

        public void a(Exception exc) {
            Handler handler = this.f13388a;
            if (handler != null) {
                handler.post(new e0.g(2, this, exc));
            }
        }
    }

    default void a(int i10, long j10, long j11) {
    }

    default void b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
    }

    default void c(com.applovin.exoplayer2.c.e eVar) {
    }

    default void a(long j10) {
    }

    default void b(Exception exc) {
    }

    default void c(Exception exc) {
    }

    @Deprecated
    default void a(com.applovin.exoplayer2.v vVar) {
    }

    default void b(String str) {
    }

    default void b(String str, long j10, long j11) {
    }

    default void a_(boolean z10) {
    }

    default void d(com.applovin.exoplayer2.c.e eVar) {
    }
}
