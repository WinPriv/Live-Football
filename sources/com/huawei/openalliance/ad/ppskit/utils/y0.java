package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.huawei.openalliance.ad.ppskit.annotations.SecretField;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.uriaction.RequestMsgBuilder;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ka.n7;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f23067a = {String.class, Object.class, Integer.class, Short.class, Long.class, Byte.class, Float.class, Double.class, Character.class, Boolean.class};

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f23068b = {String.class, Object.class, Integer.class, Short.class, Long.class, Byte.class, Float.class, Double.class, Boolean.class};

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f23069c;

    /* loaded from: classes2.dex */
    public static class a implements h<Boolean, Object> {
        @Override // com.huawei.openalliance.ad.ppskit.utils.y0.h
        public final Boolean b(Object obj) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof String) {
                return Boolean.valueOf(Boolean.parseBoolean((String) obj));
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements h<Byte, Number> {
        @Override // com.huawei.openalliance.ad.ppskit.utils.y0.h
        public final Byte b(Number number) {
            return Byte.valueOf(number.byteValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements h<Double, Number> {
        @Override // com.huawei.openalliance.ad.ppskit.utils.y0.h
        public final Double b(Number number) {
            return Double.valueOf(number.doubleValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements h<Float, Number> {
        @Override // com.huawei.openalliance.ad.ppskit.utils.y0.h
        public final Float b(Number number) {
            return Float.valueOf(number.floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements h<Integer, Number> {
        @Override // com.huawei.openalliance.ad.ppskit.utils.y0.h
        public final Integer b(Number number) {
            return Integer.valueOf(number.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class f implements h<Long, Number> {
        @Override // com.huawei.openalliance.ad.ppskit.utils.y0.h
        public final Long b(Number number) {
            return Long.valueOf(number.longValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class g implements h<Short, Number> {
        @Override // com.huawei.openalliance.ad.ppskit.utils.y0.h
        public final Short b(Number number) {
            return Short.valueOf(number.shortValue());
        }
    }

    /* loaded from: classes2.dex */
    public interface h<D, S> {
        D b(S s10);
    }

    static {
        HashMap hashMap = new HashMap();
        f23069c = hashMap;
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
        b bVar = new b();
        hashMap.put(Byte.TYPE, bVar);
        hashMap.put(Byte.class, bVar);
        a aVar = new a();
        hashMap.put(Boolean.TYPE, aVar);
        hashMap.put(Boolean.class, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(android.content.Context r4, java.lang.Class r5, java.lang.Class r6, java.lang.Object r7) {
        /*
            boolean r0 = r5.isPrimitive()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L9
            goto L14
        L9:
            r0 = r1
        La:
            r3 = 9
            if (r0 >= r3) goto L19
            java.lang.Class[] r3 = com.huawei.openalliance.ad.ppskit.utils.y0.f23068b
            r3 = r3[r0]
            if (r5 != r3) goto L16
        L14:
            r0 = r2
            goto L1a
        L16:
            int r0 = r0 + 1
            goto La
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L6b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r4 != r5) goto L26
            java.lang.String r7 = com.huawei.openalliance.ad.ppskit.utils.y1.d(r7)
            goto La2
        L26:
            boolean r4 = r5.isPrimitive()
            java.util.HashMap r6 = com.huawei.openalliance.ad.ppskit.utils.y0.f23069c
            java.lang.String r0 = "cannot find value reader for: %s"
            java.lang.String r3 = "y0"
            if (r4 != 0) goto L3a
            java.lang.Class<java.lang.Number> r4 = java.lang.Number.class
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 == 0) goto L51
        L3a:
            boolean r4 = r7 instanceof java.lang.Number
            if (r4 == 0) goto L51
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.Object r4 = r6.get(r5)
            com.huawei.openalliance.ad.ppskit.utils.y0$h r4 = (com.huawei.openalliance.ad.ppskit.utils.y0.h) r4
            if (r4 == 0) goto L49
            goto L5d
        L49:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r5
            ka.n7.h(r3, r0, r4)
            goto L69
        L51:
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r5 != r4) goto La2
            java.lang.Object r4 = r6.get(r5)
            com.huawei.openalliance.ad.ppskit.utils.y0$h r4 = (com.huawei.openalliance.ad.ppskit.utils.y0.h) r4
            if (r4 == 0) goto L62
        L5d:
            java.lang.Object r7 = r4.b(r7)
            goto La2
        L62:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r5
            ka.n7.h(r3, r0, r4)
        L69:
            r7 = 0
            goto La2
        L6b:
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L78
            java.util.List r7 = x(r4, r5, r6, r7)
            goto La2
        L78:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L85
            java.util.Map r7 = s(r4, r5, r6, r7)
            goto La2
        L85:
            boolean r0 = r7 instanceof org.json.JSONObject
            if (r0 == 0) goto L94
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Class[] r0 = new java.lang.Class[r2]
            r0[r1] = r6
            java.lang.Object r7 = u(r4, r7, r5, r0)
            goto La2
        L94:
            boolean r0 = r7 instanceof org.json.JSONArray
            if (r0 == 0) goto La3
            org.json.JSONArray r7 = (org.json.JSONArray) r7
            java.lang.Class[] r0 = new java.lang.Class[r2]
            r0[r1] = r6
            java.util.List r7 = h(r4, r7, r5, r0)
        La2:
            return r7
        La3:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r5
            java.lang.String r5 = "value from json error, field class: %s"
            org.json.JSONException r4 = i(r2, r5, r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.y0.a(android.content.Context, java.lang.Class, java.lang.Class, java.lang.Object):java.lang.Object");
    }

    public static <T> T b(Context context, String str, Class<T> cls, Class... clsArr) {
        if (!TextUtils.isEmpty(str)) {
            k(cls);
            try {
                try {
                    return (T) u(context, new JSONObject(str), cls, clsArr);
                } catch (JSONException unused) {
                    return (T) h(context, new JSONArray(str), cls, clsArr);
                }
            } catch (JSONException unused2) {
                throw i(true, "Input string is not valid json string!", new Object[0]);
            }
        }
        throw i(false, "Input json string cannot be empty!", new Object[0]);
    }

    public static String c(Context context, Object obj) {
        try {
            return d(context, obj, false);
        } catch (IllegalAccessException unused) {
            throw i(true, "toJson error", new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(android.content.Context r8, java.lang.Object r9, boolean r10) {
        /*
            java.lang.String r0 = ""
            if (r9 != 0) goto L5
            return r0
        L5:
            java.lang.Class r1 = r9.getClass()
            k(r1)
            boolean r1 = r9 instanceof java.util.List
            if (r1 == 0) goto L17
            java.util.List r9 = (java.util.List) r9
            java.lang.String r8 = e(r8, r9, r10)
            return r8
        L17:
            boolean r1 = r9 instanceof java.util.Map
            if (r1 == 0) goto L22
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r8 = f(r8, r9, r10)
            return r8
        L22:
            java.lang.Class r1 = r9.getClass()
            java.lang.reflect.Field[] r1 = androidx.transition.n.P(r1)
            int r2 = r1.length
            if (r2 > 0) goto L2f
            goto Le9
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 123(0x7b, float:1.72E-43)
            r0.append(r2)
            int r2 = r1.length
            r3 = 0
        L3b:
            if (r3 >= r2) goto Ldd
            r4 = r1[r3]
            r5 = 1
            r4.setAccessible(r5)
            r1[r3] = r4
            boolean r4 = t(r4)
            if (r4 != 0) goto L4d
            goto Ld9
        L4d:
            r4 = r1[r3]
            java.lang.String r4 = g(r4)
            r5 = r1[r3]
            java.lang.Object r5 = r5.get(r9)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L68
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L68
            goto Ld9
        L68:
            if (r10 == 0) goto L79
            r6 = r1[r3]
            java.lang.Class<ma.a> r7 = ma.a.class
            boolean r6 = r6.isAnnotationPresent(r7)
            if (r6 == 0) goto L79
            if (r5 == 0) goto Lb8
            java.lang.String r5 = "\"******\""
            goto Lbe
        L79:
            if (r10 == 0) goto L9f
            r6 = r1[r3]
            java.lang.Class<ma.g> r7 = ma.g.class
            boolean r6 = r6.isAnnotationPresent(r7)
            if (r6 == 0) goto L9f
            if (r5 == 0) goto Lb8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "\""
            r6.<init>(r7)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.huawei.openalliance.ad.ppskit.utils.y1.w(r5)
            r6.append(r5)
            r6.append(r7)
            java.lang.String r5 = r6.toString()
            goto Lbe
        L9f:
            if (r8 == 0) goto Lba
            r6 = r1[r3]
            java.lang.Class<com.huawei.openalliance.ad.ppskit.annotations.SecretField> r7 = com.huawei.openalliance.ad.ppskit.annotations.SecretField.class
            boolean r6 = r6.isAnnotationPresent(r7)
            if (r6 == 0) goto Lba
            byte[] r6 = com.huawei.openalliance.ad.ppskit.utils.u1.h(r8)
            if (r5 == 0) goto Lb8
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.huawei.openalliance.ad.ppskit.utils.m2.a(r5, r6)
            goto Lbe
        Lb8:
            r5 = 0
            goto Lbe
        Lba:
            java.lang.String r5 = v(r8, r5, r10)
        Lbe:
            if (r5 == 0) goto Ld9
            r6 = 34
            r0.append(r6)
            r0.append(r4)
            java.lang.String r4 = "\":"
            r0.append(r4)
            r0.append(r5)
            int r4 = r2 + (-1)
            if (r3 >= r4) goto Ld9
            r4 = 44
            r0.append(r4)
        Ld9:
            int r3 = r3 + 1
            goto L3b
        Ldd:
            n(r0)
            r8 = 125(0x7d, float:1.75E-43)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
        Le9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.y0.d(android.content.Context, java.lang.Object, boolean):java.lang.String");
    }

    public static String e(Context context, List list, boolean z10) {
        if (list.size() <= 0) {
            return ContentRecord.XRINFOLIST_NULL;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String v3 = v(context, list.get(i10), z10);
            if (v3 != null) {
                sb2.append(v3);
                sb2.append(',');
            }
        }
        n(sb2);
        sb2.append(']');
        return sb2.toString();
    }

    public static String f(Context context, Map map, boolean z10) {
        if (map.size() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        Set<Map.Entry> entrySet = map.entrySet();
        int size = entrySet.size();
        int i10 = 0;
        for (Map.Entry entry : entrySet) {
            i10++;
            String str = (String) entry.getKey();
            String v3 = v(context, entry.getValue(), z10);
            if (v3 != null) {
                sb2.append('\"');
                sb2.append(str);
                sb2.append("\":");
                sb2.append(v3);
            }
            if (i10 < size && v3 != null) {
                sb2.append(',');
            }
        }
        n(sb2);
        sb2.append('}');
        return sb2.toString();
    }

    public static String g(Field field) {
        ma.d dVar = (ma.d) field.getAnnotation(ma.d.class);
        if (dVar != null && !TextUtils.isEmpty(dVar.a())) {
            return dVar.a();
        }
        String name = field.getName();
        if (name.endsWith("__")) {
            return name.substring(0, name.length() - 2);
        }
        return name;
    }

    public static List h(Context context, JSONArray jSONArray, Class cls, Class[] clsArr) {
        Class cls2;
        if (List.class.isAssignableFrom(cls)) {
            if (clsArr.length > 0) {
                cls2 = clsArr[0];
            } else {
                cls2 = null;
            }
            return x(context, cls, cls2, jSONArray);
        }
        throw i(true, "Obj class (%s) is not List type", cls);
    }

    public static JSONException i(boolean z10, String str, Object... objArr) {
        String format = String.format(Locale.ENGLISH, str, objArr);
        if (z10) {
            n7.g("y0", format);
        }
        return new JSONException(format);
    }

    public static void j(Context context, JSONObject jSONObject, Object obj) {
        Object opt;
        Object obj2;
        Field[] P = androidx.transition.n.P(obj.getClass());
        int length = P.length;
        for (int i10 = 0; i10 < length; i10++) {
            Field field = P[i10];
            field.setAccessible(true);
            if (t(field) && (opt = jSONObject.opt(g(field))) != null && JSONObject.NULL != opt) {
                if (context != null && P[i10].isAnnotationPresent(SecretField.class)) {
                    opt = m2.c((String) opt, u1.h(context));
                }
                try {
                    try {
                        try {
                            obj2 = a(context, field.getType(), androidx.transition.n.n(field), opt);
                        } catch (RuntimeException unused) {
                            n7.g("y0", obj.getClass().getName() + ".fromJson runtime exception, fieldName: " + field.getName() + ", field: " + field);
                        }
                        try {
                            field.set(obj, obj2);
                        } catch (Exception unused2) {
                            n7.g("y0", obj.getClass().getName() + ".fromJson error, fieldName: " + field.getName() + ", field:" + field);
                            m(obj, field, obj2);
                        }
                    } finally {
                        l(obj, field);
                    }
                } catch (Exception unused3) {
                    obj2 = null;
                }
            }
        }
    }

    public static void k(Class cls) {
        if (!cls.isPrimitive()) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (cls == f23067a[i10]) {
                    throw i(true, "Root obj class (%s) is invalid in conversion", cls);
                }
            }
            return;
        }
        throw i(true, "Root obj class (%s) cannot be primitive type!", cls);
    }

    public static void l(Object obj, Field field) {
        String str;
        androidx.activity.n nVar;
        try {
            Annotation[] annotations = field.getAnnotations();
            if (annotations != null) {
                for (Annotation annotation : annotations) {
                    if (annotation instanceof ma.h) {
                        nVar = new androidx.activity.n();
                    } else {
                        nVar = null;
                    }
                    if (nVar != null) {
                        androidx.activity.n.Y(obj, field, annotation);
                    }
                }
            }
        } catch (IllegalAccessException unused) {
            str = obj.getClass().getName() + "postProcessFieldAnnotation exception, fieldName: " + field.getName() + ", field: " + field;
            n7.g("y0", str);
        } catch (Throwable th) {
            str = obj.getClass().getName() + "postProcessFieldAnnotation " + th.getClass().getSimpleName() + ", fieldName: " + field.getName() + ", field: " + field;
            n7.g("y0", str);
        }
    }

    public static void m(Object obj, Field field, Object obj2) {
        Object valueOf;
        if (obj2 != null && (obj2 instanceof String)) {
            try {
                Class<?> type = field.getType();
                if (!type.isPrimitive()) {
                    return;
                }
                if (Integer.TYPE == type) {
                    valueOf = Integer.valueOf(Integer.parseInt((String) obj2));
                } else if (Float.TYPE == type) {
                    valueOf = Float.valueOf(Float.parseFloat((String) obj2));
                } else if (Long.TYPE == type) {
                    valueOf = Long.valueOf(Long.parseLong((String) obj2));
                } else if (Boolean.TYPE == type) {
                    valueOf = Boolean.valueOf(Boolean.parseBoolean((String) obj2));
                } else if (Double.TYPE == type) {
                    valueOf = Double.valueOf(Double.parseDouble((String) obj2));
                } else if (Short.TYPE == type) {
                    valueOf = Short.valueOf(Short.parseShort((String) obj2));
                } else if (Byte.TYPE == type) {
                    valueOf = Byte.valueOf(Byte.parseByte((String) obj2));
                } else if (Character.TYPE == type) {
                    valueOf = Character.valueOf(((String) obj2).charAt(0));
                } else {
                    return;
                }
                field.set(obj, valueOf);
            } catch (Throwable unused) {
                n7.i("y0", "processValueError");
            }
        }
    }

    public static void n(StringBuilder sb2) {
        int length = sb2.length();
        if (length > 0) {
            int i10 = length - 1;
            if (sb2.charAt(i10) == ',') {
                sb2.delete(i10, length);
            }
        }
    }

    public static <T> T o(Context context, String str, Class<T> cls, Class... clsArr) {
        try {
            return (T) b(context, str, cls, clsArr);
        } catch (Throwable unused) {
            n7.g("y0", "toObject error");
            return null;
        }
    }

    public static Object p(Class cls, String str, Class... clsArr) {
        return o(null, str, cls, clsArr);
    }

    public static String q(Context context, Object obj) {
        try {
            return c(context, obj);
        } catch (JSONException unused) {
            n7.g("y0", "toJson JSONException");
            return "";
        }
    }

    public static String r(RequestMsgBuilder requestMsgBuilder) {
        return q(null, requestMsgBuilder);
    }

    public static Map s(Context context, Class cls, Class cls2, Object obj) {
        Map map;
        if (cls2 == null) {
            cls2 = String.class;
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
                Object a10 = a(context, cls2, null, jSONObject.get(next));
                if (a10 != null) {
                    if (cls2.isAssignableFrom(a10.getClass())) {
                        map.put(next, a10);
                    } else {
                        n7.i("y0", "mapFromJson error, memberClass:" + cls2 + ", valueClass:" + a10.getClass());
                    }
                }
            }
            return map;
        }
        throw i(true, "jsonValue is not JSONObject", new Object[0]);
    }

    public static boolean t(Field field) {
        String name = field.getName();
        if (!Modifier.isStatic(field.getModifiers()) && name != null && !name.contains("$") && !field.isAnnotationPresent(ma.f.class)) {
            return true;
        }
        return false;
    }

    public static <T> T u(Context context, JSONObject jSONObject, Class<T> cls, Class[] clsArr) {
        Class cls2;
        if (!Collection.class.isAssignableFrom(cls)) {
            if (!cls.isArray()) {
                if (Map.class.isAssignableFrom(cls)) {
                    if (clsArr.length > 0) {
                        cls2 = clsArr[0];
                    } else {
                        cls2 = null;
                    }
                    return (T) s(context, cls, cls2, jSONObject);
                }
                try {
                    T newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                    j(context, jSONObject, newInstance);
                    return newInstance;
                } catch (IllegalAccessException unused) {
                    throw i(true, "New instance failed for %s", cls);
                } catch (InstantiationException unused2) {
                    throw i(true, "New instance failed for %s", cls);
                } catch (NoSuchMethodException unused3) {
                    throw i(true, "No default constructor for class %s", cls);
                } catch (InvocationTargetException unused4) {
                    throw i(true, "New instance failed for %s", cls);
                }
            }
            throw i(true, "Obj class %s is array type which mismatches with JsonObject", cls);
        }
        throw i(true, "Obj class %s is Collection type which mismatches with JsonObject", cls);
    }

    public static String v(Context context, Object obj, boolean z10) {
        boolean z11;
        String sb2;
        String str = null;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof String) && !(obj instanceof Character)) {
            if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean) && !(obj instanceof Float) && !(obj instanceof Byte) && !(obj instanceof Double) && !(obj instanceof Short)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                return obj.toString();
            }
            if (obj instanceof List) {
                return e(context, (List) obj, z10);
            }
            if (obj instanceof Map) {
                return f(context, (Map) obj, z10);
            }
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                if (length <= 0) {
                    sb2 = ContentRecord.XRINFOLIST_NULL;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append('[');
                    for (int i10 = 0; i10 < length; i10++) {
                        String v3 = v(context, Array.get(obj, i10), z10);
                        if (v3 != null) {
                            sb3.append(v3);
                            sb3.append(',');
                        }
                    }
                    n(sb3);
                    sb3.append(']');
                    sb2 = sb3.toString();
                }
                return sb2;
            }
            return d(context, obj, z10);
        }
        if (y1.h(obj.toString())) {
            return null;
        }
        StringBuilder sb4 = new StringBuilder("\"");
        String obj2 = obj.toString();
        if (obj2 != null) {
            str = obj2.replace("\"", "\\\"");
        }
        return a3.l.p(sb4, str, "\"");
    }

    public static String w(Object obj) {
        try {
            return d(null, obj, true);
        } catch (Throwable th) {
            e0.i.p(th, "toAnonymousJson ", "y0");
            return "";
        }
    }

    public static List x(Context context, Class cls, Class cls2, Object obj) {
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
                Object a10 = a(context, cls2, null, jSONArray.get(i10));
                if (a10 != null) {
                    if (cls2.isAssignableFrom(a10.getClass())) {
                        list.add(a10);
                    } else {
                        n7.i("y0", "listFromJson error, memberClass:" + cls2 + ", valueClass:" + a10.getClass());
                    }
                }
            }
            return list;
        }
        throw i(true, "jsonobject is not JSONArray", new Object[0]);
    }
}
