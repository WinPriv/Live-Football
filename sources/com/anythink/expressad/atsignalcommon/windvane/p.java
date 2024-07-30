package com.anythink.expressad.atsignalcommon.windvane;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.t;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public final class p extends com.anythink.expressad.atsignalcommon.base.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7085a = "WindVaneWebViewClient";

    /* renamed from: c, reason: collision with root package name */
    public static final int f7086c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7087d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final String f7088e = "mmusdk_cache";
    public static final String f = "1";

    /* renamed from: g, reason: collision with root package name */
    public static boolean f7089g = true;

    /* renamed from: b, reason: collision with root package name */
    protected String f7090b;

    /* renamed from: h, reason: collision with root package name */
    private int f7091h;

    /* renamed from: i, reason: collision with root package name */
    private e f7092i;

    public p() {
        this.f7090b = null;
        this.f7091h = 0;
    }

    private static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine + "\n");
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return sb2.toString();
    }

    private void b(e eVar) {
        this.f7092i = eVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f7090b = str;
        e eVar = this.f7092i;
        if (eVar != null) {
            eVar.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse a10 = a(str);
        if (a10 != null) {
            return a10;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    private p(int i10) {
        this.f7090b = null;
        this.f7091h = i10;
    }

    private static WebResourceResponse a(String str) {
        Bitmap bitmap;
        Bitmap a10;
        try {
            if (!TextUtils.isEmpty(str) && n.d(str)) {
                com.anythink.expressad.foundation.g.d.b a11 = com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.b().d());
                if (!t.a(str)) {
                    String a12 = s.a(str);
                    File file = new File(a12);
                    if (a11.a(str) != null) {
                        bitmap = a11.a(str);
                    } else if (file.exists() && (a10 = com.anythink.expressad.foundation.g.d.a.a(a12)) != null) {
                        a11.a(str, a10);
                        bitmap = a10;
                    }
                    if (bitmap != null && !bitmap.isRecycled()) {
                        return new WebResourceResponse(n.e(str), com.anythink.expressad.foundation.g.a.bN, com.anythink.expressad.foundation.g.d.a.a(bitmap));
                    }
                }
                bitmap = null;
                if (bitmap != null) {
                    return new WebResourceResponse(n.e(str), com.anythink.expressad.foundation.g.a.bN, com.anythink.expressad.foundation.g.d.a.a(bitmap));
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
