package com.anythink.expressad.exoplayer.g.b;

import android.util.Log;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.exoplayer.k.s;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.openalliance.ad.constant.be;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements com.anythink.expressad.exoplayer.g.b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8056a = new a() { // from class: com.anythink.expressad.exoplayer.g.b.g.1
        @Override // com.anythink.expressad.exoplayer.g.b.g.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return false;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final int f8057b = af.f("ID3");

    /* renamed from: c, reason: collision with root package name */
    public static final int f8058c = 10;

    /* renamed from: d, reason: collision with root package name */
    private static final String f8059d = "Id3Decoder";

    /* renamed from: e, reason: collision with root package name */
    private static final int f8060e = 128;
    private static final int f = 64;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8061g = 32;

    /* renamed from: h, reason: collision with root package name */
    private static final int f8062h = 8;

    /* renamed from: i, reason: collision with root package name */
    private static final int f8063i = 4;

    /* renamed from: j, reason: collision with root package name */
    private static final int f8064j = 64;

    /* renamed from: k, reason: collision with root package name */
    private static final int f8065k = 2;

    /* renamed from: l, reason: collision with root package name */
    private static final int f8066l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f8067m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static final int f8068n = 1;
    private static final int o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f8069p = 3;

    /* renamed from: q, reason: collision with root package name */
    private final a f8070q;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f8071a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8072b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8073c;

        public b(int i10, boolean z10, int i11) {
            this.f8071a = i10;
            this.f8072b = z10;
            this.f8073c = i11;
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

    private static j c(s sVar, int i10) {
        byte[] bArr = new byte[i10];
        sVar.a(bArr, 0, i10);
        int b10 = b(bArr, 0);
        return new j(new String(bArr, 0, b10, "ISO-8859-1"), b(bArr, b10 + 1, i10));
    }

    private static f d(s sVar, int i10) {
        int d10 = sVar.d();
        String a10 = a(d10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        sVar.a(bArr, 0, i11);
        int b10 = b(bArr, 0);
        String str = new String(bArr, 0, b10, "ISO-8859-1");
        int i12 = b10 + 1;
        int a11 = a(bArr, i12, d10);
        String a12 = a(bArr, i12, a11, a10);
        int b11 = a11 + b(d10);
        int a13 = a(bArr, b11, d10);
        return new f(str, a12, a(bArr, b11, a13, a10), b(bArr, a13 + b(d10), i11));
    }

    private static e e(s sVar, int i10) {
        if (i10 < 4) {
            return null;
        }
        int d10 = sVar.d();
        String a10 = a(d10);
        byte[] bArr = new byte[3];
        sVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        sVar.a(bArr2, 0, i11);
        int a11 = a(bArr2, 0, d10);
        String str2 = new String(bArr2, 0, a11, a10);
        int b10 = a11 + b(d10);
        return new e(str, str2, a(bArr2, b10, a(bArr2, b10, d10), a10));
    }

    private static int f(s sVar, int i10) {
        byte[] bArr = sVar.f9123a;
        int c10 = sVar.c();
        while (true) {
            int i11 = c10 + 1;
            if (i11 < i10) {
                if ((bArr[c10] & DefaultClassResolver.NAME) == 255 && bArr[i11] == 0) {
                    System.arraycopy(bArr, c10 + 2, bArr, i11, (i10 - c10) - 2);
                    i10--;
                }
                c10 = i11;
            } else {
                return i10;
            }
        }
    }

    private g(a aVar) {
        this.f8070q = aVar;
    }

    private static l b(s sVar, int i10) {
        if (i10 <= 0) {
            return null;
        }
        int d10 = sVar.d();
        String a10 = a(d10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        sVar.a(bArr, 0, i11);
        int a11 = a(bArr, 0, d10);
        String str = new String(bArr, 0, a11, a10);
        int b10 = a11 + b(d10);
        return new l("WXXX", str, a(bArr, b10, b(bArr, b10), "ISO-8859-1"));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b8  */
    @Override // com.anythink.expressad.exoplayer.g.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.expressad.exoplayer.g.a a(com.anythink.expressad.exoplayer.g.e r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.g.b.g.a(com.anythink.expressad.exoplayer.g.e):com.anythink.expressad.exoplayer.g.a");
    }

    private static com.anythink.expressad.exoplayer.g.b.b c(s sVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        sVar.a(bArr, 0, i10);
        return new com.anythink.expressad.exoplayer.g.b.b(str, bArr);
    }

    private static l b(s sVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        sVar.a(bArr, 0, i10);
        return new l(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static d b(s sVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int c10 = sVar.c();
        int b10 = b(sVar.f9123a, c10);
        String str = new String(sVar.f9123a, c10, b10 - c10, "ISO-8859-1");
        sVar.c(b10 + 1);
        int d10 = sVar.d();
        boolean z11 = (d10 & 2) != 0;
        boolean z12 = (d10 & 1) != 0;
        int d11 = sVar.d();
        String[] strArr = new String[d11];
        for (int i13 = 0; i13 < d11; i13++) {
            int c11 = sVar.c();
            int b11 = b(sVar.f9123a, c11);
            strArr[i13] = new String(sVar.f9123a, c11, b11 - c11, "ISO-8859-1");
            sVar.c(b11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = c10 + i10;
        while (sVar.c() < i14) {
            h a10 = a(i11, sVar, z10, i12, aVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new d(str, z11, z12, strArr, hVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.anythink.expressad.exoplayer.g.a a(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.g.b.g.a(byte[], int):com.anythink.expressad.exoplayer.g.a");
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
        return i11 <= i10 ? new byte[0] : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static b a(s sVar) {
        if (sVar.a() < 10) {
            Log.w(f8059d, "Data too short to be an ID3 tag");
            return null;
        }
        int g6 = sVar.g();
        if (g6 != f8057b) {
            Log.w(f8059d, "Unexpected first three bytes of ID3 tag header: ".concat(String.valueOf(g6)));
            return null;
        }
        int d10 = sVar.d();
        sVar.d(1);
        int d11 = sVar.d();
        int l10 = sVar.l();
        if (d10 == 2) {
            if ((d11 & 64) != 0) {
                Log.w(f8059d, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (d10 == 3) {
            if ((d11 & 64) != 0) {
                int i10 = sVar.i();
                sVar.d(i10);
                l10 -= i10 + 4;
            }
        } else {
            if (d10 != 4) {
                Log.w(f8059d, "Skipped ID3 tag with unsupported majorVersion=".concat(String.valueOf(d10)));
                return null;
            }
            if ((d11 & 64) != 0) {
                int l11 = sVar.l();
                sVar.d(l11 - 4);
                l10 -= l11;
            }
            if ((d11 & 16) != 0) {
                l10 -= 10;
            }
        }
        return new b(d10, d10 < 4 && (d11 & 128) != 0, l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0086, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.anythink.expressad.exoplayer.k.s r18, int r19, int r20, boolean r21) {
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
            int r7 = r18.i()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.h()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.e()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.g()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.g()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.c(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.c(r2)
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
            r1.c(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.c(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.d(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.c(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.c(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.g.b.g.a(com.anythink.expressad.exoplayer.k.s, int, int, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.anythink.expressad.exoplayer.g.b.h] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.anythink.expressad.exoplayer.g.b.h] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    private static h a(int i10, s sVar, boolean z10, int i11, a aVar) {
        int g6;
        String str;
        int i12;
        String str2;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i14;
        String str3;
        int i15;
        ?? eVar;
        int b10;
        String d10;
        Object jVar;
        Object obj;
        s sVar2 = sVar;
        int d11 = sVar.d();
        int d12 = sVar.d();
        int d13 = sVar.d();
        int d14 = i10 >= 3 ? sVar.d() : 0;
        if (i10 == 4) {
            g6 = sVar.m();
            if (!z10) {
                g6 = (((g6 >> 24) & p.f9095b) << 21) | (g6 & p.f9095b) | (((g6 >> 8) & p.f9095b) << 7) | (((g6 >> 16) & p.f9095b) << 14);
            }
        } else if (i10 == 3) {
            g6 = sVar.m();
        } else {
            g6 = sVar.g();
        }
        int i16 = g6;
        int e10 = i10 >= 3 ? sVar.e() : 0;
        if (d11 == 0 && d12 == 0 && d13 == 0 && d14 == 0 && i16 == 0 && e10 == 0) {
            sVar2.c(sVar.b());
            return null;
        }
        int c10 = sVar.c() + i16;
        if (c10 > sVar.b()) {
            Log.w(f8059d, "Frame size exceeds remaining tag data");
            sVar2.c(sVar.b());
            return null;
        }
        if (aVar != null) {
            str = f8059d;
            i12 = c10;
            str2 = null;
            i13 = e10;
            if (!aVar.a(i10, d11, d12, d13, d14)) {
                sVar2.c(i12);
                return null;
            }
        } else {
            str = f8059d;
            i12 = c10;
            str2 = null;
            i13 = e10;
        }
        if (i10 == 3) {
            int i17 = i13;
            z12 = (i17 & 128) != 0;
            boolean z16 = (i17 & 64) != 0;
            z11 = (i17 & 32) != 0;
            z14 = z16;
            z15 = false;
            z13 = z12;
        } else {
            int i18 = i13;
            if (i10 == 4) {
                boolean z17 = (i18 & 64) != 0;
                z13 = (i18 & 8) != 0;
                z14 = (i18 & 4) != 0;
                z15 = (i18 & 2) != 0;
                if ((i18 & 1) != 0) {
                    z11 = z17;
                    z12 = true;
                } else {
                    z11 = z17;
                    z12 = false;
                }
            } else {
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
            }
        }
        if (!z13 && !z14) {
            if (z11) {
                i16--;
                sVar2.d(1);
            }
            if (z12) {
                i16 -= 4;
                sVar2.d(4);
            }
            if (z15) {
                i16 = f(sVar2, i16);
            }
            try {
                try {
                    try {
                        if (d11 == 84 && d12 == 88 && d13 == 88 && (i10 == 2 || d14 == 88)) {
                            if (i16 > 0) {
                                int d15 = sVar.d();
                                String a10 = a(d15);
                                int i19 = i16 - 1;
                                byte[] bArr = new byte[i19];
                                sVar2.a(bArr, 0, i19);
                                int a11 = a(bArr, 0, d15);
                                String str4 = new String(bArr, 0, a11, a10);
                                int b11 = a11 + b(d15);
                                obj = new k("TXXX", str4, a(bArr, b11, a(bArr, b11, d15), a10));
                                i15 = i12;
                                eVar = obj;
                            }
                            obj = str2;
                            i15 = i12;
                            eVar = obj;
                        } else if (d11 == 84) {
                            String a12 = a(i10, d11, d12, d13, d14);
                            if (i16 <= 0) {
                                obj = str2;
                                i15 = i12;
                                eVar = obj;
                            } else {
                                int d16 = sVar.d();
                                String a13 = a(d16);
                                int i20 = i16 - 1;
                                byte[] bArr2 = new byte[i20];
                                sVar2.a(bArr2, 0, i20);
                                obj = new k(a12, str2, new String(bArr2, 0, a(bArr2, 0, d16), a13));
                                i15 = i12;
                                eVar = obj;
                            }
                        } else {
                            if (d11 == 87 && d12 == 88 && d13 == 88 && (i10 == 2 || d14 == 88)) {
                                if (i16 > 0) {
                                    int d17 = sVar.d();
                                    String a14 = a(d17);
                                    int i21 = i16 - 1;
                                    byte[] bArr3 = new byte[i21];
                                    sVar2.a(bArr3, 0, i21);
                                    int a15 = a(bArr3, 0, d17);
                                    String str5 = new String(bArr3, 0, a15, a14);
                                    int b12 = a15 + b(d17);
                                    obj = new l("WXXX", str5, a(bArr3, b12, b(bArr3, b12), "ISO-8859-1"));
                                }
                                obj = str2;
                            } else {
                                if (d11 == 87) {
                                    String a16 = a(i10, d11, d12, d13, d14);
                                    byte[] bArr4 = new byte[i16];
                                    sVar2.a(bArr4, 0, i16);
                                    jVar = new l(a16, str2, new String(bArr4, 0, b(bArr4, 0), "ISO-8859-1"));
                                } else if (d11 == 80 && d12 == 82 && d13 == 73 && d14 == 86) {
                                    byte[] bArr5 = new byte[i16];
                                    sVar2.a(bArr5, 0, i16);
                                    int b13 = b(bArr5, 0);
                                    jVar = new j(new String(bArr5, 0, b13, "ISO-8859-1"), b(bArr5, b13 + 1, i16));
                                } else if (d11 == 71 && d12 == 69 && d13 == 79 && (d14 == 66 || i10 == 2)) {
                                    int d18 = sVar.d();
                                    String a17 = a(d18);
                                    int i22 = i16 - 1;
                                    byte[] bArr6 = new byte[i22];
                                    sVar2.a(bArr6, 0, i22);
                                    int b14 = b(bArr6, 0);
                                    String str6 = new String(bArr6, 0, b14, "ISO-8859-1");
                                    int i23 = b14 + 1;
                                    int a18 = a(bArr6, i23, d18);
                                    String a19 = a(bArr6, i23, a18, a17);
                                    int b15 = a18 + b(d18);
                                    int a20 = a(bArr6, b15, d18);
                                    obj = new f(str6, a19, a(bArr6, b15, a20, a17), b(bArr6, a20 + b(d18), i22));
                                } else {
                                    try {
                                        if (i10 != 2 ? !(d11 == 65 && d12 == 80 && d13 == 73 && d14 == 67) : !(d11 == 80 && d12 == 73 && d13 == 67)) {
                                            i15 = i12;
                                            if (d11 != 67 || d12 != 79 || d13 != 77 || (d14 != 77 && i10 != 2)) {
                                                sVar2 = sVar;
                                                if (d11 == 67 && d12 == 72 && d13 == 65 && d14 == 80) {
                                                    eVar = a(sVar, i16, i10, z10, i11, aVar);
                                                } else if (d11 == 67 && d12 == 84 && d13 == 79 && d14 == 67) {
                                                    eVar = b(sVar, i16, i10, z10, i11, aVar);
                                                } else {
                                                    String a21 = a(i10, d11, d12, d13, d14);
                                                    byte[] bArr7 = new byte[i16];
                                                    sVar2.a(bArr7, 0, i16);
                                                    eVar = new com.anythink.expressad.exoplayer.g.b.b(a21, bArr7);
                                                }
                                            } else if (i16 < 4) {
                                                sVar2 = sVar;
                                                eVar = 0;
                                            } else {
                                                int d19 = sVar.d();
                                                String a22 = a(d19);
                                                byte[] bArr8 = new byte[3];
                                                sVar2 = sVar;
                                                sVar2.a(bArr8, 0, 3);
                                                String str7 = new String(bArr8, 0, 3);
                                                int i24 = i16 - 4;
                                                byte[] bArr9 = new byte[i24];
                                                sVar2.a(bArr9, 0, i24);
                                                int a23 = a(bArr9, 0, d19);
                                                String str8 = new String(bArr9, 0, a23, a22);
                                                int b16 = a23 + b(d19);
                                                eVar = new e(str7, str8, a(bArr9, b16, a(bArr9, b16, d19), a22));
                                            }
                                        } else {
                                            try {
                                                int d20 = sVar.d();
                                                String a24 = a(d20);
                                                int i25 = i16 - 1;
                                                byte[] bArr10 = new byte[i25];
                                                sVar2.a(bArr10, 0, i25);
                                                if (i10 == 2) {
                                                    StringBuilder sb2 = new StringBuilder("image/");
                                                    i15 = i12;
                                                    sb2.append(af.d(new String(bArr10, 0, 3, "ISO-8859-1")));
                                                    d10 = sb2.toString();
                                                    if (be.I.equals(d10)) {
                                                        d10 = be.V;
                                                    }
                                                    b10 = 2;
                                                } else {
                                                    i15 = i12;
                                                    b10 = b(bArr10, 0);
                                                    d10 = af.d(new String(bArr10, 0, b10, "ISO-8859-1"));
                                                    if (d10.indexOf(47) == -1) {
                                                        d10 = "image/".concat(d10);
                                                    }
                                                }
                                                int i26 = bArr10[b10 + 1] & DefaultClassResolver.NAME;
                                                int i27 = b10 + 2;
                                                int a25 = a(bArr10, i27, d20);
                                                sVar2 = sVar;
                                                eVar = new com.anythink.expressad.exoplayer.g.b.a(d10, new String(bArr10, i27, a25 - i27, a24), i26, b(bArr10, a25 + b(d20), i25));
                                            } catch (UnsupportedEncodingException unused) {
                                                sVar2 = sVar;
                                                i14 = i12;
                                                str3 = str;
                                                try {
                                                    Log.w(str3, "Unsupported character encoding");
                                                    sVar2.c(i14);
                                                    return null;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    sVar2.c(i14);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                sVar2 = sVar;
                                                i14 = i12;
                                                sVar2.c(i14);
                                                throw th;
                                            }
                                        }
                                    } catch (UnsupportedEncodingException unused2) {
                                        sVar2 = sVar;
                                        str3 = str;
                                        i14 = i15;
                                        Log.w(str3, "Unsupported character encoding");
                                        sVar2.c(i14);
                                        return null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sVar2 = sVar;
                                        i14 = i15;
                                        sVar2.c(i14);
                                        throw th;
                                    }
                                }
                                obj = jVar;
                            }
                            i15 = i12;
                            eVar = obj;
                        }
                        if (eVar == 0) {
                            str3 = str;
                            try {
                                Log.w(str3, "Failed to decode frame: id=" + a(i10, d11, d12, d13, d14) + ", frameSize=" + i16);
                            } catch (UnsupportedEncodingException unused3) {
                                i14 = i15;
                                Log.w(str3, "Unsupported character encoding");
                                sVar2.c(i14);
                                return null;
                            }
                        }
                        sVar2.c(i15);
                        return eVar;
                    } catch (UnsupportedEncodingException unused4) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (UnsupportedEncodingException unused5) {
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            ?? r02 = str2;
            Log.w(str, "Skipping unsupported compressed or encrypted frame");
            sVar2.c(i12);
            return r02;
        }
    }

    private static k a(s sVar, int i10) {
        if (i10 <= 0) {
            return null;
        }
        int d10 = sVar.d();
        String a10 = a(d10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        sVar.a(bArr, 0, i11);
        int a11 = a(bArr, 0, d10);
        String str = new String(bArr, 0, a11, a10);
        int b10 = a11 + b(d10);
        return new k("TXXX", str, a(bArr, b10, a(bArr, b10, d10), a10));
    }

    private static k a(s sVar, int i10, String str) {
        if (i10 <= 0) {
            return null;
        }
        int d10 = sVar.d();
        String a10 = a(d10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        sVar.a(bArr, 0, i11);
        return new k(str, null, new String(bArr, 0, a(bArr, 0, d10), a10));
    }

    private static com.anythink.expressad.exoplayer.g.b.a a(s sVar, int i10, int i11) {
        int b10;
        String concat;
        int d10 = sVar.d();
        String a10 = a(d10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        sVar.a(bArr, 0, i12);
        if (i11 == 2) {
            concat = "image/" + af.d(new String(bArr, 0, 3, "ISO-8859-1"));
            if (be.I.equals(concat)) {
                concat = be.V;
            }
            b10 = 2;
        } else {
            b10 = b(bArr, 0);
            String d11 = af.d(new String(bArr, 0, b10, "ISO-8859-1"));
            concat = d11.indexOf(47) == -1 ? "image/".concat(d11) : d11;
        }
        int i13 = bArr[b10 + 1] & DefaultClassResolver.NAME;
        int i14 = b10 + 2;
        int a11 = a(bArr, i14, d10);
        return new com.anythink.expressad.exoplayer.g.b.a(concat, new String(bArr, i14, a11 - i14, a10), i13, b(bArr, a11 + b(d10), i12));
    }

    private static c a(s sVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int c10 = sVar.c();
        int b10 = b(sVar.f9123a, c10);
        String str = new String(sVar.f9123a, c10, b10 - c10, "ISO-8859-1");
        sVar.c(b10 + 1);
        int i13 = sVar.i();
        int i14 = sVar.i();
        long h10 = sVar.h();
        long j10 = h10 == 4294967295L ? -1L : h10;
        long h11 = sVar.h();
        long j11 = h11 == 4294967295L ? -1L : h11;
        ArrayList arrayList = new ArrayList();
        int i15 = c10 + i10;
        while (sVar.c() < i15) {
            h a10 = a(i11, sVar, z10, i12, aVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new c(str, i13, i14, j10, j11, hVarArr);
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
            if (b10 % 2 == 0 && bArr[b10 + 1] == 0) {
                return b10;
            }
            b10 = b(bArr, b10 + 1);
        }
        return bArr.length;
    }

    private static String a(byte[] bArr, int i10, int i11, String str) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }
}
