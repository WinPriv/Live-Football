package s7;

import android.util.Log;
import com.applovin.exoplayer2.b.d0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes2.dex */
public final class j implements c, u7.a {

    /* renamed from: g, reason: collision with root package name */
    public static final h f35230g = new h(0);

    /* renamed from: d, reason: collision with root package name */
    public final n f35234d;
    public final f f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f35231a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f35232b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f35233c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<Boolean> f35235e = new AtomicReference<>();

    public j(Executor executor, ArrayList arrayList, ArrayList arrayList2, f fVar) {
        n nVar = new n(executor);
        this.f35234d = nVar;
        this.f = fVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(nVar, n.class, z7.d.class, z7.c.class));
        arrayList3.add(b.b(this, u7.a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((c8.a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f.b(componentRegistrar));
                        it3.remove();
                    }
                } catch (o e10) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f35231a.isEmpty()) {
                k.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f35231a.keySet());
                arrayList6.addAll(arrayList3);
                k.a(arrayList6);
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                final b bVar2 = (b) it4.next();
                this.f35231a.put(bVar2, new p(new c8.a() { // from class: s7.g
                    @Override // c8.a
                    public final Object get() {
                        j jVar = j.this;
                        jVar.getClass();
                        b bVar3 = bVar2;
                        return bVar3.f.d(new v(bVar3, jVar));
                    }
                }));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.f35235e.get();
        if (bool != null) {
            g(this.f35231a, bool.booleanValue());
        }
    }

    @Override // s7.c
    public final synchronized <T> c8.a<T> c(u<T> uVar) {
        if (uVar != null) {
        } else {
            throw new NullPointerException("Null interface requested.");
        }
        return (c8.a) this.f35232b.get(uVar);
    }

    @Override // s7.c
    public final synchronized <T> c8.a<Set<T>> f(u<T> uVar) {
        q qVar = (q) this.f35233c.get(uVar);
        if (qVar != null) {
            return qVar;
        }
        return f35230g;
    }

    public final void g(Map<b<?>, c8.a<?>> map, boolean z10) {
        ArrayDeque<z7.a> arrayDeque;
        Set<Map.Entry> entrySet;
        boolean z11;
        for (Map.Entry<b<?>, c8.a<?>> entry : map.entrySet()) {
            b<?> key = entry.getKey();
            c8.a<?> value = entry.getValue();
            int i10 = key.f35215d;
            boolean z12 = false;
            if (i10 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (i10 == 2) {
                    z12 = true;
                }
                if (z12 && z10) {
                }
            }
            value.get();
        }
        n nVar = this.f35234d;
        synchronized (nVar) {
            try {
                arrayDeque = nVar.f35246b;
                if (arrayDeque != null) {
                    nVar.f35246b = null;
                } else {
                    arrayDeque = null;
                }
            } finally {
            }
        }
        if (arrayDeque != null) {
            for (z7.a aVar : arrayDeque) {
                aVar.getClass();
                synchronized (nVar) {
                    ArrayDeque arrayDeque2 = nVar.f35246b;
                    if (arrayDeque2 != null) {
                        arrayDeque2.add(aVar);
                    } else {
                        synchronized (nVar) {
                            Map map2 = (Map) nVar.f35245a.get(null);
                            if (map2 == null) {
                                entrySet = Collections.emptySet();
                            } else {
                                entrySet = map2.entrySet();
                            }
                        }
                        for (Map.Entry entry2 : entrySet) {
                            ((Executor) entry2.getValue()).execute(new d0(12, entry2, aVar));
                        }
                    }
                }
            }
        }
    }

    public final void h() {
        boolean z10;
        boolean z11;
        for (b bVar : this.f35231a.keySet()) {
            for (l lVar : bVar.f35214c) {
                boolean z12 = true;
                if (lVar.f35242b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u<?> uVar = lVar.f35241a;
                if (z10) {
                    HashMap hashMap = this.f35233c;
                    if (!hashMap.containsKey(uVar)) {
                        hashMap.put(uVar, new q(Collections.emptySet()));
                    }
                }
                HashMap hashMap2 = this.f35232b;
                if (hashMap2.containsKey(uVar)) {
                    continue;
                } else {
                    int i10 = lVar.f35242b;
                    if (i10 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (i10 != 2) {
                            z12 = false;
                        }
                        if (!z12) {
                            hashMap2.put(uVar, new t());
                        }
                    } else {
                        throw new r(String.format("Unsatisfied dependency for component %s: %s", bVar, uVar));
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f35216e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c8.a aVar = (c8.a) this.f35231a.get(bVar);
                Iterator it2 = bVar.f35213b.iterator();
                while (it2.hasNext()) {
                    u uVar = (u) it2.next();
                    HashMap hashMap = this.f35232b;
                    if (!hashMap.containsKey(uVar)) {
                        hashMap.put(uVar, aVar);
                    } else {
                        arrayList2.add(new androidx.appcompat.app.p(10, (t) ((c8.a) hashMap.get(uVar)), aVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f35231a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f35216e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                c8.a aVar = (c8.a) entry.getValue();
                Iterator it = bVar.f35213b.iterator();
                while (it.hasNext()) {
                    u uVar = (u) it.next();
                    if (!hashMap.containsKey(uVar)) {
                        hashMap.put(uVar, new HashSet());
                    }
                    ((Set) hashMap.get(uVar)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f35233c;
            if (!hashMap2.containsKey(key)) {
                hashMap2.put((u) entry2.getKey(), new q((Set) ((Collection) entry2.getValue())));
            } else {
                q qVar = (q) hashMap2.get(entry2.getKey());
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new d0(11, qVar, (c8.a) it2.next()));
                }
            }
        }
        return arrayList;
    }
}
