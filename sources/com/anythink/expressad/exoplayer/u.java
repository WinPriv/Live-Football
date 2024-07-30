package com.anythink.expressad.exoplayer;

import com.anythink.expressad.exoplayer.h.af;
import com.anythink.expressad.exoplayer.h.s;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ae f9335a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9336b;

    /* renamed from: c, reason: collision with root package name */
    public final s.a f9337c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9338d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9339e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9340g;

    /* renamed from: h, reason: collision with root package name */
    public final af f9341h;

    /* renamed from: i, reason: collision with root package name */
    public final com.anythink.expressad.exoplayer.i.i f9342i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f9343j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f9344k;

    public u(ae aeVar, long j10, af afVar, com.anythink.expressad.exoplayer.i.i iVar) {
        this(aeVar, null, new s.a(0), j10, b.f7291b, 1, false, afVar, iVar);
    }

    public final u a(s.a aVar, long j10, long j11) {
        return new u(this.f9335a, this.f9336b, aVar, j10, aVar.a() ? j11 : -9223372036854775807L, this.f, this.f9340g, this.f9341h, this.f9342i);
    }

    public final u b(int i10) {
        u uVar = new u(this.f9335a, this.f9336b, this.f9337c, this.f9338d, this.f9339e, i10, this.f9340g, this.f9341h, this.f9342i);
        a(this, uVar);
        return uVar;
    }

    public u(ae aeVar, Object obj, s.a aVar, long j10, long j11, int i10, boolean z10, af afVar, com.anythink.expressad.exoplayer.i.i iVar) {
        this.f9335a = aeVar;
        this.f9336b = obj;
        this.f9337c = aVar;
        this.f9338d = j10;
        this.f9339e = j11;
        this.f9343j = j10;
        this.f9344k = j10;
        this.f = i10;
        this.f9340g = z10;
        this.f9341h = afVar;
        this.f9342i = iVar;
    }

    public final u a(int i10) {
        u uVar = new u(this.f9335a, this.f9336b, this.f9337c.a(i10), this.f9338d, this.f9339e, this.f, this.f9340g, this.f9341h, this.f9342i);
        a(this, uVar);
        return uVar;
    }

    public final u a(ae aeVar, Object obj) {
        u uVar = new u(aeVar, obj, this.f9337c, this.f9338d, this.f9339e, this.f, this.f9340g, this.f9341h, this.f9342i);
        a(this, uVar);
        return uVar;
    }

    public final u a(boolean z10) {
        u uVar = new u(this.f9335a, this.f9336b, this.f9337c, this.f9338d, this.f9339e, this.f, z10, this.f9341h, this.f9342i);
        a(this, uVar);
        return uVar;
    }

    public final u a(af afVar, com.anythink.expressad.exoplayer.i.i iVar) {
        u uVar = new u(this.f9335a, this.f9336b, this.f9337c, this.f9338d, this.f9339e, this.f, this.f9340g, afVar, iVar);
        a(this, uVar);
        return uVar;
    }

    private static void a(u uVar, u uVar2) {
        uVar2.f9343j = uVar.f9343j;
        uVar2.f9344k = uVar.f9344k;
    }
}
