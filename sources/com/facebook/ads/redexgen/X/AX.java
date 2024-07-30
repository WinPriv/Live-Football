package com.facebook.ads.redexgen.X;

import com.anythink.expressad.foundation.h.m;
import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class AX {
    public static byte[] A00;
    public static String[] A01 = {"LkGuYUivH3Ie1Im5DPbpjiI8Q8YTXvDH", "1PwPqA1AQPAmdWryNsV6sN6X26rPkCjW", "ZqXwAcmmJts9Z3eghrFogO2ZvZ2KPTjy", "VVFX", "itVzmaW23y4JHLkTkKw9c3", "4is91i25oXLwO1hEL45hwpUW49QZoS4h", "3tDKTkvCK0hS9Fm4lJL5mZYVdrHZzDGh", "0qkAcrqD1J7f8hfbi9Oz77lQGDa0et74"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A03(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        HU A042 = A04(bArr);
        A042.A08(60);
        int i10 = A02[A042.A04(6)];
        int i11 = A03[A042.A04(4)];
        int A043 = A042.A04(5);
        int[] iArr = A04;
        int i12 = A043 >= iArr.length ? -1 : (iArr[A043] * 1000) / 2;
        A042.A08(10);
        return Format.A07(str, A05(0, 13, 1), null, i12, -1, i10 + (A042.A04(2) > 0 ? 1 : 0), i11, null, drmInitData, 0, str2);
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{119, 99, 114, Ascii.DEL, 121, 57, 96, 120, 114, 56, 114, 98, 101};
    }

    static {
        A06();
        A02 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A03 = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        A04 = new int[]{64, 112, 128, 192, 224, 256, 384, m.a.f10162a, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    }

    public static int A00(ByteBuffer byteBuffer) {
        int nblks;
        int position = byteBuffer.position();
        byte b10 = byteBuffer.get(position);
        if (b10 == -2) {
            int position2 = position + 5;
            int i10 = (byteBuffer.get(position2) & 1) << 6;
            int position3 = position + 4;
            nblks = i10 | ((byteBuffer.get(position3) & 252) >> 2);
        } else if (b10 == -1) {
            int position4 = position + 4;
            int i11 = (byteBuffer.get(position4) & 7) << 4;
            int position5 = position + 7;
            nblks = i11 | ((byteBuffer.get(position5) & 60) >> 2);
        } else if (b10 != 31) {
            int position6 = position + 4;
            int i12 = (byteBuffer.get(position6) & 1) << 6;
            int position7 = position + 5;
            nblks = i12 | ((byteBuffer.get(position7) & 252) >> 2);
        } else {
            int position8 = position + 5;
            int i13 = (byteBuffer.get(position8) & 7) << 4;
            int position9 = position + 6;
            nblks = i13 | ((byteBuffer.get(position9) & 60) >> 2);
        }
        int position10 = nblks + 1;
        return position10 * 32;
    }

    public static int A01(byte[] bArr) {
        int i10;
        boolean z10 = false;
        byte b10 = bArr[0];
        if (b10 == -2) {
            i10 = (((bArr[4] & 3) << 12) | ((bArr[7] & DefaultClassResolver.NAME) << 4) | ((bArr[6] & 240) >> 4)) + 1;
        } else if (b10 == -1) {
            i10 = (((bArr[7] & 3) << 12) | ((bArr[6] & DefaultClassResolver.NAME) << 4) | ((bArr[9] & 60) >> 2)) + 1;
            z10 = true;
        } else if (b10 != 31) {
            i10 = (((bArr[5] & 3) << 12) | ((bArr[6] & DefaultClassResolver.NAME) << 4) | ((bArr[7] & 240) >> 4)) + 1;
        } else {
            i10 = (((bArr[6] & 3) << 12) | ((bArr[7] & DefaultClassResolver.NAME) << 4) | ((bArr[8] & 60) >> 2)) + 1;
            z10 = true;
        }
        return z10 ? (i10 * 16) / 14 : i10;
    }

    public static int A02(byte[] bArr) {
        int i10;
        byte b10 = bArr[0];
        if (b10 == -2) {
            int nblks = bArr[5];
            i10 = ((nblks & 1) << 6) | ((bArr[4] & 252) >> 2);
        } else {
            if (A01[4].length() == 20) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "EqLnRlbAIvqb7JmhHHjyb9MWmtPppsRr";
            strArr[7] = "wqmF86kNtSHy9CpxzvQffLVgP6PIYafb";
            if (b10 == -1) {
                i10 = ((bArr[4] & 7) << 4) | ((bArr[7] & 60) >> 2);
            } else if (b10 != 31) {
                i10 = ((bArr[4] & 1) << 6) | ((bArr[5] & 252) >> 2);
            } else {
                i10 = ((bArr[5] & 7) << 4) | ((bArr[6] & 60) >> 2);
            }
        }
        int nblks2 = i10 + 1;
        int i11 = nblks2 * 32;
        String[] strArr2 = A01;
        String str = strArr2[2];
        String str2 = strArr2[7];
        int charAt = str.charAt(1);
        int nblks3 = str2.charAt(1);
        if (charAt != nblks3) {
            return i11;
        }
        String[] strArr3 = A01;
        strArr3[1] = "0BUMWBHFUBXEmf7IWFiBpaLqqarBLbVJ";
        strArr3[6] = "IXHZH24RcLqKyQXeo23FKYJCWT4dHCob";
        return i11;
    }

    public static HU A04(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new HU(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (A08(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b10 = copyOf[i10];
                copyOf[i10] = copyOf[i10 + 1];
                copyOf[i10 + 1] = b10;
            }
        }
        HU hu = new HU(copyOf);
        if (copyOf[0] == 31) {
            HU hu2 = new HU(copyOf);
            while (true) {
                int A012 = hu2.A01();
                if (A01[5].charAt(2) == 'T') {
                    throw new RuntimeException();
                }
                A01[4] = "1c365Ndi9m7qeJPJDL";
                if (A012 < 16) {
                    break;
                }
                hu2.A08(2);
                hu.A0A(hu2.A04(14), 14);
            }
        }
        hu.A0B(copyOf);
        return hu;
    }

    public static boolean A07(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    public static boolean A08(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
