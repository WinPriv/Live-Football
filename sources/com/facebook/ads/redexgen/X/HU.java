package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.k.p;
import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* loaded from: assets/audience_network.dex */
public final class HU {
    public static String[] A04 = {"RHSjJGYddlOPzslamo8j", "no2wrOKISs4wdINa", "E7xZIMZbElFQthX5cbe1zXMBiqq9Oct2", "NQ4djAykaRRiHV2nkQWoiztobM3LGBfO", "EDikhWaymQH2jtWvDyx1vViO84FhvN", "TllFBKS94wZfNNX6FcczOhdwmX6snrOZ", "CS63JXje", "QpZzHKHty24GTaxrVVV4B8DIrBZ4Gw8P"};
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public HU() {
    }

    public HU(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public HU(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A02 = i10;
    }

    private void A00() {
        int i10;
        int i11 = this.A03;
        H6.A04(i11 >= 0 && (i11 < (i10 = this.A02) || (i11 == i10 && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        H6.A04(this.A01 == 0);
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        int i12 = 0;
        this.A01 += i10;
        while (true) {
            i11 = this.A01;
            if (i11 <= 8) {
                break;
            }
            this.A01 = i11 - 8;
            byte[] bArr = this.A00;
            int returnValue = this.A03;
            this.A03 = returnValue + 1;
            i12 |= (bArr[returnValue] & DefaultClassResolver.NAME) << this.A01;
        }
        byte[] bArr2 = this.A00;
        int i13 = this.A03;
        int returnValue2 = bArr2[i13] & DefaultClassResolver.NAME;
        int i14 = i12 | (returnValue2 >> (8 - i11));
        int returnValue3 = (-1) >>> (32 - i10);
        int i15 = i14 & returnValue3;
        if (i11 == 8) {
            this.A01 = 0;
            this.A03 = i13 + 1;
        }
        A00();
        return i15;
    }

    public final void A05() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A06() {
        int i10 = this.A01 + 1;
        this.A01 = i10;
        if (i10 == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
    }

    public final void A07(int i10) {
        this.A03 = i10 / 8;
        this.A01 = i10 - (this.A03 * 8);
        A00();
    }

    public final void A08(int i10) {
        int i11 = i10 / 8;
        int numBytes = this.A03;
        this.A03 = numBytes + i11;
        int numBytes2 = i11 * 8;
        this.A01 += i10 - numBytes2;
        int i12 = this.A01;
        if (i12 > 7) {
            int numBytes3 = this.A03;
            this.A03 = numBytes3 + 1;
            int numBytes4 = i12 - 8;
            this.A01 = numBytes4;
        }
        A00();
    }

    public final void A09(int i10) {
        H6.A04(this.A01 == 0);
        this.A03 += i10;
        A00();
    }

    public final void A0A(int currentByteIndex, int i10) {
        if (i10 < 32) {
            currentByteIndex &= (1 << i10) - 1;
        }
        int min = Math.min(8 - this.A01, i10);
        int remainingBitsToRead = this.A01;
        int i11 = (8 - remainingBitsToRead) - min;
        int i12 = (65280 >> remainingBitsToRead) | ((1 << i11) - 1);
        byte[] bArr = this.A00;
        int firstByteBitmask = this.A03;
        bArr[firstByteBitmask] = (byte) (bArr[firstByteBitmask] & i12);
        int i13 = currentByteIndex >>> (i10 - min);
        bArr[firstByteBitmask] = (byte) (bArr[firstByteBitmask] | (i13 << i11));
        int i14 = i10 - min;
        int firstByteBitmask2 = firstByteBitmask + 1;
        while (i14 > 8) {
            this.A00[firstByteBitmask2] = (byte) (currentByteIndex >>> (i14 - 8));
            i14 -= 8;
            firstByteBitmask2++;
        }
        int firstByteRightPaddingSize = 8 - i14;
        byte[] bArr2 = this.A00;
        bArr2[firstByteBitmask2] = (byte) (bArr2[firstByteBitmask2] & ((1 << firstByteRightPaddingSize) - 1));
        byte b10 = (byte) (bArr2[firstByteBitmask2] | ((currentByteIndex & ((1 << i14) - 1)) << firstByteRightPaddingSize));
        int lastByteInput = A04[3].charAt(20);
        if (lastByteInput != 105) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[4] = "HDn8cIfTWSkx257fNKtZvpUDi4vYZW";
        strArr[6] = "YQkUGCO4";
        bArr2[firstByteBitmask2] = b10;
        A08(i10);
        A00();
    }

    public final void A0B(byte[] bArr) {
        A0C(bArr, bArr.length);
    }

    public final void A0C(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i10;
    }

    public final void A0D(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.A00;
            int i13 = this.A03;
            int to = i13 + 1;
            this.A03 = to;
            int to2 = bArr2[i13];
            int i14 = this.A01;
            bArr[i10] = (byte) (to2 << i14);
            int i15 = bArr[i10];
            int to3 = this.A03;
            bArr[i10] = (byte) (((255 & bArr2[to3]) >> (8 - i14)) | i15);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        int bitsLeft = bArr[i12];
        int to4 = p.f9095b >> i16;
        bArr[i12] = (byte) (bitsLeft & to4);
        int i17 = this.A01;
        int to5 = i17 + i16;
        if (to5 > 8) {
            int i18 = bArr[i12];
            byte[] bArr3 = this.A00;
            int bitsLeft2 = this.A03;
            int to6 = bitsLeft2 + 1;
            this.A03 = to6;
            int to7 = bArr3[bitsLeft2];
            bArr[i12] = (byte) (i18 | ((to7 & p.f9095b) << i17));
            this.A01 = i17 - 8;
        }
        int to8 = this.A01;
        this.A01 = to8 + i16;
        byte[] bArr4 = this.A00;
        int i19 = this.A03;
        int to9 = bArr4[i19];
        int i20 = 255 & to9;
        int lastDataByteTrailingBits = this.A01;
        int to10 = 8 - lastDataByteTrailingBits;
        int i21 = i20 >> to10;
        int bitsLeft3 = bArr[i12];
        int to11 = 8 - i16;
        bArr[i12] = (byte) (bitsLeft3 | ((byte) (i21 << to11)));
        if (lastDataByteTrailingBits == 8) {
            this.A01 = 0;
            int to12 = i19 + 1;
            this.A03 = to12;
        }
        A00();
    }

    public final void A0E(byte[] bArr, int i10, int i11) {
        H6.A04(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i10, i11);
        this.A03 += i11;
        A00();
    }

    public final boolean A0F() {
        boolean returnValue = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A06();
        return returnValue;
    }
}
