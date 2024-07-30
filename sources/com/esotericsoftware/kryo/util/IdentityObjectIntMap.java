package com.esotericsoftware.kryo.util;

import a3.l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class IdentityObjectIntMap<K> {
    private static final int PRIME2 = -1105259343;
    private static final int PRIME3 = -1262997959;
    private static final int PRIME4 = -825114047;
    int capacity;
    private int hashShift;
    private boolean isBigTable;
    K[] keyTable;
    private float loadFactor;
    private int mask;
    private int pushIterations;
    public int size;
    private int stashCapacity;
    int stashSize;
    private int threshold;
    int[] valueTable;

    public IdentityObjectIntMap() {
        this(32, 0.8f);
    }

    private boolean containsKeyStash(K k10) {
        K[] kArr = this.keyTable;
        int i10 = this.capacity;
        int i11 = this.stashSize + i10;
        while (i10 < i11) {
            if (k10 == kArr[i10]) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private int getAndIncrementStash(K k10, int i10, int i11) {
        K[] kArr = this.keyTable;
        int i12 = this.capacity;
        int i13 = this.stashSize + i12;
        while (i12 < i13) {
            if (k10 == kArr[i12]) {
                int[] iArr = this.valueTable;
                int i14 = iArr[i12];
                iArr[i12] = i11 + i14;
                return i14;
            }
            i12++;
        }
        put(k10, i11 + i10);
        return i10;
    }

    private int getStash(K k10, int i10) {
        K[] kArr = this.keyTable;
        int i11 = this.capacity;
        int i12 = this.stashSize + i11;
        while (i11 < i12) {
            if (k10 == kArr[i11]) {
                return this.valueTable[i11];
            }
            i11++;
        }
        return i10;
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

    private void push(K k10, int i10, int i11, K k11, int i12, K k12, int i13, K k13, int i14, K k14) {
        int i15;
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        int i16 = this.mask;
        boolean z10 = this.isBigTable;
        int i17 = this.pushIterations;
        if (z10) {
            i15 = 4;
        } else {
            i15 = 3;
        }
        int i18 = i10;
        int i19 = i11;
        int i20 = i12;
        K k15 = k12;
        int i21 = i13;
        K k16 = k13;
        int i22 = i14;
        K k17 = k14;
        int i23 = 0;
        K k18 = k10;
        K k19 = k11;
        while (true) {
            int nextInt = ObjectMap.random.nextInt(i15);
            int i24 = i15;
            if (nextInt != 0) {
                if (nextInt != 1) {
                    if (nextInt != 2) {
                        int i25 = iArr[i22];
                        kArr[i22] = k18;
                        iArr[i22] = i18;
                        i18 = i25;
                        k18 = k17;
                    } else {
                        int i26 = iArr[i21];
                        kArr[i21] = k18;
                        iArr[i21] = i18;
                        i18 = i26;
                        k18 = k16;
                    }
                } else {
                    int i27 = iArr[i20];
                    kArr[i20] = k18;
                    iArr[i20] = i18;
                    i18 = i27;
                    k18 = k15;
                }
            } else {
                int i28 = iArr[i19];
                kArr[i19] = k18;
                iArr[i19] = i18;
                k18 = k19;
                i18 = i28;
            }
            int identityHashCode = System.identityHashCode(k18);
            int i29 = identityHashCode & i16;
            K k20 = kArr[i29];
            if (k20 == null) {
                kArr[i29] = k18;
                iArr[i29] = i18;
                int i30 = this.size;
                this.size = i30 + 1;
                if (i30 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            int hash2 = hash2(identityHashCode);
            K k21 = kArr[hash2];
            if (k21 == null) {
                kArr[hash2] = k18;
                iArr[hash2] = i18;
                int i31 = this.size;
                this.size = i31 + 1;
                if (i31 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            int hash3 = hash3(identityHashCode);
            K k22 = kArr[hash3];
            if (k22 == null) {
                kArr[hash3] = k18;
                iArr[hash3] = i18;
                int i32 = this.size;
                this.size = i32 + 1;
                if (i32 >= this.threshold) {
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
                    iArr[hash4] = i18;
                    int i33 = this.size;
                    this.size = i33 + 1;
                    if (i33 >= this.threshold) {
                        resize(this.capacity << 1);
                        return;
                    }
                    return;
                }
                k17 = k23;
                i22 = hash4;
            }
            int i34 = i23 + 1;
            if (i34 == i17) {
                putStash(k18, i18);
                return;
            }
            i23 = i34;
            i19 = i29;
            k19 = k20;
            i20 = hash2;
            k15 = k21;
            i21 = hash3;
            i15 = i24;
            k16 = k22;
        }
    }

    private void putResize(K k10, int i10) {
        int i11;
        K k11;
        int identityHashCode = System.identityHashCode(k10);
        int i12 = identityHashCode & this.mask;
        K[] kArr = this.keyTable;
        K k12 = kArr[i12];
        if (k12 == null) {
            kArr[i12] = k10;
            this.valueTable[i12] = i10;
            int i13 = this.size;
            this.size = i13 + 1;
            if (i13 >= this.threshold) {
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
            this.valueTable[hash2] = i10;
            int i14 = this.size;
            this.size = i14 + 1;
            if (i14 >= this.threshold) {
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
            this.valueTable[hash3] = i10;
            int i15 = this.size;
            this.size = i15 + 1;
            if (i15 >= this.threshold) {
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
                this.valueTable[hash4] = i10;
                int i16 = this.size;
                this.size = i16 + 1;
                if (i16 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            i11 = hash4;
            k11 = k15;
        } else {
            i11 = -1;
            k11 = null;
        }
        push(k10, i10, i12, k12, hash2, k13, hash3, k14, i11, k11);
    }

    private void putStash(K k10, int i10) {
        int i11 = this.stashSize;
        if (i11 == this.stashCapacity) {
            resize(this.capacity << 1);
            put(k10, i10);
            return;
        }
        int i12 = this.capacity + i11;
        this.keyTable[i12] = k10;
        this.valueTable[i12] = i10;
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
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        int i12 = this.stashCapacity;
        this.keyTable = (K[]) new Object[i10 + i12];
        this.valueTable = new int[i10 + i12];
        int i13 = this.size;
        this.size = 0;
        this.stashSize = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                K k10 = kArr[i14];
                if (k10 != null) {
                    putResize(k10, iArr[i14]);
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

    public boolean containsValue(int i10) {
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        int i11 = this.capacity + this.stashSize;
        while (true) {
            int i12 = i11 - 1;
            if (i11 > 0) {
                if (kArr[i12] != null && iArr[i12] == i10) {
                    return true;
                }
                i11 = i12;
            } else {
                return false;
            }
        }
    }

    public void ensureCapacity(int i10) {
        int i11 = this.size + i10;
        if (i11 >= this.threshold) {
            resize(ObjectMap.nextPowerOfTwo((int) (i11 / this.loadFactor)));
        }
    }

    public K findKey(int i10) {
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        int i11 = this.capacity + this.stashSize;
        while (true) {
            int i12 = i11 - 1;
            if (i11 > 0) {
                K k10 = kArr[i12];
                if (k10 != null && iArr[i12] == i10) {
                    return k10;
                }
                i11 = i12;
            } else {
                return null;
            }
        }
    }

    public int get(K k10, int i10) {
        int identityHashCode = System.identityHashCode(k10);
        int i11 = this.mask & identityHashCode;
        if (k10 != this.keyTable[i11]) {
            i11 = hash2(identityHashCode);
            if (k10 != this.keyTable[i11]) {
                i11 = hash3(identityHashCode);
                if (k10 != this.keyTable[i11]) {
                    if (this.isBigTable) {
                        i11 = hash4(identityHashCode);
                        if (k10 != this.keyTable[i11]) {
                            return getStash(k10, i10);
                        }
                    } else {
                        return getStash(k10, i10);
                    }
                }
            }
        }
        return this.valueTable[i11];
    }

    public int getAndIncrement(K k10, int i10, int i11) {
        int identityHashCode = System.identityHashCode(k10);
        int i12 = this.mask & identityHashCode;
        if (k10 != this.keyTable[i12]) {
            i12 = hash2(identityHashCode);
            if (k10 != this.keyTable[i12]) {
                i12 = hash3(identityHashCode);
                if (k10 != this.keyTable[i12]) {
                    if (this.isBigTable) {
                        i12 = hash4(identityHashCode);
                        if (k10 != this.keyTable[i12]) {
                            return getAndIncrementStash(k10, i10, i11);
                        }
                    } else {
                        return getAndIncrementStash(k10, i10, i11);
                    }
                }
            }
        }
        int[] iArr = this.valueTable;
        int i13 = iArr[i12];
        iArr[i12] = i11 + i13;
        return i13;
    }

    public void put(K k10, int i10) {
        int i11;
        K k11;
        if (k10 != null) {
            K[] kArr = this.keyTable;
            int i12 = this.mask;
            boolean z10 = this.isBigTable;
            int identityHashCode = System.identityHashCode(k10);
            int i13 = identityHashCode & i12;
            K k12 = kArr[i13];
            if (k10 == k12) {
                this.valueTable[i13] = i10;
                return;
            }
            int hash2 = hash2(identityHashCode);
            K k13 = kArr[hash2];
            if (k10 == k13) {
                this.valueTable[hash2] = i10;
                return;
            }
            int hash3 = hash3(identityHashCode);
            K k14 = kArr[hash3];
            if (k10 == k14) {
                this.valueTable[hash3] = i10;
                return;
            }
            if (z10) {
                i11 = hash4(identityHashCode);
                k11 = kArr[i11];
                if (k10 == k11) {
                    this.valueTable[i11] = i10;
                    return;
                }
            } else {
                i11 = -1;
                k11 = null;
            }
            int i14 = i11;
            K k15 = k11;
            int i15 = this.capacity;
            int i16 = this.stashSize + i15;
            while (i15 < i16) {
                if (kArr[i15] == k10) {
                    this.valueTable[i15] = i10;
                    return;
                }
                i15++;
            }
            if (k12 == null) {
                kArr[i13] = k10;
                this.valueTable[i13] = i10;
                int i17 = this.size;
                this.size = i17 + 1;
                if (i17 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            if (k13 == null) {
                kArr[hash2] = k10;
                this.valueTable[hash2] = i10;
                int i18 = this.size;
                this.size = i18 + 1;
                if (i18 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            if (k14 == null) {
                kArr[hash3] = k10;
                this.valueTable[hash3] = i10;
                int i19 = this.size;
                this.size = i19 + 1;
                if (i19 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            if (z10 && k15 == null) {
                kArr[i14] = k10;
                this.valueTable[i14] = i10;
                int i20 = this.size;
                this.size = i20 + 1;
                if (i20 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            push(k10, i10, i13, k12, hash2, k13, hash3, k14, i14, k15);
            return;
        }
        throw new IllegalArgumentException("key cannot be null.");
    }

    public int remove(K k10, int i10) {
        int identityHashCode = System.identityHashCode(k10);
        int i11 = this.mask & identityHashCode;
        K[] kArr = this.keyTable;
        if (k10 == kArr[i11]) {
            kArr[i11] = null;
            this.size--;
            return this.valueTable[i11];
        }
        int hash2 = hash2(identityHashCode);
        K[] kArr2 = this.keyTable;
        if (k10 == kArr2[hash2]) {
            kArr2[hash2] = null;
            this.size--;
            return this.valueTable[hash2];
        }
        int hash3 = hash3(identityHashCode);
        K[] kArr3 = this.keyTable;
        if (k10 == kArr3[hash3]) {
            kArr3[hash3] = null;
            this.size--;
            return this.valueTable[hash3];
        }
        if (this.isBigTable) {
            int hash4 = hash4(identityHashCode);
            K[] kArr4 = this.keyTable;
            if (k10 == kArr4[hash4]) {
                kArr4[hash4] = null;
                this.size--;
                return this.valueTable[hash4];
            }
        }
        return removeStash(k10, i10);
    }

    public int removeStash(K k10, int i10) {
        K[] kArr = this.keyTable;
        int i11 = this.capacity;
        int i12 = this.stashSize + i11;
        while (i11 < i12) {
            if (k10 == kArr[i11]) {
                int i13 = this.valueTable[i11];
                removeStashIndex(i11);
                this.size--;
                return i13;
            }
            i11++;
        }
        return i10;
    }

    public void removeStashIndex(int i10) {
        int i11 = this.stashSize - 1;
        this.stashSize = i11;
        int i12 = this.capacity + i11;
        if (i10 < i12) {
            K[] kArr = this.keyTable;
            kArr[i10] = kArr[i12];
            int[] iArr = this.valueTable;
            iArr[i10] = iArr[i12];
        }
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
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('{');
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
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
                    sb2.append(iArr[i10]);
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
                    sb2.append(iArr[i11]);
                }
                i10 = i11;
            } else {
                sb2.append('}');
                return sb2.toString();
            }
        }
    }

    public IdentityObjectIntMap(int i10) {
        this(i10, 0.8f);
    }

    public IdentityObjectIntMap(int i10, float f) {
        if (i10 >= 0) {
            if (this.capacity <= 1073741824) {
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
                    this.valueTable = new int[kArr.length];
                    return;
                }
                throw new IllegalArgumentException("loadFactor must be > 0: " + f);
            }
            throw new IllegalArgumentException(l.i("initialCapacity is too large: ", i10));
        }
        throw new IllegalArgumentException(l.i("initialCapacity must be >= 0: ", i10));
    }

    public void clear() {
        K[] kArr = this.keyTable;
        int i10 = this.capacity + this.stashSize;
        while (true) {
            int i11 = i10 - 1;
            if (i10 > 0) {
                kArr[i11] = null;
                i10 = i11;
            } else {
                this.size = 0;
                this.stashSize = 0;
                return;
            }
        }
    }
}
