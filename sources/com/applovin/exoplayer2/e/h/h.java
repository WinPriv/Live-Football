package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    private x f14518b;

    /* renamed from: c, reason: collision with root package name */
    private j f14519c;

    /* renamed from: d, reason: collision with root package name */
    private f f14520d;

    /* renamed from: e, reason: collision with root package name */
    private long f14521e;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private long f14522g;

    /* renamed from: h, reason: collision with root package name */
    private int f14523h;

    /* renamed from: i, reason: collision with root package name */
    private int f14524i;

    /* renamed from: k, reason: collision with root package name */
    private long f14526k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14527l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14528m;

    /* renamed from: a, reason: collision with root package name */
    private final d f14517a = new d();

    /* renamed from: j, reason: collision with root package name */
    private a f14525j = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        v f14529a;

        /* renamed from: b, reason: collision with root package name */
        f f14530b;
    }

    /* loaded from: classes.dex */
    public static final class b implements f {
        private b() {
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public long a(com.applovin.exoplayer2.e.i iVar) {
            return -1L;
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public com.applovin.exoplayer2.e.v b() {
            return new v.b(com.anythink.expressad.exoplayer.b.f7291b);
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public void a(long j10) {
        }
    }

    private int b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        if (!a(iVar)) {
            return -1;
        }
        com.applovin.exoplayer2.v vVar = this.f14525j.f14529a;
        this.f14524i = vVar.f16850z;
        if (!this.f14528m) {
            this.f14518b.a(vVar);
            this.f14528m = true;
        }
        f fVar = this.f14525j.f14530b;
        if (fVar != null) {
            this.f14520d = fVar;
        } else if (iVar.d() == -1) {
            this.f14520d = new b();
        } else {
            e b10 = this.f14517a.b();
            this.f14520d = new com.applovin.exoplayer2.e.h.a(this, this.f, iVar.d(), b10.f14511h + b10.f14512i, b10.f14507c, (b10.f14506b & 4) != 0);
        }
        this.f14523h = 2;
        this.f14517a.d();
        return 0;
    }

    public void a(j jVar, x xVar) {
        this.f14519c = jVar;
        this.f14518b = xVar;
        a(true);
    }

    public abstract boolean a(y yVar, long j10, a aVar) throws IOException;

    public abstract long b(y yVar);

    public void c(long j10) {
        this.f14522g = j10;
    }

    public void a(boolean z10) {
        if (z10) {
            this.f14525j = new a();
            this.f = 0L;
            this.f14523h = 0;
        } else {
            this.f14523h = 1;
        }
        this.f14521e = -1L;
        this.f14522g = 0L;
    }

    public final void a(long j10, long j11) {
        this.f14517a.a();
        if (j10 == 0) {
            a(!this.f14527l);
        } else if (this.f14523h != 0) {
            this.f14521e = b(j11);
            ((f) ai.a(this.f14520d)).a(this.f14521e);
            this.f14523h = 2;
        }
    }

    private int b(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        long a10 = this.f14520d.a(iVar);
        if (a10 >= 0) {
            uVar.f14937a = a10;
            return 1;
        }
        if (a10 < -1) {
            c(-(a10 + 2));
        }
        if (!this.f14527l) {
            this.f14519c.a((com.applovin.exoplayer2.e.v) com.applovin.exoplayer2.l.a.a(this.f14520d.b()));
            this.f14527l = true;
        }
        if (this.f14526k <= 0 && !this.f14517a.a(iVar)) {
            this.f14523h = 3;
            return -1;
        }
        this.f14526k = 0L;
        y c10 = this.f14517a.c();
        long b10 = b(c10);
        if (b10 >= 0) {
            long j10 = this.f14522g;
            if (j10 + b10 >= this.f14521e) {
                long a11 = a(j10);
                this.f14518b.a(c10, c10.b());
                this.f14518b.a(a11, 1, c10.b(), 0, null);
                this.f14521e = -1L;
            }
        }
        this.f14522g += b10;
        return 0;
    }

    public final int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        a();
        int i10 = this.f14523h;
        if (i10 == 0) {
            return b(iVar);
        }
        if (i10 == 1) {
            iVar.b((int) this.f);
            this.f14523h = 2;
            return 0;
        }
        if (i10 == 2) {
            ai.a(this.f14520d);
            return b(iVar, uVar);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    private void a() {
        com.applovin.exoplayer2.l.a.a(this.f14518b);
        ai.a(this.f14519c);
    }

    private boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        while (this.f14517a.a(iVar)) {
            this.f14526k = iVar.c() - this.f;
            if (!a(this.f14517a.c(), this.f, this.f14525j)) {
                return true;
            }
            this.f = iVar.c();
        }
        this.f14523h = 3;
        return false;
    }

    public long a(long j10) {
        return (j10 * 1000000) / this.f14524i;
    }

    public long b(long j10) {
        return (this.f14524i * j10) / 1000000;
    }
}
