package com.anythink.core.common.g;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.openalliance.ad.constant.w;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5822a = "http.loader";

    /* renamed from: m, reason: collision with root package name */
    protected i f5823m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f5824n;
    protected String o;

    /* renamed from: com.anythink.core.common.g.a$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends com.anythink.core.common.k.b.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5828a;

        public AnonymousClass1(int i10) {
            this.f5828a = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v61 */
        private void b(String str) {
            StackOverflowError e10;
            HttpURLConnection httpURLConnection;
            Exception e11;
            UnknownHostException e12;
            SocketTimeoutException e13;
            ConnectException e14;
            Error e15;
            OutOfMemoryError e16;
            byte[] d10;
            HttpURLConnection httpURLConnection2 = null;
            ?? r12 = 0;
            try {
                try {
                    try {
                        a.this.o = str;
                        httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    } catch (Throwable th) {
                        th = th;
                        if (r12 != 0) {
                            r12.disconnect();
                        }
                        throw th;
                    }
                } catch (OutOfMemoryError e17) {
                    e16 = e17;
                    httpURLConnection = null;
                } catch (Error e18) {
                    e15 = e18;
                    httpURLConnection = null;
                } catch (ConnectException e19) {
                    e14 = e19;
                    httpURLConnection = null;
                } catch (SocketTimeoutException e20) {
                    e13 = e20;
                    httpURLConnection = null;
                } catch (UnknownHostException e21) {
                    e12 = e21;
                    httpURLConnection = null;
                } catch (Exception e22) {
                    e11 = e22;
                    httpURLConnection = null;
                } catch (StackOverflowError e23) {
                    e10 = e23;
                    httpURLConnection = null;
                } catch (ConnectTimeoutException e24) {
                    e = e24;
                }
                try {
                    int a10 = a.this.a();
                    if (a10 != 1 && a10 != 2) {
                        a10 = 2;
                    }
                    if (a10 == 1) {
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setUseCaches(false);
                    }
                    if (a10 == 2) {
                        httpURLConnection.setInstanceFollowRedirects(false);
                    }
                    Map<String, String> c10 = a.this.c();
                    if (c10 != null && c10.size() > 0) {
                        for (String str2 : c10.keySet()) {
                            httpURLConnection.addRequestProperty(str2, c10.get(str2));
                        }
                    }
                    a aVar = a.this;
                    if (aVar.f5824n) {
                        aVar.c(this.f5828a);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            return;
                        }
                        return;
                    }
                    if (n.a().c("ua")) {
                        httpURLConnection.addRequestProperty("User-Agent", com.anythink.core.common.k.g.a());
                    }
                    httpURLConnection.setConnectTimeout(w.f22171t);
                    httpURLConnection.setReadTimeout(w.f22171t);
                    httpURLConnection.connect();
                    if (a10 == 1 && (d10 = a.this.d()) != null) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        outputStream.write(d10);
                        outputStream.flush();
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (!a.this.a(responseCode) && responseCode != 200) {
                        if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                            a.this.a(this.f5828a, responseCode, "Http respond status code is ".concat(String.valueOf(responseCode)), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(responseCode), httpURLConnection.getResponseMessage()));
                            httpURLConnection.disconnect();
                            return;
                        }
                        a aVar2 = a.this;
                        if (!aVar2.f5824n) {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField != null && headerField.toLowerCase().startsWith("http")) {
                                b(headerField);
                            }
                        } else {
                            aVar2.c(this.f5828a);
                        }
                        httpURLConnection.disconnect();
                        return;
                    }
                    a aVar3 = a.this;
                    if (aVar3.f5824n) {
                        aVar3.c(this.f5828a);
                        httpURLConnection.disconnect();
                        return;
                    }
                    InputStream a11 = a.a(httpURLConnection);
                    InputStreamReader inputStreamReader = new InputStreamReader(a11);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb2.append(readLine);
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    if (a11 != null) {
                        a11.close();
                    }
                    if (a.this.n()) {
                        String trim = sb2.toString().trim();
                        JSONObject jSONObject = new JSONObject(trim);
                        int optInt = jSONObject.optInt("code");
                        if (optInt == 0) {
                            JSONObject optJSONObject = jSONObject.optJSONObject(g.c.f5037d);
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            String jSONObject2 = optJSONObject.toString();
                            a aVar4 = a.this;
                            httpURLConnection.getHeaderFields();
                            a.this.a(this.f5828a, aVar4.a(jSONObject2));
                        } else {
                            a.this.a(this.f5828a, g.f5912i, trim, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(optInt), trim));
                        }
                    } else {
                        a aVar5 = a.this;
                        httpURLConnection.getHeaderFields();
                        a.this.a(this.f5828a, aVar5.a(sb2.toString()));
                    }
                    httpURLConnection.disconnect();
                } catch (SocketTimeoutException e25) {
                    e13 = e25;
                    a.this.a(this.f5828a, g.f5907c, "Connect timeout.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e13.getMessage()));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Exception e26) {
                    e11 = e26;
                    String message = e11.getMessage();
                    if (e11.getMessage() != null) {
                        message = e11.getMessage();
                    }
                    a.this.a(this.f5828a, g.f5910g, message, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e11.getMessage()));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (OutOfMemoryError e27) {
                    e16 = e27;
                    System.gc();
                    String message2 = e16.getMessage();
                    if (e16.getMessage() != null) {
                        message2 = e16.getMessage();
                    }
                    a.this.a(this.f5828a, g.f5909e, message2, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e16.getMessage()));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (StackOverflowError e28) {
                    e10 = e28;
                    System.gc();
                    String message3 = e10.getMessage();
                    if (e10.getMessage() != null) {
                        message3 = e10.getMessage();
                    }
                    a.this.a(this.f5828a, g.f, message3, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e10.getMessage()));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Error e29) {
                    e15 = e29;
                    System.gc();
                    String message4 = e15.getMessage();
                    if (e15.getMessage() != null) {
                        message4 = e15.getMessage();
                    }
                    a.this.a(this.f5828a, g.f5911h, message4, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e15.getMessage()));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (ConnectException e30) {
                    e14 = e30;
                    a.this.a(ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e14.getMessage()));
                    a.this.a(this.f5828a, -1001, "Connect error.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e14.getMessage()));
                    e14.toString();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (UnknownHostException e31) {
                    e12 = e31;
                    a.this.a(ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e12.getMessage()));
                    a.this.a(this.f5828a, -1000, "UnknownHostException", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e12.getMessage()));
                    e12.toString();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (ConnectTimeoutException e32) {
                    e = e32;
                    httpURLConnection2 = httpURLConnection;
                    a.this.a(this.f5828a, e);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r12 = str;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // com.anythink.core.common.k.b.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r5 = this;
                java.lang.String r0 = "9999"
                com.anythink.core.common.g.a r1 = com.anythink.core.common.g.a.this     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                com.anythink.core.common.g.i r1 = r1.f5823m     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                if (r1 == 0) goto Ld
                int r2 = r5.f5828a     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                r1.onLoadStart(r2)     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
            Ld:
                com.anythink.core.common.g.a r1 = com.anythink.core.common.g.a.this     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                java.lang.String r1 = r1.b()     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                r5.b(r1)     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                return
            L17:
                r1 = move-exception
                java.lang.String r2 = r1.getMessage()
                java.lang.String r3 = r1.getMessage()
                if (r3 == 0) goto L26
                java.lang.String r2 = r1.getMessage()
            L26:
                com.anythink.core.common.g.a r3 = com.anythink.core.common.g.a.this
                com.anythink.core.common.g.i r3 = r3.f5823m
                if (r3 == 0) goto L39
                int r4 = r5.f5828a
                java.lang.String r1 = r1.getMessage()
                com.anythink.core.api.AdError r0 = com.anythink.core.api.ErrorCode.getErrorCode(r0, r0, r1)
                r3.onLoadError(r4, r2, r0)
            L39:
                return
            L3a:
                r1 = move-exception
                goto L3d
            L3c:
                r1 = move-exception
            L3d:
                java.lang.System.gc()
                java.lang.String r2 = r1.getMessage()
                java.lang.String r3 = r1.getMessage()
                if (r3 == 0) goto L4e
                java.lang.String r2 = r1.getMessage()
            L4e:
                com.anythink.core.common.g.a r3 = com.anythink.core.common.g.a.this
                com.anythink.core.common.g.i r3 = r3.f5823m
                if (r3 == 0) goto L61
                int r4 = r5.f5828a
                java.lang.String r1 = r1.getMessage()
                com.anythink.core.api.AdError r0 = com.anythink.core.api.ErrorCode.getErrorCode(r0, r0, r1)
                r3.onLoadError(r4, r2, r0)
            L61:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.g.a.AnonymousClass1.a():void");
        }
    }

    private void d(int i10) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i10);
        if (o()) {
            com.anythink.core.common.k.b.a.a().a((com.anythink.core.common.k.b.b) anonymousClass1, 1);
        } else {
            com.anythink.core.common.k.b.a.a().a((com.anythink.core.common.k.b.b) anonymousClass1, 2);
        }
    }

    private void p() {
        this.f5824n = true;
    }

    public abstract int a();

    public abstract Object a(String str);

    public void a(int i10, i iVar) {
        this.f5824n = false;
        this.f5823m = iVar;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i10);
        if (o()) {
            com.anythink.core.common.k.b.a.a().a((com.anythink.core.common.k.b.b) anonymousClass1, 1);
        } else {
            com.anythink.core.common.k.b.a.a().a((com.anythink.core.common.k.b.b) anonymousClass1, 2);
        }
    }

    public abstract void a(AdError adError);

    public abstract boolean a(int i10);

    public abstract String b();

    public abstract void b(AdError adError);

    public abstract Map<String, String> c();

    public final void c(int i10) {
        i iVar = this.f5823m;
        if (iVar != null) {
            iVar.onLoadCanceled(i10);
        }
    }

    public abstract byte[] d();

    public JSONObject e() {
        return c.a(m());
    }

    public JSONObject f() {
        return c.a();
    }

    public String g() {
        HashMap hashMap = new HashMap();
        String a10 = com.anythink.core.common.k.c.a(e().toString());
        String a11 = com.anythink.core.common.k.c.a(f().toString());
        hashMap.put(c.O, g.c.f5034a);
        hashMap.put(c.W, a10);
        hashMap.put(c.X, a11);
        ArrayList arrayList = new ArrayList(hashMap.size());
        arrayList.addAll(hashMap.keySet());
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb2.length() > 0) {
                sb2.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb2.append(str);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(hashMap.get(str));
        }
        hashMap.put("sign", com.anythink.core.common.k.f.c(j() + sb2.toString()));
        if (l() != null) {
            hashMap.putAll(l());
        }
        Set<String> keySet = hashMap.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : keySet) {
                jSONObject.put(str2, String.valueOf(hashMap.get(str2)));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    public abstract String h();

    public abstract Context i();

    public abstract String j();

    public abstract String k();

    public abstract Map<String, Object> l();

    public int m() {
        return 0;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public static byte[] c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(com.anythink.expressad.foundation.g.a.bN));
            gZIPOutputStream.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final void a(int i10, ConnectTimeoutException connectTimeoutException) {
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, connectTimeoutException.getMessage());
        i iVar = this.f5823m;
        if (iVar != null) {
            iVar.onLoadError(i10, "Connect timeout.", errorCode);
        }
        b(errorCode);
        b(-1001);
    }

    public final void a(int i10, int i11, String str, AdError adError) {
        i iVar = this.f5823m;
        if (iVar != null) {
            iVar.onLoadError(i10, str, adError);
        }
        b(adError);
        b(i11);
    }

    public void a(int i10, Object obj) {
        i iVar = this.f5823m;
        if (iVar != null) {
            iVar.onLoadFinish(i10, obj);
        }
    }

    public static InputStream a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
        }
        if (!com.anythink.expressad.foundation.g.f.g.c.f10012d.equalsIgnoreCase(httpURLConnection.getHeaderField(HttpConnection.CONTENT_ENCODING))) {
            return inputStream;
        }
        try {
            byte[] bArr = new byte[2];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(2);
            int read = bufferedInputStream.read(bArr);
            bufferedInputStream.reset();
            return (read == -1 || (((bArr[1] & DefaultClassResolver.NAME) << 8) | (bArr[0] & DefaultClassResolver.NAME)) != 35615) ? bufferedInputStream : new GZIPInputStream(bufferedInputStream);
        } catch (Exception unused2) {
            return inputStream;
        }
    }

    public void b(int i10) {
    }
}
