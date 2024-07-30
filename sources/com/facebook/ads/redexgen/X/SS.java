package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.EditText;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public class SS implements LT {
    public static byte[] A04;
    public static String[] A05 = {"ZQ30B3g1EnWzQxn3crjjGmBLF8czgnrz", "nRJ0geoMgiM0DOpSqitarteTb49iW4bu", "zkGhqanHWGORl0FJV2wFc9MBhnbxSqBt", "Ydk0P72aTQrHa0LOhdAcfW", "R4envBHR3aj", "p22B9bEQtnR9xLSz", "XdKDLLdRQiXAjT4HFpZKaT6yuzMG741E", "BfaY"};
    public C1315Wi A00;
    public AnonymousClass83 A01;
    public InterfaceC1143Po A02;
    public final Executor A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ a.R);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{107, 110, 110, 104, 109, 96, 104, 106, 111, 107, 106, 105, 110, 104, 107, 64, 75, 69, 66, 65, 71, 70, 64, 66, 74, 74, 71, 70, 65, 70, 64, 79, 69, 79, 67, 69, 79, 66, 70, 79, 79, 65, 79, 70, 71, 10, 79, Ascii.DC4, Ascii.DLE, 68, 79, Ascii.ETB, 71, Ascii.DLE, 68, 65, 66, 67, 65, 66, 64, Ascii.ETB, 64, Ascii.NAK, 64, 70, Ascii.DC2, 65, 70, 65, Ascii.DLE, 67, Ascii.DC4, Ascii.NAK, 68, 69, Ascii.NAK, 68, 116, 86, 89, 84, 82, 91, Ascii.RS, 50, 42, 115, 60, 39, 59, 54, 33, 32, 115, 63, 60, 52, 58, 61, 115, 50, 32, 115, 42, 60, 38, 115, 39, 60, 115, 55, 54, 49, 38, 52, 108, 115, Ascii.ESC, 60, 36, 115, 55, 60, 115, 42, 60, 38, 115, 33, 54, 35, 33, 60, 55, 38, 48, 54, 115, 39, 59, 54, 115, 58, 32, 32, 38, 54, 108, 83, 101, 110, 100, 32, 82, 101, 112, 111, 114, 116, 52, Ascii.VT, 2, Ascii.ETB, 67, 43, 2, 19, 19, 6, Ascii.CR, 6, 7, 92, Ascii.ESC, Ascii.EM, Ascii.EM, Ascii.US, 9, 9, 37, Ascii.SO, Ascii.NAK, 17, Ascii.US, Ascii.DC4, Ascii.SO, Ascii.FF, Ascii.EM, 8, 10, 2, Ascii.US, Ascii.DC4, 50, 4, 9, 42, 37, 32, 44, 39, 61, Ascii.SYN, 61, 32, 36, 44, 90, 85, 80, 92, 87, 77, 102, 77, 86, 82, 92, 87, 108, 96, 97, 105, 102, 104, 80, 102, 107, 32, 33, 55, 39, 54, 45, 52, 48, 45, 43, 42, 61, 53, 36, 49, 52, 49, 36, 49, 116, 112, 106, 122, 70, 112, 119, Ascii.DEL, 118, 106, 108, 122, 109, 64, 118, 123, 122, 113, 107, 118, 121, 118, 122, 109};
    }

    static {
        A06();
    }

    public SS(Executor executor, AnonymousClass83 anonymousClass83, C1316Wj c1316Wj) {
        this.A00 = c1316Wj.A00();
        this.A02 = Q6.A01(this.A00);
        this.A03 = executor;
        this.A01 = anonymousClass83;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A04(String str) {
        Q2 q22 = new Q2();
        Q2 q23 = new Q2();
        Q2 q24 = new Q2();
        q22.put(A02(257, 15, 96), C06625s.A00().A03());
        q22.put(A02(220, 9, 112), A02(15, 15, 13));
        q22.put(A02(186, 11, 18), A02(0, 15, 38));
        q22.put(A02(174, 12, 5), A02(30, 48, 9));
        q22.put(A02(197, 11, 54), (System.currentTimeMillis() / 1000) + A02(0, 0, 125));
        String A07 = this.A01.A07();
        if (A07 != null) {
            q24.put(A02(208, 12, 70), A07);
        }
        if (A05[2].charAt(28) != 'S') {
            throw new RuntimeException();
        }
        A05[1] = "6c1y5rO2F72616lTK87Vm3xCzjJjlGKf";
        q23.put(A02(229, 11, 59), str);
        String clientToken = C1010Kj.A01(q24);
        q23.put(A02(248, 9, 102), clientToken);
        String clientToken2 = C1010Kj.A01(q23);
        q22.A04(A02(240, 8, 47), clientToken2);
        return q22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnonymousClass83 anonymousClass83) {
        this.A01 = anonymousClass83;
    }

    @Override // com.facebook.ads.redexgen.X.LT
    public final void ACD() {
        Activity A00 = ActivityUtils.A00();
        if (A00 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(A00);
        builder.setTitle(A02(160, 14, 28));
        EditText editText = new EditText(A00);
        editText.setSingleLine(false);
        editText.setImeOptions(1073741824);
        editText.setHint(A02(84, 65, 44));
        editText.setMaxLines(2);
        editText.setMinLines(2);
        builder.setView(editText);
        builder.setNegativeButton(A02(78, 6, 72), new LQ(this));
        builder.setPositiveButton(A02(149, 11, a.R), new LR(this, editText));
        builder.create().show();
    }
}
