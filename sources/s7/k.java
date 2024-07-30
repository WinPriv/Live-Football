package s7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* loaded from: classes2.dex */
public final class k {

    /* compiled from: CycleDetector.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final s7.b<?> f35236a;

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f35237b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f35238c = new HashSet();

        public a(s7.b<?> bVar) {
            this.f35236a = bVar;
        }
    }

    /* compiled from: CycleDetector.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final u<?> f35239a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35240b;

        public b() {
            throw null;
        }

        public b(u uVar, boolean z10) {
            this.f35239a = uVar;
            this.f35240b = z10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.f35239a.equals(this.f35239a) || bVar.f35240b != this.f35240b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return ((this.f35239a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f35240b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        boolean z12;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (it.hasNext()) {
                s7.b bVar = (s7.b) it.next();
                a aVar = new a(bVar);
                Iterator it2 = bVar.f35213b.iterator();
                while (it2.hasNext()) {
                    u uVar = (u) it2.next();
                    if (bVar.f35216e == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z13 = !z12;
                    b bVar2 = new b(uVar, z13);
                    if (!hashMap.containsKey(bVar2)) {
                        hashMap.put(bVar2, new HashSet());
                    }
                    Set set = (Set) hashMap.get(bVar2);
                    if (!set.isEmpty() && !z13) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", uVar));
                    }
                    set.add(aVar);
                }
            } else {
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    for (a aVar2 : (Set) it3.next()) {
                        for (l lVar : aVar2.f35236a.f35214c) {
                            if (lVar.f35243c == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (lVar.f35242b == 2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                Set<a> set2 = (Set) hashMap.get(new b(lVar.f35241a, z11));
                                if (set2 != null) {
                                    for (a aVar3 : set2) {
                                        aVar2.f35237b.add(aVar3);
                                        aVar3.f35238c.add(aVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it4 = hashMap.values().iterator();
                while (it4.hasNext()) {
                    hashSet.addAll((Set) it4.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it5 = hashSet.iterator();
                while (it5.hasNext()) {
                    a aVar4 = (a) it5.next();
                    if (aVar4.f35238c.isEmpty()) {
                        hashSet2.add(aVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar5 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar5);
                    i10++;
                    Iterator it6 = aVar5.f35237b.iterator();
                    while (it6.hasNext()) {
                        a aVar6 = (a) it6.next();
                        aVar6.f35238c.remove(aVar5);
                        if (aVar6.f35238c.isEmpty()) {
                            hashSet2.add(aVar6);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it7 = hashSet.iterator();
                while (it7.hasNext()) {
                    a aVar7 = (a) it7.next();
                    if (!aVar7.f35238c.isEmpty() && !aVar7.f35237b.isEmpty()) {
                        arrayList2.add(aVar7.f35236a);
                    }
                }
                throw new m(arrayList2);
            }
        }
    }
}
