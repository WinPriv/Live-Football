package j5;

import android.os.Handler;
import java.io.IOException;
import k4.q1;

/* compiled from: MediaSource.java */
/* loaded from: classes2.dex */
public interface u {

    /* compiled from: MediaSource.java */
    /* loaded from: classes2.dex */
    public interface a {
        a a(c6.a0 a0Var);

        a b(o4.c cVar);

        u c(k4.n0 n0Var);
    }

    /* compiled from: MediaSource.java */
    /* loaded from: classes2.dex */
    public static final class b extends t {
        public b(Object obj) {
            super(obj, -1L);
        }

        public final b b(Object obj) {
            t tVar;
            if (this.f29835a.equals(obj)) {
                tVar = this;
            } else {
                tVar = new t(obj, this.f29836b, this.f29837c, this.f29838d, this.f29839e);
            }
            return new b(tVar);
        }

        public b(Object obj, long j10, int i10) {
            super(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10, -1);
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(t tVar) {
            super(tVar);
        }
    }

    /* compiled from: MediaSource.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a(u uVar, q1 q1Var);
    }

    void a(Handler handler, x xVar);

    void b(c cVar);

    void c(s sVar);

    k4.n0 d();

    void e(Handler handler, com.google.android.exoplayer2.drm.e eVar);

    void f(c cVar);

    void h(com.google.android.exoplayer2.drm.e eVar);

    void i(c cVar);

    void j() throws IOException;

    default boolean k() {
        return true;
    }

    void l(c cVar, c6.h0 h0Var, l4.w wVar);

    default q1 m() {
        return null;
    }

    void o(x xVar);

    s p(b bVar, c6.b bVar2, long j10);
}
