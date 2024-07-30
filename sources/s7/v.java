package s7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k4.h0;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes2.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Set<u<?>> f35260a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<u<?>> f35261b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<u<?>> f35262c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<u<?>> f35263d;

    /* renamed from: e, reason: collision with root package name */
    public final c f35264e;

    /* compiled from: RestrictedComponentContainer.java */
    /* loaded from: classes2.dex */
    public static class a implements z7.c {

        /* renamed from: a, reason: collision with root package name */
        public final z7.c f35265a;

        public a(z7.c cVar) {
            this.f35265a = cVar;
        }
    }

    public v(b bVar, j jVar) {
        boolean z10;
        boolean z11;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (l lVar : bVar.f35214c) {
            int i10 = lVar.f35243c;
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = lVar.f35242b;
            u<?> uVar = lVar.f35241a;
            if (z10) {
                if (i11 == 2) {
                    hashSet4.add(uVar);
                } else {
                    hashSet.add(uVar);
                }
            } else {
                if (i10 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    hashSet3.add(uVar);
                } else if (i11 == 2) {
                    hashSet5.add(uVar);
                } else {
                    hashSet2.add(uVar);
                }
            }
        }
        if (!bVar.f35217g.isEmpty()) {
            hashSet.add(u.a(z7.c.class));
        }
        this.f35260a = Collections.unmodifiableSet(hashSet);
        this.f35261b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f35262c = Collections.unmodifiableSet(hashSet4);
        this.f35263d = Collections.unmodifiableSet(hashSet5);
        this.f35264e = jVar;
    }

    @Override // s7.c
    public final <T> T a(Class<T> cls) {
        if (this.f35260a.contains(u.a(cls))) {
            T t10 = (T) this.f35264e.a(cls);
            if (!cls.equals(z7.c.class)) {
                return t10;
            }
            return (T) new a((z7.c) t10);
        }
        throw new h0(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // s7.c
    public final <T> c8.a<T> b(Class<T> cls) {
        return c(u.a(cls));
    }

    @Override // s7.c
    public final <T> c8.a<T> c(u<T> uVar) {
        if (this.f35261b.contains(uVar)) {
            return this.f35264e.c(uVar);
        }
        throw new h0(String.format("Attempting to request an undeclared dependency Provider<%s>.", uVar));
    }

    @Override // s7.c
    public final <T> T d(u<T> uVar) {
        if (this.f35260a.contains(uVar)) {
            return (T) this.f35264e.d(uVar);
        }
        throw new h0(String.format("Attempting to request an undeclared dependency %s.", uVar));
    }

    @Override // s7.c
    public final <T> Set<T> e(u<T> uVar) {
        if (this.f35262c.contains(uVar)) {
            return this.f35264e.e(uVar);
        }
        throw new h0(String.format("Attempting to request an undeclared dependency Set<%s>.", uVar));
    }

    @Override // s7.c
    public final <T> c8.a<Set<T>> f(u<T> uVar) {
        if (this.f35263d.contains(uVar)) {
            return this.f35264e.f(uVar);
        }
        throw new h0(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", uVar));
    }
}
