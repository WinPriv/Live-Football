package com.facebook.ads.redexgen.X;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class Bm {
    public static String[] A02 = {"6bTYjI7xiahg1uqAV8eewLZrNfj9ZPj", "ngeXPKLRRDCcDwFHaGe0eDwdNk9MsKP0", "GKtDxJ6", "TMKYymqQa", "6hy2FBj", "omQP2HfChml3facH7odpRvVYds2Y", "0Yg", "2mziQBXjxxZN6M5afK2REUi5LMQCqiEi"};
    public int A00;
    public final HV A01 = new HV(8);

    /* JADX WARN: Incorrect condition in loop: B:7:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A00(com.facebook.ads.redexgen.X.BP r8) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.HV r0 = r7.A01
            byte[] r0 = r0.A00
            r1 = 0
            r5 = 1
            r8.AD0(r0, r1, r5)
            com.facebook.ads.redexgen.X.HV r0 = r7.A01
            byte[] r0 = r0.A00
            r0 = r0[r1]
            r3 = r0 & 255(0xff, float:3.57E-43)
            if (r3 != 0) goto L16
            r0 = -9223372036854775808
            return r0
        L16:
            r6 = 128(0x80, float:1.8E-43)
            r4 = 0
        L19:
            r0 = r3 & r6
            if (r0 != 0) goto L3c
            int r6 = r6 >> 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.Bm.A02
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L36
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.Bm.A02
            java.lang.String r1 = "eov1UmgRTS2J9JWiL8HKDN2YxzkNqP4T"
            r0 = 1
            r2[r0] = r1
            int r4 = r4 + 1
            goto L19
        L36:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3c:
            r0 = r6 ^ (-1)
            r3 = r3 & r0
            com.facebook.ads.redexgen.X.HV r0 = r7.A01
            byte[] r0 = r0.A00
            r8.AD0(r0, r5, r4)
            r5 = 0
        L47:
            if (r5 >= r4) goto L75
            int r3 = r3 << 8
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.Bm.A02
            r0 = 7
            r1 = r1[r0]
            r0 = 16
            char r1 = r1.charAt(r0)
            r0 = 71
            if (r1 == r0) goto L6f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.Bm.A02
            java.lang.String r1 = "09Vxb0YRh5GFDnmrENphsjvB8xYQhkFk"
            r0 = 1
            r2[r0] = r1
            com.facebook.ads.redexgen.X.HV r0 = r7.A01
            byte[] r1 = r0.A00
            int r0 = r5 + 1
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            int r5 = r5 + 1
            goto L47
        L6f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L75:
            int r1 = r7.A00
            int r0 = r4 + 1
            int r1 = r1 + r0
            r7.A00 = r1
            long r0 = (long) r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Bm.A00(com.facebook.ads.redexgen.X.BP):long");
    }

    public final boolean A01(BP bp) throws IOException, InterruptedException {
        long A6r = bp.A6r();
        long j10 = 1024;
        if (A6r != -1 && A6r <= 1024) {
            j10 = A6r;
        }
        int i10 = (int) j10;
        boolean z10 = false;
        bp.AD0(this.A01.A00, 0, 4);
        long A0M = this.A01.A0M();
        this.A00 = 4;
        while (A0M != 440786851) {
            int i11 = this.A00 + 1;
            this.A00 = i11;
            if (i11 == i10) {
                return false;
            }
            bp.AD0(this.A01.A00, 0, 1);
            A0M = ((A0M << 8) & (-256)) | (this.A01.A00[0] & DefaultClassResolver.NAME);
        }
        long A00 = A00(bp);
        long j11 = this.A00;
        if (A00 == Long.MIN_VALUE) {
            return false;
        }
        if (A6r != -1 && j11 + A00 >= A6r) {
            return false;
        }
        while (true) {
            int i12 = this.A00;
            if (i12 >= j11 + A00) {
                return ((long) i12) == j11 + A00;
            }
            if (A00(bp) == Long.MIN_VALUE) {
                return z10;
            }
            long A002 = A00(bp);
            if (A002 < 0 || A002 > 2147483647L) {
                return false;
            }
            if (A002 != 0) {
                int i13 = (int) A002;
                bp.A3K(i13);
                this.A00 += i13;
            }
            z10 = false;
        }
    }
}
