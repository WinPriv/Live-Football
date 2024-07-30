package com.applovin.impl.sdk.network;

import android.os.Process;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue<b> f19120a = new PriorityBlockingQueue<>();

    /* renamed from: b, reason: collision with root package name */
    private final p f19121b;

    /* loaded from: classes.dex */
    public static class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        private static final AtomicInteger f19127a = new AtomicInteger();

        /* renamed from: b, reason: collision with root package name */
        private final String f19128b;

        /* renamed from: c, reason: collision with root package name */
        private final String f19129c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<String, String> f19130d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f19131e;
        private final int f;

        /* renamed from: g, reason: collision with root package name */
        private final m0.a<c> f19132g;

        /* renamed from: h, reason: collision with root package name */
        private final Executor f19133h;

        /* renamed from: i, reason: collision with root package name */
        private final int f19134i;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f19135a;

            /* renamed from: b, reason: collision with root package name */
            private String f19136b;

            /* renamed from: c, reason: collision with root package name */
            private Map<String, String> f19137c = CollectionUtils.map();

            /* renamed from: d, reason: collision with root package name */
            private byte[] f19138d;

            /* renamed from: e, reason: collision with root package name */
            private int f19139e;
            private m0.a<c> f;

            /* renamed from: g, reason: collision with root package name */
            private Executor f19140g;

            public a a(String str) {
                this.f19135a = str;
                return this;
            }

            public a b(String str) {
                this.f19136b = str;
                return this;
            }

            public a a(Map<String, String> map) {
                if (map == null) {
                    map = CollectionUtils.map();
                }
                this.f19137c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f19137c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f19138d = bArr;
                return this;
            }

            public a a(int i10) {
                this.f19139e = i10;
                return this;
            }

            public a a(m0.a<c> aVar) {
                this.f = aVar;
                return this;
            }

            public a a(Executor executor) {
                this.f19140g = executor;
                return this;
            }

            public b a() {
                return new b(this);
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.f19134i - bVar.f19134i;
        }

        private b(a aVar) {
            this.f19128b = aVar.f19135a;
            this.f19129c = aVar.f19136b;
            this.f19130d = aVar.f19137c != null ? aVar.f19137c : Collections.emptyMap();
            this.f19131e = aVar.f19138d;
            this.f = aVar.f19139e;
            this.f19132g = aVar.f;
            this.f19133h = aVar.f19140g;
            this.f19134i = f19127a.incrementAndGet();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f19141a;

        /* renamed from: b, reason: collision with root package name */
        private final String f19142b;

        /* renamed from: c, reason: collision with root package name */
        private final String f19143c;

        /* renamed from: d, reason: collision with root package name */
        private final Throwable f19144d;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f19145a;

            /* renamed from: b, reason: collision with root package name */
            private String f19146b;

            /* renamed from: c, reason: collision with root package name */
            private String f19147c;

            /* renamed from: d, reason: collision with root package name */
            private Throwable f19148d;

            public a a(int i10) {
                this.f19145a = i10;
                return this;
            }

            public a b(String str) {
                this.f19147c = str;
                return this;
            }

            public a a(String str) {
                this.f19146b = str;
                return this;
            }

            public a a(Throwable th) {
                this.f19148d = th;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        public static a d() {
            return new a();
        }

        public int a() throws Throwable {
            Throwable th = this.f19144d;
            if (th == null) {
                return this.f19141a;
            }
            throw th;
        }

        public String b() throws Throwable {
            Throwable th = this.f19144d;
            if (th == null) {
                return this.f19142b;
            }
            throw th;
        }

        public String c() {
            return this.f19143c;
        }

        private c(a aVar) {
            this.f19141a = aVar.f19145a;
            this.f19142b = aVar.f19146b;
            this.f19143c = aVar.f19147c;
            this.f19144d = aVar.f19148d;
        }
    }

    public e(p pVar) {
        this.f19121b = pVar;
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f19121b.a(com.applovin.impl.sdk.c.b.av)).intValue(); i10++) {
            new a(this.f19120a, i10, this.f19121b).start();
        }
    }

    /* loaded from: classes.dex */
    public static class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final BlockingQueue<b> f19122a;

        /* renamed from: b, reason: collision with root package name */
        private final p f19123b;

        private a(BlockingQueue<b> blockingQueue, int i10, p pVar) {
            super(a3.l.i("AL-Network-", i10));
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (pVar != null) {
                this.f19122a = blockingQueue;
                this.f19123b = pVar;
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }

        private void a() throws InterruptedException {
            a(this.f19122a.take());
        }

        private HttpURLConnection b(b bVar) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(bVar.f19128b).openConnection();
            httpURLConnection.setRequestMethod(bVar.f19129c);
            httpURLConnection.setConnectTimeout(bVar.f);
            httpURLConnection.setReadTimeout(bVar.f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!bVar.f19130d.isEmpty()) {
                for (Map.Entry entry : bVar.f19130d.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private void a(final b bVar) {
            HttpURLConnection httpURLConnection;
            InputStream inputStream;
            InputStream inputStream2;
            String str;
            InputStream inputStream3;
            String str2;
            int i10 = 0;
            String str3 = null;
            try {
                httpURLConnection = b(bVar);
                try {
                    if (bVar.f19131e != null && bVar.f19131e.length > 0) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setFixedLengthStreamingMode(bVar.f19131e.length);
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        outputStream.write(bVar.f19131e);
                        outputStream.close();
                    }
                    i10 = httpURLConnection.getResponseCode();
                    if (i10 > 0) {
                        inputStream3 = httpURLConnection.getInputStream();
                        try {
                            str2 = com.applovin.impl.sdk.utils.i.a(inputStream3, this.f19123b);
                        } catch (Throwable th) {
                            inputStream = inputStream3;
                            th = th;
                            try {
                                this.f19123b.L();
                                if (y.a()) {
                                    this.f19123b.L().a("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                }
                                if (httpURLConnection != null) {
                                    try {
                                        inputStream2 = httpURLConnection.getErrorStream();
                                    } catch (Throwable unused) {
                                        inputStream2 = null;
                                    }
                                    try {
                                        str = com.applovin.impl.sdk.utils.i.a(inputStream2, this.f19123b);
                                    } catch (Throwable unused2) {
                                        str = null;
                                        Utils.close(inputStream, this.f19123b);
                                        Utils.close(inputStream2, this.f19123b);
                                        Utils.disconnect(httpURLConnection, this.f19123b);
                                        final c a10 = c.d().a(i10).a(str3).b(str).a(th).a();
                                        bVar.f19133h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                bVar.f19132g.accept(a10);
                                            }
                                        });
                                    }
                                } else {
                                    inputStream2 = null;
                                    str = null;
                                }
                                Utils.close(inputStream, this.f19123b);
                                Utils.close(inputStream2, this.f19123b);
                                Utils.disconnect(httpURLConnection, this.f19123b);
                                final c a102 = c.d().a(i10).a(str3).b(str).a(th).a();
                                bVar.f19133h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        bVar.f19132g.accept(a102);
                                    }
                                });
                            } catch (Throwable th2) {
                                Utils.close(inputStream, this.f19123b);
                                Utils.close(null, this.f19123b);
                                Utils.disconnect(httpURLConnection, this.f19123b);
                                throw th2;
                            }
                        }
                    } else {
                        inputStream3 = null;
                        str2 = null;
                    }
                    Utils.close(inputStream3, this.f19123b);
                    Utils.close(null, this.f19123b);
                    Utils.disconnect(httpURLConnection, this.f19123b);
                    th = null;
                    str = null;
                    str3 = str2;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
                inputStream = null;
            }
            final c a1022 = c.d().a(i10).a(str3).b(str).a(th).a();
            bVar.f19133h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                @Override // java.lang.Runnable
                public void run() {
                    bVar.f19132g.accept(a1022);
                }
            });
        }
    }

    public void a(b bVar) {
        if (bVar != null) {
            this.f19120a.add(bVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
