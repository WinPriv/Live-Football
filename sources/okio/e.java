package okio;

import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: ByteString.java */
/* loaded from: classes2.dex */
public class e implements Serializable, Comparable<e> {

    /* renamed from: v, reason: collision with root package name */
    public static final char[] f33833v = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: w, reason: collision with root package name */
    public static final e f33834w = v(new byte[0]);

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f33835s;

    /* renamed from: t, reason: collision with root package name */
    public transient int f33836t;

    /* renamed from: u, reason: collision with root package name */
    public transient String f33837u;

    public e(byte[] bArr) {
        this.f33835s = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        r6 = null;
     */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static okio.e l(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.e.l(java.lang.String):okio.e");
    }

    public static e m(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (n(str.charAt(i11 + 1)) + (n(str.charAt(i11)) << 4));
            }
            return v(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
    }

    public static int n(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static e p(String str) {
        if (str != null) {
            e eVar = new e(str.getBytes(b0.f33832a));
            eVar.f33837u = str;
            return eVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static e v(byte... bArr) {
        if (bArr != null) {
            return new e((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public int A() {
        return this.f33835s.length;
    }

    public e C() {
        byte[] bArr = this.f33835s;
        if (64 <= bArr.length) {
            if (64 == bArr.length) {
                return this;
            }
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new e(bArr2);
        }
        throw new IllegalArgumentException(com.ironsource.adapters.facebook.a.i(new StringBuilder("endIndex > length("), bArr.length, ")"));
    }

    public e E() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f33835s;
            if (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (b10 >= 65 && b10 <= 90) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i10] = (byte) (b10 + 32);
                    for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                        byte b11 = bArr2[i11];
                        if (b11 >= 65 && b11 <= 90) {
                            bArr2[i11] = (byte) (b11 + 32);
                        }
                    }
                    return new e(bArr2);
                }
                i10++;
            } else {
                return this;
            }
        }
    }

    public byte[] F() {
        return (byte[]) this.f33835s.clone();
    }

    public String G() {
        String str = this.f33837u;
        if (str == null) {
            String str2 = new String(this.f33835s, b0.f33832a);
            this.f33837u = str2;
            return str2;
        }
        return str;
    }

    public void H(b bVar) {
        byte[] bArr = this.f33835s;
        bVar.m7write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(okio.e r10) {
        /*
            r9 = this;
            okio.e r10 = (okio.e) r10
            int r0 = r9.A()
            int r1 = r10.A()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L10:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L2b
            byte r7 = r9.q(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.q(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L25
            int r4 = r4 + 1
            goto L10
        L25:
            if (r7 >= r8) goto L29
        L27:
            r3 = r6
            goto L31
        L29:
            r3 = r5
            goto L31
        L2b:
            if (r0 != r1) goto L2e
            goto L31
        L2e:
            if (r0 >= r1) goto L29
            goto L27
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.e.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            int A = eVar.A();
            byte[] bArr = this.f33835s;
            if (A == bArr.length && eVar.w(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f33836t;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f33835s);
            this.f33836t = hashCode;
            return hashCode;
        }
        return i10;
    }

    public String k() {
        byte[] bArr = androidx.activity.n.H0;
        byte[] bArr2 = this.f33835s;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int i12 = i10 + 1;
            bArr3[i10] = bArr[(bArr2[i11] & DefaultClassResolver.NAME) >> 2];
            int i13 = i12 + 1;
            int i14 = i11 + 1;
            bArr3[i12] = bArr[((bArr2[i11] & 3) << 4) | ((bArr2[i14] & DefaultClassResolver.NAME) >> 4)];
            int i15 = i13 + 1;
            int i16 = (bArr2[i14] & Ascii.SI) << 2;
            int i17 = i11 + 2;
            bArr3[i13] = bArr[i16 | ((bArr2[i17] & DefaultClassResolver.NAME) >> 6)];
            i10 = i15 + 1;
            bArr3[i15] = bArr[bArr2[i17] & 63];
        }
        int length2 = bArr2.length % 3;
        if (length2 != 1) {
            if (length2 == 2) {
                int i18 = i10 + 1;
                bArr3[i10] = bArr[(bArr2[length] & DefaultClassResolver.NAME) >> 2];
                int i19 = i18 + 1;
                int i20 = (bArr2[length] & 3) << 4;
                int i21 = length + 1;
                bArr3[i18] = bArr[((bArr2[i21] & DefaultClassResolver.NAME) >> 4) | i20];
                bArr3[i19] = bArr[(bArr2[i21] & Ascii.SI) << 2];
                bArr3[i19 + 1] = 61;
            }
        } else {
            int i22 = i10 + 1;
            bArr3[i10] = bArr[(bArr2[length] & DefaultClassResolver.NAME) >> 2];
            int i23 = i22 + 1;
            bArr3[i22] = bArr[(bArr2[length] & 3) << 4];
            bArr3[i23] = 61;
            bArr3[i23 + 1] = 61;
        }
        try {
            return new String(bArr3, com.anythink.expressad.exoplayer.b.f7301i);
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final e o(String str) {
        try {
            return v(MessageDigest.getInstance(str).digest(this.f33835s));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public byte q(int i10) {
        return this.f33835s[i10];
    }

    public String r() {
        byte[] bArr = this.f33835s;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f33833v;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }

    public String toString() {
        byte[] bArr = this.f33835s;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        String G = G();
        int length = G.length();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < length) {
                if (i11 == 64) {
                    break;
                }
                int codePointAt = G.codePointAt(i10);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i11++;
                    i10 += Character.charCount(codePointAt);
                }
            } else {
                i10 = G.length();
                break;
            }
        }
        i10 = -1;
        if (i10 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + r() + "]";
            }
            return "[size=" + bArr.length + " hex=" + C().r() + "…]";
        }
        String replace = G.substring(0, i10).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i10 < G.length()) {
            return "[size=" + bArr.length + " text=" + replace + "…]";
        }
        return a3.k.l("[text=", replace, "]");
    }

    public byte[] u() {
        return this.f33835s;
    }

    public boolean w(int i10, int i11, int i12, byte[] bArr) {
        boolean z10;
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f33835s;
        if (i10 > bArr2.length - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        Charset charset = b0.f33832a;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                if (bArr2[i13 + i10] != bArr[i13 + i11]) {
                    z10 = false;
                    break;
                }
                i13++;
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public boolean x(e eVar, int i10) {
        return eVar.w(0, 0, i10, this.f33835s);
    }
}
