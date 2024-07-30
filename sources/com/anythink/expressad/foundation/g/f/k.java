package com.anythink.expressad.foundation.g.f;

/* loaded from: classes.dex */
public final class k<T> {

    /* renamed from: a, reason: collision with root package name */
    public T f10061a;

    /* renamed from: b, reason: collision with root package name */
    public com.anythink.expressad.foundation.g.f.a.a f10062b;

    /* renamed from: c, reason: collision with root package name */
    public com.anythink.expressad.foundation.g.f.f.c f10063c;

    private k(T t10, com.anythink.expressad.foundation.g.f.f.c cVar) {
        this.f10062b = null;
        this.f10061a = t10;
        this.f10063c = cVar;
    }

    private boolean a() {
        return this.f10062b == null;
    }

    public static <T> k<T> a(T t10, com.anythink.expressad.foundation.g.f.f.c cVar) {
        return new k<>(t10, cVar);
    }

    public static <T> k<T> a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        return new k<>(aVar);
    }

    private k(com.anythink.expressad.foundation.g.f.a.a aVar) {
        this.f10061a = null;
        this.f10063c = null;
        this.f10062b = aVar;
    }
}
