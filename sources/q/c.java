package q;

import java.util.Map;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class c extends h<Object, Object> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f34507d;

    public c(d dVar) {
        this.f34507d = dVar;
    }

    @Override // q.h
    public final void a() {
        this.f34507d.clear();
    }

    @Override // q.h
    public final Object b(int i10, int i11) {
        return this.f34507d.f34512t[i10];
    }

    @Override // q.h
    public final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // q.h
    public final int d() {
        return this.f34507d.f34513u;
    }

    @Override // q.h
    public final int e(Object obj) {
        return this.f34507d.indexOf(obj);
    }

    @Override // q.h
    public final int f(Object obj) {
        return this.f34507d.indexOf(obj);
    }

    @Override // q.h
    public final void g(Object obj, Object obj2) {
        this.f34507d.add(obj);
    }

    @Override // q.h
    public final void h(int i10) {
        this.f34507d.e(i10);
    }

    @Override // q.h
    public final Object i(int i10, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
