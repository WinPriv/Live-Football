package com.esotericsoftware.kryo.serializers;

import a3.k;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.MethodAccess;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class BeanSerializer<T> extends Serializer<T> {
    static final Object[] noArgs = new Object[0];
    Object access;
    private CachedProperty[] properties;

    /* loaded from: classes.dex */
    public class CachedProperty<X> {
        Method getMethod;
        int getterAccessIndex;
        String name;
        Serializer serializer;
        Method setMethod;
        Class setMethodType;
        int setterAccessIndex;

        public CachedProperty() {
        }

        public Object get(Object obj) throws IllegalAccessException, InvocationTargetException {
            Object obj2 = BeanSerializer.this.access;
            if (obj2 != null) {
                return ((MethodAccess) obj2).invoke(obj, this.getterAccessIndex, new Object[0]);
            }
            return this.getMethod.invoke(obj, BeanSerializer.noArgs);
        }

        public void set(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
            Object obj3 = BeanSerializer.this.access;
            if (obj3 != null) {
                ((MethodAccess) obj3).invoke(obj, this.setterAccessIndex, obj2);
            } else {
                this.setMethod.invoke(obj, obj2);
            }
        }

        public String toString() {
            return this.name;
        }
    }

    public BeanSerializer(Kryo kryo, Class cls) {
        Serializer serializer;
        try {
            PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(cls).getPropertyDescriptors();
            Arrays.sort(propertyDescriptors, new Comparator<PropertyDescriptor>() { // from class: com.esotericsoftware.kryo.serializers.BeanSerializer.1
                @Override // java.util.Comparator
                public int compare(PropertyDescriptor propertyDescriptor, PropertyDescriptor propertyDescriptor2) {
                    return propertyDescriptor.getName().compareTo(propertyDescriptor2.getName());
                }
            });
            ArrayList arrayList = new ArrayList(propertyDescriptors.length);
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                String name = propertyDescriptor.getName();
                if (!name.equals("class")) {
                    Method readMethod = propertyDescriptor.getReadMethod();
                    Method writeMethod = propertyDescriptor.getWriteMethod();
                    if (readMethod != null && writeMethod != null) {
                        Class<?> returnType = readMethod.getReturnType();
                        if (kryo.isFinal(returnType)) {
                            serializer = kryo.getRegistration(returnType).getSerializer();
                        } else {
                            serializer = null;
                        }
                        CachedProperty cachedProperty = new CachedProperty();
                        cachedProperty.name = name;
                        cachedProperty.getMethod = readMethod;
                        cachedProperty.setMethod = writeMethod;
                        cachedProperty.serializer = serializer;
                        cachedProperty.setMethodType = writeMethod.getParameterTypes()[0];
                        arrayList.add(cachedProperty);
                    }
                }
            }
            this.properties = (CachedProperty[]) arrayList.toArray(new CachedProperty[arrayList.size()]);
            try {
                this.access = MethodAccess.get(cls);
                int length = this.properties.length;
                for (int i10 = 0; i10 < length; i10++) {
                    CachedProperty cachedProperty2 = this.properties[i10];
                    cachedProperty2.getterAccessIndex = ((MethodAccess) this.access).getIndex(cachedProperty2.getMethod.getName(), cachedProperty2.getMethod.getParameterTypes());
                    cachedProperty2.setterAccessIndex = ((MethodAccess) this.access).getIndex(cachedProperty2.setMethod.getName(), cachedProperty2.setMethod.getParameterTypes());
                }
            } catch (Throwable unused) {
            }
        } catch (IntrospectionException e10) {
            throw new KryoException("Error getting bean info.", e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T copy(Kryo kryo, T t10) {
        T t11 = (T) kryo.newInstance(t10.getClass());
        int length = this.properties.length;
        for (int i10 = 0; i10 < length; i10++) {
            CachedProperty cachedProperty = this.properties[i10];
            try {
                cachedProperty.set(t11, cachedProperty.get(t10));
            } catch (KryoException e10) {
                e10.addTrace(cachedProperty + " (" + t11.getClass().getName() + ")");
                throw e10;
            } catch (RuntimeException e11) {
                KryoException kryoException = new KryoException(e11);
                kryoException.addTrace(cachedProperty + " (" + t11.getClass().getName() + ")");
                throw kryoException;
            } catch (Exception e12) {
                throw new KryoException("Error copying bean property: " + cachedProperty + " (" + t11.getClass().getName() + ")", e12);
            }
        }
        return t11;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<T> cls) {
        Object readClassAndObject;
        T t10 = (T) kryo.newInstance(cls);
        kryo.reference(t10);
        int length = this.properties.length;
        for (int i10 = 0; i10 < length; i10++) {
            CachedProperty cachedProperty = this.properties[i10];
            try {
                if (Log.TRACE) {
                    Log.trace("kryo", "Read property: " + cachedProperty + " (" + t10.getClass() + ")");
                }
                Serializer serializer = cachedProperty.serializer;
                if (serializer != null) {
                    readClassAndObject = kryo.readObjectOrNull(input, cachedProperty.setMethodType, serializer);
                } else {
                    readClassAndObject = kryo.readClassAndObject(input);
                }
                cachedProperty.set(t10, readClassAndObject);
            } catch (KryoException e10) {
                e10.addTrace(cachedProperty + " (" + t10.getClass().getName() + ")");
                throw e10;
            } catch (IllegalAccessException e11) {
                throw new KryoException("Error accessing setter method: " + cachedProperty + " (" + t10.getClass().getName() + ")", e11);
            } catch (RuntimeException e12) {
                KryoException kryoException = new KryoException(e12);
                kryoException.addTrace(cachedProperty + " (" + t10.getClass().getName() + ")");
                throw kryoException;
            } catch (InvocationTargetException e13) {
                throw new KryoException("Error invoking setter method: " + cachedProperty + " (" + t10.getClass().getName() + ")", e13);
            }
        }
        return t10;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        Class<?> cls = t10.getClass();
        int length = this.properties.length;
        for (int i10 = 0; i10 < length; i10++) {
            CachedProperty cachedProperty = this.properties[i10];
            try {
                if (Log.TRACE) {
                    Log.trace("kryo", "Write property: " + cachedProperty + " (" + cls.getName() + ")");
                }
                Object obj = cachedProperty.get(t10);
                Serializer serializer = cachedProperty.serializer;
                if (serializer != null) {
                    kryo.writeObjectOrNull(output, obj, serializer);
                } else {
                    kryo.writeClassAndObject(output, obj);
                }
            } catch (KryoException e10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cachedProperty);
                sb2.append(" (");
                k.r(cls, sb2, ")", e10);
                throw e10;
            } catch (IllegalAccessException e11) {
                throw new KryoException("Error accessing getter method: " + cachedProperty + " (" + cls.getName() + ")", e11);
            } catch (RuntimeException e12) {
                KryoException kryoException = new KryoException(e12);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cachedProperty);
                sb3.append(" (");
                k.r(cls, sb3, ")", kryoException);
                throw kryoException;
            } catch (InvocationTargetException e13) {
                throw new KryoException("Error invoking getter method: " + cachedProperty + " (" + cls.getName() + ")", e13);
            }
        }
    }
}
