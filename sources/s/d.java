package s;

import a3.k;
import java.util.Arrays;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class d implements m0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35023a;

    /* renamed from: b, reason: collision with root package name */
    public Object f35024b;

    /* renamed from: c, reason: collision with root package name */
    public int f35025c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d() {
        this(32, 2);
        this.f35023a = 2;
    }

    @Override // m0.d
    public boolean a(Object obj) {
        int i10;
        boolean z10;
        switch (this.f35023a) {
            case 0:
                int i11 = this.f35025c;
                Object[] objArr = (Object[]) this.f35024b;
                if (i11 >= objArr.length) {
                    return false;
                }
                objArr[i11] = obj;
                this.f35025c = i11 + 1;
                return true;
            default:
                int i12 = 0;
                while (true) {
                    i10 = this.f35025c;
                    if (i12 < i10) {
                        if (((Object[]) this.f35024b)[i12] == obj) {
                            z10 = true;
                        } else {
                            i12++;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    Object[] objArr2 = (Object[]) this.f35024b;
                    if (i10 >= objArr2.length) {
                        return false;
                    }
                    objArr2[i10] = obj;
                    this.f35025c = i10 + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
        }
    }

    @Override // m0.d
    public Object b() {
        switch (this.f35023a) {
            case 0:
                int i10 = this.f35025c;
                if (i10 <= 0) {
                    return null;
                }
                int i11 = i10 - 1;
                Object[] objArr = (Object[]) this.f35024b;
                Object obj = objArr[i11];
                objArr[i11] = null;
                this.f35025c = i11;
                return obj;
            default:
                int i12 = this.f35025c;
                if (i12 <= 0) {
                    return null;
                }
                int i13 = i12 - 1;
                Object[] objArr2 = (Object[]) this.f35024b;
                Object obj2 = objArr2[i13];
                objArr2[i13] = null;
                this.f35025c = i13;
                return obj2;
        }
    }

    public final void c(long j10) {
        int i10 = this.f35025c;
        Object obj = this.f35024b;
        if (i10 == ((long[]) obj).length) {
            this.f35024b = Arrays.copyOf((long[]) obj, i10 * 2);
        }
        long[] jArr = (long[]) this.f35024b;
        int i11 = this.f35025c;
        this.f35025c = i11 + 1;
        jArr[i11] = j10;
    }

    public final long d(int i10) {
        if (i10 >= 0 && i10 < this.f35025c) {
            return ((long[]) this.f35024b)[i10];
        }
        StringBuilder n10 = k.n("Invalid index ", i10, ", size is ");
        n10.append(this.f35025c);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public d(int i10, int i11) {
        this.f35023a = i11;
        if (i11 == 1) {
            if (i10 > 0) {
                this.f35024b = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        if (i11 == 2) {
            this.f35024b = new long[i10];
        } else {
            if (i10 > 0) {
                this.f35024b = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }
}
