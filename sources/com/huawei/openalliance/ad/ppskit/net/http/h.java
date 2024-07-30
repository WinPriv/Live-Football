package com.huawei.openalliance.ad.ppskit.net.http;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.k1;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes2.dex */
public final class h extends b {

    /* renamed from: b, reason: collision with root package name */
    public static HttpClient f22782b;

    /* renamed from: c, reason: collision with root package name */
    public static HttpClient f22783c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22784d = new byte[0];

    public h(Context context) {
        super(context);
    }

    public static boolean e(com.huawei.hms.network.httpclient.Response response) {
        Map headers = response.getHeaders();
        if (headers != null && headers.size() > 0) {
            List list = (List) headers.get(HttpConnection.CONTENT_ENCODING);
            if (list == null) {
                list = (List) headers.get(HttpConnection.CONTENT_ENCODING.toLowerCase(Locale.ENGLISH));
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (com.anythink.expressad.foundation.g.f.g.c.f10012d.equalsIgnoreCase((String) it.next())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023b A[Catch: all -> 0x0251, TryCatch #9 {all -> 0x0251, blocks: (B:42:0x021c, B:44:0x023b, B:45:0x0242, B:47:0x0248, B:58:0x0269, B:55:0x01f7, B:57:0x0215), top: B:26:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0248 A[Catch: all -> 0x0251, TRY_LEAVE, TryCatch #9 {all -> 0x0251, blocks: (B:42:0x021c, B:44:0x023b, B:45:0x0242, B:47:0x0248, B:58:0x0269, B:55:0x01f7, B:57:0x0215), top: B:26:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0215 A[Catch: all -> 0x0251, TryCatch #9 {all -> 0x0251, blocks: (B:42:0x021c, B:44:0x023b, B:45:0x0242, B:47:0x0248, B:58:0x0269, B:55:0x01f7, B:57:0x0215), top: B:26:0x00a3 }] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.huawei.openalliance.ad.ppskit.net.http.h] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v2 */
    @Override // com.huawei.openalliance.ad.ppskit.net.http.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.net.http.Response a(com.huawei.openalliance.ad.ppskit.net.http.d r25, com.huawei.openalliance.ad.ppskit.net.http.a r26) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.net.http.h.a(com.huawei.openalliance.ad.ppskit.net.http.d, com.huawei.openalliance.ad.ppskit.net.http.a):com.huawei.openalliance.ad.ppskit.net.http.Response");
    }

    public final void d(Request.Builder builder, a aVar, boolean z10) {
        builder.addHeader("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.c.f10012d);
        if (aVar.f22724g == 1) {
            String m10 = i2.m(this.f22748a);
            if (!TextUtils.isEmpty(m10)) {
                builder.removeHeader("User-Agent").addHeader("User-Agent", m10);
            }
        }
        c cVar = aVar.f22723e;
        if (cVar != null) {
            for (Map.Entry entry : cVar.a().entrySet()) {
                builder.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (z10) {
            if (aVar.f22727j) {
                builder.addHeader(HttpConnection.CONTENT_ENCODING, com.anythink.expressad.foundation.g.f.g.c.f10012d);
            }
            String str = aVar.f;
            if (str != null) {
                builder.addHeader("Content-Type", str);
            }
            byte[] bArr = aVar.f22726i;
            if (bArr != null) {
                builder.addHeader("Content-Length", String.valueOf(bArr.length));
            }
        }
    }

    public final HttpClient f(d dVar) {
        synchronized (f22784d) {
            if (f22782b == null || f22783c == null) {
                HttpClient.Builder enableQuic = k1.a(this.f22748a, dVar.f22757i).readTimeout(dVar.f22751b).connectTimeout(dVar.f22750a).enableQuic(dVar.f22757i);
                HttpsConfig.a(enableQuic, false, dVar.f22756h);
                f22782b = enableQuic.build();
                HttpClient.Builder enableQuic2 = k1.a(this.f22748a, dVar.f22757i).readTimeout(dVar.f22751b).connectTimeout(dVar.f22750a).enableQuic(dVar.f22757i);
                HttpsConfig.a(enableQuic2, true, false);
                f22783c = enableQuic2.build();
            }
        }
        if (dVar.f) {
            return f22783c;
        }
        return f22782b;
    }
}
