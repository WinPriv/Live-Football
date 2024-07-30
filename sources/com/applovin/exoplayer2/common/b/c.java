package com.applovin.exoplayer2.common.b;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static class a extends AbstractList<Integer> implements Serializable, RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        final int[] f13848a;

        /* renamed from: b, reason: collision with root package name */
        final int f13849b;

        /* renamed from: c, reason: collision with root package name */
        final int f13850c;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            return Integer.valueOf(this.f13848a[this.f13849b + i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if ((obj instanceof Integer) && c.c(this.f13848a, ((Integer) obj).intValue(), this.f13849b, this.f13850c) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f13848a[this.f13849b + i10] != aVar.f13848a[aVar.f13849b + i10]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f13849b; i11 < this.f13850c; i11++) {
                i10 = (i10 * 31) + c.a(this.f13848a[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int c10;
            if ((obj instanceof Integer) && (c10 = c.c(this.f13848a, ((Integer) obj).intValue(), this.f13849b, this.f13850c)) >= 0) {
                return c10 - this.f13849b;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int d10;
            if ((obj instanceof Integer) && (d10 = c.d(this.f13848a, ((Integer) obj).intValue(), this.f13849b, this.f13850c)) >= 0) {
                return d10 - this.f13849b;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f13850c - this.f13849b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f13848a;
            int i12 = this.f13849b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f13848a[this.f13849b]);
            int i10 = this.f13849b;
            while (true) {
                i10++;
                if (i10 < this.f13850c) {
                    sb2.append(", ");
                    sb2.append(this.f13848a[i10]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        public a(int[] iArr, int i10, int i11) {
            this.f13848a = iArr;
            this.f13849b = i10;
            this.f13850c = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer set(int i10, Integer num) {
            Preconditions.checkElementIndex(i10, size());
            int[] iArr = this.f13848a;
            int i11 = this.f13849b;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i12);
        }

        public int[] a() {
            return Arrays.copyOfRange(this.f13848a, this.f13849b, this.f13850c);
        }
    }

    public static int a(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int a(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int a(long j10) {
        int i10 = (int) j10;
        Preconditions.checkArgument(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int[] a(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) Preconditions.checkNotNull(array[i10])).intValue();
        }
        return iArr;
    }

    public static List<Integer> a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(iArr);
    }
}
