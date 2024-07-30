package e3;

import com.bumptech.glide.k;
import e3.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import u3.a;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final c f27718e = new c();
    public static final a f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f27719a;

    /* renamed from: b, reason: collision with root package name */
    public final c f27720b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f27721c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.d<List<Throwable>> f27722d;

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class a implements n<Object, Object> {
        @Override // e3.n
        public final boolean a(Object obj) {
            return false;
        }

        @Override // e3.n
        public final n.a<Object> b(Object obj, int i10, int i11, y2.g gVar) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<Model> f27723a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<Data> f27724b;

        /* renamed from: c, reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f27725c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f27723a = cls;
            this.f27724b = cls2;
            this.f27725c = oVar;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    public r(a.c cVar) {
        c cVar2 = f27718e;
        this.f27719a = new ArrayList();
        this.f27721c = new HashSet();
        this.f27722d = cVar;
        this.f27720b = cVar2;
    }

    public final <Model, Data> n<Model, Data> a(b<?, ?> bVar) {
        n<Model, Data> nVar = (n<Model, Data>) bVar.f27725c.a(this);
        androidx.activity.n.n0(nVar);
        return nVar;
    }

    public final synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f27719a.iterator();
            boolean z10 = false;
            while (true) {
                boolean z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                b<?, ?> bVar = (b) it.next();
                if (this.f27721c.contains(bVar)) {
                    z10 = true;
                } else {
                    if (!bVar.f27723a.isAssignableFrom(cls) || !bVar.f27724b.isAssignableFrom(cls2)) {
                        z11 = false;
                    }
                    if (z11) {
                        this.f27721c.add(bVar);
                        arrayList.add(a(bVar));
                        this.f27721c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f27720b;
                m0.d<List<Throwable>> dVar = this.f27722d;
                cVar.getClass();
                return new q(arrayList, dVar);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (z10) {
                return f;
            }
            throw new k.c((Class<?>) cls, (Class<?>) cls2);
        } catch (Throwable th) {
            this.f27721c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f27719a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f27721c.contains(bVar) && bVar.f27723a.isAssignableFrom(cls)) {
                    this.f27721c.add(bVar);
                    n a10 = bVar.f27725c.a(this);
                    androidx.activity.n.n0(a10);
                    arrayList.add(a10);
                    this.f27721c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f27721c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f27719a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f27724b) && bVar.f27723a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f27724b);
            }
        }
        return arrayList;
    }
}
