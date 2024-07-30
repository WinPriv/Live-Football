package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class W6<T> implements InterfaceC07158d<T> {
    public static byte[] A06;
    public C8V A00;
    public C8V A01;
    public List<W6<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final C8U A04;
    public final C07228k A05;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-28, 2, Ascii.SI, -63, Ascii.DLE, Ascii.SI, Ascii.CR, Ascii.SUB, -63, 5, 6, Ascii.CR, 6, Ascii.NAK, 6, -63, 4, Ascii.SYN, 19, Ascii.DC4, Ascii.DLE, 19, Ascii.DC4, -63, 17, Ascii.DLE, 10, Ascii.SI, Ascii.NAK, 10, Ascii.SI, 8, -63, 2, Ascii.NAK, -63, Ascii.NAK, 9, 6, -63, 5, 2, Ascii.NAK, 2, 3, 2, Ascii.DC4, 6, -63, Ascii.DC4, Ascii.NAK, 2, 19, Ascii.NAK, -38, Ascii.FF, 9, 10, 6, 9, -73, 7, 6, 10, 0, Ascii.VT, 0, 6, 5, -73, 0, 10, -73, -8, Ascii.VT, -73, -65, -68, -5, -61, -68, -5, -64, -61, -73, -8, 5, -5, -73, 9, -4, -6, 6, 9, -5, -73, -3, 0, 3, -4, -73, 10, -4, 8, Ascii.FF, -4, 5, -6, -4, -73, 10, Ascii.VT, -8, 9, Ascii.VT, 10, -73, -8, Ascii.VT, -73, -65, -68, -5, -61, -68, -5, -64, -47, -73, -5, -8, Ascii.VT, -8, -73, -1, -8, 10, -73, 7, 9, 6, -7, -8, -7, 3, Ascii.DLE, -73, -7, -4, -4, 5, -73, 3, 6, 10, Ascii.VT, -78, -28, -31, -30, -34, -31, -113, -33, -34, -30, -40, -29, -40, -34, -35, -113, -40, -30, -113, -48, -29, -113, -105, -108, -45, -101, -108, -45, -104, -101, -113, -47, -28, -29, -113, -31, -44, -46, -34, -31, -45, -113, -43, -40, -37, -44, -113, -30, -44, -32, -28, -44, -35, -46, -44, -113, -34, -35, -37, -24, -113, -41, -48, -30, -113, -43, -40, -37, -44, -113, -108, -45, -87, -113, -45, -48, -29, -48, -113, -41, -48, -30, -113, -33, -31, -34, -47, -48, -47, -37, -24, -113, -47, -44, -44, -35, -113, -37, -34, -30, -29, -27, 0, 8, Ascii.VT, 4, 3, -65, 19, Ascii.SO, -65, 0, 3, 3, -65, 3, 0, 19, 0, -65, 19, Ascii.SO, -65, Ascii.VT, Ascii.SO, 6, -72, -45, -37, -34, -41, -42, -110, -26, -31, -110, -43, -34, -41, -45, -28, -110, -42, -45, -26, -45, -44, -45, -27, -41, -9, Ascii.DC2, Ascii.SUB, Ascii.GS, Ascii.SYN, Ascii.NAK, -47, 37, 32, -47, Ascii.ETB, Ascii.SYN, 37, Ascii.DC4, Ascii.EM, -47, Ascii.NAK, Ascii.DC2, 37, Ascii.DC2, -47, Ascii.ETB, 35, 32, Ascii.RS, -47, Ascii.GS, 32, Ascii.CAN, 34, 61, 69, 72, 65, 64, -4, 80, 75, -4, 67, 65, 80, -4, 78, 65, 63, 75, 78, 64, -4, 63, 75, 81, 74, 80, 5, 32, 40, 43, 36, 35, -33, 51, 46, -33, 52, 47, 35, 32, 51, 36, -33, 37, 40, 43, 36, -33, 50, 36, 48, 52, 36, 45, 34, 36, 43, 62, 60, 72, 75, 61, Ascii.US, 66, 69, 62, Ascii.ESC, 58, 76, 62, 61, 43, 62, 60, 72, 75, 61, Ascii.GS, 58, 77, 58, 59, 58, 76, 62, -7, 60, 69, 72, 76, 62, 61, -8, Ascii.VT, 9, Ascii.NAK, Ascii.CAN, 10, -20, Ascii.SI, Ascii.DC2, Ascii.VT, -24, 7, Ascii.EM, Ascii.VT, 10, -8, Ascii.VT, 9, Ascii.NAK, Ascii.CAN, 10, -22, 7, Ascii.SUB, 7, 8, 7, Ascii.EM, Ascii.VT, -58, Ascii.SI, Ascii.EM, -58, 9, Ascii.DC2, Ascii.NAK, Ascii.EM, Ascii.VT, 10, -24, 1, -2, 1, 2, 10, 1, -77, -27, -8, -10, 2, 5, -9, -39, -4, -1, -8, -43, -12, 6, -8, -9, -27, -8, -10, 2, 5, -9, -41, -12, 7, -12, -11, -12, 6, -8, -77, -7, -8, 7, -10, -5, Ascii.VT, Ascii.GS, Ascii.SUB, Ascii.ESC, Ascii.ETB, Ascii.SUB, 5, 2, Ascii.NAK, 2};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/W6<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(W7 w72) {
        if (!this.A02.remove(w72)) {
            return false;
        }
        if (w72.A5L() > 0 && w72.A01().A02.A05(w72.A01().A01).equals(this.A01)) {
            this.A01 = w72.A00().A02;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.W6 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public W6(C07128a c07128a, InterfaceC07208i interfaceC07208i) throws IOException {
        this.A05 = new C07228k(c07128a.A04(A00(515, 4, 63)), interfaceC07208i);
        this.A04 = new C8U(new File(c07128a.A05(), A00(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, 6, 70)));
        this.A00 = this.A04.A03();
        A05(interfaceC07208i);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.W6 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i10, int i11) throws IOException {
        this.A00 = new C8V(i10, i11);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.W6 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.W7 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/W6<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(W7 w72) throws C07248m {
        if (!this.A03) {
            if (A06(w72)) {
                if (w72.A5L() == 0) {
                    return;
                }
                if (this.A00.A04(w72.A00().A02) == 0) {
                    try {
                        Iterator<C07198h> it = w72.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), w72.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e10) {
                        throw new C07248m(A00(361, 30, 93), e10);
                    }
                }
                throw new C07248m(A00(0, 54, 63));
            }
            throw new C07248m(A00(466, 43, 49));
        }
        throw new C07248m(A00(427, 39, 68));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.W6 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0066 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(com.facebook.ads.redexgen.X.InterfaceC07208i r11) throws java.io.IOException {
        /*
            r10 = this;
            com.facebook.ads.redexgen.X.8k r0 = r10.A05
            int r0 = r0.A06()
            r5 = 0
            com.facebook.ads.redexgen.X.8V r3 = new com.facebook.ads.redexgen.X.8V
            r3.<init>(r0, r5)
            com.facebook.ads.redexgen.X.8V r0 = r10.A00
            int r0 = r3.A04(r0)
            r4 = 3
            r9 = 2
            r8 = 1
            if (r0 <= 0) goto L5c
            java.util.Locale r7 = java.util.Locale.US
            r0 = 4
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.facebook.ads.redexgen.X.8V r0 = r10.A00
            int r0 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r5] = r0
            com.facebook.ads.redexgen.X.8V r0 = r10.A00
            int r0 = r0.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r8] = r0
            int r0 = r3.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r9] = r0
            int r0 = r3.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r4] = r0
            r2 = 54
            r1 = 102(0x66, float:1.43E-43)
            r0 = 53
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r11.ADw(r0)
            r10.A00 = r3
        L5b:
            return
        L5c:
            int r1 = r3.A02()
            com.facebook.ads.redexgen.X.8V r0 = r10.A00
            int r0 = r0.A02()
            if (r1 >= r0) goto L5b
            com.facebook.ads.redexgen.X.8k r0 = r10.A05
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L7c
            com.facebook.ads.redexgen.X.8V r3 = new com.facebook.ads.redexgen.X.8V
            com.facebook.ads.redexgen.X.8k r0 = r10.A05
            int r0 = r0.A06()
            r3.<init>(r0, r5)
            goto L5c
        L7c:
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.facebook.ads.redexgen.X.8V r0 = r10.A00
            int r0 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r5] = r0
            com.facebook.ads.redexgen.X.8V r0 = r10.A00
            int r0 = r0.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r8] = r0
            int r0 = r3.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r9] = r0
            r2 = 156(0x9c, float:2.19E-43)
            r1 = 101(0x65, float:1.42E-43)
            r0 = 13
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r11.ADw(r0)
            com.facebook.ads.redexgen.X.8k r0 = r10.A05
            int r2 = r0.A06()
            com.facebook.ads.redexgen.X.8k r0 = r10.A05
            int r1 = r0.A07()
            com.facebook.ads.redexgen.X.8V r0 = new com.facebook.ads.redexgen.X.8V
            r0.<init>(r2, r1)
            r10.A00 = r0
            com.facebook.ads.redexgen.X.8U r1 = r10.A04
            com.facebook.ads.redexgen.X.8V r0 = r10.A00
            r1.A04(r0)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W6.A05(com.facebook.ads.redexgen.X.8i):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.W6 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.W7 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07158d
    public final synchronized InterfaceC07148c A5K(byte[] bArr, int[] iArr) throws C07248m {
        W6<T>.RecordFileBasedFetch w72;
        if (!this.A03) {
            int i10 = 0;
            int i11 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean z10 = true;
                while (true) {
                    C8Y sequenceFetchResult = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i10, iArr, i11);
                    int A00 = sequenceFetchResult.A01().A00();
                    int storageOffset = sequenceFetchResult.A01().A01();
                    int i12 = A00 - storageOffset;
                    int storageOffset2 = sequenceFetchResult.A01().A02();
                    i10 += storageOffset2;
                    i11 += i12;
                    if (sequenceFetchResult.A01().A03() == C8W.A02) {
                        arrayList.add(sequenceFetchResult);
                    }
                    if (sequenceFetchResult.A01().A03() == C8W.A03) {
                        break;
                    }
                    if (sequenceFetchResult.A01().A03() == C8W.A04) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 != storageOffset4 + 1) {
                            this.A01 = new C8V(this.A01.A02() + 1, 0);
                        } else {
                            z10 = false;
                            break;
                        }
                    } else {
                        this.A01 = this.A01.A05(i12);
                    }
                }
                w72 = new W7(this, arrayList, z10);
                this.A02.add(w72);
                if (!arrayList.isEmpty()) {
                    C8V c8v = w72.A01().A02;
                    int storageOffset5 = w72.A01().A01;
                    this.A01 = c8v.A05(storageOffset5);
                }
            } catch (IOException e10) {
                throw new C07248m(A00(306, 29, 79), e10);
            }
        } else {
            throw new C07248m(A00(391, 36, 119));
        }
        return w72;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.W6 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07158d
    public final synchronized int A7G() throws C07248m {
        int A09;
        if (!this.A03) {
            try {
                A09 = this.A05.A09();
                int A02 = this.A00.A02();
                int count = this.A05.A06();
                if (A02 == count) {
                    int count2 = this.A00.A03();
                    A09 -= count2;
                }
            } catch (IOException e10) {
                throw new C07248m(A00(335, 26, 122), e10);
            }
        } else {
            throw new C07248m(A00(427, 39, 68));
        }
        return A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.W6 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07158d
    public final synchronized void AEw(byte[] bArr) throws C07248m {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e10) {
                throw new C07248m(A00(257, 25, 61), e10);
            }
        } else {
            throw new C07248m(A00(427, 39, 68));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.W6 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07158d
    public final synchronized void clear() throws C07248m {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e10) {
            throw new C07248m(A00(282, 24, 16), e10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.W6 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
