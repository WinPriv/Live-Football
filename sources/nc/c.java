package nc;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c extends h {
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
                    int i11 = 0;
                    int i12 = 0;
                    while (i12 < size) {
                        Field field = fieldArr[i12];
                        field.setAccessible(true);
                        Object obj3 = field.get(obj2);
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            Method[] declaredMethods = obj3.getClass().getDeclaredMethods();
                            int length = declaredMethods.length;
                            for (int i13 = i11; i13 < length; i13++) {
                                Method method = declaredMethods[i13];
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
                                    i12++;
                                    i11 = 0;
                                    obj2 = obj;
                                }
                            }
                            methodArr = (Method[]) arrayList2.toArray(new Method[i11]);
                        } catch (Exception unused2) {
                        }
                        if (obj3 == null && methodArr != null) {
                            int length2 = methodArr.length;
                            boolean z10 = true;
                            int i14 = i11;
                            while (i11 < length2) {
                                Method method2 = methodArr[i11];
                                method2.setAccessible(z10);
                                try {
                                    invoke = method2.invoke(obj3, new Object[i14]);
                                } catch (Throwable unused3) {
                                }
                                if (invoke instanceof JSONObject) {
                                    if (((JSONObject) invoke).has(str4)) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        while (i14 < jSONArray.length()) {
                                            try {
                                                String optString = jSONArray.optString(i14);
                                                methodArr2 = methodArr;
                                                try {
                                                    String optString2 = jSONObject.optString(optString);
                                                    i10 = length2;
                                                    try {
                                                        if (TextUtils.equals(optString2, "all")) {
                                                            jSONObject2.put(optString, invoke.toString());
                                                        } else {
                                                            jSONObject2.put(optString, i(optString2, (JSONObject) invoke));
                                                        }
                                                        i14++;
                                                        methodArr = methodArr2;
                                                        length2 = i10;
                                                    } catch (Throwable unused4) {
                                                    }
                                                } catch (Throwable unused5) {
                                                }
                                            } catch (Throwable unused6) {
                                            }
                                        }
                                        methodArr2 = methodArr;
                                        i10 = length2;
                                        lc.a aVar = new lc.a();
                                        aVar.f32592a = jSONObject2;
                                        return aVar;
                                    }
                                    methodArr2 = methodArr;
                                    i10 = length2;
                                    i11++;
                                    z10 = true;
                                    i14 = 0;
                                    methodArr = methodArr2;
                                    length2 = i10;
                                }
                                methodArr2 = methodArr;
                                i10 = length2;
                                i11++;
                                z10 = true;
                                i14 = 0;
                                methodArr = methodArr2;
                                length2 = i10;
                            }
                        } else if (obj3 != null && !sb2.contains(obj3.getClass().getName()) && (j10 = j(obj3, sb2, str2, str3, str4, jSONObject, jSONArray)) != null) {
                            return j10;
                        }
                        i12++;
                        i11 = 0;
                        obj2 = obj;
                    }
                    return null;
                }
                return null;
            } catch (Throwable unused7) {
                return null;
            }
        }
        return null;
    }

    public static lc.a k(Object obj, String str, String str2, JSONObject jSONObject, JSONArray jSONArray) {
        int i10;
        Field[] fieldArr;
        lc.a k10;
        String str3;
        Object obj2 = obj;
        if (obj2 != null && obj.getClass().getName().startsWith(str2)) {
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
            j10.append(obj.getClass().getName());
            j10.append(",");
            String sb2 = j10.toString();
            try {
                ArrayList arrayList = new ArrayList();
                h.d(obj.getClass(), arrayList);
                int size = arrayList.size();
                Field[] fieldArr2 = new Field[size];
                arrayList.toArray(fieldArr2);
                if (size != 0) {
                    int i11 = 0;
                    while (i11 < size) {
                        Field field = fieldArr2[i11];
                        field.setAccessible(true);
                        Object obj3 = field.get(obj2);
                        if (obj3 != null && (obj3 instanceof JSONObject)) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                int i12 = 0;
                                String str4 = "";
                                while (i12 < jSONArray.length()) {
                                    String optString = jSONArray.optString(i12);
                                    String optString2 = jSONObject.optString(optString);
                                    if (TextUtils.equals(optString2, "all")) {
                                        i10 = size;
                                        fieldArr = fieldArr2;
                                        str4 = optString;
                                    } else {
                                        JSONObject jSONObject3 = (JSONObject) obj3;
                                        try {
                                            String[] split = optString2.split(w.bE);
                                            int i13 = 0;
                                            i10 = size;
                                            while (i13 < split.length) {
                                                try {
                                                    int i14 = i13 + 1;
                                                    fieldArr = fieldArr2;
                                                    try {
                                                        if (i14 == split.length) {
                                                            str3 = jSONObject3.optString(split[i13]);
                                                            break;
                                                        }
                                                        jSONObject3 = jSONObject3.optJSONObject(split[i13]);
                                                        i13 = i14;
                                                        fieldArr2 = fieldArr;
                                                    } catch (Throwable unused) {
                                                    }
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                        } catch (Throwable unused3) {
                                            i10 = size;
                                        }
                                        fieldArr = fieldArr2;
                                        str3 = "";
                                        try {
                                            if (!TextUtils.isEmpty(str3)) {
                                                jSONObject2.put(optString, str3);
                                            }
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    i12++;
                                    size = i10;
                                    fieldArr2 = fieldArr;
                                }
                                i10 = size;
                                fieldArr = fieldArr2;
                                if (jSONObject2.length() != 0) {
                                    lc.a aVar = new lc.a();
                                    if (!TextUtils.isEmpty(str4)) {
                                        jSONObject2.put(str4, obj3.toString());
                                    }
                                    aVar.f32592a = jSONObject2;
                                    return aVar;
                                }
                                continue;
                            } catch (Throwable unused5) {
                                i10 = size;
                                fieldArr = fieldArr2;
                            }
                        } else {
                            i10 = size;
                            fieldArr = fieldArr2;
                            if (obj3 != null && !sb2.contains(obj3.getClass().getName()) && (k10 = k(obj3, sb2, str2, jSONObject, jSONArray)) != null) {
                                return k10;
                            }
                        }
                        i11++;
                        obj2 = obj;
                        size = i10;
                        fieldArr2 = fieldArr;
                    }
                    return null;
                }
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
