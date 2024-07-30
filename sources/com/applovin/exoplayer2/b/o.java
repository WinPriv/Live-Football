package com.applovin.exoplayer2.b;

import com.anythink.expressad.foundation.h.m;
import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f13492a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f13493b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f13494c = {64, 112, 128, 192, 224, 256, 384, m.a.f10162a, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static boolean a(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.o.b(byte[]):int");
    }

    private static com.applovin.exoplayer2.l.x c(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new com.applovin.exoplayer2.l.x(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (d(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b10 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b10;
            }
        }
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(copyOf);
        if (copyOf[0] == 31) {
            com.applovin.exoplayer2.l.x xVar2 = new com.applovin.exoplayer2.l.x(copyOf);
            while (xVar2.a() >= 16) {
                xVar2.b(2);
                xVar.a(xVar2.c(14), 14);
            }
        }
        xVar.a(copyOf);
        return xVar;
    }

    private static boolean d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 != -2 && b10 != -1) {
            return false;
        }
        return true;
    }

    public static com.applovin.exoplayer2.v a(byte[] bArr, String str, String str2, com.applovin.exoplayer2.d.e eVar) {
        com.applovin.exoplayer2.l.x c10 = c(bArr);
        c10.b(60);
        int i10 = f13492a[c10.c(6)];
        int i11 = f13493b[c10.c(4)];
        int c11 = c10.c(5);
        int[] iArr = f13494c;
        int i12 = c11 >= iArr.length ? -1 : (iArr[c11] * 1000) / 2;
        c10.b(10);
        return new v.a().a(str).f(com.anythink.expressad.exoplayer.k.o.D).d(i12).k(i10 + (c10.c(2) > 0 ? 1 : 0)).l(i11).a(eVar).c(str2).a();
    }

    public static int a(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        int position = byteBuffer.position();
        byte b12 = byteBuffer.get(position);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(position + 4) & 7) << 4;
                b11 = byteBuffer.get(position + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(position + 4) & 1) << 6;
                b10 = byteBuffer.get(position + 5);
            } else {
                i10 = (byteBuffer.get(position + 5) & 7) << 4;
                b11 = byteBuffer.get(position + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(position + 5) & 1) << 6;
        b10 = byteBuffer.get(position + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }
}
