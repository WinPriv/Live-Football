package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.ObjectMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* loaded from: classes.dex */
public class JavaSerializer extends Serializer {

    /* loaded from: classes.dex */
    public static class ObjectInputStreamWithKryoClassLoader extends ObjectInputStream {
        private final ClassLoader loader;

        public ObjectInputStreamWithKryoClassLoader(InputStream inputStream, Kryo kryo) throws IOException {
            super(inputStream);
            this.loader = kryo.getClassLoader();
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
            try {
                return Class.forName(objectStreamClass.getName(), false, this.loader);
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("Class not found: " + objectStreamClass.getName(), e10);
            }
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class cls) {
        try {
            ObjectMap graphContext = kryo.getGraphContext();
            ObjectInputStream objectInputStream = (ObjectInputStream) graphContext.get(this);
            if (objectInputStream == null) {
                objectInputStream = new ObjectInputStreamWithKryoClassLoader(input, kryo);
                graphContext.put(this, objectInputStream);
            }
            return objectInputStream.readObject();
        } catch (Exception e10) {
            throw new KryoException("Error during Java deserialization.", e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        try {
            ObjectMap graphContext = kryo.getGraphContext();
            ObjectOutputStream objectOutputStream = (ObjectOutputStream) graphContext.get(this);
            if (objectOutputStream == null) {
                objectOutputStream = new ObjectOutputStream(output);
                graphContext.put(this, objectOutputStream);
            }
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
        } catch (Exception e10) {
            throw new KryoException("Error during Java serialization.", e10);
        }
    }
}
