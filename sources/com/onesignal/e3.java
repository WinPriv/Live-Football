package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.constant.bj;
import com.onesignal.a0;
import com.onesignal.d4;
import com.onesignal.i4;
import com.onesignal.m;
import com.onesignal.r2;
import com.onesignal.r3;
import com.onesignal.s3;
import com.onesignal.v0;
import com.onesignal.v3;
import com.onesignal.z4;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignal.java */
/* loaded from: classes2.dex */
public final class e3 {
    public static final a4 A;
    public static final c3 B;
    public static final a4.l C;
    public static final r2 D;
    public static l2 E;
    public static y1.g F;
    public static y1 G;
    public static final h H;
    public static final String I;
    public static String J;
    public static final OSUtils K;
    public static boolean L;
    public static boolean M;
    public static boolean N;
    public static boolean O;
    public static boolean P;
    public static a0.d Q;
    public static final ArrayList R;
    public static final HashSet<String> S;
    public static final ArrayList<q> T;
    public static r1 U;
    public static m2 V;
    public static m2 W;
    public static d2<Object, a4.l> X;
    public static OSSubscriptionState Y;
    public static OSSubscriptionState Z;

    /* renamed from: a0, reason: collision with root package name */
    public static d2<Object, f1.f> f26747a0;

    /* renamed from: b, reason: collision with root package name */
    public static Context f26748b;

    /* renamed from: b0, reason: collision with root package name */
    public static n0 f26749b0;

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference<Activity> f26750c;

    /* renamed from: c0, reason: collision with root package name */
    public static n0 f26751c0;

    /* renamed from: d, reason: collision with root package name */
    public static String f26752d;

    /* renamed from: d0, reason: collision with root package name */
    public static d2<Object, m4> f26753d0;

    /* renamed from: e, reason: collision with root package name */
    public static String f26754e;

    /* renamed from: e0, reason: collision with root package name */
    public static p2 f26755e0;

    /* renamed from: f0, reason: collision with root package name */
    public static p2 f26756f0;

    /* renamed from: g0, reason: collision with root package name */
    public static d2<Object, m4> f26758g0;

    /* renamed from: h0, reason: collision with root package name */
    public static p f26760h0;

    /* renamed from: i0, reason: collision with root package name */
    public static d4 f26762i0;

    /* renamed from: m, reason: collision with root package name */
    public static t f26766m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f26767n;
    public static boolean o;

    /* renamed from: q, reason: collision with root package name */
    public static n4 f26769q;

    /* renamed from: r, reason: collision with root package name */
    public static l4 f26770r;

    /* renamed from: s, reason: collision with root package name */
    public static m4 f26771s;

    /* renamed from: t, reason: collision with root package name */
    public static final c3 f26772t;

    /* renamed from: u, reason: collision with root package name */
    public static com.onesignal.m f26773u;

    /* renamed from: v, reason: collision with root package name */
    public static final a1 f26774v;

    /* renamed from: w, reason: collision with root package name */
    public static final l3.d f26775w;

    /* renamed from: x, reason: collision with root package name */
    public static final o2 f26776x;
    public static final v2 y;

    /* renamed from: z, reason: collision with root package name */
    public static final w2 f26777z;

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f26746a = new ArrayList();
    public static int f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static int f26757g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static String f26759h = null;

    /* renamed from: i, reason: collision with root package name */
    public static String f26761i = null;

    /* renamed from: j, reason: collision with root package name */
    public static String f26763j = null;

    /* renamed from: k, reason: collision with root package name */
    public static int f26764k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public static cc.a f26765l = null;

    /* renamed from: p, reason: collision with root package name */
    public static m f26768p = m.APP_CLOSE;

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26778s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ n f26779t;

