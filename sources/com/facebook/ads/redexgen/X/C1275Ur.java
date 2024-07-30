package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ur, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1275Ur implements CU {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0789Ba A03;
    public boolean A04;
    public final HV A05 = new HV(10);

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{Ascii.EM, 62, 72, 56, 54, 71, 57, 62, 67, 60, -11, 62, 67, 75, 54, 65, 62, 57, -11, Ascii.RS, Ascii.EM, 8, -11, 73, 54, 60, -16, Ascii.VT, -38, -7, Ascii.FF, 8, Ascii.VT, Ascii.FF, Ascii.EM, 89, 104, 104, 100, 97, 91, 89, 108, 97, 103, 102, 39, 97, 92, 43};
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A48(HV hv) {
        if (!this.A04) {
            return;
        }
        int A04 = hv.A04();
        int bytesAvailable = this.A00;
        if (bytesAvailable < 10) {
            int min = Math.min(A04, 10 - bytesAvailable);
            System.arraycopy(hv.A00, hv.A06(), this.A05.A00, this.A00, min);
            if (this.A00 + min == 10) {
                this.A05.A0Y(0);
                if (73 != this.A05.A0E() || 68 != this.A05.A0E() || 51 != this.A05.A0E()) {
                    Log.w(A00(26, 9, 44), A00(0, 26, 90));
                    this.A04 = false;
                    return;
                } else {
                    this.A05.A0Z(3);
                    this.A01 = this.A05.A0D() + 10;
                }
            }
        }
        int headerBytesAvailable = this.A01;
        int bytesToWrite = Math.min(A04, headerBytesAvailable - this.A00);
        this.A03.AE8(hv, bytesToWrite);
        this.A00 += bytesToWrite;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A4V(BQ bq, C0811Ci c0811Ci) {
        c0811Ci.A05();
        this.A03 = bq.AF2(c0811Ci.A03(), 4);
        this.A03.A5T(Format.A0B(c0811Ci.A04(), A00(35, 15, 125), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACx() {
        int i10;
        if (!this.A04 || (i10 = this.A01) == 0 || this.A00 != i10) {
            return;
        }
        this.A03.AE9(this.A02, 1, i10, 0, null);
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACy(long j10, boolean z10) {
        if (!z10) {
            return;
        }
        this.A04 = true;
        this.A02 = j10;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void AEC() {
        this.A04 = false;
    }
}
