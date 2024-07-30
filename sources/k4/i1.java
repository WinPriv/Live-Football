package k4;

import java.io.IOException;
import k4.f1;

/* compiled from: Renderer.java */
/* loaded from: classes2.dex */
public interface i1 extends f1.b {

    /* compiled from: Renderer.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    boolean b();

    void e();

    boolean f();

    void g();

    String getName();

    int getState();

    void h(i0[] i0VarArr, j5.f0 f0Var, long j10, long j11) throws m;

    void i(int i10, l4.w wVar);

    boolean isReady();

    e j();

    void o(long j10, long j11) throws m;

    j5.f0 q();

    void r(k1 k1Var, i0[] i0VarArr, j5.f0 f0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws m;

    void reset();

    void s() throws IOException;

    void start() throws m;

    void stop();

    long t();

    void u(long j10) throws m;

    boolean v();

    d6.q w();

    int x();

    default void m(float f, float f10) throws m {
    }
}
