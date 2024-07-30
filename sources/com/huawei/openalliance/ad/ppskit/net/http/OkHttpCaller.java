package com.huawei.openalliance.ad.ppskit.net.http;

import android.content.Context;
import android.net.Uri;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import com.huawei.openalliance.ad.ppskit.net.http.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import ka.n7;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import org.jsoup.helper.HttpConnection;

@OuterVisible
/* loaded from: classes2.dex */
public class OkHttpCaller extends b {

    /* renamed from: b, reason: collision with root package name */
    public static volatile OkHttpClient f22714b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile OkHttpClient f22715c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile OkHttpClient f22716d;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f22717e = new byte[0];

    public OkHttpCaller(Context context) {
        super(context);
    }

    public static OkHttpClient e(d dVar, boolean z10) {
        OkHttpClient okHttpClient;
        synchronized (f22717e) {
            if (f22714b == null || f22716d == null || f22715c == null) {
                OkHttpClient.Builder connectionPool = new OkHttpClient.Builder().connectionPool(new ConnectionPool(8, 10L, TimeUnit.MINUTES));
                long j10 = dVar.f22751b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                OkHttpClient.Builder connectTimeout = connectionPool.readTimeout(j10, timeUnit).connectTimeout(dVar.f22750a, timeUnit);
                Protocol protocol = Protocol.HTTP_2;
                OkHttpClient.Builder protocols = connectTimeout.protocols(Collections.unmodifiableList(Arrays.asList(protocol, Protocol.HTTP_1_1)));
                HttpsConfig.c(protocols, false, dVar.f22756h);
                try {
                    protocols.dispatcher(protocols.createDispatcher(protocol));
                } catch (Throwable unused) {
                    n7.g("OkHttpCaller", "createDispatcher encounter exception");
                }
                f22714b = protocols.build();
                f22715c = protocols.dns(new i()).build();
                OkHttpClient.Builder newBuilder = f22714b.newBuilder();
                HttpsConfig.c(newBuilder, true, false);
                f22716d = newBuilder.build();
            }
            if (z10) {
                okHttpClient = f22715c;
            } else if (dVar.f) {
                okHttpClient = f22716d;
            } else {
                okHttpClient = f22714b;
            }
        }
        return okHttpClient;
    }

    public static boolean f(okhttp3.Response response) {
        return com.anythink.expressad.foundation.g.f.g.c.f10012d.equalsIgnoreCase(response.header(HttpConnection.CONTENT_ENCODING));
    }

    @Override // com.huawei.openalliance.ad.ppskit.net.http.g
    public final Response a(d dVar, a aVar) {
        String a10;
        Response d10 = d(dVar, aVar, false);
        if (d10.v()) {
            String s10 = d10.s();
            Response d11 = d(dVar, aVar, true);
            d11.l();
            d11.r(s10);
            if (d11.v()) {
                e eVar = aVar.f22720b;
                if (eVar.f22773g) {
                    a10 = eVar.f22774h;
                } else {
                    e.a aVar2 = new e.a();
                    aVar2.a(aVar.a());
                    ArrayList arrayList = aVar.f22725h;
                    if (arrayList != null) {
                        aVar2.f22779e.addAll(arrayList);
                    }
                    a10 = new e(aVar2).a();
                }
                com.huawei.openalliance.ad.ppskit.utils.g.j(Uri.parse(a10).getHost());
            }
            return d11;
        }
        return d10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x044d: INVOKE (r20 I:java.io.Closeable) STATIC call: androidx.transition.n.D(java.io.Closeable):void A[MD:(java.io.Closeable):void (m)] (LINE:1102), block:B:224:0x0447 */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x044a: INVOKE (r21 I:java.io.Closeable) STATIC call: androidx.transition.n.D(java.io.Closeable):void A[MD:(java.io.Closeable):void (m)] (LINE:1099), block:B:224:0x0447 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03eb A[Catch: all -> 0x03f0, TryCatch #9 {all -> 0x03f0, blocks: (B:108:0x036f, B:110:0x038d, B:104:0x0391, B:93:0x03a4, B:95:0x03c2, B:96:0x03c9, B:98:0x03cf, B:88:0x03d2, B:101:0x03df, B:103:0x03eb, B:82:0x0400, B:84:0x0426, B:85:0x042d, B:87:0x0433), top: B:37:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x038d A[Catch: all -> 0x03f0, TryCatch #9 {all -> 0x03f0, blocks: (B:108:0x036f, B:110:0x038d, B:104:0x0391, B:93:0x03a4, B:95:0x03c2, B:96:0x03c9, B:98:0x03cf, B:88:0x03d2, B:101:0x03df, B:103:0x03eb, B:82:0x0400, B:84:0x0426, B:85:0x042d, B:87:0x0433), top: B:37:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0426 A[Catch: all -> 0x03f0, TryCatch #9 {all -> 0x03f0, blocks: (B:108:0x036f, B:110:0x038d, B:104:0x0391, B:93:0x03a4, B:95:0x03c2, B:96:0x03c9, B:98:0x03cf, B:88:0x03d2, B:101:0x03df, B:103:0x03eb, B:82:0x0400, B:84:0x0426, B:85:0x042d, B:87:0x0433), top: B:37:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0433 A[Catch: all -> 0x03f0, TRY_LEAVE, TryCatch #9 {all -> 0x03f0, blocks: (B:108:0x036f, B:110:0x038d, B:104:0x0391, B:93:0x03a4, B:95:0x03c2, B:96:0x03c9, B:98:0x03cf, B:88:0x03d2, B:101:0x03df, B:103:0x03eb, B:82:0x0400, B:84:0x0426, B:85:0x042d, B:87:0x0433), top: B:37:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c2 A[Catch: all -> 0x03f0, TryCatch #9 {all -> 0x03f0, blocks: (B:108:0x036f, B:110:0x038d, B:104:0x0391, B:93:0x03a4, B:95:0x03c2, B:96:0x03c9, B:98:0x03cf, B:88:0x03d2, B:101:0x03df, B:103:0x03eb, B:82:0x0400, B:84:0x0426, B:85:0x042d, B:87:0x0433), top: B:37:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03cf A[Catch: all -> 0x03f0, TryCatch #9 {all -> 0x03f0, blocks: (B:108:0x036f, B:110:0x038d, B:104:0x0391, B:93:0x03a4, B:95:0x03c2, B:96:0x03c9, B:98:0x03cf, B:88:0x03d2, B:101:0x03df, B:103:0x03eb, B:82:0x0400, B:84:0x0426, B:85:0x042d, B:87:0x0433), top: B:37:0x00d7 }] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.Closeable, boolean] */
    /* JADX WARN: Type inference failed for: r4v2, types: [okhttp3.Request$Builder, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.net.http.Response d(com.huawei.openalliance.ad.ppskit.net.http.d r28, com.huawei.openalliance.ad.ppskit.net.http.a r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.net.http.OkHttpCaller.d(com.huawei.openalliance.ad.ppskit.net.http.d, com.huawei.openalliance.ad.ppskit.net.http.a, boolean):com.huawei.openalliance.ad.ppskit.net.http.Response");
    }
}
