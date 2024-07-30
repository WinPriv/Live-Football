package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.work.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSWorkManagerHelper.kt */
/* loaded from: classes2.dex */
public class c3 implements s1 {
    public static JSONObject e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, HashSet hashSet) {
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        Iterator<String> keys = jSONObject2.keys();
        if (jSONObject3 != null) {
            jSONObject4 = jSONObject3;
        } else {
            jSONObject4 = new JSONObject();
        }
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject6 = jSONObject.getJSONObject(next);
                        if (jSONObject3 != null && jSONObject3.has(next)) {
                            jSONObject5 = jSONObject3.getJSONObject(next);
                        } else {
                            jSONObject5 = null;
                        }
                        String jSONObject7 = e(jSONObject6, (JSONObject) obj, jSONObject5, hashSet).toString();
                        if (!jSONObject7.equals(JsonUtils.EMPTY_JSON)) {
                            jSONObject4.put(next, new JSONObject(jSONObject7));
                        }
                    } else if (obj instanceof JSONArray) {
                        k(next, (JSONArray) obj, jSONObject.getJSONArray(next), jSONObject4);
                    } else if (hashSet != null && hashSet.contains(next)) {
                        jSONObject4.put(next, obj);
                    } else {
                        Object obj2 = jSONObject.get(next);
                        if (!obj.equals(obj2)) {
                            if ((obj2 instanceof Number) && (obj instanceof Number)) {
                                if (((Number) obj2).doubleValue() != ((Number) obj).doubleValue()) {
                                    jSONObject4.put(next, obj);
                                }
                            } else {
                                jSONObject4.put(next, obj);
                            }
                        }
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4.put(next, new JSONObject(obj.toString()));
                } else if (obj instanceof JSONArray) {
                    k(next, (JSONArray) obj, null, jSONObject4);
                } else {
                    jSONObject4.put(next, obj);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject4;
    }

    public static final synchronized s1.j f(Context context) {
        s1.j jVar;
        boolean z10;
        s1.j b10;
        synchronized (c3.class) {
            zc.d.d(context, bj.f.o);
            synchronized (s1.j.f35071l) {
                jVar = s1.j.f35069j;
                if (jVar == null) {
                    jVar = s1.j.f35070k;
                }
            }
            if (jVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                s1.j.c(context, new androidx.work.a(new a.C0024a()));
            }
            b10 = s1.j.b(context);
            zc.d.c(b10, "WorkManager.getInstance(context)");
        }
        return b10;
    }

    public static String g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return h(jSONObject.optString("custom", null));
    }

    public static String h(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            e3.b(6, "Not a OneSignal formatted JSON String, error parsing string as JSON.", null);
        }
        if (jSONObject.has(com.anythink.basead.d.i.f3957a)) {
            return jSONObject.optString(com.anythink.basead.d.i.f3957a, null);
        }
        e3.b(6, "Not a OneSignal formatted JSON string. No 'i' field in custom.", null);
        return null;
    }

    public static boolean i(Context context) {
        Bundle bundle;
        zc.d.d(context, bj.f.o);
        String str = null;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            e3.b(3, "Manifest application info not found", e10);
            bundle = null;
        }
        if (bundle != null) {
            str = bundle.getString("com.onesignal.NotificationOpened.DEFAULT");
        }
        return !zc.d.a("DISABLE", str);
    }

    public static boolean j(Context context) {
        Bundle bundle;
        zc.d.d(context, bj.f.o);
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            e3.b(3, "Manifest application info not found", e10);
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("com.onesignal.suppressLaunchURLs");
        }
        return false;
    }

    public static void k(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) throws JSONException {
        String q10;
        if (!str.endsWith("_a") && !str.endsWith("_d")) {
            String q11 = q(jSONArray);
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            if (jSONArray2 == null) {
                q10 = null;
            } else {
                q10 = q(jSONArray2);
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String str2 = (String) jSONArray.get(i10);
                if (jSONArray2 == null || !q10.contains(str2)) {
                    jSONArray3.put(str2);
                }
            }
            if (jSONArray2 != null) {
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    String string = jSONArray2.getString(i11);
                    if (!q11.contains(string)) {
                        jSONArray4.put(string);
                    }
                }
            }
            if (!jSONArray3.toString().equals(ContentRecord.XRINFOLIST_NULL)) {
                jSONObject.put(str.concat("_a"), jSONArray3);
            }
            if (!jSONArray4.toString().equals(ContentRecord.XRINFOLIST_NULL)) {
                jSONObject.put(str.concat("_d"), jSONArray4);
                return;
            }
            return;
        }
        jSONObject.put(str, jSONArray);
    }

    public static final String l(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (!jSONObject2.has("a") || (optJSONObject = jSONObject2.optJSONObject("a")) == null || !optJSONObject.has("os_in_app_message_preview_id")) {
                return null;
            }
            return optJSONObject.optString("os_in_app_message_preview_id");
        } catch (JSONException unused) {
            return null;
        }
    }

    public static boolean m(Bundle bundle) {
        String str = null;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("custom", null);
            if (string != null) {
                str = h(string);
            } else {
                e3.b(6, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.", null);
            }
        }
        if (str != null) {
            return true;
        }
        return false;
    }

    public static Object n(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.equals(Integer.class)) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (cls.equals(Float.class)) {
            return Double.valueOf(((Float) obj).floatValue());
        }
        return obj;
    }

    public static final boolean o(Activity activity, JSONObject jSONObject) {
        zc.d.d(activity, "activity");
        String l10 = l(jSONObject);
        if (l10 != null) {
            e3.F(activity, new JSONArray().put(jSONObject));
            e3.n().x(l10);
            return true;
        }
        return false;
    }

    public static void p(g gVar, String str) {
        if (OSUtils.o()) {
            new Thread(gVar, str).start();
        } else {
            gVar.run();
        }
    }

    public static String q(JSONArray jSONArray) {
        String str = "[";
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                str = str + "\"" + jSONArray.getString(i10) + "\"";
            } catch (JSONException unused) {
            }
        }
        return com.ironsource.adapters.facebook.a.h(str, "]");
    }

    public void c(String str) {
        e3.b(6, str, null);
    }

    public void d(String str) {
        e3.b(3, str, null);
    }

    public void r(String str) {
        e3.b(7, str, null);
    }

    public void s(String str) {
        e3.b(4, str, null);
    }
}
