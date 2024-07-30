package de.javakaffee.kryoserializers.protobuf;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.protobuf.GeneratedMessage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class ProtobufSerializer<T extends GeneratedMessage> extends Serializer<T> {
    private Method parseFromMethod = null;

    private Method getParseFromMethod(Class<T> cls) throws NoSuchMethodException {
        if (this.parseFromMethod == null) {
            this.parseFromMethod = cls.getMethod("parseFrom", byte[].class);
        }
        return this.parseFromMethod;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public boolean getAcceptsNull() {
        return true;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<T> cls) {
        int readInt = input.readInt(true);
        if (readInt == 0) {
            return null;
        }
        try {
            T t10 = (T) getParseFromMethod(cls).invoke(cls, input.readBytes(readInt - 1));
            T t11 = t10;
            return t10;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Unable to deserialize protobuf " + e10.getMessage(), e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Unable to deserialize protobuf " + e11.getMessage(), e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Unable to deserialize protobuf " + e12.getMessage(), e12);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        if (t10 == null) {
            output.writeByte((byte) 0);
            output.flush();
        } else {
            byte[] byteArray = t10.toByteArray();
            output.writeInt(byteArray.length + 1, true);
            output.writeBytes(byteArray);
            output.flush();
        }
    }
}
