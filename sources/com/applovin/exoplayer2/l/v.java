package com.applovin.exoplayer2.l;

import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f16336a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f16337b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f16338c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f16339d = new int[10];

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16340a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16341b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16342c;

        public a(int i10, int i11, boolean z10) {
            this.f16340a = i10;
            this.f16341b = i11;
            this.f16342c = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16343a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16344b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16345c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16346d;

        /* renamed from: e, reason: collision with root package name */
        public final int f16347e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final float f16348g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f16349h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f16350i;

        /* renamed from: j, reason: collision with root package name */
        public final int f16351j;

        /* renamed from: k, reason: collision with root package name */
        public final int f16352k;

        /* renamed from: l, reason: collision with root package name */
        public final int f16353l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f16354m;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, float f, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f16343a = i10;
            this.f16344b = i11;
            this.f16345c = i12;
            this.f16346d = i13;
            this.f16347e = i14;
            this.f = i15;
            this.f16348g = f;
            this.f16349h = z10;
            this.f16350i = z11;
            this.f16351j = i16;
            this.f16352k = i17;
            this.f16353l = i18;
            this.f16354m = z12;
        }
    }

    public static int a(byte[] bArr, int i10) {
        int i11;
        synchronized (f16338c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = c(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f16339d;
                        if (iArr.length <= i13) {
                            f16339d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f16339d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f16339d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }

    public static int b(byte[] bArr, int i10) {
        return bArr[i10 + 3] & Ascii.US;
    }

    public static int c(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static a b(byte[] bArr, int i10, int i11) {
        z zVar = new z(bArr, i10, i11);
        zVar.a(8);
        int d10 = zVar.d();
        int d11 = zVar.d();
        zVar.a();
        return new a(d10, d11, zVar.b());
    }

    private static int c(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < position) {
                int i13 = byteBuffer.get(i10) & DefaultClassResolver.NAME;
                if (i11 == 3) {
                    if (i13 == 1 && (byteBuffer.get(i12) & Ascii.US) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i10 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i13 == 0) {
                    i11++;
                }
                if (i13 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean a(String str, byte b10) {
        if (com.anythink.expressad.exoplayer.k.o.f9074h.equals(str) && (b10 & Ascii.US) == 6) {
            return true;
        }
        return com.anythink.expressad.exoplayer.k.o.f9075i.equals(str) && ((b10 & 126) >> 1) == 39;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.exoplayer2.l.v.b a(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.v.a(byte[], int, int):com.applovin.exoplayer2.l.v$b");
    }

    public static int a(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        com.applovin.exoplayer2.l.a.b(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static void a(z zVar, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((zVar.e() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }
}
