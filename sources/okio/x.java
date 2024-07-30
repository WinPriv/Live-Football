package okio;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: SegmentedByteString.java */
/* loaded from: classes2.dex */
public final class x extends e {

    /* renamed from: x, reason: collision with root package name */
    public final transient byte[][] f33885x;
    public final transient int[] y;

    public x(b bVar, int i10) {
        super(null);
        b0.a(bVar.f33824t, 0L, i10);
        v vVar = bVar.f33823s;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = vVar.f33879c;
            int i15 = vVar.f33878b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                vVar = vVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f33885x = new byte[i13];
        this.y = new int[i13 * 2];
        v vVar2 = bVar.f33823s;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f33885x;
            bArr[i16] = vVar2.f33877a;
            int i17 = vVar2.f33879c;
            int i18 = vVar2.f33878b;
            int i19 = (i17 - i18) + i11;
            if (i19 > i10) {
                i11 = i10;
            } else {
                i11 = i19;
            }
            int[] iArr = this.y;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            vVar2.f33880d = true;
            i16++;
            vVar2 = vVar2.f;
        }
    }

    @Override // okio.e
    public final int A() {
        return this.y[this.f33885x.length - 1];
    }

    @Override // okio.e
    public final e C() {
        return K().C();
    }

    @Override // okio.e
    public final e E() {
        return K().E();
    }

    @Override // okio.e
    public final byte[] F() {
        byte[][] bArr = this.f33885x;
        int length = bArr.length - 1;
        int[] iArr = this.y;
        byte[] bArr2 = new byte[iArr[length]];
        int length2 = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length2) {
            int i12 = iArr[length2 + i10];
            int i13 = iArr[i10];
            System.arraycopy(bArr[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // okio.e
    public final String G() {
        return K().G();
    }

    @Override // okio.e
    public final void H(b bVar) {
        byte[][] bArr = this.f33885x;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.y;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            v vVar = new v(bArr[i10], i12, (i12 + i13) - i11, true, false);
            v vVar2 = bVar.f33823s;
            if (vVar2 == null) {
                vVar.f33882g = vVar;
                vVar.f = vVar;
                bVar.f33823s = vVar;
            } else {
                vVar2.f33882g.b(vVar);
            }
            i10++;
            i11 = i13;
        }
        bVar.f33824t += i11;
    }

    public final int I(int i10) {
        int binarySearch = Arrays.binarySearch(this.y, 0, this.f33885x.length, i10 + 1);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        return binarySearch;
    }

    public final e K() {
        return new e(F());
    }

    @Override // okio.e
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.A() == A() && x(eVar, A())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.e
    public final int hashCode() {
        int i10 = this.f33836t;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f33885x;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr2 = bArr[i11];
            int[] iArr = this.y;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f33836t = i12;
        return i12;
    }

    @Override // okio.e
    public final String k() {
        return K().k();
    }

    @Override // okio.e
    public final byte q(int i10) {
        int i11;
        byte[][] bArr = this.f33885x;
        int length = bArr.length - 1;
        int[] iArr = this.y;
        b0.a(iArr[length], i10, 1L);
        int I = I(i10);
        if (I == 0) {
            i11 = 0;
        } else {
            i11 = iArr[I - 1];
        }
        return bArr[I][(i10 - i11) + iArr[bArr.length + I]];
    }

    @Override // okio.e
    public final String r() {
        return K().r();
    }

    @Override // okio.e
    public final String toString() {
        return K().toString();
    }

    @Override // okio.e
    public final byte[] u() {
        return F();
    }

    @Override // okio.e
    public final boolean w(int i10, int i11, int i12, byte[] bArr) {
        int i13;
        if (i10 < 0 || i10 > A() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int I = I(i10);
        while (true) {
            boolean z10 = true;
            if (i12 <= 0) {
                return true;
            }
            int[] iArr = this.y;
            if (I == 0) {
                i13 = 0;
            } else {
                i13 = iArr[I - 1];
            }
            int min = Math.min(i12, ((iArr[I] - i13) + i13) - i10);
            byte[][] bArr2 = this.f33885x;
            int i14 = (i10 - i13) + iArr[bArr2.length + I];
            byte[] bArr3 = bArr2[I];
            Charset charset = b0.f33832a;
            int i15 = 0;
            while (true) {
                if (i15 >= min) {
                    break;
                }
                if (bArr3[i15 + i14] != bArr[i15 + i11]) {
                    z10 = false;
                    break;
                }
                i15++;
            }
            if (!z10) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            I++;
        }
    }

    @Override // okio.e
    public final boolean x(e eVar, int i10) {
        int i11;
        if (A() - i10 < 0) {
            return false;
        }
        int I = I(0);
        int i12 = 0;
        int i13 = 0;
        while (i10 > 0) {
            int[] iArr = this.y;
            if (I == 0) {
                i11 = 0;
            } else {
                i11 = iArr[I - 1];
            }
            int min = Math.min(i10, ((iArr[I] - i11) + i11) - i12);
            byte[][] bArr = this.f33885x;
            if (!eVar.w(i13, (i12 - i11) + iArr[bArr.length + I], min, bArr[I])) {
                return false;
            }
            i12 += min;
            i13 += min;
            i10 -= min;
            I++;
        }
        return true;
    }
}
