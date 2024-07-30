package com.anythink.expressad.exoplayer.j;

import com.anythink.expressad.exoplayer.j.h;

/* loaded from: classes.dex */
public final class x implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.a f8937a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.k.v f8938b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8939c;

    private x(h.a aVar, com.anythink.expressad.exoplayer.k.v vVar, int i10) {
        this.f8937a = aVar;
        this.f8938b = vVar;
        this.f8939c = i10;
    }

    private w b() {
        return new w(this.f8937a.a(), this.f8938b, this.f8939c);
    }

    @Override // com.anythink.expressad.exoplayer.j.h.a
    public final /* synthetic */ h a() {
        return new w(this.f8937a.a(), this.f8938b, this.f8939c);
    }
}
