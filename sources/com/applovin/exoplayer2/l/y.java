package com.applovin.exoplayer2.l;

import com.applovin.exoplayer2.common.base.Charsets;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f16367a;

    /* renamed from: b, reason: collision with root package name */
    private int f16368b;

    /* renamed from: c, reason: collision with root package name */
    private int f16369c;

    public y() {
        this.f16367a = ai.f;
    }

    public double A() {
        return Double.longBitsToDouble(s());
    }

    public String B() {
        return a((char) 0);
    }

    public String C() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f16368b;
        while (i10 < this.f16369c && !ai.a((int) this.f16367a[i10])) {
            i10++;
        }
        int i11 = this.f16368b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f16367a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f16368b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f16367a;
        int i12 = this.f16368b;
        String a10 = ai.a(bArr2, i12, i10 - i12);
        this.f16368b = i10;
        int i13 = this.f16369c;
        if (i10 == i13) {
            return a10;
        }
        byte[] bArr3 = this.f16367a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f16368b = i14;
            if (i14 == i13) {
                return a10;
            }
        }
        int i15 = this.f16368b;
        if (bArr3[i15] == 10) {
            this.f16368b = i15 + 1;
        }
        return a10;
    }

    public long D() {
        int i10;
        int i11;
        long j10 = this.f16367a[this.f16368b];
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
                if ((this.f16367a[this.f16368b + i10] & 192) == 128) {
                    j10 = (j10 << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(a3.k.k("Invalid UTF-8 sequence continuation byte: ", j10));
                }
            }
            this.f16368b += i11;
            return j10;
        }
        throw new NumberFormatException(a3.k.k("Invalid UTF-8 sequence first byte: ", j10));
    }

    public void a(int i10) {
        a(e() < i10 ? new byte[i10] : this.f16367a, i10);
    }

    public void b(int i10) {
        if (i10 > e()) {
            this.f16367a = Arrays.copyOf(this.f16367a, i10);
        }
    }

    public void c(int i10) {
        a.a(i10 >= 0 && i10 <= this.f16367a.length);
        this.f16369c = i10;
    }

    public void d(int i10) {
        a.a(i10 >= 0 && i10 <= this.f16369c);
        this.f16368b = i10;
    }

    public int e() {
        return this.f16367a.length;
    }

    public int f() {
        return this.f16367a[this.f16368b] & DefaultClassResolver.NAME;
    }

    public char g() {
        byte[] bArr = this.f16367a;
        int i10 = this.f16368b;
        return (char) ((bArr[i10 + 1] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 8));
    }

    public int h() {
        byte[] bArr = this.f16367a;
        int i10 = this.f16368b;
        this.f16368b = i10 + 1;
        return bArr[i10] & DefaultClassResolver.NAME;
    }

    public int i() {
        byte[] bArr = this.f16367a;
        int i10 = this.f16368b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        this.f16368b = i11 + 1;
        return (bArr[i11] & DefaultClassResolver.NAME) | i12;
    }

    public int j() {
        byte[] bArr = this.f16367a;
        int i10 = this.f16368b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & DefaultClassResolver.NAME;
        this.f16368b = i11 + 1;
        return ((bArr[i11] & DefaultClassResolver.NAME) << 8) | i12;
    }

    public short k() {
        byte[] bArr = this.f16367a;
        int i10 = this.f16368b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        this.f16368b = i11 + 1;
        return (short) ((bArr[i11] & DefaultClassResolver.NAME) | i12);
    }

    public short l() {
        byte[] bArr = this.f16367a;
        int i10 = this.f16368b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & DefaultClassResolver.NAME;
        this.f16368b = i11 + 1;
        return (short) (((bArr[i11] & DefaultClassResolver.NAME) << 8) | i12);
    }

    public int m() {
        byte[] bArr = this.f16367a;
        int i10 = this.f16368b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & DefaultClassResolver.NAME) << 16) | ((bArr[i11] & DefaultClassResolver.NAME) << 8);
        this.f16368b = i12 + 1;
        return (bArr[i12] & DefaultClassResolver.NAME) | i13;
    }

    public int n() {
        byte[] bArr = this.f16367a;
        int i10 = this.f16368b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & DefaultClassResolver.NAME) << 24) >> 8) | ((bArr[i11] & DefaultClassResolver.NAME) << 8);
        this.f16368b = i12 + 1;
        return (bArr[i12] & DefaultClassResolver.NAME) | i13;
    }

    public long o() {
        byte[] bArr = this.f16367a;
        long j10 = (bArr[r1] & 255) << 24;
        int i10 = this.f16368b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f16368b = i10 + 1;
        return j11 | (bArr[i10] & 255);
    }

    public long p() {
        byte[] bArr = this.f16367a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f16368b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f16368b = i10 + 1;
        return j11 | ((bArr[i10] & 255) << 24);
    }

    public int q() {
        byte[] bArr = this.f16367a;
        int i10 = this.f16368b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & DefaultClassResolver.NAME) << 24) | ((bArr[i11] & DefaultClassResolver.NAME) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & DefaultClassResolver.NAME) << 8);
        this.f16368b = i14 + 1;
        return (bArr[i14] & DefaultClassResolver.NAME) | i15;
    }

    public int r() {
        byte[] bArr = this.f16367a;
        int i10 = this.f16368b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & DefaultClassResolver.NAME) | ((bArr[i11] & DefaultClassResolver.NAME) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & DefaultClassResolver.NAME) << 16);
        this.f16368b = i14 + 1;
        return ((bArr[i14] & DefaultClassResolver.NAME) << 24) | i15;
    }

    public long s() {
        byte[] bArr = this.f16367a;
        long j10 = (bArr[r1] & 255) << 56;
        int i10 = this.f16368b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j12 = j11 | ((bArr[i10] & 255) << 32);
        long j13 = j12 | ((bArr[r3] & 255) << 24);
        long j14 = j13 | ((bArr[r4] & 255) << 16);
        long j15 = j14 | ((bArr[r3] & 255) << 8);
        this.f16368b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | (bArr[r4] & 255);
    }

    public long t() {
        byte[] bArr = this.f16367a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f16368b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j12 = j11 | ((bArr[i10] & 255) << 24);
        long j13 = j12 | ((bArr[r3] & 255) << 32);
        long j14 = j13 | ((bArr[r4] & 255) << 40);
        long j15 = j14 | ((bArr[r3] & 255) << 48);
        this.f16368b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | ((bArr[r4] & 255) << 56);
    }

    public int u() {
        byte[] bArr = this.f16367a;
        int i10 = this.f16368b;
        int i11 = i10 + 1;
        int i12 = (bArr[i11] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 8);
        this.f16368b = i11 + 1 + 2;
        return i12;
    }

    public int v() {
        return (h() << 21) | (h() << 14) | (h() << 7) | h();
    }

    public int w() {
        int q10 = q();
        if (q10 >= 0) {
            return q10;
        }
        throw new IllegalStateException(a3.l.i("Top bit not zero: ", q10));
    }

    public int x() {
        int r10 = r();
        if (r10 >= 0) {
            return r10;
        }
        throw new IllegalStateException(a3.l.i("Top bit not zero: ", r10));
    }

    public long y() {
        long s10 = s();
        if (s10 >= 0) {
            return s10;
        }
        throw new IllegalStateException(a3.k.k("Top bit not zero: ", s10));
    }

    public float z() {
        return Float.intBitsToFloat(q());
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void e(int i10) {
        d(this.f16368b + i10);
    }

    public String f(int i10) {
        return a(i10, Charsets.UTF_8);
    }

    public String g(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f16368b;
        int i12 = (i11 + i10) - 1;
        String a10 = ai.a(this.f16367a, i11, (i12 >= this.f16369c || this.f16367a[i12] != 0) ? i10 : i10 - 1);
        this.f16368b += i10;
        return a10;
    }

    public y(int i10) {
        this.f16367a = new byte[i10];
        this.f16369c = i10;
    }

    public void a(byte[] bArr, int i10) {
        this.f16367a = bArr;
        this.f16369c = i10;
        this.f16368b = 0;
    }

    public int b() {
        return this.f16369c;
    }

    public int c() {
        return this.f16368b;
    }

    public byte[] d() {
        return this.f16367a;
    }

    public y(byte[] bArr) {
        this.f16367a = bArr;
        this.f16369c = bArr.length;
    }

    public int a() {
        return this.f16369c - this.f16368b;
    }

    public void a(x xVar, int i10) {
        a(xVar.f16363a, 0, i10);
        xVar.a(0);
    }

    public y(byte[] bArr, int i10) {
        this.f16367a = bArr;
        this.f16369c = i10;
    }

    public void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f16367a, this.f16368b, bArr, i10, i11);
        this.f16368b += i11;
    }

    public String a(int i10, Charset charset) {
        String str = new String(this.f16367a, this.f16368b, i10, charset);
        this.f16368b += i10;
        return str;
    }

    public String a(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f16368b;
        while (i10 < this.f16369c && this.f16367a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f16367a;
        int i11 = this.f16368b;
        String a10 = ai.a(bArr, i11, i10 - i11);
        this.f16368b = i10;
        if (i10 < this.f16369c) {
            this.f16368b = i10 + 1;
        }
        return a10;
    }
}
