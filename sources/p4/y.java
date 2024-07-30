package p4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* compiled from: VorbisBitArray.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34367a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f34368b;

    /* renamed from: c, reason: collision with root package name */
    public int f34369c;

    /* renamed from: d, reason: collision with root package name */
    public int f34370d;

    /* renamed from: e, reason: collision with root package name */
    public int f34371e;

    public y(byte[] bArr, int i10, int i11) {
        this.f34367a = 1;
        this.f34368b = bArr;
        this.f34370d = i10;
        this.f34369c = i11;
        this.f34371e = 0;
        a();
    }

    public final void a() {
        int i10;
        int i11;
        boolean z10 = true;
        switch (this.f34367a) {
            case 0:
                int i12 = this.f34370d;
                if (i12 < 0 || (i12 >= (i11 = this.f34369c) && (i12 != i11 || this.f34371e != 0))) {
                    z10 = false;
                }
                d6.a.d(z10);
                return;
            default:
                int i13 = this.f34370d;
                if (i13 < 0 || (i13 >= (i10 = this.f34369c) && (i13 != i10 || this.f34371e != 0))) {
                    z10 = false;
                }
                d6.a.d(z10);
                return;
        }
    }

    public final boolean b(int i10) {
        int i11 = this.f34370d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f34371e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f34369c) {
                break;
            }
            if (h(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f34369c;
        if (i13 < i15) {
            return true;
        }
        if (i13 == i15 && i14 == 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        boolean z10;
        int i10 = this.f34370d;
        int i11 = this.f34371e;
        int i12 = 0;
        while (this.f34370d < this.f34369c && !d()) {
            i12++;
        }
        if (this.f34370d == this.f34369c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34370d = i10;
        this.f34371e = i11;
        if (z10 || !b((i12 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        boolean z10 = false;
        switch (this.f34367a) {
            case 0:
                if ((((this.f34368b[this.f34370d] & DefaultClassResolver.NAME) >> this.f34371e) & 1) == 1) {
                    z10 = true;
                }
                j(1);
                return z10;
            default:
                if ((this.f34368b[this.f34370d] & (128 >> this.f34371e)) != 0) {
                    z10 = true;
                }
                i();
                return z10;
        }
    }

    public final int e(int i10) {
        switch (this.f34367a) {
            case 0:
                int i11 = this.f34370d;
                int min = Math.min(i10, 8 - this.f34371e);
                int i12 = i11 + 1;
                int i13 = ((this.f34368b[i11] & DefaultClassResolver.NAME) >> this.f34371e) & (com.anythink.expressad.exoplayer.k.p.f9095b >> (8 - min));
                while (min < i10) {
                    i13 |= (this.f34368b[i12] & DefaultClassResolver.NAME) << min;
                    min += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i10));
                j(i10);
                return i14;
            default:
                this.f34371e += i10;
                int i15 = 0;
                while (true) {
                    int i16 = this.f34371e;
                    int i17 = 1;
                    if (i16 > 8) {
                        int i18 = i16 - 8;
                        this.f34371e = i18;
                        byte[] bArr = this.f34368b;
                        int i19 = this.f34370d;
                        i15 |= (bArr[i19] & DefaultClassResolver.NAME) << i18;
                        if (h(i19 + 1)) {
                            i17 = 2;
                        }
                        this.f34370d = i19 + i17;
                    } else {
                        byte[] bArr2 = this.f34368b;
                        int i20 = this.f34370d;
                        int i21 = ((-1) >>> (32 - i10)) & (((255 & bArr2[i20]) >> (8 - i16)) | i15);
                        if (i16 == 8) {
                            this.f34371e = 0;
                            if (h(i20 + 1)) {
                                i17 = 2;
                            }
                            this.f34370d = i20 + i17;
                        }
                        a();
                        return i21;
                    }
                }
        }
    }

    public final int f() {
        int i10 = 0;
        int i11 = 0;
        while (!d()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = e(i11);
        }
        return i12 + i10;
    }

    public final int g() {
        int i10;
        int f = f();
        if (f % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return ((f + 1) / 2) * i10;
    }

    public final boolean h(int i10) {
        if (2 <= i10 && i10 < this.f34369c) {
            byte[] bArr = this.f34368b;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        int i10 = 1;
        int i11 = this.f34371e + 1;
        this.f34371e = i11;
        if (i11 == 8) {
            this.f34371e = 0;
            int i12 = this.f34370d;
            if (h(i12 + 1)) {
                i10 = 2;
            }
            this.f34370d = i12 + i10;
        }
        a();
    }

    public final void j(int i10) {
        switch (this.f34367a) {
            case 0:
                int i11 = i10 / 8;
                int i12 = this.f34370d + i11;
                this.f34370d = i12;
                int i13 = (i10 - (i11 * 8)) + this.f34371e;
                this.f34371e = i13;
                if (i13 > 7) {
                    this.f34370d = i12 + 1;
                    this.f34371e = i13 - 8;
                }
                a();
                return;
            default:
                int i14 = this.f34370d;
                int i15 = i10 / 8;
                int i16 = i14 + i15;
                this.f34370d = i16;
                int i17 = (i10 - (i15 * 8)) + this.f34371e;
                this.f34371e = i17;
                if (i17 > 7) {
                    this.f34370d = i16 + 1;
                    this.f34371e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 <= this.f34370d) {
                        if (h(i14)) {
                            this.f34370d++;
                            i14 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
        }
    }

    public y(byte[] bArr) {
        this.f34367a = 0;
        this.f34368b = bArr;
        this.f34369c = bArr.length;
    }
}
