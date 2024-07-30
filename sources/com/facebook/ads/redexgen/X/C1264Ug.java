package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.anythink.expressad.exoplayer.b;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ug, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1264Ug implements BO {
    public static byte[] A0C;
    public static String[] A0D = {"1wQJeguTcmzEzlcqQISF6uciTtBYCHEI", "1z5HoD8RnfRsH4NGqOJrgtDb3AvWKmRf", "OZb5z3fyn7DmUcX5PD2FSiUNDYO3SJGv", "xysXnf11fptxvGLEVlqKxNXP96VBbPb9", "B9gj7Y4phCIGiISa5KNqUW4wq7x20Uai", "0XWjmjuElj7dnGBGcTqheWJCaJtkSIxV", "xem2h", "3rpnxRNe64JCaC2IexlmS1y9p5GeiPOv"};
    public static final BR A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public BQ A02;
    public InterfaceC0812Cj A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<InterfaceC0812Cj> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final InterfaceC0810Ch A09;
    public final HV A0A;
    public final List<C0936Hh> A0B;

    public static String A0D(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{-90, -88, -110, -104, -12, Ascii.DC2, Ascii.US, Ascii.US, 32, 37, -47, Ascii.ETB, Ascii.SUB, Ascii.US, Ascii.NAK, -47, 36, 42, Ascii.US, Ascii.DC4, -47, 19, 42, 37, Ascii.SYN, -33, -47, -2, 32, 36, 37, -47, Ascii.GS, Ascii.SUB, Ascii.FS, Ascii.SYN, Ascii.GS, 42, -47, Ascii.US, 32, 37, -47, Ascii.DC2, -47, 5, 35, Ascii.DC2, Ascii.US, 36, 33, 32, 35, 37, -47, 4, 37, 35, Ascii.SYN, Ascii.DC2, Ascii.RS, -33, -98, -102, -100, -116, -61, -64, -47, -66};
    }

    static {
        A0G();
        A0E = new C1267Uj();
        A0F = C0940Hl.A08(A0D(0, 4, 26));
        A0G = C0940Hl.A08(A0D(62, 4, 14));
        A0H = C0940Hl.A08(A0D(66, 4, 48));
    }

    public C1264Ug() {
        this(0);
    }

    public C1264Ug(int i10) {
        this(1, i10);
    }

    public C1264Ug(int i10, int i11) {
        this(i10, new C0936Hh(0L), new C1279Ux(i11));
    }

    public C1264Ug(int i10, C0936Hh c0936Hh, InterfaceC0810Ch interfaceC0810Ch) {
        this.A09 = (InterfaceC0810Ch) H6.A01(interfaceC0810Ch);
        this.A05 = i10;
        if (i10 == 1 || i10 == 2) {
            this.A0B = Collections.singletonList(c0936Hh);
        } else {
            this.A0B = new ArrayList();
            this.A0B.add(c0936Hh);
        }
        this.A0A = new HV(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(C1264Ug c1264Ug) {
        int i10 = c1264Ug.A01;
        c1264Ug.A01 = i10 + 1;
        return i10;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        SparseArray<InterfaceC0812Cj> A4K = this.A09.A4K();
        int size = A4K.size();
        for (int i10 = 0; i10 < size; i10++) {
            SparseArray<InterfaceC0812Cj> sparseArray = this.A06;
            int initialPayloadReadersSize = A4K.keyAt(i10);
            sparseArray.put(initialPayloadReadersSize, A4K.valueAt(i10));
        }
        this.A06.put(0, new C1269Ul(new C1266Ui(this)));
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A8G(BQ bq) {
        this.A02 = bq;
        bq.AEE(new C1282Vb(b.f7291b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
    
        if (r8 == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010f, code lost:
    
        r13.A0A.A0Y(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011e, code lost:
    
        r8 = (r8 + 1) & 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012e, code lost:
    
        if (com.facebook.ads.redexgen.X.C1264Ug.A0D[1].charAt(3) == 'H') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0136, code lost:
    
        com.facebook.ads.redexgen.X.C1264Ug.A0D[3] = "dSZ0cSzoMmmORQANAKDw4NsHeD3mI6Jb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013d, code lost:
    
        if (r9 == r8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
    
        r3.AEC();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011b, code lost:
    
        if (r8 == r9) goto L59;
     */
    @Override // com.facebook.ads.redexgen.X.BO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ADQ(com.facebook.ads.redexgen.X.BP r14, com.facebook.ads.redexgen.X.BV r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1264Ug.ADQ(com.facebook.ads.redexgen.X.BP, com.facebook.ads.redexgen.X.BV):int");
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void AED(long j10, long j11) {
        int size = this.A0B.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0B.get(i10).A08();
        }
        this.A0A.A0V();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r3 = r3 + 1;
     */
    @Override // com.facebook.ads.redexgen.X.BO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AEm(com.facebook.ads.redexgen.X.BP r8) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.HV r0 = r7.A0A
            byte[] r5 = r0.A00
            r4 = 0
            r0 = 940(0x3ac, float:1.317E-42)
            r8.AD0(r5, r4, r0)
            r3 = 0
        Lb:
            r6 = 188(0xbc, float:2.63E-43)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1264Ug.A0D
            r0 = 1
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 72
            if (r1 == r0) goto L21
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L21:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1264Ug.A0D
            java.lang.String r1 = "vUfHgSsJvwNFwwToyev4j8iiTP0xmLzC"
            r0 = 1
            r2[r0] = r1
            if (r3 >= r6) goto L42
            r2 = 0
        L2b:
            r0 = 5
            if (r2 != r0) goto L33
            r8.AEk(r3)
            r0 = 1
            return r0
        L33:
            int r0 = r2 * 188
            int r0 = r0 + r3
            r1 = r5[r0]
            r0 = 71
            if (r1 == r0) goto L3f
            int r3 = r3 + 1
            goto Lb
        L3f:
            int r2 = r2 + 1
            goto L2b
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1264Ug.AEm(com.facebook.ads.redexgen.X.BP):boolean");
    }
}
