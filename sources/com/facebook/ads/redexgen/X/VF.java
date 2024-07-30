package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.http.StatusLine;

/* loaded from: assets/audience_network.dex */
public final class VF implements BO {
    public static byte[] A0X;
    public static String[] A0Y = {"bw2Pz5UYSLOOesGIJaWlA3GOzVLZPAg", "gG3", "yjdYoV9UEi8qMqqcqGKRK6SXbov0CwAj", "4kzePG", "OMn6r0AgRGwk9BJzU", "o", "aMFqcwP4FMZJ2yTkvuTBoGT2vGZy4ax", "h66GloOgbywQ1e6PB204dGM9vAJrPucq"};
    public static final BR A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public BQ A0C;
    public C1 A0D;
    public HV A0E;
    public boolean A0F;
    public boolean A0G;
    public InterfaceC0789Ba[] A0H;
    public InterfaceC0789Ba[] A0I;
    public final int A0J;
    public final SparseArray<C1> A0K;

    @Nullable
    public final DrmInitData A0L;

    @Nullable
    public final InterfaceC0789Ba A0M;

    @Nullable
    public final CA A0N;
    public final HV A0O;
    public final HV A0P;
    public final HV A0Q;
    public final HV A0R;

    @Nullable
    public final C0936Hh A0S;
    public final ArrayDeque<VL> A0T;
    public final ArrayDeque<C0> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r10 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010a, code lost:
    
        r22 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0107, code lost:
    
