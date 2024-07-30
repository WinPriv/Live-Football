package com.facebook.ads.redexgen.X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1094Nr extends WebChromeClient {
    public static byte[] A01;
    public final /* synthetic */ C1099Nw A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-41, -44, -39, -48, -71, -32, -40, -51, -48, -35, 83, 75, 89, 89, 71, 77, 75, 68, 64, 70, 67, 52, 54, Ascii.SUB, 53};
    }

    public C1094Nr(C1099Nw c1099Nw) {
        this.A00 = c1099Nw;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C0954Ib c0954Ib;
        C1087Nj c1087Nj;
        C1316Wj c1316Wj;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 123), consoleMessage.message());
                jSONObject.put(A00(0, 10, 0), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 102), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            c0954Ib = this.A00.A0D;
            c0954Ib.A02(EnumC0953Ia.A0N, null);
            c1087Nj = this.A00.A0E;
            c1087Nj.A04(C06977l.A14, jSONObject2);
            c1316Wj = this.A00.A0B;
            c1316Wj.A0D().A4y(jSONObject2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
