package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CollectionUtils {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f19372a;

    public static List<String> explode(String str) {
        return explode(str, ",\\s*");
    }

    public static boolean getBoolean(Map<String, Object> map, String str) {
        return getBoolean(map, str, false);
    }

    public static String implode(Collection<String> collection, int i10) {
        return implode(collection, ",", i10);
    }

    public static <K, V> Map<K, V> map() {
        return map(-1);
    }

    public static void putBooleanIfValid(String str, Boolean bool, Map map) {
        if (StringUtils.isValidString(str) && bool != null) {
            map.put(str, bool);
        }
    }

    public static void putDoubleIfValid(String str, Double d10, Map map) {
        if (StringUtils.isValidString(str) && d10 != null) {
            map.put(str, d10);
        }
    }

    public static void putFloatIfValid(String str, Float f, Map map) {
        if (StringUtils.isValidString(str) && f != null) {
            map.put(str, f);
        }
    }

    public static void putIntegerIfValid(String str, Integer num, Map map) {
        if (StringUtils.isValidString(str) && num != null) {
            map.put(str, num);
        }
    }

    public static void putLongIfValid(String str, Long l10, Map map) {
        if (StringUtils.isValidString(str) && l10 != null) {
            map.put(str, l10);
        }
    }

    public static void putStringIfValid(String str, String str2, Map map) {
        if (StringUtils.isValidString(str) && StringUtils.isValidString(str2)) {
            map.put(str, str2);
        }
    }

    public static List<String> removeTrimmedEmptyStrings(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String trim = it.next().trim();
            if (!TextUtils.isEmpty(trim)) {
                arrayList.add(trim);
            }
        }
        return arrayList;
    }

    public static void setShouldUseArrayMap(boolean z10) {
        f19372a = z10;
    }

    public static <T> List<T> synchronizedList() {
        return synchronizedList(-1);
    }

    public static Bundle toBundle(Map<String, ?> map) {
        if (map != null && map.size() != 0) {
            Bundle bundle = new Bundle();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj instanceof Map) {
                    bundle.putBundle(str, toBundle((Map) obj));
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    bundle.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    bundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Parcelable) {
                    bundle.putParcelable(str, (Parcelable) obj);
                }
            }
            return bundle;
        }
        return new Bundle();
    }

    public static JSONArray toJSONArray(List<String> list) {
        if (list == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public static JSONObject toJson(Map<String, ?> map) throws JSONException {
        if (map == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static String toJsonString(Map<String, Object> map, String str) {
        try {
            return toJson(map).toString();
        } catch (JSONException e10) {
            y.c("CollectionUtils", "Failed to convert map '" + map + "' to JSON string.", e10);
            return str;
        }
    }

    public static List<String> explode(String str, String str2) {
        return TextUtils.isEmpty(str) ? Collections.emptyList() : Arrays.asList(str.split(str2));
    }

    public static boolean getBoolean(Map<String, Object> map, String str, boolean z10) {
        if (map != null && map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof Number) {
                return ((Number) obj).intValue() >= 1;
            }
        }
        return z10;
    }

    public static String implode(Collection<String> collection, String str, int i10) {
        if (str != null) {
            if (collection == null || collection.size() < 1) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            for (String str2 : collection) {
                if (i11 >= i10) {
                    break;
                }
                i11++;
                sb2.append(str2);
                sb2.append(str);
            }
            if (sb2.length() > str.length()) {
                sb2.setLength(sb2.length() - str.length());
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("No glue specified");
    }

    public static <K, V> Map<K, V> map(int i10) {
        return (h.c() && f19372a) ? i10 == -1 ? new ArrayMap() : new ArrayMap(i10) : i10 == -1 ? new HashMap() : new HashMap(i10);
    }

    public static <T> List<T> synchronizedList(int i10) {
        if (i10 >= 0) {
            return Collections.synchronizedList(new ArrayList(i10));
        }
        return Collections.synchronizedList(new ArrayList());
    }

    public static <K, V> Map<K, V> map(Map<K, V> map) {
        if (map == null) {
            return map();
        }
        Map<K, V> map2 = map(map.size());
        map2.putAll(map);
        return map2;
    }

    public static <K, V> Map<K, V> map(K k10, V v3) {
        Map<K, V> map = map(1);
        map.put(k10, v3);
        return map;
    }
}
