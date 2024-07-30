package de.javakaffee.kryoserializers.cglib;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.Factory;

/* loaded from: classes2.dex */
public class CGLibProxySerializer extends Serializer<Object> {
    public static final String DEFAULT_NAMING_MARKER = "$$EnhancerByCGLIB$$";

    /* loaded from: classes2.dex */
    public interface CGLibProxyMarker {
    }

    public static boolean canSerialize(Class<?> cls) {
        if (Enhancer.isEnhanced(cls) && cls.getName().indexOf(DEFAULT_NAMING_MARKER) > 0) {
            return true;
        }
        return false;
    }

    private Object createProxy(Class<?> cls, Class<?>[] clsArr, Callback[] callbackArr) {
        Enhancer enhancer = new Enhancer();
        enhancer.setInterfaces(clsArr);
        enhancer.setSuperclass(cls);
        enhancer.setCallbacks(callbackArr);
        return enhancer.create();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class<Object> cls) {
        return createProxy(kryo.readClass(input).getType(), (Class[]) kryo.readObject(input, Class[].class), (Callback[]) kryo.readObject(input, Callback[].class));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        kryo.writeClass(output, obj.getClass().getSuperclass());
        kryo.writeObject(output, obj.getClass().getInterfaces());
        kryo.writeObject(output, ((Factory) obj).getCallbacks());
    }
}
