package com.onesignal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.onesignal.v3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FocusTimeController.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public Long f26909a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f26910b;

    /* renamed from: c, reason: collision with root package name */
    public final s1 f26911c;

    /* compiled from: FocusTimeController.java */
    /* loaded from: classes2.dex */
    public enum a {
        BACKGROUND,
        END_SESSION
    }

    /* compiled from: FocusTimeController.java */
    /* loaded from: classes2.dex */
    public static class b extends c {
        public b() {
            this.f26915a = 1L;
            this.f26916b = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        }

        @Override // com.onesignal.m.c
        public final void a(JSONObject jSONObject) {
            r2 r2Var = e3.D;
            ArrayList c10 = c();
            r2Var.getClass();
            String str = "OneSignal SessionManager addSessionData with influences: " + c10.toString();
            c3 c3Var = (c3) r2Var.f27009c;
            c3Var.c(str);
            a4.l lVar = r2Var.f27007a;
            lVar.getClass();
            zc.d.d(jSONObject, "jsonObject");
            Iterator it = c10.iterator();
            while (it.hasNext()) {
                bc.a aVar = (bc.a) it.next();
                if (s.f.c(aVar.f3186b) == 1) {
                    lVar.d().a(jSONObject, aVar);
                }
            }
            c3Var.c("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject);
        }

        @Override // com.onesignal.m.c
        public final ArrayList c() {
            ArrayList arrayList = new ArrayList();
            String str = r3.f27010a;
            Iterator it = r3.g("PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet()).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(new bc.a((String) it.next()));
                } catch (JSONException e10) {
                    e3.b(3, b.class.getSimpleName() + ": error generation OSInfluence from json object: " + e10, null);
                }
            }
            return arrayList;
        }

        @Override // com.onesignal.m.c
        public final void e(List<bc.a> list) {
            HashSet hashSet = new HashSet();
            Iterator<bc.a> it = list.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(it.next().a());
                } catch (JSONException e10) {
                    e3.b(3, b.class.getSimpleName() + ": error generation json object OSInfluence: " + e10, null);
                }
            }
            r3.h(hashSet, r3.f27010a, "PREFS_OS_ATTRIBUTED_INFLUENCES");
        }

        @Override // com.onesignal.m.c
        public final void j(a aVar) {
            e3.b(6, b.class.getSimpleName() + " sendTime with: " + aVar, null);
            if (aVar.equals(a.END_SESSION)) {
                l();
                return;
            }
            s2 c10 = s2.c();
            Context context = e3.f26748b;
            c10.getClass();
            e3.b(7, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000", null);
            c10.d(context, 30000L);
        }
    }

    public m(p0 p0Var, c3 c3Var) {
        this.f26910b = p0Var;
        this.f26911c = c3Var;
    }

    public final void a() {
        e3.f26775w.getClass();
        this.f26909a = Long.valueOf(SystemClock.elapsedRealtime());
        ((c3) this.f26911c).c("Application foregrounded focus time: " + this.f26909a);
    }

    public final Long b() {
        if (this.f26909a == null) {
            return null;
        }
        e3.f26775w.getClass();
        long elapsedRealtime = (long) (((SystemClock.elapsedRealtime() - this.f26909a.longValue()) / 1000.0d) + 0.5d);
        if (elapsedRealtime < 1 || elapsedRealtime > com.anythink.expressad.d.a.b.aT) {
            return null;
        }
        return Long.valueOf(elapsedRealtime);
    }

    /* compiled from: FocusTimeController.java */
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public long f26915a;

        /* renamed from: b, reason: collision with root package name */
        public String f26916b;

        /* renamed from: c, reason: collision with root package name */
        public Long f26917c = null;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f26918d = new AtomicBoolean();

        /* compiled from: FocusTimeController.java */
        /* loaded from: classes2.dex */
        public class a extends v3.c {
            public a() {
            }

            @Override // com.onesignal.v3.c
            public final void a(int i10, String str, Throwable th) {
                e3.B(i10, "sending on_focus Failed", str, th);
            }

            @Override // com.onesignal.v3.c
            public final void b(String str) {
                c.this.g(0L);
            }
        }

        public static JSONObject b(long j10) throws JSONException {
            JSONObject put = new JSONObject().put("app_id", e3.q()).put("type", 1).put("state", "ping").put("active_time", j10);
            new OSUtils();
            JSONObject put2 = put.put("device_type", OSUtils.b());
            try {
                e3.K.getClass();
                put2.put("net_type", OSUtils.c());
            } catch (Throwable unused) {
            }
            return put2;
        }

        public abstract ArrayList c();

        public final long d() {
            if (this.f26917c == null) {
                String str = r3.f27010a;
                this.f26917c = Long.valueOf(r3.d(this.f26916b, 0L));
            }
            e3.b(6, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.f26917c, null);
            return this.f26917c.longValue();
        }

        public abstract void e(List<bc.a> list);

        public final void f(long j10, List<bc.a> list) {
            e3.b(6, getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list.toString(), null);
            long d10 = d() + j10;
            e(list);
            g(d10);
        }

        public final void g(long j10) {
            this.f26917c = Long.valueOf(j10);
            e3.b(6, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.f26917c, null);
            String str = r3.f27010a;
            r3.h(Long.valueOf(j10), r3.f27010a, this.f26916b);
        }

        public final void h(long j10) {
            try {
                e3.b(6, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j10, null);
                JSONObject b10 = b(j10);
                a(b10);
                i(e3.s(), b10);
                if (!TextUtils.isEmpty(e3.f26761i)) {
                    i(e3.l(), b(j10));
                }
                if (!TextUtils.isEmpty(e3.f26763j)) {
                    i(e3.p(), b(j10));
                }
                e(new ArrayList());
            } catch (JSONException e10) {
                e3.b(3, "Generating on_focus:JSON Failed.", e10);
            }
        }

        public final void i(String str, JSONObject jSONObject) {
            v3.a(a3.k.l("players/", str, "/on_focus"), "POST", jSONObject, new a(), 120000, null);
        }

        public abstract void j(a aVar);

        public final void k(a aVar) {
            boolean z10;
            if (e3.s() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                e3.b(4, getClass().getSimpleName().concat(":sendUnsentTimeNow not possible due to user id null"), null);
            } else {
                j(aVar);
            }
        }

        public final void l() {
            if (this.f26918d.get()) {
                return;
            }
            synchronized (this.f26918d) {
                boolean z10 = true;
                this.f26918d.set(true);
                if (d() < this.f26915a) {
                    z10 = false;
                }
                if (z10) {
                    h(d());
                }
                this.f26918d.set(false);
            }
        }

        public void a(JSONObject jSONObject) {
        }
    }

    /* compiled from: FocusTimeController.java */
    /* loaded from: classes2.dex */
    public static class d extends c {
        public d() {
            this.f26915a = 60L;
            this.f26916b = "GT_UNSENT_ACTIVE_TIME";
        }

        @Override // com.onesignal.m.c
        public final ArrayList c() {
            return new ArrayList();
        }

        @Override // com.onesignal.m.c
        public final void j(a aVar) {
            boolean z10;
            e3.b(6, d.class.getSimpleName() + " sendTime with: " + aVar, null);
            if (aVar.equals(a.END_SESSION)) {
                return;
            }
            if (d() >= this.f26915a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                s2 c10 = s2.c();
                Context context = e3.f26748b;
                c10.getClass();
                e3.b(7, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000", null);
                c10.d(context, 30000L);
            }
        }

        @Override // com.onesignal.m.c
        public final void e(List<bc.a> list) {
        }
    }
}
