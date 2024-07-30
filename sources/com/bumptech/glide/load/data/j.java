package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes.dex */
public final class j implements d<InputStream> {

    /* renamed from: s, reason: collision with root package name */
    public final e3.f f19770s;

    /* renamed from: t, reason: collision with root package name */
    public final int f19771t;

    /* renamed from: u, reason: collision with root package name */
    public HttpURLConnection f19772u;

    /* renamed from: v, reason: collision with root package name */
    public InputStream f19773v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f19774w;

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    static {
        new a();
    }

    public j(e3.f fVar, int i10) {
        this.f19770s = fVar;
        this.f19771t = i10;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
                return -1;
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f19773v;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f19772u;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f19772u = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f19774w = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final y2.a d() {
        return y2.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        e3.f fVar = this.f19770s;
        int i10 = t3.h.f35419b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.f(f(fVar.d(), 0, null, fVar.f27681b.a()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.c(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                sb2.append(t3.h.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + t3.h.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i10, URL url2, Map<String, String> map) throws r2.b {
        boolean z10;
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new r2.b(-1, "In re-direct loop", null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z11 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                int i11 = this.f19771t;
                httpURLConnection.setConnectTimeout(i11);
                httpURLConnection.setReadTimeout(i11);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f19772u = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f19773v = this.f19772u.getInputStream();
                    if (this.f19774w) {
                        return null;
                    }
                    int c10 = c(this.f19772u);
                    int i12 = c10 / 100;
                    if (i12 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        HttpURLConnection httpURLConnection2 = this.f19772u;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f19773v = new t3.c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.f19773v = httpURLConnection2.getInputStream();
                            }
                            return this.f19773v;
                        } catch (IOException e10) {
                            throw new r2.b(c(httpURLConnection2), "Failed to obtain InputStream", e10);
                        }
                    }
                    if (i12 == 3) {
                        z11 = true;
                    }
                    if (z11) {
                        String headerField = this.f19772u.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                b();
                                return f(url3, i10 + 1, url, map);
                            } catch (MalformedURLException e11) {
                                throw new r2.b(c10, s.f.b("Bad redirect url: ", headerField), e11);
                            }
                        }
                        throw new r2.b(c10, "Received empty or null redirect url", null);
                    }
                    if (c10 == -1) {
                        throw new r2.b(c10, "Http request failed", null);
                    }
                    try {
                        throw new r2.b(c10, this.f19772u.getResponseMessage(), null);
                    } catch (IOException e12) {
                        throw new r2.b(c10, "Failed to get a response message", e12);
                    }
                } catch (IOException e13) {
                    throw new r2.b(c(this.f19772u), "Failed to connect or obtain data", e13);
                }
            } catch (IOException e14) {
                throw new r2.b(0, "URL.openConnection threw", e14);
            }
        }
        throw new r2.b(-1, "Too many (> 5) redirects!", null);
    }
}
