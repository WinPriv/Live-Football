package com.esotericsoftware.reflectasm;

import com.anythink.expressad.video.module.a.a;
import hd.d;
import hd.l;
import hd.n;
import hd.p;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import s.f;

/* loaded from: classes.dex */
public abstract class MethodAccess {
    private String[] methodNames;
    private Class[][] parameterTypes;
    private Class[] returnTypes;

    private static void addDeclaredMethodsToList(Class cls, ArrayList<Method> arrayList) {
        for (Method method : cls.getDeclaredMethods()) {
            if (!Modifier.isPrivate(method.getModifiers())) {
                arrayList.add(method);
            }
        }
    }

    public static MethodAccess get(Class cls) {
        Class[][] clsArr;
        Class[] clsArr2;
        String str;
        n nVar;
        Class<?> defineClass;
        StringBuilder sb2;
        l lVar;
        l[] lVarArr;
        n nVar2;
        int i10;
        Class[][] clsArr3;
        String str2;
        Class[] clsArr4;
        ArrayList arrayList = new ArrayList();
        boolean isInterface = cls.isInterface();
        if (!isInterface) {
            for (Class cls2 = cls; cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                addDeclaredMethodsToList(cls2, arrayList);
            }
        } else {
            recursiveAddInterfaceMethodsToList(cls, arrayList);
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        Class[][] clsArr5 = new Class[size];
        Class[] clsArr6 = new Class[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Method method = (Method) arrayList.get(i12);
            strArr[i12] = method.getName();
            clsArr5[i12] = method.getParameterTypes();
            clsArr6[i12] = method.getReturnType();
        }
        String name = cls.getName();
        String concat = name.concat("MethodAccess");
        if (concat.startsWith("java.")) {
            concat = "reflectasm.".concat(concat);
        }
        AccessClassLoader accessClassLoader = AccessClassLoader.get(cls);
        try {
            defineClass = accessClassLoader.loadClass(concat);
            clsArr = clsArr5;
            clsArr2 = clsArr6;
        } catch (ClassNotFoundException unused) {
            synchronized (accessClassLoader) {
                try {
                    defineClass = accessClassLoader.loadClass(concat);
                    clsArr = clsArr5;
                    clsArr2 = clsArr6;
                } catch (ClassNotFoundException unused2) {
                    String replace = concat.replace('.', '/');
                    String replace2 = name.replace('.', '/');
                    d dVar = new d(1);
                    dVar.Z(196653, 33, replace, null, "com/esotericsoftware/reflectasm/MethodAccess", null);
                    n b02 = dVar.b0(1, "<init>", "()V", null, null);
                    b02.g(25, 0);
                    b02.d(183, "com/esotericsoftware/reflectasm/MethodAccess", "<init>", "()V");
                    b02.a(177);
                    b02.c(0, 0);
                    n b03 = dVar.b0(a.T, "invoke", "(Ljava/lang/Object;I[Ljava/lang/Object;)Ljava/lang/Object;", null, null);
                    if (!arrayList.isEmpty()) {
                        b03.g(25, 1);
                        b03.f(192, replace2);
                        b03.g(58, 4);
                        b03.g(21, 2);
                        l[] lVarArr2 = new l[size];
                        for (int i13 = 0; i13 < size; i13++) {
                            lVarArr2[i13] = new l();
                        }
                        l lVar2 = new l();
                        b03.G(0, size - 1, lVar2, lVarArr2);
                        StringBuilder sb3 = new StringBuilder(128);
                        while (i11 < size) {
                            b03.C(lVarArr2[i11]);
                            if (i11 == 0) {
                                sb2 = sb3;
                                lVar = lVar2;
                                lVarArr = lVarArr2;
                                nVar2 = b03;
                                b03.x(new Object[]{replace2}, 1, null, 1, 0);
                            } else {
                                sb2 = sb3;
                                lVar = lVar2;
                                lVarArr = lVarArr2;
                                nVar2 = b03;
                                nVar2.x(null, 3, null, 0, 0);
                            }
                            b03 = nVar2;
                            b03.g(25, 4);
                            sb3 = sb2;
                            sb3.setLength(0);
                            sb3.append('(');
                            Class[] clsArr7 = clsArr5[i11];
                            Class cls3 = clsArr6[i11];
                            int i14 = 0;
                            int i15 = size;
                            while (i14 < clsArr7.length) {
                                Class[] clsArr8 = clsArr6;
                                b03.g(25, 3);
                                b03.A(16, i14);
                                b03.a(50);
                                p g6 = p.g(clsArr7[i14]);
                                switch (g6.f28966a) {
                                    case 1:
                                        clsArr3 = clsArr5;
                                        str2 = concat;
                                        clsArr4 = clsArr7;
                                        b03.f(192, "java/lang/Boolean");
                                        b03.d(182, "java/lang/Boolean", "booleanValue", "()Z");
                                        break;
                                    case 2:
                                        clsArr3 = clsArr5;
                                        str2 = concat;
                                        clsArr4 = clsArr7;
                                        b03.f(192, "java/lang/Character");
                                        b03.d(182, "java/lang/Character", "charValue", "()C");
                                        break;
                                    case 3:
                                        clsArr3 = clsArr5;
                                        str2 = concat;
                                        clsArr4 = clsArr7;
                                        b03.f(192, "java/lang/Byte");
                                        b03.d(182, "java/lang/Byte", "byteValue", "()B");
                                        break;
                                    case 4:
                                        clsArr3 = clsArr5;
                                        str2 = concat;
                                        clsArr4 = clsArr7;
                                        b03.f(192, "java/lang/Short");
                                        b03.d(182, "java/lang/Short", "shortValue", "()S");
                                        break;
                                    case 5:
                                        clsArr3 = clsArr5;
                                        str2 = concat;
                                        clsArr4 = clsArr7;
                                        b03.f(192, "java/lang/Integer");
                                        b03.d(182, "java/lang/Integer", "intValue", "()I");
                                        break;
                                    case 6:
                                        clsArr3 = clsArr5;
                                        str2 = concat;
                                        clsArr4 = clsArr7;
                                        b03.f(192, "java/lang/Float");
                                        b03.d(182, "java/lang/Float", "floatValue", "()F");
                                        break;
                                    case 7:
                                        clsArr3 = clsArr5;
                                        str2 = concat;
                                        clsArr4 = clsArr7;
                                        b03.f(192, "java/lang/Long");
                                        b03.d(182, "java/lang/Long", "longValue", "()J");
                                        break;
                                    case 8:
                                        clsArr3 = clsArr5;
                                        str2 = concat;
                                        clsArr4 = clsArr7;
                                        b03.f(192, "java/lang/Double");
                                        b03.d(182, "java/lang/Double", "doubleValue", "()D");
                                        break;
                                    case 9:
                                        clsArr3 = clsArr5;
                                        str2 = concat;
                                        clsArr4 = clsArr7;
                                        b03.f(192, g6.e());
                                        break;
                                    case 10:
                                        clsArr4 = clsArr7;
                                        clsArr3 = clsArr5;
                                        str2 = concat;
                                        b03.f(192, new String(g6.f28967b, g6.f28968c, g6.f28969d));
                                        break;
                                    default:
                                        clsArr3 = clsArr5;
                                        str2 = concat;
                                        clsArr4 = clsArr7;
                                        break;
                                }
                                sb3.append(g6.e());
                                i14++;
                                clsArr7 = clsArr4;
                                clsArr6 = clsArr8;
                                clsArr5 = clsArr3;
                                concat = str2;
                            }
                            Class[][] clsArr9 = clsArr5;
                            Class[] clsArr10 = clsArr6;
                            String str3 = concat;
                            sb3.append(')');
                            sb3.append(p.f(cls3));
                            if (isInterface) {
                                i10 = 185;
                            } else if (Modifier.isStatic(((Method) arrayList.get(i11)).getModifiers())) {
                                i10 = 184;
                            } else {
                                i10 = 182;
                            }
                            b03.d(i10, replace2, strArr[i11], sb3.toString());
                            switch (p.g(cls3).f28966a) {
                                case 0:
                                    b03.a(1);
                                    break;
                                case 1:
                                    b03.d(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
                                    break;
                                case 2:
                                    b03.d(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
                                    break;
                                case 3:
                                    b03.d(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                                    break;
                                case 4:
                                    b03.d(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                                    break;
                                case 5:
                                    b03.d(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                    break;
                                case 6:
                                    b03.d(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                                    break;
                                case 7:
                                    b03.d(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                                    break;
                                case 8:
                                    b03.d(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                                    break;
                            }
                            b03.a(176);
                            i11++;
                            size = i15;
                            clsArr6 = clsArr10;
                            clsArr5 = clsArr9;
                            concat = str3;
                            lVarArr2 = lVarArr;
                            lVar2 = lVar;
                        }
                        clsArr = clsArr5;
                        clsArr2 = clsArr6;
                        str = concat;
                        b03.C(lVar2);
                        nVar = b03;
                        b03.x(null, 3, null, 0, 0);
                    } else {
                        clsArr = clsArr5;
                        clsArr2 = clsArr6;
                        str = concat;
                        nVar = b03;
                    }
                    nVar.f(187, "java/lang/IllegalArgumentException");
                    nVar.a(89);
                    nVar.f(187, "java/lang/StringBuilder");
                    nVar.a(89);
                    nVar.b("Method not found: ");
                    nVar.d(183, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V");
                    nVar.g(21, 2);
                    nVar.d(182, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;");
                    nVar.d(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
                    nVar.d(183, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V");
                    nVar.a(191);
                    nVar.c(0, 0);
                    concat = str;
                    defineClass = accessClassLoader.defineClass(concat, dVar.y0());
                }
            }
        }
        try {
            MethodAccess methodAccess = (MethodAccess) defineClass.newInstance();
            methodAccess.methodNames = strArr;
            methodAccess.parameterTypes = clsArr;
            methodAccess.returnTypes = clsArr2;
            return methodAccess;
        } catch (Throwable th) {
            throw new RuntimeException(f.b("Error constructing method access class: ", concat), th);
        }
    }

    private static void recursiveAddInterfaceMethodsToList(Class cls, ArrayList<Method> arrayList) {
        addDeclaredMethodsToList(cls, arrayList);
        for (Class<?> cls2 : cls.getInterfaces()) {
            recursiveAddInterfaceMethodsToList(cls2, arrayList);
        }
    }

    public int getIndex(String str) {
        int length = this.methodNames.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.methodNames[i10].equals(str)) {
                return i10;
            }
        }
        throw new IllegalArgumentException(f.b("Unable to find non-private method: ", str));
    }

    public String[] getMethodNames() {
        return this.methodNames;
    }

    public Class[][] getParameterTypes() {
        return this.parameterTypes;
    }

    public Class[] getReturnTypes() {
        return this.returnTypes;
    }

    public abstract Object invoke(Object obj, int i10, Object... objArr);

    public Object invoke(Object obj, String str, Class[] clsArr, Object... objArr) {
        return invoke(obj, getIndex(str, clsArr), objArr);
    }

    public Object invoke(Object obj, String str, Object... objArr) {
        return invoke(obj, getIndex(str, objArr == null ? 0 : objArr.length), objArr);
    }

    public int getIndex(String str, Class... clsArr) {
        int length = this.methodNames.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.methodNames[i10].equals(str) && Arrays.equals(clsArr, this.parameterTypes[i10])) {
                return i10;
            }
        }
        StringBuilder s10 = a3.l.s("Unable to find non-private method: ", str, " ");
        s10.append(Arrays.toString(clsArr));
        throw new IllegalArgumentException(s10.toString());
    }

    public int getIndex(String str, int i10) {
        int length = this.methodNames.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.methodNames[i11].equals(str) && this.parameterTypes[i11].length == i10) {
                return i11;
            }
        }
        throw new IllegalArgumentException("Unable to find non-private method: " + str + " with " + i10 + " params.");
    }
}
