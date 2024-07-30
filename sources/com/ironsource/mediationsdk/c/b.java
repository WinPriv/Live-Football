package com.ironsource.mediationsdk.c;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f25363a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25364b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f25365c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25366d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f25367e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f25368g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f25369h;

    /* renamed from: i, reason: collision with root package name */
    public final ImpressionData f25370i;

    public b(String str) {
        this.f25363a = str;
        this.f25364b = "";
        this.f25366d = "";
        this.f25367e = new ArrayList();
        this.f = new ArrayList();
        this.f25368g = new ArrayList();
        this.f25369h = true;
        this.f25370i = null;
        this.f25365c = null;
    }

    public static Object a(Object obj) {
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(a(jSONArray.get(i10)));
            } catch (JSONException e10) {
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", e10.getMessage()));
            }
        }
        return arrayList;
    }

    public static Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            return new JSONArray((Collection) Arrays.asList(obj));
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if ((obj instanceof Enum) || obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    public ImpressionData b(String str) {
        ImpressionData impressionData = this.f25370i;
        if (impressionData == null) {
            return null;
        }
        ImpressionData impressionData2 = new ImpressionData(impressionData);
        impressionData2.replaceMacroForPlacementWithValue("${PLACEMENT_NAME}", str);
        return impressionData2;
    }

    public String d() {
        return this.f25366d;
    }

    public List<String> e() {
        return this.f25367e;
    }

    public List<String> f() {
        return this.f;
    }

    public List<String> g() {
        return this.f25368g;
    }

    public boolean h() {
        return this.f25369h;
    }

    public b(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    public String a() {
        return this.f25363a;
    }

    public String b() {
        return this.f25364b;
    }

    public JSONObject c() {
        return this.f25365c;
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f25369h = false;
        try {
            if (jSONObject.has("instance")) {
                this.f25363a = jSONObject.getString("instance");
            }
            this.f25364b = jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : jSONObject.has("serverData") ? jSONObject.getJSONObject("serverData").toString() : "";
            if (jSONObject.has("adData")) {
                this.f25365c = jSONObject.getJSONObject("adData");
            }
            this.f25366d = jSONObject.has("price") ? jSONObject.getString("price") : "0";
            this.f25367e = new ArrayList();
            this.f = new ArrayList();
            this.f25368g = new ArrayList();
            if (jSONObject.has("notifications")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("notifications");
                if (optJSONObject.has("burl")) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("burl");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        this.f25367e.add(jSONArray.getString(i10));
                    }
                }
                if (optJSONObject.has("lurl")) {
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("lurl");
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        this.f.add(jSONArray2.getString(i11));
                    }
                }
                if (optJSONObject.has("nurl")) {
                    JSONArray jSONArray3 = optJSONObject.getJSONArray("nurl");
                    for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                        this.f25368g.add(jSONArray3.getString(i12));
                    }
                }
            }
            this.f25370i = new ImpressionData(a(jSONObject2, jSONObject.has("armData") ? jSONObject.optJSONObject("armData") : null));
            this.f25369h = true;
        } catch (Exception e10) {
            IronLog.INTERNAL.error("AuctionResponseItem exception " + e10.getMessage());
        }
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, a(jSONObject.get(next)));
            } catch (JSONException e10) {
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", next, e10.getMessage()));
            }
        }
        return hashMap;
    }

    public static JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), c(entry.getValue()));
                } catch (JSONException unused) {
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", entry.getKey(), entry.getValue()));
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i10 = 0; i10 < 2; i10++) {
            JSONObject jSONObject2 = jSONObjectArr[i10];
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.get(next));
                    } catch (JSONException e10) {
                        IronLog.INTERNAL.error(e10.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    public static boolean a(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
