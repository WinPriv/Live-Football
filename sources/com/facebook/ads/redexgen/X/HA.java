package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HA {
    public static byte[] A00;
    public static String[] A01 = {"7xLJJJjcPic97znxr7jYyKVhMaeA1j2E", "qlBokwmGez00tGn8Zoa7EPfSBX4wK2nd", "lNuywCj9LEYUa8avgu1fHofmnBtqXXwP", "QFj1OU4oR8zs4ROIl6ex9DnIWth", "MldRCxmPSCf85WqtCY5KHjt0bBRgqPbR", "RjpHJdGRFnKrV", "xTxTizoIhxSZQJal7HagUNUTtmhMrgov", "oiVBLQsg82rzAXMmQswhUJYEb9MEhzaa"};
    public static final byte[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{5, 62, 35, 37, 32, 32, 63, 34, 36, 53, 52, 112, 49, 37, 52, 57, 63, 112, 63, 50, 58, 53, 51, 36, 112, 36, 41, 32, 53, 106, 112, 116, 79, 82, 84, 81, 81, 78, 83, 85, 68, 69, 1, 68, 81, 98, 78, 79, 71, 72, 70, Ascii.ESC, 1};
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A04 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A03 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(HU hu) {
        int A042 = hu.A04(5);
        if (A042 == 31) {
            int audioObjectType = hu.A04(6);
            return audioObjectType + 32;
        }
        return A042;
    }

    public static int A01(HU hu) {
        int A042 = hu.A04(4);
        if (A042 == 15) {
            int frequencyIndex = hu.A04(24);
            return frequencyIndex;
        }
        if (A01[3].length() != 27) {
            throw new RuntimeException();
        }
        A01[5] = "Rl706moC1hxTN";
        H6.A03(A042 < 13);
        int frequencyIndex2 = A04[A042];
        return frequencyIndex2;
    }

    public static Pair<Integer, Integer> A02(HU hu, boolean z10) throws C9R {
        int A002 = A00(hu);
        int A012 = A01(hu);
        int A042 = hu.A04(4);
        if (A002 == 5 || A002 == 29) {
            A012 = A01(hu);
            A002 = A00(hu);
            if (A002 == 22) {
                A042 = hu.A04(4);
            }
        }
        boolean z11 = true;
        if (z10) {
            if (A002 != 1 && A002 != 2 && A002 != 3 && A002 != 4 && A002 != 6 && A002 != 7 && A002 != 17) {
                switch (A002) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new C9R(A04(0, 31, 122) + A002);
                }
            }
            A06(hu, A002, A042);
            int sampleRate = A01[4].charAt(0);
            if (sampleRate == 99) {
                throw new RuntimeException();
            }
            A01[7] = "vV2yfuq3D8MlByvyd0FSsWmE07MYRaiH";
            switch (A002) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int A043 = hu.A04(2);
                    if (A043 == 2 || A043 == 3) {
                        throw new C9R(A04(31, 22, 11) + A043);
                    }
            }
        }
        int channelCount = A03[A042];
        if (channelCount == -1) {
            z11 = false;
        }
        H6.A03(z11);
        return Pair.create(Integer.valueOf(A012), Integer.valueOf(channelCount));
    }

    public static Pair<Integer, Integer> A03(byte[] bArr) throws C9R {
        return A02(new HU(bArr), false);
    }

    public static void A06(HU hu, int i10, int i11) {
        hu.A08(1);
        if (hu.A0F()) {
            if (A01[5].length() != 13) {
                throw new RuntimeException();
            }
            A01[6] = "9ZbgWIK1Tjah9N2o7wCOkUZOiekVuClG";
            hu.A08(14);
        }
        boolean A0F = hu.A0F();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                hu.A08(3);
            }
            if (A0F) {
                if (i10 == 22) {
                    hu.A08(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    hu.A08(3);
                }
                hu.A08(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] A07(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static byte[] A08(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = A02;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, A02.length, i11);
        return bArr3;
    }
}
