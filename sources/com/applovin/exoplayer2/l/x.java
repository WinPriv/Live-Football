package com.applovin.exoplayer2.l;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f16363a;

    /* renamed from: b, reason: collision with root package name */
    private int f16364b;

    /* renamed from: c, reason: collision with root package name */
    private int f16365c;

    /* renamed from: d, reason: collision with root package name */
    private int f16366d;

    public x() {
        this.f16363a = ai.f;
    }

    private void g() {
        boolean z10;
        int i10;
        int i11 = this.f16364b;
        if (i11 >= 0 && (i11 < (i10 = this.f16366d) || (i11 == i10 && this.f16365c == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.b(z10);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public int b() {
        return (this.f16364b * 8) + this.f16365c;
    }

    public int c() {
        a.b(this.f16365c == 0);
        return this.f16364b;
    }

    public void d() {
        int i10 = this.f16365c + 1;
        this.f16365c = i10;
        if (i10 == 8) {
            this.f16365c = 0;
            this.f16364b++;
        }
        g();
    }

    public boolean e() {
        boolean z10 = (this.f16363a[this.f16364b] & (128 >> this.f16365c)) != 0;
        d();
        return z10;
    }

    public void f() {
        if (this.f16365c == 0) {
            return;
        }
        this.f16365c = 0;
        this.f16364b++;
        g();
    }

    public void a(y yVar) {
        a(yVar.d(), yVar.b());
        a(yVar.c() * 8);
    }

    public void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f16364b + i11;
        this.f16364b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f16365c;
        this.f16365c = i13;
        if (i13 > 7) {
            this.f16364b = i12 + 1;
            this.f16365c = i13 - 8;
        }
        g();
    }

    public x(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public int c(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f16365c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f16365c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f16365c = i13;
            byte[] bArr = this.f16363a;
            int i14 = this.f16364b;
            this.f16364b = i14 + 1;
            i12 |= (bArr[i14] & DefaultClassResolver.NAME) << i13;
        }
        byte[] bArr2 = this.f16363a;
        int i15 = this.f16364b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & DefaultClassResolver.NAME) >> (8 - i11)));
        if (i11 == 8) {
            this.f16365c = 0;
            this.f16364b = i15 + 1;
        }
        g();
        return i16;
    }

    public void e(int i10) {
        a.b(this.f16365c == 0);
        this.f16364b += i10;
        g();
    }

    public x(byte[] bArr, int i10) {
        this.f16363a = bArr;
        this.f16366d = i10;
    }

    public void a(byte[] bArr, int i10) {
        this.f16363a = bArr;
        this.f16364b = 0;
        this.f16365c = 0;
        this.f16366d = i10;
    }

    public long d(int i10) {
        if (i10 <= 32) {
            return ai.b(c(i10));
        }
        return ai.b(c(i10 - 32), c(32));
    }

    public int a() {
        return ((this.f16366d - this.f16364b) * 8) - this.f16365c;
    }

    public void b(byte[] bArr, int i10, int i11) {
        a.b(this.f16365c == 0);
        System.arraycopy(this.f16363a, this.f16364b, bArr, i10, i11);
        this.f16364b += i11;
        g();
    }

    public void a(int i10) {
        int i11 = i10 / 8;
        this.f16364b = i11;
        this.f16365c = i10 - (i11 * 8);
        g();
    }

    public void a(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f16363a;
            int i13 = this.f16364b;
            int i14 = i13 + 1;
            this.f16364b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f16365c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (com.anythink.expressad.exoplayer.k.p.f9095b >> i16));
        bArr[i12] = b12;
        int i17 = this.f16365c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f16363a;
            int i18 = this.f16364b;
            this.f16364b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & DefaultClassResolver.NAME) << i17));
            this.f16365c = i17 - 8;
        }
        int i19 = this.f16365c + i16;
        this.f16365c = i19;
        byte[] bArr4 = this.f16363a;
        int i20 = this.f16364b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f16365c = 0;
            this.f16364b = i20 + 1;
        }
        g();
    }

    public String a(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        b(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void a(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f16365c, i11);
        int i12 = this.f16365c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f16363a;
        int i14 = this.f16364b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - min;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f16363a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f16363a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        b(i11);
        g();
    }
}
