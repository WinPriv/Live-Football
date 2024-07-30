package com.onesignal;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserState.java */
/* loaded from: classes2.dex */
public abstract class q4 {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f26990d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f26991e = new HashSet(Arrays.asList("lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"));

    /* renamed from: a, reason: collision with root package name */
    public final String f26992a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f26993b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f26994c;

    public q4(String str, boolean z10) {
        int c10;
        boolean z11;
        this.f26992a = str;
        if (z10) {
            String f = r3.f(r3.f27010a, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + str, null);
            if (f == null) {
                JSONObject jSONObject = new JSONObject();
                synchronized (f26990d) {
                    this.f26993b = jSONObject;
                }
                try {
                    int i10 = 1;
                    if (str.equals("CURRENT_STATE")) {
                        c10 = r3.c(1, "ONESIGNAL_SUBSCRIPTION");
                    } else {
                        c10 = r3.c(1, "ONESIGNAL_SYNCED_SUBSCRIPTION");
                    }
                    if (c10 == -2) {
                        z11 = false;
                    } else {
                        i10 = c10;
                        z11 = true;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("subscribableStatus", Integer.valueOf(i10));
                    hashMap.put("userSubscribePref", Boolean.valueOf(z11));
                    j(hashMap, this.f26993b);
                } catch (JSONException unused) {
                }
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject(f);
                    synchronized (f26990d) {
                        this.f26993b = jSONObject2;
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            String str2 = r3.f27010a;
            String f10 = r3.f(str2, "ONESIGNAL_USERSTATE_SYNCVALYES_" + str, null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                if (f10 == null) {
                    jSONObject3.put("identifier", r3.f(str2, "GT_REGISTRATION_ID", null));
                } else {
                    jSONObject3 = new JSONObject(f10);
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            synchronized (f26990d) {
                this.f26994c = jSONObject3;
            }
            return;
        }
        this.f26993b = new JSONObject();
        this.f26994c = new JSONObject();
    }

    public static void j(HashMap hashMap, JSONObject jSONObject) throws JSONException {
        synchronized (f26990d) {
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public abstract void a();

    /* JADX WARN: Removed duplicated region for block: B:8:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject b(com.onesignal.q4 r12, boolean r13) {
        /*
            r11 = this;
            java.lang.String r0 = "sms_auth_hash"
            java.lang.String r1 = "email_auth_hash"
            java.lang.String r2 = "app_id"
            java.lang.String r3 = "external_user_id_auth_hash"
            r11.a()
            r12.a()
            java.lang.String r4 = "loc_bg"
            java.lang.String r5 = "loc_time_stamp"
            r6 = 0
            org.json.JSONObject r7 = r11.f26993b     // Catch: java.lang.Throwable -> L42
            long r7 = r7.optLong(r5)     // Catch: java.lang.Throwable -> L42
            org.json.JSONObject r9 = r12.f26993b     // Catch: java.lang.Throwable -> L42
            long r9 = r9.getLong(r5)     // Catch: java.lang.Throwable -> L42
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            java.util.HashMap r7 = new java.util.HashMap     // Catch: java.lang.Throwable -> L42
            r7.<init>()     // Catch: java.lang.Throwable -> L42
            org.json.JSONObject r8 = r12.f26993b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r8 = r8.opt(r4)     // Catch: java.lang.Throwable -> L42
            r7.put(r4, r8)     // Catch: java.lang.Throwable -> L42
            org.json.JSONObject r4 = r12.f26993b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r4.opt(r5)     // Catch: java.lang.Throwable -> L42
            r7.put(r5, r4)     // Catch: java.lang.Throwable -> L42
            org.json.JSONObject r4 = r12.f26994c     // Catch: java.lang.Throwable -> L42
            j(r7, r4)     // Catch: java.lang.Throwable -> L42
            java.util.HashSet r4 = com.onesignal.q4.f26991e     // Catch: java.lang.Throwable -> L42
            goto L43
        L42:
            r4 = r6
        L43:
            org.json.JSONObject r5 = r11.f26994c
            org.json.JSONObject r12 = r12.f26994c
            java.lang.Object r7 = com.onesignal.q4.f26990d
            monitor-enter(r7)
            org.json.JSONObject r12 = com.onesignal.c3.e(r5, r12, r6, r4)     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lac
            if (r13 != 0) goto L5e
            java.lang.String r13 = r12.toString()
            java.lang.String r4 = "{}"
            boolean r13 = r13.equals(r4)
            if (r13 == 0) goto L5e
            return r6
        L5e:
            boolean r13 = r12.has(r2)     // Catch: org.json.JSONException -> La7
            if (r13 != 0) goto L6d
            org.json.JSONObject r13 = r11.f26994c     // Catch: org.json.JSONException -> La7
            java.lang.String r13 = r13.optString(r2)     // Catch: org.json.JSONException -> La7
            r12.put(r2, r13)     // Catch: org.json.JSONException -> La7
        L6d:
            org.json.JSONObject r13 = r11.f26994c     // Catch: org.json.JSONException -> La7
            boolean r13 = r13.has(r1)     // Catch: org.json.JSONException -> La7
            if (r13 == 0) goto L7e
            org.json.JSONObject r13 = r11.f26994c     // Catch: org.json.JSONException -> La7
            java.lang.String r13 = r13.optString(r1)     // Catch: org.json.JSONException -> La7
            r12.put(r1, r13)     // Catch: org.json.JSONException -> La7
        L7e:
            org.json.JSONObject r13 = r11.f26994c     // Catch: org.json.JSONException -> La7
            boolean r13 = r13.has(r0)     // Catch: org.json.JSONException -> La7
            if (r13 == 0) goto L8f
            org.json.JSONObject r13 = r11.f26994c     // Catch: org.json.JSONException -> La7
            java.lang.String r13 = r13.optString(r0)     // Catch: org.json.JSONException -> La7
            r12.put(r0, r13)     // Catch: org.json.JSONException -> La7
        L8f:
            org.json.JSONObject r13 = r11.f26994c     // Catch: org.json.JSONException -> La7
            boolean r13 = r13.has(r3)     // Catch: org.json.JSONException -> La7
            if (r13 == 0) goto Lab
            boolean r13 = r12.has(r3)     // Catch: org.json.JSONException -> La7
            if (r13 != 0) goto Lab
            org.json.JSONObject r13 = r11.f26994c     // Catch: org.json.JSONException -> La7
            java.lang.String r13 = r13.optString(r3)     // Catch: org.json.JSONException -> La7
            r12.put(r3, r13)     // Catch: org.json.JSONException -> La7
            goto Lab
        La7:
            r13 = move-exception
            r13.printStackTrace()
        Lab:
            return r12
        Lac:
            r12 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lac
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.q4.b(com.onesignal.q4, boolean):org.json.JSONObject");
    }

    public final d0.b c() {
        JSONObject jSONObject;
        int i10 = 5;
        try {
            synchronized (f26990d) {
                jSONObject = new JSONObject(this.f26993b.toString());
            }
            return new d0.b(jSONObject, i10);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return new d0.b(5);
        }
    }

    public final d0.b d() {
        try {
            return new d0.b(e(), 5);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return new d0.b(5);
        }
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObject;
        synchronized (f26990d) {
            jSONObject = new JSONObject(this.f26994c.toString());
        }
        return jSONObject;
    }

    public final void f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        if (!jSONObject.has("tags")) {
            return;
        }
        try {
            JSONObject e10 = e();
            if (e10.has("tags")) {
                try {
                    jSONObject3 = new JSONObject(e10.optString("tags"));
                } catch (JSONException unused) {
                    jSONObject3 = new JSONObject();
                }
            } else {
                jSONObject3 = new JSONObject();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("tags");
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("".equals(optJSONObject.optString(next))) {
                    jSONObject3.remove(next);
                } else if (jSONObject2 == null || !jSONObject2.has(next)) {
                    jSONObject3.put(next, optJSONObject.optString(next));
                }
            }
            synchronized (f26990d) {
                if (jSONObject3.toString().equals(JsonUtils.EMPTY_JSON)) {
                    this.f26994c.remove("tags");
                } else {
                    this.f26994c.put("tags", jSONObject3);
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public abstract q4 g();

    public final void h() {
        synchronized (f26990d) {
            try {
                if (this.f26994c.has("external_user_id_auth_hash") && ((this.f26994c.has("external_user_id") && this.f26994c.get("external_user_id").toString() == "") || !this.f26994c.has("external_user_id"))) {
                    this.f26994c.remove("external_user_id_auth_hash");
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            String str = r3.f27010a;
            r3.h(this.f26994c.toString(), str, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f26992a);
            r3.h(this.f26993b.toString(), str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f26992a);
        }
    }

    public final void i(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.f26993b;
            synchronized (f26990d) {
                c3.e(jSONObject3, jSONObject, jSONObject3, null);
            }
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.f26994c;
            synchronized (f26990d) {
                c3.e(jSONObject4, jSONObject2, jSONObject4, null);
            }
            f(jSONObject2, null);
        }
        if (jSONObject != null || jSONObject2 != null) {
            h();
        }
    }

    public final void k(String str) {
        synchronized (f26990d) {
            this.f26994c.remove(str);
        }
    }

    public final String toString() {
        return "UserState{persistKey='" + this.f26992a + "', dependValues=" + this.f26993b + ", syncValues=" + this.f26994c + '}';
    }
}
