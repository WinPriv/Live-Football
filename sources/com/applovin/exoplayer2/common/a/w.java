package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class w<E> extends q<E> implements Set<E> {

    /* renamed from: a, reason: collision with root package name */
    @RetainedWith
    @NullableDecl
    private transient s<E> f13840a;

    private static boolean a(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static <E> w<E> g() {
        return am.f13709a;
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract ax<E> iterator();

    @Override // com.applovin.exoplayer2.common.a.q
    public s<E> e() {
        s<E> sVar = this.f13840a;
        if (sVar == null) {
            s<E> i10 = i();
            this.f13840a = i10;
            return i10;
        }
        return sVar;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w) && h() && ((w) obj).h() && hashCode() != obj.hashCode()) {
            return false;
        }
        return aq.a(this, obj);
    }

    public boolean h() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return aq.a(this);
    }

    public s<E> i() {
        return s.b(toArray());
    }

    public static <E> w<E> a(E e10) {
        return new ar(e10);
    }

    public static <E> w<E> a(E e10, E e11) {
        return a(2, e10, e11);
    }

    public static <E> w<E> a(E e10, E e11, E e12) {
        return a(3, e10, e11, e12);
    }

    private static <E> w<E> a(int i10, Object... objArr) {
        if (i10 == 0) {
            return g();
        }
        if (i10 != 1) {
            int a10 = a(i10);
            Object[] objArr2 = new Object[a10];
            int i11 = a10 - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object a11 = ah.a(objArr[i14], i14);
                int hashCode = a11.hashCode();
                int a12 = p.a(hashCode);
                while (true) {
                    int i15 = a12 & i11;
                    Object obj = objArr2[i15];
                    if (obj == null) {
                        objArr[i13] = a11;
                        objArr2[i15] = a11;
                        i12 += hashCode;
                        i13++;
                        break;
                    }
                    if (obj.equals(a11)) {
                        break;
                    }
                    a12++;
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                return new ar(objArr[0], i12);
            }
            if (a(i13) < a10 / 2) {
                return a(i13, objArr);
            }
            if (a(i13, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i13);
            }
            return new am(objArr, i12, objArr2, i11, i13);
        }
        return a(objArr[0]);
    }

    public static int a(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        Preconditions.checkArgument(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static <E> w<E> a(Collection<? extends E> collection) {
        if ((collection instanceof w) && !(collection instanceof SortedSet)) {
            w<E> wVar = (w) collection;
            if (!wVar.f()) {
                return wVar;
            }
        }
        Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static <E> w<E> a(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return g();
        }
        if (length != 1) {
            return a(eArr.length, (Object[]) eArr.clone());
        }
        return a(eArr[0]);
    }
}
