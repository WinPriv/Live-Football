package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/* loaded from: classes.dex */
public class EnumNameSerializer extends Serializer<Enum> {
    private final Class<? extends Enum> enumType;
    private final Serializer stringSerializer;

    public EnumNameSerializer(Kryo kryo, Class<? extends Enum> cls) {
        this.enumType = cls;
        this.stringSerializer = kryo.getSerializer(String.class);
        setImmutable(true);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.esotericsoftware.kryo.Serializer
    public Enum read(Kryo kryo, Input input, Class<Enum> cls) {
        String str = (String) kryo.readObject(input, String.class, this.stringSerializer);
        try {
            return Enum.valueOf(this.enumType, str);
        } catch (IllegalArgumentException e10) {
            throw new KryoException("Invalid name for enum \"" + this.enumType.getName() + "\": " + str, e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Enum r42) {
        kryo.writeObject(output, r42.name(), this.stringSerializer);
    }
}
