package com.anythink.expressad.exoplayer.j;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.exoplayer.j.s;
import com.anythink.expressad.exoplayer.k.af;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8867a = 8000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8868b = 8000;

    /* renamed from: d, reason: collision with root package name */
    private static final String f8869d = "DefaultHttpDataSource";

    /* renamed from: e, reason: collision with root package name */
    private static final int f8870e = 20;
    private static final long f = 2048;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f8871g = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReference<byte[]> f8872h = new AtomicReference<>();

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8873i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8874j;

    /* renamed from: k, reason: collision with root package name */
    private final int f8875k;

    /* renamed from: l, reason: collision with root package name */
    private final String f8876l;

    /* renamed from: m, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.k.u<String> f8877m;

    /* renamed from: n, reason: collision with root package name */
    private final s.f f8878n;
    private final s.f o;

    /* renamed from: p, reason: collision with root package name */
    private final aa<? super p> f8879p;

    /* renamed from: q, reason: collision with root package name */
    private k f8880q;

    /* renamed from: r, reason: collision with root package name */
    private HttpURLConnection f8881r;

    /* renamed from: s, reason: collision with root package name */
    private InputStream f8882s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8883t;

    /* renamed from: u, reason: collision with root package name */
    private long f8884u;

    /* renamed from: v, reason: collision with root package name */
    private long f8885v;

    /* renamed from: w, reason: collision with root package name */
    private long f8886w;

    /* renamed from: x, reason: collision with root package name */
    private long f8887x;

    private p(String str, com.anythink.expressad.exoplayer.k.u<String> uVar) {
        this(str, uVar, null);
    }

    private HttpURLConnection e() {
        return this.f8881r;
    }

    private long f() {
        return this.f8886w;
    }

    private long g() {
        return this.f8887x;
    }

    private long h() {
        long j10 = this.f8885v;
        if (j10 == -1) {
            return j10;
        }
        return j10 - this.f8887x;
    }

    private void i() {
        if (this.f8886w == this.f8884u) {
            return;
        }
        byte[] andSet = f8872h.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j10 = this.f8886w;
            long j11 = this.f8884u;
            if (j10 != j11) {
                int read = this.f8882s.read(andSet, 0, (int) Math.min(j11 - j10, andSet.length));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        this.f8886w += read;
                        aa<? super p> aaVar = this.f8879p;
                        if (aaVar != null) {
                            aaVar.a(read);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    throw new InterruptedIOException();
                }
            } else {
                f8872h.set(andSet);
                return;
            }
        }
    }

    private void j() {
        HttpURLConnection httpURLConnection = this.f8881r;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Log.e(f8869d, "Unexpected error while disconnecting", e10);
            }
            this.f8881r = null;
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f8881r;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r3 > com.anythink.expressad.exoplayer.j.p.f) goto L21;
     */
    @Override // com.anythink.expressad.exoplayer.j.s, com.anythink.expressad.exoplayer.j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f8882s     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L75
            java.net.HttpURLConnection r2 = r9.f8881r     // Catch: java.lang.Throwable -> L88
            long r3 = r9.f8885v     // Catch: java.lang.Throwable -> L88
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.f8887x     // Catch: java.lang.Throwable -> L88
            long r3 = r3 - r7
        L14:
            int r7 = com.anythink.expressad.exoplayer.k.af.f8993a     // Catch: java.lang.Throwable -> L88
            r8 = 19
            if (r7 == r8) goto L1e
            r8 = 20
            if (r7 != r8) goto L65
        L1e:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L2e
            int r3 = r2.read()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r4 = -1
            if (r3 != r4) goto L34
            goto L65
        L2e:
            r5 = 2048(0x800, double:1.012E-320)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L65
        L34:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            if (r4 != 0) goto L4c
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            if (r3 == 0) goto L65
        L4c:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
        L65:
            java.io.InputStream r2 = r9.f8882s     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L88
            r2.close()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L88
            goto L75
        L6b:
            r2 = move-exception
            com.anythink.expressad.exoplayer.j.s$c r3 = new com.anythink.expressad.exoplayer.j.s$c     // Catch: java.lang.Throwable -> L88
            com.anythink.expressad.exoplayer.j.k r4 = r9.f8880q     // Catch: java.lang.Throwable -> L88
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L88
            throw r3     // Catch: java.lang.Throwable -> L88
        L75:
            r9.f8882s = r0
            r9.j()
            boolean r0 = r9.f8883t
            if (r0 == 0) goto L87
            r9.f8883t = r1
            com.anythink.expressad.exoplayer.j.aa<? super com.anythink.expressad.exoplayer.j.p> r0 = r9.f8879p
            if (r0 == 0) goto L87
            r0.c()
        L87:
            return
        L88:
            r2 = move-exception
            r9.f8882s = r0
            r9.j()
            boolean r0 = r9.f8883t
            if (r0 == 0) goto L9b
            r9.f8883t = r1
            com.anythink.expressad.exoplayer.j.aa<? super com.anythink.expressad.exoplayer.j.p> r0 = r9.f8879p
            if (r0 == 0) goto L9b
            r0.c()
        L9b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.j.p.b():void");
    }

    @Override // com.anythink.expressad.exoplayer.j.s
    public final Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.f8881r;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.anythink.expressad.exoplayer.j.s
    public final void d() {
        this.o.a();
    }

    private p(String str, com.anythink.expressad.exoplayer.k.u<String> uVar, aa<? super p> aaVar) {
        this(str, uVar, aaVar, (byte) 0);
    }

    @Override // com.anythink.expressad.exoplayer.j.s
    public final void a(String str, String str2) {
        com.anythink.expressad.exoplayer.k.a.a(str);
        com.anythink.expressad.exoplayer.k.a.a(str2);
        this.o.a(str, str2);
    }

    private p(String str, com.anythink.expressad.exoplayer.k.u<String> uVar, aa<? super p> aaVar, byte b10) {
        this(str, uVar, aaVar, 8000, 8000, false, null);
    }

    public p(String str, com.anythink.expressad.exoplayer.k.u<String> uVar, aa<? super p> aaVar, int i10, int i11, boolean z10, s.f fVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f8876l = str;
            this.f8877m = uVar;
            this.f8879p = aaVar;
            this.o = new s.f();
            this.f8874j = i10;
            this.f8875k = i11;
            this.f8873i = z10;
            this.f8878n = fVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.anythink.expressad.exoplayer.j.s
    public final void a(String str) {
        com.anythink.expressad.exoplayer.k.a.a(str);
        this.o.a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0074, code lost:
    
        r0 = r1;
     */
    @Override // com.anythink.expressad.exoplayer.j.s, com.anythink.expressad.exoplayer.j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.anythink.expressad.exoplayer.j.k r25) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.j.p.a(com.anythink.expressad.exoplayer.j.k):long");
    }

    private HttpURLConnection b(k kVar) {
        HttpURLConnection a10;
        URL url = new URL(kVar.f8815c.toString());
        byte[] bArr = kVar.f8816d;
        long j10 = kVar.f;
        long j11 = kVar.f8818g;
        boolean a11 = kVar.a(1);
        if (!this.f8873i) {
            return a(url, bArr, j10, j11, a11, true);
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 <= 20) {
                a10 = a(url, bArr, j10, j11, a11, false);
                int responseCode = a10.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    String headerField = a10.getHeaderField("Location");
                    a10.disconnect();
                    if (headerField != null) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (!"https".equals(protocol) && !"http".equals(protocol)) {
                            throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                        }
                        bArr = null;
                        url = url2;
                        i10 = i11;
                    } else {
                        throw new ProtocolException("Null location redirect");
                    }
                }
            } else {
                throw new NoRouteToHostException("Too many redirects: ".concat(String.valueOf(i11)));
            }
        }
        return a10;
    }

    private int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f8885v;
        if (j10 != -1) {
            long j11 = j10 - this.f8887x;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = this.f8882s.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f8885v == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f8887x += read;
        aa<? super p> aaVar = this.f8879p;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    private HttpURLConnection a(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f8874j);
        httpURLConnection.setReadTimeout(this.f8875k);
        s.f fVar = this.f8878n;
        if (fVar != null) {
            for (Map.Entry<String, String> entry : fVar.b().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.o.b().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String k10 = a3.l.k("bytes=", j10, "-");
            if (j11 != -1) {
                StringBuilder j12 = com.ironsource.adapters.facebook.a.j(k10);
                j12.append((j10 + j11) - 1);
                k10 = j12.toString();
            }
            httpURLConnection.setRequestProperty("Range", k10);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f8876l);
        if (!z10) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private static URL a(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
        }
        throw new ProtocolException("Null location redirect");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long a(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L29
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L2b
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.<init>(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
        L29:
            r4 = -1
        L2b:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L9b
            java.util.regex.Pattern r1 = com.anythink.expressad.exoplayer.j.p.f8871g
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L9b
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> L87
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L87
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> L87
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L87
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L61
            r4 = r6
            goto L9b
        L61:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L9b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r8 = "Inconsistent headers ["
            r1.<init>(r8)     // Catch: java.lang.NumberFormatException -> L87
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L87
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L87
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r0 = r1.toString()     // Catch: java.lang.NumberFormatException -> L87
            android.util.Log.w(r3, r0)     // Catch: java.lang.NumberFormatException -> L87
            long r0 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> L87
            r4 = r0
            goto L9b
        L87:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.<init>(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            android.util.Log.e(r3, r10)
        L9b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.j.p.a(java.net.HttpURLConnection):long");
    }

    private static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10 = af.f8993a;
        if (i10 == 19 || i10 == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= f) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.s, com.anythink.expressad.exoplayer.j.h
    public final int a(byte[] bArr, int i10, int i11) {
        try {
            if (this.f8886w != this.f8884u) {
                byte[] andSet = f8872h.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j10 = this.f8886w;
                    long j11 = this.f8884u;
                    if (j10 != j11) {
                        int read = this.f8882s.read(andSet, 0, (int) Math.min(j11 - j10, andSet.length));
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.f8886w += read;
                            aa<? super p> aaVar = this.f8879p;
                            if (aaVar != null) {
                                aaVar.a(read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        f8872h.set(andSet);
                        break;
                    }
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.f8885v;
            if (j12 != -1) {
                long j13 = j12 - this.f8887x;
                if (j13 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j13);
            }
            int read2 = this.f8882s.read(bArr, i10, i11);
            if (read2 == -1) {
                if (this.f8885v == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f8887x += read2;
            aa<? super p> aaVar2 = this.f8879p;
            if (aaVar2 != null) {
                aaVar2.a(read2);
            }
            return read2;
        } catch (IOException e10) {
            throw new s.c(e10, this.f8880q, 2);
        }
    }
}
