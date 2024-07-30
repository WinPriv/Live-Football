package de.javakaffee.kryoserializers.jodatime;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.joda.time.LocalDate;

/* loaded from: classes2.dex */
public class JodaLocalDateSerializer extends Serializer<LocalDate> {
    public JodaLocalDateSerializer() {
        setImmutable(true);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public LocalDate read(Kryo kryo, Input input, Class<LocalDate> cls) {
        int readInt = input.readInt(true);
        return new LocalDate(readInt / 416, (readInt % 416) / 32, readInt % 32, IdentifiableChronology.readChronology(input));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, LocalDate localDate) {
        output.writeInt((localDate.getMonthOfYear() * 32) + (localDate.getYear() * 13 * 32) + localDate.getDayOfMonth(), true);
        String chronologyId = IdentifiableChronology.getChronologyId(localDate.getChronology());
        if (chronologyId == null) {
            chronologyId = "";
        }
        output.writeString(chronologyId);
    }
}
