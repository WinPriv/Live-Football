package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import com.anythink.expressad.foundation.g.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import com.facebook.ads.internal.exoplayer2.video.DummySurface;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.1Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1Y extends C3G {
    public static boolean A0b;
    public static boolean A0c;
    public static byte[] A0d;
    public static String[] A0e = {"NS8r3iU3bE12Q5c28wyOjILRdJ0J08uI", "UbzRKZURs", "SU7Qb1ICkxq5LQRUjQdAnOKVl0Elt9iK", "HdySUumBIxpTjI6XDfJ50FoXA9Aqq3VK", "W2XidxNDZL2wdlIqJNQqrIQcb8erTCLJ", "pQl30wQXruMBF7LsTdQVlnJoVdVvITHL", "EldsxOw3j9Ew0275hEYEpNzApywAkDlk", "GsoHFPwBx"};
    public static final int[] A0f;
    public C0949Hw A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public Surface A0N;
    public Surface A0O;
    public C0948Hv A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final Context A0V;
    public final C0952Hz A0W;
    public final I8 A0X;
    public final boolean A0Y;
    public final long[] A0Z;
    public final long[] A0a;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Point A02(C0815Cm c0815Cm, Format format) throws C0824Cv {
        int i10 = 0;
        boolean z10 = format.A08 > format.A0F;
        int i11 = z10 ? format.A08 : format.A0F;
        int i12 = z10 ? format.A0F : format.A08;
        float f = i12 / i11;
        int[] iArr = A0f;
        int length = iArr.length;
        while (i10 < length) {
            int i13 = iArr[i10];
            if (A0e[3].charAt(18) == 'r') {
                throw new RuntimeException();
            }
            A0e[5] = "1BVaGfMRJiqdWLUq8dv8R9mVKG0R6nhL";
            int i14 = (int) (i13 * f);
            if (i13 <= i11 || i14 <= i12) {
                return null;
            }
            if (C0940Hl.A02 >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point A0E = c0815Cm.A0E(i15, i13);
                if (c0815Cm.A0H(A0E.x, A0E.y, format.A01)) {
                    return A0E;
                }
            } else {
                int A04 = C0940Hl.A04(i13, 16) * 16;
                int A042 = C0940Hl.A04(i14, 16) * 16;
                if (A04 * A042 <= C0826Cx.A00()) {
                    int i16 = z10 ? A042 : A04;
                    if (!z10) {
                        A04 = A042;
                    }
                    return new Point(i16, A04);
                }
            }
            i10++;
            if (A0e[3].charAt(18) != 'r') {
                String[] strArr = A0e;
                strArr[7] = "qOOBmdqjU";
                strArr[1] = "w7Tn3xd7M";
            } else {
                String[] strArr2 = A0e;
                strArr2[2] = "KAf95qDJkDfWOijmfxtuynNssocKmC3g";
                strArr2[0] = "h6cBxdrGRvPICzB6Kk67A24HS1YQyhML";
            }
        }
        return null;
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0e;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[6] = "1g9G5auDmi6BFhp1SUFflSJn2zbmW8bI";
            strArr2[4] = "EQg736KY9Bh9QzgWqQs064uwRmk9hBcX";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 46);
            i13++;
        }
    }

    public static void A0D() {
        A0d = new byte[]{64, 71, 65, 64, 64, 70, 64, 66, 71, 65, 71, 66, 122, 10, Ascii.VT, Ascii.SYN, Ascii.FF, Ascii.VT, 125, 55, 71, 64, 70, 71, 42, 89, 91, 90, 93, 10, 95, 91, 63, 73, 78, 78, 78, 83, Ascii.US, 17, 103, 96, 96, 96, 32, 60, 37, 35, 118, 0, 7, 6, 7, 86, 3, Ascii.SI, 73, 63, 56, 58, 56, 105, 60, 48, 40, 47, 61, 40, 2, 5, Ascii.ETB, Ascii.CR, 0, 7, Ascii.NAK, Ascii.DC2, 39, Ascii.VT, 7, Ascii.FS, 9, 8, Ascii.VT, 59, 63, 43, Ascii.SUB, 37, 61, 47, 56, 7, 90, 110, 105, 122, 68, 85, 116, 111, 126, 68, 41, 55, 57, 52, 54, 62, 88, 68, 45, 4, Ascii.DC4, 7, Ascii.DLE, Ascii.SI, 7, 102, 114, Ascii.CR, 102, 116, 118, 119, 115, 39, 55, 36, 51, 44, 36, 58, 36, 49, 51, 87, 3, 113, 7, Ascii.DC4, 124, 114, 115, 114, Ascii.ESC, Ascii.CR, 116, 118, 90, 73, 81, 40, 47, 41, 32, Ascii.FF, Ascii.US, Ascii.SYN, 119, 124, Ascii.DLE, 6, Ascii.DEL, Ascii.DEL, 106, 70, 77, 76, 74, 9, 68, 72, 81, 9, 91, 76, 90, 70, 69, 92, 93, 64, 70, 71, 9, 72, 77, 67, 92, 90, 93, 76, 77, 9, 93, 70, 19, 9, 108, 64, 66, 70, 64, 124, Ascii.RS, 19, 99, 96, 98, 101, 94, 87, 78, 92, 90, 68, 90, 40, 68, 75, 105, 116, 46, 39, 62, 44, 42, 52, 37, 4, Ascii.US, Ascii.SO, 5, Ascii.FF, Ascii.NAK, 7, 1, Ascii.US, Ascii.DLE, 50, 41, 45, Ascii.CAN, 17, 8, Ascii.SUB, Ascii.FS, 2, Ascii.SI, 60, 36, 2, 5, 69, 118, 101, 114, 83, 116, 97, 114, 95, 83, Ascii.DEL, 10, 8, 8, 8, 72, 61, 63, 63, 61, 102, 19, 17, 17, Ascii.SYN, 68, 49, 48, 51, 51, Ascii.CAN, 109, 108, 111, 109, 84, 33, 32, 35, 39, 39, 82, 82, 80, 80, 94, 121, 116, 107, 125, 91, 112, 125, 123, 115, 56, 67, 116, 125, Ascii.DEL, 121, 123, 97, 94, 106, 121, 117, 125, 75, 113, 98, 125, 52, 56, 41, 39, 33, 32, 43, 43, 49, 41, 44, 34, 89, 93, 88, 94, 8, 6, 0, 1, 10, 10, Ascii.DLE, Ascii.FS, Ascii.CAN, Ascii.CAN, 126, 121, Ascii.DEL, 118, Ascii.SI, 1, 7, 6, Ascii.CR, Ascii.CR, Ascii.ETB, Ascii.ESC, Ascii.US, Ascii.US, 121, 126, 122, Ascii.DEL, 65, 79, 73, 72, 67, 67, 89, 85, 81, 81, 55, 48, 53, 55, 1, Ascii.SI, 9, 8, 3, 3, Ascii.EM, 17, 4, 10, 115, 113, 118, 126, 40, 38, 32, 33, 42, 42, 48, 56, 45, 35, 88, 92, 89, 90, 59, 53, 51, 50, 57, 57, 35, 43, 62, 48, 75, 73, 77, 69, 40, 6, 32, 33, 42, 42, 48, 44, 45, 35, 88, 90, 94, 92, Ascii.RS, 48, Ascii.SYN, Ascii.ETB, Ascii.FS, Ascii.FS, 6, Ascii.RS, Ascii.ESC, Ascii.NAK, 110, 106, 104, 96, 64, 95, 74, 68, 70, 37, 64, 91, 68, 80, 82, 94, 62, 91, 66, 93, 92, 68, 89, 39, 66, 74, 109, 101, 106, 109, 106, 123, 46, 91, 54, 52, 49, 70, 75, 86, Ascii.NAK, 107, 110, 63, 106, 110, Ascii.CR, 0, Ascii.NAK, 9, 17, Ascii.SI, 70, 89, 39, 63, 58, 59, 61, 67, 59, 109, 87, 95, 83, 64, 79, 69, 87, 47, Ascii.ESC, Ascii.SO, 96, 116, 92, 93, 80, 88, 122, 86, 93, 92, 90, 111, 80, 93, 92, 86, 107, 92, 87, 93, 92, 75, 92, 75, Ascii.SUB, 2, Ascii.GS, Ascii.DLE, Ascii.GS, Ascii.NAK, 95, 73, 36, 37, 32, 91, 45, 59, 86, 84, 80, 41, Ascii.FS, Ascii.RS, Ascii.VT, 125, 52, 60, 60, 52, 63, 54, 89, 120, 115, 70, 122, 99, 101, 35, 66, 84, 50, 60, 53, 55, 95, 82, 64, 82, 34, 61, 38, 39, 32, 93, 71, 80, 89, 34, 37, 47, 17, 6, Ascii.SI, 119, 112, 113, 96, 119, 126, 6, 1, 1, Ascii.US, 3, 10, 46, 44, 49, 73, 45, Ascii.SO, 54, 63, 48, 42, 49, 51, 104, 4, 61, 44, 61, 96, 121, 99, Ascii.VT, 103, 19, 77, 116, 101, 116, 40, 48, 44, 45, 66, 41, 90, 8, 106, 108, 105, 120, Ascii.GS, Ascii.ESC, Ascii.US, Ascii.EM, 33, 68, 66, 71, 109, 8, Ascii.SI, Ascii.CR, Ascii.FF, 98, 6, 6, Ascii.SUB, 102, 97, Ascii.SI, Ascii.DC2, 8, 2, 125, 116, Ascii.GS, 121, 78, 88, 68, 71, 94, 95, 66, 68, 69, 88, Ascii.VT, 94, 69, 64, 69, 68, 92, 69, 5, Ascii.VT, 104, 68, 79, 78, 72, Ascii.VT, 70, 74, 83, Ascii.VT, 89, 78, 88, 68, 71, 94, 95, 66, 68, 69, 17, Ascii.VT, 109, 104, 110, 19, 122, 106, 104, Ascii.SI, Ascii.VT, 118, 73, 68, 81, 64, 122, 117, 87, 74, 35, 53, 68, 90, 64, 68, 71, 49, 100, 114, 3, Ascii.GS, 7, 3, 0, 104, 61, 43, 90, 68, 81, 92, 89, 47, 102, 112, 1, Ascii.US, 10, 7, 2, Ascii.DEL, Ascii.DLE, 43, 43, 100, 41, 37, 42, 61, 100, 55, 48, 54, 33, 37, 41, 100, 39, 44, 37, 42, 35, 33, 55, 104, 100, 55, 43, 100, 32, 54, 43, 52, 52, 45, 42, 35, 100, 43, 34, 34, 55, 33, 48, 126, 100, 73, 46, 7, 99, 98, Ascii.SYN, 19, 108, Ascii.SI, Ascii.US, 116, Ascii.CAN, Ascii.SI, Ascii.FF, Ascii.CR, Ascii.DLE, 103, Ascii.CR, Ascii.SI, 3, 102, 97, 97, 100, 19, 120, 123, Ascii.SYN, Ascii.EM, Ascii.ESC, 6, 43, 73, 65, 104, Ascii.DC2, 111, Ascii.DC4, Ascii.DLE, 4, Ascii.NAK, Ascii.CAN, Ascii.RS, 92, 2, Ascii.DC4, 2, 2, Ascii.CAN, Ascii.RS, Ascii.US, 92, Ascii.CAN, Ascii.NAK, Ascii.FF, Ascii.CAN, Ascii.EM, 2, 64, Ascii.VT, Ascii.US, Ascii.SO, 75, 90, 71, 88, 5, 74, 71, 92, 92, 71, 69, 9, Ascii.CAN, 5, Ascii.SUB, 71, 6, Ascii.SI, Ascii.FF, Ascii.RS, 17, 0, Ascii.GS, 2, 95, 0, Ascii.ESC, Ascii.NAK, Ascii.SUB, 6, Ascii.FS, Ascii.CR, Ascii.DLE, Ascii.SI, 82, Ascii.VT, Ascii.DLE, Ascii.SI, 54, 35, 100, 124, 105, 44, 81, 80, 87, 3, Ascii.NAK, 8, Ascii.ETB, 49, Ascii.SO, 3, 2, 8, 37, Ascii.DC2, 1, 1, 2, Ascii.NAK, 99, 105, 106, 76, 69, 89, 94, 79, 88, 48, 36, 55, 59, 51, 123, 36, 55, 34, 51, Ascii.CAN, Ascii.CR, Ascii.SYN, Ascii.EM, Ascii.EM, Ascii.SYN, 17, 39, 42, 38, 40, 39, 59, 99, Ascii.DEL, 104, 84, 110, 62, 61, 102, 103, 84, 111, Ascii.DEL, 126, 103, 42, 53, 3, Ascii.SO, 7, 111, 10, 96, 107, 
        104, 101, 101, 49, 62, 58, 60, 86, 48, 49, 57, 63, 119, 108, 119, 109, 40, 46, 114, 111, 126, 119, 68, 72, 47, 42, 47, 119, 61, 41, 49, 32, 44, 43, 54, 47, 38, Ascii.FS, 59, 117, 100, 104, 103, 103, 96, 103, 110, 118, 122, 105, 114, 117, 116, 68, 125, Ascii.FF, 0, Ascii.EM, 76, 9, 4, 8, 6, 9, Ascii.NAK, Ascii.SO, 2, Ascii.ESC, 78, 10, Ascii.CR, 19, Ascii.SYN, Ascii.ETB, 78, Ascii.DLE, 10, Ascii.EM, 6, 83, 95, 70, 19, 73, 87, 90, 74, 86, Ascii.DLE, Ascii.NAK, 68, 64, 77, 70, Ascii.DEL, 123, Ascii.DEL, 119, 89, 86, 90, 86, 67, 95, 107, 108, 102, 110, 105, 100, 112, 118, 90, 99, 119, 53, 54, 53, 72, 89, 86, 93, 84, 84, 103, 92, 48, 33, 46, 37, 44, 44, Ascii.US, 36, 44, 101, 116, 123, 112, 121, 121, 74, 113, 102, 96, 113, 126, 117, 124, 124, 79, 116, 100, 78, 76, 87, 81, 76, 87, 74, 71, 107, 124, 117, 124, 120, 106, 124, 86, 108, 109, 105, 108, 109, 91, 108, Ascii.DEL, Ascii.DEL, 124, 107, 17, Ascii.FF, Ascii.ETB, 2, Ascii.ETB, 10, Ascii.FF, Ascii.CR, 78, 7, 6, 4, 17, 6, 6, Ascii.DLE, 94, Ascii.DC4, Ascii.GS, Ascii.CAN, 85, Ascii.GS, Ascii.FS, Ascii.NAK, 123, 105, 102, 124, 103, 102, 97, 68, 92, 94, 71, 97, 94, 83, 82, 88, 117, 66, 81, 81, 82, 69, 5, Ascii.DLE, Ascii.CAN, Ascii.NAK, Ascii.RS, 46, 3, Ascii.RS, 6, 32, 55, 56, Ascii.VT, 49, 33, 54, 55, 44, 44, 39, 46, 39, 38, 111, 50, 46, 35, 59, 32, 35, 33, 41, 82, 65, 86, 74, 65, 65, 123, 105, 17, 116, 107, 102, 103, 109, 45, 49, 101, 114, 114, 117, 106, 103, 102, 108, 44, 98, 117, 96, 97, 126, 115, 114, 120, 56, Ascii.DEL, 114, 97, 116, 102, 121, 116, 117, Ascii.DEL, 63, 125, 96, 36, 102, 61, 117, 99, 5, Ascii.SUB, Ascii.ETB, Ascii.SYN, Ascii.FS, 92, Ascii.VT, 94, 5, Ascii.GS, Ascii.ETB, 93, Ascii.FS, Ascii.GS, 65, 93, 5, 3, 75, 111, 112, 125, 124, 118, 54, 97, 52, 111, 119, 125, 55, 118, 119, 43, 55, 111, 105, 32, 9, Ascii.US, 10, Ascii.CR, 17, Ascii.DLE, 79, 80, 65, 74, 93, 92, 63, 33, 44, 60, 32, 106, 114, 114, 121, 110, 66, 123, 115, 107, 107, 96, 119, 91, 98, 106, Ascii.ETB};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.C3G
    public final int A1B(InterfaceC0821Cs interfaceC0821Cs, B8<C1288Vh> b82, Format format) throws C0824Cv {
        String str = format.A0O;
        if (!HO.A0B(str)) {
            return 0;
        }
        boolean z10 = false;
        DrmInitData drmInitData = format.A0H;
        if (drmInitData != null) {
            for (int i10 = 0; i10 < drmInitData.A01; i10++) {
                z10 |= drmInitData.A01(i10).A03;
            }
        }
        C0815Cm A6L = interfaceC0821Cs.A6L(str, z10);
        String[] strArr = A0e;
        if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[7] = "kTnRYby1s";
        strArr2[1] = "UL9g0IqkI";
        if (A6L == null) {
            return (!z10 || interfaceC0821Cs.A6L(str, false) == null) ? 1 : 2;
        }
        if (!AbstractC0820Cr.A0x(b82, drmInitData)) {
            return 2;
        }
        boolean A0I = A6L.A0I(format.A0K);
        if (A0I && format.A0F > 0 && format.A08 > 0) {
            if (C0940Hl.A02 >= 21) {
                int i11 = format.A0F;
                int i12 = format.A08;
                if (A0e[3].charAt(18) == 'r') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0e;
                strArr3[6] = "jeBed4IeUvhTWXlMCWkd0HFF16tIjLHF";
                strArr3[4] = "0qAO2CVMQ14qnLtRtzyjuYZeLu4NiNP0";
                A0I = A6L.A0H(i11, i12, format.A01);
            } else {
                A0I = format.A0F * format.A08 <= C0826Cx.A00();
                if (!A0I) {
                    String str2 = A05(a.aX, 29, 54) + format.A0F + A05(1379, 1, 65) + format.A08 + A05(856, 3, 97) + C0940Hl.A04 + A05(855, 1, 27);
                }
            }
        }
        return (A6L.A03 ? 16 : 8) | (A6L.A06 ? 32 : 0) | (A0I ? 4 : 3);
    }

    static {
        A0D();
        A0f = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C1Y(Context context, InterfaceC0821Cs interfaceC0821Cs, long j10, @Nullable B8<C1288Vh> b82, boolean z10, @Nullable Handler handler, @Nullable I9 i92, int i10) {
        super(2, interfaceC0821Cs, b82, z10);
        this.A0U = j10;
        this.A0T = i10;
        this.A0V = context.getApplicationContext();
        this.A0W = new C0952Hz(this.A0V);
        this.A0X = new I8(handler, i92);
        this.A0Y = A0M();
        this.A0Z = new long[10];
        this.A0a = new long[10];
        this.A0M = b.f7291b;
        this.A0K = b.f7291b;
        this.A0J = b.f7291b;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0F = 1;
        A07();
    }

    public static int A00(C0815Cm c0815Cm, Format format) {
        if (format.A09 != -1) {
            int i10 = 0;
            int i11 = format.A0P.size();
            for (int initializationDataCount = 0; initializationDataCount < i11; initializationDataCount++) {
                int totalInitializationDataSize = format.A0P.get(initializationDataCount).length;
                i10 += totalInitializationDataSize;
            }
            int i12 = format.A09 + i10;
            int initializationDataCount2 = A0e[5].charAt(17);
            if (initializationDataCount2 != 100) {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[6] = "hUEdDcZTQNKRArh2wdU5F4NdxnsUaLHW";
            strArr[4] = "JKTUnCqsCUQLCGuZWmxU63uBYWjDtVyB";
            return i12;
        }
        return A01(c0815Cm, format.A0O, format.A0F, format.A08);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0148, code lost:
    
        if (r4 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0157, code lost:
    
        if (r4 != false) goto L53;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(com.facebook.ads.redexgen.X.C0815Cm r11, java.lang.String r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1Y.A01(com.facebook.ads.redexgen.X.Cm, java.lang.String, int, int):int");
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A03(Format format, C0948Hv c0948Hv, boolean z10, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A05(1094, 4, 60), format.A0O);
        mediaFormat.setInteger(A05(1359, 5, 102), format.A0F);
        mediaFormat.setInteger(A05(971, 6, 97), format.A08);
        C0827Cy.A06(mediaFormat, format.A0P);
        C0827Cy.A03(mediaFormat, A05(954, 10, 120), format.A01);
        C0827Cy.A04(mediaFormat, A05(1180, 16, 77), format.A0B);
        C0827Cy.A02(mediaFormat, format.A0J);
        mediaFormat.setInteger(A05(1079, 9, 16), c0948Hv.A02);
        mediaFormat.setInteger(A05(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, 10, 79), c0948Hv.A00);
        C0827Cy.A04(mediaFormat, A05(1065, 14, 77), c0948Hv.A01);
        if (C0940Hl.A02 >= 23) {
            mediaFormat.setInteger(A05(1153, 8, 16), 0);
        }
        if (z10) {
            mediaFormat.setInteger(A05(875, 8, 67), 0);
        }
        if (i10 != 0) {
            A0K(mediaFormat, i10);
        }
        return mediaFormat;
    }

    private final C0948Hv A04(C0815Cm c0815Cm, Format format, Format[] formatArr) throws C0824Cv {
        int i10 = format.A0F;
        int i11 = format.A08;
        int A00 = A00(c0815Cm, format);
        int maxHeight = formatArr.length;
        if (maxHeight == 1) {
            return new C0948Hv(i10, i11, A00);
        }
        boolean z10 = false;
        for (Format format2 : formatArr) {
            if (A0V(c0815Cm.A03, format, format2)) {
                z10 |= format2.A0F == -1 || format2.A08 == -1;
                i10 = Math.max(i10, format2.A0F);
                i11 = Math.max(i11, format2.A08);
                A00 = Math.max(A00, A00(c0815Cm, format2));
            }
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A05(683, 43, 5));
            sb2.append(i10);
            String A05 = A05(1379, 1, 65);
            sb2.append(A05);
            sb2.append(i11);
            String sb3 = sb2.toString();
            String A052 = A05(522, 23, 23);
            Log.w(A052, sb3);
            Point A02 = A02(c0815Cm, format);
            if (A02 != null) {
                i10 = Math.max(i10, A02.x);
                i11 = Math.max(i11, A02.y);
                A00 = Math.max(A00, A01(c0815Cm, format.A0O, i10, i11));
                Log.w(A052, A05(164, 34, 7) + i10 + A05 + i11);
            }
        }
        return new C0948Hv(i10, i11, A00);
    }

    private void A06() {
        MediaCodec A1C;
        this.A0R = false;
        if (C0940Hl.A02 >= 23 && this.A0S && (A1C = A1C()) != null) {
            this.A00 = new C0949Hw(this, A1C);
        }
    }

    private void A07() {
        this.A0E = -1;
        this.A0C = -1;
        this.A03 = -1.0f;
        this.A0D = -1;
    }

    private void A08() {
        if (this.A09 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long now = this.A0H;
            long elapsedMs = elapsedRealtime - now;
            this.A0X.A02(this.A09, elapsedMs);
            this.A09 = 0;
            this.A0H = elapsedRealtime;
        }
    }

    private void A09() {
        if (this.A08 == -1 && this.A06 == -1) {
            return;
        }
        if (this.A0E != this.A08 || this.A0C != this.A06 || this.A0D != this.A07 || this.A03 != this.A01) {
            I8 i82 = this.A0X;
            String[] strArr = A0e;
            if (strArr[6].charAt(27) == strArr[4].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[2] = "RTvZ5FDjzwdLT6J2ljezTJit2l4QBCCR";
            strArr2[0] = "8XoC7GroR317PXdtPjLLz1J1MgtvBrxC";
            i82.A01(this.A08, this.A06, this.A07, this.A01);
            this.A0E = this.A08;
            this.A0C = this.A06;
            this.A0D = this.A07;
            this.A03 = this.A01;
        }
    }

    private void A0A() {
        if (this.A0R) {
            this.A0X.A03(this.A0O);
        }
    }

    private void A0B() {
        if (this.A0E != -1 || this.A0C != -1) {
            this.A0X.A01(this.A0E, this.A0C, this.A0D, this.A03);
        }
    }

    private void A0C() {
        long j10;
        if (this.A0U > 0) {
            j10 = SystemClock.elapsedRealtime() + this.A0U;
        } else {
            j10 = b.f7291b;
        }
        this.A0J = j10;
    }

    private final void A0E(int i10) {
        super.A0U.A02 += i10;
        this.A09 += i10;
        this.A05 += i10;
        super.A0U.A05 = Math.max(this.A05, super.A0U.A05);
        if (this.A09 >= this.A0T) {
            A08();
        }
    }

    private final void A0F(MediaCodec mediaCodec, int i10, long j10) {
        C0937Hi.A02(A05(930, 15, 73));
        mediaCodec.releaseOutputBuffer(i10, false);
        C0937Hi.A00();
        A0E(1);
    }

    private final void A0G(MediaCodec mediaCodec, int i10, long j10) {
        A09();
        C0937Hi.A02(A05(1161, 19, 55));
        mediaCodec.releaseOutputBuffer(i10, true);
        C0937Hi.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1R();
    }

    private final void A0H(MediaCodec mediaCodec, int i10, long j10) {
        C0937Hi.A02(A05(IronSourceConstants.RV_INSTANCE_READY_FALSE, 15, 25));
        mediaCodec.releaseOutputBuffer(i10, false);
        C0937Hi.A00();
        super.A0U.A08++;
    }

    @TargetApi(21)
    private final void A0I(MediaCodec mediaCodec, int i10, long j10, long j11) {
        A09();
        C0937Hi.A02(A05(1161, 19, 55));
        mediaCodec.releaseOutputBuffer(i10, j11);
        C0937Hi.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1R();
    }

    @TargetApi(23)
    public static void A0J(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    public static void A0K(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled(A05(1241, 17, 108), true);
        mediaFormat.setInteger(A05(859, 16, 95), i10);
    }

    private void A0L(Surface surface) throws AnonymousClass98 {
        if (surface == null) {
            if (this.A0N != null) {
                surface = this.A0N;
            } else {
                C0815Cm A1D = A1D();
                if (A1D != null && A0T(A1D)) {
                    this.A0N = DummySurface.A01(this.A0V, A1D.A05);
                    surface = this.A0N;
                }
            }
        }
        if (this.A0O != surface) {
            this.A0O = surface;
            int A7U = A7U();
            if (A7U == 1 || A7U == 2) {
                MediaCodec A1C = A1C();
                if (C0940Hl.A02 >= 23 && A1C != null && surface != null && !this.A0Q) {
                    A0J(A1C, surface);
                } else {
                    A1G();
                    A1I();
                }
            }
            if (surface != null && surface != this.A0N) {
                A0B();
                A06();
                if (A7U == 2) {
                    A0C();
                    return;
                }
                return;
            }
            A07();
            String[] strArr = A0e;
            String str = strArr[2];
            String str2 = strArr[0];
            int charAt = str.charAt(13);
            int state = str2.charAt(13);
            if (charAt == state) {
                throw new RuntimeException();
            }
            A0e[3] = "3kfdRjkwPvYxx8JzUoiB9hf8dQ33bpul";
            A06();
            return;
        }
        if (surface == null || surface == this.A0N) {
            return;
        }
        A0B();
        A0A();
    }

    public static boolean A0M() {
        if (C0940Hl.A02 <= 22) {
            if (A05(948, 6, 4).equals(C0940Hl.A03)) {
                if (A05(545, 6, 122).equals(C0940Hl.A05)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0N(long j10) {
        return j10 < -30000;
    }

    public static boolean A0O(long j10) {
        return j10 < -500000;
    }

    private final boolean A0P(long j10, long j11) {
        return A0O(j10);
    }

    private final boolean A0Q(long j10, long j11) {
        return A0N(j10);
    }

    private final boolean A0R(long j10, long j11) {
        return A0N(j10) && j11 > 100000;
    }

    private final boolean A0S(MediaCodec mediaCodec, int i10, long j10, long j11) throws AnonymousClass98 {
        int A0z = A0z(j11);
        if (A0z == 0) {
            return false;
        }
        C0771Ai c0771Ai = super.A0U;
        int droppedSourceBufferCount = c0771Ai.A03;
        c0771Ai.A03 = droppedSourceBufferCount + 1;
        int droppedSourceBufferCount2 = this.A04;
        A0E(droppedSourceBufferCount2 + A0z);
        A1F();
        return true;
    }

    private boolean A0T(C0815Cm c0815Cm) {
        if (C0940Hl.A02 >= 23 && !this.A0S) {
            String str = c0815Cm.A02;
            if (A0e[5].charAt(17) != 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[6] = "kyWyTgTuit8kBu9eYgHiJLOeDtaawSzk";
            strArr[4] = "zep7axp9udbgCrK2JAqRjKsc1O8PK6En";
            if (!A0U(str) && (!c0815Cm.A05 || DummySurface.A05(this.A0V))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0935 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0U(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 3102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1Y.A0U(java.lang.String):boolean");
    }

    public static boolean A0V(boolean z10, Format format, Format format2) {
        if (format.A0O.equals(format2.A0O) && format.A0B == format2.A0B && (z10 || (format.A0F == format2.A0F && format.A08 == format2.A08))) {
            ColorInfo colorInfo = format.A0J;
            ColorInfo colorInfo2 = format2.A0J;
            String[] strArr = A0e;
            if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            A0e[5] = "SCavqIZfy9E7QicA0dHTliXfXCWB3KSN";
            if (C0940Hl.A0g(colorInfo, colorInfo2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A12() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0M = b.f7291b;
        this.A0K = b.f7291b;
        this.A0A = 0;
        A07();
        A06();
        this.A0W.A08();
        this.A00 = null;
        this.A0S = false;
        try {
            super.A12();
        } finally {
            super.A0U.A00();
            this.A0X.A05(super.A0U);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A13() {
        super.A13();
        this.A09 = 0;
        this.A0H = SystemClock.elapsedRealtime();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A14() {
        this.A0J = b.f7291b;
        A08();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A15(long j10, boolean z10) throws AnonymousClass98 {
        super.A15(j10, z10);
        A06();
        this.A0I = b.f7291b;
        this.A05 = 0;
        this.A0K = b.f7291b;
        int i10 = this.A0A;
        if (i10 != 0) {
            long[] jArr = this.A0Z;
            String[] strArr = A0e;
            if (strArr[6].charAt(27) == strArr[4].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[7] = "7MW3dnHmZ";
            strArr2[1] = "zsetFM6ej";
            this.A0M = jArr[i10 - 1];
            this.A0A = 0;
        }
        if (z10) {
            A0C();
        } else {
            this.A0J = b.f7291b;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A16(boolean z10) throws AnonymousClass98 {
        super.A16(z10);
        this.A0G = A11().A00;
        this.A0S = this.A0G != 0;
        this.A0X.A06(super.A0U);
        this.A0W.A09();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A17(Format[] formatArr, long j10) throws AnonymousClass98 {
        if (this.A0M == b.f7291b) {
            this.A0M = j10;
        } else {
            int i10 = this.A0A;
            String[] strArr = A0e;
            if (strArr[6].charAt(27) == strArr[4].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[2] = "hJEWxkqVwddaEGRwsPF9GJysu0azMoJ9";
            strArr2[0] = "zdhmDyX7lfpv7BLRFINwBKdWRGj92JIy";
            if (i10 == this.A0Z.length) {
                Log.w(A05(522, 23, 23), A05(776, 45, 106) + this.A0Z[this.A0A - 1]);
            } else {
                this.A0A = i10 + 1;
            }
            long[] jArr = this.A0Z;
            int i11 = this.A0A;
            jArr[i11 - 1] = j10;
            this.A0a[i11 - 1] = this.A0K;
        }
        super.A17(formatArr, j10);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final int A1A(MediaCodec mediaCodec, C0815Cm c0815Cm, Format format, Format format2) {
        if (A0V(c0815Cm.A03, format, format2) && format2.A0F <= this.A0P.A02 && format2.A08 <= this.A0P.A00 && A00(c0815Cm, format2) <= this.A0P.A01) {
            if (format.A0K(format2)) {
                return 1;
            }
            return 3;
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    @CallSuper
    public final void A1F() throws AnonymousClass98 {
        super.A1F();
        this.A04 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    @CallSuper
    public final void A1G() {
        try {
            super.A1G();
        } finally {
            this.A04 = 0;
            Surface surface = this.A0N;
            if (surface != null) {
                if (this.A0O == surface) {
                    this.A0O = null;
                }
                this.A0N.release();
                this.A0N = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    @CallSuper
    public final void A1J(long j10) {
        this.A04--;
        while (true) {
            int i10 = this.A0A;
            if (i10 != 0 && j10 >= this.A0a[0]) {
                long[] jArr = this.A0Z;
                this.A0M = jArr[0];
                this.A0A = i10 - 1;
                System.arraycopy(jArr, 1, jArr, 0, this.A0A);
                long[] jArr2 = this.A0a;
                System.arraycopy(jArr2, 1, jArr2, 0, this.A0A);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    @Override // com.facebook.ads.redexgen.X.C3G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1K(android.media.MediaCodec r10, android.media.MediaFormat r11) {
        /*
            r9 = this;
            r2 = 903(0x387, float:1.265E-42)
            r1 = 10
            r0 = 92
            java.lang.String r7 = A05(r2, r1, r0)
            boolean r3 = r11.containsKey(r7)
            r2 = 913(0x391, float:1.28E-42)
            r1 = 8
            r0 = 81
            java.lang.String r4 = A05(r2, r1, r0)
            r2 = 883(0x373, float:1.237E-42)
            r1 = 11
            r0 = 6
            java.lang.String r5 = A05(r2, r1, r0)
            r2 = 894(0x37e, float:1.253E-42)
            r1 = 9
            r0 = 68
            java.lang.String r6 = A05(r2, r1, r0)
            r8 = 1
            if (r3 == 0) goto L63
            boolean r0 = r11.containsKey(r6)
            if (r0 == 0) goto L63
            boolean r3 = r11.containsKey(r5)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1Y.A0e
            r0 = 5
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 100
            if (r1 == r0) goto L4d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1Y.A0e
            java.lang.String r1 = "iz6RCOhSh"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "D9RR8bf8p"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L63
            boolean r0 = r11.containsKey(r4)
            if (r0 == 0) goto L63
            r3 = 1
            goto L64
        L63:
            r3 = 0
        L64:
            if (r3 == 0) goto Lbc
            int r1 = r11.getInteger(r7)
            int r0 = r11.getInteger(r6)
            int r1 = r1 - r0
            int r1 = r1 + r8
        L70:
            r9.A08 = r1
            if (r3 == 0) goto Lae
            int r1 = r11.getInteger(r5)
            int r0 = r11.getInteger(r4)
            int r1 = r1 - r0
            int r1 = r1 + r8
        L7e:
            r9.A06 = r1
            float r0 = r9.A02
            r9.A01 = r0
            int r1 = com.facebook.ads.redexgen.X.C0940Hl.A02
            r0 = 21
            if (r1 < r0) goto La9
            int r1 = r9.A0B
            r0 = 90
            if (r1 == r0) goto L94
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto La3
        L94:
            int r1 = r9.A08
            int r0 = r9.A06
            r9.A08 = r0
            r9.A06 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9.A01
            float r1 = r1 / r0
            r9.A01 = r1
        La3:
            int r0 = r9.A0F
            r10.setVideoScalingMode(r0)
            return
        La9:
            int r0 = r9.A0B
            r9.A07 = r0
            goto La3
        Lae:
            r2 = 971(0x3cb, float:1.36E-42)
            r1 = 6
            r0 = 97
            java.lang.String r0 = A05(r2, r1, r0)
            int r1 = r11.getInteger(r0)
            goto L7e
        Lbc:
            r2 = 1359(0x54f, float:1.904E-42)
            r1 = 5
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r0 = A05(r2, r1, r0)
            int r1 = r11.getInteger(r0)
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1Y.A1K(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1L(Format format) throws AnonymousClass98 {
        super.A1L(format);
        this.A0X.A04(format);
        this.A02 = format.A02;
        this.A0B = format.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    @CallSuper
    public final void A1M(C1294Vn c1294Vn) {
        this.A04++;
        this.A0K = Math.max(c1294Vn.A00, this.A0K);
        if (C0940Hl.A02 < 23 && this.A0S) {
            A1R();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1N(C0815Cm c0815Cm, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws C0824Cv {
        this.A0P = A04(c0815Cm, format, A19());
        MediaFormat A03 = A03(format, this.A0P, this.A0Y, this.A0G);
        if (this.A0O == null) {
            H6.A04(A0T(c0815Cm));
            Surface surface = this.A0N;
            String[] strArr = A0e;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[6] = "HUdK6ej9G5uy2eoW8HL148MSYBaQJURn";
            strArr2[4] = "oyZJZuVgjRVeIXKioVrHS7OTGib3SAbN";
            if (surface == null) {
                this.A0N = DummySurface.A01(this.A0V, c0815Cm.A05);
            }
            this.A0O = this.A0N;
        }
        mediaCodec.configure(A03, this.A0O, mediaCrypto, 0);
        if (C0940Hl.A02 >= 23 && this.A0S) {
            this.A00 = new C0949Hw(this, mediaCodec);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1O(String str, long j10, long j11) {
        this.A0X.A07(str, j10, j11);
        this.A0Q = A0U(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (A0R(r8, r19 - r4) != false) goto L28;
     */
    @Override // com.facebook.ads.redexgen.X.C3G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1P(long r32, long r34, android.media.MediaCodec r36, java.nio.ByteBuffer r37, int r38, int r39, long r40, boolean r42) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1Y.A1P(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final boolean A1Q(C0815Cm c0815Cm) {
        return this.A0O != null || A0T(c0815Cm);
    }

    public final void A1R() {
        if (!this.A0R) {
            this.A0R = true;
            this.A0X.A03(this.A0O);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr, com.facebook.ads.redexgen.X.InterfaceC07419d
    public final void A7x(int i10, Object obj) throws AnonymousClass98 {
        if (i10 == 1) {
            String[] strArr = A0e;
            if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            A0e[3] = "M4hKmbj6QiDhWM6pD0tSNqk85KgZRxnW";
            A0L((Surface) obj);
            return;
        }
        if (i10 == 4) {
            this.A0F = ((Integer) obj).intValue();
            MediaCodec A1C = A1C();
            if (A1C == null) {
                return;
            }
            A1C.setVideoScalingMode(this.A0F);
            return;
        }
        super.A7x(i10, obj);
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.W1
    public final boolean A8Z() {
        Surface surface;
        if (!super.A8Z() || (!this.A0R && (((surface = this.A0N) == null || this.A0O != surface) && A1C() != null && !this.A0S))) {
            if (this.A0J == b.f7291b) {
                return false;
            }
            if (SystemClock.elapsedRealtime() < this.A0J) {
                return true;
            }
            this.A0J = b.f7291b;
            return false;
        }
        this.A0J = b.f7291b;
        if (A0e[5].charAt(17) != 'd') {
            throw new RuntimeException();
        }
        String[] strArr = A0e;
        strArr[7] = "3PsRT4XFV";
        strArr[1] = "WWSFTmL3V";
        return true;
    }
}