        if (r10 != 0) goto L28;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 35
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(com.facebook.ads.redexgen.X.C1 r28, int r29, long r30, int r32, com.facebook.ads.redexgen.X.HV r33, int r34) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VF.A00(com.facebook.ads.redexgen.X.C1, int, long, int, com.facebook.ads.redexgen.X.HV, int):int");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Pair<Long, C1287Vg> A04(HV hv, long j10) throws C9R {
        long A0N;
        long A0N2;
        hv.A0Y(8);
        int A01 = AbstractC0793Bp.A01(hv.A08());
        hv.A0Z(4);
        long A0M = hv.A0M();
        if (A01 == 0) {
            A0N = hv.A0M();
            A0N2 = j10 + hv.A0M();
        } else {
            A0N = hv.A0N();
            A0N2 = j10 + hv.A0N();
        }
        long A0F = C0940Hl.A0F(A0N, 1000000L, A0M);
        hv.A0Z(2);
        int A0I = hv.A0I();
        int[] iArr = new int[A0I];
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        long[] jArr3 = new long[A0I];
        if (A0Y[2].charAt(18) != 'K') {
            throw new RuntimeException();
        }
        A0Y[5] = "s";
        int i10 = 0;
        long j11 = A0F;
        while (i10 < A0I) {
            int A08 = hv.A08();
            if ((Integer.MIN_VALUE & A08) != 0) {
                throw new C9R(A0A(581, 28, 75));
            }
            long A0M2 = hv.A0M();
            iArr[i10] = Integer.MAX_VALUE & A08;
            jArr[i10] = A0N2;
            jArr3[i10] = j11;
            A0N += A0M2;
            j11 = C0940Hl.A0F(A0N, 1000000L, A0M);
            jArr2[i10] = j11 - jArr3[i10];
            hv.A0Z(4);
            int i11 = iArr[i10];
            if (A0Y[3].length() != 6) {
                A0Y[1] = "dhc";
                A0N2 += i11;
                i10 += 0;
            } else {
                A0Y[5] = "h";
                A0N2 += i11;
                i10++;
            }
        }
        return Pair.create(Long.valueOf(A0F), new C1287Vg(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C1 A09(HV hv, SparseArray<C1> sparseArray) {
        hv.A0Y(8);
        int A00 = AbstractC0793Bp.A00(hv.A08());
        C1 A08 = A08(sparseArray, hv.A08());
        if (A08 == null) {
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0N = hv.A0N();
            A08.A07.A05 = A0N;
            A08.A07.A04 = A0N;
        }
        C0799Bv c0799Bv = A08.A04;
        A08.A07.A07 = new C0799Bv((A00 & 2) != 0 ? hv.A0H() - 1 : c0799Bv.A02, (A00 & 8) != 0 ? hv.A0H() : c0799Bv.A00, (A00 & 16) != 0 ? hv.A0H() : c0799Bv.A03, (A00 & 32) != 0 ? hv.A0H() : c0799Bv.A01);
        return A08;
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{76, 64, Ascii.VT, 62, 37, 39, 106, 57, 35, 48, 47, 106, 38, 47, 57, 57, 106, 62, 34, 43, 36, 106, 34, 47, 43, 46, 47, 56, 106, 38, 47, 36, 45, 62, 34, 106, 98, 63, 36, 57, 63, 58, 58, 37, 56, 62, 47, 46, 99, 100, 104, 67, 89, 95, 84, Ascii.CR, 78, 66, 88, 67, 89, Ascii.CR, 68, 67, Ascii.CR, 94, 79, 74, 93, Ascii.CR, Ascii.FF, Ascii.DLE, Ascii.CR, Ascii.FS, Ascii.CR, 5, 88, 67, 94, 88, 93, 93, 66, 95, 89, 72, 73, 4, 3, 5, 46, 52, 50, 57, 96, 35, 47, 53, 46, 52, 96, 41, 46, 96, 51, 39, 48, 36, 96, 97, 125, 96, 113, 96, 104, 53, 46, 51, 53, 48, 48, 47, 50, 52, 37, 36, 105, 110, Ascii.GS, 41, 58, 60, 54, 62, 53, 47, 62, 63, Ascii.SYN, 43, 111, Ascii.RS, 35, 47, 41, 58, 56, 47, 52, 41, 4, 42, 35, 34, 63, 36, 35, 42, 109, 35, 40, 42, 44, 57, 36, 59, 40, 109, 34, 43, 43, 62, 40, 57, 109, 57, 34, 109, 62, 44, 32, 61, 33, 40, 109, 41, 44, 57, 44, 99, 110, 71, 67, 68, 2, 67, 86, 77, 79, 2, 70, 71, 68, 75, 76, 71, 81, 2, 71, 90, 86, 71, 76, 70, 71, 70, 2, 67, 86, 77, 79, 2, 81, 75, 88, 71, 2, 10, 87, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, Ascii.VT, Ascii.FF, 38, Ascii.SI, Ascii.VT, Ascii.FF, 74, Ascii.VT, Ascii.RS, 5, 7, 74, Ascii.GS, 3, Ascii.RS, 2, 74, 6, Ascii.SI, 4, Ascii.CR, Ascii.RS, 2, 74, 84, 74, 88, 91, 94, 93, 94, 82, 89, 92, 94, 93, 74, 66, Ascii.US, 4, Ascii.EM, Ascii.US, Ascii.SUB, Ascii.SUB, 5, Ascii.CAN, Ascii.RS, Ascii.SI, Ascii.SO, 67, 68, 97, 72, 67, 74, 89, 69, Ascii.CR, 64, 68, 94, 64, 76, 89, 78, 69, Ascii.ETB, Ascii.CR, 88, 113, 113, 100, 114, 99, 55, 99, 120, 55, 114, 121, 116, 101, 110, 103, 99, 126, 120, 121, 55, 115, 118, 99, 118, 55, 96, 118, 100, 55, 121, 114, 112, 118, 99, 126, 97, 114, 57, Ascii.SYN, 63, 63, 42, 60, 45, 121, 45, 54, 121, 60, 55, 61, 121, 54, 63, 121, 52, 61, 56, 45, 121, 46, 56, 42, 121, 55, 60, 62, 56, 45, 48, 47, 60, 119, 84, 109, 126, 105, 105, 114, Ascii.DEL, 114, 117, 124, 59, 79, 105, 122, 120, 112, 94, 117, 120, 105, 98, 107, 111, 114, 116, 117, 89, 116, 99, 59, 107, 122, 105, 122, 118, 126, 111, 126, 105, 104, 59, 114, 104, 59, 110, 117, 104, 110, 107, 107, 116, 105, 111, 126, Ascii.DEL, 53, 107, 83, 81, 72, 72, 93, 92, Ascii.CAN, 72, 75, 75, 80, Ascii.CAN, 89, 76, 87, 85, Ascii.CAN, Ascii.DLE, 94, 89, 81, 84, 93, 92, Ascii.CAN, 76, 87, Ascii.CAN, 93, 64, 76, 74, 89, 91, 76, Ascii.CAN, 77, 77, 81, 92, 17, 105, 81, 83, 74, 74, 83, 84, 93, Ascii.SUB, 91, 78, 85, 87, Ascii.SUB, 77, 83, 78, 82, Ascii.SUB, 86, 95, 84, 93, 78, 82, Ascii.SUB, 4, Ascii.SUB, 8, Ascii.VT, Ascii.SO, Ascii.CR, Ascii.SO, 2, 9, Ascii.FF, Ascii.SO, Ascii.CR, Ascii.SUB, Ascii.DC2, 79, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 19, Ascii.DC4, Ascii.VT, 48, 59, 38, 46, 59, 61, 42, 59, 58, 126, 51, 49, 49, 40, 126, 60, 49, 38, 112, 95, 100, 111, 114, 122, 111, 105, 126, 111, 110, 42, 121, 107, 99, 101, 42, 111, 100, 126, 120, 115, 42, 105, 101, Ascii.DEL, 100, 126, 48, 42, 75, 112, 118, Ascii.DEL, 112, 122, 114, 123, 122, 62, 119, 112, 122, 119, 108, 123, 125, 106, 62, 108, 123, 120, 123, 108, 123, 112, 125, 123, 41, Ascii.RS, Ascii.CR, Ascii.SYN, Ascii.RS, Ascii.GS, 19, Ascii.SUB, 95, 19, Ascii.SUB, 17, Ascii.CAN, Ascii.VT, Ascii.ETB, 95, Ascii.ESC, Ascii.SUB, Ascii.FF, Ascii.FS, Ascii.CR, Ascii.SYN, Ascii.SI, Ascii.VT, Ascii.SYN, Ascii.DLE, 17, 95, Ascii.SYN, 17, 95, Ascii.FF, Ascii.CAN, Ascii.SI, Ascii.ESC, 95, Ascii.EM, Ascii.DLE, 10, 17, Ascii.ESC, 95, 87, 10, 17, Ascii.FF, 10, Ascii.SI, Ascii.SI, Ascii.DLE, Ascii.CR, Ascii.VT, Ascii.SUB, Ascii.ESC, 86, 3, Ascii.DC2, Ascii.DC2, Ascii.SO, Ascii.VT, 1, 3, Ascii.SYN, Ascii.VT, Ascii.CR, Ascii.FF, 77, Ascii.SUB, 79, 7, Ascii.SI, 17, 5, 62, 40, 36, 42, 46, 49, 60, 61, 55, 119, 48, 61, 46, 59, 61, 34, 47, 46, 36, 100, 38, 59, Ascii.DEL};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0K(VL vl) throws C9R {
        H6.A06(this.A0N == null, A0A(532, 20, 11));
        DrmInitData drmInitData = this.A0L;
        if (drmInitData == null) {
            drmInitData = A05(vl.A02);
        }
        VL A06 = vl.A06(AbstractC0793Bp.A0m);
        SparseArray<C0799Bv> sparseArray = new SparseArray<>();
        long j10 = b.f7291b;
        int size = A06.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            VK vk = A06.A02.get(i10);
            if (((AbstractC0793Bp) vk).A00 == AbstractC0793Bp.A1M) {
                Pair<Integer, C0799Bv> A03 = A03(vk.A00);
                sparseArray.put(((Integer) A03.first).intValue(), (C0799Bv) A03.second);
            } else if (((AbstractC0793Bp) vk).A00 == AbstractC0793Bp.A0f) {
                j10 = A01(vk.A00);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = vl.A01.size();
        for (int i11 = 0; i11 < size2; i11++) {
            VL vl2 = vl.A01.get(i11);
            if (((AbstractC0793Bp) vl2).A00 == AbstractC0793Bp.A1L) {
                CA A0C = C0798Bu.A0C(vl2, vl.A07(AbstractC0793Bp.A0n), j10, drmInitData, (this.A0J & 16) != 0, false);
                if (A0C != null) {
                    sparseArray2.put(A0C.A00, A0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() != 0) {
            H6.A04(this.A0K.size() == size3);
            for (int i12 = 0; i12 < size3; i12++) {
                CA ca2 = (CA) sparseArray2.valueAt(i12);
                this.A0K.get(ca2.A00).A07(ca2, A06(sparseArray, ca2.A00));
            }
            return;
        }
        for (int i13 = 0; i13 < size3; i13++) {
            CA ca3 = (CA) sparseArray2.valueAt(i13);
            C1 c12 = new C1(this.A0C.AF2(i13, ca3.A03));
            c12.A07(ca3, A06(sparseArray, ca3.A00));
            this.A0K.put(ca3.A00, c12);
            this.A08 = Math.max(this.A08, ca3.A04);
        }
        A0C();
        if (A0Y[5].length() != 1) {
            throw new RuntimeException();
        }
        A0Y[5] = "d";
        this.A0C.A5C();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0M(VL vl, SparseArray<C1> sparseArray, int i10, byte[] bArr) throws C9R {
        C1 A09 = A09(vl.A07(AbstractC0793Bp.A1I).A00, sparseArray);
        if (A09 == null) {
            return;
        }
        CC cc2 = A09.A07;
        long j10 = cc2.A06;
        A09.A04();
        if (vl.A07(AbstractC0793Bp.A1H) != null && (i10 & 2) == 0) {
            j10 = A02(vl.A07(AbstractC0793Bp.A1H).A00);
        }
        A0N(vl, A09, j10, i10);
        CB A00 = A09.A05.A00(cc2.A07.A02);
        VK A07 = vl.A07(AbstractC0793Bp.A0u);
        if (A07 != null) {
            A0P(A00, A07.A00, cc2);
        }
        VK A072 = vl.A07(AbstractC0793Bp.A0t);
        if (A072 != null) {
            A0S(A072.A00, cc2);
        }
        VK A073 = vl.A07(AbstractC0793Bp.A10);
        if (A073 != null) {
            A0T(A073.A00, cc2);
        }
        VK A074 = vl.A07(AbstractC0793Bp.A0x);
        VK A075 = vl.A07(AbstractC0793Bp.A11);
        if (A074 != null && A075 != null) {
            A0V(A074.A00, A075.A00, A00 != null ? A00.A02 : null, cc2);
        }
        int size = vl.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            VK vk = vl.A02.get(i11);
            int i12 = ((AbstractC0793Bp) vk).A00;
            int i13 = AbstractC0793Bp.A1Q;
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "tWuQt3qCpORkhzaHtCNFkUwj420xxTd";
            strArr[4] = "yKRRCTery0iDoE3P4";
            if (i12 == i13) {
                A0U(vk.A00, cc2, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0P(CB cb2, HV hv, CC cc2) throws C9R {
        int i10 = cb2.A00;
        hv.A0Y(8);
        if ((AbstractC0793Bp.A00(hv.A08()) & 1) == 1) {
            hv.A0Z(8);
        }
        int A0E = hv.A0E();
        int A0H = hv.A0H();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[3] = "qY4fk5";
        if (A0H != cc2.A00) {
            throw new C9R(A0A(290, 17, 120) + A0H + A0A(0, 2, 53) + cc2.A00);
        }
        int i11 = 0;
        if (A0E == 0) {
            boolean[] zArr = cc2.A0H;
            for (int i12 = 0; i12 < A0H; i12++) {
                int A0E2 = hv.A0E();
                i11 += A0E2;
                zArr[i12] = A0E2 > i10;
            }
        } else {
            i11 = 0 + (A0E * A0H);
            Arrays.fill(cc2.A0H, 0, A0H, A0E > i10);
        }
        cc2.A02(i11);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0V(HV hv, HV hv2, String str, CC cc2) throws C9R {
        hv.A0Y(8);
        int A08 = hv.A08();
        if (hv.A08() != A0a) {
            return;
        }
        if (AbstractC0793Bp.A01(A08) == 1) {
            hv.A0Z(4);
        }
        int A082 = hv.A08();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[3] = "cve2FA";
        if (A082 != 1) {
            throw new C9R(A0A(50, 39, 120));
        }
        hv2.A0Y(8);
        int A083 = hv2.A08();
        if (hv2.A08() != A0a) {
            return;
        }
        int A01 = AbstractC0793Bp.A01(A083);
        if (A0Y[1].length() != 3) {
            throw new RuntimeException();
        }
        A0Y[7] = "iX8BjoZjE8Q6Igd9BCVMMRG15zWrcCbA";
        if (A01 == 1) {
            if (hv2.A0M() == 0) {
                throw new C9R(A0A(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 55, 42));
            }
        } else if (A01 >= 2) {
            hv2.A0Z(4);
        }
        if (hv2.A0M() != 1) {
            throw new C9R(A0A(89, 39, 21));
        }
        hv2.A0Z(1);
        int A0E = hv2.A0E();
        int i10 = (A0E & 240) >> 4;
        int i11 = A0E & 15;
        boolean z10 = hv2.A0E() == 1;
        if (z10) {
            int A0E2 = hv2.A0E();
            byte[] bArr = new byte[16];
            hv2.A0c(bArr, 0, bArr.length);
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            A0Y[0] = "v2evuoi5ipUorqJI1yS0NRy";
            byte[] bArr2 = null;
            if (z10 && A0E2 == 0) {
                int A0E3 = hv2.A0E();
                bArr2 = new byte[A0E3];
                hv2.A0c(bArr2, 0, A0E3);
            }
            cc2.A0A = true;
            cc2.A08 = new CB(z10, str, A0E2, bArr, i10, i11, bArr2);
        }
    }

    static {
        A0D();
        A0Z = new VG();
        A0a = C0940Hl.A08(A0A(682, 4, 24));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 55), Long.MAX_VALUE);
    }

    public VF() {
        this(0);
    }

    public VF(int i10) {
        this(i10, null);
    }

    public VF(int i10, @Nullable C0936Hh c0936Hh) {
        this(i10, c0936Hh, null, null);
    }

    public VF(int i10, @Nullable C0936Hh c0936Hh, @Nullable CA ca2, @Nullable DrmInitData drmInitData) {
        this(i10, c0936Hh, ca2, drmInitData, Collections.emptyList());
    }

    public VF(int i10, @Nullable C0936Hh c0936Hh, @Nullable CA ca2, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i10, c0936Hh, ca2, drmInitData, closedCaptionFormats, null);
    }

    public VF(int i10, @Nullable C0936Hh c0936Hh, @Nullable CA ca2, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats, @Nullable InterfaceC0789Ba interfaceC0789Ba) {
        this.A0J = (ca2 != null ? 8 : 0) | i10;
        this.A0S = c0936Hh;
        this.A0N = ca2;
        this.A0L = drmInitData;
        this.A0V = Collections.unmodifiableList(closedCaptionFormats);
        this.A0M = interfaceC0789Ba;
        this.A0O = new HV(16);
        this.A0R = new HV(HR.A03);
        this.A0Q = new HV(5);
        this.A0P = new HV();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = b.f7291b;
        this.A0A = b.f7291b;
        this.A0B = b.f7291b;
        A0B();
    }

    public static long A01(HV hv) {
        hv.A0Y(8);
        int fullAtom = hv.A08();
        return AbstractC0793Bp.A01(fullAtom) == 0 ? hv.A0M() : hv.A0N();
    }

    public static long A02(HV hv) {
        hv.A0Y(8);
        int fullAtom = hv.A08();
        int version = AbstractC0793Bp.A01(fullAtom);
        return version == 1 ? hv.A0N() : hv.A0M();
    }

    public static Pair<Integer, C0799Bv> A03(HV hv) {
        hv.A0Y(12);
        int defaultSampleDescriptionIndex = hv.A08();
        int trackId = hv.A0H();
        int defaultSampleFlags = hv.A0H();
        int defaultSampleSize = hv.A0H();
        int defaultSampleDuration = hv.A08();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new C0799Bv(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<VK> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            VK vk = list.get(i10);
            int leafChildrenSize = ((AbstractC0793Bp) vk).A00;
            if (leafChildrenSize == AbstractC0793Bp.A0r) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = vk.A00.A00;
                UUID A03 = C7.A03(bArr);
                if (A03 == null) {
                    Log.w(A0A(128, 22, 14), A0A(437, 42, 109));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A03, A0A(696, 9, 30), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C0799Bv A06(SparseArray<C0799Bv> sparseArray, int i10) {
        if (sparseArray.size() != 1) {
            return (C0799Bv) H6.A01(sparseArray.get(i10));
        }
        if (A0Y[7].charAt(27) != 'r') {
            throw new RuntimeException();
        }
        A0Y[3] = "nw8rk4";
        return sparseArray.valueAt(0);
    }

    public static C1 A07(SparseArray<C1> sparseArray) {
        C1 c12 = null;
        long j10 = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1 valueAt = sparseArray.valueAt(i10);
            if (valueAt.A02 != valueAt.A07.A02) {
                long nextTrackRunOffset = valueAt.A07.A0G[valueAt.A02];
                if (nextTrackRunOffset < j10) {
                    c12 = valueAt;
                    j10 = nextTrackRunOffset;
                }
            }
        }
        return c12;
    }

    @Nullable
    public static C1 A08(SparseArray<C1> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        C1 c12 = sparseArray.get(i10);
        if (A0Y[0].length() == 21) {
            throw new RuntimeException();
        }
        A0Y[1] = "fYJ";
        return c12;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x005a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Ba[] r0 = r6.A0I
            if (r0 != 0) goto L48
            r0 = 2
            com.facebook.ads.redexgen.X.Ba[] r0 = new com.facebook.ads.redexgen.X.InterfaceC0789Ba[r0]
            r6.A0I = r0
            r5 = 0
            com.facebook.ads.redexgen.X.Ba r2 = r6.A0M
            if (r2 == 0) goto L15
            com.facebook.ads.redexgen.X.Ba[] r1 = r6.A0I
            int r0 = r5 + 1
            r1[r5] = r2
            r5 = r0
        L15:
            int r0 = r6.A0J
            r4 = 4
            r0 = r0 & r4
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.Ba[] r3 = r6.A0I
            int r2 = r5 + 1
            com.facebook.ads.redexgen.X.BQ r1 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.C1> r0 = r6.A0K
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.Ba r0 = r1.AF2(r0, r4)
            r3[r5] = r0
            r5 = r2
        L2e:
            com.facebook.ads.redexgen.X.Ba[] r0 = r6.A0I
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            com.facebook.ads.redexgen.X.Ba[] r0 = (com.facebook.ads.redexgen.X.InterfaceC0789Ba[]) r0
            r6.A0I = r0
            com.facebook.ads.redexgen.X.Ba[] r4 = r6.A0I
            int r3 = r4.length
            r2 = 0
        L3c:
            if (r2 >= r3) goto L48
            r1 = r4[r2]
            com.facebook.ads.internal.exoplayer2.Format r0 = com.facebook.ads.redexgen.X.VF.A0b
            r1.A5T(r0)
            int r2 = r2 + 1
            goto L3c
        L48:
            com.facebook.ads.redexgen.X.Ba[] r0 = r6.A0H
            if (r0 != 0) goto L9d
            java.util.List<com.facebook.ads.internal.exoplayer2.Format> r0 = r6.A0V
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.Ba[] r0 = new com.facebook.ads.redexgen.X.InterfaceC0789Ba[r0]
            r6.A0H = r0
            r3 = 0
        L57:
            com.facebook.ads.redexgen.X.Ba[] r0 = r6.A0H
            int r0 = r0.length
            if (r3 >= r0) goto L9d
            com.facebook.ads.redexgen.X.BQ r2 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.C1> r0 = r6.A0K
            int r0 = r0.size()
            int r1 = r0 + 1
            int r1 = r1 + r3
            r0 = 3
            com.facebook.ads.redexgen.X.Ba r1 = r2.AF2(r1, r0)
            java.util.List<com.facebook.ads.internal.exoplayer2.Format> r0 = r6.A0V
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.internal.exoplayer2.Format r0 = (com.facebook.ads.internal.exoplayer2.Format) r0
            r1.A5T(r0)
            com.facebook.ads.redexgen.X.Ba[] r0 = r6.A0H
            r0[r3] = r1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VF.A0Y
            r0 = 6
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L97
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VF.A0Y
            java.lang.String r1 = "E0z9VN5IoStoNoHPwfepvpkncforV8p8"
            r0 = 7
            r2[r0] = r1
            int r3 = r3 + 1
            goto L57
        L97:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VF.A0C():void");
    }

    private void A0E(long j10) {
        while (!this.A0U.isEmpty()) {
            C0 removeFirst = this.A0U.removeFirst();
            this.A03 -= removeFirst.A00;
            long j11 = j10 + removeFirst.A01;
            C0936Hh c0936Hh = this.A0S;
            if (c0936Hh != null) {
                j11 = c0936Hh.A06(j11);
            }
            for (InterfaceC0789Ba interfaceC0789Ba : this.A0I) {
                interfaceC0789Ba.AE9(j11, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j10) throws C9R {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j10) {
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(BP bp) throws IOException, InterruptedException {
        int i10 = ((int) this.A07) - this.A00;
        HV hv = this.A0E;
        if (hv != null) {
            bp.readFully(hv.A00, 8, i10);
            int atomPayloadSize = this.A01;
            A0O(new VK(atomPayloadSize, this.A0E), bp.A7D());
        } else {
            bp.AEk(i10);
        }
        A0F(bp.A7D());
    }

    private void A0H(BP bp) throws IOException, InterruptedException {
        C1 c12 = null;
        long j10 = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1 nextTrackBundle = this.A0K.valueAt(i10);
            CC cc2 = nextTrackBundle.A07;
            if (cc2.A0B) {
                long j11 = cc2.A04;
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                A0Y[3] = "TcDom5";
                if (j11 < j10) {
                    j10 = cc2.A04;
                    c12 = this.A0K.valueAt(i10);
                }
            }
        }
        if (c12 == null) {
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            A0Y[2] = "BU1FqSGZUKIp3lmSYzKBGxc2Z86jKcpe";
            this.A02 = 3;
            return;
        }
        long A7D = j10 - bp.A7D();
        if (A0Y[3].length() != 6) {
            throw new RuntimeException();
        }
        A0Y[0] = "Cvsa72edMITB5GhT";
        int i11 = (int) A7D;
        if (i11 >= 0) {
            bp.AEk(i11);
            c12.A07.A04(bp);
            return;
        }
        throw new C9R(A0A(StatusLine.HTTP_TEMP_REDIRECT, 39, 66));
    }

    private void A0I(VL vl) throws C9R {
        if (((AbstractC0793Bp) vl).A00 == AbstractC0793Bp.A0j) {
            A0K(vl);
            return;
        }
        if (((AbstractC0793Bp) vl).A00 == AbstractC0793Bp.A0i) {
            A0J(vl);
            return;
        }
        if (this.A0T.isEmpty()) {
            return;
        }
        ArrayDeque<VL> arrayDeque = this.A0T;
        if (A0Y[1].length() != 3) {
            throw new RuntimeException();
        }
        A0Y[7] = "6RjYlEZz613sKxZIpZ2APlvoVeArWnyB";
        arrayDeque.peek().A08(vl);
    }

    private void A0J(VL vl) throws C9R {
        A0L(vl, this.A0K, this.A0J, this.A0W);
        DrmInitData A05 = this.A0L != null ? null : A05(vl.A02);
        if (A05 != null) {
            int i10 = this.A0K.size();
            for (int trackCount = 0; trackCount < i10; trackCount++) {
                this.A0K.valueAt(trackCount).A06(A05);
            }
        }
        if (this.A0A != b.f7291b) {
            int size = this.A0K.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.A0K.valueAt(i11).A05(this.A0A);
            }
            this.A0A = b.f7291b;
        }
    }

    public static void A0L(VL vl, SparseArray<C1> sparseArray, int i10, byte[] bArr) throws C9R {
        int size = vl.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            VL child = vl.A01.get(i11);
            int i12 = ((AbstractC0793Bp) child).A00;
            int moofContainerChildrenSize = AbstractC0793Bp.A1K;
            if (i12 == moofContainerChildrenSize) {
                A0M(child, sparseArray, i10, bArr);
            }
        }
    }

    public static void A0N(VL vl, C1 c12, long j10, int trunIndex) {
        int i10 = 0;
        int trunSampleCount = 0;
        List<VK> list = vl.A02;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            VK vk = list.get(i11);
            int i12 = ((AbstractC0793Bp) vk).A00;
            int i13 = AbstractC0793Bp.A1N;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            A0Y[0] = "HX3CrwnoNkNpp8Diq6RFqVXtJKh";
            if (i12 == i13) {
                HV trunData = vk.A00;
                trunData.A0Y(12);
                int A0H = trunData.A0H();
                if (A0H > 0) {
                    trunSampleCount += A0H;
                    i10++;
                }
            }
        }
        c12.A02 = 0;
        c12.A00 = 0;
        c12.A01 = 0;
        c12.A07.A03(i10, trunSampleCount);
        int i14 = 0;
        int i15 = 0;
        int trunStartPosition = A0Y[7].charAt(27);
        if (trunStartPosition == 114) {
            A0Y[1] = "K2a";
        }
        for (int i16 = 0; i16 < size; i16++) {
            VK vk2 = list.get(i16);
            int trunIndex2 = ((AbstractC0793Bp) vk2).A00;
            if (trunIndex2 == AbstractC0793Bp.A1N) {
                int trunIndex3 = i14 + 1;
                i15 = A00(c12, i14, j10, trunIndex, vk2.A00, i15);
                i14 = trunIndex3;
            }
        }
    }

    private void A0O(VK vk, long j10) throws C9R {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(vk);
            return;
        }
        if (((AbstractC0793Bp) vk).A00 == AbstractC0793Bp.A12) {
            Pair<Long, C1287Vg> A04 = A04(vk.A00, j10);
            this.A0B = ((Long) A04.first).longValue();
            this.A0C.AEE((BX) A04.second);
            this.A0F = true;
            return;
        }
        if (((AbstractC0793Bp) vk).A00 != AbstractC0793Bp.A0P) {
            return;
        }
        A0Q(vk.A00);
    }

    private void A0Q(HV hv) {
        InterfaceC0789Ba[] interfaceC0789BaArr = this.A0I;
        if (interfaceC0789BaArr == null || interfaceC0789BaArr.length == 0) {
            return;
        }
        hv.A0Y(12);
        int sampleSize = hv.A04();
        hv.A0Q();
        hv.A0Q();
        long A0M = hv.A0M();
        long timescale = hv.A0M();
        long A0F = C0940Hl.A0F(timescale, 1000000L, A0M);
        for (InterfaceC0789Ba interfaceC0789Ba : this.A0I) {
            hv.A0Y(12);
            interfaceC0789Ba.AE8(hv, sampleSize);
        }
        long j10 = this.A0B;
        if (j10 != b.f7291b) {
            long j11 = j10 + A0F;
            C0936Hh c0936Hh = this.A0S;
            if (c0936Hh != null) {
                j11 = c0936Hh.A06(j11);
            }
            for (InterfaceC0789Ba interfaceC0789Ba2 : this.A0I) {
                interfaceC0789Ba2.AE9(j11, 1, sampleSize, 0, null);
            }
            return;
        }
        this.A0U.addLast(new C0(A0F, sampleSize));
        this.A03 += sampleSize;
    }

    public static void A0R(HV hv, int i10, CC cc2) throws C9R {
        hv.A0Y(i10 + 8);
        int fullAtom = hv.A08();
        int flags = AbstractC0793Bp.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z10 = fullAtom3 != 0;
            int sampleCount = hv.A0H();
            int i11 = cc2.A00;
            if (A0Y[2].charAt(18) != 75) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "UNCiZzJs5PDRpvixsYfSSk1mhxuZgiq";
            strArr[4] = "wrSUtL8XPGusZqeHm";
            if (sampleCount == i11) {
                Arrays.fill(cc2.A0H, 0, sampleCount, z10);
                int fullAtom4 = hv.A04();
                cc2.A02(fullAtom4);
                cc2.A05(hv);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A0A(290, 17, 120));
            sb2.append(sampleCount);
            sb2.append(A0A(0, 2, 53));
            int fullAtom5 = cc2.A00;
            sb2.append(fullAtom5);
            throw new C9R(sb2.toString());
        }
        throw new C9R(A0A(381, 56, 78));
    }

    public static void A0S(HV hv, CC cc2) throws C9R {
        hv.A0Y(8);
        int A08 = hv.A08();
        if ((AbstractC0793Bp.A00(A08) & 1) == 1) {
            hv.A0Z(8);
        }
        int A0H = hv.A0H();
        int fullAtom = A0Y[3].length();
        if (fullAtom != 6) {
            throw new RuntimeException();
        }
        A0Y[3] = "xMtqR0";
        if (A0H == 1) {
            int entryCount = AbstractC0793Bp.A01(A08);
            long A0M = cc2.A04 + (entryCount == 0 ? hv.A0M() : hv.A0N());
            String[] strArr = A0Y;
            String str = strArr[6];
            String str2 = strArr[4];
            int fullAtom2 = str.length();
            int entryCount2 = str2.length();
            if (fullAtom2 != entryCount2) {
                String[] strArr2 = A0Y;
                strArr2[6] = "QBYjlSuWWzNHcmXjWc7avhw4MqaHk82";
                strArr2[4] = "P5zbNSbq1MUS3wdHf";
                cc2.A04 = A0M;
                return;
            }
            A0Y[7] = "vg5EJJPWiTbIFzTVTJFrvfHkMClrP8RJ";
            cc2.A04 = A0M;
            return;
        }
        throw new C9R(A0A(552, 29, 95) + A0H);
    }

    public static void A0T(HV hv, CC cc2) throws C9R {
        A0R(hv, 0, cc2);
    }

    public static void A0U(HV hv, CC cc2, byte[] bArr) throws C9R {
        hv.A0Y(8);
        hv.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(hv, 16, cc2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r4 != r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0793Bp.A0h) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0793Bp.A16) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0793Bp.A0i) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0793Bp.A1K) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (com.facebook.ads.redexgen.X.VF.A0Y[5].length() == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        com.facebook.ads.redexgen.X.VF.A0Y[5] = "P";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r4 == r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r4 != com.facebook.ads.redexgen.X.AbstractC0793Bp.A0N) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r4 != r3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0W(int r4) {
        /*
            int r0 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A0j
            if (r4 == r0) goto L6a
            int r3 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A1L
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.VF.A0Y
            r0 = 2
            r1 = r1[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            r0 = 75
            if (r1 == r0) goto L1b
        L15:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VF.A0Y
            java.lang.String r1 = "T3RhZdPh4OhUklIpt3KHsdu4Qu4SXFxX"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto L6a
            int r3 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A0d
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.VF.A0Y
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L53
            if (r4 == r3) goto L6a
        L34:
            int r0 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A0h
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A16
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A0i
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A1K
            if (r4 == r0) goto L6a
            int r3 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A0m
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.VF.A0Y
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L5d
            goto L15
        L53:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VF.A0Y
            java.lang.String r1 = "W"
            r0 = 0
            r2[r0] = r1
            if (r4 == r3) goto L6a
            goto L34
        L5d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VF.A0Y
            java.lang.String r1 = "P"
            r0 = 5
            r2[r0] = r1
            if (r4 == r3) goto L6a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A0N
            if (r4 != r0) goto L6c
        L6a:
            r0 = 1
        L6b:
            return r0
        L6c:
            r0 = 0
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VF.A0W(int):boolean");
    }

    public static boolean A0X(int i10) {
        return i10 == AbstractC0793Bp.A0V || i10 == AbstractC0793Bp.A0c || i10 == AbstractC0793Bp.A0n || i10 == AbstractC0793Bp.A12 || i10 == AbstractC0793Bp.A1A || i10 == AbstractC0793Bp.A1H || i10 == AbstractC0793Bp.A1I || i10 == AbstractC0793Bp.A1J || i10 == AbstractC0793Bp.A1M || i10 == AbstractC0793Bp.A1N || i10 == AbstractC0793Bp.A0r || i10 == AbstractC0793Bp.A0u || i10 == AbstractC0793Bp.A0t || i10 == AbstractC0793Bp.A10 || i10 == AbstractC0793Bp.A1Q || i10 == AbstractC0793Bp.A0x || i10 == AbstractC0793Bp.A11 || i10 == AbstractC0793Bp.A0O || i10 == AbstractC0793Bp.A0f || i10 == AbstractC0793Bp.A0P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e5, code lost:
    
        if (r10.A0F == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
    
        r10.A0C.AEE(new com.facebook.ads.redexgen.X.C1282Vb(r10.A08, r2));
        r10.A0F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
    
        if (com.facebook.ads.redexgen.X.VF.A0Y[3].length() == 6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0102, code lost:
    
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0104, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
    
        com.facebook.ads.redexgen.X.VF.A0Y[2] = "kMQb8Kdhh0k2oCY1DKK8Lkjm8envfnKE";
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0110, code lost:
    
        if (r10.A0F == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0Y(com.facebook.ads.redexgen.X.BP r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VF.A0Y(com.facebook.ads.redexgen.X.BP):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean A0Z(BP bp) throws IOException, InterruptedException {
        CB A00;
        int AE7;
        int i10 = 4;
        int i11 = 1;
        int i12 = 0;
        if (this.A02 == 3) {
            if (this.A0D == null) {
                C1 A07 = A07(this.A0K);
                if (A07 == null) {
                    int A7D = (int) (this.A09 - bp.A7D());
                    if (A7D >= 0) {
                        bp.AEk(A7D);
                        A0B();
                        return false;
                    }
                    throw new C9R(A0A(346, 35, 12));
                }
                int A7D2 = (int) (A07.A07.A0G[A07.A02] - bp.A7D());
                if (A7D2 < 0) {
                    Log.w(A0A(128, 22, 14), A0A(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 40, 24));
                    A7D2 = 0;
                }
                bp.AEk(A7D2);
                this.A0D = A07;
            }
            this.A06 = this.A0D.A07.A0D[this.A0D.A01];
            if (this.A0D.A01 < this.A0D.A03) {
                bp.AEk(this.A06);
                this.A0D.A01();
                if (!this.A0D.A08()) {
                    this.A0D = null;
                }
                this.A02 = 3;
                return true;
            }
            C1 c12 = this.A0D;
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            A0Y[3] = "st8dZG";
            if (c12.A05.A02 == 1) {
                this.A06 -= 8;
                bp.AEk(8);
            }
            this.A04 = this.A0D.A03();
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
        }
        CC cc2 = this.A0D.A07;
        CA ca2 = this.A0D.A05;
        InterfaceC0789Ba interfaceC0789Ba = this.A0D.A06;
        int i13 = this.A0D.A01;
        long A002 = cc2.A00(i13) * 1000;
        C0936Hh c0936Hh = this.A0S;
        if (c0936Hh != null) {
            A002 = c0936Hh.A06(A002);
        }
        if (ca2.A01 == 0) {
            while (true) {
                int i14 = this.A04;
                int i15 = this.A06;
                if (i14 >= i15) {
                    break;
                }
                this.A04 += interfaceC0789Ba.AE7(bp, i15 - i14, false);
            }
        } else {
            byte[] bArr = this.A0Q.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i16 = ca2.A01 + 1;
            int i17 = 4 - ca2.A01;
            while (this.A04 < this.A06) {
                int i18 = this.A05;
                if (i18 == 0) {
                    bp.readFully(bArr, i17, i16);
                    this.A0Q.A0Y(i12);
                    this.A05 = this.A0Q.A0H() - i11;
                    this.A0R.A0Y(i12);
                    interfaceC0789Ba.AE8(this.A0R, i10);
                    interfaceC0789Ba.AE8(this.A0Q, i11);
                    this.A0G = this.A0H.length > 0 && HR.A0C(ca2.A07.A0O, bArr[i10]);
                    this.A04 += 5;
                    this.A06 += i17;
                } else {
                    if (this.A0G) {
                        this.A0P.A0W(i18);
                        bp.readFully(this.A0P.A00, i12, this.A05);
                        interfaceC0789Ba.AE8(this.A0P, this.A05);
                        AE7 = this.A05;
                        int A02 = HR.A02(this.A0P.A00, this.A0P.A07());
                        this.A0P.A0Y(A0A(686, 10, 13).equals(ca2.A07.A0O) ? 1 : 0);
                        this.A0P.A0X(A02);
                        FU.A03(A002, this.A0P, this.A0H);
                    } else {
                        AE7 = interfaceC0789Ba.AE7(bp, i18, false);
                    }
                    this.A04 += AE7;
                    this.A05 -= AE7;
                    i10 = 4;
                    i11 = 1;
                    i12 = 0;
                }
            }
        }
        boolean z10 = cc2.A0I[i13];
        BZ bz = null;
        int i19 = z10;
        if (cc2.A0A) {
            int i20 = (z10 ? 1 : 0) | 1073741824;
            if (cc2.A08 != null) {
                A00 = cc2.A08;
            } else {
                A00 = ca2.A00(cc2.A07.A02);
            }
            bz = A00.A01;
            i19 = i20;
        }
        interfaceC0789Ba.AE9(A002, i19, this.A06, 0, bz);
        A0E(A002);
        if (!this.A0D.A08()) {
            this.A0D = null;
        }
        this.A02 = 3;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A8G(BQ bq) {
        this.A0C = bq;
        CA ca2 = this.A0N;
        if (ca2 != null) {
            C1 c12 = new C1(bq.AF2(0, ca2.A03));
            c12.A07(this.A0N, new C0799Bv(0, 0, 0, 0));
            this.A0K.put(0, c12);
            A0C();
            this.A0C.A5C();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final int ADQ(BP bp, BV bv) throws IOException, InterruptedException {
        while (true) {
            int i10 = this.A02;
            if (i10 != 0) {
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                A0Y[2] = "Ub8SUYMnE0bQG8CZo0KwdlTNogw2mbM0";
                if (i10 == 1) {
                    A0G(bp);
                } else if (i10 != 2) {
                    boolean A0Z2 = A0Z(bp);
                    if (A0Y[7].charAt(27) == 'r') {
                        A0Y[5] = "b";
                        if (A0Z2) {
                            return 0;
                        }
                    } else if (A0Z2) {
                        return 0;
                    }
                } else {
                    A0H(bp);
                }
            } else if (!A0Y(bp)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void AED(long j10, long j11) {
        int size = this.A0K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0K.valueAt(i10).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j11;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final boolean AEm(BP bp) throws IOException, InterruptedException {
        return C8.A03(bp);
    }
}
