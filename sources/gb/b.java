package gb;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f28547a = {String.class, Object.class, Integer.class, Short.class, Long.class, Byte.class, Float.class, Double.class, Character.class, Boolean.class};

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f28548b = {String.class, Object.class, Integer.class, Short.class, Long.class, Byte.class, Float.class, Double.class, Boolean.class};

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f28549c;

    /* loaded from: classes2.dex */
    public static class a implements h<Boolean, Object> {
        @Override // gb.b.h
        public final Boolean a(Object obj) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof String) {
                return Boolean.valueOf(Boolean.parseBoolean((String) obj));
            }
            return null;
        }
    }

    /* renamed from: gb.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0389b implements h<Byte, Number> {
        @Override // gb.b.h
        public final Byte a(Number number) {
            return Byte.valueOf(number.byteValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements h<Double, Number> {
        @Override // gb.b.h
        public final Double a(Number number) {
            return Double.valueOf(number.doubleValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements h<Float, Number> {
        @Override // gb.b.h
        public final Float a(Number number) {
            return Float.valueOf(number.floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements h<Integer, Number> {
        @Override // gb.b.h
        public final Integer a(Number number) {
            return Integer.valueOf(number.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class f implements h<Long, Number> {
        @Override // gb.b.h
        public final Long a(Number number) {
            return Long.valueOf(number.longValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class g implements h<Short, Number> {
        @Override // gb.b.h
        public final Short a(Number number) {
            return Short.valueOf(number.shortValue());
        }
    }

    /* loaded from: classes2.dex */
    public interface h<D, S> {
        D a(S s10);
    }

    static {
        HashMap hashMap = new HashMap();
        f28549c = hashMap;
        e eVar = new e();
        hashMap.put(Integer.TYPE, eVar);
        hashMap.put(Integer.class, eVar);
        f fVar = new f();
        hashMap.put(Long.TYPE, fVar);
        hashMap.put(Long.class, fVar);
        d dVar = new d();
        hashMap.put(Float.TYPE, dVar);
        hashMap.put(Float.class, dVar);
        c cVar = new c();
        hashMap.put(Double.TYPE, cVar);
        hashMap.put(Double.class, cVar);
        g gVar = new g();
        hashMap.put(Short.TYPE, gVar);
        hashMap.put(Short.class, gVar);
        C0389b c0389b = new C0389b();
        hashMap.put(Byte.TYPE, c0389b);
        hashMap.put(Byte.class, c0389b);
        a aVar = new a();
        hashMap.put(Boolean.TYPE, aVar);
        hashMap.put(Boolean.class, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(java.lang.Class r6, java.lang.Class r7, java.lang.Object r8) {
        /*
            boolean r0 = r6.isPrimitive()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L9
            goto L14
        L9:
            r0 = r1
        La:
            r3 = 9
            if (r0 >= r3) goto L19
            java.lang.Class[] r3 = gb.b.f28548b
            r3 = r3[r0]
            if (r6 != r3) goto L16
        L14:
            r0 = r2
            goto L1a
        L16:
            int r0 = r0 + 1
            goto La
        L19:
            r0 = r1
        L1a:
            r3 = 0
            if (r0 == 0) goto L77
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r7 != r6) goto L32
            boolean r6 = r8 instanceof java.lang.String
            if (r6 == 0) goto L29
            java.lang.String r8 = (java.lang.String) r8
            goto Lae
        L29:
            if (r8 == 0) goto L75
            java.lang.String r6 = java.lang.String.valueOf(r8)
            r8 = r6
            goto Lae
        L32:
            boolean r7 = r6.isPrimitive()
            java.util.HashMap r0 = gb.b.f28549c
            java.lang.String r4 = "cannot find value reader for: %s"
            java.lang.String r5 = "b"
            if (r7 != 0) goto L46
            java.lang.Class<java.lang.Number> r7 = java.lang.Number.class
            boolean r7 = r7.isAssignableFrom(r6)
            if (r7 == 0) goto L5d
        L46:
            boolean r7 = r8 instanceof java.lang.Number
            if (r7 == 0) goto L5d
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.Object r7 = r0.get(r6)
            gb.b$h r7 = (gb.b.h) r7
            if (r7 == 0) goto L55
            goto L69
        L55:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r1] = r6
            com.huawei.hms.ads.ex.I(r5, r4, r7)
            goto L75
        L5d:
            java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
            if (r6 != r7) goto Lae
            java.lang.Object r7 = r0.get(r6)
            gb.b$h r7 = (gb.b.h) r7
            if (r7 == 0) goto L6e
        L69:
            java.lang.Object r8 = r7.a(r8)
            goto Lae
        L6e:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r1] = r6
            com.huawei.hms.ads.ex.I(r5, r4, r7)
        L75:
            r8 = r3
            goto Lae
        L77:
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 == 0) goto L84
            java.util.List r8 = q(r6, r7, r8)
            goto Lae
        L84:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 == 0) goto L91
            java.util.Map r8 = h(r6, r7, r3, r8)
            goto Lae
        L91:
            boolean r0 = r8 instanceof org.json.JSONObject
            if (r0 == 0) goto La0
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.Class[] r0 = new java.lang.Class[r2]
            r0[r1] = r7
            java.lang.Object r8 = c(r8, r6, r0)
            goto Lae
        La0:
            boolean r0 = r8 instanceof org.json.JSONArray
            if (r0 == 0) goto Laf
            org.json.JSONArray r8 = (org.json.JSONArray) r8
            java.lang.Class[] r0 = new java.lang.Class[r2]
            r0[r1] = r7
            java.util.List r8 = g(r8, r6, r0)
        Lae:
            return r8
        Laf:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r1] = r6
            java.lang.String r6 = "value from json error, field class: %s"
            org.json.JSONException r6 = i(r2, r6, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.b.a(java.lang.Class, java.lang.Class, java.lang.Object):java.lang.Object");
    }

    public static Object b(Class cls, String str, Class... clsArr) {
        if (!TextUtils.isEmpty(str)) {
            j(cls);
            try {
                try {
                    return c(new JSONObject(str), cls, clsArr);
                } catch (JSONException unused) {
                    return g(new JSONArray(str), cls, clsArr);
                }
            } catch (JSONException unused2) {
                throw i(true, "Input string is not valid json string!", new Object[0]);
            }
        }
        throw i(false, "Input json string cannot be empty!", new Object[0]);
    }

    public static <T> T c(JSONObject jSONObject, Class<T> cls, Class[] clsArr) {
        Class cls2;
        if (!Collection.class.isAssignableFrom(cls)) {
            if (!cls.isArray()) {
                if (Map.class.isAssignableFrom(cls)) {
                    Class cls3 = null;
                    if (clsArr.length > 0) {
                        Class cls4 = clsArr[0];
                        if (clsArr.length > 1) {
                            cls3 = clsArr[1];
                        }
                        cls2 = cls3;
                        cls3 = cls4;
                    } else {
                        cls2 = null;
                    }
                    return (T) h(cls, cls3, cls2, jSONObject);
                }
                try {
                    T newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                    k(newInstance, jSONObject);
                    return newInstance;
                } catch (Exception unused) {
                    throw i(true, "New instance failed for %s", cls);
                }
            }
            throw i(true, "Obj class %s is array type which mismatches with JsonObject", cls);
        }
        throw i(true, "Obj class %s is Collection type which mismatches with JsonObject", cls);
    }

    public static String d(Field field) {
        y9.a aVar = (y9.a) field.getAnnotation(y9.a.class);
        if (aVar != null && !TextUtils.isEmpty(aVar.Code())) {
            return aVar.Code();
        }
        String name = field.getName();
        if (name.endsWith("__")) {
            return name.substring(0, name.length() - 2);
        }
        return name;
    }

    public static String e(List list) {
        if (list.size() <= 0) {
            return ContentRecord.XRINFOLIST_NULL;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String n10 = n(list.get(i10));
            if (n10 != null) {
                sb2.append(n10);
                sb2.append(',');
            }
        }
        l(sb2);
        sb2.append(']');
        return sb2.toString();
    }

    public static String f(Map map) {
        if (map.size() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder("{");
        Set<Map.Entry> entrySet = map.entrySet();
        int size = entrySet.size();
        int i10 = 0;
        for (Map.Entry entry : entrySet) {
            i10++;
            String str = (String) entry.getKey();
            String n10 = n(entry.getValue());
            if (n10 != null) {
                sb2.append('\"');
                sb2.append(str);
                sb2.append("\":");
                sb2.append(n10);
            }
            if (i10 < size && n10 != null) {
                sb2.append(',');
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public static List g(JSONArray jSONArray, Class cls, Class[] clsArr) {
        Class cls2;
        if (List.class.isAssignableFrom(cls)) {
            if (clsArr.length > 0) {
                cls2 = clsArr[0];
            } else {
                cls2 = null;
            }
            return q(cls, cls2, jSONArray);
        }
        throw i(true, "Obj class (%s) is not List type", cls);
    }

    public static Map h(Class cls, Class cls2, Class cls3, Object obj) {
        Map map;
        if (cls2 == null) {
            cls2 = String.class;
        }
        if (cls3 == null) {
            cls3 = String.class;
        }
        if (obj instanceof JSONObject) {
            if (Map.class == cls) {
                map = new LinkedHashMap();
            } else if (Map.class.isAssignableFrom(cls)) {
                try {
                    map = (Map) cls.newInstance();
                } catch (IllegalAccessException unused) {
                    throw i(true, "Fail to initiate %s", cls);
                } catch (InstantiationException unused2) {
                    throw i(true, "Fail to initiate %s", cls);
                }
            } else {
                throw i(true, "%s is not Map type", cls);
            }
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object a10 = a(cls2, cls3, jSONObject.get(next));
                if (a10 != null) {
                    if (cls2.isAssignableFrom(a10.getClass())) {
                        map.put(next, a10);
                    } else {
                        ex.Z("b", "mapFromJson err, memberC:" + cls2 + ", valueC:" + a10.getClass());
                    }
                }
            }
            return map;
        }
        throw i(true, "jsonVal not JSONObject", new Object[0]);
    }

    public static JSONException i(boolean z10, String str, Object... objArr) {
        String format = String.format(Locale.ENGLISH, str, objArr);
        if (z10) {
            ex.I("b", format);
        }
        return new JSONException(format);
    }

    public static void j(Class cls) {
        if (!cls.isPrimitive()) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (cls == f28547a[i10]) {
                    throw i(true, "Root obj class (%s) is invalid", cls);
                }
            }
            return;
        }
        throw i(true, "Root obj class (%s) cannot be primitive type!", cls);
    }

    public static void k(Object obj, JSONObject jSONObject) {
        Object opt;
        Object valueOf;
        Class<?> cls;
        Type[] actualTypeArguments;
        for (Field field : androidx.transition.n.j(obj.getClass())) {
            int i10 = 1;
            field.setAccessible(true);
            if (r(field) && (opt = jSONObject.opt(d(field))) != null && JSONObject.NULL != opt) {
                Object obj2 = null;
                try {
                    Class<?> type = field.getType();
                    if (!Map.class.isAssignableFrom(field.getType())) {
                        if (List.class.isAssignableFrom(field.getType())) {
                            i10 = 0;
                        }
                        cls = null;
                        field.set(obj, a(type, cls, opt));
                    }
                    Type genericType = field.getGenericType();
                    if ((genericType instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments()) != null && actualTypeArguments.length > i10) {
                        try {
                            Type type2 = actualTypeArguments[i10];
                            if (type2 instanceof Class) {
                                cls = (Class) type2;
                            } else {
                                String obj3 = type2.toString();
                                int indexOf = obj3.indexOf("class ");
                                if (indexOf < 0) {
                                    indexOf = 0;
                                }
                                int indexOf2 = obj3.indexOf("<");
                                if (indexOf2 < 0) {
                                    indexOf2 = obj3.length();
                                }
                                cls = Class.forName(obj3.substring(indexOf, indexOf2));
                            }
                        } catch (ClassNotFoundException | Exception e10) {
                            ex.I("ReflectAPI", "getType ".concat(e10.getClass().getSimpleName()));
                        }
                        field.set(obj, a(type, cls, opt));
                    }
                    cls = null;
                    field.set(obj, a(type, cls, opt));
                } catch (RuntimeException unused) {
                    ex.I("b", obj.getClass().getName() + ".fromJson error, fieldName: " + field.getName() + ", field:" + field);
                } catch (Exception unused2) {
                    ex.I("b", obj.getClass().getName() + ".fromJson error, fieldName: " + field.getName() + ", field:" + field);
                    if (0 != 0 && (obj2 instanceof String)) {
                        try {
                            Class<?> type3 = field.getType();
                            if (type3.isPrimitive()) {
                                if (Integer.TYPE == type3) {
                                    valueOf = Integer.valueOf(Integer.parseInt((String) null));
                                } else if (Float.TYPE == type3) {
                                    valueOf = Float.valueOf(Float.parseFloat((String) null));
                                } else if (Long.TYPE == type3) {
                                    valueOf = Long.valueOf(Long.parseLong((String) null));
                                } else if (Boolean.TYPE == type3) {
                                    valueOf = Boolean.valueOf(Boolean.parseBoolean((String) null));
                                } else if (Double.TYPE == type3) {
                                    valueOf = Double.valueOf(Double.parseDouble((String) null));
                                } else if (Short.TYPE == type3) {
                                    valueOf = Short.valueOf(Short.parseShort((String) null));
                                } else if (Byte.TYPE == type3) {
                                    valueOf = Byte.valueOf(Byte.parseByte((String) null));
                                } else if (Character.TYPE == type3) {
                                    valueOf = Character.valueOf(((String) null).charAt(0));
                                }
                                field.set(obj, valueOf);
                            }
                        } catch (Throwable unused3) {
                            ex.Z("b", "processValueError");
                        }
                    }
                }
            }
        }
    }

    public static void l(StringBuilder sb2) {
        int length = sb2.length();
        if (length > 0) {
            int i10 = length - 1;
            if (sb2.charAt(i10) == ',') {
                sb2.delete(i10, length);
            }
        }
    }

    public static String m(Object obj) {
        if (obj == null) {
            return "";
        }
        j(obj.getClass());
        if (obj instanceof List) {
            return e((List) obj);
        }
        if (obj instanceof Map) {
            return f((Map) obj);
        }
        Field[] j10 = androidx.transition.n.j(obj.getClass());
        if (j10.length <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        int length = j10.length;
        for (int i10 = 0; i10 < length; i10++) {
            Field field = j10[i10];
            field.setAccessible(true);
            j10[i10] = field;
            if (r(field)) {
                String d10 = d(j10[i10]);
                String n10 = n(j10[i10].get(obj));
                if (n10 != null) {
                    sb2.append('\"');
                    sb2.append(d10);
                    sb2.append("\":");
                    sb2.append(n10);
                    if (i10 < length - 1) {
                        sb2.append(',');
                    }
                }
            }
        }
        l(sb2);
        sb2.append('}');
        return sb2.toString();
    }

    public static String n(Object obj) {
        boolean z10;
        String str = null;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof String) && !(obj instanceof Character)) {
            if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean) && !(obj instanceof Float) && !(obj instanceof Byte) && !(obj instanceof Double) && !(obj instanceof Short)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return obj.toString();
            }
            if (obj instanceof List) {
                return e((List) obj);
            }
            if (obj instanceof Map) {
                return f((Map) obj);
            }
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                if (length <= 0) {
                    return ContentRecord.XRINFOLIST_NULL;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                for (int i10 = 0; i10 < length; i10++) {
                    String n10 = n(Array.get(obj, i10));
                    if (n10 != null) {
                        sb2.append(n10);
                        sb2.append(',');
                    }
                }
                l(sb2);
                sb2.append(']');
                return sb2.toString();
            }
            return m(obj);
        }
        StringBuilder sb3 = new StringBuilder("\"");
        String obj2 = obj.toString();
        if (obj2 != null) {
            str = obj2.replace("\"", "\\\"");
        }
        return a3.l.p(sb3, str, "\"");
    }

    public static Object o(Class cls, String str, Class... clsArr) {
        try {
            return b(cls, str, clsArr);
        } catch (JSONException | Exception e10) {
            ex.I("b", "toObject ".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    public static String p(Object obj) {
        try {
            try {
                return m(obj);
            } catch (IllegalAccessException unused) {
                throw i(true, "toJson error", new Object[0]);
            }
        } catch (JSONException unused2) {
            ex.I("b", "toJson jsex");
            return "";
        }
    }

    public static List q(Class cls, Class cls2, Object obj) {
        List list;
        if (cls2 == null) {
            cls2 = String.class;
        }
        if (obj instanceof JSONArray) {
            if (cls == List.class) {
                list = new ArrayList();
            } else if (List.class.isAssignableFrom(cls)) {
                try {
                    list = (List) cls.newInstance();
                } catch (IllegalAccessException unused) {
                    throw i(true, "Fail to initiate %s", cls);
                } catch (InstantiationException unused2) {
                    throw i(true, "Fail to initiate %s", cls);
                }
            } else {
                throw i(true, "%s is not List type", cls);
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                Object a10 = a(cls2, null, jSONArray.get(i10));
                if (a10 != null) {
                    if (cls2.isAssignableFrom(a10.getClass())) {
                        list.add(a10);
                    } else {
                        ex.Z("b", "listFromJson error, memberC:" + cls2 + ", valueC:" + a10.getClass());
                    }
                }
            }
            return list;
        }
        throw i(true, "jsonobj is not JSONArray", new Object[0]);
    }

    public static boolean r(Field field) {
        String name = field.getName();
        if (!Modifier.isStatic(field.getModifiers()) && name != null && !name.contains("$") && !field.isAnnotationPresent(y9.b.class)) {
            return true;
        }
        return false;
    }
}
