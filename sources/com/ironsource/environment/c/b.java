package com.ironsource.environment.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    static {
        new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap] */
    public static HashMap<String, Object> a(ConcurrentHashMap<String, Object> concurrentHashMap) {
        ?? jSONObject;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) entry.getValue();
                jSONObject = new JSONObject();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } else if (entry.getValue() instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) entry.getValue();
                jSONObject = new JSONArray();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    jSONObject.put(jSONArray.opt(i10));
                }
            } else if (entry.getValue() instanceof Map) {
                Map map = (Map) entry.getValue();
                jSONObject = new HashMap();
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            hashMap.put(entry.getKey(), jSONObject);
        }
        return hashMap;
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof List) {
                    jSONObject.put(next, TextUtils.join(",", (List) opt));
                }
            }
        }
        return jSONObject;
    }
}
