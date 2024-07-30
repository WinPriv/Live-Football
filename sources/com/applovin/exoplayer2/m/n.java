package com.applovin.exoplayer2.m;

import android.os.Handler;
import android.os.SystemClock;
import com.applovin.exoplayer2.b.d0;
import com.applovin.exoplayer2.b.e0;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.m.n;
import com.applovin.exoplayer2.v;

/* loaded from: classes.dex */
public interface n {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f16536a;

        /* renamed from: b */
        private final n f16537b;

        public a(Handler handler, n nVar) {
            Handler handler2;
            if (nVar != null) {
                handler2 = (Handler) com.applovin.exoplayer2.l.a.b(handler);
            } else {
                handler2 = null;
            }
            this.f16536a = handler2;
            this.f16537b = nVar;
        }

        public /* synthetic */ void b(String str, long j10, long j11) {
            ((n) ai.a(this.f16537b)).a(str, j10, j11);
        }

        public /* synthetic */ void c(com.applovin.exoplayer2.c.e eVar) {
            eVar.a();
            ((n) ai.a(this.f16537b)).b(eVar);
        }

        public /* synthetic */ void d(com.applovin.exoplayer2.c.e eVar) {
            ((n) ai.a(this.f16537b)).a(eVar);
        }

        public void a(com.applovin.exoplayer2.c.e eVar) {
            Handler handler = this.f16536a;
            if (handler != null) {
                handler.post(new androidx.appcompat.app.p(3, this, eVar));
            }
        }

        public /* synthetic */ void b(v vVar, com.applovin.exoplayer2.c.h hVar) {
            ((n) ai.a(this.f16537b)).a_(vVar);
            ((n) ai.a(this.f16537b)).a(vVar, hVar);
        }

        public void a(String str, long j10, long j11) {
            Handler handler = this.f16536a;
            if (handler != null) {
                handler.post(new s(this, str, j10, j11, 0));
            }
        }

        public /* synthetic */ void b(int i10, long j10) {
            ((n) ai.a(this.f16537b)).a(i10, j10);
        }

        public void a(v vVar, com.applovin.exoplayer2.c.h hVar) {
            Handler handler = this.f16536a;
            if (handler != null) {
                handler.post(new q(this, vVar, hVar, 0));
            }
        }

        public /* synthetic */ void b(long j10, int i10) {
            ((n) ai.a(this.f16537b)).a(j10, i10);
        }

        public void a(int i10, long j10) {
            Handler handler = this.f16536a;
            if (handler != null) {
                handler.post(new p(this, i10, j10));
            }
        }

        public /* synthetic */ void b(o oVar) {
            ((n) ai.a(this.f16537b)).a(oVar);
        }

        public /* synthetic */ void b(String str) {
            ((n) ai.a(this.f16537b)).a(str);
        }

        public void a(long j10, int i10) {
            Handler handler = this.f16536a;
            if (handler != null) {
                handler.post(new p(this, j10, i10));
            }
        }

        public void b(com.applovin.exoplayer2.c.e eVar) {
            eVar.a();
            Handler handler = this.f16536a;
            if (handler != null) {
                handler.post(new e0(3, this, eVar));
            }
        }

        public void a(o oVar) {
            Handler handler = this.f16536a;
            if (handler != null) {
                handler.post(new androidx.appcompat.app.p(2, this, oVar));
            }
        }

        public /* synthetic */ void b(Exception exc) {
            ((n) ai.a(this.f16537b)).a(exc);
        }

        public void a(final Object obj) {
            if (this.f16536a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f16536a.post(new Runnable() { // from class: com.applovin.exoplayer2.m.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.a.this.a(obj, elapsedRealtime);
                    }
                });
            }
        }

        public /* synthetic */ void a(Object obj, long j10) {
            ((n) ai.a(this.f16537b)).a(obj, j10);
        }

        public void a(String str) {
            Handler handler = this.f16536a;
            if (handler != null) {
                handler.post(new e0(2, this, str));
            }
        }

        public void a(Exception exc) {
            Handler handler = this.f16536a;
            if (handler != null) {
                handler.post(new d0(3, this, exc));
            }
        }
    }

    default void a(int i10, long j10) {
    }

    default void a(long j10, int i10) {
    }

    default void a(com.applovin.exoplayer2.c.e eVar) {
    }

    default void a(o oVar) {
    }

    default void a(v vVar, com.applovin.exoplayer2.c.h hVar) {
    }

    default void a(Exception exc) {
    }

    default void a(Object obj, long j10) {
    }

    default void a(String str) {
    }

    default void a(String str, long j10, long j11) {
    }

    @Deprecated
    default void a_(v vVar) {
    }

    default void b(com.applovin.exoplayer2.c.e eVar) {
    }
}
