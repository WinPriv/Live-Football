package k4;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* compiled from: PlayerMessage.java */
/* loaded from: classes2.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final b f30455a;

    /* renamed from: b, reason: collision with root package name */
    public final a f30456b;

    /* renamed from: c, reason: collision with root package name */
    public final d6.c f30457c;

    /* renamed from: d, reason: collision with root package name */
    public int f30458d;

    /* renamed from: e, reason: collision with root package name */
    public Object f30459e;
    public final Looper f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30460g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30461h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30462i;

    /* compiled from: PlayerMessage.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: PlayerMessage.java */
    /* loaded from: classes2.dex */
    public interface b {
        void p(int i10, Object obj) throws m;
    }

    public f1(f0 f0Var, b bVar, q1 q1Var, int i10, d6.c cVar, Looper looper) {
        this.f30456b = f0Var;
        this.f30455a = bVar;
        this.f = looper;
        this.f30457c = cVar;
    }

    public final synchronized void a(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        boolean z11;
        d6.a.d(this.f30460g);
        if (this.f.getThread() != Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        long elapsedRealtime = this.f30457c.elapsedRealtime() + j10;
        while (true) {
            z11 = this.f30462i;
            if (z11 || j10 <= 0) {
                break;
            }
            this.f30457c.c();
            wait(j10);
            j10 = elapsedRealtime - this.f30457c.elapsedRealtime();
        }
        if (!z11) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.f30461h = z10 | this.f30461h;
        this.f30462i = true;
        notifyAll();
    }

    public final void c() {
        d6.a.d(!this.f30460g);
        this.f30460g = true;
        f0 f0Var = (f0) this.f30456b;
        synchronized (f0Var) {
            if (!f0Var.R && f0Var.B.getThread().isAlive()) {
                f0Var.f30436z.j(14, this).a();
                return;
            }
            d6.p.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
