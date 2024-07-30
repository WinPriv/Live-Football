package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final int f18969a = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: m, reason: collision with root package name */
    private static final h f18970m = new h();

    /* renamed from: c, reason: collision with root package name */
    private Handler f18972c;

    /* renamed from: e, reason: collision with root package name */
    private Handler f18974e;

    /* renamed from: h, reason: collision with root package name */
    private p f18976h;

    /* renamed from: i, reason: collision with root package name */
    private Thread f18977i;

    /* renamed from: j, reason: collision with root package name */
    private long f18978j;

    /* renamed from: k, reason: collision with root package name */
    private long f18979k;

    /* renamed from: l, reason: collision with root package name */
    private long f18980l;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f18971b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    private final HandlerThread f18973d = new HandlerThread("applovin-anr-detector");
    private final AtomicBoolean f = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f18975g = new AtomicBoolean();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!h.this.f.get()) {
                long currentTimeMillis = System.currentTimeMillis() - h.this.f18971b.get();
                if (currentTimeMillis < 0 || currentTimeMillis > h.this.f18978j) {
                    h.this.a();
                    h.this.b();
                }
                h.this.f18974e.postDelayed(this, h.this.f18980l);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!h.this.f.get()) {
                h.this.f18971b.set(System.currentTimeMillis());
                h.this.f18972c.postDelayed(this, h.this.f18979k);
            }
        }
    }

    private h() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f18978j = timeUnit.toMillis(4L);
        this.f18979k = timeUnit.toMillis(3L);
        this.f18980l = timeUnit.toMillis(3L);
    }

    private void b(p pVar) {
        if (this.f18975g.compareAndSet(false, true)) {
            this.f18976h = pVar;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.h.1
                @Override // java.lang.Runnable
                public void run() {
                    h.this.f18977i = Thread.currentThread();
                }
            });
            this.f18978j = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fB)).longValue();
            this.f18979k = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fC)).longValue();
            this.f18980l = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fD)).longValue();
            this.f18972c = new Handler(p.y().getMainLooper());
            this.f18973d.start();
            this.f18972c.post(new b());
            Handler handler = new Handler(this.f18973d.getLooper());
            this.f18974e = handler;
            handler.postDelayed(new a(), this.f18980l / 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[Catch: MalformedURLException -> 0x018c, TRY_ENTER, TryCatch #2 {MalformedURLException -> 0x018c, blocks: (B:9:0x0017, B:12:0x0027, B:13:0x0045, B:15:0x0049, B:17:0x0050, B:18:0x0074, B:20:0x0103, B:21:0x0105, B:23:0x0113, B:24:0x0115, B:28:0x0034, B:30:0x0038), top: B:8:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0103 A[Catch: MalformedURLException -> 0x018c, TryCatch #2 {MalformedURLException -> 0x018c, blocks: (B:9:0x0017, B:12:0x0027, B:13:0x0045, B:15:0x0049, B:17:0x0050, B:18:0x0074, B:20:0x0103, B:21:0x0105, B:23:0x0113, B:24:0x0115, B:28:0x0034, B:30:0x0038), top: B:8:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0113 A[Catch: MalformedURLException -> 0x018c, TryCatch #2 {MalformedURLException -> 0x018c, blocks: (B:9:0x0017, B:12:0x0027, B:13:0x0045, B:15:0x0049, B:17:0x0050, B:18:0x0074, B:20:0x0103, B:21:0x0105, B:23:0x0113, B:24:0x0115, B:28:0x0034, B:30:0x0038), top: B:8:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034 A[Catch: MalformedURLException -> 0x018c, TryCatch #2 {MalformedURLException -> 0x018c, blocks: (B:9:0x0017, B:12:0x0027, B:13:0x0045, B:15:0x0049, B:17:0x0050, B:18:0x0074, B:20:0x0103, B:21:0x0105, B:23:0x0113, B:24:0x0115, B:28:0x0034, B:30:0x0038), top: B:8:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.URL c() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.h.c():java.net.URL");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f18975g.get()) {
            this.f.set(true);
        }
    }

    public static void a(p pVar) {
        if (pVar != null) {
            if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fA)).booleanValue() && !Utils.isPubInDebugMode(p.y(), pVar)) {
                f18970m.b(pVar);
            } else {
                f18970m.a();
            }
        }
    }

    private static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) c().openConnection();
            int i10 = f18969a;
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(false);
            Log.d("applovin-anr-detector", "ANR reported with code " + httpURLConnection.getResponseCode());
        } catch (Throwable th) {
            Log.w("applovin-anr-detector", "Failed to report ANR", th);
        }
    }
}
