package q;

import com.applovin.impl.sdk.utils.JsonUtils;

/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public final class f<E> implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f34522w = new Object();

    /* renamed from: s, reason: collision with root package name */
    public boolean f34523s;

    /* renamed from: t, reason: collision with root package name */
    public long[] f34524t;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f34525u;

    /* renamed from: v, reason: collision with root package name */
    public int f34526v;

    public f() {
        this(10);
    }

    public final void a() {
        int i10 = this.f34526v;
        Object[] objArr = this.f34525u;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f34526v = 0;
        this.f34523s = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f34524t = (long[]) this.f34524t.clone();
            fVar.f34525u = (Object[]) this.f34525u.clone();
            return fVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void c() {
        int i10 = this.f34526v;
        long[] jArr = this.f34524t;
        Object[] objArr = this.f34525u;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f34522w) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f34523s = false;
        this.f34526v = i11;
    }

    public final Object d(long j10, Long l10) {
        Object obj;
        int e10 = e.e(this.f34524t, this.f34526v, j10);
        if (e10 >= 0 && (obj = this.f34525u[e10]) != f34522w) {
            return obj;
        }
        return l10;
    }

    public final long e(int i10) {
        if (this.f34523s) {
            c();
        }
        return this.f34524t[i10];
    }

    public final void f(long j10, E e10) {
        int e11 = e.e(this.f34524t, this.f34526v, j10);
        if (e11 >= 0) {
            this.f34525u[e11] = e10;
            return;
        }
        int i10 = ~e11;
        int i11 = this.f34526v;
        if (i10 < i11) {
            Object[] objArr = this.f34525u;
            if (objArr[i10] == f34522w) {
                this.f34524t[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f34523s && i11 >= this.f34524t.length) {
            c();
            i10 = ~e.e(this.f34524t, this.f34526v, j10);
        }
        int i12 = this.f34526v;
        if (i12 >= this.f34524t.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f34524t;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f34525u;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f34524t = jArr;
            this.f34525u = objArr2;
        }
        int i17 = this.f34526v - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f34524t;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f34525u;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f34526v - i10);
        }
        this.f34524t[i10] = j10;
        this.f34525u[i10] = e10;
        this.f34526v++;
    }

    public final void g(long j10) {
        int e10 = e.e(this.f34524t, this.f34526v, j10);
        if (e10 >= 0) {
            Object[] objArr = this.f34525u;
            Object obj = objArr[e10];
            Object obj2 = f34522w;
            if (obj != obj2) {
                objArr[e10] = obj2;
                this.f34523s = true;
            }
        }
    }

    public final int h() {
        if (this.f34523s) {
            c();
        }
        return this.f34526v;
    }

    public final E i(int i10) {
        if (this.f34523s) {
            c();
        }
        return (E) this.f34525u[i10];
    }

    public final String toString() {
        if (h() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f34526v * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f34526v; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(e(i10));
            sb2.append('=');
            E i11 = i(i10);
            if (i11 != this) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public f(int i10) {
        this.f34523s = false;
        if (i10 == 0) {
            this.f34524t = e.f34516t;
            this.f34525u = e.f34517u;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f34524t = new long[i14];
        this.f34525u = new Object[i14];
    }
}
