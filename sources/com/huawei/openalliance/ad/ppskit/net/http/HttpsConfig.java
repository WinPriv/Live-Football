package com.huawei.openalliance.ad.ppskit.net.http;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import java.net.HttpURLConnection;
import java.security.KeyStore;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ka.bb;
import ka.cb;
import ka.m6;
import ka.n7;
import ka.v5;
import okhttp3.OkHttpClient;

@OuterVisible
/* loaded from: classes2.dex */
public abstract class HttpsConfig {

    /* renamed from: a, reason: collision with root package name */
    public static volatile SSLSocketFactory f22712a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile X509TrustManager f22713b;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
    
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.huawei.hms.network.httpclient.HttpClient.Builder r1, boolean r2, boolean r3) {
        /*
            if (r2 == 0) goto L7
            javax.net.ssl.SSLSocketFactory r2 = com.huawei.openalliance.ad.ppskit.net.http.j.a(r3)
            goto L17
        L7:
            javax.net.ssl.SSLSocketFactory r2 = e()
            javax.net.ssl.X509TrustManager r0 = f()
            if (r2 != 0) goto L15
            javax.net.ssl.SSLSocketFactory r2 = com.huawei.openalliance.ad.ppskit.net.http.j.a(r3)
        L15:
            if (r0 != 0) goto L1b
        L17:
            javax.net.ssl.X509TrustManager r0 = d()
        L1b:
            if (r2 == 0) goto L23
            if (r0 == 0) goto L23
            r1.sslSocketFactory(r2, r0)
            return
        L23:
            ka.v5 r1 = new ka.v5
            java.lang.String r2 = "No ssl socket factory or trust manager set"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.net.http.HttpsConfig.a(com.huawei.hms.network.httpclient.HttpClient$Builder, boolean, boolean):void");
    }

    public static void b(HttpURLConnection httpURLConnection, boolean z10, boolean z11) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SSLSocketFactory e10 = e();
            if (z10 || e10 == null) {
                e10 = j.a(z11);
            }
            if (e10 != null) {
                httpsURLConnection.setSSLSocketFactory(e10);
                return;
            }
            throw new v5("No ssl socket factory set");
        }
    }

    public static void c(OkHttpClient.Builder builder, boolean z10, boolean z11) {
        SSLSocketFactory e10;
        X509TrustManager x509TrustManager;
        if (z10) {
            e10 = j.a(z11);
        } else {
            e10 = e();
            X509TrustManager f = f();
            if (e10 == null) {
                e10 = j.a(z11);
            }
            if (f != null) {
                x509TrustManager = f;
                if (e10 == null && x509TrustManager != null) {
                    builder.sslSocketFactory(e10, x509TrustManager);
                    return;
                }
                throw new v5("No ssl socket factory or trust manager set");
            }
        }
        x509TrustManager = d();
        if (e10 == null) {
        }
        throw new v5("No ssl socket factory or trust manager set");
    }

    public static X509TrustManager d() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(KeyStore.getInstance(KeyStore.getDefaultType()));
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    public static SSLSocketFactory e() {
        m6 m6Var;
        try {
            if (f22712a == null && (m6Var = m6.f31448d) != null) {
                Context context = m6Var.f31452c;
                if (bb.f30980c == null) {
                    synchronized (bb.class) {
                        if (bb.f30980c == null) {
                            bb.f30980c = new bb(context);
                        }
                    }
                }
                f22712a = bb.f30980c;
            }
        } catch (Throwable th) {
            n7.h("HttpsConfig", "reInit socketFactory err: %s", th.getClass().getSimpleName());
        }
        return f22712a;
    }

    public static X509TrustManager f() {
        m6 m6Var;
        try {
            if (f22713b == null && (m6Var = m6.f31448d) != null) {
                f22713b = new cb(m6Var.f31452c);
            }
        } catch (Throwable th) {
            n7.h("HttpsConfig", "reInit trustManager err: %s", th.getClass().getSimpleName());
        }
        return f22713b;
    }
}
