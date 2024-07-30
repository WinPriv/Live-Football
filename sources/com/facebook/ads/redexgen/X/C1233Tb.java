package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1233Tb implements GQ {
    public static byte[] A0L;
    public static String[] A0M = {"xvXnimfZlroovEtMoHYEYdvHQmTptcRb", "VShQwZMBIZykoEi", "P7iiojcQSdjMkPZizdNAiKDH8422CMpJ", "OxKv", "P8zJvNho1beYtiBqU3s9pOljEd8sbOL5", "Bz35mpVTEU3xTv8hVu6cT493QseTsu6A", "YnRJs9xpv2Ig79N4M2dWIXRLqnd73xG0", "iIjgXD4YmMEy6XOGrZ4fgbIBHD"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public GQ A07;
    public C0923Gu A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final GQ A0D;
    public final GQ A0E;
    public final GQ A0F;
    public final InterfaceC0919Gq A0G;

    @Nullable
    public final InterfaceC0921Gs A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0M[1].length() != 15) {
                throw new RuntimeException();
            }
            A0M[1] = "0DeGlGnSrcDo9YH";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 36);
            i13++;
        }
    }

    public static void A06() {
        A0L = new byte[]{Ascii.FS, Ascii.GS, 48, Ascii.DC2, Ascii.DLE, Ascii.ESC, Ascii.SYN, Ascii.ETB, 49, 10, 7, Ascii.SYN, 0, 33, Ascii.SYN, Ascii.DC2, Ascii.ETB};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws IOException {
        try {
            this.A09 = C0925Gw.A02(gu);
            this.A06 = gu.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = gu.A00;
            this.A03 = gu.A03;
            this.A0B = A00(gu) != -1;
            boolean z10 = this.A0B;
            if (gu.A02 != -1 || this.A0B) {
                this.A01 = gu.A02;
            } else {
                this.A01 = this.A0G.A66(this.A09);
                if (this.A01 != -1) {
                    this.A01 -= gu.A03;
                    if (this.A01 <= 0) {
                        throw new GR(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e10) {
            A07(e10);
            throw e10;
        }
    }

    static {
        A06();
    }

    public C1233Tb(InterfaceC0919Gq interfaceC0919Gq, GQ gq, GQ gq2, @Nullable GO go, int i10, @Nullable InterfaceC0921Gs interfaceC0921Gs) {
        this.A0G = interfaceC0919Gq;
        this.A0D = gq2;
        this.A0I = (i10 & 1) != 0;
        this.A0K = (i10 & 2) != 0;
        this.A0J = (i10 & 4) != 0;
        this.A0F = gq;
        if (go != null) {
            this.A0E = new C1236Te(gq, go);
        } else {
            this.A0E = null;
        }
        this.A0H = interfaceC0921Gs;
    }

    private int A00(GU gu) {
        if (this.A0K && this.A0C) {
            return 0;
        }
        if (this.A0J && gu.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC0919Gq interfaceC0919Gq, String str, Uri uri) {
        H0 contentMetadata = interfaceC0919Gq.A67(str);
        Uri A01 = H1.A01(contentMetadata);
        return A01 == null ? uri : A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A03() throws IOException {
        GQ gq = this.A07;
        if (gq == null) {
            return;
        }
        try {
            gq.close();
        } finally {
            this.A07 = null;
            this.A0A = false;
            C0923Gu c0923Gu = this.A08;
            if (c0923Gu != null) {
                this.A0G.ADj(c0923Gu);
                this.A08 = null;
            }
        }
    }

    private void A04() {
        if (this.A0H != null && this.A04 > 0) {
            this.A0G.A5t();
            throw new NullPointerException(A02(0, 17, 87));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AEO(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof C0917Go)) {
            this.A0C = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b9, code lost:
    
        if (r4 != (-1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bb, code lost:
    
        r2 = java.lang.Math.min(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d0, code lost:
    
        if (r4 != (-1)) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(boolean r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1233Tb.A08(boolean):void");
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0D(java.io.IOException r3) {
        /*
        L0:
            if (r3 == 0) goto L14
            boolean r0 = r3 instanceof com.facebook.ads.redexgen.X.GR
            if (r0 == 0) goto Lf
            r0 = r3
            com.facebook.ads.redexgen.X.GR r0 = (com.facebook.ads.redexgen.X.GR) r0
            int r0 = r0.A00
            if (r0 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            java.lang.Throwable r3 = r3.getCause()
            goto L0
        L14:
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1233Tb.A0M
            r0 = 5
            r1 = r1[r0]
            r0 = 13
            char r1 = r1.charAt(r0)
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L2a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1233Tb.A0M
            java.lang.String r1 = "Fi50x9pU4R4a4ch"
            r0 = 1
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1233Tb.A0D(java.io.IOException):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e10) {
            A07(e10);
            throw e10;
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            long j10 = this.A03;
            long j11 = this.A02;
            String[] strArr = A0M;
            if (strArr[4].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[7] = "DFL6VfCjI9oAtZuqjooU4v3Ar2";
            strArr2[3] = "hOjd";
            if (j10 >= j11) {
                A08(true);
            }
            int read = this.A07.read(bArr, i10, i11);
            if (read != -1) {
                if (A0A()) {
                    this.A04 += read;
                }
                this.A03 += read;
                if (this.A01 != -1) {
                    this.A01 -= read;
                }
            } else if (this.A0A) {
                A05();
            } else if (this.A01 > 0 || this.A01 == -1) {
                A03();
                A08(false);
                return read(bArr, i10, i11);
            }
            return read;
        } catch (IOException e10) {
            if (this.A0A && A0D(e10)) {
                A05();
                return -1;
            }
            A07(e10);
            throw e10;
        }
    }
}
