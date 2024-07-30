package ac;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.onesignal.c3;
import com.onesignal.e3;
import com.onesignal.r3;
import com.onesignal.s1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageTracker.kt */
/* loaded from: classes2.dex */
public final class b extends a {
    public b(c cVar, c3 c3Var, l3.d dVar) {
        super(cVar, c3Var, dVar);
    }

    @Override // ac.a
    public final void a(JSONObject jSONObject, bc.a aVar) {
        zc.d.d(jSONObject, "jsonObject");
    }

    @Override // ac.a
    public final void b() {
        bc.b bVar = this.f401a;
        if (bVar == null) {
            bVar = bc.b.UNATTRIBUTED;
        }
        if (bVar == bc.b.DIRECT) {
            bVar = bc.b.INDIRECT;
        }
        c cVar = this.f404d;
        cVar.getClass();
        cVar.f406a.getClass();
        r3.h(bVar.toString(), r3.f27010a, "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE");
    }

    @Override // ac.a
    public final int c() {
        this.f404d.f406a.getClass();
        return r3.c(10, "PREFS_OS_IAM_LIMIT");
    }

    @Override // ac.a
    public final int d() {
        return 1;
    }

    @Override // ac.a
    public final String f() {
        return "iam_id";
    }

    @Override // ac.a
    public final int g() {
        this.f404d.f406a.getClass();
        return r3.c(1440, "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW");
    }

    @Override // ac.a
    public final JSONArray h() throws JSONException {
        JSONArray jSONArray;
        this.f404d.f406a.getClass();
        String f = r3.f(r3.f27010a, "PREFS_OS_LAST_IAMS_RECEIVED", ContentRecord.XRINFOLIST_NULL);
        if (f != null) {
            jSONArray = new JSONArray(f);
        } else {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    @Override // ac.a
    public final JSONArray i(String str) {
        s1 s1Var = this.f405e;
        try {
            JSONArray h10 = h();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = h10.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if (!zc.d.a(str, h10.getJSONObject(i10).getString("iam_id"))) {
                        jSONArray.put(h10.getJSONObject(i10));
                    }
                }
                return jSONArray;
            } catch (JSONException e10) {
                ((c3) s1Var).getClass();
                e3.b(3, "Generating tracker lastChannelObjectReceived get JSONObject ", e10);
                return h10;
            }
        } catch (JSONException e11) {
            ((c3) s1Var).getClass();
            e3.b(3, "Generating IAM tracker getLastChannelObjects JSONObject ", e11);
            return new JSONArray();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r4 != null) goto L17;
     */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r6 = this;
            ac.c r0 = r6.f404d
            com.onesignal.c3 r0 = r0.f406a
            r0.getClass()
            java.lang.String r0 = com.onesignal.r3.f27010a
            java.lang.String r1 = "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE"
            java.lang.String r2 = "UNATTRIBUTED"
            java.lang.String r0 = com.onesignal.r3.f(r0, r1, r2)
            r1 = 0
            if (r0 == 0) goto L32
            bc.b[] r2 = bc.b.values()
            int r3 = r2.length
        L19:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L2e
            r4 = r2[r3]
            java.lang.String r5 = r4.name()
            if (r5 != 0) goto L27
            r5 = r1
            goto L2b
        L27:
            boolean r5 = r5.equalsIgnoreCase(r0)
        L2b:
            if (r5 == 0) goto L19
            goto L2f
        L2e:
            r4 = 0
        L2f:
            if (r4 == 0) goto L32
            goto L34
        L32:
            bc.b r4 = bc.b.UNATTRIBUTED
        L34:
            bc.b r0 = bc.b.INDIRECT
            if (r4 != r0) goto L39
            r1 = 1
        L39:
            if (r1 == 0) goto L41
            org.json.JSONArray r0 = r6.j()
            r6.f402b = r0
        L41:
            r6.f401a = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OneSignal InAppMessageTracker initInfluencedTypeFromCache: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.onesignal.s1 r1 = r6.f405e
            com.onesignal.c3 r1 = (com.onesignal.c3) r1
            r1.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.b.k():void");
    }

    @Override // ac.a
    public final void m(JSONArray jSONArray) {
        c cVar = this.f404d;
        cVar.getClass();
        cVar.f406a.getClass();
        r3.h(jSONArray.toString(), r3.f27010a, "PREFS_OS_LAST_IAMS_RECEIVED");
    }
}
