package a3;

import a3.j;
import e3.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m3.d;
import o3.c;

/* compiled from: DecodeHelper.java */
/* loaded from: classes.dex */
public final class i<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f118a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f119b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.h f120c;

    /* renamed from: d, reason: collision with root package name */
    public Object f121d;

    /* renamed from: e, reason: collision with root package name */
    public int f122e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public Class<?> f123g;

    /* renamed from: h, reason: collision with root package name */
    public j.d f124h;

    /* renamed from: i, reason: collision with root package name */
    public y2.g f125i;

    /* renamed from: j, reason: collision with root package name */
    public Map<Class<?>, y2.k<?>> f126j;

    /* renamed from: k, reason: collision with root package name */
    public Class<Transcode> f127k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f128l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f129m;

    /* renamed from: n, reason: collision with root package name */
    public y2.e f130n;
    public com.bumptech.glide.j o;

    /* renamed from: p, reason: collision with root package name */
    public n f131p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f132q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f133r;

    public final ArrayList a() {
        boolean z10 = this.f129m;
        ArrayList arrayList = this.f119b;
        if (!z10) {
            this.f129m = true;
            arrayList.clear();
            ArrayList b10 = b();
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) b10.get(i10);
                if (!arrayList.contains(aVar.f27703a)) {
                    arrayList.add(aVar.f27703a);
                }
                int i11 = 0;
                while (true) {
                    List<y2.e> list = aVar.f27704b;
                    if (i11 < list.size()) {
                        if (!arrayList.contains(list.get(i11))) {
                            arrayList.add(list.get(i11));
                        }
                        i11++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z10 = this.f128l;
        ArrayList arrayList = this.f118a;
        if (!z10) {
            this.f128l = true;
            arrayList.clear();
            List e10 = this.f120c.a().e(this.f121d);
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a b10 = ((e3.n) e10.get(i10)).b(this.f121d, this.f122e, this.f, this.f125i);
                if (b10 != null) {
                    arrayList.add(b10);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data> v<Data, ?, Transcode> c(Class<Data> cls) {
        v<Data, ?, Transcode> vVar;
        v<Data, ?, Transcode> vVar2;
        Object obj;
        ArrayList arrayList;
        boolean z10;
        m3.c cVar;
        boolean z11;
        com.bumptech.glide.k a10 = this.f120c.a();
        Class<?> cls2 = this.f123g;
        Class cls3 = (Class<Transcode>) this.f127k;
        o3.b bVar = a10.f19747i;
        t3.k andSet = bVar.f33602b.getAndSet(null);
        if (andSet == null) {
            andSet = new t3.k();
        }
        andSet.f35426a = cls;
        andSet.f35427b = cls2;
        andSet.f35428c = cls3;
        synchronized (bVar.f33601a) {
            vVar = (v) bVar.f33601a.getOrDefault(andSet, null);
        }
        bVar.f33602b.set(andSet);
        a10.f19747i.getClass();
        if (o3.b.f33600c.equals(vVar)) {
            return null;
        }
        if (vVar == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = a10.f19742c.b(cls, cls2).iterator();
            while (it.hasNext()) {
                Class<?> cls4 = (Class) it.next();
                Iterator it2 = a10.f.a(cls4, cls3).iterator();
                while (it2.hasNext()) {
                    Class cls5 = (Class) it2.next();
                    o3.c cVar2 = a10.f19742c;
                    synchronized (cVar2) {
                        arrayList = new ArrayList();
                        Iterator it3 = cVar2.f33603a.iterator();
                        while (it3.hasNext()) {
                            List<c.a> list = (List) cVar2.f33604b.get((String) it3.next());
                            if (list != null) {
                                for (c.a aVar : list) {
                                    if (aVar.f33605a.isAssignableFrom(cls) && cls4.isAssignableFrom(aVar.f33606b)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList.add(aVar.f33607c);
                                    }
                                }
                            }
                        }
                    }
                    m3.d dVar = a10.f;
                    synchronized (dVar) {
                        if (cls5.isAssignableFrom(cls4)) {
                            cVar = a0.a.H0;
                        } else {
                            Iterator it4 = dVar.f32662a.iterator();
                            while (it4.hasNext()) {
                                d.a aVar2 = (d.a) it4.next();
                                if (aVar2.f32663a.isAssignableFrom(cls4) && cls5.isAssignableFrom(aVar2.f32664b)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    cVar = aVar2.f32665c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                        }
                    }
                    arrayList2.add(new m(cls, cls4, cls5, arrayList, cVar, a10.f19748j));
                }
            }
            if (arrayList2.isEmpty()) {
                vVar2 = null;
            } else {
                vVar2 = new v<>(cls, cls2, cls3, arrayList2, a10.f19748j);
            }
            o3.b bVar2 = a10.f19747i;
            synchronized (bVar2.f33601a) {
                q.i iVar = bVar2.f33601a;
                t3.k kVar = new t3.k(cls, cls2, cls3);
                if (vVar2 != null) {
                    obj = vVar2;
                } else {
                    obj = o3.b.f33600c;
                }
                iVar.put(kVar, obj);
            }
            return vVar2;
        }
        return vVar;
    }

    public final List<Class<?>> d() {
        List<Class<?>> list;
        ArrayList d10;
        com.bumptech.glide.k a10 = this.f120c.a();
        Class<?> cls = this.f121d.getClass();
        Class<?> cls2 = this.f123g;
        Class cls3 = this.f127k;
        j1.a aVar = a10.f19746h;
        t3.k kVar = (t3.k) ((AtomicReference) aVar.f29568t).getAndSet(null);
        if (kVar == null) {
            kVar = new t3.k(cls, cls2, cls3);
        } else {
            kVar.f35426a = cls;
            kVar.f35427b = cls2;
            kVar.f35428c = cls3;
        }
        synchronized (((q.b) aVar.f29569u)) {
            list = (List) ((q.b) aVar.f29569u).getOrDefault(kVar, null);
        }
        ((AtomicReference) aVar.f29568t).set(kVar);
        List<Class<?>> list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            e3.p pVar = a10.f19740a;
            synchronized (pVar) {
                d10 = pVar.f27706a.d(cls);
            }
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                Iterator it2 = a10.f19742c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!a10.f.a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            j1.a aVar2 = a10.f19746h;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((q.b) aVar2.f29569u)) {
                ((q.b) aVar2.f29569u).put(new t3.k(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList;
        }
        return list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = (y2.d<X>) r3.f33599b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <X> y2.d<X> e(X r6) throws com.bumptech.glide.k.e {
        /*
            r5 = this;
            com.bumptech.glide.h r0 = r5.f120c
            com.bumptech.glide.k r0 = r0.a()
            o3.a r0 = r0.f19741b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f33597a     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3a
            o3.a$a r3 = (o3.a.C0447a) r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<T> r4 = r3.f33598a     // Catch: java.lang.Throwable -> L3a
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L13
            y2.d<T> r1 = r3.f33599b     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            goto L2d
        L2b:
            monitor-exit(r0)
            r1 = 0
        L2d:
            if (r1 == 0) goto L30
            return r1
        L30:
            com.bumptech.glide.k$e r0 = new com.bumptech.glide.k$e
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L3a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.i.e(java.lang.Object):y2.d");
    }

    public final <Z> y2.k<Z> f(Class<Z> cls) {
        y2.k<Z> kVar = (y2.k) this.f126j.get(cls);
        if (kVar == null) {
            Iterator<Map.Entry<Class<?>, y2.k<?>>> it = this.f126j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, y2.k<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    kVar = (y2.k) next.getValue();
                    break;
                }
            }
        }
        if (kVar == null) {
            if (this.f126j.isEmpty() && this.f132q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return g3.b.f28478b;
        }
        return kVar;
    }
}
