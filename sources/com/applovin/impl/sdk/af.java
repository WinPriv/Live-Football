package com.applovin.impl.sdk;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class af {

    /* renamed from: a, reason: collision with root package name */
    private static WebView f18628a;

    /* renamed from: b, reason: collision with root package name */
    private static String f18629b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f18630c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f18631d = new AtomicBoolean();

    static {
        if (b()) {
            f18629b = (String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.L, "", p.y());
            return;
        }
        f18629b = "";
        com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.L, (Object) null, p.y());
        com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.M, (Object) null, p.y());
    }

    public static void a(p pVar) {
    }

    public static void b(final p pVar) {
        if (b() || f18631d.getAndSet(true)) {
            return;
        }
        if (com.applovin.impl.sdk.utils.h.b()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.af.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        synchronized (af.f18630c) {
                            String unused = af.f18629b = WebSettings.getDefaultUserAgent(p.y());
                            com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.L, af.f18629b, p.y());
                            com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.M, Build.VERSION.RELEASE, p.y());
                        }
                    } catch (Throwable th) {
                        p.this.L();
                        if (y.a()) {
                            p.this.L().b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            });
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.af.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        af.a(p.this);
                        synchronized (af.f18630c) {
                            String unused = af.f18629b = af.f18628a.getSettings().getUserAgentString();
                            com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.L, af.f18629b, p.y());
                            com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.M, Build.VERSION.RELEASE, p.y());
                        }
                    } catch (Throwable th) {
                        p.this.L();
                        if (y.a()) {
                            p.this.L().b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            });
        }
    }

    public static String a() {
        String str;
        synchronized (f18630c) {
            str = f18629b;
        }
        return str;
    }

    public static boolean b() {
        boolean equals;
        synchronized (f18630c) {
            equals = Build.VERSION.RELEASE.equals((String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.M, "", p.y()));
        }
        return equals;
    }
}
