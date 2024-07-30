package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.Scopes;
import com.onesignal.a0;
import com.onesignal.b4;
import com.onesignal.e3;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStateSynchronizer.java */
/* loaded from: classes2.dex */
public abstract class z4 {

    /* renamed from: b, reason: collision with root package name */
    public final b4.b f27224b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27225c;

    /* renamed from: k, reason: collision with root package name */
    public q4 f27232k;

    /* renamed from: l, reason: collision with root package name */
    public q4 f27233l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f27223a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f27226d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f27227e = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedQueue f27228g = new ConcurrentLinkedQueue();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap<Integer, c> f27229h = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    public final a f27230i = new a();

    /* renamed from: j, reason: collision with root package name */
    public boolean f27231j = false;

    /* compiled from: UserStateSynchronizer.java */
    /* loaded from: classes2.dex */
    public class a {
    }

    /* compiled from: UserStateSynchronizer.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f27234a;

        /* renamed from: b, reason: collision with root package name */
        public final JSONObject f27235b;

        public b(JSONObject jSONObject, boolean z10) {
            this.f27234a = z10;
            this.f27235b = jSONObject;
        }
    }

    /* compiled from: UserStateSynchronizer.java */
    /* loaded from: classes2.dex */
    public class c extends HandlerThread {

        /* renamed from: s, reason: collision with root package name */
        public final int f27236s;

        /* renamed from: t, reason: collision with root package name */
        public final Handler f27237t;

        /* renamed from: u, reason: collision with root package name */
        public int f27238u;

        public c(int i10) {
            super("OSH_NetworkHandlerThread_" + z4.this.f27224b);
            this.f27236s = i10;
            start();
            this.f27237t = new Handler(getLooper());
        }

        public final void a() {
            if (!z4.this.f27225c) {
                return;
            }
            synchronized (this.f27237t) {
                this.f27238u = 0;
                d5 d5Var = null;
                this.f27237t.removeCallbacksAndMessages(null);
                Handler handler = this.f27237t;
                if (this.f27236s == 0) {
                    d5Var = new d5(this);
                }
                handler.postDelayed(d5Var, com.anythink.expressad.exoplayer.f.f7962a);
            }
        }
    }

    public z4(b4.b bVar) {
        this.f27224b = bVar;
    }

    public static boolean a(z4 z4Var, int i10, String str, String str2) {
        z4Var.getClass();
        if (i10 == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(ReportDBAdapter.ReportColumns.COLUMN_ERRORS)) {
                    if (jSONObject.optString(ReportDBAdapter.ReportColumns.COLUMN_ERRORS).contains(str2)) {
                        return true;
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public static void b(z4 z4Var) {
        q4 o = z4Var.o();
        o.getClass();
        Object obj = q4.f26990d;
        synchronized (obj) {
            o.f26993b.remove("logoutEmail");
        }
        q4 q4Var = z4Var.f27233l;
        q4Var.getClass();
        synchronized (obj) {
            q4Var.f26993b.remove("email_auth_hash");
        }
        z4Var.f27233l.k("parent_player_id");
        z4Var.f27233l.k(Scopes.EMAIL);
        z4Var.f27233l.h();
        q4 j10 = z4Var.j();
        j10.getClass();
        synchronized (obj) {
            j10.f26993b.remove("email_auth_hash");
        }
        z4Var.j().k("parent_player_id");
        String optString = ((JSONObject) z4Var.j().d().f27251t).optString(Scopes.EMAIL);
        z4Var.j().k(Scopes.EMAIL);
        b4.a().z();
        e3.b(5, "Device successfully logged out of email: " + optString, null);
    }

    public static void c(z4 z4Var) {
        z4Var.getClass();
        e3.b(4, "Creating new player based on missing player_id noted above.", null);
        z4Var.w();
        z4Var.C(null);
        z4Var.x();
    }

    public static void d(z4 z4Var, int i10) {
        boolean z10;
        boolean hasMessages;
        d5 d5Var = null;
        if (i10 == 403) {
            z4Var.getClass();
            e3.b(2, "403 error updating player, omitting further retries!", null);
            z4Var.i();
            return;
        }
        c m10 = z4Var.m(0);
        synchronized (m10.f27237t) {
            try {
                if (m10.f27238u < 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean hasMessages2 = m10.f27237t.hasMessages(0);
                if (z10 && !hasMessages2) {
                    m10.f27238u = m10.f27238u + 1;
                    Handler handler = m10.f27237t;
                    if (m10.f27236s == 0) {
                        d5Var = new d5(m10);
                    }
                    handler.postDelayed(d5Var, r3 * com.anythink.expressad.exoplayer.d.f7613a);
                }
                hasMessages = m10.f27237t.hasMessages(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!hasMessages) {
            z4Var.i();
        }
    }

    public final void A(boolean z10) {
        boolean z11;
        JSONObject e10;
        String l10;
        this.f27226d.set(true);
        String k10 = k();
        if (((JSONObject) o().c().f27251t).optBoolean("logoutEmail", false) && k10 != null) {
            String l11 = a3.k.l("players/", k10, "/email_logout");
            JSONObject jSONObject = new JSONObject();
            try {
                d0.b c10 = j().c();
                if (((JSONObject) c10.f27251t).has("email_auth_hash")) {
                    jSONObject.put("email_auth_hash", ((JSONObject) c10.f27251t).optString("email_auth_hash"));
                }
                d0.b d10 = j().d();
                if (((JSONObject) d10.f27251t).has("parent_player_id")) {
                    jSONObject.put("parent_player_id", ((JSONObject) d10.f27251t).optString("parent_player_id"));
                }
                jSONObject.put("app_id", ((JSONObject) d10.f27251t).optString("app_id"));
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            v3.a(l11, "POST", jSONObject, new a5(this), 120000, null);
        } else {
            if (this.f27232k == null) {
                q();
            }
            if (!z10 && r()) {
                z11 = true;
            } else {
                z11 = false;
            }
            synchronized (this.f27223a) {
                JSONObject b10 = j().b(o(), z11);
                q4 o = o();
                q4 j10 = j();
                j10.getClass();
                synchronized (q4.f26990d) {
                    e10 = c3.e(j10.f26993b, o.f26993b, null, null);
                }
                e3.b(6, "UserStateSynchronizer internalSyncUserState from session call: " + z11 + " jsonBody: " + b10, null);
                if (b10 == null) {
                    j().i(e10, null);
                    b4.d(false);
                    while (true) {
                        e3.n nVar = (e3.n) this.f27227e.poll();
                        if (nVar == null) {
                            break;
                        } else {
                            nVar.onSuccess();
                        }
                    }
                    while (true) {
                        e3.r rVar = (e3.r) this.f.poll();
                        if (rVar == null) {
                            break;
                        }
                        this.f27224b.name().toLowerCase();
                        rVar.onComplete();
                    }
                    g();
                } else {
                    o().h();
                    if (!z11) {
                        if (k10 == null) {
                            e3.b(l(), "Error updating the user record because of the null user id", null);
                            while (true) {
                                e3.n nVar2 = (e3.n) this.f27227e.poll();
                                if (nVar2 == null) {
                                    break;
                                } else {
                                    nVar2.onFailure();
                                }
                            }
                            while (true) {
                                e3.r rVar2 = (e3.r) this.f.poll();
                                if (rVar2 == null) {
                                    break;
                                }
                                this.f27224b.name().toLowerCase();
                                rVar2.onComplete();
                            }
                            while (true) {
                                b4.a aVar = (b4.a) this.f27228g.poll();
                                if (aVar == null) {
                                    break;
                                } else {
                                    aVar.onFailure();
                                }
                            }
                        } else {
                            v3.a("players/".concat(k10), "PUT", b10, new b5(this, b10, e10), 120000, null);
                        }
                    } else {
                        if (k10 == null) {
                            l10 = "players";
                        } else {
                            l10 = a3.k.l("players/", k10, "/on_session");
                        }
                        this.f27231j = true;
                        e(b10);
                        v3.a(l10, "POST", b10, new c5(this, e10, b10, k10), 120000, null);
                    }
                }
            }
        }
        this.f27226d.set(false);
    }

    public final void B(JSONObject jSONObject) {
        q4 p10 = p();
        p10.getClass();
        synchronized (q4.f26990d) {
            JSONObject jSONObject2 = p10.f26994c;
            c3.e(jSONObject2, jSONObject, jSONObject2, null);
        }
    }

    public abstract void C(String str);

    public final void D(a0.d dVar) {
        q4 p10 = p();
        p10.getClass();
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("lat", dVar.f26650a);
            hashMap.put("long", dVar.f26651b);
            hashMap.put("loc_acc", dVar.f26652c);
            hashMap.put("loc_type", dVar.f26653d);
            q4.j(hashMap, p10.f26994c);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("loc_bg", dVar.f26654e);
            hashMap2.put("loc_time_stamp", dVar.f);
            q4.j(hashMap2, p10.f26993b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public abstract void e(JSONObject jSONObject);

    public final void f() {
        q4 o = o();
        o.getClass();
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("lat", null);
            hashMap.put("long", null);
            hashMap.put("loc_acc", null);
            hashMap.put("loc_type", null);
            hashMap.put("loc_bg", null);
            hashMap.put("loc_time_stamp", null);
            q4.j(hashMap, o.f26994c);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("loc_bg", null);
            hashMap2.put("loc_time_stamp", null);
            q4.j(hashMap2, o.f26993b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        o().h();
    }

    public final void g() {
        ((JSONObject) b4.b().o().c().f27251t).optString("language", null);
        while (true) {
            b4.a aVar = (b4.a) this.f27228g.poll();
            if (aVar != null) {
                aVar.onSuccess();
            } else {
                return;
            }
        }
    }

    public abstract void h(JSONObject jSONObject);

    public final void i() {
        JSONObject b10 = j().b(this.f27233l, false);
        if (b10 != null) {
            h(b10);
        }
        if (((JSONObject) o().c().f27251t).optBoolean("logoutEmail", false)) {
            ArrayList arrayList = e3.f26746a;
        }
    }

    public final q4 j() {
        if (this.f27232k == null) {
            synchronized (this.f27223a) {
                if (this.f27232k == null) {
                    this.f27232k = s("CURRENT_STATE");
                }
            }
        }
        return this.f27232k;
    }

    public abstract String k();

    public abstract int l();

    public final c m(Integer num) {
        c cVar;
        synchronized (this.f27230i) {
            if (!this.f27229h.containsKey(num)) {
                this.f27229h.put(num, new c(num.intValue()));
            }
            cVar = this.f27229h.get(num);
        }
        return cVar;
    }

    public final String n() {
        return ((JSONObject) o().d().f27251t).optString("identifier", null);
    }

    public final q4 o() {
        if (this.f27233l == null) {
            synchronized (this.f27223a) {
                if (this.f27233l == null) {
                    this.f27233l = s("TOSYNC_STATE");
                }
            }
        }
        return this.f27233l;
    }

    public final q4 p() {
        JSONObject jSONObject;
        if (this.f27233l == null) {
            q4 j10 = j();
            q4 g6 = j10.g();
            try {
                synchronized (q4.f26990d) {
                    jSONObject = new JSONObject(j10.f26993b.toString());
                }
                g6.f26993b = jSONObject;
                g6.f26994c = j10.e();
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            this.f27233l = g6;
        }
        x();
        return this.f27233l;
    }

    public final void q() {
        if (this.f27232k == null) {
            synchronized (this.f27223a) {
                if (this.f27232k == null) {
                    this.f27232k = s("CURRENT_STATE");
                }
            }
        }
        o();
    }

    public final boolean r() {
        if ((((JSONObject) o().c().f27251t).optBoolean("session") || k() == null) && !this.f27231j) {
            return true;
        }
        return false;
    }

    public abstract q4 s(String str);

    public abstract void t(JSONObject jSONObject);

    public final boolean u() {
        boolean z10 = false;
        if (this.f27233l == null) {
            return false;
        }
        synchronized (this.f27223a) {
            if (j().b(this.f27233l, r()) != null) {
                z10 = true;
            }
            this.f27233l.h();
        }
        return z10;
    }

    public final void v() {
        boolean z10;
        if (!this.f27225c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27225c = true;
        if (z10) {
            x();
        }
    }

    public final void w() {
        q4 j10 = j();
        JSONObject jSONObject = new JSONObject();
        j10.getClass();
        synchronized (q4.f26990d) {
            j10.f26994c = jSONObject;
        }
        j().h();
    }

    public abstract void x();

    public final void y(JSONObject jSONObject, e3.n nVar) {
        if (nVar != null) {
            this.f27227e.add(nVar);
        }
        q4 p10 = p();
        p10.getClass();
        synchronized (q4.f26990d) {
            JSONObject jSONObject2 = p10.f26994c;
            c3.e(jSONObject2, jSONObject, jSONObject2, null);
        }
    }

    public final void z() {
        try {
            synchronized (this.f27223a) {
                q4 p10 = p();
                Boolean bool = Boolean.TRUE;
                p10.getClass();
                synchronized (q4.f26990d) {
                    p10.f26993b.put("session", bool);
                }
                p().h();
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
