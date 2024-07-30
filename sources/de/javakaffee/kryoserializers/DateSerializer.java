package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.reflect.Constructor;
import java.util.Date;

/* loaded from: classes2.dex */
public class DateSerializer extends Serializer<Date> {
    private final Constructor<? extends Date> _constructor;

    public DateSerializer(Class<? extends Date> cls) {
        try {
            this._constructor = cls.getConstructor(Long.TYPE);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Date copy(Kryo kryo, Date date) {
        return (Date) date.clone();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Date read(Kryo kryo, Input input, Class<Date> cls) {
        try {
            return this._constructor.newInstance(Long.valueOf(input.readLong(true)));
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Date date) {
        output.writeLong(date.getTime(), true);
    }
}
