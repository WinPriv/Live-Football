package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class Sm implements InterfaceC1144Pp {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ JT A01;
    public final /* synthetic */ JW A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{103, 100, 50, 97, 101, 105, 96, 53, Ascii.DLE, 65, 19, Ascii.DLE, Ascii.RS, Ascii.RS, 69, Ascii.ETB, 1, Ascii.CAN, 4, 5, Ascii.SO, 51, 40, 46, 59, 63, 34, 36, 37, 113, 107, 108, 90, 77, 73, 90, 77, Ascii.US, 90, 77, 77, 80, 77, Ascii.US, 80, 92, 92, 74, 77, 77, 90, 91, 75, 125, 106, 110, 125, 106, 56, 106, 125, 104, 116, 113, 125, 124, 56, 107, 109, 123, 123, 125, 107, 107, 126, 109, 116, 116, 97, 75, 74, 103, 75, 73, 84, 72, 65, 80, 65, 95, 94, 117, 66, 66, 95, 66};
    }

    public Sm(JW jw, JT jt, long j10) {
        this.A02 = jw;
        this.A01 = jt;
        this.A00 = j10;
    }

    private final void A02(Q1 q1) {
        C1316Wj c1316Wj;
        long j10;
        C1316Wj c1316Wj2;
        long j11;
        JX jx;
        C1316Wj c1316Wj3;
        C1316Wj c1316Wj4;
        long j12;
        JS.A06(this.A01);
        try {
            InterfaceC1142Pn response = q1.A00();
            if (response != null) {
                String A5n = response.A5n();
                jx = this.A02.A05;
                c1316Wj3 = this.A02.A04;
                JZ serverResponse = jx.A06(c1316Wj3, A5n, this.A00);
                if (serverResponse.A01() == JY.A03) {
                    C1215Si c1215Si = (C1215Si) serverResponse;
                    String A04 = c1215Si.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1215Si.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A04 != null) {
                        A5n = A04;
                    }
                    c1316Wj4 = this.A02.A04;
                    C0R A0D = c1316Wj4.A0D();
                    j12 = this.A02.A00;
                    A0D.A2j(L5.A01(j12), adErrorTypeFromCode.getErrorCode(), A5n, adErrorTypeFromCode.isPublicError());
                    this.A02.A0D(J3.A01(adErrorTypeFromCode, A5n));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String errorMessage = q1.getMessage();
            c1316Wj2 = this.A02.A04;
            C0R A0D2 = c1316Wj2.A0D();
            j11 = this.A02.A00;
            A0D2.A2j(L5.A01(j11), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
            this.A02.A0D(J3.A01(adErrorType, errorMessage));
        } catch (JSONException e10) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String message = q1.getMessage();
            c1316Wj = this.A02.A04;
            C0R A0D3 = c1316Wj.A0D();
            j10 = this.A02.A00;
            A0D3.A2j(L5.A01(j10), adErrorType2.getErrorCode(), A00(16, 15, 65) + e10.getMessage(), adErrorType2.isPublicError());
            this.A02.A0D(J3.A01(adErrorType2, message));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1144Pp
    public final void AAG(InterfaceC1142Pn interfaceC1142Pn) {
        JH.A05(A00(79, 10, 46), A00(52, 27, 18), A00(8, 8, 45));
        if (interfaceC1142Pn != null) {
            String A5n = interfaceC1142Pn.A5n();
            JS.A06(this.A01);
            this.A02.A0N(A5n, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1144Pp
    public final void AAd(Exception exc) {
        C1316Wj c1316Wj;
        long j10;
        JH.A05(A00(89, 7, 58), A00(31, 21, 53), A00(0, 8, 90));
        if (Q1.class.equals(exc.getClass())) {
            A02((Q1) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c1316Wj = this.A02.A04;
        C0R A0D = c1316Wj.A0D();
        j10 = this.A02.A00;
        A0D.A2j(L5.A01(j10), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0D(J3.A01(adErrorType, errorMessage));
    }
}
