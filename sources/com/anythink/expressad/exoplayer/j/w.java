package com.anythink.expressad.exoplayer.j;

import android.net.Uri;

/* loaded from: classes.dex */
public final class w implements h {

    /* renamed from: a, reason: collision with root package name */
    private final h f8934a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.k.v f8935b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8936c;

    public w(h hVar, com.anythink.expressad.exoplayer.k.v vVar, int i10) {
        this.f8934a = (h) com.anythink.expressad.exoplayer.k.a.a(hVar);
        this.f8935b = (com.anythink.expressad.exoplayer.k.v) com.anythink.expressad.exoplayer.k.a.a(vVar);
        this.f8936c = i10;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final long a(k kVar) {
        this.f8935b.a(this.f8936c);
        return this.f8934a.a(kVar);
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final void b() {
        this.f8934a.b();
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final int a(byte[] bArr, int i10, int i11) {
        this.f8935b.a(this.f8936c);
        return this.f8934a.a(bArr, i10, i11);
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final Uri a() {
        return this.f8934a.a();
    }
}
