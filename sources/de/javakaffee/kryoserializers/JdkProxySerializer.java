package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
public class JdkProxySerializer extends Serializer<Object> {
    @Override // com.esotericsoftware.kryo.Serializer
    public Object copy(Kryo kryo, Object obj) {
        return Proxy.newProxyInstance(kryo.getClassLoader(), obj.getClass().getInterfaces(), Proxy.getInvocationHandler(obj));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class<Object> cls) {
        InvocationHandler invocationHandler = (InvocationHandler) kryo.readClassAndObject(input);
        Class[] clsArr = (Class[]) kryo.readObject(input, Class[].class);
        ClassLoader classLoader = kryo.getClassLoader();
        try {
            return Proxy.newProxyInstance(classLoader, clsArr, invocationHandler);
        } catch (RuntimeException e10) {
            System.err.println(getClass().getName() + ".read:\nCould not create proxy using classLoader " + classLoader + ", have invocationhandler.classloader: " + invocationHandler.getClass().getClassLoader() + " have contextclassloader: " + Thread.currentThread().getContextClassLoader());
            throw e10;
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        kryo.writeClassAndObject(output, Proxy.getInvocationHandler(obj));
        kryo.writeObject(output, obj.getClass().getInterfaces());
    }
}
