package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class O7 {
    public static byte[] A08;
    public WeakReference<C1099Nw> A00;
    public WeakReference<RH> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C1316Wj A03;
    public final C1087Nj A04;
    public final String A05;
    public final String A06;
    public final WeakReference<IT> A07;

    static {
        A09();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, Ascii.VT, Ascii.FF, 7, Ascii.ESC, Ascii.DC2, Ascii.SUB, 63, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, Ascii.FF, Ascii.ESC, Ascii.DC4, Ascii.DC4, Ascii.VT, Ascii.DC2, 5, 19, Ascii.VT, Ascii.EM, Ascii.EM, 7, Ascii.CR, Ascii.VT, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, 63, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, 63, Ascii.ESC, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public O7(C1316Wj c1316Wj, C1099Nw c1099Nw, IT it, C1087Nj c1087Nj, String str, String str2) {
        this.A03 = c1316Wj;
        this.A00 = new WeakReference<>(c1099Nw);
        this.A07 = new WeakReference<>(it);
        this.A04 = c1087Nj;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        RH uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
    }

    private void A05() {
        RH uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A7z();
    }

    private void A06() {
        RH uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8e();
    }

    private void A07() {
        this.A03.A0D().A4t();
        this.A02 = true;
        RH uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AEt();
        if (ID.A1K(this.A03)) {
            this.A03.A09().AAN();
        }
    }

    private void A08() {
        RH uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.AAl();
    }

    private void A0A(C1099Nw c1099Nw, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = C0983Jf.A00(this.A03);
        String A01 = A01(0, 0, 21);
        String storageValue = jSONObject.optString(A01(57, 5, 81), A01);
        String opId = A01(54, 3, 10);
        String key = jSONObject.optString(opId, A01(7, 7, 50));
        String string = A00.getString(A01(14, 4, 103) + key, A01);
        if (string != null) {
            A01 = string;
        }
        c1099Nw.A0g(storageValue, A01);
    }

    private void A0B(C1099Nw c1099Nw, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01(98, 5, 12), A01);
        String optString2 = jSONObject.optString(A01(57, 5, 81), A01);
        String optString3 = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        C0983Jf.A00(this.A03).edit().putString(A01(14, 4, 103) + optString3, optString).apply();
        c1099Nw.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(O5 o52, String str) throws JSONException {
        switch (o52) {
            case A0A:
                A0I(new JSONObject(str));
                break;
            case A0E:
                A06();
                break;
            case A03:
                A04();
                break;
            case A0D:
                A07();
                break;
            case A09:
                A0K(new JSONObject(str));
                break;
            case A0H:
                A0L(new JSONObject(str));
                break;
            case A04:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case A0M:
                A05();
            case A07:
                this.A03.A0D().A55(str);
                break;
            case A0C:
            case A0N:
            case A0K:
            case A0J:
            case A0G:
                A0D(o52, str);
                break;
            case A0B:
                A0J(new JSONObject(str));
                break;
            case A08:
                A08();
                break;
            case A0I:
                A0M(new JSONObject(str));
                break;
        }
        C1099Nw c1099Nw = this.A00.get();
        if (c1099Nw == null) {
            return;
        }
        switch (o52) {
            case A06:
                c1099Nw.A0S();
                return;
            case A05:
                c1099Nw.A0R();
                return;
            case A0P:
                A0B(c1099Nw, str);
                return;
            case A0L:
                A0A(c1099Nw, str);
                return;
            case A0F:
                c1099Nw.A0i(A03(new JSONObject(str)));
                return;
            default:
                return;
        }
    }

    private void A0D(O5 o52, String str) throws JSONException {
        RH rh = this.A01.get();
        if (rh == null) {
            return;
        }
        switch (o52) {
            case A0C:
                rh.AAp();
                return;
            case A0N:
                rh.ACE();
                return;
            case A0K:
                A0G(rh, str);
                return;
            case A0J:
                A0F(rh, str);
                return;
            case A0G:
                A0E(rh, str);
                return;
            default:
                return;
        }
    }

    private void A0E(RH rh, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 108);
        rh.ABT(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(RH rh, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 118);
        rh.ACh(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(RH rh, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 82);
        rh.ACj(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        RH rh = this.A01.get();
        if (rh == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(productUrl)) {
            rh.A7u();
        } else {
            rh.A7v(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        RH uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        IT it = this.A07.get();
        if (it == null) {
            return;
        }
        String optString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        new C0954Ib(this.A06, it).A03(optString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (optInt == -1) {
            return;
        }
        String optString = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.A03.A0D().A8s(optInt, optString);
    }

    private void A0M(JSONObject jSONObject) {
        String optString;
        RH rh = this.A01.get();
        if (rh == null || (optString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        rh.ACw(optString);
    }

    public final void A0N(RH rh) {
        this.A01 = new WeakReference<>(rh);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        L8.A00(new O3(this, str));
    }
}
