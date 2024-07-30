package com.ironsource.mediationsdk.server;

import android.text.TextUtils;
import com.anythink.expressad.exoplayer.d;
import com.ironsource.mediationsdk.L;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f25853a = Executors.newSingleThreadExecutor();

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25854s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f25855t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f25856u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f25857v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.mediationsdk.server.a f25858w;

        public a(String str, String str2, String str3, String str4, com.ironsource.mediationsdk.server.a aVar) {
            this.f25854s = str;
            this.f25855t = str2;
            this.f25856u = str3;
            this.f25857v = str4;
            this.f25858w = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.io.OutputStream, java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r2v4 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r9 = this;
                com.ironsource.mediationsdk.server.a r0 = r9.f25858w
                r1 = 0
                r2 = 0
                java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                java.lang.String r4 = r9.f25854s     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                java.lang.String r4 = r9.f25855t     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                if (r4 == 0) goto L18
                java.lang.String r5 = r9.f25856u     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                if (r5 != 0) goto L14
                goto L18
            L14:
                com.ironsource.mediationsdk.utils.IronSourceUtils.getBase64Auth(r4, r5)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                throw r2     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
            L18:
                java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                r4 = 15000(0x3a98, float:2.102E-41)
                r3.setReadTimeout(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                r3.setConnectTimeout(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                java.lang.String r4 = "POST"
                r3.setRequestMethod(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                r4 = 1
                r3.setDoInput(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                r3.setDoOutput(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                java.io.OutputStream r2 = r3.getOutputStream()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                java.lang.String r7 = "UTF-8"
                r6.<init>(r2, r7)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                r5.<init>(r6)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                java.lang.String r6 = r9.f25857v     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                r5.write(r6)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                r5.flush()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                r5.close()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                int r5 = r3.getResponseCode()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                r6 = 200(0xc8, float:2.8E-43)
                if (r5 != r6) goto L56
                goto L57
            L56:
                r4 = r1
            L57:
                if (r4 != 0) goto L71
                com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                java.lang.String r8 = "invalid response code "
                r7.<init>(r8)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                r7.append(r5)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                java.lang.String r5 = " sending request"
                r7.append(r5)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                java.lang.String r5 = r7.toString()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                r6.error(r5)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
            L71:
                r0.a(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb7
                if (r2 == 0) goto L7e
                r2.close()     // Catch: java.io.IOException -> L7a
                goto L7e
            L7a:
                r0 = move-exception
                r0.printStackTrace()
            L7e:
                r3.disconnect()
                return
            L82:
                r4 = move-exception
                goto L8a
            L84:
                r0 = move-exception
                r3 = r2
                goto Lb8
            L87:
                r3 = move-exception
                r4 = r3
                r3 = r2
            L8a:
                r4.printStackTrace()     // Catch: java.lang.Throwable -> Lb7
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> Lb7
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
                java.lang.String r7 = "exception while sending request "
                r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb7
                java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> Lb7
                r6.append(r4)     // Catch: java.lang.Throwable -> Lb7
                java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> Lb7
                r5.error(r4)     // Catch: java.lang.Throwable -> Lb7
                r0.a(r1)     // Catch: java.lang.Throwable -> Lb7
                if (r2 == 0) goto Lb1
                r2.close()     // Catch: java.io.IOException -> Lad
                goto Lb1
            Lad:
                r0 = move-exception
                r0.printStackTrace()
            Lb1:
                if (r3 == 0) goto Lb6
                r3.disconnect()
            Lb6:
                return
            Lb7:
                r0 = move-exception
            Lb8:
                if (r2 == 0) goto Lc2
                r2.close()     // Catch: java.io.IOException -> Lbe
                goto Lc2
            Lbe:
                r1 = move-exception
                r1.printStackTrace()
            Lc2:
                if (r3 == 0) goto Lc7
                r3.disconnect()
            Lc7:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.server.HttpFunctions.a.run():void");
        }
    }

    public static String getStringFromURL(String str) {
        return getStringFromURL(str, null);
    }

    public static void sendPostRequest(String str, String str2, com.ironsource.mediationsdk.server.a aVar) {
        sendPostRequestWithAutho(str, str2, null, null, aVar);
    }

    public static void sendPostRequestWithAutho(String str, String str2, String str3, String str4, com.ironsource.mediationsdk.server.a aVar) {
        f25853a.submit(new a(str, str3, str4, str2, aVar));
    }

    public static String getStringFromURL(String str, L.a aVar) {
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader2;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(d.f7613a);
                httpURLConnection.setConnectTimeout(d.f7613a);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (aVar != null) {
                        aVar.a("Bad Request - 400");
                    }
                    httpURLConnection.disconnect();
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    }
                    String sb3 = sb2.toString();
                    boolean isEmpty = TextUtils.isEmpty(sb3);
                    httpURLConnection.disconnect();
                    bufferedReader2.close();
                    if (isEmpty) {
                        return null;
                    }
                    return sb3;
                } catch (Exception unused) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return null;
                } catch (Throwable th) {
                    httpURLConnection2 = httpURLConnection;
                    bufferedReader = bufferedReader2;
                    th = th;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                bufferedReader2 = null;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                bufferedReader = null;
            }
        } catch (Exception unused3) {
            httpURLConnection = null;
            bufferedReader2 = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }
}
