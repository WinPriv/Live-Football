package l7;

import androidx.transition.n;
import i7.f;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: Ints.java */
/* loaded from: classes2.dex */
public final class a extends n {

    /* compiled from: Ints.java */
    /* renamed from: l7.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0438a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: s, reason: collision with root package name */
        public final int[] f32541s;

        /* renamed from: t, reason: collision with root package name */
        public final int f32542t;

        /* renamed from: u, reason: collision with root package name */
        public final int f32543u;

        public C0438a(int[] iArr, int i10, int i11) {
            this.f32541s = iArr;
            this.f32542t = i10;
            this.f32543u = i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                int i10 = this.f32542t;
                while (true) {
                    if (i10 < this.f32543u) {
                        if (this.f32541s[i10] == intValue) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0438a) {
                C0438a c0438a = (C0438a) obj;
                int i10 = this.f32543u;
                int i11 = this.f32542t;
                int i12 = i10 - i11;
                if (c0438a.f32543u - c0438a.f32542t != i12) {
                    return false;
                }
                for (int i13 = 0; i13 < i12; i13++) {
                    if (this.f32541s[i11 + i13] != c0438a.f32541s[c0438a.f32542t + i13]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i10) {
            int i11 = this.f32543u;
            int i12 = this.f32542t;
            f.b(i10, i11 - i12);
            return Integer.valueOf(this.f32541s[i12 + i10]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i10 = 1;
            for (int i11 = this.f32542t; i11 < this.f32543u; i11++) {
                i10 = (i10 * 31) + this.f32541s[i11];
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                int i10 = this.f32542t;
                int i11 = i10;
                while (true) {
                    if (i11 < this.f32543u) {
                        if (this.f32541s[i11] == intValue) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 >= 0) {
                    return i11 - i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(@CheckForNull Object obj) {
            int i10;
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                int i11 = this.f32543u - 1;
                while (true) {
                    i10 = this.f32542t;
                    if (i11 >= i10) {
                        if (this.f32541s[i11] == intValue) {
                            break;
                        }
                        i11--;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 >= 0) {
                    return i11 - i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i10, Object obj) {
            Integer num = (Integer) obj;
            int i11 = this.f32543u;
            int i12 = this.f32542t;
            f.b(i10, i11 - i12);
            int i13 = i12 + i10;
            int[] iArr = this.f32541s;
            int i14 = iArr[i13];
            num.getClass();
            iArr[i13] = num.intValue();
            return Integer.valueOf(i14);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f32543u - this.f32542t;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i10, int i11) {
            int i12 = this.f32543u;
            int i13 = this.f32542t;
            f.e(i10, i11, i12 - i13);
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return new C0438a(this.f32541s, i10 + i13, i13 + i11);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            int i10 = this.f32543u;
            int i11 = this.f32542t;
            StringBuilder sb2 = new StringBuilder((i10 - i11) * 5);
            sb2.append('[');
            int[] iArr = this.f32541s;
            sb2.append(iArr[i11]);
            while (true) {
                i11++;
                if (i11 < i10) {
                    sb2.append(", ");
                    sb2.append(iArr[i11]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }
    }

    public static int g0(long j10) {
        boolean z10;
        int i10 = (int) j10;
        if (i10 == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return i10;
        }
        throw new IllegalArgumentException(f.g("Out of range: %s", Long.valueOf(j10)));
    }

    public static int h0(int i10, int i11) {
        boolean z10;
        if (i11 <= 1073741823) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.min(Math.max(i10, i11), 1073741823);
        }
        throw new IllegalArgumentException(f.g("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i11), 1073741823));
    }

    public static int i0(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] j0(Collection<? extends Number> collection) {
        if (collection instanceof C0438a) {
            C0438a c0438a = (C0438a) collection;
            return Arrays.copyOfRange(c0438a.f32541s, c0438a.f32542t, c0438a.f32543u);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
