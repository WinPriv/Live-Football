package com.bumptech.glide;

import androidx.transition.t;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import e3.p;
import e3.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m3.d;
import o3.c;
import o3.d;
import u3.a;

/* compiled from: Registry.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final e3.p f19740a;

    /* renamed from: b, reason: collision with root package name */
    public final o3.a f19741b;

    /* renamed from: c, reason: collision with root package name */
    public final o3.c f19742c;

    /* renamed from: d, reason: collision with root package name */
    public final o3.d f19743d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f19744e;
    public final m3.d f;

    /* renamed from: g, reason: collision with root package name */
    public final t f19745g;

    /* renamed from: h, reason: collision with root package name */
    public final j1.a f19746h = new j1.a(3);

    /* renamed from: i, reason: collision with root package name */
    public final o3.b f19747i = new o3.b();

    /* renamed from: j, reason: collision with root package name */
    public final a.c f19748j;

    /* compiled from: Registry.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: classes.dex */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m10, List<e3.n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: classes.dex */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: classes.dex */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public k() {
        a.c cVar = new a.c(new m0.e(20), new u3.b(), new u3.c());
        this.f19748j = cVar;
        this.f19740a = new e3.p(cVar);
        this.f19741b = new o3.a();
        this.f19742c = new o3.c();
        this.f19743d = new o3.d();
        this.f19744e = new com.bumptech.glide.load.data.f();
        this.f = new m3.d();
        this.f19745g = new t(2);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        o3.c cVar2 = this.f19742c;
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.f33603a);
            cVar2.f33603a.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                cVar2.f33603a.add((String) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (!arrayList.contains(str)) {
                    cVar2.f33603a.add(str);
                }
            }
        }
    }

    public final void a(Class cls, Class cls2, e3.o oVar) {
        e3.p pVar = this.f19740a;
        synchronized (pVar) {
            r rVar = pVar.f27706a;
            synchronized (rVar) {
                r.b bVar = new r.b(cls, cls2, oVar);
                ArrayList arrayList = rVar.f27719a;
                arrayList.add(arrayList.size(), bVar);
            }
            pVar.f27707b.f27708a.clear();
        }
    }

    public final void b(Class cls, y2.j jVar) {
        o3.d dVar = this.f19743d;
        synchronized (dVar) {
            dVar.f33608a.add(new d.a(cls, jVar));
        }
    }

    public final void c(y2.i iVar, Class cls, Class cls2, String str) {
        o3.c cVar = this.f19742c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a<>(cls, cls2, iVar));
        }
    }

    public final List<ImageHeaderParser> d() {
        List<ImageHeaderParser> list;
        t tVar = this.f19745g;
        synchronized (tVar) {
            list = (List) tVar.f2495s;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new b();
    }

    public final <Model> List<e3.n<Model, ?>> e(Model model) {
        List<e3.n<Model, ?>> list;
        e3.p pVar = this.f19740a;
        pVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0370a c0370a = (p.a.C0370a) pVar.f27707b.f27708a.get(cls);
            if (c0370a == null) {
                list = null;
            } else {
                list = c0370a.f27709a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f27706a.c(cls));
                if (((p.a.C0370a) pVar.f27707b.f27708a.put(cls, new p.a.C0370a(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<e3.n<Model, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                e3.n<Model, ?> nVar = list.get(i10);
                if (nVar.a(model)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i10);
                        z10 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(model, list);
        }
        throw new c(model);
    }

    public final <X> com.bumptech.glide.load.data.e<X> f(X x10) {
        com.bumptech.glide.load.data.e<X> b10;
        com.bumptech.glide.load.data.f fVar = this.f19744e;
        synchronized (fVar) {
            androidx.activity.n.n0(x10);
            e.a aVar = (e.a) fVar.f19764a.get(x10.getClass());
            if (aVar == null) {
                Iterator it = fVar.f19764a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(x10.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = com.bumptech.glide.load.data.f.f19763b;
            }
            b10 = aVar.b(x10);
        }
        return b10;
    }

    public final void g(e.a aVar) {
        com.bumptech.glide.load.data.f fVar = this.f19744e;
        synchronized (fVar) {
            fVar.f19764a.put(aVar.a(), aVar);
        }
    }

    public final void h(Class cls, Class cls2, m3.c cVar) {
        m3.d dVar = this.f;
        synchronized (dVar) {
            dVar.f32662a.add(new d.a(cls, cls2, cVar));
        }
    }
}
