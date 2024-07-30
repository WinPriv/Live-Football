package com.onesignal;

import android.text.TextUtils;
import com.onesignal.a0;
import com.onesignal.v3;
import com.onesignal.z4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignalStateSynchronizer.java */
/* loaded from: classes2.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f26689a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<b, z4> f26690b = new HashMap<>();

    /* compiled from: OneSignalStateSynchronizer.java */
    /* loaded from: classes2.dex */
    public interface a {
        void onFailure();

        void onSuccess();
    }

    /* compiled from: OneSignalStateSynchronizer.java */
    /* loaded from: classes2.dex */
    public enum b {
        PUSH,
        EMAIL,
        SMS
    }

    public static s4 a() {
        HashMap<b, z4> hashMap = f26690b;
        b bVar = b.EMAIL;
        if (!hashMap.containsKey(bVar) || hashMap.get(bVar) == null) {
            synchronized (f26689a) {
                if (hashMap.get(bVar) == null) {
                    hashMap.put(bVar, new s4());
                }
            }
        }
        return (s4) hashMap.get(bVar);
    }

    public static v4 b() {
        HashMap<b, z4> hashMap = f26690b;
        b bVar = b.PUSH;
        if (!hashMap.containsKey(bVar) || hashMap.get(bVar) == null) {
            synchronized (f26689a) {
                if (hashMap.get(bVar) == null) {
                    hashMap.put(bVar, new v4());
                }
            }
        }
        return (v4) hashMap.get(bVar);
    }

    public static x4 c() {
        HashMap<b, z4> hashMap = f26690b;
        b bVar = b.SMS;
        if (!hashMap.containsKey(bVar) || hashMap.get(bVar) == null) {
            synchronized (f26689a) {
                if (hashMap.get(bVar) == null) {
                    hashMap.put(bVar, new x4());
                }
            }
        }
        return (x4) hashMap.get(bVar);
    }

    public static z4.b d(boolean z10) {
        z4.b bVar;
        JSONObject jSONObject;
        v4 b10 = b();
        if (z10) {
            b10.getClass();
            v3.a("players/" + e3.s() + "?app_id=" + e3.q(), null, null, new u4(b10), com.huawei.openalliance.ad.constant.w.f22171t, "CACHE_KEY_GET_TAGS");
        }
        synchronized (b10.f27223a) {
            boolean z11 = v4.f27153m;
            d0.b d10 = b10.o().d();
            if (!((JSONObject) d10.f27251t).has("tags")) {
                jSONObject = null;
            } else {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject optJSONObject = ((JSONObject) d10.f27251t).optJSONObject("tags");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        Object obj = optJSONObject.get(next);
                        if (!"".equals(obj)) {
                            jSONObject2.put(next, obj);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject = jSONObject2;
            }
            bVar = new z4.b(jSONObject, z11);
        }
        return bVar;
    }

    public static void e(JSONObject jSONObject, v3.c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b());
        if (!TextUtils.isEmpty(e3.f26761i)) {
            arrayList.add(a());
        }
        if (!TextUtils.isEmpty(e3.f26763j)) {
            arrayList.add(c());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v3.b("players/" + ((z4) it.next()).k() + "/on_purchase", jSONObject, cVar);
        }
    }

    public static void f(a0.d dVar) {
        b().D(dVar);
        a().D(dVar);
        c().D(dVar);
    }

    public static void g(JSONObject jSONObject) {
        v4 b10 = b();
        b10.getClass();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", null));
            q4 p10 = b10.p();
            p10.getClass();
            synchronized (q4.f26990d) {
                JSONObject jSONObject3 = p10.f26994c;
                c3.e(jSONObject3, jSONObject2, jSONObject3, null);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        try {
            JSONObject jSONObject4 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject4.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject4.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            q4 p11 = b10.p();
            p11.getClass();
            synchronized (q4.f26990d) {
                JSONObject jSONObject5 = p11.f26993b;
                c3.e(jSONObject5, jSONObject4, jSONObject5, null);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
