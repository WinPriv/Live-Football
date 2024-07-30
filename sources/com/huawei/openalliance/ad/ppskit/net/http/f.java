package com.huawei.openalliance.ad.ppskit.net.http;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import ka.n7;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes2.dex */
public final class f extends b {
    public f(Context context) {
        super(context);
    }

    public static void e(a aVar, HttpURLConnection httpURLConnection) {
        if (aVar.f22727j) {
            httpURLConnection.setRequestProperty(HttpConnection.CONTENT_ENCODING, com.anythink.expressad.foundation.g.f.g.c.f10012d);
        }
        String str = aVar.f;
        if (str != null) {
            httpURLConnection.setRequestProperty("Content-Type", str);
        }
        byte[] bArr = aVar.f22726i;
        if (bArr != null) {
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArr.length));
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.huawei.openalliance.ad.ppskit.net.http.g
    public final com.huawei.openalliance.ad.ppskit.net.http.Response a(com.huawei.openalliance.ad.ppskit.net.http.d r24, com.huawei.openalliance.ad.ppskit.net.http.a r25) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.net.http.f.a(com.huawei.openalliance.ad.ppskit.net.http.d, com.huawei.openalliance.ad.ppskit.net.http.a):com.huawei.openalliance.ad.ppskit.net.http.Response");
    }

    public final HttpURLConnection d(String str, a aVar, boolean z10, d dVar) {
        n7.f("HttpUrlConnectionCaller", "createConnection: %s", y1.j(str));
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        HttpsConfig.b(httpURLConnection, dVar.f, dVar.f22756h);
        httpURLConnection.setRequestMethod(aVar.f22722d);
        httpURLConnection.setConnectTimeout(dVar.f22750a);
        httpURLConnection.setReadTimeout(dVar.f22751b);
        httpURLConnection.setDoOutput(z10);
        httpURLConnection.setRequestProperty("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.c.f10012d);
        if (aVar.f22724g == 1) {
            String m10 = i2.m(this.f22748a);
            if (!TextUtils.isEmpty(m10)) {
                httpURLConnection.setRequestProperty("User-Agent", m10);
            }
        }
        c cVar = aVar.f22723e;
        if (cVar != null) {
            for (Map.Entry entry : cVar.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return httpURLConnection;
    }
}
