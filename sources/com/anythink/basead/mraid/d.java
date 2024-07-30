package com.anythink.basead.mraid;

import android.net.http.SslError;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.basead.c.f;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import java.io.File;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static String f4064a = "d";

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(com.anythink.basead.c.e eVar);
    }

    public static String a(j jVar, i iVar) {
        if (!TextUtils.isEmpty(iVar.i())) {
            return iVar.i();
        }
        if (TextUtils.isEmpty(iVar.h())) {
            return "";
        }
        File b10 = com.anythink.core.common.res.d.a(n.a().g()).b(jVar, iVar);
        if (b10 != null) {
            Log.e(f4064a, "loadMraidResource: html exists: " + b10.toURI().toString());
            return b10.toURI().toString();
        }
        Log.e(f4064a, "loadMraidResource: html no exists: ");
        return com.anythink.core.common.res.d.a(n.a().g()).a(iVar.h(), jVar, iVar);
    }

    public static void a(final String str, final String str2, final MraidWebView mraidWebView, final a aVar) {
        if (mraidWebView == null) {
            return;
        }
        n.a().a(new Runnable() { // from class: com.anythink.basead.mraid.d.1
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = d.f4064a;
                com.anythink.basead.mraid.a aVar2 = new com.anythink.basead.mraid.a();
                e eVar = new e(str2);
                eVar.a(new com.anythink.expressad.atsignalcommon.a.b() { // from class: com.anythink.basead.mraid.d.1.1

                    /* renamed from: a, reason: collision with root package name */
                    boolean f4069a = false;

                    @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                    public final void onPageFinished(WebView webView, String str4) {
                        if (this.f4069a) {
                            return;
                        }
                        this.f4069a = true;
                        if (com.anythink.core.common.res.d.f6477a.equals(str4)) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            String str5 = str2;
                            a aVar3 = aVar;
                            if (aVar3 != null) {
                                aVar3.a(f.a(f.f3757n, f.I));
                                return;
                            }
                            return;
                        }
                        com.anythink.expressad.mbbanner.a.a.a.a(webView);
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        MraidWebView mraidWebView2 = mraidWebView;
                        if (mraidWebView2 != null) {
                            com.anythink.basead.a.b.c.a(str, mraidWebView2);
                        }
                        AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                        String str6 = str2;
                        a aVar4 = aVar;
                        if (aVar4 != null) {
                            aVar4.a();
                        }
                    }

                    @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                    public final void onReceivedError(WebView webView, int i10, String str4, String str5) {
                        if (this.f4069a) {
                            return;
                        }
                        this.f4069a = true;
                        super.onReceivedError(webView, i10, str4, str5);
                        com.anythink.basead.c.e a10 = f.a(f.f3746b, i10 + "_" + str4);
                        String str6 = str2;
                        a10.c();
                        a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.a(a10);
                        }
                    }

                    @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        String str4;
                        if (this.f4069a) {
                            return;
                        }
                        this.f4069a = true;
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                        if (sslError != null) {
                            str4 = sslError.toString();
                        } else {
                            str4 = "onReceivedSslError";
                        }
                        com.anythink.basead.c.e a10 = f.a(f.f3746b, str4);
                        String str5 = str2;
                        a10.c();
                        a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.a(a10);
                        }
                    }
                });
                mraidWebView.setWebViewClient(eVar);
                mraidWebView.setObject(aVar2);
                mraidWebView.loadUrl(str2);
            }
        });
    }
}
