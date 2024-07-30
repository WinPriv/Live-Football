package com.anythink.expressad.exoplayer.h.b;

import com.anythink.expressad.exoplayer.j.k;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.m;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: k, reason: collision with root package name */
    private final int f8318k;

    /* renamed from: l, reason: collision with root package name */
    private final m f8319l;

    /* renamed from: m, reason: collision with root package name */
    private volatile int f8320m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f8321n;

    private j(com.anythink.expressad.exoplayer.j.h hVar, k kVar, m mVar, int i10, Object obj, long j10, long j11, long j12, int i11, m mVar2) {
        super(hVar, kVar, mVar, i10, obj, j10, j11, com.anythink.expressad.exoplayer.b.f7291b, j12);
        this.f8318k = i11;
        this.f8319l = mVar2;
    }

    @Override // com.anythink.expressad.exoplayer.j.t.c
    public final void b() {
        try {
            long a10 = this.f8272i.a(this.f8266b.a(this.f8320m));
            if (a10 != -1) {
                a10 += this.f8320m;
            }
            com.anythink.expressad.exoplayer.e.b bVar = new com.anythink.expressad.exoplayer.e.b(this.f8272i, this.f8320m, a10);
            b c10 = c();
            c10.a(0L);
            com.anythink.expressad.exoplayer.e.m a11 = c10.a(this.f8318k);
            a11.a(this.f8319l);
            for (int i10 = 0; i10 != -1; i10 = a11.a(bVar, Integer.MAX_VALUE, true)) {
                this.f8320m += i10;
            }
            a11.a(this.f8270g, 1, this.f8320m, 0, null);
            af.a(this.f8272i);
            this.f8321n = true;
        } catch (Throwable th) {
            af.a(this.f8272i);
            throw th;
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.b.c
    public final long d() {
        return this.f8320m;
    }

    @Override // com.anythink.expressad.exoplayer.h.b.i
    public final boolean f() {
        return this.f8321n;
    }

    @Override // com.anythink.expressad.exoplayer.j.t.c
    public final void a() {
    }
}
