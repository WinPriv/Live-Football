package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Hn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0942Hn {
    public static byte[] A05;
    public static String[] A06 = {"6HhNm3cPNapwaqbb", "rETS2R3vEEslStUJRpCBgfLkJK0S9xqh", "MEYGBk1oMmhBWHD5huW8XB9PkOXmJxmW", "Ebyfs41o5airltqaiKadsdL394JDYdET", "45eNA9gLGf59sMGZ1iMI", "", "A0Zue4QITY9ZnpF1VrB6IK97BmW1DYMt", "lY4WeGl5g11cW0QvoH9uVkbc4B0XWsja"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0942Hn A00(HV hv) throws C9R {
        try {
            hv.A0Z(4);
            int A0E = (hv.A0E() & 3) + 1;
            if (A0E == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int A0E2 = hv.A0E() & 31;
            for (int i10 = 0; i10 < A0E2; i10++) {
                arrayList.add(A03(hv));
            }
            int A0E3 = hv.A0E();
            for (int i11 = 0; i11 < A0E3; i11++) {
                arrayList.add(A03(hv));
            }
            int i12 = -1;
            int i13 = -1;
            float f = 1.0f;
            if (A06[4].length() == 27) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "yEkjaL4nSOxIxbdygxb0eg7rmaPMv2Rh";
            strArr[1] = "JEi8k2PtpDNktftvz60xHr0NAbywlG3U";
            if (A0E2 > 0) {
                HQ A062 = HR.A06((byte[]) arrayList.get(0), A0E, ((byte[]) arrayList.get(0)).length);
                i12 = A062.A06;
                i13 = A062.A02;
                f = A062.A00;
            }
            return new C0942Hn(arrayList, A0E, i12, i13, f);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new C9R(A01(0, 24, 119), e10);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            String[] strArr = A06;
            if (strArr[2].charAt(1) != strArr[1].charAt(1)) {
                throw new RuntimeException();
            }
            A06[3] = "kNkKJeUYPfq8eMd2tA59MaBH22H8N5Ts";
            copyOfRange[i13] = (byte) ((b10 - i12) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{Ascii.CR, 58, 58, 55, 58, -24, 56, 41, 58, 59, 49, 54, 47, -24, 9, Ascii.RS, Ascii.VT, -24, 43, 55, 54, 46, 49, 47};
    }

    static {
        A02();
    }

    public C0942Hn(List<byte[]> initializationData, int i10, int i11, int i12, float f) {
        this.A04 = initializationData;
        this.A02 = i10;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = f;
    }

    public static byte[] A03(HV hv) {
        int A0I = hv.A0I();
        int offset = hv.A06();
        hv.A0Z(A0I);
        return HA.A08(hv.A00, offset, A0I);
    }
}
