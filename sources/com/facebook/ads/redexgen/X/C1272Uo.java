package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.anythink.expressad.exoplayer.b;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Uo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1272Uo implements InterfaceC0812Cj {
    public static byte[] A0C;
    public static String[] A0D = {"yUSRg3C4669fvLzuOHW1XSLd3PantLKL", "TfD3AbKeF9VAaUscqyzwwU3jFt7tVTiq", "g0WIbq4DK90SLCQEiKu8stzXkqWEOBgJ", "mQ9LzXZ", "LtvBgOfO2pmZDU6uCsowjLyYxKVOoB", "Sd9ouEoM5pzgzW5N1jQmDkMiOeFHRcqL", "5alPEFiVNlXDBdXEKmvVdaMyQKz58nOe", "TNFmsx2lI6S26ML"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C0936Hh A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final CU A0A;
    public final HU A0B = new HU(new byte[10]);
    public int A03 = 0;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-29, 48, 50, 53, 40, -29, 37, 60, 55, 40, 54, -58, -37, -23, -56, -37, -41, -38, -37, -24, -28, -3, -12, 7, -1, -12, -14, 3, -12, -13, -81, 2, 3, -16, 1, 3, -81, -14, -2, -13, -12, -81, -1, 1, -12, -11, -8, 7, -55, -81, -20, 5, -4, Ascii.SI, 7, -4, -6, Ascii.VT, -4, -5, -73, 10, Ascii.VT, -8, 9, Ascii.VT, -73, 0, 5, -5, 0, -6, -8, Ascii.VT, 6, 9, -73, 9, -4, -8, -5, 0, 5, -2, -73, -4, Ascii.SI, Ascii.VT, -4, 5, -5, -4, -5, -73, -1, -4, -8, -5, -4, 9, -47, -22, -31, -12, -20, -31, -33, -16, -31, -32, -100, -17, -16, -35, -18, -16, -100, -27, -22, -32, -27, -33, -35, -16, -21, -18, -74, -100, -31, -12, -20, -31, -33, -16, -31, -32, -100};
    }

    static {
        A02();
    }

    public C1272Uo(CU cu) {
        this.A0A = cu;
    }

    private void A01() {
        this.A0B.A07(0);
        this.A04 = b.f7291b;
        if (this.A08) {
            this.A0B.A08(4);
            this.A0B.A08(1);
            long pts = this.A0B.A04(15) << 15;
            long A04 = (this.A0B.A04(3) << 30) | pts;
            this.A0B.A08(1);
            long pts2 = this.A0B.A04(15);
            long j10 = A04 | pts2;
            this.A0B.A08(1);
            if (!this.A09 && this.A07) {
                this.A0B.A08(4);
                long pts3 = this.A0B.A04(3);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A05.A07((pts3 << 30) | (this.A0B.A04(15) << 15) | this.A0B.A04(15));
                this.A09 = true;
            }
            this.A04 = this.A05.A07(j10);
        }
    }

    private void A03(int i10) {
        this.A03 = i10;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0B.A07(0);
        int A04 = this.A0B.A04(24);
        if (A04 != 1) {
            Log.w(A00(11, 9, 46), A00(20, 30, 71) + A04);
            this.A02 = -1;
            return false;
        }
        this.A0B.A08(8);
        int A042 = this.A0B.A04(16);
        this.A0B.A08(5);
        this.A06 = this.A0B.A0F();
        this.A0B.A08(2);
        this.A08 = this.A0B.A0F();
        this.A07 = this.A0B.A0F();
        this.A0B.A08(6);
        int startCodePrefix = this.A0B.A04(8);
        this.A01 = startCodePrefix;
        if (A042 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix2 = A042 + 6;
            int i10 = startCodePrefix2 - 9;
            int startCodePrefix3 = this.A01;
            int i11 = i10 - startCodePrefix3;
            String[] strArr = A0D;
            String str = strArr[1];
            String str2 = strArr[5];
            int packetLength = str.charAt(17);
            int startCodePrefix4 = str2.charAt(17);
            if (packetLength == startCodePrefix4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "TxtnMsOUgyy3Igc1MGFXcQorbec0OOLJ";
            strArr2[5] = "FqrtTSnP7VIKT9cq1hMIyK6Edo6EUePi";
            this.A02 = i11;
        }
        return true;
    }

    private boolean A05(HV hv, byte[] bArr, int i10) {
        int min = Math.min(hv.A04(), i10 - this.A00);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            hv.A0Z(min);
        } else {
            int i11 = this.A00;
            if (A0D[0].charAt(8) != '6') {
                String[] strArr = A0D;
                strArr[6] = "H8KMS8SQgkToBAcEgsGMIMEmcDOAfjD3";
                strArr[2] = "pG8ynHzO3ynvgwiEM6LVA0Wbsu12g974";
                hv.A0c(bArr, i11, min);
            } else {
                String[] strArr2 = A0D;
                strArr2[1] = "SlJVAlpzWDTlfjZlG24yfuiEgxBIsDod";
                strArr2[5] = "YxSVdBM1mtROHF0F5NUzvc6S3n3WzSYI";
                hv.A0c(bArr, i11, min);
            }
        }
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + min;
        if (A0D[4].length() == 4) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0D;
        strArr3[1] = "9iVHE5UHbJVR9dQ85oXJ8gpCzJ6PDaiT";
        strArr3[5] = "Vd59evKFs4P6sMun7tv1zskusbuvsqU9";
        int bytesToRead2 = this.A00;
        return bytesToRead2 == i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0812Cj
    public final void A49(HV hv, boolean z10) throws C9R {
        if (z10) {
            int i10 = this.A03;
            if (i10 != 0 && i10 != 1) {
                String A00 = A00(11, 9, 46);
                if (i10 == 2) {
                    Log.w(A00, A00(50, 50, 79));
                } else if (i10 == 3) {
                    if (this.A02 != -1) {
                        Log.w(A00, A00(100, 37, 52) + this.A02 + A00(0, 11, 123));
                    }
                    this.A0A.ACx();
                }
            }
            A03(1);
        }
        while (hv.A04() > 0) {
            int i11 = this.A03;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        if (A05(hv, this.A0B.A00, Math.min(10, this.A01)) && A05(hv, null, this.A01)) {
                            A01();
                            this.A0A.ACy(this.A04, this.A06);
                            A03(3);
                        }
                    } else if (i11 != 3) {
                        continue;
                    } else {
                        int A04 = hv.A04();
                        int i12 = this.A02;
                        int i13 = i12 != -1 ? A04 - i12 : 0;
                        if (i13 > 0) {
                            A04 -= i13;
                            hv.A0X(hv.A06() + A04);
                        }
                        this.A0A.A48(hv);
                        int i14 = this.A02;
                        if (i14 != -1) {
                            this.A02 = i14 - A04;
                            if (this.A02 == 0) {
                                CU cu = this.A0A;
                                if (A0D[0].charAt(8) != '6') {
                                    throw new RuntimeException();
                                }
                                String[] strArr = A0D;
                                strArr[6] = "x0jdU4oJLyfE062EEYlQTVcdLSkaU5Sb";
                                strArr[2] = "VBdeZUL1F1jcYz7E9oLJeT0FLHfAjfLP";
                                cu.ACx();
                                A03(1);
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (A05(hv, this.A0B.A00, 9)) {
                    A03(A04() ? 2 : 0);
                }
            } else {
                hv.A0Z(hv.A04());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0812Cj
    public final void A8I(C0936Hh c0936Hh, BQ bq, C0811Ci c0811Ci) {
        this.A05 = c0936Hh;
        this.A0A.A4V(bq, c0811Ci);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0812Cj
    public final void AEC() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.AEC();
    }
}
