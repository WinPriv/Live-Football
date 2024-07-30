package androidx.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import r1.g;
import r1.o;
import r1.p;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f2606a = a(false);

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f2607b = a(true);

    /* renamed from: c, reason: collision with root package name */
    public final o f2608c;

    /* renamed from: d, reason: collision with root package name */
    public final g f2609d;

    /* renamed from: e, reason: collision with root package name */
    public final d0.b f2610e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2611g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2612h;

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0024a {
    }

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public interface b {
        a a();
    }

    public a(C0024a c0024a) {
        String str = p.f34840a;
        this.f2608c = new o();
        this.f2609d = new g();
        this.f2610e = new d0.b(1);
        this.f = 4;
        this.f2611g = Integer.MAX_VALUE;
        this.f2612h = 20;
    }

    public static ExecutorService a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new r1.a(z10));
    }
}
