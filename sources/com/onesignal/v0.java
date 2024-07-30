package com.onesignal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.hamkho.livefoot.R;
import com.onesignal.e3;
import com.onesignal.m0;
import com.onesignal.q1;
import com.onesignal.u2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageController.java */
/* loaded from: classes2.dex */
public class v0 extends c3 implements m0.a, u2.b {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f27106t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static final c f27107u = new c();

    /* renamed from: a, reason: collision with root package name */
    public final s1 f27108a;

    /* renamed from: b, reason: collision with root package name */
    public final v2 f27109b;

    /* renamed from: c, reason: collision with root package name */
    public final cc.a f27110c;

    /* renamed from: d, reason: collision with root package name */
    public final u2 f27111d;

    /* renamed from: e, reason: collision with root package name */
    public q1 f27112e;
    public final a3 f;

    /* renamed from: h, reason: collision with root package name */
    public final Set<String> f27114h;

    /* renamed from: i, reason: collision with root package name */
    public final Set<String> f27115i;

    /* renamed from: j, reason: collision with root package name */
    public final Set<String> f27116j;

    /* renamed from: k, reason: collision with root package name */
    public final Set<String> f27117k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<b1> f27118l;

    /* renamed from: s, reason: collision with root package name */
    public Date f27124s;

    /* renamed from: m, reason: collision with root package name */
    public List<b1> f27119m = null;

    /* renamed from: n, reason: collision with root package name */
    public e1 f27120n = null;
    public boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public String f27121p = "";

    /* renamed from: q, reason: collision with root package name */
    public r0 f27122q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f27123r = false;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<b1> f27113g = new ArrayList<>();

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes2.dex */
    public class a implements q1.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b1 f27125a;

        public a(b1 b1Var) {
            this.f27125a = b1Var;
        }

