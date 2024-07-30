package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.anythink.expressad.exoplayer.b;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0798Bu {
    public static byte[] A00;
    public static String[] A01 = {"vNU1Clptty9spXV3rmNWKqfECA0GCDno", "yQl7wYGB6utTXxK398wXXYrAeYZNPLId", "BVcq1q5Q", "NihUY4HxpsM0GkJJgFchlTfxDOIJFYzw", "lx4TwpHGLs68", "XI1Xq2FkjwcQfgB5bw70GFmYpaxAyyjl", "uRZmXRdJsodI", "Cygx2J1H2ENb6XLRYlHXnR1vUW4XHHOP"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0797Bt A0B(HV hv) {
        long A0M;
        int i10;
        hv.A0Y(8);
        int A012 = AbstractC0793Bp.A01(hv.A08());
        hv.A0Z(A012 == 0 ? 8 : 16);
        int A082 = hv.A08();
        hv.A0Z(4);
        boolean z10 = true;
        int A062 = hv.A06();
        int i11 = A012 == 0 ? 4 : 8;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            if (hv.A00[A062 + i12] != -1) {
                z10 = false;
                break;
            }
            i12++;
        }
        if (z10) {
            hv.A0Z(i11);
            A0M = b.f7291b;
        } else {
            A0M = A012 == 0 ? hv.A0M() : hv.A0N();
            if (A0M == 0) {
                A0M = b.f7291b;
            }
        }
        hv.A0Z(16);
        int A083 = hv.A08();
        int A084 = hv.A08();
        hv.A0Z(4);
        int A085 = hv.A08();
        int A086 = hv.A08();
        if (A083 == 0 && A084 == 65536 && A085 == (-b.aX) && A086 == 0) {
            i10 = 90;
        } else {
            if (A083 == 0) {
                int i13 = -b.aX;
                String[] strArr = A01;
                if (strArr[4].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[4] = "i5DrkfhddIOc";
                strArr2[6] = "TqiRE9mqRyND";
                if (A084 == i13 && A085 == 65536 && A086 == 0) {
                    i10 = 270;
                }
            }
            i10 = (A083 == (-b.aX) && A084 == 0 && A085 == 0 && A086 == (-b.aX)) ? 180 : 0;
        }
        return new C0797Bt(A082, A0M, i10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static CA A0C(VL vl, VK vk, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws C9R {
        int i10;
        int i11;
        int i12;
        long j11 = j10;
        VL A062 = vl.A06(AbstractC0793Bp.A0d);
        int A022 = A02(A062.A07(AbstractC0793Bp.A0V).A00);
        if (A022 == -1) {
            return null;
        }
        VK A072 = vl.A07(AbstractC0793Bp.A1J);
        if (A01[3].charAt(8) != 'p') {
            throw new RuntimeException();
        }
        A01[2] = "QWUsjPBg";
        C0797Bt A0B = A0B(A072.A00);
        if (j11 == b.f7291b) {
            j11 = A0B.A02;
        }
        long A042 = A04(vk.A00);
        long A0F = j11 == b.f7291b ? b.f7291b : C0940Hl.A0F(j11, 1000000L, A042);
        VL A063 = A062.A06(AbstractC0793Bp.A0h).A06(AbstractC0793Bp.A16);
        Pair<Long, String> A064 = A06(A062.A07(AbstractC0793Bp.A0c).A00);
        HV hv = A063.A07(AbstractC0793Bp.A1A).A00;
        i10 = A0B.A00;
        i11 = A0B.A01;
        C0796Bs A0A = A0A(hv, i10, i11, (String) A064.second, drmInitData, z11);
        long[] jArr = null;
        long[] jArr2 = null;
        if (!z10) {
            Pair<long[], long[]> A052 = A05(vl.A06(AbstractC0793Bp.A0N));
            jArr = (long[]) A052.first;
            jArr2 = (long[]) A052.second;
        }
        if (A0A.A02 == null) {
            return null;
        }
        i12 = A0B.A00;
        return new CA(i12, A022, ((Long) A064.first).longValue(), A042, A0F, A0A.A02, A0A.A01, A0A.A03, A0A.A00, jArr, jArr2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static CB A0D(HV hv, int i10, int i11, String str) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            hv.A0Y(i12);
            int A082 = hv.A08();
            if (hv.A08() == AbstractC0793Bp.A1G) {
                int A012 = AbstractC0793Bp.A01(hv.A08());
                hv.A0Z(1);
                int i13 = 0;
                int i14 = 0;
                if (A012 == 0) {
                    hv.A0Z(1);
                } else {
                    int A0E = hv.A0E();
                    i13 = (A0E & 240) >> 4;
                    i14 = A0E & 15;
                }
                boolean z10 = hv.A0E() == 1;
                int A0E2 = hv.A0E();
                byte[] bArr = new byte[16];
                hv.A0c(bArr, 0, bArr.length);
                byte[] bArr2 = null;
                if (z10 && A0E2 == 0) {
                    int A0E3 = hv.A0E();
                    bArr2 = new byte[A0E3];
                    hv.A0c(bArr2, 0, A0E3);
                    if (A01[2].length() != 8) {
                        throw new RuntimeException();
                    }
                    A01[2] = "N18HcU44";
                }
                return new CB(z10, str, A0E2, bArr, i13, i14, bArr2);
            }
            i12 += A082;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0385, code lost:
    
        if (r3 != 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03e4, code lost:
    
        if (r3 != 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03a6, code lost:
    
        if (r5 <= 2147483647L) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03aa, code lost:
    
        if (r3 > 2147483647L) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03ac, code lost:
    
        r43.A00 = (int) r5;
        r43.A01 = (int) r3;
        com.facebook.ads.redexgen.X.C0940Hl.A0a(r21, 1000000, r0.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03cd, code lost:
    
        return new com.facebook.ads.redexgen.X.CD(r41, r18, r19, r17, r21, r20, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03d5, code lost:
    
        if (r5 <= 2147483647L) goto L128;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 49 out of bounds for length 44
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.CD A0E(com.facebook.ads.redexgen.X.CA r41, com.facebook.ads.redexgen.X.VL r42, com.facebook.ads.redexgen.X.BS r43) throws com.facebook.ads.redexgen.X.C9R {
        /*
            Method dump skipped, instructions count: 1429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0798Bu.A0E(com.facebook.ads.redexgen.X.CA, com.facebook.ads.redexgen.X.VL, com.facebook.ads.redexgen.X.BS):com.facebook.ads.redexgen.X.CD");
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A00 = new byte[]{49, 37, 119, 106, 114, 102, 110, 115, 110, 115, 108, 88, 102, 114, 117, 113, 106, 120, 70, 121, 89, 110, 114, 106, 120, 121, 102, 114, 117, 73, 106, 113, 121, 102, 37, -112, -124, -42, -55, -47, -59, -51, -46, -51, -46, -53, -73, -59, -47, -44, -48, -55, -41, -83, -46, -89, -52, -39, -46, -49, -124, 71, 59, -115, Byte.MIN_VALUE, -120, 124, -124, -119, -124, -119, -126, 111, -124, -120, Byte.MIN_VALUE, -114, -113, 124, -120, -117, 95, Byte.MIN_VALUE, -121, -113, 124, 94, -125, 124, -119, -126, Byte.MIN_VALUE, -114, 59, -110, 120, -54, -67, -59, -71, -63, -58, -63, -58, -65, -85, -47, -58, -69, -64, -54, -57, -58, -63, -46, -71, -52, -63, -57, -58, -85, -71, -59, -56, -60, -67, -53, 120, 100, -105, -110, -112, 115, -124, -107, -106, -120, -107, -106, -76, -46, -39, -38, -35, -44, -39, -46, -117, -48, -49, -44, -33, -117, -41, -44, -34, -33, -91, -117, -48, -49, -44, -33, -117, -49, -38, -48, -34, -117, -39, -38, -33, -117, -34, -33, -52, -35, -33, -117, -30, -44, -33, -45, -117, -52, -117, -34, -28, -39, -50, -117, -34, -52, -40, -37, -41, -48, -103, -110, -73, -84, -72, -73, -68, -78, -68, -67, -82, -73, -67, 105, -68, -67, -85, -75, 105, -85, -72, -63, 105, -81, -72, -69, 105, -67, -69, -86, -84, -76, 105, 117, -109, -126, -124, -116, 65, -119, -126, -108, 65, -113, -112, 65, -108, -126, -114, -111, -115, -122, 65, -107, -126, -125, -115, -122, 65, -108, -118, -101, -122, 65, -118, -113, -121, -112, -109, -114, -126, -107, -118, -112, -113, -120, -95, -90, -88, -93, -93, -94, -91, -89, -104, -105, 83, -96, -104, -105, -100, -108, 83, -91, -108, -89, -104, 97, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -13, -13, -20, -21, -86, -9, -20, -21, -90, -75, -75, -79, -82, -88, -90, -71, -82, -76, -77, 116, -67, 114, -88, -90, -78, -86, -73, -90, 114, -78, -76, -71, -82, -76, -77, -78, -63, -63, -67, -70, -76, -78, -59, -70, -64, -65, Byte.MIN_VALUE, -55, 126, -66, -63, -123, 126, -76, -74, -78, 126, -121, -127, -119, -89, -74, -74, -78, -81, -87, -89, -70, -81, -75, -76, 117, -66, 115, -77, -74, 122, 115, -68, -70, -70, -101, -86, -86, -90, -93, -99, -101, -82, -93, -87, -88, 105, -78, 103, -85, -81, -93, -99, -91, -82, -93, -89, -97, 103, -82, -78, 109, -95, 124, -112, Ascii.DEL, -124, -118, 74, 78, -126, -117, -117, -126, -106, -123, -118, -112, 80, -126, -124, 84, -69, -49, -66, -61, -55, -119, -69, -58, -69, -67, -33, -13, -30, -25, -19, -83, -33, -21, -16, -85, -11, -32, 107, Ascii.DEL, 110, 115, 121, 57, 111, 107, 109, 61, -109, -89, -106, -101, -95, 97, -97, -94, 102, -109, 95, -98, -109, -90, -97, -65, -45, -62, -57, -51, -115, -53, -50, -61, -59, -68, -48, -65, -60, -54, -118, -51, -68, -46, -94, -74, -91, -86, -80, 112, -73, -81, -91, 111, -91, -75, -76, -87, -67, -84, -79, -73, 119, -66, -74, -84, 118, -84, -68, -69, 118, -80, -84, 109, -127, 112, 117, 123, 59, -126, 122, 112, 58, 112, Byte.MIN_VALUE, Ascii.DEL, 58, 116, 112, 71, 124, 126, 123, 114, 117, 120, 113, 73, 120, 110, 126, -119, -120, -119, 87, -32, -33, -32, -16, -124, -122, -113, -124, -43, -41, -32, -27, -110, -105, -104, -101, -109, 112, -93, -98, -100, -126, -104, -87, -108, 79, -94, -105, -98, -92, -101, -109, 79, -111, -108, 79, -97, -98, -94, -104, -93, -104, -91, -108, 101, 110, 101, 114, -119, -107, -112, -124, 67, -124, -105, -110, -112, 67, -116, -106, 67, -112, -124, -111, -121, -124, -105, -110, -107, -100, -50, -58, -43, -62, -100, -117, -99, -107, -99, -115, -110, -109, 74, -117, -98, -103, -105, 74, -109, -99, 74, -105, -117, -104, -114, -117, -98, -103, -100, -93, -51, -55, -49, -56, -108, -106, -125, -107, -59, -74, -65, -76, 113, -78, -59, -64, -66, 113, -70, -60, 113, -66, -78, -65, -75, -78, -59, -64, -61, -54, -48, -63, -44, -48, -39, -52, -57, -56, -77, -90, -95, -94, -84, 108, 112, -92, -83, -83, -52, -65, -70, -69, -59, -123, -73, -52, -71, -14, -27, -32, -31, -21, -85, -28, -31, -14, -33, -109, -122, -127, -126, -116, 76, -107, 74, -109, -117, -127, 75, -116, -117, 79, 75, -109, -115, 85, -86, -99, -104, -103, -93, 99, -84, 97, -86, -94, -104, 98, -93, -94, 102, 98, -86, -92, 109};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0K(HV hv, int i10, int i11, int i12, int i13, int i14, DrmInitData drmInitData, C0796Bs c0796Bs, int i15) throws C9R {
        DrmInitData drmInitData2 = drmInitData;
        int i16 = i10;
        hv.A0Y(i11 + 8 + 8);
        hv.A0Z(16);
        int A0I = hv.A0I();
        int A0I2 = hv.A0I();
        boolean z10 = false;
        float f = 1.0f;
        hv.A0Z(50);
        int A062 = hv.A06();
        if (i16 == AbstractC0793Bp.A0R) {
            Pair<Integer, CB> A09 = A09(hv, i11, i12);
            if (A09 != null) {
                i16 = ((Integer) A09.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.A02(((CB) A09.second).A02);
                c0796Bs.A03[i15] = (CB) A09.second;
            }
            hv.A0Y(A062);
        }
        List<byte[]> list = null;
        String str = null;
        byte[] bArr = null;
        if (A01[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "nt1AbbZdLf7H";
        strArr[6] = "te59XVvfeUPr";
        int i17 = -1;
        while (A062 - i11 < i12) {
            hv.A0Y(A062);
            int A063 = hv.A06();
            int A082 = hv.A08();
            if (A082 == 0 && hv.A06() - i11 == i12) {
                break;
            }
            H6.A05(A082 > 0, A0I(574, 32, 45));
            int A083 = hv.A08();
            if (A083 == AbstractC0793Bp.A08) {
                H6.A04(str == null);
                str = A0I(710, 9, 84);
                hv.A0Y(A063 + 8);
                C0942Hn A002 = C0942Hn.A00(hv);
                list = A002.A04;
                c0796Bs.A00 = A002.A02;
                if (!z10) {
                    f = A002.A00;
                }
            } else if (A083 == AbstractC0793Bp.A0Y) {
                H6.A04(str == null);
                str = A0I(719, 10, 122);
                hv.A0Y(A063 + 8);
                C0946Ht A003 = C0946Ht.A00(hv);
                list = A003.A01;
                c0796Bs.A00 = A003.A00;
            } else if (A083 == AbstractC0793Bp.A1U) {
                H6.A04(str == null);
                str = i16 == AbstractC0793Bp.A1S ? A0I(729, 19, 27) : A0I(748, 19, 50);
            } else if (A083 == AbstractC0793Bp.A0D) {
                H6.A04(str == null);
                if (A01[3].charAt(8) != 'p') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[4] = "qKPn33WXRD1J";
                strArr2[6] = "UtAkzKHIBavs";
                str = A0I(700, 10, 59);
            } else if (A083 == AbstractC0793Bp.A0S) {
                H6.A04(str == null);
                Pair<String, byte[]> A072 = A07(hv, A063);
                str = (String) A072.first;
                list = Collections.singletonList((byte[]) A072.second);
            } else if (A083 == AbstractC0793Bp.A0p) {
                f = A00(hv, A063);
                z10 = true;
            } else if (A083 == AbstractC0793Bp.A1F) {
                bArr = A0O(hv, A063, A082);
            } else if (A083 == AbstractC0793Bp.A15) {
                int A0E = hv.A0E();
                hv.A0Z(3);
                if (A0E == 0) {
                    int A0E2 = hv.A0E();
                    if (A0E2 == 0) {
                        i17 = 0;
                    } else if (A0E2 == 1) {
                        i17 = 1;
                    } else if (A0E2 == 2) {
                        i17 = 2;
                    } else if (A0E2 == 3) {
                        i17 = 3;
                    }
                }
            }
            A062 += A082;
        }
        if (str == null) {
            return;
        }
        c0796Bs.A02 = Format.A04(Integer.toString(i13), str, null, -1, -1, A0I, A0I2, -1.0f, list, i14, f, bArr, i17, null, drmInitData2);
    }

    static {
        A0J();
        A08 = C0940Hl.A08(A0I(696, 4, 97));
        A05 = C0940Hl.A08(A0I(662, 4, 88));
        A07 = C0940Hl.A08(A0I(692, 4, 90));
        A04 = C0940Hl.A08(A0I(636, 4, 39));
        A06 = C0940Hl.A08(A0I(666, 4, 31));
        A02 = C0940Hl.A08(A0I(IronSourceError.ERROR_BN_LOAD_NO_FILL, 4, 0));
        A03 = C0940Hl.A08(A0I(632, 4, 95));
    }

    public static float A00(HV hv, int i10) {
        hv.A0Y(i10 + 8);
        int vSpacing = hv.A0H();
        int hSpacing = hv.A0H();
        return vSpacing / hSpacing;
    }

    public static int A01(HV hv) {
        int A0E = hv.A0E();
        int size = A0E & a.R;
        while ((A0E & 128) == 128) {
            A0E = hv.A0E();
            int currentByte = A0E & a.R;
            size = (size << 7) | currentByte;
        }
        return size;
    }

    public static int A02(HV hv) {
        hv.A0Y(16);
        int A082 = hv.A08();
        int trackType = A05;
        if (A082 == trackType) {
            return 1;
        }
        int i10 = A08;
        if (A01[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "sACqbdB9h4ZaSOP8RBXRhKf5pkODD9Ze";
        strArr[5] = "nfjFHkgcUdXk9ZZxpn0R0spMdbOfBjgH";
        if (A082 == i10) {
            return 2;
        }
        int trackType2 = A07;
        if (A082 != trackType2) {
            int trackType3 = A04;
            if (A082 != trackType3) {
                int trackType4 = A06;
                if (A082 != trackType4) {
                    int trackType5 = A02;
                    if (A082 != trackType5) {
                        int trackType6 = A03;
                        if (A082 == trackType6) {
                            return 4;
                        }
                        return -1;
                    }
                }
            }
        }
        String[] strArr2 = A01;
        String str = strArr2[4];
        String str2 = strArr2[6];
        int length = str.length();
        int trackType7 = str2.length();
        if (length != trackType7) {
            return 3;
        }
        String[] strArr3 = A01;
        strArr3[0] = "HjSYihfmO4Fjwo0SJsN86rpcIq24412o";
        strArr3[5] = "nDlBCf5sAdyqWE5fn1qZlgrWKnIrwKiA";
        return 3;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(com.facebook.ads.redexgen.X.HV r6, int r7, int r8) {
        /*
            int r5 = r6.A06()
        L4:
            int r0 = r5 - r7
            if (r0 >= r8) goto L2c
            r6.A0Y(r5)
            int r4 = r6.A08()
            if (r4 <= 0) goto L2a
            r3 = 1
        L12:
            r2 = 574(0x23e, float:8.04E-43)
            r1 = 32
            r0 = 45
            java.lang.String r0 = A0I(r2, r1, r0)
            com.facebook.ads.redexgen.X.H6.A05(r3, r0)
            int r1 = r6.A08()
            int r0 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A0S
            if (r1 != r0) goto L28
            return r5
        L28:
            int r5 = r5 + r4
            goto L4
        L2a:
            r3 = 0
            goto L12
        L2c:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0798Bu.A03(com.facebook.ads.redexgen.X.HV, int, int):int");
    }

    public static long A04(HV hv) {
        int fullAtom = 8;
        hv.A0Y(8);
        if (AbstractC0793Bp.A01(hv.A08()) != 0) {
            fullAtom = 16;
        }
        hv.A0Z(fullAtom);
        return hv.A0M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<long[], long[]> A05(com.facebook.ads.redexgen.X.VL r9) {
        /*
            if (r9 == 0) goto La
            int r0 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A0O
            com.facebook.ads.redexgen.X.VK r0 = r9.A07(r0)
            if (r0 != 0) goto L10
        La:
            r0 = 0
            android.util.Pair r0 = android.util.Pair.create(r0, r0)
            return r0
        L10:
            com.facebook.ads.redexgen.X.HV r8 = r0.A00
            r0 = 8
            r8.A0Y(r0)
            int r0 = r8.A08()
            int r7 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A01(r0)
            int r6 = r8.A0H()
            long[] r5 = new long[r6]
            long[] r4 = new long[r6]
            r3 = 0
        L28:
            if (r3 >= r6) goto L6d
            r9 = 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0798Bu.A01
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 8
            if (r1 == r0) goto L3e
        L38:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0798Bu.A01
            java.lang.String r1 = "n2Qu2qSRpGNWmL1w1m0Jsgn90j2APzEn"
            r0 = 3
            r2[r0] = r1
            if (r7 != r9) goto L68
            long r0 = r8.A0N()
        L4b:
            r5[r3] = r0
            if (r7 != r9) goto L62
            long r0 = r8.A0L()
        L53:
            r4[r3] = r0
            short r0 = r8.A0U()
            if (r0 != r9) goto L86
            r0 = 2
            r8.A0Z(r0)
            int r3 = r3 + 1
            goto L28
        L62:
            int r0 = r8.A08()
            long r0 = (long) r0
            goto L53
        L68:
            long r0 = r8.A0M()
            goto L4b
        L6d:
            android.util.Pair r3 = android.util.Pair.create(r5, r4)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0798Bu.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 19
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L96
            goto L38
        L86:
            r2 = 272(0x110, float:3.81E-43)
            r1 = 23
            r0 = 49
            java.lang.String r1 = A0I(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L96:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0798Bu.A01
            java.lang.String r1 = "0OgbcJvER11tVuU6ktzS5zcploLwLpnU"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "Fpvfvil3v0kwqlJSCQAnqVBmdIeuMsHJ"
            r0 = 5
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0798Bu.A05(com.facebook.ads.redexgen.X.VL):android.util.Pair");
    }

    public static Pair<Long, String> A06(HV hv) {
        hv.A0Y(8);
        int fullAtom = AbstractC0793Bp.A01(hv.A08());
        int languageCode = fullAtom == 0 ? 8 : 16;
        hv.A0Z(languageCode);
        long A0M = hv.A0M();
        int version = fullAtom == 0 ? 4 : 8;
        hv.A0Z(version);
        int A0I = hv.A0I();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A0I(0, 0, 122));
        int languageCode2 = A0I >> 10;
        sb2.append((char) ((languageCode2 & 31) + 96));
        int languageCode3 = A0I >> 5;
        sb2.append((char) ((languageCode3 & 31) + 96));
        int languageCode4 = A0I & 31;
        sb2.append((char) (languageCode4 + 96));
        return Pair.create(Long.valueOf(A0M), sb2.toString());
    }

    public static Pair<String, byte[]> A07(HV hv, int i10) {
        hv.A0Y(i10 + 8 + 4);
        hv.A0Z(1);
        A01(hv);
        hv.A0Z(2);
        int A0E = hv.A0E();
        if ((A0E & 128) != 0) {
            hv.A0Z(2);
        }
        if ((A0E & 64) != 0) {
            hv.A0Z(hv.A0I());
        }
        if ((A0E & 32) != 0) {
            hv.A0Z(2);
        }
        hv.A0Z(1);
        A01(hv);
        int A0E2 = hv.A0E();
        String[] strArr = A01;
        if (strArr[0].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "ipSJ7rerSzX8";
        strArr2[6] = "rVXKHnYgOQNY";
        String mimeType = HO.A03(A0E2);
        if (A0I(482, 10, 92).equals(mimeType) || A0I(501, 13, 63).equals(mimeType) || A0I(IronSourceConstants.INIT_COMPLETE, 16, 70).equals(mimeType)) {
            Pair<String, byte[]> create = Pair.create(mimeType, null);
            int objectTypeIndication = A01[3].charAt(8);
            if (objectTypeIndication != 112) {
                return create;
            }
            String[] strArr3 = A01;
            strArr3[1] = "09LVPMUcXpQFix5jag1XMCG3MLP6JHGE";
            strArr3[7] = "l6DCOVwnZaQMuPJJN9SXx5QHr45WFHuE";
            return create;
        }
        hv.A0Z(12);
        hv.A0Z(1);
        int flags = A01(hv);
        byte[] bArr = new byte[flags];
        hv.A0c(bArr, 0, flags);
        return Pair.create(mimeType, bArr);
    }

    public static Pair<Integer, CB> A08(HV hv, int i10, int i11) {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String str = null;
        Integer dataFormat = null;
        while (true) {
            int i15 = i12 - i10;
            if (A01[3].charAt(8) != 112) {
                throw new RuntimeException();
            }
            A01[2] = "AMwqROlZ";
            if (i15 < i11) {
                hv.A0Y(i12);
                int schemeInformationBoxSize = hv.A08();
                int schemeInformationBoxPosition = hv.A08();
                int childPosition = AbstractC0793Bp.A0T;
                if (schemeInformationBoxPosition == childPosition) {
                    int childPosition2 = hv.A08();
                    dataFormat = Integer.valueOf(childPosition2);
                } else {
                    int childPosition3 = AbstractC0793Bp.A0z;
                    if (schemeInformationBoxPosition == childPosition3) {
                        hv.A0Z(4);
                        str = hv.A0S(4);
                    } else {
                        int childPosition4 = AbstractC0793Bp.A0y;
                        if (schemeInformationBoxPosition == childPosition4) {
                            i13 = i12;
                            i14 = schemeInformationBoxSize;
                        }
                    }
                }
                i12 += schemeInformationBoxSize;
            } else {
                if (A0I(566, 4, 31).equals(str) || A0I(558, 4, 36).equals(str) || A0I(570, 4, 112).equals(str) || A0I(562, 4, 123).equals(str)) {
                    boolean z10 = true;
                    H6.A05(dataFormat != null, A0I(610, 22, 33));
                    H6.A05(i13 != -1, A0I(640, 22, 40));
                    CB A0D = A0D(hv, i13, i14, str);
                    if (A0D == null) {
                        z10 = false;
                    }
                    H6.A05(z10, A0I(670, 22, 79));
                    return Pair.create(dataFormat, A0D);
                }
                return null;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.X.CB> A09(com.facebook.ads.redexgen.X.HV r6, int r7, int r8) {
        /*
            int r5 = r6.A06()
        L4:
            int r0 = r5 - r7
            if (r0 >= r8) goto L32
            r6.A0Y(r5)
            int r4 = r6.A08()
            if (r4 <= 0) goto L30
            r3 = 1
        L12:
            r2 = 574(0x23e, float:8.04E-43)
            r1 = 32
            r0 = 45
            java.lang.String r0 = A0I(r2, r1, r0)
            com.facebook.ads.redexgen.X.H6.A05(r3, r0)
            int r1 = r6.A08()
            int r0 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A13
            if (r1 != r0) goto L2e
            android.util.Pair r0 = A08(r6, r5, r4)
            if (r0 == 0) goto L2e
            return r0
        L2e:
            int r5 = r5 + r4
            goto L4
        L30:
            r3 = 0
            goto L12
        L32:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0798Bu.A09(com.facebook.ads.redexgen.X.HV, int, int):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        if (r7 != r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0793Bp.A0v) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0793Bp.A0w) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
    
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0793Bp.A0a) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e7, code lost:
    
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0793Bp.A14) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0793Bp.A03) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        r3 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (com.facebook.ads.redexgen.X.C0798Bu.A01[3].charAt(8) == 'p') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        com.facebook.ads.redexgen.X.C0798Bu.A01[2] = "qFwSWgIL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
    
        if (r7 != r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        r3 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0135, code lost:
    
        if (com.facebook.ads.redexgen.X.C0798Bu.A01[2].length() == 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C0798Bu.A01;
        r2[0] = "Ao0TD4kH2iK3OLyPM25FC6RmFi2h7I9b";
        r2[5] = "OuNutSfPZXXgacWVKzm9oLRb1otwM5q4";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0145, code lost:
    
        if (r7 == r3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0147, code lost:
    
        r3 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A1O;
        r2 = com.facebook.ads.redexgen.X.C0798Bu.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015b, code lost:
    
        if (r2[1].charAt(19) == r2[7].charAt(19)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0163, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C0798Bu.A01;
        r2[0] = "AIk7lRaJ8E5MijNPplfsCP53DjqDD31L";
        r2[5] = "UZtf95QrnIyEi2GPpmv3pYGFcGVBr3II";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016f, code lost:
    
        if (r7 == r3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0173, code lost:
    
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0793Bp.A1W) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0177, code lost:
    
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0793Bp.A18) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        if (r7 != com.facebook.ads.redexgen.X.AbstractC0793Bp.A09) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018b, code lost:
    
        if (r7 != com.facebook.ads.redexgen.X.AbstractC0793Bp.A0A) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018d, code lost:
    
        r7 = java.lang.Integer.toString(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019c, code lost:
    
        if (com.facebook.ads.redexgen.X.C0798Bu.A01[2].length() == 8) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019e, code lost:
    
        r14.A02 = com.facebook.ads.internal.exoplayer2.Format.A0B(r7, A0I(315, 27, 67), null, -1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C0798Bu.A01;
        r2[4] = "I4VfvCwCFlYX";
        r2[6] = "JqrGNuQTdpXg";
        r14.A02 = com.facebook.ads.internal.exoplayer2.Format.A0B(r7, A0I(315, 27, 67), null, -1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0162, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017d, code lost:
    
        r6 = r6;
        r8 = r8;
        r9 = r9;
        A0L(r6, r7, r8, r9, r25, r27, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010f, code lost:
    
        com.facebook.ads.redexgen.X.C0798Bu.A01[3] = "CalJSZVBpFQrcbMBJJxLaxIn8rHUlaUl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0116, code lost:
    
        if (r7 != r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0125, code lost:
    
        if (r7 != r3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C0796Bs A0A(com.facebook.ads.redexgen.X.HV r24, int r25, int r26, java.lang.String r27, com.facebook.ads.internal.exoplayer2.drm.DrmInitData r28, boolean r29) throws com.facebook.ads.redexgen.X.C9R {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0798Bu.A0A(com.facebook.ads.redexgen.X.HV, int, int, java.lang.String, com.facebook.ads.internal.exoplayer2.drm.DrmInitData, boolean):com.facebook.ads.redexgen.X.Bs");
    }

    public static Metadata A0F(VK vk, boolean z10) {
        if (z10) {
            return null;
        }
        HV hv = vk.A00;
        hv.A0Y(8);
        while (hv.A04() >= 8) {
            int atomPosition = hv.A06();
            int A082 = hv.A08();
            if (hv.A08() == AbstractC0793Bp.A0g) {
                hv.A0Y(atomPosition);
                return A0H(hv, atomPosition + A082);
            }
            hv.A0Z(A082 - 8);
        }
        return null;
    }

    public static Metadata A0G(HV hv, int i10) {
        hv.A0Z(8);
        ArrayList arrayList = new ArrayList();
        while (hv.A06() < i10) {
            Metadata.Entry A012 = C2.A01(hv);
            if (A012 != null) {
                arrayList.add(A012);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Metadata A0H(HV hv, int i10) {
        hv.A0Z(12);
        while (hv.A06() < i10) {
            int A062 = hv.A06();
            int atomType = hv.A08();
            int atomSize = hv.A08();
            int atomPosition = AbstractC0793Bp.A0Z;
            if (atomSize == atomPosition) {
                hv.A0Y(A062);
                return A0G(hv, A062 + atomType);
            }
            int atomPosition2 = atomType - 8;
            hv.A0Z(atomPosition2);
        }
        return null;
    }

    public static void A0L(HV hv, int i10, int i11, int i12, int i13, String str, C0796Bs c0796Bs) throws C9R {
        String A0I;
        hv.A0Y(i11 + 8 + 8);
        List list = null;
        long j10 = Long.MAX_VALUE;
        if (i10 == AbstractC0793Bp.A02) {
            A0I = A0I(295, 20, 125);
        } else if (i10 == AbstractC0793Bp.A1O) {
            A0I = A0I(388, 28, 56);
            int i14 = (i12 - 8) - 8;
            byte[] bArr = new byte[i14];
            hv.A0c(bArr, 0, i14);
            list = Collections.singletonList(bArr);
        } else if (i10 == AbstractC0793Bp.A1W) {
            A0I = A0I(367, 21, 68);
        } else if (i10 == AbstractC0793Bp.A18) {
            A0I = A0I(295, 20, 125);
            j10 = 0;
        } else if (i10 == AbstractC0793Bp.A09) {
            A0I = A0I(342, 25, 79);
            c0796Bs.A01 = 1;
        } else {
            throw new IllegalStateException();
        }
        c0796Bs.A02 = Format.A09(Integer.toString(i13), A0I, null, -1, 0, str, -1, null, j10, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r9 == r8) goto L34;
     */
    /* JADX WARN: Incorrect condition in loop: B:29:0x0077 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0M(com.facebook.ads.redexgen.X.HV r32, int r33, int r34, int r35, int r36, java.lang.String r37, boolean r38, com.facebook.ads.internal.exoplayer2.drm.DrmInitData r39, com.facebook.ads.redexgen.X.C0796Bs r40, int r41) throws com.facebook.ads.redexgen.X.C9R {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0798Bu.A0M(com.facebook.ads.redexgen.X.HV, int, int, int, int, java.lang.String, boolean, com.facebook.ads.internal.exoplayer2.drm.DrmInitData, com.facebook.ads.redexgen.X.Bs, int):void");
    }

    public static boolean A0N(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        int latestDelayIndex = C0940Hl.A06(3, 0, length);
        int lastIndex = jArr.length;
        return jArr[0] <= j11 && j11 < jArr[latestDelayIndex] && jArr[C0940Hl.A06(lastIndex - 3, 0, length)] < j12 && j12 <= j10;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] A0O(com.facebook.ads.redexgen.X.HV r4, int r5, int r6) {
        /*
            int r3 = r5 + 8
        L2:
            int r0 = r3 - r5
            if (r0 >= r6) goto L20
            r4.A0Y(r3)
            int r2 = r4.A08()
            int r1 = r4.A08()
            int r0 = com.facebook.ads.redexgen.X.AbstractC0793Bp.A0q
            if (r1 != r0) goto L1e
            byte[] r1 = r4.A00
            int r0 = r3 + r2
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            return r0
        L1e:
            int r3 = r3 + r2
            goto L2
        L20:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0798Bu.A0O(com.facebook.ads.redexgen.X.HV, int, int):byte[]");
    }
}
