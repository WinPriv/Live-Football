package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ht, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0946Ht {
    public static byte[] A02;
    public static String[] A03 = {"bNwv9DTrsFpr", "zbhYB7daSjPcuvBmkTZuqaAPzZ9zn8h", "FRkSQOtD666PiwdWpMANCzaC3fIlZstE", "hSncHK0YMcK7Os9UUgTo3Hp6GRz3gib", "Da8z6HvdaVwrG586sIxSQ6hlHOkGiutI", "7Q5nL4gzRbsCGic6ITFl05T54duLJG5D", "soaxh0FZrqdNmpGhlM75NEwupCBAn2wQ", "H3bjs2QdHQpI"};
    public final int A00;
    public final List<byte[]> A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-22, Ascii.ETB, Ascii.ETB, Ascii.DC4, Ascii.ETB, -59, Ascii.NAK, 6, Ascii.ETB, Ascii.CAN, Ascii.SO, 19, Ascii.FF, -59, -19, -22, -5, -24, -59, 8, Ascii.DC4, 19, Ascii.VT, Ascii.SO, Ascii.FF};
    }

    static {
        A02();
    }

    public C0946Ht(List<byte[]> initializationData, int i10) {
        this.A01 = initializationData;
        this.A00 = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        r13.A0Y(r5);
        r7 = new byte[r9];
        r6 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r5 >= r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        r13.A0Z(1);
        r4 = r13.A0I();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r3 >= r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r2 = r13.A0I();
        r11 = com.facebook.ads.redexgen.X.HR.A03;
        r0 = com.facebook.ads.redexgen.X.HR.A03.length;
        java.lang.System.arraycopy(r11, 0, r7, r6, r0);
        r0 = com.facebook.ads.redexgen.X.HR.A03.length;
        r6 = r6 + r0;
        r1 = r13.A00;
        r0 = r13.A06();
        java.lang.System.arraycopy(r1, r0, r7, r6, r2);
        r6 = r6 + r2;
        r13.A0Z(r2);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (r9 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        r1 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        return new com.facebook.ads.redexgen.X.C0946Ht(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        r2 = java.util.Collections.singletonList(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C0946Ht A00(com.facebook.ads.redexgen.X.HV r13) throws com.facebook.ads.redexgen.X.C9R {
        /*
            r0 = 21
            r13.A0Z(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            int r0 = r13.A0E()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            r12 = r0 & 3
            int r10 = r13.A0E()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            r9 = 0
            int r5 = r13.A06()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            r4 = 0
        L15:
            r8 = 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0946Ht.A03
            r0 = 7
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0946Ht.A03
            java.lang.String r1 = "tNmJvjDEnkcZ"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "FarTxLmaqbLK"
            r0 = 0
            r2[r0] = r1
            if (r4 >= r10) goto L56
            r13.A0Z(r8)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            int r3 = r13.A0I()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            r2 = 0
        L44:
            if (r2 >= r3) goto L53
            int r1 = r13.A0I()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            int r0 = r1 + 4
            int r9 = r9 + r0
            r13.A0Z(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            int r2 = r2 + 1
            goto L44
        L53:
            int r4 = r4 + 1
            goto L15
        L56:
            r13.A0Y(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            byte[] r7 = new byte[r9]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            r6 = 0
            r5 = 0
        L5d:
            if (r5 >= r10) goto L8d
            r13.A0Z(r8)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            int r4 = r13.A0I()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            r3 = 0
        L67:
            if (r3 >= r4) goto L8a
            int r2 = r13.A0I()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            byte[] r11 = com.facebook.ads.redexgen.X.HR.A03     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            r1 = 0
            byte[] r0 = com.facebook.ads.redexgen.X.HR.A03     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            int r0 = r0.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            java.lang.System.arraycopy(r11, r1, r7, r6, r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            byte[] r0 = com.facebook.ads.redexgen.X.HR.A03     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            int r0 = r0.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            int r6 = r6 + r0
            byte[] r1 = r13.A00     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            int r0 = r13.A06()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            java.lang.System.arraycopy(r1, r0, r7, r6, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            int r6 = r6 + r2
            r13.A0Z(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            int r3 = r3 + 1
            goto L67
        L8a:
            int r5 = r5 + 1
            goto L5d
        L8d:
            if (r9 != 0) goto L91
            r2 = 0
            goto L95
        L91:
            java.util.List r2 = java.util.Collections.singletonList(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
        L95:
            int r1 = r12 + 1
            com.facebook.ads.redexgen.X.Ht r0 = new com.facebook.ads.redexgen.X.Ht     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            r0.<init>(r2, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9d
            return r0
        L9d:
            r3 = move-exception
            r2 = 0
            r1 = 25
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r1 = A01(r2, r1, r0)
            com.facebook.ads.redexgen.X.9R r0 = new com.facebook.ads.redexgen.X.9R
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0946Ht.A00(com.facebook.ads.redexgen.X.HV):com.facebook.ads.redexgen.X.Ht");
    }
}
