package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public final class AZ extends AbstractC1256Ty {
    public static byte[] A02;
    public static String[] A03 = {"1W0E1A", "gmqFy6ZQaP5ka1WITOse6lKCqSKhRNov", "yPEYbIXQTZij2dUvfHyn6qa5Z66I89l5", "Xhoxo0MeXbgag07m9diWTgmUhgioDUlF", "BIkkp", "x2Y7ova5yP2MY4Z3NAONKiEwX", "ON8", "BctZyAj3hw00k98sEs0CoZ2k5"};
    public static final int[] A04;

    @Nullable
    public final GB A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    public static String A0C(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 92);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        if (A03[6].length() != 3) {
            throw new RuntimeException();
        }
        A03[6] = "oTI";
        A02 = new byte[]{-26, -33, -43};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0F(TrackGroup trackGroup, int[] iArr, int i10, @Nullable String str, int i11, int i12, int i13, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(intValue), str, iArr[intValue], i10, i11, i12, i13)) {
                list.remove(size);
            }
        }
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public AZ() {
        this((GB) null);
    }

    public AZ(@Nullable GB gb2) {
        this.A00 = gb2;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        }
        if (i11 == -1) {
            return 1;
        }
        return i10 - i11;
    }

    public static int A01(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public static int A03(TrackGroup trackGroup, int[] iArr, int i10, @Nullable String str, int i11, int i12, int i13, List<Integer> list) {
        int i14 = 0;
        for (int trackIndex = 0; trackIndex < list.size(); trackIndex++) {
            Integer num = list.get(trackIndex);
            int i15 = A03[2].charAt(31);
            if (i15 == 111) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "3Iv8b3o73oRbqkF65Z5c5dFgz";
            strArr[5] = "e7BsWd0zc9qEfvrmMSkcTfHGf";
            int adaptiveTrackCount = num.intValue();
            if (A0L(trackGroup.A01(adaptiveTrackCount), str, iArr[adaptiveTrackCount], i10, i11, i12, i13)) {
                i14++;
            }
        }
        return i14;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A04(com.facebook.ads.internal.exoplayer2.source.TrackGroup r4, int[] r5, com.facebook.ads.redexgen.X.G2 r6) {
        /*
            r3 = 0
            r2 = 0
        L2:
            int r0 = r4.A01
            if (r2 >= r0) goto L17
            com.facebook.ads.internal.exoplayer2.Format r1 = r4.A01(r2)
            r0 = r5[r2]
            boolean r0 = A0J(r1, r0, r6)
            if (r0 == 0) goto L14
            int r3 = r3 + 1
        L14:
            int r2 = r2 + 1
            goto L2
        L17:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AZ.A04(com.facebook.ads.internal.exoplayer2.source.TrackGroup, int[], com.facebook.ads.redexgen.X.G2):int");
    }

    public static Point A05(boolean z10, int tempViewportWidth, int i10, int i11, int i12) {
        if (z10) {
            if ((i11 > i12) != (tempViewportWidth > i10)) {
                tempViewportWidth = i10;
                i10 = tempViewportWidth;
            }
        }
        int i13 = i11 * i10;
        int i14 = i12 * tempViewportWidth;
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        A03[6] = "nfw";
        if (i13 >= i14) {
            return new Point(tempViewportWidth, C0940Hl.A04(tempViewportWidth * i12, i11));
        }
        return new Point(C0940Hl.A04(i10 * i11, i12), i10);
    }

    @Nullable
    private final GC A06(int i10, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AnonymousClass98 {
        TrackGroup trackGroup = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int selectedTrackScore = trackGroupArray.A01;
            if (A03[3].charAt(2) == 'E') {
                throw new RuntimeException();
            }
            A03[3] = "VerUiBJDpf251zcJKkmQW7r5SVlKN9oM";
            if (i13 < selectedTrackScore) {
                TrackGroup A01 = trackGroupArray.A01(i13);
                int[] iArr2 = iArr[i13];
                for (int selectedTrackScore2 = 0; selectedTrackScore2 < A01.A01; selectedTrackScore2++) {
                    if (A0H(iArr2[selectedTrackScore2], defaultTrackSelector$Parameters.A0B)) {
                        int selectedTrackIndex = (A01.A01(selectedTrackScore2).A0D & 1) != 0 ? 2 : 1;
                        if (A0H(iArr2[selectedTrackScore2], false)) {
                            selectedTrackIndex += 1000;
                        }
                        if (selectedTrackIndex > i12) {
                            trackGroup = A01;
                            i11 = selectedTrackScore2;
                            i12 = selectedTrackIndex;
                        }
                    }
                }
                i13++;
            } else {
                if (trackGroup == null) {
                    return null;
                }
                return new AW(trackGroup, i11);
            }
        }
    }

    @Nullable
    public static GC A07(TrackGroupArray trackGroupArray, int[][] iArr, int i10, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, GB gb2) throws AnonymousClass98 {
        int i11;
        if (defaultTrackSelector$Parameters.A0A) {
            i11 = 24;
        } else {
            i11 = 16;
        }
        boolean z10 = defaultTrackSelector$Parameters.A09 && (i10 & i11) != 0;
        for (int i12 = 0; i12 < trackGroupArray.A01; i12++) {
            TrackGroup A01 = trackGroupArray.A01(i12);
            int[] A0O = A0O(A01, iArr[i12], z10, i11, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (A0O.length > 0) {
                return ((GB) H6.A01(gb2)).A4U(A01, A0O);
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0006 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0011 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.ads.redexgen.X.GC A08(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r11, int[][] r12, int r13, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters r14, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.GB r15) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            r10 = this;
            r3 = -1
            r5 = -1
            r8 = 0
            r7 = 0
        L4:
            int r0 = r11.A01
            if (r7 >= r0) goto L39
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r6 = r11.A01(r7)
            r9 = r12[r7]
            r4 = 0
        Lf:
            int r0 = r6.A01
            if (r4 >= r0) goto L36
            r1 = r9[r4]
            boolean r0 = r14.A0B
            boolean r0 = A0H(r1, r0)
            if (r0 == 0) goto L33
            com.facebook.ads.internal.exoplayer2.Format r2 = r6.A01(r4)
            com.facebook.ads.redexgen.X.G3 r1 = new com.facebook.ads.redexgen.X.G3
            r0 = r9[r4]
            r1.<init>(r2, r14, r0)
            if (r8 == 0) goto L30
            int r0 = r1.A00(r8)
            if (r0 <= 0) goto L33
        L30:
            r5 = r7
            r3 = r4
            r8 = r1
        L33:
            int r4 = r4 + 1
            goto Lf
        L36:
            int r7 = r7 + 1
            goto L4
        L39:
            r0 = -1
            if (r5 != r0) goto L3e
            r0 = 0
            return r0
        L3e:
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r2 = r11.A01(r5)
            boolean r0 = r14.A0D
            if (r0 != 0) goto L58
            if (r15 == 0) goto L58
            r1 = r12[r5]
            boolean r0 = r14.A09
            int[] r1 = A0N(r2, r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto L58
            com.facebook.ads.redexgen.X.GC r0 = r15.A4U(r2, r1)
            return r0
        L58:
            com.facebook.ads.redexgen.X.AW r0 = new com.facebook.ads.redexgen.X.AW
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AZ.A08(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray, int[][], int, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters, com.facebook.ads.redexgen.X.GB):com.facebook.ads.redexgen.X.GC");
    }

    @Nullable
    private final GC A09(TrackGroupArray trackGroupArray, int[][] iArr, int i10, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable GB gb2) throws AnonymousClass98 {
        GC gc2 = null;
        if (!defaultTrackSelector$Parameters.A0D && gb2 != null) {
            gc2 = A07(trackGroupArray, iArr, i10, defaultTrackSelector$Parameters, gb2);
        }
        if (gc2 == null) {
            return A0A(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return gc2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r3 <= r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        if (r1 <= r21.A01) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013f, code lost:
    
        if (r1 <= r21.A01) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013b  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.GC A0A(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r19, int[][] r20, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters r21) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AZ.A0A(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.GC");
    }

    @Nullable
    private final GC A0B(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AnonymousClass98 {
        int i10;
        int i11;
        TrackGroup trackGroup = null;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < trackGroupArray.A01; i14++) {
            TrackGroup A01 = trackGroupArray.A01(i14);
            int[] iArr2 = iArr[i14];
            for (int i15 = 0; i15 < A01.A01; i15++) {
                if (A0H(iArr2[i15], defaultTrackSelector$Parameters.A0B)) {
                    Format A012 = A01.A01(i15);
                    int i16 = A012.A0D & (defaultTrackSelector$Parameters.A00 ^ (-1));
                    boolean z10 = (i16 & 1) != 0;
                    boolean z11 = (i16 & 2) != 0;
                    boolean A0K = A0K(A012, defaultTrackSelector$Parameters.A08);
                    if (A0K || (defaultTrackSelector$Parameters.A0E && A0I(A012))) {
                        if (z10) {
                            i10 = 8;
                        } else if (!z11) {
                            i10 = 6;
                        } else {
                            i10 = 4;
                        }
                        i11 = i10 + (A0K ? 1 : 0);
                    } else if (z10) {
                        i11 = 3;
                    } else if (!z11) {
                        continue;
                    } else if (A0K(A012, defaultTrackSelector$Parameters.A07)) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    if (A0H(iArr2[i15], false)) {
                        i11 += 1000;
                    }
                    if (i11 > i13) {
                        trackGroup = A01;
                        i12 = i15;
                        if (A03[6].length() != 3) {
                            throw new RuntimeException();
                        }
                        A03[2] = "ytO6VNlSXI4nyu5127ZVkMBSWij4cMOM";
                        i13 = i11;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new AW(trackGroup, i12);
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i12 = 0; i12 < trackGroup.A01; i12++) {
            arrayList.add(Integer.valueOf(i12));
        }
        if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i13 = Integer.MAX_VALUE;
        for (int videoPixels = 0; videoPixels < trackGroup.A01; videoPixels++) {
            Format A01 = trackGroup.A01(videoPixels);
            if (A01.A0F > 0) {
                int i14 = A01.A08;
                if (A03[3].charAt(2) == 'E') {
                    throw new RuntimeException();
                }
                A03[2] = "kSz4FX5ZHsEkHeXGD1Cn3cbmsF2hLdtD";
                if (i14 > 0) {
                    Point A05 = A05(z10, i10, i11, A01.A0F, A01.A08);
                    int i15 = A01.A0F * A01.A08;
                    if (A01.A0F >= ((int) (A05.x * 0.98f)) && A01.A08 >= ((int) (A05.y * 0.98f)) && i15 < i13) {
                        i13 = i15;
                    }
                }
            }
        }
        if (i13 != Integer.MAX_VALUE) {
            for (int maxVideoPixelsToRetain = arrayList.size() - 1; maxVideoPixelsToRetain >= 0; maxVideoPixelsToRetain--) {
                int i16 = trackGroup.A01(((Integer) arrayList.get(maxVideoPixelsToRetain)).intValue()).A0E();
                if (i16 == -1 || i16 > i13) {
                    arrayList.remove(maxVideoPixelsToRetain);
                }
            }
        }
        return arrayList;
    }

    public static void A0G(GA ga2, int[][][] iArr, C07459h[] c07459hArr, GC[] gcArr, int i10) {
        if (i10 == 0) {
            return;
        }
        int rendererType = -1;
        int i11 = -1;
        if (A03[1].charAt(3) != 'F') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "rTjwD";
        strArr[0] = "uX38vm";
        boolean z10 = true;
        int i12 = 0;
        while (true) {
            int tunnelingAudioRendererIndex = ga2.A00();
            if (i12 >= tunnelingAudioRendererIndex) {
                break;
            }
            int A01 = ga2.A01(i12);
            GC gc2 = gcArr[i12];
            if ((A01 == 1 || A01 == 2) && gc2 != null && A0M(iArr[i12], ga2.A02(i12), gc2)) {
                if (A01 == 1) {
                    if (rendererType != -1) {
                        z10 = false;
                        break;
                    }
                    rendererType = i12;
                } else {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                }
            }
            i12++;
        }
        boolean z11 = z10 & ((rendererType == -1 || i11 == -1) ? false : true);
        int tunnelingVideoRendererIndex = A03[3].charAt(2);
        if (tunnelingVideoRendererIndex != 69) {
            String[] strArr2 = A03;
            strArr2[4] = "aY4hR";
            strArr2[0] = "2v7HMH";
            if (!z11) {
                return;
            }
        } else if (!z11) {
            return;
        }
        C07459h c07459h = new C07459h(i10);
        c07459hArr[rendererType] = c07459h;
        c07459hArr[i11] = c07459h;
    }

    public static boolean A0H(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 21));
    }

    public static boolean A0J(Format format, int i10, G2 g22) {
        if (A0H(i10, false) && format.A05 == g22.A00 && format.A0C == g22.A01) {
            return g22.A02 == null || TextUtils.equals(g22.A02, format.A0O);
        }
        return false;
    }

    public static boolean A0K(Format format, @Nullable String str) {
        return str != null && TextUtils.equals(str, C0940Hl.A0L(format.A0N));
    }

    public static boolean A0L(Format format, @Nullable String str, int i10, int i11, int i12, int i13, int i14) {
        if (!A0H(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !C0940Hl.A0g(format.A0O, str)) {
            return false;
        }
        if (format.A0F != -1 && format.A0F > i12) {
            return false;
        }
        if (format.A08 != -1 && format.A08 > i13) {
            return false;
        }
        if (format.A04 != -1) {
            int i15 = format.A04;
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            A03[2] = "FNCbzyr7QyRP3SA06TqNXuxS80zpa9Bi";
            if (i15 > i14) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, GC gc2) {
        if (gc2 == null) {
            return false;
        }
        int A00 = trackGroupArray.A00(gc2.A7e());
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        A03[1] = "tyUFTMgWRFIbU9oMa0yVOFtav5LFL8C4";
        for (int i10 = 0; i10 < gc2.length(); i10++) {
            int trackGroupIndex = iArr[A00][gc2.A6l(i10)] & 32;
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        int trackGroupIndex2 = A03[2].charAt(31);
        if (trackGroupIndex2 != 111) {
            String[] strArr = A03;
            strArr[4] = "AvWfp";
            strArr[0] = "jnm8oH";
            return true;
        }
        A03[3] = "hBflC2WcQfSqXI4XtpzFNLmvHBtesKLi";
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:30:0x006d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] A0N(com.facebook.ads.internal.exoplayer2.source.TrackGroup r8, int[] r9, boolean r10) {
        /*
            r5 = 0
            r7 = 0
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r4 = 0
        L8:
            int r0 = r8.A01
            if (r4 >= r0) goto L49
            com.facebook.ads.internal.exoplayer2.Format r0 = r8.A01(r4)
            com.facebook.ads.redexgen.X.G2 r3 = new com.facebook.ads.redexgen.X.G2
            int r2 = r0.A05
            int r1 = r0.A0C
            if (r10 == 0) goto L46
            r0 = 0
        L19:
            r3.<init>(r2, r1, r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AZ.A03
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L5c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AZ.A03
            java.lang.String r1 = "SWl"
            r0 = 6
            r2[r0] = r1
            boolean r0 = r6.add(r3)
            if (r0 == 0) goto L43
            int r0 = A04(r8, r9, r3)
            if (r0 <= r5) goto L43
            r7 = r3
            r5 = r0
        L43:
            int r4 = r4 + 1
            goto L8
        L46:
            java.lang.String r0 = r0.A0O
            goto L19
        L49:
            r0 = 1
            if (r5 <= r0) goto L8a
            int[] r5 = new int[r5]
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AZ.A03
            r0 = 1
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 70
            if (r1 == r0) goto L62
        L5c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L62:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AZ.A03
            java.lang.String r1 = "ndqJYBN4kzCrcISGfJ6gLQAVvTseYRAq"
            r0 = 2
            r2[r0] = r1
            r4 = 0
            r3 = 0
        L6b:
            int r0 = r8.A01
            if (r3 >= r0) goto L89
            com.facebook.ads.internal.exoplayer2.Format r2 = r8.A01(r3)
            r1 = r9[r3]
            java.lang.Object r0 = com.facebook.ads.redexgen.X.H6.A01(r7)
            com.facebook.ads.redexgen.X.G2 r0 = (com.facebook.ads.redexgen.X.G2) r0
            boolean r0 = A0J(r2, r1, r0)
            if (r0 == 0) goto L86
            int r0 = r4 + 1
            r5[r4] = r3
            r4 = r0
        L86:
            int r3 = r3 + 1
            goto L6b
        L89:
            return r5
        L8a:
            int[] r0 = com.facebook.ads.redexgen.X.AZ.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AZ.A0N(com.facebook.ads.internal.exoplayer2.source.TrackGroup, int[], boolean):int[]");
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z10, int selectedMimeTypeTrackCount, int selectedMimeTypeTrackCount2, int trackIndex, int i10, int i11, int i12, boolean z11) {
        int A032;
        if (trackGroup.A01 >= 2) {
            List<Integer> A0D = A0D(trackGroup, i11, i12, z11);
            if (A0D.size() < 2) {
                return A04;
            }
            String selectedMimeType = null;
            if (!z10) {
                HashSet hashSet = new HashSet();
                int selectedMimeTypeTrackCount3 = 0;
                for (int i13 = 0; i13 < A0D.size(); i13++) {
                    String str = trackGroup.A01(A0D.get(i13).intValue()).A0O;
                    if (hashSet.add(str) && (A032 = A03(trackGroup, iArr, selectedMimeTypeTrackCount, str, selectedMimeTypeTrackCount2, trackIndex, i10, A0D)) > selectedMimeTypeTrackCount3) {
                        if (A03[3].charAt(2) == 'E') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[7] = "YYn4Z0UW1tJYYEwj5MQ7L1Rhi";
                        strArr[5] = "BvRHCOG0R11gnbm1vcetrlVSM";
                        selectedMimeType = str;
                        selectedMimeTypeTrackCount3 = A032;
                    }
                }
            }
            A0F(trackGroup, iArr, selectedMimeTypeTrackCount, selectedMimeType, selectedMimeTypeTrackCount2, trackIndex, i10, A0D);
            return A0D.size() < 2 ? A04 : C0940Hl.A0j(A0D);
        }
        return A04;
    }

    private final GC[] A0P(GA ga2, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AnonymousClass98 {
        boolean z10;
        int A00 = ga2.A00();
        GC[] gcArr = new GC[A00];
        boolean seenVideoRendererWithMappedTracks = false;
        int i10 = 0;
        for (int i11 = 0; i11 < A00; i11++) {
            int A01 = ga2.A01(i11);
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            A03[2] = "HeTTodjeOHNf6YJV3Oi2xZW4zDR7myJi";
            if (2 == A01) {
                if (i10 == 0) {
                    z10 = true;
                    gcArr[i11] = A09(ga2.A02(i11), iArr[i11], iArr2[i11], defaultTrackSelector$Parameters, this.A00);
                    i10 = gcArr[i11] != null ? 1 : 0;
                } else {
                    z10 = true;
                }
                if (ga2.A02(i11).A01 <= 0) {
                    z10 = false;
                }
                seenVideoRendererWithMappedTracks |= z10;
            }
        }
        boolean selectedVideoTracks = false;
        int i12 = 0;
        int rendererCount = A03[3].charAt(2);
        if (rendererCount == 69) {
            throw new RuntimeException();
        }
        A03[2] = "aVwUyHxCeGesw16VUIJPDtFnHPxsnnXC";
        for (int i13 = 0; i13 < A00; i13++) {
            int A012 = ga2.A01(i13);
            if (A012 != 1) {
                if (A012 != 2) {
                    if (A012 != 3) {
                        gcArr[i13] = A06(A012, ga2.A02(i13), iArr[i13], defaultTrackSelector$Parameters);
                    } else if (i12 == 0) {
                        gcArr[i13] = A0B(ga2.A02(i13), iArr[i13], defaultTrackSelector$Parameters);
                        i12 = gcArr[i13] != null ? 1 : 0;
                    }
                }
            } else if (!selectedVideoTracks) {
                gcArr[i13] = A08(ga2.A02(i13), iArr[i13], iArr2[i13], defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                selectedVideoTracks = gcArr[i13] != null;
            }
        }
        return gcArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    @Override // com.facebook.ads.redexgen.X.AbstractC1256Ty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.facebook.ads.redexgen.X.C07459h[], com.facebook.ads.redexgen.X.GC[]> A0V(com.facebook.ads.redexgen.X.GA r11, int[][][] r12, int[] r13) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReference<com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters> r0 = r10.A01
            java.lang.Object r6 = r0.get()
            com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters r6 = (com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters) r6
            int r5 = r11.A00()
            com.facebook.ads.redexgen.X.GC[] r4 = r10.A0P(r11, r12, r13, r6)
            r3 = 0
        L11:
            r9 = 0
            r8 = 0
            r2 = 1
            if (r3 >= r5) goto L61
            boolean r0 = r6.A06(r3)
            if (r0 == 0) goto L21
            r4[r3] = r8
        L1e:
            int r3 = r3 + 1
            goto L11
        L21:
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r1 = r11.A02(r3)
            boolean r0 = r6.A07(r3, r1)
            if (r0 == 0) goto L1e
            com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r7 = r6.A05(r3, r1)
            if (r7 != 0) goto L34
            r4[r3] = r8
            goto L1e
        L34:
            int r0 = r7.A01
            if (r0 != r2) goto L4a
            int r0 = r7.A00
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r2 = r1.A01(r0)
            int[] r0 = r7.A02
            r1 = r0[r9]
            com.facebook.ads.redexgen.X.AW r0 = new com.facebook.ads.redexgen.X.AW
            r0.<init>(r2, r1)
            r4[r3] = r0
            goto L1e
        L4a:
            com.facebook.ads.redexgen.X.GB r0 = r10.A00
            java.lang.Object r2 = com.facebook.ads.redexgen.X.H6.A01(r0)
            com.facebook.ads.redexgen.X.GB r2 = (com.facebook.ads.redexgen.X.GB) r2
            int r0 = r7.A00
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r1 = r1.A01(r0)
            int[] r0 = r7.A02
            com.facebook.ads.redexgen.X.GC r0 = r2.A4U(r1, r0)
            r4[r3] = r0
            goto L1e
        L61:
            com.facebook.ads.redexgen.X.9h[] r3 = new com.facebook.ads.redexgen.X.C07459h[r5]
            r2 = 0
        L64:
            if (r2 >= r5) goto L85
            boolean r0 = r6.A06(r2)
            if (r0 != 0) goto L83
            int r1 = r11.A01(r2)
            r0 = 5
            if (r1 == r0) goto L77
            r0 = r4[r2]
            if (r0 == 0) goto L83
        L77:
            r0 = 1
        L78:
            if (r0 == 0) goto L81
            com.facebook.ads.redexgen.X.9h r0 = com.facebook.ads.redexgen.X.C07459h.A01
        L7c:
            r3[r2] = r0
            int r2 = r2 + 1
            goto L64
        L81:
            r0 = r8
            goto L7c
        L83:
            r0 = 0
            goto L78
        L85:
            int r0 = r6.A04
            A0G(r11, r12, r3, r4, r0)
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AZ.A0V(com.facebook.ads.redexgen.X.GA, int[][][], int[]):android.util.Pair");
    }
}
