package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ul, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1269Ul implements InterfaceC0812Cj {
    public static String[] A06 = {"kFQyFzcAtW9h", "T9w", "fQaNjl3SJX3d9bVQ", "oZJ95vdSt2TTHBWCj0JXn5a7ndpZ8Bju", "u9yp8kydrxa7", "6VdIrZzllDHdfU7GHzHok5zrzcn9yZKG", "C5", "TRfT7Vv0"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC0805Cc A04;
    public final HV A05 = new HV(32);

    public C1269Ul(InterfaceC0805Cc interfaceC0805Cc) {
        this.A04 = interfaceC0805Cc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0812Cj
    public final void A49(HV hv, boolean z10) {
        int i10 = -1;
        if (z10) {
            i10 = hv.A06() + hv.A0E();
        }
        boolean z11 = this.A03;
        if (A06[1].length() == 27) {
            throw new RuntimeException();
        }
        A06[7] = "Nc9T8xtu";
        if (z11) {
            if (!z10) {
                return;
            }
            this.A03 = false;
            hv.A0Y(i10);
            this.A00 = 0;
        }
        while (hv.A04() > 0) {
            int payloadStartPosition = this.A00;
            if (payloadStartPosition < 3) {
                if (payloadStartPosition == 0) {
                    int A0E = hv.A0E();
                    hv.A0Y(hv.A06() - 1);
                    int tableId = A06[7].length();
                    if (tableId != 8) {
                        throw new RuntimeException();
                    }
                    A06[2] = "aJNwIS78aN3JetqFlJ8G";
                    if (A0E == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int tableId2 = hv.A04();
                int min = Math.min(tableId2, 3 - this.A00);
                hv.A0c(this.A05.A00, this.A00, min);
                this.A00 += min;
                if (this.A00 == 3) {
                    this.A05.A0W(3);
                    this.A05.A0Z(1);
                    int A0E2 = this.A05.A0E();
                    int headerBytesToRead = this.A05.A0E();
                    this.A02 = (A0E2 & 128) != 0;
                    this.A01 = (((A0E2 & 15) << 8) | headerBytesToRead) + 3;
                    int headerBytesToRead2 = this.A05.A05();
                    if (headerBytesToRead2 < this.A01) {
                        byte[] bArr = this.A05.A00;
                        HV hv2 = this.A05;
                        int headerBytesToRead3 = this.A01;
                        hv2.A0W(Math.min(4098, Math.max(headerBytesToRead3, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.A05.A00, 0, 3);
                    }
                }
            } else {
                int A04 = hv.A04();
                int headerBytesToRead4 = this.A01;
                int min2 = Math.min(A04, headerBytesToRead4 - this.A00);
                hv.A0c(this.A05.A00, this.A00, min2);
                this.A00 += min2;
                int payloadStartPosition2 = this.A00;
                int thirdHeaderByte = this.A01;
                if (payloadStartPosition2 == thirdHeaderByte) {
                    boolean z12 = this.A02;
                    int bodyBytesToRead = A06[7].length();
                    if (bodyBytesToRead != 8) {
                        throw new RuntimeException();
                    }
                    A06[1] = "WscUDiyP9zB";
                    if (z12) {
                        byte[] bArr2 = this.A05.A00;
                        int bodyBytesToRead2 = this.A01;
                        if (C0940Hl.A09(bArr2, 0, bodyBytesToRead2, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        HV hv3 = this.A05;
                        int i11 = this.A01 - 4;
                        int bodyBytesToRead3 = A06[2].length();
                        if (bodyBytesToRead3 != 29) {
                            String[] strArr = A06;
                            strArr[3] = "nNiCCranccCPI0NRpeExr6ylwZyZykwG";
                            strArr[5] = "pfAdcnCCuWORkUPhfNuwqkYYK2fT2IOL";
                            hv3.A0W(i11);
                        } else {
                            A06[2] = "0kjAgxStX";
                            hv3.A0W(i11);
                        }
                    } else {
                        this.A05.A0W(thirdHeaderByte);
                    }
                    this.A04.A48(this.A05);
                    this.A00 = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0812Cj
    public final void A8I(C0936Hh c0936Hh, BQ bq, C0811Ci c0811Ci) {
        this.A04.A8I(c0936Hh, bq, c0811Ci);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0812Cj
    public final void AEC() {
        this.A03 = true;
    }
}