        @Override // com.onesignal.q1.a
        public final void a(String str) {
            b1 b1Var = this.f27125a;
            v0 v0Var = v0.this;
            try {
                JSONObject jSONObject = new JSONObject(str);
                v0Var.getClass();
                r0 r0Var = new r0(jSONObject);
                b1Var.f = r0Var.f.doubleValue();
                String str2 = r0Var.f26998a;
                s1 s1Var = v0Var.f27108a;
                if (str2 == null) {
                    ((c3) s1Var).c("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                    return;
                }
                if (v0Var.f27123r) {
                    v0Var.f27122q = r0Var;
                    return;
                }
                e3.D.c(b1Var.f26667a);
                ((c3) s1Var).r("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
                r0Var.f26998a = v0Var.J(r0Var.f26998a);
                e5.h(b1Var, r0Var);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.onesignal.q1.a
        public final void onFailure(String str) {
            v0 v0Var = v0.this;
            v0Var.o = false;
            try {
                boolean z10 = new JSONObject(str).getBoolean("retry");
                b1 b1Var = this.f27125a;
                if (z10) {
                    v0Var.G(b1Var);
                } else {
                    v0Var.E(b1Var, true);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes2.dex */
    public class b implements q1.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b1 f27127a;

        public b(b1 b1Var) {
            this.f27127a = b1Var;
        }

        @Override // com.onesignal.q1.a
        public final void a(String str) {
            b1 b1Var = this.f27127a;
            v0 v0Var = v0.this;
            try {
                JSONObject jSONObject = new JSONObject(str);
                v0Var.getClass();
                r0 r0Var = new r0(jSONObject);
                b1Var.f = r0Var.f.doubleValue();
                String str2 = r0Var.f26998a;
                s1 s1Var = v0Var.f27108a;
                if (str2 == null) {
                    ((c3) s1Var).c("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                } else {
                    if (v0Var.f27123r) {
                        v0Var.f27122q = r0Var;
                        return;
                    }
                    ((c3) s1Var).r("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
                    r0Var.f26998a = v0Var.J(r0Var.f26998a);
                    e5.h(b1Var, r0Var);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.onesignal.q1.a
        public final void onFailure(String str) {
            v0.this.v(null);
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes2.dex */
    public class c extends ArrayList<String> {
        public c() {
            add("android");
            add("app");
            add("all");
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes2.dex */
    public class d extends com.onesignal.g {
        public d() {
        }

        @Override // com.onesignal.g, java.lang.Runnable
        public final void run() {
            super.run();
            synchronized (v0.f27106t) {
                v0 v0Var = v0.this;
                v0Var.f27119m = v0Var.f27112e.c();
                ((c3) v0.this.f27108a).c("Retrieved IAMs from DB redisplayedInAppMessages: " + v0.this.f27119m.toString());
            }
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONArray f27130s;

        public e(JSONArray jSONArray) {
            this.f27130s = jSONArray;
        }

        @Override // java.lang.Runnable
        public final void run() {
            v0 v0Var = v0.this;
            Iterator<b1> it = v0Var.f27119m.iterator();
            while (it.hasNext()) {
                it.next().f26672g = false;
            }
            try {
                v0Var.F(this.f27130s);
            } catch (JSONException e10) {
                ((c3) v0Var.f27108a).getClass();
                e3.b(3, "ERROR processing InAppMessageJson JSON Response.", e10);
            }
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            v0 v0Var = v0.this;
            ((c3) v0Var.f27108a).c("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
            v0Var.y();
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes2.dex */
    public class g implements e3.s {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b1 f27133a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f27134b;

        public g(b1 b1Var, List list) {
            this.f27133a = b1Var;
            this.f27134b = list;
        }

        public final void a(e3.u uVar) {
            v0 v0Var = v0.this;
            v0Var.f27120n = null;
            ((c3) v0Var.f27108a).c("IAM prompt to handle finished with result: " + uVar);
            b1 b1Var = this.f27133a;
            boolean z10 = b1Var.f26676k;
            List<e1> list = this.f27134b;
            if (z10 && uVar == e3.u.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                new AlertDialog.Builder(e3.i()).setTitle(e3.f26748b.getString(R.string.location_permission_missing_title)).setMessage(e3.f26748b.getString(R.string.location_permission_missing_message)).setPositiveButton(android.R.string.ok, new y0(v0Var, b1Var, list)).show();
                return;
            }
            v0Var.I(b1Var, list);
        }
    }

    public v0(p3 p3Var, v2 v2Var, c3 c3Var, c3 c3Var2, cc.a aVar) {
        Date date = null;
        this.f27124s = null;
        this.f27109b = v2Var;
        Set<String> p10 = OSUtils.p();
        this.f27114h = p10;
        this.f27118l = new ArrayList<>();
        Set<String> p11 = OSUtils.p();
        this.f27115i = p11;
        Set<String> p12 = OSUtils.p();
        this.f27116j = p12;
        Set<String> p13 = OSUtils.p();
        this.f27117k = p13;
        this.f = new a3(this);
        this.f27111d = new u2(this);
        this.f27110c = aVar;
        this.f27108a = c3Var;
        if (this.f27112e == null) {
            this.f27112e = new q1(p3Var, c3Var, c3Var2);
        }
        q1 q1Var = this.f27112e;
        this.f27112e = q1Var;
        q1Var.getClass();
        String str = r3.f27010a;
        q1Var.f26986c.getClass();
        Set g6 = r3.g("PREFS_OS_DISPLAYED_IAMS", null);
        if (g6 != null) {
            p10.addAll(g6);
        }
        q1 q1Var2 = this.f27112e;
        q1Var2.getClass();
        q1Var2.f26986c.getClass();
        Set g10 = r3.g("PREFS_OS_IMPRESSIONED_IAMS", null);
        if (g10 != null) {
            p11.addAll(g10);
        }
        q1 q1Var3 = this.f27112e;
        q1Var3.getClass();
        q1Var3.f26986c.getClass();
        Set g11 = r3.g("PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
        if (g11 != null) {
            p12.addAll(g11);
        }
        q1 q1Var4 = this.f27112e;
        q1Var4.getClass();
        q1Var4.f26986c.getClass();
        Set g12 = r3.g("PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
        if (g12 != null) {
            p13.addAll(g12);
        }
        q1 q1Var5 = this.f27112e;
        q1Var5.getClass();
        q1Var5.f26986c.getClass();
        String f10 = r3.f(str, "PREFS_OS_LAST_TIME_IAM_DISMISSED", null);
        if (f10 != null) {
            try {
                date = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(f10);
            } catch (ParseException e10) {
                e3.b(3, e10.getLocalizedMessage(), null);
            }
        }
        if (date != null) {
            this.f27124s = date;
        }
        A();
    }

    public static void z(q0 q0Var) {
        String str = q0Var.f26980c;
        if (str != null && !str.isEmpty()) {
            int i10 = q0Var.f26979b;
            if (i10 == 2) {
                e3.f26748b.startActivity(OSUtils.q(Uri.parse(str.trim())));
            } else if (i10 == 1) {
                n3 n3Var = new n3(str);
                Context context = e3.f26748b;
                n3Var.f32628s = context.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty("com.android.chrome")) {
                    intent.setPackage("com.android.chrome");
                }
                context.bindService(intent, n3Var, 33);
            }
        }
    }

    public void A() {
        d dVar = new d();
        v2 v2Var = this.f27109b;
        v2Var.a(dVar);
        v2Var.c();
    }

    public boolean B() {
        return this.o;
    }

    public final void C(String str) {
        boolean z10;
        String b10 = s.f.b("messageDynamicTriggerCompleted called with triggerId: ", str);
        s1 s1Var = this.f27108a;
        ((c3) s1Var).c(b10);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        Iterator<b1> it = this.f27113g.iterator();
        while (it.hasNext()) {
            b1 next = it.next();
            if (!next.f26673h && this.f27119m.contains(next)) {
                this.f.getClass();
                ArrayList<ArrayList<z2>> arrayList = next.f26669c;
                if (arrayList != null) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        Iterator<ArrayList<z2>> it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Iterator<z2> it4 = it3.next().iterator();
                            while (it4.hasNext()) {
                                z2 next2 = it4.next();
                                if (str2.equals(next2.f27219c) || str2.equals(next2.f27217a)) {
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    ((c3) s1Var).c("Trigger changed for message: " + next.toString());
                    next.f26673h = true;
                }
            }
        }
    }

    public void D(b1 b1Var) {
        E(b1Var, false);
    }

    public final void E(b1 b1Var, boolean z10) {
        boolean z11 = b1Var.f26676k;
        boolean z12 = true;
        s1 s1Var = this.f27108a;
        if (!z11) {
            Set<String> set = this.f27114h;
            set.add(b1Var.f26667a);
            if (!z10) {
                q1 q1Var = this.f27112e;
                q1Var.getClass();
                String str = r3.f27010a;
                q1Var.f26986c.getClass();
                r3.h(set, str, "PREFS_OS_DISPLAYED_IAMS");
                this.f27124s = new Date();
                e3.f26775w.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                h1 h1Var = b1Var.f26671e;
                h1Var.f26841a = currentTimeMillis;
                h1Var.f26842b++;
                b1Var.f26673h = false;
                b1Var.f26672g = true;
                c3.p(new t0(this, b1Var), "OS_IAM_DB_ACCESS");
                int indexOf = this.f27119m.indexOf(b1Var);
                if (indexOf != -1) {
                    this.f27119m.set(indexOf, b1Var);
                } else {
                    this.f27119m.add(b1Var);
                }
                ((c3) s1Var).c("persistInAppMessageForRedisplay: " + b1Var.toString() + " with msg array data: " + this.f27119m.toString());
            }
            ((c3) s1Var).c("OSInAppMessageController messageWasDismissed dismissedMessages: " + set.toString());
        }
        if (this.f27120n == null) {
            z12 = false;
        }
        if (!z12) {
            ((c3) s1Var).r("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
        }
        v(b1Var);
    }

    public final void F(JSONArray jSONArray) throws JSONException {
        synchronized (f27106t) {
            ArrayList<b1> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                b1 b1Var = new b1(jSONArray.getJSONObject(i10));
                if (b1Var.f26667a != null) {
                    arrayList.add(b1Var);
                }
            }
            this.f27113g = arrayList;
        }
        y();
    }

    public final void G(b1 b1Var) {
        synchronized (this.f27118l) {
            if (!this.f27118l.contains(b1Var)) {
                this.f27118l.add(b1Var);
                ((c3) this.f27108a).c("In app message with id: " + b1Var.f26667a + ", added to the queue");
            }
            t();
        }
    }

    public void H(JSONArray jSONArray) throws JSONException {
        boolean z10;
        q1 q1Var = this.f27112e;
        String jSONArray2 = jSONArray.toString();
        q1Var.getClass();
        String str = r3.f27010a;
        q1Var.f26986c.getClass();
        r3.h(jSONArray2, str, "PREFS_OS_CACHED_IAMS");
        e eVar = new e(jSONArray);
        Object obj = f27106t;
        synchronized (obj) {
            synchronized (obj) {
                if (this.f27119m == null && this.f27109b.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (z10) {
            ((c3) this.f27108a).c("Delaying task due to redisplay data not retrieved yet");
            this.f27109b.a(eVar);
        } else {
            eVar.run();
        }
    }

    public final void I(b1 b1Var, List<e1> list) {
        Iterator<e1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            e1 next = it.next();
            if (!next.f26740a) {
                this.f27120n = next;
                break;
            }
        }
        e1 e1Var = this.f27120n;
        s1 s1Var = this.f27108a;
        if (e1Var != null) {
            ((c3) s1Var).c("IAM prompt to handle: " + this.f27120n.toString());
            e1 e1Var2 = this.f27120n;
            e1Var2.f26740a = true;
            e1Var2.b(new g(b1Var, list));
            return;
        }
        ((c3) s1Var).c("No IAM prompt to handle, dismiss message: " + b1Var.f26667a);
        D(b1Var);
    }

    public final String J(String str) {
        String str2 = this.f27121p;
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
        j10.append(String.format("\n\n<script>\n    setPlayerTags(%s);\n</script>", str2));
        return j10.toString();
    }

    public final String K(b1 b1Var) {
        String language = this.f27110c.f3485a.getLanguage();
        Iterator<String> it = f27107u.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (b1Var.f26668b.containsKey(next)) {
                HashMap<String, String> hashMap = b1Var.f26668b.get(next);
                if (hashMap.containsKey(language)) {
                    return hashMap.get(language);
                }
                return hashMap.get(CallMraidJS.f);
            }
        }
        return null;
    }

    @Override // com.onesignal.m0.a
    public void a() {
        ((c3) this.f27108a).c("messageTriggerConditionChanged called");
        y();
    }

    @Override // com.onesignal.u2.b
    public final void b() {
        t();
    }

    public final void t() {
        synchronized (this.f27118l) {
            if (!this.f27111d.a()) {
                ((c3) this.f27108a).s("In app message not showing due to system condition not correct");
                return;
            }
            ((c3) this.f27108a).c("displayFirstIAMOnQueue: " + this.f27118l);
            if (this.f27118l.size() > 0 && !B()) {
                ((c3) this.f27108a).c("No IAM showing currently, showing first item in the queue!");
                w(this.f27118l.get(0));
                return;
            }
            ((c3) this.f27108a).c("In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: " + B());
        }
    }

    public final void u(b1 b1Var, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            ((c3) this.f27108a).c("IAM showing prompts from IAM: " + b1Var.toString());
            int i10 = e5.f26803k;
            e3.b(6, "WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + e5.f26804l, null);
            e5 e5Var = e5.f26804l;
            if (e5Var != null) {
                e5Var.f(null);
            }
            I(b1Var, arrayList);
        }
    }

    public final void v(b1 b1Var) {
        boolean z10;
        r2 r2Var = e3.D;
        ((c3) r2Var.f27009c).c("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        r2Var.f27007a.c().l();
        if (this.f27120n != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((c3) this.f27108a).c("Stop evaluateMessageDisplayQueue because prompt is currently displayed");
            return;
        }
        this.o = false;
        synchronized (this.f27118l) {
            if (b1Var != null) {
                if (!b1Var.f26676k && this.f27118l.size() > 0) {
                    if (!this.f27118l.contains(b1Var)) {
                        ((c3) this.f27108a).c("Message already removed from the queue!");
                        return;
                    }
                    String str = this.f27118l.remove(0).f26667a;
                    ((c3) this.f27108a).c("In app message with id: " + str + ", dismissed (removed) from the queue!");
                }
            }
            if (this.f27118l.size() > 0) {
                ((c3) this.f27108a).c("In app message on queue available: " + this.f27118l.get(0).f26667a);
                w(this.f27118l.get(0));
            } else {
                ((c3) this.f27108a).c("In app message dismissed evaluating messages");
                y();
            }
        }
    }

    public final void w(b1 b1Var) {
        String sb2;
        this.o = true;
        this.f27123r = false;
        if (b1Var.f26677l) {
            this.f27123r = true;
            e3.r(new u0(this, false, b1Var));
        }
        q1 q1Var = this.f27112e;
        String str = e3.f26752d;
        String str2 = b1Var.f26667a;
        String K = K(b1Var);
        a aVar = new a(b1Var);
        q1Var.getClass();
        if (K == null) {
            ((c3) q1Var.f26985b).d(s.f.b("Unable to find a variant for in-app message ", str2));
            sb2 = null;
        } else {
            StringBuilder o = a3.k.o("in_app_messages/", str2, "/variants/", K, "/html?app_id=");
            o.append(str);
            sb2 = o.toString();
        }
        new Thread(new w3(sb2, new p1(q1Var, aVar), null), "OS_REST_ASYNC_GET").start();
    }

    public void x(String str) {
        this.o = true;
        b1 b1Var = new b1();
        this.f27123r = true;
        e3.r(new u0(this, true, b1Var));
        q1 q1Var = this.f27112e;
        String str2 = e3.f26752d;
        b bVar = new b(b1Var);
        q1Var.getClass();
        new Thread(new w3("in_app_messages/device_preview?preview_id=" + str + "&app_id=" + str2, new o1(q1Var, bVar), null), "OS_REST_ASYNC_GET").start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0157, code lost:
    
        if (r3 >= r9) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01ae, code lost:
    
        if (r13.f27221e != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x01cb, code lost:
    
        if (((java.util.Collection) r3).contains(r13.f27221e) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x01e1, code lost:
    
        if (com.onesignal.a3.b((java.lang.String) r6, (java.lang.String) r3, r0) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0248, code lost:
    
        if (r0 == false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0250 A[LOOP:4: B:95:0x0068->B:102:0x0250, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x015e A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:115:0x0090, B:117:0x0096, B:119:0x009b, B:123:0x00e0, B:135:0x0113, B:138:0x015e, B:139:0x0167, B:142:0x0169, B:144:0x0172, B:146:0x0175, B:148:0x017d, B:150:0x0180, B:151:0x018d, B:155:0x012f, B:161:0x013a, B:164:0x0141, B:165:0x0149, B:171:0x00a8, B:172:0x00b7, B:174:0x00ba, B:176:0x00c2, B:178:0x00c4, B:181:0x00d2), top: B:114:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0169 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:115:0x0090, B:117:0x0096, B:119:0x009b, B:123:0x00e0, B:135:0x0113, B:138:0x015e, B:139:0x0167, B:142:0x0169, B:144:0x0172, B:146:0x0175, B:148:0x017d, B:150:0x0180, B:151:0x018d, B:155:0x012f, B:161:0x013a, B:164:0x0141, B:165:0x0149, B:171:0x00a8, B:172:0x00b7, B:174:0x00ba, B:176:0x00c2, B:178:0x00c4, B:181:0x00d2), top: B:114:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.v0.y():void");
    }
}
