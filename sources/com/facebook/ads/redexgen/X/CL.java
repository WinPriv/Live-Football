package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.k.p;
import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* loaded from: assets/audience_network.dex */
public final class CL {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public CL(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        int i10;
        int i11 = this.A01;
        H6.A04(i11 >= 0 && (i11 < (i10 = this.A02) || (i11 == i10 && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int i10) {
        int bitsRead = this.A01;
        int tempByteOffset = Math.min(i10, 8 - this.A00);
        int i11 = bitsRead + 1;
        int tempByteOffset2 = this.A03[bitsRead];
        int tempByteOffset3 = ((tempByteOffset2 & p.f9095b) >> this.A00) & (p.f9095b >> (8 - tempByteOffset));
        while (tempByteOffset < i10) {
            int returnValue = this.A03[i11];
            tempByteOffset3 |= (returnValue & p.f9095b) << tempByteOffset;
            tempByteOffset += 8;
            i11++;
        }
        int returnValue2 = 32 - i10;
        int tempByteOffset4 = tempByteOffset3 & ((-1) >>> returnValue2);
        A03(i10);
        return tempByteOffset4;
    }

    public final void A03(int i10) {
        int i11 = i10 / 8;
        int numBytes = this.A01;
        this.A01 = numBytes + i11;
        int numBytes2 = i11 * 8;
        this.A00 += i10 - numBytes2;
        int i12 = this.A00;
        if (i12 > 7) {
            int numBytes3 = this.A01;
            this.A01 = numBytes3 + 1;
            int numBytes4 = i12 - 8;
            this.A00 = numBytes4;
        }
        A00();
    }

    public final boolean A04() {
        boolean returnValue = (((this.A03[this.A01] & DefaultClassResolver.NAME) >> this.A00) & 1) == 1;
        A03(1);
        return returnValue;
    }
}
