package com.onesignal;

import java.lang.Thread;
import org.json.JSONObject;

/* compiled from: OneSignalRestClient.java */
/* loaded from: classes2.dex */
public final class v3 {

    /* compiled from: OneSignalRestClient.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f27144s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ JSONObject f27145t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f27146u;

        public a(String str, JSONObject jSONObject, c cVar) {
            this.f27144s = str;
            this.f27145t = jSONObject;
            this.f27146u = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            v3.a(this.f27144s, "POST", this.f27145t, this.f27146u, 120000, null);
        }
    }

    /* compiled from: OneSignalRestClient.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Thread[] f27147s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f27148t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f27149u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ JSONObject f27150v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c f27151w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f27152x;
        public final /* synthetic */ String y;

        public b(Thread[] threadArr, String str, String str2, JSONObject jSONObject, c cVar, int i10, String str3) {
            this.f27147s = threadArr;
            this.f27148t = str;
            this.f27149u = str2;
            this.f27150v = jSONObject;
            this.f27151w = cVar;
            this.f27152x = i10;
            this.y = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:96:0x02e4  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x02e6 A[Catch: all -> 0x0301, TRY_LEAVE, TryCatch #0 {all -> 0x0301, blocks: (B:89:0x02af, B:91:0x02b3, B:94:0x02b8, B:98:0x02e6, B:101:0x02cf), top: B:88:0x02af }] */
        /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Thread] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Thread[]] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Thread] */
        /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Thread] */
        /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Thread] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 778
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.v3.b.run():void");
        }
    }

    public static void a(String str, String str2, JSONObject jSONObject, c cVar, int i10, String str3) {
        if (!OSUtils.o()) {
            if (str2 != null && e3.R(null)) {
                return;
            }
            Thread[] threadArr = new Thread[1];
            Thread thread = new Thread(new b(threadArr, str, str2, jSONObject, cVar, i10, str3), "OS_HTTPConnection");
            thread.start();
            try {
                thread.join(i10 + 5000);
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                Thread thread2 = threadArr[0];
                if (thread2 != null) {
                    thread2.join();
                    return;
                }
                return;
            } catch (InterruptedException e10) {
                e10.printStackTrace();
                return;
            }
        }
        throw new x2(a3.k.l("Method: ", str2, " was called from the Main Thread!"));
    }

    public static void b(String str, JSONObject jSONObject, c cVar) {
        new Thread(new a(str, jSONObject, cVar), "OS_REST_ASYNC_POST").start();
    }

    /* compiled from: OneSignalRestClient.java */
    /* loaded from: classes2.dex */
    public static abstract class c {
        public void b(String str) {
        }

        public void a(int i10, String str, Throwable th) {
        }
    }
}
