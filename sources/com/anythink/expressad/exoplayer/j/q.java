package com.anythink.expressad.exoplayer.j;

import com.anythink.expressad.exoplayer.j.s;

/* loaded from: classes.dex */
public final class q extends s.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f8888a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super h> f8889b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8890c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8891d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8892e;

    public q(String str) {
        this(str, null);
    }

    private p b(s.f fVar) {
        return new p(this.f8888a, null, this.f8889b, this.f8890c, this.f8891d, this.f8892e, fVar);
    }

    @Override // com.anythink.expressad.exoplayer.j.s.a
    public final /* synthetic */ s a(s.f fVar) {
        return new p(this.f8888a, null, this.f8889b, this.f8890c, this.f8891d, this.f8892e, fVar);
    }

    public q(String str, aa<? super h> aaVar) {
        this(str, aaVar, (byte) 0);
    }

    private q(String str, aa<? super h> aaVar, byte b10) {
        this.f8888a = str;
        this.f8889b = aaVar;
        this.f8890c = 8000;
        this.f8891d = 8000;
        this.f8892e = false;
    }
}
