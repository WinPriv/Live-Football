package com.anythink.expressad.a;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.anythink.expressad.foundation.h.o;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6671a = "f";

    /* renamed from: b, reason: collision with root package name */
    private static final int f6672b = 60000;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.d.a f6673c;

    /* renamed from: d, reason: collision with root package name */
    private String f6674d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6675e = true;
    private final int f = 3145728;

    /* renamed from: g, reason: collision with root package name */
    private a f6676g;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f6677a;

        /* renamed from: b, reason: collision with root package name */
        public String f6678b;

        /* renamed from: c, reason: collision with root package name */
        public String f6679c;

        /* renamed from: d, reason: collision with root package name */
        public String f6680d;

        /* renamed from: e, reason: collision with root package name */
        public int f6681e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public String f6682g;

        /* renamed from: h, reason: collision with root package name */
        public String f6683h;

        public final String a() {
            return "statusCode=" + this.f + ", location=" + this.f6677a + ", contentType=" + this.f6678b + ", contentLength=" + this.f6681e + ", contentEncoding=" + this.f6679c + ", referer=" + this.f6680d;
        }

        public final String toString() {
            return "http响应头：...\nstatusCode=" + this.f + ", location=" + this.f6677a + ", contentType=" + this.f6678b + ", contentLength=" + this.f6681e + ", contentEncoding=" + this.f6679c + ", referer=" + this.f6680d;
        }
    }

    public f() {
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
        this.f6673c = b10;
        if (b10 == null) {
            com.anythink.expressad.d.b.a();
            this.f6673c = com.anythink.expressad.d.b.c();
        }
    }

    private void a(boolean z10) {
        this.f6675e = z10;
    }

    public final a a(String str, boolean z10, boolean z11, com.anythink.expressad.foundation.d.c cVar) {
        int i10;
        byte[] bytes;
        HttpURLConnection httpURLConnection = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String replace = str.replace(" ", "%20");
        URLUtil.isHttpsUrl(replace);
        String str2 = f6671a;
        o.b(str2, replace);
        this.f6676g = new a();
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(replace).openConnection();
            try {
                httpURLConnection2.setRequestMethod("GET");
                if ((!z10 && !z11) || cVar == null) {
                    httpURLConnection2.setRequestProperty("User-Agent", com.anythink.core.common.k.d.i());
                }
                if (z10 && cVar != null && cVar.E() == 1) {
                    httpURLConnection2.setRequestProperty("User-Agent", com.anythink.core.common.k.d.i());
                }
                if (z11 && cVar != null && cVar.D() == 1) {
                    httpURLConnection2.setRequestProperty("User-Agent", com.anythink.core.common.k.d.i());
                }
                httpURLConnection2.setRequestProperty("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.c.f10012d);
                if (this.f6673c.v() && !TextUtils.isEmpty(this.f6674d)) {
                    httpURLConnection2.setRequestProperty("referer", this.f6674d);
                }
                httpURLConnection2.setConnectTimeout(60000);
                httpURLConnection2.setReadTimeout(60000);
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.connect();
                this.f6676g.f6677a = httpURLConnection2.getHeaderField("Location");
                this.f6676g.f6680d = httpURLConnection2.getHeaderField("Referer");
                this.f6676g.f = httpURLConnection2.getResponseCode();
                this.f6676g.f6678b = httpURLConnection2.getContentType();
                this.f6676g.f6681e = httpURLConnection2.getContentLength();
                this.f6676g.f6679c = httpURLConnection2.getContentEncoding();
                o.b(str2, this.f6676g.toString());
                boolean equalsIgnoreCase = com.anythink.expressad.foundation.g.f.g.c.f10012d.equalsIgnoreCase(this.f6676g.f6679c);
                a aVar = this.f6676g;
                if (aVar.f == 200 && this.f6675e && (i10 = aVar.f6681e) > 0 && i10 < 3145728 && !TextUtils.isEmpty(replace) && !replace.endsWith(".apk")) {
                    try {
                        String a10 = a(httpURLConnection2.getInputStream(), equalsIgnoreCase);
                        if (!TextUtils.isEmpty(a10) && (bytes = a10.getBytes()) != null && bytes.length > 0 && bytes.length < 3145728) {
                            this.f6676g.f6682g = a10.trim();
                        }
                    } catch (Throwable unused) {
                    }
                }
                this.f6674d = replace;
                httpURLConnection2.disconnect();
                return this.f6676g;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    this.f6676g.f6683h = th.getMessage();
                    o.c("http jump", "connecting");
                    return this.f6676g;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: Exception -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0049, blocks: (B:32:0x0022, B:12:0x0045), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[Catch: all -> 0x002c, TryCatch #5 {all -> 0x002c, blocks: (B:39:0x0008, B:4:0x000e, B:7:0x002f, B:9:0x0033, B:10:0x0040), top: B:38:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.io.InputStream r4, boolean r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto Le
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4 = r5
        Le:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
        L18:
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            if (r4 == 0) goto L22
            r0.append(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            goto L18
        L22:
            r5.close()     // Catch: java.lang.Exception -> L49
            goto L4d
        L26:
            r4 = move-exception
            r1 = r5
            goto L52
        L29:
            r4 = move-exception
            r1 = r5
            goto L2f
        L2c:
            r4 = move-exception
            goto L52
        L2e:
            r4 = move-exception
        L2f:
            com.anythink.expressad.a.f$a r5 = r3.f6676g     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L40
            com.anythink.expressad.a.f$a r5 = new com.anythink.expressad.a.f$a     // Catch: java.lang.Throwable -> L2c
            r5.<init>()     // Catch: java.lang.Throwable -> L2c
            r3.f6676g = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L2c
            r5.f6683h = r2     // Catch: java.lang.Throwable -> L2c
        L40:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Exception -> L49
            goto L4d
        L49:
            r4 = move-exception
            r4.printStackTrace()
        L4d:
            java.lang.String r4 = r0.toString()
            return r4
        L52:
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.lang.Exception -> L58
            goto L5c
        L58:
            r5 = move-exception
            r5.printStackTrace()
        L5c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.a.f.a(java.io.InputStream, boolean):java.lang.String");
    }
}
