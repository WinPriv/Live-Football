package com.ironsource.d;

import android.util.Pair;
import com.anythink.expressad.exoplayer.d;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static b f24597c;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet<ImpressionDataListener> f24598a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, List<String>> f24599b = new ConcurrentHashMap<>();

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f24600a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24601b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24602c;

        /* renamed from: d, reason: collision with root package name */
        public final int f24603d;

        /* renamed from: e, reason: collision with root package name */
        public final int f24604e;
        public final String f;

        /* renamed from: g, reason: collision with root package name */
        public final ArrayList<Pair<String, String>> f24605g;

        /* renamed from: com.ironsource.d.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0319a {

            /* renamed from: b, reason: collision with root package name */
            public String f24607b;

            /* renamed from: d, reason: collision with root package name */
            public String f24609d;

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList f24606a = new ArrayList();

            /* renamed from: c, reason: collision with root package name */
            public String f24608c = "POST";

            /* renamed from: e, reason: collision with root package name */
            public final int f24610e = d.f7613a;
            public final int f = d.f7613a;

            /* renamed from: g, reason: collision with root package name */
            public final String f24611g = "UTF-8";

            public final C0319a a(List<Pair<String, String>> list) {
                this.f24606a.addAll(list);
                return this;
            }

            public final a a() {
                return new a(this);
            }
        }

        public a(C0319a c0319a) {
            this.f24600a = c0319a.f24607b;
            this.f24601b = c0319a.f24608c;
            this.f24602c = c0319a.f24609d;
            this.f24605g = new ArrayList<>(c0319a.f24606a);
            this.f24603d = c0319a.f24610e;
            this.f24604e = c0319a.f;
            this.f = c0319a.f24611g;
        }
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f24597c == null) {
                f24597c = new b();
            }
            bVar = f24597c;
        }
        return bVar;
    }

    public static void b(HttpURLConnection httpURLConnection, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    public static void c(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    public ConcurrentHashMap<String, List<String>> d() {
        return this.f24599b;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ironsource.d.c a(com.ironsource.d.b.a r7) {
        /*
            java.lang.String r0 = r7.f24600a
            java.lang.String r1 = r7.f24601b
            java.lang.String r2 = r7.f24602c
            if (r0 == 0) goto L18
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L18
            if (r2 == 0) goto L18
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto Lc0
            com.ironsource.d.c r3 = new com.ironsource.d.c
            r3.<init>()
            r4 = 0
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            java.net.URLConnection r5 = r5.openConnection()     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            int r6 = r7.f24603d     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            r5.setConnectTimeout(r6)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            int r6 = r7.f24604e     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            r5.setReadTimeout(r6)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            r5.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r6 = r7.f24605g     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            b(r5, r6)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            java.lang.String r6 = "POST"
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            if (r1 == 0) goto L59
            java.lang.String r7 = r7.f     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            byte[] r7 = r2.getBytes(r7)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            int r1 = r7.length     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            java.lang.String r2 = "Content-Length"
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            r5.setRequestProperty(r2, r1)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            c(r5, r7)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
        L59:
            java.io.InputStream r4 = r5.getInputStream()     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            int r7 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            r3.f24612a = r7     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            if (r4 == 0) goto L6b
            byte[] r7 = com.ironsource.environment.a.AnonymousClass1.a(r4)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            r3.f24613b = r7     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
        L6b:
            if (r4 == 0) goto L70
            r4.close()
        L70:
            r5.disconnect()
            goto Lb0
        L74:
            r7 = move-exception
            goto Lb5
        L76:
            r7 = move-exception
            r1 = r4
            r4 = r5
            goto L7f
        L7a:
            r7 = move-exception
            r5 = r4
            goto Lb5
        L7d:
            r7 = move-exception
            r1 = r4
        L7f:
            if (r4 == 0) goto Lb1
            int r2 = r4.getResponseCode()     // Catch: java.lang.Throwable -> Lb2
            r3.f24612a = r2     // Catch: java.lang.Throwable -> Lb2
            r5 = 400(0x190, float:5.6E-43)
            if (r2 < r5) goto Lb1
            java.lang.String r7 = "ISHttpService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = "Failed post to "
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lb2
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = " StatusCode: "
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb2
            int r0 = r3.f24612a     // Catch: java.lang.Throwable -> Lb2
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lb2
            android.util.Log.d(r7, r0)     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto Lad
            r1.close()
        Lad:
            r4.disconnect()
        Lb0:
            return r3
        Lb1:
            throw r7     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r7 = move-exception
            r5 = r4
            r4 = r1
        Lb5:
            if (r4 == 0) goto Lba
            r4.close()
        Lba:
            if (r5 == 0) goto Lbf
            r5.disconnect()
        Lbf:
            throw r7
        Lc0:
            java.security.InvalidParameterException r7 = new java.security.InvalidParameterException
            java.lang.String r0 = "not valid params"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.d.b.a(com.ironsource.d.b$a):com.ironsource.d.c");
    }

    public HashSet<ImpressionDataListener> b() {
        return this.f24598a;
    }

    public void c() {
        synchronized (this) {
            this.f24598a.clear();
        }
    }

    public static c a(String str, String str2, List<Pair<String, String>> list) {
        a.C0319a c0319a = new a.C0319a();
        c0319a.f24607b = str;
        c0319a.f24609d = str2;
        c0319a.f24608c = "POST";
        c0319a.a(list);
        return a(c0319a.a());
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f24598a.remove(impressionDataListener);
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f24598a.add(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f24599b.put(str, list);
    }
}
