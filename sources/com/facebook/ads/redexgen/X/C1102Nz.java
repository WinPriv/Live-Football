package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1102Nz {
    public static byte[] A00;
    public static String[] A01 = {"CXRchRuqobcH0303RF", "0PvsG2xJSmQLgGTcWH9EYe7sEgRs7pRt", "Ep2muPcKb5OPprn584rkOKVS7ZwPor7u", "ESdTFl6hgzo0PrNou", "ifIc3126Iu24LMQAqXU9MKX3mrrg1qWL", "gYyPZy3RrUjZ7", "cRp6DEQTFSLuVCLvwOm8", "Iag0U1Rq9Q0ZydVPffrz8fjunI2ky4CH"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Nullable
    @RequiresApi(api = 21)
    public static WebResourceResponse A00(C1316Wj c1316Wj, WebResourceRequest webResourceRequest, Uri uri, String str, HashMap<String, String> hashMap) throws IOException {
        String A02;
        String A022 = A02(85, 5, 49);
        GP A0F = PW.A05(c1316Wj.A00()).A0F(c1316Wj);
        C6G.A0H(c1316Wj, uri.toString());
        try {
            O0 o02 = new O0(c1316Wj.A00(), uri, A0F);
            int available = o02.available();
            if (available <= 0) {
                A05(c1316Wj, 1, new Pair[]{new Pair(A02(61, 9, 77), String.valueOf(available))});
                return null;
            }
            String A03 = A03(webResourceRequest.getRequestHeaders());
            if (A03 == null) {
                c1316Wj.A0D().A52();
                A06(hashMap, available);
                return new WebResourceResponse(str, null, 200, A02(44, 2, 15), hashMap, o02);
            }
            try {
                C1101Ny A012 = A01(A03);
                if (!A012.A03) {
                    Pair[] pairArr = new Pair[1];
                    if (A012.A02 != null) {
                        A02 = A012.A02;
                    } else {
                        if (A01[2].charAt(11) != 'P') {
                            throw new RuntimeException();
                        }
                        A01[0] = "OMRpqA07uUbGIz9l3e";
                        A02 = A02(90, 4, 76);
                    }
                    pairArr[0] = new Pair(A02(94, 5, 44), A02);
                    A05(c1316Wj, 0, pairArr);
                    return null;
                }
                int i10 = A012.A01;
                int i11 = A012.A00 == -1 ? available - 1 : A012.A00;
                A06(hashMap, available);
                hashMap.put(A02(31, 13, 81), A02(75, 6, 17) + i10 + A02(1, 1, 52) + i11 + A02(2, 1, 110) + available);
                c1316Wj.A0D().A52();
                return new WebResourceResponse(str, null, 206, A02(46, 15, 36), hashMap, o02);
            } catch (NumberFormatException e10) {
                A05(c1316Wj, 3, new Pair[]{new Pair(A022, e10.toString())});
                return null;
            }
        } catch (IOException e11) {
            A05(c1316Wj, 2, new Pair[]{new Pair(A022, e11.toString())});
            return null;
        }
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 91);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-119, -68, -8, -14, -50, -16, -16, -14, -3, 1, -70, -33, -18, -5, -12, -14, 0, -46, -2, -3, 3, -12, -3, 3, -68, -37, -12, -3, -10, 3, -9, -17, Ascii.ESC, Ascii.SUB, 32, 17, Ascii.SUB, 32, -39, -2, Ascii.CR, Ascii.SUB, 19, 17, -71, -75, -49, -32, -15, -13, -24, -32, -21, -97, -62, -18, -19, -13, -28, -19, -13, 9, Ascii.RS, 9, 17, Ascii.DC4, 9, 10, Ascii.DC4, Ascii.CR, -7, Ascii.DLE, Ascii.VT, -4, 10, -50, -27, -32, -47, -33, -116, 4, Ascii.DLE, 5, 6, -15, -2, -2, -5, -2, Ascii.NAK, Ascii.FS, 19, 19, -7, -24, -11, -18, -20};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A05(C1316Wj c1316Wj, int i10, Pair<String, String>[] pairArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(81, 4, 70), i10);
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        c1316Wj.A0D().A51(jSONObject.toString());
    }

    static {
        A04();
    }

    @RequiresApi(api = 21)
    public static C1101Ny A01(String str) {
        if (str == null) {
            C1101Ny parseResult = new C1101Ny();
            parseResult.A03 = false;
            parseResult.A02 = null;
            return parseResult;
        }
        String[] split = str.split(A02(3, 1, 90));
        if (split.length >= 2) {
            if (A02(70, 5, 60).equals(split[0].toLowerCase(Locale.US).trim())) {
                if (split[1].trim().split(A02(0, 1, 2)).length != 1) {
                    C1101Ny c1101Ny = new C1101Ny();
                    c1101Ny.A03 = false;
                    c1101Ny.A02 = str;
                    return c1101Ny;
                }
                String[] ranges = split[1].trim().split(A02(1, 1, 52));
                C1101Ny c1101Ny2 = new C1101Ny();
                c1101Ny2.A03 = true;
                c1101Ny2.A02 = str;
                c1101Ny2.A01 = TextUtils.isEmpty(ranges[0]) ? 0 : Integer.parseInt(ranges[0]);
                if (ranges.length > 1) {
                    c1101Ny2.A00 = TextUtils.isEmpty(ranges[1]) ? -1 : Integer.parseInt(ranges[1]);
                } else {
                    c1101Ny2.A00 = -1;
                }
                return c1101Ny2;
            }
        }
        C1101Ny c1101Ny3 = new C1101Ny();
        c1101Ny3.A03 = false;
        c1101Ny3.A02 = str;
        return c1101Ny3;
    }

    @Nullable
    public static String A03(Map<String, String> map) {
        for (String str : map.keySet()) {
            if (A02(94, 5, 44).equals(str.toLowerCase(Locale.US))) {
                return map.get(str);
            }
        }
        return null;
    }

    public static void A06(HashMap<String, String> hashMap, int i10) {
        hashMap.put(A02(4, 13, 50), A02(70, 5, 60));
        hashMap.put(A02(17, 14, 52), String.valueOf(i10));
    }
}
