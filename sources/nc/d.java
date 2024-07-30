package nc;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d extends h {
    public static String i(String str, JSONObject jSONObject) {
        String[] split;
        int i10;
        try {
            split = str.split(w.bE);
            i10 = 0;
        } catch (Throwable unused) {
            return "";
        }
        while (i10 < split.length) {
            int i11 = i10 + 1;
            if (i11 == split.length) {
                return jSONObject.optString(split[i10]);
            }
            try {
                jSONObject = new JSONObject(jSONObject.optString(split[i10]));
            } catch (JSONException unused2) {
                jSONObject = new JSONArray(jSONObject.optString(split[i10])).getJSONObject(0);
            }
            i10 = i11;
            return "";
        }
        return "";
    }

    public static lc.a j(Object obj, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONArray jSONArray) {
        Method[] methodArr;
        lc.a j10;
        Method[] methodArr2;
        int i10;
        Object invoke;
        Method[] methodArr3;
        int i11;
        Object obj2 = obj;
        if (obj2 != null && obj.getClass().getName().startsWith(str2)) {
            StringBuilder j11 = com.ironsource.adapters.facebook.a.j(str);
            j11.append(obj.getClass().getName());
            j11.append(",");
            String sb2 = j11.toString();
            try {
                ArrayList arrayList = new ArrayList();
                h.d(obj.getClass(), arrayList);
                int size = arrayList.size();
                Field[] fieldArr = new Field[size];
                arrayList.toArray(fieldArr);
                if (size != 0) {
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        Field field = fieldArr[i13];
                        field.setAccessible(true);
                        Object obj3 = field.get(obj2);
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            Method[] declaredMethods = obj3.getClass().getDeclaredMethods();
                            int length = declaredMethods.length;
                            for (int i14 = i12; i14 < length; i14++) {
                                Method method = declaredMethods[i14];
                                try {
                                    if (method.getGenericReturnType().toString().contains(str3)) {
                                        arrayList2.add(method);
                                    }
                                } catch (Exception unused) {
                                    methodArr = null;
                                    if (obj3 == null) {
                                    }
                                    if (obj3 != null) {
                                        return j10;
                                    }
                                    continue;
                                    i13++;
                                    i12 = 0;
                                    obj2 = obj;
                                }
                            }
                            methodArr = (Method[]) arrayList2.toArray(new Method[i12]);
                        } catch (Exception unused2) {
                        }
                        if (obj3 == null && methodArr != null) {
                            int length2 = methodArr.length;
                            boolean z10 = true;
                            int i15 = i12;
                            while (i12 < length2) {
                                Method method2 = methodArr[i12];
                                method2.setAccessible(z10);
                                try {
                                    invoke = method2.invoke(obj3, new Object[i15]);
                                } catch (Throwable unused3) {
                                }
                                if (invoke instanceof JSONObject) {
                                    if (((JSONObject) invoke).has(str4)) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        while (i15 < jSONArray.length()) {
                                            try {
                                                String optString = jSONArray.optString(i15);
                                                methodArr3 = methodArr;
                                                try {
                                                    String optString2 = jSONObject.optString(optString);
                                                    i11 = length2;
                                                    try {
                                                        if (TextUtils.equals(optString2, "all")) {
                                                            jSONObject2.put(optString, invoke.toString());
                                                        } else {
                                                            String i16 = i(optString2, (JSONObject) invoke);
                                                            if (!TextUtils.isEmpty(i16)) {
                                                                jSONObject2.put(optString, i16);
                                                            }
                                                        }
                                                    } catch (Throwable unused4) {
                                                    }
                                                } catch (Throwable unused5) {
                                                    i11 = length2;
                                                    i15++;
                                                    methodArr = methodArr3;
                                                    length2 = i11;
                                                }
                                            } catch (Throwable unused6) {
                                                methodArr3 = methodArr;
                                            }
                                            i15++;
                                            methodArr = methodArr3;
                                            length2 = i11;
                                        }
                                        methodArr2 = methodArr;
                                        i10 = length2;
                                        try {
                                            lc.a aVar = new lc.a();
                                            aVar.f32592a = jSONObject2;
                                            return aVar;
                                        } catch (Throwable unused7) {
                                            continue;
                                        }
                                    } else {
                                        methodArr2 = methodArr;
                                        i10 = length2;
                                        i12++;
                                        z10 = true;
                                        i15 = 0;
                                        methodArr = methodArr2;
                                        length2 = i10;
                                    }
                                }
                                methodArr2 = methodArr;
                                i10 = length2;
                                i12++;
                                z10 = true;
                                i15 = 0;
                                methodArr = methodArr2;
                                length2 = i10;
                            }
                        } else if (obj3 != null && !sb2.contains(obj3.getClass().getName()) && (j10 = j(obj3, sb2, str2, str3, str4, jSONObject, jSONArray)) != null) {
                            return j10;
                        }
                        i13++;
                        i12 = 0;
                        obj2 = obj;
                    }
                    return null;
                }
                return null;
            } catch (Throwable unused8) {
                return null;
            }
        }
        return null;
    }

    public static lc.a k(Object obj, String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        Method method;
        lc.a k10;
        if (obj != null && obj.getClass().getName().startsWith(str2)) {
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
            j10.append(obj.getClass().getName());
            j10.append(",");
            String sb2 = j10.toString();
            try {
                ArrayList arrayList = new ArrayList();
                h.d(obj.getClass(), arrayList);
                int size = arrayList.size();
                Field[] fieldArr = new Field[size];
                arrayList.toArray(fieldArr);
                if (size != 0) {
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size) {
                        Field field = fieldArr[i10];
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            h.g(obj2.getClass(), arrayList2);
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                method = (Method) it.next();
                                if (method.getGenericReturnType().toString().contains(str3)) {
                                    break;
                                }
                            }
                        } catch (Exception unused) {
                        }
                        method = null;
                        if (obj2 != null && method != null) {
                            method.setAccessible(true);
                            try {
                                Object invoke = method.invoke(obj2, new Object[i11]);
                                if (invoke instanceof JSONObject) {
                                    String str4 = "";
                                    JSONObject jSONObject2 = new JSONObject();
                                    while (i11 < jSONArray.length()) {
                                        try {
                                            String optString = jSONArray.optString(i11);
                                            String optString2 = jSONObject.optString(optString);
                                            if (TextUtils.equals(optString2, "all")) {
                                                str4 = optString;
                                            } else {
                                                String l10 = l(invoke, optString2);
                                                if (!TextUtils.isEmpty(l10)) {
                                                    jSONObject2.put(optString, l10);
                                                }
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                        i11++;
                                    }
                                    if (jSONObject2.length() > 0) {
                                        lc.a aVar = new lc.a();
                                        if (!TextUtils.isEmpty(str4)) {
                                            jSONObject2.put(str4, invoke.toString());
                                        }
                                        aVar.f32592a = jSONObject2;
                                        return aVar;
                                    }
                                    continue;
                                } else {
                                    continue;
                                }
                            } catch (Throwable unused3) {
                                continue;
                            }
                        } else if (obj2 != null && !sb2.contains(obj2.getClass().getName()) && (k10 = k(obj2, sb2, str2, str3, jSONArray, jSONObject)) != null) {
                            return k10;
                        }
                        i10++;
                        i11 = 0;
                    }
                    return null;
                }
                return null;
            } catch (Throwable unused4) {
                return null;
            }
        }
        return null;
    }

    public static String l(Object obj, String str) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            if (jSONObject.has(str)) {
                return jSONObject.optString(str);
            }
            while (keys.hasNext()) {
                Object opt = jSONObject.opt(keys.next());
                if ((opt instanceof JSONObject) || (opt instanceof JSONArray)) {
                    String l10 = l(opt, str);
                    if (!TextUtils.isEmpty(l10)) {
                        return l10;
                    }
                }
            }
        }
        if (obj instanceof JSONArray) {
            int i10 = 0;
            while (true) {
                JSONArray jSONArray = (JSONArray) obj;
                if (i10 < jSONArray.length()) {
                    Object opt2 = jSONArray.opt(i10);
                    if ((opt2 instanceof JSONObject) || (opt2 instanceof JSONArray)) {
                        String l11 = l(opt2, str);
                        if (!TextUtils.isEmpty(l11)) {
                            return l11;
                        }
                    }
                    i10++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }
}
