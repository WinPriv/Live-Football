package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07027q {
    public static byte[] A00;
    public static String[] A01 = {"a6IxlCkVmcf1QOD6ZYjDV7INHBfwC5pE", "pjHGmgbtiOqji60ouNqSwKm8iDwdL2il", "jT1wBn6CKnjHaXeX1", "64rNhN6ZFhDWGxpIQ", "ze8vByysvbBiliYVuotBM6Di85tpEUzv", "oRRmyqjSmqskFAvbDRZ10d57ZrKFDjEI", "44vbl6FfanMIMy7ytQNCDD1eXfOrnFTF", "rkbwsxy0OcV7GrP7ELmdkRDeQR2uGuGh"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            if (A01[1].charAt(1) == 'a') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "1M2Y98BwTvEPUGLlCwxj254fliWahs1n";
            strArr[0] = "azYACSqPfJkxfvivKERNz1YXvsYHtm8K";
            copyOfRange[i13] = (byte) (i14 - 68);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-47, -12, -20, -20, -18, -13, -20, -91, -45, -22, -7, -4, -12, -9, -16, -91, -54, -5, -22, -13, -7, -52, -35, -38, -55, -36, -47, -41, -42, Ascii.FS, 41, 41, 38, 41, -9, 3, 3, -1, -18, 2, 3, -16, 3, 4, 2, -18, -14, -2, -13, -12, Ascii.SYN, Ascii.CR, Ascii.FS, Ascii.US, Ascii.ETB, Ascii.SUB, 19, -38, -53, -29, -42, -39, -53, -50, -55, -35, -45, -28, -49, Ascii.SI, Ascii.DLE, -3, Ascii.SO, Ascii.DLE, -5, Ascii.DLE, 5, 9, 1, -40, -45, -49, -46, -60, -57, -62, -42, -52, -35, -56};
    }

    static {
        A02();
    }

    public static JSONObject A01(C7G c7g, long j10, long j11, long j12, long j13, int i10, @Nullable Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(A00(69, 10, 88), j10);
                try {
                    jSONObject.put(A00(21, 8, 36), j11 / 1000.0d);
                    try {
                        jSONObject.put(A00(57, 12, 38), j12);
                        try {
                            jSONObject.put(A00(79, 11, 31), j13);
                            try {
                                jSONObject.put(A00(34, 16, 75), i10);
                                if (exc != null) {
                                    jSONObject.put(A00(29, 5, 115), exc.getMessage());
                                }
                            } catch (JSONException e10) {
                                e = e10;
                                c7g.A06().A3R(e);
                                return jSONObject;
                            }
                        } catch (JSONException e11) {
                            e = e11;
                        }
                    } catch (JSONException e12) {
                        e = e12;
                    }
                } catch (JSONException e13) {
                    e = e13;
                }
            } catch (JSONException e14) {
                e = e14;
            }
        } catch (JSONException e15) {
            e = e15;
        }
        return jSONObject;
    }

    public static void A03(C7G c7g, long j10, long j11, long j12, long j13, int i10, @Nullable Exception exc) {
        C06987m c06987m = new C06987m(A00(0, 21, 65));
        c06987m.A03(1);
        c06987m.A05(A01(c7g, j10, j11, j12, j13, i10, exc));
        c7g.A06().A9K(A00(50, 7, 100), C06977l.A1z, c06987m);
    }
}
