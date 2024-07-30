package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class RegexSerializer extends Serializer<Pattern> {
    public RegexSerializer() {
        setImmutable(true);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Pattern read(Kryo kryo, Input input, Class<Pattern> cls) {
        return Pattern.compile(input.readString(), input.readInt(true));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Pattern pattern) {
        output.writeString(pattern.pattern());
        output.writeInt(pattern.flags(), true);
    }
}
