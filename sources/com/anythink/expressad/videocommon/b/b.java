package com.anythink.expressad.videocommon.b;

import com.anythink.core.common.res.a.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f12318a;

    /* renamed from: b, reason: collision with root package name */
    private int f12319b;

    /* renamed from: c, reason: collision with root package name */
    private int f12320c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.res.a.a f12321d;

    public b(String str, int i10, int i11) {
        this.f12318a = str;
        this.f12319b = i10;
        this.f12320c = i11;
        com.anythink.core.common.res.a.a a10 = com.anythink.core.common.res.a.c.a().a(this.f12318a);
        this.f12321d = a10;
        a10.a(new com.anythink.core.common.res.a.b(i10, i11));
    }

    public final void a(a.AbstractC0083a abstractC0083a) {
        this.f12321d.a(abstractC0083a);
    }

    public final void b() {
        this.f12321d.f();
    }

    public final void a() {
        this.f12321d.e();
    }
}
