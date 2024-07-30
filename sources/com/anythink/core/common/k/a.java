package com.anythink.core.common.k;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6085a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.i.a f6086b = com.anythink.core.common.i.c.a();

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.i.b f6087c = new com.anythink.core.common.i.b() { // from class: com.anythink.core.common.k.a.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                if (!a.this.f6085a) {
                    a.b(a.this);
                    a.this.b();
                }
            }
        }
    };

    public static /* synthetic */ boolean b(a aVar) {
        aVar.f6085a = true;
        return true;
    }

    private boolean c() {
        return this.f6085a;
    }

    public abstract void b();

    public final synchronized void a(long j10) {
        this.f6086b.a(this.f6087c, j10, false);
    }

    public final synchronized void a() {
        this.f6086b.a(this.f6087c);
    }
}
