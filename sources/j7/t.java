package j7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: CompactLinkedHashSet.java */
/* loaded from: classes2.dex */
public final class t<E> extends q<E> {
    public transient int A;

    /* renamed from: x, reason: collision with root package name */
    @CheckForNull
    public transient int[] f30099x;

    @CheckForNull
    public transient int[] y;

    /* renamed from: z, reason: collision with root package name */
    public transient int f30100z;

    public t(int i10) {
        super(i10);
    }

    @Override // j7.q
    public final void F(int i10) {
        super.F(i10);
        int[] iArr = this.f30099x;
        Objects.requireNonNull(iArr);
        this.f30099x = Arrays.copyOf(iArr, i10);
        int[] iArr2 = this.y;
        Objects.requireNonNull(iArr2);
        this.y = Arrays.copyOf(iArr2, i10);
    }

    public final void H(int i10, int i11) {
        if (i10 == -2) {
            this.f30100z = i11;
        } else {
            int[] iArr = this.y;
            Objects.requireNonNull(iArr);
            iArr[i10] = i11 + 1;
        }
        if (i11 == -2) {
            this.A = i10;
            return;
        }
        int[] iArr2 = this.f30099x;
        Objects.requireNonNull(iArr2);
        iArr2[i11] = i10 + 1;
    }

    @Override // j7.q
    public final int a(int i10, int i11) {
        if (i10 >= size()) {
            return i11;
        }
        return i10;
    }

    @Override // j7.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (A()) {
            return;
        }
        this.f30100z = -2;
        this.A = -2;
        int[] iArr = this.f30099x;
        if (iArr != null && this.y != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.y, 0, size(), 0);
        }
        super.clear();
    }

    @Override // j7.q
    public final int p() {
        int p10 = super.p();
        this.f30099x = new int[p10];
        this.y = new int[p10];
        return p10;
    }

    @Override // j7.q
    public final LinkedHashSet q() {
        LinkedHashSet q10 = super.q();
        this.f30099x = null;
        this.y = null;
        return q10;
    }

    @Override // j7.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            tArr[i10] = it.next();
            i10++;
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    @Override // j7.q
    public final int u() {
        return this.f30100z;
    }

    @Override // j7.q
    public final int v(int i10) {
        Objects.requireNonNull(this.y);
        return r0[i10] - 1;
    }

    @Override // j7.q
    public final void w(int i10) {
        super.w(i10);
        this.f30100z = -2;
        this.A = -2;
    }

    @Override // j7.q
    public final void x(int i10, int i11, int i12, Object obj) {
        super.x(i10, i11, i12, obj);
        H(this.A, i10);
        H(i10, -2);
    }

    @Override // j7.q
    public final void y(int i10, int i11) {
        int size = size() - 1;
        super.y(i10, i11);
        Objects.requireNonNull(this.f30099x);
        H(r4[i10] - 1, v(i10));
        if (i10 < size) {
            Objects.requireNonNull(this.f30099x);
            H(r4[size] - 1, i10);
            H(i10, v(size));
        }
        int[] iArr = this.f30099x;
        Objects.requireNonNull(iArr);
        iArr[size] = 0;
        int[] iArr2 = this.y;
        Objects.requireNonNull(iArr2);
        iArr2[size] = 0;
    }

    @Override // j7.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }
}
