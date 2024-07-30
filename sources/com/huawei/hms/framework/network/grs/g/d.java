package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class d {
    private static final String o = "d";

    /* renamed from: a, reason: collision with root package name */
    private Map<String, List<String>> f21875a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f21876b;

    /* renamed from: c, reason: collision with root package name */
    private int f21877c;

    /* renamed from: d, reason: collision with root package name */
    private long f21878d;

    /* renamed from: e, reason: collision with root package name */
    private long f21879e;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private String f21880g;

    /* renamed from: h, reason: collision with root package name */
    private int f21881h;

    /* renamed from: i, reason: collision with root package name */
    private int f21882i;

    /* renamed from: j, reason: collision with root package name */
    private String f21883j;

    /* renamed from: k, reason: collision with root package name */
    private long f21884k;

    /* renamed from: l, reason: collision with root package name */
    private String f21885l;

    /* renamed from: m, reason: collision with root package name */
    private Exception f21886m;

    /* renamed from: n, reason: collision with root package name */
    private String f21887n;

    public d(int i10, Map<String, List<String>> map, byte[] bArr, long j10) {
        this.f21881h = 2;
        this.f21882i = AdError.AD_PRESENTATION_ERROR_CODE;
        this.f21883j = "";
        this.f21884k = 0L;
        this.f21885l = "";
        this.f21877c = i10;
        this.f21875a = map;
        this.f21876b = ByteBuffer.wrap(bArr).array();
        this.f21878d = j10;
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0051, code lost:
    
        if (r9.getInt("resultCode") == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p() {
        /*
            r10 = this;
            java.lang.String r0 = "errorDesc"
            java.lang.String r1 = "errorList"
            java.lang.String r2 = "errorCode"
            java.lang.String r3 = "resultCode"
            java.lang.String r4 = "isSuccess"
            boolean r5 = r10.m()
            r6 = 1
            if (r5 == 0) goto L1c
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "GRSSDK get httpcode{304} not any changed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.c(r6)
            return
        L1c:
            boolean r5 = r10.o()
            r7 = 2
            if (r5 != 0) goto L2e
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "GRSSDK parse server body all failed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.c(r7)
            return
        L2e:
            r5 = 0
            byte[] r8 = r10.f21876b     // Catch: org.json.JSONException -> Lb7
            java.lang.String r8 = com.huawei.hms.framework.common.StringUtils.byte2Str(r8)     // Catch: org.json.JSONException -> Lb7
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb7
            r9.<init>(r8)     // Catch: org.json.JSONException -> Lb7
            boolean r8 = r9.has(r4)     // Catch: org.json.JSONException -> Lb7
            if (r8 == 0) goto L47
            int r3 = r9.getInt(r4)     // Catch: org.json.JSONException -> Lb7
            if (r3 != r6) goto L55
            goto L53
        L47:
            boolean r4 = r9.has(r3)     // Catch: org.json.JSONException -> Lb7
            if (r4 == 0) goto L57
            int r3 = r9.getInt(r3)     // Catch: org.json.JSONException -> Lb7
            if (r3 != 0) goto L55
        L53:
            r3 = r6
            goto L5f
        L55:
            r3 = r7
            goto L5f
        L57:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.d.o     // Catch: org.json.JSONException -> Lb7
            java.lang.String r4 = "sth. wrong because server errorcode's key."
            com.huawei.hms.framework.common.Logger.e(r3, r4)     // Catch: org.json.JSONException -> Lb7
            r3 = -1
        L5f:
            java.lang.String r4 = "services"
            if (r3 == r6) goto L6a
            boolean r8 = r9.has(r4)     // Catch: org.json.JSONException -> Lb7
            if (r8 == 0) goto L6a
            r3 = r5
        L6a:
            r10.c(r3)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r8 = ""
            if (r3 == r6) goto L92
            if (r3 != 0) goto L74
            goto L92
        L74:
            boolean r1 = r9.has(r2)     // Catch: org.json.JSONException -> Lb7
            if (r1 == 0) goto L7f
            int r1 = r9.getInt(r2)     // Catch: org.json.JSONException -> Lb7
            goto L81
        L7f:
            r1 = 9001(0x2329, float:1.2613E-41)
        L81:
            r10.b(r1)     // Catch: org.json.JSONException -> Lb7
            boolean r1 = r9.has(r0)     // Catch: org.json.JSONException -> Lb7
            if (r1 == 0) goto L8e
            java.lang.String r8 = r9.getString(r0)     // Catch: org.json.JSONException -> Lb7
        L8e:
            r10.d(r8)     // Catch: org.json.JSONException -> Lb7
            goto Lce
        L92:
            boolean r0 = r9.has(r4)     // Catch: org.json.JSONException -> Lb7
            if (r0 == 0) goto La1
            org.json.JSONObject r0 = r9.getJSONObject(r4)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> Lb7
            goto La2
        La1:
            r0 = r8
        La2:
            r10.f(r0)     // Catch: org.json.JSONException -> Lb7
            boolean r0 = r9.has(r1)     // Catch: org.json.JSONException -> Lb7
            if (r0 == 0) goto Lb3
            org.json.JSONObject r0 = r9.getJSONObject(r1)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r8 = r0.toString()     // Catch: org.json.JSONException -> Lb7
        Lb3:
            r10.e(r8)     // Catch: org.json.JSONException -> Lb7
            goto Lce
        Lb7:
            r0 = move-exception
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            r2[r5] = r0
            java.lang.String r0 = "GrsResponse GrsResponse(String result) JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r0, r2)
            r10.c(r7)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.p():void");
    }

    private void q() {
        if (!o() && !n() && !m()) {
            return;
        }
        Map<String, String> r10 = r();
        if (r10.size() <= 0) {
            Logger.w(o, "parseHeader {headers.size() <= 0}");
            return;
        }
        try {
            if (o() || m()) {
                b(r10);
                a(r10);
            }
            if (n()) {
                c(r10);
            }
        } catch (JSONException e10) {
            Logger.w(o, "parseHeader catch JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
        }
    }

    private Map<String, String> r() {
        HashMap hashMap = new HashMap(16);
        Map<String, List<String>> map = this.f21875a;
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, List<String>> entry : this.f21875a.entrySet()) {
                String key = entry.getKey();
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    hashMap.put(key, it.next());
                }
            }
            return hashMap;
        }
        Logger.v(o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
        return hashMap;
    }

    private void s() {
        q();
        p();
    }

    public String a() {
        return this.f21883j;
    }

    public int b() {
        return this.f21877c;
    }

    public int c() {
        return this.f21882i;
    }

    public Exception d() {
        return this.f21886m;
    }

    public String e() {
        return this.f21885l;
    }

    public int f() {
        return this.f21881h;
    }

    public long g() {
        return this.f;
    }

    public long h() {
        return this.f21879e;
    }

    public long i() {
        return this.f21878d;
    }

    public String j() {
        return this.f21880g;
    }

    public long k() {
        return this.f21884k;
    }

    public String l() {
        return this.f21887n;
    }

    public boolean m() {
        if (this.f21877c == 304) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if (this.f21877c == 503) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.f21877c == 200) {
            return true;
        }
        return false;
    }

    public d(Exception exc, long j10) {
        this.f21877c = 0;
        this.f21881h = 2;
        this.f21882i = AdError.AD_PRESENTATION_ERROR_CODE;
        this.f21883j = "";
        this.f21884k = 0L;
        this.f21885l = "";
        this.f21886m = exc;
        this.f21878d = j10;
    }

    private void b(int i10) {
        this.f21882i = i10;
    }

    private void c(int i10) {
        this.f21881h = i10;
    }

    private void d(String str) {
    }

    private void e(String str) {
    }

    private void f(String str) {
        this.f21880g = str;
    }

    public void a(int i10) {
    }

    private void c(long j10) {
        this.f21884k = j10;
    }

    public void a(long j10) {
        this.f = j10;
    }

    public void b(long j10) {
        this.f21879e = j10;
    }

    private void c(String str) {
        this.f21883j = str;
    }

    public void a(String str) {
        this.f21885l = str;
    }

    public void b(String str) {
        this.f21887n = str;
    }

    private void a(Map<String, String> map) {
        String str;
        String str2;
        if (map.containsKey("ETag")) {
            String str3 = map.get("ETag");
            if (!TextUtils.isEmpty(str3)) {
                Logger.i(o, "success get Etag from server");
                a(str3);
                return;
            } else {
                str = o;
                str2 = "The Response Heads Etag is Empty";
            }
        } else {
            str = o;
            str2 = "Response Heads has not Etag";
        }
        Logger.i(str, str2);
    }

    private void b(Map<String, String> map) {
        long time;
        if (map.containsKey("Cache-Control")) {
            String str = map.get("Cache-Control");
            if (!TextUtils.isEmpty(str) && str.contains("max-age=")) {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                    try {
                        Logger.v(o, "Cache-Control value{%s}", Long.valueOf(time));
                    } catch (NumberFormatException e10) {
                        e = e10;
                        Logger.w(o, "getExpireTime addHeadersToResult NumberFormatException", e);
                        if (time > 0) {
                        }
                        time = com.anythink.expressad.d.a.b.aT;
                        long j10 = time * 1000;
                        Logger.i(o, "convert expireTime{%s}", Long.valueOf(j10));
                        c(String.valueOf(System.currentTimeMillis() + j10));
                    }
                } catch (NumberFormatException e11) {
                    e = e11;
                    time = 0;
                }
            }
            time = 0;
        } else {
            if (map.containsKey("Expires")) {
                String str2 = map.get("Expires");
                Logger.v(o, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey("Date") ? map.get("Date") : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e12) {
                    Logger.w(o, "getExpireTime ParseException.", e12);
                }
            } else {
                Logger.i(o, "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        if (time > 0 || time > 2592000) {
            time = com.anythink.expressad.d.a.b.aT;
        }
        long j102 = time * 1000;
        Logger.i(o, "convert expireTime{%s}", Long.valueOf(j102));
        c(String.valueOf(System.currentTimeMillis() + j102));
    }

    private void c(Map<String, String> map) {
        long j10;
        if (map.containsKey("Retry-After")) {
            String str = map.get("Retry-After");
            if (!TextUtils.isEmpty(str)) {
                try {
                    j10 = Long.parseLong(str);
                } catch (NumberFormatException e10) {
                    Logger.w(o, "getRetryAfter addHeadersToResult NumberFormatException", e10);
                }
                long j11 = j10 * 1000;
                Logger.v(o, "convert retry-afterTime{%s}", Long.valueOf(j11));
                c(j11);
            }
        }
        j10 = 0;
        long j112 = j10 * 1000;
        Logger.v(o, "convert retry-afterTime{%s}", Long.valueOf(j112));
        c(j112);
    }
}
