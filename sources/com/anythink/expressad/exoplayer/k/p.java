package com.anythink.expressad.exoplayer.k;

import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final int f9095b = 255;

    /* renamed from: d, reason: collision with root package name */
    private static final String f9097d = "NalUnitUtil";

    /* renamed from: e, reason: collision with root package name */
    private static final int f9098e = 6;
    private static final int f = 7;

    /* renamed from: g, reason: collision with root package name */
    private static final int f9099g = 39;

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f9094a = {0, 0, 0, 1};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f9096c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: h, reason: collision with root package name */
    private static final Object f9100h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static int[] f9101i = new int[10];

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f9102a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9103b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f9104c;

        public a(int i10, int i11, boolean z10) {
            this.f9102a = i10;
            this.f9103b = i11;
            this.f9104c = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f9105a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9106b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9107c;

        /* renamed from: d, reason: collision with root package name */
        public final float f9108d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f9109e;
        public final boolean f;

        /* renamed from: g, reason: collision with root package name */
        public final int f9110g;

        /* renamed from: h, reason: collision with root package name */
        public final int f9111h;

        /* renamed from: i, reason: collision with root package name */
        public final int f9112i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f9113j;

        public b(int i10, int i11, int i12, float f, boolean z10, boolean z11, int i13, int i14, int i15, boolean z12) {
            this.f9105a = i10;
            this.f9106b = i11;
            this.f9107c = i12;
            this.f9108d = f;
            this.f9109e = z10;
            this.f = z11;
            this.f9110g = i13;
            this.f9111h = i14;
            this.f9112i = i15;
            this.f9113j = z12;
        }
    }

    private p() {
    }

    public static int a(byte[] bArr, int i10) {
        int i11;
        synchronized (f9100h) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                        break;
                    }
                    i12++;
                }
                if (i12 < i10) {
                    int[] iArr = f9101i;
                    if (iArr.length <= i13) {
                        f9101i = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f9101i[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f9101i[i16] - i15;
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

    private static int b(byte[] bArr, int i10) {
        return bArr[i10 + 3] & Ascii.US;
    }

    private static int c(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    private static a b(byte[] bArr, int i10, int i11) {
        t tVar = new t(bArr, i10, i11);
        tVar.a(8);
        int c10 = tVar.c();
        int c11 = tVar.c();
        tVar.a();
        return new a(c10, c11, tVar.b());
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
        return (o.f9074h.equals(str) && (b10 & Ascii.US) == 6) || (o.f9075i.equals(str) && ((b10 & 126) >> 1) == 39);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.expressad.exoplayer.k.p.b a(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.k.p.a(byte[], int, int):com.anythink.expressad.exoplayer.k.p$b");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0094, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.k.p.a(byte[], int, int, boolean[]):int");
    }

    private static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static void a(t tVar, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((tVar.d() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }
}
