package com.esotericsoftware.reflectasm;

import a3.k;
import hd.d;
import hd.l;
import hd.m;
import hd.n;
import hd.p;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import s.f;

/* loaded from: classes.dex */
public abstract class FieldAccess {
    private String[] fieldNames;
    private Class[] fieldTypes;

    private static void insertConstructor(d dVar) {
        n b02 = dVar.b0(1, "<init>", "()V", null, null);
        b02.g(25, 0);
        b02.d(183, "com/esotericsoftware/reflectasm/FieldAccess", "<init>", "()V");
        b02.a(177);
        b02.c(1, 1);
    }

    private static void insertGetObject(d dVar, String str, ArrayList<Field> arrayList) {
        int i10;
        n b02 = dVar.b0(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
        b02.g(21, 2);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            l[] lVarArr = new l[size];
            for (int i11 = 0; i11 < size; i11++) {
                lVarArr[i11] = new l();
            }
            l lVar = new l();
            b02.G(0, size - 1, lVar, lVarArr);
            for (int i12 = 0; i12 < size; i12++) {
                Field field = arrayList.get(i12);
                b02.C(lVarArr[i12]);
                b02.x(null, 3, null, 0, 0);
                b02.g(25, 1);
                b02.f(192, str);
                b02.w(180, str, field.getName(), p.f(field.getType()));
                switch (p.g(field.getType()).f28966a) {
                    case 1:
                        b02.d(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
                        break;
                    case 2:
                        b02.d(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
                        break;
                    case 3:
                        b02.d(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                        break;
                    case 4:
                        b02.d(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                        break;
                    case 5:
                        b02.d(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                        break;
                    case 6:
                        b02.d(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                        break;
                    case 7:
                        b02.d(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                        break;
                    case 8:
                        b02.d(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                        break;
                }
                b02.a(176);
            }
            b02.C(lVar);
            b02.x(null, 3, null, 0, 0);
            i10 = 5;
        } else {
            i10 = 6;
        }
        insertThrowExceptionForFieldNotFound(b02);
        b02.c(i10, 3);
    }

    private static void insertGetPrimitive(d dVar, String str, ArrayList<Field> arrayList, p pVar) {
        String str2;
        int i10;
        int i11;
        String e10 = pVar.e();
        switch (pVar.f28966a) {
            case 1:
                str2 = "getBoolean";
                i10 = 172;
                break;
            case 2:
                str2 = "getChar";
                i10 = 172;
                break;
            case 3:
                str2 = "getByte";
                i10 = 172;
                break;
            case 4:
                str2 = "getShort";
                i10 = 172;
                break;
            case 5:
                str2 = "getInt";
                i10 = 172;
                break;
            case 6:
                str2 = "getFloat";
                i10 = 174;
                break;
            case 7:
                str2 = "getLong";
                i10 = 173;
                break;
            case 8:
                str2 = "getDouble";
                i10 = 175;
                break;
            default:
                str2 = "get";
                i10 = 176;
                break;
        }
        n b02 = dVar.b0(1, str2, f.b("(Ljava/lang/Object;I)", e10), null, null);
        b02.g(21, 2);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            l[] lVarArr = new l[size];
            l lVar = new l();
            boolean z10 = false;
            for (int i12 = 0; i12 < size; i12++) {
                if (p.g(arrayList.get(i12).getType()).equals(pVar)) {
                    lVarArr[i12] = new l();
                } else {
                    lVarArr[i12] = lVar;
                    z10 = true;
                }
            }
            l lVar2 = new l();
            b02.G(0, size - 1, lVar2, lVarArr);
            for (int i13 = 0; i13 < size; i13++) {
                Field field = arrayList.get(i13);
                if (!lVarArr[i13].equals(lVar)) {
                    b02.C(lVarArr[i13]);
                    b02.x(null, 3, null, 0, 0);
                    b02.g(25, 1);
                    b02.f(192, str);
                    b02.w(180, str, field.getName(), e10);
                    b02.a(i10);
                }
            }
            if (z10) {
                b02.C(lVar);
                b02.x(null, 3, null, 0, 0);
                insertThrowExceptionForFieldType(b02, pVar.d());
            }
            b02.C(lVar2);
            b02.x(null, 3, null, 0, 0);
            i11 = 5;
        } else {
            i11 = 6;
        }
        insertThrowExceptionForFieldNotFound(b02).c(i11, 3);
    }

    private static void insertGetString(d dVar, String str, ArrayList<Field> arrayList) {
        int i10;
        n b02 = dVar.b0(1, "getString", "(Ljava/lang/Object;I)Ljava/lang/String;", null, null);
        b02.g(21, 2);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            l[] lVarArr = new l[size];
            l lVar = new l();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                if (arrayList.get(i11).getType().equals(String.class)) {
                    lVarArr[i11] = new l();
                } else {
                    lVarArr[i11] = lVar;
                    z10 = true;
                }
            }
            l lVar2 = new l();
            b02.G(0, size - 1, lVar2, lVarArr);
            for (int i12 = 0; i12 < size; i12++) {
                if (!lVarArr[i12].equals(lVar)) {
                    b02.C(lVarArr[i12]);
                    b02.x(null, 3, null, 0, 0);
                    b02.g(25, 1);
                    b02.f(192, str);
                    b02.w(180, str, arrayList.get(i12).getName(), "Ljava/lang/String;");
                    b02.a(176);
                }
            }
            if (z10) {
                b02.C(lVar);
                b02.x(null, 3, null, 0, 0);
                insertThrowExceptionForFieldType(b02, "String");
            }
            b02.C(lVar2);
            b02.x(null, 3, null, 0, 0);
            i10 = 5;
        } else {
            i10 = 6;
        }
        insertThrowExceptionForFieldNotFound(b02);
        b02.c(i10, 3);
    }

    private static void insertSetObject(d dVar, String str, ArrayList<Field> arrayList) {
        int i10;
        n b02 = dVar.b0(1, "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
        b02.g(21, 2);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            l[] lVarArr = new l[size];
            for (int i11 = 0; i11 < size; i11++) {
                lVarArr[i11] = new l();
            }
            l lVar = new l();
            b02.G(0, size - 1, lVar, lVarArr);
            for (int i12 = 0; i12 < size; i12++) {
                Field field = arrayList.get(i12);
                p g6 = p.g(field.getType());
                b02.C(lVarArr[i12]);
                b02.x(null, 3, null, 0, 0);
                b02.g(25, 1);
                b02.f(192, str);
                b02.g(25, 3);
                switch (g6.f28966a) {
                    case 1:
                        b02.f(192, "java/lang/Boolean");
                        b02.d(182, "java/lang/Boolean", "booleanValue", "()Z");
                        break;
                    case 2:
                        b02.f(192, "java/lang/Character");
                        b02.d(182, "java/lang/Character", "charValue", "()C");
                        break;
                    case 3:
                        b02.f(192, "java/lang/Byte");
                        b02.d(182, "java/lang/Byte", "byteValue", "()B");
                        break;
                    case 4:
                        b02.f(192, "java/lang/Short");
                        b02.d(182, "java/lang/Short", "shortValue", "()S");
                        break;
                    case 5:
                        b02.f(192, "java/lang/Integer");
                        b02.d(182, "java/lang/Integer", "intValue", "()I");
                        break;
                    case 6:
                        b02.f(192, "java/lang/Float");
                        b02.d(182, "java/lang/Float", "floatValue", "()F");
                        break;
                    case 7:
                        b02.f(192, "java/lang/Long");
                        b02.d(182, "java/lang/Long", "longValue", "()J");
                        break;
                    case 8:
                        b02.f(192, "java/lang/Double");
                        b02.d(182, "java/lang/Double", "doubleValue", "()D");
                        break;
                    case 9:
                        b02.f(192, g6.e());
                        break;
                    case 10:
                        b02.f(192, new String(g6.f28967b, g6.f28968c, g6.f28969d));
                        break;
                }
                b02.w(181, str, field.getName(), g6.e());
                b02.a(177);
            }
            b02.C(lVar);
            b02.x(null, 3, null, 0, 0);
            i10 = 5;
        } else {
            i10 = 6;
        }
        insertThrowExceptionForFieldNotFound(b02).c(i10, 4);
    }

    private static void insertSetPrimitive(d dVar, String str, ArrayList<Field> arrayList, p pVar) {
        String str2;
        String str3;
        int i10;
        String str4;
        int i11;
        int i12;
        int i13;
        String e10 = pVar.e();
        int i14 = 25;
        int i15 = 4;
        switch (pVar.f28966a) {
            case 1:
                str2 = "setBoolean";
                str3 = str2;
                i10 = 21;
                break;
            case 2:
                str2 = "setChar";
                str3 = str2;
                i10 = 21;
                break;
            case 3:
                str2 = "setByte";
                str3 = str2;
                i10 = 21;
                break;
            case 4:
                str2 = "setShort";
                str3 = str2;
                i10 = 21;
                break;
            case 5:
                str2 = "setInt";
                str3 = str2;
                i10 = 21;
                break;
            case 6:
                str3 = "setFloat";
                i10 = 23;
                break;
            case 7:
                str4 = "setLong";
                i11 = 22;
                str3 = str4;
                i10 = i11;
                i15 = 5;
                break;
            case 8:
                str4 = "setDouble";
                i11 = 24;
                str3 = str4;
                i10 = i11;
                i15 = 5;
                break;
            default:
                str3 = "set";
                i10 = 25;
                break;
        }
        n b02 = dVar.b0(1, str3, k.l("(Ljava/lang/Object;I", e10, ")V"), null, null);
        b02.g(21, 2);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            l[] lVarArr = new l[size];
            l lVar = new l();
            int i16 = 0;
            int i17 = 0;
            boolean z10 = false;
            while (true) {
                int i18 = 1;
                if (i17 < size) {
                    if (p.g(arrayList.get(i17).getType()).equals(pVar)) {
                        lVarArr[i17] = new l();
                    } else {
                        lVarArr[i17] = lVar;
                        z10 = true;
                    }
                    i17++;
                } else {
                    l lVar2 = new l();
                    b02.G(0, size - 1, lVar2, lVarArr);
                    while (i16 < size) {
                        if (!lVarArr[i16].equals(lVar)) {
                            b02.C(lVarArr[i16]);
                            i13 = i18;
                            b02.x(null, 3, null, 0, 0);
                            b02.g(i14, i13);
                            b02.f(192, str);
                            b02.g(i10, 3);
                            b02.w(181, str, arrayList.get(i16).getName(), e10);
                            b02.a(177);
                        } else {
                            i13 = i18;
                        }
                        i16++;
                        i14 = 25;
                        i18 = i13;
                    }
                    if (z10) {
                        b02.C(lVar);
                        b02.x(null, 3, null, 0, 0);
                        insertThrowExceptionForFieldType(b02, pVar.d());
                    }
                    b02.C(lVar2);
                    b02.x(null, 3, null, 0, 0);
                    i12 = 5;
                }
            }
        } else {
            i12 = 6;
        }
        insertThrowExceptionForFieldNotFound(b02).c(i12, i15);
    }

    private static m insertThrowExceptionForFieldNotFound(m mVar) {
        mVar.f(187, "java/lang/IllegalArgumentException");
        mVar.a(89);
        mVar.f(187, "java/lang/StringBuilder");
        mVar.a(89);
        mVar.b("Field not found: ");
        mVar.d(183, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V");
        mVar.g(21, 2);
        mVar.d(182, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;");
        mVar.d(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
        mVar.d(183, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V");
        mVar.a(191);
        return mVar;
    }

    private static m insertThrowExceptionForFieldType(m mVar, String str) {
        mVar.f(187, "java/lang/IllegalArgumentException");
        mVar.a(89);
        mVar.f(187, "java/lang/StringBuilder");
        mVar.a(89);
        mVar.b("Field not declared as " + str + ": ");
        mVar.d(183, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V");
        mVar.g(21, 2);
        mVar.d(182, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;");
        mVar.d(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
        mVar.d(183, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V");
        mVar.a(191);
        return mVar;
    }

    public abstract Object get(Object obj, int i10);

    public Object get(Object obj, String str) {
        return get(obj, getIndex(str));
    }

    public abstract boolean getBoolean(Object obj, int i10);

    public abstract byte getByte(Object obj, int i10);

    public abstract char getChar(Object obj, int i10);

    public abstract double getDouble(Object obj, int i10);

    public int getFieldCount() {
        return this.fieldTypes.length;
    }

    public String[] getFieldNames() {
        return this.fieldNames;
    }

    public Class[] getFieldTypes() {
        return this.fieldTypes;
    }

    public abstract float getFloat(Object obj, int i10);

    public int getIndex(String str) {
        int length = this.fieldNames.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.fieldNames[i10].equals(str)) {
                return i10;
            }
        }
        throw new IllegalArgumentException(f.b("Unable to find non-private field: ", str));
    }

    public abstract int getInt(Object obj, int i10);

    public abstract long getLong(Object obj, int i10);

    public abstract short getShort(Object obj, int i10);

    public abstract String getString(Object obj, int i10);

    public abstract void set(Object obj, int i10, Object obj2);

    public void set(Object obj, String str, Object obj2) {
        set(obj, getIndex(str), obj2);
    }

    public abstract void setBoolean(Object obj, int i10, boolean z10);

    public abstract void setByte(Object obj, int i10, byte b10);

    public abstract void setChar(Object obj, int i10, char c10);

    public abstract void setDouble(Object obj, int i10, double d10);

    public abstract void setFloat(Object obj, int i10, float f);

    public abstract void setInt(Object obj, int i10, int i11);

    public abstract void setLong(Object obj, int i10, long j10);

    public abstract void setShort(Object obj, int i10, short s10);

    public static FieldAccess get(Class cls) {
        Class<?> defineClass;
        Class<?> cls2;
        ArrayList arrayList = new ArrayList();
        Class cls3 = cls;
        while (true) {
            if (cls3 == Object.class) {
                break;
            }
            for (Field field : cls3.getDeclaredFields()) {
                int modifiers = field.getModifiers();
                if (!Modifier.isStatic(modifiers) && !Modifier.isPrivate(modifiers)) {
                    arrayList.add(field);
                }
            }
            cls3 = cls3.getSuperclass();
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        Class[] clsArr = new Class[arrayList.size()];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = ((Field) arrayList.get(i10)).getName();
            clsArr[i10] = ((Field) arrayList.get(i10)).getType();
        }
        String name = cls.getName();
        String concat = name.concat("FieldAccess");
        if (concat.startsWith("java.")) {
            concat = "reflectasm.".concat(concat);
        }
        AccessClassLoader accessClassLoader = AccessClassLoader.get(cls);
        try {
            cls2 = accessClassLoader.loadClass(concat);
        } catch (ClassNotFoundException unused) {
            synchronized (accessClassLoader) {
                try {
                    defineClass = accessClassLoader.loadClass(concat);
                } catch (ClassNotFoundException unused2) {
                    String replace = concat.replace('.', '/');
                    String replace2 = name.replace('.', '/');
                    d dVar = new d(0);
                    dVar.Z(196653, 33, replace, null, "com/esotericsoftware/reflectasm/FieldAccess", null);
                    insertConstructor(dVar);
                    insertGetObject(dVar, replace2, arrayList);
                    insertSetObject(dVar, replace2, arrayList);
                    insertGetPrimitive(dVar, replace2, arrayList, p.f);
                    insertSetPrimitive(dVar, replace2, arrayList, p.f);
                    insertGetPrimitive(dVar, replace2, arrayList, p.f28960h);
                    insertSetPrimitive(dVar, replace2, arrayList, p.f28960h);
                    insertGetPrimitive(dVar, replace2, arrayList, p.f28961i);
                    insertSetPrimitive(dVar, replace2, arrayList, p.f28961i);
                    insertGetPrimitive(dVar, replace2, arrayList, p.f28962j);
                    insertSetPrimitive(dVar, replace2, arrayList, p.f28962j);
                    insertGetPrimitive(dVar, replace2, arrayList, p.f28964l);
                    insertSetPrimitive(dVar, replace2, arrayList, p.f28964l);
                    insertGetPrimitive(dVar, replace2, arrayList, p.f28965m);
                    insertSetPrimitive(dVar, replace2, arrayList, p.f28965m);
                    insertGetPrimitive(dVar, replace2, arrayList, p.f28963k);
                    insertSetPrimitive(dVar, replace2, arrayList, p.f28963k);
                    insertGetPrimitive(dVar, replace2, arrayList, p.f28959g);
                    insertSetPrimitive(dVar, replace2, arrayList, p.f28959g);
                    insertGetString(dVar, replace2, arrayList);
                    defineClass = accessClassLoader.defineClass(concat, dVar.y0());
                }
                cls2 = defineClass;
            }
        }
        try {
            FieldAccess fieldAccess = (FieldAccess) cls2.newInstance();
            fieldAccess.fieldNames = strArr;
            fieldAccess.fieldTypes = clsArr;
            return fieldAccess;
        } catch (Throwable th) {
            throw new RuntimeException(f.b("Error constructing field access class: ", concat), th);
        }
    }
}
