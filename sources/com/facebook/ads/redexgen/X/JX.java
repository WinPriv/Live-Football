package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class JX {
    public static JX A00;
    public static byte[] A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C1216Sj A01(C1316Wj c1316Wj, JSONObject jSONObject, long j10) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONArray(A04(124, 10, 18)).getJSONObject(0);
        AnonymousClass83 anonymousClass83 = new AnonymousClass83(AnonymousClass84.A00(jSONObject2.getJSONObject(A04(88, 10, 63))), jSONObject2.optString(A04(103, 14, 70)), jSONObject2.optString(A04(0, 19, 98)));
        String A04 = A04(26, 3, 57);
        if (jSONObject2.has(A04)) {
            JSONArray jSONArray = jSONObject2.getJSONArray(A04);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                C0956Id.A06(c1316Wj, jSONObject3, j10, null);
                String optString = jSONObject3.optString(A04(19, 7, 39));
                String optString2 = jSONObject3.optString(A04(73, 15, 82));
                JSONObject optJSONObject = jSONObject3.optJSONObject(A04(51, 4, 3));
                JSONArray optJSONArray = jSONObject3.optJSONArray(A04(134, 8, 21));
                if (optJSONObject != null) {
                    anonymousClass83.A09(new AnonymousClass81(optString, optString2, optJSONObject, optJSONArray));
                } else {
                    c1316Wj.A0D().A4Z(AdErrorType.UNKNOWN_ERROR.getErrorCode(), A04(55, 18, 116));
                }
            }
        }
        return new C1216Sj(anonymousClass83, jSONObject.optString(A04(29, 18, 1)));
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, 113, 74, 103, 112, 101, 122, 103, 97, 124, 123, 114, 74, 118, 122, 123, 115, 124, 114, 49, 52, 49, 32, 36, 53, 34, 47, 42, 61, Ascii.ETB, Ascii.CAN, 41, 0, Ascii.ETB, Ascii.SUB, Ascii.US, Ascii.DC2, Ascii.ETB, 2, Ascii.US, Ascii.EM, Ascii.CAN, 41, 3, 3, Ascii.US, Ascii.DC2, 96, 108, 103, 102, Ascii.DLE, Ascii.NAK, 0, Ascii.NAK, 103, 98, 119, 98, 76, 97, 105, 102, 96, 119, 35, 106, 112, 35, 109, 118, 111, 111, 65, 68, 81, 68, 122, 72, 74, 65, 64, 73, 122, 81, 92, 85, 64, 44, 45, 46, 33, 38, 33, 60, 33, 39, 38, 69, 82, 82, 79, 82, 87, 84, 80, 69, 68, 67, 84, 110, 82, 94, 95, 87, 88, 86, 66, 74, 92, 92, 78, 72, 74, Ascii.NAK, 9, 4, 6, 0, 8, 0, Ascii.VT, 17, Ascii.SYN, Ascii.SYN, Ascii.DLE, 3, 1, 9, 7, Ascii.DLE, 17, 77, 64, 73, 92};
    }

    static {
        A05();
        A00 = new JX();
    }

    public static synchronized JX A00() {
        JX jx;
        synchronized (JX.class) {
            jx = A00;
        }
        return jx;
    }

    private C1215Si A02(JSONObject jSONObject) {
        return new C1215Si(jSONObject.optString(A04(117, 7, 88), A04(0, 0, 87)), jSONObject.optInt(A04(47, 4, 116), 0), null);
    }

    private C1215Si A03(JSONObject jSONObject) {
        try {
            JSONArray placements = jSONObject.getJSONArray(A04(124, 10, 18));
            JSONObject definition = placements.getJSONObject(0);
            AnonymousClass84 A002 = AnonymousClass84.A00(definition.getJSONObject(A04(88, 10, 63)));
            String featureConfig = definition.optString(A04(103, 14, 70));
            return new C1215Si(jSONObject.optString(A04(117, 7, 88), A04(0, 0, 87)), jSONObject.optInt(A04(47, 4, 116), 0), new AnonymousClass83(A002, featureConfig, definition.optString(A04(0, 19, 98))));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    public final JZ A06(C1316Wj c1316Wj, String str, long j10) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(A04(142, 4, 78));
            char c10 = 65535;
            int hashCode = optString.hashCode();
            String A04 = A04(98, 5, 87);
            if (hashCode != 96432) {
                if (hashCode == 96784904 && optString.equals(A04)) {
                    c10 = 1;
                }
            } else if (optString.equals(A04(26, 3, 57))) {
                c10 = 0;
            }
            if (c10 == 0) {
                return A01(c1316Wj, jSONObject, j10);
            }
            if (c10 != 1) {
                JSONObject jsonResponse = jSONObject.optJSONObject(A04);
                if (jsonResponse != null) {
                    return A02(jsonResponse);
                }
            } else {
                return A03(jSONObject);
            }
        }
        return new JZ(JY.A04);
    }
}
