package com.anythink.expressad.exoplayer.k;

import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f9126a;

    /* renamed from: b, reason: collision with root package name */
    private int f9127b;

    /* renamed from: c, reason: collision with root package name */
    private int f9128c;

    /* renamed from: d, reason: collision with root package name */
    private int f9129d = 0;

    public t(byte[] bArr, int i10, int i11) {
        this.f9126a = bArr;
        this.f9128c = i10;
        this.f9127b = i11;
        g();
    }

    private void a(byte[] bArr, int i10, int i11) {
        this.f9126a = bArr;
        this.f9128c = i10;
        this.f9127b = i11;
        this.f9129d = 0;
        g();
    }

    private boolean c(int i10) {
        int i11 = this.f9128c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f9129d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f9127b) {
                break;
            }
            if (d(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f9127b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    private boolean e() {
        boolean z10;
        boolean z11;
        int i10 = this.f9128c;
        int i11 = this.f9129d;
        int i12 = 0;
        while (this.f9128c < this.f9127b && !b()) {
            i12++;
        }
        if (this.f9128c == this.f9127b) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9128c = i10;
        this.f9129d = i11;
        if (!z10) {
            int i13 = (i12 * 2) + 1;
            int i14 = i13 / 8;
            int i15 = i10 + i14;
            int i16 = (i11 + i13) - (i14 * 8);
            if (i16 > 7) {
                i15++;
                i16 -= 8;
            }
            while (true) {
                i10++;
                if (i10 > i15 || i15 >= this.f9127b) {
                    break;
                }
                if (d(i10)) {
                    i15++;
                    i10 += 2;
                }
            }
            int i17 = this.f9127b;
            if (i15 >= i17 && (i15 != i17 || i16 != 0)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    private int f() {
        int i10 = 0;
        int i11 = 0;
        while (!b()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = b(i11);
        }
        return i12 + i10;
    }

    private void g() {
        boolean z10;
        int i10;
        int i11 = this.f9128c;
        if (i11 >= 0 && (i11 < (i10 = this.f9127b) || (i11 == i10 && this.f9129d == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.b(z10);
    }

    public final boolean b() {
        boolean z10 = (this.f9126a[this.f9128c] & (128 >> this.f9129d)) != 0;
        a();
        return z10;
    }

    public final int d() {
        int f = f();
        return ((f + 1) / 2) * (f % 2 == 0 ? -1 : 1);
    }

    private boolean d(int i10) {
        if (2 > i10 || i10 >= this.f9127b) {
            return false;
        }
        byte[] bArr = this.f9126a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public final int b(int i10) {
        int i11;
        this.f9129d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f9129d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f9129d = i13;
            byte[] bArr = this.f9126a;
            int i14 = this.f9128c;
            i12 |= (bArr[i14] & DefaultClassResolver.NAME) << i13;
            if (!d(i14 + 1)) {
                r3 = 1;
            }
            this.f9128c = i14 + r3;
        }
        byte[] bArr2 = this.f9126a;
        int i15 = this.f9128c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & DefaultClassResolver.NAME) >> (8 - i11)));
        if (i11 == 8) {
            this.f9129d = 0;
            this.f9128c = i15 + (d(i15 + 1) ? 2 : 1);
        }
        g();
        return i16;
    }

    public final void a() {
        int i10 = this.f9129d + 1;
        this.f9129d = i10;
        if (i10 == 8) {
            this.f9129d = 0;
            int i11 = this.f9128c;
            this.f9128c = i11 + (d(i11 + 1) ? 2 : 1);
        }
        g();
    }

    public final int c() {
        return f();
    }

    public final void a(int i10) {
        int i11 = this.f9128c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f9128c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f9129d;
        this.f9129d = i14;
        if (i14 > 7) {
            this.f9128c = i13 + 1;
            this.f9129d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 <= this.f9128c) {
                if (d(i11)) {
                    this.f9128c++;
                    i11 += 2;
                }
            } else {
                g();
                return;
            }
        }
    }
}
