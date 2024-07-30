package com.anythink.expressad.foundation.g.f.f;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f9984a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.anythink.expressad.foundation.g.f.c.c> f9985b;

    /* renamed from: c, reason: collision with root package name */
    private final InputStream f9986c;

    public b(int i10, List<com.anythink.expressad.foundation.g.f.c.c> list) {
        this(i10, list, null);
    }

    public final int a() {
        return this.f9984a;
    }

    public final List<com.anythink.expressad.foundation.g.f.c.c> b() {
        return Collections.unmodifiableList(this.f9985b);
    }

    public final InputStream c() {
        return this.f9986c;
    }

    public b(int i10, List<com.anythink.expressad.foundation.g.f.c.c> list, InputStream inputStream) {
        this.f9984a = i10;
        this.f9985b = list;
        this.f9986c = inputStream;
    }
}
