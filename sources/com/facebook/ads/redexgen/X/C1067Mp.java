package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1067Mp extends WebViewClient {
    public static byte[] A04;
    public WeakReference<InterfaceC1065Mn> A00 = new WeakReference<>(null);
    public final WeakReference<C1316Wj> A01;
    public final WeakReference<InterfaceC1064Mm> A02;
    public final WeakReference<C1061Mj> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{54, 55, 68, 74, 73, Ascii.SI, 55, 65, 54, 67, 64, 39, 52, 37, 39, 41, 58, 47, 60, 47, 58, 63, 51, 64, 54, 68, 65, 59, 54, 0, 59, 64, 70, 55, 64, 70, 0, 51, 53, 70, 59, 65, 64, 0, 40, Ascii.ESC, Ascii.ETB, 41, 9, Ascii.SYN, Ascii.FF, Ascii.SUB, Ascii.ETB, 17, Ascii.FF, -42, 17, Ascii.SYN, Ascii.FS, Ascii.CR, Ascii.SYN, Ascii.FS, -42, Ascii.VT, 9, Ascii.FS, Ascii.CR, Ascii.SI, Ascii.ETB, Ascii.SUB, 33, -42, -22, -6, -9, -1, -5, -23, -22, -12, -19, 7, Ascii.ETB, Ascii.DC4, Ascii.FS, Ascii.CAN, 10, Ascii.ETB, 4, Ascii.VT, 6, 17, 17, 7, 6, 8, Ascii.DLE, 4, Ascii.SUB, Ascii.ETB, 17, -54, -57, -38, -57, 49, 54, 60, 45, 54, 60, -36, -39, -45, -95, -121, -30, -48, -51, -54, -31, -44, -48, -30};
    }

    public C1067Mp(WeakReference<C1316Wj> weakReference, WeakReference<InterfaceC1064Mm> weakReference2, WeakReference<C1061Mj> weakReference3) {
        this.A01 = weakReference;
        this.A02 = weakReference2;
        this.A03 = weakReference3;
    }

    private void A02(String str, C1316Wj c1316Wj) {
        c1316Wj.A06().A8u(A00(11, 11, 101), C06977l.A09, new C06987m(A00(111, 5, 6) + str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
    
        if (r0.contains(r1) == false) goto L61;
     */
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A03(android.webkit.WebView r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1067Mp.A03(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void A04(WeakReference<InterfaceC1065Mn> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C1061Mj timingLogger = this.A03.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC1064Mm interfaceC1064Mm = this.A02.get();
        if (interfaceC1064Mm != null) {
            interfaceC1064Mm.ABa(str);
        }
        InterfaceC1065Mn interfaceC1065Mn = this.A00.get();
        if (interfaceC1065Mn != null) {
            interfaceC1065Mn.AA4(webView.canGoBack());
            interfaceC1065Mn.AAj(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC1064Mm listener = this.A02.get();
        if (listener != null) {
            listener.ABc(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        C1316Wj c1316Wj = this.A01.get();
        if (c1316Wj != null) {
            StringBuilder sb2 = new StringBuilder();
            String A00 = A00(0, 0, 27);
            sb2.append(A00);
            sb2.append(str);
            String errorMessage = C1008Kh.A01(i10, sb2.toString(), A00 + str2);
            c1316Wj.A0D().A89(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1316Wj c1316Wj = this.A01.get();
        if (c1316Wj != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb2 = new StringBuilder();
            String A00 = A00(0, 0, 27);
            sb2.append(A00);
            sb2.append((Object) webResourceError.getDescription());
            String errorMessage = C1008Kh.A01(errorCode, sb2.toString(), A00 + webResourceRequest.getUrl());
            c1316Wj.A0D().A89(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1316Wj context = this.A01.get();
        if (context != null) {
            context.A0D().A8A();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1316Wj context = this.A01.get();
        if (context != null) {
            context.A0D().A8B();
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1070Ms.A02(C06977l.A2b);
        InterfaceC1064Mm listener = this.A02.get();
        if (listener != null) {
            listener.AC0();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
