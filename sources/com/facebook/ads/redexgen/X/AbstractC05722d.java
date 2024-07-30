package com.facebook.ads.redexgen.X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.2d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05722d<K, V> {
    public static String[] A03 = {"cnftN0nKJ399Diaxmn3tb8gwwrPO2aP4", "GD6Q0W3wC2KuP8ibvS2RtWU8XnqZN0Aj", "FY51T4e3CIDMofRfjaJn97HmoXO", "oFsWTCKeXQMPzJkbzzVFh0WI6lr", "sX7ClejzrEImqIfblQB7OY3eSnYyqYGK", "70PxY4sPYcKp4dj9du2NwnU3Lx25y2ig", "AJxY89BB1aRneGLKwVE9Pufkgncldx4M", "HDwbCIFP6XJ1qJgKvPjZQVX8jvQoDt8b"};

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2d<TK;TV;>.EntrySet; */
    public C2Z A00;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2d<TK;TV;>.KeySet; */
    public C05692a A01;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2d<TK;TV;>.ValuesCollection; */
    public C05712c A02;

    public abstract int A04();

    public abstract int A05(Object obj);

    public abstract int A06(Object obj);

    public abstract Object A07(int i10, int i11);

    public abstract V A08(int i10, V v3);

    public abstract Map<K, V> A0A();

    public abstract void A0D();

    public abstract void A0E(int i10);

    public abstract void A0F(K k10, V v3);

    public static <K, V> boolean A00(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean A01(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        int oldSize = map.size();
        return size != oldSize;
    }

    public static <K, V> boolean A02(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        int oldSize = map.size();
        return size != oldSize;
    }

    public static <T> boolean A03(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set<T> set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                if (set.containsAll(set2)) {
                    return true;
                }
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        } catch (NullPointerException unused2) {
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2d != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Collection<V> A09() {
        if (this.A02 == null) {
            this.A02 = new Collection<V>() { // from class: com.facebook.ads.redexgen.X.2c
                public static String[] A01 = {"WaXEENy4Qqf0iZa9rE7K5Tc", "CdcJslr1GuWzD3hgs8KQ2mZhu", "VqX8APEjT5Wjv2WgYqLWWETF9QEoqL89", "1lDdPMX0zjCtSNVsVcyG9UOAfTksMFfY", "Q30AX00aPMLh2Hp2SxjAPSj4hvT3yuLk", "DGZ9hWDjpXQG3w", "JKstht1TU3rAhNk0s2YNIFhF9tCkCvUD", "xnB3F8eRzgUElZJXVWbAPi1tu19rGp71"};

                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                 */
                @Override // java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    int A04 = AbstractC05722d.this.A04();
                    boolean z10 = false;
                    int i10 = 0;
                    while (i10 < A04) {
                        if (collection.contains(AbstractC05722d.this.A07(i10, 1))) {
                            AbstractC05722d.this.A0E(i10);
                            i10--;
                            A04--;
                            z10 = true;
                        }
                        i10++;
                    }
                    return z10;
                }

                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                 */
                @Override // java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    int A04 = AbstractC05722d.this.A04();
                    boolean z10 = false;
                    int i10 = 0;
                    while (i10 < A04) {
                        if (!collection.contains(AbstractC05722d.this.A07(i10, 1))) {
                            AbstractC05722d.this.A0E(i10);
                            i10--;
                            A04--;
                            z10 = true;
                        }
                        i10++;
                    }
                    return z10;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean add(V object) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean addAll(Collection<? extends V> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final void clear() {
                    AbstractC05722d.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean contains(Object obj) {
                    return AbstractC05722d.this.A06(obj) >= 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    Iterator<?> it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC05722d.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator<V> iterator() {
                    return new C2Y(AbstractC05722d.this, 1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean remove(Object obj) {
                    int A06 = AbstractC05722d.this.A06(obj);
                    if (A06 >= 0) {
                        AbstractC05722d.this.A0E(A06);
                        return true;
                    }
                    if (A01[6].charAt(4) == 'M') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[1] = "JaPNh4sPI8rJ5EjhCFrDgKQsA";
                    strArr[5] = "wvLzjGRSTCxgOw";
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final int size() {
                    return AbstractC05722d.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final Object[] toArray() {
                    return AbstractC05722d.this.A0G(1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
                    return (T[]) AbstractC05722d.this.A0H(tArr, 1);
                }
            };
        }
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2d != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Set<Map.Entry<K, V>> A0B() {
        if (this.A00 == null) {
            this.A00 = new Set<Map.Entry<K, V>>() { // from class: com.facebook.ads.redexgen.X.2Z
                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                 */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                    int A04 = AbstractC05722d.this.A04();
                    for (Map.Entry<K, V> entry : collection) {
                        AbstractC05722d.this.A0F(entry.getKey(), entry.getValue());
                    }
                    return A04 != AbstractC05722d.this.A04();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final boolean add(Map.Entry<K, V> object) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    AbstractC05722d.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
                    if (!(obj instanceof Map.Entry)) {
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    int index = AbstractC05722d.this.A05(entry.getKey());
                    if (index < 0) {
                        return false;
                    }
                    Object foundVal = AbstractC05722d.this.A07(index, 1);
                    return C2W.A04(foundVal, entry.getValue());
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    Iterator<?> it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    return AbstractC05722d.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    int i10 = 0;
                    for (int A04 = AbstractC05722d.this.A04() - 1; A04 >= 0; A04--) {
                        int i11 = 0;
                        Object A07 = AbstractC05722d.this.A07(A04, 0);
                        Object A072 = AbstractC05722d.this.A07(A04, 1);
                        int result = A07 == null ? 0 : A07.hashCode();
                        if (A072 != null) {
                            i11 = A072.hashCode();
                        }
                        i10 += i11 ^ result;
                    }
                    return i10;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC05722d.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator<Map.Entry<K, V>> iterator() {
                    return new C05702b(AbstractC05722d.this);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return AbstractC05722d.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] array) {
                    throw new UnsupportedOperationException();
                }
            };
        }
        C2Z c2z = this.A00;
        if (A03[1].charAt(12) != 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "9ju5liavVqCXLI9PRLJCuH215nhDnaAN";
        strArr[6] = "X1eenRL1zYDBvWo2ZsNSENOyPnB3gIiL";
        return c2z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2d != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Set<K> A0C() {
        if (this.A01 == null) {
            this.A01 = new Set<K>() { // from class: com.facebook.ads.redexgen.X.2a
                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean add(K object) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection<? extends K> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    AbstractC05722d.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
                    return AbstractC05722d.this.A05(obj) >= 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    return AbstractC05722d.A00(AbstractC05722d.this.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    return AbstractC05722d.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    int i10 = 0;
                    int result = AbstractC05722d.this.A04();
                    for (int i11 = result - 1; i11 >= 0; i11--) {
                        int i12 = 0;
                        Object A07 = AbstractC05722d.this.A07(i11, 0);
                        if (A07 != null) {
                            i12 = A07.hashCode();
                        }
                        i10 += i12;
                    }
                    return i10;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC05722d.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator<K> iterator() {
                    return new C2Y(AbstractC05722d.this, 0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    int A05 = AbstractC05722d.this.A05(obj);
                    if (A05 >= 0) {
                        AbstractC05722d.this.A0E(A05);
                        return true;
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    return AbstractC05722d.A01(AbstractC05722d.this.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    return AbstractC05722d.A02(AbstractC05722d.this.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return AbstractC05722d.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    return AbstractC05722d.this.A0G(0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
                    return (T[]) AbstractC05722d.this.A0H(tArr, 0);
                }
            };
        }
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2d != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Object[] A0G(int i10) {
        int A04 = A04();
        Object[] objArr = new Object[A04];
        for (int i11 = 0; i11 < A04; i11++) {
            objArr[i11] = A07(i11, i10);
        }
        return objArr;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2d != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final <T> T[] A0H(T[] tArr, int i10) {
        int A04 = A04();
        if (tArr.length < A04) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), A04));
        }
        for (int i11 = 0; i11 < A04; i11++) {
            tArr[i11] = A07(i11, i10);
        }
        if (tArr.length > A04) {
            tArr[A04] = null;
        }
        return tArr;
    }
}
