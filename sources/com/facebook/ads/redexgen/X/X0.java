package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class X0 extends AbstractRunnableC0997Ju {
    public static byte[] A01;
    public final /* synthetic */ C06505g A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{62, 44, 44, 58, 43, 44};
    }

    public X0(C06505g c06505g) {
        this.A00 = c06505g;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        Handler handler;
        JSONObject jSONObject;
        C6G c6g;
        String str;
        String str2;
        try {
            jSONObject = this.A00.A05;
            JSONArray jSONArray = jSONObject.getJSONArray(A00(0, 6, 77));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C06485e assetData = C06485e.A00(jSONArray.getJSONObject(i10));
                this.A00.A09(assetData.A04, assetData);
            }
            c6g = this.A00.A02;
            X2 x22 = new X2(this);
            str = this.A00.A04;
            str2 = this.A00.A03;
            c6g.A0W(x22, new AnonymousClass69(str, str2));
        } catch (JSONException unused) {
            handler = this.A00.A00;
            handler.post(new X1(this));
        }
    }
}
