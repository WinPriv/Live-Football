package com.anythink.expressad.exoplayer.j;

import android.net.Uri;
import com.anythink.expressad.exoplayer.j.t;
import com.anythink.expressad.exoplayer.k.af;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class v<T> implements t.c {

    /* renamed from: a, reason: collision with root package name */
    public final k f8929a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8930b;

    /* renamed from: c, reason: collision with root package name */
    private final h f8931c;

    /* renamed from: d, reason: collision with root package name */
    private final a<? extends T> f8932d;

    /* renamed from: e, reason: collision with root package name */
    private volatile T f8933e;
    private volatile long f;

    /* loaded from: classes.dex */
    public interface a<T> {
        T a();
    }

    private v(h hVar, Uri uri, a<? extends T> aVar) {
        this(hVar, new k(uri, 3), aVar);
    }

    private T c() {
        return this.f8933e;
    }

    private long d() {
        return this.f;
    }

    @Override // com.anythink.expressad.exoplayer.j.t.c
    public final void a() {
    }

    @Override // com.anythink.expressad.exoplayer.j.t.c
    public final void b() {
        j jVar = new j(this.f8931c, this.f8929a);
        try {
            jVar.b();
            a<? extends T> aVar = this.f8932d;
            this.f8931c.a();
            this.f8933e = aVar.a();
        } finally {
            this.f = jVar.a();
            af.a((Closeable) jVar);
        }
    }

    private v(h hVar, k kVar, a<? extends T> aVar) {
        this.f8931c = hVar;
        this.f8929a = kVar;
        this.f8930b = 0;
        this.f8932d = aVar;
    }

    private static <T> T a(h hVar, a<? extends T> aVar, Uri uri) {
        v vVar = new v(hVar, uri, aVar);
        vVar.b();
        return vVar.f8933e;
    }
}
