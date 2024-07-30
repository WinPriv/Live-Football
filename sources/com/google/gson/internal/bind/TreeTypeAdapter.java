package com.google.gson.internal.bind;

import java.io.IOException;
import m8.a0;
import m8.b0;
import m8.i;
import m8.m;
import m8.n;
import m8.p;
import m8.t;
import o8.u;

/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final t<T> f21358a;

    /* renamed from: b, reason: collision with root package name */
    public final m<T> f21359b;

    /* renamed from: c, reason: collision with root package name */
    public final i f21360c;

    /* renamed from: d, reason: collision with root package name */
    public final r8.a<T> f21361d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f21362e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public volatile a0<T> f21363g;

    /* loaded from: classes2.dex */
    public static final class SingleTypeFactory implements b0 {
        @Override // m8.b0
        public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
            aVar.getRawType();
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public final class a {
    }

    public TreeTypeAdapter(t tVar, m mVar, i iVar, r8.a aVar, boolean z10) {
        new a();
        this.f21358a = tVar;
        this.f21359b = mVar;
        this.f21360c = iVar;
        this.f21361d = aVar;
        this.f21362e = null;
        this.f = z10;
    }

    @Override // m8.a0
    public final T a(s8.a aVar) throws IOException {
        m<T> mVar = this.f21359b;
        if (mVar == null) {
            return d().a(aVar);
        }
        n b10 = u.b(aVar);
        if (this.f) {
            b10.getClass();
            if (b10 instanceof p) {
                return null;
            }
        }
        this.f21361d.getType();
        return (T) mVar.a();
    }

    @Override // m8.a0
    public final void b(s8.b bVar, T t10) throws IOException {
        t<T> tVar = this.f21358a;
        if (tVar == null) {
            d().b(bVar, t10);
            return;
        }
        if (this.f && t10 == null) {
            bVar.j();
            return;
        }
        this.f21361d.getType();
        TypeAdapters.f21386z.b(bVar, tVar.a());
    }

    @Override // com.google.gson.internal.bind.g
    public final a0<T> c() {
        if (this.f21358a != null) {
            return this;
        }
        return d();
    }

    public final a0<T> d() {
        a0<T> a0Var = this.f21363g;
        if (a0Var == null) {
            a0<T> h10 = this.f21360c.h(this.f21362e, this.f21361d);
            this.f21363g = h10;
            return h10;
        }
        return a0Var;
    }
}
