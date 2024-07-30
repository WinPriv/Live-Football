package de.javakaffee.kryoserializers.jodatime;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.joda.time.Interval;

/* loaded from: classes2.dex */
public class JodaIntervalSerializer extends Serializer<Interval> {
    public JodaIntervalSerializer() {
        setImmutable(true);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Interval read(Kryo kryo, Input input, Class<Interval> cls) {
        return new Interval(input.readLong(true), input.readLong(true), IdentifiableChronology.readChronology(input));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Interval interval) {
        long startMillis = interval.getStartMillis();
        long endMillis = interval.getEndMillis();
        String chronologyId = IdentifiableChronology.getChronologyId(interval.getChronology());
        output.writeLong(startMillis, true);
        output.writeLong(endMillis, true);
        if (chronologyId == null) {
            chronologyId = "";
        }
        output.writeString(chronologyId);
    }
}
