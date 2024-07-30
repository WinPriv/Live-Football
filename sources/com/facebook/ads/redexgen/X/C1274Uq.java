package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Uq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1274Uq implements CU {
    public static byte[] A0K;
    public static String[] A0L = {"hgUALiBHRBx3rc9PT3qyJLJuKriNjQIA", "JcSPF8dLSzFIe8gapkYyYGiPDe1iVZ7T", "a8IrrF5hi8IFjeZ2lIy6xY1armnYmb5o", "dI536DedIqR9AIwKwKzHAZoNzdw0gd0o", "spoCU0rWYssiPe95xKAIpCDVtAt9VbvV", "ZT5oGWr6FGwuE", "k3I4LHvMKlhfRum43HVkkWOAjRBPWhRl", "GOwjxx90kdElmS0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Format A0C;
    public InterfaceC0789Ba A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public final String A0J;
    public final HV A0I = new HV(1024);
    public final HU A0H = new HU(this.A0I.A00);

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 35;
            String[] strArr = A0L;
            if (strArr[1].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[3] = "gooppkWHFs0OH8ZO7KHmI5JoYki0niEb";
            strArr2[4] = "gQ32BKgMXcn7uGYeyK4g8BO1uII782R4";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0K = new byte[]{-87, -67, -84, -79, -73, 119, -75, -72, 124, -87, 117, -76, -87, -68, -75};
    }

    static {
        A04();
    }

    public C1274Uq(@Nullable String str) {
        this.A0J = str;
    }

    private int A00(HU hu) throws C9R {
        int A01 = hu.A01();
        Pair<Integer, Integer> config = HA.A02(hu, true);
        int bitsLeft = ((Integer) config.first).intValue();
        this.A05 = bitsLeft;
        int bitsLeft2 = ((Integer) config.second).intValue();
        this.A02 = bitsLeft2;
        int bitsLeft3 = hu.A01();
        return A01 - bitsLeft3;
    }

    private int A01(HU hu) throws C9R {
        int tmp;
        int i10 = 0;
        int muxSlotLengthBytes = this.A03;
        if (muxSlotLengthBytes != 0) {
            throw new C9R();
        }
        do {
            tmp = hu.A04(8);
            i10 += tmp;
        } while (tmp == 255);
        return i10;
    }

    public static long A02(HU hu) {
        int bytesForValue = hu.A04(2);
        return hu.A04((bytesForValue + 1) * 8);
    }

    private void A05(int i10) {
        this.A0I.A0W(i10);
        this.A0H.A0B(this.A0I.A00);
    }

    private void A06(HU hu) throws C9R {
        boolean useSameStreamMux = hu.A0F();
        if (!useSameStreamMux) {
            this.A0G = true;
            A08(hu);
        } else {
            boolean useSameStreamMux2 = this.A0G;
            if (!useSameStreamMux2) {
                return;
            }
        }
        if (this.A00 == 0) {
            if (this.A04 == 0) {
                A09(hu, A01(hu));
                boolean useSameStreamMux3 = this.A0F;
                if (useSameStreamMux3) {
                    hu.A08((int) this.A09);
                    return;
                }
                return;
            }
            throw new C9R();
        }
        throw new C9R();
    }

    private void A07(HU hu) {
        this.A03 = hu.A04(3);
        int i10 = this.A03;
        if (i10 == 0) {
            hu.A08(8);
            return;
        }
        if (i10 != 1) {
            if (i10 != 3 && i10 != 4 && i10 != 5) {
                if (i10 != 6) {
                    if (A0L[7].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0L;
                    strArr[1] = "QJhjenmrzPYVr6mrKS1ywIZfks2sEqmv";
                    strArr[0] = "rtM7Stfru76sVtn814uyI2mxrEEn9Ydu";
                    if (i10 != 7) {
                        return;
                    }
                }
                hu.A08(1);
                return;
            }
            hu.A08(6);
            return;
        }
        hu.A08(9);
    }

    private void A08(HU hu) throws C9R {
        boolean A0F;
        int A04 = hu.A04(1);
        this.A00 = A04 == 1 ? hu.A04(1) : 0;
        if (this.A00 == 0) {
            if (A04 == 1) {
                A02(hu);
            }
            if (hu.A0F()) {
                this.A04 = hu.A04(6);
                int A042 = hu.A04(4);
                int A043 = hu.A04(3);
                if (A042 == 0 && A043 == 0) {
                    if (A04 == 0) {
                        int A03 = hu.A03();
                        int A00 = A00(hu);
                        hu.A07(A03);
                        byte[] bArr = new byte[(A00 + 7) / 8];
                        hu.A0D(bArr, 0, A00);
                        Format A07 = Format.A07(this.A0E, A03(0, 15, 37), null, -1, -1, this.A02, this.A05, Collections.singletonList(bArr), null, 0, this.A0J);
                        if (!A07.equals(this.A0C)) {
                            this.A0C = A07;
                            this.A0A = 1024000000 / A07.A0C;
                            this.A0D.A5T(A07);
                        }
                    } else {
                        hu.A08(((int) A02(hu)) - A00(hu));
                    }
                    A07(hu);
                    this.A0F = hu.A0F();
                    this.A09 = 0L;
                    if (this.A0F) {
                        if (A04 == 1) {
                            this.A09 = A02(hu);
                        }
                        do {
                            A0F = hu.A0F();
                            this.A09 = (this.A09 << 8) + hu.A04(8);
                        } while (A0F);
                    }
                    if (hu.A0F()) {
                        hu.A08(8);
                        return;
                    }
                    return;
                }
                throw new C9R();
            }
            throw new C9R();
        }
        throw new C9R();
    }

    private void A09(HU hu, int i10) {
        int A03 = hu.A03();
        int bitPosition = A03 & 7;
        if (bitPosition == 0) {
            int bitPosition2 = A03 >> 3;
            this.A0I.A0Y(bitPosition2);
        } else {
            int bitPosition3 = i10 * 8;
            hu.A0D(this.A0I.A00, 0, bitPosition3);
            this.A0I.A0Y(0);
        }
        this.A0D.AE8(this.A0I, i10);
        this.A0D.AE9(this.A0B, 1, i10, 0, null);
        this.A0B += this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A48(HV hv) throws C9R {
        while (hv.A04() > 0) {
            int i10 = this.A08;
            if (i10 == 0) {
                int secondByte = hv.A0E();
                if (secondByte == 86) {
                    this.A08 = 1;
                }
            } else if (i10 == 1) {
                int A0E = hv.A0E();
                if ((A0E & 224) == 224) {
                    this.A07 = A0E;
                    this.A08 = 2;
                } else if (A0E != 86) {
                    this.A08 = 0;
                }
            } else {
                if (A0L[7].length() != 15) {
                    throw new RuntimeException();
                }
                String[] strArr = A0L;
                strArr[3] = "eXMY6UfuU8mptnxKZK3KjbCMiU1pAKNs";
                strArr[4] = "BrFOrdIatggcu5HdAKqvOHyOVIidANWA";
                if (i10 == 2) {
                    int bytesToRead = this.A07;
                    this.A06 = ((bytesToRead & (-225)) << 8) | hv.A0E();
                    if (this.A06 > this.A0I.A00.length) {
                        A05(this.A06);
                    }
                    this.A01 = 0;
                    this.A08 = 3;
                } else if (i10 == 3) {
                    int min = Math.min(hv.A04(), this.A06 - this.A01);
                    byte[] bArr = this.A0H.A00;
                    int bytesToRead2 = this.A01;
                    hv.A0c(bArr, bytesToRead2, min);
                    int bytesToRead3 = this.A01;
                    this.A01 = bytesToRead3 + min;
                    int i11 = this.A01;
                    int bytesToRead4 = this.A06;
                    if (i11 == bytesToRead4) {
                        this.A0H.A07(0);
                        A06(this.A0H);
                        this.A08 = 0;
                    }
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A4V(BQ bq, C0811Ci c0811Ci) {
        c0811Ci.A05();
        this.A0D = bq.AF2(c0811Ci.A03(), 1);
        this.A0E = c0811Ci.A04();
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACx() {
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACy(long j10, boolean z10) {
        this.A0B = j10;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void AEC() {
        this.A08 = 0;
        this.A0G = false;
    }
}
