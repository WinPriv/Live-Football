package com.anythink.core.common;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.common.e.ai;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.core.common.e.e f5368a;

    /* renamed from: b, reason: collision with root package name */
    ai f5369b;

    /* renamed from: c, reason: collision with root package name */
    long f5370c;

    /* renamed from: d, reason: collision with root package name */
    ATBaseAdAdapter f5371d;

    /* renamed from: e, reason: collision with root package name */
    int f5372e;
    Runnable f;

    /* renamed from: g, reason: collision with root package name */
    Runnable f5373g;

    /* renamed from: h, reason: collision with root package name */
    boolean f5374h;

    /* renamed from: i, reason: collision with root package name */
    boolean f5375i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f5376j;

    private d(int i10) {
        this.f5372e = i10;
    }

    private void a(com.anythink.core.common.e.e eVar) {
        this.f5368a = eVar;
    }

    private boolean b() {
        if (this.f5376j != null) {
            return true;
        }
        return false;
    }

    private com.anythink.core.common.e.e c() {
        return this.f5368a;
    }

    private long d() {
        return this.f5370c;
    }

    private void e() {
        this.f5371d = null;
    }

    private int f() {
        return this.f5372e;
    }

    private void g() {
        if (this.f != null) {
            com.anythink.core.common.b.n.a().c(this.f);
            this.f = null;
        }
        if (this.f5373g != null) {
            com.anythink.core.common.b.n.a().c(this.f5373g);
            this.f5373g = null;
        }
    }

    private void h() {
        if (this.f != null) {
            com.anythink.core.common.b.n.a().c(this.f);
            this.f = null;
        }
    }

    private void i() {
        if (this.f5373g != null) {
            com.anythink.core.common.b.n.a().c(this.f5373g);
            this.f5373g = null;
        }
    }

    private Boolean j() {
        return this.f5376j;
    }

    private boolean k() {
        if (!this.f5374h && !this.f5375i) {
            return false;
        }
        return true;
    }

    private ai l() {
        return this.f5369b;
    }

    private void a(long j10) {
        this.f5370c = j10;
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f5371d = aTBaseAdAdapter;
    }

    private void a(long j10, final Runnable runnable, long j11, final Runnable runnable2) {
        if (j10 != -1 && runnable != null) {
            this.f = new Runnable() { // from class: com.anythink.core.common.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (d.this) {
                        d.this.f5375i = true;
                        runnable.run();
                    }
                }
            };
            com.anythink.core.common.b.n.a().a(this.f, j10);
        }
        if (j11 == -1 || runnable2 == null) {
            return;
        }
        this.f5373g = new Runnable() { // from class: com.anythink.core.common.d.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (d.this) {
                    d.this.f5374h = true;
                    runnable2.run();
                }
            }
        };
        com.anythink.core.common.b.n.a().a(this.f5373g, j11);
    }

    private void a(boolean z10) {
        this.f5376j = Boolean.valueOf(z10);
    }

    private void a(ai aiVar) {
        this.f5369b = aiVar;
    }

    private boolean a() {
        if (this.f5376j != null) {
            if (this.f5374h || this.f5375i) {
                return false;
            }
        }
        return true;
    }
}
