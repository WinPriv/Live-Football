package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class UV implements D2 {
    public static byte[] A01;
    public static String[] A02 = {"sMUxEv8h1aqUKtOfXRhWvF4cd3jhCIiv", "2", "jdWxaIwDf600E5fQi1jvtrBwOfx6AZo5", "VxysSZONWs4Fbmb", "6vXrI6nW4BVssue1T84qDnzAdKjaXJyK", "dpBJthFwlwkteZKALF9GwsW9kwjpNbjg", "2vyk08U", "E"};
    public static final int A03;
    public static final DE A04;

    @Nullable
    public final DE A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static ChapterFrame A06(HV hv, int i10, int i11, boolean z10, int i12, @Nullable DE de2) throws UnsupportedEncodingException {
        int A06 = hv.A06();
        int A022 = A02(hv.A00, A06);
        String str = new String(hv.A00, A06, A022 - A06, A0I(169, 10, 52));
        hv.A0Y(A022 + 1);
        int A08 = hv.A08();
        int A082 = hv.A08();
        long A0M = hv.A0M();
        if (A0M == 4294967295L) {
            A0M = -1;
        }
        long A0M2 = hv.A0M();
        if (A0M2 == 4294967295L) {
            A0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = A06 + i10;
        while (hv.A06() < i13) {
            Id3Frame A0B = A0B(i11, hv, z10, i12, de2);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, A08, A082, A0M, A0M2, id3FrameArr);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static GeobFrame A09(HV hv, int i10) throws UnsupportedEncodingException {
        int A0E = hv.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[i10 - 1];
        hv.A0c(bArr, 0, i10 - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, A0I(169, 10, 52));
        int i11 = A022 + 1;
        int A032 = A03(bArr, i11, A0E);
        String A0K = A0K(bArr, i11, A032, A0H);
        int A00 = A00(A0E) + A032;
        int A033 = A03(bArr, A00, A0E);
        return new GeobFrame(str, A0K, A0K(bArr, A00, A033, A0H), A0N(bArr, A00(A0E) + A033, bArr.length));
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{-4, 58, -4, 58, -4, 58, -103, -41, -103, -41, -103, -41, -103, -41, -51, -63, 7, 19, 2, Ascii.SO, 6, -12, 10, Ascii.ESC, 6, -34, 38, 67, 86, 67, 2, 86, 81, 81, 2, 85, 74, 81, 84, 86, 2, 86, 81, 2, 68, 71, 2, 67, 80, 2, 43, 38, Ascii.NAK, 2, 86, 67, 73, Ascii.DLE, 43, 51, 54, 47, 46, -22, 62, 57, -22, 46, 47, 45, 57, 46, 47, -22, 48, 60, 43, 55, 47, 4, -22, 51, 46, 7, -78, -51, -43, -40, -47, -48, -116, -32, -37, -116, -30, -51, -40, -43, -48, -51, -32, -47, -116, -75, -80, -97, -116, -32, -51, -45, -116, -29, -43, -32, -44, -116, -39, -51, -42, -37, -34, -62, -47, -34, -33, -43, -37, -38, -87, -38, 6, -11, 1, -7, -76, 7, -3, Ascii.SO, -7, -76, -7, Ascii.FF, -9, -7, -7, -8, 7, -76, 6, -7, 1, -11, -3, 2, -3, 2, -5, -76, 8, -11, -5, -76, -8, -11, 8, -11, 10, 5, -12, -25, -15, -19, -53, -42, -42, -45, -41, -53, -49, 37, 64, Ascii.SI, 32, 65, 63, 75, 64, 65, 78, -19, 5, 3, 10, 10, -1, -2, -70, -29, -34, -51, -70, Ascii.SO, -5, 1, -70, 17, 3, Ascii.SO, 2, -70, 7, -5, 4, 9, Ascii.FF, -16, -1, Ascii.FF, Ascii.CR, 3, 9, 8, -41, -52, -70, -5, 8, -2, -70, Ascii.SI, 8, -2, -1, 0, 3, 8, -1, -2, -70, -3, 9, 7, 10, Ascii.FF, -1, Ascii.CR, Ascii.CR, 3, 9, 8, -70, Ascii.CR, -3, 2, -1, 7, -1, -25, -1, -3, 4, 4, -7, -8, -76, -35, -40, -57, -76, 8, -11, -5, -76, Ascii.VT, -3, 8, -4, -76, 9, 2, 7, 9, 4, 4, 3, 6, 8, -7, -8, -76, 1, -11, -2, 3, 6, -22, -7, 6, 7, -3, 3, 2, -47, 49, 73, 71, 78, 78, 71, 76, 69, -2, 83, 76, 81, 83, 78, 78, 77, 80, 82, 67, 66, -2, 65, 77, 75, 78, 80, 67, 81, 81, 67, 66, -2, 77, 80, -2, 67, 76, 65, 80, 87, 78, 82, 67, 66, -2, 68, 80, 63, 75, 67, Ascii.DC4, Ascii.CAN, Ascii.CAN, Ascii.CAN, -60, -61, -75, -100, -96, -91, -61, -62, -76, -101, -97, -92, -80, -77, 59, 58, 44, 19, Ascii.RS, 38, 63, 54, 73, 65, 54, 52, 69, 54, 53, -15, 55, 58, 67, 68, 69, -15, 69, 57, 67, 54, 54, -15, 51, 74, 69, 54, 68, -15, 64, 55, -15, Ascii.SUB, Ascii.NAK, 4, -15, 69, 50, 56, -15, 57, 54, 50, 53, 54, 67, Ascii.VT, -15, -18, 7, Ascii.FF, Ascii.SO, 9, 9, 8, Ascii.VT, Ascii.CR, -2, -3, -71, -4, 1, -6, Ascii.VT, -6, -4, Ascii.CR, -2, Ascii.VT, -71, -2, 7, -4, 8, -3, 2, 7, 0, -47, -46, -46, -46, Ascii.DC2, Ascii.SYN, 10, Ascii.DLE, Ascii.SO, -40, -4, 0, -12, -6, -8, -62, -3, 3, -8, -6, -31, -27, -39, -33, -35, -89, -30, -24, -33};
    }

    static {
        A0L();
        A04 = new UW();
        A03 = C0940Hl.A08(A0I(166, 3, 87));
    }

    public UV() {
        this(null);
    }

    public UV(@Nullable DE de2) {
        this.A00 = de2;
    }

    public static int A00(int i10) {
        if (i10 == 0 || i10 == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(HV hv, int i10) {
        byte[] bArr = hv.A00;
        for (int A06 = hv.A06(); A06 + 1 < i10; A06++) {
            int i11 = bArr[A06];
            if ((i11 & p.f9095b) == 255 && bArr[A06 + 1] == 0) {
                int i12 = A06 + 1;
                System.arraycopy(bArr, A06 + 2, bArr, i12, (i10 - A06) - 2);
                i10--;
            }
        }
        return i10;
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0001 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A02(byte[] r1, int r2) {
        /*
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            int r0 = r1.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UV.A02(byte[], int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(byte[] r2, int r3, int r4) {
        /*
            int r1 = A02(r2, r3)
            if (r4 == 0) goto L9
            r0 = 3
            if (r4 != r0) goto La
        L9:
            return r1
        La:
            int r0 = r2.length
            int r0 = r0 + (-1)
            if (r1 >= r0) goto L21
            int r0 = r1 % 2
            if (r0 != 0) goto L1a
            int r0 = r1 + 1
            r0 = r2[r0]
            if (r0 != 0) goto L1a
            return r1
        L1a:
            int r0 = r1 + 1
            int r1 = A02(r2, r0)
            goto La
        L21:
            int r0 = r2.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UV.A03(byte[], int, int):int");
    }

    public static ApicFrame A04(HV hv, int i10, int i11) throws UnsupportedEncodingException {
        int A022;
        String A0M;
        int descriptionEndIndex = hv.A0E();
        String A0H = A0H(descriptionEndIndex);
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        hv.A0c(bArr, 0, encoding2);
        String description = A0I(458, 6, 63);
        String A0I = A0I(169, 10, 52);
        if (i11 == 2) {
            A022 = 2;
            A0M = description + C0940Hl.A0M(new String(bArr, 0, 3, A0I));
            if (A0I(474, 9, 14).equals(A0M)) {
                A0M = A0I(464, 10, 41);
            }
        } else {
            A022 = A02(bArr, 0);
            A0M = C0940Hl.A0M(new String(bArr, 0, A022, A0I));
            if (A0M.indexOf(47) == -1) {
                A0M = description + A0M;
            }
        }
        int encoding3 = A022 + 1;
        int i12 = bArr[encoding3] & p.f9095b;
        int i13 = A022 + 2;
        int pictureType = A03(bArr, i13, descriptionEndIndex);
        int encoding4 = pictureType - i13;
        String mimeType = new String(bArr, i13, encoding4, A0H);
        int A00 = A00(descriptionEndIndex) + pictureType;
        int encoding5 = bArr.length;
        return new ApicFrame(A0M, mimeType, i12, A0N(bArr, A00, encoding5));
    }

    public static BinaryFrame A05(HV hv, int i10, String str) {
        byte[] bArr = new byte[i10];
        hv.A0c(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(HV hv, int i10, int i11, boolean z10, int elementIdEndIndex, @Nullable DE de2) throws UnsupportedEncodingException {
        int A06 = hv.A06();
        int A022 = A02(hv.A00, A06);
        String A0I = A0I(169, 10, 52);
        String str = new String(hv.A00, A06, A022 - A06, A0I);
        hv.A0Y(A022 + 1);
        int framePosition = hv.A0E();
        boolean z11 = (framePosition & 2) != 0;
        boolean z12 = (framePosition & 1) != 0;
        int A0E = hv.A0E();
        String[] strArr = new String[A0E];
        for (int i12 = 0; i12 < A0E; i12++) {
            int startIndex = hv.A06();
            int i13 = A02(hv.A00, startIndex);
            strArr[i12] = new String(hv.A00, startIndex, i13 - startIndex, A0I);
            hv.A0Y(i13 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = A06 + i10;
        while (hv.A06() < i14) {
            Id3Frame A0B = A0B(i11, hv, z10, elementIdEndIndex, de2);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z11, z12, strArr, id3FrameArr);
    }

    public static CommentFrame A08(HV hv, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int textStartIndex = hv.A0E();
        String A0H = A0H(textStartIndex);
        byte[] bArr = new byte[3];
        hv.A0c(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i10 - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 4;
        hv.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, A0H);
        int A00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, A00, textStartIndex);
        String charset = A0K(data, A00, encoding4, A0H);
        return new CommentFrame(description, language, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if (r4 == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (r0 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        if (r0 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        android.util.Log.w(r7, A0I(189, 68, 48));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (r0 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (r4 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (r0 == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r0 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        r0 = r9.A08();
        r9.A0Z(r0);
        r2 = r2 - (r0 + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        if (r4 != r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (r0 == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
    
        if (r0 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        r1 = r9.A0D();
        r0 = r1 - 4;
        r9.A0Z(r0);
        r2 = r2 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
    
        r0 = r6 & 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (r0 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ef, code lost:
    
        if (r0 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        r2 = r2 - 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f6, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
    
        android.util.Log.w(r7, A0I(257, 46, 42) + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0114, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
    
        if (r4 == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.DF A0A(com.facebook.ads.redexgen.X.HV r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UV.A0A(com.facebook.ads.redexgen.X.HV):com.facebook.ads.redexgen.X.DF");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x019f, code lost:
    
        if (r8 == 67) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame A0B(int r23, com.facebook.ads.redexgen.X.HV r24, boolean r25, int r26, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.DE r27) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UV.A0B(int, com.facebook.ads.redexgen.X.HV, boolean, int, com.facebook.ads.redexgen.X.DE):com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0C(HV hv, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        hv.A0c(bArr, 0, i10);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, A0I(169, 10, 52)), A0N(bArr, A022 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(HV hv, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int valueStartIndex = hv.A0E();
        String A0H = A0H(valueStartIndex);
        int encoding = i10 - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 1;
        hv.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, valueStartIndex);
        String description = new String(data, 0, encoding3, A0H);
        int A00 = A00(valueStartIndex) + encoding3;
        int encoding4 = A03(data, A00, valueStartIndex);
        String A0K = A0K(data, A00, encoding4, A0H);
        String charset = A0I(353, 4, 86);
        return new TextInformationFrame(charset, description, A0K);
    }

    public static TextInformationFrame A0E(HV hv, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int encoding = hv.A0E();
        String A0H = A0H(encoding);
        byte[] data = new byte[i10 - 1];
        hv.A0c(data, 0, i10 - 1);
        return new TextInformationFrame(str, null, new String(data, 0, A03(data, 0, encoding), A0H));
    }

    public static UrlLinkFrame A0F(HV hv, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) == strArr[5].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "x";
            strArr2[1] = "0";
            return null;
        }
        int descriptionEndIndex = hv.A0E();
        String A0H = A0H(descriptionEndIndex);
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        hv.A0c(bArr, 0, encoding2);
        int encoding3 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, encoding3, A0H);
        int A00 = A00(descriptionEndIndex) + encoding3;
        String A0K = A0K(bArr, A00, A02(bArr, A00), A0I(169, 10, 52));
        String charset = A0I(454, 4, 16);
        return new UrlLinkFrame(charset, str, A0K);
    }

    public static UrlLinkFrame A0G(HV hv, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        hv.A0c(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(169, 10, 52)));
    }

    public static String A0H(int i10) {
        String A0I = A0I(169, 10, 52);
        if (i10 == 0) {
            return A0I;
        }
        if (i10 == 1) {
            return A0I(357, 6, 5);
        }
        if (i10 == 2) {
            return A0I(363, 8, 4);
        }
        if (i10 != 3) {
            return A0I;
        }
        String[] strArr = A02;
        if (strArr[2].charAt(11) == strArr[5].charAt(11)) {
            throw new RuntimeException();
        }
        A02[0] = "Xs3p10eLQltfrtGuZ9I87GBEYIMhEDM2";
        return A0I(371, 5, 124);
    }

    public static String A0J(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, A0I(0, 6, 109), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, A0I(6, 8, 10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static String A0K(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        if (i11 <= i10 || i11 > bArr.length) {
            return A0I(0, 0, 105);
        }
        return new String(bArr, i10, i11 - i10, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        if (r8 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        r7 = 0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (r12 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        r7 = r7 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (r3 >= r7) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
    
        r0 = r17.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
    
        if (r0 >= r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        r17.A0Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00af, code lost:
    
        r17.A0Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b3, code lost:
    
        if (r8 != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0M(com.facebook.ads.redexgen.X.HV r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UV.A0M(com.facebook.ads.redexgen.X.HV, int, int, boolean):boolean");
    }

    public static byte[] A0N(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return new byte[0];
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        if (A02[3].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "BXfcBk8SW4yeYxu44B11cVVkBGYBzlAv";
        strArr[5] = "okWvwdNSxMQpYeQbiZnCLiGxFx7BKew9";
        return copyOfRange;
    }

    public final Metadata A0O(byte[] bArr, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList = new ArrayList();
        HV hv = new HV(bArr, i10);
        DF A0A = A0A(hv);
        if (A0A == null) {
            return null;
        }
        int A06 = hv.A06();
        i11 = A0A.A01;
        int frameHeaderSize = i11 == 2 ? 6 : 10;
        i12 = A0A.A00;
        z10 = A0A.A02;
        if (z10) {
            i17 = A0A.A00;
            i12 = A01(hv, i17);
        }
        hv.A0X(A06 + i12);
        boolean z11 = false;
        i13 = A0A.A01;
        if (!A0M(hv, i13, frameHeaderSize, false)) {
            i15 = A0A.A01;
            if (A02[4].charAt(24) == '1') {
                throw new RuntimeException();
            }
            A02[0] = "uYZb4rh3wheJht2DQ5CIaEPvRS4bXzrD";
            if (i15 == 4 && A0M(hv, 4, frameHeaderSize, true)) {
                z11 = true;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(A0I(84, 45, 2));
                i16 = A0A.A01;
                sb2.append(i16);
                Log.w(A0I(179, 10, 114), sb2.toString());
                return null;
            }
        }
        while (hv.A04() >= frameHeaderSize) {
            i14 = A0A.A01;
            Id3Frame A0B = A0B(i14, hv, z11, frameHeaderSize, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.X.D2
    public final Metadata A4h(C9 c92) {
        ByteBuffer buffer = c92.A01;
        return A0O(buffer.array(), buffer.limit());
    }
}
