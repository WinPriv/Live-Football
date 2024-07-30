package com.google.gson.internal.bind;

import com.google.gson.internal.Excluder;
import com.huawei.hms.ads.gl;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m8.a0;
import m8.b;
import m8.b0;
import m8.i;
import m8.o;
import m8.u;
import m8.w;
import o8.j;
import o8.s;
import o8.t;
import q8.a;

/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements b0 {

    /* renamed from: s, reason: collision with root package name */
    public final j f21342s;

    /* renamed from: t, reason: collision with root package name */
    public final m8.c f21343t;

    /* renamed from: u, reason: collision with root package name */
    public final Excluder f21344u;

    /* renamed from: v, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f21345v;

    /* renamed from: w, reason: collision with root package name */
    public final List<w> f21346w;

    /* loaded from: classes2.dex */
    public static abstract class a<T, A> extends a0<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, b> f21347a;

        public a(LinkedHashMap linkedHashMap) {
            this.f21347a = linkedHashMap;
        }

        @Override // m8.a0
        public final T a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            A c10 = c();
            try {
                aVar.c();
                while (aVar.l()) {
                    b bVar = this.f21347a.get(aVar.Z());
                    if (bVar != null && bVar.f21352e) {
                        e(c10, aVar, bVar);
                    }
                    aVar.l0();
                }
                aVar.g();
                return d(c10);
            } catch (IllegalAccessException e10) {
                a.AbstractC0464a abstractC0464a = q8.a.f34709a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalStateException e11) {
                throw new u(e11);
            }
        }

        @Override // m8.a0
        public final void b(s8.b bVar, T t10) throws IOException {
            if (t10 == null) {
                bVar.j();
                return;
            }
            bVar.d();
            try {
                Iterator<b> it = this.f21347a.values().iterator();
                while (it.hasNext()) {
                    it.next().c(bVar, t10);
                }
                bVar.g();
            } catch (IllegalAccessException e10) {
                a.AbstractC0464a abstractC0464a = q8.a.f34709a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            }
        }

        public abstract A c();

        public abstract T d(A a10);

        public abstract void e(A a10, s8.a aVar, b bVar) throws IllegalAccessException, IOException;
    }

    /* loaded from: classes2.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f21348a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f21349b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21350c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f21351d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f21352e;

        public b(String str, Field field, boolean z10, boolean z11) {
            this.f21348a = str;
            this.f21349b = field;
            this.f21350c = field.getName();
            this.f21351d = z10;
            this.f21352e = z11;
        }

        public abstract void a(s8.a aVar, int i10, Object[] objArr) throws IOException, l1.c;

        public abstract void b(s8.a aVar, Object obj) throws IOException, IllegalAccessException;

        public abstract void c(s8.b bVar, Object obj) throws IOException, IllegalAccessException;
    }

    /* loaded from: classes2.dex */
    public static final class d<T> extends a<T, Object[]> {

        /* renamed from: e, reason: collision with root package name */
        public static final HashMap f21354e;

        /* renamed from: b, reason: collision with root package name */
        public final Constructor<T> f21355b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f21356c;

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f21357d;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(gl.Code));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            f21354e = hashMap;
        }

        public d(Class cls, LinkedHashMap linkedHashMap, boolean z10) {
            super(linkedHashMap);
            this.f21357d = new HashMap();
            a.AbstractC0464a abstractC0464a = q8.a.f34709a;
            Constructor<T> b10 = abstractC0464a.b(cls);
            this.f21355b = b10;
            if (z10) {
                ReflectiveTypeAdapterFactory.b(null, b10);
            } else {
                q8.a.e(b10);
            }
            String[] c10 = abstractC0464a.c(cls);
            for (int i10 = 0; i10 < c10.length; i10++) {
                this.f21357d.put(c10[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f21355b.getParameterTypes();
            this.f21356c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f21356c[i11] = f21354e.get(parameterTypes[i11]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
        public final Object[] c() {
            return (Object[]) this.f21356c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
        public final Object d(Object[] objArr) {
            Object[] objArr2 = objArr;
            Constructor<T> constructor = this.f21355b;
            try {
                return constructor.newInstance(objArr2);
            } catch (IllegalAccessException e10) {
                a.AbstractC0464a abstractC0464a = q8.a.f34709a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + q8.a.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + q8.a.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + q8.a.b(constructor) + "' with args " + Arrays.toString(objArr2), e13.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
        public final void e(Object[] objArr, s8.a aVar, b bVar) throws IllegalAccessException, IOException {
            Object[] objArr2 = objArr;
            HashMap hashMap = this.f21357d;
            String str = bVar.f21350c;
            Integer num = (Integer) hashMap.get(str);
            if (num != null) {
                bVar.a(aVar, num.intValue(), objArr2);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + q8.a.b(this.f21355b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public ReflectiveTypeAdapterFactory(j jVar, b.a aVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f21342s = jVar;
        this.f21343t = aVar;
        this.f21344u = excluder;
        this.f21345v = jsonAdapterAnnotationTypeAdapterFactory;
        this.f21346w = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (t.a.f33771a.a(obj, accessibleObject)) {
        } else {
            throw new o(com.ironsource.adapters.facebook.a.h(q8.a.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // m8.b0
    public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
        boolean z10;
        Class<? super T> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        int a10 = t.a(rawType, this.f21346w);
        if (a10 != 4) {
            if (a10 == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (q8.a.f34709a.d(rawType)) {
                return new d(rawType, c(iVar, aVar, rawType, z11, true), z11);
            }
            return new c(this.f21342s.b(aVar), c(iVar, aVar, rawType, z11, false));
        }
        throw new o("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v9, types: [q8.a$a] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap c(m8.i r36, r8.a r37, java.lang.Class r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(m8.i, r8.a, java.lang.Class, boolean, boolean):java.util.LinkedHashMap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.reflect.Field r10, boolean r11) {
        /*
            r9 = this;
            java.lang.Class r0 = r10.getType()
            com.google.gson.internal.Excluder r1 = r9.f21344u
            boolean r2 = r1.b(r0)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L17
            boolean r0 = r1.c(r0, r11)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = r3
            goto L18
        L17:
            r0 = r4
        L18:
            if (r0 != 0) goto La3
            int r0 = r10.getModifiers()
            int r2 = r1.f21316t
            r0 = r0 & r2
            if (r0 == 0) goto L25
            goto L9d
        L25:
            double r5 = r1.f21315s
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L44
            java.lang.Class<n8.c> r0 = n8.c.class
            java.lang.annotation.Annotation r0 = r10.getAnnotation(r0)
            n8.c r0 = (n8.c) r0
            java.lang.Class<n8.d> r2 = n8.d.class
            java.lang.annotation.Annotation r2 = r10.getAnnotation(r2)
            n8.d r2 = (n8.d) r2
            boolean r0 = r1.e(r0, r2)
            if (r0 != 0) goto L44
            goto L9d
        L44:
            boolean r0 = r10.isSynthetic()
            if (r0 == 0) goto L4b
            goto L9d
        L4b:
            boolean r0 = r1.f21317u
            if (r0 != 0) goto L6c
            java.lang.Class r0 = r10.getType()
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L68
            int r0 = r0.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L63
            r0 = r4
            goto L64
        L63:
            r0 = r3
        L64:
            if (r0 != 0) goto L68
            r0 = r4
            goto L69
        L68:
            r0 = r3
        L69:
            if (r0 == 0) goto L6c
            goto L9d
        L6c:
            java.lang.Class r0 = r10.getType()
            boolean r0 = com.google.gson.internal.Excluder.d(r0)
            if (r0 == 0) goto L77
            goto L9d
        L77:
            if (r11 == 0) goto L7c
            java.util.List<m8.a> r11 = r1.f21318v
            goto L7e
        L7c:
            java.util.List<m8.a> r11 = r1.f21319w
        L7e:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L9f
            java.util.Objects.requireNonNull(r10)
            java.util.Iterator r10 = r11.iterator()
        L8b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L9f
            java.lang.Object r11 = r10.next()
            m8.a r11 = (m8.a) r11
            boolean r11 = r11.b()
            if (r11 == 0) goto L8b
        L9d:
            r10 = r4
            goto La0
        L9f:
            r10 = r3
        La0:
            if (r10 != 0) goto La3
            r3 = r4
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.d(java.lang.reflect.Field, boolean):boolean");
    }

    /* loaded from: classes2.dex */
    public static final class c<T> extends a<T, T> {

        /* renamed from: b, reason: collision with root package name */
        public final s<T> f21353b;

        public c(s sVar, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.f21353b = sVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
        public final T c() {
            return this.f21353b.a();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
        public final void e(T t10, s8.a aVar, b bVar) throws IllegalAccessException, IOException {
            bVar.b(aVar, t10);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
        public final T d(T t10) {
            return t10;
        }
    }
}
