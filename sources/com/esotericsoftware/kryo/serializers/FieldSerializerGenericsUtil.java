package com.esotericsoftware.kryo.serializers;

import a3.l;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FieldSerializerGenericsUtil {
    private Kryo kryo;
    private FieldSerializer serializer;

    public FieldSerializerGenericsUtil(FieldSerializer fieldSerializer) {
        this.serializer = fieldSerializer;
        this.kryo = fieldSerializer.getKryo();
    }

    public static Class[] getGenerics(Type type, Kryo kryo) {
        Class concreteClass;
        Class concreteClass2;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof Class) {
                return new Class[]{(Class) genericComponentType};
            }
            return getGenerics(genericComponentType, kryo);
        }
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Processing generic type " + type);
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        Class[] clsArr = new Class[actualTypeArguments.length];
        int length = actualTypeArguments.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            Type type2 = actualTypeArguments[i11];
            if (Log.TRACE) {
                Log.trace("kryo", "Processing actual type " + type2 + " (" + type2.getClass().getName() + ")");
            }
            clsArr[i11] = Object.class;
            if (type2 instanceof Class) {
                clsArr[i11] = (Class) type2;
            } else if (type2 instanceof ParameterizedType) {
                clsArr[i11] = (Class) ((ParameterizedType) type2).getRawType();
            } else if (type2 instanceof TypeVariable) {
                GenericsResolver genericsResolver = kryo.getGenericsResolver();
                if (genericsResolver.isSet() && (concreteClass2 = genericsResolver.getConcreteClass(((TypeVariable) type2).getName())) != null) {
                    clsArr[i11] = concreteClass2;
                }
            } else if (type2 instanceof GenericArrayType) {
                Type genericComponentType2 = ((GenericArrayType) type2).getGenericComponentType();
                if (genericComponentType2 instanceof Class) {
                    clsArr[i11] = Array.newInstance((Class<?>) genericComponentType2, 0).getClass();
                } else if (genericComponentType2 instanceof TypeVariable) {
                    GenericsResolver genericsResolver2 = kryo.getGenericsResolver();
                    if (genericsResolver2.isSet() && (concreteClass = genericsResolver2.getConcreteClass(((TypeVariable) genericComponentType2).getName())) != null) {
                        clsArr[i11] = Array.newInstance((Class<?>) concreteClass, 0).getClass();
                    }
                } else {
                    Class[] generics = getGenerics(genericComponentType2, kryo);
                    if (generics != null) {
                        clsArr[i11] = generics[0];
                    }
                }
            }
            i10++;
        }
        if (i10 == 0) {
            return null;
        }
        return clsArr;
    }

    private Class<?> getTypeVarConcreteClass(Class[] clsArr, int i10, String str) {
        if (clsArr != null && clsArr.length > i10) {
            return clsArr[i10];
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Trying to use kryo.getGenericScope");
        }
        GenericsResolver genericsResolver = this.kryo.getGenericsResolver();
        if (genericsResolver.isSet()) {
            return genericsResolver.getConcreteClass(str);
        }
        return null;
    }

    public Generics buildGenericsScope(Class cls, Class[] clsArr) {
        int i10;
        Type genericSuperclass;
        Class<Object> cls2;
        Class cls3 = cls;
        TypeVariable[] typeVariableArr = null;
        while (true) {
            if (cls3 == null) {
                break;
            }
            FieldSerializer fieldSerializer = this.serializer;
            if (cls3 == fieldSerializer.type) {
                typeVariableArr = fieldSerializer.typeParameters;
            } else {
                typeVariableArr = cls3.getTypeParameters();
            }
            if (typeVariableArr != null && typeVariableArr.length != 0) {
                break;
            }
            FieldSerializer fieldSerializer2 = this.serializer;
            Class cls4 = fieldSerializer2.type;
            if (cls3 == cls4) {
                cls3 = fieldSerializer2.componentType;
                if (cls3 == null) {
                    do {
                        genericSuperclass = cls4.getGenericSuperclass();
                        cls4 = cls4.getSuperclass();
                        if (genericSuperclass == null) {
                            break;
                        }
                    } while (!(genericSuperclass instanceof ParameterizedType));
                    if (genericSuperclass != null) {
                        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                        typeVariableArr = cls4.getTypeParameters();
                        Class[] clsArr2 = new Class[actualTypeArguments.length];
                        for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
                            Type type = actualTypeArguments[i11];
                            if (type instanceof Class) {
                                cls2 = (Class) type;
                            } else {
                                cls2 = Object.class;
                            }
                            clsArr2[i11] = cls2;
                        }
                        clsArr = clsArr2;
                    }
                }
            } else {
                cls3 = cls3.getComponentType();
            }
        }
        if (typeVariableArr == null || typeVariableArr.length <= 0) {
            return null;
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Class " + cls.getName() + " has generic type parameters");
        }
        HashMap hashMap = new HashMap();
        int i12 = 0;
        for (TypeVariable typeVariable : typeVariableArr) {
            String name = typeVariable.getName();
            if (Log.TRACE) {
                StringBuilder s10 = l.s("Type parameter variable: name=", name, " type bounds=");
                s10.append(Arrays.toString(typeVariable.getBounds()));
                Log.trace("kryo", s10.toString());
            }
            Class<?> typeVarConcreteClass = getTypeVarConcreteClass(clsArr, i12, name);
            if (typeVarConcreteClass != null) {
                hashMap.put(name, typeVarConcreteClass);
                if (Log.TRACE) {
                    StringBuilder s11 = l.s("Concrete type used for ", name, " is: ");
                    s11.append(typeVarConcreteClass.getName());
                    Log.trace("kryo", s11.toString());
                }
            }
            i12++;
        }
        return new Generics(hashMap);
    }

    public Class[] computeFieldGenerics(Type type, Field field, Class[] clsArr) {
        Generics genericsScope;
        Class concreteClass;
        if (type == null) {
            return null;
        }
        if ((type instanceof TypeVariable) && this.serializer.getGenericsScope() != null) {
            Class concreteClass2 = this.serializer.getGenericsScope().getConcreteClass(((TypeVariable) type).getName());
            if (concreteClass2 == null) {
                return null;
            }
            clsArr[0] = concreteClass2;
            Class[] clsArr2 = {concreteClass2};
            if (Log.TRACE) {
                Log.trace("kryo", "Determined concrete class of '" + field.getName() + "' to be " + clsArr[0].getName());
                return clsArr2;
            }
            return clsArr2;
        }
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments == null) {
                return null;
            }
            Class[] clsArr3 = new Class[actualTypeArguments.length];
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                Type type2 = actualTypeArguments[i10];
                if (type2 instanceof Class) {
                    clsArr3[i10] = (Class) type2;
                } else if (type2 instanceof ParameterizedType) {
                    clsArr3[i10] = (Class) ((ParameterizedType) type2).getRawType();
                } else if ((type2 instanceof TypeVariable) && this.serializer.getGenericsScope() != null) {
                    Class concreteClass3 = this.serializer.getGenericsScope().getConcreteClass(((TypeVariable) type2).getName());
                    clsArr3[i10] = concreteClass3;
                    if (concreteClass3 == null) {
                        clsArr3[i10] = Object.class;
                    }
                } else if (type2 instanceof WildcardType) {
                    clsArr3[i10] = Object.class;
                } else if (type2 instanceof GenericArrayType) {
                    Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                    if (genericComponentType instanceof Class) {
                        clsArr3[i10] = Array.newInstance((Class<?>) genericComponentType, 0).getClass();
                    } else if ((genericComponentType instanceof TypeVariable) && (genericsScope = this.serializer.getGenericsScope()) != null && (concreteClass = genericsScope.getConcreteClass(((TypeVariable) genericComponentType).getName())) != null) {
                        clsArr3[i10] = Array.newInstance((Class<?>) concreteClass, 0).getClass();
                    }
                } else {
                    clsArr3[i10] = null;
                }
            }
            if (Log.TRACE) {
                Log.trace("kryo", "Determined concrete class of parametrized '" + field.getName() + "' to be " + type + " where type parameters are " + Arrays.toString(clsArr3));
            }
            return clsArr3;
        }
        if (!(type instanceof GenericArrayType)) {
            return null;
        }
        Class[] computeFieldGenerics = computeFieldGenerics(((GenericArrayType) type).getGenericComponentType(), field, new Class[]{clsArr[0]});
        boolean z10 = Log.TRACE;
        if (z10 && computeFieldGenerics != null) {
            Log.trace("kryo", "Determined concrete class of a generic array '" + field.getName() + "' to be " + type + " where type parameters are " + Arrays.toString(computeFieldGenerics));
            return computeFieldGenerics;
        }
        if (z10) {
            Log.trace("kryo", "Determined concrete class of '" + field.getName() + "' to be " + type);
            return computeFieldGenerics;
        }
        return computeFieldGenerics;
    }

    public FieldSerializer.CachedField newCachedFieldOfGenericType(Field field, int i10, Class[] clsArr, Type type) {
        if (Log.TRACE) {
            Log.trace("kryo", "Field '" + field.getName() + "' of type " + clsArr[0] + " of generic type " + type);
        }
        if (Log.TRACE && type != null) {
            Log.trace("kryo", "Field generic type is of class ".concat(type.getClass().getName()));
        }
        Generics buildGenericsScope = buildGenericsScope(clsArr[0], getGenerics(type, this.kryo));
        if (clsArr[0] == Object.class && (type instanceof TypeVariable) && this.serializer.getGenericsScope() != null) {
            TypeVariable typeVariable = (TypeVariable) type;
            Class concreteClass = this.serializer.getGenericsScope().getConcreteClass(typeVariable.getName());
            if (concreteClass != null) {
                buildGenericsScope = new Generics();
                buildGenericsScope.add(typeVariable.getName(), concreteClass);
            }
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Generics scope of field '" + field.getName() + "' of class " + type + " is " + buildGenericsScope);
        }
        Class[] computeFieldGenerics = computeFieldGenerics(type, field, clsArr);
        FieldSerializer.CachedField newMatchingCachedField = this.serializer.newMatchingCachedField(field, i10, clsArr[0], type, computeFieldGenerics);
        if (computeFieldGenerics != null && (newMatchingCachedField instanceof ObjectField) && computeFieldGenerics.length > 0 && computeFieldGenerics[0] != null) {
            ((ObjectField) newMatchingCachedField).generics = computeFieldGenerics;
            if (Log.TRACE) {
                Log.trace("kryo", "Field generics: " + Arrays.toString(computeFieldGenerics));
            }
        }
        return newMatchingCachedField;
    }
}
