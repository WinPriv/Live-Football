package com.applovin.exoplayer2.g.e;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.d.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.openalliance.ad.constant.be;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g extends com.applovin.exoplayer2.g.g {

    /* renamed from: a */
    public static final a f15157a = new w(1);

    /* renamed from: b */
    private final a f15158b;

    /* loaded from: classes.dex */
    public interface a {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final int f15159a;

        /* renamed from: b */
        private final boolean f15160b;

        /* renamed from: c */
        private final int f15161c;

        public b(int i10, boolean z10, int i11) {
            this.f15159a = i10;
            this.f15160b = z10;
            this.f15161c = i11;
        }
    }

    public g() {
        this(null);
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : com.anythink.expressad.exoplayer.b.f7303k;
    }

    private static int b(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static f d(y yVar, int i10) throws UnsupportedEncodingException {
        int h10 = yVar.h();
        String a10 = a(h10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.a(bArr, 0, i11);
        int b10 = b(bArr, 0);
        String str = new String(bArr, 0, b10, "ISO-8859-1");
        int i12 = b10 + 1;
        int a11 = a(bArr, i12, h10);
        String a12 = a(bArr, i12, a11, a10);
        int b11 = a11 + b(h10);
        int a13 = a(bArr, b11, h10);
        return new f(str, a12, a(bArr, b11, a13, a10), b(bArr, a13 + b(h10), i11));
    }

    private static e e(y yVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int h10 = yVar.h();
        String a10 = a(h10);
        byte[] bArr = new byte[3];
        yVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        yVar.a(bArr2, 0, i11);
        int a11 = a(bArr2, 0, h10);
        String str2 = new String(bArr2, 0, a11, a10);
        int b10 = a11 + b(h10);
        return new e(str, str2, a(bArr2, b10, a(bArr2, b10, h10), a10));
    }

    private static j f(y yVar, int i10) {
        int i11 = yVar.i();
        int m10 = yVar.m();
        int m11 = yVar.m();
        int h10 = yVar.h();
        int h11 = yVar.h();
        x xVar = new x();
        xVar.a(yVar);
        int i12 = ((i10 - 10) * 8) / (h10 + h11);
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int c10 = xVar.c(h10);
            int c11 = xVar.c(h11);
            iArr[i13] = c10;
            iArr2[i13] = c11;
        }
        return new j(i11, m10, m11, iArr, iArr2);
    }

    private static int g(y yVar, int i10) {
        byte[] d10 = yVar.d();
        int c10 = yVar.c();
        int i11 = c10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < c10 + i10) {
                if ((d10[i11] & DefaultClassResolver.NAME) == 255 && d10[i12] == 0) {
                    System.arraycopy(d10, i11 + 2, d10, i12, (i10 - (i11 - c10)) - 2);
                    i10--;
                }
                i11 = i12;
            } else {
                return i10;
            }
        }
    }

    public g(a aVar) {
        this.f15158b = aVar;
    }

    public static /* synthetic */ boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static k c(y yVar, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        yVar.a(bArr, 0, i10);
        int b10 = b(bArr, 0);
        return new k(new String(bArr, 0, b10, "ISO-8859-1"), b(bArr, b10 + 1, i10));
    }

    @Override // com.applovin.exoplayer2.g.g
    public com.applovin.exoplayer2.g.a a(com.applovin.exoplayer2.g.d dVar, ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    private static m b(y yVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int h10 = yVar.h();
        String a10 = a(h10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.a(bArr, 0, i11);
        int a11 = a(bArr, 0, h10);
        String str = new String(bArr, 0, a11, a10);
        int b10 = a11 + b(h10);
        return new m("WXXX", str, a(bArr, b10, b(bArr, b10), "ISO-8859-1"));
    }

    public com.applovin.exoplayer2.g.a a(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        y yVar = new y(bArr, i10);
        b a10 = a(yVar);
        if (a10 == null) {
            return null;
        }
        int c10 = yVar.c();
        int i11 = a10.f15159a == 2 ? 6 : 10;
        int i12 = a10.f15161c;
        if (a10.f15160b) {
            i12 = g(yVar, a10.f15161c);
        }
        yVar.c(c10 + i12);
        boolean z10 = false;
        if (!a(yVar, a10.f15159a, i11, false)) {
            if (a10.f15159a != 4 || !a(yVar, 4, i11, true)) {
                q.c("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + a10.f15159a);
                return null;
            }
            z10 = true;
        }
        while (yVar.a() >= i11) {
            h a11 = a(a10.f15159a, yVar, z10, i11, this.f15158b);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }

    private static com.applovin.exoplayer2.g.e.b c(y yVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        yVar.a(bArr, 0, i10);
        return new com.applovin.exoplayer2.g.e.b(str, bArr);
    }

    private static m b(y yVar, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        yVar.a(bArr, 0, i10);
        return new m(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static d b(y yVar, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        int c10 = yVar.c();
        int b10 = b(yVar.d(), c10);
        String str = new String(yVar.d(), c10, b10 - c10, "ISO-8859-1");
        yVar.d(b10 + 1);
        int h10 = yVar.h();
        boolean z11 = (h10 & 2) != 0;
        boolean z12 = (h10 & 1) != 0;
        int h11 = yVar.h();
        String[] strArr = new String[h11];
        for (int i13 = 0; i13 < h11; i13++) {
            int c11 = yVar.c();
            int b11 = b(yVar.d(), c11);
            strArr[i13] = new String(yVar.d(), c11, b11 - c11, "ISO-8859-1");
            yVar.d(b11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = c10 + i10;
        while (yVar.c() < i14) {
            h a10 = a(i11, yVar, z10, i12, aVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return new d(str, z11, z12, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    private static b a(y yVar) {
        if (yVar.a() < 10) {
            q.c("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int m10 = yVar.m();
        boolean z10 = false;
        if (m10 != 4801587) {
            q.c("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(m10)));
            return null;
        }
        int h10 = yVar.h();
        yVar.e(1);
        int h11 = yVar.h();
        int v3 = yVar.v();
        if (h10 == 2) {
            if ((h11 & 64) != 0) {
                q.c("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (h10 == 3) {
            if ((h11 & 64) != 0) {
                int q10 = yVar.q();
                yVar.e(q10);
                v3 -= q10 + 4;
            }
        } else {
            if (h10 != 4) {
                a3.k.y("Skipped ID3 tag with unsupported majorVersion=", h10, "Id3Decoder");
                return null;
            }
            if ((h11 & 64) != 0) {
                int v10 = yVar.v();
                yVar.e(v10 - 4);
                v3 -= v10;
            }
            if ((h11 & 16) != 0) {
                v3 -= 10;
            }
        }
        if (h10 < 4 && (h11 & 128) != 0) {
            z10 = true;
        }
        return new b(h10, z10, v3);
    }

    private static int b(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    private static byte[] b(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return ai.f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if ((r10 & 1) != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0086, code lost:
    
        if ((r10 & 128) != 0) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.applovin.exoplayer2.l.y r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.c()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.q()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.o()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.i()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.m()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.m()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.d(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.d(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.d(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.d(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.e(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.d(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.d(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.g.e.g.a(com.applovin.exoplayer2.l.y, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0196, code lost:
    
        if (r14 == 67) goto L307;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.g.e.h a(int r20, com.applovin.exoplayer2.l.y r21, boolean r22, int r23, com.applovin.exoplayer2.g.e.g.a r24) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.g.e.g.a(int, com.applovin.exoplayer2.l.y, boolean, int, com.applovin.exoplayer2.g.e.g$a):com.applovin.exoplayer2.g.e.h");
    }

    private static l a(y yVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int h10 = yVar.h();
        String a10 = a(h10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.a(bArr, 0, i11);
        int a11 = a(bArr, 0, h10);
        String str = new String(bArr, 0, a11, a10);
        int b10 = a11 + b(h10);
        return new l("TXXX", str, a(bArr, b10, a(bArr, b10, h10), a10));
    }

    private static l a(y yVar, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int h10 = yVar.h();
        String a10 = a(h10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.a(bArr, 0, i11);
        return new l(str, null, new String(bArr, 0, a(bArr, 0, h10), a10));
    }

    private static com.applovin.exoplayer2.g.e.a a(y yVar, int i10, int i11) throws UnsupportedEncodingException {
        int b10;
        String concat;
        int h10 = yVar.h();
        String a10 = a(h10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        yVar.a(bArr, 0, i12);
        if (i11 == 2) {
            concat = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1"));
            if (be.I.equals(concat)) {
                concat = be.V;
            }
            b10 = 2;
        } else {
            b10 = b(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, b10, "ISO-8859-1"));
            concat = lowerCase.indexOf(47) == -1 ? "image/".concat(lowerCase) : lowerCase;
        }
        int i13 = bArr[b10 + 1] & DefaultClassResolver.NAME;
        int i14 = b10 + 2;
        int a11 = a(bArr, i14, h10);
        return new com.applovin.exoplayer2.g.e.a(concat, new String(bArr, i14, a11 - i14, a10), i13, b(bArr, a11 + b(h10), i12));
    }

    private static c a(y yVar, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        int c10 = yVar.c();
        int b10 = b(yVar.d(), c10);
        String str = new String(yVar.d(), c10, b10 - c10, "ISO-8859-1");
        yVar.d(b10 + 1);
        int q10 = yVar.q();
        int q11 = yVar.q();
        long o = yVar.o();
        long j10 = o == 4294967295L ? -1L : o;
        long o6 = yVar.o();
        long j11 = o6 == 4294967295L ? -1L : o6;
        ArrayList arrayList = new ArrayList();
        int i13 = c10 + i10;
        while (yVar.c() < i13) {
            h a10 = a(i11, yVar, z10, i12, aVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return new c(str, q10, q11, j10, j11, (h[]) arrayList.toArray(new h[0]));
    }

    private static String a(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int a(byte[] bArr, int i10, int i11) {
        int b10 = b(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return b10;
        }
        while (b10 < bArr.length - 1) {
            if ((b10 - i10) % 2 == 0 && bArr[b10 + 1] == 0) {
                return b10;
            }
            b10 = b(bArr, b10 + 1);
        }
        return bArr.length;
    }

    private static String a(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }
}
