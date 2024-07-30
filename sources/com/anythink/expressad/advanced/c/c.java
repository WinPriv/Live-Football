package com.anythink.expressad.advanced.c;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.foundation.h.o;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f6848a = "ResManager";

    /* renamed from: b, reason: collision with root package name */
    private static int f6849b = 1;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    private static com.anythink.expressad.foundation.d.c a(com.anythink.expressad.foundation.d.c cVar) {
        if (TextUtils.isEmpty(cVar.c()) && (TextUtils.isEmpty(cVar.d()) || !cVar.d().contains("<MBTPLMARK>"))) {
            cVar.a(false);
            cVar.b(true);
        } else {
            cVar.a(true);
            cVar.b(false);
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r0 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.anythink.expressad.advanced.view.ATNativeAdvancedView r12, com.anythink.expressad.foundation.d.c r13, java.lang.String r14, java.lang.String r15, int r16, com.anythink.expressad.advanced.c.c.a r17) {
        /*
            r7 = r12
            r8 = 0
            if (r13 == 0) goto Le0
            r12.clearResState()
            java.lang.String r0 = r13.S()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r9 = 1
            if (r0 != 0) goto L24
            com.anythink.expressad.videocommon.b.e r0 = com.anythink.expressad.videocommon.b.e.a()
            r1 = 298(0x12a, float:4.18E-43)
            boolean r2 = r13.A()
            r10 = r15
            boolean r0 = r0.a(r1, r15, r2)
            if (r0 == 0) goto L29
            goto L26
        L24:
            r10 = r15
            r0 = r9
        L26:
            r12.setVideoReady(r9)
        L29:
            r11 = r0
            java.lang.String r0 = r13.I()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4f
            boolean r0 = r12.isEndCardReady()
            if (r0 != 0) goto L4f
            com.anythink.expressad.videocommon.b.i r0 = com.anythink.expressad.videocommon.b.i.a()
            java.lang.String r1 = r13.I()
            java.lang.String r0 = r0.c(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4f
            r12.setEndCardReady(r9)
        L4f:
            java.lang.String r0 = r13.c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L91
            boolean r0 = r12.isH5Ready()
            if (r0 != 0) goto L91
            com.anythink.expressad.videocommon.b.i r0 = com.anythink.expressad.videocommon.b.i.a()
            java.lang.String r1 = r13.c()
            java.lang.String r1 = r0.c(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L8e
            java.lang.String r0 = r13.Z()
            boolean r0 = com.anythink.expressad.advanced.a.a.b(r0)
            if (r0 == 0) goto L81
            r12.setH5Ready(r9)
            r0 = r8
            r11 = r9
            goto L92
        L81:
            r0 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            a(r0, r1, r2, r3, r4, r5, r6)
            r0 = r9
            goto L92
        L8e:
            r0 = r8
            r11 = r0
            goto L92
        L91:
            r0 = r8
        L92:
            java.lang.String r1 = r13.c()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lde
            java.lang.String r1 = r13.d()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lde
            boolean r1 = r12.isH5Ready()
            if (r1 != 0) goto Lde
            java.lang.String r1 = r13.d()
            java.lang.String r1 = a(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Le1
            java.lang.String r2 = r13.Z()
            boolean r2 = com.anythink.expressad.advanced.a.a.b(r2)
            if (r2 == 0) goto Ld2
            r12.setH5Ready(r9)
            boolean r1 = r13.H()
            if (r1 == 0) goto Ld0
            r12.setVideoReady(r9)
        Ld0:
            r8 = r9
            goto Le1
        Ld2:
            r0 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            a(r0, r1, r2, r3, r4, r5, r6)
            r0 = r9
        Lde:
            r8 = r11
            goto Le1
        Le0:
            r0 = r8
        Le1:
            if (r8 == 0) goto Le8
            if (r0 != 0) goto Le8
            r17.a()
        Le8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.advanced.c.c.a(com.anythink.expressad.advanced.view.ATNativeAdvancedView, com.anythink.expressad.foundation.d.c, java.lang.String, java.lang.String, int, com.anythink.expressad.advanced.c.c$a):boolean");
    }

    private static void a(ATNativeAdvancedView aTNativeAdvancedView, String str, com.anythink.expressad.foundation.d.c cVar, String str2, String str3, int i10) {
        a(aTNativeAdvancedView, str, cVar, str2, str3, i10, null);
    }

    private static void a(final ATNativeAdvancedView aTNativeAdvancedView, final String str, final com.anythink.expressad.foundation.d.c cVar, String str2, String str3, int i10, final a aVar) {
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(aTNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(i10);
        aTNativeAdvancedView.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        final ATNativeAdvancedWebview advancedNativeWebview = aTNativeAdvancedView.getAdvancedNativeWebview();
        System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new com.anythink.expressad.atsignalcommon.a.b() { // from class: com.anythink.expressad.advanced.c.c.1
            @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
            public final void onPageFinished(WebView webView, String str4) {
                super.onPageFinished(webView, str4);
                if (!com.anythink.expressad.foundation.d.c.this.s()) {
                    com.anythink.expressad.advanced.a.a.a(com.anythink.expressad.foundation.d.c.this.Z());
                    aTNativeAdvancedView.setH5Ready(true);
                    o.a("WindVaneWebView", "======渲染成功：finish");
                }
                NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
            }

            @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
            public final void onReceivedError(WebView webView, int i11, String str4, String str5) {
                super.onReceivedError(webView, i11, str4, str5);
                aTNativeAdvancedView.setH5Ready(false);
                o.a("WindVaneWebView", "======渲染失败");
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                aTNativeAdvancedView.setH5Ready(false);
                o.a("WindVaneWebView", "======渲染失败");
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
            public final void readyState(WebView webView, int i11) {
                super.readyState(webView, i11);
                if (i11 == 1) {
                    com.anythink.expressad.advanced.a.a.a(com.anythink.expressad.foundation.d.c.this.Z());
                    aTNativeAdvancedView.setH5Ready(true);
                    o.a("WindVaneWebView", "======渲染成功：ready");
                } else {
                    aTNativeAdvancedView.setH5Ready(false);
                    o.a("WindVaneWebView", "======渲染失败");
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        });
        if (!advancedNativeWebview.isDestroyed()) {
            o.a(f6848a, "======开始渲染：".concat(String.valueOf(str)));
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.anythink.expressad.advanced.c.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATNativeAdvancedWebview.this.loadUrl(str);
                }
            });
        } else {
            aTNativeAdvancedView.setH5Ready(false);
        }
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e10) {
                e10.getMessage();
                return "";
            }
        }
    }

    public static boolean a(ATNativeAdvancedView aTNativeAdvancedView, com.anythink.expressad.foundation.d.c cVar) {
        boolean z10;
        boolean z11 = false;
        if (aTNativeAdvancedView == null) {
            o.d(f6848a, "mbAdvancedNativeView  is null");
            return false;
        }
        if (TextUtils.isEmpty(cVar.S())) {
            z10 = true;
        } else {
            z10 = aTNativeAdvancedView.isVideoReady();
            o.d(f6848a, "======isReady isVideoReady:".concat(String.valueOf(z10)));
        }
        if (z10 && !TextUtils.isEmpty(cVar.c())) {
            z10 = com.anythink.expressad.advanced.a.a.b(cVar.Z());
            o.d(f6848a, "======isReady getAdZip:" + z10 + "---requestId:" + cVar.Z());
        }
        if (z10 && TextUtils.isEmpty(cVar.c()) && !TextUtils.isEmpty(cVar.d())) {
            z10 = com.anythink.expressad.advanced.a.a.b(cVar.Z());
            o.d(f6848a, "======isReady getAdHtml:".concat(String.valueOf(z10)));
        }
        if (TextUtils.isEmpty(cVar.c()) && TextUtils.isEmpty(cVar.d())) {
            o.d(f6848a, "======isReady getAdHtml  getAdZip all are empty");
        } else {
            z11 = z10;
        }
        if (!z11 || TextUtils.isEmpty(cVar.I())) {
            return z11;
        }
        boolean isEndCardReady = aTNativeAdvancedView.isEndCardReady();
        o.d(f6848a, "======isReady isEndCardReady:".concat(String.valueOf(isEndCardReady)));
        return isEndCardReady;
    }
}
