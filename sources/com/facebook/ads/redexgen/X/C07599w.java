package com.facebook.ads.redexgen.X;

import com.anythink.expressad.foundation.h.m;
import com.anythink.expressad.video.module.a.a;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07599w {
    public static byte[] A00;
    public static String[] A01 = {"VvJRVU69OBzslE4p0Zfahzrb3nPsCKe", "zB", "Dc8Zie1A4h", "IkzAL6jiMaNeqHCHyOgeN31JBtAuXgmh", "IvEhEJvdlav", "U0ZY", "AtQ7wNEb", "nSd2surlWGidCnNOvkjufSfipgX2"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A07(HV hv, String str, String str2, DrmInitData drmInitData) {
        int i10 = A05[(hv.A0E() & 192) >> 6];
        int A0E = hv.A0E();
        int i11 = A04[(A0E & 56) >> 3];
        if ((A0E & 4) != 0) {
            i11++;
        }
        return Format.A07(str, A0A(0, 9, a.R), null, -1, -1, i11, i10, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A08(HV hv, String str, String str2, DrmInitData drmInitData) {
        hv.A0Z(2);
        int i10 = A05[(hv.A0E() & 192) >> 6];
        int A0E = hv.A0E();
        int i11 = A04[(A0E & 14) >> 1];
        if ((A0E & 1) != 0) {
            i11++;
        }
        if (((hv.A0E() & 30) >> 1) > 0 && (hv.A0E() & 2) != 0) {
            i11 += 2;
        }
        String A0A = A0A(9, 10, 49);
        if (hv.A04() > 0 && (hv.A0E() & 1) != 0) {
            A0A = A0A(19, 14, 63);
        }
        return Format.A07(str, A0A, null, -1, -1, i11, i10, null, drmInitData, 0, str2);
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{-12, 8, -9, -4, 2, -62, -12, -10, -58, -90, -70, -87, -82, -76, 116, -86, -90, -88, 120, -76, -56, -73, -68, -62, -126, -72, -76, -74, -122, Byte.MIN_VALUE, -67, -62, -74};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, m.a.f10162a, 512, 576, 640};
        A07 = new int[]{69, 87, 104, 121, 139, 174, 208, 243, com.anythink.expressad.foundation.g.a.aS, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00() {
        return 1536;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r3 == 32000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r0 = r4 * 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r3 = r4 * 4;
        r2 = com.facebook.ads.redexgen.X.C07599w.A01;
        r1 = r2[5];
        r0 = r2[0];
        r1 = r1.length();
        r0 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r1 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        com.facebook.ads.redexgen.X.C07599w.A01[1] = "Nn7BAMihkF3vkcKtO99yZwIrAOOwI";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r3 == 8056) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(int r5, int r6) {
        /*
            int r4 = r6 / 2
            if (r5 < 0) goto L10
            int[] r2 = com.facebook.ads.redexgen.X.C07599w.A05
            int r0 = r2.length
            if (r5 >= r0) goto L10
            if (r6 < 0) goto L10
            int[] r1 = com.facebook.ads.redexgen.X.C07599w.A07
            int r0 = r1.length
            if (r4 < r0) goto L12
        L10:
            r0 = -1
            return r0
        L12:
            r3 = r2[r5]
            r0 = 44100(0xac44, float:6.1797E-41)
            if (r3 != r0) goto L3b
            r3 = r1[r4]
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C07599w.A01
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 15
            if (r1 == r0) goto L35
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C07599w.A01
            java.lang.String r1 = "4eRsFOebWHxxrQNWOVJDeIaBrSAlnNpc"
            r0 = 3
            r2[r0] = r1
            int r0 = r6 % 2
            int r3 = r3 + r0
            int r0 = r3 * 2
            return r0
        L35:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3b:
            int[] r0 = com.facebook.ads.redexgen.X.C07599w.A02
            r4 = r0[r4]
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C07599w.A01
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L59
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C07599w.A01
            java.lang.String r1 = "WxhxKdWnRRsy4vVQ2SEOPzEThBAjhQcp"
            r0 = 3
            r2[r0] = r1
            r0 = 32000(0x7d00, float:4.4842E-41)
            if (r3 != r0) goto L6a
        L56:
            int r0 = r4 * 6
            return r0
        L59:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C07599w.A01
            java.lang.String r1 = "awXe"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "jT30HYGFGhYnOVyWil5hlLZLvnTO5rb"
            r0 = 0
            r2[r0] = r1
            r0 = 8056(0x1f78, float:1.1289E-41)
            if (r3 != r0) goto L6a
            goto L56
        L6a:
            int r3 = r4 * 4
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C07599w.A01
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L86
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C07599w.A01
            java.lang.String r1 = "Nn7BAMihkF3vkcKtO99yZwIrAOOwI"
            r0 = 1
            r2[r0] = r1
            return r3
        L86:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C07599w.A01(int, int):int");
    }

    public static int A02(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i10 = startIndex - 10;
        for (int i11 = position; i11 <= i10; i11++) {
            int startIndex2 = i11 + 4;
            int endIndex = byteBuffer.getInt(startIndex2);
            if ((endIndex & (-16777217)) == -1167101192) {
                return i11 - position;
            }
        }
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        int i10 = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            int[] iArr = A03;
            int fscod = byteBuffer.position();
            i10 = iArr[(byteBuffer.get(fscod + 4) & 48) >> 4];
        }
        int fscod2 = i10 * 256;
        return fscod2;
    }

    public static int A04(ByteBuffer byteBuffer, int i10) {
        boolean isMlp = (byteBuffer.get((byteBuffer.position() + i10) + 7) & DefaultClassResolver.NAME) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + (isMlp ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length >= 5) {
            int fscod = (bArr[4] & 192) >> 6;
            int frmsizecod = bArr[4] & 63;
            return A01(fscod, frmsizecod);
        }
        if (A01[7].length() == 0) {
            throw new RuntimeException();
        }
        A01[6] = "NuFbE2RcGiFtx9wQ";
        return -1;
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & DefaultClassResolver.NAME) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (r12 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        r19.A08(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02c3, code lost:
    
        if (r12 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C07589v A09(com.facebook.ads.redexgen.X.HU r19) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C07599w.A09(com.facebook.ads.redexgen.X.HU):com.facebook.ads.redexgen.X.9v");
    }
}
