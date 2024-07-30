package com.applovin.exoplayer2.l;

import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f16370a;

    /* renamed from: b, reason: collision with root package name */
    private int f16371b;

    /* renamed from: c, reason: collision with root package name */
    private int f16372c;

    /* renamed from: d, reason: collision with root package name */
    private int f16373d;

    public z(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11);
    }

    private int f() {
        int i10 = 0;
        int i11 = 0;
        while (!b()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = c(i11);
        }
        return i12 + i10;
    }

    private void g() {
        boolean z10;
        int i10;
        int i11 = this.f16372c;
        if (i11 >= 0 && (i11 < (i10 = this.f16371b) || (i11 == i10 && this.f16373d == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.b(z10);
    }

    public void a(byte[] bArr, int i10, int i11) {
        this.f16370a = bArr;
        this.f16372c = i10;
        this.f16371b = i11;
        this.f16373d = 0;
        g();
    }

    public boolean b(int i10) {
        int i11 = this.f16372c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f16373d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f16371b) {
                break;
            }
            if (d(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f16371b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public int c(int i10) {
        int i11;
        this.f16373d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f16373d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f16373d = i13;
            byte[] bArr = this.f16370a;
            int i14 = this.f16372c;
            i12 |= (bArr[i14] & DefaultClassResolver.NAME) << i13;
            if (!d(i14 + 1)) {
                r3 = 1;
            }
            this.f16372c = i14 + r3;
        }
        byte[] bArr2 = this.f16370a;
        int i15 = this.f16372c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & DefaultClassResolver.NAME) >> (8 - i11)));
        if (i11 == 8) {
            this.f16373d = 0;
            this.f16372c = i15 + (d(i15 + 1) ? 2 : 1);
        }
        g();
        return i16;
    }

    public int d() {
        return f();
    }

    public int e() {
        int i10;
        int f = f();
        if (f % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return ((f + 1) / 2) * i10;
    }

    private boolean d(int i10) {
        if (2 <= i10 && i10 < this.f16371b) {
            byte[] bArr = this.f16370a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        int i10 = this.f16373d + 1;
        this.f16373d = i10;
        if (i10 == 8) {
            this.f16373d = 0;
            int i11 = this.f16372c;
            this.f16372c = i11 + (d(i11 + 1) ? 2 : 1);
        }
        g();
    }

    public boolean b() {
        boolean z10 = (this.f16370a[this.f16372c] & (128 >> this.f16373d)) != 0;
        a();
        return z10;
    }

    public void a(int i10) {
        int i11 = this.f16372c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f16372c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f16373d;
        this.f16373d = i14;
        if (i14 > 7) {
            this.f16372c = i13 + 1;
            this.f16373d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 <= this.f16372c) {
                if (d(i11)) {
                    this.f16372c++;
                    i11 += 2;
                }
            } else {
                g();
                return;
            }
        }
    }

    public boolean c() {
        int i10 = this.f16372c;
        int i11 = this.f16373d;
        int i12 = 0;
        while (this.f16372c < this.f16371b && !b()) {
            i12++;
        }
        boolean z10 = this.f16372c == this.f16371b;
        this.f16372c = i10;
        this.f16373d = i11;
        return !z10 && b((i12 * 2) + 1);
    }
}
