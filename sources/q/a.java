package q;

import java.util.Map;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public final class a extends h<Object, Object> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f34505d;

    public a(b bVar) {
        this.f34505d = bVar;
    }

    @Override // q.h
    public final void a() {
        this.f34505d.clear();
    }

    @Override // q.h
    public final Object b(int i10, int i11) {
        return this.f34505d.f34546t[(i10 << 1) + i11];
    }

    @Override // q.h
    public final Map<Object, Object> c() {
        return this.f34505d;
    }

    @Override // q.h
    public final int d() {
        return this.f34505d.f34547u;
    }

    @Override // q.h
    public final int e(Object obj) {
        return this.f34505d.e(obj);
    }

    @Override // q.h
    public final int f(Object obj) {
        return this.f34505d.g(obj);
    }

    @Override // q.h
    public final void g(Object obj, Object obj2) {
        this.f34505d.put(obj, obj2);
    }

    @Override // q.h
    public final void h(int i10) {
        this.f34505d.j(i10);
    }

    @Override // q.h
    public final Object i(int i10, Object obj) {
        return this.f34505d.k(i10, obj);
    }
}
