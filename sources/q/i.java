package q;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* loaded from: classes.dex */
public class i<K, V> {

    /* renamed from: v, reason: collision with root package name */
    public static Object[] f34542v;

    /* renamed from: w, reason: collision with root package name */
    public static int f34543w;

    /* renamed from: x, reason: collision with root package name */
    public static Object[] f34544x;
    public static int y;

    /* renamed from: s, reason: collision with root package name */
    public int[] f34545s;

    /* renamed from: t, reason: collision with root package name */
    public Object[] f34546t;

    /* renamed from: u, reason: collision with root package name */
    public int f34547u;

    public i() {
        this.f34545s = e.f34515s;
        this.f34546t = e.f34517u;
        this.f34547u = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (i.class) {
                Object[] objArr = f34544x;
                if (objArr != null) {
                    this.f34546t = objArr;
                    f34544x = (Object[]) objArr[0];
                    this.f34545s = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    y--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (i.class) {
                Object[] objArr2 = f34542v;
                if (objArr2 != null) {
                    this.f34546t = objArr2;
                    f34542v = (Object[]) objArr2[0];
                    this.f34545s = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f34543w--;
                    return;
                }
            }
        }
        this.f34545s = new int[i10];
        this.f34546t = new Object[i10 << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                if (y < 10) {
                    objArr[0] = f34544x;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f34544x = objArr;
                    y++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (i.class) {
                if (f34543w < 10) {
                    objArr[0] = f34542v;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f34542v = objArr;
                    f34543w++;
                }
            }
        }
    }

    public final void b(int i10) {
        int i11 = this.f34547u;
        int[] iArr = this.f34545s;
        if (iArr.length < i10) {
            Object[] objArr = this.f34546t;
            a(i10);
            if (this.f34547u > 0) {
                System.arraycopy(iArr, 0, this.f34545s, 0, i11);
                System.arraycopy(objArr, 0, this.f34546t, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.f34547u == i11) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f34547u;
        if (i10 > 0) {
            int[] iArr = this.f34545s;
            Object[] objArr = this.f34546t;
            this.f34545s = e.f34515s;
            this.f34546t = e.f34517u;
            this.f34547u = 0;
            c(iArr, objArr, i10);
        }
        if (this.f34547u <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        if (e(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(int i10, Object obj) {
        int i11 = this.f34547u;
        if (i11 == 0) {
            return -1;
        }
        try {
            int c10 = e.c(i11, i10, this.f34545s);
            if (c10 < 0) {
                return c10;
            }
            if (obj.equals(this.f34546t[c10 << 1])) {
                return c10;
            }
            int i12 = c10 + 1;
            while (i12 < i11 && this.f34545s[i12] == i10) {
                if (obj.equals(this.f34546t[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = c10 - 1; i13 >= 0 && this.f34545s[i13] == i10; i13--) {
                if (obj.equals(this.f34546t[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        if (obj == null) {
            return f();
        }
        return d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f34547u != iVar.f34547u) {
                return false;
            }
            for (int i10 = 0; i10 < this.f34547u; i10++) {
                try {
                    K h10 = h(i10);
                    V l10 = l(i10);
                    Object orDefault = iVar.getOrDefault(h10, null);
                    if (l10 == null) {
                        if (orDefault != null || !iVar.containsKey(h10)) {
                            return false;
                        }
                    } else if (!l10.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f34547u != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f34547u; i11++) {
                try {
                    K h11 = h(i11);
                    V l11 = l(i11);
                    Object obj2 = map.get(h11);
                    if (l11 == null) {
                        if (obj2 != null || !map.containsKey(h11)) {
                            return false;
                        }
                    } else if (!l11.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i10 = this.f34547u;
        if (i10 == 0) {
            return -1;
        }
        try {
            int c10 = e.c(i10, 0, this.f34545s);
            if (c10 < 0) {
                return c10;
            }
            if (this.f34546t[c10 << 1] == null) {
                return c10;
            }
            int i11 = c10 + 1;
            while (i11 < i10 && this.f34545s[i11] == 0) {
                if (this.f34546t[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = c10 - 1; i12 >= 0 && this.f34545s[i12] == 0; i12--) {
                if (this.f34546t[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(Object obj) {
        int i10 = this.f34547u * 2;
        Object[] objArr = this.f34546t;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v3) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return (V) this.f34546t[(e10 << 1) + 1];
        }
        return v3;
    }

    public final K h(int i10) {
        return (K) this.f34546t[i10 << 1];
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f34545s;
        Object[] objArr = this.f34546t;
        int i10 = this.f34547u;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            int i14 = iArr[i12];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i13 += hashCode ^ i14;
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public void i(b bVar) {
        int i10 = bVar.f34547u;
        b(this.f34547u + i10);
        if (this.f34547u == 0) {
            if (i10 > 0) {
                System.arraycopy(bVar.f34545s, 0, this.f34545s, 0, i10);
                System.arraycopy(bVar.f34546t, 0, this.f34546t, 0, i10 << 1);
                this.f34547u = i10;
                return;
            }
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            put(bVar.h(i11), bVar.l(i11));
        }
    }

    public final boolean isEmpty() {
        if (this.f34547u <= 0) {
            return true;
        }
        return false;
    }

    public V j(int i10) {
        Object[] objArr = this.f34546t;
        int i11 = i10 << 1;
        V v3 = (V) objArr[i11 + 1];
        int i12 = this.f34547u;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f34545s, objArr, i12);
            this.f34545s = e.f34515s;
            this.f34546t = e.f34517u;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f34545s;
            int i15 = 8;
            if (iArr.length > 8 && i12 < iArr.length / 3) {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                a(i15);
                if (i12 == this.f34547u) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f34545s, 0, i10);
                        System.arraycopy(objArr, 0, this.f34546t, 0, i11);
                    }
                    if (i10 < i14) {
                        int i16 = i10 + 1;
                        int i17 = i14 - i10;
                        System.arraycopy(iArr, i16, this.f34545s, i10, i17);
                        System.arraycopy(objArr, i16 << 1, this.f34546t, i11, i17 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, iArr, i10, i19);
                    Object[] objArr2 = this.f34546t;
                    System.arraycopy(objArr2, i18 << 1, objArr2, i11, i19 << 1);
                }
                Object[] objArr3 = this.f34546t;
                int i20 = i14 << 1;
                objArr3[i20] = null;
                objArr3[i20 + 1] = null;
            }
            i13 = i14;
        }
        if (i12 == this.f34547u) {
            this.f34547u = i13;
            return v3;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i10, V v3) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f34546t;
        V v10 = (V) objArr[i11];
        objArr[i11] = v3;
        return v10;
    }

    public final V l(int i10) {
        return (V) this.f34546t[(i10 << 1) + 1];
    }

    public V put(K k10, V v3) {
        int i10;
        int d10;
        int i11 = this.f34547u;
        if (k10 == null) {
            d10 = f();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            d10 = d(hashCode, k10);
        }
        if (d10 >= 0) {
            int i12 = (d10 << 1) + 1;
            Object[] objArr = this.f34546t;
            V v10 = (V) objArr[i12];
            objArr[i12] = v3;
            return v10;
        }
        int i13 = ~d10;
        int[] iArr = this.f34545s;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f34546t;
            a(i14);
            if (i11 == this.f34547u) {
                int[] iArr2 = this.f34545s;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f34546t, 0, objArr2.length);
                }
                c(iArr, objArr2, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr3 = this.f34545s;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f34546t;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f34547u - i13) << 1);
        }
        int i16 = this.f34547u;
        if (i11 == i16) {
            int[] iArr4 = this.f34545s;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f34546t;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v3;
                this.f34547u = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v3) {
        V orDefault = getOrDefault(k10, null);
        if (orDefault == null) {
            return put(k10, v3);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return j(e10);
        }
        return null;
    }

    public final V replace(K k10, V v3) {
        int e10 = e(k10);
        if (e10 >= 0) {
            return k(e10, v3);
        }
        return null;
    }

    public final int size() {
        return this.f34547u;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f34547u * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f34547u; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K h10 = h(i10);
            if (h10 != this) {
                sb2.append(h10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 < 0) {
            return false;
        }
        V l10 = l(e10);
        if (obj2 != l10 && (obj2 == null || !obj2.equals(l10))) {
            return false;
        }
        j(e10);
        return true;
    }

    public final boolean replace(K k10, V v3, V v10) {
        int e10 = e(k10);
        if (e10 < 0) {
            return false;
        }
        V l10 = l(e10);
        if (l10 != v3 && (v3 == null || !v3.equals(l10))) {
            return false;
        }
        k(e10, v10);
        return true;
    }

    public i(int i10) {
        if (i10 == 0) {
            this.f34545s = e.f34515s;
            this.f34546t = e.f34517u;
        } else {
            a(i10);
        }
        this.f34547u = 0;
    }
}
