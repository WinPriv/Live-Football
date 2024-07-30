package com.anythink.core.common.k.b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6117a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6118b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6119c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6120d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6121e = 6;
    public static final int f = 7;

    /* renamed from: g, reason: collision with root package name */
    private static volatile a f6122g;

    /* renamed from: h, reason: collision with root package name */
    private ExecutorService f6123h;

    /* renamed from: i, reason: collision with root package name */
    private ExecutorService f6124i;

    /* renamed from: j, reason: collision with root package name */
    private ExecutorService f6125j = null;

    /* renamed from: k, reason: collision with root package name */
    private ExecutorService f6126k = null;

    /* renamed from: l, reason: collision with root package name */
    private ExecutorService f6127l = null;

    private a() {
        this.f6123h = null;
        this.f6124i = null;
        this.f6123h = Executors.newCachedThreadPool();
        this.f6124i = Executors.newSingleThreadExecutor();
    }

    public static a a() {
        if (f6122g == null) {
            synchronized (a.class) {
                if (f6122g == null) {
                    f6122g = new a();
                }
            }
        }
        return f6122g;
    }

    public final void b(final Runnable runnable) {
        if (runnable != null) {
            b bVar = new b() { // from class: com.anythink.core.common.k.b.a.2
                @Override // com.anythink.core.common.k.b.b
                public final void a() {
                    runnable.run();
                }
            };
            bVar.a(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            a(bVar, 2);
        }
    }

    private void b() {
        this.f6124i.shutdown();
        this.f6123h.shutdown();
    }

    public final synchronized void a(b bVar, int i10) {
        if (i10 == 1) {
            bVar.a("anythink_type_single");
            this.f6124i.execute(bVar);
            return;
        }
        if (i10 == 2) {
            bVar.a("anythink_type_normal");
            this.f6123h.execute(bVar);
            return;
        }
        if (i10 == 4) {
            bVar.a("anythink_type_tcp_log");
            if (this.f6125j == null) {
                this.f6125j = Executors.newSingleThreadExecutor();
            }
            this.f6125j.execute(bVar);
            return;
        }
        if (i10 == 5) {
            bVar.a("anythink_type_image_type");
            if (this.f6126k == null) {
                this.f6126k = Executors.newFixedThreadPool(5);
            }
            this.f6126k.execute(bVar);
            return;
        }
        if (i10 == 6) {
            bVar.a("anythink_type_preload_task");
            if (this.f6127l == null) {
                this.f6127l = Executors.newSingleThreadExecutor();
            }
            this.f6127l.execute(bVar);
        } else if (i10 == 7) {
            bVar.a("anythink_type_network");
            this.f6123h.execute(bVar);
        }
    }

    private void a(b bVar) {
        a(bVar, 2);
    }

    public final void a(Runnable runnable) {
        a(runnable, 0L);
    }

    public final void a(final Runnable runnable, final long j10) {
        if (runnable != null) {
            b bVar = new b() { // from class: com.anythink.core.common.k.b.a.1
                @Override // com.anythink.core.common.k.b.b
                public final void a() {
                    try {
                        Thread.sleep(j10);
                    } catch (InterruptedException unused) {
                    }
                    b();
                    runnable.run();
                }
            };
            bVar.a(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            a(bVar, 2);
        }
    }
}
