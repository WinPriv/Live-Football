package o8;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: $Gson$Types.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f33729a = new Type[0];

    /* compiled from: $Gson$Types.java */
    /* renamed from: o8.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0448a implements GenericArrayType, Serializable {

        /* renamed from: s, reason: collision with root package name */
        public final Type f33730s;

        public C0448a(Type type) {
            Objects.requireNonNull(type);
            this.f33730s = a.a(type);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && a.c(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f33730s;
        }

        public final int hashCode() {
            return this.f33730s.hashCode();
        }

        public final String toString() {
            return a.h(this.f33730s) + ContentRecord.XRINFOLIST_NULL;
        }
    }

    /* compiled from: $Gson$Types.java */
    /* loaded from: classes2.dex */
    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: s, reason: collision with root package name */
        public final Type f33731s;

        /* renamed from: t, reason: collision with root package name */
        public final Type f33732t;

        /* renamed from: u, reason: collision with root package name */
        public final Type[] f33733u;

        public b(Type type, Type type2, Type... typeArr) {
            Type a10;
            boolean z10;
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z11 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (type == null && !z10) {
                    z11 = false;
                }
                a0.a.v0(z11);
            }
            if (type == null) {
                a10 = null;
            } else {
                a10 = a.a(type);
            }
            this.f33731s = a10;
            this.f33732t = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f33733u = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                Objects.requireNonNull(this.f33733u[i10]);
                a.b(this.f33733u[i10]);
                Type[] typeArr3 = this.f33733u;
                typeArr3[i10] = a.a(typeArr3[i10]);
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && a.c(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f33733u.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f33731s;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f33732t;
        }

        public final int hashCode() {
            int i10;
            int hashCode = Arrays.hashCode(this.f33733u) ^ this.f33732t.hashCode();
            Type type = this.f33731s;
            if (type != null) {
                i10 = type.hashCode();
            } else {
                i10 = 0;
            }
            return hashCode ^ i10;
        }

        public final String toString() {
            Type[] typeArr = this.f33733u;
            int length = typeArr.length;
            Type type = this.f33732t;
            if (length == 0) {
                return a.h(type);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(a.h(type));
            sb2.append("<");
            sb2.append(a.h(typeArr[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(a.h(typeArr[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: $Gson$Types.java */
    /* loaded from: classes2.dex */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: s, reason: collision with root package name */
        public final Type f33734s;

        /* renamed from: t, reason: collision with root package name */
        public final Type f33735t;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z10;
            boolean z11;
            if (typeArr2.length <= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            a0.a.v0(z10);
            if (typeArr.length == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            a0.a.v0(z11);
            if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                a.b(typeArr2[0]);
                a0.a.v0(typeArr[0] == Object.class);
                this.f33735t = a.a(typeArr2[0]);
                this.f33734s = Object.class;
                return;
            }
            Objects.requireNonNull(typeArr[0]);
            a.b(typeArr[0]);
            this.f33735t = null;
            this.f33734s = a.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && a.c(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f33735t;
            if (type != null) {
                return new Type[]{type};
            }
            return a.f33729a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f33734s};
        }

        public final int hashCode() {
            int i10;
            Type type = this.f33735t;
            if (type != null) {
                i10 = type.hashCode() + 31;
            } else {
                i10 = 1;
            }
            return i10 ^ (this.f33734s.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f33735t;
            if (type != null) {
                return "? super " + a.h(type);
            }
            Type type2 = this.f33734s;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + a.h(type2);
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new C0448a(a(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C0448a(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static void b(Type type) {
        boolean z10;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z10 = false;
        } else {
            z10 = true;
        }
        a0.a.v0(z10);
    }

    public static boolean c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static Type d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return d(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class<?> e(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            a0.a.v0(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return e(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static Type f(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        a0.a.v0(cls2.isAssignableFrom(cls));
        return g(type, cls, d(type, cls, cls2), new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (r1 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r12.put(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0144, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013f A[EDGE_INSN: B:24:0x013f->B:25:0x013f BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [o8.a$c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [o8.a$c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type g(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.a.g(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static String h(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
