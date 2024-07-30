package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1095Ns extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"hfMJ0frXuRQdVVGg5HhbkedMp84qvG2m", "353suYezQm1X4xGGmKd", "JSegO1TQToLz4SD5sG2", "wzs2neDsiDlXGMSMfb3", "O6PuLNBrYuNMqKQgURK12L6N", "9iUPqfJGnhoj94eJuJeS1Wm6njk1Rmvr", "BdwoSzPq3MvWa04biSMwYNzp8DFOBLqT", "enVVpEgx3aC4K8YdK2hdvlOQVko"};
    public final /* synthetic */ C1099Nw A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, 4, Ascii.DC2, 2, 17, 8, Ascii.SI, 19, 8, Ascii.SO, Ascii.CR, -11, -6, -11, -44, 3, -14, 4, -7, Ascii.CR, Ascii.SUB, Ascii.SUB, Ascii.ETB, Ascii.SUB, -21, Ascii.ETB, Ascii.FF, Ascii.CR, 48, 43, 64, 51, 45, 57, 56, -8, 51, 45, 57, 39, 51, 51, 47, Ascii.RS, 36, 49, 49, 46, 49, 71, 73, 64, 70, 73, 64, 75, 80, -4, -7, -13};
    }

    static {
        A01();
    }

    public C1095Ns(C1099Nw c1099Nw) {
        this.A00 = c1099Nw;
    }

    private void A02(int i10, String str, String str2, boolean z10) {
        C0954Ib c0954Ib;
        C1316Wj c1316Wj;
        C1087Nj c1087Nj;
        if (z10) {
            this.A00.A0S();
        }
        c0954Ib = this.A00.A0D;
        c0954Ib.A02(EnumC0953Ia.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 44), i10);
            jSONObject.put(A00(0, 11, 35), str);
            jSONObject.put(A00(57, 3, 11), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1316Wj = this.A00.A0B;
        c1316Wj.A0D().A53(jSONObject2);
        c1087Nj = this.A00.A0E;
        c1087Nj.A04(C06977l.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C0954Ib c0954Ib;
        C1316Wj c1316Wj;
        long j10;
        InterfaceC1097Nu interfaceC1097Nu;
        InterfaceC1097Nu interfaceC1097Nu2;
        c0954Ib = this.A00.A0D;
        c0954Ib.A02(EnumC0953Ia.A0R, null);
        c1316Wj = this.A00.A0B;
        C0R A0D = c1316Wj.A0D();
        j10 = this.A00.A00;
        A0D.A54(L5.A01(j10));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        interfaceC1097Nu = this.A00.A03;
        if (interfaceC1097Nu == null) {
            return;
        }
        interfaceC1097Nu2 = this.A00.A03;
        interfaceC1097Nu2.ACp();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i10, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb2 = new StringBuilder();
        String A00 = A00(0, 0, 48);
        sb2.append(A00);
        sb2.append((Object) webResourceError.getDescription());
        A02(errorCode, sb2.toString(), A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i10;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 78))) {
            return;
        }
        if (webResourceResponse != null) {
            i10 = webResourceResponse.getStatusCode();
        } else {
            i10 = -1;
        }
        A02(i10, A00(39, 10, 67), A00(0, 0, 48) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C1316Wj c1316Wj;
        AnonymousClass18 anonymousClass18;
        InterfaceC1098Nv interfaceC1098Nv;
        InterfaceC1098Nv interfaceC1098Nv2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 21), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 91), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String message = jSONObject.toString();
        c1316Wj = this.A00.A0B;
        c1316Wj.A0D().A4z(message);
        anonymousClass18 = this.A00.A09;
        C1100Nx.A04(anonymousClass18.A0Z());
        interfaceC1098Nv = this.A00.A04;
        if (interfaceC1098Nv == null) {
            return true;
        }
        interfaceC1098Nv2 = this.A00.A04;
        String[] strArr = A02;
        String message2 = strArr[1];
        if (message2.length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A02[0] = "kv0KfCNN1XAdbICEJBZwu3dTiw7XNBbg";
        interfaceC1098Nv2.ABr();
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    @RequiresApi(api = 21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C1316Wj c1316Wj;
        C6G c6g;
        O8 o82;
        AnonymousClass18 anonymousClass18;
        c1316Wj = this.A00.A0B;
        c6g = this.A00.A0A;
        o82 = this.A00.A0H;
        anonymousClass18 = this.A00.A09;
        return OA.A00(c1316Wj, c6g, webResourceRequest, o82, anonymousClass18.A0n());
    }
}
