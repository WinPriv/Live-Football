package com.iab.omid.library.vungle.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.iab.omid.library.vungle.walking.a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static WindowManager f24521b;

    /* renamed from: c, reason: collision with root package name */
    private static String[] f24522c = {"x", "y", ContentRecord.WIDTH, ContentRecord.HEIGHT};

    /* renamed from: a, reason: collision with root package name */
    static float f24520a = Resources.getSystem().getDisplayMetrics().density;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final float f24523a;

        /* renamed from: b, reason: collision with root package name */
        final float f24524b;

        public a(float f, float f10) {
            this.f24523a = f;
            this.f24524b = f10;
        }
    }

    public static float a(int i10) {
        return i10 / f24520a;
    }

    private static a b(JSONObject jSONObject) {
        float f;
        float f10;
        if (f24521b != null) {
            Point point = new Point(0, 0);
            f24521b.getDefaultDisplay().getRealSize(point);
            f = a(point.x);
            f10 = a(point.y);
        } else {
            f = gl.Code;
            f10 = 0.0f;
        }
        return new a(f, f10);
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f24522c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            if (!optJSONArray.optString(i10, "").equals(optJSONArray2.optString(i10, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            if (!b(optJSONArray.optJSONObject(i10), optJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i10));
            jSONObject.put("y", a(i11));
            jSONObject.put(ContentRecord.WIDTH, a(i12));
            jSONObject.put(ContentRecord.HEIGHT, a(i13));
        } catch (JSONException e10) {
            c.a("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            c.a("Error with setting not visible reason", e10);
        }
    }

    public static void a(Context context) {
        if (context != null) {
            f24520a = context.getResources().getDisplayMetrics().density;
            f24521b = (WindowManager) context.getSystemService("window");
        }
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return c(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && f(jSONObject, jSONObject2);
    }

    public static void a(JSONObject jSONObject) {
        a b10 = b(jSONObject);
        try {
            jSONObject.put(ContentRecord.WIDTH, b10.f24523a);
            jSONObject.put(ContentRecord.HEIGHT, b10.f24524b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void a(JSONObject jSONObject, a.C0315a c0315a) {
        com.iab.omid.library.vungle.b.c a10 = c0315a.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = c0315a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a10.b());
            jSONObject.put("friendlyObstructionPurpose", a10.c());
            jSONObject.put("friendlyObstructionReason", a10.d());
        } catch (JSONException e10) {
            c.a("Error with setting friendly obstruction", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            c.a("Error with setting ad session id", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e10) {
            c.a("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
