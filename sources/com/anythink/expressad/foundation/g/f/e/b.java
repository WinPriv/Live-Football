package com.anythink.expressad.foundation.g.f.e;

import android.text.TextUtils;
import com.android.volley.toolbox.HttpClientStack;
import com.anythink.expressad.foundation.g.f.c.c;
import com.anythink.expressad.foundation.g.f.d.f;
import com.anythink.expressad.foundation.g.f.i;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.foundation.g.f.e.a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9972a = 100;

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.c.a f9973b;

    /* renamed from: c, reason: collision with root package name */
    private SSLSocketFactory f9974c;

    /* loaded from: classes.dex */
    public static class a extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f9975a;

        public a(HttpURLConnection httpURLConnection) {
            super(b.b(httpURLConnection));
            this.f9975a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            super.close();
            this.f9975a.disconnect();
        }
    }

    public b(SSLSocketFactory sSLSocketFactory, com.anythink.expressad.foundation.g.f.c.a aVar) {
        this.f9974c = sSLSocketFactory;
        this.f9973b = aVar;
    }

    private static boolean a(int i10, int i11) {
        if (i10 != 4) {
            return ((100 <= i11 && i11 < 200) || i11 == 204 || i11 == 304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static void b(HttpURLConnection httpURLConnection, i<?> iVar) {
        byte[] h10 = iVar.h();
        if (h10 != null) {
            boolean z10 = iVar instanceof f;
            if (z10) {
                httpURLConnection.setChunkedStreamingMode(2048);
            }
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(h10);
            if (z10) {
                iVar.a((OutputStream) dataOutputStream);
            }
            dataOutputStream.close();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:14:0x0071, B:15:0x007d, B:17:0x0083, B:19:0x0099, B:20:0x009d, B:21:0x00a0, B:22:0x012e, B:23:0x0133, B:25:0x00a4, B:26:0x00dc, B:28:0x00e3, B:40:0x00ff, B:53:0x0126, B:54:0x012d, B:55:0x00ad, B:56:0x00b3, B:57:0x00b9, B:58:0x00bf, B:59:0x00c5, B:60:0x00ce, B:61:0x00d7), top: B:13:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126 A[Catch: all -> 0x0134, TRY_ENTER, TryCatch #1 {all -> 0x0134, blocks: (B:14:0x0071, B:15:0x007d, B:17:0x0083, B:19:0x0099, B:20:0x009d, B:21:0x00a0, B:22:0x012e, B:23:0x0133, B:25:0x00a4, B:26:0x00dc, B:28:0x00e3, B:40:0x00ff, B:53:0x0126, B:54:0x012d, B:55:0x00ad, B:56:0x00b3, B:57:0x00b9, B:58:0x00bf, B:59:0x00c5, B:60:0x00ce, B:61:0x00d7), top: B:13:0x0071 }] */
    @Override // com.anythink.expressad.foundation.g.f.e.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.expressad.foundation.g.f.f.b a(com.anythink.expressad.foundation.g.f.i<?> r7) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.f.e.b.a(com.anythink.expressad.foundation.g.f.i):com.anythink.expressad.foundation.g.f.f.b");
    }

    private static List<c> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new c(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection;
        com.anythink.expressad.foundation.g.f.c.a aVar = this.f9973b;
        if (aVar != null && !TextUtils.isEmpty(aVar.f9912b) && !TextUtils.isEmpty(this.f9973b.f9913c)) {
            Proxy.Type type = Proxy.Type.HTTP;
            com.anythink.expressad.foundation.g.f.c.a aVar2 = this.f9973b;
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(type, new InetSocketAddress(aVar2.f9912b, Integer.valueOf(aVar2.f9913c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection, i<?> iVar) {
        switch (iVar.a()) {
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                b(httpURLConnection, iVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                b(httpURLConnection, iVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod(VersionInfo.GIT_BRANCH);
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                b(httpURLConnection, iVar);
                httpURLConnection.setRequestMethod(HttpClientStack.HttpPatch.METHOD_NAME);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private HttpURLConnection a(URL url, i<?> iVar) {
        HttpURLConnection httpURLConnection;
        SSLSocketFactory sSLSocketFactory;
        com.anythink.expressad.foundation.g.f.c.a aVar = this.f9973b;
        if (aVar != null && !TextUtils.isEmpty(aVar.f9912b) && !TextUtils.isEmpty(this.f9973b.f9913c)) {
            Proxy.Type type = Proxy.Type.HTTP;
            com.anythink.expressad.foundation.g.f.c.a aVar2 = this.f9973b;
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(type, new InetSocketAddress(aVar2.f9912b, Integer.valueOf(aVar2.f9913c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        int k10 = iVar.k();
        httpURLConnection.setConnectTimeout(k10);
        httpURLConnection.setReadTimeout(k10);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f9974c) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }
}
