package d6;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import j7.t0;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: ParsableByteArray.java */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f27382d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f27383e = {'\n'};
    public static final t0<Charset> f = t0.C(5, i7.c.f29200a, i7.c.f29202c, i7.c.f, i7.c.f29203d, i7.c.f29204e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f27384a;

    /* renamed from: b, reason: collision with root package name */
    public int f27385b;

    /* renamed from: c, reason: collision with root package name */
    public int f27386c;

    public w() {
        this.f27384a = g0.f;
    }

    public final Charset A() {
        int i10 = this.f27386c;
        int i11 = this.f27385b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f27384a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f27385b = i11 + 3;
                return i7.c.f29202c;
            }
        }
        if (i10 - i11 >= 2) {
            byte[] bArr2 = this.f27384a;
            byte b10 = bArr2[i11];
            if (b10 == -2 && bArr2[i11 + 1] == -1) {
                this.f27385b = i11 + 2;
                return i7.c.f29203d;
            }
            if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.f27385b = i11 + 2;
                return i7.c.f29204e;
            }
            return null;
        }
        return null;
    }

    public final void B(int i10) {
        byte[] bArr = this.f27384a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        C(i10, bArr);
    }

    public final void C(int i10, byte[] bArr) {
        this.f27384a = bArr;
        this.f27386c = i10;
        this.f27385b = 0;
    }

    public final void D(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f27384a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.a(z10);
        this.f27386c = i10;
    }

    public final void E(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f27386c) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.a(z10);
        this.f27385b = i10;
    }

    public final void F(int i10) {
        E(this.f27385b + i10);
    }

    public final void a(int i10) {
        byte[] bArr = this.f27384a;
        if (i10 > bArr.length) {
            this.f27384a = Arrays.copyOf(bArr, i10);
        }
    }

    public final void b(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f27384a, this.f27385b, bArr, i10, i11);
        this.f27385b += i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final char c(java.nio.charset.Charset r9, char[] r10) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.w.c(java.nio.charset.Charset, char[]):char");
    }

    public final int d() {
        byte[] bArr = this.f27384a;
        int i10 = this.f27385b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & DefaultClassResolver.NAME) << 24) | ((bArr[i11] & DefaultClassResolver.NAME) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & DefaultClassResolver.NAME) << 8);
        this.f27385b = i14 + 1;
        return (bArr[i14] & DefaultClassResolver.NAME) | i15;
    }

    public final String e() {
        return f(i7.c.f29202c);
    }

    public final String f(Charset charset) {
        int i10;
        a.b(f.contains(charset), "Unsupported charset: " + charset);
        if (this.f27386c - this.f27385b == 0) {
            return null;
        }
        Charset charset2 = i7.c.f29200a;
        if (!charset.equals(charset2)) {
            A();
        }
        if (!charset.equals(i7.c.f29202c) && !charset.equals(charset2)) {
            if (!charset.equals(i7.c.f) && !charset.equals(i7.c.f29204e) && !charset.equals(i7.c.f29203d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f27385b;
        while (true) {
            int i12 = this.f27386c;
            if (i11 < i12 - (i10 - 1)) {
                if ((charset.equals(i7.c.f29202c) || charset.equals(i7.c.f29200a)) && g0.H(this.f27384a[i11])) {
                    break;
                }
                if (charset.equals(i7.c.f) || charset.equals(i7.c.f29203d)) {
                    byte[] bArr = this.f27384a;
                    if (bArr[i11] == 0 && g0.H(bArr[i11 + 1])) {
                        break;
                    }
                }
                if (charset.equals(i7.c.f29204e)) {
                    byte[] bArr2 = this.f27384a;
                    if (bArr2[i11 + 1] == 0 && g0.H(bArr2[i11])) {
                        break;
                    }
                }
                i11 += i10;
            } else {
                i11 = i12;
                break;
            }
        }
        String r10 = r(i11 - this.f27385b, charset);
        if (this.f27385b == this.f27386c) {
            return r10;
        }
        if (c(charset, f27382d) == '\r') {
            c(charset, f27383e);
        }
        return r10;
    }

    public final int g() {
        byte[] bArr = this.f27384a;
        int i10 = this.f27385b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & DefaultClassResolver.NAME) | ((bArr[i11] & DefaultClassResolver.NAME) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & DefaultClassResolver.NAME) << 16);
        this.f27385b = i14 + 1;
        return ((bArr[i14] & DefaultClassResolver.NAME) << 24) | i15;
    }

    public final long h() {
        byte[] bArr = this.f27384a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f27385b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j12 = j11 | ((bArr[i10] & 255) << 24);
        long j13 = j12 | ((bArr[r3] & 255) << 32);
        long j14 = j13 | ((bArr[r4] & 255) << 40);
        long j15 = j14 | ((bArr[r3] & 255) << 48);
        this.f27385b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | ((bArr[r4] & 255) << 56);
    }

    public final short i() {
        byte[] bArr = this.f27384a;
        int i10 = this.f27385b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & DefaultClassResolver.NAME;
        this.f27385b = i11 + 1;
        return (short) (((bArr[i11] & DefaultClassResolver.NAME) << 8) | i12);
    }

    public final long j() {
        byte[] bArr = this.f27384a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f27385b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f27385b = i10 + 1;
        return j11 | ((bArr[i10] & 255) << 24);
    }

    public final int k() {
        int g6 = g();
        if (g6 >= 0) {
            return g6;
        }
        throw new IllegalStateException(a3.l.i("Top bit not zero: ", g6));
    }

    public final int l() {
        byte[] bArr = this.f27384a;
        int i10 = this.f27385b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & DefaultClassResolver.NAME;
        this.f27385b = i11 + 1;
        return ((bArr[i11] & DefaultClassResolver.NAME) << 8) | i12;
    }

    public final long m() {
        byte[] bArr = this.f27384a;
        long j10 = (bArr[r1] & 255) << 56;
        int i10 = this.f27385b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j12 = j11 | ((bArr[i10] & 255) << 32);
        long j13 = j12 | ((bArr[r3] & 255) << 24);
        long j14 = j13 | ((bArr[r4] & 255) << 16);
        long j15 = j14 | ((bArr[r3] & 255) << 8);
        this.f27385b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | (bArr[r4] & 255);
    }

    public final String n() {
        int i10 = this.f27386c;
        int i11 = this.f27385b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f27386c && this.f27384a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f27384a;
        int i12 = this.f27385b;
        int i13 = g0.f27302a;
        String str = new String(bArr, i12, i11 - i12, i7.c.f29202c);
        this.f27385b = i11;
        if (i11 < this.f27386c) {
            this.f27385b = i11 + 1;
        }
        return str;
    }

    public final String o(int i10) {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int i12 = this.f27385b;
        int i13 = (i12 + i10) - 1;
        if (i13 < this.f27386c && this.f27384a[i13] == 0) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        byte[] bArr = this.f27384a;
        int i14 = g0.f27302a;
        String str = new String(bArr, i12, i11, i7.c.f29202c);
        this.f27385b += i10;
        return str;
    }

    public final short p() {
        byte[] bArr = this.f27384a;
        int i10 = this.f27385b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        this.f27385b = i11 + 1;
        return (short) ((bArr[i11] & DefaultClassResolver.NAME) | i12);
    }

    public final String q(int i10) {
        return r(i10, i7.c.f29202c);
    }

    public final String r(int i10, Charset charset) {
        String str = new String(this.f27384a, this.f27385b, i10, charset);
        this.f27385b += i10;
        return str;
    }

    public final int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public final int t() {
        byte[] bArr = this.f27384a;
        int i10 = this.f27385b;
        this.f27385b = i10 + 1;
        return bArr[i10] & DefaultClassResolver.NAME;
    }

    public final long u() {
        byte[] bArr = this.f27384a;
        long j10 = (bArr[r1] & 255) << 24;
        int i10 = this.f27385b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f27385b = i10 + 1;
        return j11 | (bArr[i10] & 255);
    }

    public final int v() {
        byte[] bArr = this.f27384a;
        int i10 = this.f27385b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & DefaultClassResolver.NAME) << 16) | ((bArr[i11] & DefaultClassResolver.NAME) << 8);
        this.f27385b = i12 + 1;
        return (bArr[i12] & DefaultClassResolver.NAME) | i13;
    }

    public final int w() {
        int d10 = d();
        if (d10 >= 0) {
            return d10;
        }
        throw new IllegalStateException(a3.l.i("Top bit not zero: ", d10));
    }

    public final long x() {
        long m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        throw new IllegalStateException(a3.k.k("Top bit not zero: ", m10));
    }

    public final int y() {
        byte[] bArr = this.f27384a;
        int i10 = this.f27385b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        this.f27385b = i11 + 1;
        return (bArr[i11] & DefaultClassResolver.NAME) | i12;
    }

    public final long z() {
        int i10;
        int i11;
        long j10 = this.f27384a[this.f27385b];
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
                if ((this.f27384a[this.f27385b + i10] & 192) == 128) {
                    j10 = (j10 << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(a3.k.k("Invalid UTF-8 sequence continuation byte: ", j10));
                }
            }
            this.f27385b += i11;
            return j10;
        }
        throw new NumberFormatException(a3.k.k("Invalid UTF-8 sequence first byte: ", j10));
    }

    public w(int i10) {
        this.f27384a = new byte[i10];
        this.f27386c = i10;
    }

    public w(byte[] bArr) {
        this.f27384a = bArr;
        this.f27386c = bArr.length;
    }

    public w(byte[] bArr, int i10) {
        this.f27384a = bArr;
        this.f27386c = i10;
    }
}
