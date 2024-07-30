package com.huawei.hms.ads.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.huawei.hms.ads.jsb.IWebView;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private volatile String f21755a;

    /* renamed from: com.huawei.hms.ads.jsbridge.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class CallableC0276a implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        private IWebView f21756a;

        /* renamed from: b, reason: collision with root package name */
        private WebView f21757b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21758c;

        public CallableC0276a(WebView webView) {
            this.f21757b = webView;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            if (this.f21758c) {
                IWebView iWebView = this.f21756a;
                if (iWebView != null) {
                    return iWebView.getUrl();
                }
                return null;
            }
            WebView webView = this.f21757b;
            if (webView != null) {
                return webView.getUrl();
            }
            return null;
        }

        public CallableC0276a(IWebView iWebView) {
            this.f21758c = true;
            this.f21756a = iWebView;
        }
    }

    private static String b(WebView webView) {
        try {
            return a(new FutureTask(new CallableC0276a(webView))).get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            b.b("Exception will waiting: " + e10.getMessage());
            b.b("exception or timeout while waiting for url");
            return null;
        }
    }

    public String a(WebView webView) {
        if (webView == null) {
            return null;
        }
        String str = this.f21755a;
        if (str != null) {
            return str;
        }
        b.a("securityExtSetFrameUrl is null ,get url from native");
        return b(webView);
    }

    private static String b(IWebView iWebView) {
        try {
            return a(new FutureTask(new CallableC0276a(iWebView))).get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            b.b("Exception will waiting: " + e10.getMessage());
            b.b("exception or timeout while waiting for url");
            return null;
        }
    }

    public String a(IWebView iWebView) {
        if (iWebView == null) {
            return null;
        }
        String str = this.f21755a;
        return str != null ? str : b(iWebView);
    }

    private static Future<String> a(FutureTask futureTask) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            futureTask.run();
        } else {
            new Handler(Looper.getMainLooper()).post(futureTask);
        }
        return futureTask;
    }

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
