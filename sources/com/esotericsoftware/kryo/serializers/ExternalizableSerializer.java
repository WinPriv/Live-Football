package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.KryoObjectInput;
import com.esotericsoftware.kryo.io.KryoObjectOutput;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.ObjectMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ExternalizableSerializer extends Serializer {
    private ObjectMap<Class, JavaSerializer> javaSerializerByType;
    private KryoObjectInput objectInput = null;
    private KryoObjectOutput objectOutput = null;

    private JavaSerializer getCachedSerializer(Class cls) {
        ObjectMap<Class, JavaSerializer> objectMap = this.javaSerializerByType;
        if (objectMap == null) {
            this.javaSerializerByType = new ObjectMap<>();
            return null;
        }
        return objectMap.get(cls);
    }

    private JavaSerializer getJavaSerializerIfRequired(Class cls) {
        JavaSerializer cachedSerializer = getCachedSerializer(cls);
        if (cachedSerializer == null && isJavaSerializerRequired(cls)) {
            return new JavaSerializer();
        }
        return cachedSerializer;
    }

    private ObjectInput getObjectInput(Kryo kryo, Input input) {
        KryoObjectInput kryoObjectInput = this.objectInput;
        if (kryoObjectInput == null) {
            this.objectInput = new KryoObjectInput(kryo, input);
        } else {
            kryoObjectInput.setInput(input);
        }
        return this.objectInput;
    }

    private ObjectOutput getObjectOutput(Kryo kryo, Output output) {
        KryoObjectOutput kryoObjectOutput = this.objectOutput;
        if (kryoObjectOutput == null) {
            this.objectOutput = new KryoObjectOutput(kryo, output);
        } else {
            kryoObjectOutput.setOutput(output);
        }
        return this.objectOutput;
    }

    private static boolean hasInheritableReplaceMethod(Class cls, String str) {
        Method method;
        while (true) {
            if (cls != null) {
                try {
                    method = cls.getDeclaredMethod(str, new Class[0]);
                    break;
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            } else {
                method = null;
                break;
            }
        }
        if (method == null || method.getReturnType() != Object.class) {
            return false;
        }
        return true;
    }

    private boolean isJavaSerializerRequired(Class cls) {
        if (!hasInheritableReplaceMethod(cls, "writeReplace") && !hasInheritableReplaceMethod(cls, "readResolve")) {
            return false;
        }
        return true;
    }

    private Object readExternal(Kryo kryo, Input input, Class cls) {
        try {
            Externalizable externalizable = (Externalizable) kryo.newInstance(cls);
            externalizable.readExternal(getObjectInput(kryo, input));
            return externalizable;
        } catch (IOException e10) {
            throw new KryoException(e10);
        } catch (ClassCastException e11) {
            throw new KryoException(e11);
        } catch (ClassNotFoundException e12) {
            throw new KryoException(e12);
        }
    }

    private void writeExternal(Kryo kryo, Output output, Object obj) {
        try {
            ((Externalizable) obj).writeExternal(getObjectOutput(kryo, output));
        } catch (IOException e10) {
            throw new KryoException(e10);
        } catch (ClassCastException e11) {
            throw new KryoException(e11);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class cls) {
        JavaSerializer javaSerializerIfRequired = getJavaSerializerIfRequired(cls);
        if (javaSerializerIfRequired == null) {
            return readExternal(kryo, input, cls);
        }
        return javaSerializerIfRequired.read(kryo, input, cls);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        JavaSerializer javaSerializerIfRequired = getJavaSerializerIfRequired(obj.getClass());
        if (javaSerializerIfRequired == null) {
            writeExternal(kryo, output, obj);
        } else {
            javaSerializerIfRequired.write(kryo, output, obj);
        }
    }
}
