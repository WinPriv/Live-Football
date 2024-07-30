package c6;

import android.net.Uri;
import c6.j;
import com.ironsource.mediationsdk.config.VersionInfo;
import j7.b1;
import j7.f2;
import j7.k1;
import j7.m1;
import j7.w1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: DefaultHttpDataSource.java */
/* loaded from: classes2.dex */
public final class r extends f {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3427e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3428g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3429h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.appcompat.widget.g f3430i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.appcompat.widget.g f3431j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3432k;

    /* renamed from: l, reason: collision with root package name */
    public final i7.h<String> f3433l;

    /* renamed from: m, reason: collision with root package name */
    public HttpURLConnection f3434m;

    /* renamed from: n, reason: collision with root package name */
    public InputStream f3435n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public int f3436p;

    /* renamed from: q, reason: collision with root package name */
    public long f3437q;

    /* renamed from: r, reason: collision with root package name */
    public long f3438r;

    /* compiled from: DefaultHttpDataSource.java */
    /* loaded from: classes2.dex */
    public static final class a implements j.a {

        /* renamed from: b, reason: collision with root package name */
        public String f3440b;

        /* renamed from: a, reason: collision with root package name */
        public final androidx.appcompat.widget.g f3439a = new androidx.appcompat.widget.g(2);

        /* renamed from: c, reason: collision with root package name */
        public final int f3441c = 8000;

        /* renamed from: d, reason: collision with root package name */
        public final int f3442d = 8000;

        @Override // c6.j.a
        public final j a() {
            return new r(this.f3440b, this.f3441c, this.f3442d, this.f3439a);
        }
    }

    /* compiled from: DefaultHttpDataSource.java */
    /* loaded from: classes2.dex */
    public static class b extends j7.z<String, List<String>> {

        /* renamed from: t, reason: collision with root package name */
        public final Map<String, List<String>> f3443t;

        public b(Map<String, List<String>> map) {
            this.f3443t = map;
        }

        @Override // j7.z, java.util.Map
        public final boolean containsKey(Object obj) {
            if (obj != null && super.containsKey(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map
        public final boolean containsValue(Object obj) {
            return b1.b(new k1(((j7.l) entrySet()).iterator()), obj);
        }

        @Override // j7.z, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return f2.b(super.entrySet(), new i7.h() { // from class: com.google.android.exoplayer2.ui.g
                @Override // i7.h
                public final boolean apply(Object obj) {
                    if (((Map.Entry) obj).getKey() != null) {
                        return true;
                    }
                    return false;
                }
            });
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            if (obj != null && m1.a(this, obj)) {
                return true;
            }
            return false;
        }

        @Override // j7.z, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return f2.c(entrySet());
        }

