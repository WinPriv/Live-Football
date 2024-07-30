package com.onesignal;

import com.onesignal.v3;
import org.json.JSONArray;

/* compiled from: OneSignalRemoteParams.java */
/* loaded from: classes2.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public static int f27028a;

    /* compiled from: OneSignalRemoteParams.java */
    /* loaded from: classes2.dex */
    public class a extends v3.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f27029a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27030b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f27031c;

        /* compiled from: OneSignalRemoteParams.java */
        /* renamed from: com.onesignal.s3$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0350a implements Runnable {
            public RunnableC0350a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i10 = (s3.f27028a * 10000) + 30000;
                if (i10 > 90000) {
                    i10 = 90000;
                }
                e3.b(5, "Failed to get Android parameters, trying again in " + (i10 / 1000) + " seconds.", null);
                try {
                    Thread.sleep(i10);
                    s3.f27028a++;
                    a aVar = a.this;
                    s3.a(aVar.f27029a, aVar.f27030b, aVar.f27031c);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }

        public a(String str, String str2, b bVar) {
            this.f27029a = str;
            this.f27030b = str2;
            this.f27031c = bVar;
        }

        @Override // com.onesignal.v3.c
        public final void a(int i10, String str, Throwable th) {
            if (i10 == 403) {
                e3.b(2, "403 error getting OneSignal params, omitting further retries!", null);
            } else {
                new Thread(new RunnableC0350a(), "OS_PARAMS_REQUEST").start();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
        @Override // com.onesignal.v3.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(java.lang.String r12) {
            /*
                Method dump skipped, instructions count: 547
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.s3.a.b(java.lang.String):void");
        }
    }

    /* compiled from: OneSignalRemoteParams.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* compiled from: OneSignalRemoteParams.java */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f27033a;

        /* renamed from: b, reason: collision with root package name */
        public String f27034b;

        /* renamed from: c, reason: collision with root package name */
        public String f27035c;
    }

    /* compiled from: OneSignalRemoteParams.java */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f27036a = 1440;

        /* renamed from: b, reason: collision with root package name */
        public int f27037b = 10;

        /* renamed from: c, reason: collision with root package name */
        public int f27038c = 1440;

        /* renamed from: d, reason: collision with root package name */
        public int f27039d = 10;

        /* renamed from: e, reason: collision with root package name */
        public boolean f27040e = false;
        public boolean f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f27041g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f27042h = false;

        public final String toString() {
            return "InfluenceParams{indirectNotificationAttributionWindow=" + this.f27036a + ", notificationLimit=" + this.f27037b + ", indirectIAMAttributionWindow=" + this.f27038c + ", iamLimit=" + this.f27039d + ", directEnabled=" + this.f27040e + ", indirectEnabled=" + this.f + ", unattributedEnabled=" + this.f27041g + '}';
        }
    }

    /* compiled from: OneSignalRemoteParams.java */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public String f27043a;

        /* renamed from: b, reason: collision with root package name */
        public JSONArray f27044b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f27045c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f27046d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f27047e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public Boolean f27048g;

        /* renamed from: h, reason: collision with root package name */
        public Boolean f27049h;

        /* renamed from: i, reason: collision with root package name */
        public Boolean f27050i;

        /* renamed from: j, reason: collision with root package name */
        public Boolean f27051j;

        /* renamed from: k, reason: collision with root package name */
        public d f27052k;

        /* renamed from: l, reason: collision with root package name */
        public c f27053l;
    }

    public static void a(String str, String str2, b bVar) {
        a aVar = new a(str, str2, bVar);
        String l10 = a3.k.l("apps/", str, "/android_params.js");
        if (str2 != null) {
            l10 = e0.i.f(l10, "?player_id=", str2);
        }
        e3.b(6, "Starting request to get Android parameters.", null);
        new Thread(new w3(l10, aVar, "CACHE_KEY_REMOTE_PARAMS"), "OS_REST_ASYNC_GET").start();
    }
}
