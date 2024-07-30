package dc;

import a4.j;
import com.onesignal.s1;

/* compiled from: OSOutcomeEventsV1Repository.kt */
/* loaded from: classes2.dex */
public final class c extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s1 s1Var, j jVar, d dVar) {
        super(s1Var, jVar, dVar);
        zc.d.d(s1Var, "logger");
        zc.d.d(jVar, "outcomeEventsCache");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r10, int r11, ec.b r12, com.onesignal.l3 r13) {
        /*
            r9 = this;
            java.lang.String r0 = "appId"
            zc.d.d(r10, r0)
            java.lang.String r0 = "eventParams"
            zc.d.d(r12, r0)
            bc.b r0 = bc.b.UNATTRIBUTED
            ec.d r1 = r12.f27890b
            if (r1 == 0) goto L3a
            ec.e r2 = r1.f27893a
            if (r2 == 0) goto L25
            org.json.JSONArray r2 = r2.f27895a
            if (r2 == 0) goto L25
            int r2 = r2.length()
            if (r2 <= 0) goto L25
            bc.b r0 = bc.b.DIRECT
            ec.e r1 = r1.f27893a
            org.json.JSONArray r1 = r1.f27895a
            goto L3b
        L25:
            ec.e r2 = r1.f27894b
            if (r2 == 0) goto L3a
            org.json.JSONArray r2 = r2.f27895a
            if (r2 == 0) goto L3a
            int r2 = r2.length()
            if (r2 <= 0) goto L3a
            bc.b r0 = bc.b.INDIRECT
            ec.e r1 = r1.f27894b
            org.json.JSONArray r1 = r1.f27895a
            goto L3b
        L3a:
            r1 = 0
        L3b:
            r4 = r1
            com.onesignal.e2 r1 = new com.onesignal.e2
            java.lang.String r5 = r12.f27889a
            long r6 = r12.f27892d
            float r8 = r12.f27891c
            r2 = r1
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r8)
            int r12 = r0.ordinal()
            r0 = 3
            java.lang.String r2 = "direct"
            r3 = 1
            java.lang.String r4 = "jsonObject"
            dc.g r5 = r9.f27607c
            java.lang.String r6 = "device_type"
            com.onesignal.s1 r7 = r9.f27605a
            java.lang.String r8 = "app_id"
            if (r12 == 0) goto La6
            if (r12 == r3) goto L82
            r2 = 2
            if (r12 == r2) goto L63
            goto Lc8
        L63:
            org.json.JSONObject r12 = r1.a()     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r10 = r12.put(r8, r10)     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r10 = r10.put(r6, r11)     // Catch: org.json.JSONException -> L76
            zc.d.c(r10, r4)     // Catch: org.json.JSONException -> L76
            r5.a(r10, r13)     // Catch: org.json.JSONException -> L76
            goto Lc8
        L76:
            r10 = move-exception
            com.onesignal.c3 r7 = (com.onesignal.c3) r7
            r7.getClass()
            java.lang.String r11 = "Generating unattributed outcome:JSON Failed."
            com.onesignal.e3.b(r0, r11, r10)
            goto Lc8
        L82:
            org.json.JSONObject r12 = r1.a()     // Catch: org.json.JSONException -> L9a
            org.json.JSONObject r10 = r12.put(r8, r10)     // Catch: org.json.JSONException -> L9a
            org.json.JSONObject r10 = r10.put(r6, r11)     // Catch: org.json.JSONException -> L9a
            r11 = 0
            org.json.JSONObject r10 = r10.put(r2, r11)     // Catch: org.json.JSONException -> L9a
            zc.d.c(r10, r4)     // Catch: org.json.JSONException -> L9a
            r5.a(r10, r13)     // Catch: org.json.JSONException -> L9a
            goto Lc8
        L9a:
            r10 = move-exception
            com.onesignal.c3 r7 = (com.onesignal.c3) r7
            r7.getClass()
            java.lang.String r11 = "Generating indirect outcome:JSON Failed."
            com.onesignal.e3.b(r0, r11, r10)
            goto Lc8
        La6:
            org.json.JSONObject r12 = r1.a()     // Catch: org.json.JSONException -> Lbd
            org.json.JSONObject r10 = r12.put(r8, r10)     // Catch: org.json.JSONException -> Lbd
            org.json.JSONObject r10 = r10.put(r6, r11)     // Catch: org.json.JSONException -> Lbd
            org.json.JSONObject r10 = r10.put(r2, r3)     // Catch: org.json.JSONException -> Lbd
            zc.d.c(r10, r4)     // Catch: org.json.JSONException -> Lbd
            r5.a(r10, r13)     // Catch: org.json.JSONException -> Lbd
            goto Lc8
        Lbd:
            r10 = move-exception
            com.onesignal.c3 r7 = (com.onesignal.c3) r7
            r7.getClass()
            java.lang.String r11 = "Generating direct outcome:JSON Failed."
            com.onesignal.e3.b(r0, r11, r10)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.c.c(java.lang.String, int, ec.b, com.onesignal.l3):void");
    }
}
