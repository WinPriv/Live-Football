package ac;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.onesignal.c3;
import com.onesignal.e3;
import com.onesignal.r3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSNotificationTracker.kt */
/* loaded from: classes2.dex */
public final class d extends a {
    public d(c cVar, c3 c3Var, l3.d dVar) {
        super(cVar, c3Var, dVar);
    }

    @Override // ac.a
    public final void a(JSONObject jSONObject, bc.a aVar) {
        zc.d.d(jSONObject, "jsonObject");
        if (aVar.f3185a.k()) {
            try {
                jSONObject.put("direct", aVar.f3185a.p());
                jSONObject.put("notification_ids", aVar.f3187c);
            } catch (JSONException e10) {
                ((c3) this.f405e).getClass();
                e3.b(3, "Generating notification tracker addSessionData JSONObject ", e10);
            }
        }
    }

    @Override // ac.a
    public final void b() {
        bc.b bVar = this.f401a;
        if (bVar == null) {
            bVar = bc.b.UNATTRIBUTED;
        }
        c cVar = this.f404d;
        cVar.getClass();
        cVar.f406a.getClass();
        String str = r3.f27010a;
        r3.h(bVar.toString(), str, "PREFS_OS_OUTCOMES_CURRENT_SESSION");
        String str2 = this.f403c;
        cVar.f406a.getClass();
        r3.h(str2, str, "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN");
    }

    @Override // ac.a
    public final int c() {
        this.f404d.f406a.getClass();
        return r3.c(10, "PREFS_OS_NOTIFICATION_LIMIT");
    }

    @Override // ac.a
    public final int d() {
        return 2;
    }

    @Override // ac.a
    public final String f() {
        return "notification_id";
    }

    @Override // ac.a
    public final int g() {
        this.f404d.f406a.getClass();
        return r3.c(1440, "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW");
    }

    @Override // ac.a
    public final JSONArray h() throws JSONException {
        JSONArray jSONArray;
        this.f404d.f406a.getClass();
        String f = r3.f(r3.f27010a, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", ContentRecord.XRINFOLIST_NULL);
        if (f != null) {
            jSONArray = new JSONArray(f);
        } else {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    @Override // ac.a
    public final JSONArray i(String str) {
        try {
            return h();
        } catch (JSONException e10) {
            ((c3) this.f405e).getClass();
            e3.b(3, "Generating Notification tracker getLastChannelObjects JSONObject ", e10);
            return new JSONArray();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r6 != null) goto L17;
     */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r8 = this;
            ac.c r0 = r8.f404d
            com.onesignal.c3 r1 = r0.f406a
            r1.getClass()
            java.lang.String r1 = com.onesignal.r3.f27010a
            java.lang.String r2 = "PREFS_OS_OUTCOMES_CURRENT_SESSION"
            java.lang.String r3 = "UNATTRIBUTED"
            java.lang.String r1 = com.onesignal.r3.f(r1, r2, r3)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L33
            bc.b[] r4 = bc.b.values()
            int r5 = r4.length
        L1a:
            int r5 = r5 + (-1)
            if (r5 < 0) goto L2f
            r6 = r4[r5]
            java.lang.String r7 = r6.name()
            if (r7 != 0) goto L28
            r7 = r2
            goto L2c
        L28:
            boolean r7 = r7.equalsIgnoreCase(r1)
        L2c:
            if (r7 == 0) goto L1a
            goto L30
        L2f:
            r6 = r3
        L30:
            if (r6 == 0) goto L33
            goto L35
        L33:
            bc.b r6 = bc.b.UNATTRIBUTED
        L35:
            bc.b r1 = bc.b.INDIRECT
            if (r6 != r1) goto L3a
            r2 = 1
        L3a:
            if (r2 == 0) goto L43
            org.json.JSONArray r0 = r8.j()
            r8.f402b = r0
            goto L58
        L43:
            boolean r1 = r6.p()
            if (r1 == 0) goto L58
            com.onesignal.c3 r0 = r0.f406a
            r0.getClass()
            java.lang.String r0 = com.onesignal.r3.f27010a
            java.lang.String r1 = "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN"
            java.lang.String r0 = com.onesignal.r3.f(r0, r1, r3)
            r8.f403c = r0
        L58:
            r8.f401a = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OneSignal NotificationTracker initInfluencedTypeFromCache: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.onesignal.s1 r1 = r8.f405e
            com.onesignal.c3 r1 = (com.onesignal.c3) r1
            r1.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.d.k():void");
    }

    @Override // ac.a
    public final void m(JSONArray jSONArray) {
        c cVar = this.f404d;
        cVar.getClass();
        cVar.f406a.getClass();
        r3.h(jSONArray.toString(), r3.f27010a, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED");
    }
}