        public a(JSONObject jSONObject, n nVar) {
            this.f26778s = jSONObject;
            this.f26779t = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e3.f26772t.c("Running sendTags() operation from pending task queue.");
            e3.O(this.f26778s, this.f26779t);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class b implements r2.a {
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26780s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ n f26781t;

        public c(JSONObject jSONObject, n nVar) {
            this.f26780s = jSONObject;
            this.f26781t = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object opt;
            n nVar = this.f26781t;
            JSONObject jSONObject = this.f26780s;
            if (jSONObject == null) {
                e3.f26772t.d("Attempted to send null tags");
                if (nVar != null) {
                    nVar.onFailure();
                    return;
                }
                return;
            }
            z4.b d10 = b4.d(false);
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    opt = jSONObject.opt(next);
                } catch (Throwable unused) {
                }
                if (!(opt instanceof JSONArray) && !(opt instanceof JSONObject)) {
                    if (!jSONObject.isNull(next) && !"".equals(opt)) {
                        jSONObject2.put(next, opt.toString());
                    }
                    JSONObject jSONObject3 = d10.f27235b;
                    if (jSONObject3 != null && jSONObject3.has(next)) {
                        jSONObject2.put(next, "");
                    }
                }
                e3.b(3, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!", null);
            }
            if (!jSONObject2.toString().equals(JsonUtils.EMPTY_JSON)) {
                e3.f26772t.c("Available tags to send: " + jSONObject2.toString());
                try {
                    JSONObject put = new JSONObject().put("tags", jSONObject2);
                    b4.b().y(put, nVar);
                    b4.a().y(put, nVar);
                    b4.c().y(put, nVar);
                    return;
                } catch (JSONException e10) {
                    if (nVar != null) {
                        e10.getMessage();
                        e10.getStackTrace();
                        nVar.onFailure();
                    }
                    e10.printStackTrace();
                    return;
                }
            }
            e3.f26772t.c("Send tags ended successfully");
            if (nVar != null) {
                nVar.onSuccess();
            }
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ q f26782s;

        public d(q qVar) {
            this.f26782s = qVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e3.f26772t.c("Running getTags() operation from pending queue.");
            e3.r(this.f26782s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ q f26783s;

        public e(q qVar) {
            this.f26783s = qVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<q> arrayList = e3.T;
            synchronized (arrayList) {
                arrayList.add(this.f26783s);
                if (arrayList.size() > 1) {
                    return;
                }
                if (e3.s() == null) {
                    e3.f26772t.s("getTags called under a null user!");
                } else {
                    e3.z();
                }
            }
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class f implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            z4.b d10 = b4.d(!e3.N);
            if (d10.f27234a) {
                e3.N = true;
            }
            ArrayList<q> arrayList = e3.T;
            synchronized (arrayList) {
                Iterator<q> it = arrayList.iterator();
                while (it.hasNext()) {
                    q next = it.next();
                    if (d10.f27235b != null && !d10.toString().equals(JsonUtils.EMPTY_JSON)) {
                        jSONObject = d10.f27235b;
                        next.a(jSONObject);
                    }
                    jSONObject = null;
                    next.a(jSONObject);
                }
                e3.T.clear();
            }
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ s f26784s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f26785t;

        public g(s sVar, boolean z10) {
            this.f26784s = sVar;
            this.f26785t = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e3.f26772t.c("Running promptLocation() operation from pending queue.");
            e3.H(this.f26784s, this.f26785t);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class h {
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class i extends a0.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f26786a;

        public i(s sVar) {
            this.f26786a = sVar;
        }

        @Override // com.onesignal.a0.b
        public final void a(a0.d dVar) {
            if (!e3.R("promptLocation()") && dVar != null) {
                b4.f(dVar);
            }
        }

        @Override // com.onesignal.a0.e
        public final void b(u uVar) {
            s sVar = this.f26786a;
            if (sVar != null) {
                ((v0.g) sVar).a(uVar);
            }
        }

        @Override // com.onesignal.a0.b
        public final a0.f getType() {
            return a0.f.PROMPT_LOCATION;
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class j implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f26787s;

        public j(int i10) {
            this.f26787s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e3.f26772t.c("Running removeNotification() operation from pending queue.");
            e3.J(this.f26787s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class k implements d4.a {
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        
            if (r0 != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(int r5, java.lang.String r6) {
            /*
                r4 = this;
                com.onesignal.c3 r0 = com.onesignal.e3.f26772t
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "registerForPushToken completed with id: "
                r1.<init>(r2)
                r1.append(r6)
                java.lang.String r2 = " status: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                r0.c(r1)
                r0 = 0
                r1 = -6
                r2 = 1
                if (r5 >= r2) goto L36
                com.onesignal.v4 r3 = com.onesignal.b4.b()
                java.lang.String r3 = r3.n()
                if (r3 != 0) goto L3f
                int r3 = com.onesignal.e3.f26764k
                if (r3 == r2) goto L33
                if (r3 >= r1) goto L31
                r0 = r2
            L31:
                if (r0 == 0) goto L3f
            L33:
                com.onesignal.e3.f26764k = r5
                goto L3f
            L36:
                int r3 = com.onesignal.e3.f26764k
                if (r3 >= r1) goto L3b
                r0 = r2
            L3b:
                if (r0 == 0) goto L3f
                com.onesignal.e3.f26764k = r5
            L3f:
                com.onesignal.e3.J = r6
                com.onesignal.e3.L = r2
                android.content.Context r5 = com.onesignal.e3.f26748b
                com.onesignal.OSSubscriptionState r5 = com.onesignal.e3.k(r5)
                if (r6 != 0) goto L4f
                r5.getClass()
                goto L5f
            L4f:
                java.lang.String r0 = r5.f26618u
                boolean r0 = r6.equals(r0)
                r0 = r0 ^ r2
                r5.f26618u = r6
                if (r0 == 0) goto L5f
                com.onesignal.d2<java.lang.Object, com.onesignal.OSSubscriptionState> r6 = r5.f26616s
                r6.a(r5)
            L5f:
                com.onesignal.e3.d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e3.k.a(int, java.lang.String):void");
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public class l implements s3.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f26788a;

        public l(boolean z10) {
            this.f26788a = z10;
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public enum m {
        NOTIFICATION_CLICK,
        APP_OPEN,
        APP_CLOSE
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public interface n {
        void onFailure();

        void onSuccess();
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public interface o {
        void a(m mVar);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public final JSONArray f26793a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f26794b;

        /* renamed from: c, reason: collision with root package name */
        public v3.c f26795c;

        public p(JSONArray jSONArray) {
            this.f26793a = jSONArray;
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public interface q {
        void a(JSONObject jSONObject);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public interface r {
        void onComplete();
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public interface s {
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public interface t {
        void a();
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public enum u {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes2.dex */
    public interface v {
        void a(boolean z10);
    }

    static {
        c3 c3Var = new c3();
        f26772t = c3Var;
        b bVar = new b();
        f26774v = new a1();
        l3.d dVar = new l3.d();
        f26775w = dVar;
        o2 o2Var = new o2();
        f26776x = o2Var;
        y = new v2(c3Var);
        f26777z = new w2(o2Var, c3Var);
        A = new a4();
        c3 c3Var2 = new c3();
        B = c3Var2;
        a4.l lVar = new a4.l(c3Var2, c3Var, dVar);
        C = lVar;
        D = new r2(bVar, lVar, c3Var);
        H = new h();
        I = com.anythink.expressad.foundation.g.a.f.f9813a;
        K = new OSUtils();
        R = new ArrayList();
        S = new HashSet<>();
        T = new ArrayList<>();
    }

    public static boolean A() {
        return o;
    }

    public static void B(int i10, String str, String str2, Throwable th) {
        String str3;
        if (str2 != null) {
            int i11 = f;
            if (i11 != 0) {
                boolean z10 = true;
                if (5 - i11 >= 1) {
                    int i12 = f26757g;
                    if (i12 != 0) {
                        if (5 - i12 >= 1) {
                            z10 = false;
                        }
                    } else {
                        throw null;
                    }
                }
                if (z10) {
                    str3 = a3.k.l("\n", str2, "\n");
                    b(4, "HTTP code: " + i10 + " " + str + str3, th);
                }
            } else {
                throw null;
            }
        }
        str3 = "";
        b(4, "HTTP code: " + i10 + " " + str + str3, th);
    }

    public static void C(String str, String str2, boolean z10) {
        if (f26776x.f26958a == null && !P) {
            P = true;
            s3.a(str, str2, new l(z10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D(android.content.Context r6, org.json.JSONObject r7, com.onesignal.y1.a r8) {
        /*
            com.onesignal.y1 r0 = com.onesignal.e3.G
            if (r0 != 0) goto L11
            com.onesignal.p3 r6 = com.onesignal.p3.c(r6)
            com.onesignal.y1 r0 = new com.onesignal.y1
            com.onesignal.c3 r1 = com.onesignal.e3.f26772t
            r0.<init>(r6, r1)
            com.onesignal.e3.G = r0
        L11:
            com.onesignal.y1 r6 = com.onesignal.e3.G
            r6.getClass()
            java.lang.String r7 = com.onesignal.c3.g(r7)
            r0 = 1
            com.onesignal.s1 r1 = r6.f27200b
            if (r7 != 0) goto L2a
            java.lang.String r6 = "Notification notValidOrDuplicated with id null"
            com.onesignal.c3 r1 = (com.onesignal.c3) r1
            r1.c(r6)
            r8.a(r0)
            goto L7c
        L2a:
            java.lang.String r2 = ""
            boolean r2 = r2.equals(r7)
            r3 = 0
            if (r2 == 0) goto L37
            r8.a(r3)
            goto L7c
        L37:
            java.util.Set<java.lang.String> r2 = com.onesignal.OSNotificationWorkManager.f26613a
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r2 = r2 ^ r0
            if (r2 == 0) goto L64
            java.util.Set<java.lang.String> r2 = com.onesignal.OSNotificationWorkManager.f26613a
            boolean r4 = r2.contains(r7)
            if (r4 == 0) goto L61
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "OSNotificationWorkManager notification with notificationId: "
            r2.<init>(r4)
            r2.append(r7)
            java.lang.String r4 = " already queued"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            r5 = 6
            b(r5, r2, r4)
            goto L65
        L61:
            r2.add(r7)
        L64:
            r3 = r0
        L65:
            if (r3 != 0) goto L72
            java.lang.String r6 = "Notification notValidOrDuplicated with id duplicated"
            com.onesignal.c3 r1 = (com.onesignal.c3) r1
            r1.c(r6)
            r8.a(r0)
            goto L7c
        L72:
            com.onesignal.x1 r0 = new com.onesignal.x1
            r0.<init>(r6, r7, r8)
            java.lang.String r6 = "OS_NOTIFICATIONS_THREAD"
            com.onesignal.c3.p(r0, r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e3.D(android.content.Context, org.json.JSONObject, com.onesignal.y1$a):void");
    }

    public static void E() {
        boolean z10;
        AtomicLong atomicLong;
        if (R("onAppFocus")) {
            return;
        }
        m().a();
        g();
        n4 n4Var = f26769q;
        if (n4Var != null) {
            n4Var.b();
        }
        OSNotificationRestoreWorkManager.a(f26748b, false);
        m2 j10 = j(f26748b);
        j10.getClass();
        boolean a10 = OSUtils.a();
        if (j10.f26924t != a10) {
            z10 = true;
        } else {
            z10 = false;
        }
        j10.f26924t = a10;
        if (z10) {
            j10.f26923s.a(j10);
        }
        if (f26771s != null) {
            f26776x.getClass();
            if (r3.b(r3.f27010a, "GT_FIREBASE_TRACKING_ENABLED", false)) {
                m4 m4Var = f26771s;
                m4Var.getClass();
                if (m4.f26928e != null && m4.f26929g != null) {
                    f26775w.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - m4.f26928e.get() <= 120000 && ((atomicLong = m4.f) == null || currentTimeMillis - atomicLong.get() >= 30000)) {
                        try {
                            Object c10 = m4Var.c((Context) m4Var.f26932c);
                            Method d10 = m4.d(m4.f26927d);
                            Bundle bundle = new Bundle();
                            bundle.putString(av.aq, "OneSignal");
                            bundle.putString("medium", "notification");
                            bundle.putString("notification_id", m4.f26929g.f27070c);
                            bundle.putString("campaign", m4.b(m4.f26929g));
                            d10.invoke(c10, "os_notification_influence_open", bundle);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            }
        }
        s2 c11 = s2.c();
        Context context = f26748b;
        c11.getClass();
        synchronized (k0.f26884c) {
            c11.f27023d = 0L;
            if (!a0.g(context)) {
                c11.a(context);
            }
        }
    }

    public static void F(Activity activity, JSONArray jSONArray) {
        Intent q10;
        boolean z10;
        Intent launchIntentForPackage;
        boolean z11 = false;
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            zc.d.d(activity, bj.f.o);
            zc.d.d(jSONObject, "fcmPayload");
            f1.f fVar = new f1.f(activity, jSONObject);
            Uri c10 = fVar.c();
            if (c10 == null) {
                q10 = null;
            } else {
                q10 = OSUtils.q(c10);
            }
            if (c3.i((Context) fVar.f27933b) && fVar.c() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c3.l(jSONObject) != null) {
                z11 = true;
            }
            boolean z12 = z11 | z10;
            if (q10 == null) {
                if (z12 && (launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName())) != null) {
                    launchIntentForPackage.setPackage(null);
                    launchIntentForPackage.setFlags(270532608);
                    q10 = launchIntentForPackage;
                }
                q10 = null;
            }
            c3 c3Var = f26772t;
            if (q10 != null) {
                c3Var.getClass();
                b(5, "SDK running startActivity with Intent: " + q10, null);
                activity.startActivity(q10);
                return;
            }
            c3Var.getClass();
            b(5, "SDK not showing an Activity automatically due to it's settings.", null);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void G(boolean z10, f1 f1Var) {
        HashSet hashSet = j0.f26867a;
        if (f1Var != null) {
            j0.f26867a.add(f1Var);
        }
        if (OSUtils.a()) {
            j0.c(true);
            return;
        }
        if (!j0.f26869c) {
            if (z10) {
                j0.d();
                return;
            } else {
                j0.c(false);
                return;
            }
        }
        if (!PermissionsActivity.f26624u) {
            PermissionsActivity.f26625v = z10;
            c4 c4Var = new c4("NOTIFICATION", com.huawei.openalliance.ad.constant.w.cx, j0.class);
            boolean z11 = PermissionsActivity.f26624u;
            com.onesignal.a aVar = com.onesignal.c.f26699t;
            if (aVar != null) {
                com.onesignal.a.f26632d.put("com.onesignal.PermissionsActivity", c4Var);
                Activity activity = aVar.f26635b;
                if (activity != null) {
                    c4Var.a(activity);
                }
            }
        }
    }

    public static void H(s sVar, boolean z10) {
        w2 w2Var = f26777z;
        if (w2Var.d("promptLocation()")) {
            f26772t.d("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            w2Var.a(new g(sVar, z10));
        } else {
            if (R("promptLocation()")) {
                return;
            }
            a0.d(f26748b, true, z10, new i(sVar));
        }
    }

    public static void I() {
        boolean z10;
        i4.a aVar;
        d4 d4Var = f26762i0;
        if (d4Var == null) {
            new OSUtils();
            boolean z11 = true;
            if (OSUtils.b() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f26762i0 = new f4();
            } else {
                new OSUtils();
                if (OSUtils.b() != 1) {
                    z11 = false;
                }
                if (z11) {
                    if (OSUtils.g()) {
                        s3.c cVar = f26776x.f26958a.f27053l;
                        if (cVar != null) {
                            aVar = new i4.a(cVar.f27033a, cVar.f27034b, cVar.f27035c);
                        } else {
                            aVar = null;
                        }
                        f26762i0 = new i4(f26748b, aVar);
                    }
                } else {
                    f26762i0 = new k4();
                }
            }
            d4Var = f26762i0;
        }
        d4Var.a(f26748b, f26754e, new k());
    }

    public static void J(int i10) {
        w2 w2Var = f26777z;
        if (!w2Var.d("removeNotification()") && G != null) {
            if (R("removeNotification()")) {
                return;
            }
            y1 y1Var = G;
            WeakReference weakReference = new WeakReference(f26748b);
            y1Var.getClass();
            c3.p(new w1(y1Var, weakReference, i10), "OS_NOTIFICATIONS_THREAD");
            return;
        }
        f26772t.d("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
        w2Var.a(new j(i10));
    }

    public static boolean K() {
        if (f26748b != null) {
            o2 o2Var = f26776x;
            o2Var.getClass();
            String str = r3.f27010a;
            if (!r3.b(str, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", false)) {
                return false;
            }
            o2Var.getClass();
            if (r3.b(str, "ONESIGNAL_USER_PROVIDED_CONSENT", false)) {
                return false;
            }
        }
        return true;
    }

    public static void L(String str) {
        String str2;
        f26761i = str;
        if (f26748b == null) {
            return;
        }
        String str3 = r3.f27010a;
        if ("".equals(f26761i)) {
            str2 = null;
        } else {
            str2 = f26761i;
        }
        r3.h(str2, str3, "OS_EMAIL_ID");
    }

    public static void M(String str) {
        String str2;
        f26763j = str;
        if (f26748b == null) {
            return;
        }
        String str3 = r3.f27010a;
        if ("".equals(f26763j)) {
            str2 = null;
        } else {
            str2 = f26763j;
        }
        r3.h(str2, str3, "PREFS_OS_SMS_ID");
    }

    public static void N(JSONArray jSONArray, boolean z10, v3.c cVar) {
        if (R("sendPurchases()")) {
            return;
        }
        if (s() == null) {
            p pVar = new p(jSONArray);
            f26760h0 = pVar;
            pVar.f26794b = z10;
            pVar.f26795c = cVar;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", q());
            if (z10) {
                jSONObject.put("existing", true);
            }
            jSONObject.put("purchases", jSONArray);
            b4.e(jSONObject, cVar);
        } catch (Throwable th) {
            b(3, "Failed to generate JSON for sendPurchases.", th);
        }
    }

    public static void O(JSONObject jSONObject, n nVar) {
        w2 w2Var = f26777z;
        boolean d10 = w2Var.d("sendTags()");
        c3 c3Var = f26772t;
        if (d10) {
            c3Var.d("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            w2Var.a(new a(jSONObject, nVar));
        } else {
            if (R("sendTags()")) {
                return;
            }
            c cVar = new c(jSONObject, nVar);
            if (w2Var.b()) {
                c3Var.c("Sending sendTags() operation to pending task queue.");
                w2Var.a(cVar);
            } else {
                cVar.run();
            }
        }
    }

    public static void P(String str) {
        c3 c3Var = f26772t;
        if (str != null && !str.isEmpty()) {
            if (!str.equals(f26752d)) {
                f26767n = false;
                StringBuilder s10 = a3.l.s("setAppId called with id: ", str, " changing id from: ");
                s10.append(f26752d);
                c3Var.r(s10.toString());
            }
            f26752d = str;
            if (f26748b == null) {
                c3Var.s("appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!");
                return;
            }
            WeakReference<Activity> weakReference = f26750c;
            if (weakReference != null && weakReference.get() != null) {
                x(f26750c.get());
                return;
            } else {
                x(f26748b);
                return;
            }
        }
        c3Var.s("setAppId called with id: " + str + ", ignoring!");
    }

    public static void Q(long j10) {
        f26772t.c("Last session time set to: " + j10);
        r3.h(Long.valueOf(j10), r3.f27010a, "OS_LAST_SESSION_TIME");
    }

    public static boolean R(String str) {
        if (K()) {
            if (str != null) {
                b(4, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()", null);
                return true;
            }
            return true;
        }
        return false;
    }

    public static void a(int i10, String str) {
        b(i10, str, null);
    }

    public static void b(int i10, String str, Throwable th) {
        int i11 = f26757g;
        if (i10 != 0) {
            if (i11 != 0) {
                if (i10 - i11 < 1) {
                    if (i10 == 7) {
                        Log.v("OneSignal", str, th);
                    } else if (i10 == 6) {
                        Log.d("OneSignal", str, th);
                    } else if (i10 == 5) {
                        Log.i("OneSignal", str, th);
                    } else if (i10 == 4) {
                        Log.w("OneSignal", str, th);
                    } else if (i10 == 3 || i10 == 2) {
                        Log.e("OneSignal", str, th);
                    }
                }
                int i12 = f;
                if (i10 != 0) {
                    if (i12 != 0) {
                        if (i10 - i12 < 1 && i() != null) {
                            try {
                                String str2 = str + "\n";
                                if (th != null) {
                                    String str3 = str2 + th.getMessage();
                                    StringWriter stringWriter = new StringWriter();
                                    th.printStackTrace(new PrintWriter(stringWriter));
                                    str2 = str3 + stringWriter.toString();
                                }
                                OSUtils.s(new h3(i10, str2));
                                return;
                            } catch (Throwable th2) {
                                Log.e("OneSignal", "Error showing logging message.", th2);
                                return;
                            }
                        }
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b5, code lost:
    
        if ("".equals(r0) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e3.c():void");
    }

    public static void d() {
        StringBuilder sb2 = new StringBuilder("registerUser:registerForPushFired:");
        sb2.append(L);
        sb2.append(", locationFired: ");
        sb2.append(M);
        sb2.append(", remoteParams: ");
        o2 o2Var = f26776x;
        sb2.append(o2Var.f26958a);
        sb2.append(", appId: ");
        sb2.append(f26752d);
        String sb3 = sb2.toString();
        c3 c3Var = f26772t;
        c3Var.c(sb3);
        if (L && M && o2Var.f26958a != null && f26752d != null) {
            new Thread(new d3(), "OS_REG_USER").start();
        } else {
            c3Var.c("registerUser not possible");
        }
    }

    public static void e(String str) {
        m mVar = m.NOTIFICATION_CLICK;
        f26768p = mVar;
        r2 r2Var = D;
        r2Var.getClass();
        ((c3) r2Var.f27009c).c("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: " + str);
        if (str != null && !str.isEmpty()) {
            r2Var.a(mVar, str);
        }
    }

    public static void f() {
        if (o) {
            return;
        }
        l4 l4Var = f26770r;
        if (l4Var != null) {
            l4Var.c();
        }
        com.onesignal.m m10 = m();
        ((c3) m10.f26911c).c("Application backgrounded focus time: " + m10.f26909a);
        m.c a10 = m10.f26910b.a();
        ArrayList c10 = a10.c();
        b(6, a10.getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + a10.d() + " and influences: " + c10.toString(), null);
        a10.k(m.a.BACKGROUND);
        m10.f26909a = null;
        boolean u2 = b4.b().u();
        boolean u10 = b4.a().u();
        boolean u11 = b4.c().u();
        boolean z10 = false;
        if (u10) {
            if (b4.a().n() != null) {
                u10 = true;
            } else {
                u10 = false;
            }
        }
        if (u11) {
            if (b4.c().n() != null) {
                u11 = true;
            } else {
                u11 = false;
            }
        }
        if (u2 || u10 || u11) {
            z10 = true;
        }
        c3 c3Var = f26772t;
        c3Var.c("OneSignal scheduleSyncService unsyncedChanges: " + z10);
        if (z10) {
            s2 c11 = s2.c();
            Context context = f26748b;
            c11.getClass();
            b(7, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000", null);
            c11.d(context, 30000L);
        }
        c3Var.c("OneSignal scheduleSyncService locationScheduled: " + a0.g(f26748b));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g() {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e3.g():void");
    }

    public static b2 h(JSONArray jSONArray) {
        int length = jSONArray.length();
        int optInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        String str = null;
        JSONObject jSONObject = null;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jSONObject = jSONArray.getJSONObject(i10);
                if (str == null && jSONObject.has("actionId")) {
                    str = jSONObject.optString("actionId", null);
                }
                if (z10) {
                    z10 = false;
                } else {
                    arrayList.add(new t1(jSONObject));
                }
            } catch (Throwable th) {
                b(3, "Error parsing JSON item " + i10 + "/" + length + " for callback.", th);
            }
        }
        return new b2(new t1(arrayList, jSONObject, optInt), new a0.a());
    }

    public static Activity i() {
        com.onesignal.a aVar = com.onesignal.c.f26699t;
        if (aVar != null) {
            return aVar.f26635b;
        }
        return null;
    }

    public static m2 j(Context context) {
        if (context == null) {
            return null;
        }
        if (V == null) {
            m2 m2Var = new m2();
            V = m2Var;
            m2Var.f26923s.f26728b.add(new OSPermissionChangedInternalObserver());
        }
        return V;
    }

    public static OSSubscriptionState k(Context context) {
        if (context == null) {
            return null;
        }
        if (Y == null) {
            Y = new OSSubscriptionState(j(context).f26924t);
            j(context).f26923s.f26728b.add(new WeakReference(Y));
            d2<Object, OSSubscriptionState> d2Var = Y.f26616s;
            d2Var.f26728b.add(new OSSubscriptionChangedInternalObserver());
        }
        return Y;
    }

    public static String l() {
        if (f26761i == null && f26748b != null) {
            f26761i = r3.f(r3.f27010a, "OS_EMAIL_ID", null);
        }
        if (TextUtils.isEmpty(f26761i)) {
            return null;
        }
        return f26761i;
    }

    public static com.onesignal.m m() {
        if (f26773u == null) {
            f26773u = new com.onesignal.m(new p0(), f26772t);
        }
        return f26773u;
    }

    public static v0 n() {
        a1 a1Var = f26774v;
        p3 c10 = p3.c(f26748b);
        v2 v2Var = y;
        c3 c3Var = f26772t;
        c3 c3Var2 = B;
        cc.a aVar = f26765l;
        if (a1Var.f26660a == null) {
            synchronized (a1.f26659b) {
                if (a1Var.f26660a == null) {
                    a1Var.f26660a = new v0(c10, v2Var, c3Var, c3Var2, aVar);
                }
            }
        }
        return a1Var.f26660a;
    }

    public static l2 o() {
        if (E == null) {
            synchronized (H) {
                if (E == null) {
                    if (F == null) {
                        F = new y1.g(f26772t, A, p3.c(f26748b), B);
                    }
                    E = new l2(D, F);
                }
            }
        }
        return E;
    }

    public static String p() {
        if (f26763j == null && f26748b != null) {
            f26763j = r3.f(r3.f27010a, "PREFS_OS_SMS_ID", null);
        }
        if (TextUtils.isEmpty(f26763j)) {
            return null;
        }
        return f26763j;
    }

    public static String q() {
        if (f26748b == null) {
            return null;
        }
        return r3.f(r3.f27010a, "GT_APP_ID", null);
    }

    public static void r(q qVar) {
        w2 w2Var = f26777z;
        boolean d10 = w2Var.d("getTags()");
        c3 c3Var = f26772t;
        if (d10) {
            c3Var.d("Waiting for remote params. Moving getTags() operation to a pending queue.");
            w2Var.a(new d(qVar));
        } else {
            if (R("getTags()")) {
                return;
            }
            if (qVar == null) {
                c3Var.d("getTags called with null GetTagsHandler!");
            } else {
                new Thread(new e(qVar), "OS_GETTAGS").start();
            }
        }
    }

    public static String s() {
        if (f26759h == null && f26748b != null) {
            f26759h = r3.f(r3.f27010a, "GT_PLAYER_ID", null);
        }
        return f26759h;
    }

    public static void t(Context context) {
        boolean z10;
        boolean z11;
        com.onesignal.a aVar = com.onesignal.c.f26699t;
        boolean z12 = context instanceof Activity;
        if (i() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !z12) {
            z11 = false;
        } else {
            z11 = true;
        }
        o = z11;
        f26772t.c("OneSignal handleActivityLifecycleHandler inForeground: " + o);
        if (o) {
            if (z10 && z12 && aVar != null) {
                aVar.d((Activity) context);
                aVar.f26636c = true;
            }
            OSNotificationRestoreWorkManager.a(context, false);
            m().a();
            return;
        }
        if (aVar != null) {
            aVar.f26636c = true;
        }
    }

    public static void u() {
        String q10 = q();
        if (q10 != null) {
            if (!q10.equals(f26752d)) {
                StringBuilder s10 = a3.l.s("App id has changed:\nFrom: ", q10, "\n To: ");
                s10.append(f26752d);
                s10.append("\nClearing the user id, app state, and remoteParams as they are no longer valid");
                b(6, s10.toString(), null);
                String str = f26752d;
                if (f26748b != null) {
                    r3.h(str, r3.f27010a, "GT_APP_ID");
                }
                b4.b().w();
                b4.a().w();
                b4.c().w();
                b4.b().getClass();
                f26759h = null;
                if (f26748b != null) {
                    r3.h(f26759h, r3.f27010a, "GT_PLAYER_ID");
                }
                b4.a().getClass();
                L(null);
                b4.c().getClass();
                M(null);
                Q(-3660L);
                f26776x.f26958a = null;
                return;
            }
            return;
        }
        b(6, "App id set for first time:  " + f26752d, null);
        Context context = f26748b;
        if (com.onesignal.h.a(context)) {
            try {
                fc.c.a(0, context);
            } catch (fc.b unused) {
            }
        }
        String str2 = f26752d;
        if (f26748b != null) {
            r3.h(str2, r3.f27010a, "GT_APP_ID");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0132, code lost:
    
        if (r2.c() == null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void v(android.app.Activity r9, org.json.JSONArray r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e3.v(android.app.Activity, org.json.JSONArray, java.lang.String):void");
    }

    public static void w(z1 z1Var) {
        try {
            JSONObject jSONObject = new JSONObject(z1Var.f27214c.toString());
            jSONObject.put("androidNotificationId", z1Var.a());
            b2 h10 = h(new JSONArray().put(jSONObject));
            if (f26771s != null) {
                f26776x.getClass();
                if (r3.b(r3.f27010a, "GT_FIREBASE_TRACKING_ENABLED", false)) {
                    f26771s.g(h10);
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:27|(2:28|29)|30|(1:32)|(4:33|34|(1:36)|38)|(9:40|(1:42)|43|44|45|(1:47)|48|49|50)|53|(0)|43|44|45|(0)|48|49|50) */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0018, B:11:0x0025, B:14:0x003a, B:22:0x0047, B:24:0x004b, B:27:0x0052, B:29:0x006f, B:30:0x007d, B:32:0x0091, B:38:0x00a5, B:42:0x00b0, B:44:0x00b9, B:47:0x00c0, B:48:0x00c9, B:54:0x00ab, B:58:0x002d, B:60:0x00ee, B:64:0x00f8, B:65:0x0103, B:68:0x0114, B:71:0x00fe, B:34:0x0099, B:36:0x009d), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0 A[Catch: all -> 0x011d, TRY_ENTER, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0018, B:11:0x0025, B:14:0x003a, B:22:0x0047, B:24:0x004b, B:27:0x0052, B:29:0x006f, B:30:0x007d, B:32:0x0091, B:38:0x00a5, B:42:0x00b0, B:44:0x00b9, B:47:0x00c0, B:48:0x00c9, B:54:0x00ab, B:58:0x002d, B:60:0x00ee, B:64:0x00f8, B:65:0x0103, B:68:0x0114, B:71:0x00fe, B:34:0x0099, B:36:0x009d), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void x(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e3.x(android.content.Context):void");
    }

    public static void y(Context context) {
        boolean z10;
        c3 c3Var = f26772t;
        if (context == null) {
            c3Var.s("initWithContext called with null context, ignoring!");
            return;
        }
        if (context instanceof Activity) {
            f26750c = new WeakReference<>((Activity) context);
        }
        boolean z11 = true;
        if (f26748b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context applicationContext = context.getApplicationContext();
        f26748b = applicationContext;
        Application application = (Application) applicationContext;
        if (com.onesignal.c.f26698s == null) {
            com.onesignal.c cVar = new com.onesignal.c();
            com.onesignal.c.f26698s = cVar;
            application.registerActivityLifecycleCallbacks(cVar);
        }
        if (com.onesignal.c.f26699t == null) {
            com.onesignal.c.f26699t = new com.onesignal.a(new OSFocusHandler());
        }
        if (com.onesignal.c.f26700u == null) {
            com.onesignal.b bVar = new com.onesignal.b();
            com.onesignal.c.f26700u = bVar;
            application.registerComponentCallbacks(bVar);
        }
        if (z10) {
            c3 c3Var2 = B;
            f26765l = new cc.a(c3Var2);
            r3.a aVar = r3.f27012c;
            synchronized (aVar) {
                if (f26748b != null) {
                    if (!aVar.f27015u) {
                        aVar.start();
                        aVar.f27015u = true;
                    }
                    aVar.a();
                }
            }
            p3 c10 = p3.c(f26748b);
            y1 y1Var = new y1(c10, c3Var);
            G = y1Var;
            c3.p(new v1(y1Var), "OS_NOTIFICATIONS_THREAD");
            v0 n10 = n();
            n10.getClass();
            c3.p(new w0(n10), "OS_IAM_DB_ACCESS");
            if (F == null) {
                F = new y1.g(c3Var, A, c10, c3Var2);
            }
            Collection values = ((ConcurrentHashMap) D.f27007a.f259t).values();
            zc.d.c(values, "trackers.values");
            Iterator it = values.iterator();
            while (it.hasNext()) {
                ((ac.a) it.next()).k();
            }
            l2 o6 = o();
            o6.getClass();
            new Thread(new f2(o6), "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD").start();
        }
        Context context2 = f26748b;
        try {
            String string = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128).metaData.getString("com.onesignal.PrivacyConsent");
            if (string != null) {
                boolean equalsIgnoreCase = "ENABLE".equalsIgnoreCase(string);
                s3.e eVar = f26776x.f26958a;
                if (eVar == null || eVar.f27051j == null) {
                    z11 = false;
                }
                if (z11) {
                    c3Var.s("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
                } else if (K() && !equalsIgnoreCase) {
                    b(3, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE", null);
                } else {
                    r3.i(r3.f27010a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", equalsIgnoreCase);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (f26752d == null) {
            String q10 = q();
            if (q10 == null) {
                c3Var.s("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
                return;
            } else {
                c3Var.r("appContext set and cached app id found, calling setAppId with: ".concat(q10));
                P(q10);
                return;
            }
        }
        c3Var.r("initWithContext called with: " + context);
        x(context);
    }

    public static void z() {
        ArrayList<q> arrayList = T;
        synchronized (arrayList) {
            if (arrayList.size() == 0) {
                return;
            }
            new Thread(new f(), "OS_GETTAGS_CALLBACK").start();
        }
    }
}
