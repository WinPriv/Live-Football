package j7;

import j7.g0;
import j7.j0;
import j7.n2;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: SparseImmutableTable.java */
/* loaded from: classes2.dex */
public final class j2<R, C, V> extends z1<R, C, V> {

    /* renamed from: x, reason: collision with root package name */
    public static final j2 f30012x;

    /* renamed from: u, reason: collision with root package name */
    public final w1 f30013u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f30014v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f30015w;

    static {
        j0.b bVar = j0.f30006t;
        v1 v1Var = v1.f30113w;
        int i10 = t0.f30101u;
        x1<Object> x1Var = x1.B;
        f30012x = new j2(v1Var, x1Var, x1Var);
    }

    public j2(j0<n2.a<R, C, V>> j0Var, t0<R> t0Var, t0<C> t0Var2) {
        w1 b10 = m1.b(t0Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t2<R> it = t0Var.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        t2<C> it2 = t0Var2.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[j0Var.size()];
        int[] iArr2 = new int[j0Var.size()];
        int i10 = 0;
        for (int i11 = 0; i11 < j0Var.size(); i11++) {
            n2.a<R, C, V> aVar = j0Var.get(i11);
            R p10 = aVar.p();
            C k10 = aVar.k();
            V value = aVar.getValue();
            Integer num = (Integer) b10.get(p10);
            Objects.requireNonNull(num);
            iArr[i11] = num.intValue();
            Map map = (Map) linkedHashMap.get(p10);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i11] = map2.size();
            z1.G(p10, k10, map2.put(k10, value), value);
            Map map3 = (Map) linkedHashMap2.get(k10);
            Objects.requireNonNull(map3);
            map3.put(p10, value);
        }
        this.f30014v = iArr;
        this.f30015w = iArr2;
        Object[] objArr = new Object[linkedHashMap.size() * 2];
        int i12 = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            m0 a10 = m0.a((Map) entry.getValue());
            int i13 = i12 + 1;
            int i14 = i13 * 2;
            if (i14 > objArr.length) {
                objArr = Arrays.copyOf(objArr, g0.b.a(objArr.length, i14));
            }
            r.x(key, a10);
            int i15 = i12 * 2;
            objArr[i15] = key;
            objArr[i15 + 1] = a10;
            i12 = i13;
        }
        this.f30013u = w1.y(i12, objArr);
        Object[] objArr2 = new Object[linkedHashMap2.size() * 2];
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key2 = entry2.getKey();
            m0 a11 = m0.a((Map) entry2.getValue());
            int i16 = i10 + 1;
            int i17 = i16 * 2;
            if (i17 > objArr2.length) {
                objArr2 = Arrays.copyOf(objArr2, g0.b.a(objArr2.length, i17));
            }
            r.x(key2, a11);
            int i18 = i10 * 2;
            objArr2[i18] = key2;
            objArr2[i18 + 1] = a11;
            i10 = i16;
        }
        w1.y(i10, objArr2);
    }

    @Override // j7.w0
    /* renamed from: E */
    public final m0<R, Map<C, V>> p() {
        return m0.a(this.f30013u);
    }

    @Override // j7.z1
    public final p2 H(int i10) {
        Map.Entry entry = (Map.Entry) this.f30013u.entrySet().p().get(this.f30014v[i10]);
        m0 m0Var = (m0) entry.getValue();
        Map.Entry entry2 = (Map.Entry) m0Var.entrySet().p().get(this.f30015w[i10]);
        return w0.w(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // j7.z1
    public final V I(int i10) {
        m0 m0Var = (m0) this.f30013u.values().p().get(this.f30014v[i10]);
        return m0Var.values().p().get(this.f30015w[i10]);
    }

    @Override // j7.n2
    public final int size() {
        return this.f30014v.length;
    }
}
