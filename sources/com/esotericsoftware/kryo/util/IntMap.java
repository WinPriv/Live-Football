package com.esotericsoftware.kryo.util;

import a3.l;
import com.huawei.hms.ads.gl;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class IntMap<V> {
    private static final int EMPTY = 0;
    private static final int PRIME2 = -1105259343;
    private static final int PRIME3 = -1262997959;
    private static final int PRIME4 = -825114047;
    int capacity;
    boolean hasZeroValue;
    private int hashShift;
    private boolean isBigTable;
    int[] keyTable;
    private float loadFactor;
    private int mask;
    private int pushIterations;
    public int size;
    private int stashCapacity;
    int stashSize;
    private int threshold;
    V[] valueTable;
    V zeroValue;

    /* loaded from: classes.dex */
    public static class Entries<V> extends MapIterator<V> implements Iterable<Entry<V>>, Iterator<Entry<V>> {
        private Entry<V> entry;

        public Entries(IntMap intMap) {
            super(intMap);
            this.entry = new Entry<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // java.util.Iterator
        public Entry<V> next() {
            if (this.hasNext) {
                IntMap<V> intMap = this.map;
                int[] iArr = intMap.keyTable;
                int i10 = this.nextIndex;
                if (i10 == -1) {
                    Entry<V> entry = this.entry;
                    entry.key = 0;
                    entry.value = intMap.zeroValue;
                } else {
                    Entry<V> entry2 = this.entry;
                    entry2.key = iArr[i10];
                    entry2.value = intMap.valueTable[i10];
                }
                this.currentIndex = i10;
                findNextIndex();
                return this.entry;
            }
            throw new NoSuchElementException();
        }

        @Override // java.lang.Iterable
        public Iterator<Entry<V>> iterator() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class Entry<V> {
        public int key;
        public V value;

        public String toString() {
            return this.key + ContainerUtils.KEY_VALUE_DELIMITER + this.value;
        }
    }

    /* loaded from: classes.dex */
    public static class Keys extends MapIterator {
        public Keys(IntMap intMap) {
            super(intMap);
        }

        public int next() {
            int i10;
            if (this.hasNext) {
                int i11 = this.nextIndex;
                if (i11 == -1) {
                    i10 = 0;
                } else {
                    i10 = this.map.keyTable[i11];
                }
                this.currentIndex = i11;
                findNextIndex();
                return i10;
            }
            throw new NoSuchElementException();
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public IntArray toArray() {
            IntArray intArray = new IntArray(true, this.map.size);
            while (this.hasNext) {
                intArray.add(next());
            }
            return intArray;
        }
    }

    /* loaded from: classes.dex */
    public static class MapIterator<V> {
        static final int INDEX_ILLEGAL = -2;
        static final int INDEX_ZERO = -1;
        int currentIndex;
        public boolean hasNext;
        final IntMap<V> map;
        int nextIndex;

        public MapIterator(IntMap<V> intMap) {
            this.map = intMap;
            reset();
        }

        public void findNextIndex() {
            int i10;
            this.hasNext = false;
            IntMap<V> intMap = this.map;
            int[] iArr = intMap.keyTable;
            int i11 = intMap.capacity + intMap.stashSize;
            do {
                i10 = this.nextIndex + 1;
                this.nextIndex = i10;
                if (i10 >= i11) {
                    return;
                }
            } while (iArr[i10] == 0);
            this.hasNext = true;
        }

        public void remove() {
            int i10 = this.currentIndex;
            if (i10 == -1) {
                IntMap<V> intMap = this.map;
                if (intMap.hasZeroValue) {
                    intMap.zeroValue = null;
                    intMap.hasZeroValue = false;
                    this.currentIndex = -2;
                    IntMap<V> intMap2 = this.map;
                    intMap2.size--;
                    return;
                }
            }
            if (i10 >= 0) {
                IntMap<V> intMap3 = this.map;
                if (i10 >= intMap3.capacity) {
                    intMap3.removeStashIndex(i10);
                    this.nextIndex = this.currentIndex - 1;
                    findNextIndex();
                } else {
                    intMap3.keyTable[i10] = 0;
                    intMap3.valueTable[i10] = null;
                }
                this.currentIndex = -2;
                IntMap<V> intMap22 = this.map;
                intMap22.size--;
                return;
            }
            throw new IllegalStateException("next must be called before remove.");
        }

        public void reset() {
            this.currentIndex = -2;
            this.nextIndex = -1;
            if (this.map.hasZeroValue) {
                this.hasNext = true;
            } else {
                findNextIndex();
            }
        }
    }

    public IntMap() {
        this(32, 0.8f);
    }

    private boolean containsKeyStash(int i10) {
        int[] iArr = this.keyTable;
        int i11 = this.capacity;
        int i12 = this.stashSize + i11;
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return true;
            }
            i11++;
        }
        return false;
    }

    private V getStash(int i10, V v3) {
        int[] iArr = this.keyTable;
        int i11 = this.capacity;
        int i12 = this.stashSize + i11;
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return this.valueTable[i11];
            }
            i11++;
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

    private void push(int i10, V v3, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int i20 = this.mask;
        boolean z10 = this.isBigTable;
        int i21 = this.pushIterations;
        if (z10) {
            i19 = 4;
        } else {
            i19 = 3;
        }
        V v10 = v3;
        int i22 = i11;
        int i23 = i13;
        int i24 = i14;
        int i25 = i15;
        int i26 = i16;
        int i27 = i17;
        int i28 = i18;
        int i29 = 0;
        int i30 = i10;
        int i31 = i12;
        while (true) {
            int nextInt = ObjectMap.random.nextInt(i19);
            int i32 = i19;
            if (nextInt != 0) {
                if (nextInt != 1) {
                    if (nextInt != 2) {
                        V v11 = vArr[i27];
                        iArr[i27] = i30;
                        vArr[i27] = v10;
                        v10 = v11;
                        i30 = i28;
                    } else {
                        V v12 = vArr[i25];
                        iArr[i25] = i30;
                        vArr[i25] = v10;
                        v10 = v12;
                        i30 = i26;
                    }
                } else {
                    V v13 = vArr[i23];
                    iArr[i23] = i30;
                    vArr[i23] = v10;
                    v10 = v13;
                    i30 = i24;
                }
            } else {
                V v14 = vArr[i22];
                iArr[i22] = i30;
                vArr[i22] = v10;
                i30 = i31;
                v10 = v14;
            }
            i22 = i30 & i20;
            int i33 = iArr[i22];
            if (i33 == 0) {
                iArr[i22] = i30;
                vArr[i22] = v10;
                int i34 = this.size;
                this.size = i34 + 1;
                if (i34 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            i23 = hash2(i30);
            i24 = iArr[i23];
            if (i24 == 0) {
                iArr[i23] = i30;
                vArr[i23] = v10;
                int i35 = this.size;
                this.size = i35 + 1;
                if (i35 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            i25 = hash3(i30);
            i26 = iArr[i25];
            if (i26 == 0) {
                iArr[i25] = i30;
                vArr[i25] = v10;
                int i36 = this.size;
                this.size = i36 + 1;
                if (i36 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            if (z10 && (i28 = iArr[(i27 = hash4(i30))]) == 0) {
                iArr[i27] = i30;
                vArr[i27] = v10;
                int i37 = this.size;
                this.size = i37 + 1;
                if (i37 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            int i38 = i29 + 1;
            if (i38 == i21) {
                putStash(i30, v10);
                return;
            } else {
                i29 = i38;
                i31 = i33;
                i19 = i32;
            }
        }
    }

    private void putResize(int i10, V v3) {
        int i11;
        int i12;
        if (i10 == 0) {
            this.zeroValue = v3;
            this.hasZeroValue = true;
            return;
        }
        int i13 = i10 & this.mask;
        int[] iArr = this.keyTable;
        int i14 = iArr[i13];
        if (i14 == 0) {
            iArr[i13] = i10;
            this.valueTable[i13] = v3;
            int i15 = this.size;
            this.size = i15 + 1;
            if (i15 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        int hash2 = hash2(i10);
        int[] iArr2 = this.keyTable;
        int i16 = iArr2[hash2];
        if (i16 == 0) {
            iArr2[hash2] = i10;
            this.valueTable[hash2] = v3;
            int i17 = this.size;
            this.size = i17 + 1;
            if (i17 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        int hash3 = hash3(i10);
        int[] iArr3 = this.keyTable;
        int i18 = iArr3[hash3];
        if (i18 == 0) {
            iArr3[hash3] = i10;
            this.valueTable[hash3] = v3;
            int i19 = this.size;
            this.size = i19 + 1;
            if (i19 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        if (this.isBigTable) {
            int hash4 = hash4(i10);
            int[] iArr4 = this.keyTable;
            int i20 = iArr4[hash4];
            if (i20 == 0) {
                iArr4[hash4] = i10;
                this.valueTable[hash4] = v3;
                int i21 = this.size;
                this.size = i21 + 1;
                if (i21 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            i11 = hash4;
            i12 = i20;
        } else {
            i11 = -1;
            i12 = -1;
        }
        push(i10, v3, i13, i14, hash2, i16, hash3, i18, i11, i12);
    }

    private void putStash(int i10, V v3) {
        int i11 = this.stashSize;
        if (i11 == this.stashCapacity) {
            resize(this.capacity << 1);
            put(i10, v3);
            return;
        }
        int i12 = this.capacity + i11;
        this.keyTable[i12] = i10;
        this.valueTable[i12] = v3;
        this.stashSize = i11 + 1;
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
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int i12 = this.stashCapacity;
        this.keyTable = new int[i10 + i12];
        this.valueTable = (V[]) new Object[i10 + i12];
        int i13 = this.size;
        this.size = this.hasZeroValue ? 1 : 0;
        this.stashSize = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = iArr[i14];
                if (i15 != 0) {
                    putResize(i15, vArr[i14]);
                }
            }
        }
    }

    public void clear(int i10) {
        if (this.capacity <= i10) {
            clear();
            return;
        }
        this.zeroValue = null;
        this.hasZeroValue = false;
        this.size = 0;
        resize(i10);
    }

    public boolean containsKey(int i10) {
        if (i10 == 0) {
            return this.hasZeroValue;
        }
        if (this.keyTable[this.mask & i10] != i10) {
            if (this.keyTable[hash2(i10)] != i10) {
                if (this.keyTable[hash3(i10)] != i10) {
                    if (this.isBigTable) {
                        if (this.keyTable[hash4(i10)] != i10) {
                            return containsKeyStash(i10);
                        }
                        return true;
                    }
                    return containsKeyStash(i10);
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
            if (this.hasZeroValue && this.zeroValue == null) {
                return true;
            }
            int[] iArr = this.keyTable;
            int i10 = this.capacity + this.stashSize;
            while (true) {
                int i11 = i10 - 1;
                if (i10 > 0) {
                    if (iArr[i11] != 0 && vArr[i11] == null) {
                        return true;
                    }
                    i10 = i11;
                } else {
                    return false;
                }
            }
        } else if (z10) {
            if (obj == this.zeroValue) {
                return true;
            }
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
            if (this.hasZeroValue && obj.equals(this.zeroValue)) {
                return true;
            }
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

    public Entries<V> entries() {
        return new Entries<>(this);
    }

    public int findKey(Object obj, boolean z10, int i10) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            if (this.hasZeroValue && this.zeroValue == null) {
                return 0;
            }
            int[] iArr = this.keyTable;
            int i11 = this.capacity + this.stashSize;
            while (true) {
                int i12 = i11 - 1;
                if (i11 <= 0) {
                    break;
                }
                int i13 = iArr[i12];
                if (i13 != 0 && vArr[i12] == null) {
                    return i13;
                }
                i11 = i12;
            }
        } else if (z10) {
            if (obj == this.zeroValue) {
                return 0;
            }
            int i14 = this.capacity + this.stashSize;
            while (true) {
                int i15 = i14 - 1;
                if (i14 <= 0) {
                    break;
                }
                if (vArr[i15] == obj) {
                    return this.keyTable[i15];
                }
                i14 = i15;
            }
        } else {
            if (this.hasZeroValue && obj.equals(this.zeroValue)) {
                return 0;
            }
            int i16 = this.capacity + this.stashSize;
            while (true) {
                int i17 = i16 - 1;
                if (i16 <= 0) {
                    break;
                }
                if (obj.equals(vArr[i17])) {
                    return this.keyTable[i17];
                }
                i16 = i17;
            }
        }
        return i10;
    }

    public V get(int i10) {
        if (i10 == 0) {
            if (this.hasZeroValue) {
                return this.zeroValue;
            }
            return null;
        }
        int i11 = this.mask & i10;
        if (this.keyTable[i11] != i10) {
            i11 = hash2(i10);
            if (this.keyTable[i11] != i10) {
                i11 = hash3(i10);
                if (this.keyTable[i11] != i10) {
                    if (this.isBigTable) {
                        i11 = hash4(i10);
                        if (this.keyTable[i11] != i10) {
                            return getStash(i10, null);
                        }
                    } else {
                        return getStash(i10, null);
                    }
                }
            }
        }
        return this.valueTable[i11];
    }

    public Keys keys() {
        return new Keys(this);
    }

    public V put(int i10, V v3) {
        int i11;
        int i12;
        if (i10 == 0) {
            V v10 = this.zeroValue;
            this.zeroValue = v3;
            if (!this.hasZeroValue) {
                this.hasZeroValue = true;
                this.size++;
            }
            return v10;
        }
        int[] iArr = this.keyTable;
        int i13 = this.mask;
        boolean z10 = this.isBigTable;
        int i14 = i13 & i10;
        int i15 = iArr[i14];
        if (i15 == i10) {
            V[] vArr = this.valueTable;
            V v11 = vArr[i14];
            vArr[i14] = v3;
            return v11;
        }
        int hash2 = hash2(i10);
        int i16 = iArr[hash2];
        if (i16 == i10) {
            V[] vArr2 = this.valueTable;
            V v12 = vArr2[hash2];
            vArr2[hash2] = v3;
            return v12;
        }
        int hash3 = hash3(i10);
        int i17 = iArr[hash3];
        if (i17 == i10) {
            V[] vArr3 = this.valueTable;
            V v13 = vArr3[hash3];
            vArr3[hash3] = v3;
            return v13;
        }
        if (z10) {
            i11 = hash4(i10);
            i12 = iArr[i11];
            if (i12 == i10) {
                V[] vArr4 = this.valueTable;
                V v14 = vArr4[i11];
                vArr4[i11] = v3;
                return v14;
            }
        } else {
            i11 = -1;
            i12 = -1;
        }
        int i18 = this.capacity;
        int i19 = this.stashSize + i18;
        while (i18 < i19) {
            if (iArr[i18] == i10) {
                V[] vArr5 = this.valueTable;
                V v15 = vArr5[i18];
                vArr5[i18] = v3;
                return v15;
            }
            i18++;
        }
        if (i15 == 0) {
            iArr[i14] = i10;
            this.valueTable[i14] = v3;
            int i20 = this.size;
            this.size = i20 + 1;
            if (i20 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return null;
        }
        if (i16 == 0) {
            iArr[hash2] = i10;
            this.valueTable[hash2] = v3;
            int i21 = this.size;
            this.size = i21 + 1;
            if (i21 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return null;
        }
        if (i17 == 0) {
            iArr[hash3] = i10;
            this.valueTable[hash3] = v3;
            int i22 = this.size;
            this.size = i22 + 1;
            if (i22 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return null;
        }
        if (z10 && i12 == 0) {
            iArr[i11] = i10;
            this.valueTable[i11] = v3;
            int i23 = this.size;
            this.size = i23 + 1;
            if (i23 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return null;
        }
        push(i10, v3, i14, i15, hash2, i16, hash3, i17, i11, i12);
        return null;
    }

    public void putAll(IntMap<V> intMap) {
        Iterator<Entry<V>> it = intMap.entries().iterator();
        while (it.hasNext()) {
            Entry<V> next = it.next();
            put(next.key, next.value);
        }
    }

    public V remove(int i10) {
        if (i10 == 0) {
            if (!this.hasZeroValue) {
                return null;
            }
            V v3 = this.zeroValue;
            this.zeroValue = null;
            this.hasZeroValue = false;
            this.size--;
            return v3;
        }
        int i11 = this.mask & i10;
        int[] iArr = this.keyTable;
        if (iArr[i11] == i10) {
            iArr[i11] = 0;
            V[] vArr = this.valueTable;
            V v10 = vArr[i11];
            vArr[i11] = null;
            this.size--;
            return v10;
        }
        int hash2 = hash2(i10);
        int[] iArr2 = this.keyTable;
        if (iArr2[hash2] == i10) {
            iArr2[hash2] = 0;
            V[] vArr2 = this.valueTable;
            V v11 = vArr2[hash2];
            vArr2[hash2] = null;
            this.size--;
            return v11;
        }
        int hash3 = hash3(i10);
        int[] iArr3 = this.keyTable;
        if (iArr3[hash3] == i10) {
            iArr3[hash3] = 0;
            V[] vArr3 = this.valueTable;
            V v12 = vArr3[hash3];
            vArr3[hash3] = null;
            this.size--;
            return v12;
        }
        if (this.isBigTable) {
            int hash4 = hash4(i10);
            int[] iArr4 = this.keyTable;
            if (iArr4[hash4] == i10) {
                iArr4[hash4] = 0;
                V[] vArr4 = this.valueTable;
                V v13 = vArr4[hash4];
                vArr4[hash4] = null;
                this.size--;
                return v13;
            }
        }
        return removeStash(i10);
    }

    public V removeStash(int i10) {
        int[] iArr = this.keyTable;
        int i11 = this.capacity;
        int i12 = this.stashSize + i11;
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                V v3 = this.valueTable[i11];
                removeStashIndex(i11);
                this.size--;
                return v3;
            }
            i11++;
        }
        return null;
    }

    public void removeStashIndex(int i10) {
        int i11 = this.stashSize - 1;
        this.stashSize = i11;
        int i12 = this.capacity + i11;
        if (i10 < i12) {
            int[] iArr = this.keyTable;
            iArr[i10] = iArr[i12];
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003e -> B:9:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r7 = this;
            int r0 = r7.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r7.keyTable
            V[] r2 = r7.valueTable
            int r3 = r1.length
            boolean r4 = r7.hasZeroValue
            r5 = 61
            if (r4 == 0) goto L29
            java.lang.String r4 = "0="
            r0.append(r4)
            V r4 = r7.zeroValue
            r0.append(r4)
            goto L3f
        L29:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L3e
            r3 = r1[r4]
            if (r3 != 0) goto L33
            r3 = r4
            goto L29
        L33:
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
        L3e:
            r3 = r4
        L3f:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L59
            r3 = r1[r4]
            if (r3 != 0) goto L48
            goto L3e
        L48:
            java.lang.String r6 = ", "
            r0.append(r6)
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
            goto L3e
        L59:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.IntMap.toString():java.lang.String");
    }

    public Values<V> values() {
        return new Values<>(this);
    }

    public IntMap(int i10) {
        this(i10, 0.8f);
    }

    public IntMap(int i10, float f) {
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
                int[] iArr = new int[this.capacity + this.stashCapacity];
                this.keyTable = iArr;
                this.valueTable = (V[]) new Object[iArr.length];
                return;
            }
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        throw new IllegalArgumentException(l.i("initialCapacity is too large: ", i10));
    }

    public void clear() {
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int i10 = this.capacity + this.stashSize;
        while (true) {
            int i11 = i10 - 1;
            if (i10 > 0) {
                iArr[i11] = 0;
                vArr[i11] = null;
                i10 = i11;
            } else {
                this.size = 0;
                this.stashSize = 0;
                this.zeroValue = null;
                this.hasZeroValue = false;
                return;
            }
        }
    }

    public V get(int i10, V v3) {
        if (i10 == 0) {
            return !this.hasZeroValue ? v3 : this.zeroValue;
        }
        int i11 = this.mask & i10;
        if (this.keyTable[i11] != i10) {
            i11 = hash2(i10);
            if (this.keyTable[i11] != i10) {
                i11 = hash3(i10);
                if (this.keyTable[i11] != i10) {
                    if (this.isBigTable) {
                        i11 = hash4(i10);
                        if (this.keyTable[i11] != i10) {
                            return getStash(i10, v3);
                        }
                    } else {
                        return getStash(i10, v3);
                    }
                }
            }
        }
        return this.valueTable[i11];
    }

    /* loaded from: classes.dex */
    public static class Values<V> extends MapIterator<V> implements Iterable<V>, Iterator<V> {
        public Values(IntMap<V> intMap) {
            super(intMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        public V next() {
            V v3;
            if (this.hasNext) {
                int i10 = this.nextIndex;
                if (i10 == -1) {
                    v3 = this.map.zeroValue;
                } else {
                    v3 = this.map.valueTable[i10];
                }
                this.currentIndex = i10;
                findNextIndex();
                return v3;
            }
            throw new NoSuchElementException();
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.MapIterator
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

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }
    }

    public IntMap(IntMap<? extends V> intMap) {
        this(intMap.capacity, intMap.loadFactor);
        this.stashSize = intMap.stashSize;
        int[] iArr = intMap.keyTable;
        System.arraycopy(iArr, 0, this.keyTable, 0, iArr.length);
        Object[] objArr = intMap.valueTable;
        System.arraycopy(objArr, 0, this.valueTable, 0, objArr.length);
        this.size = intMap.size;
        this.zeroValue = intMap.zeroValue;
        this.hasZeroValue = intMap.hasZeroValue;
    }
}
