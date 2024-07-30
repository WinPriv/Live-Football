package com.esotericsoftware.kryo.util;

import a3.l;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.Arrays;

/* loaded from: classes.dex */
public class IntArray {
    public int[] items;
    public boolean ordered;
    public int size;

    public IntArray() {
        this(true, 16);
    }

    public void add(int i10) {
        int[] iArr = this.items;
        int i11 = this.size;
        if (i11 == iArr.length) {
            iArr = resize(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.size;
        this.size = i12 + 1;
        iArr[i12] = i10;
    }

    public void addAll(IntArray intArray) {
        addAll(intArray, 0, intArray.size);
    }

    public void clear() {
        this.size = 0;
    }

    public boolean contains(int i10) {
        int i11 = this.size - 1;
        int[] iArr = this.items;
        while (i11 >= 0) {
            int i12 = i11 - 1;
            if (iArr[i11] == i10) {
                return true;
            }
            i11 = i12;
        }
        return false;
    }

    public int[] ensureCapacity(int i10) {
        int i11 = this.size + i10;
        if (i11 >= this.items.length) {
            resize(Math.max(8, i11));
        }
        return this.items;
    }

    public int get(int i10) {
        if (i10 < this.size) {
            return this.items[i10];
        }
        throw new IndexOutOfBoundsException(String.valueOf(i10));
    }

    public int indexOf(int i10) {
        int[] iArr = this.items;
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] == i10) {
                return i12;
            }
        }
        return -1;
    }

    public void insert(int i10, int i11) {
        int[] iArr = this.items;
        int i12 = this.size;
        if (i12 == iArr.length) {
            iArr = resize(Math.max(8, (int) (i12 * 1.75f)));
        }
        if (this.ordered) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, this.size - i10);
        } else {
            iArr[this.size] = iArr[i10];
        }
        this.size++;
        iArr[i10] = i11;
    }

    public int peek() {
        return this.items[this.size - 1];
    }

    public int pop() {
        int[] iArr = this.items;
        int i10 = this.size - 1;
        this.size = i10;
        return iArr[i10];
    }

    public int removeIndex(int i10) {
        int i11 = this.size;
        if (i10 < i11) {
            int[] iArr = this.items;
            int i12 = iArr[i10];
            int i13 = i11 - 1;
            this.size = i13;
            if (this.ordered) {
                System.arraycopy(iArr, i10 + 1, iArr, i10, i13 - i10);
            } else {
                iArr[i10] = iArr[i13];
            }
            return i12;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i10));
    }

    public boolean removeValue(int i10) {
        int[] iArr = this.items;
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] == i10) {
                removeIndex(i12);
                return true;
            }
        }
        return false;
    }

    public int[] resize(int i10) {
        int[] iArr = new int[i10];
        int[] iArr2 = this.items;
        System.arraycopy(iArr2, 0, iArr, 0, Math.min(iArr2.length, i10));
        this.items = iArr;
        return iArr;
    }

    public void reverse() {
        int i10 = this.size;
        int i11 = i10 - 1;
        int i12 = i10 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 - i13;
            int[] iArr = this.items;
            int i15 = iArr[i13];
            iArr[i13] = iArr[i14];
            iArr[i14] = i15;
        }
    }

    public void set(int i10, int i11) {
        if (i10 < this.size) {
            this.items[i10] = i11;
            return;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i10));
    }

    public void shrink() {
        resize(this.size);
    }

    public void sort() {
        Arrays.sort(this.items, 0, this.size);
    }

    public void swap(int i10, int i11) {
        int i12 = this.size;
        if (i10 < i12) {
            if (i11 < i12) {
                int[] iArr = this.items;
                int i13 = iArr[i10];
                iArr[i10] = iArr[i11];
                iArr[i11] = i13;
                return;
            }
            throw new IndexOutOfBoundsException(String.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(String.valueOf(i10));
    }

    public int[] toArray() {
        int i10 = this.size;
        int[] iArr = new int[i10];
        System.arraycopy(this.items, 0, iArr, 0, i10);
        return iArr;
    }

    public String toString() {
        if (this.size == 0) {
            return ContentRecord.XRINFOLIST_NULL;
        }
        int[] iArr = this.items;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < this.size; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public void truncate(int i10) {
        if (this.size > i10) {
            this.size = i10;
        }
    }

    public IntArray(int i10) {
        this(true, i10);
    }

    public void addAll(IntArray intArray, int i10, int i11) {
        if (i10 + i11 <= intArray.size) {
            addAll(intArray.items, i10, i11);
        } else {
            StringBuilder r10 = l.r("offset + length must be <= size: ", i10, " + ", i11, " <= ");
            r10.append(intArray.size);
            throw new IllegalArgumentException(r10.toString());
        }
    }

    public IntArray(boolean z10, int i10) {
        this.ordered = z10;
        this.items = new int[i10];
    }

    public IntArray(IntArray intArray) {
        this.ordered = intArray.ordered;
        int i10 = intArray.size;
        this.size = i10;
        int[] iArr = new int[i10];
        this.items = iArr;
        System.arraycopy(intArray.items, 0, iArr, 0, i10);
    }

    public IntArray(int[] iArr) {
        this(true, iArr);
    }

    public String toString(String str) {
        if (this.size == 0) {
            return "";
        }
        int[] iArr = this.items;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < this.size; i10++) {
            sb2.append(str);
            sb2.append(iArr[i10]);
        }
        return sb2.toString();
    }

    public IntArray(boolean z10, int[] iArr) {
        this(z10, iArr.length);
        int length = iArr.length;
        this.size = length;
        System.arraycopy(iArr, 0, this.items, 0, length);
    }

    public void addAll(int[] iArr) {
        addAll(iArr, 0, iArr.length);
    }

    public void addAll(int[] iArr, int i10, int i11) {
        int[] iArr2 = this.items;
        int i12 = (this.size + i11) - i10;
        if (i12 >= iArr2.length) {
            iArr2 = resize(Math.max(8, (int) (i12 * 1.75f)));
        }
        System.arraycopy(iArr, i10, iArr2, this.size, i11);
        this.size += i11;
    }
}
