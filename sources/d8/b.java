package d8;

import android.annotation.SuppressLint;
import android.net.TrafficStats;
import android.util.Log;
import com.applovin.exoplayer2.b.z;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.huawei.openalliance.ad.constant.w;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import f8.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import s7.p;
import t7.k;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f27492m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final n7.e f27493a;

    /* renamed from: b, reason: collision with root package name */
    public final g8.c f27494b;

    /* renamed from: c, reason: collision with root package name */
    public final f8.c f27495c;

    /* renamed from: d, reason: collision with root package name */
    public final j f27496d;

    /* renamed from: e, reason: collision with root package name */
    public final p<f8.b> f27497e;
    public final h f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f27498g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f27499h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f27500i;

    /* renamed from: j, reason: collision with root package name */
    public String f27501j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f27502k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f27503l;

    static {
        new AtomicInteger(1);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public b() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public b(n7.e eVar, c8.a aVar, ExecutorService executorService, k kVar) {
        eVar.a();
        g8.c cVar = new g8.c(eVar.f33458a, aVar);
        f8.c cVar2 = new f8.c(eVar);
        if (l3.d.f32366s == null) {
            l3.d.f32366s = new l3.d();
        }
        l3.d dVar = l3.d.f32366s;
        if (j.f27511d == null) {
            j.f27511d = new j(dVar);
        }
        j jVar = j.f27511d;
        p<f8.b> pVar = new p<>(new s7.i(eVar, 1));
        h hVar = new h();
        this.f27498g = new Object();
        this.f27502k = new HashSet();
        this.f27503l = new ArrayList();
        this.f27493a = eVar;
        this.f27494b = cVar;
        this.f27495c = cVar2;
        this.f27496d = jVar;
        this.f27497e = pVar;
        this.f = hVar;
        this.f27499h = executorService;
        this.f27500i = kVar;
    }

    @Override // d8.c
    public final Task a() {
        d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        e eVar = new e(this.f27496d, taskCompletionSource);
        synchronized (this.f27498g) {
            this.f27503l.add(eVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f27499h.execute(new z(1, this, false));
        return task;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #1 {all -> 0x005c, blocks: (B:6:0x000e, B:12:0x0022), top: B:5:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[Catch: all -> 0x0063, DONT_GENERATE, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:15:0x003c, B:16:0x003f, B:25:0x005f, B:26:0x0062, B:6:0x000e, B:12:0x0022), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = d8.b.f27492m
            monitor-enter(r0)
            n7.e r1 = r7.f27493a     // Catch: java.lang.Throwable -> L63
            r1.a()     // Catch: java.lang.Throwable -> L63
            android.content.Context r1 = r1.f33458a     // Catch: java.lang.Throwable -> L63
            androidx.appcompat.widget.g r1 = androidx.appcompat.widget.g.b(r1)     // Catch: java.lang.Throwable -> L63
            f8.c r2 = r7.f27495c     // Catch: java.lang.Throwable -> L5c
            f8.a r2 = r2.c()     // Catch: java.lang.Throwable -> L5c
            int r3 = r2.f28150c     // Catch: java.lang.Throwable -> L5c
            r4 = 1
            r5 = 2
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L1d
            goto L1f
        L1d:
            r3 = 0
            goto L20
        L1f:
            r3 = r4
        L20:
            if (r3 == 0) goto L3a
            java.lang.String r3 = r7.e(r2)     // Catch: java.lang.Throwable -> L5c
            f8.c r5 = r7.f27495c     // Catch: java.lang.Throwable -> L5c
            f8.a$a r6 = new f8.a$a     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5c
            r6.f28155a = r3     // Catch: java.lang.Throwable -> L5c
            r2 = 3
            r6.b(r2)     // Catch: java.lang.Throwable -> L5c
            f8.a r2 = r6.a()     // Catch: java.lang.Throwable -> L5c
            r5.b(r2)     // Catch: java.lang.Throwable -> L5c
        L3a:
            if (r1 == 0) goto L3f
            r1.i()     // Catch: java.lang.Throwable -> L63
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            if (r8 == 0) goto L4e
            f8.a$a r0 = new f8.a$a
            r0.<init>(r2)
            r1 = 0
            r0.f28157c = r1
            f8.a r2 = r0.a()
        L4e:
            r7.h(r2)
            java.util.concurrent.Executor r0 = r7.f27500i
            m4.j r1 = new m4.j
            r1.<init>(r4, r7, r8)
            r0.execute(r1)
            return
        L5c:
            r8 = move-exception
            if (r1 == 0) goto L62
            r1.i()     // Catch: java.lang.Throwable -> L63
        L62:
            throw r8     // Catch: java.lang.Throwable -> L63
        L63:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.b.b(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r2v15, types: [g8.b] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final f8.a c(f8.a aVar) throws d {
        ?? r10;
        boolean z10;
        String str;
        int i10;
        boolean z11;
        int responseCode;
        boolean z12;
        String str2;
        String str3;
        n7.e eVar = this.f27493a;
        eVar.a();
        String str4 = eVar.f33460c.f33469a;
        String str5 = aVar.f28149b;
        n7.e eVar2 = this.f27493a;
        eVar2.a();
        String str6 = eVar2.f33460c.f33474g;
        String str7 = aVar.f28152e;
        g8.c cVar = this.f27494b;
        g8.e eVar3 = cVar.f28535c;
        synchronized (eVar3) {
            r10 = 1;
            if (eVar3.f28540c != 0) {
                eVar3.f28538a.f27512a.getClass();
                if (System.currentTimeMillis() <= eVar3.f28539b) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        String str8 = "Firebase Installations Service is unavailable. Please try again later.";
        if (z10) {
            int i11 = 2;
            URL a10 = g8.c.a(String.format("projects/%s/installations/%s/authTokens:generate", str6, str5));
            int i12 = 0;
            g8.b bVar = str4;
            while (i12 <= r10) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a10, bVar);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.addRequestProperty("Authorization", "FIS_v2 " + str7);
                        c10.setDoOutput(r10);
                        g8.c.h(c10);
                        responseCode = c10.getResponseCode();
                        eVar3.a(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z12 = r10;
                        } else {
                            z12 = false;
                        }
                    } catch (IOException | AssertionError unused) {
                    }
                    if (z12) {
                        bVar = g8.c.f(c10);
                        str = str8;
                    } else {
                        g8.c.b(c10, null, bVar, str6);
                        if (responseCode != 401 && responseCode != 404) {
                            if (responseCode != 429) {
                                if (responseCode < 500 || responseCode >= 600) {
                                    try {
                                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                        Long l10 = 0L;
                                        if (l10 == null) {
                                            str3 = " tokenExpirationTimestamp";
                                        } else {
                                            str3 = "";
                                        }
                                        if (str3.isEmpty()) {
                                            str = str8;
                                            bVar = new g8.b(null, l10.longValue(), i11);
                                        } else {
                                            throw new IllegalStateException("Missing required properties:".concat(str3));
                                        }
                                    } catch (IOException | AssertionError unused2) {
                                        str = str8;
                                        i10 = i11;
                                        str8 = str;
                                        z11 = true;
                                        c10.disconnect();
                                        TrafficStats.clearThreadStatsTag();
                                        i12++;
                                        r10 = z11;
                                        i11 = i10;
                                        bVar = bVar;
                                    }
                                }
                                i10 = i11;
                                z11 = r10;
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i12++;
                                r10 = z11;
                                i11 = i10;
                                bVar = bVar;
                            } else {
                                throw new d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                        } else {
                            try {
                                str = str8;
                                Long l11 = 0L;
                                if (l11 == null) {
                                    str2 = " tokenExpirationTimestamp";
                                } else {
                                    str2 = "";
                                }
                                if (str2.isEmpty()) {
                                    try {
                                        bVar = new g8.b(null, l11.longValue(), 3);
                                    } catch (IOException | AssertionError unused3) {
                                        str8 = str;
                                        z11 = true;
                                        i10 = 2;
                                    }
                                } else {
                                    i10 = i11;
                                    str8 = str;
                                    z11 = true;
                                    try {
                                        throw new IllegalStateException("Missing required properties:".concat(str2));
                                        break;
                                    } catch (IOException | AssertionError unused4) {
                                        continue;
                                    }
                                }
                            } catch (IOException | AssertionError unused5) {
                                i10 = i11;
                                str8 = str;
                                z11 = true;
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i12++;
                                r10 = z11;
                                i11 = i10;
                                bVar = bVar;
                            }
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i12++;
                            r10 = z11;
                            i11 = i10;
                            bVar = bVar;
                        }
                    }
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int c11 = s.f.c(bVar.f28530c);
                    if (c11 != 0) {
                        if (c11 != 1) {
                            if (c11 == 2) {
                                synchronized (this) {
                                    this.f27501j = null;
                                }
                                a.C0379a c0379a = new a.C0379a(aVar);
                                c0379a.b(2);
                                return c0379a.a();
                            }
                            throw new d(str);
                        }
                        a.C0379a h10 = aVar.h();
                        h10.f28160g = "BAD CONFIG";
                        h10.b(5);
                        return h10.a();
                    }
                    j jVar = this.f27496d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f27512a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    a.C0379a c0379a2 = new a.C0379a(aVar);
                    c0379a2.f28157c = bVar.f28528a;
                    c0379a2.f28159e = Long.valueOf(bVar.f28529b);
                    c0379a2.f = Long.valueOf(seconds);
                    return c0379a2.a();
                } catch (Throwable th) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new d(str8);
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void d() {
        n7.e eVar = this.f27493a;
        eVar.a();
        Preconditions.checkNotEmpty(eVar.f33460c.f33470b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        Preconditions.checkNotEmpty(eVar.f33460c.f33474g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        Preconditions.checkNotEmpty(eVar.f33460c.f33469a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        String str = eVar.f33460c.f33470b;
        Pattern pattern = j.f27510c;
        Preconditions.checkArgument(str.contains(w.bE), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        Preconditions.checkArgument(j.f27510c.matcher(eVar.f33460c.f33469a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f33459b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(f8.a r6) {
        /*
            r5 = this;
            n7.e r0 = r5.f27493a
            r0.a()
            java.lang.String r0 = r0.f33459b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            n7.e r0 = r5.f27493a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f33459b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L27
        L1e:
            int r6 = r6.f28150c
            r0 = 1
            if (r6 != r0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L31
        L27:
            d8.h r6 = r5.f
            r6.getClass()
            java.lang.String r6 = d8.h.a()
            return r6
        L31:
            s7.p<f8.b> r6 = r5.f27497e
            java.lang.Object r6 = r6.get()
            f8.b r6 = (f8.b) r6
            android.content.SharedPreferences r0 = r6.f28162a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f28162a     // Catch: java.lang.Throwable -> L65
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L65
            android.content.SharedPreferences r2 = r6.f28162a     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            goto L52
        L4d:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L65
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
        L52:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L61
            d8.h r6 = r5.f
            r6.getClass()
            java.lang.String r2 = d8.h.a()
        L61:
            return r2
        L62:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62
            throw r6     // Catch: java.lang.Throwable -> L65
        L65:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.b.e(f8.a):java.lang.String");
    }

    public final f8.a f(f8.a aVar) throws d {
        boolean z10;
        int responseCode;
        boolean z11;
        g8.a e10;
        String str = aVar.f28149b;
        String str2 = null;
        if (str != null && str.length() == 11) {
            f8.b bVar = this.f27497e.get();
            synchronized (bVar.f28162a) {
                String[] strArr = f8.b.f28161c;
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break;
                    }
                    String str3 = strArr[i10];
                    String string = bVar.f28162a.getString("|T|" + bVar.f28163b + com.anythink.expressad.foundation.g.a.bQ + str3, null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            try {
                                str2 = new JSONObject(string).getString(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY);
                            } catch (JSONException unused) {
                            }
                        } else {
                            str2 = string;
                        }
                    } else {
                        i10++;
                    }
                }
            }
        }
        g8.c cVar = this.f27494b;
        n7.e eVar = this.f27493a;
        eVar.a();
        String str4 = eVar.f33460c.f33469a;
        String str5 = aVar.f28149b;
        n7.e eVar2 = this.f27493a;
        eVar2.a();
        String str6 = eVar2.f33460c.f33474g;
        n7.e eVar3 = this.f27493a;
        eVar3.a();
        String str7 = eVar3.f33460c.f33470b;
        g8.e eVar4 = cVar.f28535c;
        synchronized (eVar4) {
            if (eVar4.f28540c != 0) {
                eVar4.f28538a.f27512a.getClass();
                if (System.currentTimeMillis() <= eVar4.f28539b) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        if (z10) {
            URL a10 = g8.c.a(String.format("projects/%s/installations", str6));
            for (int i11 = 0; i11 <= 1; i11++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = cVar.c(a10, str4);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.setDoOutput(true);
                        if (str2 != null) {
                            c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        g8.c.g(c10, str5, str7);
                        responseCode = c10.getResponseCode();
                        eVar4.a(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (z11) {
                        e10 = g8.c.e(c10);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        g8.c.b(c10, str7, str4, str6);
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                try {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    g8.a aVar2 = new g8.a(null, null, null, null, 2);
                                    c10.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    e10 = aVar2;
                                } catch (IOException | AssertionError unused3) {
                                }
                            }
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    }
                    int c11 = s.f.c(e10.f28527e);
                    if (c11 != 0) {
                        if (c11 == 1) {
                            a.C0379a h10 = aVar.h();
                            h10.f28160g = "BAD CONFIG";
                            h10.b(5);
                            return h10.a();
                        }
                        throw new d("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str8 = e10.f28524b;
                    String str9 = e10.f28525c;
                    j jVar = this.f27496d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f27512a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    String b10 = e10.f28526d.b();
                    long c12 = e10.f28526d.c();
                    a.C0379a c0379a = new a.C0379a(aVar);
                    c0379a.f28155a = str8;
                    c0379a.b(4);
                    c0379a.f28157c = b10;
                    c0379a.f28158d = str9;
                    c0379a.f28159e = Long.valueOf(c12);
                    c0379a.f = Long.valueOf(seconds);
                    return c0379a.a();
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void g(Exception exc) {
        synchronized (this.f27498g) {
            Iterator it = this.f27503l.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).b(exc)) {
                    it.remove();
                }
            }
        }
    }

    @Override // d8.c
    public final Task<String> getId() {
        String str;
        d();
        synchronized (this) {
            str = this.f27501j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        f fVar = new f(taskCompletionSource);
        synchronized (this.f27498g) {
            this.f27503l.add(fVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f27499h.execute(new androidx.activity.b(this, 13));
        return task;
    }

    public final void h(f8.a aVar) {
        synchronized (this.f27498g) {
            Iterator it = this.f27503l.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).a(aVar)) {
                    it.remove();
                }
            }
        }
    }
}
