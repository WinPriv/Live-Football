package com.esotericsoftware.kryo.util;

import a3.l;
import com.huawei.hms.ads.gl;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class IdentityMap<K, V> {
    private static final int PRIME2 = -1105259343;
    private static final int PRIME3 = -1262997959;
    private static final int PRIME4 = -825114047;
    int capacity;
    private Entries entries;
    private int hashShift;
    private boolean isBigTable;
    K[] keyTable;
    private Keys keys;
    private float loadFactor;
    private int mask;
    private int pushIterations;
    public int size;
    private int stashCapacity;
    int stashSize;
    private int threshold;
    V[] valueTable;
    private Values values;

    /* loaded from: classes.dex */
    public static class Entries<K, V> extends MapIterator<K, V> implements Iterable<Entry<K, V>>, Iterator<Entry<K, V>> {
        private Entry<K, V> entry;

        public Entries(IdentityMap<K, V> identityMap) {
            super(identityMap);
            this.entry = new Entry<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // com.esotericsoftware.kryo.util.IdentityMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IdentityMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // java.util.Iterator
        public Entry<K, V> next() {
            if (this.hasNext) {
                IdentityMap<K, V> identityMap = this.map;
                K[] kArr = identityMap.keyTable;
                Entry<K, V> entry = this.entry;
                int i10 = this.nextIndex;
                entry.key = kArr[i10];
                entry.value = identityMap.valueTable[i10];
                this.currentIndex = i10;
                findNextIndex();
                return this.entry;
            }
            throw new NoSuchElementException();
        }

        @Override // java.lang.Iterable
        public Iterator<Entry<K, V>> iterator() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class Entry<K, V> {
        public K key;
        public V value;

        public String toString() {
            return this.key + ContainerUtils.KEY_VALUE_DELIMITER + this.value;
        }
    }

    /* loaded from: classes.dex */
    public static class MapIterator<K, V> {
        int currentIndex;
        public boolean hasNext;
        final IdentityMap<K, V> map;
        int nextIndex;

        public MapIterator(IdentityMap<K, V> identityMap) {
            this.map = identityMap;
            reset();
        }

        public void findNextIndex() {
            int i10;
            this.hasNext = false;
            IdentityMap<K, V> identityMap = this.map;
            K[] kArr = identityMap.keyTable;
            int i11 = identityMap.capacity + identityMap.stashSize;
            do {
                i10 = this.nextIndex + 1;
                this.nextIndex = i10;
                if (i10 >= i11) {
                    return;
                }
            } while (kArr[i10] == null);
            this.hasNext = true;
        }

        public void remove() {
            int i10 = this.currentIndex;
            if (i10 >= 0) {
                IdentityMap<K, V> identityMap = this.map;
                if (i10 >= identityMap.capacity) {
                    identityMap.removeStashIndex(i10);
                    this.nextIndex = this.currentIndex - 1;
                    findNextIndex();
                } else {
                    identityMap.keyTable[i10] = null;
                    identityMap.valueTable[i10] = null;
                }
                this.currentIndex = -1;
                IdentityMap<K, V> identityMap2 = this.map;
                identityMap2.size--;
                return;
            }
            throw new IllegalStateException("next must be called before remove.");
        }

        public void reset() {
            this.currentIndex = -1;
            this.nextIndex = -1;
            findNextIndex();
        }
    }

    public IdentityMap() {
        this(32, 0.8f);
    }

    private boolean containsKeyStash(K k10) {
        K[] kArr = this.keyTable;
        int i10 = this.capacity;
        int i11 = this.stashSize + i10;
        while (i10 < i11) {
            if (kArr[i10] == k10) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private V getStash(K k10, V v3) {
        K[] kArr = this.keyTable;
        int i10 = this.capacity;
        int i11 = this.stashSize + i10;
        while (i10 < i11) {
            if (kArr[i10] == k10) {
                return this.valueTable[i10];
            }
            i10++;
        }
        return v3;
    }

    private int hash2(int i10) {
        int i11 = i10 * PRIME2;
        return (i11 ^ (i11 >>> this.hashShift)) & this.mask;
    }

    private int hash3(int i10) {
        int i11 = i10 * PRIME3;
        return (i11 ^ (i11 >>> this.hashShift)) & this.mask;
    }

    private int hash4(int i10) {
        int i11 = i10 * PRIME4;
        return (i11 ^ (i11 >>> this.hashShift)) & this.mask;
    }

    private void push(K k10, V v3, int i10, K k11, int i11, K k12, int i12, K k13, int i13, K k14) {
        int i14;
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int i15 = this.mask;
        boolean z10 = this.isBigTable;
        int i16 = this.pushIterations;
        if (z10) {
            i14 = 4;
        } else {
            i14 = 3;
        }
        V v10 = v3;
        int i17 = i10;
        int i18 = i11;
        K k15 = k12;
        int i19 = i12;
        K k16 = k13;
        int i20 = i13;
        K k17 = k14;
        int i21 = 0;
        K k18 = k10;
        K k19 = k11;
        while (true) {
            int nextInt = ObjectMap.random.nextInt(i14);
            int i22 = i14;
            if (nextInt != 0) {
                if (nextInt != 1) {
                    if (nextInt != 2) {
                        V v11 = vArr[i20];
                        kArr[i20] = k18;
                        vArr[i20] = v10;
                        v10 = v11;
                        k18 = k17;
                    } else {
                        V v12 = vArr[i19];
                        kArr[i19] = k18;
                        vArr[i19] = v10;
                        v10 = v12;
                        k18 = k16;
                    }
                } else {
                    V v13 = vArr[i18];
                    kArr[i18] = k18;
                    vArr[i18] = v10;
                    v10 = v13;
                    k18 = k15;
                }
            } else {
                V v14 = vArr[i17];
                kArr[i17] = k18;
                vArr[i17] = v10;
                k18 = k19;
                v10 = v14;
            }
            int identityHashCode = System.identityHashCode(k18);
            int i23 = identityHashCode & i15;
            K k20 = kArr[i23];
            if (k20 == null) {
                kArr[i23] = k18;
                vArr[i23] = v10;
                int i24 = this.size;
                this.size = i24 + 1;
                if (i24 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            int hash2 = hash2(identityHashCode);
            K k21 = kArr[hash2];
            if (k21 == null) {
                kArr[hash2] = k18;
                vArr[hash2] = v10;
                int i25 = this.size;
                this.size = i25 + 1;
                if (i25 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            int hash3 = hash3(identityHashCode);
            K k22 = kArr[hash3];
            if (k22 == null) {
                kArr[hash3] = k18;
                vArr[hash3] = v10;
                int i26 = this.size;
                this.size = i26 + 1;
                if (i26 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            if (z10) {
                int hash4 = hash4(identityHashCode);
                K k23 = kArr[hash4];
                if (k23 == null) {
                    kArr[hash4] = k18;
                    vArr[hash4] = v10;
                    int i27 = this.size;
                    this.size = i27 + 1;
                    if (i27 >= this.threshold) {
                        resize(this.capacity << 1);
                        return;
                    }
                    return;
                }
                k17 = k23;
                i20 = hash4;
            }
            int i28 = i21 + 1;
            if (i28 == i16) {
                putStash(k18, v10);
                return;
            }
            i21 = i28;
            i17 = i23;
            k19 = k20;
            i18 = hash2;
            k15 = k21;
            i19 = hash3;
            i14 = i22;
            k16 = k22;
        }
    }

    private void putResize(K k10, V v3) {
        int i10;
        K k11;
        int identityHashCode = System.identityHashCode(k10);
        int i11 = identityHashCode & this.mask;
        K[] kArr = this.keyTable;
        K k12 = kArr[i11];
        if (k12 == null) {
            kArr[i11] = k10;
            this.valueTable[i11] = v3;
            int i12 = this.size;
            this.size = i12 + 1;
            if (i12 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        int hash2 = hash2(identityHashCode);
        K[] kArr2 = this.keyTable;
        K k13 = kArr2[hash2];
        if (k13 == null) {
            kArr2[hash2] = k10;
            this.valueTable[hash2] = v3;
            int i13 = this.size;
            this.size = i13 + 1;
            if (i13 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        int hash3 = hash3(identityHashCode);
        K[] kArr3 = this.keyTable;
        K k14 = kArr3[hash3];
        if (k14 == null) {
            kArr3[hash3] = k10;
            this.valueTable[hash3] = v3;
            int i14 = this.size;
            this.size = i14 + 1;
            if (i14 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        if (this.isBigTable) {
            int hash4 = hash4(identityHashCode);
            K[] kArr4 = this.keyTable;
            K k15 = kArr4[hash4];
            if (k15 == null) {
                kArr4[hash4] = k10;
                this.valueTable[hash4] = v3;
                int i15 = this.size;
                this.size = i15 + 1;
                if (i15 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            i10 = hash4;
            k11 = k15;
        } else {
            i10 = -1;
            k11 = null;
        }
        push(k10, v3, i11, k12, hash2, k13, hash3, k14, i10, k11);
    }

    private void putStash(K k10, V v3) {
        int i10 = this.stashSize;
        if (i10 == this.stashCapacity) {
            resize(this.capacity << 1);
            put(k10, v3);
            return;
        }
        int i11 = this.capacity + i10;
        this.keyTable[i11] = k10;
        this.valueTable[i11] = v3;
        this.stashSize = i10 + 1;
        this.size++;
    }

    private void resize(int i10) {
        boolean z10;
        int i11 = this.capacity + this.stashSize;
        this.capacity = i10;
        this.threshold = (int) (i10 * this.loadFactor);
        this.mask = i10 - 1;
        this.hashShift = 31 - Integer.numberOfTrailingZeros(i10);
        double d10 = i10;
        this.stashCapacity = Math.max(3, ((int) Math.ceil(Math.log(d10))) * 2);
        this.pushIterations = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d10)) / 8);
        if ((this.capacity >>> 16) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isBigTable = z10;
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int i12 = this.stashCapacity;
        this.keyTable = (K[]) new Object[i10 + i12];
        this.valueTable = (V[]) new Object[i10 + i12];
        int i13 = this.size;
        this.size = 0;
        this.stashSize = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                K k10 = kArr[i14];
                if (k10 != null) {
                    putResize(k10, vArr[i14]);
                }
            }
        }
    }

    public void clear(int i10) {
        if (this.capacity <= i10) {
            clear();
        } else {
            this.size = 0;
            resize(i10);
        }
    }

    public boolean containsKey(K k10) {
        int identityHashCode = System.identityHashCode(k10);
        if (k10 != this.keyTable[this.mask & identityHashCode]) {
            if (k10 != this.keyTable[hash2(identityHashCode)]) {
                if (k10 != this.keyTable[hash3(identityHashCode)]) {
                    if (this.isBigTable) {
                        if (k10 != this.keyTable[hash4(identityHashCode)]) {
                            return containsKeyStash(k10);
                        }
                        return true;
                    }
                    return containsKeyStash(k10);
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean containsValue(Object obj, boolean z10) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            K[] kArr = this.keyTable;
            int i10 = this.capacity + this.stashSize;
            while (true) {
                int i11 = i10 - 1;
                if (i10 > 0) {
                    if (kArr[i11] != null && vArr[i11] == null) {
                        return true;
                    }
                    i10 = i11;
                } else {
                    return false;
                }
            }
        } else if (z10) {
            int i12 = this.capacity + this.stashSize;
            while (true) {
                int i13 = i12 - 1;
                if (i12 > 0) {
                    if (vArr[i13] == obj) {
                        return true;
                    }
                    i12 = i13;
                } else {
                    return false;
                }
            }
        } else {
            int i14 = this.capacity + this.stashSize;
            while (true) {
                int i15 = i14 - 1;
                if (i14 > 0) {
                    if (obj.equals(vArr[i15])) {
                        return true;
                    }
                    i14 = i15;
                } else {
                    return false;
                }
            }
        }
    }

    public void ensureCapacity(int i10) {
        int i11 = this.size + i10;
        if (i11 >= this.threshold) {
            resize(ObjectMap.nextPowerOfTwo((int) (i11 / this.loadFactor)));
        }
    }

    public Entries<K, V> entries() {
        Entries entries = this.entries;
        if (entries == null) {
            this.entries = new Entries(this);
        } else {
            entries.reset();
        }
        return this.entries;
    }

    public K findKey(Object obj, boolean z10) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            K[] kArr = this.keyTable;
            int i10 = this.capacity + this.stashSize;
            while (true) {
                int i11 = i10 - 1;
                if (i10 > 0) {
                    K k10 = kArr[i11];
                    if (k10 != null && vArr[i11] == null) {
                        return k10;
                    }
                    i10 = i11;
                } else {
                    return null;
                }
            }
        } else if (z10) {
            int i12 = this.capacity + this.stashSize;
            while (true) {
                int i13 = i12 - 1;
                if (i12 > 0) {
                    if (vArr[i13] == obj) {
                        return this.keyTable[i13];
                    }
                    i12 = i13;
                } else {
                    return null;
                }
            }
        } else {
            int i14 = this.capacity + this.stashSize;
            while (true) {
                int i15 = i14 - 1;
                if (i14 > 0) {
                    if (obj.equals(vArr[i15])) {
                        return this.keyTable[i15];
                    }
                    i14 = i15;
                } else {
                    return null;
                }
            }
        }
    }

    public V get(K k10) {
        int identityHashCode = System.identityHashCode(k10);
        int i10 = this.mask & identityHashCode;
        if (k10 != this.keyTable[i10]) {
            i10 = hash2(identityHashCode);
            if (k10 != this.keyTable[i10]) {
                i10 = hash3(identityHashCode);
                if (k10 != this.keyTable[i10]) {
                    if (this.isBigTable) {
                        i10 = hash4(identityHashCode);
                        if (k10 != this.keyTable[i10]) {
                            return getStash(k10, null);
                        }
                    } else {
                        return getStash(k10, null);
                    }
                }
            }
        }
        return this.valueTable[i10];
    }

    public Keys<K> keys() {
        Keys keys = this.keys;
        if (keys == null) {
            this.keys = new Keys(this);
        } else {
            keys.reset();
        }
        return this.keys;
    }

    public V put(K k10, V v3) {
        int i10;
        K k11;
        if (k10 != null) {
            K[] kArr = this.keyTable;
            int i11 = this.mask;
            boolean z10 = this.isBigTable;
            int identityHashCode = System.identityHashCode(k10);
            int i12 = identityHashCode & i11;
            K k12 = kArr[i12];
            if (k12 == k10) {
                V[] vArr = this.valueTable;
                V v10 = vArr[i12];
                vArr[i12] = v3;
                return v10;
            }
            int hash2 = hash2(identityHashCode);
            K k13 = kArr[hash2];
            if (k13 == k10) {
                V[] vArr2 = this.valueTable;
                V v11 = vArr2[hash2];
                vArr2[hash2] = v3;
                return v11;
            }
            int hash3 = hash3(identityHashCode);
            K k14 = kArr[hash3];
            if (k14 == k10) {
                V[] vArr3 = this.valueTable;
                V v12 = vArr3[hash3];
                vArr3[hash3] = v3;
                return v12;
            }
            if (z10) {
                int hash4 = hash4(identityHashCode);
                K k15 = kArr[hash4];
                if (k15 == k10) {
                    V[] vArr4 = this.valueTable;
                    V v13 = vArr4[hash4];
                    vArr4[hash4] = v3;
                    return v13;
                }
                i10 = hash4;
                k11 = k15;
            } else {
                i10 = -1;
                k11 = null;
            }
            int i13 = this.capacity;
            int i14 = this.stashSize + i13;
            while (i13 < i14) {
                if (kArr[i13] == k10) {
                    V[] vArr5 = this.valueTable;
                    V v14 = vArr5[i13];
                    vArr5[i13] = v3;
                    return v14;
                }
                i13++;
            }
            if (k12 == null) {
                kArr[i12] = k10;
                this.valueTable[i12] = v3;
                int i15 = this.size;
                this.size = i15 + 1;
                if (i15 >= this.threshold) {
                    resize(this.capacity << 1);
                }
                return null;
            }
            if (k13 == null) {
                kArr[hash2] = k10;
                this.valueTable[hash2] = v3;
                int i16 = this.size;
                this.size = i16 + 1;
                if (i16 >= this.threshold) {
                    resize(this.capacity << 1);
                }
                return null;
            }
            if (k14 == null) {
                kArr[hash3] = k10;
                this.valueTable[hash3] = v3;
                int i17 = this.size;
                this.size = i17 + 1;
                if (i17 >= this.threshold) {
                    resize(this.capacity << 1);
                }
                return null;
            }
            if (z10 && k11 == null) {
                kArr[i10] = k10;
                this.valueTable[i10] = v3;
                int i18 = this.size;
                this.size = i18 + 1;
                if (i18 >= this.threshold) {
                    resize(this.capacity << 1);
                }
                return null;
            }
            push(k10, v3, i12, k12, hash2, k13, hash3, k14, i10, k11);
            return null;
        }
        throw new IllegalArgumentException("key cannot be null.");
    }

    public V remove(K k10) {
        int identityHashCode = System.identityHashCode(k10);
        int i10 = this.mask & identityHashCode;
        K[] kArr = this.keyTable;
        if (kArr[i10] == k10) {
            kArr[i10] = null;
            V[] vArr = this.valueTable;
            V v3 = vArr[i10];
            vArr[i10] = null;
            this.size--;
            return v3;
        }
        int hash2 = hash2(identityHashCode);
        K[] kArr2 = this.keyTable;
        if (kArr2[hash2] == k10) {
            kArr2[hash2] = null;
            V[] vArr2 = this.valueTable;
            V v10 = vArr2[hash2];
            vArr2[hash2] = null;
            this.size--;
            return v10;
        }
        int hash3 = hash3(identityHashCode);
        K[] kArr3 = this.keyTable;
        if (kArr3[hash3] == k10) {
            kArr3[hash3] = null;
            V[] vArr3 = this.valueTable;
            V v11 = vArr3[hash3];
            vArr3[hash3] = null;
            this.size--;
            return v11;
        }
        if (this.isBigTable) {
            int hash4 = hash4(identityHashCode);
            K[] kArr4 = this.keyTable;
            if (kArr4[hash4] == k10) {
                kArr4[hash4] = null;
                V[] vArr4 = this.valueTable;
                V v12 = vArr4[hash4];
                vArr4[hash4] = null;
                this.size--;
                return v12;
            }
        }
        return removeStash(k10);
    }

    public V removeStash(K k10) {
        K[] kArr = this.keyTable;
        int i10 = this.capacity;
        int i11 = this.stashSize + i10;
        while (i10 < i11) {
            if (kArr[i10] == k10) {
                V v3 = this.valueTable[i10];
                removeStashIndex(i10);
                this.size--;
                return v3;
            }
            i10++;
        }
        return null;
    }

    public void removeStashIndex(int i10) {
        int i11 = this.stashSize - 1;
        this.stashSize = i11;
        int i12 = this.capacity + i11;
        if (i10 < i12) {
            K[] kArr = this.keyTable;
            kArr[i10] = kArr[i12];
            V[] vArr = this.valueTable;
            vArr[i10] = vArr[i12];
            vArr[i12] = null;
            return;
        }
        this.valueTable[i10] = null;
    }

    public void shrink(int i10) {
        if (i10 >= 0) {
            int i11 = this.size;
            if (i11 > i10) {
                i10 = i11;
            }
            if (this.capacity <= i10) {
                return;
            }
            resize(ObjectMap.nextPowerOfTwo(i10));
            return;
        }
        throw new IllegalArgumentException(l.i("maximumCapacity must be >= 0: ", i10));
    }

    public String toString() {
        int i10;
        if (this.size == 0) {
            return ContentRecord.XRINFOLIST_NULL;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = kArr.length;
        while (true) {
            i10 = length - 1;
            if (length > 0) {
                K k10 = kArr[i10];
                if (k10 == null) {
                    length = i10;
                } else {
                    sb2.append(k10);
                    sb2.append('=');
                    sb2.append(vArr[i10]);
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            int i11 = i10 - 1;
            if (i10 > 0) {
                K k11 = kArr[i11];
                if (k11 != null) {
                    sb2.append(", ");
                    sb2.append(k11);
                    sb2.append('=');
                    sb2.append(vArr[i11]);
                }
                i10 = i11;
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }

    public Values<V> values() {
        Values values = this.values;
        if (values == null) {
            this.values = new Values(this);
        } else {
            values.reset();
        }
        return this.values;
    }

    public IdentityMap(int i10) {
        this(i10, 0.8f);
    }

    /* loaded from: classes.dex */
    public static class Values<V> extends MapIterator<Object, V> implements Iterable<V>, Iterator<V> {
        public Values(IdentityMap<?, V> identityMap) {
            super(identityMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        public V next() {
            V[] vArr = this.map.valueTable;
            int i10 = this.nextIndex;
            V v3 = vArr[i10];
            this.currentIndex = i10;
            findNextIndex();
            return v3;
        }

        @Override // com.esotericsoftware.kryo.util.IdentityMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IdentityMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public ArrayList<V> toArray() {
            ArrayList<V> arrayList = new ArrayList<>(this.map.size);
            while (this.hasNext) {
                arrayList.add(next());
            }
            return arrayList;
        }

        public void toArray(ArrayList<V> arrayList) {
            while (this.hasNext) {
                arrayList.add(next());
            }
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }
    }

    public IdentityMap(int i10, float f) {
        if (i10 < 0) {
            throw new IllegalArgumentException(l.i("initialCapacity must be >= 0: ", i10));
        }
        if (i10 <= 1073741824) {
            int nextPowerOfTwo = ObjectMap.nextPowerOfTwo(i10);
            this.capacity = nextPowerOfTwo;
            if (f > gl.Code) {
                this.loadFactor = f;
                this.isBigTable = (nextPowerOfTwo >>> 16) != 0;
                this.threshold = (int) (nextPowerOfTwo * f);
                this.mask = nextPowerOfTwo - 1;
                this.hashShift = 31 - Integer.numberOfTrailingZeros(nextPowerOfTwo);
                this.stashCapacity = Math.max(3, ((int) Math.ceil(Math.log(this.capacity))) * 2);
                this.pushIterations = Math.max(Math.min(this.capacity, 8), ((int) Math.sqrt(this.capacity)) / 8);
                K[] kArr = (K[]) new Object[this.capacity + this.stashCapacity];
                this.keyTable = kArr;
                this.valueTable = (V[]) new Object[kArr.length];
                return;
            }
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        throw new IllegalArgumentException(l.i("initialCapacity is too large: ", i10));
    }

    public void clear() {
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int i10 = this.capacity + this.stashSize;
        while (true) {
            int i11 = i10 - 1;
            if (i10 > 0) {
                kArr[i11] = null;
                vArr[i11] = null;
                i10 = i11;
            } else {
                this.size = 0;
                this.stashSize = 0;
                return;
            }
        }
    }

    public V get(K k10, V v3) {
        int identityHashCode = System.identityHashCode(k10);
        int i10 = this.mask & identityHashCode;
        if (k10 != this.keyTable[i10]) {
            i10 = hash2(identityHashCode);
            if (k10 != this.keyTable[i10]) {
                i10 = hash3(identityHashCode);
                if (k10 != this.keyTable[i10]) {
                    if (this.isBigTable) {
                        i10 = hash4(identityHashCode);
                        if (k10 != this.keyTable[i10]) {
                            return getStash(k10, v3);
                        }
                    } else {
                        return getStash(k10, v3);
                    }
                }
            }
        }
        return this.valueTable[i10];
    }

    /* loaded from: classes.dex */
    public static class Keys<K> extends MapIterator<K, Object> implements Iterable<K>, Iterator<K> {
        public Keys(IdentityMap<K, ?> identityMap) {
            super(identityMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        public K next() {
            K[] kArr = this.map.keyTable;
            int i10 = this.nextIndex;
            K k10 = kArr[i10];
            this.currentIndex = i10;
            findNextIndex();
            return k10;
        }

        @Override // com.esotericsoftware.kryo.util.IdentityMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IdentityMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public ArrayList<K> toArray() {
            ArrayList<K> arrayList = new ArrayList<>(this.map.size);
            while (this.hasNext) {
                arrayList.add(next());
            }
            return arrayList;
        }

        @Override // java.lang.Iterable
        public Iterator<K> iterator() {
            return this;
        }
    }
}
