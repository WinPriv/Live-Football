package e4;

import a4.e;
import com.applovin.exoplayer2.a0;
import com.applovin.exoplayer2.h.d0;
import f4.k;
import g4.d;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import z3.h;
import z3.j;
import z3.w;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes.dex */
public final class a implements b {
    public static final Logger f = Logger.getLogger(w.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final k f27743a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f27744b;

    /* renamed from: c, reason: collision with root package name */
    public final e f27745c;

    /* renamed from: d, reason: collision with root package name */
    public final d f27746d;

    /* renamed from: e, reason: collision with root package name */
    public final h4.b f27747e;

    public a(Executor executor, e eVar, k kVar, d dVar, h4.b bVar) {
        this.f27744b = executor;
        this.f27745c = eVar;
        this.f27743a = kVar;
        this.f27746d = dVar;
        this.f27747e = bVar;
    }

    @Override // e4.b
    public final void a(a0 a0Var, h hVar, j jVar) {
        this.f27744b.execute(new d0(this, jVar, a0Var, hVar, 1));
    }
}
