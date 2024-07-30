package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class O3 implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ O7 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{108, 64, 90, 67, 75, Ascii.SI, 65, 64, 91, Ascii.SI, 95, 78, 93, 92, 74, Ascii.SI, 92, 74, 93, 89, 74, 93, Ascii.SI, 66, 74, 92, 92, 78, 72, 74, 123, 76, 76, 81, 76, Ascii.RS, 78, 95, 76, 77, 87, 80, 89, Ascii.RS, 116, 109, 113, 112, Ascii.RS, 87, 80, Ascii.RS, 78, 81, 77, 74, 115, 91, 77, 77, 95, 89, 91, Ascii.RS, 103, 115, 114, 110, 77, 99, Ascii.DEL, 32, 61, 49, 55, 36, Ascii.SUB, 33, 36, 49, 36, 108, 97, 104, 125, Ascii.FS, Ascii.SUB};
    }

    public O3(O7 o72, String str) {
        this.A00 = o72;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1087Nj c1087Nj;
        String str;
        C1087Nj c1087Nj2;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                str = this.A00.A05;
                if (str.equals(jSONObject.optString(A00(64, 7, 47)))) {
                    this.A00.A0C(O5.A00(jSONObject.optString(A00(81, 4, 49))), jSONObject.optString(A00(71, 10, 108), A00(85, 2, 78)));
                } else {
                    c1087Nj2 = this.A00.A04;
                    c1087Nj2.A04(C06977l.A11, A00(0, 30, 6));
                }
            } catch (JSONException e10) {
                c1087Nj = this.A00.A04;
                c1087Nj.A04(C06977l.A15, A00(30, 34, 23) + e10.getMessage());
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
