package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.m;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame;
import com.huawei.hms.ads.nativead.DetailedCreativeType;
import com.huawei.openalliance.ad.constant.ag;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class C2 {
    public static byte[] A00;
    public static String[] A01 = {"JLqiHSvdfqtEv8b1RfsccUDTgBsY5P7e", "pNltYe0DhFIpitgSIEi0zi0z7LgjRjg3", "QIjIEwCvhgb560p1OMiECGtkVXCQy3er", "KHs9hye8jiwr48prwbb7IMXWCnSDCWiY", "yyBpVHi0j1NoAOinFQPWg7opFcoOFj1Z", "zrgyUuiGmn5ero9isYCfajoNViVl9QPH", "whRWIRw337nw8NXc5gXNsvGgchD", "lhywLkOHL1xCVlOZTw9pXaD5EeZGan4i"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final String[] A0V;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A00 = new byte[]{-34, -34, -34, -34, -21, -30, -63, 4, 2, 17, 6, Ascii.CR, Ascii.CR, 2, 44, 61, 63, -55, -21, -15, -20, 6, 40, 46, 41, -27, Ascii.SI, 38, 63, 63, Ascii.SO, 48, 54, 49, -19, Ascii.GS, 66, 59, 56, 37, 71, 83, 89, 87, 88, 77, 71, 19, 62, 70, 55, 68, 64, 36, 65, 53, 61, -55, -12, -4, -19, -6, -10, -23, -4, -15, -2, -19, 2, 46, 35, 42, 38, 47, 53, Ascii.EM, 70, 65, 69, 61, -9, 44, Ascii.ETB, 36, 42, Ascii.GS, Ascii.ETB, 40, Ascii.SUB, Ascii.ESC, -54, -23, -12, -12, -23, -20, -12, 19, 37, 37, 33, 68, 64, 83, -9, Ascii.SUB, Ascii.ETB, 36, Ascii.ETB, -4, 35, 33, -38, -4, Ascii.ESC, 40, Ascii.RS, -15, Ascii.ESC, Ascii.DLE, Ascii.DC2, Ascii.SUB, -49, -4, Ascii.DC4, 35, Ascii.DLE, Ascii.ESC, -19, Ascii.ETB, 32, Ascii.DLE, Ascii.DC2, Ascii.GS, Ascii.FF, Ascii.RS, Ascii.RS, 56, 98, 107, 91, 105, 39, 84, 84, 89, 94, 5, 39, 70, 88, 88, -60, -12, -21, -10, -46, -15, -14, -25, 5, 6, 5, Ascii.SYN, 9, Ascii.CAN, -33, 1, 8, Ascii.DLE, 5, -1, 44, 81, 74, 86, 75, 78, 91, 9, 54, 94, 92, 82, 76, -35, 2, -5, 8, Ascii.CR, 9, 8, Ascii.NAK, 58, 65, 68, 71, 69, 56, 93, 103, 94, 104, 105, 94, 86, 99, Ascii.NAK, 60, 86, 99, 92, 104, 105, 86, Ascii.NAK, 71, 86, 101, Ascii.SI, 52, 62, 53, 63, 64, 53, 45, 58, -20, Ascii.RS, 45, 60, -51, -14, -4, -13, -3, -2, -13, -21, -8, -86, -36, -7, -19, -11, Ascii.EM, 66, 55, 73, 73, 63, 57, -10, 40, 69, 57, 65, Ascii.ETB, 64, 53, 71, 71, 61, 55, 53, 64, 52, 93, 102, 83, 43, 84, 93, 74, Ascii.NAK, 48, 87, 93, 91, 77, -60, -16, -18, -26, -27, -6, -52, -8, -9, -3, -18, -10, -7, -8, -5, -22, -5, 2, -87, -52, -15, -5, -14, -4, -3, -14, -22, -9, 38, 82, 88, 81, 87, 85, 92, 42, 89, 86, 90, 90, 86, 93, 76, 89, 53, 103, 94, 102, 9, 38, 51, 40, 42, Ascii.VT, 40, 53, 42, 44, -25, Ascii.SI, 40, 51, 51, -52, -23, -6, -13, -1, -23, -2, -19, -29, 4, 0, 19, 7, -65, -20, 4, 19, 0, Ascii.VT, -20, 17, Ascii.ESC, Ascii.VT, Ascii.ETB, 1, 47, 34, Ascii.RS, 42, 0, 46, 49, 41, -36, -30, -36, -2, Ascii.GS, 47, 47, -41, 5, 8, 0, -77, -26, 2, -1, 2, 34, 83, 67, 82, -9, 19, 37, 43, -46, -2, Ascii.ESC, 37, 38, Ascii.ETB, 32, Ascii.ESC, 32, Ascii.EM, -38, 1, -6, -8, 9, 7, 4, 3, -2, -8, -40, 7, -5, 1, -4, -10, 0, 48, 45, 42, -24, 3, 42, 48, 46, 32, Ascii.SUB, 74, 71, 68, 2, 41, 58, 56, 61, 67, 68, 5, 53, 50, 47, 36, 33, 46, 35, 37, -45, -18, -10, -7, -14, -15, -83, 1, -4, -83, -3, -18, -1, 0, -14, -83, -16, -4, -6, -6, -14, -5, 1, -83, -18, 1, 1, -1, -10, -17, 2, 1, -14, -57, -83, 41, 68, 76, 79, 72, 71, 3, 87, 82, 3, 83, 68, 85, 86, 72, 3, 70, 82, 89, 72, 85, 3, 68, 85, 87, 3, 68, 87, 87, 85, 76, 69, 88, 87, 72, -16, Ascii.VT, 19, Ascii.SYN, Ascii.SI, Ascii.SO, -54, Ascii.RS, Ascii.EM, -54, Ascii.SUB, Ascii.VT, Ascii.FS, Ascii.GS, Ascii.SI, -54, 19, Ascii.CAN, Ascii.SO, Ascii.SI, 34, -39, Ascii.CR, Ascii.EM, Ascii.US, Ascii.CAN, Ascii.RS, -54, Ascii.VT, Ascii.RS, Ascii.RS, Ascii.FS, 19, Ascii.FF, Ascii.US, Ascii.RS, Ascii.SI, -28, -54, 32, 59, 67, 70, 63, 62, -6, 78, 73, -6, 74, 59, 76, 77, 63, -6, 77, 78, 59, 72, 62, 59, 76, 62, -6, 65, 63, 72, 76, 63, -6, 61, 73, 62, 63, 50, 77, 85, 88, 81, 80, Ascii.FF, 96, 91, Ascii.FF, 92, 77, 94, 95, 81, Ascii.FF, 96, 81, 100, 96, Ascii.FF, 77, 96, 96, 94, 85, 78, 97, 96, 81, 38, Ascii.FF, 6, 33, 41, 44, 37, 36, -32, 52, 47, -32, 48, 33, 50, 51, 37, -32, 53, 41, 46, 52, -8, -32, 33, 52, 52, 50, 41, 34, 53, 52, 37, -32, 54, 33, 44, 53, 37, 19, 46, 54, 57, 50, 49, -19, 65, 60, -19, 61, 46, 63, 64, 50, -19, 66, 54, 59, 65, 5, -19, 46, 65, 65, 63, 54, 47, 66, 65, 50, 7, -19, -64, -37, -19, -18, -102, -64, -17, -19, -29, -23, -24, -38, 3, 0, -1, Ascii.CAN, 65, 62, 61, -1, 36, 65, 53, 61, -33, 8, 5, 4, 5, 8, Ascii.VT, -2, -28, Ascii.DLE, 3, 3, 17, Ascii.DC2, Ascii.ETB, 10, 3, 41, 88, 81, 78, Ascii.ESC, 74, 72, 62, 68, 67, 49, 75, 87, 79, Ascii.SYN, 48, 61, 54, 66, 67, 48, -6, 34, Ascii.DC4, -27, Ascii.CR, 17, Ascii.SO, 3, 10, -35, 5, 10, -2, -1, -7, Ascii.FS, 68, 73, 61, 62, 56, -11, 39, 68, 56, 64, -63, -20, -17, -24, -31, -33, 63, 88, 105, 91, Ascii.ETB, 73, 102, 90, 98, Ascii.ESC, 52, 69, 55, 54, 66, 69, 56, 41, 70, 66, 87, 90, 1, 46, 70, 85, 66, 77, 63, 96, 103, 36, 63, 102, 103, -49, -10, -4, -6, -20, -19, Ascii.SUB, Ascii.DC2, Ascii.DC4, Ascii.SUB, Ascii.ETB, Ascii.EM, 36, 37, Ascii.RS, Ascii.NAK, 35, 17, Ascii.DC4, 38, Ascii.EM, 35, Ascii.US, 34, 41, Ascii.RS, 41, 42, 35, Ascii.SUB, 40, Ascii.FS, Ascii.SYN, 37, 33, Ascii.SUB, 40, 40, -6, Ascii.US, Ascii.NAK, Ascii.SUB, Ascii.SYN, Ascii.US, 68, 58, 75, 73, 74, 72, 63, 55, 66, Ascii.SUB, 63, 68, 69, 67, 70, 62, 54, 63, 69, 50, 61, -55, -18, -13, -12, -14, -11, -19, -27, -18, -12, -31, -20, -96, -48, -17, -16, 35, 72, 77, 78, 76, 79, 71, 63, 72, 78, 59, 70, -6, 44, 73, 61, 69, Ascii.FS, 51, 76, 76, 63, 86, 111, 111, 32, 59, 106, 99, 96, 59, 97, 96, 97, -16, Ascii.ESC, Ascii.DC4, Ascii.CR, Ascii.DC2, Ascii.VT, 37, 58, 77, 66, 71, -9, Ascii.SUB, -40, -15, Ascii.DC4, -23, 1, 0, 5, Ascii.DLE, -3, Ascii.DLE, 5, Ascii.DC2, 1, -14, 10, Ascii.ETB, 10, 19, Ascii.FF, Ascii.SUB, 10, -55, -31, -16, -35, -32, -35, -16, -35, -47, -16, -27, -24, 63, 87, 102, 83, 94, -32, 8, 
        6, -4, -10, -12, -1, 8, Ascii.ESC, 46, 35, 41, 40, Ascii.ESC, 38, -38, 0, 41, 38, 37, 41, 60, 79, 68, 81, 64, -5, Ascii.FS, 72, 64, 77, 68, 62, 60, 73, -6, 17, 19, 17, Ascii.RS, Ascii.FS, 33, Ascii.SUB, Ascii.ETB, Ascii.DLE, 39, 57, -30, 3, 41, 39, 3, Ascii.SUB, 44, -43, Ascii.FF, Ascii.SYN, 43, Ascii.SUB, 64, 97, 91, 101, 87, -37, -8, -16, -11, -15, -1, 49, 82, 71, 84, 67, Ascii.CR, 50, 38, 35, 48, Ascii.DC4, 51, 48, 47, 37, Ascii.GS, 60, 57, 64, 56, -19, Ascii.GS, 66, 59, 56, -45, -14, -13, -25, 6, 7, -60, -35, 6, 3, 2, Ascii.GS, 60, 61, -4, 19, 66, 59, 56, Ascii.DC2, 49, 52, 48, -30, 9, 52, 49, 49, 56, 39, -22, 9, 17, -1, Ascii.FF, -70, -36, -5, 6, 6, -5, -2, Ascii.DC4, 54, 37, 50, 47, 55, 47, 81, 72, 76, 84, 82, -46, -12, -15, -23, -12, -25, -11, -11, -21, -8, -25, -94, -44, -15, -27, -19, 36, 71, 77, 55, 60, 53, 56, 57, 64, 61, 55, -54, -19, -13, -35, -30, -33, -34, -33, -26, -29, -35, -102, -52, -23, -35, -27, -27, 10, 3, 0, -15, Ascii.SYN, Ascii.SI, Ascii.FF, -63, -13, Ascii.DLE, 4, Ascii.FF, -10, -54, -26, 55, 70, 85, 39, 54, 75, 58, -17, 2, 4, 4, -2, 2, 6, Ascii.EM, 40, 38, 35, 66, 85, 102, 89, 102, 81, 92, Ascii.ESC, 49, 66, 61, 49, 54, 50, 44, -23, Ascii.FS, 56, 62, 53, 32, 61, 49, 57, 54, 83, 71, 79, 4, 10, 4, 54, 83, 80, 80, 62, 76, 87, 94, 76, -23, -9, 3, -8, -9, 66, 80, 99, 88, 97, 84, -35, -14, -7, 1, -2, -1, -8, -17, -3, Ascii.SUB, 50, 40, -49, -25, -27, -20, -20, -31, -32, -100, -15, -22, -25, -22, -21, -13, -22, -100, -23, -31, -16, -35, -32, -35, -16, -35, -100, -31, -22, -16, -18, -11, -74, -100, 4, Ascii.GS, 32, 40, -47, -5, Ascii.DC2, Ascii.RS, 34, 59, 62, 70, -17, 33, 62, 50, 58, 61, 89, 88, 75, 94, 75, Ascii.ESC, 55, 61, 52, Ascii.SUB, 54, 60, 53, 43, -25, 10, 51, 48, 55, 10, 38, 44, 37, Ascii.ESC, 43, 41, Ascii.CAN, Ascii.SUB, 34, -25, 3, 9, 8, -4, -7, 6, 2, -76, -26, 3, -9, -1, -33, -4, -19, -17, -15, 36, 65, 54, 54, 52, 57, -29, 7, -7, -2, -9, 60, 98, 86, 89, 81, 88, 87, 82, 76, 9, 59, 88, 76, 84, Ascii.DC2, 56, 44, 47, 39, 46, 45, 56, -41, -3, -14, -8, -20, -12, -13, -12, 0, -19, -8, -18, -36, -54, -40, -43, 33, Ascii.DLE, Ascii.SUB, Ascii.GS, 54, 37, 49, 47, 70, 53, 65, 64, 39, Ascii.ETB, 37, Ascii.SYN, 6, -5, 6, -29, Ascii.DLE, 5, Ascii.DLE, -18, -14, -18, -29, -49, 5, 1, -10, -29, 69, 65, 64, 68, -44, -46, -61, -53, -45, -46, -50, -79, -37, -38, -42, -56, 51, 50, 46, 34, 70, 69, 65, 66, -34, -35, -39, -34, -4, -5, -5, -19, Ascii.DC2, Ascii.DC4, 17, 6, Ascii.CR, Ascii.NAK, Ascii.ESC, Ascii.GS, Ascii.SUB, Ascii.SI, Ascii.SYN, Ascii.RS, Ascii.SUB, Ascii.SYN, Ascii.EM, Ascii.ESC, -40, -27, -14, -21, -13, 36, 53, 51, 56, 62, 63, 17, 34, 32, 37, 43, 44, -22, 6, 43, 33, 50, 48, 49, 47, 38, Ascii.RS, 41, -2, Ascii.SI, Ascii.FS, Ascii.FS, Ascii.EM, Ascii.FS, 62, 82, 92, 75, 93, 82, 10, 55, 79, 94, 75, 86, 67, 94, 95, Ascii.SI, 35, Ascii.US, -17, Ascii.CR, -4, 4, 7, 0, Ascii.CR, 36, 66, 49, 62, 51, 53, Ascii.ESC, 57, 48, 41, 40, 51, 39, 69, 60, 67, 0, Ascii.ESC, 66, 67, -23, -25, -32, -24, 75, 100, 104, 91, 89, 101, 93, 100, 95, 112, 91, 90, Ascii.SYN, 89, 101, 108, 91, 104, Ascii.SYN, 87, 104, 106, Ascii.SYN, 92, 98, 87, 93, 105, 48, Ascii.SYN, 76, 101, 89, 87, 98, -14, -46, -29, -27, 68, 79, 69, Ascii.GS, 39, 46, 0, Ascii.FF, 10, 55, 67, 74, 70, -36, -23, -30, -27, 58, 55, 79, -32, -27, -17, -25, 17, Ascii.SI, Ascii.CAN, 72, 79, 83, 70, -11, 0, -2, 19, Ascii.ETB, Ascii.VT, 17, Ascii.SI, -39, Ascii.DC4, Ascii.SUB, Ascii.SI, 17, 62, 66, 54, 60, 58, 4, 69, 67, 60, 76, 89, 82, 7, -6, 6, Ascii.US, Ascii.SYN, Ascii.DLE, Ascii.US, 32, 34, Ascii.FS, Ascii.NAK, 46, 42, Ascii.FS, Ascii.FS, 67, 63, 49, 60, -4, -8, -22, -5, 83, 79, 67, 79, 86, 82, 81, 80, Ascii.FF, 8, Ascii.FF, 7, 60, 53, 56, 55, 85, 80, 80, 32, Ascii.RS, Ascii.ETB, Ascii.CR, Ascii.VT, 4, 7, 74, 76, 73, 62, -15, -22, -32, 57, 52, 54};
    }

    static {
        A0A();
        A0A = C0940Hl.A08(A09(1691, 3, 32));
        A0B = C0940Hl.A08(A09(1733, 3, 51));
        A04 = C0940Hl.A08(A09(1638, 3, 65));
        A0C = C0940Hl.A08(A09(1652, 3, 93));
        A03 = C0940Hl.A08(A09(14, 3, 114));
        A07 = C0940Hl.A08(A09(1730, 3, 104));
        A02 = C0940Hl.A08(A09(1635, 3, 106));
        A05 = C0940Hl.A08(A09(1641, 3, 36));
        A06 = C0940Hl.A08(A09(1747, 3, 73));
        A09 = C0940Hl.A08(A09(1688, 3, 103));
        A08 = C0940Hl.A08(A09(1659, 3, 49));
        A0F = C0940Hl.A08(A09(1644, 4, 91));
        A0I = C0940Hl.A08(A09(1662, 4, 104));
        A0J = C0940Hl.A08(A09(1666, 3, 21));
        A0G = C0940Hl.A08(A09(1655, 4, 3));
        A0S = C0940Hl.A08(A09(1736, 4, 32));
        A0R = C0940Hl.A08(A09(1726, 4, 79));
        A0E = C0940Hl.A08(A09(1648, 4, 0));
        A0D = C0940Hl.A08(A09(1631, 4, 24));
        A0Q = C0940Hl.A08(A09(1718, 4, 106));
        A0M = C0940Hl.A08(A09(1706, 4, 87));
        A0O = C0940Hl.A08(A09(1710, 4, 16));
        A0N = C0940Hl.A08(A09(1702, 4, 66));
        A0P = C0940Hl.A08(A09(1714, 4, 103));
        A0L = C0940Hl.A08(A09(1698, 4, 53));
        A0H = C0940Hl.A08(A09(1694, 4, 54));
        A0U = C0940Hl.A08(A09(1722, 4, 32));
        A0T = C0940Hl.A08(A09(1740, 4, 93));
        A0K = C0940Hl.A08(A09(0, 4, 56));
        A0V = new String[]{A09(137, 5, 125), A09(246, 12, 93), A09(309, 7, 106), A09(329, 5, 76), A09(363, 5, 47), A09(744, 4, 106), A09(791, 6, 1), A09(825, 7, 126), A09(930, 4, 89), A09(993, 5, 121), A09(IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED, 7, 73), A09(IronSourceError.ERROR_DO_BN_LOAD_MISSING_ACTIVITY, 6, 19), A09(1073, 5, 69), A09(1093, 3, 10), A09(IronSourceConstants.RV_INSTANCE_CLOSED, 3, 43), A09(IronSourceConstants.RV_INSTANCE_VISIBLE, 3, 108), A09(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, 6, 36), A09(1244, 4, 85), A09(1518, 6, 87), A09(875, 10, 93), A09(57, 11, 15), A09(1284, 3, 78), A09(352, 11, 38), A09(1135, 6, 75), A09(1356, 10, 62), A09(437, 11, 92), A09(68, 7, 72), A09(1584, 8, 90), A09(1626, 5, 125), A09(934, 9, 124), A09(748, 6, 92), A09(1572, 6, 87), A09(258, 9, 91), A09(885, 12, 88), A09(17, 4, 15), A09(832, 5, 14), A09(754, 4, 113), A09(1346, 10, 78), A09(768, 6, 37), A09(IronSourceError.ERROR_RV_EXPIRED_ADS, 5, 121), A09(47, 10, 89), A09(96, 4, 57), A09(1342, 4, 79), A09(1190, 4, 28), A09(1379, 5, 19), A09(963, 10, 35), A09(897, 16, 7), A09(DetailedCreativeType.SHORT_TEXT, 17, 97), A09(ag.o, 6, 26), A09(774, 6, 29), A09(344, 8, 15), A09(1524, 17, 68), A09(411, 10, 28), A09(1096, 8, 30), A09(m.a.f10162a, 9, 71), A09(368, 5, 68), A09(1366, 13, 27), A09(281, 6, 8), A09(325, 4, 121), A09(758, 7, 86), A09(1559, 6, 118), A09(219, 13, 83), A09(1104, 8, 84), A09(947, 6, 45), A09(1018, 15, 98), A09(159, 7, 43), A09(1049, 8, 60), A09(1163, 11, 91), A09(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, 4, 92), A09(1275, 9, 17), A09(1565, 7, 34), A09(958, 5, 50), A09(1578, 6, 78), A09(30, 9, 84), A09(21, 9, 76), A09(1078, 5, 75), A09(1219, 5, 59), A09(998, 7, 26), A09(1248, 11, 107), A09(797, 9, 126), A09(714, 4, 27), A09(718, 9, 89), A09(1005, 13, 65), A09(1390, 5, 23), A09(ag.P, 11, 1), A09(104, 5, 60), A09(953, 5, 96), A09(1224, 7, 119), A09(166, 6, 35), A09(128, 9, 50), A09(80, 10, 61), A09(780, 11, 92), A09(1147, 16, 9), A09(1174, 16, 1), A09(1395, 14, 112), A09(1327, 9, 86), A09(109, 8, 65), A09(192, 6, 89), A09(397, 14, 57), A09(39, 8, 107), A09(837, 6, 44), A09(1384, 6, 88), A09(185, 7, 33), A09(1068, 5, 105), A09(172, 13, 112), A09(1336, 6, 113), A09(1409, 8, 70), A09(142, 10, 108), A09(1141, 6, 102), A09(IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, 11, 73), A09(1269, 6, 118), A09(1319, 8, 56), A09(267, 4, 120), A09(1513, 5, 11), A09(1264, 5, 29), A09(727, 8, 32), A09(90, 6, 15), A09(1123, 12, 33), A09(1231, 13, 80), A09(735, 9, 37), A09(393, 4, 101), A09(1194, 9, 40), A09(384, 9, 26), A09(5, 9, 40), A09(427, 10, 66), A09(334, 10, 78), A09(765, 3, 58), A09(373, 11, 67), A09(271, 10, 111), A09(806, 8, 90), A09(1541, 6, 49), A09(870, 5, 56), A09(152, 7, 9), A09(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 9, 51), A09(1083, 10, 84), A09(100, 4, 102), A09(198, 21, 124), A09(814, 11, 104), A09(117, 11, 54), A09(316, 9, 110), A09(a.aU, 22, 16), A09(232, 14, 17), A09(973, 8, 44), A09(1259, 5, 114), A09(1547, 12, 113), A09(75, 5, 95), A09(943, 4, 120), A09(1417, 8, 11)};
    }

    public static int A00(HV hv) {
        hv.A0Z(4);
        int A082 = hv.A08();
        int atomType = AbstractC0793Bp.A0F;
        if (A082 == atomType) {
            hv.A0Z(8);
            int atomType2 = hv.A0E();
            return atomType2;
        }
        String A092 = A09(981, 12, 3);
        if (A01[6].length() == 26) {
            throw new RuntimeException();
        }
        A01[0] = "zJt8I7rR02Kn6vpROaQj5meT4erjWbfO";
        Log.w(A092, A09(633, 37, 71));
        return -1;
    }

    public static Metadata.Entry A01(HV hv) {
        int position = hv.A06();
        int shortType = hv.A08() + position;
        int A082 = hv.A08();
        int position2 = A082 >> 24;
        int endPosition = position2 & p.f9095b;
        try {
            if (endPosition == 169 || endPosition == 65533) {
                int endPosition2 = 16777215 & A082;
                int position3 = A04;
                if (endPosition2 == position3) {
                    return A03(A082, hv);
                }
                int position4 = A0A;
                if (endPosition2 != position4) {
                    int position5 = A0B;
                    if (endPosition2 != position5) {
                        int position6 = A05;
                        if (endPosition2 != position6) {
                            int position7 = A06;
                            if (endPosition2 != position7) {
                                int position8 = A0C;
                                if (endPosition2 == position8) {
                                    return A07(A082, A09(1445, 4, 90), hv);
                                }
                                int position9 = A03;
                                if (endPosition2 == position9) {
                                    return A07(A082, A09(1457, 4, 37), hv);
                                }
                                int position10 = A07;
                                if (endPosition2 == position10) {
                                    return A07(A082, A09(1493, 4, 47), hv);
                                }
                                int position11 = A02;
                                if (endPosition2 == position11) {
                                    return A07(A082, A09(1425, 4, 51), hv);
                                }
                                int position12 = A09;
                                if (endPosition2 == position12) {
                                    return A07(A082, A09(1592, 4, 27), hv);
                                }
                                int position13 = A08;
                                if (endPosition2 == position13) {
                                    return A07(A082, A09(1441, 4, 121), hv);
                                }
                                int position14 = A0J;
                                if (endPosition2 == position14) {
                                    return A07(A082, A09(1449, 4, 57), hv);
                                }
                            }
                        }
                        return A07(A082, A09(1437, 4, 105), hv);
                    }
                }
                TextInformationFrame A072 = A07(A082, A09(1453, 4, 67), hv);
                hv.A0Y(shortType);
                if (A01[3].charAt(3) == 98) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "m64NDxCBzKuFnKNjsIhM21uECfiUbJhp";
                strArr[7] = "y6MDsMTaC9YXXx5pm8FE8i9XXAEPqQCa";
                return A072;
            }
            int position15 = A0I;
            if (A082 == position15) {
                TextInformationFrame A083 = A08(hv);
                hv.A0Y(shortType);
                String[] strArr2 = A01;
                String str = strArr2[1];
                String str2 = strArr2[7];
                int endPosition3 = str.charAt(22);
                int position16 = str2.charAt(22);
                if (endPosition3 == position16) {
                    return A083;
                }
                A01[6] = "5DD6LJdERswd3j4tZle3lKcXT3C";
                return A083;
            }
            int position17 = A0G;
            if (A082 == position17) {
                return A06(A082, A09(1465, 4, 120), hv);
            }
            int position18 = A0S;
            if (A082 == position18) {
                return A06(A082, A09(1469, 4, 7), hv);
            }
            int position19 = A0R;
            if (A082 == position19) {
                return A04(A082, A09(1429, 4, 15), hv, true, false);
            }
            int position20 = A0E;
            if (A082 == position20) {
                return A04(A082, A09(1433, 4, 84), hv, true, true);
            }
            int position21 = A0F;
            if (A082 == position21) {
                return A02(hv);
            }
            int position22 = A0D;
            if (A082 == position22) {
                return A07(A082, A09(1461, 4, 56), hv);
            }
            int position23 = A0Q;
            if (A082 == position23) {
                return A07(A082, A09(1489, 4, 17), hv);
            }
            int position24 = A0M;
            if (A082 == position24) {
                return A07(A082, A09(1473, 4, 6), hv);
            }
            int position25 = A0O;
            if (A082 == position25) {
                return A07(A082, A09(1477, 4, 14), hv);
            }
            int position26 = A0N;
            if (A082 == position26) {
                return A07(A082, A09(1485, 4, 121), hv);
            }
            int position27 = A0P;
            if (A082 == position27) {
                return A07(A082, A09(1481, 4, 102), hv);
            }
            int position28 = A0L;
            if (A082 == position28) {
                return A04(A082, A09(843, 14, 87), hv, false, false);
            }
            int position29 = A0H;
            if (A082 == position29) {
                return A04(A082, A09(857, 13, 92), hv, false, true);
            }
            int position30 = A0U;
            if (A082 == position30) {
                return A07(A082, A09(1503, 10, 78), hv);
            }
            int position31 = A0T;
            if (A082 == position31) {
                return A07(A082, A09(1497, 6, 69), hv);
            }
            int position32 = A0K;
            if (A082 == position32) {
                return A05(hv, shortType);
            }
            String str3 = A09(1287, 32, 3) + AbstractC0793Bp.A02(A082);
            return null;
        } finally {
            hv.A0Y(shortType);
        }
    }

    public static ApicFrame A02(HV hv) {
        String A092;
        int A082 = hv.A08();
        int A083 = hv.A08();
        int i10 = AbstractC0793Bp.A0F;
        String A093 = A09(981, 12, 3);
        if (A083 != i10) {
            String[] strArr = A01;
            String str = strArr[1];
            String str2 = strArr[7];
            int atomType = str.charAt(22);
            int atomSize = str2.charAt(22);
            if (atomType == atomSize) {
                throw new RuntimeException();
            }
            A01[0] = "7eph1fLTh2YVQj3q7V4mBddTy7HaxieF";
            Log.w(A093, A09(492, 35, 106));
            return null;
        }
        int atomSize2 = hv.A08();
        int A002 = AbstractC0793Bp.A00(atomSize2);
        if (A002 == 13) {
            A092 = A09(1669, 10, 49);
        } else {
            A092 = A002 == 14 ? A09(1679, 9, 92) : null;
        }
        if (A092 == null) {
            Log.w(A093, A09(1596, 30, 125) + A002);
            return null;
        }
        hv.A0Z(4);
        int atomSize3 = A082 - 16;
        byte[] bArr = new byte[atomSize3];
        int atomSize4 = bArr.length;
        hv.A0c(bArr, 0, atomSize4);
        return new ApicFrame(A092, null, 3, bArr);
    }

    public static CommentFrame A03(int i10, HV hv) {
        int A082 = hv.A08();
        int atomType = hv.A08();
        int atomSize = AbstractC0793Bp.A0F;
        if (atomType == atomSize) {
            hv.A0Z(8);
            int atomSize2 = A082 - 16;
            String A0R2 = hv.A0R(atomSize2);
            return new CommentFrame(A09(1744, 3, 3), A0R2, A0R2);
        }
        Log.w(A09(981, 12, 3), A09(457, 35, 20) + AbstractC0793Bp.A02(i10));
        return null;
    }

    public static Id3Frame A04(int i10, String str, HV hv, boolean z10, boolean z11) {
        int A002 = A00(hv);
        if (z11) {
            String[] strArr = A01;
            String str2 = strArr[1];
            String str3 = strArr[7];
            int charAt = str2.charAt(22);
            int value = str3.charAt(22);
            if (charAt == value) {
                throw new RuntimeException();
            }
            A01[4] = "GljOgddo2S5PTONVqYc6TLRbjc7vNKoR";
            A002 = Math.min(1, A002);
        }
        if (A002 >= 0) {
            if (z10) {
                return new TextInformationFrame(str, null, Integer.toString(A002));
            }
            return new CommentFrame(A09(1744, 3, 3), str, Integer.toString(A002));
        }
        Log.w(A09(981, 12, 3), A09(670, 33, 84) + AbstractC0793Bp.A02(i10));
        return null;
    }

    public static Id3Frame A05(HV hv, int i10) {
        String str = null;
        String str2 = null;
        int atomType = -1;
        int i11 = -1;
        while (hv.A06() < i10) {
            int atomSize = hv.A06();
            int atomPosition = hv.A08();
            int A082 = hv.A08();
            hv.A0Z(4);
            if (A082 == AbstractC0793Bp.A0e) {
                str = hv.A0R(atomPosition - 12);
            } else if (A082 == AbstractC0793Bp.A0o) {
                str2 = hv.A0R(atomPosition - 12);
            } else {
                if (A082 == AbstractC0793Bp.A0F) {
                    atomType = atomSize;
                    i11 = atomPosition;
                }
                hv.A0Z(atomPosition - 12);
            }
        }
        if (str != null && str2 != null && atomType != -1) {
            hv.A0Y(atomType);
            hv.A0Z(16);
            String name = hv.A0R(i11 - 16);
            return new InternalFrame(str, str2, name);
        }
        String name2 = A01[0];
        if (name2.charAt(23) != 'T') {
            throw new RuntimeException();
        }
        A01[0] = "CXapLAnRFGrcKvV6tyGgZCOTEzfo7Q4K";
        return null;
    }

    public static TextInformationFrame A06(int i10, String str, HV hv) {
        int A082 = hv.A08();
        int atomType = hv.A08();
        int atomSize = AbstractC0793Bp.A0F;
        if (atomType == atomSize && A082 >= 22) {
            hv.A0Z(10);
            int A0I2 = hv.A0I();
            if (A0I2 > 0) {
                String str2 = A09(0, 0, 20) + A0I2;
                int count = hv.A0I();
                if (count > 0) {
                    str2 = str2 + A09(4, 1, 67) + count;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        Log.w(A09(981, 12, 3), A09(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 39, 49) + AbstractC0793Bp.A02(i10));
        return null;
    }

    public static TextInformationFrame A07(int i10, String str, HV hv) {
        int A082 = hv.A08();
        int atomType = hv.A08();
        int atomSize = AbstractC0793Bp.A0F;
        if (atomType == atomSize) {
            hv.A0Z(8);
            int atomSize2 = A082 - 16;
            return new TextInformationFrame(str, null, hv.A0R(atomSize2));
        }
        Log.w(A09(981, 12, 3), A09(601, 32, 115) + AbstractC0793Bp.A02(i10));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame A08(com.facebook.ads.redexgen.X.HV r4) {
        /*
            int r2 = A00(r4)
            r4 = 0
            if (r2 <= 0) goto L21
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C2.A0V
            int r0 = r1.length
            if (r2 > r0) goto L21
            int r0 = r2 + (-1)
            r3 = r1[r0]
        L10:
            if (r3 == 0) goto L23
            r2 = 1441(0x5a1, float:2.019E-42)
            r1 = 4
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r1 = A09(r2, r1, r0)
            com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame r0 = new com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame
            r0.<init>(r1, r4, r3)
            return r0
        L21:
            r3 = r4
            goto L10
        L23:
            r2 = 981(0x3d5, float:1.375E-42)
            r1 = 12
            r0 = 3
            java.lang.String r3 = A09(r2, r1, r0)
            r2 = 566(0x236, float:7.93E-43)
            r1 = 35
            r0 = 97
            java.lang.String r0 = A09(r2, r1, r0)
            android.util.Log.w(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2.A08(com.facebook.ads.redexgen.X.HV):com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame");
    }
}
