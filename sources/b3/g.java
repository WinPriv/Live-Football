package b3;

import b3.l;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: GroupedLinkedMap.java */
/* loaded from: classes.dex */
public final class g<K extends l, V> {

    /* renamed from: a, reason: collision with root package name */
    public final a<K, V> f2859a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2860b = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f2861a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f2862b;

        /* renamed from: c, reason: collision with root package name */
        public a<K, V> f2863c;

        /* renamed from: d, reason: collision with root package name */
        public a<K, V> f2864d;

        public a() {
            this(null);
        }

        public a(K k10) {
            this.f2864d = this;
            this.f2863c = this;
            this.f2861a = k10;
        }
    }

    public final V a(K k10) {
        a aVar;
        int i10;
        HashMap hashMap = this.f2860b;
        a aVar2 = (a) hashMap.get(k10);
        if (aVar2 == null) {
            a aVar3 = new a(k10);
            hashMap.put(k10, aVar3);
            aVar = aVar3;
        } else {
            k10.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.f2864d;
        aVar4.f2863c = aVar.f2863c;
        aVar.f2863c.f2864d = aVar4;
        a<K, V> aVar5 = this.f2859a;
        aVar.f2864d = aVar5;
        a<K, V> aVar6 = aVar5.f2863c;
        aVar.f2863c = aVar6;
        aVar6.f2864d = aVar;
        aVar.f2864d.f2863c = aVar;
        ArrayList arrayList = aVar.f2862b;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return (V) aVar.f2862b.remove(i10 - 1);
        }
        return null;
    }

    public final void b(K k10, V v3) {
        HashMap hashMap = this.f2860b;
        a aVar = (a) hashMap.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            a<K, V> aVar2 = aVar.f2864d;
            aVar2.f2863c = aVar.f2863c;
            aVar.f2863c.f2864d = aVar2;
            a<K, V> aVar3 = this.f2859a;
            aVar.f2864d = aVar3.f2864d;
            aVar.f2863c = aVar3;
            aVar3.f2864d = aVar;
            aVar.f2864d.f2863c = aVar;
            hashMap.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f2862b == null) {
            aVar.f2862b = new ArrayList();
        }
        aVar.f2862b.add(v3);
    }

    public final V c() {
        int i10;
        a<K, V> aVar = this.f2859a;
        a aVar2 = aVar.f2864d;
        while (true) {
            V v3 = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.f2862b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                v3 = (V) aVar2.f2862b.remove(i10 - 1);
            }
            if (v3 != null) {
                return v3;
            }
            a<K, V> aVar3 = aVar2.f2864d;
            aVar3.f2863c = aVar2.f2863c;
            aVar2.f2863c.f2864d = aVar3;
            HashMap hashMap = this.f2860b;
            Object obj = aVar2.f2861a;
            hashMap.remove(obj);
            ((l) obj).a();
            aVar2 = aVar2.f2864d;
        }
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f2859a;
        a aVar2 = aVar.f2863c;
        boolean z10 = false;
        while (!aVar2.equals(aVar)) {
            sb2.append('{');
            sb2.append(aVar2.f2861a);
            sb2.append(':');
            ArrayList arrayList = aVar2.f2862b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            sb2.append(i10);
            sb2.append("}, ");
            aVar2 = aVar2.f2863c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
