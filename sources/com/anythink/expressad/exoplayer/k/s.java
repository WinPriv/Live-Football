package com.anythink.expressad.exoplayer.k;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9123a;

    /* renamed from: b, reason: collision with root package name */
    private int f9124b;

    /* renamed from: c, reason: collision with root package name */
    private int f9125c;

    public s() {
    }

    public s(int i10) {
        this.f9123a = new byte[i10];
        this.f9125c = i10;
    }

    private int A() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & DefaultClassResolver.NAME) | ((bArr[i11] & DefaultClassResolver.NAME) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & DefaultClassResolver.NAME) << 16);
        this.f9124b = i14 + 1;
        return ((bArr[i14] & DefaultClassResolver.NAME) << 24) | i15;
    }

    private long B() {
        byte[] bArr = this.f9123a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f9124b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j12 = j11 | ((bArr[i10] & 255) << 24);
        long j13 = j12 | ((bArr[r3] & 255) << 32);
        long j14 = j13 | ((bArr[r4] & 255) << 40);
        long j15 = j14 | ((bArr[r3] & 255) << 48);
        this.f9124b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | ((bArr[r4] & 255) << 56);
    }

    private int C() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & DefaultClassResolver.NAME) | ((bArr[i11] & DefaultClassResolver.NAME) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & DefaultClassResolver.NAME) << 16);
        this.f9124b = i14 + 1;
        int i16 = ((bArr[i14] & DefaultClassResolver.NAME) << 24) | i15;
        if (i16 >= 0) {
            return i16;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(i16)));
    }

    private float D() {
        return Float.intBitsToFloat(i());
    }

    private double E() {
        return Double.longBitsToDouble(j());
    }

    private String F() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f9124b;
        while (i10 < this.f9125c && !af.a((int) this.f9123a[i10])) {
            i10++;
        }
        int i11 = this.f9124b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f9123a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f9124b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f9123a;
        int i12 = this.f9124b;
        String a10 = af.a(bArr2, i12, i10 - i12);
        this.f9124b = i10;
        int i13 = this.f9125c;
        if (i10 == i13) {
            return a10;
        }
        byte[] bArr3 = this.f9123a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f9124b = i14;
            if (i14 == i13) {
                return a10;
            }
        }
        int i15 = this.f9124b;
        if (bArr3[i15] == 10) {
            this.f9124b = i15 + 1;
        }
        return a10;
    }

    private long G() {
        int i10;
        int i11;
        long j10 = this.f9123a[this.f9124b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            for (i10 = 1; i10 < i11; i10++) {
                if ((this.f9123a[this.f9124b + i10] & 192) == 128) {
                    j10 = (j10 << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: ".concat(String.valueOf(j10)));
                }
            }
            this.f9124b += i11;
            return j10;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: ".concat(String.valueOf(j10)));
    }

    private void q() {
        this.f9124b = 0;
        this.f9125c = 0;
    }

    private int r() {
        byte[] bArr = this.f9123a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private int s() {
        return this.f9123a[this.f9124b] & DefaultClassResolver.NAME;
    }

    private char t() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        return (char) ((bArr[i10 + 1] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 8));
    }

    private int u() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & DefaultClassResolver.NAME;
        this.f9124b = i11 + 1;
        return ((bArr[i11] & DefaultClassResolver.NAME) << 8) | i12;
    }

    private short v() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & DefaultClassResolver.NAME;
        this.f9124b = i11 + 1;
        return (short) (((bArr[i11] & DefaultClassResolver.NAME) << 8) | i12);
    }

    private int w() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & DefaultClassResolver.NAME) << 24) >> 8) | ((bArr[i11] & DefaultClassResolver.NAME) << 8);
        this.f9124b = i12 + 1;
        return (bArr[i12] & DefaultClassResolver.NAME) | i13;
    }

    private int x() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & DefaultClassResolver.NAME) | ((bArr[i11] & DefaultClassResolver.NAME) << 8);
        this.f9124b = i12 + 1;
        return ((bArr[i12] & DefaultClassResolver.NAME) << 16) | i13;
    }

    private int y() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & DefaultClassResolver.NAME) | ((bArr[i11] & DefaultClassResolver.NAME) << 8);
        this.f9124b = i12 + 1;
        return ((bArr[i12] & DefaultClassResolver.NAME) << 16) | i13;
    }

    private long z() {
        byte[] bArr = this.f9123a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f9124b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f9124b = i10 + 1;
        return j11 | ((bArr[i10] & 255) << 24);
    }

    public final void a(byte[] bArr, int i10) {
        this.f9123a = bArr;
        this.f9125c = i10;
        this.f9124b = 0;
    }

    public final int b() {
        return this.f9125c;
    }

    public final int c() {
        return this.f9124b;
    }

    public final void d(int i10) {
        c(this.f9124b + i10);
    }

    public final int e() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        this.f9124b = i11 + 1;
        return (bArr[i11] & DefaultClassResolver.NAME) | i12;
    }

    public final short f() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        this.f9124b = i11 + 1;
        return (short) ((bArr[i11] & DefaultClassResolver.NAME) | i12);
    }

    public final int g() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & DefaultClassResolver.NAME) << 16) | ((bArr[i11] & DefaultClassResolver.NAME) << 8);
        this.f9124b = i12 + 1;
        return (bArr[i12] & DefaultClassResolver.NAME) | i13;
    }

    public final long h() {
        byte[] bArr = this.f9123a;
        long j10 = (bArr[r1] & 255) << 24;
        int i10 = this.f9124b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f9124b = i10 + 1;
        return j11 | (bArr[i10] & 255);
    }

    public final int i() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & DefaultClassResolver.NAME) << 24) | ((bArr[i11] & DefaultClassResolver.NAME) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & DefaultClassResolver.NAME) << 8);
        this.f9124b = i14 + 1;
        return (bArr[i14] & DefaultClassResolver.NAME) | i15;
    }

    public final long j() {
        byte[] bArr = this.f9123a;
        long j10 = (bArr[r1] & 255) << 56;
        int i10 = this.f9124b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j12 = j11 | ((bArr[i10] & 255) << 32);
        long j13 = j12 | ((bArr[r3] & 255) << 24);
        long j14 = j13 | ((bArr[r4] & 255) << 16);
        long j15 = j14 | ((bArr[r3] & 255) << 8);
        this.f9124b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | (bArr[r4] & 255);
    }

    public final int k() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        int i11 = i10 + 1;
        int i12 = (bArr[i11] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 8);
        this.f9124b = i11 + 1 + 2;
        return i12;
    }

    public final int l() {
        return (d() << 21) | (d() << 14) | (d() << 7) | d();
    }

    public final int m() {
        int i10 = i();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(i10)));
    }

    public final long n() {
        long j10 = j();
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(j10)));
    }

    public final String o() {
        String str = new String(this.f9123a, this.f9124b, 4, Charset.forName("UTF-8"));
        this.f9124b += 4;
        return str;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f9124b;
        while (i10 < this.f9125c && this.f9123a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f9123a;
        int i11 = this.f9124b;
        String a10 = af.a(bArr, i11, i10 - i11);
        this.f9124b = i10;
        if (i10 < this.f9125c) {
            this.f9124b = i10 + 1;
        }
        return a10;
    }

    public final void b(int i10) {
        a.a(i10 >= 0 && i10 <= this.f9123a.length);
        this.f9125c = i10;
    }

    public final void c(int i10) {
        a.a(i10 >= 0 && i10 <= this.f9125c);
        this.f9124b = i10;
    }

    public final int d() {
        byte[] bArr = this.f9123a;
        int i10 = this.f9124b;
        this.f9124b = i10 + 1;
        return bArr[i10] & DefaultClassResolver.NAME;
    }

    public final String e(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f9124b;
        int i12 = (i11 + i10) - 1;
        String a10 = af.a(this.f9123a, i11, (i12 >= this.f9125c || this.f9123a[i12] != 0) ? i10 : i10 - 1);
        this.f9124b += i10;
        return a10;
    }

    public s(byte[] bArr) {
        this.f9123a = bArr;
        this.f9125c = bArr.length;
    }

    public final int a() {
        return this.f9125c - this.f9124b;
    }

    private void a(r rVar, int i10) {
        a(rVar.f9119a, 0, i10);
        rVar.a(0);
    }

    public s(byte[] bArr, int i10) {
        this.f9123a = bArr;
        this.f9125c = i10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f9123a, this.f9124b, bArr, i10, i11);
        this.f9124b += i11;
    }

    private void a(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.f9123a, this.f9124b, i10);
        this.f9124b += i10;
    }

    private String a(Charset charset) {
        String str = new String(this.f9123a, this.f9124b, 4, charset);
        this.f9124b += 4;
        return str;
    }

    public final void a(int i10) {
        byte[] bArr = this.f9123a;
        if ((bArr == null ? 0 : bArr.length) < i10) {
            bArr = new byte[i10];
        }
        a(bArr, i10);
    }
}
