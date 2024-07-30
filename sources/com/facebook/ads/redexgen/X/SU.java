package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import com.anythink.basead.d.i;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.image.JavaBlurProcess;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class SU implements LK {
    public static String[] A00 = {"UhM7Ai8f8yxWhzgolxmUYATwWKl", "6OEGLPrlxaKSh1ZSF21FWdfeePk", "uzkBamH3JmrgiF8PawwlD9rEqRlg3", "S", "Bf1A", i.f3957a, "WivOSd45PxVpESGcThSNOGX3H0BUK90I", "ONyzxV77lR28cLTyDPJ02z4isRq"};
    public static final short[] A02 = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};
    public static final byte[] A01 = {9, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.CR, Ascii.SO, Ascii.SO, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.DLE, 17, 17, 17, 17, 17, 17, 17, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN};

    /* JADX WARN: Code restructure failed: missing block: B:78:0x02e1, code lost:
    
        if (r3 >= r25) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02e3, code lost:
    
        r3 = r3 - r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02e5, code lost:
    
        r0 = r2[r3];
        r11 = r11 - ((r0 >>> 16) & com.anythink.expressad.exoplayer.k.p.f9095b);
        r0 = r2[r3];
        r13 = r13 - ((r0 >>> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
        r0 = r2[r3];
        r15 = r15 - (r0 & com.anythink.expressad.exoplayer.k.p.f9095b);
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02ff, code lost:
    
        if (r0 >= r39) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0301, code lost:
    
        r34 = r34 + r43;
        r35 = r35 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0305, code lost:
    
        r0 = r42[r34];
        r2[r3] = r0;
        r0 = r42[r34];
        r17 = r17 + ((r0 >>> 16) & com.anythink.expressad.exoplayer.k.p.f9095b);
        r0 = r42[r34];
        r19 = r19 + ((r0 >>> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
        r0 = r42[r34];
        r21 = r21 + (r0 & com.anythink.expressad.exoplayer.k.p.f9095b);
        r5 = r5 + r17;
        r7 = r7 + r19;
        r9 = r9 + r21;
        r36 = r36 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x032e, code lost:
    
        if (r36 < r25) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0330, code lost:
    
        r36 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0332, code lost:
    
        r0 = r2[r36];
        r11 = r11 + ((r0 >>> 16) & com.anythink.expressad.exoplayer.k.p.f9095b);
        r0 = r2[r36];
        r13 = r13 + ((r0 >>> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
        r0 = r2[r36];
        r15 = r15 + (r0 & com.anythink.expressad.exoplayer.k.p.f9095b);
        r0 = r2[r36];
        r17 = r17 - ((r0 >>> 16) & com.anythink.expressad.exoplayer.k.p.f9095b);
        r0 = r2[r36];
        r19 = r19 - ((r0 >>> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
        r0 = r2[r36];
        r21 = r21 - (r0 & com.anythink.expressad.exoplayer.k.p.f9095b);
        r33 = r33 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0373, code lost:
    
        if (r3 >= r25) goto L65;
     */
    /* JADX WARN: Incorrect condition in loop: B:53:0x01db */
    /* JADX WARN: Incorrect condition in loop: B:74:0x0294 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(int[] r42, int r43, int r44, int r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SU.A00(int[], int, int, int, int, int, int):void");
    }

    public final Bitmap A02(Bitmap bitmap, float f) {
        int w10 = bitmap.getWidth();
        int h10 = bitmap.getHeight();
        try {
            int[] iArr = new int[w10 * h10];
            bitmap.getPixels(iArr, 0, w10, 0, 0, w10, h10);
            int i10 = LP.A00;
            ArrayList arrayList = new ArrayList(i10);
            ArrayList<JavaBlurProcess.BlurTask> vertical = new ArrayList<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int h11 = h10;
                int cores = i11;
                arrayList.add(new LO(iArr, w10, h11, (int) f, i10, cores, 1));
                h10 = h11;
                int cores2 = i11;
                vertical.add(new LO(iArr, w10, h10, (int) f, i10, cores2, 2));
            }
            try {
                LP.A01.invokeAll(arrayList);
                try {
                    LP.A01.invokeAll(vertical);
                    try {
                        return Bitmap.createBitmap(iArr, w10, h10, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError unused) {
                        return null;
                    }
                } catch (InterruptedException unused2) {
                    return null;
                }
            } catch (InterruptedException unused3) {
                return null;
            }
        } catch (OutOfMemoryError unused4) {
            return null;
        }
    }
}
