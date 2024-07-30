package com.anythink.expressad.exoplayer.j;

import android.net.Uri;

/* loaded from: classes.dex */
public final class z implements h {

    /* renamed from: a, reason: collision with root package name */
    private final h f8947a;

    /* renamed from: b, reason: collision with root package name */
    private final g f8948b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8949c;

    /* renamed from: d, reason: collision with root package name */
    private long f8950d;

    public z(h hVar, g gVar) {
        this.f8947a = (h) com.anythink.expressad.exoplayer.k.a.a(hVar);
        this.f8948b = (g) com.anythink.expressad.exoplayer.k.a.a(gVar);
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final long a(k kVar) {
        long a10 = this.f8947a.a(kVar);
        this.f8950d = a10;
        if (a10 == 0) {
            return 0L;
        }
        if (kVar.f8818g == -1 && a10 != -1) {
            kVar = new k(kVar.f8815c, kVar.f8817e, kVar.f, a10, kVar.f8819h, kVar.f8820i);
        }
        this.f8949c = true;
        this.f8948b.a(kVar);
        return this.f8950d;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final void b() {
        try {
            this.f8947a.b();
        } finally {
            if (this.f8949c) {
                this.f8949c = false;
                this.f8948b.a();
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final int a(byte[] bArr, int i10, int i11) {
        if (this.f8950d == 0) {
            return -1;
        }
        int a10 = this.f8947a.a(bArr, i10, i11);
        if (a10 > 0) {
            this.f8948b.a(bArr, i10, a10);
            long j10 = this.f8950d;
            if (j10 != -1) {
                this.f8950d = j10 - a10;
            }
        }
        return a10;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final Uri a() {
        return this.f8947a.a();
    }
}
