package m4;

import android.os.Handler;
import com.applovin.exoplayer2.b.e0;
import k4.a0;
import k4.i0;

/* compiled from: AudioRendererEventListener.java */
/* loaded from: classes2.dex */
public interface k {

    /* compiled from: AudioRendererEventListener.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f32747a;

        /* renamed from: b, reason: collision with root package name */
        public final k f32748b;

        public a(Handler handler, a0.b bVar) {
            this.f32747a = handler;
            this.f32748b = bVar;
        }

        public final void a(n4.e eVar) {
            synchronized (eVar) {
            }
            Handler handler = this.f32747a;
            if (handler != null) {
                handler.post(new e0(5, this, eVar));
            }
        }
    }

    default void g(String str) {
    }

    default void l(boolean z10) {
    }

    default void m(Exception exc) {
    }

    default void n(long j10) {
    }

    default void o(n4.e eVar) {
    }

    default void p(n4.e eVar) {
    }

    default void q(Exception exc) {
    }

    default void e(i0 i0Var, n4.i iVar) {
    }

    default void k(long j10, String str, long j11) {
    }

    default void v(int i10, long j10, long j11) {
    }
}
