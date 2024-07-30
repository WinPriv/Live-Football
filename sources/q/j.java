package q;

import com.applovin.impl.sdk.utils.JsonUtils;

/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public final class j<E> implements Cloneable {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f34548v = new Object();

    /* renamed from: s, reason: collision with root package name */
    public int[] f34549s;

    /* renamed from: t, reason: collision with root package name */
    public Object[] f34550t;

    /* renamed from: u, reason: collision with root package name */
    public int f34551u;

    public j() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f34549s = new int[i13];
        this.f34550t = new Object[i13];
    }

    public final void a(int i10, E e10) {
        int i11 = this.f34551u;
        if (i11 != 0 && i10 <= this.f34549s[i11 - 1]) {
            d(i10, e10);
            return;
        }
        if (i11 >= this.f34549s.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] iArr = new int[i15];
            Object[] objArr = new Object[i15];
            int[] iArr2 = this.f34549s;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f34550t;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f34549s = iArr;
            this.f34550t = objArr;
        }
        this.f34549s[i11] = i10;
        this.f34550t[i11] = e10;
        this.f34551u = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j<E> clone() {
        try {
            j<E> jVar = (j) super.clone();
            jVar.f34549s = (int[]) this.f34549s.clone();
            jVar.f34550t = (Object[]) this.f34550t.clone();
            return jVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final Object c(int i10, Integer num) {
        Object obj;
        int c10 = e.c(this.f34551u, i10, this.f34549s);
        if (c10 >= 0 && (obj = this.f34550t[c10]) != f34548v) {
            return obj;
        }
        return num;
    }

    public final void d(int i10, E e10) {
        int c10 = e.c(this.f34551u, i10, this.f34549s);
        if (c10 >= 0) {
            this.f34550t[c10] = e10;
            return;
        }
        int i11 = ~c10;
        int i12 = this.f34551u;
        if (i11 < i12) {
            Object[] objArr = this.f34550t;
            if (objArr[i11] == f34548v) {
                this.f34549s[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (i12 >= this.f34549s.length) {
            int i13 = (i12 + 1) * 4;
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
            int i16 = i13 / 4;
            int[] iArr = new int[i16];
            Object[] objArr2 = new Object[i16];
            int[] iArr2 = this.f34549s;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f34550t;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f34549s = iArr;
            this.f34550t = objArr2;
        }
        int i17 = this.f34551u - i11;
        if (i17 != 0) {
            int[] iArr3 = this.f34549s;
            int i18 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i18, i17);
            Object[] objArr4 = this.f34550t;
            System.arraycopy(objArr4, i11, objArr4, i18, this.f34551u - i11);
        }
        this.f34549s[i11] = i10;
        this.f34550t[i11] = e10;
        this.f34551u++;
    }

    public final String toString() {
        int i10 = this.f34551u;
        if (i10 <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f34551u; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f34549s[i11]);
            sb2.append('=');
            Object obj = this.f34550t[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