        @Override // j7.z, java.util.Map
        public final boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            if (super.size() == 1 && super.containsKey(null)) {
                return true;
            }
            return false;
        }

        @Override // j7.z, java.util.Map
        public final Set<String> keySet() {
            return f2.b(super.keySet(), new i7.h() { // from class: c6.s
                @Override // i7.h
                public final boolean apply(Object obj) {
                    if (((String) obj) != null) {
                        return true;
                    }
                    return false;
                }
            });
        }

        @Override // z6.f
        public final Object p() {
            return this.f3443t;
        }

        @Override // j7.z, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public r(String str, int i10, int i11, androidx.appcompat.widget.g gVar) {
        super(true);
        this.f3429h = str;
        this.f = i10;
        this.f3428g = i11;
        this.f3427e = false;
        this.f3430i = gVar;
        this.f3433l = null;
        this.f3431j = new androidx.appcompat.widget.g(2);
        this.f3432k = false;
    }

    public static void s(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = d6.g0.f27302a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // c6.j
    public final void close() throws w {
        try {
            InputStream inputStream = this.f3435n;
            if (inputStream != null) {
                long j10 = this.f3437q;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f3438r;
                }
                s(this.f3434m, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = d6.g0.f27302a;
                    throw new w(e10, 2000, 3);
                }
            }
        } finally {
            this.f3435n = null;
            o();
            if (this.o) {
                this.o = false;
                l();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0139 A[Catch: IOException -> 0x0162, TRY_LEAVE, TryCatch #3 {IOException -> 0x0162, blocks: (B:26:0x0131, B:28:0x0139), top: B:25:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a6  */
    @Override // c6.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(c6.m r22) throws c6.w {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.r.f(c6.m):long");
    }

    @Override // c6.j
    public final Map<String, List<String>> g() {
        HttpURLConnection httpURLConnection = this.f3434m;
        if (httpURLConnection == null) {
            return w1.y;
        }
        return new b(httpURLConnection.getHeaderFields());
    }

    @Override // c6.j
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f3434m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void o() {
        HttpURLConnection httpURLConnection = this.f3434m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                d6.p.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f3434m = null;
        }
    }

    public final URL p(URL url, String str) throws w {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new w(s.f.b("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f3427e && !protocol.equals(url.getProtocol())) {
                    throw new w("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e10) {
                throw new w(e10, 2001, 1);
            }
        }
        throw new w("Null location redirect", 2001);
    }

    public final HttpURLConnection q(m mVar) throws IOException {
        boolean z10;
        HttpURLConnection r10;
        boolean z11;
        m mVar2 = mVar;
        URL url = new URL(mVar2.f3377a.toString());
        int i10 = mVar2.f3379c;
        byte[] bArr = mVar2.f3380d;
        long j10 = mVar2.f;
        long j11 = mVar2.f3382g;
        if ((mVar2.f3384i & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = this.f3427e;
        boolean z13 = this.f3432k;
        if (!z12 && !z13) {
            return r(url, i10, bArr, j10, j11, z10, true, mVar2.f3381e);
        }
        URL url2 = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                Map<String, String> map = mVar2.f3381e;
                URL url3 = url2;
                int i14 = i11;
                boolean z14 = z13;
                long j12 = j11;
                r10 = r(url2, i11, bArr2, j10, j11, z10, false, map);
                int responseCode = r10.getResponseCode();
                String headerField = r10.getHeaderField("Location");
                if ((i14 != 1 && i14 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    r10.disconnect();
                    if (z14 && responseCode == 302) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        bArr2 = null;
                        i11 = 1;
                    } else {
                        i11 = i14;
                    }
                    url2 = p(url3, headerField);
                } else {
                    r10.disconnect();
                    url2 = p(url3, headerField);
                    i11 = i14;
                }
                mVar2 = mVar;
                i12 = i13;
                z13 = z14;
                j11 = j12;
            } else {
                throw new w(new NoRouteToHostException(a3.l.i("Too many redirects: ", i13)), 2001, 1);
            }
        }
        return r10;
    }

    public final HttpURLConnection r(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        String sb2;
        String str;
        boolean z12;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.f3428g);
        HashMap hashMap = new HashMap();
        androidx.appcompat.widget.g gVar = this.f3430i;
        if (gVar != null) {
            hashMap.putAll(gVar.e());
        }
        hashMap.putAll(this.f3431j.e());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = z.f3450a;
        if (j10 == 0 && j11 == -1) {
            sb2 = null;
        } else {
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("bytes=", j10, "-");
            if (j11 != -1) {
                k10.append((j10 + j11) - 1);
            }
            sb2 = k10.toString();
        }
        if (sb2 != null) {
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        String str3 = this.f3429h;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z10) {
            str = com.anythink.expressad.foundation.g.f.g.c.f10012d;
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z11);
        if (bArr != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        httpURLConnection.setDoOutput(z12);
        int i11 = m.f3376k;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str2 = VersionInfo.GIT_BRANCH;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    @Override // c6.h
    public final int read(byte[] bArr, int i10, int i11) throws w {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f3437q;
            if (j10 != -1) {
                long j11 = j10 - this.f3438r;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f3435n;
            int i12 = d6.g0.f27302a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f3438r += read;
                k(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            int i13 = d6.g0.f27302a;
            throw w.a(e10, 2);
        }
    }

    public final void t(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int min = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f3435n;
            int i10 = d6.g0.f27302a;
            int read = inputStream.read(bArr, 0, min);
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j10 -= read;
                    k(read);
                } else {
                    throw new w();
                }
            } else {
                throw new w(new InterruptedIOException(), 2000, 1);
            }
        }
    }
}
